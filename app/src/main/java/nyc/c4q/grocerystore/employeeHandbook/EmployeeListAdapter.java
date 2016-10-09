package nyc.c4q.grocerystore.employeeHandbook;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;


public class EmployeeListAdapter extends RecyclerView.Adapter{

    private List<EmployeeDescription> mData = Arrays.asList(
        new EmployeeDescription("Hyunjoo")
    );
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EmployeeViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((EmployeeViewHolder) holder).bind(mData.get(position));
        if(mData.get(position).getName().equals("Hyunjoo")){
            ((EmployeeViewHolder) holder).getName().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), EmployeeView.class);
                    v.getContext().startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
