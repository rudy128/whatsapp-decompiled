package X;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2w3  reason: invalid class name and case insensitive filesystem */
public class C65232w3 implements C38591rZ {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C65232w3(String str, AtomicBoolean atomicBoolean, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = atomicBoolean;
    }

    public final void onResult(Object obj) {
        String str = this.A02;
        Map map = C39771tc.A00;
        map.remove(str);
        ((AtomicBoolean) this.A01).set(true);
        if (map.size() == 0) {
            ArrayList A10 = C17880vN.A10(C39771tc.A01);
            if (0 < A10.size()) {
                A10.get(0);
                throw AnonymousClass000.A0s("onIdleChanged");
            }
        }
    }
}
