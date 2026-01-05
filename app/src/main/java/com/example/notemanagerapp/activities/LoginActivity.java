
import android.os.*;
import android.widget.*;
import android.content.*;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_login);

        Button btn=findViewById(R.id.btnLogin);
        btn.setOnClickListener(v->{
            startActivity(new Intent(this,MainActivity.class));
        });
    }
}
