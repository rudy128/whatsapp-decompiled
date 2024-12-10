package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.9CC  reason: invalid class name */
public class AnonymousClass9CC extends AnonymousClass2SG {
    public final int A00;
    public final Object A01;

    public AnonymousClass9CC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00(int i, int i2) {
        if (6 - this.A00 == 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("WamsysRegistrationWrapper/pre_pn/send-funnel-log/status/");
            A10.append(i);
            C17900vP.A0j("/failureReason/", A10, i2);
            ((C19951A0i) this.A01).A02((Object) null);
        }
    }

    public void A01(int i, int i2) {
        if (5 - this.A00 == 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("WamsysRegistrationWrapper/send-funnel-log/status/");
            A10.append(i);
            C17900vP.A0j("/failureReason/", A10, i2);
            ((C19951A0i) this.A01).A02((Object) null);
        }
    }

    public void A02(int i, int i2, String str, String str2) {
        int i3;
        Integer num;
        if (4 - this.A00 == 0) {
            C19951A0i a0i = (C19951A0i) this.A01;
            if (i != 1) {
                i3 = 0;
                if (i != 3) {
                    i3 = -1;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("WamsysRegistrationWrapper/challenge-unspecified; response-status ");
                    A10.append(i);
                    C17900vP.A0i(" failure-reason ", A10, i2);
                }
            } else {
                i3 = 1;
            }
            if (i2 == 2) {
                num = AnonymousClass00R.A0C;
            } else if (i2 == 6) {
                num = AnonymousClass00R.A0Y;
            } else if (i2 == 21) {
                num = AnonymousClass00R.A0N;
            } else if (i2 != 42) {
                num = AnonymousClass00R.A0j;
            } else {
                num = AnonymousClass00R.A01;
            }
            a0i.A02(new C138306wr(num, str, str2, i3));
        }
    }

    public void A05(String str, String str2, int i, int i2, int i3) {
        int i4;
        if (3 - this.A00 == 0) {
            C19951A0i a0i = (C19951A0i) this.A01;
            if (i != 1) {
                i4 = 0;
                if (i != 3) {
                    i4 = -1;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("WamsysRegistrationWrapper/wfs-auth-unspecified; response-status ");
                    A10.append(i);
                    C17900vP.A0i(" failure-reason ", A10, i2);
                }
            } else {
                i4 = 1;
            }
            a0i.A02(new C198509yS(C20100A7d.A00(i2), str, str2, i4, AnonymousClass000.A1T(i3, 1)));
        }
    }

