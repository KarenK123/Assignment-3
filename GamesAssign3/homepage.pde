void homepage(){
  
  
  String lines[] = loadStrings("Welcome.txt");
  for (int i = 0; i < lines.length; i++) {
     fill(#FAA803);
    text(lines[i], (width/6), (height/10), (width/1.4), (height/1.2));  // Text wraps within text box
  }
  
  
}