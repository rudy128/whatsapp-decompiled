package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.1nh  reason: invalid class name and case insensitive filesystem */
public final class C36321nh {
    public static final boolean A02(String str) {
        int length;
        C18070vi.A0d(str, 0);
        if (!AnonymousClass1YF.A0Y(str, "-", false) && (length = str.length()) >= 1 && length <= 20) {
            char charAt = str.charAt(0);
            if (C18070vi.A00(charAt, 49) >= 0 && C18070vi.A00(charAt, 57) <= 0) {
                int i = 1;
                while (i < length) {
                    char charAt2 = str.charAt(i);
                    if (C18070vi.A00(charAt2, 48) >= 0 && C18070vi.A00(charAt2, 57) <= 0) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final GroupJid A03(String str) {
        Object obj;
        Object obj2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            obj = A01(str);
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            obj2 = obj;
        }
        return (GroupJid) obj2;
    }

    public static final GroupJid A00(Jid jid) {
        if (jid instanceof GroupJid) {
            return (GroupJid) jid;
        }
        return null;
    }

    public static final GroupJid A01(String str) {
        GroupJid groupJid;
        C22911Dt r0 = Jid.Companion;
        Jid A00 = C22911Dt.A00(str);
        if ((A00 instanceof GroupJid) && (groupJid = (GroupJid) A00) != null) {
            return groupJid;
        }
        throw new AnonymousClass11T(str);
    }
}
