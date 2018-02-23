package com.example.android.cryptomorse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;




public class HomePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);




    }

    public void wordsToMorse(View view)
    {
        EditText wTextView= (EditText) findViewById(R.id.wordTextView);
        String s = wTextView.getText().toString();

        StringBuilder s1= new StringBuilder();
        s=s.toUpperCase();
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            switch(ch)
            {
                case 'A' :
                    s1.append(".- ");
                    break;
                case 'B' :
                    s1.append("-... ");
                    break;
                case 'C' :
                    s1.append("-.-. ");
                    break;
                case 'D' :
                    s1.append("-.. ");
                    break;
                case 'E' :
                    s1.append(". ");
                    break;
                case 'F' :
                    s1.append("..-. ");
                    break;
                case 'G' :
                    s1.append("--. ");
                    break;
                case 'H' :
                    s1.append(".... ");
                    break;
                case 'I' :
                    s1.append(".. ");
                    break;
                case 'J' :
                    s1.append(".--- ");
                    break;
                case 'K' :
                    s1.append("-.- ");
                    break;
                case 'L' :
                    s1.append(".-.. ");
                    break;
                case 'M' :
                    s1.append("-- ");
                    break;
                case 'N' :
                    s1.append("-. ");
                    break;
                case 'O' :
                    s1.append("--- ");
                    break;
                case 'P' :
                    s1.append(".--. ");
                    break;
                case 'Q' :
                    s1.append("--.- ");
                    break;
                case 'R' :
                    s1.append(".-. ");
                    break;
                case 'S' :
                    s1.append("... ");
                    break;
                case 'T' :
                    s1.append("- ");
                    break;
                case 'U' :
                    s1.append("..- ");
                    break;
                case 'V' :
                    s1.append("...- ");
                    break;
                case 'W' :
                    s1.append(".-- ");
                    break;
                case 'X' :
                    s1.append("-..- ");
                    break;
                case 'Y' :
                    s1.append("-.-- ");
                    break;
                case 'Z' :
                    s1.append("--.. ");
                    break;
                case '0' :
                    s1.append("----- ");
                    break;
                case '1' :
                    s1.append(".---- ");
                    break;
                case '2' :
                    s1.append("..--- ");
                    break;
                case '3' :
                    s1.append("...-- ");
                    break;
                case '4' :
                    s1.append("....- ");
                    break;
                case '5' :
                    s1.append("..... ");
                    break;
                case '6' :
                    s1.append("-.... ");
                    break;
                case '7' :
                    s1.append("--... ");
                    break;
                case '8' :
                    s1.append("---.. ");
                    break;
                case '9' :
                    s1.append("----. ");
                    break;
                case ' ' :
                    s1.append("/ ");
                    break;
                default:
                    s1 = new StringBuilder(" ");
                    Toast.makeText(this,"Words Exceeds Limits",Toast.LENGTH_SHORT).show();


            }
            if(s1.toString().equalsIgnoreCase(" "))
            {
                break;
            }
        }
        morseDisplay(s1.toString());

    }
    public  void morseToWord(View view)
    {

        EditText mTextView= (EditText) findViewById(R.id.morseTextView);
        String s = mTextView.getText().toString();
        s=s.trim();
        s=s+' ';
        String s1,s2=" ";
        int p=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                s1=s.substring(p,i);
                p=i+1;
                switch (s1) {
                    case "-----":
                        s2 = s2 + '0';
                        break;
                    case ".----":
                        s2 = s2 + '1';
                        break;
                    case "..---":
                        s2 = s2 + '2';
                        break;
                    case "...--":
                        s2 = s2 + '3';
                        break;
                    case "....-":
                        s2 = s2 + '4';
                        break;
                    case ".....":
                        s2 = s2 + '5';
                        break;
                    case "-....":
                        s2 = s2 + '6';
                        break;
                    case "--...":
                        s2 = s2 + '7';
                        break;
                    case "---..":
                        s2 = s2 + '8';
                        break;
                    case "----.":
                        s2 = s2 + '9';
                        break;
                    case ".-":
                        s2 = s2 + 'A';
                        break;
                    case "-...":
                        s2 = s2 + 'B';
                        break;
                    case "-.-.":
                        s2 = s2 + 'C';
                        break;
                    case "-..":
                        s2 = s2 + 'D';
                        break;
                    case ".":
                        s2 = s2 + 'E';
                        break;
                    case "..-.":
                        s2 = s2 + 'F';
                        break;
                    case "--.":
                        s2 = s2 + 'G';
                        break;
                    case "....":
                        s2 = s2 + 'H';
                        break;
                    case "..":
                        s2 = s2 + 'I';
                        break;
                    case ".---":
                        s2 = s2 + 'J';
                        break;
                    case "-.-":
                        s2 = s2 + 'K';
                        break;
                    case ".-..":
                        s2 = s2 + 'L';
                        break;
                    case "--":
                        s2 = s2 + 'M';
                        break;
                    case "-.":
                        s2 = s2 + 'N';
                        break;
                    case "---":
                        s2 = s2 + 'O';
                        break;
                    case ".--.":
                        s2 = s2 + 'P';
                        break;
                    case "--.-":
                        s2 = s2 + 'Q';
                        break;
                    case ".-.":
                        s2 = s2 + 'R';
                        break;
                    case "...":
                        s2 = s2 + 'S';
                        break;
                    case "-":
                        s2 = s2 + 'T';
                        break;
                    case "..-":
                        s2 = s2 + 'U';
                        break;
                    case "...-":
                        s2 = s2 + 'V';
                        break;
                    case ".--":
                        s2 = s2 + 'W';
                        break;
                    case "-..-":
                        s2 = s2 + 'X';
                        break;
                    case "-.--":
                        s2 = s2 + 'Y';
                        break;
                    case "--..":
                        s2 = s2 + 'Z';
                        break;
                    case "/":
                        s2 = s2 + ' ';
                        break;
                    default:
                        s2 = "Invalid Input";
                        Toast.makeText(this, s2, Toast.LENGTH_SHORT).show();

                        break;
                }
            }
            if(s2.equals("Invalid Input"))
                break;
        }
        s2=s2.trim();
        wordDisplay(s2);
    }
    public void morseDisplay(String message) {
        EditText newTextView = (EditText) findViewById(R.id.morseTextView);
        newTextView.setText(message);
    }
    public void wordDisplay(String message) {
        EditText newTextView = (EditText) findViewById(R.id.wordTextView);
        newTextView.setText(message);

    }

}
