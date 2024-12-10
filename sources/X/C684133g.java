package X;

/* renamed from: X.33g  reason: invalid class name and case insensitive filesystem */
public final class C684133g implements C22511BAs {
    public /* synthetic */ void C1B(C193069pU r1, C166388co r2, AnonymousClass206 r3) {
    }

    public void C1A(C195629te r7, AnonymousClass8X1 r8, AnonymousClass206 r9) {
        Long valueOf;
        boolean A16 = C18070vi.A16(r9, r8);
        if (r9.A0v.A02) {
            boolean A1R = AnonymousClass000.A1R(r9.A05);
            boolean A02 = C446824j.A02(r9.A0D(), 4);
            Long l = r9.A0U;
            if (l == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(l.longValue() - C17890vO.A03(r9.A05));
            }
            if (A1R && A02 && valueOf != null) {
                long A04 = C17880vN.A04(valueOf.longValue());
                C166388co A0X = C17880vN.A0X(r8);
                A0X.bitField0_ |= 1048576;
                A0X.ephemeralStartTimestamp_ = A04;
            }
        } else if (r9.A11(512)) {
            C166388co A0X2 = C17880vN.A0X(r8);
            A0X2.bitField0_ |= 8388608;
            A0X2.ephemeralOutOfSync_ = A16;
        }
    }
}
