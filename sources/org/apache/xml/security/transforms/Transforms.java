package org.apache.xml.security.transforms;

import X.AnonymousClass3MW;
import X.BE6;
import X.BE8;
import X.BE9;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Transforms extends SignatureElementProxy {
    public static Log a;
    public static Class c;
    public Element[] b;

    static {
        Class b2 = b("org.apache.xml.security.transforms.Transforms");
        c = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public Transforms(Document document) {
        super(document);
        XMLUtils.b(this.k);
    }

    public String e() {
        return "Transforms";
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream) {
        try {
            int a2 = a() - 1;
            for (int i = 0; i < a2; i++) {
                Transform a3 = a(i);
                if (a.isDebugEnabled()) {
                    Log log = a;
                    StringBuffer A0s = BE6.A0s();
                    A0s.append("Perform the (");
                    A0s.append(i);
                    A0s.append(")th ");
                    A0s.append(a3.b());
                    BE9.A1I(" transform", A0s, log);
                }
                xMLSignatureInput = a3.a(xMLSignatureInput);
            }
            if (a2 >= 0) {
                return a(a2).a(xMLSignatureInput, outputStream);
            }
            return xMLSignatureInput;
        } catch (IOException e) {
            throw new TransformationException("empty", (Exception) e);
        } catch (CanonicalizationException e2) {
            throw new TransformationException("empty", (Exception) e2);
        } catch (InvalidCanonicalizerException e3) {
            throw new TransformationException("empty", (Exception) e3);
        }
    }

    public Transforms(Element element, String str) {
        super(element, str);
        if (a() == 0) {
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = "Transform";
            A1b[1] = "Transforms";
            throw new TransformationException("xml.WrongContent", A1b);
        }
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw BE8.A0l(e);
        }
    }

    public Transforms() {
    }

    public void a(String str) {
        try {
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0s = BE6.A0s();
                A0s.append("Transforms.addTransform(");
                A0s.append(str);
                BE9.A1I(")", A0s, log);
            }
            a(Transform.a(this.m, str));
        } catch (InvalidTransformException e) {
            throw new TransformationException("empty", (Exception) e);
        }
    }

    public int a() {
        Element[] elementArr = this.b;
        if (elementArr == null) {
            elementArr = XMLUtils.a(this.k.getFirstChild(), "http://www.w3.org/2000/09/xmldsig#", "Transform");
            this.b = elementArr;
        }
        return elementArr.length;
    }

    private void a(Transform transform) {
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer A0s = BE6.A0s();
            A0s.append("Transforms.addTransform(");
            A0s.append(transform.b());
            BE9.A1I(")", A0s, log);
        }
        this.k.appendChild(transform.k);
        XMLUtils.b(this.k);
    }

    public Transform a(int i) {
        try {
            Element[] elementArr = this.b;
            if (elementArr == null) {
                Node firstChild = this.k.getFirstChild();
                boolean z = XMLUtils.c;
                elementArr = XMLUtils.a(firstChild, "http://www.w3.org/2000/09/xmldsig#", "Transform");
                this.b = elementArr;
            }
            boolean z2 = Transform.c;
            return new Transform(elementArr[i], this.l);
        } catch (XMLSecurityException e) {
            throw new TransformationException("empty", (Exception) e);
        }
    }
}
