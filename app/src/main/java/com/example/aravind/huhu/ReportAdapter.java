package com.example.aravind.huhu;

/**
 * Created by aravind on 02/03/16.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class ReportAdapter extends RecyclerView.Adapter<ReportAdapter.MyViewHolder> {

    private List<Report> reportList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView hospital_name, doctor_name, date;

        public MyViewHolder(View view) {
            super(view);
            hospital_name = (TextView) view.findViewById(R.id.hospital_name);
            doctor_name = (TextView) view.findViewById(R.id.doctor_name);
            date = (TextView) view.findViewById(R.id.date);
        }
    }


    public ReportAdapter(List<Report> reportList) {
        this.reportList = reportList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.report_data, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Report movie = reportList.get(position);
        holder.hospital_name.setText(movie.getHospital_name());
        holder.doctor_name.setText(movie.getDoctor_name());
        holder.date.setText(movie.getDate());
    }

    @Override
    public int getItemCount() {
        return reportList.size();
    }
}