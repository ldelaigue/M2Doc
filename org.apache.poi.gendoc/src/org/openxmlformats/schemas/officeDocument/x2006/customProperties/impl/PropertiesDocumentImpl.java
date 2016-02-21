/*
 * An XML document type.
 * Localname: Properties
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/custom-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customProperties.impl;
/**
 * A document containing one Properties(@http://schemas.openxmlformats.org/officeDocument/2006/custom-properties) element.
 *
 * This is a complex type.
 */
public class PropertiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument
{
    
    public PropertiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTIES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/custom-properties", "Properties");
    
    
    /**
     * Gets the "Properties" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties)get_store().find_element_user(PROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Properties" element
     */
    public void setProperties(org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties)get_store().find_element_user(PROPERTIES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties)get_store().add_element_user(PROPERTIES$0);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "Properties" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties)get_store().add_element_user(PROPERTIES$0);
            return target;
        }
    }
}
