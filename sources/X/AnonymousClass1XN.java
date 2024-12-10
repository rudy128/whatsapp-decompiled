package X;

import java.util.HashSet;

/* renamed from: X.1XN  reason: invalid class name */
public class AnonymousClass1XN {
    public AnonymousClass12L A00;
    public AnonymousClass00H A01;
    public Boolean A02;
    public final C18030ve A03;

    public HashSet A00() {
        String A012 = C18020vd.A01(C18040vf.A02, this.A03, 2246);
        if (A012 == null || A012.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (String add : A012.split(":")) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public boolean A01() {
        C18030ve r2 = this.A03;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 1890) || !C18020vd.A05(r1, r2, 450)) {
            return false;
        }
        return true;
    }

    public boolean A02() {
        AnonymousClass00H r0;
        if (!C18020vd.A05(C18040vf.A02, this.A03, 450)) {
            return false;
        }
        if (!(this.A02 != null || (r0 = this.A01) == null || r0.get() == null)) {
            C27091Ur r1 = (C27091Ur) this.A01.get();
            this.A02 = Boolean.valueOf(r1.A06(r1.A04.A00));
        }
        Boolean bool = this.A02;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean A04() {
        C18030ve r2 = this.A03;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 450) || !C18020vd.A05(r1, r2, 4690)) {
            return false;
        }
        return true;
    }

    public boolean A05() {
        C18030ve r2 = this.A03;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 450) || !C18020vd.A05(r1, r2, 3587)) {
            return false;
        }
        return true;
    }

    public boolean A06() {
        C18030ve r2 = this.A03;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 450) || !C18020vd.A05(r1, r2, 4492)) {
            return false;
        }
        return true;
    }

    public boolean A07() {
        C18030ve r2 = this.A03;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 450) || !C18020vd.A05(r1, r2, 3984)) {
            return false;
        }
        return true;
    }

    public AnonymousClass1XN(C18030ve r1, AnonymousClass12L r2) {
        this.A03 = r1;
        this.A00 = r2;
    }

    public boolean A03() {
        if (A02()) {
            if (!C18020vd.A05(C18040vf.A02, this.A03, 4486)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
