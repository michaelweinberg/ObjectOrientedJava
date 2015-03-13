package com.baseballavgs;


//import allthe various form elements
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class BaseballAverageForm {

/***************
* this class creates the form to add 
* words and display the results in a 
* JList object.  The form contains
* four panels: A border panel to orient
* the others, A grid panel that contains
* labels and textboxes, a scrollpane 
* with a list in the center and a 
* flow panel with the buttons at
* the bottom
*/
private JFrame frame;
private JPanel borderPanel;
private JPanel newWordPanel;
private JPanel buttonPanel;
private JScrollPane scrollPane;
private JList wordList;
private JLabel wordPrompt;
private JTextField wordText;
private JLabel defPrompt;
private JTextField defText;
private JButton addButton;
private JButton getWordsButton;
private JButton exitButton;

//instantiate the dictionary class
private BaseballAverageCalc tech;

public BaseballAverageForm() {
createFrame();
tech = new BaseballAverageCalc();
}

private void createFrame() {
frame = new JFrame();
frame.setBounds(100, 100, 300, 300);
frame.add(createBorderPanel());
frame.setVisible(true);
}

private JPanel createBorderPanel() {
borderPanel = new JPanel();
borderPanel.setLayout(new BorderLayout());
borderPanel.add(createNewWordPanel(), BorderLayout.NORTH);
borderPanel.add(createScrollPane(), BorderLayout.CENTER);
borderPanel.add(createButtonPanel(), BorderLayout.SOUTH);
return borderPanel;
}

private JPanel createNewWordPanel() {
newWordPanel = new JPanel();
newWordPanel.setLayout(new GridLayout(2, 2));
wordPrompt = new JLabel("Enter Word");
wordText = new JTextField();
defPrompt = new JLabel("Enter Definition");
defText = new JTextField();
newWordPanel.add(wordPrompt);
newWordPanel.add(wordText);
newWordPanel.add(defPrompt);
newWordPanel.add(defText);
return newWordPanel;
}

private JScrollPane createScrollPane() {
wordList = new JList();
// add the selection listener to the list
// wordlist.addListSelectionListener(new SelectionListener());
scrollPane = new JScrollPane(wordList);
scrollPane.setBounds(20, 20, 100, 200);

return scrollPane;
}

private JPanel createButtonPanel() {
buttonPanel = new JPanel();
buttonPanel.setLayout(new FlowLayout());
addButton = new JButton("Add Word");
addButton.addActionListener(new AddButtonListener());
getWordsButton = new JButton("Get Words");
getWordsButton.addActionListener(new GetWordsListener());
exitButton = new JButton("Exit");
exitButton.addActionListener(new ExitListener());

buttonPanel.add(addButton);
buttonPanel.add(getWordsButton);
buttonPanel.add(exitButton);

return buttonPanel;
}

private class AddButtonListener implements ActionListener {

@Override
public void actionPerformed(ActionEvent e) {
 //in this method we add a word object
 //to the dictionary class
 Word w = new Word();
 w.setWord(wordText.getText());
 w.setDefinition(defText.getText());
 tech.addWord(w);

 wordText.setText("");
 defText.setText("");
}

}

private class GetWordsListener implements ActionListener {

@Override
//here we write to the JList
public void actionPerformed(ActionEvent e) {
 ArrayList<Word> words = tech.getWords();
 DefaultListModel model = new DefaultListModel();

 for (Word w : words) {
  model.addElement(w.toString());
 }
 wordList.setModel(model);
}

}

private class ExitListener implements ActionListener {

@Override
public void actionPerformed(ActionEvent e) {
 System.exit(0);

}

}
}

