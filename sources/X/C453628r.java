package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.28r  reason: invalid class name and case insensitive filesystem */
public class C453628r extends AnonymousClass1LM {
    public final int A00;

    public C453628r(int i) {
        this.A00 = i;
    }

    public float BSC(View view, ViewGroup viewGroup) {
        int i = this.A00;
        float translationY = view.getTranslationY();
        float height = (float) viewGroup.getHeight();
        if (i != 0) {
            return translationY + height;
        }
        return translationY - height;
    }
}
