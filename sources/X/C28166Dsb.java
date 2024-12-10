package X;

import android.widget.TextView;

/* renamed from: X.Dsb  reason: case insensitive filesystem */
public final class C28166Dsb extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28166Dsb(CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextView A0H = BE7.A0H(obj2);
        CUS cus = this.$controller.A03;
        if (cus != null) {
            C25319CdP.A00(A0H, cus.A00);
            return new AnonymousClass0I3(C27866Dn3.A00);
        }
        throw C17880vN.A0g();
    }
}
