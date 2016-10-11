package nyc.c4q.grocerystore.employeeHandbook;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;


class EmployeeListAdapter extends RecyclerView.Adapter{

    private List<EmployeeDescription> mData = Arrays.asList(
        new EmployeeDescription("Bill"),
        new EmployeeDescription("Bob"),
        new EmployeeDescription("Jack")
    );
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EmployeeViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        EmployeeViewHolder viewHolder = (EmployeeViewHolder) holder;
        EmployeeDescription employee = mData.get(position);
        viewHolder.bind(employee);
        viewHolder.setOnClickListener(buildEmployeeClickListener(employee));
    }

    private View.OnClickListener buildEmployeeClickListener(EmployeeDescription employee) {
        if (employee != null){

        }
        return defaultClickListener();
    }

    /*
     The default click listener does nothing;
     */
    private View.OnClickListener defaultClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do Nothing
            }
        };
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
