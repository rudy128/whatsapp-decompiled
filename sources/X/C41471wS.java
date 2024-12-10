package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1wS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41471wS implements AnonymousClass1TI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public final void accept(Object obj) {
        View view = this.A01;
        View view2 = this.A02;
        int i = this.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int intValue = ((Number) obj).intValue();
        layoutParams.height = intValue;
        view.setLayoutParams(layoutParams);
        view2.setTranslationY((float) (intValue - i));
    }

    public /* synthetic */ C41471wS(View view, View view2, int i) {
        this.A01 = view;
        this.A02 = view2;
        this.A00 = i;
    }
}
