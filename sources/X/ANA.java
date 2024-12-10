package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class ANA implements BAI {
    public final /* synthetic */ C192569oc A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Set A02;
    public final /* synthetic */ C22821Di A03;

    public void BuD(C195149ss r4, int i) {
        AnonymousClass9XA r1;
        C22821Di r2 = this.A03;
        if (i == -1) {
            r1 = new AnonymousClass9XA(false);
        } else {
            r1 = new AnonymousClass9XA(false);
        }
        r2.invoke(r1);
    }

    public ANA(C192569oc r1, UserJid userJid, Set set, C22821Di r4) {
        this.A00 = r1;
        this.A02 = set;
        this.A01 = userJid;
        this.A03 = r4;
    }

    public void BuE(C195149ss r7, AN7 an7) {
        C192569oc r5 = this.A00;
        Set set = this.A02;
        UserJid userJid = this.A01;
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            A13.put(A0v, r5.A03.A01(userJid, A0v));
        }
        this.A03.invoke(new AnonymousClass8lT(A13, false));
    }
}
