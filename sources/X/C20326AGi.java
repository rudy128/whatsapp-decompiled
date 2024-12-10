package X;

import android.app.Activity;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.AGi  reason: case insensitive filesystem */
public final class C20326AGi implements C218317o {
    public final /* synthetic */ C190009kE A00;

    @OnLifecycleEvent(C27581Wq.ON_RESUME)
    public final void onResumed(AnonymousClass1F9 r3) {
        Integer num;
        C18070vi.A0d(r3, 0);
        if ((r3 instanceof AnonymousClass01C) && (num = this.A00.A00) != null) {
            ((Activity) r3).setRequestedOrientation(num.intValue());
            r3.getLifecycle().A06(this);
        }
    }

    public C20326AGi(C190009kE r1) {
        this.A00 = r1;
    }
}
