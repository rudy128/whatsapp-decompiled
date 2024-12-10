package X;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.6pe  reason: invalid class name and case insensitive filesystem */
public final class C133876pe {
    public C140056zs A00;
    public final C19830z4 A01;
    public final C18030ve A02;
    public final C139736zM A03;
    public final AnonymousClass18K A04;

    public void A00(int i) {
        if (!C18020vd.A05(C18040vf.A02, this.A02, 1730)) {
            C170888qp r1 = new C170888qp();
            r1.A00 = Integer.valueOf(i);
            r1.A01 = C108955ca.A0j();
            this.A04.CC7(r1);
        }
    }

    public boolean A01() {
        C140056zs r8;
        C18030ve r6 = this.A02;
        if (!C18020vd.A05(C18040vf.A02, r6, 1725)) {
            C139736zM r4 = this.A03;
            ArrayList A012 = r4.A01("warning");
            if (!A012.isEmpty()) {
                C147027Rn.A01(36, A012);
                Iterator it = A012.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r8 = (C140056zs) it.next();
                    if ("active".equals(r8.A06)) {
                        C19830z4 r2 = r4.A00;
                        String A002 = C139736zM.A00(r8, "dismiss_count");
                        AnonymousClass00H r11 = r2.A00;
                        int i = C17880vN.A0B(r11).getInt(A002, -1);
                        int i2 = 1;
                        JSONObject A0J = r6.A0J(12840);
                        String str = r8.A07;
                        JSONObject optJSONObject = A0J.optJSONObject(str);
                        if (optJSONObject != null) {
                            i2 = optJSONObject.optInt("max_dismiss_count", 1);
                        }
                        if (i < i2) {
                            int i3 = C17880vN.A0B(r11).getInt(C139736zM.A00(r8, "total_days"), -1);
                            int i4 = 4;
                            JSONObject optJSONObject2 = r6.A0J(12840).optJSONObject(str);
                            if (optJSONObject2 != null) {
                                i4 = optJSONObject2.optInt("max_display_days", 4);
                            }
                            if (i3 < i4) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    r4.A02(r8);
                }
            }
            r8 = null;
            this.A00 = r8;
            if (r8 != null) {
                if (!this.A01.A2b("education_banner_timestamp", 86400000)) {
                    return true;
                }
                C19830z4 r5 = r4.A00;
                String A003 = C139736zM.A00(r8, "total_days");
                String A004 = C139736zM.A00(r8, "total_days");
                AnonymousClass00H r22 = r5.A00;
                r5.A1l(A003, C17880vN.A0B(r22).getInt(A004, -1) + 1);
                r5.A1B(C17880vN.A0B(r22).getInt("education_banner_count", 0) + 1);
                r5.A1i("education_banner_timestamp");
                return true;
            }
        }
        return false;
    }

    public C133876pe(C19830z4 r1, C18030ve r2, AnonymousClass18K r3, C139736zM r4) {
        this.A04 = r3;
        this.A03 = r4;
        this.A01 = r1;
        this.A02 = r2;
    }
}
