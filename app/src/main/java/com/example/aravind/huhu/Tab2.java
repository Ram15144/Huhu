package com.example.aravind.huhu;

/**
 * Created by aravind on 02/03/16.
 */
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import java.util.List;


public class Tab2 extends Fragment{

    private List<Report> reportList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ReportAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_2, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        prepareReportData();
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter=new ReportAdapter(reportList);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);





        return v;
    }
    private void prepareReportData() {
        Report report = new Report("Apollo Hospitals", "Dr.Baskar Raj", "Jan-22-2016");
        reportList.add(report);

        report = new Report("Sundharam Medicals", "Dr.Hari", "Feb-22-2016");
        reportList.add(report);


        report = new Report("Miot Hospitals", "Dr.Bawa", "Mar-22-2016");
        reportList.add(report);

        report = new Report("Child Care Hospital", "Dr.Ashok", "Apr-22-2016");
        reportList.add(report);

        report = new Report("Vasan Eye Care", "Dr.Ram Kumar", "May-22-2016");
        reportList.add(report);

        report = new Report("Aravind Eye Hospital", "Dr.Shivanesh", "June-22-2016");
        reportList.add(report);

        report = new Report("Sankara Netralaya", "Dr.Cherin", "July-22-2016");
        reportList.add(report);

        report = new Report("Dr Agarwal Eye Hospital","Dr.Ram Prasanth","Aug-22-2016");
        reportList.add(report);

        report = new Report("Sundharam Medicals", "Dr.Hari", "Feb-22-2016");
        reportList.add(report);


        report = new Report("Miot Hospitals", "Dr.Bawa", "Mar-22-2016");
        reportList.add(report);

        report = new Report("Child Care Hospital", "Dr.Ashok", "Apr-22-2016");
        reportList.add(report);

        report = new Report("Vasan Eye Care", "Dr.Ram Kumar", "May-22-2016");
        reportList.add(report);

        report = new Report("Aravind Eye Hospital", "Dr.Shivanesh", "June-22-2016");
        reportList.add(report);

        report = new Report("Sankara Netralaya", "Dr.Cherin", "July-22-2016");
        reportList.add(report);

        report = new Report("Dr Agarwal Eye Hospital","Dr.Ram Prasanth","Aug-22-2016");
        reportList.add(report);
//        mAdapter.notifyDataSetChanged();
    }










    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_report, menu);
        super.onCreateOptionsMenu(menu,inflater);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
/*

        switch (item.getItemId()){

            case R.id.action_settings:
                Toast.makeText(getContext(),"in report",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.addreport:
                Toast.makeText(getContext(),"Adding report",Toast.LENGTH_SHORT).show();
                return true;

        }
*/
        return super.

                onOptionsItemSelected(item);
    }
}