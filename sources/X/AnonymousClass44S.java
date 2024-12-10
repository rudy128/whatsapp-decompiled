package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.44S  reason: invalid class name */
public abstract class AnonymousClass44S extends AnonymousClass3SJ {
    public AnonymousClass4RA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
        A0I();
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C18070vi.A0d(view, 0);
        super.addView(view, layoutParams);
        getInflationTimeTracker().A00(view, this);
    }

    public final void setInflationTimeTracker(AnonymousClass4RA r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass4RA getInflationTimeTracker() {
        AnonymousClass4RA r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("inflationTimeTracker");
        throw null;
    }

    public void addView(View view) {
        C18070vi.A0d(view, 0);
        super.addView(view);
        getInflationTimeTracker().A00(view, this);
    }
}
