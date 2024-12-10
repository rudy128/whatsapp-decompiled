package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.6yN  reason: invalid class name and case insensitive filesystem */
public final class C139186yN {
    public final C63372sx A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final Map A04;
    public final Map A05;

    public final boolean A00() {
        if (this.A00 != null || !this.A02.isEmpty() || !this.A03.isEmpty() || !this.A01.isEmpty() || !this.A05.isEmpty() || !this.A04.isEmpty()) {
            return false;
        }
        return true;
    }

    public C139186yN(C63372sx r4, List list, List list2, List list3, Map map, Map map2) {
        this.A00 = r4;
        this.A02 = C29431cG.A0y(list, new C146997Rk((Object) new AnonymousClass849(true), 11));
        this.A03 = C29431cG.A0y(list2, new C146997Rk((Object) new AnonymousClass849(true), 11));
        this.A01 = C29431cG.A0y(list3, new C146997Rk((Object) new AnonymousClass849(false), 11));
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        C18070vi.A0X(unmodifiableMap);
        this.A05 = unmodifiableMap;
        Map unmodifiableMap2 = Collections.unmodifiableMap(map2);
        C18070vi.A0X(unmodifiableMap2);
        this.A04 = unmodifiableMap2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C139186yN() {
        /*
            r7 = this;
            r1 = 0
            X.0wS r2 = X.C18460wS.A00
            X.1CQ r5 = X.AnonymousClass1D7.A0I()
            X.1CQ r6 = X.AnonymousClass1D7.A0I()
            r0 = r7
            r3 = r2
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139186yN.<init>():void");
    }
}
