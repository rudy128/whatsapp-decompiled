package X;

/* renamed from: X.7zX  reason: invalid class name */
public final class AnonymousClass7zX extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C136626u7 $mediaUploadSuccessParams;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zX(C136626u7 r2) {
        super(1);
        this.$mediaUploadSuccessParams = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("cdn_url", this.$mediaUploadSuccessParams.A02);
        A0a.A01("direct_path", this.$mediaUploadSuccessParams.A04);
        A0a.A01("mime_type", this.$mediaUploadSuccessParams.A0C);
        A0a.A01("uploaded_file_size_bytes", this.$mediaUploadSuccessParams.A00);
        A0a.A01("encryption_metadata", AnonymousClass84U.A00(new AnonymousClass7zW(this.$mediaUploadSuccessParams)));
        return C27621Wu.A00;
    }
}
