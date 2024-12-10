package X;

import com.whatsapp.infra.graphql.BaseMexCallback;

/* renamed from: X.9nC  reason: invalid class name and case insensitive filesystem */
public final class C191799nC {
    public final AnonymousClass5WY A00;
    public final C184499b3 A01;
    public final A2F A02;
    public final C20998Acq A03;
    public final AnonymousClass1PX A04;
    public final long A05;
    public final C33051iB A06;
    public final C192659ol A07;
    public final C191019lt A08;
    public final AnonymousClass1OZ A09;

    public C191799nC(AnonymousClass5WY r9, C35021lW r10, C18030ve r11, C184499b3 r12, C33051iB r13, C192659ol r14, C191019lt r15, AnonymousClass1PX r16, AnonymousClass1OZ r17, long j, boolean z) {
        C18070vi.A0g(r14, 3, r15);
        AnonymousClass1OZ r2 = r17;
        C18070vi.A0q(r2, r12, r11);
        this.A00 = r9;
        this.A06 = r13;
        this.A07 = r14;
        this.A04 = r16;
        this.A08 = r15;
        this.A09 = r2;
        this.A01 = r12;
        this.A05 = j;
        this.A02 = new A2F(r9, r10, r2.A0B(), this.A04.A00(((AIj) this.A00).A02), z);
        this.A03 = new C20998Acq(r11, this, r13, r14);
    }

    public void A00() {
        C33051iB r4 = this.A06;
        if (r4 instanceof BaseMexCallback) {
            A2F a2f = this.A02;
            if (!a2f.A07) {
                BaseMexCallback baseMexCallback = (BaseMexCallback) r4;
                C191019lt r1 = this.A08;
                baseMexCallback.A00 = a2f;
                baseMexCallback.A01 = r1;
                r1.A03.get();
                baseMexCallback.A02 = AnonymousClass8BU.A0l(r1.A00);
            }
        }
        String str = ((AIj) this.A00).A02;
        A2F a2f2 = this.A02;
        String str2 = a2f2.A06;
        if (str2 == null) {
            r4.Btr(new C172798u2(AnonymousClass001.A1H("Unable to find persisted ID for operation named ", str, AnonymousClass000.A10())));
        } else if (a2f2.A07) {
            C192659ol r3 = this.A07;
            Long A042 = AnonymousClass1YD.A04(str2);
            if (A042 == null) {
                r4.Btr(new C172798u2(AnonymousClass001.A1H("Unable to find persisted ID for operation named ", str, AnonymousClass000.A10())));
                return;
            }
            C184499b3 r6 = this.A01;
            C197859xN r5 = new C197859xN(a2f2, A042);
            C131206ki r7 = r6.A01;
            C35021lW r8 = r5.A00.A01;
            if (r8 == null) {
                r8 = new C35021lW("COMMON", true);
            }
            r7.A01(r8, (AnonymousClass6WV) null, new C20655ATn(r6, r5, 6), r5.A01.longValue()).CBv(new C20666ATy(a2f2, r4, r3));
        } else {
            AnonymousClass1OZ r0 = this.A09;
            String str3 = a2f2.A04;
            r0.A0N(this.A03, a2f2.A02, str3, 341, this.A05);
        }
    }
}
