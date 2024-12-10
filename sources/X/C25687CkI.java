package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.FrameLayout;
import com.facebook.avatar.autogen.view.AESelfieViewProvider$decreaseBrightness$1;

/* renamed from: X.CkI  reason: case insensitive filesystem */
public final class C25687CkI {
    public FrameLayout A00;
    public DAS A01;
    public EDL A02;
    public E48 A03;
    public boolean A04;
    public final Context A05;
    public final C26555D3v A06;
    public final COL A07;
    public final C24816CLj A08;

    public static final Activity A00(Context context, C25687CkI ckI) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C18070vi.A0X(baseContext);
        return A00(baseContext, ckI);
    }

    public final void A01() {
        EDL edl = this.A02;
        if (edl != null) {
            edl.pause();
        }
        Activity A002 = A00(this.A05, this);
        AnonymousClass3MX.A1Q(new AESelfieViewProvider$decreaseBrightness$1(A002, (C30391dr) null), BE6.A18());
    }

    public C25687CkI(Context context, C26555D3v d3v, COL col, C24816CLj cLj) {
        C108985cd.A1D(col, cLj);
        this.A05 = context;
        this.A06 = d3v;
        this.A07 = col;
        this.A08 = cLj;
    }
}
