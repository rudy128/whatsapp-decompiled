package X;

/* renamed from: X.0iT  reason: invalid class name and case insensitive filesystem */
public final class C10520iT extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0U5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10520iT(AnonymousClass0U5 r2) {
        super(1);
        this.this$0 = r2;
    }

    public final long A00(Object obj) {
        C16300s2 r0 = (C16300s2) this.this$0.A02.get(obj);
        if (r0 != null) {
            return ((C26142Ct5) r0.getValue()).A03();
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C26142Ct5.A00(A00(obj));
    }
}
