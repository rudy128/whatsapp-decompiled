package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1yz  reason: invalid class name and case insensitive filesystem */
public final class C42941yz {
    public final AnonymousClass1EC A02(String str) {
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
        return (AnonymousClass1EC) obj2;
    }

    public static final AnonymousClass1EC A00(Jid jid) {
        if (jid instanceof AnonymousClass1EC) {
            return (AnonymousClass1EC) jid;
        }
        return null;
    }

    public static final AnonymousClass1EC A01(String str) {
        AnonymousClass1EC r1;
        C22911Dt r0 = Jid.Companion;
        Jid A00 = C22911Dt.A00(str);
        if ((A00 instanceof AnonymousClass1EC) && (r1 = (AnonymousClass1EC) A00) != null) {
            return r1;
        }
        throw new AnonymousClass11T(str);
    }
}
