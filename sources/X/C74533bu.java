package X;

import android.view.animation.Animation;

/* renamed from: X.3bu  reason: invalid class name and case insensitive filesystem */
public final class C74533bu extends C90704eV {
    public final /* synthetic */ C86234Qv A00;
    public final /* synthetic */ boolean A01;

    public C74533bu(C86234Qv r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void onAnimationEnd(Animation animation) {
        C86234Qv r2 = this.A00;
        r2.A03.setVisibility(C72453Mb.A07(this.A01 ? 1 : 0));
        r2.A00 = null;
    }
}
