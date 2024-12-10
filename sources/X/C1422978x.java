package X;

import android.os.Handler;
import android.view.ViewTreeObserver;

/* renamed from: X.78x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1422978x implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ AnonymousClass6KR A00;

    public final void onDraw() {
        AnonymousClass6KR r2 = this.A00;
        AnonymousClass3MX.A1O(r2);
        r2.A02 = System.currentTimeMillis();
        Handler handler = r2.A05;
        handler.removeCallbacksAndMessages((Object) null);
        handler.postDelayed(r2.A0G, 1);
    }

    public /* synthetic */ C1422978x(AnonymousClass6KR r1) {
        this.A00 = r1;
    }
}
