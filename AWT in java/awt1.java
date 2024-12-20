public class awt1{
    public static void main(String args[]){
        //Code for label:
        Label label =new Label("Enter your name: ");

        //Code for Button:
        Button button =new Button("Submit");

        //Code for TextField:
        TextField testfield = new TextField(20); //20colummns wide 

        //Code for Textarea:

        TextArea textarea new TextArea(5,20); //5 rows and 20 columns

        //Code for CHheckbox:
        CheckBox checkbox = new CheckBox("I agree");

        //Code for CheckboxGroup:
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Option 1",cbg,false);
        Checkbox checkbox2 = new Checkbox("Option 2",cbg,true);
        Checkbox checkbox3 = new Checkbox("Option 3",cbg,false);
        Checkbox checkbox3 = new Checkbox("Option 3",cbg,false);

        //Code for Choice:
        Choice choice = new Choice();
        Choice.add("item1");
        choice.add("item2");

        //Code for List:
        List list = new List(4,false);//4 variable , single selection
        list.add("item1");
        list.add("item2");

        //Code for pannel
        Panel panel =new Panel();
        panel.add(new Button("Click me!"));
        


    }
}