package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Ba  reason: invalid class name and case insensitive filesystem */
public final class C177899Ba extends A34 {
    public long A00;
    public final long A01;
    public final AnonymousClass118 A02;
    public final C19830z4 A03;
    public final AnonymousClass19D A04;
    public final AnonymousClass19F A05;
    public final C139576z4 A06;
    public final C192779oy A07;
    public final A98 A08;
    public final C26145Ct9 A09;
    public final C185159c7 A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final JSONObject A0E;
    public final AnonymousClass11P A0F;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Set<String> stringSet;
        JSONObject jSONObject;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.A01;
            if (elapsedRealtime < j) {
                this.A00 = C17880vN.A04(j - elapsedRealtime);
                return AnonymousClass8BV.A08((Object) null, 11);
            }
            C192779oy r6 = this.A07;
            boolean z = false;
            if (AnonymousClass11P.A01(r6.A00) > C17890vO.A05(r6.A01.A0P(), "pref_pre_chatd_ab_next_fetch_time")) {
                z = true;
            }
            if (z) {
                Log.i("CheckIfReinstalledTask/shouldFetchPreChatdABProps");
                this.A05.A04();
                String A002 = r6.A00(this.A0B, this.A0D);
                if (A002 != null) {
                    if (A002.equals("wamsys initialization fails")) {
                        return AnonymousClass8BV.A08((Object) null, 22);
                    }
                    r6.A01(A002);
                }
            }
            byte[] A032 = this.A09.A03();
            C139576z4 r7 = this.A06;
            synchronized (r7) {
                C139576z4.A00(r7);
                SharedPreferences sharedPreferences = r7.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = r7.A05.A05(C19620yd.A09);
                    r7.A00 = sharedPreferences;
                }
                stringSet = sharedPreferences.getStringSet("ab_offline_props:offline_exposure_strings", new HashSet(1));
            }
            C18070vi.A0X(stringSet);
            JSONArray A1A = AnonymousClass8BR.A1A();
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                AnonymousClass8BS.A1J(it, A1A);
            }
            try {
                jSONObject = C17880vN.A15();
                jSONObject.put("exposure", A1A);
                JSONObject jSONObject2 = this.A0E;
                if (jSONObject2 != null) {
                    jSONObject.put("metrics", jSONObject2);
                }
            } catch (JSONException e) {
                Log.e("CheckIfReinstalledTask/enterphone/getOfflineAbParams exception: ", e);
                jSONObject = null;
            }
            C19830z4 r4 = this.A03;
            int i = C17890vO.A0B(r4).getInt("reg_attempts_check_exist", 0) + 1;
            C17900vP.A0M(r4, "reg_attempts_check_exist", i);
            C199199zb r72 = new C199199zb(i, A9B.A0F(r4, this.A04));
            C61802qI r1 = C182119Td.A00;
            Context A0E2 = C108945cZ.A0E(this.A02);
            String str = this.A0D;
            String A012 = r1.A01(A0E2, str);
            A98 a98 = this.A08;
            String str2 = this.A0B;
            String str3 = this.A0C;
            if (str3 == null) {
                str3 = "-1";
            }
            C198819yx A0L = a98.A0L(r72, str2, str, A012, str3, jSONObject, A032, false);
            if (A0L == null) {
                Log.e("CheckIfReinstalledTask/doInBackground/null ExistResult");
                return AnonymousClass8BV.A08((Object) null, 4);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("CheckIfReinstalledTask/exist entrypoint response/autoconfType=");
            A10.append(A0L.A02);
            A10.append("/autoconfCfType=");
            A10.append(A0L.A01);
            A10.append("/non-null serverStartMessage=");
            A10.append(AnonymousClass000.A1W(A0L.A0O));
            A10.append("/waOldEligible=");
            A10.append(A0L.A0A);
            A10.append("/emailOtpEligible=");
            A10.append(A0L.A04);
            A10.append("/flashType=");
            A10.append(A0L.A05);
            A10.append("/resetMethod=");
            A10.append(A0L.A0L);
            A10.append("/wipeWait=");
            A10.append(A0L.A0D);
            A10.append("/smsWait=");
            A10.append(A0L.A0P);
            A10.append("/voiceWait=");
            A10.append(A0L.A0Q);
            A10.append("/waOldWait=");
            A10.append(A0L.A0S);
            A10.append("/emailOtpWait=");
            A10.append(A0L.A0I);
            A10.append("/retryAfter=");
            A10.append(A0L.A0M);
            A10.append("/silentAuthEligible=");
            A10.append(A0L.A07);
            A10.append("/regMethodsOrder=");
            A10.append(A0L.A0V);
            A10.append("/carrierSilentAuthEligible=");
            C17900vP.A0o(A10, A0L.A03);
            r4.A18(A0L.A02);
            int i2 = A0L.A02;
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                r4.A1X("autoconf_server_enabled");
            }
            int i3 = A0L.A0a;
            if (i3 != 0) {
                if (i3 == 1) {
                    return AnonymousClass8BV.A08(A0L, 1);
                }
                return AnonymousClass8BV.A08((Object) null, 4);
            }
            Integer num = A0L.A0b;
            if (num == null) {
                return AnonymousClass8BV.A08((Object) null, 4);
            }
            if (num == AnonymousClass00R.A00) {
                return AnonymousClass8BV.A08((Object) null, 22);
            }
            if (num == AnonymousClass00R.A0C) {
                return AnonymousClass8BV.A08(A0L, 5);
            }
            if (num == AnonymousClass00R.A0N) {
                return AnonymousClass8BV.A08((Object) null, 6);
            }
            if (num == AnonymousClass00R.A0Y) {
                return AnonymousClass8BV.A08((Object) null, 7);
            }
            if (num == AnonymousClass00R.A0j) {
                return AnonymousClass8BV.A08((Object) null, 8);
            }
            if (num == AnonymousClass00R.A0u) {
                return AnonymousClass8BV.A08(A0L, 9);
            }
            if (num == AnonymousClass00R.A15) {
                return AnonymousClass8BV.A08(A0L, 12);
            }
            if (num == AnonymousClass00R.A18) {
                return AnonymousClass8BV.A08((Object) null, 14);
            }
            if (num == AnonymousClass00R.A19) {
                return AnonymousClass8BV.A08((Object) null, 15);
            }
            if (num == AnonymousClass00R.A02) {
                return AnonymousClass8BV.A08(A0L, 16);
            }
            if (num == AnonymousClass00R.A05) {
                return AnonymousClass8BV.A08(A0L, 20);
            }
            if (num == AnonymousClass00R.A06) {
                return AnonymousClass8BV.A08(A0L, 19);
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("CheckIfReinstalledTask/possible-migration/");
            C17900vP.A0r(A102, A0L.A0X);
            return AnonymousClass8BV.A08(A0L, 2);
        } catch (Exception e2) {
            Log.e("CheckIfReinstalledTask/error", e2);
        }
    }

    public void A0E() {
        AnonymousClass3MY.A1M(this.A0A.A00.A04, false);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C19760yx r11 = (C19760yx) obj;
        C18070vi.A0d(r11, 0);
        C185159c7 r2 = this.A0A;
        C188719hs r1 = r2.A00;
        AnonymousClass3MY.A1M(r1.A04, false);
        Object obj2 = r11.A00;
        C17960vV.A07(obj2);
        int A032 = AnonymousClass8BU.A03(obj2);
        String str = this.A0B;
        String str2 = this.A0D;
        long j = this.A00;
        C18070vi.A0k(str, str2);
        Log.i("ExistRepository/onExistCheckResponse");
        r1.A03.A0E(new C195439tL((C198819yx) r11.A01, str, str2, A032, j, r2.A01));
    }

    public C177899Ba(AnonymousClass11P r1, AnonymousClass118 r2, C19830z4 r3, AnonymousClass19D r4, AnonymousClass19F r5, C139576z4 r6, C192779oy r7, A98 a98, C26145Ct9 ct9, C185159c7 r10, String str, String str2, String str3, JSONObject jSONObject, long j) {
        AnonymousClass8BW.A1I(r7, a98);
        this.A01 = j;
        this.A0F = r1;
        this.A0B = str;
        this.A0D = str2;
        this.A02 = r2;
        this.A0C = str3;
        this.A0E = jSONObject;
        this.A06 = r6;
        this.A05 = r5;
        this.A04 = r4;
        this.A09 = ct9;
        this.A03 = r3;
        this.A07 = r7;
        this.A08 = a98;
        this.A0A = r10;
    }
}
