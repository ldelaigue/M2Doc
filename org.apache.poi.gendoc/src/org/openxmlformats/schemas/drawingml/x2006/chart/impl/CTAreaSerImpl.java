/*
 * XML Type:  CT_AreaSer
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_AreaSer(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTAreaSerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer
{
    
    public CTAreaSerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDX$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "idx");
    private static final javax.xml.namespace.QName ORDER$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "order");
    private static final javax.xml.namespace.QName TX$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "tx");
    private static final javax.xml.namespace.QName SPPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName PICTUREOPTIONS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pictureOptions");
    private static final javax.xml.namespace.QName DPT$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dPt");
    private static final javax.xml.namespace.QName DLBLS$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLbls");
    private static final javax.xml.namespace.QName TRENDLINE$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "trendline");
    private static final javax.xml.namespace.QName ERRBARS$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "errBars");
    private static final javax.xml.namespace.QName CAT$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "cat");
    private static final javax.xml.namespace.QName VAL$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "val");
    private static final javax.xml.namespace.QName EXTLST$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "idx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(IDX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "idx" element
     */
    public void setIdx(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt idx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(IDX$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(IDX$0);
            }
            target.set(idx);
        }
    }
    
    /**
     * Appends and returns a new empty "idx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(IDX$0);
            return target;
        }
    }
    
    /**
     * Gets the "order" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(ORDER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "order" element
     */
    public void setOrder(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(ORDER$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(ORDER$2);
            }
            target.set(order);
        }
    }
    
    /**
     * Appends and returns a new empty "order" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(ORDER$2);
            return target;
        }
    }
    
    /**
     * Gets the "tx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx getTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx)get_store().find_element_user(TX$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tx" element
     */
    public boolean isSetTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TX$4) != 0;
        }
    }
    
    /**
     * Sets the "tx" element
     */
    public void setTx(org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx tx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx)get_store().find_element_user(TX$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx)get_store().add_element_user(TX$4);
            }
            target.set(tx);
        }
    }
    
    /**
     * Appends and returns a new empty "tx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx addNewTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx)get_store().add_element_user(TX$4);
            return target;
        }
    }
    
    /**
     * Unsets the "tx" element
     */
    public void unsetTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TX$4, 0);
        }
    }
    
    /**
     * Gets the "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spPr" element
     */
    public boolean isSetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPPR$6) != 0;
        }
    }
    
    /**
     * Sets the "spPr" element
     */
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$6);
            }
            target.set(spPr);
        }
    }
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "spPr" element
     */
    public void unsetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPPR$6, 0);
        }
    }
    
    /**
     * Gets the "pictureOptions" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions getPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().find_element_user(PICTUREOPTIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pictureOptions" element
     */
    public boolean isSetPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PICTUREOPTIONS$8) != 0;
        }
    }
    
    /**
     * Sets the "pictureOptions" element
     */
    public void setPictureOptions(org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions pictureOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().find_element_user(PICTUREOPTIONS$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().add_element_user(PICTUREOPTIONS$8);
            }
            target.set(pictureOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "pictureOptions" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions addNewPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().add_element_user(PICTUREOPTIONS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "pictureOptions" element
     */
    public void unsetPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PICTUREOPTIONS$8, 0);
        }
    }
    
    /**
     * Gets a List of "dPt" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt> getDPtList()
    {
        final class DPtList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt get(int i)
                { return CTAreaSerImpl.this.getDPtArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt old = CTAreaSerImpl.this.getDPtArray(i);
                CTAreaSerImpl.this.setDPtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt o)
                { CTAreaSerImpl.this.insertNewDPt(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt old = CTAreaSerImpl.this.getDPtArray(i);
                CTAreaSerImpl.this.removeDPt(i);
                return old;
            }
            
            public int size()
                { return CTAreaSerImpl.this.sizeOfDPtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DPtList();
        }
    }
    
    /**
     * Gets array of all "dPt" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt[] getDPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DPT$10, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dPt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt getDPtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt)get_store().find_element_user(DPT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dPt" element
     */
    public int sizeOfDPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DPT$10);
        }
    }
    
    /**
     * Sets array of all "dPt" element
     */
    public void setDPtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt[] dPtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dPtArray, DPT$10);
        }
    }
    
    /**
     * Sets ith "dPt" element
     */
    public void setDPtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt dPt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt)get_store().find_element_user(DPT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dPt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dPt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt insertNewDPt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt)get_store().insert_element_user(DPT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dPt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt addNewDPt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt)get_store().add_element_user(DPT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "dPt" element
     */
    public void removeDPt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DPT$10, i);
        }
    }
    
    /**
     * Gets the "dLbls" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls getDLbls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().find_element_user(DLBLS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dLbls" element
     */
    public boolean isSetDLbls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DLBLS$12) != 0;
        }
    }
    
    /**
     * Sets the "dLbls" element
     */
    public void setDLbls(org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls dLbls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().find_element_user(DLBLS$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().add_element_user(DLBLS$12);
            }
            target.set(dLbls);
        }
    }
    
    /**
     * Appends and returns a new empty "dLbls" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls addNewDLbls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().add_element_user(DLBLS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "dLbls" element
     */
    public void unsetDLbls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DLBLS$12, 0);
        }
    }
    
    /**
     * Gets a List of "trendline" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline> getTrendlineList()
    {
        final class TrendlineList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline get(int i)
                { return CTAreaSerImpl.this.getTrendlineArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline old = CTAreaSerImpl.this.getTrendlineArray(i);
                CTAreaSerImpl.this.setTrendlineArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline o)
                { CTAreaSerImpl.this.insertNewTrendline(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline old = CTAreaSerImpl.this.getTrendlineArray(i);
                CTAreaSerImpl.this.removeTrendline(i);
                return old;
            }
            
            public int size()
                { return CTAreaSerImpl.this.sizeOfTrendlineArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TrendlineList();
        }
    }
    
    /**
     * Gets array of all "trendline" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline[] getTrendlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRENDLINE$14, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "trendline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline getTrendlineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline)get_store().find_element_user(TRENDLINE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "trendline" element
     */
    public int sizeOfTrendlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRENDLINE$14);
        }
    }
    
    /**
     * Sets array of all "trendline" element
     */
    public void setTrendlineArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline[] trendlineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(trendlineArray, TRENDLINE$14);
        }
    }
    
    /**
     * Sets ith "trendline" element
     */
    public void setTrendlineArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline trendline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline)get_store().find_element_user(TRENDLINE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(trendline);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "trendline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline insertNewTrendline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline)get_store().insert_element_user(TRENDLINE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "trendline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline addNewTrendline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline)get_store().add_element_user(TRENDLINE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "trendline" element
     */
    public void removeTrendline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRENDLINE$14, i);
        }
    }
    
    /**
     * Gets a List of "errBars" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars> getErrBarsList()
    {
        final class ErrBarsList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars get(int i)
                { return CTAreaSerImpl.this.getErrBarsArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars old = CTAreaSerImpl.this.getErrBarsArray(i);
                CTAreaSerImpl.this.setErrBarsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars o)
                { CTAreaSerImpl.this.insertNewErrBars(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars old = CTAreaSerImpl.this.getErrBarsArray(i);
                CTAreaSerImpl.this.removeErrBars(i);
                return old;
            }
            
            public int size()
                { return CTAreaSerImpl.this.sizeOfErrBarsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ErrBarsList();
        }
    }
    
    /**
     * Gets array of all "errBars" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars[] getErrBarsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERRBARS$16, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "errBars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars getErrBarsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars)get_store().find_element_user(ERRBARS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "errBars" element
     */
    public int sizeOfErrBarsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRBARS$16);
        }
    }
    
    /**
     * Sets array of all "errBars" element
     */
    public void setErrBarsArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars[] errBarsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errBarsArray, ERRBARS$16);
        }
    }
    
    /**
     * Sets ith "errBars" element
     */
    public void setErrBarsArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars errBars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars)get_store().find_element_user(ERRBARS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(errBars);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "errBars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars insertNewErrBars(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars)get_store().insert_element_user(ERRBARS$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "errBars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars addNewErrBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars)get_store().add_element_user(ERRBARS$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "errBars" element
     */
    public void removeErrBars(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRBARS$16, i);
        }
    }
    
    /**
     * Gets the "cat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource getCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource)get_store().find_element_user(CAT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cat" element
     */
    public boolean isSetCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAT$18) != 0;
        }
    }
    
    /**
     * Sets the "cat" element
     */
    public void setCat(org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource cat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource)get_store().find_element_user(CAT$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource)get_store().add_element_user(CAT$18);
            }
            target.set(cat);
        }
    }
    
    /**
     * Appends and returns a new empty "cat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource addNewCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource)get_store().add_element_user(CAT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "cat" element
     */
    public void unsetCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAT$18, 0);
        }
    }
    
    /**
     * Gets the "val" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().find_element_user(VAL$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "val" element
     */
    public boolean isSetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VAL$20) != 0;
        }
    }
    
    /**
     * Sets the "val" element
     */
    public void setVal(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().find_element_user(VAL$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().add_element_user(VAL$20);
            }
            target.set(val);
        }
    }
    
    /**
     * Appends and returns a new empty "val" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource addNewVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().add_element_user(VAL$20);
            return target;
        }
    }
    
    /**
     * Unsets the "val" element
     */
    public void unsetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VAL$20, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$22) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$22);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$22);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$22, 0);
        }
    }
}
