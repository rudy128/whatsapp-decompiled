package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Oz  reason: invalid class name and case insensitive filesystem */
public class C146407Oz implements AnonymousClass8A2 {
    public final int A00;
    public final Object A01;

    public C146407Oz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BrA() {
        if (this.A00 != 0) {
            C31081ez.A01("CrosspostRequestHelper/Iq delivery fail");
            C128866go r6 = (C128866go) this.A01;
            C133526ou r5 = (C133526ou) r6.A01.A06.get();
            C136316tc r2 = r6.A02;
            String str = r2.A04;
            AnonymousClass1IX r0 = r2.A02;
            ArrayList A0E = C29351c6.A0E(r0);
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                C108995ce.A1Q(A0E, it);
            }
            AnonymousClass1IX r02 = r2.A01;
            ArrayList A0E2 = C29351c6.A0E(r02);
            Iterator it2 = r02.iterator();
            while (it2.hasNext()) {
                C139886zb.A00(A0E2, it2);
            }
            r5.A01(str, A0E, A0E2);
            C132196mM r3 = r6.A00;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("CrosspostRequestSessionManager/Crosspost delivery failure for session: ");
            String str2 = r3.A01.A04;
            C108995ce.A1O(A10, str2);
            r3.A00.A02(AnonymousClass00R.A0C, str2);
            return;
        }
        C31081ez.A01("NtaCreateAndLinkUserIqHelper/createAndLinkUser linkActionIq onDeliveryFailure");
        ((C130496jW) this.A01).A00.A0z();
    }

    public void Bsx(Exception exc, Integer num) {
        if (this.A00 != 0) {
            StringBuilder A0K = C18070vi.A0K(exc);
            A0K.append("CrosspostRequestHelper/Iq sent error with code ");
            A0K.append(num);
            C31081ez.A03(C17890vO.A0c(A0K, ' '), exc);
            C128866go r2 = (C128866go) this.A01;
            C31081ez.A01("CrosspostRequestManager/crosspostRequestIQ unknown error");
            C136316tc r3 = r2.A02;
            AnonymousClass1IX r0 = r3.A01;
            ArrayList A0E = C29351c6.A0E(r0);
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                C139886zb.A00(A0E, it);
            }
            AnonymousClass1IX r02 = r3.A02;
            ArrayList A0E2 = C29351c6.A0E(r02);
            Iterator it2 = r02.iterator();
            while (it2.hasNext()) {
                C108995ce.A1Q(A0E2, it2);
            }
            C138626xP r1 = r2.A01;
            AnonymousClass74A.A06(r1.A00, (AnonymousClass2LF) C18070vi.A0E(r1.A02), r1.A05, A0E2, A0E, 4);
            r2.A00.A00(new AnonymousClass6OJ(-1));
            return;
        }
        C31081ez.A01("NtaCreateAndLinkUserIqHelper/createAndLinkUser linkActionIq onError");
        ((C130496jW) this.A01).A00.A0z();
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C147347Su r0;
        Long A0m;
        if (this.A00 != 0) {
            C135076rc r11 = (C135076rc) obj;
            C18070vi.A0d(r11, 0);
            C31081ez.A02("CrosspostRequestHelper/Iq sent success");
            C128866go r3 = (C128866go) this.A01;
            C138626xP r6 = r3.A01;
            Map map = r3.A02.A05;
            HashMap A11 = C17880vN.A11();
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                long A05 = C17880vN.A05(A16.getKey());
                String str = ((C136066tD) A16.getValue()).A03;
                if (str == null || (A0m = C108965cb.A0m(str)) == null) {
                    C17960vV.A0F(false, "CrosspostRequestManager/UniqueId field is empty while iterating through crosspostingInfoMap");
                } else {
                    C17880vN.A1N(A0m, A11, A05);
                }
            }
            Map map2 = r11.A00;
            Iterator A152 = AnonymousClass000.A15(map2);
            while (A152.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A152);
                C122646Re r8 = (C122646Re) A162.getKey();
                C135576sQ r7 = (C135576sQ) A162.getValue();
                List list = r7.A02;
                if (AnonymousClass000.A1a(list)) {
                    C138626xP.A00(r8, r6, list, A11, 3);
                }
                List list2 = r7.A00;
                if (AnonymousClass000.A1a(list2)) {
                    C138626xP.A00(r8, r6, list2, A11, 3);
                }
                List list3 = r7.A01;
                if (AnonymousClass000.A1a(list3)) {
                    C138626xP.A00(r8, r6, list3, A11, 4);
                }
            }
            if (!r11.A01) {
                r3.A00.A00(AnonymousClass6OI.A00);
            }
            C132196mM r32 = r3.A00;
            Iterator A153 = AnonymousClass000.A15(map2);
            while (A153.hasNext()) {
                C135576sQ r1 = (C135576sQ) C17890vO.A0P(A153);
                if (AnonymousClass000.A1a(r1.A00)) {
                    r0 = AnonymousClass6OH.A00;
                } else if (AnonymousClass000.A1a(r1.A01)) {
                    r0 = AnonymousClass6OG.A00;
                }
                r32.A00(r0);
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("CrosspostRequestSessionManager/Crosspost success for session: ");
            C136316tc r12 = r32.A01;
            C108995ce.A1O(A10, r12.A04);
            r32.A00.A00(r12);
            return;
        }
        boolean A1Y = AnonymousClass000.A1Y(obj);
        C31081ez.A02("NtaCreateAndLinkUserIqHelper/createAndLinkUser linkActionIq success");
        if (A1Y) {
            ((AnonymousClass7F6) ((C130496jW) this.A01).A06.get()).A00();
        }
        ((C130496jW) this.A01).A00.A0z();
    }
}
