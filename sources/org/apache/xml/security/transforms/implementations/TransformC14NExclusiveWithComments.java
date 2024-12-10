package org.apache.xml.security.transforms.implementations;

import java.io.OutputStream;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315Excl;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.utils.ElementProxy;
import org.apache.xml.security.utils.XMLUtils;

public class TransformC14NExclusiveWithComments extends TransformSpi {
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        return a(xMLSignatureInput, (OutputStream) null, transform);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [org.apache.xml.security.transforms.params.InclusiveNamespaces, org.apache.xml.security.utils.ElementProxy] */
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        String str;
        try {
            if (transform.c("http://www.w3.org/2001/10/xml-exc-c14n#", "InclusiveNamespaces") == 1) {
                str = new ElementProxy(XMLUtils.a(transform.k.getFirstChild(), "http://www.w3.org/2001/10/xml-exc-c14n#", "InclusiveNamespaces", 0), transform.l).a();
            } else {
                str = null;
            }
            Canonicalizer20010315Excl canonicalizer20010315Excl = new Canonicalizer20010315Excl(true);
            if (outputStream != null) {
                canonicalizer20010315Excl.n = outputStream;
            }
            return new XMLSignatureInput(canonicalizer20010315Excl.a(xMLSignatureInput, str));
        } catch (XMLSecurityException e) {
            throw new CanonicalizationException("empty", (Exception) e);
        }
    }
}
