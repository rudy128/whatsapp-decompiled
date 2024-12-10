package X;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.Reference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1XU  reason: invalid class name */
public class AnonymousClass1XU {
    public static final View.AccessibilityDelegate A02 = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate A00;
    public final View.AccessibilityDelegate A01;

    public void A1S(View view, int i) {
        this.A01.sendAccessibilityEvent(view, i);
    }

    public void A1T(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A1U(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void A1V(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean A1W(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (this instanceof C38181qp) {
            C38181qp r1 = (C38181qp) this;
            AnonymousClass1XU r0 = (AnonymousClass1XU) r1.A00.get(view);
            if (r0 != null) {
                return r0.A1W(view, accessibilityEvent);
            }
            accessibilityDelegate = r1.A01;
        } else {
            accessibilityDelegate = this.A01;
        }
        return accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean A1X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void A1Z(View view, C26228CvK cvK) {
        this.A01.onInitializeAccessibilityNodeInfo(view, cvK.A02);
    }

    public C25760ClV A1a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.A01.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C25760ClV(accessibilityNodeProvider);
        }
        return null;
    }

    public AnonymousClass1XU(View.AccessibilityDelegate accessibilityDelegate) {
        this.A01 = accessibilityDelegate;
        this.A00 = new AnonymousClass1XW(this);
    }

    public boolean A1Y(View view, int i, Bundle bundle) {
        Reference reference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(2131436005);
        if (list == null) {
            list = Collections.emptyList();
        }
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            C26137Ct0 ct0 = (C26137Ct0) list.get(i2);
            if (((AccessibilityNodeInfo.AccessibilityAction) ct0.A03).getId() == i) {
                E3b e3b = ct0.A01;
                if (e3b != null) {
                    Class cls = ct0.A02;
                    if (cls != null) {
                        try {
                            ((C50) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).A00 = bundle;
                        } catch (Exception e) {
                            String name = cls.getName();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to execute command with argument class ViewCommandArgument: ");
                            sb.append(name);
                            Log.e("A11yActionCompat", sb.toString(), e);
                        }
                    }
                    boolean CBT = e3b.CBT(view);
                    if (CBT) {
                        return CBT;
                    }
                }
            } else {
                i2++;
            }
        }
        boolean performAccessibilityAction = this.A01.performAccessibilityAction(view, i, bundle);
        if (performAccessibilityAction || i != 2131427376 || bundle == null) {
            return performAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(2131436006);
        if (sparseArray == null || (reference = (Reference) sparseArray.get(i3)) == null || (clickableSpan = (ClickableSpan) reference.get()) == null) {
            return false;
        }
        CharSequence text = view.createAccessibilityNodeInfo().getText();
        if (!(text instanceof Spanned)) {
            return false;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
        if (clickableSpanArr == null) {
            return false;
        }
        for (ClickableSpan equals : clickableSpanArr) {
            if (clickableSpan.equals(equals)) {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    public AnonymousClass1XU() {
        this(A02);
    }
}
