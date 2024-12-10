package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8gX  reason: invalid class name and case insensitive filesystem */
public final class C167538gX extends C36821oW {
    public final C36801oU A00;
    public final C36821oW A01;
    public final String A02;

    public boolean A01() {
        AtomicBoolean atomicBoolean = this.A00.A0W;
        if (!atomicBoolean.get() || !this.A01.A01() || !atomicBoolean.get()) {
            return false;
        }
        return true;
    }

    public C167538gX(C36801oU r1, C36821oW r2, String str) {
        C18070vi.A0k(r2, r1);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        return this.A02;
    }
}
