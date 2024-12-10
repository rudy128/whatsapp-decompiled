package X;

import java.util.List;

/* renamed from: X.5jb  reason: invalid class name and case insensitive filesystem */
public final class C111365jb extends C24490C6i {
    public List A00;
    public List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        return this.A01.get(i).equals(this.A00.get(i2));
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass70A.A00((AnonymousClass70A) this.A01.get(i), (AnonymousClass70A) this.A00.get(i2));
    }
}
