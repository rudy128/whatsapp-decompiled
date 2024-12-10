package X;

import java.text.Format;
import java.text.SimpleDateFormat;

/* renamed from: X.7Eo  reason: invalid class name and case insensitive filesystem */
public final class C143727Eo implements C1600686z {
    public Format BRx(C18000vb r4) {
        try {
            return new SimpleDateFormat("LLLL yyyy", r4.A0N());
        } catch (IllegalArgumentException unused) {
            return new SimpleDateFormat("MMMM yyyy", r4.A0N());
        }
    }
}
