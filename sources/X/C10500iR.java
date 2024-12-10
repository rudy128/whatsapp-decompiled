package X;

/* renamed from: X.0iR  reason: invalid class name and case insensitive filesystem */
public final class C10500iR extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ long $borderSize;
    public final /* synthetic */ C016809l $borderStroke;
    public final /* synthetic */ C03380Hv $brush;
    public final /* synthetic */ long $cornerRadius;
    public final /* synthetic */ boolean $fillArea;
    public final /* synthetic */ float $halfStroke;
    public final /* synthetic */ float $strokeWidth;
    public final /* synthetic */ long $topLeft;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10500iR(C03380Hv r2, C016809l r3, float f, float f2, long j, long j2, long j3, boolean z) {
        super(1);
        this.$fillArea = z;
        this.$brush = r2;
        this.$cornerRadius = j;
        this.$halfStroke = f;
        this.$strokeWidth = f2;
        this.$topLeft = j2;
        this.$borderSize = j3;
        this.$borderStroke = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C03380Hv r11;
        long j;
        long j2;
        long A00;
        C02000Cg r12;
        C17480uj r10 = (C17480uj) obj;
        r10.BJR();
        if (this.$fillArea) {
            r11 = this.$brush;
            A00 = this.$cornerRadius;
            j = AnonymousClass0QY.A03;
            j2 = AnonymousClass0LH.A01(r10.BZL(), j);
            r12 = C016909m.A00;
        } else {
            long j3 = this.$cornerRadius;
            long j4 = C04140Lz.A00;
            float A02 = AnonymousClass001.A02(j3);
            float f = this.$halfStroke;
            if (A02 < f) {
                float f2 = this.$strokeWidth;
                long BZL = r10.BZL();
                C03380Hv r9 = this.$brush;
                AnonymousClass0t6 BQs = r10.BQs();
                long BZL2 = BQs.BZL();
                AnonymousClass0WZ.A00(BQs).BF0(f2, f2, AnonymousClass0QG.A02(BZL) - f2, AnonymousClass0QG.A00(BZL) - f2, 0);
                long j5 = AnonymousClass0QY.A03;
                C03380Hv r112 = r9;
                r10.BJk(r112, C016909m.A00, j5, AnonymousClass0LH.A01(r10.BZL(), j5), j3);
                AnonymousClass001.A1P(BQs, BZL2);
                return C27621Wu.A00;
            }
            r11 = this.$brush;
            j = this.$topLeft;
            j2 = this.$borderSize;
            A00 = C02200Dc.A00(f, j3);
            r12 = this.$borderStroke;
        }
        r10.BJk(r11, r12, j, j2, A00);
        return C27621Wu.A00;
    }
}
