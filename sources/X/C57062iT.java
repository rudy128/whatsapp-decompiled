package X;

import android.graphics.Typeface;
import android.os.Handler;

/* renamed from: X.2iT  reason: invalid class name and case insensitive filesystem */
public class C57062iT {
    public final Handler A00;
    public final C51032Ws A01;

    public void A00(C61312pT r6) {
        Handler handler;
        Runnable akb;
        int i = r6.A00;
        if (i == 0) {
            Typeface typeface = r6.A01;
            C51032Ws r1 = this.A01;
            handler = this.A00;
            akb = new C27081DTg(typeface, this, r1, 0);
        } else {
            C51032Ws r12 = this.A01;
            handler = this.A00;
            akb = new C21470Akb((Object) this, i, 1, (Object) r12);
        }
        handler.post(akb);
    }

    public C57062iT(Handler handler, C51032Ws r2) {
        this.A01 = r2;
        this.A00 = handler;
    }
}
