package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.4W8  reason: invalid class name */
public abstract class AnonymousClass4W8 {
    public static final C27178DXn A01(C25691Pg r3, int i) {
        int i2;
        if (i == -2) {
            if (r3 == C25691Pg.SUSPEND) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C27178DXn.A05;
                AnonymousClass4WN r0 = C108485bm.A00;
                i2 = AnonymousClass4WN.A00;
            }
            return new C28242Du3(r3, 1);
        } else if (i != -1) {
            if (i != 0) {
                i2 = Integer.MAX_VALUE;
                if (i != Integer.MAX_VALUE) {
                    if (r3 == C25691Pg.SUSPEND) {
                        return new C27178DXn(i);
                    }
                    return new C28242Du3(r3, i);
                }
            } else {
                if (r3 == C25691Pg.SUSPEND) {
                    i2 = 0;
                }
                return new C28242Du3(r3, 1);
            }
        } else if (r3 == C25691Pg.SUSPEND) {
            return new C28242Du3(C25691Pg.DROP_OLDEST, 1);
        } else {
            throw AnonymousClass000.A0k("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        return new C27178DXn(i2);
    }
}
