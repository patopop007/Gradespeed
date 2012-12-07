package gradespeed;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;
import static java.lang.System.*;
import java.util.*;
import org.jsoup.*;
import org.jsoup.Connection.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import javax.swing.*;

public class GUI extends javax.swing.JFrame {
    private static String html;
    private static String classhtml;
    private static int cycle;
    private static GUI myGUI;
    private static String url;
    private static ArrayList<JLabel> labels = new ArrayList<JLabel>();
    //private static Map<String, String> cookies;

    private static String username;// = "plankenau";
    private static String password;// =                                                                                            "Cocacola1";


    /** Creates new form GUI */
    public GUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cycleBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        p0 = new javax.swing.JLabel();
        class0 = new javax.swing.JLabel();
        grade0 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        class1 = new javax.swing.JLabel();
        grade1 = new javax.swing.JLabel();
        class2 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        grade2 = new javax.swing.JLabel();
        class3 = new javax.swing.JLabel();
        grade3 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        class4 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        grade4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        class5 = new javax.swing.JLabel();
        grade5 = new javax.swing.JLabel();
        class6 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        grade6 = new javax.swing.JLabel();
        grade7 = new javax.swing.JLabel();
        class7 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infobox = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jFile = new javax.swing.JMenu();
        jAbout = new javax.swing.JMenuItem();
        jExit = new javax.swing.JMenuItem();
        jLogin = new javax.swing.JMenu();
        jLogIn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GradeSpeed");

        cycleBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cycle 1", "Cycle 2", "Cycle 3", "Cycle 4", "Cycle 5", "Cycle 6" }));
        cycleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cycleBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Cycle");

        p0.setText("Period 0");

        class0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        class0.setText("...");

