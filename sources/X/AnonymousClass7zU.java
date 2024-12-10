package X;

/* renamed from: X.7zU  reason: invalid class name */
public final class AnonymousClass7zU extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C135226rr $mediaUploadProgressParams;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zU(C135226rr r2) {
        super(1);
        this.$mediaUploadProgressParams = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("collection_id", this.$mediaUploadProgressParams.A01);
        A0a.A01("media_id", this.$mediaUploadProgressParams.A02);
        A0a.A01("upload_state", AnonymousClass84U.A00(new AnonymousClass7zT(this.$mediaUploadProgressParams)));
        return C27621Wu.A00;
    }
}
