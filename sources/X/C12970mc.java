package X;

/* renamed from: X.0mc  reason: invalid class name and case insensitive filesystem */
public final class C12970mc extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass0NY $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ float $focusedBorderThickness;
    public final /* synthetic */ C16110rj $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C16370s9 $shape;
    public final /* synthetic */ AnonymousClass0PR $tmp0_rcvr;
    public final /* synthetic */ float $unfocusedBorderThickness;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12970mc(C16110rj r2, AnonymousClass0PR r3, AnonymousClass0NY r4, C16370s9 r5, float f, float f2, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.$tmp0_rcvr = r3;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = r2;
        this.$colors = r4;
        this.$shape = r5;
        this.$focusedBorderThickness = f;
        this.$unfocusedBorderThickness = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C17130tn A0b = AnonymousClass000.A0b(obj, obj2);
        this.$tmp0_rcvr.A03(this.$interactionSource, this.$colors, A0b, this.$shape, this.$focusedBorderThickness, this.$unfocusedBorderThickness, AnonymousClass0L8.A00(this.$$changed), this.$$default, this.$enabled, this.$isError);
        return C27621Wu.A00;
    }
}
