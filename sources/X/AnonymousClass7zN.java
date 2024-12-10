package X;

/* renamed from: X.7zN  reason: invalid class name */
public final class AnonymousClass7zN extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C136136tK $addMediaUploadParams;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zN(C136136tK r2) {
        super(1);
        this.$addMediaUploadParams = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("media_name", this.$addMediaUploadParams.A03);
        A0a.A01("file_size_bytes", this.$addMediaUploadParams.A01);
        A0a.A01("preview_img_base64", this.$addMediaUploadParams.A05);
        A0a.A01("doc_page_count", this.$addMediaUploadParams.A00);
        return C27621Wu.A00;
    }
}
