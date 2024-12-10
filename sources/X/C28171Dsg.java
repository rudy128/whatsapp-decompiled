package X;

import android.widget.TextView;

/* renamed from: X.Dsg  reason: case insensitive filesystem */
public final class C28171Dsg extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28171Dsg(CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextView A0H = BE7.A0H(obj2);
        CUS cus = this.$controller.A03;
        if (cus != null) {
            A0H.setMaxLines(cus.A08);
            return new AnonymousClass0I3(C27873DnA.A00);
        }
        throw C17880vN.A0g();
    }
}
