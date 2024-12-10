package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.70K  reason: invalid class name */
public abstract class AnonymousClass70K {
    public View A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Rect A06 = AnonymousClass3MW.A07();

    public void A0D() {
        this.A01 = false;
        StringBuilder A10 = AnonymousClass000.A10();
        C108985cd.A1H(this, "StatusPlaybackPage/onDestroy page=", A10);
        C17900vP.A0b(((AnonymousClass6Gp) this).A0N.A01, A10);
    }

    public void A0E() {
        this.A03 = false;
        StringBuilder A10 = AnonymousClass000.A10();
        C108985cd.A1H(this, "StatusPlaybackPage/onPause page=", A10);
        C17900vP.A0b(((AnonymousClass6Gp) this).A0N.A01, A10);
    }

    public void A0F() {
        this.A03 = true;
        StringBuilder A10 = AnonymousClass000.A10();
        C108985cd.A1H(this, "StatusPlaybackPage/onResume page=", A10);
        C17900vP.A0b(((AnonymousClass6Gp) this).A0N.A01, A10);
    }

    public void A0G() {
        this.A04 = true;
        StringBuilder A10 = AnonymousClass000.A10();
        C108985cd.A1H(this, "StatusPlaybackPage/onViewActive page=", A10);
        C17900vP.A0b(((AnonymousClass6Gp) this).A0N.A01, A10);
    }

    public void A0H() {
        this.A04 = false;
        StringBuilder A10 = AnonymousClass000.A10();
        C108985cd.A1H(this, "StatusPlaybackPage/onViewInactive page=", A10);
        C17900vP.A0b(((AnonymousClass6Gp) this).A0N.A01, A10);
    }

    public static Context A0B(AnonymousClass70O r0) {
        return r0.A05.A00.A0J();
    }

    public void A0I(Rect rect) {
        this.A06.set(rect);
    }

    public void A0C() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108985cd.A1H(this, "StatusPlaybackPage/onConfigurationChanged page=", A10);
        C17900vP.A0b(((AnonymousClass6Gp) this).A0N.A01, A10);
    }
}
