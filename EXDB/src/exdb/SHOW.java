/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.UIManager.getInt;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author Win10
 */
public class SHOW extends javax.swing.JFrame {
 
    Connection Con=null;
    int v =0;
PreparedStatement Pre=null;
ResultSet Res=null;
  
    public SHOW() {
        initComponents();
        this.setLocationRelativeTo(null);
         Con=ConnectionDB.con();
         this.SHOWTABLE();
    }

    public void SHOWTABLE(){
    try{
        String query="select* from Store ";
        Pre=Con.prepareStatement(query);
        Res=Pre.executeQuery();
        
        jTable1.setModel(DbUtils.resultSetToTableModel(Res));
       
     ///   for(int i=1;i<jTable1.getColumnCount();i++){
           // int v=0;
           // if(Res.getBoolean(1)){
             //   System.out.println(jTable1.getColumnCount());
               
             //   break;
            
            
        
       // Res=Pre.executeQuery();
      // System.out.println(Res.getInt(ICONIFIED));
        jTable1.setAutoCreateRowSorter(true);
        jTable1.setShowGrid(true);
        
        
    }catch(Exception e ){
     JOptionPane.showConfirmDialog(null, e);
        
    }finally{
          
           try {
               Pre.close();
               Res.close();
           } catch (SQLException ex) {
              
           }
    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        F = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        LL11 = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        Key = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        S = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id_Transaction");

        jLabel3.setText("Store");

        jLabel2.setText("amount_Transaction");

        jLabel4.setText("year");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ubdate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cler");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(51, 51, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton7.setText("BarChart");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter Number Visualization ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LL11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Key, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton7))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(532, 532, 532))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LL11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(jButton1))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel7.setText("Serch");

        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });
        S.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       try{
           int row =jTable1.getSelectedRow();
            String T=(jTable1.getModel().getValueAt(row, 0).toString());
            String query="select * from Store where id_Transaction='"+T+"'";
        Pre=Con.prepareStatement(query);
        Res=Pre.executeQuery();
       if(Res.next()){
        String L1 =Res.getString("id_Transaction");
        id.setText(L1);
          String L2 =Res.getString("amount_Transaction");
        F.setText(L2);
          String L3 =Res.getString("Store");
        LL11.setText(L3);
          String L4 =Res.getString("year");
        A.setText(L4);
          
     
           
       }
        
    }catch(Exception e ){
     JOptionPane.showConfirmDialog(null, e);
        
    }finally{
          
           try {
               Pre.close();
               Res.close();
           } catch (SQLException ex) {
              
           }}
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
        String query="insert into Store(id_Transaction ,amount_Transaction,Store,year) values(?,?,?,?)";
        Pre=Con.prepareStatement(query);
        Pre.setString(1, id.getText());
        Pre.setString(2, F.getText());
        Pre.setString(3, LL11.getText());
        Pre.setString(4, A.getText());
        Pre.execute();
        
        
        
    }catch(Exception e ){
    JOptionPane.showConfirmDialog(null, e);
            
        
    }finally{
          
           try {
               Pre.close();
              
           } catch (SQLException ex) {
              
           } 
           this.SHOWTABLE();
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{
        String query="delete from  Store where id_Transaction =?";
        Pre=Con.prepareStatement(query);
        Pre.setString(1, id.getText());
        
        
       
        
        Pre.execute();
         
        
    }catch(Exception e ){
    JOptionPane.showConfirmDialog(null, e);
            
        
    }finally{
          
           try {
               Pre.close();
              
           } catch (SQLException ex) {
              
           } this.SHOWTABLE();}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
        String query="update Store set  id_Transaction =?,amount_Transaction =?,Store =?,year =? where id_Transaction='"+id.getText()+"'";
        
        Pre=Con.prepareStatement(query);
        Pre.setString(1, id.getText());
        Pre.setString(2, F.getText());
        Pre.setString(3, LL11.getText());
        Pre.setString(4, A.getText());
        
        
        Pre.execute();
         
        
    }catch(Exception e ){
    JOptionPane.showConfirmDialog(null, e);
            
        
    }finally{
          
           try {
               Pre.close();
              
           } catch (SQLException ex) {
              
           } this.SHOWTABLE();}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SKeyReleased
         try{
        String query="select* from Store where id_Transaction =?  or Store =?";
        Pre=Con.prepareStatement(query);
        Pre.setString(1, S.getText());
        Pre.setString(2, S.getText());
        Res=Pre.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(Res));
        jTable1.setAutoCreateRowSorter(true);
        
        
    }catch(Exception e ){
     JOptionPane.showConfirmDialog(null, e);
        
    }finally{
          
           try {
               Pre.close();
               Res.close();
           } catch (SQLException ex) {
              
           }}
    }//GEN-LAST:event_SKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      MessageFormat H =new MessageFormat("Employ");
      MessageFormat F =new MessageFormat("Page - {0}");
      try{
          jTable1.print(JTable.PrintMode.FIT_WIDTH,H,F);
          
       
        
        
    }catch(Exception e ){
     JOptionPane.showConfirmDialog(null, e);
        
    }finally{
          
           try {
               Pre.close();
               Res.close();
           } catch (SQLException ex) {
              
           }}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        id.setText("");
        F.setText("");
        LL11.setText("");
        A.setText("");
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        String NumberVisualization  =Key.getText();
        int NumberVisulization=Integer.parseInt(NumberVisualization);
        //System.out.println(pp);
        
        Functions FUN =new Functions();
        
         ArrayList <Node>ScorAndVisulization =new ArrayList<Node>();
       FUN.Scor("Store", "amount_Transaction", "Store", ScorAndVisulization,Con);
       FUN.Scor("year", "amount_Transaction", "Store", ScorAndVisulization,Con);
      // n.size()
      // System.out.println(ScorAndVisulization.size());
      //L.sort(L);
     ScorAndVisulization=FUN.sort(ScorAndVisulization);
     //L.Deleate(L.head.next);
      //  System.out.println(ScorAndVisulization.get(0).Score);
     
       // System.out.println(L.head.Sco);
       // System.out.println(L.head.next.Sco);
       // System.out.println(L.head.next.next.Sco);
        for(int i =0;i<=ScorAndVisulization.size()-1;i++){
            System.out.println(ScorAndVisulization.get(i).Score);
        }
      
        int i=0;
       // Node N =n.get();
     //   System.out.println( L.size);
     if(NumberVisulization>ScorAndVisulization.size()){
         JOptionPane.showMessageDialog(null, "Number Visualization larg ");
         return ;
     }
       while (i<NumberVisulization){
           FUN.DisV(ScorAndVisulization.get(i));
           i++;
         //  N=N.next;
           
       }

     
       // int V1=0;
    //int Count=0;
    //int V2 =0;
       // try{
            //String T =KK.getText();
           
      
      
   //String query="select year ,sum("+T+")from Store  group by year ";
       
       //JDBCCategoryDataset DD=new JDBCCategoryDataset(ConnectionD.con(),query);   
     // Pre=Con.prepareStatement(query);
     // Res=Pre.executeQuery();
     
     //while(Res.next()){
       // System.out.println(Res.getInt("sum("+TT+")"));
    //  LL11q.add(Res.getInt("sum("+T+")"));
    
   // }
     
     //for(int i =0;i<LL11q.size()-1;i++){
       
      //   Count=i+1;
    // V2+=Math.abs(LL11q.get(i)-LL11q.get(Count));}
   //         System.out.println(v);
          //  Res=Pre.executeQuery();
          // jTable1.setModel(DbUtils.resultSetToTableModel(Res));
          //  String query1="select Store ,sum("+T+")from Store  group by Store ";
          //   Pre=Con.prepareStatement(query1);
    //  Res=Pre.executeQuery();
     
   
    // while(Res.next()){
       // System.out.println(Res.getInt("sum("+TT+")"));
     // SSS.add(Res.getInt("sum("+T+")"));
    
   // }
     
    // for(int i =0;i<SSS.size()-1;i++){
     //  
      //   Count=i+1;
     //V1+=Math.abs(SSS.get(i)-SSS.get(Count));}
    // if(V1>V2){
      //    Pre=Con.prepareStatement(query1);
     // Res=Pre.executeQuery();
        
      //   DefaultCategoryDataset D =new DefaultCategoryDataset();
       //   for(int i =0;i<SSS.size();i++){
          //     if(Res.next()){
       
       // D.setValue(SSS.get(i), " ", Res.getString("Store"));
    //}}
     
      // JFreeChart CH=ChartFactory.createBarChart("BarChart ", "Store", "amount_Transaction ", D, PlotOrientation.VERTICAL, false, true, false);
     //  BarRenderer RR=null;
    //  CategoryPlot Con =CH.getCategoryPlot();
     //C.setRangeGridlinePaint(Color.BLACK);
     // ChartFrame F=new ChartFrame("Bar Chart",CH);
     // F.setVisible(true);
    //  F.setSize(450, 350);
   //  }
   // else{
   // Pre=Con.prepareStatement(query);
    //  Res=Pre.executeQuery();
       //  DefaultCategoryDataset D =new DefaultCategoryDataset();
       //    for(int i =0;i<LL11q.size();i++){
           // /   if(Res.next()){
       //
      //  D.setValue(LL11q.get(i), " ", Res.getString("year"));
   // }}
     
   //    JFreeChart CH=ChartFactory.createBarChart(" BarChart", "year", "amount_Transaction", D, PlotOrientation.VERTICAL, false, true, false);
     //  BarRenderer RR=null;
     // CategoryPlot Con =CH.getCategoryPlot();
     //C.setRangeGridlinePaint(Color.BLACK);
   //   ChartFrame F=new ChartFrame("Bar Chart",CH);
     // F.setVisible(true);
    //  F.setSize(450, 350);
        
            
   //  }
        
   // }catch(Exception e ){
   //  JOptionPane.showConfirmDialog(null, e);
        
   // }finally{
          
     //      try {
      //         Pre.close();
      //         Res.close();
         //  } catch (SQLException ex) {
              
           
    }//GEN-LAST:event_jButton7ActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SHOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField F;
    private javax.swing.JTextField Key;
    private javax.swing.JTextField LL11;
    private javax.swing.JTextField S;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   
}
