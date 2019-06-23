package com.example.win10.androiddasar3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AndroidDasar3List extends AppCompatActivity {

    ListView List;
    String [] namaBuah = {
            "Alpukat",
            "Apel",
            "Ceri",
            "Durian",
            "Jambu Air",
            "Manggis",
            "Strawberry"
    };
    int[] gambarBuah = {
            //ctrl+D = duplikat satu baris
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry,
    };

    int[] suaraBuah = {
            //ctrl+r = replace
            R.raw.alpukat,
            R.raw.apel,
            R.raw.ceri,
            R.raw.durian,
            R.raw.jambuair,
            R.raw.manggis,
            R.raw.strawberry,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_dasar3_list);

        List =findViewById(R.id.List_View);

     //   ArrayAdapter adapter = new ArrayAdapter(AndroidDasar3List.this, android.R.layout.simple_list_item_1, namaBuah); //
        CustomListAdapter adapter = new CustomListAdapter(AndroidDasar3List.this, namaBuah, gambarBuah);
        List.setAdapter(adapter);

        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer.create(AndroidDasar3List.this, suaraBuah[position]).start();

                Intent pindah  = new Intent(AndroidDasar3List.this, DetailActivity.class);
                pindah.putExtra(Konstanta.DATANAMA, namaBuah[position]);
                pindah.putExtra(Konstanta.DATAGAMBAR, gambarBuah[position]);
                startActivity(pindah);
            }
        });

    }
}
