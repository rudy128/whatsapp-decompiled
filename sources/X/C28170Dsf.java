package X;

import android.widget.TextView;

/* renamed from: X.Dsf  reason: case insensitive filesystem */
public final class C28170Dsf extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28170Dsf(CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        TextView A0H = BE7.A0H(obj2);
        C24293Byq byq = this.$model.A04;
        if (byq != null) {
            int ordinal = byq.ordinal();
            i = 6;
            if (ordinal != 0) {
                i = 2;
                if (ordinal != 1) {
                    i = 5;
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            i = 3;
                        } else if (ordinal == 4) {
                            i = 4;
                        } else {
                            throw AnonymousClass3MW.A14();
                        }
                    }
                }
            }
        } else {
            CUS cus = this.$controller.A03;
            if (cus != null) {
                i = cus.A06;
            } else {
                throw C17880vN.A0g();
            }
        }
        A0H.setImeOptions(i);
        return new AnonymousClass0I3(C27870Dn7.A00);
    }
}
