package X;

import java.security.SecureRandom;

/* renamed from: X.705  reason: invalid class name */
public class AnonymousClass705 {
    public int A00;
    public boolean A01;
    public final int A02;
    public final AnonymousClass1NV A03;

    public static AnonymousClass705 A00() {
        return new AnonymousClass705(3, C20113A7w.A0L);
    }

    public synchronized Long A01() {
        Long l;
        if (A04()) {
            l = this.A03.A01();
        } else {
            l = null;
        }
        return l;
    }

    public synchronized void A02() {
        this.A01 = true;
    }

    public synchronized boolean A03() {
        return this.A01;
    }

    public synchronized boolean A04() {
        int i;
        i = this.A00;
        this.A00 = i + 1;
        return AnonymousClass000.A1U(i, this.A02);
    }

    public AnonymousClass705(int i, long j) {
        this.A02 = i;
        SecureRandom A002 = C22691Cv.A00();
        C18070vi.A0d(A002, 1);
        this.A03 = new AnonymousClass1NV(A002, (long) i, j, 1000);
    }
}
