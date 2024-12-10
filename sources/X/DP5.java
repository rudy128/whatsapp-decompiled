package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class DP5 implements C72113Kr {
    public final C32571hP A00;

    public DP5(C32571hP r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final C23854BrB A00(C26030Cqo cqo) {
        C23854BrB brB = new C23854BrB();
        brB.A0M = Long.valueOf(cqo.A0M);
        brB.A0K = Long.valueOf(cqo.A0J);
        brB.A0J = Long.valueOf(cqo.A0L);
        brB.A0L = Long.valueOf(cqo.A0K);
        brB.A0O = Long.valueOf(cqo.A0O);
        brB.A0N = Long.valueOf(cqo.A0N);
        brB.A0Y = Long.valueOf(cqo.A0Y);
        brB.A0U = Long.valueOf(cqo.A0U);
        brB.A0W = Long.valueOf(cqo.A0W);
        brB.A0V = Long.valueOf(cqo.A0V);
        brB.A0X = Long.valueOf(cqo.A0X);
        brB.A0Z = Long.valueOf(cqo.A0Z);
        brB.A05 = Long.valueOf(cqo.A05);
        brB.A02 = Long.valueOf(cqo.A02);
        brB.A08 = Long.valueOf(cqo.A08);
        brB.A03 = Long.valueOf(cqo.A03);
        brB.A04 = Long.valueOf(cqo.A04);
        brB.A09 = Long.valueOf(cqo.A09);
        brB.A01 = Long.valueOf(cqo.A01);
        brB.A00 = Long.valueOf(cqo.A00);
        brB.A06 = Long.valueOf(cqo.A06);
        brB.A07 = Long.valueOf(cqo.A07);
        brB.A0T = Long.valueOf(cqo.A0T);
        brB.A0A = Long.valueOf(cqo.A0A);
        brB.A0B = Long.valueOf(cqo.A0B);
        brB.A0C = Long.valueOf(cqo.A0C);
        brB.A0D = Long.valueOf(cqo.A0D);
        brB.A0F = Long.valueOf(cqo.A0F);
        brB.A0G = Long.valueOf(cqo.A0G);
        brB.A0H = Long.valueOf(cqo.A0H);
        brB.A0I = Long.valueOf(cqo.A0I);
        brB.A0E = Long.valueOf(cqo.A0E);
        brB.A0Q = Long.valueOf(cqo.A0Q);
        brB.A0R = Long.valueOf(cqo.A0R);
        brB.A0P = Long.valueOf(cqo.A0P);
        brB.A0S = Long.valueOf(cqo.A0S);
        return brB;
    }

    public static final C23853BrA A01(C25819CmW cmW) {
        C23853BrA brA = new C23853BrA();
        brA.A0G = Long.valueOf(cmW.A0F);
        brA.A0F = Long.valueOf(cmW.A0E);
        brA.A0J = Long.valueOf(cmW.A0I);
        brA.A0H = Long.valueOf(cmW.A0G);
        brA.A0I = Long.valueOf(cmW.A0H);
        brA.A0O = Long.valueOf(cmW.A0N);
        brA.A0N = Long.valueOf(cmW.A0M);
        brA.A0R = Long.valueOf(cmW.A0Q);
        brA.A0P = Long.valueOf(cmW.A0O);
        brA.A0Q = Long.valueOf(cmW.A0P);
        brA.A02 = Long.valueOf(cmW.A01);
        brA.A03 = Long.valueOf(cmW.A02);
        brA.A04 = Long.valueOf(cmW.A03);
        brA.A08 = Long.valueOf(cmW.A07);
        brA.A07 = Long.valueOf(cmW.A06);
        brA.A09 = Long.valueOf(cmW.A08);
        brA.A01 = Long.valueOf(cmW.A00);
        brA.A0K = Long.valueOf(cmW.A0J);
        brA.A0M = Long.valueOf(cmW.A0L);
        brA.A06 = Long.valueOf(cmW.A05);
        brA.A05 = Long.valueOf(cmW.A04);
        brA.A0A = Long.valueOf(cmW.A09);
        brA.A0C = Long.valueOf(cmW.A0B);
        brA.A0B = Long.valueOf(cmW.A0A);
        brA.A0D = Long.valueOf(cmW.A0C);
        brA.A0E = Long.valueOf(cmW.A0D);
        brA.A00 = cmW.A0R;
        brA.A0L = Long.valueOf(cmW.A0K);
        return brA;
    }

    public void Bqf() {
        C23854BrB A002;
        C23853BrA A01;
        Double valueOf;
        Double valueOf2;
        Long valueOf3;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        C63132sZ A003;
        C32571hP r2 = this.A00;
        C132006m1 r6 = (C132006m1) r2.A03.get();
        AnonymousClass00H r5 = r6.A01;
        C18100vl r4 = ((C25830Cmh) r5.get()).A01;
        String string = ((SharedPreferences) r4.getValue()).getString("media_engagement_daily_received_key", (String) null);
        C26030Cqo A004 = CDA.A00(string);
        if (!(string == null || string.length() == 0)) {
            SharedPreferences.Editor A0A = C17890vO.A0A(r4);
            A0A.remove("media_engagement_daily_received_key");
            A0A.apply();
        }
        AnonymousClass18K r42 = r6.A00;
        if (A004 != null) {
            A002 = A00(A004);
        } else {
            A002 = A00(new C26030Cqo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        r42.CC7(A002);
        C18100vl r52 = ((C25830Cmh) r5.get()).A01;
        String string2 = ((SharedPreferences) r52.getValue()).getString("media_engagement_daily_sent_key", (String) null);
        C25819CmW A005 = CDB.A00(string2);
        if (!(string2 == null || string2.length() == 0)) {
            SharedPreferences.Editor A0A2 = C17890vO.A0A(r52);
            A0A2.remove("media_engagement_daily_sent_key");
            A0A2.apply();
        }
        if (A005 != null) {
            A01 = A01(A005);
        } else {
            A01 = A01(new C25819CmW((Boolean) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        r42.CC7(A01);
        if (!C18020vd.A05(C18040vf.A02, r2.A00, 12670)) {
            long A012 = C32571hP.A01(r2);
            C32561hO r43 = r2.A02;
            ArrayList A13 = AnonymousClass000.A13();
            SharedPreferences sharedPreferences = r43.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r43.A01.A05("media_daily_usage_preferences_v1");
                r43.A00 = sharedPreferences;
            }
            Map<String, ?> all = sharedPreferences.getAll();
            SharedPreferences sharedPreferences2 = r43.A00;
            if (sharedPreferences2 == null) {
                sharedPreferences2 = r43.A01.A05("media_daily_usage_preferences_v1");
                r43.A00 = sharedPreferences2;
            }
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            Iterator A15 = AnonymousClass000.A15(all);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                String obj = A16.getValue().toString();
                if (!obj.isEmpty() && (A003 = C63132sZ.A00(obj)) != null && A003.A0C < A012) {
                    A13.add(A003);
                    edit.remove(C17880vN.A0x(A16));
                }
            }
            edit.apply();
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                C63132sZ r53 = (C63132sZ) it.next();
                AnonymousClass18K r44 = r2.A01;
                C23843Br0 br0 = new C23843Br0();
                long j = r53.A01;
                Long l = null;
                if (j == 0) {
                    valueOf = null;
                } else {
                    valueOf = Double.valueOf((double) j);
                }
                br0.A02 = valueOf;
                long j2 = r53.A00;
                if (j2 == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Double.valueOf((double) j2);
                }
                br0.A01 = valueOf2;
                long j3 = r53.A05;
                if (j3 == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(j3);
                }
                br0.A09 = valueOf3;
                long j4 = r53.A04;
                if (j4 == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(j4);
                }
                br0.A08 = valueOf4;
                long j5 = r53.A07;
                if (j5 == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Long.valueOf(j5);
                }
                br0.A0B = valueOf5;
                long j6 = r53.A02;
                if (j6 == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Long.valueOf(j6);
                }
                br0.A06 = valueOf6;
                long j7 = r53.A03;
                if (j7 == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Long.valueOf(j7);
                }
                br0.A07 = valueOf7;
                long j8 = r53.A06;
                if (j8 == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Long.valueOf(j8);
                }
                br0.A0A = valueOf8;
                long j9 = r53.A08;
                if (j9 != 0) {
                    l = Long.valueOf(j9);
                }
                br0.A0C = l;
                br0.A0D = Long.valueOf(r53.A0C);
                br0.A04 = Integer.valueOf(r53.A0A);
                br0.A05 = Integer.valueOf(r53.A0B);
                br0.A03 = Integer.valueOf(r53.A09);
                br0.A00 = Boolean.valueOf(r53.A0D);
                r44.CC7(br0);
            }
        }
    }
}
