/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdb;

import org.jfree.chart.JFreeChart;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author Win10
 */
public class Node {
    JFreeChart Visualization;
    double Score=0;
    Node next;

    public Node(JFreeChart Visualization,double Score) {
        this.Visualization = Visualization;
         this.Score = Score;
    }
    
    
    
}
