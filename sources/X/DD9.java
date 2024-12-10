package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class DD9 implements E4W {
    public final E4W A00;
    public final E4K A01;
    public final C24661CEb A02;

    public void CCn(C25268CcD ccD, ECs eCs) {
        DDI ddi = (DDI) eCs;
        C25256Cbv cbv = ddi.A07;
        if ((16 & cbv.A00) == 0) {
            C28605E9w e9w = ddi.A05;
            e9w.C1r(eCs, "DiskCacheProducer");
            DAK dak = new DAK(cbv.A03.toString());
            C24989CSp cSp = (C24989CSp) this.A01.get();
            cSp.A04.getValue();
            C25680CkB ckB = (C25680CkB) cSp.A02.getValue();
            C18070vi.A0X(cSp.A00.getValue());
            if (cbv.A07 != C24256ByE.DEFAULT || ckB == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Got no disk cache for CacheChoice: ");
                AnonymousClass8BS.A1D(C17880vN.A0h(), A10);
                e9w.C1p(eCs, "DiskCacheProducer", new C1P(A10.toString()), (Map) null);
            } else {
                AtomicBoolean A0w = C108965cb.A0w();
                ckB.A01(dak, A0w).continueWith(new D7Y(ccD, this, eCs, e9w));
                C25027CUe.A00(eCs, A0w, this, 0);
                return;
            }
        }
        if (ddi.A06.mValue >= C24330BzR.DISK_CACHE.mValue) {
            eCs.CD4("disk", "nil-result_read");
            ccD.A07((Object) null, 1);
            return;
        }
        this.A00.CCn(ccD, eCs);
    }

    public DD9(E4K e4k, C24661CEb cEb, E4W e4w) {
        this.A01 = e4k;
        this.A02 = cEb;
        this.A00 = e4w;
    }
}
