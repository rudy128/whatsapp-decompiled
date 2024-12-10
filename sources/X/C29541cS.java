package X;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.1cS  reason: invalid class name and case insensitive filesystem */
public final class C29541cS implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Runnable A02;

    public C29541cS(Handler handler, View view, Runnable runnable) {
        this.A00 = handler;
        this.A02 = runnable;
        this.A01 = view;
    }

    public boolean onPreDraw() {
        Handler handler = this.A00;
        Message obtain = Message.obtain(handler, this.A02);
        C18070vi.A0b(obtain);
        AnonymousClass25R.A00(obtain);
        handler.sendMessageAtFrontOfQueue(obtain);
        this.A01.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
