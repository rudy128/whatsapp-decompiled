package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2PN  reason: invalid class name */
public final class AnonymousClass2PN extends A34 {
    public final List A00;
    public final /* synthetic */ C26241Rj A01;

    public AnonymousClass2PN(C26241Rj r1, List list) {
        this.A01 = r1;
        this.A00 = list;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Iterator A15 = AnonymousClass000.A15((Map) obj);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            C26241Rj.A01((AnonymousClass1BI) A16.getKey(), (AnonymousClass1EC) null, (C52502b1) A16.getValue(), this.A01);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        HashMap A11 = C17880vN.A11();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            UserJid A002 = C22941Dw.A00(C17880vN.A0S(it));
            if (A002 != null) {
                A13.add(A002);
            }
        }
        LinkedHashMap A09 = this.A01.A02.A09(A13);
        ArrayList A10 = C17880vN.A10(A13);
        Iterator A15 = AnonymousClass000.A15(A09);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            A11.put(A16.getKey(), new C52502b1((byte[]) A16.getValue()));
            A10.remove(A16.getKey());
        }
        Iterator it2 = A10.iterator();
        while (it2.hasNext()) {
            A11.put(it2.next(), new C52502b1((byte[]) null));
        }
        return A11;
    }
}
