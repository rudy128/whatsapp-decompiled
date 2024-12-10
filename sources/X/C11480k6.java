package X;

/* renamed from: X.0k6  reason: invalid class name and case insensitive filesystem */
public final class C11480k6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ long $ambientColor;
    public final /* synthetic */ boolean $clip = false;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ C16370s9 $shape;
    public final /* synthetic */ long $spotColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11480k6(C16370s9 r2, float f, long j, long j2) {
        super(1);
        this.$elevation = f;
        this.$shape = r2;
        this.$ambientColor = j;
        this.$spotColor = j2;
    }

    public final void A00(C17760vB r3) {
        r3.CKi(r3.CPQ(this.$elevation));
        r3.CKj(this.$shape);
        r3.CIJ(this.$clip);
        r3.CHs(this.$ambientColor);
        r3.CKq(this.$spotColor);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C17760vB) obj);
        return C27621Wu.A00;
    }
}
