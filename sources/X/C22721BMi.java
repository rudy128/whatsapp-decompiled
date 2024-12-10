package X;

import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: X.BMi  reason: case insensitive filesystem */
public final class C22721BMi extends C6T {
    public final List A00 = C17880vN.A0z(3);

    public void A00(int i) {
        try {
            for (C6T A002 : this.A00) {
                A002.A00(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    public void A02(int i, float f, int i2) {
        try {
            for (C6T A02 : this.A00) {
                A02.A02(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
