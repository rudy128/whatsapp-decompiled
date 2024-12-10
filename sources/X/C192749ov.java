package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.9ov  reason: invalid class name and case insensitive filesystem */
public abstract class C192749ov {
    public final AnonymousClass1KB A00;
    public final AnonymousClass181 A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass1D9 A03;
    public final AnonymousClass10I A04;
    public final C18100vl A05 = C21528Alb.A00(this, 37);

    public final synchronized AnonymousClass4VT A00() {
        return (AnonymousClass4VT) this.A05.getValue();
    }

    public final void A01(ImageView imageView, String str) {
        C18070vi.A0d(str, 0);
        Context context = this.A02.A00;
        Drawable A002 = C40501uo.A00((Resources.Theme) null, context.getResources(), 2131231037);
        Drawable A003 = C40501uo.A00((Resources.Theme) null, context.getResources(), 2131231037);
        AnonymousClass4VT A004 = A00();
        if (A004 != null) {
            A004.A01(A002, A003, imageView, str);
        }
    }

    public C192749ov(AnonymousClass1KB r2, AnonymousClass181 r3, AnonymousClass118 r4, AnonymousClass1D9 r5, AnonymousClass10I r6) {
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
    }
}
