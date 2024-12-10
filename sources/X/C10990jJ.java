package X;

/* renamed from: X.0jJ  reason: invalid class name and case insensitive filesystem */
public final class C10990jJ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $defaultErrorMessage;
    public final /* synthetic */ boolean $isError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10990jJ(boolean z, String str) {
        super(1);
        this.$isError = z;
        this.$defaultErrorMessage = str;
    }

    public final void A00(C16520sO r3) {
        C18070vi.A0d(r3, 0);
        if (this.$isError) {
            r3.CHj(C03150Gu.A05, this.$defaultErrorMessage);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C16520sO) obj);
        return C27621Wu.A00;
    }
}
