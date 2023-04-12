package stevenliem.if4b.uts.belanjaku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final int INSERT_LOADER = 121;
    private static final int UPDATE_LOADER = 122;
    private ActivityInputBinding binding;
    private boolean editMode;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityInputBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        editMode = getIntent().getBooleanExtra("edit", false);
        if (editMode){
            Belanja belanja = getIntent().getParcelableExtra("belanja");
            id = belanja.getId();
            setDetails(belanja);
        }
    }

    private void setDetails(Belanja belanja) {

    }
}