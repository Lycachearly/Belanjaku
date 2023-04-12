package stevenliem.if4b.uts.belanjaku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

public class ActivityInputBinding extends AppCompatActivity {

    public Object btnAdd;

    public static void inflate(LayoutInflater layoutInflater) {
    return; }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_binding);
    }

    public int getRoot() {
        return 0;
    }
}