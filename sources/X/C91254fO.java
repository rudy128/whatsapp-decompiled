package X;

import java.util.Set;

/* renamed from: X.4fO  reason: invalid class name and case insensitive filesystem */
public class C91254fO implements AnonymousClass1GV {
    public final int A00;

    public C91254fO(int i) {
        this.A00 = i;
    }

    public final void accept(Object obj) {
        long longValue;
        AnonymousClass4P8 r5;
        int i;
        switch (this.A00) {
            case 0:
                r5 = (AnonymousClass4P8) obj;
                i = 5;
                break;
            case 1:
                r5 = (AnonymousClass4P8) obj;
                i = 4;
                break;
            case 2:
                r5 = (AnonymousClass4P8) obj;
                i = 1;
                break;
            case 3:
                r5 = (AnonymousClass4P8) obj;
                i = 8;
                break;
            case 4:
                C58132kC r52 = (C58132kC) obj;
                Set set = C32951i1.A0n;
                Long l = r52.A06;
                if (l == null) {
                    longValue = 0;
                } else {
                    longValue = l.longValue();
                }
                r52.A06 = Long.valueOf(longValue + 1);
                return;
            default:
                r5 = (AnonymousClass4P8) obj;
                i = 7;
                break;
        }
        r5.A00 = i;
    }
}
