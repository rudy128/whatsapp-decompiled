package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.06C  reason: invalid class name */
public class AnonymousClass06C extends C04630Od {
    public final /* synthetic */ AnonymousClass03I A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass06C(Context context, View view, AnonymousClass068 r5, AnonymousClass03I r6) {
        super(context, view, r5, false);
        this.A00 = r6;
        if (!((AnonymousClass03G) r5.getItem()).A0D()) {
            View view2 = r6.A0B;
            this.A01 = view2 == null ? (View) r6.A07 : view2;
        }
        AnonymousClass0SB r1 = r6.A0M;
        this.A04 = r1;
        AnonymousClass0SE r0 = this.A03;
        if (r0 != null) {
            r0.CIA(r1);
        }
    }

    public void A03() {
        AnonymousClass03I r1 = this.A00;
        r1.A08 = null;
        r1.A00 = 0;
        super.A03();
    }
}
