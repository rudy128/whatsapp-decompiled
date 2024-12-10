package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4a3  reason: invalid class name and case insensitive filesystem */
public final class C88534a3 {
    public final C19830z4 A00;
    public final C18030ve A01;
    public final C18100vl A02;
    public final C18100vl A03 = C99164sN.A01(this, 46);
    public final C18100vl A04 = C99164sN.A01(this, 47);
    public final AnonymousClass1G4 A05;
    public final AnonymousClass1G1 A06;
    public final AnonymousClass11P A07;

    public static final Set A02(JSONArray jSONArray) {
        C25411Oc A08 = C28851b7.A08(0, jSONArray.length());
        ArrayList A0D = C29351c6.A0D(A08);
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            A0D.add(jSONArray.getString(((AnonymousClass20T) it).A00()));
        }
        C25098CXq cXq = C25550Cho.A02;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it2 = A0D.iterator();
        while (it2.hasNext()) {
            A13.add(cXq.A01(C17880vN.A0v(it2)));
        }
        return C29431cG.A12(A13);
    }

    public final int A03(C25550Cho cho) {
        C18070vi.A0d(cho, 0);
        C18030ve r4 = this.A01;
        C18040vf r3 = C18040vf.A02;
        JSONObject A022 = C18020vd.A02(r3, r4, 10562);
        String str = cho.A01;
        if (str == null || !A022.has(str)) {
            str = "*";
        }
        if (!A022.isNull(str)) {
            int optInt = A022.optInt(str);
            if (Integer.valueOf(optInt) != null) {
                return optInt;
            }
        }
        return C18020vd.A00(r3, r4, 6809);
    }

    public final void A06() {
        A08(false);
        C19830z4 r2 = this.A00;
        C17880vN.A1F(C19830z4.A00(r2), "voice_message_transcription_upsell_enabled", false);
        C17880vN.A1C(C19830z4.A00(r2), "voice_message_transcription_model_download_retry_count", 0);
    }

    public final boolean A0A(AnonymousClass1BI r6) {
        C18070vi.A0d(r6, 0);
        boolean A0V = C22971Dz.A0V(r6);
        C18030ve r3 = this.A01;
        C18040vf r2 = C18040vf.A02;
        boolean A052 = C18020vd.A05(r2, r3, 2890);
        if (!A0V) {
            return A052;
        }
        if (!A052 || C18020vd.A05(r2, r3, 5884)) {
            return false;
        }
        return true;
    }

    public final boolean A0B(AnonymousClass206 r5) {
        int intValue;
        C18070vi.A0d(r5, 0);
        if (!A09() || (intValue = A00(r5, this).intValue()) == 0 || intValue != 1) {
            return false;
        }
        return true;
    }

    public final boolean A0C(AnonymousClass206 r5, boolean z) {
        C18070vi.A0d(r5, 0);
        if ((z || C17890vO.A0B(this.A00).getBoolean("voice_message_transcription_enabled", false)) && A00(r5, this).intValue() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r3 = r7.A0v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A00(X.AnonymousClass206 r7, X.C88534a3 r8) {
        /*
            boolean r0 = r7 instanceof X.C441822l
            if (r0 == 0) goto L_0x0080
            r1 = r7
            X.22l r1 = (X.C441822l) r1
            if (r1 == 0) goto L_0x0080
            boolean r2 = r1.A1L()
            r0 = 1
            if (r2 != r0) goto L_0x0080
            X.205 r3 = r7.A0v
            X.1BI r0 = r3.A00
            if (r0 == 0) goto L_0x0080
            boolean r0 = r8.A0A(r0)
            if (r0 == 0) goto L_0x0080
            int r2 = r1.A0D
            X.0ve r6 = r8.A01
            r0 = 7879(0x1ec7, float:1.1041E-41)
            X.0vf r5 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r5, r6, r0)
            if (r2 > r0) goto L_0x0075
            r0 = 6808(0x1a98, float:9.54E-42)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x0072
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x004e
            r0 = 2890(0xb4a, float:4.05E-42)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x0072
            r0 = 6808(0x1a98, float:9.54E-42)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x0072
            r0 = 9216(0x2400, float:1.2914E-41)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x0072
        L_0x004e:
            int r1 = r1.A0D
            r0 = 7878(0x1ec6, float:1.104E-41)
            int r0 = X.C18020vd.A00(r5, r6, r0)
            if (r1 > r0) goto L_0x0072
            X.11P r0 = r8.A07
            long r3 = X.AnonymousClass3MZ.A05(r0, r7)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7877(0x1ec5, float:1.1038E-41)
            int r0 = X.C18020vd.A00(r5, r6, r0)
            long r0 = (long) r0
            long r1 = r2.toMillis(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0072
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            return r0
        L_0x0072:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            return r0
        L_0x0075:
            r0 = 8632(0x21b8, float:1.2096E-41)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x0080
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            return r0
        L_0x0080:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88534a3.A00(X.206, X.4a3):java.lang.Integer");
    }

    public final Set A05() {
        try {
            JSONArray jSONArray = C18020vd.A02(C18040vf.A02, this.A01, 12838).getJSONArray("locales");
            C18070vi.A0X(jSONArray);
            return A02(jSONArray);
        } catch (Exception e) {
            Log.e("PttTranscriptionConfig:supportedLocales", e);
            Object obj = this.A01.A03.get(12838);
            if (obj != null) {
                JSONArray jSONArray2 = C17880vN.A16((String) obj).getJSONArray("locales");
                C18070vi.A0X(jSONArray2);
                return A02(jSONArray2);
            }
            throw AnonymousClass000.A0s("Unexpected missing default value");
        }
    }

    public final void A07(String str) {
        SharedPreferences.Editor putString;
        AnonymousClass1G4 r2 = this.A05;
        if (!C18070vi.A18(str, r2.getValue())) {
            SharedPreferences.Editor A002 = C19830z4.A00(this.A00);
            if (str == null) {
                putString = A002.remove("voice_message_transcription_global_language");
            } else {
                putString = A002.putString("voice_message_transcription_global_language", str);
            }
            putString.apply();
            r2.setValue(str);
        }
    }

    public final void A08(boolean z) {
        Object obj;
        C17880vN.A1F(C19830z4.A00(this.A00), "voice_message_transcription_enabled", z);
        C18100vl r1 = this.A04;
        C18070vi.A0d(r1, 0);
        if (r1.Bf6()) {
            obj = r1.getValue();
        } else {
            obj = null;
        }
        AnonymousClass1G4 r0 = (AnonymousClass1G4) obj;
        if (r0 != null) {
            AnonymousClass3MY.A1Y(r0, z);
        }
        if (!z) {
            A07((String) null);
        }
    }

    public final boolean A09() {
        C18030ve r4 = this.A01;
        C18040vf r3 = C18040vf.A02;
        if (!C18020vd.A05(r3, r4, 2890) || !C17890vO.A0B(this.A00).getBoolean("voice_message_transcription_enabled", false) || (C18020vd.A05(r3, r4, 9215) && this.A05.getValue() == null)) {
            return false;
        }
        return true;
    }

    public C88534a3(AnonymousClass11P r4, C19830z4 r5, C18030ve r6) {
        C18070vi.A0o(r6, r5, r4);
        this.A01 = r6;
        this.A00 = r5;
        this.A07 = r4;
        AnonymousClass1G7 A002 = C34071js.A00(C17880vN.A0r(C17890vO.A0B(r5), "voice_message_transcription_global_language"));
        this.A05 = A002;
        this.A06 = new C34081jt((AnonymousClass1OB) null, A002);
        this.A02 = C99164sN.A01(this, 48);
    }

    public static final String A01(C88534a3 r1, String str, JSONObject jSONObject) {
        String A022 = A6n.A02(str, jSONObject);
        if (A022 != null) {
            Set<C25550Cho> A052 = r1.A05();
            if (!(A052 instanceof Collection) || !A052.isEmpty()) {
                for (C25550Cho cho : A052) {
                    if (C18070vi.A18(cho.A01, A022)) {
                        return A022;
                    }
                }
            }
        }
        return null;
    }

    public final String A04() {
        JSONObject jSONObject;
        String A16 = AnonymousClass3MZ.A16();
        String language = C26166Ctg.A03().getLanguage();
        try {
            jSONObject = C18020vd.A02(C18040vf.A02, this.A01, 9632);
        } catch (Exception e) {
            Log.e("PttTranscriptionConfig:initialLanguageSelected", e);
            jSONObject = C17880vN.A15();
        }
        C18070vi.A0b(jSONObject);
        C18070vi.A0b(A16);
        String A012 = A01(this, A16, jSONObject);
        if (A012 != null) {
            return A012;
        }
        C18070vi.A0b(language);
        return A01(this, language, jSONObject);
    }
}
