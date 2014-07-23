package com.learning.jan_philipp.criminalIntent;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by janPhil on 17.07.14.
 */
public class CrimeListFragment extends ListFragment {

    static final String TAG = "CrimeListFragment";

    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);

        mCrimes = CrimeLab.get(getActivity()).getmCrimes();
        CrimeAdapter adapter = new CrimeAdapter(mCrimes);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        Crime c = ((CrimeAdapter)getListAdapter()).getItem(position);
        Intent i = new Intent(getActivity(), CrimePagerActivity.class);
        i.putExtra(CrimeFragment.EXTRA_CRIME_ID, c.getId());
        startActivity(i);
    }

    private class CrimeAdapter extends ArrayAdapter<Crime> {

            public CrimeAdapter(ArrayList<Crime> crimes){
                super(getActivity(), 0, crimes);
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                if (convertView==null){
                    convertView = getActivity().getLayoutInflater()
                            .inflate(R.layout.list_item_crime, null);
                }

                Crime c = getItem(position);

                TextView titleTextView = (TextView) convertView.findViewById(R.id.crime_list_item_titleTextView);
                titleTextView.setText(c.getTitle());
                TextView dateTextView = (TextView) convertView.findViewById(R.id.crime_list_item_dateTextView);
                dateTextView.setText(c.getmDate().toString());
                CheckBox solvedCheckBox = (CheckBox) convertView.findViewById(R.id.crime_list_item_solvedCheckBox);
                solvedCheckBox.setChecked(c.ismSolved());

                return convertView;

            }
    }

    @Override
    public void onResume() {
        super.onResume();
        ((CrimeAdapter)getListAdapter()).notifyDataSetChanged();
    }
}
