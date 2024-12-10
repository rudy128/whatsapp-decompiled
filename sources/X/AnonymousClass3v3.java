package X;

import android.content.Context;

/* renamed from: X.3v3  reason: invalid class name */
public abstract class AnonymousClass3v3 extends C94884lL {
    public int A00;

    public void CQi(Context context) {
        float f;
        int A09 = (C72453Mb.A09(context) - C62762rw.A01(context, 480.0f)) / 2;
        if (this instanceof C79293v2) {
            f = 16.0f;
        } else {
            f = 0.0f;
        }
        this.A00 = Math.max(A09, C62762rw.A01(context, f));
        super.CQi(context);
    }
}
