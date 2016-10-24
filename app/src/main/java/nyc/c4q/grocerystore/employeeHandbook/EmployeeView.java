package nyc.c4q.grocerystore.employeeHandbook;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.grocerystore.R;
import nyc.c4q.grocerystore.employeeHandbook.employees.AndresFragment;
import nyc.c4q.grocerystore.employeeHandbook.employees.Ashique;
import nyc.c4q.grocerystore.employeeHandbook.employees.Danny;
import nyc.c4q.grocerystore.employeeHandbook.employees.HuiLily;
import nyc.c4q.grocerystore.employeeHandbook.employees.Hyunjoo;
import nyc.c4q.grocerystore.employeeHandbook.employees.Derek;
import nyc.c4q.grocerystore.employeeHandbook.employees.Nesada;
import nyc.c4q.grocerystore.employeeHandbook.employees.Rafael;
import nyc.c4q.grocerystore.employeeHandbook.employees.Wesnie;
import nyc.c4q.grocerystore.employeeHandbook.employees.Jordan;
import nyc.c4q.grocerystore.employeeHandbook.employees.JoseV;
import nyc.c4q.grocerystore.employeeHandbook.employees.Mila;
import nyc.c4q.grocerystore.employeeHandbook.employees.Joseg;
import nyc.c4q.grocerystore.employeeHandbook.employees.Akasha;
import nyc.c4q.grocerystore.employeeHandbook.employees.Yojana;
import nyc.c4q.grocerystore.employeeHandbook.employees.Taryn;


public class EmployeeView extends AppCompatActivity {
    public static final String EMPLOYEE_NAME = "extra.employee.name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_view);
        String employee = getIntent().getStringExtra(EMPLOYEE_NAME);
        if(employee != null){
            if (employee.equals("Danny")) {
                showDanny();
            }
            if (employee.equals("JoseV")){
                 showJoseV();
            }
            if(employee.equalsIgnoreCase("Mila")){
                 showMila();
            }

            switch (employee) {
                case "Lily":
                    showHuiLily();
                    break;
                case "Ashique":
                    showAshique();
                    break;
                case "Hyunjoo":
                    showHyunjoo();
                    break;
                case "Helen":
                    showHelen();
                    break;
                case "Derek":
                    showDerek();
                    break;
                case "Rook":
                    showRafael();
                    break;
                case  "Wesnie":
                    showWesnie();
                    break;
                case "Andres":
                    showAndres();
                    break;
                case "Jordan":
                    showJordan();
                    break;
                case "Nesada":
                    showNesada();
                    break;
                case "Jose G.":
                    showJose();
                    break;
                case "Akasha":
                    showAkasha();
                    break;
                case "Yojana":
                    showYojana();
                    break;
                case "Taryn":
                    showTaryn();
                    break;
                default:
                    break;
                
            }

        }
    }
    private void showNesada(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile, new Nesada());
        fragmentTransaction.commit();
    }

    private void showJordan(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile, new Jordan());
        fragmentTransaction.commit();
    }

    private void showAndres(){
        getFragmentManager().
                beginTransaction().
                add(R.id.employee_profile, new AndresFragment()).
                commit();
    }


    private void showHelen(){
        getFragmentManager().beginTransaction().add(R.id.employee_profile, new Helen()).commit();
    }
    private void showAshique(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile, new Ashique());
        fragmentTransaction.commit();
    }

    private void showHuiLily(){
        getFragmentManager().beginTransaction()
                .add(R.id.employee_profile,new HuiLily())
                .commit();
    }
    private void showHyunjoo(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile,new Hyunjoo());
        fragmentTransaction.commit();
    }

    private void showDerek(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.employee_profile, new Derek());
        fragmentTransaction.commit();
    }

    private void showDanny(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile, new Danny());
        fragmentTransaction.commit();
    }

    private void showRafael() {
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile, new Rafael()).commit();
    }

    private void showWesnie(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile, new Wesnie());
        fragmentTransaction.commit();
    }

    private void showJoseV(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile,new JoseV());
        fragmentTransaction.commit();
    }

    private void showMila(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile,new Mila());
        fragmentTransaction.commit();
    }

    private void showJose(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile,new Joseg());;
        fragmentTransaction.commit();

    }

    private void showAkasha(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile,new Akasha());
        fragmentTransaction.commit();
    }


    private void showYojana(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile, new Yojana());
        fragmentTransaction.commit();
    }
    private void showTaryn(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile,new Taryn());
        fragmentTransaction.commit();
    }
}
