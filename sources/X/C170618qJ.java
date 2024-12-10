package X;

import java.io.OutputStream;

/* renamed from: X.8qJ  reason: invalid class name and case insensitive filesystem */
public final class C170618qJ extends C179259He {
    public final C20003A2s A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170618qJ(AnonymousClass181 r3, C20003A2s a2s, OutputStream outputStream, Integer num) {
        super(r3, outputStream, num, 1);
        C18070vi.A0e(outputStream, 1, r3);
        C18070vi.A0d(a2s, 5);
        this.A00 = a2s;
    }

    public void A00(int i) {
        super.A00(i);
        this.A00.A04 += (long) i;
    }
}
