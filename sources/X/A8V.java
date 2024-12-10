package X;

import android.content.Context;
import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class A8V {
    public final AnonymousClass118 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final List A06;
    public final C18100vl A07 = C21527Ala.A00(12);
    public final C18100vl A08 = AnonymousClass1DF.A00(AnonymousClass00R.A00, new C21527Ala(11));
    public final AnonymousClass00H A09;
    public final C18100vl A0A = C21527Ala.A00(13);

    public A8V(AnonymousClass118 r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17) {
        int A0G = C72453Mb.A0G(r11, r12, 1);
        C18070vi.A0d(r13, 3);
        C18070vi.A0d(r14, 4);
        C18070vi.A0d(r15, 5);
        AnonymousClass00H r2 = r16;
        C18070vi.A0d(r2, 6);
        AnonymousClass00H r0 = r17;
        C18070vi.A0d(r0, 7);
        this.A00 = r11;
        this.A01 = r12;
        this.A05 = r13;
        this.A03 = r14;
        this.A09 = r15;
        this.A04 = r2;
        this.A02 = r0;
        String[] strArr = new String[57];
        strArr[0] = "ad";
        strArr[1] = "at";
        strArr[A0G] = "ax";
        strArr[3] = "be";
        strArr[4] = "bg";
        strArr[5] = "bl";
        strArr[6] = "ca";
        strArr[7] = "ch";
        strArr[8] = "cy";
        strArr[9] = "cz";
        strArr[10] = "de";
        strArr[11] = "dk";
        strArr[12] = "ee";
        strArr[13] = "el";
        strArr[14] = "es";
        strArr[15] = "fi";
        strArr[16] = "fr";
        strArr[17] = "gb";
        strArr[18] = "gf";
        strArr[19] = "gg";
        strArr[20] = "gi";
        strArr[21] = "gp";
        strArr[22] = "gr";
        strArr[23] = "hr";
        strArr[24] = "hu";
        strArr[25] = "ic";
        strArr[26] = "ie";
        strArr[27] = "im";
        strArr[28] = "is";
        strArr[29] = "it";
        strArr[30] = "je";
        strArr[31] = "jp";
        strArr[32] = "li";
        strArr[33] = "lt";
        strArr[34] = "lu";
        strArr[35] = "lv";
        strArr[36] = "mc";
        strArr[37] = "mf";
        strArr[38] = "mq";
        strArr[39] = "mt";
        strArr[40] = "nc";
        strArr[41] = "nl";
        strArr[42] = "no";
        strArr[43] = "pf";
        strArr[44] = "pl";
        strArr[45] = "pm";
        strArr[46] = "pt";
        strArr[47] = "re";
        strArr[48] = "ro";
        strArr[49] = "se";
        strArr[50] = "si";
        strArr[51] = "sk";
        strArr[52] = "sm";
        strArr[53] = "tf";
        strArr[54] = "va";
        strArr[55] = "wf";
        this.A06 = C18070vi.A0O("yt", strArr, 56);
    }

    public static final synchronized String A01(A8V a8v) {
        String A0t;
        synchronized (a8v) {
            A0t = C108955ca.A0t(C17880vN.A0K(a8v.A04));
        }
        return A0t;
    }

    public static final synchronized String A02(A8V a8v) {
        String A0u;
        synchronized (a8v) {
            A0u = C108955ca.A0u(C17880vN.A0K(a8v.A04));
        }
        return A0u;
    }

    public static final void A06(A8V a8v, String str, String str2, String str3, String str4, Map map) {
        A8V a8v2 = a8v;
        String str5 = null;
        String string = C17900vP.A02(a8v.A04).getString("previous_registration_screen", (String) null);
        if (string == null) {
            string = "unknown";
        }
        Map map2 = map;
        byte[] bArr = (byte[]) map2.get("event_name");
        String str6 = null;
        if (bArr != null) {
            str5 = C108955ca.A13(bArr);
        }
        byte[] bArr2 = (byte[]) map2.get("client_error_type");
        if (bArr2 != null) {
            str6 = C108955ca.A13(bArr2);
        }
        StringBuilder sb = new StringBuilder("FunnelLogger");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("/previous screen: ");
        C108985cd.A1L(string, A10, sb);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("/action taken: ");
        String str7 = str2;
        C108985cd.A1L(str2, A102, sb);
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("/current screen: ");
        String str8 = str;
        C108985cd.A1L(str, A103, sb);
        if (str5 != null) {
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("/event name: ");
            C108985cd.A1L(str5, A104, sb);
        }
        if (str6 != null) {
            StringBuilder A105 = AnonymousClass000.A10();
            A105.append("/client error type: ");
            C108985cd.A1L(str6, A105, sb);
        }
        Log.i(sb.toString());
        AnonymousClass3MX.A0x(a8v2.A05).CGF(new C21390AjJ(a8v2, str3, str4, str8, string, str7, map2));
    }

    public final synchronized String A07() {
        return (String) AnonymousClass3MX.A14(this.A0A);
    }

    public final void A0B(String str) {
        if (C72453Mb.A1a(this.A07)) {
            String A0y = AnonymousClass000.A0y("_back_click", AnonymousClass000.A11(str));
            C192119np A002 = A00(this);
            A002.A01("event_name", A0y);
            A06(this, str, "back", A01(this), A02(this), A002.A00);
        }
    }

    public final void A0E(String str, String str2) {
        String str3;
        C18070vi.A0d(str, 0);
        if (C72453Mb.A1a(this.A07)) {
            AnonymousClass11S r0 = (AnonymousClass11S) this.A01.get();
            r0.A0I();
            Me me = r0.A00;
            if (me == null || (str3 = me.cc) == null) {
                TelephonyManager A0K = ((AnonymousClass11C) this.A03.get()).A0K();
                Charset charset = AnonymousClass1K3.A06;
                if (A0K == null || (str3 = A0K.getSimCountryIso()) == null) {
                    return;
                }
            }
            if (!this.A06.contains(str3)) {
                C192119np A002 = A00(this);
                A002.A01("event_name", str);
                A03(this, A002, str2);
            }
        }
    }

    public final void A0G(String str, String str2) {
        A05(this, (Long) null, str, str2, (String) null, (String) null);
    }

    public final void A0H(String str, String str2) {
        C18070vi.A0d(str, 0);
        if (C72453Mb.A1a(this.A07)) {
            A0C(str);
            A0I(str, str2);
        }
    }

    public final void A0I(String str, String str2) {
        C18070vi.A0d(str, 0);
        if (C72453Mb.A1a(this.A07)) {
            C19830z4 A0K = C17880vN.A0K(this.A04);
            C17880vN.A1E(C19830z4.A00(A0K), "previous_registration_screen", str);
            if (str2 != null) {
                C17880vN.A1E(C19830z4.A00(A0K), "previous_registration_action", str2);
            }
        }
    }

    public final void A0J(String str, String str2, String str3) {
        String str4 = str3;
        C18070vi.A0j(str2, str3);
        if (C72453Mb.A1a(this.A07)) {
            C192119np A002 = A00(this);
            A002.A01("event_name", str2);
            String str5 = str;
            A06(this, str5, str4, A01(this), A02(this), A002.A00);
        }
    }

    public final void A0K(String str, String str2, String str3) {
        C18070vi.A0d(str, 0);
        if (C72453Mb.A1a(this.A07)) {
            C192119np r1 = new C192119np();
            r1.A01("event_name", str2);
            if (str3 != null) {
                r1.A01("client_error_type", str3);
            }
            A03(this, r1, str);
        }
    }

    public final void A0N(String str, String str2, String str3, Map map) {
        String str4 = str;
        Map map2 = map;
        C18070vi.A0h(str, map);
        String A0r = C17880vN.A0r(C17900vP.A02(this.A04), "previous_registration_action");
        if (A0r == null) {
            A0r = "unknown";
        }
        A06(this, str4, A0r, str2, str3, map2);
    }

    public static C192119np A00(A8V a8v) {
        C192119np r2 = new C192119np();
        r2.A01("funnel_id", a8v.A07());
        return r2;
    }

    public static void A03(A8V a8v, C192119np r4, String str) {
        a8v.A0N(str, A01(a8v), A02(a8v), r4.A00);
    }

    public final void A08() {
        if (C72453Mb.A1a(this.A07)) {
            C192119np A002 = A00(this);
            A002.A01("event_name", "account_registration_complete");
            A0N("account_registration_complete_step", A01(this), A02(this), A002.A00);
            A0I("account_registration_complete_step", (String) null);
        }
    }

    public final void A09(C193939qu r7, String str, long j) {
        A05(this, Long.valueOf(j), "verify_passkey", str, r7.A01, r7.A00);
    }

    public final void A0A(C197939xW r6, String str, boolean z) {
        String str2;
        if (C72453Mb.A1a(this.A07)) {
            C192119np r4 = new C192119np();
            r4.A01("event_name", str);
            JSONObject A15 = C17880vN.A15();
            try {
                String str3 = r6.A00;
                if (str3 != null) {
                    A15.put("selected_option", str3);
                }
                List list = r6.A01;
                if (list != null) {
                    A15.put("presented_options", new JSONArray(list));
                }
            } catch (JSONException unused) {
            }
            r4.A01("client_metrics", A15.toString());
            Map map = r4.A00;
            if (z) {
                str2 = "first_dbs";
            } else {
                str2 = "fallback_options";
            }
            A0N(str2, A01(this), A02(this), map);
        }
    }

    public final void A0C(String str) {
        if (C72453Mb.A1a(this.A07)) {
            A03(this, A00(this), str);
        }
    }

    public final void A0D(String str) {
        TelephonyManager telephonyManager;
        if (C72453Mb.A1a(this.A07)) {
            C192119np A002 = A00(this);
            Context A0E = C108945cZ.A0E(this.A00);
            boolean hasSystemFeature = A0E.getPackageManager().hasSystemFeature("android.hardware.telephony");
            A002.A01("sim_card_supported", AnonymousClass8BS.A0b(hasSystemFeature ? 1 : 0));
            if (hasSystemFeature) {
                int i = -1;
                if (A0E.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                    Object systemService = A0E.getSystemService("phone");
                    if ((systemService instanceof TelephonyManager) && (telephonyManager = (TelephonyManager) systemService) != null) {
                        i = telephonyManager.getSimState();
                    }
                }
                A002.A00("sim_state", i);
            }
            C24301Jq A022 = AnonymousClass1IP.A02(A0E);
            if (A022 != null) {
                A002.A00("screen_diagonal_inches", A022.A00);
            }
            Configuration A032 = C108965cb.A03(C23671He.A00(A0E));
            A002.A00("screen_width_dp", A032.screenWidthDp);
            A002.A00("screen_height_dp", A032.screenHeightDp);
            A03(this, A002, str);
        }
    }

    public final void A0F(String str, String str2) {
        if (C72453Mb.A1a(this.A07)) {
            C192119np A002 = A00(this);
            A002.A01("event_name", str2);
            A03(this, A002, str);
        }
    }

    public final void A0L(String str, String str2, String str3, String str4) {
        if (C72453Mb.A1a(this.A07)) {
            C192119np A002 = A00(this);
            A002.A01("event_name", str2);
            A0I(str, str3);
            if (str4 != null) {
                A002.A01("client_error_type", str4);
            }
            A03(this, A002, str);
        }
    }

    public final void A0M(String str, String str2, String str3, String str4, long j) {
        if (C72453Mb.A1a(this.A07)) {
            C192119np A002 = A00(this);
            A002.A01("ios_attempt_id", str3);
            A002.A01("ios_export_duration", str4);
            A002.A01("google_migrate_import_error", str2);
            if (j > 0) {
                A002.A00.put("google_migrate_import_duration", C108975cc.A1O(String.valueOf(j)));
            }
            A03(this, A002, str);
        }
    }

    public static void A04(A8V a8v, AnonymousClass00H r1, String str, String str2, String str3) {
        a8v.A0J(str, str2, str3);
        ((A8V) r1.get()).A0I(str, str3);
    }

    public static final void A05(A8V a8v, Long l, String str, String str2, String str3, String str4) {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0d("FunnelLogger/passkeyLoginEvent/", str, A10);
        A10.append(str2);
        A10.append("/errorType=");
        A10.append(str4);
        C17900vP.A0f("/errorReason=", str3, A10);
        if (C72453Mb.A1a(a8v.A07)) {
            String A0r = C17880vN.A0r(C17900vP.A02(a8v.A04), "previous_registration_action");
            if (A0r == null) {
                A0r = "unknown";
            }
            a8v.A0I(str, A0r);
            C192119np r4 = new C192119np();
            r4.A01("event_name", str2);
            if (str3 != null) {
                r4.A01("client_error_context", str3);
            }
            if (str4 != null) {
                r4.A01("client_error_type", str4);
            }
            long A002 = ((C195909u8) a8v.A09.get()).A00();
            JSONObject A15 = C17880vN.A15();
            try {
                A15.put("GMSVersion", A002);
                if (l != null) {
                    A15.put("passkey_api_request_time_in_milli", l);
                }
            } catch (JSONException unused) {
            }
            r4.A01("client_metrics", A15.toString());
            A03(a8v, r4, str);
        }
    }
}
