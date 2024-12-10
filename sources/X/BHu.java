package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class BHu extends AccessibilityNodeProvider {
    public final C25760ClV A00;

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C26228CvK A002 = this.A00.A00(i);
        if (A002 == null) {
            return null;
        }
        return A002.A02;
    }

    public AccessibilityNodeInfo findFocus(int i) {
        C26228CvK A01 = this.A00.A01(i);
        if (A01 == null) {
            return null;
        }
        return A01.A02;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.A00.A02(i, i2, bundle);
    }

    public BHu(C25760ClV clV) {
        this.A00 = clV;
    }

    public List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }
}
