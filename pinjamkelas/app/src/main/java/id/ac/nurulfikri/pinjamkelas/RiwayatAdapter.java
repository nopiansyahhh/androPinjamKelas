package id.ac.nurulfikri.pinjamkelas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RiwayatAdapter extends RecyclerView.Adapter<RiwayatAdapter.RiwayatViewHolder> {

    List<Riwayat> mRiwayatList;
    ArrayList<Riwayat> data;

    public RiwayatAdapter(List<Riwayat> RiwayatList) {
        this.mRiwayatList = RiwayatList;
    }

    public RiwayatAdapter(ArrayList<Riwayat> data){
        this.data = data;
    }

    @Override
    public RiwayatAdapter.RiwayatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_riwayat, parent, false);
        RiwayatAdapter.RiwayatViewHolder mViewHolder = new RiwayatAdapter.RiwayatViewHolder(mView);
        return mViewHolder;
    }

    public void onBindViewHolder(RiwayatAdapter.RiwayatViewHolder holder, final int position) {
        holder.mTextViewStatus.setText(mRiwayatList.get(position).getPinjamstatus());
        holder.mTextViewNim.setText("NIM : " + mRiwayatList.get(position).getMahasiswa_id());
        holder.mTextViewRuangan.setText("Ruangan : " + mRiwayatList.get(position).getGedung()+" "+ mRiwayatList.get(position).getRuangan());
        holder.mTextViewJadwal.setText("Jadwal Kelas : " +mRiwayatList.get(position).getHari()+", " + mRiwayatList.get(position).getJamawal()+" - "+mRiwayatList.get(position).getJamakhir());
        holder.mTextViewTanggal.setText("Tanggal Penggunaan : " + mRiwayatList.get(position).getTanggal());
        holder.mTextViewTanggapan.setText("Tanggapan BAAK : " + mRiwayatList.get(position).getKettolak());

        /*holder.mTextViewJamawal.setText(data.get(position).getJamawal());
        holder.mTextViewJamakhir.setText(data.get(position).getJamakhir());
        holder.mTextViewGedung.setText(data.get(position).getGedung());
        holder.mTextViewRuangan.setText(data.get(position).getRuangan());
        holder.mTextViewHari.setText(data.get(position).getHari());
        holder.mTextViewStatus.setText(data.get(position).getStatus());*/

        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(v.getContext(),InsertActivity.class);
                mIntent.putExtra("gedung",mWaktuList.get(position).getGedung());
                mIntent.putExtra("jamawal",mWaktuList.get(position).getJamawal());
                mIntent.putExtra("ruangan",mWaktuList.get(position).getRuangan());
                v.getContext().startActivity(mIntent);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return mRiwayatList != null ? mRiwayatList.size() : 0;
    }


    public class RiwayatViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewStatus, mTextViewRuangan, mTextViewJadwal, mTextViewNim, mTextViewTanggapan, mTextViewTanggal;

        public RiwayatViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewRuangan = itemView.findViewById(R.id.ruangan);
            mTextViewStatus = itemView.findViewById(R.id.status);
            mTextViewNim = itemView.findViewById(R.id.tnim);
            mTextViewJadwal = itemView.findViewById(R.id.jadwal);
            mTextViewTanggal = itemView.findViewById(R.id.TanggalText);
            mTextViewTanggapan = itemView.findViewById(R.id.tanggapan);
        }
    }
}
