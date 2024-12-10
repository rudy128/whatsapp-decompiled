package X;

/* renamed from: X.33m  reason: invalid class name and case insensitive filesystem */
public final class C684733m implements C22511BAs {
    public final AnonymousClass1SI A00;

    public C684733m(AnonymousClass1SI r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void C1A(C195629te r4, AnonymousClass8X1 r5, AnonymousClass206 r6) {
        boolean A16 = C18070vi.A16(r6, r5);
        C18070vi.A0d(r4, 2);
        if (r6.A0l) {
            C166388co A0X = C17880vN.A0X(r5);
            A0X.bitField0_ |= 256;
            A0X.broadcast_ = A16;
        }
    }

    public void C1B(C193069pU r2, C166388co r3, AnonymousClass206 r4) {
        C18070vi.A0h(r3, r4);
        if ((r3.bitField0_ & 256) != 0) {
            r4.A0l = r3.broadcast_;
        }
    }
}
