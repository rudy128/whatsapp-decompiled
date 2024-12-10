package org.apache.xml.security.c14n.implementations;

import X.AnonymousClass000;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.BE6;
import X.BE8;
import X.BEA;
import X.C17880vN;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.helper.C14nHelper;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public abstract class Canonicalizer11 extends CanonicalizerBase {
    public static Log d;
    public static Class f;
    public boolean b = true;
    public final SortedSet c = new TreeSet(CanonicalizerBase.g);
    public XmlAttrStack e = new XmlAttrStack();

    public class XmlAttrStack {
        public int a = 0;
        public int b = 0;
        public XmlsStackElement c;
        public List d = AnonymousClass000.A13();

        public class XmlsStackElement {
            public int a;
            public boolean b = false;
            public List c = AnonymousClass000.A13();
        }

        public void a(Attr attr) {
            if (this.c == null) {
                XmlsStackElement xmlsStackElement = new XmlsStackElement();
                this.c = xmlsStackElement;
                xmlsStackElement.a = this.a;
                this.d.add(xmlsStackElement);
                this.b = this.a;
            }
            this.c.c.add(attr);
        }

        public void a(Collection collection) {
            Attr attr;
            String str;
            if (this.c == null) {
                XmlsStackElement xmlsStackElement = new XmlsStackElement();
                this.c = xmlsStackElement;
                int i = this.a;
                xmlsStackElement.a = i;
                this.b = i;
                this.d.add(xmlsStackElement);
            }
            int size = this.d.size() - 2;
            if (size != -1) {
                XmlsStackElement xmlsStackElement2 = (XmlsStackElement) this.d.get(size);
                if (!xmlsStackElement2.b || xmlsStackElement2.a + 1 != this.a) {
                    HashMap A11 = C17880vN.A11();
                    ArrayList A13 = AnonymousClass000.A13();
                    boolean z = true;
                    while (size >= 0) {
                        XmlsStackElement xmlsStackElement3 = (XmlsStackElement) this.d.get(size);
                        if (xmlsStackElement3.b) {
                            z = false;
                        }
                        Iterator it = xmlsStackElement3.c.iterator();
                        while (it.hasNext() && z) {
                            Attr attr2 = (Attr) it.next();
                            if (attr2.getLocalName().equals("base")) {
                                if (!xmlsStackElement3.b) {
                                    A13.add(attr2);
                                }
                            } else if (!A11.containsKey(attr2.getName())) {
                                A11.put(attr2.getName(), attr2);
                            }
                        }
                        size--;
                    }
                    if (!A13.isEmpty()) {
                        Iterator it2 = this.c.c.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                attr = null;
                                str = null;
                                break;
                            }
                            attr = (Attr) it2.next();
                            if (attr.getLocalName().equals("base")) {
                                str = attr.getValue();
                                break;
                            }
                        }
                        Iterator it3 = A13.iterator();
                        while (it3.hasNext()) {
                            Attr attr3 = (Attr) it3.next();
                            if (str == null) {
                                str = attr3.getValue();
                                attr = attr3;
                            } else {
                                try {
                                    str = Canonicalizer11.b(attr3.getValue(), str);
                                } catch (URISyntaxException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        if (!(str == null || str.length() == 0)) {
                            attr.setValue(str);
                            collection.add(attr);
                        }
                    }
                    this.c.b = true;
                    collection.addAll(A11.values());
                    return;
                }
            }
            collection.addAll(this.c.c);
            this.c.b = true;
        }

        public void a(int i) {
            this.a = i;
            if (i != -1) {
                this.c = null;
                while (this.b >= this.a) {
                    List list = this.d;
                    list.remove(AnonymousClass3MX.A01(list));
                    if (this.d.size() == 0) {
                        this.b = 0;
                        return;
                    } else {
                        List list2 = this.d;
                        this.b = ((XmlsStackElement) list2.get(AnonymousClass3MX.A01(list2))).a;
                    }
                }
            }
        }
    }

    static {
        Class a = a("org.apache.xml.security.c14n.implementations.Canonicalizer11");
        f = a;
        d = LogFactory.getLog(a.getName());
    }

    public Canonicalizer11(boolean z) {
        super(z);
    }

    public static String a(String str, String str2) {
        return b(str, str2);
    }

    public byte[] a(Node node, String str) {
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");
    }

    public static void a(String str, String str2, String str3) {
        String str4;
        if (d.isDebugEnabled()) {
            Log log = d;
            StringBuffer A0s = BE6.A0s();
            A0s.append(" ");
            A0s.append(str);
            BEA.A1O(":   ", str2, A0s, log);
            int length = str2.length();
            Log log2 = d;
            StringBuffer A0s2 = BE6.A0s();
            if (length == 0) {
                str4 = "\t\t\t\t";
            } else {
                str4 = "\t\t\t";
            }
            BEA.A1O(str4, str3, A0s2, log2);
        }
    }

    public Iterator b(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        NamedNodeMap namedNodeMap;
        int i;
        Object b2;
        this.e.a(nameSpaceSymbTable.c.size());
        boolean A1T = AnonymousClass000.A1T(a((Node) element, nameSpaceSymbTable.c.size()), 1);
        if (element.hasAttributes()) {
            namedNodeMap = element.getAttributes();
            i = namedNodeMap.getLength();
        } else {
            namedNodeMap = null;
            i = 0;
        }
        SortedSet sortedSet = this.c;
        sortedSet.clear();
        for (int i2 = 0; i2 < i; i2++) {
            Attr attr = (Attr) namedNodeMap.item(i2);
            String namespaceURI = attr.getNamespaceURI();
            if ("http://www.w3.org/2000/xmlns/".equals(namespaceURI)) {
                String localName = attr.getLocalName();
                String value = attr.getValue();
                if (!"xml".equals(localName) || !"http://www.w3.org/XML/1998/namespace".equals(value)) {
                    if (c(attr)) {
                        if (!A1T) {
                            nameSpaceSymbTable.e(localName);
                        }
                        Node b3 = nameSpaceSymbTable.b(localName, value, attr);
                        if (b3 != null) {
                            sortedSet.add(b3);
                            if (C14nHelper.a(attr)) {
                                Object[] A1a = AnonymousClass8BR.A1a();
                                A1a[0] = element.getTagName();
                                A1a[1] = localName;
                                throw BEA.A0x(attr, A1a);
                            }
                        } else {
                            continue;
                        }
                    } else if (!A1T || "xmlns".equals(localName)) {
                        nameSpaceSymbTable.a(localName, value, attr);
                    } else {
                        nameSpaceSymbTable.c(localName);
                    }
                }
            } else if ("http://www.w3.org/XML/1998/namespace".equals(namespaceURI) && !attr.getLocalName().equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                this.e.a(attr);
            } else if (A1T) {
                sortedSet.add(attr);
            }
        }
        if (A1T) {
            Attr attributeNodeNS = element.getAttributeNodeNS("http://www.w3.org/2000/xmlns/", "xmlns");
            if (attributeNodeNS == null) {
                b2 = nameSpaceSymbTable.a("xmlns");
            } else {
                if (!c(attributeNodeNS)) {
                    b2 = nameSpaceSymbTable.b("xmlns", "", CanonicalizerBase.i);
                }
                this.e.a((Collection) sortedSet);
                nameSpaceSymbTable.a((Collection) sortedSet);
            }
            if (b2 != null) {
                sortedSet.add(b2);
            }
            this.e.a((Collection) sortedSet);
            nameSpaceSymbTable.a((Collection) sortedSet);
        }
        return sortedSet.iterator();
    }

    public void c(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        if (element.hasAttributes()) {
            this.e.a = -1;
            NamedNodeMap attributes = element.getAttributes();
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                Attr attr = (Attr) attributes.item(i);
                if (BE8.A1a("http://www.w3.org/2000/xmlns/", attr)) {
                    String localName = attr.getLocalName();
                    String nodeValue = attr.getNodeValue();
                    if (!"xml".equals(localName) || !"http://www.w3.org/XML/1998/namespace".equals(nodeValue)) {
                        nameSpaceSymbTable.a(localName, nodeValue, attr);
                    }
                } else if (!BE8.A1a("http://www.w3.org/XML/1998/namespace", attr)) {
                    this.e.a(attr);
                }
            }
        }
    }

    public void a(XMLSignatureInput xMLSignatureInput) {
        Document a;
        if (xMLSignatureInput.j) {
            Node node = xMLSignatureInput.d;
            if (node != null) {
                a = XMLUtils.b(node);
            } else {
                a = XMLUtils.a(xMLSignatureInput.b(false));
            }
            XMLUtils.a(a);
        }
    }

    public static String b(String str) {
        String substring;
        d.debug("STEP   OUTPUT BUFFER\t\tINPUT BUFFER");
        while (str.indexOf("//") > -1) {
            str = str.replaceAll("//", "/");
        }
        StringBuffer A0s = BE6.A0s();
        if (str.charAt(0) == '/') {
            A0s.append("/");
            str = str.substring(1);
        }
        a("1 ", A0s.toString(), r12);
        while (r12.length() != 0) {
            String str2 = "2A";
            if (!r12.startsWith("./")) {
                if (r12.startsWith("../")) {
                    r12 = r12.substring(3);
                    if (!A0s.toString().equals("/")) {
                        A0s.append("../");
                    }
                } else {
                    str2 = "2B";
                    if (!r12.startsWith("/./")) {
                        if (r12.equals("/.")) {
                            r12 = r12.replaceFirst("/.", "/");
                        } else {
                            str2 = "2C";
                            if (r12.startsWith("/../")) {
                                r12 = r12.substring(3);
                            } else if (r12.equals("/..")) {
                                r12 = r12.replaceFirst("/..", "/");
                            } else {
                                String str3 = "2D";
                                String str4 = "";
                                if (!r12.equals(".")) {
                                    if (!r12.equals("..")) {
                                        int indexOf = r12.indexOf(47);
                                        if (indexOf == 0) {
                                            indexOf = r12.indexOf(47, 1);
                                        }
                                        if (indexOf == -1) {
                                            substring = r12.substring(0);
                                        } else {
                                            substring = r12.substring(0, indexOf);
                                            str4 = r12.substring(indexOf);
                                        }
                                        A0s.append(substring);
                                        str3 = "2E";
                                    } else if (!A0s.toString().equals("/")) {
                                        A0s.append("..");
                                    }
                                }
                                a(str3, A0s.toString(), str4);
                                r12 = str4;
                            }
                            if (A0s.length() == 0) {
                                A0s.append("/");
                            } else if (A0s.toString().endsWith("../")) {
                                A0s.append("..");
                            } else if (A0s.toString().endsWith("..")) {
                                A0s.append("/..");
                            } else {
                                int lastIndexOf = A0s.lastIndexOf("/");
                                if (lastIndexOf == -1) {
                                    A0s = BE6.A0s();
                                    if (r12.charAt(0) == '/') {
                                        r12 = r12.substring(1);
                                    }
                                } else {
                                    A0s.delete(lastIndexOf, A0s.length());
                                }
                            }
                        }
                    }
                }
                a(str2, A0s.toString(), r12);
            }
            r12 = r12.substring(2);
            a(str2, A0s.toString(), r12);
        }
        if (A0s.toString().endsWith("..")) {
            A0s.append("/");
            a("3 ", A0s.toString(), r12);
        }
        return A0s.toString();
    }

    public Iterator a(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        Node b2;
        if (!element.hasAttributes() && !this.b) {
            return null;
        }
        SortedSet sortedSet = this.c;
        sortedSet.clear();
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Attr attr = (Attr) attributes.item(i);
            if (!"http://www.w3.org/2000/xmlns/".equals(attr.getNamespaceURI())) {
                sortedSet.add(attr);
            } else {
                String localName = attr.getLocalName();
                String value = attr.getValue();
                if ((!"xml".equals(localName) || !"http://www.w3.org/XML/1998/namespace".equals(value)) && (b2 = nameSpaceSymbTable.b(localName, value, attr)) != null) {
                    sortedSet.add(b2);
                    if (C14nHelper.a(attr)) {
                        Object[] A1a = AnonymousClass8BR.A1a();
                        AnonymousClass8BS.A1B(element.getTagName(), localName, A1a);
                        throw BEA.A0x(attr, A1a);
                    }
                }
            }
        }
        if (this.b) {
            nameSpaceSymbTable.a((Collection) sortedSet);
            this.e.a((Collection) sortedSet);
            this.b = false;
        }
        return sortedSet.iterator();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r9 != null) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r5 = "/"
            r6 = 0
            if (r9 == 0) goto L_0x00a0
            java.lang.String r0 = ".."
            boolean r0 = r9.endsWith(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.StringBuffer r0 = X.BE6.A0s()
            java.lang.String r9 = X.BE9.A0p(r9, r5, r0)
        L_0x0015:
            java.net.URI r0 = new java.net.URI
            r0.<init>(r9)
            java.lang.String r6 = r0.getScheme()
            java.lang.String r4 = r0.getAuthority()
            java.lang.String r8 = r0.getPath()
            java.lang.String r2 = r0.getQuery()
            r0.getFragment()
        L_0x002d:
            java.net.URI r0 = new java.net.URI
            r0.<init>(r10)
            java.lang.String r1 = r0.getScheme()
            java.lang.String r7 = r0.getAuthority()
            java.lang.String r3 = r0.getPath()
            java.lang.String r9 = r0.getQuery()
            if (r1 == 0) goto L_0x005a
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x005a
            java.lang.String r8 = b(r3)
            r6 = r1
        L_0x004f:
            r10 = 0
            java.net.URI r5 = new java.net.URI
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r0 = r5.toString()
            return r0
        L_0x005a:
            if (r7 == 0) goto L_0x0063
            java.lang.String r8 = b(r3)
            r4 = r7
        L_0x0061:
            r7 = r4
            goto L_0x004f
        L_0x0063:
            int r0 = r3.length()
            if (r0 != 0) goto L_0x006e
            if (r9 == 0) goto L_0x006c
        L_0x006b:
            r2 = r9
        L_0x006c:
            r9 = r2
            goto L_0x0061
        L_0x006e:
            boolean r0 = r3.startsWith(r5)
            if (r0 != 0) goto L_0x0084
            if (r4 == 0) goto L_0x0089
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0089
            java.lang.StringBuffer r2 = X.BE8.A0i(r5)
        L_0x0080:
            java.lang.String r3 = X.BE7.A0n(r3, r2)
        L_0x0084:
            java.lang.String r8 = b(r3)
            goto L_0x006b
        L_0x0089:
            r0 = 47
            int r1 = r8.lastIndexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0084
            java.lang.StringBuffer r2 = X.BE6.A0s()
            int r0 = r1 + 1
            java.lang.String r0 = X.AnonymousClass8BS.A0o(r8, r0)
            r2.append(r0)
            goto L_0x0080
        L_0x00a0:
            java.lang.String r8 = ""
            r4 = r6
            r2 = r6
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.c14n.implementations.Canonicalizer11.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw BE8.A0l(e2);
        }
    }
}
