package view;

import java.util.List;
import model.Histogram;
import model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String> build (List<String> mail) {
        Histogram<String> histogram = new Histogram<>();
        
        for (String mail1 : mail) {
            histogram.increment(new Mail(mail1).getDomain());
        }
        return histogram;
    }
    
}
