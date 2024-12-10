package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: X.Dsd  reason: case insensitive filesystem */
public final class C28168Dsd extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28168Dsd(CTH cth, BTQ btq) {
        super(2);
        this.$controller = cth;
        this.$model = btq;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Drawable.ConstantState constantState;
        TextView A0H = BE7.A0H(obj2);
        if (C26188CuE.A01()) {
            CUS cus = this.$controller.A03;
            if (cus != null) {
                Drawable drawable = cus.A0E;
                if (!(this.$model.A0C == null || drawable == null || (constantState = drawable.getConstantState()) == null)) {
                    BTQ btq = this.$model;
                    drawable = constantState.newDrawable();
                    C18070vi.A0X(drawable);
                    BE8.A0x(PorterDuff.Mode.SRC_OVER, drawable, btq.A0C.intValue());
                }
                C24561C9h.A00(drawable, A0H);
            } else {
                throw C17880vN.A0g();
            }
        }
        return new AnonymousClass0I3(C27868Dn5.A00);
    }
}
