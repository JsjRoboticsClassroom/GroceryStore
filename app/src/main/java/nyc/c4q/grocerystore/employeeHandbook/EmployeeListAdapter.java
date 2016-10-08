package nyc.c4q.grocerystore.employeeHandbook;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class EmployeeListAdapter extends RecyclerView.Adapter {

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
        new EmployeeDescription("dksls")
    );
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EmployeeViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((EmployeeViewHolder) holder).bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
