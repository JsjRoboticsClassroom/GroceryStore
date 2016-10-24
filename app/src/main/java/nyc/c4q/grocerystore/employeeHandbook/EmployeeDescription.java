package nyc.c4q.grocerystore.employeeHandbook;

import android.support.annotation.DrawableRes;

import nyc.c4q.grocerystore.R;

public class EmployeeDescription {

    private final String mName;
    private final Integer mImage;

    public EmployeeDescription (String name){
        mName = name;
        mImage = R.drawable.blank_pic;
    }

    public EmployeeDescription (String name, @DrawableRes Integer resource){
        mName = name;
        mImage = resource;
    }
    public String getName() {
        return mName;
    }

    public Integer getImageResource() {
        return mImage;
    }
}
