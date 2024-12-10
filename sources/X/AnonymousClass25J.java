package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.25J  reason: invalid class name */
public final class AnonymousClass25J {
    public final C29681ch A01(String str) {
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
        return (C29681ch) obj2;
    }

    public static final C29681ch A00(String str) {
        C29681ch r1;
        C22911Dt r0 = Jid.Companion;
        Jid A00 = C22911Dt.A00(str);
        if ((A00 instanceof C29681ch) && (r1 = (C29681ch) A00) != null) {
            return r1;
        }
        throw new AnonymousClass11T(str);
    }
}
