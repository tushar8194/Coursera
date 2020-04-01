package wikipedia

import java.nio.charset.CodingErrorAction

import scala.io.{Codec, Source}

object WikipediaData {

  implicit val codec = Codec("UTF-8")
  codec.onMalformedInput(CodingErrorAction.REPLACE)
  codec.onUnmappableCharacter(CodingErrorAction.REPLACE)

  private[wikipedia] def lines: List[String] = {
    Option(getClass.getResourceAsStream("/wikipedia/wikipedia.dat")) match {
      case None => sys.error("Please download the dataset as explained in the assignment instructions")
      case Some(resource) => Source.fromInputStream(resource)(codec).getLines().toList
    }
  }

  private[wikipedia] def parse(line: String): WikipediaArticle = {
    val subs = "</title><text>"
    val i = line.indexOf(subs)
    val title = line.substring(14, i)
    val text  = line.substring(i + subs.length, line.length-16)
    WikipediaArticle(title, text)
  }
}
