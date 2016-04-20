int score = 50;

void lose(){
  println("noooo");
    score--;
    println(score);
    text("Lives:" +score, width-150, 20);
    //output.println("Score:" +score);
}

void win(){
   println("yessssss");
    score++;
    println(score);
    text("Lives:" +score, width-150, 20);
    //output.println("Score:" +score);
}