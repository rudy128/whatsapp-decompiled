package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.9Rd  reason: invalid class name and case insensitive filesystem */
public abstract class C181609Rd {
    public static final C179839Kc A00(C20077A6d a6d) {
        C166418cr A01 = C20077A6d.A01(a6d);
        if (!AnonymousClass000.A1O(A01.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            return null;
        }
        C166368cm r0 = A01.protocolMessage_;
        C166368cm r1 = r0;
        if ((r0 == null && (r0 = C166368cm.DEFAULT_INSTANCE) == null) || (r0.bitField0_ & 2) == 0) {
            return null;
        }
        if (r1 == null && (r1 = C166368cm.DEFAULT_INSTANCE) == null) {
            return null;
        }
        return r1.A0R();
    }
}
