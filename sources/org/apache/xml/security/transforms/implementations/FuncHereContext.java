package org.apache.xml.security.transforms.implementations;

import X.BE6;
import X.BE7;
import org.apache.xml.dtm.DTMManager;
import org.apache.xml.security.utils.I18n;
import org.apache.xpath.XPathContext;
import org.w3c.dom.Node;

public class FuncHereContext extends XPathContext {
    public FuncHereContext() {
    }

    public FuncHereContext(Node node, DTMManager dTMManager) {
        super(node);
        try {
            this.m_dtmManager = dTMManager;
        } catch (IllegalAccessError e) {
            StringBuffer A0s = BE6.A0s();
            A0s.append(I18n.b("endorsed.jdk1.4.0"));
            A0s.append(" Original message was \"");
            A0s.append(e.getMessage());
            throw new IllegalAccessError(BE7.A0n("\"", A0s));
        }
    }
}
