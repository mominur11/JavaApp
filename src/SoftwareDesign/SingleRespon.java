package SoftwareDesign;

public class SingleRespon{
    public static void main(String[] args){
        SchedulingApplications sa = new SchedulingApplications(new Compute(),new Save(),new SendNotification());
        sa.schedule();
    }
}
class SchedulingApplications{
    Compute c;
    Save s;
    SendNotification n;

    public SchedulingApplications(Compute c, Save s, SendNotification n){
        this.c = c;
        this.s = s;
        this.n = n;
    }

    public void schedule(){
        System.out.println(c.compute());
        System.out.println(s.save());
        System.out.println(n.sendNotification());
    }
}


class Compute {
    public String compute() {
        return "Computing data based on user input";
    }
   }

    class Save {
        public String save(){
            return "Save the object to Database";
        }
    }

   class SendNotification {

        public String sendNotification(){
            return "Send the notification to the user";
        }
    }
