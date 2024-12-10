package X;

import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class AZD implements BBL {
    public final AXS A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public String BOS(String str, String str2, boolean z) {
        C187079fE r3 = ((A0F) this.A02.get()).A00;
        if (r3 == null) {
            return null;
        }
        String name = C187079fE.class.getName();
        Log.d(name, "GetChallenge called");
        if (str.trim().isEmpty() || str2.trim().isEmpty()) {
            Log.d(name, "In-sufficient arguments provided");
            return null;
        }
        try {
            return r3.A03.BOR(str, str2);
        } catch (RemoteException unused) {
            Log.e("CLServerices", "RemoteException in getChallenge");
            return null;
        }
    }

    public boolean CDs(String str, String str2) {
        String str3;
        String str4 = null;
        try {
            str3 = C108955ca.A14(AnonymousClass8BX.A1Y());
            C18070vi.A0X(str3);
        } catch (NoSuchAlgorithmException unused) {
            com.whatsapp.util.Log.e("registerApp NoSuchAlgorithmException");
            str3 = null;
        }
        byte[] bArr = (byte[]) this.A00.A0E().A00;
        String str5 = str;
        String str6 = str2;
        if (!(bArr == null || str3 == null)) {
            try {
                StringBuilder A11 = AnonymousClass000.A11("com.whatsapp");
                A11.append('|');
                A11.append(str);
                byte[] A002 = AnonymousClass9RQ.A00(C17890vO.A0Z(str2, A11, '|'), str3);
                SecretKeySpec A0v = AnonymousClass8BS.A0v(bArr);
                IvParameterSpec A19 = AnonymousClass8BR.A19(Base64.decode(str3, 2));
                Cipher A18 = AnonymousClass8BR.A18();
                C18070vi.A0X(A18);
                byte[] A1Q = AnonymousClass8BS.A1Q(A0v, A19, A18, A002, 1);
                C18070vi.A0X(A1Q);
                str4 = Base64.encodeToString(A1Q, 0);
            } catch (Exception unused2) {
                com.whatsapp.util.Log.e("CryptoUtils: populateHmac Exception");
                str4 = null;
            }
        }
        C187079fE r2 = ((A0F) this.A02.get()).A00;
        if (r2 == null) {
            return false;
        }
        String name = C187079fE.class.getName();
        Log.d(name, "Register App called");
        if ("com.whatsapp".trim().isEmpty() || str.trim().isEmpty() || str2.trim().isEmpty() || str4 == null || str4.trim().isEmpty() || str3 == null) {
            Log.d(name, "In-sufficient arguments provided");
            return false;
        }
        try {
            return r2.A03.CDr("com.whatsapp", str5, str6, str4, str3);
        } catch (RemoteException unused3) {
            Log.e("CLServices", "Remote Exception in registerApp");
            return false;
        }
    }

    public AZD(AXS axs, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0o(r4, r5, axs);
        this.A02 = r4;
        this.A01 = r5;
        this.A00 = axs;
        ((A0F) C18070vi.A0E(r4)).A01((C22462B8u) null);
    }
}
