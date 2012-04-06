package sinemaotomasyon;


import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class salon2 extends JFrame{
	
	 public salon2() {
	        initComponents();
	    }

	private void initComponents() {
		Container con = getContentPane();
		con.setLayout(null);
	    this.setSize(500,400);
		JButton btn=new JButton("Satýn Al");
		JCheckBox a1=new JCheckBox("no1");
		JCheckBox a2=new JCheckBox("no2");
		JCheckBox a3=new JCheckBox("no3");
		JCheckBox a4=new JCheckBox("no4");
		JCheckBox a5=new JCheckBox("no5");
		JCheckBox a6=new JCheckBox("no6");
		JCheckBox a7=new JCheckBox("no7");
		JCheckBox a8=new JCheckBox("no8");
		JCheckBox a9=new JCheckBox("no9");
		JCheckBox a10=new JCheckBox("no10");
		JCheckBox a11=new JCheckBox("no11");
		JCheckBox a12=new JCheckBox("no12");
		JCheckBox a13=new JCheckBox("no13");
		JCheckBox a14=new JCheckBox("no14");
		JCheckBox a15=new JCheckBox("no15");
		JCheckBox a16=new JCheckBox("no16");
		JCheckBox a17=new JCheckBox("no17");
		JCheckBox a18=new JCheckBox("no18");
		
		con.add(btn);
		con.add(a1);con.add(a2);con.add(a3);con.add(a4);con.add(a5);
		con.add(a6);con.add(a7);con.add(a8);con.add(a9);con.add(a10);
		con.add(a11);con.add(a12);con.add(a13);con.add(a14);con.add(a15);
		con.add(a16);con.add(a17);con.add(a18);
		btn.setBounds(370,320, 100,30);a1.setBounds(60,100,60,60);a2.setBounds(120,100,60,60);
		a3.setBounds(180,100,60,60);a4.setBounds(240,100,60,60);a5.setBounds(300,100,60,60);
		a6.setBounds(360,100,60,60);a7.setBounds(60,160,60,60);a8.setBounds(120,160,60,60);
	   a9.setBounds(180,160,60,60);a10.setBounds(240,160,60,60);a11.setBounds(300,160,60,60);
	   a12.setBounds(360,160,60,60);a13.setBounds(60,220,60,60);a14.setBounds(120,220,60,60);
	   a15.setBounds(180,220,60,60);a16.setBounds(240,220,60,60);a17.setBounds(300,220,60,60);
	   a18.setBounds(360,220,60,60);
	}

}
