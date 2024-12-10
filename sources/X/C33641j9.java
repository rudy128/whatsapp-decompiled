package X;

import android.content.SharedPreferences;

/* renamed from: X.1j9  reason: invalid class name and case insensitive filesystem */
public class C33641j9 {
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04 = false;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass11C A09;
    public final AnonymousClass19D A0A;
    public final AnonymousClass00H A0B;

    public static synchronized void A00(C33641j9 r4) {
        synchronized (r4) {
            if (!r4.A08) {
                AnonymousClass00H r3 = r4.A0B;
                r4.A01 = ((SharedPreferences) ((C19830z4) r3.get()).A00.get()).getBoolean("pref_fail_too_many", false);
                r4.A02 = ((SharedPreferences) ((C19830z4) r3.get()).A00.get()).getBoolean("pref_no_route_sms", false);
                r4.A03 = ((SharedPreferences) ((C19830z4) r3.get()).A00.get()).getBoolean("pref_no_route_voice", false);
                r4.A06 = ((SharedPreferences) ((C19830z4) r3.get()).A00.get()).getBoolean("pref_fail_too_many_attempts", false);
                r4.A07 = ((SharedPreferences) ((C19830z4) r3.get()).A00.get()).getBoolean("pref_fail_too_many_guesses", false);
                r4.A08 = true;
            }
        }
    }

    public void A02(String str) {
        String str2 = str;
        this.A00 = str2;
        A00(this);
        if (str2.equals("verify-tmg")) {
            this.A07 = true;
            this.A06 = false;
            ((C19830z4) this.A0B.get()).A2F(this.A01, this.A02, this.A03, false, true);
        } else if (str2.equals("verify-tma")) {
            this.A07 = false;
            this.A06 = true;
            ((C19830z4) this.A0B.get()).A2F(this.A01, this.A02, this.A03, true, false);
        }
        if (!str2.equals("verify-sms") && !str2.equals("verify-second-sms")) {
            return;
        }
        if (this.A07) {
            this.A00 = "verify-tmg";
        } else if (this.A06) {
            this.A00 = "verify-tma";
        }
    }

    public C33641j9(AnonymousClass11C r3, AnonymousClass19D r4, AnonymousClass00H r5) {
        this.A09 = r3;
        this.A0B = r5;
        this.A08 = false;
        this.A0A = r4;
    }

    public String A01(String str) {
        A00(this);
        boolean A0G = C17970vW.A0G(this.A09);
        A00(this);
        String str2 = this.A00;
        boolean z = this.A04;
        boolean z2 = this.A05;
        boolean z3 = this.A02;
        boolean z4 = this.A03;
        boolean z5 = this.A01;
        if ("register-phone".equals(str2)) {
            if (A0G) {
                return "register-phone-rtd";
            }
            if (z) {
                return "register-phone-no_number";
            }
            if (!z2) {
                return "register-phone-invalid";
            }
            return str;
        } else if (!"verify-sms".equals(str2) && !"verify-second-sms".equals(str2)) {
            String str3 = "verify-tma";
            if (!str3.equals(str2)) {
                str3 = "verify-tmg";
                if (str3.equals(str2)) {
                    return str3;
                }
                return str;
            }
            return str3;
        } else if (A0G) {
            return "verify-sms-rtd";
        } else {
            if (!z3) {
                if (z4) {
                    return "verify-sms-no_routes_voice";
                }
                if (z5) {
                    return str;
                }
                if ("verify-second-sms".equals(str2)) {
                    return str2;
                }
                return "verify-sms-normal";
            } else if (z4) {
                return "verify-sms-no_routes_both";
            } else {
                return "verify-sms-no_routes_sms";
            }
        }
    }

    public void A03(String str) {
        A00(this);
        switch (str.hashCode()) {
            case -1976127222:
                if (str.equals("noRouteVoice")) {
                    this.A03 = true;
                    break;
                }
                break;
            case -1893373339:
                if (str.equals("validNumber")) {
                    this.A05 = true;
                    break;
                }
                break;
            case -1777505757:
                if (str.equals("notEmptyNumber")) {
                    this.A04 = false;
                    break;
                }
                break;
            case -1522953003:
                if (str.equals("failTooMany")) {
                    this.A01 = true;
                    break;
                }
                break;
            case -416647790:
                if (str.equals("notValidNumber")) {
                    this.A05 = false;
                    break;
                }
                break;
            case 1040735990:
                if (str.equals("emptyNumber")) {
                    this.A04 = true;
                    break;
                }
                break;
            case 1164419889:
                if (str.equals("noRouteSms")) {
                    this.A02 = true;
                    break;
                }
                break;
        }
        ((C19830z4) this.A0B.get()).A2F(this.A01, this.A02, this.A03, this.A06, this.A07);
    }
}
