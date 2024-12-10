package X;

import android.graphics.Paint;

/* renamed from: X.Dtl  reason: case insensitive filesystem */
public final class C28225Dtl extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ int $layerType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28225Dtl(int i) {
        super(3);
        this.$layerType = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        BHP bhp = (BHP) obj2;
        BTS bts = (BTS) obj3;
        C18070vi.A0j(bhp, bts);
        int layerType = bhp.getLayerType();
        int i = this.$layerType;
        boolean A00 = bts.A00();
        int i2 = 1;
        if (!C17890vO.A1R(i)) {
            if (i == 2) {
                i2 = 2;
            } else if (i != -1 || !A00) {
                i2 = 0;
            }
        }
        if (bhp.getLayerType() != i2) {
            bhp.setLayerType(i2, (Paint) null);
        }
        return new AnonymousClass0I3(new C27800Dlc(bhp, layerType));
    }
}
