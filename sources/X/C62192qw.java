package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2qw  reason: invalid class name and case insensitive filesystem */
public final class C62192qw {
    public static final C42711yc A00(String str) {
        C42711yc r1;
        C18070vi.A0d(str, 0);
        UserJid A04 = UserJid.JID_FACTORY.A04(str, "bot");
        C18070vi.A0X(A04);
        if ((A04 instanceof C42711yc) && (r1 = (C42711yc) A04) != null) {
            return r1;
        }
        throw new AnonymousClass11T(AnonymousClass001.A1H("invalid bot jid: ", str, AnonymousClass000.A10()));
    }

    public final C42711yc A01(String str) {
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
        return (C42711yc) obj2;
    }

    public final C42711yc A02(String str) {
        Object obj;
        Object obj2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            C22911Dt r0 = Jid.Companion;
            Object A00 = C22911Dt.A00(str);
            if (!(A00 instanceof C42711yc) || (obj = (C42711yc) A00) == null) {
                throw new AnonymousClass11T(AnonymousClass001.A1H("invalid bot jid: ", str, AnonymousClass000.A10()));
            }
            if (!(obj instanceof AnonymousClass1IU)) {
                obj2 = obj;
            }
            return (C42711yc) obj2;
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
    }
}
