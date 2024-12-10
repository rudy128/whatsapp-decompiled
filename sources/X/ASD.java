package X;

public final class ASD implements C436920n {
    public AnonymousClass206 CBH(C195239t1 r6) {
        C18070vi.A0d(r6, 0);
        C165928bz r1 = r6.A01;
        if ((r1.bitField0_ & 1) == 0) {
            return null;
        }
        AnonymousClass205 r0 = r6.A02;
        long j = r6.A00;
        String str = r1.conversation_;
        AnonymousClass210 r12 = new AnonymousClass210(r0, j);
        r12.A0i(AnonymousClass1EG.A0E(str, 65536));
        return r12;
    }

    public void BDc(C184489b2 r4, AnonymousClass206 r5) {
        boolean A15 = C18070vi.A15(r5, r4);
        if (r5 instanceof AnonymousClass210) {
            AnonymousClass8X8 r0 = r4.A00;
            String A0P = r5.A0P();
            C166418cr A04 = AnonymousClass8X8.A04(r0, A0P);
            A04.bitField0_ |= 1;
            A04.conversation_ = A0P;
            return;
        }
        throw AnonymousClass8BW.A0S(A15 ? 1 : 0);
    }
}
