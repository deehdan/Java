class ArrayIntro{
 public static void main(String[] args) {
  
   // create an array
   int[] score = {82, 98, 81, 78, 86, 74,56 ,58 , 62, 75,};

   // access each array elements
  System.out.println("Accessing Elements of Array:");
  System.out.println("First Element: " + score[0]);
  System.out.println("Second Element: " + score[1]);
  System.out.println("Third Element: " + score[2]);
  System.out.println("Fourth Element: " + score[3]);
  System.out.println("Fifth Element: " + score[4]);
  System.out.println("Sixth Element: " + score[5]);
  System.out.println("Seventh Element: " + score[6]);
  System.out.println("Eighth Element: " + score[7]);
  System.out.println("Ninth Element: " + score[8]);
  System.out.println("Tenth Element: " + score[9]);
 
  

  int j = 0;
  while(j < score.length){
    System.out.println(score[j]);
    j++;
  }
  

  score[0] = 57;
 
 System.out.println("Editted");
  for(int i = 0; i < score.length; i++){
    System.out.println(score[i]);
  }

}

}
