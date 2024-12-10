package X;

import java.util.List;

/* renamed from: X.D7r  reason: case insensitive filesystem */
public final class C26644D7r implements C28587E9b {
    public float A00 = -1.0f;
    public final C40511up A01;

    public boolean isEmpty() {
        return false;
    }

    public C40511up BPw() {
        return this.A01;
    }

    public float BRI() {
        return this.A01.A00();
    }

    public float BZY() {
        return this.A01.A01();
    }

    public boolean BeC(float f) {
        if (this.A00 == f) {
            return true;
        }
        this.A00 = f;
        return false;
    }

    public boolean Bh2(float f) {
        return !this.A01.A02();
    }

    public C26644D7r(List list) {
        this.A01 = (C40511up) C108955ca.A0p(list);
    }
}
