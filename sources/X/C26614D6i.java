package X;

import java.lang.reflect.Method;
import java.util.Map;

@Deprecated
/* renamed from: X.D6i  reason: case insensitive filesystem */
public class C26614D6i implements AnonymousClass1GC {
    public final C25519ChH A00;
    public final Object A01;

    public void C6U(C27581Wq r4, AnonymousClass1F9 r5) {
        C25519ChH chH = this.A00;
        Object obj = this.A01;
        Map map = chH.A00;
        C25519ChH.A00(r4, r5, obj, AnonymousClass8BS.A0t(r4, map));
        C25519ChH.A00(r4, r5, obj, AnonymousClass8BS.A0t(C27581Wq.ON_ANY, map));
    }

    public C26614D6i(Object obj) {
        this.A01 = obj;
        C26107CsR csR = C26107CsR.A02;
        Class<?> cls = obj.getClass();
        C25519ChH chH = (C25519ChH) csR.A00.get(cls);
        this.A00 = chH == null ? C26107CsR.A00(csR, cls, (Method[]) null) : chH;
    }
}
