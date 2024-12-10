package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2vt  reason: invalid class name and case insensitive filesystem */
public class C65132vt implements AnonymousClass1GI {
    public final int A00;
    public final Object A01;

    public C65132vt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Bundle CGk() {
        switch (this.A00) {
            case 0:
                return ((AnonymousClass1FL) this.A01).A2T();
            case 1:
                return ((AnonymousClass1GP) this.A01).A0L();
            default:
                C37361pP r3 = (C37361pP) this.A01;
                Iterator A15 = AnonymousClass000.A15(AnonymousClass1D7.A0F(r3.A04));
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    r3.A04(C17880vN.A0x(A16), ((AnonymousClass1GI) A16.getValue()).CGk());
                }
                Map map = r3.A03;
                Set keySet = map.keySet();
                ArrayList A0z = C17880vN.A0z(keySet.size());
                ArrayList A0z2 = C17880vN.A0z(A0z.size());
                for (Object next : keySet) {
                    A0z.add(next);
                    A0z2.add(map.get(next));
                }
                AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
                AnonymousClass1D6.A03("keys", A0z, r2, 0);
                r2[1] = AnonymousClass1D6.A01("values", A0z2);
                return AnonymousClass9O6.A00(r2);
        }
    }
}
