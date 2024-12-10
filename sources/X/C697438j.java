package X;

/* renamed from: X.38j  reason: invalid class name and case insensitive filesystem */
public final class C697438j implements C447524q {
    public final AnonymousClass00H A00;

    public C697438j(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCZ(AnonymousClass206 r6, C49702Rn r7) {
        C18070vi.A0d(r6, 0);
        if (r6.A0G == 0) {
            int A0D = r6.A0D();
            if (A0D != 0 && A0D != 1 && A0D != 2) {
                return;
            }
            if (!r6.A0t() || r6.A1D == null) {
                A16 a16 = (A16) this.A00.get();
                C18030ve r3 = a16.A01;
                C18040vf r1 = C18040vf.A02;
                Class<C697438j> cls = C697438j.class;
                if (C18020vd.A00(r1, r3, 8860) != 0 && a16.A01(r6) && C18020vd.A05(r1, r3, 11869)) {
                    r6.A0o = true;
                    byte[] bArr = new byte[32];
                    C22691Cv.A00().nextBytes(bArr);
                    r6.A1D = bArr;
                }
                if (r7 != null) {
                    throw C17900vP.A07(cls);
                }
            }
        }
    }
}
