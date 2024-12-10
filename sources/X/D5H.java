package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior;

public class D5H implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass1YP A02;
    public final /* synthetic */ ExpandableBehavior A03;

    public D5H(View view, AnonymousClass1YP r2, ExpandableBehavior expandableBehavior, int i) {
        this.A03 = expandableBehavior;
        this.A01 = view;
        this.A00 = i;
        this.A02 = r2;
    }

    public boolean onPreDraw() {
        View view = this.A01;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.A03;
        if (expandableBehavior.A00 == this.A00) {
            AnonymousClass1YP r0 = this.A02;
            expandableBehavior.A0Q((View) r0, view, ((AnonymousClass1YQ) r0).A0D.A01, false);
        }
        return false;
    }
}
