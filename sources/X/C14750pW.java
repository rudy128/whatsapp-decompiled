package X;

/* renamed from: X.0pW  reason: invalid class name and case insensitive filesystem */
public final class C14750pW extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ AnonymousClass0NY $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C16110rj $interactionSource;
    public final /* synthetic */ boolean $isError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14750pW(C16110rj r2, AnonymousClass0NY r3, int i, boolean z, boolean z2) {
        super(3);
        this.$colors = r3;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = r2;
        this.$$dirty1 = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C17130tn A0b = AnonymousClass000.A0b(obj2, obj3);
        A0b.COB(-502832279);
        long A0V = AnonymousClass000.A0V(this.$colors.A01(this.$interactionSource, A0b, this.$enabled, this.$isError));
        AnonymousClass0VR.A0T(A0b);
        return new C05100Qk(A0V);
    }
}
