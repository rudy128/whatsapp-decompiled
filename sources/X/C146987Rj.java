package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.text.Collator;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.7Rj  reason: invalid class name and case insensitive filesystem */
public class C146987Rj implements Comparator {
    public final C24921Me A00;
    public final Collator A01;
    public final Map A02 = C17880vN.A11();

    public String A01(AnonymousClass1E7 r5) {
        if (r5 == null) {
            return null;
        }
        String str = r5.A0Y;
        if (str != null && str.length() > 0) {
            return str;
        }
        if (r5.A0J == null) {
            return null;
        }
        Map map = this.A02;
        Class<UserJid> cls = UserJid.class;
        String A0s = C17880vN.A0s(r5.A06(cls), map);
        if (A0s != null) {
            return A0s;
        }
        String A0I = this.A00.A0I(r5);
        map.put(r5.A06(cls), A0I);
        return A0I;
    }

    public C146987Rj(C24921Me r3, C18000vb r4) {
        this.A00 = r3;
        Collator A0r = C108965cb.A0r(r4);
        this.A01 = A0r;
        A0r.setDecomposition(1);
    }

    /* renamed from: A00 */
    public int compare(AnonymousClass1E7 r7, AnonymousClass1E7 r8) {
        String A012 = A01(r7);
        String A013 = A01(r8);
        if (A012 == null && A013 == null) {
            return 0;
        }
        if (A012 != null) {
            if (A013 != null) {
                int compare = this.A01.compare(A012, A013);
                if (compare != 0) {
                    return compare;
                }
                AnonymousClass1BI r1 = r7.A0J;
                AnonymousClass1BI r0 = r8.A0J;
                if (r1 == null) {
                    if (r0 == null) {
                        return 0;
                    }
                } else if (r0 != null) {
                    return r1.compareTo((Jid) r0);
                }
            }
            return -1;
        }
        return 1;
    }
}
