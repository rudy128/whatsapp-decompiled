package org.apache.xml.security.utils;

import X.C17880vN;
import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class HelperNodeList implements NodeList {
    public ArrayList a;
    public boolean b;

    public HelperNodeList() {
        this(false);
    }

    public int getLength() {
        return this.a.size();
    }

    public Node item(int i) {
        return (Node) this.a.get(i);
    }

    public HelperNodeList(boolean z) {
        this.a = C17880vN.A0z(20);
        this.b = z;
    }
}
