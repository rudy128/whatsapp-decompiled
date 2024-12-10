package X;

public class DDA implements E4W {
    public final E4K A00;
    public final C24661CEb A01;
    public final E4W A02;

    public void CCn(C25268CcD ccD, ECs eCs) {
        DDI ddi = (DDI) eCs;
        if (ddi.A06.mValue >= C24330BzR.DISK_CACHE.mValue) {
            eCs.CD4("disk", "nil-result_write");
            ccD.A07((Object) null, 1);
            return;
        }
        if ((32 & ddi.A07.A00) == 0) {
            ccD = new BSV(this.A00, this.A01, ccD, eCs);
        }
        this.A02.CCn(ccD, eCs);
    }

    public DDA(E4K e4k, C24661CEb cEb, E4W e4w) {
        this.A00 = e4k;
        this.A01 = cEb;
        this.A02 = e4w;
    }
}
