package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.06D  reason: invalid class name */
public class AnonymousClass06D extends C04630Od {
    public final /* synthetic */ AnonymousClass03I A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass06D(Context context, View view, C003301m r5, AnonymousClass03I r6) {
        super(context, view, r5, true);
        this.A00 = r6;
        this.A00 = 8388613;
        AnonymousClass0SB r1 = r6.A0M;
        this.A04 = r1;
        AnonymousClass0SE r0 = this.A03;
        if (r0 != null) {
            r0.CIA(r1);
        }
    }

    public void A03() {
        AnonymousClass03I r1 = this.A00;
        if (r1.A05 != null) {
            r1.A05.close();
        }
        r1.A0C = null;
        super.A03();
    }
}
