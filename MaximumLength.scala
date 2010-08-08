object MaximumLength {
  def main(args: Array[String]) {
    println(args.map(x => x.length).reduceLeft((x, y) => x max y))
  }
}
