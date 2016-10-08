package nyc.c4q.grocerystore.employeeHandbook;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class EmployeeListAdapter extends RecyclerView.Adapter {
    Class<EmployeeViewHolder> context1 = EmployeeViewHolder.class;
    private List<EmployeeDescription> mData = Arrays.asList(
            new EmployeeDescription("Bill"),
            new EmployeeDescription("Tom"),
            new EmployeeDescription("Monks"),
            new EmployeeDescription("Tank"),
            new EmployeeDescription("Blank"),
            new EmployeeDescription("Hank"),
            new EmployeeDescription("Rank"),
            new EmployeeDescription("Hmm"),
            new EmployeeDescription("Zmm"),
            new EmployeeDescription("Bill"),
            new EmployeeDescription("Nkln"),
            new EmployeeDescription("dksls"),
            new EmployeeDescription("Wesnie")
    );

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EmployeeViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //Allows you to have the context that will be necessary to maneuver through activities
        final EmployeeViewHolder viewHolder = (EmployeeViewHolder) holder;
        //This binds the view to the current position in the view of the cell phone
        ((EmployeeViewHolder) holder).bind(mData.get(position));
        //Boolean that checks to see if the text matches Wesnie
        boolean oje = ((EmployeeViewHolder) holder).getmEmployeeName().getText().toString().equals("Wesnie");
        if (oje) {
            //If the boolean is correct, the Name then becomes clickable and allows user to click and go to next activity
            ((EmployeeViewHolder) holder).getmEmployeeName().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //The intent takes in this newly constructed context b/c it is unattainable in this method
                    Intent intent = new Intent(viewHolder.getmView().getContext(), EmployeeView.class);
                    viewHolder.getmView().getContext().startActivity(intent);
                }
            });
            //On Click Listener for the picture to direct user to next activity
            ((EmployeeViewHolder) holder).getmEmployeePic().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(viewHolder.getmView().getContext(), EmployeeView.class);
                    viewHolder.getmView().getContext().startActivity(intent);
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
