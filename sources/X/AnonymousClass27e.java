package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.27e  reason: invalid class name */
public class AnonymousClass27e extends C25760ClV {
    public final /* synthetic */ C39401t1 A00;

    public C26228CvK A01(int i) {
        int i2;
        C39401t1 r0 = this.A00;
        if (i == 2) {
            i2 = r0.A00;
        } else {
            i2 = r0.A02;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return A00(i2);
    }

    public AnonymousClass27e(C39401t1 r1) {
        this.A00 = r1;
    }

    public C26228CvK A00(int i) {
        return new C26228CvK(AccessibilityNodeInfo.obtain(this.A00.A1c(i).A02));
    }

    public boolean A02(int i, int i2, Bundle bundle) {
        int i3;
        C39401t1 r2 = this.A00;
        if (i == -1) {
            return r2.A04.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return r2.A1l(i);
        }
        if (i2 == 2) {
            return r2.A1k(i);
        }
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = r2.A05;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = r2.A00) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                r2.A00 = Integer.MIN_VALUE;
                r2.A04.invalidate();
                r2.A1e(i3, 65536);
            }
            r2.A00 = i;
            r2.A04.invalidate();
            r2.A1e(i, 32768);
            return true;
        } else if (i2 != 128) {
            return r2.A1m(i, i2, bundle);
        } else {
            if (r2.A00 != i) {
                return false;
            }
            r2.A00 = Integer.MIN_VALUE;
            r2.A04.invalidate();
            r2.A1e(i, 65536);
            return true;
        }
    }
}
