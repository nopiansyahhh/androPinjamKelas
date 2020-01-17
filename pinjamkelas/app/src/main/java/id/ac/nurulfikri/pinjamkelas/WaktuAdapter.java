package id.ac.nurulfikri.pinjamkelas;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WaktuAdapter extends RecyclerView.Adapter<WaktuAdapter.WaktuViewHolder> {

    List<Waktu> mWaktuList;
    ArrayList<Waktu> data;

    public WaktuAdapter(List<Waktu> WaktuList) {
        this.mWaktuList = WaktuList;
    }

    public WaktuAdapter(ArrayList<Waktu> data){
        this.data = data;
    }

    @Override
    public WaktuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_waktu_pinjam, parent, false);
        WaktuViewHolder mViewHolder = new WaktuViewHolder(mView);
        return mViewHolder;
    }

    public void onBindViewHolder(WaktuViewHolder holder, final int position) {
        holder.mTextViewJamawal.setText("Jadwal : "+mWaktuList.get(position).getJamawal()+" - " + mWaktuList.get(position).getJamakhir());
        //holder.mTextViewJamakhir.setText(mWaktuList.get(position).getJamakhir());
        //holder.mTextViewGedung.setText(mWaktuList.get(position).getGedung());
        holder.mTextViewRuangan.setText("Ruangan : "+ mWaktuList.get(position).getGedung()+" . " + mWaktuList.get(position).getRuangan());
        holder.mTextViewHari.setText("Hari : " + mWaktuList.get(position).getHari());
        holder.mTextViewStatus.setText("Status : " + mWaktuList.get(position).getStatus());
        holder.mTextViewRuanganId.setText(mWaktuList.get(position).getRuangan_id());

        /*holder.mTextViewJamawal.setText(data.get(position).getJamawal());
        holder.mTextViewJamakhir.setText(data.get(position).getJamakhir());
        holder.mTextViewGedung.setText(data.get(position).getGedung());
        holder.mTextViewRuangan.setText(data.get(position).getRuangan());
        holder.mTextViewHari.setText(data.get(position).getHari());
        holder.mTextViewStatus.setText(data.get(position).getStatus());*/

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(v.getContext(),PinjamActivity.class);
                mIntent.putExtra("gedung",mWaktuList.get(position).getGedung());
                mIntent.putExtra("jamawal",mWaktuList.get(position).getJamawal());
                mIntent.putExtra("jamakhir",mWaktuList.get(position).getJamakhir());
                mIntent.putExtra("hari",mWaktuList.get(position).getHari());
                mIntent.putExtra("ruangan",mWaktuList.get(position).getRuangan());
                mIntent.putExtra("ruangan_id",mWaktuList.get(position).getRuangan_id());
                v.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mWaktuList != null ? mWaktuList.size() : 0;
    }


    public class WaktuViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewJamawal, mTextViewJamakhir, mTextViewGedung, mTextViewRuangan, mTextViewHari, mTextViewStatus,mTextViewRuanganId;

        public WaktuViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewJamawal = itemView.findViewById(R.id.waktuawal);
            //mTextViewJamakhir = itemView.findViewById(R.id.waktuakhir);
            //mTextViewGedung = itemView.findViewById(R.id.gedung);
            mTextViewRuangan = itemView.findViewById(R.id.ruangan);
            mTextViewHari = itemView.findViewById(R.id.hari);
            mTextViewStatus = itemView.findViewById(R.id.status);
            mTextViewRuanganId = itemView.findViewById(R.id.ruangan_id);
        }
    }
}
