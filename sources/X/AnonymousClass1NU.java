package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: X.1NU  reason: invalid class name */
public final class AnonymousClass1NU {
    public static final byte[] A01 = {2};
    public static final byte[] A02 = {1};
    public final AnonymousClass00H A00;

    public AnonymousClass1NU(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(B72 b72, C29621ca r11, String str) {
        String str2;
        C29621ca A0K = r11.A0K("error");
        int i = -1;
        if (A0K == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("encb/EncryptedBackupProtocolHelper/ processError error node is empty, id=");
            sb.append(str);
            Log.e(sb.toString());
            str2 = "error node is empty";
        } else {
            String A0Q = A0K.A0Q("text", (String) null);
            if (A0Q == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("encb/EncryptedBackupProtocolHelper/ processError error text is empty, id=");
                sb2.append(str);
                Log.e(sb2.toString());
                str2 = "error text is empty";
            } else {
                String A0Q2 = A0K.A0Q("code", (String) null);
                if (A0Q2 == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("encb/EncryptedBackupProtocolHelper/ processError error code is empty, id=");
                    sb3.append(str);
                    Log.e(sb3.toString());
                    str2 = "error code is empty";
                } else {
                    try {
                        int parseInt = Integer.parseInt(A0Q2);
                        if (parseInt != -1) {
                            if (parseInt == 408) {
                                String A0Q3 = A0K.A0Q("backoff", (String) null);
                                if (A0Q3 == null) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("encb/EncryptedBackupProtocolHelper/ processError code=408 (request timeout) but backoff value is empty, id=");
                                    sb4.append(str);
                                    sb4.append(", code=");
                                    sb4.append(parseInt);
                                    sb4.append(", text=");
                                    sb4.append(A0Q);
                                    Log.e(sb4.toString());
                                    str2 = "timeout is empty";
                                } else {
                                    try {
                                        i = Integer.parseInt(A0Q3);
                                    } catch (NumberFormatException unused) {
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append("encb/EncryptedBackupProtocolHelper/ processError timeout is not numerical, id=");
                                        sb5.append(str);
                                        sb5.append(", code=");
                                        sb5.append(parseInt);
                                        sb5.append(", text=");
                                        sb5.append(A0Q);
                                        sb5.append(", timeout=");
                                        sb5.append(A0Q3);
                                        Log.e(sb5.toString());
                                        b72.Bt2("timeout is not numerical", 1, i);
                                        return;
                                    }
                                }
                            }
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("encb/EncryptedBackupProtocolHelper/ processError id=");
                            sb6.append(str);
                            sb6.append(", code=");
                            sb6.append(parseInt);
                            sb6.append(", text=");
                            sb6.append(A0Q);
                            sb6.append(", timeout=");
                            sb6.append(i);
                            Log.e(sb6.toString());
                            b72.Bt2(A0Q, parseInt, i);
                            return;
                        }
                        return;
                    } catch (NumberFormatException unused2) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("encb/EncryptedBackupProtocolHelper/ processError error code is not numerical, id=");
                        sb7.append(str);
                        Log.e(sb7.toString());
                        b72.Bt2("error code is not numerical", 1, -1);
                        return;
                    }
                }
            }
        }
        b72.Bt2(str2, 1, -1);
    }

    public static final void A01(B72 b72, Exception exc, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("encb/EncryptedBackupProtocolHelper/");
        sb.append(str2);
        sb.append("/invalid server response id=");
        sb.append(str);
        Log.e(sb.toString(), exc);
        b72.Bt2("invalid server response", 1, -1);
    }

    public static final void A02(AnonymousClass1NU r6, AnonymousClass1O5 r7, C29621ca r8, String str) {
        ((AnonymousClass1OZ) r6.A00.get()).A0I(r7, r8, str, 255, 32000);
    }

    public static final boolean A03(B72 b72, String str, String str2, String str3, byte[] bArr, byte[] bArr2) {
        String[] strArr = A60.A00;
        int i = 0;
        do {
            byte[] decode = Base64.decode(strArr[i], 0);
            try {
                Signature instance = Signature.getInstance("SHA256withRSA");
                instance.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
                instance.update(bArr);
                if (instance.verify(bArr2)) {
                    return false;
                }
            } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e) {
                Log.e("EncryptedBackupUtils/verifySignature/exception.", e);
            }
            i++;
        } while (i < 2);
        StringBuilder sb = new StringBuilder();
        sb.append("encb/EncryptedBackupProtocolHelper/");
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        sb.append(" cannot be verified with key_signature id=");
        sb.append(str3);
        Log.e(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(" cannot be verified with key_signature");
        b72.Bt2(sb2.toString(), 2, -1);
        return true;
    }
}
