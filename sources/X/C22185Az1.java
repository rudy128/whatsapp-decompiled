package X;

import android.util.Base64;

/* renamed from: X.Az1  reason: case insensitive filesystem */
public final class C22185Az1 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C20275AEi $documentMetadata;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22185Az1(C20275AEi aEi) {
        super(1);
        this.$documentMetadata = aEi;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass84U r4 = (AnonymousClass84U) obj;
        C18070vi.A0d(r4, 0);
        r4.A01("url", this.$documentMetadata.A08);
        r4.A01("direct_path", this.$documentMetadata.A03);
        r4.A01("media_hash", this.$documentMetadata.A06);
        r4.A01("media_enc_hash", this.$documentMetadata.A05);
        byte[] bArr = this.$documentMetadata.A09;
        if (bArr != null) {
            str = Base64.encodeToString(bArr, 0);
        } else {
            str = null;
        }
        r4.A01("media_key", str);
        r4.A01("media_key_ts", this.$documentMetadata.A02);
        r4.A01("file_length", this.$documentMetadata.A01);
        r4.A01("file_name", this.$documentMetadata.A04);
        r4.A01("file_path", this.$documentMetadata.A00);
        r4.A01("mime_type", this.$documentMetadata.A07);
        return C27621Wu.A00;
    }
}
