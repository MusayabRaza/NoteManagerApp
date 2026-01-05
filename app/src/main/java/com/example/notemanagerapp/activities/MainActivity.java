
import android.os.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        RecyclerView rv=findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));

        List<Note> notes=new ArrayList<>();
        notes.add(new Note("Welcome","This is Note Manager App"));

        rv.setAdapter(new NoteAdapter(notes));
    }
}
