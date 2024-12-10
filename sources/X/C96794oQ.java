package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.4oQ  reason: invalid class name and case insensitive filesystem */
public class C96794oQ implements AnonymousClass8B4 {
    public final /* synthetic */ C88204Ys A00;
    public final /* synthetic */ AnonymousClass4aY A01;

    public C96794oQ(C88204Ys r1, AnonymousClass4aY r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void By8(ArrayList arrayList) {
        Map map = this.A00.A04.A00;
        synchronized (map) {
            map.clear();
        }
    }

    public C23381Fv getLifecycle() {
        return this.A01.A2Q.getLifecycle();
    }
}
