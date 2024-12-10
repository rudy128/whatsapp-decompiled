package X;

import android.view.View;
import androidx.compose.runtime.Recomposer;

/* renamed from: X.0RZ  reason: invalid class name */
public class AnonymousClass0RZ implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass0RZ(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void onViewAttachedToWindow(View view) {
        if (this.A00 == 0) {
            AnonymousClass05G r2 = (AnonymousClass05G) this.A02;
            AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(r2);
            if (A002 != null) {
                ((C98494rF) this.A01).element = AnonymousClass0LQ.A00(r2, A002.getLifecycle());
                r2.removeOnAttachStateChangeListener(this);
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("View tree for ");
            A10.append(r2);
            throw AnonymousClass000.A0o(" has no ViewTreeLifecycleOwner", A10);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        if (this.A00 != 0) {
            ((View) this.A02).removeOnAttachStateChangeListener(this);
            ((Recomposer) this.A01).A0j();
        }
    }
}
