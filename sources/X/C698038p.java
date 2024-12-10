package X;

/* renamed from: X.38p  reason: invalid class name and case insensitive filesystem */
public final class C698038p implements AnonymousClass3LJ {
    public final AnonymousClass00H A00;

    public C698038p(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCa(AnonymousClass206 r7, C49702Rn r8, int i, boolean z) {
        BD1 A02;
        BD1 A022;
        C18070vi.A0d(r7, 0);
        AW0 A002 = AnonymousClass25B.A00(r7);
        if (A002 != null) {
            AnonymousClass1QS r0 = (AnonymousClass1QS) this.A00.get();
            AnonymousClass1QS.A00(r0);
            AnonymousClass1QR r3 = r0.A04;
            C18070vi.A0X(r3);
            AW0 A0N = r3.A0N(A002.A0L, A002.A0K, -1);
            if (A0N != null) {
                AnonymousClass8pG r02 = A0N.A0A;
                if (!(r02 == null && ((A022 = r3.A00.A02(A0N.A0G, A0N.A0I)) == null || (r02 = A022.BdL()) == null))) {
                    synchronized (A0N) {
                        AnonymousClass8pG r1 = A0N.A0A;
                        if (r1 == null) {
                            A0N.A0A = r02;
                            r1 = r02;
                        }
                        r1.A04 = true;
                    }
                    r3.A0c(A0N);
                }
            } else {
                AnonymousClass8pG r03 = A002.A0A;
                if (!(r03 == null && ((A02 = r3.A00.A02(A002.A0G, A002.A0I)) == null || (r03 = A02.BdL()) == null))) {
                    synchronized (A002) {
                        AnonymousClass8pG r12 = A002.A0A;
                        if (r12 == null) {
                            A002.A0A = r03;
                            r12 = r03;
                        }
                        r12.A04 = true;
                    }
                    r3.A0c(A002);
                }
            }
            if (r8 != null) {
                throw C17900vP.A07(C698038p.class);
            }
        }
    }
}
