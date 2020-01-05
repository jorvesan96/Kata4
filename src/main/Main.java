package main;

import java.io.IOException;
import java.util.List;
import model.Histogram;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Main {

    public static void main(String[] args) throws IOException, Exception {
        Main kata= new Main();
        kata.execute();
        
    }
    public Histogram<String> histogram;
    public List<String> mailList;
    
    private void execute() throws Exception{
        input();
        process();
        output();
    }
    private void process() throws Exception{
        histogram = MailHistogramBuilder.build(mailList);
        
    }
    private void input() throws IOException{
        String filename = "Mail.txt";
        mailList = MailListReader.read(filename);
    }
    private void output(){ 
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
