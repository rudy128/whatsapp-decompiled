package X;

import com.whatsapp.jid.GroupJid;
import java.util.Comparator;

/* renamed from: X.4rx  reason: invalid class name and case insensitive filesystem */
public class C98934rx implements Comparator {
    public final C98914rv A00;

    public static A2B A00(C29691ci r7) {
        String A0A;
        if (r7 == null) {
            return null;
        }
        GroupJid A0f = AnonymousClass3MW.A0f(r7.A08());
        if (r7.A0m || A0f == null || r7.A0A() == null) {
            return null;
        }
        if (r7.A0A() == null) {
            A0A = "";
        } else {
            A0A = r7.A0A();
        }
        return new A2B(A0f, A0A, r7.A03, 0);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        A2B A002 = A00((C29691ci) obj);
        A2B A003 = A00((C29691ci) obj2);
        if (A002 == null) {
            if (A003 == null) {
                return 0;
            }
            return -1;
        } else if (A003 == null) {
            return 1;
        } else {
            return this.A00.compare(A002, A003);
        }
    }

    public C98934rx(AnonymousClass1CJ r2) {
        this.A00 = new C98914rv(r2);
    }
}
