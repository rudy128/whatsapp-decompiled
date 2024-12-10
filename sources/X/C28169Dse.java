package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Dse  reason: case insensitive filesystem */
public final class C28169Dse extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28169Dse(CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Drawable drawable;
        View view = (View) obj2;
        C18070vi.A0d(view, 1);
        Integer num = this.$model.A0B;
        if (num != null) {
            drawable = new ColorDrawable(num.intValue());
        } else {
            CUS cus = this.$controller.A03;
            if (cus != null) {
                drawable = cus.A0D;
            } else {
                throw C17880vN.A0g();
            }
        }
        view.setBackgroundDrawable(drawable);
        return new AnonymousClass0I3(C27869Dn6.A00);
    }
}
