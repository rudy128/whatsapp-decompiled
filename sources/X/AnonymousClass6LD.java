package X;

import android.os.Handler;
import android.view.View;
import java.util.List;

/* renamed from: X.6LD  reason: invalid class name */
public final class AnonymousClass6LD extends C38471rL {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AnonymousClass730 A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public AnonymousClass6LD(Handler handler, AnonymousClass730 r2, Integer num, Runnable runnable, String str, String str2, List list) {
        this.A01 = r2;
        this.A00 = handler;
        this.A06 = list;
        this.A03 = runnable;
        this.A05 = str;
        this.A02 = num;
        this.A04 = str2;
    }

    public void A04(View view) {
        AnonymousClass730 r14 = this.A01;
        Handler handler = this.A00;
        List list = this.A06;
        handler.removeCallbacks(this.A03);
        r14.A03.CGF(new C21357Aim(r14, list, 2));
        AnonymousClass730.A01((C114375qh) null, (C38471rL) null, r14, this.A05, 2131889148, 0, false);
        ((C139026y5) C18070vi.A0E(r14.A05)).A01((Boolean) null, this.A02, (Integer) null, (Integer) null, this.A04, list, 2, false);
        C30131dR A13 = C108945cZ.A13(r14.A0B);
        C108995ce.A1G(C108945cZ.A11(r14.A06), A13, AnonymousClass730.A0C);
        A13.A03("TAP_UNDO");
    }
}
