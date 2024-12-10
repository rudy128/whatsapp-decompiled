package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1XW  reason: invalid class name */
public final class AnonymousClass1XW extends View.AccessibilityDelegate {
    public final AnonymousClass1XU A00;

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A1W(view, accessibilityEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C25760ClV A1a = this.A00.A1a(view);
        if (A1a != null) {
            return (AccessibilityNodeProvider) A1a.A00;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A1T(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C26228CvK cvK = new C26228CvK(accessibilityNodeInfo);
        cvK.A0o(AnonymousClass1HF.A0t(view));
        cvK.A0k(AnonymousClass1HF.A0s(view));
        cvK.A0U(AnonymousClass1HF.A0H(view));
        cvK.A0W((CharSequence) new AnonymousClass27c(1).A00(view));
        this.A00.A1Z(view, cvK);
        cvK.A0K(view, accessibilityNodeInfo.getText());
        List list = (List) view.getTag(2131436005);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i = 0; i < list.size(); i++) {
            cvK.A0L((C26137Ct0) list.get(i));
        }
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A1U(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A1X(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.A00.A1Y(view, i, bundle);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.A00.A1S(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A1V(view, accessibilityEvent);
    }

    public AnonymousClass1XW(AnonymousClass1XU r1) {
        this.A00 = r1;
    }
}
