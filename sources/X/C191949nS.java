package X;

/* renamed from: X.9nS  reason: invalid class name and case insensitive filesystem */
public class C191949nS {
    public C188059go A00;
    public AnonymousClass1QE A01 = AnonymousClass1QE.A00("BrazilNetworkManager", "onboarding", "BR");
    public boolean A02;
    public boolean A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass118 A07;
    public final AnonymousClass1KH A08;
    public final C20074A6a A09;
    public final AnonymousClass1QD A0A;
    public final C31061ex A0B;
    public final A54 A0C;
    public final C191389mW A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass11E A0H;

    public void A00(String str) {
        C188059go r0 = this.A00;
        if (r0 == null) {
            String A072 = this.A0A.A07();
            if (A072 == null) {
                this.A01.A06("No wallet Id stored on client, ELO node cannot be inserted in request");
            }
            r0 = C188059go.A00((String) null, str, A072);
            this.A00 = r0;
        }
        r0.A02 = str;
    }

    public C191949nS(AnonymousClass1KB r4, AnonymousClass11S r5, AnonymousClass11E r6, AnonymousClass11P r7, AnonymousClass118 r8, AnonymousClass1KH r9, C20074A6a a6a, AnonymousClass1QD r11, C31061ex r12, A54 a54, C191389mW r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17) {
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r4;
        this.A05 = r5;
        this.A08 = r9;
        this.A0F = r15;
        this.A0A = r11;
        this.A0B = r12;
        this.A0D = r14;
        this.A09 = a6a;
        this.A0G = r16;
        this.A0H = r6;
        this.A0C = a54;
        this.A0E = r17;
    }
}
