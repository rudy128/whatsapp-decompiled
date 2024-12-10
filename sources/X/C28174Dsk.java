package X;

import android.widget.TextView;

/* renamed from: X.Dsk  reason: case insensitive filesystem */
public final class C28174Dsk extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28174Dsk(CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextView A0H = BE7.A0H(obj2);
        CharSequence charSequence = this.$model.A08;
        if (charSequence == null) {
            CUS cus = this.$controller.A03;
            if (cus != null) {
                charSequence = cus.A0J;
            } else {
                throw C17880vN.A0g();
            }
        }
        A0H.setHint(charSequence);
        return new AnonymousClass0I3(C27872Dn9.A00);
    }
}
