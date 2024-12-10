package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5lw  reason: invalid class name and case insensitive filesystem */
public final class C112725lw extends C39711tW {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public final /* synthetic */ AnonymousClass72m A03;

    public C112725lw(Context context, AnonymousClass72m r4) {
        this.A03 = r4;
        this.A01 = context.getResources().getDimensionPixelSize(2131168699);
    }

    public void A03(RecyclerView recyclerView, int i) {
        AnonymousClass71R r0;
        int i2 = this.A02;
        if (!(i2 != 0 || i == i2 || (r0 = this.A03.A0M) == null)) {
            r0.A0A.clearFocus();
        }
        this.A02 = i;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.A00 + i2;
        this.A00 = i3;
        this.A03.A08.setAlpha(Math.min(1.0f, ((float) i3) / ((float) this.A01)));
    }
}
