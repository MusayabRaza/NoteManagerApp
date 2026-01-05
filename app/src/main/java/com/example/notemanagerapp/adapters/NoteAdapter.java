
import android.view.*;
import android.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import java.util.*;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.VH> {
    List<Note> notes;

    public NoteAdapter(List<Note> n){ notes = n; }

    public VH onCreateViewHolder(ViewGroup p,int v){
        View view = LayoutInflater.from(p.getContext()).inflate(R.layout.item_note,p,false);
        return new VH(view);
    }
    public void onBindViewHolder(VH h,int i){
        h.title.setText(notes.get(i).title);
        h.content.setText(notes.get(i).content);
    }
    public int getItemCount(){ return notes.size(); }

    class VH extends RecyclerView.ViewHolder{
        TextView title,content;
        VH(View v){
            super(v);
            title=v.findViewById(R.id.tvTitle);
            content=v.findViewById(R.id.tvContent);
        }
    }
}
