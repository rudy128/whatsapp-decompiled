package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.2vg  reason: invalid class name and case insensitive filesystem */
public class C65002vg implements AnonymousClass1GC, C218317o {
    public final int A00;
    public final Object A01;

    public C65002vg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C6U(C27581Wq r4, AnonymousClass1F9 r5) {
        View view;
        if (this.A00 != 0) {
            AnonymousClass1GB r2 = (AnonymousClass1GB) this.A01;
            C18070vi.A0e(r2, 0, r4);
            if (r4 == C27581Wq.ON_START) {
                r2.A02 = true;
            } else if (r4 == C27581Wq.ON_STOP) {
                r2.A02 = false;
            }
        } else if (r4 == C27581Wq.ON_STOP && (view = ((Fragment) this.A01).A0B) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
