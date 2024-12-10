package X;

import java.util.List;

/* renamed from: X.0N8  reason: invalid class name */
public final class AnonymousClass0N8 {
    public final List A00 = AnonymousClass000.A13();

    public final int A00() {
        return AnonymousClass000.A0M(C29431cG.A0b(this.A00));
    }

    public final int A01() {
        int A0n;
        List list = this.A00;
        if (list.size() > 0) {
            int A0n2 = AnonymousClass001.A0n(list, 0);
            while (AnonymousClass000.A1a(list) && AnonymousClass001.A0n(list, 0) == A0n2) {
                list.set(0, C29431cG.A0d(list));
                list.remove(list.size() - 1);
                int size = list.size();
                int size2 = list.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int A0n3 = AnonymousClass001.A0n(list, i);
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int A0n4 = AnonymousClass001.A0n(list, i3);
                    if (i2 < size && (A0n = AnonymousClass001.A0n(list, i2)) > A0n4) {
                        if (A0n <= A0n3) {
                            break;
                        }
                        list.set(i, Integer.valueOf(A0n));
                        list.set(i2, Integer.valueOf(A0n3));
                        i = i2;
                    } else if (A0n4 <= A0n3) {
                        break;
                    } else {
                        list.set(i, Integer.valueOf(A0n4));
                        list.set(i3, Integer.valueOf(A0n3));
                        i = i3;
                    }
                }
            }
            return A0n2;
        }
        C05020Qb.A06("Set is empty");
        throw null;
    }

    public final void A02(int i) {
        List list = this.A00;
        if (!AnonymousClass000.A1a(list) || !(AnonymousClass001.A0n(list, 0) == i || AnonymousClass001.A0n(list, list.size() - 1) == i)) {
            int size = list.size();
            Integer valueOf = Integer.valueOf(i);
            list.add(valueOf);
            while (size > 0) {
                int i2 = ((size + 1) >>> 1) - 1;
                int A0n = AnonymousClass001.A0n(list, i2);
                if (i <= A0n) {
                    break;
                }
                list.set(size, Integer.valueOf(A0n));
                size = i2;
            }
            list.set(size, valueOf);
        }
    }

    public /* synthetic */ AnonymousClass0N8(List list, int i, AnonymousClass1Y1 r4) {
    }

    public AnonymousClass0N8() {
    }
}
