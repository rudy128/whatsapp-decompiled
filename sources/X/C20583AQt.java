package X;

import com.whatsapp.util.Log;

/* renamed from: X.AQt  reason: case insensitive filesystem */
public class C20583AQt implements C22441B7x {
    public final C26551So A00;

    /* JADX INFO: finally extract failed */
    public C185849dF BIV(byte[] bArr) {
        try {
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets start)");
            C185849dF A002 = A3N.A00(C20058A5h.A00(bArr, this.A00.A03, 80));
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets end)");
            return A002;
        } catch (Throwable th) {
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets end)");
            throw th;
        }
    }

    public C20583AQt(C26551So r1) {
        this.A00 = r1;
    }
}
