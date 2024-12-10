package X;

/* renamed from: X.0o3  reason: invalid class name and case insensitive filesystem */
public final class C13840o3 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ AnonymousClass0J3 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C16110rj $interactionSource;
    public final /* synthetic */ float $maxBound;
    public final /* synthetic */ float $minBound;
    public final /* synthetic */ C16140rm $this_SwitchImpl;
    public final /* synthetic */ AnonymousClass1OS $thumbContent;
    public final /* synthetic */ C16370s9 $thumbShape;
    public final /* synthetic */ C16300s2 $thumbValue;
    public final /* synthetic */ float $uncheckedThumbDiameter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13840o3(C16110rj r2, C16140rm r3, AnonymousClass0J3 r4, C16300s2 r5, C16370s9 r6, AnonymousClass1OS r7, float f, float f2, float f3, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.$this_SwitchImpl = r3;
        this.$checked = z;
        this.$enabled = z2;
        this.$colors = r4;
        this.$thumbValue = r5;
        this.$thumbContent = r7;
        this.$interactionSource = r2;
        this.$thumbShape = r6;
        this.$uncheckedThumbDiameter = f;
        this.$minBound = f2;
        this.$maxBound = f3;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public final void A00(C17130tn r16) {
        C16140rm r2 = this.$this_SwitchImpl;
        boolean z = this.$checked;
        boolean z2 = this.$enabled;
        C17130tn r4 = r16;
        AnonymousClass0QL.A04(this.$interactionSource, r2, this.$colors, r4, this.$thumbValue, this.$thumbShape, this.$thumbContent, this.$uncheckedThumbDiameter, this.$minBound, this.$maxBound, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), z, z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
