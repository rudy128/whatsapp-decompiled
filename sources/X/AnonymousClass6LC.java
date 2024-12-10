package X;

import android.os.Handler;
import android.view.View;
import java.util.List;

/* renamed from: X.6LC  reason: invalid class name */
public final class AnonymousClass6LC extends C38471rL {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C1603788f A01;
    public final /* synthetic */ C139126yG A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ List A05;

    public AnonymousClass6LC(Handler handler, C1603788f r2, C139126yG r3, Integer num, Runnable runnable, List list) {
        this.A02 = r3;
        this.A00 = handler;
        this.A05 = list;
        this.A03 = num;
        this.A04 = runnable;
        this.A01 = r2;
    }

    public void A04(View view) {
        C139126yG r4 = this.A02;
        Handler handler = this.A00;
        List list = this.A05;
        List A002 = AnonymousClass6YC.A00(this.A03);
        handler.removeCallbacks(this.A04);
        AnonymousClass7RO.A02(r4.A01, list, A002, r4, 48);
        this.A01.C9U();
    }
}
