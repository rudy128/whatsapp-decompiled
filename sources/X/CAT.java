package X;

import java.util.Iterator;

public abstract class CAT {
    public static final C24349Bzk A00(int i) {
        Object obj;
        C24349Bzk bzk = C24349Bzk.UNSUPPORTED_TYPE;
        if (i > bzk.code) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Stream error returned an unknown code: ");
            A10.append(i);
            A10.append(". It may be dataX error: ");
            C26294Cx6.A07("StreamError", C17890vO.A0V(new C25792Cm4(i), A10));
        }
        Iterator it = C24349Bzk.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C24349Bzk) obj).code == i) {
                break;
            }
        }
        C24349Bzk bzk2 = (C24349Bzk) obj;
        if (bzk2 == null) {
            return bzk;
        }
        return bzk2;
    }
}
