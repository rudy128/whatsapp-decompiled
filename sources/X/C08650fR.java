package X;

/* renamed from: X.0fR  reason: invalid class name and case insensitive filesystem */
public final class C08650fR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C17250uM $composition;
    public final /* synthetic */ C06990aB $modifiedValues;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08650fR(C17250uM r2, C06990aB r3) {
        super(0);
        this.$modifiedValues = r3;
        this.$composition = r2;
    }

    public final void A00() {
        C06990aB r0 = this.$modifiedValues;
        C17250uM r5 = this.$composition;
        Object[] A04 = r0.A04();
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            Object obj = A04[i];
            C18070vi.A0z(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            r5.CDl(obj);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        A00();
        return C27621Wu.A00;
    }
}
