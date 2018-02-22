package com.example.nassh.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;

public class FirstActivity extends AppCompatActivity {


    ListView mlistView ;

    int[] images = {
            R.drawable.anny,
            R.drawable.istiyak,
            R.drawable.moulota,
            R.drawable.rumky,
            R.drawable.sudha
    };
    String[] names = {
            "Anny",
            "Istiyak",
            "Moulota",
            "Rumky",
            "Sudha"
    };


    String[] detail = {
            "ajnfj sdklnldk",
            "lsjhnsjv njfnj",
            "ajnffgfs sgggg",
            "ajsfmnsn jnjnk",
            "ajfgfgg gvffbk",
    };

    String[] time = {
            "22:15",
            "1:23",
            "23:00",
            "9/5/17",
            "2/4/17"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mlistView = (ListView) findViewById(R.id.listView);
        CustomAdaptor customAdaptor = new CustomAdaptor();
        mlistView.setAdapter(customAdaptor);

        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(FirstActivity.this, "Anny" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent (FirstActivity.this, YoutubeActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(FirstActivity.this, "Ishuuu" , Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent (FirstActivity.this, Istiyak.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Toast.makeText(FirstActivity.this, "Moulota" , Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent (FirstActivity.this, Istiyak.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Toast.makeText(FirstActivity.this, "Rumky" , Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent (FirstActivity.this, Istiyak.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Toast.makeText(FirstActivity.this, "Sudha" , Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent (FirstActivity.this, Istiyak.class);
                        startActivity(intent4);
                        break;
                }

            }
        });

    }
    class CustomAdaptor extends BaseAdapter{
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView mImageView = view.findViewById(R.id.imageView);
            TextView mTextView = view.findViewById(R.id.textView);
            TextView nTextView = view.findViewById(R.id.textView2);
            TextView oTextView = view.findViewById(R.id.textView3);

            mImageView.setImageResource((images[position]));
            mTextView.setText(names[position]);
            nTextView.setText(detail[position]);
            oTextView.setText(time[position]);

            return view;
        }
    }
}

