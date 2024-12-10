package X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1j8  reason: invalid class name and case insensitive filesystem */
public class C33631j8 {
    public Set A00 = null;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass190 A03;
    public final C19830z4 A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public static final AnonymousClass77T A00(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        boolean optBoolean = jSONObject.optBoolean("secure", false);
        Boolean valueOf = Boolean.valueOf(optBoolean);
        long optLong = jSONObject.optLong("expiry", 0);
        Long valueOf2 = Long.valueOf(optLong);
        String A012 = C20064A5n.A01("domain", (String) null, jSONObject);
        String A013 = C20064A5n.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null, jSONObject);
        String A014 = C20064A5n.A01("path", (String) null, jSONObject);
        String A015 = C20064A5n.A01("value", (String) null, jSONObject);
        C17960vV.A07(valueOf);
        C17960vV.A07(valueOf2);
        C17960vV.A07(A012);
        C18070vi.A0X(A012);
        C17960vV.A07(A013);
        C18070vi.A0X(A013);
        C17960vV.A07(A014);
        C18070vi.A0X(A014);
        C17960vV.A07(A015);
        C18070vi.A0X(A015);
        String obj = new Uri.Builder().scheme("https").authority(A012).build().toString();
        C18070vi.A0X(obj);
        return new AnonymousClass77T(A012, A013, A014, A015, obj, optLong, optBoolean);
    }

    private String A01(String str) {
        byte[] bArr;
        try {
            this.A07.get();
            C191309mN A002 = C196639vO.A00(new JSONArray(str));
            if (A002 == null) {
                bArr = null;
            } else {
                bArr = ((C22661Cs) this.A08.get()).A02(A002, C197569wu.A0Z);
            }
            if (bArr != null) {
                return new String(bArr, C19620yd.A0C);
            }
            this.A03.A0G("FBCredentialsStore/decryptFbUsers", "Failed to decrypt fb users", true);
            throw new IllegalStateException("Failed to decrypt fb users");
        } catch (JSONException e) {
            this.A03.A0G("FBCredentialsStore/decryptFbUsers", e.getMessage(), true);
            throw new IllegalStateException("Failed to decrypt fb users", e);
        }
    }

    public static HashMap A02(C33631j8 r8) {
        String A012;
        AnonymousClass00H r7 = r8.A01;
        String string = C35001lU.A00((C35001lU) r7.get()).getString("pref_fb_user_credentials_encrypted", (String) null);
        if (string == null) {
            C19830z4 r4 = r8.A04;
            A012 = ((SharedPreferences) r4.A00.get()).getString("pref_fb_user_credentials", (String) null);
            if (A012 != null) {
                ((C35001lU) r7.get()).A01(r8.A05(A012));
                C19830z4.A00(r4).remove("pref_fb_user_credentials").apply();
            }
        } else {
            A012 = r8.A01(string);
        }
        if (A012 == null) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(A012);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            boolean z = false;
            for (Object next2 : hashMap.keySet()) {
                JSONObject jSONObject2 = new JSONObject((String) hashMap.get(next2));
                if (jSONObject2.has("accessToken")) {
                    String string2 = jSONObject2.getString("accessToken");
                    jSONObject2.remove("accessToken");
                    jSONObject2.put("access_token", string2);
                    hashMap.put(next2, jSONObject2.toString());
                    z = true;
                }
            }
            if (!z) {
                return hashMap;
            }
            ((C35001lU) r7.get()).A01(r8.A05(A03(hashMap).toString()));
            return hashMap;
        } catch (JSONException e) {
            throw new IllegalStateException("FBCredentialsStore : Failed to parse data from store", e);
        }
    }

    public static JSONObject A03(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public AnonymousClass732 A04(C35021lW r17) {
        String str;
        Long l;
        String str2;
        AnonymousClass77T r5;
        HashMap A022 = A02(this);
        StringBuilder sb = new StringBuilder();
        sb.append("FBCredentialsStore/getFBIdentity/FbUserType: ");
        C35021lW r52 = r17;
        sb.append(r52);
        Log.i(sb.toString());
        if (A022.isEmpty()) {
            str = "FBCredentialsStore/getFBIdentity/fbUsers is empty";
        } else {
            String str3 = (String) A022.get(r52.A00);
            if (str3 == null || str3.isEmpty()) {
                str = "FBCredentialsStore/getFBIdentity/userCredentials is null";
            } else {
                try {
                    this.A02.get();
                    JSONObject jSONObject = new JSONObject(str3);
                    long j = jSONObject.getLong("fbid");
                    String string = jSONObject.getString("password");
                    String string2 = jSONObject.getString("access_token");
                    long j2 = jSONObject.getLong("timestamp");
                    AnonymousClass77T r6 = null;
                    if (jSONObject.has("ttl")) {
                        l = Long.valueOf(jSONObject.optLong("ttl"));
                    } else {
                        l = null;
                    }
                    if (jSONObject.has("analytics_claim")) {
                        str2 = jSONObject.optString("analytics_claim");
                    } else {
                        str2 = null;
                    }
                    String string3 = jSONObject.getString("usertype");
                    C18070vi.A0d(string3, 1);
                    C35021lW r7 = new C35021lW(string3, true);
                    if (jSONObject.has("session_cookie_current_user")) {
                        r5 = A00(jSONObject.getJSONObject("session_cookie_current_user"));
                    } else {
                        r5 = null;
                    }
                    if (jSONObject.has("session_cookie_session_identifier")) {
                        r6 = A00(jSONObject.getJSONObject("session_cookie_session_identifier"));
                    }
                    return new AnonymousClass732(r5, r6, r7, l, string, string2, str2, j, j2);
                } catch (JSONException e) {
                    Log.e("FBCredentialsStore/getFBIdentity/getJsonStringAsEntity/JSONException");
                    C17960vV.A0B(e);
                    return null;
                }
            }
        }
        Log.i(str);
        return null;
    }

    public String A05(String str) {
        String A002;
        C191309mN A012 = ((C22661Cs) this.A08.get()).A01(C197569wu.A0Z, str.getBytes(C19620yd.A0C));
        if (A012 != null && (A002 = A012.A00()) != null && str.equals(A01(A002))) {
            return A002;
        }
        this.A03.A0G("FBCredentialsStore/encryptFbUsers", "Failed to encrypt fb users", true);
        throw new IllegalStateException("Failed to encrypt fb users");
    }

    public void A06() {
        if (this.A00 == null) {
            this.A00 = Collections.synchronizedSet(new HashSet(A02(this).keySet()));
        }
    }

    public boolean A08(AnonymousClass732 r11) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("FBCredentialsStore/storeFbIdentity/FbUserType");
        C35021lW r4 = r11.A01;
        sb.append(r4);
        Log.i(sb.toString());
        HashMap A022 = A02(this);
        String str2 = r4.A00;
        boolean z = false;
        if (A022.get(str2) == null) {
            z = true;
        }
        try {
            this.A02.get();
            JSONObject jSONObject = new JSONObject();
            Object obj = r11.A04.A00;
            C17960vV.A07(obj);
            JSONObject put = jSONObject.put("fbid", ((Number) obj).longValue());
            Object obj2 = r11.A05.A00;
            C17960vV.A07(obj2);
            JSONObject put2 = put.put("password", obj2);
            Object obj3 = r11.A02.A00;
            C17960vV.A07(obj3);
            JSONObject put3 = put2.put("access_token", obj3).put("timestamp", r11.A00).put("ttl", r11.A07).put("analytics_claim", r11.A08).put("usertype", str2);
            C1418477e r0 = r11.A03;
            if (r0 != null) {
                Object obj4 = r0.A00;
                C17960vV.A07(obj4);
                put3.put("session_cookie_current_user", ((AnonymousClass77T) obj4).A00());
            }
            C1418477e r02 = r11.A06;
            if (r02 != null) {
                Object obj5 = r02.A00;
                C17960vV.A07(obj5);
                put3.put("session_cookie_session_identifier", ((AnonymousClass77T) obj5).A00());
            }
            A022.put(str2, put3.toString());
            try {
                ((C35001lU) this.A01.get()).A01(A05(A03(A022).toString()));
                A06();
                this.A00.add(str2);
                if (z) {
                    C47912Kl r3 = (C47912Kl) this.A06.get();
                    r3.A00.CGF(new C146797Qq(r3, r4, 2));
                }
                return true;
            } catch (JSONException e) {
                e = e;
                str = "FBCredentialsStore/storeFbIdentity/setPrefFbUserCredentialsEncrypted/JSONException";
                Log.e(str);
                C17960vV.A0B(e);
                return false;
            }
        } catch (JSONException e2) {
            e = e2;
            str = "FBCredentialsStore/storeFbIdentity/getEntityAsJsonString/JSONException";
            Log.e(str);
            C17960vV.A0B(e);
            return false;
        }
    }

    public C33631j8(AnonymousClass190 r2, C19830z4 r3, AnonymousClass10I r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        this.A03 = r2;
        this.A05 = r4;
        this.A07 = r5;
        this.A04 = r3;
        this.A08 = r6;
        this.A02 = r7;
        this.A01 = r8;
        this.A06 = r9;
    }

    public void A07(C35021lW r5) {
        HashMap A022 = A02(this);
        String str = r5.A00;
        if (!TextUtils.isEmpty((String) A022.get(str))) {
            A022.remove(str);
            ((C35001lU) this.A01.get()).A01(A05(new JSONObject(A022).toString()));
            A06();
            this.A00.remove(str);
            C47912Kl r3 = (C47912Kl) this.A06.get();
            r3.A00.CGF(new C146797Qq(r3, r5, 1));
        }
    }
}
