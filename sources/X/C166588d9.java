package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.8d9  reason: invalid class name and case insensitive filesystem */
public final class C166588d9 extends C39381sz {
    public final Runnable A00;

    public C166588d9(Runnable runnable, int i) {
        super((Context) null, i, -65536, 1711315404);
        this.A00 = runnable;
    }

    public void onClick(View view) {
        this.A00.run();
    }
}
