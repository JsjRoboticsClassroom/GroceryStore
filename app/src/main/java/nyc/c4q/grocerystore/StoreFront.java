package nyc.c4q.grocerystore;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StoreFront extends AppCompatActivity {
    private static final String UPDATE_FLASHING_SIGN_INTENT = "STORE_FRONT.UPDATE_FLASHING_SIGN";
    private static final long TWO_SECOND_DELAY_MS = 2000;
    private LocalBroadcastManager mBroadcastManager;
    private boolean mIsRunning;
    private Pair<String, String> mLastDisplayedValues = new Pair<>(null, null);
    private Random mRandom = new Random();
    private Button mEnterButton;
    private TextView mSlot1;
    private TextView mSlot2;
    private TextView mSlot3;
    private TextView mSlot4;
    private TextView mSlot5;
    private TextView mSlot6;
    private TextView mSlot7;
    private TextView mSlot8;
    private List<TextView> mFlashingSlots;

    private List<String> mNowServingList = Arrays.asList(
            "Fresh Bread",
            "Bagels",
            "Quality Meats",
            "Cold Dranks",
            "Chilled Items",
            "Hot Meat",
            "Pizza",
            "Sushi"
    );

    private List<Integer> mFlashingTextColors = Arrays.asList(
            0xFFFF0000,
            0xFF00CCFF,
            0xFF009933,
            0xFFFF6600,
            0xFFCC66FF,
            0xFF996633
    );

    private BroadcastReceiver mFlashingUpdateReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(UPDATE_FLASHING_SIGN_INTENT)){
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        updateFlashingSign();
                    }
                });
            }
        }
    };

    private Pair<String, String> getRandomNowServingPair(){

        String first = getRandomNowServingItem();
        while (first.equals(mLastDisplayedValues.first) || first.equals(mLastDisplayedValues.second)){
            first = getRandomNowServingItem();
        }
        String second = getRandomNowServingItem();
        while (second.equals(first) || second.equals(mLastDisplayedValues.first) || second.equals(mLastDisplayedValues.second)){
            second = getRandomNowServingItem();
        }
        return new Pair<>(first, second);
    }

    private String getRandomNowServingItem() {
        int randomInt = mRandom.nextInt(mNowServingList.size());
        return mNowServingList.get(randomInt);
    }

    private Pair<TextView, TextView> getRandomFlashingItemPair(){
        TextView first = getRandomFlashingSlot();
        TextView second = getRandomFlashingSlot();
        while (second.equals(first)){
            second = getRandomFlashingSlot();
        }
        return new Pair<>(first, second);
    }

    private TextView getRandomFlashingSlot() {
        int randomInt = mRandom.nextInt(mFlashingSlots.size());
        return mFlashingSlots.get(randomInt);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_front);
        mEnterButton = (Button) findViewById(R.id.enter_button);
        mSlot1 = (TextView) findViewById(R.id.flashing_board_slot1);
        mSlot2 = (TextView) findViewById(R.id.flashing_board_slot2);
        mSlot3 = (TextView) findViewById(R.id.flashing_board_slot3);
        mSlot4 = (TextView) findViewById(R.id.flashing_board_slot4);
        mSlot5 = (TextView) findViewById(R.id.flashing_board_slot5);
        mSlot6 = (TextView) findViewById(R.id.flashing_board_slot6);
        mSlot7 = (TextView) findViewById(R.id.flashing_board_slot7);
        mSlot8 = (TextView) findViewById(R.id.flashing_board_slot8);

        mFlashingSlots = Arrays.asList(
                mSlot1,
                mSlot2,
                mSlot3,
                mSlot4,
                mSlot5,
                mSlot6,
                mSlot7,
                mSlot8
        );
        mBroadcastManager = LocalBroadcastManager.getInstance(this);
        mEnterButton.setOnClickListener(buildEnterButtonListener());

    }


    @Override
    public void onResume(){
        super.onResume();
        updateFlashingSign();
        registerFlashingSignUpdates();
        scheduleFlashUpdate();
    }

    @Override
    public void onPause(){
        super.onPause();
        unregisterFlashingSignUpdates();
    }

    private void unregisterFlashingSignUpdates() {
        mIsRunning = false;
        mBroadcastManager.unregisterReceiver(mFlashingUpdateReceiver);
    }

    private void scheduleFlashUpdate() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (mIsRunning){
                    updateFlashingSign();
                    scheduleFlashUpdate();
                }
            }
        }, TWO_SECOND_DELAY_MS);
    }

    private void registerFlashingSignUpdates() {
        mIsRunning = true;
        mBroadcastManager.registerReceiver(mFlashingUpdateReceiver, buildFlashingSignIntentFilter());

    }

    private IntentFilter buildFlashingSignIntentFilter() {
        return new IntentFilter(UPDATE_FLASHING_SIGN_INTENT);
    }

    private void updateFlashingSign() {
        for (TextView t : mFlashingSlots){
            t.setText("");
        }
        Pair<TextView, TextView> slotsToFlash = getRandomFlashingItemPair();
        Pair<String, String> itemsToDisplay = getRandomNowServingPair();
        mLastDisplayedValues = itemsToDisplay;
        slotsToFlash.first.setText(itemsToDisplay.first);
        slotsToFlash.second.setText(itemsToDisplay.second);
        int color1 = getRandomFlashingTextColor();
        int color2 = getRandomFlashingTextColor();
        while (color2 == color1){
            color2 = getRandomFlashingTextColor();
        }
        slotsToFlash.first.setTextColor(color1);
        slotsToFlash.second.setTextColor(color2);
    }

    private int getRandomFlashingTextColor() {
        int selection = mRandom.nextInt(mFlashingTextColors.size());
        return mFlashingTextColors.get(selection);
    }

    private View.OnClickListener buildEnterButtonListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchStoreMenuIntent(view.getContext());
            }
        };
    }

    private void launchStoreMenuIntent(Context context) {
        Intent intent = new Intent(context, StoreDirectory.class);
        context.startActivity(intent);
    }

}
