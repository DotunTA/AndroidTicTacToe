package com.dotunta.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //THINGS TO ADD
    //-------------
    //Main menu
    //Restart button
    //Score

    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;

    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonFour = (Button) findViewById(R.id.buttonFour);
        buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonSeven = (Button) findViewById(R.id.buttonSeven);
        buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonNine = (Button) findViewById(R.id.buttonNine);

        turn = 1;

        buttonOne.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(buttonOne.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        buttonOne.setText("X");
                        buttonOne.setTextColor(Color.RED);
                        buttonOne.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        buttonOne.setText("O");
                        buttonOne.setTextColor(Color.BLUE);
                        buttonOne.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(buttonTwo.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        buttonTwo.setText("X");
                        buttonTwo.setTextColor(Color.RED);
                        buttonTwo.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        buttonTwo.setText("O");
                        buttonTwo.setTextColor(Color.BLUE);
                        buttonTwo.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(buttonThree.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        buttonThree.setText("X");
                        buttonThree.setTextColor(Color.RED);
                        buttonThree.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        buttonThree.setText("O");
                        buttonThree.setTextColor(Color.BLUE);
                        buttonThree.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(buttonFour.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        buttonFour.setText("X");
                        buttonFour.setTextColor(Color.RED);
                        buttonFour.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        buttonFour.setText("O");
                        buttonFour.setTextColor(Color.BLUE);
                        buttonFour.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(buttonFive.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        buttonFive.setText("X");
                        buttonFive.setTextColor(Color.RED);
                        buttonFive.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        buttonFive.setText("O");
                        buttonFive.setTextColor(Color.BLUE);
                        buttonFive.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(buttonSix.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        buttonSix.setText("X");
                        buttonSix.setTextColor(Color.RED);
                        buttonSix.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        buttonSix.setText("O");
                        buttonSix.setTextColor(Color.BLUE);
                        buttonSix.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(buttonSeven.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        buttonSeven.setText("X");
                        buttonSeven.setTextColor(Color.RED);
                        buttonSeven.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        buttonSeven.setText("O");
                        buttonSeven.setTextColor(Color.BLUE);
                        buttonSeven.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(buttonEight.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        buttonEight.setText("X");
                        buttonEight.setTextColor(Color.RED);
                        buttonEight.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        buttonEight.setText("O");
                        buttonEight.setTextColor(Color.BLUE);
                        buttonEight.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(buttonNine.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        buttonNine.setText("X");
                        buttonNine.setTextColor(Color.RED);
                        buttonNine.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        buttonNine.setText("O");
                        buttonNine.setTextColor(Color.BLUE);
                        buttonNine.setEnabled(false);
                    }

                }
                endGame();
            }
        });

    }

    public void endGame(){
        String one = buttonOne.getText().toString();
        String two = buttonTwo.getText().toString();
        String three = buttonThree.getText().toString();

        String four = buttonFour.getText().toString();
        String five = buttonFive.getText().toString();
        String six = buttonSix.getText().toString();

        String seven = buttonSeven.getText().toString();
        String eight = buttonEight.getText().toString();
        String nine = buttonNine.getText().toString();

        boolean endOfGame = false;

        if(one.equals(two) && one.equals(three) && one.equals("X")){
            Toast.makeText(MainActivity.this, "Player X is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonOne.setBackgroundColor(Color.GREEN);
            buttonTwo.setBackgroundColor(Color.GREEN);
            buttonThree.setBackgroundColor(Color.GREEN);
            endOfGame = true;
        } else if(one.equals(two) && one.equals(three) && one.equals("O")){
            Toast.makeText(MainActivity.this, "Player O is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonOne.setBackgroundColor(Color.YELLOW);
            buttonTwo.setBackgroundColor(Color.YELLOW);
            buttonThree.setBackgroundColor(Color.YELLOW);
            endOfGame = true;
        }

        if(one.equals(five) && one.equals(nine) && one.equals("X")){
            Toast.makeText(MainActivity.this, "Player X is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonOne.setBackgroundColor(Color.GREEN);
            buttonFive.setBackgroundColor(Color.GREEN);
            buttonNine.setBackgroundColor(Color.GREEN);
            endOfGame = true;
        } else if(one.equals(five) && one.equals(nine) && one.equals("O")){
            Toast.makeText(MainActivity.this, "Player O is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonOne.setBackgroundColor(Color.YELLOW);
            buttonFive.setBackgroundColor(Color.YELLOW);
            buttonNine.setBackgroundColor(Color.YELLOW);
            endOfGame = true;
        }

        if(one.equals(four) && one.equals(seven) && one.equals("X")){
            Toast.makeText(MainActivity.this, "Player X is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonOne.setBackgroundColor(Color.GREEN);
            buttonFour.setBackgroundColor(Color.GREEN);
            buttonSeven.setBackgroundColor(Color.GREEN);
            endOfGame = true;
        } else if(one.equals(four) && one.equals(seven) && one.equals("O")){
            Toast.makeText(MainActivity.this, "Player O is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonOne.setBackgroundColor(Color.YELLOW);
            buttonFour.setBackgroundColor(Color.YELLOW);
            buttonSeven.setBackgroundColor(Color.YELLOW);
            endOfGame = true;
        }

        if(two.equals(five) && two.equals(eight) && two.equals("X")){
            Toast.makeText(MainActivity.this, "Player X is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonTwo.setBackgroundColor(Color.GREEN);
            buttonFive.setBackgroundColor(Color.GREEN);
            buttonEight.setBackgroundColor(Color.GREEN);
            endOfGame = true;
        } else if(two.equals(five) && two.equals(eight) && two.equals("O")){
            Toast.makeText(MainActivity.this, "Player O is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonTwo.setBackgroundColor(Color.YELLOW);
            buttonFive.setBackgroundColor(Color.YELLOW);
            buttonEight.setBackgroundColor(Color.YELLOW);
            endOfGame = true;
        }

        if(three.equals(six) && three.equals(nine) && three.equals("X")){
            Toast.makeText(MainActivity.this, "Player X is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonThree.setBackgroundColor(Color.GREEN);
            buttonSix.setBackgroundColor(Color.GREEN);
            buttonNine.setBackgroundColor(Color.GREEN);
            endOfGame = true;
        } else if(three.equals(six) && three.equals(nine) && three.equals("O")){
            Toast.makeText(MainActivity.this, "Player O is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonThree.setBackgroundColor(Color.YELLOW);
            buttonSix.setBackgroundColor(Color.YELLOW);
            buttonNine.setBackgroundColor(Color.YELLOW);
            endOfGame = true;
        }

        if(three.equals(five) && three.equals(seven) && three.equals("X")){
            Toast.makeText(MainActivity.this, "Player X is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonThree.setBackgroundColor(Color.GREEN);
            buttonFive.setBackgroundColor(Color.GREEN);
            buttonSeven.setBackgroundColor(Color.GREEN);
            endOfGame = true;
        } else if(three.equals(five) && three.equals(seven) && three.equals("O")){
            Toast.makeText(MainActivity.this, "Player O is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonThree.setBackgroundColor(Color.YELLOW);
            buttonFive.setBackgroundColor(Color.YELLOW);
            buttonSeven.setBackgroundColor(Color.YELLOW);
            endOfGame = true;
        }

        if(four.equals(five) && four.equals(six) && four.equals("X")){
            Toast.makeText(MainActivity.this, "Player X is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonFour.setBackgroundColor(Color.GREEN);
            buttonFive.setBackgroundColor(Color.GREEN);
            buttonSix.setBackgroundColor(Color.GREEN);
            endOfGame = true;
        } else if(four.equals(five) && four.equals(six) && four.equals("O")){
            Toast.makeText(MainActivity.this, "Player O is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonFour.setBackgroundColor(Color.YELLOW);
            buttonFive.setBackgroundColor(Color.YELLOW);
            buttonSix.setBackgroundColor(Color.YELLOW);
            endOfGame = true;
        }

        if(seven.equals(eight) && seven.equals(nine) && seven.equals("X")){
            Toast.makeText(MainActivity.this, "Player X is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonSeven.setBackgroundColor(Color.GREEN);
            buttonEight.setBackgroundColor(Color.GREEN);
            buttonNine.setBackgroundColor(Color.GREEN);
            endOfGame = true;
        } else if(seven.equals(eight) && seven.equals(nine) && seven.equals("O")){
            Toast.makeText(MainActivity.this, "Player O is the Winner!!!", Toast.LENGTH_LONG).show();
            buttonSeven.setBackgroundColor(Color.YELLOW);
            buttonEight.setBackgroundColor(Color.YELLOW);
            buttonNine.setBackgroundColor(Color.YELLOW);
            endOfGame = true;
        }

        if(buttonOne.isEnabled() == false && buttonTwo.isEnabled() == false && buttonThree.isEnabled() == false &&
                buttonFour.isEnabled() == false && buttonFive.isEnabled() == false && buttonSix.isEnabled() == false &&
                buttonSeven.isEnabled() == false && buttonEight.isEnabled() == false && buttonNine.isEnabled() == false ){
            if(!( (one.equals(two) && one.equals(three)) || (one.equals(five) && one.equals(nine))
                || (one.equals(four) && one.equals(seven)) || (two.equals(five) && two.equals(eight))
                || (three.equals(six) && three.equals(nine)) || (three.equals(five) && three.equals(seven))
                || (four.equals(five) && four.equals(six)) || (seven.equals(eight) && seven.equals(nine)) ) ){
                Toast.makeText(MainActivity.this, "Draw Game!", Toast.LENGTH_LONG).show();
                endOfGame = true;
            }
        }

        if(endOfGame){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            buttonSix.setEnabled(false);
            buttonSeven.setEnabled(false);
            buttonEight.setEnabled(false);
            buttonNine.setEnabled(false);
        }

    }
}
