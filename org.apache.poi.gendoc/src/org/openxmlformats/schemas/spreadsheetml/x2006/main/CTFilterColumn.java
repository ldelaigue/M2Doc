/*
 * XML Type:  CT_FilterColumn
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_FilterColumn(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFilterColumn extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFilterColumn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfiltercolumn0fb7type");
    
    /**
     * Gets the "filters" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters getFilters();
    
    /**
     * True if has "filters" element
     */
    boolean isSetFilters();
    
    /**
     * Sets the "filters" element
     */
    void setFilters(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters filters);
    
    /**
     * Appends and returns a new empty "filters" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters addNewFilters();
    
    /**
     * Unsets the "filters" element
     */
    void unsetFilters();
    
    /**
     * Gets the "top10" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10 getTop10();
    
    /**
     * True if has "top10" element
     */
    boolean isSetTop10();
    
    /**
     * Sets the "top10" element
     */
    void setTop10(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10 top10);
    
    /**
     * Appends and returns a new empty "top10" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10 addNewTop10();
    
    /**
     * Unsets the "top10" element
     */
    void unsetTop10();
    
    /**
     * Gets the "customFilters" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters getCustomFilters();
    
    /**
     * True if has "customFilters" element
     */
    boolean isSetCustomFilters();
    
    /**
     * Sets the "customFilters" element
     */
    void setCustomFilters(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters customFilters);
    
    /**
     * Appends and returns a new empty "customFilters" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters addNewCustomFilters();
    
    /**
     * Unsets the "customFilters" element
     */
    void unsetCustomFilters();
    
    /**
     * Gets the "dynamicFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter getDynamicFilter();
    
    /**
     * True if has "dynamicFilter" element
     */
    boolean isSetDynamicFilter();
    
    /**
     * Sets the "dynamicFilter" element
     */
    void setDynamicFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter dynamicFilter);
    
    /**
     * Appends and returns a new empty "dynamicFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter addNewDynamicFilter();
    
    /**
     * Unsets the "dynamicFilter" element
     */
    void unsetDynamicFilter();
    
    /**
     * Gets the "colorFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter getColorFilter();
    
    /**
     * True if has "colorFilter" element
     */
    boolean isSetColorFilter();
    
    /**
     * Sets the "colorFilter" element
     */
    void setColorFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter colorFilter);
    
    /**
     * Appends and returns a new empty "colorFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter addNewColorFilter();
    
    /**
     * Unsets the "colorFilter" element
     */
    void unsetColorFilter();
    
    /**
     * Gets the "iconFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter getIconFilter();
    
    /**
     * True if has "iconFilter" element
     */
    boolean isSetIconFilter();
    
    /**
     * Sets the "iconFilter" element
     */
    void setIconFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter iconFilter);
    
    /**
     * Appends and returns a new empty "iconFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter addNewIconFilter();
    
    /**
     * Unsets the "iconFilter" element
     */
    void unsetIconFilter();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "colId" attribute
     */
    long getColId();
    
    /**
     * Gets (as xml) the "colId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetColId();
    
    /**
     * Sets the "colId" attribute
     */
    void setColId(long colId);
    
    /**
     * Sets (as xml) the "colId" attribute
     */
    void xsetColId(org.apache.xmlbeans.XmlUnsignedInt colId);
    
    /**
     * Gets the "hiddenButton" attribute
     */
    boolean getHiddenButton();
    
    /**
     * Gets (as xml) the "hiddenButton" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHiddenButton();
    
    /**
     * True if has "hiddenButton" attribute
     */
    boolean isSetHiddenButton();
    
    /**
     * Sets the "hiddenButton" attribute
     */
    void setHiddenButton(boolean hiddenButton);
    
    /**
     * Sets (as xml) the "hiddenButton" attribute
     */
    void xsetHiddenButton(org.apache.xmlbeans.XmlBoolean hiddenButton);
    
    /**
     * Unsets the "hiddenButton" attribute
     */
    void unsetHiddenButton();
    
    /**
     * Gets the "showButton" attribute
     */
    boolean getShowButton();
    
    /**
     * Gets (as xml) the "showButton" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowButton();
    
    /**
     * True if has "showButton" attribute
     */
    boolean isSetShowButton();
    
    /**
     * Sets the "showButton" attribute
     */
    void setShowButton(boolean showButton);
    
    /**
     * Sets (as xml) the "showButton" attribute
     */
    void xsetShowButton(org.apache.xmlbeans.XmlBoolean showButton);
    
    /**
     * Unsets the "showButton" attribute
     */
    void unsetShowButton();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn newInstance() {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
