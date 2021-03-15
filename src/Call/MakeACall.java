package Call;
import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;
//import com.twilio.rest.api.v2010.Account.call;

public class MakeACall {
    
}
/*

    Send an SMS
Message message = Message.creator(
    new PhoneNumber("+15558881234"),  // To number
    new PhoneNumber("+15559994321"),  // From number
    "Hello world!"                    // SMS body
).create();

System.out.println(message.getSid());


        Make a Call
    Call call = Call.creator(
        new PhoneNumber("+15558881234"),  // To number
        new PhoneNumber("+15559994321"),  // From number

        // Read TwiML at this URL when a call connects (hold music)
        new URI("http://twimlets.com/holdmusic?Bucket=com.twilio.music.ambient")
    ).create();

    System.out.println(call.getSid());
*/