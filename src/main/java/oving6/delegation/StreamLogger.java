package oving6.delegation;

import java.io.IOException;
import java.io.OutputStream;

public class StreamLogger {

    private String formatString;
    private OutputStream stream;

    public StreamLogger(OutputStream stream){
        this.stream = stream;
        this.formatString = "%s: %s (%s)";

    }

    public void setFormatString(String formatString){
        if (formatString == null) {
            throw new NullPointerException("cannot be null");
        }
        this.formatString = formatString;
    }

    public void log(String severity, String message, Exception exception){
        String formated = String.format(formatString, severity, message, exception);

        try {
            stream.write((formated + System.lineSeparator()).getBytes());
            stream.flush();
            
        } catch (IOException e) {
            throw new RuntimeException("Falied to write log message", e);   
        }
    }

}
    
