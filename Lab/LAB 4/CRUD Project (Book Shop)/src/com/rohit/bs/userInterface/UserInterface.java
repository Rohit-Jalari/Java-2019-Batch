package com.rohit.bs.userInterface;

import com.rohit.bs.dto.Book;
import com.rohit.bs.service.BookService;
import com.rohit.bs.service.BookServiceImpl;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.*;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.util.List;

public class UserInterface implements ActionListener 
{

	private JFrame bookRecordKeeperFrame;
	private JTextField bookIdInput, bookNameInput, authorInput, editionInput, priceInput;
	private JPanel bookInformationPanel, searchPanel, interfaceContainerPanel, loginPanel ;
	private JLabel bookNameLabel, editionLabel, priceLabel, authorLabel, nameLabel, bookIdLabel, bookDBLabel;
	private JButton addRecordBtn, updateRecordBtn, deleteRecordBtn, searchRecordBtn, clearBtn, loginBtn ;
	private JTable tableRecord;
	private JPanel loginButtonPanel;
	private JLabel userNameLabel;
	private JTextField userNameTextField, passwordTextField;

	public UserInterface() {
		initializeLayout();
		addEventListener();
	}
	
	//layout design
	private void initializeLayout() {
		bookRecordKeeperFrame = new JFrame();
		bookRecordKeeperFrame.setResizable(false);
		bookRecordKeeperFrame.setTitle("Book Record Keeper - Admin Panel");
		bookRecordKeeperFrame.setBounds(100, 100, 940, 420);
		bookRecordKeeperFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bookRecordKeeperFrame.getContentPane().setLayout(null);
		
		loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 924, 381);
		bookRecordKeeperFrame.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		
		loginButtonPanel = new JPanel();
		loginButtonPanel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		loginButtonPanel.setBounds(27, 24, 452, 346);
		loginPanel.add(loginButtonPanel);
		loginButtonPanel.setLayout(null);
		
		userNameLabel = new JLabel("User Name");
		userNameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		userNameLabel.setBounds(51, 67, 132, 19);
		loginButtonPanel.add(userNameLabel);
		
		userNameTextField = new JTextField();
		userNameTextField.setBounds(50, 86, 283, 37);
		loginButtonPanel.add(userNameTextField);
		userNameTextField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		passwordLabel.setBounds(51, 154, 132, 19);
		loginButtonPanel.add(passwordLabel);
		
		passwordTextField = new JTextField();
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(51, 172, 283, 37);
		loginButtonPanel.add(passwordTextField);
		
		loginBtn = new JButton("LOGIN");
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		loginBtn.setBounds(146, 242, 90, 37);
		loginButtonPanel.add(loginBtn);
		
