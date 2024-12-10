package X;

/* renamed from: X.9kJ  reason: invalid class name and case insensitive filesystem */
public final class C190059kJ {
    public final AnonymousClass18K A00;
    public final AnonymousClass00H A01;

    public final void A00(String str, String str2, int i, int i2, int i3, int i4) {
        if (i != 0) {
            C171238rO r1 = new C171238rO();
            r1.A04 = (String) ((AnonymousClass2ZS) this.A01.get()).A00.get();
            r1.A06 = str;
            r1.A02 = Integer.valueOf(i);
            r1.A03 = Integer.valueOf(i2);
            r1.A00 = Integer.valueOf(i3);
            r1.A01 = Integer.valueOf(i4);
            r1.A05 = str2;
            this.A00.CC7(r1);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmailVerificationLogger/logEmailAction/failed to log action; entrypoint: ");
        A10.append(i);
        A10.append(", surface: ");
        A10.append(i2);
        C17900vP.A0k("; action: ", A10, i3);
    }

    public C190059kJ(AnonymousClass18K r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
