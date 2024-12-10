package X;

import java.io.InputStream;

/* renamed from: X.8qI  reason: invalid class name and case insensitive filesystem */
public final class C170608qI extends C179229Hb {
    public final C20003A2s A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170608qI(AnonymousClass181 r3, C20003A2s a2s, InputStream inputStream, Integer num) {
        super(r3, inputStream, num, 1);
        C18070vi.A0e(inputStream, 1, r3);
        C18070vi.A0d(a2s, 5);
        this.A00 = a2s;
    }

    public void A00(int i) {
        super.A00(i);
        this.A00.A03 += (long) i;
    }

    public void A01(long j) {
        super.A01(j);
        this.A00.A03 += j;
    }
}
