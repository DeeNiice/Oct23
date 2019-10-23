package e.maclab.oct23;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] names, saint;
    ListView list;
    int[] cLogo = {
            //R.drawable.accountancy, R.drawable.archi, R.drawable.cfad, R.drawable.civil_law, R.drawable.commerce, R.drawable.educ, R.drawable.engg, R.drawable.iics
    };

    String[] collegeInfo = {"Accountancy message.....", "Arki message.....", "cfad message.....", "civil law message.....", "Commerce message.....", "Educ message....."  };
    ArrayList<College> collegeList = new ArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //names = getResources()
        names= getResources().getStringArray(R.array.colleges);
        saint = getResources().getStringArray(R.array.patron);

        for(int i = 0; i<names.length; i++){
            collegeList.add(new College(cLogo[i], names[i], saint[i]));
        }
        list = findViewbyId(R.id.lvColleges);
       // ArrayAdapter adapter = new ArrayAdapter<String>(this, );


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){

        //Toast.makeText(this, names[i], Toast.LENGTH_LONG).show();

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle(collegeList.get(i).getName());
        dialog.setIcon(collegeList.get(i).getLogo);
        dialog.setMessage(collegeInfo[i]);
        dialog.setNeutralButton("CLOSE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
            }
        });
        dialog.create().show();

    }


}
