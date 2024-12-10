package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.0Mj  reason: invalid class name and case insensitive filesystem */
public final class C04230Mj {
    public Set A00 = new LinkedHashSet();
    public Set A01 = new LinkedHashSet();
    public Set A02 = new LinkedHashSet();
    public final C18090vk A03 = new C08170ef(this);
    public final C22821Di A04;

    public C04230Mj(C22821Di r2) {
        this.A04 = r2;
    }

    public static final void A00(C04230Mj r2, Object obj, Set set) {
        if (set.add(obj) && r2.A02.size() + r2.A00.size() + r2.A01.size() == 1) {
            r2.A04.invoke(r2.A03);
        }
    }
}
