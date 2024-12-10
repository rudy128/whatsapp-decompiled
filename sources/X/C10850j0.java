package X;

/* renamed from: X.0j0  reason: invalid class name and case insensitive filesystem */
public final class C10850j0 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22811Dh $hasIconRightsOverDescendants;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10850j0(C22811Dh r2) {
        super(1);
        this.$hasIconRightsOverDescendants = r2;
    }

    /* renamed from: A00 */
    public final AnonymousClass0CR invoke(AnonymousClass09P r3) {
        if (!r3.A01) {
            return AnonymousClass0CR.ContinueTraversal;
        }
        this.$hasIconRightsOverDescendants.element = false;
        return AnonymousClass0CR.CancelTraversal;
    }
}
