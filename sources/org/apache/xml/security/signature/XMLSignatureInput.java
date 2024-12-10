package org.apache.xml.security.signature;

import X.AnonymousClass000;
import X.AnonymousClass8BR;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BEB;
import X.C108945cZ;
import X.C17880vN;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.implementations.Canonicalizer11;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315;
import org.apache.xml.security.c14n.implementations.CanonicalizerBase;
import org.apache.xml.security.exceptions.XMLSecurityRuntimeException;
import org.apache.xml.security.utils.JavaUtils;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XMLSignatureInput implements Cloneable {
    public static Log a;
    public static Class l;
    public InputStream b;
    public Set c;
    public Node d;
    public Node e;
    public boolean f;
    public boolean g;
    public byte[] h;
    public List i;
    public boolean j;
    public OutputStream k;
    public String m;
    public String n;

    static {
        Class c2 = c("org.apache.xml.security.signature.XMLSignatureInput");
        l = c2;
        a = LogFactory.getLog(c2.getName());
    }

    public void a(OutputStream outputStream) {
        a(outputStream, false);
    }

    public void a(String str) {
        this.m = str;
    }

    public void a(NodeFilter nodeFilter) {
        if (h()) {
            try {
                q();
            } catch (Exception e2) {
                throw new XMLSecurityRuntimeException("signature.XMLSignatureInput.nodesetReference", e2);
            }
        }
        this.i.add(nodeFilter);
    }

    public void a(Node node) {
        this.e = node;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public boolean a() {
        return this.j;
    }

    public Set b() {
        return b(false);
    }

    public void b(OutputStream outputStream) {
        this.k = outputStream;
    }

    public void b(String str) {
        this.n = str;
    }

    public InputStream c() {
        InputStream inputStream = this.b;
        return !(inputStream instanceof FileInputStream) ? o() : inputStream;
    }

    public void c(boolean z) {
        this.f = z;
    }

    public InputStream d() {
        return this.b;
    }

    public void d(boolean z) {
        this.g = z;
    }

    public boolean f() {
        return (this.b == null && this.c != null) || this.g;
    }

    public boolean g() {
        return this.b == null && this.d != null && this.c == null && !this.g;
    }

    public boolean h() {
        return !(this.b == null && this.h == null) && this.c == null && this.d == null;
    }

    public boolean j() {
        return this.h != null && this.c == null && this.d == null;
    }

    public String k() {
        return this.n;
    }

    public Node l() {
        return this.e;
    }

    public Node m() {
        return this.d;
    }

    public boolean n() {
        return this.f;
    }

    public List p() {
        return this.i;
    }

    public void a(OutputStream outputStream, boolean z) {
        CanonicalizerBase canonicalizer20010315;
        if (outputStream != this.k) {
            byte[] bArr = this.h;
            if (bArr != null) {
                outputStream.write(bArr);
                return;
            }
            InputStream inputStream = this.b;
            if (inputStream == null) {
                if (z) {
                    canonicalizer20010315 = new Canonicalizer11(false);
                } else {
                    canonicalizer20010315 = new Canonicalizer20010315(false);
                }
                canonicalizer20010315.n = outputStream;
                canonicalizer20010315.b(this);
            } else if (inputStream instanceof FileInputStream) {
                byte[] bArr2 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                while (true) {
                    int read = this.b.read(bArr2);
                    if (read != -1) {
                        outputStream.write(bArr2, 0, read);
                    } else {
                        return;
                    }
                }
            } else {
                InputStream o = o();
                byte[] bArr3 = this.h;
                if (bArr3 != null) {
                    outputStream.write(bArr3, 0, bArr3.length);
                    return;
                }
                o.reset();
                byte[] bArr4 = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                while (true) {
                    int read2 = o.read(bArr4);
                    if (read2 > 0) {
                        outputStream.write(bArr4, 0, read2);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public Set b(boolean z) {
        Node node;
        Set set = this.c;
        if (set != null) {
            return set;
        }
        if (this.b == null && (node = this.d) != null) {
            if (z) {
                XMLUtils.a(XMLUtils.b(node));
            }
            HashSet A12 = C17880vN.A12();
            this.c = A12;
            XMLUtils.a(this.d, (Set) A12, this.e, this.f);
            return this.c;
        } else if (h()) {
            q();
            HashSet A122 = C17880vN.A12();
            XMLUtils.b(this.d, A122, (Node) null, false);
            return A122;
        } else {
            throw AnonymousClass8BR.A0w("getNodeSet() called but no input data present");
        }
    }

    public byte[] e() {
        byte[] bArr = this.h;
        if (bArr == null) {
            InputStream o = o();
            if (o != null) {
                bArr = this.h;
                if (bArr == null) {
                    o.reset();
                    bArr = JavaUtils.a(o);
                }
            } else {
                bArr = new Canonicalizer20010315(false).b(this);
            }
            this.h = bArr;
        }
        return bArr;
    }

    public boolean i() {
        return AnonymousClass000.A1W(this.k);
    }

    public InputStream o() {
        InputStream inputStream = this.b;
        if (!(inputStream instanceof ByteArrayInputStream)) {
            byte[] bArr = this.h;
            if (bArr == null) {
                if (inputStream == null) {
                    return null;
                }
                if (inputStream.markSupported()) {
                    a.info("Mark Suported but not used as reset");
                }
                this.h = JavaUtils.a(this.b);
                this.b.close();
                bArr = this.h;
            }
            ByteArrayInputStream A0h = BE6.A0h(bArr);
            this.b = A0h;
            return A0h;
        } else if (inputStream.markSupported()) {
            return this.b;
        } else {
            StringBuffer A0s = BE6.A0s();
            A0s.append("Accepted as Markable but not truly been");
            A0s.append(this.b);
            throw BE8.A0f(A0s);
        }
    }

    public String toString() {
        StringBuffer A0i;
        String str;
        if (f()) {
            A0i = BE6.A0s();
            A0i.append("XMLSignatureInput/NodeSet/");
            A0i.append(this.c.size());
            str = " nodes/";
        } else if (g()) {
            A0i = BE6.A0s();
            A0i.append("XMLSignatureInput/Element/");
            A0i.append(this.d);
            A0i.append(" exclude ");
            A0i.append(this.e);
            A0i.append(" comments:");
            A0i.append(this.f);
            str = "/";
        } else {
            try {
                StringBuffer A0s = BE6.A0s();
                A0s.append("XMLSignatureInput/OctetStream/");
                A0s.append(e().length);
                A0s.append(" octets/");
                A0s.append(this.n);
                return A0s.toString();
            } catch (IOException | CanonicalizationException unused) {
                A0i = BE8.A0i("XMLSignatureInput/OctetStream//");
            }
        }
        A0i.append(str);
        return BE7.A0n(this.n, A0i);
    }

    public XMLSignatureInput(InputStream inputStream) {
        BEB.A1S(this);
        this.b = inputStream;
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw BE8.A0l(e2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [org.xml.sax.ErrorHandler, java.lang.Object] */
    public void q() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setValidating(false);
        newInstance.setNamespaceAware(true);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        try {
            newDocumentBuilder.setErrorHandler(new Object());
            this.d = newDocumentBuilder.parse(c());
        } catch (SAXException unused) {
            ByteArrayOutputStream A15 = C108945cZ.A15();
            A15.write("<container>".getBytes());
            A15.write(e());
            A15.write("</container>".getBytes());
            this.d = newDocumentBuilder.parse(BE6.A0h(A15.toByteArray())).getDocumentElement().getFirstChild().getFirstChild();
        }
        this.b = null;
        this.h = null;
    }

    public XMLSignatureInput(Node node) {
        BEB.A1S(this);
        this.d = node;
    }

    public XMLSignatureInput(byte[] bArr) {
        BEB.A1S(this);
        this.h = bArr;
    }
}
