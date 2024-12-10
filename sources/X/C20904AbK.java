package X;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AbK  reason: case insensitive filesystem */
public class C20904AbK implements C22521BBe {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20904AbK(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Btu(C19980A1q a1q, Map map) {
        if (this.A00 != 0) {
            StringBuilder A19 = AnonymousClass3MZ.A19(a1q, 1);
            A19.append("Error: ");
            C17890vO.A19(A19, a1q.A01);
            ((BCF) this.A01).Bsl();
        }
    }

    public void C7V(Map map) {
        C21132Af0 af0;
        if (this.A00 == 0) {
            A5D a5d = (A5D) this.A01;
            a5d.A07.A01.A0L.remove("BRMerchantData");
            Boolean A0h = AnonymousClass000.A0h();
            if (map == null) {
                AnonymousClass8BS.A1F("BrazilPaymentMerchantHelper", "triggerMerchantOnboarding :: terminalParams is null");
                af0 = (C21132Af0) this.A02;
            } else {
                Object obj = map.get("error");
                if (obj instanceof C19976A1m) {
                    if (489 == ((C19976A1m) obj).A00) {
                        a5d.A03.A0A(new AXN(this, 0));
                    } else {
                        ((C21132Af0) this.A02).A0B(A0h);
                    }
                }
                af0 = (C21132Af0) this.A02;
                A0h = AnonymousClass000.A0i();
            }
            af0.A0B(A0h);
        } else if (map != null) {
            String str = "address_message";
            if (map.get(str) instanceof String) {
                str = "params";
                if (!(map.get(str) instanceof HashMap)) {
                    return;
                }
            }
            AbstractMap abstractMap = (AbstractMap) map.get(str);
            if (abstractMap != null) {
                String A0s = C17880vN.A0s("body", map);
                Map map2 = (Map) abstractMap.get("values");
                if (A0s == null || map2 == null) {
                    int A012 = C20099A7c.A01(C108945cZ.A1G("saved_address_id", abstractMap), -1);
                    if (Integer.valueOf(A012) != null && A012 != -1) {
                        ((BCF) this.A01).BlC(A012);
                        return;
                    }
                    return;
                }
                ((BCF) this.A01).BlB(A0s, map2);
            }
        } else {
            ((BCF) this.A01).Bsl();
        }
    }
}
