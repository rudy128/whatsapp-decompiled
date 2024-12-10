package X;

import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import org.json.JSONException;
import org.json.JSONObject;

public class A5H {
    public final A7q A00;
    public final AnonymousClass1QD A01;
    public final AnonymousClass1QE A02 = AnonymousClass1QE.A00("PaymentFingerprintKeyStore", "payment-settings", "COMMON");

    public static synchronized String A01(A5H a5h, int i) {
        String str;
        synchronized (a5h) {
            str = null;
            try {
                AnonymousClass1QD r7 = a5h.A01;
                JSONObject A0c = AnonymousClass8BY.A0c(r7);
                JSONObject A0w = AnonymousClass8BW.A0w("bio", A0c);
                A0w.put("v", "1");
                if (i == 0) {
                    A0w.remove("bioId");
                    A0w.remove("bioPublicKey");
                } else if (i == 2) {
                    str = C17890vO.A0Q().replace("-", "");
                    A0w.put("bioId", str);
                }
                A0w.put("bioState", i);
                A0c.put("bio", A0w);
                AnonymousClass8BT.A1G(r7, A0c);
            } catch (JSONException e) {
                a5h.A02.A0A("PaymentFingerprintKeyStore setState threw: ", e);
            }
        }
        return str;
    }

    public synchronized int A02() {
        JSONObject optJSONObject;
        int i = 0;
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06) && (optJSONObject = C17880vN.A16(A06).optJSONObject("bio")) != null && (i = optJSONObject.optInt("bioState", 0)) == 1) {
                if (A00() == null) {
                    A03();
                    return 3;
                }
            }
        } catch (JSONException e) {
            this.A02.A0A("getState threw: ", e);
            return i;
        }
    }

    public static final A52 A00() {
        try {
            Log.i("FingerprintHelper-helper/get-crypto-object");
            Signature instance = Signature.getInstance("SHA256withECDSA");
            KeyStore instance2 = KeyStore.getInstance("AndroidKeyStore");
            instance2.load((KeyStore.LoadStoreParameter) null);
            Key key = instance2.getKey("payment_bio_key_alias", (char[]) null);
            C18070vi.A0z(key, "null cannot be cast to non-null type java.security.PrivateKey");
            instance.initSign((PrivateKey) key);
            return new A52(instance);
        } catch (Exception e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FingerprintHelper/getCryptoObject: api=");
            A10.append(Build.VERSION.SDK_INT);
            C17900vP.A0X(e, " error: ", A10);
            return null;
        }
    }

    public void A03() {
        try {
            Log.i("FingerprintHelper-helper/remove-key");
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            instance.deleteEntry("payment_bio_key_alias");
            A01(this, 0);
        } catch (Exception e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FingerprintHelper/removeKey: api=");
            A10.append(Build.VERSION.SDK_INT);
            C17900vP.A0Y(e, " error: ", A10);
        }
    }

    public void A04(String str) {
        String str2;
        JSONObject optJSONObject;
        if (str != null) {
            synchronized (this) {
                str2 = null;
                try {
                    String A06 = this.A01.A06();
                    if (!TextUtils.isEmpty(A06) && (optJSONObject = C17880vN.A16(A06).optJSONObject("bio")) != null) {
                        str2 = optJSONObject.optString("bioId", (String) null);
                    }
                } catch (JSONException e) {
                    this.A02.A0A("getId threw: ", e);
                }
            }
            if (str.equals(str2)) {
                A01(this, 1);
                return;
            }
        }
        A03();
        return;
    }

    public boolean A05() {
        A7q a7q = this.A00;
        if (!a7q.A07() || !a7q.A06()) {
            return false;
        }
        return true;
    }

    public A5H(AnonymousClass118 r4, AnonymousClass1QD r5) {
        this.A01 = r5;
        this.A00 = new A7q(r4.A00);
    }
}
