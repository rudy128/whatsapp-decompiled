package X;

import java.util.Iterator;

/* renamed from: X.9Qb  reason: invalid class name and case insensitive filesystem */
public abstract class C181329Qb {
    public static final void A00(AnonymousClass122 r6, AnonymousClass206 r7) {
        AnonymousClass21K r0;
        C20285AEt BPK;
        C20277AEk aEk;
        Object obj = null;
        if ((r7 instanceof AnonymousClass21K) && (r0 = (AnonymousClass21K) r7) != null && (BPK = r0.BPK()) != null) {
            int i = BPK.A00;
            if ((i == 5 || i == 9) && (aEk = BPK.A06) != null) {
                Iterator it = aEk.A03.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AnonymousClass8BW.A1U(next, "galaxy_message")) {
                        obj = next;
                        break;
                    }
                }
                C20253ADl aDl = (C20253ADl) obj;
                if (aDl != null) {
                    aDl.A00 = true;
                }
                r6.CQw(r7);
            }
        }
    }
}
