package X;

/* renamed from: X.7zW  reason: invalid class name */
public final class AnonymousClass7zW extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C136626u7 $mediaUploadSuccessParams;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zW(C136626u7 r2) {
        super(1);
        this.$mediaUploadSuccessParams = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("enc_key", this.$mediaUploadSuccessParams.A05);
        A0a.A01("hmac_key", this.$mediaUploadSuccessParams.A07);
        A0a.A01("iv", this.$mediaUploadSuccessParams.A08);
        A0a.A01("plaintext_hash", this.$mediaUploadSuccessParams.A0D);
        A0a.A01("encrypted_hash_with_truncated_hmac", this.$mediaUploadSuccessParams.A06);
        A0a.A01("media_key_timestamp", this.$mediaUploadSuccessParams.A01);
        A0a.A01("media_key", this.$mediaUploadSuccessParams.A0A);
        A0a.A01("media_type", this.$mediaUploadSuccessParams.A0B);
        return C27621Wu.A00;
    }
}
