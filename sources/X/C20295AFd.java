package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.AFd  reason: case insensitive filesystem */
public class C20295AFd implements ViewStub.OnInflateListener {
    public final int A00;
    public final Object A01;

    public C20295AFd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        if (this.A00 != 0) {
            C187939gc r1 = (C187939gc) this.A01;
            C18070vi.A0d(r1, 0);
            r1.A00 = true;
            return;
        }
        ((C22539BBw) this.A01).CA8(view);
    }
}
