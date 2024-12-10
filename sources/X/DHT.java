package X;

public class DHT implements E7t {
    public CVl A00 = new Object();
    public final C26052CrM A01;
    public final C26259Cw4 A02;
    public final E7s A03;

    public EAS BHI() {
        return new DHP(this);
    }

    public EAb BHL() {
        return new DHS(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CVl] */
    public DHT(C26052CrM crM, C26259Cw4 cw4, E7s e7s) {
        this.A02 = cw4;
        this.A03 = e7s;
        this.A01 = crM;
        C24322BzJ bzJ = C24322BzJ.VIDEO;
        if (crM != null && crM.A06(bzJ) != null && crM.A06(bzJ).size() > 1 && !e7s.Bch()) {
            throw new IllegalArgumentException("FrameRender should have media graph support for MediaComposition", new Throwable());
        }
    }
}
