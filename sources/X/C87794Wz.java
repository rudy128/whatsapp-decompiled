package X;

/* renamed from: X.4Wz  reason: invalid class name and case insensitive filesystem */
public class C87794Wz {
    public int A00 = 0;
    public long A01;
    public String A02;
    public boolean A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass18K A05;
    public final C18180vt A06;

    public C87794Wz(AnonymousClass11P r3, AnonymousClass18K r4) {
        C18180vt r1 = AnonymousClass184.DEFAULT_SAMPLING_RATE;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r1;
    }

    public static void A00(C87794Wz r7, int i) {
        C81443zF r6 = new C81443zF();
        C17960vV.A0F(AnonymousClass000.A1W(r7.A02), "RevokeUiActionWamEventLogger/logNextEvent: A session must be started before logging.");
        r6.A02 = r7.A02;
        r6.A00 = Integer.valueOf(i);
        long A012 = AnonymousClass11P.A01(r7.A04);
        r6.A01 = Long.valueOf(A012 - r7.A01);
        r7.A01 = A012;
        r7.A05.CC4(r6);
    }
}
