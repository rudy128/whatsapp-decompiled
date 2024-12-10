package X;

/* renamed from: X.0n7  reason: invalid class name and case insensitive filesystem */
public final class C13260n7 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ AnonymousClass0tB $contentPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13260n7(AnonymousClass0tB r2, C36001nB r3, int i) {
        super(2);
        this.$contentPadding = r2;
        this.$content = r3;
        this.$$dirty = i;
    }

    public final void A00(C17130tn r6, int i) {
        if ((i & 11) != 2 || !r6.BZO()) {
            AnonymousClass0PA.A02(r6, ((C04690Oj) r6.BFh(C04050Lq.A00)).A02(), AnonymousClass0LC.A00(r6, new C13250n6(this.$contentPadding, this.$content, this.$$dirty), -2136309793), 48);
        } else {
            r6.CNR();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
