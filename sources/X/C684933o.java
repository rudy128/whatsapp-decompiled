package X;

/* renamed from: X.33o  reason: invalid class name and case insensitive filesystem */
public final class C684933o implements C22511BAs {
    public final AnonymousClass1SI A00;

    public C684933o(AnonymousClass1SI r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void C1A(C195629te r5, AnonymousClass8X1 r6, AnonymousClass206 r7) {
        C18070vi.A0n(r7, r6, r5);
        if (r7.A0w()) {
            long j = r7.A0y;
            C166388co A0X = C17880vN.A0X(r6);
            A0X.bitField1_ |= 16384;
            A0X.newsletterServerId_ = j;
        }
    }

    public void C1B(C193069pU r3, C166388co r4, AnonymousClass206 r5) {
        C18070vi.A0h(r4, r5);
        if ((r4.bitField1_ & 16384) != 0) {
            r5.A0y = r4.newsletterServerId_;
        }
    }
}
