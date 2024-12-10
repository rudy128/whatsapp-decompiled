package X;

/* renamed from: X.7zO  reason: invalid class name */
public final class AnonymousClass7zO extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C136136tK $addMediaUploadParams;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zO(C136136tK r2) {
        super(1);
        this.$addMediaUploadParams = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("collection_id", this.$addMediaUploadParams.A02);
        A0a.A01("media_id", this.$addMediaUploadParams.A04);
        A0a.A01("media_metadata", AnonymousClass84U.A00(new AnonymousClass7zN(this.$addMediaUploadParams)));
        return C27621Wu.A00;
    }
}
