package X;

import android.widget.TextView;

public final class DsV extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DsV(BTQ btq) {
        super(2);
        this.$model = btq;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextView A0H = BE7.A0H(obj2);
        BTN btn = this.$model.A06;
        if (btn != null) {
            A0H.setShadowLayer(btn.A02, btn.A00, btn.A01, btn.A03);
        }
        return new AnonymousClass0I3(C27879DnG.A00);
    }
}
