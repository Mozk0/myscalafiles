import scala.io.Source

if (args.length == 1) {
  val lines = Source.fromFile(args(0)).getLines
  lines.foreach(l => print(l.length + " " + l))
}
  
