package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.1qp  reason: invalid class name and case insensitive filesystem */
public class C38181qp extends AnonymousClass1XU {
    public Map A00 = new WeakHashMap();
    public final C38171qo A01;

    public void A1S(View view, int i) {
        AnonymousClass1XU r0 = (AnonymousClass1XU) this.A00.get(view);
        if (r0 != null) {
            r0.A1S(view, i);
        } else {
            super.A1S(view, i);
        }
    }

    public void A1T(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass1XU r0 = (AnonymousClass1XU) this.A00.get(view);
        if (r0 != null) {
            r0.A1T(view, accessibilityEvent);
        } else {
            super.A1T(view, accessibilityEvent);
        }
    }

    public void A1U(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass1XU r0 = (AnonymousClass1XU) this.A00.get(view);
        if (r0 != null) {
            r0.A1U(view, accessibilityEvent);
        } else {
            super.A1U(view, accessibilityEvent);
        }
    }

    public void A1V(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass1XU r0 = (AnonymousClass1XU) this.A00.get(view);
        if (r0 != null) {
            r0.A1V(view, accessibilityEvent);
        } else {
            super.A1V(view, accessibilityEvent);
        }
    }

    public boolean A1X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass1XU r0 = (AnonymousClass1XU) this.A00.get(viewGroup);
        if (r0 != null) {
            return r0.A1X(viewGroup, view, accessibilityEvent);
        }
        return super.A1X(viewGroup, view, accessibilityEvent);
    }

    public boolean A1Y(View view, int i, Bundle bundle) {
        boolean A1Y;
        RecyclerView recyclerView = this.A01.A00;
        if (recyclerView.A10() || recyclerView.getLayoutManager() == null) {
            return super.A1Y(view, i, bundle);
        }
        AnonymousClass1XU r0 = (AnonymousClass1XU) this.A00.get(view);
        if (r0 != null) {
            A1Y = r0.A1Y(view, i, bundle);
        } else {
            A1Y = super.A1Y(view, i, bundle);
        }
        if (A1Y) {
            return true;
        }
        return false;
    }

    public void A1Z(View view, C26228CvK cvK) {
        C38251qy layoutManager;
        RecyclerView recyclerView = this.A01.A00;
        if (!recyclerView.A10() && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.A0Y(view, cvK);
            AnonymousClass1XU r0 = (AnonymousClass1XU) this.A00.get(view);
            if (r0 != null) {
                r0.A1Z(view, cvK);
                return;
            }
        }
        super.A1Z(view, cvK);
    }

    public C25760ClV A1a(View view) {
        AnonymousClass1XU r0 = (AnonymousClass1XU) this.A00.get(view);
        if (r0 != null) {
            return r0.A1a(view);
        }
        return super.A1a(view);
    }

    public C38181qp(C38171qo r2) {
        this.A01 = r2;
    }
}
