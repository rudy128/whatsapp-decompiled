package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9zz  reason: invalid class name and case insensitive filesystem */
public final class C199429zz {
    public final int A00;
    public final List A01;
    public final Map A02;
    public final Map A03;
    public final Set A04;

    public final Long A00(AnonymousClass9IL r7, AnonymousClass1BI r8) {
        long indexOf = (long) ((List) AnonymousClass8BV.A0m(r7, this.A02)).indexOf(r8);
        Long valueOf = Long.valueOf(indexOf);
        if (indexOf == -1) {
            return null;
        }
        return valueOf;
    }

    public C199429zz(int i) {
        this.A00 = i;
        this.A02 = C17880vN.A13();
        this.A03 = C200510q.A02(C17880vN.A13(), B21.A00);
        this.A04 = C17880vN.A14();
        this.A01 = AnonymousClass000.A13();
        for (AnonymousClass9IL put : AnonymousClass9IL.values()) {
            this.A02.put(put, AnonymousClass000.A13());
        }
    }

    public C199429zz() {
        this(0);
    }
}
