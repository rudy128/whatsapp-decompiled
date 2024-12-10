package com.whatsapp.registration.phonenumberentry.viewmodel;

import X.A98;
import X.ADM;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass19F;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass8BX;
import X.AnonymousClass99S;
import X.C108945cZ;
import X.C108965cb;
import X.C139576z4;
import X.C146517Pk;
import X.C177899Ba;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C185159c7;
import X.C187799gO;
import X.C188719hs;
import X.C192779oy;
import X.C37361pP;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public final class ExistViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A05;
    public final AnonymousClass1DT A06;
    public final AnonymousClass1DT A07;
    public final AnonymousClass1DT A08;
    public final AnonymousClass1DT A09;
    public final AnonymousClass1DT A0A = AnonymousClass3MW.A0M(0);
    public final AnonymousClass1DT A0B;
    public final AnonymousClass1DT A0C;
    public final AnonymousClass1DT A0D;
    public final AnonymousClass1DT A0E;
    public final AnonymousClass1DT A0F;
    public final AnonymousClass1DT A0G;
    public final AnonymousClass1DT A0H;
    public final AnonymousClass1DT A0I;
    public final AnonymousClass1DT A0J;
    public final AnonymousClass1DT A0K;
    public final AnonymousClass1DT A0L;
    public final AnonymousClass1DT A0M;
    public final AnonymousClass1DT A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;

    public static int A00(AnonymousClass99S r0) {
        return r0.A0M.A0V();
    }

    public static ADM A03(AnonymousClass99S r0) {
        return (ADM) r0.A0M.A04.A06();
    }

    public static String A04(AnonymousClass99S r0) {
        return (String) r0.A0M.A06.A06();
    }

    public static String A05(AnonymousClass99S r0) {
        return (String) r0.A0M.A0D.A06();
    }

    public void A0S() {
        Log.i("ExistViewModel/onCleared");
        A0W();
    }

    public final int A0T() {
        return AnonymousClass8BX.A01(this.A0A);
    }

    public final int A0U() {
        return AnonymousClass8BX.A01(this.A0K);
    }

    public final int A0V() {
        return AnonymousClass8BX.A01(this.A0N);
    }

    public final void A0W() {
        Log.i("ExistViewModel/canceling exist request");
        C188719hs r1 = (C188719hs) this.A0P.get();
        C17890vO.A0t(r1.A00);
        r1.A00 = null;
    }

    public final void A0X(C187799gO r25, String str, long j, boolean z) {
        long longValue;
        JSONObject jSONObject;
        Log.i("ExistViewModel/startExistRequest");
        A0W();
        C188719hs r2 = (C188719hs) this.A0P.get();
        String A1F = C108945cZ.A1F(this.A06);
        String A1F2 = C108945cZ.A1F(this.A0D);
        Number A1C = C108945cZ.A1C(this.A0F);
        if (A1C == null) {
            longValue = 0;
        } else {
            longValue = A1C.longValue();
        }
        AnonymousClass11P r8 = r2.A05;
        if (A1F == null) {
            throw AnonymousClass000.A0n("Required value was null.");
        } else if (A1F2 != null) {
            AnonymousClass118 r9 = r2.A06;
            C187799gO r4 = r25;
            if (r25 != null) {
                jSONObject = C17880vN.A15();
                try {
                    Integer num = r4.A00;
                    if (num != null) {
                        jSONObject.put("click_link", num.intValue());
                    }
                    Integer num2 = r4.A01;
                    if (num2 != null) {
                        jSONObject.put("permission_granted", num2.intValue());
                    }
                    Integer num3 = r4.A02;
                    if (num3 != null) {
                        jSONObject.put("suggestion_accepted", num3.intValue());
                    }
                    Integer num4 = r4.A04;
                    if (num4 != null) {
                        jSONObject.put("num_suggestions", num4.intValue());
                    }
                    Integer num5 = r4.A03;
                    if (num5 != null) {
                        jSONObject.put("sim_number_invalid", num5.intValue());
                    }
                    String str2 = r4.A05;
                    if (str2 != null) {
                        jSONObject.put("backup_token_source", str2);
                    }
                } catch (JSONException e) {
                    Log.e("ExistClientMetrics/toJSON exception: ", e);
                    jSONObject = null;
                }
            } else {
                jSONObject = null;
            }
            C139576z4 r13 = r2.A0A;
            AnonymousClass19F r12 = r2.A09;
            C177899Ba r7 = new C177899Ba(r8, r9, r2.A07, r2.A08, r12, r13, (C192779oy) C18070vi.A0E(r2.A0D), (A98) C18070vi.A0E(r2.A0E), r2.A0B, new C185159c7(r2, z), A1F, A1F2, str, jSONObject, longValue);
            r2.A00 = r7;
            long j2 = j;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            AnonymousClass10I r5 = r2.A0C;
            if (i > 0) {
                r5.CGv(new C146517Pk(r2, r7, 47), j2);
            } else {
                r5.CGM(r7, new Void[0]);
            }
        } else {
            throw AnonymousClass000.A0n("Required value was null.");
        }
    }

    public final void A0Y(boolean z) {
        AnonymousClass3MY.A1L(this.A07, z);
    }

    public final void A0Z(boolean z) {
        AnonymousClass3MY.A1L(this.A08, z);
    }

    public final boolean A0a() {
        Boolean bool = (Boolean) this.A0B.A06();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public ExistViewModel(C37361pP r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0o(r5, r6, r4);
        this.A0P = r5;
        this.A0O = r6;
        this.A06 = r4.A01("countryCodeLiveData");
        this.A0D = r4.A01("phoneNumberLiveData");
        this.A0G = AnonymousClass3MW.A0L();
        this.A05 = AnonymousClass3MW.A0L();
        this.A0F = AnonymousClass3MW.A0M(C17890vO.A0L());
        this.A0N = AnonymousClass3MW.A0M(0);
        this.A0M = AnonymousClass3MW.A0L();
        this.A09 = C108965cb.A0D(-1);
        this.A0H = AnonymousClass3MW.A0M(0);
        this.A0E = AnonymousClass3MW.A0M(false);
        this.A0L = C108965cb.A0D(7);
        this.A0K = AnonymousClass3MW.A0M(0);
        this.A0I = AnonymousClass3MW.A0L();
        this.A07 = AnonymousClass3MW.A0M(false);
        this.A08 = AnonymousClass3MW.A0M(false);
        this.A02 = AnonymousClass3MW.A0L();
        this.A0J = AnonymousClass3MW.A0M(false);
        this.A0C = AnonymousClass3MW.A0L();
        this.A03 = AnonymousClass3MW.A0M(0);
        this.A0B = AnonymousClass3MW.A0M(false);
        this.A00 = ((C188719hs) r5.get()).A01;
        this.A01 = ((C188719hs) r5.get()).A02;
    }
}
