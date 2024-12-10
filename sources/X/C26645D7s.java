package X;

import java.util.List;

/* renamed from: X.D7s  reason: case insensitive filesystem */
public final class C26645D7s implements C28587E9b {
    public float A00 = -1.0f;
    public C40511up A01 = null;
    public C40511up A02;
    public final List A03;

    public boolean isEmpty() {
        return false;
    }

    private C40511up A00(float f) {
        List list = this.A03;
        C40511up r2 = (C40511up) list.get(list.size() - 1);
        if (f < r2.A01()) {
            int size = list.size() - 2;
            while (size >= 1) {
                r2 = (C40511up) list.get(size);
                if (this.A02 == r2 || f < r2.A01() || f >= r2.A00()) {
                    size--;
                }
            }
            return (C40511up) C108955ca.A0p(list);
        }
        return r2;
    }

    public C40511up BPw() {
        return this.A02;
    }

    public float BRI() {
        List list = this.A03;
        return ((C40511up) list.get(AnonymousClass3MX.A01(list))).A00();
    }

    public float BZY() {
        return ((C40511up) C108955ca.A0p(this.A03)).A01();
    }

    public boolean BeC(float f) {
        C40511up r0 = this.A01;
        C40511up r1 = this.A02;
        if (r0 == r1 && this.A00 == f) {
            return true;
        }
        this.A01 = r1;
        this.A00 = f;
        return false;
    }

    public boolean Bh2(float f) {
        C40511up r1 = this.A02;
        if (f >= r1.A01() && f < r1.A00()) {
            return !r1.A02();
        }
        this.A02 = A00(f);
        return true;
    }

    public C26645D7s(List list) {
        this.A03 = list;
        this.A02 = A00(0.0f);
    }
}
