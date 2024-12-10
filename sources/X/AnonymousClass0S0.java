package X;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: X.0S0  reason: invalid class name */
public final class AnonymousClass0S0 implements OnBackAnimationCallback {
    public final /* synthetic */ C18090vk A00;
    public final /* synthetic */ C18090vk A01;
    public final /* synthetic */ C22821Di A02;
    public final /* synthetic */ C22821Di A03;

    public void onBackProgressed(BackEvent backEvent) {
        C18070vi.A0d(backEvent, 0);
        this.A02.invoke(new C005002d(backEvent));
    }

    public void onBackStarted(BackEvent backEvent) {
        C18070vi.A0d(backEvent, 0);
        this.A03.invoke(new C005002d(backEvent));
    }

    public AnonymousClass0S0(C18090vk r1, C18090vk r2, C22821Di r3, C22821Di r4) {
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onBackCancelled() {
        this.A00.invoke();
    }

    public void onBackInvoked() {
        this.A01.invoke();
    }
}
