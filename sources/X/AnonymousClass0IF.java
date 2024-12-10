package X;

import java.util.List;

/* renamed from: X.0IF  reason: invalid class name */
public final class AnonymousClass0IF {
    public final C001100p A00;
    public final AnonymousClass0HT A01;

    public final boolean A00(long j) {
        Object obj;
        List list = this.A01.A01;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((AnonymousClass0KJ) obj).A02 == j) {
                break;
            }
            i++;
        }
        AnonymousClass0KJ r3 = (AnonymousClass0KJ) obj;
        if (r3 != null) {
            return r3.A0A;
        }
        return false;
    }

    public AnonymousClass0IF(C001100p r1, AnonymousClass0HT r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
