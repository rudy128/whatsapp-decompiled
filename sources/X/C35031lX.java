package X;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1lX  reason: invalid class name and case insensitive filesystem */
public class C35031lX {
    public final Set A00;
    public final AnonymousClass190 A01;
    public final C35001lU A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public static HashMap A00(C35031lX r5) {
        String string = C35001lU.A00(r5.A02).getString("pref_fb_user_certs_encrypted", (String) null);
        if (string != null) {
            byte[] A022 = r5.A02(string);
            if (A022 == null) {
                C17960vV.A0F(false, "null decrypt result");
            } else {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject(new String(A022, C19620yd.A0C));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C18070vi.A0d(next, 1);
                    hashMap.put(new C35021lW(next, true), new C61672q4(jSONObject.getString(next)));
                }
                return hashMap;
            }
        }
        return new HashMap();
    }

    public static void A01(C35031lX r8, Map map) {
        String str;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = ((C35021lW) entry.getKey()).A00;
            C61672q4 r6 = (C61672q4) entry.getValue();
            hashMap.put(str2, new JSONObject().put("e_cert", Base64.encodeToString(r6.A04.getEncoded(), 3)).put("s_cert", Base64.encodeToString(r6.A05.getEncoded(), 3)).put("ttl", r6.A00).put("ts", r6.A01).put("ppk", r6.A03).put("ppk_id", r6.A02).toString());
        }
        String obj = new JSONObject(hashMap).toString();
        Charset charset = C19620yd.A0C;
        C191309mN A012 = ((C22661Cs) r8.A04.get()).A01(C197569wu.A0Z, obj.getBytes(charset));
        if (A012 == null) {
            str = "null keyData";
        } else {
            String A002 = A012.A00();
            if (TextUtils.isEmpty(A002)) {
                str = "empty result";
            } else if (!new String(r8.A02(A002), charset).equals(obj)) {
                C17960vV.A0F(false, "decrypted does not match original");
                r8.A01.A0G("FbUserEntityCertificateCache/encryptAndStoreMap", "Failed to encrypt cert", true);
                return;
            } else {
                C35001lU.A00(r8.A02).edit().putString("pref_fb_user_certs_encrypted", A002).apply();
                return;
            }
        }
        C17960vV.A0F(false, str);
    }

    private byte[] A02(String str) {
        this.A03.get();
        C191309mN A002 = C196639vO.A00(new JSONArray(str));
        if (A002 != null) {
            return ((C22661Cs) this.A04.get()).A02(A002, C197569wu.A0Z);
        }
        C17960vV.A0F(false, "null key data");
        return null;
    }

    public C35031lX(AnonymousClass190 r1, C35001lU r2, AnonymousClass00H r3, AnonymousClass00H r4, Set set) {
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
        this.A00 = set;
    }

    public void A03(C35021lW r2) {
        try {
            HashMap A002 = A00(this);
            A002.remove(r2);
            A01(this, A002);
        } catch (CertificateException | JSONException e) {
            C17960vV.A0B(e);
        }
    }
}