        grade0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        grade0.setText("...");
        grade0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade0MouseClicked(evt);
            }
        });

        p1.setText("Period 1");

        class1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        class1.setText("...");

        grade1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        grade1.setText("...");
        grade1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade1MouseClicked(evt);
            }
        });

        class2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        class2.setText("...");

        p2.setText("Period 2");

        grade2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        grade2.setText("...");
        grade2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade2MouseClicked(evt);
            }
        });

        class3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        class3.setText("...");

        grade3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        grade3.setText("...");
        grade3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade3MouseClicked(evt);
            }
        });

        p3.setText("Period 3");

        class4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        class4.setText("...");

        p4.setText("Period 4");

        grade4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        grade4.setText("...");
        grade4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade4MouseClicked(evt);
            }
        });

        p5.setText("Period 5");

        class5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        class5.setText("...");

        grade5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        grade5.setText("...");
        grade5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade5MouseClicked(evt);
            }
        });

        class6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        class6.setText("...");

        p6.setText("Period 6");

        grade6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        grade6.setText("...");
        grade6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade6MouseClicked(evt);
            }
        });

        grade7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        grade7.setText("...");
        grade7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade7MouseClicked(evt);
            }
        });

        class7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        class7.setText("...");

        p7.setText("Period 7");

        status.setText("statstatusstatusstatus");

        infobox.setBackground(new java.awt.Color(212, 208, 200));
        infobox.setColumns(20);
        infobox.setEditable(false);
        infobox.setRows(5);
        jScrollPane1.setViewportView(infobox);

        jFile.setText("File");

        jAbout.setText("About");
        jAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAboutActionPerformed(evt);
            }
        });
        jFile.add(jAbout);

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jFile.add(jExit);

        jMenuBar1.add(jFile);

        jLogin.setText("Account");

        jLogIn.setText("Log In");
        jLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogInActionPerformed(evt);
            }
        });
        jLogin.add(jLogIn);

        jMenuBar1.add(jLogin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cycleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(status))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p5)
                                .addGap(18, 18, 18)
                                .addComponent(class5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grade5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p6)
                                .addGap(18, 18, 18)
                                .addComponent(class6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grade6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p7)
                                .addGap(18, 18, 18)
                                .addComponent(class7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grade7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p0)
                                .addGap(18, 18, 18)
                                .addComponent(class0, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grade0))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p1)
                                .addGap(18, 18, 18)
                                .addComponent(class1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grade1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p2)
                                .addGap(18, 18, 18)
                                .addComponent(class2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grade2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p3)
                                .addGap(18, 18, 18)
                                .addComponent(class3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grade3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p4)
                                .addGap(18, 18, 18)
                                .addComponent(class4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grade4)))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cycleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p0)
                            .addComponent(grade0)
                            .addComponent(class0, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p1)
                            .addComponent(grade1)
                            .addComponent(class1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p2)
                            .addComponent(grade2)
                            .addComponent(class2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p3)
                            .addComponent(grade3)
                            .addComponent(class3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p4)
                            .addComponent(grade4)
                            .addComponent(class4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p5)
                            .addComponent(grade5)
                            .addComponent(class5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p6)
                            .addComponent(grade6)
                            .addComponent(class6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p7)
                            .addComponent(grade7)
                            .addComponent(class7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cycleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cycleBoxActionPerformed
        load();
    }//GEN-LAST:event_cycleBoxActionPerformed

    private void grade0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade0MouseClicked
        display(0);
    }//GEN-LAST:event_grade0MouseClicked

    private void grade1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade1MouseClicked
        display(1);
    }//GEN-LAST:event_grade1MouseClicked

    private void grade2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade2MouseClicked
        display(2);
    }//GEN-LAST:event_grade2MouseClicked

    private void grade3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade3MouseClicked
        display(3);
    }//GEN-LAST:event_grade3MouseClicked

    private void grade4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade4MouseClicked
        display(4);
    }//GEN-LAST:event_grade4MouseClicked

    private void grade5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade5MouseClicked
        display(5);
    }//GEN-LAST:event_grade5MouseClicked

    private void grade6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade6MouseClicked
        display(6);
    }//GEN-LAST:event_grade6MouseClicked

    private void grade7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade7MouseClicked
        display(7);
    }//GEN-LAST:event_grade7MouseClicked

    private void jLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogInActionPerformed
        getUser();
        load();
    }//GEN-LAST:event_jLogInActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

    private void jAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAboutActionPerformed
        JOptionPane.showMessageDialog(myGUI, "Created By: Pato Lankenau");
    }//GEN-LAST:event_jAboutActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                myGUI = new GUI();
                myGUI.setSize(300, 300);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

                // Determine the new location of the window
                int w = myGUI.getSize().width;
                int h = myGUI.getSize().height;
                int x = (dim.width-w)/2;
                int y = (dim.height-h)/2;

                // Move the window
                myGUI.setLocation(x, y);
                myGUI.setVisible(true);
                getUser();
                load();
            }
        });
    }
    public static void getUser(){
        JTextField jusername = new JTextField();
        JPasswordField jpassword = new JPasswordField();
        final JComponent[] inputs = new JComponent[] {
                        new JLabel("Username:"),
                        jusername,
                        new JLabel("Password:"),
                        jpassword
        };
        JOptionPane.showMessageDialog(myGUI, inputs, "Log In", JOptionPane.PLAIN_MESSAGE);
        username = jusername.getText();
        password = jpassword.getText();
    }
    public static void load(){
        cycle = cycleBox.getSelectedIndex()+1;
        new Thread(){
            public void run(){
                try{
                    html = getHTML();
                }catch (Exception e){err.println(e);}
                fill(html, cycle);
            }
        }.start();
    }    
    public static void set(int i, String course, int grade){
        //out.println("i: "+i+" c: "+course+" g"+grade);
        switch (i){
            case 0:
                class0.setText(course);
                grade0.setText(grade+"");
                break;
            case 1:
                class1.setText(course);
                grade1.setText(grade+"");
                break;
            case 2:
                class2.setText(course);
                grade2.setText(grade+"");
                break;
            case 3:
                class3.setText(course);
                grade3.setText(grade+"");
                break;
            case 4:
                class4.setText(course);
                grade4.setText(grade+"");
                break;
            case 5:
                class5.setText(course);
                grade5.setText(grade+"");
                break;
            case 6:
                class6.setText(course);
                grade6.setText(grade+"");
                break;
            case 7:
                class7.setText(course);
                grade7.setText(grade+"");
                break;
        }
    }
    public static String getHTML() throws Exception{
        //Log in
        long start = System.currentTimeMillis();

        status.setText("Logging in...");
        Response res = Jsoup
            .connect("https://gradespeed.kleinisd.net/pc/Default.aspx")
            .data("txtUserName", username)
            .data("txtPassWord", password)
            .method(Method.POST)
            .execute();

        Document doc = res.parse();
        //Keep logged in
        Map<String, String> cookies = res.cookies();
        //status.setText("Done! ("+((System.currentTimeMillis()-start)/1000F)+" secs)"); //;

        //start = System.currentTimeMillis();

        

        Document doc2 = Jsoup
            .connect("https://gradespeed.kleinisd.net/pc/ParentStudentGrades.aspx")
            .cookies(cookies)
            .get();

        String codehtml = doc2.body().html();

        //status.setText("Fetched ("+((System.currentTimeMillis()-start)/1000F)+ " secs)");

        //start = System.currentTimeMillis();

        String code = codehtml.split("var")[1];
        code = code.split("</script>")[0];

        code = code.replaceAll("[ ]", "");
        String var = code.substring(0,code.indexOf(";")); //might have to -1
        code = code.replaceAll(var+";","");
        code = code.replaceAll(var+"='';","");
        code = code.replaceAll(var+"="+var+"+", "");
        code = code.replace("';", "");
        code = code.replace("+'", "");
        //code = code.replaceAll(var,"VAR");
        code = code.replace("document.write(decodeString("+var+"));", "");
        code = code.replace("-->", "");
        code = code.replaceAll("\\n","");
        code = code.replaceAll("\\r","");

        String decoded = decode(code);
        status.setText("Done! ("+((System.currentTimeMillis()-start)/1000F)+ " secs)");
        return decoded;
    }
    public static void display(int course){
        Document doc = Jsoup.parse(html);
        Elements links = doc.select("[href]");
        links = links.select("[title*=Period "+course+"]");
        links = links.select("[title*=Cycle "+cycle+"]");
        Element link = links.get(0);
        myGUI.setSize(700, 300);
        url = links.get(0).attr("href");
        new Thread(){
            public void run(){
                try{
                    classhtml = getClassHTML(url);
                    fillClass(classhtml);
                }catch (Exception e){err.println("ERROR: "+e);}
                
            }
        }.start();
    }
    public static String getClassHTML(String url) throws Exception{
        //Log in
        long start = System.currentTimeMillis();

        status.setText("Logging in...");
        Response res = Jsoup
            .connect("https://gradespeed.kleinisd.net/pc/Default.aspx")
            .data("txtUserName", username)
            .data("txtPassWord", password)
            .method(Method.POST)
            .execute();

        Document doc = res.parse();
        status.setText("Logged in ("+((System.currentTimeMillis()-start)/1000F)+" secs)"); //;

        start = System.currentTimeMillis();

        //Keep logged in
        Map<String, String> cookies = res.cookies();

        Document doc2 = Jsoup
            .connect("https://gradespeed.kleinisd.net/pc/ParentStudentGrades.aspx"+url)
            .cookies(cookies)
            .get();

        String codehtml = doc2.body().html();

        //status.setText("Fetched ("+((System.currentTimeMillis()-start)/1000F)+ " secs)");

        start = System.currentTimeMillis();

        String code = decode(strip(codehtml,2));
        return code;
    }
    public static String strip(String html, int n){
        String code = html.split("var")[n];
        code = code.split("</script>")[0];

        code = code.replaceAll("[ ]", "");
        String var = code.substring(0,code.indexOf(";")); //might have to -1
        code = code.replaceAll(var+";","");
        code = code.replaceAll(var+"='';","");
        code = code.replaceAll(var+"="+var+"+", "");
        code = code.replace("';", "");
        code = code.replace("+'", "");

        code = code.replace("document.write(decodeString("+var+"));", "");
        code = code.replace("-->", "");
        code = code.replaceAll("\\n","");
        code = code.replaceAll("\\r","");

        return code;
    }
    public static void fill(String html, int cycle){
        Document doc = Jsoup.parse(html);
        Elements links = doc.select("[href]");
        links = links.select("[title*=Cycle "+cycle+"]");
        ArrayList<Grade> grades = new ArrayList<Grade>(); //what this kolaveri?
        int offset = grades.size()==8?0:1;
        for (int i=0;i<links.size();i++){
            Element cur = links.get(i);
            Grade g = new Grade(cur.attr("title"));
            set(i+offset, g.course, g.grade);
        }
        p0.setVisible(false);
        class0.setVisible(false);
        grade0.setVisible(false);
    }
    public static void fillClass(String htmlcode) throws Exception{
        ArrayList<String> assigments = new ArrayList<String>();
        ArrayList<String> grades = new ArrayList<String>();
        ArrayList<String> dates = new ArrayList<String>();

        Document doc = Jsoup.parse(htmlcode);
        Elements links1 = doc.select(".AssignmentName");
        Elements links2 = doc.select(".AssignmentGrade");
        Elements links3 = doc.select(".DateDue");
        
        for (Element a: links1)
            assigments.add(a.text());
        for (Element a: links2)
            grades.add(a.text());
        for (Element a: links3)
            dates.add(a.text());

        String display = "";
        for (int i=0;i<assigments.size();i++){
            if (assigments.get(i).equals("Assignment"))
                continue;
            display += format(grades.get(i),3);
            display += " - ";
            display += dates.get(i);
            display += " - ";
            display += assigments.get(i);//format(assigments.get(i),70);
            display += "\n";
        }
        infobox.setText(display);
    }
    public static String format(String line, int n){
        String ret = "";
        if (line.length()>=n)
            return line.substring(0,n);
        for (int i=0;i<(n-line.length());i++){
            ret+="  ";
        }
        ret+=line;
        return ret;
    }
    public static ArrayList<Grade> extrapolate(String html, int cycle){
        Document doc = Jsoup.parse(html);
        Elements links = doc.select("[href]");
        links = links.select("[title*=Cycle "+cycle+"]");
        ArrayList<Grade> grades = new ArrayList<Grade>(); //what this kolaveri?
        for (Element a: links){
            Grade grade = new Grade(a.attr("title"));
            grades.add(grade);
            System.out.println(grades);
        }
        return grades;
    }
    public static int getCycle(String html){
        Document doc = Jsoup.parse(html);
        Elements links = doc.select("[href]");
        links = links.select("[title*=Cycle]");
        ArrayList<Integer> cycles = new ArrayList<Integer>();
        for (Element e : links){
            String t = e.attr("title");
            cycles.add(Integer.parseInt(t.substring(t.indexOf("Cycle ")+6,t.indexOf(" Grade"))));
        }
        Collections.sort(cycles);
        return cycles.get(cycles.size()-1);
    }
    public static String decode(String input) {
        String keyStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
        String output = "";
        int chr1, chr2, chr3;
        int enc1, enc2, enc3, enc4;
        int i = 0;

        // remove all characters that are not A-Z, a-z, 0-9, +, /, or =
        input = input.replaceAll("/[^A-Za-z0-9\\+\\/\\=]/g", "");

        do {
            try{
            enc1 = keyStr.indexOf(input.charAt(i++));
            enc2 = keyStr.indexOf(input.charAt(i++));
            enc3 = keyStr.indexOf(input.charAt(i++));
            enc4 = keyStr.indexOf(input.charAt(i++));


            chr1 = (enc1 << 2) | (enc2 >> 4);
            chr2 = ((enc2 & 15) << 4) | (enc3 >> 2);
            chr3 = ((enc3 & 3) << 6) | enc4;


            output += (char)(chr1);

            if (enc3 != 64) {
                output += (char)(chr2);
            }
            if (enc4 != 64) {
                output += (char)(chr3);
            }

            }catch (Exception e){
                err.println("ERROR i:"+i+" \n "+e);
            }
        }while (i<input.length()-input.length()%4);
        return output;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel class0;
    private static javax.swing.JLabel class1;
    private static javax.swing.JLabel class2;
    private static javax.swing.JLabel class3;
    private static javax.swing.JLabel class4;
    private static javax.swing.JLabel class5;
    private static javax.swing.JLabel class6;
    private static javax.swing.JLabel class7;
    private static javax.swing.JComboBox cycleBox;
    private static javax.swing.JLabel grade0;
    private static javax.swing.JLabel grade1;
    private static javax.swing.JLabel grade2;
    private static javax.swing.JLabel grade3;
    private static javax.swing.JLabel grade4;
    private static javax.swing.JLabel grade5;
    private static javax.swing.JLabel grade6;
    private static javax.swing.JLabel grade7;
    private static javax.swing.JTextArea infobox;
    private javax.swing.JMenuItem jAbout;
    private javax.swing.JMenuItem jExit;
    private javax.swing.JMenu jFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jLogIn;
    private javax.swing.JMenu jLogin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel p0;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private static javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables

}