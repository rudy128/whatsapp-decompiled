package org.apache.xml.security.transforms.implementations;

import X.BE6;
import X.BE7;
import X.BE8;
import X.C108945cZ;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;

public class TransformXSLT extends TransformSpi {
    public static Log b;
    public static Class c;
    public static Class d;
    public static Class e;

    static {
        try {
            e = Class.forName("javax.xml.XMLConstants");
        } catch (Exception unused) {
        }
        Class a = a("org.apache.xml.security.transforms.implementations.TransformXSLT");
        c = a;
        b = LogFactory.getLog(a.getName());
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        return a(xMLSignatureInput, (OutputStream) null, transform);
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        if (e != null) {
            try {
                Element a = XMLUtils.a(transform.k.getFirstChild(), "http://www.w3.org/1999/XSL/Transform", "stylesheet", 0);
                if (a != null) {
                    TransformerFactory newInstance = TransformerFactory.newInstance();
                    Class<?> cls = newInstance.getClass();
                    Class[] clsArr = new Class[2];
                    Class cls2 = d;
                    if (cls2 == null) {
                        cls2 = a("java.lang.String");
                        d = cls2;
                    }
                    clsArr[0] = cls2;
                    BE6.A0x(cls, Boolean.TYPE, "setFeature", clsArr, 1).invoke(newInstance, new Object[]{"http://javax.xml.XMLConstants/feature/secure-processing", Boolean.TRUE});
                    StreamSource streamSource = new StreamSource(BE6.A0h(xMLSignatureInput.e()));
                    ByteArrayOutputStream A15 = C108945cZ.A15();
                    newInstance.newTransformer().transform(new DOMSource(a), new StreamResult(A15));
                    Transformer newTransformer = newInstance.newTransformer(new StreamSource(BE6.A0h(A15.toByteArray())));
                    try {
                        newTransformer.setOutputProperty("{http://xml.apache.org/xalan}line-separator", "\n");
                    } catch (Exception e2) {
                        Log log = b;
                        StringBuffer A0s = BE6.A0s();
                        A0s.append("Unable to set Xalan line-separator property: ");
                        log.warn(BE7.A0n(e2.getMessage(), A0s));
                    }
                    if (outputStream == null) {
                        ByteArrayOutputStream A152 = C108945cZ.A15();
                        newTransformer.transform(streamSource, new StreamResult(A152));
                        return new XMLSignatureInput(A152.toByteArray());
                    }
                    newTransformer.transform(streamSource, new StreamResult(outputStream));
                    XMLSignatureInput xMLSignatureInput2 = new XMLSignatureInput((byte[]) null);
                    xMLSignatureInput2.k = outputStream;
                    return xMLSignatureInput2;
                }
                throw new TransformationException("xml.WrongContent", new Object[]{"xslt:stylesheet", "Transform"});
            } catch (XMLSecurityException e3) {
                Object[] objArr = new Object[1];
                BE6.A1M(e3, objArr, 0);
                throw new TransformationException("generic.EmptyMessage", objArr, e3);
            } catch (TransformerConfigurationException e4) {
                Object[] objArr2 = new Object[1];
                BE6.A1M(e4, objArr2, 0);
                throw new TransformationException("generic.EmptyMessage", objArr2, e4);
            } catch (TransformerException e5) {
                Object[] objArr3 = new Object[1];
                BE6.A1M(e5, objArr3, 0);
                throw new TransformationException("generic.EmptyMessage", objArr3, e5);
            } catch (NoSuchMethodException e6) {
                Object[] objArr4 = new Object[1];
                BE6.A1M(e6, objArr4, 0);
                throw new TransformationException("generic.EmptyMessage", objArr4, e6);
            } catch (IllegalAccessException e7) {
                Object[] objArr5 = new Object[1];
                BE6.A1M(e7, objArr5, 0);
                throw new TransformationException("generic.EmptyMessage", objArr5, e7);
            } catch (InvocationTargetException e8) {
                Object[] objArr6 = new Object[1];
                BE6.A1M(e8, objArr6, 0);
                throw new TransformationException("generic.EmptyMessage", objArr6, e8);
            }
        } else {
            throw new TransformationException("generic.EmptyMessage", new Object[]{"SECURE_PROCESSING_FEATURE not supported"});
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw BE8.A0l(e2);
        }
    }
}
