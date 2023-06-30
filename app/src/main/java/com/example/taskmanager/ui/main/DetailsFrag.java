/*==========================================DETAILS FRAGMENT==========================================*/

package com.example.taskmanager.ui.main;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import com.example.taskmanager.R;

public class DetailsFrag extends Fragment {



    //Details Fragment constructor
    public DetailsFrag() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //creates the view for this fragment
        View detailsView = inflater.inflate(R.layout.fragment_details, container, false);

         //declaring list view var
        final ListView detailsLIST;

        //sets the list to the object id from the (fragment_details.xml)
        detailsLIST = detailsView.findViewById(R.id.detailsList);

        //this gives us access to the global variables inside of main activity
        final MainActivity mainActivity = (MainActivity) getActivity();
        assert mainActivity != null;

        //creating array adapter to set at the servicesList adapter. this adapter should use the servicesInfo array from main
        final ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, mainActivity.detailsInfo);

        //sets the list to the newly defined adapter
        detailsLIST.setAdapter(listViewAdapter);


        //declaring search view var
        SearchView searchView;

        //setting the search view var to the appropriate object id in the (fragment_details.xml) file
        searchView = detailsView.findViewById(R.id.filterDetails);

        //android studio sets up the onQueryTextSubmit and change as a template for you when creating a search view
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }


            @Override
            public boolean onQueryTextChange(String filteredDetails) {
                listViewAdapter.getFilter().filter(filteredDetails);
                return false;
            }
        });

        //returns the entire details layout view
        return detailsView;
    }
}








