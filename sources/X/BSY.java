package X;

import java.util.HashMap;

public class BSY extends C22848BSa {
    public boolean A00 = false;
    public final C26024Cqi A01;
    public final ECs A02;
    public final E4X A03;
    public final boolean A04;
    public final /* synthetic */ DDD A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BSY(C25268CcD ccD, ECs eCs, DDD ddd, E4X e4x, boolean z) {
        super(ccD);
        this.A05 = ddd;
        this.A02 = eCs;
        this.A04 = z;
        this.A03 = e4x;
        this.A01 = new C26024Cqi(new C26770DCz(ddd, this, 1), ddd.A01);
        eCs.BB2(new C22853BSf(ccD, this, ddd, 1));
    }

    public static void A00(DRJ drj, BSY bsy, E97 e97, int i) {
        RuntimeException th;
        HashMap hashMap;
        DRJ drj2;
        long j;
        int i2 = i;
        ECs eCs = bsy.A02;
        DDI ddi = (DDI) eCs;
        C28605E9w e9w = ddi.A05;
        e9w.C1r(eCs, "ResizeAndRotateProducer");
        C25256Cbv cbv = ddi.A07;
        BSG bsg = bsy.A05.A00.A01;
        C24230Bxi bxi = new C24230Bxi(bsg, BE6.A0I(bsg.A00));
        HashMap hashMap2 = null;
        try {
            C25786Clx clx = cbv.A06;
            E97 e972 = e97;
            CV7 CPd = e972.CPd(drj.A06(), clx, drj, bxi);
            int i3 = CPd.A00;
            if (i3 != 2) {
                String BSk = e972.BSk();
                if (!e9w.CFc(eCs, "ResizeAndRotateProducer")) {
                    hashMap = null;
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    DRJ.A03(drj);
                    BE8.A1C(A10, drj.A05);
                    DRJ.A03(drj);
                    String A0t = C17880vN.A0t(A10, drj.A01);
                    HashMap A11 = C17880vN.A11();
                    DRJ.A03(drj);
                    A11.put("Image format", String.valueOf(drj.A07));
                    A11.put("Original size", A0t);
                    A11.put("Requested size", "Unspecified");
                    C26024Cqi cqi = bsy.A01;
                    synchronized (cqi) {
                        try {
                            j = cqi.A01 - cqi.A02;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    A11.put("queueTime", String.valueOf(j));
                    A11.put("Transcoder id", BSk);
                    A11.put("Transcoding result", String.valueOf(CPd));
                    hashMap = new HashMap(A11);
                }
                hashMap2 = hashMap;
                DRN A012 = DRN.A01(bxi.A00());
                try {
                    drj2 = new DRJ(A012);
                    drj2.A07 = CIN.A06;
                    DRJ.A02(drj2);
                    e9w.C1q(eCs, "ResizeAndRotateProducer", hashMap);
                    if (i3 != 1) {
                        i2 = i | 16;
                    }
                    bsy.A00.A07(drj2, i2);
                    drj2.close();
                    A012.close();
                    bxi.close();
                } catch (Throwable th3) {
                    th = th3;
                    A012.close();
                }
            } else {
                th = AnonymousClass8BR.A0w("Error while transcoding the image");
                throw th;
            }
        } catch (Exception e) {
            e9w.C1p(eCs, "ResizeAndRotateProducer", e, hashMap2);
            if ((i2 & 1) == 1) {
                bsy.A00.A08(e);
            }
        } catch (Throwable th4) {
            bxi.close();
            throw th4;
        }
    }
}
