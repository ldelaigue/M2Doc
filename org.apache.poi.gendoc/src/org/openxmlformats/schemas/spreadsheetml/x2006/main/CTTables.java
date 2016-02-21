/*
 * XML Type:  CT_Tables
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Tables(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTables extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTables.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttablesda2etype");
    
    /**
     * Gets a List of "m" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing> getMList();
    
    /**
     * Gets array of all "m" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing[] getMArray();
    
    /**
     * Gets ith "m" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing getMArray(int i);
    
    /**
     * Returns number of "m" element
     */
    int sizeOfMArray();
    
    /**
     * Sets array of all "m" element
     */
    void setMArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing[] mArray);
    
    /**
     * Sets ith "m" element
     */
    void setMArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing m);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "m" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing insertNewM(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "m" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing addNewM();
    
    /**
     * Removes the ith "m" element
     */
    void removeM(int i);
    
    /**
     * Gets a List of "s" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement> getSList();
    
    /**
     * Gets array of all "s" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[] getSArray();
    
    /**
     * Gets ith "s" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement getSArray(int i);
    
    /**
     * Returns number of "s" element
     */
    int sizeOfSArray();
    
    /**
     * Sets array of all "s" element
     */
    void setSArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[] sArray);
    
    /**
     * Sets ith "s" element
     */
    void setSArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement s);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "s" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement insertNewS(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "s" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement addNewS();
    
    /**
     * Removes the ith "s" element
     */
    void removeS(int i);
    
    /**
     * Gets a List of "x" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex> getXList();
    
    /**
     * Gets array of all "x" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[] getXArray();
    
    /**
     * Gets ith "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex getXArray(int i);
    
    /**
     * Returns number of "x" element
     */
    int sizeOfXArray();
    
    /**
     * Sets array of all "x" element
     */
    void setXArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[] xArray);
    
    /**
     * Sets ith "x" element
     */
    void setXArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex x);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex insertNewX(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex addNewX();
    
    /**
     * Removes the ith "x" element
     */
    void removeX(int i);
    
    /**
     * Gets the "count" attribute
     */
    long getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(long count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables newInstance() {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
