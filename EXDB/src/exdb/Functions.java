/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdb;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
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
public class Functions {
    
    PreparedStatement Pre=null;
    ResultSet Res=null;
    Node temp=null;
    
    double SumScore=0;
  
public Node sum(String x,String y,String T,Connection C){
      ArrayList <Integer> Score=new ArrayList <Integer>();
      
    SumScore=0;
     
        try{
      
   String query="select "+x+" ,sum("+y+")from "+T+" group by "+x+" ";
       JDBCCategoryDataset D1=new JDBCCategoryDataset(C,query);
        
     Pre=C.prepareStatement(query);
          
    Res=Pre.executeQuery();
  double v =Res.getInt("sum("+y+")");
     
  while(Res.next()){
     if(v<Res.getInt("sum("+y+")")){
     v=Res.getInt("sum("+y+")");}
       
     Score.add(Res.getInt("sum("+y+")"));
    
    }
   
 // for(int i =0;i<Score.size();i++){
       
  //   System.out.println(Score.get(i));}
      //System.out.println("//////////////////");
          //  System.out.println("HGX"+v); 
   
     for(int i =0;i<Score.size()-1;i++){
       
      
  SumScore+=Math.abs(v/Score.get(i)-v/Score.get(i+1));}
            ///System.out.println(SumScore);
            
           
            
     
      
       JFreeChart CH=ChartFactory.createBarChart("SUM ", ""+x+"", " "+y+"", D1, PlotOrientation.VERTICAL, false, true, false);
        temp=new Node (CH,SumScore);
       
        
    }catch(Exception e ){
     JOptionPane.showConfirmDialog(null, e);
        
    }  finally{
          try {
             Pre.close();
             Res.close();
          } catch (SQLException ex) {
              
          }}
     return temp; }

public Node Max(String x,String y,String T,Connection C){
 ArrayList <Integer> Score=new ArrayList <Integer>();

    SumScore=0;
     
        try{
      
   String query="select "+x+" ,Max("+y+")from "+T+" group by "+x+" ";
       JDBCCategoryDataset D1=new JDBCCategoryDataset(C,query);
        
     Pre=C.prepareStatement(query);
          
    Res=Pre.executeQuery();
       double v =Res.getInt("Max("+y+")");
  while(Res.next()){
       if(v<Res.getInt("Max("+y+")")){
      v=Res.getInt("Max("+y+")");}
     Score.add(Res.getInt("Max("+y+")"));
    
    }
  
    
  
     for(int i =0;i<Score.size()-1;i++){
       
    
  SumScore+=Math.abs(v/Score.get(i)-v/Score.get(i+1));}
          
            
         //  System.out.println(SumScore);
            
     
      
       JFreeChart CH=ChartFactory.createBarChart("Max ", ""+x+"", " "+y+"", D1, PlotOrientation.VERTICAL, false, true, false);
        temp=new Node (CH,SumScore);
       
        
    }catch(Exception e ){
     JOptionPane.showConfirmDialog(null, e);
        
    }  finally{
          try {
             Pre.close();
             Res.close();
          } catch (SQLException ex) {
              
          }}
     return temp; }

public Node Count(String x,String y,String T,Connection C){
   ArrayList <Integer> Score=new ArrayList <Integer>();
  
    SumScore=0;
     
        try{
      
   String query="select "+x+" ,Count("+y+")from "+T+" group by "+x+" ";
       JDBCCategoryDataset D1=new JDBCCategoryDataset(C,query);
        
     Pre=C.prepareStatement(query);
          
    Res=Pre.executeQuery();
      double v =Res.getInt("Count("+y+")");
  while(Res.next()){
       if(v<Res.getInt("Count("+y+")")){
      v=Res.getInt("Count("+y+")");}
     Score.add(Res.getInt("Count("+y+")"));
    
    }
    
    
     for(int i =0;i<Score.size()-1;i++){
       
        
  SumScore+=Math.abs(v/Score.get(i)-v/Score.get(i+1));}
           
            
         //  System.out.println(SumScore);
            
     
      
       JFreeChart CH=ChartFactory.createBarChart("COUNT ", ""+x+"", " "+y+"", D1, PlotOrientation.VERTICAL, false, true, false);
        temp=new Node (CH,SumScore);
       
        
    }catch(Exception e ){
     JOptionPane.showConfirmDialog(null, e);
        
    }  finally{
          try {
             Pre.close();
             Res.close();
          } catch (SQLException ex) {
              
          }}
     return temp;
}

public Node Avg(String x,String y,String T,Connection C){
   
    SumScore=0;
     
    ArrayList <Integer> Score=new ArrayList <Integer>();
        try{
      
   String query="select "+x+" ,Avg("+y+")from "+T+" group by "+x+" ";
       JDBCCategoryDataset D1=new JDBCCategoryDataset(C,query);
        
     Pre=C.prepareStatement(query);
          
    Res=Pre.executeQuery();
      double v =Res.getInt("Avg("+y+")");
  while(Res.next()){
       if(v<Res.getInt("Avg("+y+")")){
      v=Res.getInt("Avg("+y+")");}
     Score.add(Res.getInt("Avg("+y+")"));
    
    }
 
     for(int i =0;i<Score.size()-1;i++){
       
       
  SumScore+=Math.abs(v/Score.get(i)-v/Score.get(i+1));}
          
            
           
        //    System.out.println(SumScore);
     
      
       JFreeChart CH=ChartFactory.createBarChart("AVG ", ""+x+"", " "+y+"", D1, PlotOrientation.VERTICAL, false, true, false);
        temp=new Node (CH,SumScore);
       
        
    }catch(Exception e ){
     JOptionPane.showConfirmDialog(null, e);
        
    }  finally{
          try {
             Pre.close();
             Res.close();
          } catch (SQLException ex) {
              
          }}
     return temp;
}

public Node Min(String x,String y,String T,Connection C){
    
    SumScore=0;
     
      ArrayList <Integer> Score=new ArrayList <Integer>();
        try{
      
   String query="select "+x+" ,Min("+y+")from "+T+" group by "+x+" ";
       JDBCCategoryDataset D1=new JDBCCategoryDataset( C,query);
        
     Pre=C.prepareStatement(query);
          
    Res=Pre.executeQuery();
      double v =Res.getInt("Min("+y+")");
  while(Res.next()){
       if(v<Res.getInt("Min("+y+")")){
      v=Res.getInt("Min("+y+")");}
     Score.add(Res.getInt("Min("+y+")"));
    
    }
   
    
     for(int i =0;i<Score.size()-1;i++){
      
  SumScore+=Math.abs(v/Score.get(i)-v/Score.get(i+1));}
       
            
          // System.out.println(SumScore);
          //  System.out.println("//////kugcdf");
     
      
       JFreeChart CH=ChartFactory.createBarChart("Min ", ""+x+"", " "+y+"", D1, PlotOrientation.VERTICAL, false, true, false);
        temp=new Node (CH,SumScore);
       
        
    }catch(Exception e ){
     JOptionPane.showConfirmDialog(null, e);
        
    }  finally{
          try {
             Pre.close();
             Res.close();
          } catch (SQLException ex) {
              
          }}
     return temp;
} 

public void DisV(Node V){
      try{
           BarRenderer RR=null;
      CategoryPlot C =V.Visualization.getCategoryPlot();
     C.setRangeGridlinePaint(Color.BLACK);
           
      ChartFrame F=new ChartFrame("Bar Chart", V.Visualization);
      F.setVisible(true);
      F.setSize(450, 350);
       
        
    }catch(Exception e ){
     JOptionPane.showConfirmDialog(null, e);
        
 
              
           }
      }

public void Scor(String x,String y,String T,ArrayList <Node>L,Connection C){
     String [] Array={"sum","Max","Avg","Min","Count"}; 
     for(int i=0;i<Array.length;i++){
            if(Array[i]=="sum"){
            L.add(sum(x, y, T,C));
            }
            
        else
      
            if(Array[i]=="Count"){
             L.add(Count(x, y, T,C));
            
        }
            else
            if(Array[i]=="Avg"){
             L.add(Avg(x, y, T,C));
            
        }
            else
            if(Array[i]=="Min"){
             L.add(Min(x, y, T,C));
            
        }
            else
            if(Array[i]=="Max"){
             L.add(Max(x, y, T,C));
            
        }
}
}    

 public ArrayList<Node> sort(ArrayList<Node> V){
   
    //LinkList Temp =new LinkList();
   // Node Functions =T.head;
    Node S =null;
    //int i=0;
    //int j=1;
  //  Node Max;
     //   System.out.println("mm");
//    while (i<T.size){
int Max=0;
        for(int  i =0;i<V.size()-1;i++){
      // Functions =T.head;
        Max =i;
       // System.out.println("mm");
    //while (i<T.size){
    for(int j=i+1;j<V.size();j++){
        if(V.get(j).Score>V.get(Max).Score){
         //   System.out.println("mm");
        Max =j;}}
        //S =new Node (Functions.Visualization,Functions.Score);}
       // i++;
       // System.out.println("mm");
     // Functions=Functions.next;
            //System.out.println("jf");
    S=V.get(Max);
    V.set(Max, V.get(i));
    V.set(i, S);
    // System.out.println("pmm");
  //  T.size--;
  //  j++ ;
      
           // Deleate(S);
  //  Temp.ADD(S);
   
    }
   
        return V;}
}
    

