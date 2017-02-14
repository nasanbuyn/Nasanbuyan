package lab3;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;

public class MyChain {

	private JFrame frame;
	private JTextField UndsentextField;
	private JTextField textField_input;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyChain window = new MyChain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	ArrayList<Integer> arr = new ArrayList<Integer>();
	/**
	 * Create the application.
	 */
	ArrayList<Integer> arr1 = new ArrayList<Integer>();
	ArrayList<Integer> arr2 = new ArrayList<Integer>();
	public MyChain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JTextPane textPane = new JTextPane();
		textPane.setBounds(126, 190, 188, 60);
		frame.getContentPane().add(textPane);
		JButton btnToArray = new JButton("toArray");
		btnToArray.addActionListener(new ActionListener() {//toArray ������ ?�����
			public void actionPerformed(ActionEvent arg0) {
				String str[]=UndsentextField.getText().split(" ");//����� ������ ������ ������ ������� ������� "str" ������� ���������
				
				for(String i:str){//str �������� �?� ������ i ����������� ������� ������� ��� int �?�?��?? �������� "foo"-� ���������
					String tmp = i;
					  int foo=Integer.parseInt(tmp);
					  arr.add(foo);//foo-� arr ����� ����������� �����
				}
				String niilber="";
				for(int l=0;l<arr.size();l++){
					niilber=niilber+" "+arr.get(l);//string �?����� null ���������� arr ���������� �?� ����� ������� ���������� ���������
					
				}
				
				textPane.setText(niilber);//"niilber"-� textPane ���� ������ �������
			}
		});
		btnToArray.setBounds(27, 156, 89, 23);
		frame.getContentPane().add(btnToArray);
		
		JButton btnAddRange = new JButton("addRange");
		btnAddRange.addActionListener(new ActionListener() {// addRange-n uildel
			public void actionPerformed(ActionEvent e) {
				String str[]=UndsentextField.getText().split(" ");//deerhtei ijil tailbar
				for(String i:str){
				  String tmp = i;
				  int foo=Integer.parseInt(tmp);
				  arr.add(foo);//arr-� UndsentextFeild-� ����� �������� �����
				}
				
				String str1[]=textField_input.getText().split(" ");// ��� �������� 2 textbox ������ �?�??� ��� �� "UndsentextField" ��  ������� ������� ����� ������ ������� ����� ����� "textField_input" �� ��������� ����� ������ �������
				for(String i:str1){
				  String tmp = i;
				  int foo=Integer.parseInt(tmp);//�������� ����
				  arr1.add(foo);
				}
				for(int l=0;l<arr1.size();l++){
					arr.add(arr1.get(l));//arr1 ���� ������������ �������� ���� ��������� ������ ���������� ��������� arr �������� ���� ���� �����
				}
				String niilber = "";
				for(int j =0; j < arr.size(); j++) {
					   niilber = niilber+" "+arr.get(j);
					 }
				textPane.setText(niilber);//��������� ����
			}
		});
		btnAddRange.setBounds(126, 156, 89, 23);
		frame.getContentPane().add(btnAddRange);
		
		JButton btnUnion = new JButton("union");//unionii uildel dawhardsan elementiig hasna
		btnUnion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str[]=UndsentextField.getText().split(" ");
				for(String i:str){
				  String tmp = i;
				  int foo=Integer.parseInt(tmp);
				  arr.add(foo);//deerhtei ijil
				}
				
				String str1[]=textField_input.getText().split(" ");
				for(String i:str1){
				  String tmp = i;
				  int foo=Integer.parseInt(tmp);
				  arr1.add(foo);//deerhtei ijil tailbartai
				}
				for(int l=0;l<arr1.size();l++){
					arr.add(arr1.get(l));
				}
				
			
				for (int i = 0; i < arr.size(); i++) 
		          {
		       for (int j = i + 1; j < arr.size(); j++) //deerh addRangetei ijil UndsentextField bolon textFeild_input-� �?� ���� arr ���������� ���
		          {
		       if(arr.get(i).compareTo(arr.get(j))==0)//������ ���������� arr-� �������� ������ ����?? ������ j ���� ���������� ����� 
		          {   
				arr.remove(j);
		          }//������ ��������� ������ ��� ���� ���������� ������� ����� ��������� ����� �� ����� �/�� ����� ������� i=0 ���� ?�� j ������� ������� ?�� i=1 �����
		       
		     
		          }
		       
		          }
				String niilber = "";
				for(int j =0; j < arr.size(); j++) {
					   niilber = niilber+" "+arr.get(j);
					 }
				textPane.setText(niilber);
			}
		});
		btnUnion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnUnion.setBounds(225, 156, 89, 23);
		frame.getContentPane().add(btnUnion);
		
		JButton btnIntersection = new JButton("intersection");
		btnIntersection.addActionListener(new ActionListener() {//���������� elementiig hewlene (intersectionii uildel)
			public void actionPerformed(ActionEvent arg0) {
				
				String str[]=UndsentextField.getText().split(" ");
				for(String i:str){
				  String tmp = i;
				  int foo=Integer.parseInt(tmp);
				  arr.add(foo);
				}
				
				String str1[]=textField_input.getText().split(" ");
				for(String i:str1){
				  String tmp = i;
				  int foo=Integer.parseInt(tmp);
				  arr1.add(foo);
				}
				for(int l=0;l<arr1.size();l++){
					arr.add(arr1.get(l));
				}
				
			
				for (int i = 0; i < arr.size(); i++) 
		          {
		       for (int j = i + 1; j < arr.size(); j++) 
		          {
		       if(arr.get(i)==(arr.get(j)))//����?? ������ arr2 ���������� ����� ��������� �?��?� ���������� elementiig l hewlene 
		          {
				arr2.add(arr.get(j));
		          }
		       
		     
		          }
		       
		          }
				String niilber = "";
				for(int j =0; j < arr2.size(); j++) {
					   niilber = niilber+" "+arr2.get(j);
					 }
				
				textPane.setText(niilber);
			}
		});
		btnIntersection.setBounds(324, 156, 89, 23);
		frame.getContentPane().add(btnIntersection);
		
		
		
		JLabel lblNewLabel = new JLabel("result:");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lblNewLabel.setBounds(48, 190, 56, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel undsenLbl = new JLabel("Undsen:");
		undsenLbl.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		undsenLbl.setBounds(59, 26, 68, 14);
		frame.getContentPane().add(undsenLbl);
		
		UndsentextField = new JTextField();
		UndsentextField.setText("1 2 3 4");
		UndsentextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		UndsentextField.setBounds(151, 24, 163, 20);
		frame.getContentPane().add(UndsentextField);
		UndsentextField.setColumns(10);
		
		JLabel lbl_input = new JLabel("Input:");
		lbl_input.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lbl_input.setBounds(76, 64, 57, 14);
		frame.getContentPane().add(lbl_input);
		
		textField_input = new JTextField();
		textField_input.setBounds(151, 62, 163, 20);
		frame.getContentPane().add(textField_input);
		textField_input.setColumns(10);
	}
}
