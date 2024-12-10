package X;

/* renamed from: X.0mj  reason: invalid class name and case insensitive filesystem */
public final class C13040mj extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C17130tn $this_materialize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13040mj(C17130tn r2) {
        super(2);
        this.$this_materialize = r2;
    }

    /* renamed from: A00 */
    public final C17090tj invoke(C17450ug r5, C17090tj r6) {
        boolean z = r5 instanceof AnonymousClass0Ba;
        C17090tj r52 = r5;
        if (z) {
            C36001nB A00 = ((AnonymousClass0Ba) r5).A00();
            C18070vi.A0z(A00, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            C41681wt.A04(A00, 3);
            r52 = C04470Nn.A00(this.$this_materialize, (C17090tj) A00.invoke(C17090tj.A00, this.$this_materialize, 0));
        }
        return r6.CP5(r52);
    }
}
