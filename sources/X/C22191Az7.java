package X;

/* renamed from: X.Az7  reason: case insensitive filesystem */
public final class C22191Az7 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $errorCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22191Az7(int i) {
        super(1);
        this.$errorCode = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U r3 = (AnonymousClass84U) obj;
        C18070vi.A0d(r3, 0);
        r3.A01("success", false);
        r3.A01("error", Integer.valueOf(this.$errorCode));
        return C27621Wu.A00;
    }
}
