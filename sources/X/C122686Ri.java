package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.6Ri  reason: invalid class name and case insensitive filesystem */
public enum C122686Ri {
    CONTROLS_HIDDEN(0, false, true, true),
    CONTROLS_SHOWN(1, true, true, true),
    AR_EFFECT_SELF_FLOATING(2, false, false, false),
    AR_EFFECT_PEER_FLOATING(3, false, true, false),
    FOCUS(4, false, false, false),
    PIP(5, false, false, false);
    
    public static final float A00 = 0.0f;
    public final boolean canDrag;
    public final boolean canShowButtons;
    public final boolean canTap;
    public final float sizeFactor;

    /* access modifiers changed from: public */
    static {
        C122686Ri[] r1;
        C19820z3 A002 = C19780yz.A00(r1);
        A01 = A002;
        Iterator it = A002.iterator();
        if (it.hasNext()) {
            float f = ((C122686Ri) it.next()).sizeFactor;
            while (it.hasNext()) {
                f = Math.max(f, ((C122686Ri) it.next()).sizeFactor);
            }
            A00 = f;
            return;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: public */
    C122686Ri(int i, boolean z, boolean z2, boolean z3) {
        this.sizeFactor = r2;
        this.canShowButtons = z;
        this.canDrag = z2;
        this.canTap = z3;
    }
}
