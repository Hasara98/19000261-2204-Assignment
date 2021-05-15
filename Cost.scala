object Cost extends App{
  def cost(x:Double)=(24.95*0.6*x)+3*50+0.75*(x-50);

  println(cost(60));
}
