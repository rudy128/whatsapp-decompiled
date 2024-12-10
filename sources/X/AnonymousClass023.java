package X;

import android.view.Window;

/* renamed from: X.023  reason: invalid class name */
public final class AnonymousClass023 implements C004301w {
    public final /* synthetic */ AnonymousClass01V A00;

    public AnonymousClass023(AnonymousClass01V r1) {
        this.A00 = r1;
    }

    public void Bp9(C003301m r2, boolean z) {
        this.A00.A0x(r2);
    }

    public boolean Bzb(C003301m r3) {
        Window.Callback callback = this.A00.A06.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(AnonymousClass74N.A03, r3);
        return true;
    }
}
