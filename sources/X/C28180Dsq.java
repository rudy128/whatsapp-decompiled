package X;

import android.content.res.ColorStateList;
import android.widget.TextView;

/* renamed from: X.Dsq  reason: case insensitive filesystem */
public final class C28180Dsq extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28180Dsq(CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextView A0H = BE7.A0H(obj2);
        Integer num = this.$model.A0F;
        if (num != null) {
            A0H.setTextColor(num.intValue());
        } else {
            CUS cus = this.$controller.A03;
            if (cus != null) {
                ColorStateList colorStateList = cus.A0A;
                if (colorStateList != null) {
                    A0H.setTextColor(colorStateList);
                }
            } else {
                throw C17880vN.A0g();
            }
        }
        return new AnonymousClass0I3(C27881DnI.A00);
    }
}
