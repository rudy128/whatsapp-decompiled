package X;

/* renamed from: X.0mk  reason: invalid class name and case insensitive filesystem */
public final class C13050mk extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0NO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13050mk(AnonymousClass0NO r2) {
        super(2);
        this.this$0 = r2;
    }

    public final void A00(AnonymousClass0XV r2, AnonymousClass1OS r3) {
        AnonymousClass0VQ r0 = this.this$0.A00;
        if (r0 != null) {
            r2.CJP(r0.A0B(r3));
            return;
        }
        throw AnonymousClass000.A0k("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((AnonymousClass0XV) obj, (AnonymousClass1OS) obj2);
        return C27621Wu.A00;
    }
}
