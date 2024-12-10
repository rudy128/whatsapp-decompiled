package X;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* renamed from: X.01K  reason: invalid class name */
public final class AnonymousClass01K implements Runnable, AnonymousClass01J, ViewTreeObserver.OnDrawListener {
    public Runnable A00;
    public boolean A01;
    public final long A02 = (SystemClock.uptimeMillis() + 10000);
    public final /* synthetic */ AnonymousClass01C A03;

    public void execute(Runnable runnable) {
        C18070vi.A0d(runnable, 0);
        this.A00 = runnable;
        View decorView = this.A03.getWindow().getDecorView();
        C18070vi.A0X(decorView);
        if (!this.A01) {
            decorView.postOnAnimation(new C06410Yf(this));
        } else if (C18070vi.A18(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public AnonymousClass01K(AnonymousClass01C r5) {
        this.A03 = r5;
    }

    public static final void A00(AnonymousClass01K r1) {
        Runnable runnable = r1.A00;
        if (runnable != null) {
            C18070vi.A0b(runnable);
            runnable.run();
            r1.A00 = null;
        }
    }

    public void BAk() {
        AnonymousClass01C r1 = this.A03;
        r1.getWindow().getDecorView().removeCallbacks(this);
        r1.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    public void CRq(View view) {
        if (!this.A01) {
            this.A01 = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public void onDraw() {
        Window window;
        boolean z;
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
            this.A00 = null;
            AnonymousClass01C r2 = this.A03;
            C04370My A2F = r2.A2F();
            synchronized (A2F.A01) {
                z = A2F.A00;
            }
            if (z) {
                this.A01 = false;
                window = r2.getWindow();
            } else {
                return;
            }
        } else if (SystemClock.uptimeMillis() > this.A02) {
            this.A01 = false;
            window = this.A03.getWindow();
        } else {
            return;
        }
        window.getDecorView().post(this);
    }

    public void run() {
        this.A03.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
