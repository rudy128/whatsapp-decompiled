package X;

import android.widget.Magnifier;

/* renamed from: X.07B  reason: invalid class name */
public final class AnonymousClass07B extends AnonymousClass0UL {
    public void CQO(float f, long j, long j2) {
        if (!Float.isNaN(f)) {
            A00().setZoom(f);
        }
        if (j2 != AnonymousClass0QY.A02) {
            A00().show(AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j), AnonymousClass0QY.A01(j2), AnonymousClass0QY.A02(j2));
        } else {
            A00().show(AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j));
        }
    }

    public AnonymousClass07B(Magnifier magnifier) {
        super(magnifier);
    }
}
