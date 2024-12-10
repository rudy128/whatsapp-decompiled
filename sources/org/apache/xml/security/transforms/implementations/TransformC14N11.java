package org.apache.xml.security.transforms.implementations;

import java.io.OutputStream;
import org.apache.xml.security.c14n.implementations.Canonicalizer11;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;

public class TransformC14N11 extends TransformSpi {
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        Canonicalizer11 canonicalizer11 = new Canonicalizer11(false);
        if (outputStream != null) {
            canonicalizer11.n = outputStream;
        }
        XMLSignatureInput xMLSignatureInput2 = new XMLSignatureInput(canonicalizer11.b(xMLSignatureInput));
        if (outputStream != null) {
            xMLSignatureInput2.k = outputStream;
        }
        return xMLSignatureInput2;
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        return a(xMLSignatureInput, (OutputStream) null, transform);
    }
}
