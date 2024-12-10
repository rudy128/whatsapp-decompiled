package X;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Cqt  reason: case insensitive filesystem */
public class C26033Cqt {
    public static C26033Cqt A02;
    public static final Lock A03 = new ReentrantLock();
    public final SharedPreferences A00;
    public final Lock A01 = new ReentrantLock();

    public GoogleSignInAccount A01() {
        String A032;
        Uri uri;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String A033 = A03("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A033) && (A032 = A03(AnonymousClass001.A1H(":", A033, AnonymousClass000.A11("googleSignInAccount")))) != null) {
            try {
                String str6 = null;
                if (!TextUtils.isEmpty(A032)) {
                    JSONObject A16 = C17880vN.A16(A032);
                    String optString = A16.optString("photoUrl");
                    if (!TextUtils.isEmpty(optString)) {
                        uri = Uri.parse(optString);
                    } else {
                        uri = null;
                    }
                    long parseLong = Long.parseLong(A16.getString("expirationTime"));
                    HashSet A12 = C17880vN.A12();
                    JSONArray jSONArray = A16.getJSONArray("grantedScopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        A12.add(new Scope(1, jSONArray.getString(i)));
                    }
                    String optString2 = A16.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (A16.has("tokenId")) {
                        str = A16.optString("tokenId");
                    } else {
                        str = null;
                    }
                    if (A16.has("email")) {
                        str2 = A16.optString("email");
                    } else {
                        str2 = null;
                    }
                    if (A16.has(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME)) {
                        str3 = A16.optString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
                    } else {
                        str3 = null;
                    }
                    if (A16.has("givenName")) {
                        str4 = A16.optString("givenName");
                    } else {
                        str4 = null;
                    }
                    if (A16.has("familyName")) {
                        str5 = A16.optString("familyName");
                    } else {
                        str5 = null;
                    }
                    String string = A16.getString("obfuscatedIdentifier");
                    C18210vx.A03(string);
                    GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(uri, optString2, str, str2, str3, (String) null, string, str4, str5, C17880vN.A10(A12), 3, parseLong);
                    if (A16.has("serverAuthCode")) {
                        str6 = A16.optString("serverAuthCode");
                    }
                    googleSignInAccount.A00 = str6;
                    return googleSignInAccount;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions A02() {
        String A032;
        String str;
        Account account;
        String str2;
        String A033 = A03("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A033) && (A032 = A03(AnonymousClass001.A1H(":", A033, AnonymousClass000.A11("googleSignInOptions")))) != null) {
            try {
                Parcelable.Creator creator = GoogleSignInOptions.CREATOR;
                String str3 = null;
                if (!TextUtils.isEmpty(A032)) {
                    JSONObject A16 = C17880vN.A16(A032);
                    HashSet A12 = C17880vN.A12();
                    JSONArray jSONArray = A16.getJSONArray("scopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        A12.add(new Scope(1, jSONArray.getString(i)));
                    }
                    if (A16.has("accountName")) {
                        str = A16.optString("accountName");
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        account = new Account(str, "com.google");
                    } else {
                        account = null;
                    }
                    ArrayList A10 = C17880vN.A10(A12);
                    boolean z = A16.getBoolean("idTokenRequested");
                    boolean z2 = A16.getBoolean("serverAuthRequested");
                    boolean z3 = A16.getBoolean("forceCodeForRefreshToken");
                    if (A16.has("serverClientId")) {
                        str2 = A16.optString("serverClientId");
                    } else {
                        str2 = null;
                    }
                    if (A16.has("hostedDomain")) {
                        str3 = A16.optString("hostedDomain");
                    }
                    return new GoogleSignInOptions(account, str2, str3, (String) null, A10, C17880vN.A11(), 3, z, z2, z3);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String A03(String str) {
        Lock lock = this.A01;
        lock.lock();
        try {
            return this.A00.getString(str, (String) null);
        } finally {
            lock.unlock();
        }
    }

    public final void A04(String str, String str2) {
        Lock lock = this.A01;
        lock.lock();
        try {
            C17880vN.A1E(this.A00.edit(), str, str2);
        } finally {
            lock.unlock();
        }
    }

    public C26033Cqt(Context context) {
        this.A00 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C26033Cqt A00(Context context) {
        C18210vx.A00(context);
        Lock lock = A03;
        lock.lock();
        try {
            C26033Cqt cqt = A02;
            if (cqt == null) {
                cqt = new C26033Cqt(context.getApplicationContext());
                A02 = cqt;
            }
            return cqt;
        } finally {
            lock.unlock();
        }
    }
}
