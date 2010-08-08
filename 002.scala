import scala.io.Source

def maxIn(ls: List[Int]) = 
  ls.reduceLeft((x, y) => x max y)

def lengthOfLength(ls: List[String]) =
  ls.map(l => l.length.toString.length)

def printLengthesAndLines(ls: List[String]) = {
  val maxLengthOfLength = maxIn(lengthOfLength(ls))
  for (l <- ls) {
    val len = l.length
    val padding = " " * (maxLengthOfLength - len)
    print(len + padding + " |" + l)
  }
}

if (args.length == 1) {
  printLengthesAndLines(Source.fromFile(args(0)).getLines.toList)
}
  
