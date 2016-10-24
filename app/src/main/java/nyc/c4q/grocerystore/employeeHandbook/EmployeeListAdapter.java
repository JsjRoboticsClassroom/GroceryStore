package nyc.c4q.grocerystore.employeeHandbook;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.grocerystore.R;


class EmployeeListAdapter extends RecyclerView.Adapter {

    private List<EmployeeDescription> mData = Arrays.asList(
            new EmployeeDescription("Ashique", R.drawable.ashique),
            new EmployeeDescription("Nesada", R.drawable.nk),
            new EmployeeDescription("Lily", R.drawable.hui),
            new EmployeeDescription("Hyunjoo", R.drawable.hyunjoo),
            new EmployeeDescription("Helen", R.drawable.helen),
            new EmployeeDescription("Derek", R.drawable.derek),
            new EmployeeDescription("Andres", R.drawable.andreas),
            new EmployeeDescription("Danny", R.drawable.danny),
            new EmployeeDescription("Rook", R.drawable.rooks),
            new EmployeeDescription("Wesnie", R.drawable.wesnie),
            new EmployeeDescription("Jordan", R.drawable.jordan),
            new EmployeeDescription("JoseV", R.drawable.josev),
            new EmployeeDescription("Mila", R.drawable.mila),
            new EmployeeDescription("Jose G.", R.drawable.joseg),
            new EmployeeDescription("Akasha", R.drawable.aa_profile_pic),
            new EmployeeDescription("Yojana", R.drawable.yojana1),
            new EmployeeDescription("Taryn", R.drawable.taryn_selfie),
            new EmployeeDescription("Cue", R.drawable.cueforfranklin)


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
        if (employee != null) {
            return navigateToEmployeeViewListener(employee.getName());
        }
        return defaultClickListener();
    }

    /**
     * This click listener launches an intent with the employee name as an extra
     *
     * @param name
     * @return
     */
    private View.OnClickListener navigateToEmployeeViewListener(final String name) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), EmployeeView.class);
                intent.putExtra(EmployeeView.EMPLOYEE_NAME, name);
                view.getContext().startActivity(intent);

            }
        };
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