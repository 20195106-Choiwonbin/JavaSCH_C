import javax.swing.*;
import java.awt.*;

public class Practice6 extends JFrame {

	private String[] fruits = {"apple", "banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	
	private ImageIcon[] images = {
			new ImageIcon("C:\\Users\\dnjsq\\OneDrive\\바탕 화면\\house.png"),
			new ImageIcon("C:\\Users\\dnjsq\\OneDrive\\바탕 화면\\lens.png"),
			new ImageIcon("C:\\Users\\dnjsq\\OneDrive\\바탕 화면\\wifi.png"),
			new ImageIcon("C:\\Users\\dnjsq\\OneDrive\\바탕 화면\\key.png")};
	
	private String[] name = {"kitae","jaemoon","hyosoo","namyun"};
	private String[] month = {"January", "February", "March", 
	        "April", "May", "June", "July", "August",  
	        "September", "October", "Novemeber", "December"};
	
	public Practice6() {
		setTitle("Practice6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		ImageIcon cherryIcon = new ImageIcon("C:\\Users\\dnjsq\\OneDrive\\바탕 화면\\cherry1.png");
		ImageIcon selectCherry = new  ImageIcon("C:\\\\Users\\\\dnjsq\\\\OneDrive\\\\바탕 화면\\\\cherry1.png");
		
		//JButton
		c.add(new JButton("버튼"));
				
		
		//JCheckBox
		JCheckBox apple_C = new JCheckBox("사과");
		JCheckBox pear_C = new JCheckBox("배", true);
		JCheckBox cherry_C = new JCheckBox("체리",cherryIcon);
		cherry_C.setBorderPainted(true);
		cherry_C.setSelectedIcon(selectCherry);

		c.add(apple_C);
		c.add(pear_C);
		c.add(cherry_C);
		
		
		//JRadioButton
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple_R = new JRadioButton("사과");
		JRadioButton pear_R = new JRadioButton("배", true);
		JRadioButton cherry_R = new JRadioButton("체리", cherryIcon);
		cherry_R.setBorderPainted(true);
		cherry_R.setSelectedIcon(selectCherry);
		
		g.add(apple_R);
		g.add(pear_R);
		g.add(cherry_R);
		
		c.add(apple_R);
		c.add(pear_R);
		c.add(cherry_R);
		
		
		//JSlider
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200 ,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		c.add(slider);
		
		
		//JTextField	
		c.add(new JLabel("이름 "));
		c.add(new JTextField(20));
		c.add(new JLabel("학과 "));
		c.add(new JTextField("컴퓨터공학과(수정)", 20));
		c.add(new JLabel("주소 "));
		c.add(new JTextField("서울시 ...", 20));
		
		
		//JPasswordField
		JLabel pass = new JLabel("Enter the password");
		JPasswordField password = new JPasswordField(10);
		c.add(pass);
		c.add(password);
		
		
		//JSpinner
		SpinnerListModel model = new SpinnerListModel(month);
		JSpinner spinner = new JSpinner(model);
		
		JLabel label = new JLabel("Month: ");
		c.add(label);
		c.add(spinner);
		
		
		//JTextArea
		c.add(new JTextArea("hello", 7, 20));
		
		
		//JComboBox
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<String>();
		for(int i=0; i<name.length;i++) {
			nameCombo.addItem(name[i]);
		}
		c.add(nameCombo);
		
	
		//JLIst
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>(images);
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		
		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Practice6();

	}

}
