package com.example.vinhmvp.AutoSearch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.example.vinhmvp.R;

import java.util.ArrayList;
import java.util.List;

public class AutoSearchActivity extends AppCompatActivity {
    private AutoCompleteTextView nameTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_search);

        CustomListAdapter adapter = new CustomListAdapter(this,
                R.layout.customautocomplete, getData());
        nameTV = (AutoCompleteTextView)
                findViewById(R.id.category);

        nameTV.setAdapter(adapter);
        nameTV.setOnItemClickListener(onItemClickListener);
    }

    private AdapterView.OnItemClickListener onItemClickListener =
            new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Toast.makeText(AutoSearchActivity.this,
                            "Clicked item from auto completion list "
                                    + adapterView.getItemAtPosition(i)
                            , Toast.LENGTH_SHORT).show();
                }
            };


    private List<String> getData(){
        List<String> dataList = new ArrayList<String>();
        dataList.add("Fashion Men");
        dataList.add("Fashion Women");
        dataList.add("Baby");
        dataList.add("Kids");
        dataList.add("Electronics");
        dataList.add("Appliance");
        dataList.add("Travel");
        dataList.add("Bags");
        dataList.add("FootWear");
        dataList.add("Jewellery");
        dataList.add("Sports");
        dataList.add("Electrical");
        dataList.add("Sports Kids");
        return dataList;
    }
}
