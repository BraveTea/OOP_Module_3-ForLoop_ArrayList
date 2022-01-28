import java.util.ArrayList;

public class Programme {

    public static void main(String[] args){
        System.out.println("config");

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 4; i++){
            list.add("element: " + i);
        }

        System.out.println(list);

        //EXERCISE A:
        //It is quite clear to me that if you use this method of removing elements
        // from the ArrayList you will have a problem. It is going to be a IndexOoBException
        // The list gets smaller everytime you remove an element, so it will not work.
//        for (int i = 0; i < 4; i++){
//            String s = list.get(i);
//            list.remove(s);
//        }


        //EXERCISE C:
        //This will work because it will remove only the last element of the list whilst
        // the list is getting smaller. It can't be out of bounds. But it is more "pricey"
        // because it iterates through the entire list every time.
//        for (int i = 3; i >= 0; i--){
//            String s = list.get(i);
//            list.remove(s);
//        }

        //EXERCISE FOREACH:
        //Doesn't work.
//        for (String thing : list){
//            list.remove(thing);
//        }

        //EXERCISE MyOwnPractice
        list.clear(); //So much easier :)



        System.out.println(list);
    }
}
