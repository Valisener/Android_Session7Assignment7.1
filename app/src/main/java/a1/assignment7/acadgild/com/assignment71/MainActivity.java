package a1.assignment7.acadgild.com.assignment71;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//    Initialize the variables for Button and the EditText
    private Button button_Search;
    private EditText wordsToSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Set the button and edittext refferences
        button_Search = findViewById(R.id.button);
        wordsToSearch = findViewById(R.id.editText);


//      Set the onclick listener for the button that searches google when clicked
        button_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              Variable to hold the data that contains the words to search google for.
//              I dont really need to do this i could just use wordsToSearch.getText().toString()
//              However i like doing it this way. More readable in my opinion
                String searchWords =  wordsToSearch.getText().toString();
//              An intent used to launch the website with the words that were entered to search for
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + searchWords));
//              Starts the Intent otherwise it wouldnt do anything
                startActivity(intent);
            }
        });
    }



}
