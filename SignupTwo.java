import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;



public class SignupTwo extends JFrame implements ActionListener {

    long random;
    JTextField nametext, fnametext, emailtext, addresstext, citytext, statetext, pincodetext;
    JButton next;
    JRadioButton sno, syes, eyes, eno, other;
    JComboBox religion, category, occupation, education, income;
    String formno;

    SignupTwo(String formno){
        this.formno = formno;

        setLayout(null);//setbounds only works when setLayout is null

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        JLabel additionalDetails = new JLabel("Page 1: Personal Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion: ");
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);


        String[] valReligion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        add(religion);

        String[] valCategory = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        add(category);

//        nametext = new JTextField();
//        nametext.setFont(new Font("Raleway", Font.BOLD,20));
//        nametext.setBounds(300,140,400,30);
//        add(nametext);

        JLabel fname = new JLabel("Category: ");
        fname.setFont(new Font("Raleway", Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

//        fnametext = new JTextField();
//        fnametext.setFont(new Font("Raleway", Font.BOLD,20));
//        fnametext.setBounds(300,190,400,30);
//        add(fnametext);

        JLabel dob = new JLabel("Income: ");
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String[] incomeCategory = {"null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        add(income);

        JLabel gender = new JLabel("Educational: ");
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);


        JLabel email = new JLabel("Qualification: ");
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);

        String[] educationValues = {"Non-Graduate", "Graduate", "Post Graduate", "Doctorate", "others"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        add(education);


        JLabel marital = new JLabel("Occupation: ");
        marital.setFont(new Font("Raleway", Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        String[] occupationValues = {"Salaried", "Self-Employed", "Businessman", "Student", "Retired", "others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        add(occupation);




        JLabel pan = new JLabel("PAN no: ");
        pan.setFont(new Font("Raleway", Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);

        addresstext = new JTextField();
        addresstext.setFont(new Font("Raleway", Font.BOLD,20));
        addresstext.setBounds(300,440,400,30);
        add(addresstext);

        JLabel city = new JLabel("Aadhar number: ");
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        citytext = new JTextField();
        citytext.setFont(new Font("Raleway", Font.BOLD,20));
        citytext.setBounds(300,490,400,30);
        add(citytext);

        JLabel state = new JLabel("Senior Citizen: ");
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);


        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(sno);
        maritalgroup.add(syes);
        //maritalgroup.add(other);

//        statetext = new JTextField();
//        statetext.setFont(new Font("Raleway", Font.BOLD,20));
//        statetext.setBounds(300,540,400,30);
//        add(statetext);

        JLabel pincode = new JLabel("Existing account: ");
        pincode.setFont(new Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup maritalgroup2 = new ButtonGroup();
        maritalgroup2.add(eno);
        maritalgroup2.add(eyes);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        //next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        //String formno = String.valueOf(random);
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }
        else if(sno.isSelected()){
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        }
        else if(eno.isSelected()){
            existingaccount = "No";
        }

        String span = addresstext.getText();
        String saadhar = citytext.getText();

        try{
            Conn c = new Conn();
            String query = "Insert into signuptwo values('"+formno+"','"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query);

            //signupthree object
            setVisible(false);
            new SignupThree(formno).setVisible(true);

        }catch(Exception e1){
            System.out.println(e1);
        }


    }


    public static void main(String[] args) {
        new SignupTwo(" ");
    }
}


