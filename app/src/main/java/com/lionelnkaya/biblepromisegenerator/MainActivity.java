package com.lionelnkaya.biblepromisegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private QuoteBook quoteBook = new QuoteBook();
    //Declare our View variables
    private TextView  quoteTextView;
    //private TextView authorTextView;
    private Button showQuoteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign the Views from the Layout file to the corresponding variables
        quoteTextView = findViewById(R.id.quoteTextView);
//        authorTextView = findViewById(R.id.authorTextView);
        showQuoteButton = findViewById(R.id.showQuoteButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quote = quoteBook.getquote();

                //Update the screen with our new quote
                quoteTextView.setText(quote);

            }
        };
        showQuoteButton.setOnClickListener(listener);

    }
}