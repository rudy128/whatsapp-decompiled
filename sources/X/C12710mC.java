package X;

/* renamed from: X.0mC  reason: invalid class name and case insensitive filesystem */
public final class C12710mC extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0NO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12710mC(AnonymousClass0NO r2) {
        super(2);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass0D1 r3 = (AnonymousClass0D1) obj2;
        AnonymousClass0VQ r0 = this.this$0.A00;
        if (r0 != null) {
            r0.A04 = r3;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0k("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
