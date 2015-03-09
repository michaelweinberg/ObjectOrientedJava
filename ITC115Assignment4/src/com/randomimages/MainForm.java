package com.randomimages;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import randomizearray.Item;


public class MainForm {
	
	private final String IMG_PATH = "C:\\Users\\michael\\workspace\\ITC115Assignment4\\Images\\";
	private final int IMAGE_WIDTH=315;
	private final int IMAGE_HEIGHT=670;
	private JFrame frame;
	private JPanel panel;
	private JLabel prompt;
	private JLabel pictureLabel;
	private JTextField numberField;
	private JButton button;
	private JPanel picturePanel;
	private int number=1;
	
	public MainForm(){
		createFrame();
	}

	private void createFrame(){
			frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setBounds(200,200,400,400);
			frame.add(createPanel());
			frame.setVisible(true);
	
		
	}
	
	private JPanel createPanel(){
		panel= new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(createTopPanel(), BorderLayout.NORTH);
         return panel;
	}
	
	private JPanel createTopPanel(){
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		prompt= new JLabel("How many pictures");
		numberField = new JTextField(10);
		
		button = new JButton("Get Pictures");
		button.addActionListener(new PictureListener());
		//pictureLabel = new JLabel();
		
		
         topPanel.add(prompt);
         topPanel.add(numberField);
         topPanel.add(button);
         
         return topPanel;
	}
	
	
	
	private class PictureListener implements ActionListener{
		
	

		@Override
		public void actionPerformed(ActionEvent arg0) {
			number = Integer.parseInt(numberField.getText());
			
			
				  ArrayList<Item> pictures = new ArrayList<Item>();
				  Item i = new Item("1.png");
				  Item i2 =new Item("2.png");
				  Item i3 =new Item("3.png");
				  Item i4=new Item("4.png");
				  Item i5=new Item("5.png");
				  pictures.add(i);
				  pictures.add(i2);
				  pictures.add(i3);
				  pictures.add(i4);
				  pictures.add(i5);
				  
				  shuffle(pictures);
				 
			//String[] pictures = new String[] {"1.png","2.png","3.png","4.png","5.png","6.png","7.png","8.png","9.png","10.png","11.png","12.png","13.png","14.png","15.png","16.png","17.png","18.png","19.png","20.png","21.png","22.png","23.png","24.png","25.png","26.png","27.png","28.png","29.png","30.png","31.png","32.png","33.png","34.png","35.png","36.png","37.png","38.png","39.png","40.png","41.png","42.png","43.png","44.png","45.png","46.png","47.png","48.png","49.png","50.png","51.png","52.png"};
			
			picturePanel=new JPanel();
			picturePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			 BufferedImage img=null;
				try {
					for (Item item : pictures){
					
					img = ImageIO.read(new File(IMG_PATH + item));
					ImageIcon icon = new ImageIcon(img);
			         JLabel label = new JLabel(icon);
			         picturePanel.add(label,BorderLayout.WEST);
			        // images.add(label);
					}
					panel.add(picturePanel, BorderLayout.CENTER);
					frame.setBounds(200,200,number *(IMAGE_WIDTH),IMAGE_HEIGHT);
					
					frame.revalidate();
					frame.repaint();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
		}

		private void shuffle(ArrayList<Item> pictures) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
