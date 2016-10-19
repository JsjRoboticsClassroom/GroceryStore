package nyc.c4q.grocerystore.employeeHandbook;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.grocerystore.R;


class EmployeeListAdapter extends RecyclerView.Adapter{


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
        new EmployeeDescription("Andres")
        new EmployeeDescription("Ashique", R.drawable.ashique)
    );
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EmployeeViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((EmployeeViewHolder) holder).bind(mData.get(position));
        boolean isThisAndres = ((EmployeeViewHolder) holder).getmEmployeeName().getText().toString().equalsIgnoreCase("Andres");
        if(isThisAndres) {
            Context context = ((EmployeeViewHolder) holder).getMcontext();
            ((EmployeeViewHolder) holder).getmEmployeeName().setOnClickListener(sendToEmployeeView(context));
            ((EmployeeViewHolder) holder).getmEmployeePic().setOnClickListener(sendToEmployeeView(context));
        }
    }

    private View.OnClickListener sendToEmployeeView(final Context context){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,EmployeeView.class);
                context.startActivity(intent);

            }
        };
    }



    @Override
    public int getItemCount() {
        return mData.size();
    }


}