		JLabel titleLabel = new JLabel("Eclipse Book Shop");
		titleLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 34));
		titleLabel.setBounds(557, 47, 287, 54);
		loginPanel.add(titleLabel);
		
		JLabel lblNewLabel = new JLabel("Login To Continue");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(597, 122, 196, 54);
		loginPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username  :  admin");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(622, 212, 181, 33);
		loginPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password   :  admin");
		lblNewLabel_1_1.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(622, 256, 181, 33);
		loginPanel.add(lblNewLabel_1_1);
		
		interfaceContainerPanel = new JPanel();
		interfaceContainerPanel.setBounds(27, 11, 887, 359);
		bookRecordKeeperFrame.getContentPane().add(interfaceContainerPanel);
		interfaceContainerPanel.setLayout(null);
		
		bookInformationPanel = new JPanel();
		bookInformationPanel.setBounds(0, 118, 335, 229);
		interfaceContainerPanel.add(bookInformationPanel);
		bookInformationPanel.setBorder(new TitledBorder(null, "Books' Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		bookInformationPanel.setLayout(null);
		
		bookNameLabel = new JLabel("Book Name");
		bookNameLabel.setBounds(15, 29, 79, 22);
		bookNameLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		bookInformationPanel.add(bookNameLabel);
		
		editionLabel = new JLabel("Edition");
		editionLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		editionLabel.setBounds(15, 95, 66, 22);
		bookInformationPanel.add(editionLabel);
		
		priceLabel = new JLabel("Price");
		priceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		priceLabel.setBounds(15, 128, 66, 22);
		bookInformationPanel.add(priceLabel);
		
		authorLabel = new JLabel("Author(s)");
		authorLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		authorLabel.setBounds(15, 62, 66, 22);
		bookInformationPanel.add(authorLabel);
		
		bookNameInput = new JTextField();
		bookNameInput.setColumns(10);
		bookNameInput.setBounds(104, 31, 200, 22);
		bookInformationPanel.add(bookNameInput);
		
		authorInput = new JTextField();
		authorInput.setColumns(10);
		authorInput.setBounds(104, 65, 200, 22);
		bookInformationPanel.add(authorInput);
		
		editionInput = new JTextField();
		editionInput.setColumns(10);
		editionInput.setBounds(104, 98, 200, 22);
		bookInformationPanel.add(editionInput);
		
		priceInput = new JTextField();
		priceInput.setColumns(10);
		priceInput.setBounds(104, 131, 200, 22);
		bookInformationPanel.add(priceInput);
		
		addRecordBtn = new JButton("ADD");
		addRecordBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		addRecordBtn.setBounds(17, 171, 89, 42);
		bookInformationPanel.add(addRecordBtn);
		
		updateRecordBtn = new JButton("UPDATE");
		updateRecordBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		updateRecordBtn.setBounds(119, 171, 89, 42);
		bookInformationPanel.add(updateRecordBtn);
		
		deleteRecordBtn = new JButton("DELETE");
		deleteRecordBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		deleteRecordBtn.setBounds(220, 171, 89, 42);
		bookInformationPanel.add(deleteRecordBtn);
		
		nameLabel = new JLabel("Eclipse Book Shop");
		nameLabel.setBounds(0, 0, 197, 39);
		interfaceContainerPanel.add(nameLabel);
		nameLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		
		searchPanel = new JPanel();
		searchPanel.setBounds(0, 50, 335, 57);
		interfaceContainerPanel.add(searchPanel);
		searchPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Search Book", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		searchPanel.setLayout(null);
		
		bookIdLabel = new JLabel("Book ID");
		bookIdLabel.setBounds(15, 19, 66, 22);
		bookIdLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		searchPanel.add(bookIdLabel);
		
		bookIdInput = new JTextField();
		bookIdInput.setHorizontalAlignment(SwingConstants.CENTER);
		bookIdInput.setBounds(80, 16, 66, 29);
		searchPanel.add(bookIdInput);
		bookIdInput.setColumns(10);
		
		clearBtn = new JButton("CLEAR");
		clearBtn.setBounds(251, 14, 76, 33);
		searchPanel.add(clearBtn);
		clearBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		searchRecordBtn = new JButton("SEARCH");
		searchRecordBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		searchRecordBtn.setBounds(154, 14, 89, 33);
		searchPanel.add(searchRecordBtn);
		
		JScrollPane tableScrollPanel = new JScrollPane();
		tableScrollPanel.setBounds(343, 31, 544, 328);
		interfaceContainerPanel.add(tableScrollPanel);
		
		tableRecord = new JTable();
		tableScrollPanel.setViewportView(tableRecord);
		
		bookDBLabel = new JLabel("Book DataBase");
		bookDBLabel.setBounds(529, 9, 234, 20);
		interfaceContainerPanel.add(bookDBLabel);
		bookDBLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		
		interfaceContainerPanel.setVisible(false);
		
		bookRecordKeeperFrame.setVisible(true);
		loginPanel.setVisible(true);
		interfaceContainerPanel.setVisible(false);
		
		//loads the Table Record
		loadTable();
	}
	
	private void loadTable()
	{
		String[] columnHeadings = {"ID","Book Name","Author(s)","Edition","Price"};
		
		BookService bookService = new BookServiceImpl();
		
		//gets array of all the Records from the DataBase
		List<Book> bookArray = bookService.getAllBooks();
		
		//define model for the Table
		DefaultTableModel model = new DefaultTableModel();
		
		//add headings to the Table
		model.setColumnIdentifiers(columnHeadings);	
		
		//Inserts each Object of the Array into the Table 
		for(Book book : bookArray)
		{
			int id = book.getId();
			String name = book.getName();
			String author = book.getAuthor();
			String edition = book.getEdition();
			String price = book.getPrice();
			
			model.addRow(new Object[] {id,name,author,edition,price});
		}
		tableRecord.setModel(model);
		
		//sets Row Height
		tableRecord.setRowHeight(24);
		
		//sets Column Height
		TableColumnModel columnModel = tableRecord.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(20);
		columnModel.getColumn(1).setPreferredWidth(180);
		columnModel.getColumn(2).setPreferredWidth(100);
		columnModel.getColumn(3).setPreferredWidth(50);
		columnModel.getColumn(4).setPreferredWidth(50);
	}
	
	//adds Event Listener to the Buttons
	private void addEventListener()
	{
		addRecordBtn.addActionListener(this);
		updateRecordBtn.addActionListener(this);
		deleteRecordBtn.addActionListener(this);
		searchRecordBtn.addActionListener(this);
		clearBtn.addActionListener(this);
		loginBtn.addActionListener(this);
	}
	
	//sets Values of Input Field into Book
	private void getBookInputField(Book book)
	{
		book.setName(bookNameInput.getText());
		book.setAuthor(authorInput.getText());
		book.setEdition(editionInput.getText());
		book.setPrice(priceInput.getText());
	}
	
	//sets Values of Book into Input Field
	private void setBookInputField(Book book)
	{
		bookNameInput.setText(book.getName());
		authorInput.setText(book.getAuthor());
		editionInput.setText(book.getEdition());
		priceInput.setText(book.getPrice());
	}
	
	//sets Values of Input Field to Blank
	private void setBookInputFieldNull()
	{
		bookIdInput.setText("");
		bookNameInput.setText("");
		authorInput.setText("");
		editionInput.setText("");
		priceInput.setText("");
	}
	
	//functions to validate empty Input Fields
	private boolean validateSearchInput(String id)
	{
		return (id.equals("")) ? (false) : (true);
	}
	private boolean validateDeleteInput(String id)
	{
		return (id.equals("")) ? (false) : (true);
	}
	private boolean validateAddInput(Book book)
	{
		return ( (book.getName().equals("")) || (book.getAuthor().equals("")) || (book.getEdition().equals("")) || (book.getPrice().equals("")) ) ? false : true;
	}
	private boolean validateUpdateInput(String id,Book book)
	{
		return ( (id.equals("")) || (book.getName().equals("")) || (book.getAuthor().equals("")) || (book.getEdition().equals("")) || (book.getPrice().equals("")) ) ? false : true;
	}
	private boolean validateLogin(String uName, String pass)
	{
		return ( (uName.equals("admin")) && (pass.equals("admin")) ) ? true : false;
	}
	
	public void actionPerformed(ActionEvent event)
	{
		String id = bookIdInput.getText();
		Book book = new Book();
		getBookInputField(book);

		BookService bookService = new BookServiceImpl();
		
		if(event.getSource() == addRecordBtn)
		{
			if(validateAddInput(book) == false)
			{
				JOptionPane.showMessageDialog(null,"Please Enter all the Records in the Input Field!!!");
			} else {
				bookService.addBook(book);
				loadTable();
				JOptionPane.showMessageDialog(null, "Book Registration Successfull !!!");
				setBookInputFieldNull();
			}
		} else if(event.getSource() == updateRecordBtn)
		{
			if(validateUpdateInput(id,book) == false)
			{
				JOptionPane.showMessageDialog(null,"Please Enter all the Records in the Input Field!!!");
			} else {
				bookService.updateBook(Integer.parseInt(id),book);
				loadTable();
				JOptionPane.showMessageDialog(null, "Book Successfully Updated !!!");
			}
		} else if(event.getSource() == deleteRecordBtn)
		{
			if(validateDeleteInput(id) == false)
			{
				JOptionPane.showMessageDialog(null,"Enter Book ID in Input Field!!!");
			} else {
				bookService.deleteBook(Integer.parseInt(id));
				loadTable();
				JOptionPane.showMessageDialog(null, "Book Successfully Deleted !!!");
				setBookInputFieldNull();				
			}
			
		} else if(event.getSource() == searchRecordBtn)
		{
			if(validateSearchInput(id) == false)
			{
				JOptionPane.showMessageDialog(null,"Enter Book ID in Input Field!!!");
			} else {
				book = bookService.searchBook(Integer.parseInt(id));
				if(book != null)
				{
					setBookInputField(book);
				} else {
					setBookInputFieldNull();
					JOptionPane.showMessageDialog(null, "Book Not Found!!!!!");
				}
			}			
		} else if(event.getSource() == clearBtn)
		{
			setBookInputFieldNull();
		}
		else if(event.getSource() == loginBtn)
		{
			String username = userNameTextField.getText();
			String password = passwordTextField.getText();
			if(validateLogin(username,password) == false)
			{
				JOptionPane.showMessageDialog(null, "Incorrect Username or Password!!!");
			} else {
				JOptionPane.showMessageDialog(null, "Login Succesfull!!!");
				loginPanel.setVisible(false);
				interfaceContainerPanel.setVisible(true);
			}
			
		}
	}
}
