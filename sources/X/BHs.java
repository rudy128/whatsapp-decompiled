package X;

import android.content.Context;
import android.graphics.Outline;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;

public class BHs extends ViewOutlineProvider {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public BHs(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void getOutline(View view, Outline outline) {
        Outline outline2 = outline;
        if (this.A00 != 0) {
            CZN czn = (CZN) this.A02;
            outline.setOval(0, 0, czn.A07, czn.A04);
            return;
        }
        boolean A17 = C18070vi.A17(view, outline);
        TypedValue typedValue = new TypedValue();
        ((Context) this.A02).getTheme().resolveAttribute(2130971023, typedValue, A17);
        outline2.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) TypedValue.complexToDimensionPixelSize(typedValue.data, AnonymousClass000.A0Y((View) this.A01).getDisplayMetrics()));
    }
}