    public void A06(String str, String str2, int i, int i2, long j) {
        int i3;
        int i4;
        if (this.A00 == 0) {
            C19951A0i a0i = (C19951A0i) this.A01;
            if (i != 1) {
                i3 = 0;
                if (i != 3) {
                    i3 = -1;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("WamsysRegistrationWrapper/reg-onboard-abprop-request-status-unspecified; response-status ");
                    A10.append(i);
                    C17900vP.A0i(" failure-reason ", A10, i2);
                }
            } else {
                i3 = 1;
            }
            if (i2 != 6) {
                i4 = 1;
                if (i2 != 33) {
                    i4 = -1;
                }
            } else {
                i4 = 0;
            }
            a0i.A02(new C198499yR(str, str2, i3, i4, j));
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.9Na] */
    public void A0B(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, Map map2, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, boolean z, boolean z2) {
        AnonymousClass9IN r5;
        if (12 - this.A00 == 0) {
            C19951A0i a0i = (C19951A0i) this.A01;
            int i6 = i;
            int i7 = i2;
            if (i6 == 1 || i6 == 2) {
                r5 = AnonymousClass9IN.YES;
            } else {
                if (i6 == 3) {
                    if (i7 == 1) {
                        r5 = AnonymousClass9IN.FAIL_INCORRECT;
                    } else if (i7 == 2) {
                        r5 = AnonymousClass9IN.FAIL_BLOCKED;
                    } else if (i7 == 6) {
                        r5 = AnonymousClass9IN.FAIL_TEMPORARILY_UNAVAILABLE;
                    } else if (i7 == 11) {
                        r5 = AnonymousClass9IN.FAIL_TOO_MANY_GUESSES;
                    } else if (i7 == 22) {
                        r5 = AnonymousClass9IN.FAIL_STALE;
                    } else if (i7 == 28) {
                        r5 = AnonymousClass9IN.FAIL_RESET_TOO_SOON;
                    } else if (i7 == 38) {
                        Log.i("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToSecurityStatus reason=consent");
                        r5 = AnonymousClass9IN.FAIL_CONSENT_PENDING;
                    } else if (i7 == 19) {
                        r5 = AnonymousClass9IN.FAIL_MISMATCH;
                    } else if (i7 == 20) {
                        r5 = AnonymousClass9IN.FAIL_GUESSED_TOO_FAST;
                    }
                }
                r5 = AnonymousClass9IN.ERROR_UNSPECIFIED;
            }
            if (r5 == AnonymousClass9IN.ERROR_UNSPECIFIED) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("WamsysRegistrationWrapper/security-status-unspecified; response-status ");
                A10.append(i6);
                C17900vP.A0i(" failure-reason ", A10, i7);
            }
            ? obj = new Object();
            obj.A03 = r5;
            obj.A07 = str;
            boolean z3 = true;
            obj.A0G = AnonymousClass000.A1T(i3, 1);
            if (i4 != 1) {
                z3 = false;
            }
            obj.A0F = z3;
            obj.A0E = z;
            obj.A06 = String.valueOf(i5);
            obj.A00 = j;
            obj.A0B = str2;
            obj.A0D = str3;
            obj.A0C = str4;
            obj.A02 = j2;
            obj.A01 = j3;
            obj.A0H = z2;
            if (str5 != null) {
                obj.A0I = Base64.decode(str5, 0);
            }
            obj.A05 = C181719Ro.A00(map);
            obj.A04 = C181709Rn.A00(map2);
            obj.A0A = str6;
            String str9 = "https://whatsapp.com/parent_consent/";
            if (str7 != null) {
                str9 = C17900vP.A0A(str9, str7);
            }
            obj.A09 = str9;
            obj.A08 = str8;
            a0i.A02(obj);
        }
    }

