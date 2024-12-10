package X;

import android.widget.TextView;

/* renamed from: X.DsQ  reason: case insensitive filesystem */
public final class C28161DsQ extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28161DsQ(BTQ btq) {
        super(2);
        this.$model = btq;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        D5X d5x;
        TextView A0H = BE7.A0H(obj2);
        BTQ btq = this.$model;
        if (btq.A02 != null) {
            d5x = new D5X(btq, 1);
        } else {
            d5x = null;
        }
        A0H.setOnEditorActionListener(d5x);
        return new AnonymousClass0I3(C27871Dn8.A00);
    }
}
