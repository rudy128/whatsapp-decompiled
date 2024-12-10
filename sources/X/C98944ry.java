package X;

import android.util.Pair;
import com.whatsapp.jid.GroupJid;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4ry  reason: invalid class name and case insensitive filesystem */
public class C98944ry implements Comparator {
    public final C34511kb A00;
    public final AnonymousClass1CJ A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass1EC r1;
        C29691ci r9 = (C29691ci) obj;
        C29691ci r10 = (C29691ci) obj2;
        AnonymousClass1EC r3 = null;
        if (r9 == null || r9.A03 != 1) {
            r1 = null;
        } else {
            r1 = AnonymousClass3MW.A0i(r9.A08());
        }
        if (r10 != null && r10.A03 == 1) {
            r3 = AnonymousClass3MW.A0i(r10.A08());
        }
        if (r1 == null) {
            if (r3 != null) {
                return -1;
            }
            return 0;
        } else if (r3 == null) {
            return 1;
        } else {
            C34511kb r2 = this.A00;
            Pair A002 = A00(r2.A08(r1));
            long A05 = C17880vN.A05(A002.first);
            boolean A1Y = AnonymousClass000.A1Y(A002.second);
            Pair A003 = A00(r2.A08(r3));
            long A052 = C17880vN.A05(A003.first);
            if (A1Y == AnonymousClass000.A1Y(A003.second)) {
                return (A052 > A05 ? 1 : (A052 == A05 ? 0 : -1));
            }
            if (A1Y) {
                return 1;
            }
        }
        return -1;
    }

    public C98944ry(C34511kb r1, AnonymousClass1CJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    private Pair A00(Set set) {
        Iterator it = set.iterator();
        long j = 0;
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return new Pair(Long.valueOf(j), Boolean.valueOf(z));
                }
                AnonymousClass1CJ r4 = this.A01;
                GroupJid groupJid = ((A2B) it.next()).A02;
                long A08 = r4.A08(groupJid);
                if (A08 > j) {
                    j = A08;
                }
                if (!z || !r4.A0Q(groupJid)) {
                    z = false;
                }
            }
        }
    }
}
