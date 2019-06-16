package Models;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ExTime  implements InterfaceDate{

    @Override
    public String showDate() {
        return null;
    }

    public int hour;

        protected java.util.Date date = new Date();

        public ExTime(int hour)
        {
            this.hour = hour;
        }



        public void setHour(int hour) {
            this.hour = hour;
        }

}
