package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.1Cx  reason: invalid class name and case insensitive filesystem */
public abstract class C22711Cx {
    public final AnonymousClass190 A00;
    public final C18010vc A01;
    public final AnonymousClass18O A02;

    public C191309mN A06(byte[] bArr) {
        C191309mN A012 = ((C22721Cy) this).A00.A01(C197569wu.A0Z, bArr);
        if (A012 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("EncryptedKeyHelperAESPassword/");
            sb.append("crypto issue on encryption");
            Log.e(sb.toString());
        }
        return A012;
    }

    public void A07() {
    }

    public byte[] A08(C191309mN r4, Integer num) {
        String str;
        byte[] A022 = ((C22721Cy) this).A00.A02(r4, C197569wu.A0Z);
        if (A022 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("EncryptedKeyHelperAESPassword/");
            sb.append("crypto issue on decryption while ");
            if (num.intValue() != 0) {
                str = "READ_ACTIVE";
            } else {
                str = "READ_SELFTEST";
            }
            sb.append(str);
            Log.e(sb.toString());
        }
        return A022;
    }

    public static void A00(String str, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("EncryptedKeyHelper/reportEncryptedKeyHelperProblem/");
        sb.append(str);
        Log.e(sb.toString(), exc);
    }

    public void A05(String str, Throwable th) {
        Log.e("EncryptedKeyHelper/reportKeystoreCriticalException/", th);
        SharedPreferences A05 = this.A01.A05("keystore");
        long j = A05.getLong("client_static_keypair_enc_success", 0);
        long j2 = A05.getLong("client_static_keypair_enc_failed", 0);
        AnonymousClass190 r5 = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("keystore-error-");
        sb.append(str);
        sb.append("-");
        sb.append(th.getClass().getSimpleName());
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th.getMessage());
        sb2.append(String.format(Locale.US, " KS Stats OK/KO: %d/%d", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        r5.A0E(obj, sb2.toString(), th);
    }

    public C22711Cx(AnonymousClass190 r1, AnonymousClass18O r2, C18010vc r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
