package org.apache.xml.security.transforms.implementations;

import X.AnonymousClass3MW;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;

public class TransformXPointer extends TransformSpi {
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = "http://www.w3.org/TR/2001/WD-xptr-20010108";
        throw new TransformationException("signature.Transform.NotYetImplemented", A1a);
    }
}
