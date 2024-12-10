package X;

/* renamed from: X.9oo  reason: invalid class name and case insensitive filesystem */
public abstract class C192689oo {
    public final int A00;
    public final C222119a A01;
    public final AnonymousClass19T A02;
    public final AnonymousClass11P A03;
    public final C19830z4 A04;

    public final void A00(int i, String str) {
        C18070vi.A0d(str, 1);
        C222119a r5 = this.A01;
        r5.A0E(str, true, i);
        r5.A09("timestamp_ms", i, System.currentTimeMillis(), true);
        AnonymousClass19T r3 = r5.A07;
        int i2 = r5.A05.A06;
        r3.markerAnnotate(i2, i, "is_debug_build", false);
        String A0h = this.A04.A0h();
        C18070vi.A0X(A0h);
        r3.markerAnnotate(i2, i, "is_graphql_prod", C108975cc.A0d(A0h).equals("whatsapp.com"));
    }

    public final void A01(int i, String str, String str2) {
        C18070vi.A0d(str2, 2);
        C222119a r0 = this.A01;
        r0.A07.markerAnnotate(r0.A05.A06, i, str, str2);
    }

    public C192689oo(AnonymousClass11P r15, AnonymousClass118 r16, C19830z4 r17, C18030ve r18, AnonymousClass18K r19, AnonymousClass19V r20, AnonymousClass19Y r21, AnonymousClass19T r22, AnonymousClass198 r23, AnonymousClass10I r24, String str, int i) {
        int i2 = i;
        this.A00 = i2;
        this.A03 = r15;
        this.A04 = r17;
        AnonymousClass19T r9 = r22;
        this.A02 = r9;
        C222119a r2 = new C222119a(r15, r16, r18, r19, r20, r21, r9, r23, r24, str, i2);
        r2.A05.A04 = true;
        this.A01 = r2;
    }
}
