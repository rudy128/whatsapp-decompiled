package X;

/* renamed from: X.0kB  reason: invalid class name and case insensitive filesystem */
public final class C11510kB extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C16300s2 $baseRotation;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C16300s2 $currentRotation;
    public final /* synthetic */ C16300s2 $endAngle;
    public final /* synthetic */ C16300s2 $startAngle;
    public final /* synthetic */ C016809l $stroke;
    public final /* synthetic */ float $strokeWidth;
    public final /* synthetic */ long $trackColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11510kB(C16300s2 r2, C16300s2 r3, C16300s2 r4, C16300s2 r5, C016809l r6, float f, long j, long j2) {
        super(1);
        this.$trackColor = j;
        this.$stroke = r6;
        this.$currentRotation = r2;
        this.$endAngle = r3;
        this.$startAngle = r4;
        this.$baseRotation = r5;
        this.$strokeWidth = f;
        this.$color = j2;
    }

    public final void A00(C17770vC r11) {
        C18070vi.A0d(r11, 0);
        AnonymousClass0QN.A05(r11, this.$stroke, 0.0f, 360.0f, this.$trackColor);
        float abs = Math.abs(AnonymousClass001.A06(this.$endAngle) - AnonymousClass001.A06(this.$startAngle));
        float A06 = (((AnonymousClass001.A06(this.$currentRotation) * 216.0f) % 360.0f) - 0.049804688f) + AnonymousClass001.A06(this.$baseRotation);
        float f = this.$strokeWidth;
        long j = this.$color;
        AnonymousClass0QN.A04(r11, this.$stroke, AnonymousClass001.A06(this.$startAngle) + A06, f, abs, j);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C17770vC) obj);
        return C27621Wu.A00;
    }
}
