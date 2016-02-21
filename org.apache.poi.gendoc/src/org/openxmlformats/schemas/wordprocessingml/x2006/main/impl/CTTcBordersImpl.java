/*
 * XML Type:  CT_TcBorders
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TcBorders(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTcBordersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders
{
    
    public CTTcBordersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "top");
    private static final javax.xml.namespace.QName LEFT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "left");
    private static final javax.xml.namespace.QName BOTTOM$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bottom");
    private static final javax.xml.namespace.QName RIGHT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "right");
    private static final javax.xml.namespace.QName INSIDEH$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "insideH");
    private static final javax.xml.namespace.QName INSIDEV$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "insideV");
    private static final javax.xml.namespace.QName TL2BR$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tl2br");
    private static final javax.xml.namespace.QName TR2BL$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tr2bl");
    
    
    /**
     * Gets the "top" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(TOP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "top" element
     */
    public boolean isSetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOP$0) != 0;
        }
    }
    
    /**
     * Sets the "top" element
     */
    public void setTop(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(TOP$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(TOP$0);
            }
            target.set(top);
        }
    }
    
    /**
     * Appends and returns a new empty "top" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(TOP$0);
            return target;
        }
    }
    
    /**
     * Unsets the "top" element
     */
    public void unsetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOP$0, 0);
        }
    }
    
    /**
     * Gets the "left" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(LEFT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "left" element
     */
    public boolean isSetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEFT$2) != 0;
        }
    }
    
    /**
     * Sets the "left" element
     */
    public void setLeft(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(LEFT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(LEFT$2);
            }
            target.set(left);
        }
    }
    
    /**
     * Appends and returns a new empty "left" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(LEFT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "left" element
     */
    public void unsetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEFT$2, 0);
        }
    }
    
    /**
     * Gets the "bottom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(BOTTOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bottom" element
     */
    public boolean isSetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOTTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "bottom" element
     */
    public void setBottom(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(BOTTOM$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(BOTTOM$4);
            }
            target.set(bottom);
        }
    }
    
    /**
     * Appends and returns a new empty "bottom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(BOTTOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bottom" element
     */
    public void unsetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOTTOM$4, 0);
        }
    }
    
    /**
     * Gets the "right" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(RIGHT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "right" element
     */
    public boolean isSetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHT$6) != 0;
        }
    }
    
    /**
     * Sets the "right" element
     */
    public void setRight(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(RIGHT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(RIGHT$6);
            }
            target.set(right);
        }
    }
    
    /**
     * Appends and returns a new empty "right" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(RIGHT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "right" element
     */
    public void unsetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHT$6, 0);
        }
    }
    
    /**
     * Gets the "insideH" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getInsideH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(INSIDEH$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "insideH" element
     */
    public boolean isSetInsideH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSIDEH$8) != 0;
        }
    }
    
    /**
     * Sets the "insideH" element
     */
    public void setInsideH(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder insideH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(INSIDEH$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(INSIDEH$8);
            }
            target.set(insideH);
        }
    }
    
    /**
     * Appends and returns a new empty "insideH" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewInsideH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(INSIDEH$8);
            return target;
        }
    }
    
    /**
     * Unsets the "insideH" element
     */
    public void unsetInsideH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSIDEH$8, 0);
        }
    }
    
    /**
     * Gets the "insideV" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getInsideV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(INSIDEV$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "insideV" element
     */
    public boolean isSetInsideV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSIDEV$10) != 0;
        }
    }
    
    /**
     * Sets the "insideV" element
     */
    public void setInsideV(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder insideV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(INSIDEV$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(INSIDEV$10);
            }
            target.set(insideV);
        }
    }
    
    /**
     * Appends and returns a new empty "insideV" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewInsideV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(INSIDEV$10);
            return target;
        }
    }
    
    /**
     * Unsets the "insideV" element
     */
    public void unsetInsideV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSIDEV$10, 0);
        }
    }
    
    /**
     * Gets the "tl2br" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getTl2Br()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(TL2BR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tl2br" element
     */
    public boolean isSetTl2Br()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TL2BR$12) != 0;
        }
    }
    
    /**
     * Sets the "tl2br" element
     */
    public void setTl2Br(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder tl2Br)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(TL2BR$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(TL2BR$12);
            }
            target.set(tl2Br);
        }
    }
    
    /**
     * Appends and returns a new empty "tl2br" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewTl2Br()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(TL2BR$12);
            return target;
        }
    }
    
    /**
     * Unsets the "tl2br" element
     */
    public void unsetTl2Br()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TL2BR$12, 0);
        }
    }
    
    /**
     * Gets the "tr2bl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getTr2Bl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(TR2BL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tr2bl" element
     */
    public boolean isSetTr2Bl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TR2BL$14) != 0;
        }
    }
    
    /**
     * Sets the "tr2bl" element
     */
    public void setTr2Bl(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder tr2Bl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(TR2BL$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(TR2BL$14);
            }
            target.set(tr2Bl);
        }
    }
    
    /**
     * Appends and returns a new empty "tr2bl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewTr2Bl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(TR2BL$14);
            return target;
        }
    }
    
    /**
     * Unsets the "tr2bl" element
     */
    public void unsetTr2Bl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TR2BL$14, 0);
        }
    }
}
