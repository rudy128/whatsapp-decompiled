package X;

/* renamed from: X.Cnx  reason: case insensitive filesystem */
public abstract class C25886Cnx {
    public static final void A00(DOZ doz, DFL dfl, BV1 bv1, COI coi) {
        if (dfl.A09(68) != null) {
            int i = coi.A00;
            DFL A09 = dfl.A09(68);
            if (A09 != null) {
                i = C25340Cdz.A01(doz, A09, i);
            }
            bv1.setOutlineAmbientShadowColor(i);
        }
        if (dfl.A09(69) != null) {
            int i2 = coi.A01;
            DFL A092 = dfl.A09(69);
            if (A092 != null) {
                i2 = C25340Cdz.A01(doz, A092, i2);
            }
            bv1.setOutlineSpotShadowColor(i2);
        }
    }

    public static final void A02(BV1 bv1, COI coi) {
        bv1.setOutlineAmbientShadowColor(coi.A00);
        bv1.setOutlineSpotShadowColor(coi.A01);
    }

    public static final void A01(BV1 bv1, COI coi) {
        coi.A00 = bv1.getOutlineAmbientShadowColor();
        coi.A01 = bv1.getOutlineSpotShadowColor();
    }
}
