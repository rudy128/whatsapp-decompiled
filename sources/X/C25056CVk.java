package X;

/* renamed from: X.CVk  reason: case insensitive filesystem */
public class C25056CVk {
    public int A00;
    public final C27057DRc A01;

    public void A00(C24294Byr byr) {
        int i;
        if (byr != null) {
            C27057DRc dRc = this.A01;
            if (dRc.useNetworkQuality) {
                int ordinal = byr.ordinal();
                if (ordinal == 4) {
                    i = dRc.excellentValue;
                } else if (ordinal == 3) {
                    i = dRc.goodValue;
                } else if (ordinal == 2) {
                    i = dRc.moderateValue;
                } else if (ordinal == 1) {
                    i = dRc.poorValue;
                } else if (ordinal != 0) {
                    i = dRc.defaultValue;
                } else {
                    i = dRc.degradedValue;
                }
                this.A00 = i;
            }
        }
    }

    public C25056CVk(C27057DRc dRc) {
        this.A01 = dRc;
        this.A00 = dRc.defaultValue;
    }
}
