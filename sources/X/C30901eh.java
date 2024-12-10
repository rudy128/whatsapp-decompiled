package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1eh  reason: invalid class name and case insensitive filesystem */
public class C30901eh {
    public static final long A0G = TimeUnit.SECONDS.toMillis(35);
    public static final long[] A0H = {TimeUnit.HOURS.toMillis(6), TimeUnit.HOURS.toMillis(12), TimeUnit.DAYS.toMillis(1), TimeUnit.DAYS.toMillis(1), TimeUnit.DAYS.toMillis(3), TimeUnit.DAYS.toMillis(7)};
    public boolean A00;
    public boolean A01 = true;
    public SharedPreferences A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass1KB A04;
    public final C25001Mm A05;
    public final AnonymousClass11P A06;
    public final C18030ve A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;
    public final List A0A = new LinkedList();
    public final AnonymousClass11E A0B;
    public final C18010vc A0C;
    public final C30891eg A0D;
    public final AnonymousClass00H A0E;
    public volatile String A0F;

    public static synchronized SharedPreferences A00(C30901eh r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A02;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A0C.A05(C19620yd.A09);
                r2.A02 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static String A01(C30901eh r4, String str) {
        byte[] A022;
        try {
            r4.A0E.get();
            C191309mN A002 = C196639vO.A00(new JSONArray(str));
            if (A002 == null || (A022 = ((C22661Cs) r4.A09.get()).A02(A002, C197569wu.A0Z)) == null) {
                return null;
            }
            return new String(A022, C19620yd.A0C);
        } catch (JSONException e) {
            Log.w("TwoFactorAuthManager/decryptCode/cannot create Json", e);
            return null;
        }
    }

    public String A02() {
        if (this.A0F == null) {
            synchronized (this) {
                if (this.A0F == null) {
                    String string = A00(this).getString("two_factor_auth_code", (String) null);
                    String str = "";
                    if (string == null) {
                        this.A0F = str;
                    } else {
                        boolean z = A00(this).getBoolean("two_factor_auth_using_encryption", false);
                        if (!z || (string = A01(this, string)) != null) {
                            str = string;
                        } else {
                            this.A03.A0G("TwoFactorAuthManager/loadCodeInMemory/EncryptedCodeFailure", (String) null, false);
                        }
                        this.A0F = str;
                        StringBuilder sb = new StringBuilder();
                        sb.append("TwoFactorAuthManager/loadCodeInMemory/isUsingEncryption: ");
                        sb.append(z);
                        Log.i(sb.toString());
                    }
                }
            }
        }
        String str2 = this.A0F;
        C17960vV.A07(str2);
        return str2;
    }

    public void A03() {
        this.A0F = "";
        A00(this).edit().remove("two_factor_auth_code").remove("two_factor_auth_using_encryption").remove("two_factor_auth_email_set").remove("two_factor_auth_nag_time").remove("two_factor_auth_nag_interval").remove("two_factor_auth_last_code_correctness").apply();
    }

    public void A04(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("TwoFactorAuthManager/onAuthSettingsError errorCode [");
        sb.append(i);
        sb.append("] errorMessage [");
        sb.append(str);
        sb.append("]");
        Log.w(sb.toString());
        for (AnonymousClass89R C9N : this.A0A) {
            C9N.C9N(i);
        }
    }

    public void A05(String str, String str2) {
        if (!this.A0B.A09()) {
            Log.i("TwoFactorAuthManager/setTwoFactorAuthSettings/no internet connection, cancelling");
            this.A04.CGP(new AnonymousClass7RC(this, 28));
            return;
        }
        Log.i("TwoFactorAuthManager/setTwoFactorAuthSettings");
        C30891eg r4 = this.A0D;
        AnonymousClass00H r2 = r4.A01;
        String A0B2 = ((AnonymousClass1OZ) r2.get()).A0B();
        StringBuilder sb = new StringBuilder();
        sb.append("TwoFactorXmppMethods/sendSetTwoFactorAuth; iq=");
        sb.append(A0B2);
        Log.i(sb.toString());
        AnonymousClass1OZ r10 = (AnonymousClass1OZ) r2.get();
        ArrayList arrayList = new ArrayList(2);
        String str3 = str;
        if (str != null) {
            arrayList.add(new C29621ca("code", str3, (AnonymousClass1MD[]) null));
        }
        String str4 = str2;
        if (str2 != null) {
            arrayList.add(new C29621ca("email", str4, (AnonymousClass1MD[]) null));
        }
        r10.A0N(new AnonymousClass373(r4, str3, str4), new C29621ca(new C29621ca("2fa", (AnonymousClass1MD[]) null, (C29621ca[]) arrayList.toArray(new C29621ca[0])), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) C173438v4.A00, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "urn:xmpp:whatsapp:account"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set")}), A0B2, 111, 32000);
    }

    public C30901eh(AnonymousClass190 r2, AnonymousClass1KB r3, C25001Mm r4, AnonymousClass11E r5, AnonymousClass11P r6, C18030ve r7, C18010vc r8, C30891eg r9, AnonymousClass10I r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        this.A06 = r6;
        this.A07 = r7;
        this.A04 = r3;
        this.A03 = r2;
        this.A08 = r10;
        this.A0E = r11;
        this.A05 = r4;
        this.A0D = r9;
        this.A09 = r12;
        this.A0C = r8;
        this.A0B = r5;
    }

    public void A06(boolean z) {
        int max;
        int i = A00(this).getInt("two_factor_auth_nag_interval", 0);
        if (z) {
            max = Math.min(i + 1, 5);
        } else {
            max = Math.max(i - 1, 0);
        }
        A00(this).edit().putLong("two_factor_auth_nag_time", AnonymousClass11P.A01(this.A06)).putInt("two_factor_auth_nag_interval", max).putBoolean("two_factor_auth_last_code_correctness", z).apply();
    }

    public boolean A07() {
        long j;
        if (!(!A02().isEmpty())) {
            return false;
        }
        long j2 = A00(this).getLong("two_factor_auth_nag_time", -1);
        AnonymousClass11P r6 = this.A06;
        long A012 = AnonymousClass11P.A01(r6);
        C18030ve r2 = this.A07;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 5571)) {
            j = TimeUnit.DAYS.toMillis((long) C18020vd.A00(r1, r2, 5595));
        } else {
            j = A0H[Math.min(5, A00(this).getInt("two_factor_auth_nag_interval", 0))];
        }
        boolean z = false;
        if (A012 > j + j2) {
            z = true;
        }
        boolean z2 = A00(this).getBoolean("two_factor_auth_last_code_correctness", false);
        boolean z3 = false;
        if (AnonymousClass11P.A01(r6) < j2) {
            z3 = true;
            Log.w("TwoFactorAuthManager/clock-moved-back");
        }
        if (z || !z2 || z3) {
            return true;
        }
        return false;
    }
}
