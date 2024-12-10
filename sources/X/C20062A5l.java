package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.A5l  reason: case insensitive filesystem */
public abstract class C20062A5l {
    public static final HashMap A00(AnonymousClass9DP r6) {
        AnonymousClass9CY r0;
        HashMap A11 = C17880vN.A11();
        A11.put("success", AnonymousClass000.A0i());
        AnonymousClass9DO r02 = (AnonymousClass9DO) ((AnonymousClass9DE) r6.A00).A04;
        if (!(r02 == null || (r0 = (AnonymousClass9CY) r02.A00) == null)) {
            Object A01 = C25489Cgk.A00(r0.A01).A01("$", new E6J[0]);
            C18070vi.A0X(A01);
            A11.put("screen_data", A01);
        }
        return A11;
    }

    public static final void A02(C20130A8q a8q, AnonymousClass9DP r3) {
        AnonymousClass9DO r0 = (AnonymousClass9DO) ((AnonymousClass9DE) r3.A00).A01;
        if (r0 != null) {
            Iterator A13 = AnonymousClass8BR.A13(((AnonymousClass9DN) r0.A00).A01);
            while (A13.hasNext()) {
                a8q.A0D((C178369Cv) A13.next());
            }
        }
    }

    public static final void A03(C20130A8q a8q, AnonymousClass9DP r9, String str) {
        AnonymousClass9DO r0 = (AnonymousClass9DO) ((AnonymousClass9DE) r9.A00).A05;
        if (r0 != null) {
            AnonymousClass9DH r3 = (AnonymousClass9DH) r0.A00;
            C20130A8q.A09(a8q, C20130A8q.A01(a8q, r3, str));
            C20129A8p a8p = a8q.A00;
            if (a8p != null) {
                String str2 = r3.A02;
                long size = (long) ((List) r3.A01).size();
                C187379fi r02 = a8p.A01;
                if (r02 == null) {
                    C18070vi.A11("flowManager");
                    throw null;
                }
                ((Deque) AnonymousClass8BT.A0s(r02.A04)).addLast(str2);
                C20129A8p.A07(a8p, "queueStates");
                C176198zw r03 = a8p.A0G;
                r03.A01.A09("num_states_queued", a8p.A00, size, true);
                C20129A8p.A00(a8p);
            }
        }
        A02(a8q, r9);
    }

    public static final LinkedHashMap A01(Integer num, String str, String str2, Map map) {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put("success", AnonymousClass000.A0h());
        LinkedHashMap A132 = C17880vN.A13();
        if (str == null) {
            str = "";
        }
        A132.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        if (num != null) {
            A132.put("code", Integer.valueOf(num.intValue()));
        }
        if (str2 != null) {
            A132.put("message", str2);
        }
        if (map != null) {
            A132.put("params", map);
        }
        A13.put("error", A132);
        return A13;
    }
}
