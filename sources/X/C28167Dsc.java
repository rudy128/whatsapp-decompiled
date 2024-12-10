package X;

import android.graphics.Paint;
import android.widget.TextView;

/* renamed from: X.Dsc  reason: case insensitive filesystem */
public final class C28167Dsc extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28167Dsc(CTH cth, BTQ btq) {
        super(2);
        this.$controller = cth;
        this.$model = btq;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextView A0H = BE7.A0H(obj2);
        CUS cus = this.$controller.A03;
        if (cus != null) {
            Float f = this.$model.A0A;
            float f2 = cus.A01;
            float f3 = cus.A02;
            if (f != null) {
                float floatValue = f.floatValue();
                float fontMetrics = A0H.getPaint().getFontMetrics((Paint.FontMetrics) null);
                if (floatValue == fontMetrics) {
                    f2 = 0.0f;
                } else {
                    f2 = floatValue - fontMetrics;
                }
            }
            A0H.setLineSpacing(f2, f3);
            return new AnonymousClass0I3(C27867Dn4.A00);
        }
        throw C17880vN.A0g();
    }
}
