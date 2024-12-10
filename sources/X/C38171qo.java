package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1qo  reason: invalid class name and case insensitive filesystem */
public class C38171qo extends AnonymousClass1XU {
    public final RecyclerView A00;
    public final C38181qp A01;

    public C38171qo(RecyclerView recyclerView) {
        C38181qp r1;
        this.A00 = recyclerView;
        AnonymousClass1XU A1b = A1b();
        if (A1b == null || !(A1b instanceof C38181qp)) {
            r1 = new C38181qp(this);
        } else {
            r1 = (C38181qp) A1b;
        }
        this.A01 = r1;
    }

    public void A1T(View view, AccessibilityEvent accessibilityEvent) {
        C38251qy layoutManager;
        super.A1T(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.A00.A10() && (layoutManager = ((RecyclerView) view).getLayoutManager()) != null) {
            layoutManager.A1B(accessibilityEvent);
        }
    }

    public boolean A1Y(View view, int i, Bundle bundle) {
        C38251qy layoutManager;
        if (super.A1Y(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A10() || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return false;
        }
        RecyclerView recyclerView2 = layoutManager.A07;
        return layoutManager.A0g(bundle, recyclerView2.A0v, recyclerView2.A0w, i);
    }

    public void A1Z(View view, C26228CvK cvK) {
        C38251qy layoutManager;
        super.A1Z(view, cvK);
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A10() && (layoutManager = recyclerView.getLayoutManager()) != null) {
            RecyclerView recyclerView2 = layoutManager.A07;
            layoutManager.A0Z(cvK, recyclerView2.A0v, recyclerView2.A0w);
        }
    }

    public AnonymousClass1XU A1b() {
        return this.A01;
    }
}
