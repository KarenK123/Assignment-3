int score =0;

void lose(){
  println("noooo");
    score--;
    println(score);
    text("score:" +score, width-200, 20);
    //output.println("Score:" +score);
}

void win(){
   println("yessssss");
    score++;
    println(score);
    text("score:" +score, width-200, 20);
    //output.println("Score:" +score);
}