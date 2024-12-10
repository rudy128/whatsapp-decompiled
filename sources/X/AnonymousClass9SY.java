package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.9SY  reason: invalid class name */
public abstract class AnonymousClass9SY {
    public static final Jid A00(AnonymousClass190 r5, Jid jid, Class cls, String str) {
        boolean A1J = C108975cc.A1J(str);
        if (jid == null) {
            return null;
        }
        if (cls.isInstance(jid)) {
            return jid;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("web-query/failed to cast ");
        AnonymousClass8BW.A1M(jid, A10);
        A10.append(" to ");
        A10.append(cls.getName());
        A10.append('(');
        A10.append(jid);
        String A1H = AnonymousClass001.A1H(")@", str, A10);
        Log.e(A1H);
        r5.A0G(AnonymousClass001.A1H("web-query/downcast-failure/", str, AnonymousClass000.A10()), A1H, A1J);
        return null;
    }
}
