package X;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.LockableCoodinatorLayout;

/* renamed from: X.3SJ  reason: invalid class name */
public abstract class AnonymousClass3SJ extends CoordinatorLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public void A0I() {
        LockableCoodinatorLayout lockableCoodinatorLayout = (LockableCoodinatorLayout) this;
        if (!lockableCoodinatorLayout.A00) {
            lockableCoodinatorLayout.A00 = true;
            lockableCoodinatorLayout.A00 = C27691Xc.A0Z((C27691Xc) AnonymousClass3MX.A0T(lockableCoodinatorLayout));
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
