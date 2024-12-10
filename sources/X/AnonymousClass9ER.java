package X;

/* renamed from: X.9ER  reason: invalid class name */
public final class AnonymousClass9ER extends C198999zG implements AnonymousClass3LS {
    public final C178169Cb A00;
    public final AnonymousClass9D3 A01;
    public final C29621ca A02;

    public void BAb(C198619yd r6) {
        C18070vi.A0d(r6, 0);
        AnonymousClass9D3 r2 = this.A01;
        String str = r2.A04;
        String str2 = r2.A02;
        C178169Cb r3 = this.A00;
        if ("gcm".equals(str)) {
            r6.A02.element = str2;
            Long l = r2.A00;
            if (l != null) {
                r6.A00.element = l.toString();
            }
        } else if ("fbns".equals(str)) {
            r6.A01.element = str2;
        }
        if (r3 != null) {
            r6.A03.element = r3.A01;
        }
        Long l2 = r2.A01;
        if (l2 != null) {
            r6.A04.element = l2.toString();
        }
        String str3 = r2.A03;
        if (str3 != null) {
            r6.A05.element = str3;
        }
        String str4 = r2.A05;
        if (str4 != null) {
            r6.A06.element = str4;
        }
    }

    public AnonymousClass9ER(C29621ca r1, C178169Cb r2, AnonymousClass9D3 r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r1;
        this.A00 = r1;
    }
}
