
import java.util.Calendar;

public class routine {
    subject[]  Subject;
    subject[][] classRoutine;
    String[][] classList;
    String[] assignmentList;
    int today;

    routine(int e){
        // Get the current date
        Calendar calendar = Calendar.getInstance();
        // Get the day of the week (1 = Sunday, 2 = Monday, etc.) so we subtract 1 for (0 = Sunday, 1 = Monday, etc.)
        today = calendar.get(Calendar.DAY_OF_WEEK) -1 ;
        //s     m       t       w       th      f       s
        Integer[] AIPeriods         ={  null,   1,      0,      2,      null,   null,   null};
        Integer[] ComNetPeriods     ={  null,   0,      1,      null,   2,      null,   null};
        Integer[] EcoPeriods        ={  1,      null,   3,      null,   1,      null,   null};
        Integer[] ICTPeriods        ={  null,   2,      null,   1,      0,      null,   null};
        Integer[] ImagePeriods      ={  0,      null,   2,      3,      null,   null,   null};
        Integer[] CompNetLABPeriods ={  2,      null,   null,   null,   null,   null,   null};
        Integer[] ImageLABPeriods   ={  null,   null,   null,   0,      null,   null,   null};
        Integer[] AILABPeriods      ={  null,   null,   null,   null,   3,      null,   null};

        Subject = new subject[8];

        //for AI
        Subject[0] = new subject("AI",false,AIPeriods);
        //for Computer Network
        Subject[1] = new subject("Computer Network",false,ComNetPeriods);
        //for Economics
        Subject[2] = new subject("Economics",false,EcoPeriods);
        //for ITC project
        Subject[3] = new subject("ITC project",false,ICTPeriods);
        //for Image Processing
        Subject[4] = new subject("Image Processing",false,ImagePeriods);
        //for Computer Network Labs
        Subject[5] = new subject("Computer Network Labs",true,CompNetLABPeriods);
        //for Image Processing Labs
        Subject[6] = new subject("Image Processing Labs",true,ImageLABPeriods);
        //for AI Labs
        Subject[7] = new subject("AI Labs",true,AILABPeriods);

        classList = integrateClasses (Subject);


    }

    routine(){
        // Get the current date
        Calendar calendar = Calendar.getInstance();
        // Get the day of the week (1 = Sunday, 2 = Monday, etc.) so we subtract 1 for (0 = Sunday, 1 = Monday, etc.)
        today = calendar.get(Calendar.DAY_OF_WEEK) -1 ;
                                        //s     m       t       w       th      f       s
        Integer[] AIPeriods         ={  null,   1,      0,      2,      null,   null,   null};
        Integer[] ComNetPeriods     ={  null,   0,      1,      null,   2,      null,   null};
        Integer[] EcoPeriods        ={  1,      null,   3,      null,   1,      null,   null};
        Integer[] ICTPeriods        ={  null,   2,      null,   1,      0,      null,   null};
        Integer[] ImagePeriods      ={  0,      null,   2,      3,      null,   null,   null};
        Integer[] CompNetLABPeriods ={  2,      null,   null,   null,   null,   null,   null};
        Integer[] ImageLABPeriods   ={  null,   null,   null,   0,      null,   null,   null};
        Integer[] AILABPeriods      ={  null,   null,   null,   null,   3,      null,   null};

        Subject = new subject[8];

        //for AI
        Subject[0] = new subject("AI",false,AIPeriods);
        //for Computer Network
        Subject[1] = new subject("Computer Network",false,ComNetPeriods);
        //for Economics
        Subject[2] = new subject("Economics",false,EcoPeriods);
        //for ITC project
        Subject[3] = new subject("ITC project",false,ICTPeriods);
        //for Image Processing
        Subject[4] = new subject("Image Processing",false,ImagePeriods);
        //for Computer Network Labs
        Subject[5] = new subject("Computer Network Labs",true,CompNetLABPeriods);
        //for Image Processing Labs
        Subject[6] = new subject("Image Processing Labs",true,ImageLABPeriods);
        //for AI Labs
        Subject[7] = new subject("AI Labs",true,AILABPeriods);

        classList = integrateClasses (Subject);


    }

    String[][] integrateClasses (subject[] Subject ){
        String[][] classList  = new String[6][4];

        /*
        x will traverse through the number of subjects
        y will travers through the every day of the week and
         */
        for(int x  =0 ; x< Subject.length ; x++){

        }

    }



}
