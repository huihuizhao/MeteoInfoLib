/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meteoinfo.chart.plot;

import java.awt.Color;
import org.meteoinfo.legend.ColorBreak;
import org.meteoinfo.legend.PointBreak;
import org.meteoinfo.legend.PolygonBreak;
import org.meteoinfo.legend.PolylineBreak;

/**
 *
 * @author wyq
 */
public class SeriesLegend {
    // <editor-fold desc="Variables">
    private ChartPlotMethod plotMethod;
    private ColorBreak[] legendBreaks;
    private Color errorColor;
    // </editor-fold>
    // <editor-fold desc="Constructor">
    /**
     * Constructor
     */
    public SeriesLegend(){
        this.plotMethod = ChartPlotMethod.LINE;
        this.legendBreaks = new ColorBreak[1];
        this.legendBreaks[0] = new PolylineBreak();
        this.errorColor = Color.black;
    }
    
    /**
     * Constructor
     * @param cb ColorBreak
     */
    public SeriesLegend(ColorBreak cb){
        this();
        this.legendBreaks = new ColorBreak[1];
        this.legendBreaks[0] = cb;
    }
    
    /**
     * Constructor
     * @param n Break number
     */
    public SeriesLegend(int n){
        this();
        this.legendBreaks = new ColorBreak[n];        
    }
    // </editor-fold>
    // <editor-fold desc="Get Set Methods">
    /**
     * Get plot method
     * @return Plot method
     */
    public ChartPlotMethod getPlotMethod(){
        return this.plotMethod;
    }
    
    /**
     * Set plot method
     * @param value Plot method
     */
    public void setPlotMethod(ChartPlotMethod value){
        this.plotMethod = value;
    }
    
    /**
     * Get if the legend is PointBreak
     * @return Boolean
     */
    public boolean isPoint(){
        return this.legendBreaks[0] instanceof PointBreak;
    }
    
    /**
     * Get if the legend is PolylineBreak
     * @return Boolean
     */
    public boolean isLine(){
        return this.legendBreaks[0] instanceof PolylineBreak;
    }
    
    /**
     * Get if the legend is PolygonBreak
     * @return Boolean
     */
    public boolean isPolygon(){
        return this.legendBreaks[0] instanceof PolygonBreak;
    }
    
    /**
     * Get if if mutiple legend breaks
     * @return Boolean
     */
    public boolean isMutiple(){
        return this.legendBreaks.length > 1;
    }
    
    /**
     * Get a legend break
     * @return Legend break
     */
    public ColorBreak getLegendBreak(){
        return this.legendBreaks[0];
    }
    
    /**
     * Set legend break
     * @param cb Legend break
     */
    public void setLegendBreak(ColorBreak cb){
        this.legendBreaks = new ColorBreak[1];
        this.legendBreaks[0] = cb;
    }
    
    /**
     * Get a legend break
     * @param idx Index
     * @return Legend break
     */
    public ColorBreak getLegendBreak(int idx){
        return this.legendBreaks[idx];
    }
    
    /**
     * Set legend break
     * @param idx Index
     * @param cb Legend break
     */
    public void setLegendBreak(int idx, ColorBreak cb){
        this.legendBreaks[idx] = cb;
    }
    
    /**
     * Get error color
     * @return Error color
     */
    public Color getErrorColor(){
        return this.errorColor;
    }
    
    /**
     * Set error color
     * @param value Error color
     */
    public void setErrorColor(Color value){
        this.errorColor = value;
    }
    // </editor-fold>
    // <editor-fold desc="Methods">
    // </editor-fold>
}