    public void A0C(String str, String str2, String str3, Map map, Map map2, int i, int i2, int i3, int i4, long j) {
        if (10 - this.A00 == 0) {
            C19951A0i a0i = (C19951A0i) this.A01;
            int i5 = i2;
            int i6 = i;
            Integer A03 = C20100A7d.A03(i6, i5);
            if (A03 == AnonymousClass00R.A0N) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("WamsysRegistrationWrapper/verify-code-status-standalone-unspecified; response-status ");
                A10.append(i6);
                C17900vP.A0i(" failure-reason ", A10, i5);
            }
            C188779hy r1 = new C188779hy(A03);
            r1.A08 = str;
            r1.A0H = C17890vO.A1R(i3);
            r1.A0C = String.valueOf(j);
            r1.A04 = new ADM(Integer.toString(i4), (String) null, (String) null, str3, 0, false);
            if (str2 != null) {
                r1.A0J = Base64.decode(str2, 0);
            }
            r1.A06 = C181719Ro.A00(map);
            r1.A05 = C181709Rn.A00(map2);
            a0i.A02(r1);
        }
    }

    public void A0D(String str, Map map, Map map2, int i, int i2) {
        int i3;
        if (1 - this.A00 == 0) {
            C19951A0i a0i = (C19951A0i) this.A01;
            if (i != 2) {
                i3 = 0;
                if (i != 3) {
                    i3 = -1;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("WamsysRegistrationWrapper/autoconf-request-status-unspecified; response-status ");
                    A10.append(i);
                    C17900vP.A0i(" failure-reason ", A10, i2);
                }
            } else {
                i3 = 1;
            }
            C187489ft r1 = new C187489ft(i3);
            r1.A00 = i2;
            r1.A03 = str;
            r1.A02 = C181719Ro.A00(map);
            r1.A01 = C181709Rn.A00(map2);
            a0i.A02(r1);
        }
    }

    public void A0E(Map map, Map map2, int i, int i2) {
        int i3;
        if (2 - this.A00 == 0) {
            C19951A0i a0i = (C19951A0i) this.A01;
            if (i != 1) {
                i3 = 0;
                if (i != 3) {
                    i3 = -1;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("WamsysRegistrationWrapper/autoconf-verifier-request-status-unspecified; response-status ");
                    A10.append(i);
                    C17900vP.A0i(" failure-reason ", A10, i2);
                }
            } else {
                i3 = 1;
            }
            C195069sk r1 = new C195069sk(i3);
            r1.A00 = i2;
            r1.A02 = C181719Ro.A00(map);
            r1.A01 = C181709Rn.A00(map2);
            a0i.A02(r1);
        }
    }

    public void A0F(Map map, Map map2, int i, int i2, int i3, long j, long j2) {
        if (9 - this.A00 == 0) {
            C19951A0i a0i = (C19951A0i) this.A01;
            Integer A02 = C20100A7d.A02(i, i2);
            if (A02 == AnonymousClass00R.A0Y) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("WamsysRegistrationWrapper/request-code-status-standalone-unspecified; response-status ");
                A10.append(i);
                C17900vP.A0i(" failure-reason ", A10, i2);
            }
            ADN adn = new ADN(A02);
            adn.A04 = i2;
            adn.A0L = String.valueOf(j);
            adn.A0O = String.valueOf(j2);
            adn.A02 = i3;
            adn.A08 = C181719Ro.A00(map);
            adn.A07 = C181709Rn.A00(map2);
            a0i.A02(adn);
        }
    }

    public void A08(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, Map map, Map map2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2, boolean z3, boolean z4) {
        int i18;
        C198819yx r1;
        String str16 = str13;
        if (7 - this.A00 == 0) {
            C19951A0i a0i = (C19951A0i) this.A01;
            int i19 = i;
            if (i19 != 1) {
                i18 = 0;
                if (i19 != 3) {
                    i18 = -1;
                    C17900vP.A0i("WamsysRegistrationWrapper/unknown-exist-status ", AnonymousClass000.A10(), i19);
                }
            } else {
                i18 = 1;
            }
            boolean z5 = true;
            if (i18 == 1) {
                boolean A1T = AnonymousClass000.A1T(i3, 1);
                if (i4 != 1) {
                    z5 = false;
                }
                r1 = new C198819yx(str, A1T, z5, z);
            } else {
                r1 = new C198819yx(i18, C20100A7d.A00(i2));
                r1.A0M = String.valueOf(j);
                r1.A09 = i5;
                r1.A08 = i6;
                r1.A0P = String.valueOf(j2);
                r1.A0Q = String.valueOf(j3);
                r1.A0S = String.valueOf(j4);
                r1.A0I = String.valueOf(j5);
                r1.A0N = String.valueOf(j6);
                r1.A0C = j7;
                r1.A0L = str2;
                r1.A0U = str3;
                r1.A0T = str4;
                r1.A0D = j8;
                r1.A0B = j9;
                r1.A0X = z2;
                r1.A05 = i7;
                r1.A0Y = AnonymousClass000.A1T(i9, 1);
                String str17 = str6;
                r1.A0E = new ADM(str17, str8, str7, str9, i8, z3);
                r1.A0O = str10;
                r1.A0J = str12;
                int i20 = i12;
                if (i20 == 1 || i20 == 2 || i20 == 3) {
                    r1.A0A = i20;
                } else {
                    r1.A0A = 0;
                }
                if (TextUtils.isEmpty(str16)) {
                    str16 = null;
                }
                r1.A0R = str16;
                String str18 = str5;
                if (str5 != null) {
                    r1.A0Z = Base64.decode(str18, 0);
                }
            }
            r1.A02 = i10;
            r1.A01 = i11;
            r1.A0G = C181719Ro.A00(map);
            r1.A0F = C181709Rn.A00(map2);
            r1.A04 = i13;
            r1.A0H = str11;
            r1.A07 = i14;
            r1.A00 = i15;
            r1.A0K = str14;
            String str19 = str15;
            if (str15 != null) {
                AnonymousClass8BW.A0o("https://whatsapp.com/parent_consent/", str19).toString();
            }
            r1.A0W = z4;
            if (str14 == null) {
                Log.e("WamsysRegistrationWrapper/same-device-check/pending-for: null");
            }
            r1.A0V = C20100A7d.A04(list);
            r1.A03 = i16;
            r1.A06 = i17;
            a0i.A02(r1);
        }
    }

    public void A09(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, Map map, Map map2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z) {
        if (8 - this.A00 == 0) {
            C19951A0i a0i = (C19951A0i) this.A01;
            int i8 = i2;
            int i9 = i;
            Integer A02 = C20100A7d.A02(i9, i8);
            if (A02 == AnonymousClass00R.A0Y) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("WamsysRegistrationWrapper/request-code-status-unspecified; response-status ");
                A10.append(i9);
                C17900vP.A0i(" failure-reason ", A10, i8);
            }
            ADN adn = new ADN(A02);
            adn.A04 = i8;
            adn.A0H = str;
            boolean z2 = false;
            adn.A0X = AnonymousClass000.A1T(i3, 1);
            if (i4 == 1) {
                z2 = true;
            }
            adn.A0W = z2;
            adn.A0L = String.valueOf(j);
            adn.A0C = str2;
            adn.A0J = str3;
            adn.A0O = String.valueOf(j2);
            adn.A0Q = String.valueOf(j3);
            adn.A0R = String.valueOf(j4);
            adn.A0E = String.valueOf(j5);
            adn.A0N = String.valueOf(j6);
            adn.A0G = String.valueOf(j7);
            adn.A0K = str4;
            adn.A0T = str5;
            adn.A0S = str6;
            adn.A05 = j8;
            adn.A02 = i5;
            adn.A0B = str7;
            adn.A0F = String.valueOf(j9);
            String str15 = str8;
            adn.A06 = new ADM(str15, str9, (String) null, str10, -1, z);
            adn.A00 = i6;
            adn.A0A = str11;
            adn.A08 = C181719Ro.A00(map);
            adn.A07 = C181709Rn.A00(map2);
            adn.A01 = i7;
            adn.A0M = str12;
            adn.A0P = str13;
            adn.A0D = str14;
            adn.A0I = String.valueOf(j10);
            adn.A0V = C20100A7d.A04(list);
            a0i.A02(adn);
        }
    }

    public void A0A(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map map, Map map2, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        if (11 - this.A00 == 0) {
            C19951A0i a0i = (C19951A0i) this.A01;
            int i6 = i2;
            int i7 = i;
            Integer A03 = C20100A7d.A03(i7, i6);
            if (A03 == AnonymousClass00R.A0N) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("WamsysRegistrationWrapper/verify-code-status-unspecified; response-status ");
                A10.append(i7);
                C17900vP.A0i(" failure-reason ", A10, i6);
            }
            C188779hy r3 = new C188779hy(A03);
            r3.A08 = str;
            boolean z4 = true;
            r3.A0H = AnonymousClass000.A1T(i3, 1);
            if (i4 != 1) {
                z4 = false;
            }
            r3.A0G = z4;
            r3.A0F = z;
            r3.A0C = String.valueOf(j);
            r3.A0B = str2;
            r3.A0E = str3;
            r3.A0D = str4;
            r3.A03 = j2;
            r3.A00 = i5;
            r3.A0I = z3;
            r3.A01 = j3;
            r3.A02 = j4;
            String str12 = str6;
            String str13 = str7;
            r3.A04 = new ADM(str12, str13, str8, str9, -1, z2);
            String str14 = str5;
            if (str5 != null) {
                r3.A0J = Base64.decode(str14, 0);
            }
            r3.A06 = C181719Ro.A00(map);
            r3.A05 = C181709Rn.A00(map2);
            r3.A0A = str10;
            String str15 = "https://whatsapp.com/parent_consent/";
            String str16 = str11;
            if (str11 != null) {
                str15 = C17900vP.A0A(str15, str16);
            }
            r3.A09 = str15;
            a0i.A02(r3);
        }
    }
}
