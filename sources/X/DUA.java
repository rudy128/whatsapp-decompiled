package X;

import java.security.cert.PolicyNode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DUA implements PolicyNode {
    public PolicyNode A00;
    public List A01;
    public Set A02;
    public boolean A03;
    public int A04;
    public String A05;
    public Set A06;

    public DUA(String str, PolicyNode policyNode, List list, Set set, Set set2, int i, boolean z) {
        this.A01 = list;
        this.A04 = i;
        this.A02 = set;
        this.A00 = policyNode;
        this.A06 = set2;
        this.A05 = str;
        this.A03 = z;
    }

    public Object clone() {
        return A01();
    }

    public Iterator getChildren() {
        return this.A01.iterator();
    }

    public int getDepth() {
        return this.A04;
    }

    public Set getExpectedPolicies() {
        return this.A02;
    }

    public PolicyNode getParent() {
        return this.A00;
    }

    public Set getPolicyQualifiers() {
        return this.A06;
    }

    public String getValidPolicy() {
        return this.A05;
    }

    public boolean isCritical() {
        return this.A03;
    }

    public String toString() {
        return A00("");
    }

    public String A00(String str) {
        StringBuffer A0i = BE8.A0i(str);
        A0i.append(this.A05);
        A0i.append(" {\n");
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i < list.size()) {
                A0i.append(((DUA) list.get(i)).A00(AnonymousClass000.A0y("    ", AnonymousClass000.A11(str))));
                i++;
            } else {
                A0i.append(str);
                return BE7.A0n("}\n", A0i);
            }
        }
    }

    public DUA A01() {
        HashSet A12 = C17880vN.A12();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            A12.add(new String(C17880vN.A0v(it)));
        }
        HashSet A122 = C17880vN.A12();
        Iterator it2 = this.A06.iterator();
        while (it2.hasNext()) {
            A122.add(new String(C17880vN.A0v(it2)));
        }
        DUA dua = new DUA(new String(this.A05), (PolicyNode) null, AnonymousClass000.A13(), A12, A122, this.A04, this.A03);
        for (DUA A012 : this.A01) {
            DUA A013 = A012.A01();
            A013.A00 = dua;
            dua.A01.add(A013);
            A013.A00 = dua;
        }
        return dua;
    }
}
