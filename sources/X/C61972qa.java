package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2qa  reason: invalid class name and case insensitive filesystem */
public final class C61972qa {
    public final C24751Ln A00;
    public final C18030ve A01;
    public final C27121Uu A02;

    public static final boolean A00(C61972qa r2) {
        HashSet A04 = r2.A02.A04();
        if (!(A04 instanceof Collection) || !A04.isEmpty()) {
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof PhoneUserJid) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String A01() {
        if (!C18020vd.A05(C18040vf.A02, this.A01, 4718)) {
            return null;
        }
        if (A00(this)) {
            return "pn";
        }
        return "lid";
    }

    public C61972qa(C24751Ln r1, C18030ve r2, C27121Uu r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
