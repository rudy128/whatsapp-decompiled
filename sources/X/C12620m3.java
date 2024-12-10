package X;

/* renamed from: X.0m3  reason: invalid class name and case insensitive filesystem */
public final class C12620m3 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0AT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12620m3(AnonymousClass0AT r2) {
        super(1);
        this.this$0 = r2;
    }

    public static final AnonymousClass0I1 A01(C06320Xv r7, C03380Hv r8, float f, long j, long j2, boolean z) {
        C02000Cg r2;
        long j3 = j2;
        long j4 = j;
        if (z) {
            j4 = AnonymousClass0QY.A03;
            j3 = r7.A00();
            r2 = C016909m.A00;
        } else {
            r2 = new C016809l(f, 4.0f, 0, 0);
        }
        return r7.A02(new C10450iM(r8, r2, j4, j3));
    }

    public static final AnonymousClass0I1 A00(C06320Xv r1) {
        return r1.A02(C11760kd.A00);
    }

    /* renamed from: A02 */
    public final AnonymousClass0I1 invoke(C06320Xv r16) {
        float ceil;
        C06320Xv r6 = r16;
        if (r6.CPQ(this.this$0.A00) < 0.0f || AnonymousClass0QG.A01(r6.A00()) <= 0.0f) {
            return A00(r6);
        }
        float f = this.this$0.A00;
        if (AnonymousClass000.A1P(Float.compare(f, 0.0f))) {
            ceil = 1.0f;
        } else {
            ceil = (float) Math.ceil((double) r6.CPQ(f));
        }
        float min = Math.min(ceil, (float) Math.ceil((double) (AnonymousClass0QG.A01(r6.A00()) / 2.0f)));
        float f2 = min / 2.0f;
        long A0p = AnonymousClass001.A0p(f2, f2);
        long j = AnonymousClass0QY.A03;
        long A0p2 = AnonymousClass001.A0p(AnonymousClass0QG.A02(r6.A00()) - min, AnonymousClass0QG.A00(r6.A00()) - min);
        boolean A1R = AnonymousClass000.A1R(((2.0f * min) > AnonymousClass0QG.A01(r6.A00()) ? 1 : ((2.0f * min) == AnonymousClass0QG.A01(r6.A00()) ? 0 : -1)));
        C01990Cf BHh = this.this$0.A02.BHh(r6, r6.A03(), r6.A00());
        if (BHh instanceof C015809b) {
            AnonymousClass0AT r5 = this.this$0;
            return r5.A02(r6, r5.A01, (C015809b) BHh, min, A0p, A0p2, A1R);
        } else if (BHh instanceof C015709a) {
            return A01(r6, this.this$0.A01, min, A0p, A0p2, A1R);
        } else {
            throw new AnonymousClass3EW();
        }
    }
}
