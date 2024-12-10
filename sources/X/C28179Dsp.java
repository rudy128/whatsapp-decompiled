package X;

import android.widget.TextView;

/* renamed from: X.Dsp  reason: case insensitive filesystem */
public final class C28179Dsp extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28179Dsp(CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextView A0H = BE7.A0H(obj2);
        BTH bth = this.$model.A07;
        if (bth != null) {
            A0H.setTextSize(2, bth.A00);
        } else {
            CUS cus = this.$controller.A03;
            if (cus != null) {
                A0H.setTextSize(0, cus.A03);
            } else {
                throw C17880vN.A0g();
            }
        }
        return new AnonymousClass0I3(C27880DnH.A00);
    }
}
