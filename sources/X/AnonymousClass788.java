package X;

import android.os.SystemClock;
import android.view.View;

/* renamed from: X.788  reason: invalid class name */
public final class AnonymousClass788 implements View.OnClickListener {
    public long A00;
    public final View.OnClickListener A01;
    public final AnonymousClass11P A02;

    public AnonymousClass788(View.OnClickListener onClickListener, AnonymousClass11P r3) {
        C18070vi.A0d(r3, 1);
        this.A02 = r3;
        this.A01 = onClickListener;
    }

    public void onClick(View view) {
        C18070vi.A0d(view, 0);
        if (SystemClock.elapsedRealtime() - this.A00 >= 1000) {
            this.A00 = SystemClock.elapsedRealtime();
            this.A01.onClick(view);
        }
    }
}
