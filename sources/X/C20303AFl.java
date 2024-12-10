package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.AFl  reason: case insensitive filesystem */
public class C20303AFl implements ViewTreeObserver.OnScrollChangedListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C20303AFl(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void onScrollChanged() {
        float f;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            Context context = (Context) obj;
            C003401n r1 = (C003401n) this.A03;
            if (((View) this.A02).canScrollVertically(-1)) {
                C28891bE.A00(context);
            } else {
                r1.A0J(0.0f);
            }
        } else {
            C003401n r2 = (C003401n) this.A02;
            Context context2 = (Context) this.A03;
            if (((View) obj).canScrollVertically(-1)) {
                f = C28891bE.A00(context2);
            } else {
                f = 0.0f;
            }
            r2.A0J(f);
        }
    }
}
