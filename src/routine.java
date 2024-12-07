import java.util.Calendar;

public class routine {
    subject[][] classRoutine;
    String[] assignmentList;
    int today;

    routine(){
        // Get the current date
        Calendar calendar = Calendar.getInstance();
        // Get the day of the week (1 = Sunday, 2 = Monday, etc.) so we subtract 1 for (0 = Sunday, 1 = Monday, etc.)
        today = calendar.get(Calendar.DAY_OF_WEEK) -1 ;
        //for AI
        subject AI = new subject("AI",false);
        //for Computer Network
        subject computerNetwork = new subject("Computer Network",false);

        //for Economics
        subject economics = new subject("Economics",false);

        //for ITC project
        subject ictProject = new subject("ITC project",false);

        //for Image Processing
        subject imageProcessing = new subject("Image Processing",false);

        //for Computer Network Labs
        subject computerNetworkLabs = new subject("Computer Network Labs",true);

        //for Image Processing Labs
        subject imageProcessingLabs = new subject("Image Processing Labs",true);

        //for AI Labs
        subject aiLabs = new subject("AI Labs",true);

        //for null subject as some days only 3 periods are instead of 4
        subject nullSubject = new subject(null,null);


        classRoutine = new subject[][]
                {
                        {imageProcessing,       economics,          computerNetworkLabs,    nullSubject},
                        {computerNetwork,       AI,                 ictProject,             nullSubject},
                        {AI,                    computerNetwork,    imageProcessing,        economics},
                        {imageProcessingLabs,   ictProject,         AI,                     imageProcessing},
                        {ictProject,            economics,          computerNetwork,        aiLabs}
                };
    }



}
