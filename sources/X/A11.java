package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class A11 {
    public List A00;
    public Map A01;
    public final C18100vl A02;
    public final AnonymousClass00H A03;

    public final void A02(AnonymousClass9IL r3, C188419hO r4, Collection collection, List list, AnonymousClass1OX r7) {
        if (r4.A07.contains(r3) && list.size() > 1) {
            C29391cC.A0H(list, new C98984s2(r4, this, collection, r7));
        }
    }

    public static final Map A00(C188419hO r4, A11 a11, Collection collection, AnonymousClass1OX r7) {
        Map map = a11.A01;
        if (map == null) {
            List list = a11.A00;
            if (list == null) {
                list = C181239Pr.A00(a11.A01(r4, collection, r7));
                a11.A00 = list;
                if (list == null) {
                    throw C17890vO.A0K();
                }
            }
            C98534rJ A15 = C29431cG.A15(list);
            map = new LinkedHashMap(C200510q.A00(A15));
            Iterator it = A15.iterator();
            while (it.hasNext()) {
                C194139rE r0 = (C194139rE) it.next();
                C17880vN.A1P(r0.A01, map, r0.A00);
            }
            a11.A01 = map;
        }
        return map;
    }

    public final List A01(C188419hO r5, Collection collection, AnonymousClass1OX r7) {
        C186609eT A002 = ((C132226mR) this.A03.get()).A00(r5, r7);
        if (A002 == null) {
            return C18460wS.A00;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (C178119Bw r0 : A002.A03) {
            UserJid userJid = r0.A04.A01;
            if (!collection.contains(userJid)) {
                A13.add(userJid);
            }
        }
        return A13;
    }

    public A11(AnonymousClass1M9 r2, AnonymousClass1MW r3, AnonymousClass00H r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A03 = r4;
        this.A02 = AnonymousClass1DF.A01(new C22014AwG(r2, r3));
    }
}
