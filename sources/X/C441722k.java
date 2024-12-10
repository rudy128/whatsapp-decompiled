package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Collections;
import java.util.List;

/* renamed from: X.22k  reason: invalid class name and case insensitive filesystem */
public abstract class C441722k extends AnonymousClass21V {
    public final AnonymousClass25F A00 = A0N(AnonymousClass7LG.class);
    public final AnonymousClass25F A01 = A0N(AnonymousClass7LE.class);
    public volatile boolean A02 = false;

    public List A1G() {
        AnonymousClass25F r2 = this.A01;
        if (!r2.A03) {
            return null;
        }
        AnonymousClass7LE r0 = (AnonymousClass7LE) r2.A02;
        if (r0 != null) {
            return r0.A00;
        }
        return Collections.emptyList();
    }

    public void A1H(AnonymousClass7LG r3) {
        this.A00.A02(r3);
        if (r3 == null) {
            A0c(32768);
        } else {
            A0b(32768);
        }
    }

    public void A1I(List list) {
        AnonymousClass25F r1 = this.A01;
        if (list == null) {
            r1.A01();
        } else {
            r1.A02(new AnonymousClass7LE(list));
        }
        if (list == null || list.size() == 0) {
            A0X(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        } else {
            A0V(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        }
    }

    public C441722k(AnonymousClass205 r2, int i, long j) {
        super(r2, i, j);
    }
}
