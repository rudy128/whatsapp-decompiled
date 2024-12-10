package X;

import android.text.Editable;

/* renamed from: X.4Gi  reason: invalid class name and case insensitive filesystem */
public abstract class C83704Gi {
    public static final void A00(Editable editable, AnonymousClass20E r5) {
        Object[] spans = editable.getSpans(0, editable.length(), AnonymousClass20W.A00(r5));
        if (spans != null) {
            for (Object removeSpan : spans) {
                editable.removeSpan(removeSpan);
            }
        }
    }
}
