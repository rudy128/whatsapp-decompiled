package X;

import android.widget.TextView;

/* renamed from: X.DsT  reason: case insensitive filesystem */
public final class C28163DsT extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28163DsT(CTH cth) {
        super(2);
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextView A0H = BE7.A0H(obj2);
        CTH cth = this.$controller;
        CharSequence charSequence = cth.A04;
        if (charSequence != null) {
            A0H.setText(charSequence);
            cth.A04 = null;
        }
        return new AnonymousClass0I3(C27874DnB.A00);
    }
}
