package mypackage;
import javax.swing.*;
public class Appp {

	public static void main(String[] args) {
		{
			JFrame f=new Frame("Notepad");
			f.setVisible(true);
			JTextArea t=new TextArea();
			f.setBackground(Color.green);
			f.setSize(400,600);
			MenuBar mb=new MenuBar();
			f.setMenuBar(mb);
			f.add(t);
			
			//creating menus
			Menu m1=new Menu("File");
			Menu m2=new menu("Edit");
			Menu m2=new menu("View");
			Menu m2=new menu("Search");
			Menu m2=new menu("Help");
			
			//Adding Menus to MenuBar
			mb.add(m1);
			mb.add(m2);
			mb.add(m3);
			mb.add(m4);
			mb.add(m5);
			
			//Creating MenuItems
			MenuItem mi1=new MenuItem("New");
			MenuItem mi2=new MenuItem("Open");
			MenuItem mi3=new MenuItem("Save");
			MenuItem mi4=new MenuItem("Save As");
			MenuItem mi5=new MenuItem("Exit");
			
			//Adding MenuItems to FileMenu
			m1.add(mi1);
			m1.addSeparator();
			m1.add(mi2);
			m1.add(mi3);
			m1.addSeparator();
			m1.add(mi4);
			m1.add(mi5);
						
		}

	}

}
