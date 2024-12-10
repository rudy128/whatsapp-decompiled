package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1yH  reason: invalid class name and case insensitive filesystem */
public final class C42501yH {
    public final AnonymousClass1E2 A02(String str) {
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
        return (AnonymousClass1E2) obj2;
    }

    public final AnonymousClass1E2 A03(String str) {
        Object obj;
        Object obj2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            obj = A00(str);
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            obj2 = obj;
        }
        return (AnonymousClass1E2) obj2;
    }

    public static final AnonymousClass1E2 A00(String str) {
        AnonymousClass1E2 r1;
        C22911Dt r0 = Jid.Companion;
        Jid A00 = C22911Dt.A00(str);
        if ((A00 instanceof AnonymousClass1E2) && (r1 = (AnonymousClass1E2) A00) != null) {
            return r1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid lid: ");
        sb.append(str);
        throw new AnonymousClass11T(sb.toString());
    }

    public static final AnonymousClass1E2 A01(String str) {
        AnonymousClass1E2 r1;
        C18070vi.A0d(str, 0);
        UserJid A04 = UserJid.JID_FACTORY.A04(str, "lid");
        C18070vi.A0X(A04);
        if ((A04 instanceof AnonymousClass1E2) && (r1 = (AnonymousClass1E2) A04) != null) {
            return r1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid lid: ");
        sb.append(str);
        throw new AnonymousClass11T(sb.toString());
    }
}
