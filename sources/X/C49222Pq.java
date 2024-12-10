package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2Pq  reason: invalid class name and case insensitive filesystem */
public class C49222Pq extends A34 {
    public final C28521aN A00;
    public final C72323Lm A01;
    public final Set A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        boolean z;
        Iterator it = this.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            if (!this.A02.isCancelled()) {
                if (this.A00.A02(A0Q) > 0) {
                    z = true;
                    break;
                }
            } else {
                return null;
            }
        }
        if (!this.A02.isCancelled()) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && !this.A02.isCancelled()) {
            this.A01.Bc3(bool.booleanValue());
        }
    }

    public C49222Pq(C28521aN r2, AnonymousClass1BI r3, C72323Lm r4) {
        this.A00 = r2;
        HashSet A12 = C17880vN.A12();
        this.A02 = A12;
        A12.add(r3);
        this.A01 = r4;
    }

    public C49222Pq(C28521aN r2, C72323Lm r3, Set set) {
        this.A00 = r2;
        this.A02 = new HashSet(set);
        this.A01 = r3;
    }
}
