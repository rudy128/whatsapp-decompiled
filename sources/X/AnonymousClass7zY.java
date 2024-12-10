package X;

/* renamed from: X.7zY  reason: invalid class name */
public final class AnonymousClass7zY extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C136626u7 $mediaUploadSuccessParams;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zY(C136626u7 r2) {
        super(1);
        this.$mediaUploadSuccessParams = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("collection_id", this.$mediaUploadSuccessParams.A03);
        A0a.A01("media_id", this.$mediaUploadSuccessParams.A09);
        A0a.A01("success_state", AnonymousClass84U.A00(new AnonymousClass7zX(this.$mediaUploadSuccessParams)));
        return C27621Wu.A00;
    }
}
