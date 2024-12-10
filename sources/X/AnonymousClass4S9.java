package X;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: X.4S9  reason: invalid class name */
public class AnonymousClass4S9 {
    public boolean A00;
    public final AnonymousClass1WR A01;
    public final C24681Lg A02;
    public final HashMap A03 = C17880vN.A11();
    public final AnonymousClass1KB A04;

    public void A01() {
        this.A00 = true;
        AnonymousClass1KB r2 = this.A04;
        r2.A02.post(new C98834rn((Object) this, 17));
    }

    public Collection A00() {
        HashMap hashMap = this.A03;
        if (hashMap.size() == 0) {
            return C17880vN.A12();
        }
        return hashMap.values();
    }

    public AnonymousClass4S9(AnonymousClass1KB r3, C106755Xb r4, AnonymousClass4S9 r5, C24681Lg r6) {
        if (r5 != null) {
            r5.A01();
        }
        this.A04 = r3;
        this.A02 = r6;
        this.A00 = false;
        C95484mJ r0 = new C95484mJ(r4, this, 0);
        this.A01 = r0;
        r6.registerObserver(r0);
    }
}
