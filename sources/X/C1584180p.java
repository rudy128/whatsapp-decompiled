package X;

/* renamed from: X.80p  reason: invalid class name and case insensitive filesystem */
public final class C1584180p extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C31761g5 $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1584180p(C31761g5 r2) {
        super(1);
        this.$continuation = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A0M;
        C29621ca r4 = (C29621ca) obj;
        C18070vi.A0d(r4, 0);
        C29621ca A0K = r4.A0K("fbid");
        if (A0K == null || (A0M = A0K.A0M()) == null || A0M.length() == 0) {
            this.$continuation.resumeWith(new AnonymousClass6EJ(AnonymousClass000.A0n("Received empty identifier")));
        } else {
            this.$continuation.resumeWith(new AnonymousClass6EK(A0M));
        }
        return C27621Wu.A00;
    }
}
