package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.28q  reason: invalid class name and case insensitive filesystem */
public class C453528q extends AnonymousClass1LL {
    public final int A00;

    public C453528q(int i) {
        this.A00 = i;
    }

    public float BSB(View view, ViewGroup viewGroup) {
        int i = this.A00;
        float translationX = view.getTranslationX();
        float width = (float) viewGroup.getWidth();
        if (i != 0) {
            return translationX + width;
        }
        return translationX - width;
    }
}
