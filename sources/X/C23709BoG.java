package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.BoG  reason: case insensitive filesystem */
public final class C23709BoG extends BV6 {
    public C25687CkI A00;
    public final EDL A01;
    public final COL A02;
    public final C24816CLj A03 = new C24816CLj(this);
    public final CTN A04;
    public final boolean A05;

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        C18070vi.A0d(context, 0);
        return new FrameLayout(context);
    }

    public C23709BoG(EDL edl, DOZ doz, DFL dfl, COL col, CTN ctn) {
        super(doz, dfl);
        this.A02 = col;
        this.A01 = edl;
        this.A04 = ctn;
        this.A05 = dfl.A0I(42, false);
        ctn.A00 = new C27642Dim(this);
        ctn.A01 = new C27643Din(this);
        ctn.A03 = new C27644Dio(this);
        ctn.A02 = new C27645Dip(this);
    }
}
