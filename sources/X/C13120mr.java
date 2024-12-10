package X;

/* renamed from: X.0mr  reason: invalid class name and case insensitive filesystem */
public final class C13120mr extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ C17090tj $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13120mr(C17090tj r2, AnonymousClass1OS r3) {
        super(2);
        this.$content = r3;
        this.$modifier = r2;
    }

    public final void A00(C17130tn r4, int i) {
        if ((i & 11) != 2 || !r4.BZO()) {
            if (this.$content == null) {
                r4.COB(1275643845);
                AnonymousClass0P7.A01(r4, this.$modifier, 0);
            } else {
                r4.COB(1275643915);
                this.$content.invoke(r4, 0);
            }
            AnonymousClass0VR.A0U(r4);
            return;
        }
        r4.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
