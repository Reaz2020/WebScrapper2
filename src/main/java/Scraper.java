
import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraper {
    public static void main(String[] args) {
        final String url =
                "https://www.nasdaqomxnordic.com/index/index_info?Instrument=SE0001809476";

        try {
            final Document document = Jsoup.connect(url).get();
            Elements element = document.select("header.componentHeader h3");
            System.out.println(element.html());
            //System.out.println(document.outerHtml());

            for (Element row : document.select("table.changeDataTable.tablesorter tr")) {

          
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}