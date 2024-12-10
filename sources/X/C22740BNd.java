package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.BNd  reason: case insensitive filesystem */
public abstract class C22740BNd extends C22741BNe implements E7L, EAF {
    public String A00 = null;
    public List A01 = AnonymousClass000.A13();
    public Set A02 = null;
    public Set A03 = null;
    public Set A04 = null;
    public Set A05 = null;

    public Set Ba4() {
        return null;
    }

    public void BB4(C24482C5y c5y) {
        if (!(this instanceof BNX) || (c5y instanceof C28489E3t)) {
            this.A01.add(c5y);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Text content elements cannot contain ");
        A10.append(c5y);
        throw E05.A00(AnonymousClass000.A0y(" elements.", A10));
    }

    public List BOi() {
        return this.A01;
    }

    public String BYC() {
        return this.A00;
    }

    public Set BYD() {
        return this.A02;
    }

    public Set BYE() {
        return this.A03;
    }

    public Set BYF() {
        return this.A04;
    }

    public void CKO(String str) {
        this.A00 = str;
    }

    public void CKP(Set set) {
        this.A02 = set;
    }

    public void CKQ(Set set) {
        this.A03 = set;
    }

    public void CKR(Set set) {
        this.A04 = set;
    }

    public void CL1(Set set) {
        this.A05 = set;
    }
}
