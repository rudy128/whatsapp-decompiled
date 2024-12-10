package X;

import android.widget.TextView;

/* renamed from: X.Dsn  reason: case insensitive filesystem */
public final class C28177Dsn extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28177Dsn(CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        TextView A0H = BE7.A0H(obj2);
        Integer num = this.$model.A0D;
        if (num != null) {
            i = num.intValue();
        } else {
            CUS cus = this.$controller.A03;
            if (cus != null) {
                i = cus.A04;
            } else {
                throw C17880vN.A0g();
            }
        }
        A0H.setGravity(i);
        return new AnonymousClass0I3(C27877DnE.A00);
    }
}
