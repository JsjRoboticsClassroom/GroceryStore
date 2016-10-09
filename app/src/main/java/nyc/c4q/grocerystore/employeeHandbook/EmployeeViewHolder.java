package nyc.c4q.grocerystore.employeeHandbook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.grocerystore.R;

public class EmployeeViewHolder extends RecyclerView.ViewHolder {
    private final View mView;
    private final ImageView mEmployeePic;
    private final TextView mEmployeeName;

    public EmployeeViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;
        mEmployeePic = (ImageView) mView.findViewById(R.id.employee_image);
        mEmployeeName = (TextView) mView.findViewById(R.id.employee_name);
    }
    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.employee_view_holder, parent, false);
    }

    public void bind(EmployeeDescription employeeDescription) {
        mEmployeeName.setText(employeeDescription.getName());
    }
    public TextView getName(){
        return mEmployeeName;
    }
}
