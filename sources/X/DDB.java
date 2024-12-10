package X;

import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.Map;

public class DDB implements E4W {
    public final C24661CEb A00;
    public final E7Y A01;
    public final E4W A02;

    public void CCn(C25268CcD ccD, ECs eCs) {
        DRN drn;
        Map map;
        DRJ drj;
        try {
            if (C26212Cuq.A04()) {
                C26212Cuq.A03("EncodedMemoryCacheProducer#produceResults");
            }
            DDI ddi = (DDI) eCs;
            C28605E9w e9w = ddi.A05;
            e9w.C1r(eCs, "EncodedMemoryCacheProducer");
            C25256Cbv cbv = ddi.A07;
            DAK dak = new DAK(cbv.A03.toString());
            int i = cbv.A00;
            Map map2 = null;
            if (AnonymousClass000.A1P(4 & i)) {
                drn = this.A01.BMF(dak);
            } else {
                drn = null;
            }
            if (drn != null) {
                try {
                    drj = new DRJ(drn);
                    if (e9w.CFc(eCs, "EncodedMemoryCacheProducer")) {
                        map2 = C27311Dbi.A00("cached_value_found", "true");
                    }
                    e9w.C1q(eCs, "EncodedMemoryCacheProducer", map2);
                    e9w.C9Q(eCs, "EncodedMemoryCacheProducer", true);
                    ddi.CD4("memory_encoded", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID);
                    ccD.A05(1.0f);
                    ccD.A07(drj, 1);
                    drj.close();
                    drn.close();
                } catch (Throwable th) {
                    if (drn != null) {
                        drn.close();
                    }
                    throw th;
                }
            } else if (ddi.A06.mValue >= C24330BzR.ENCODED_MEMORY_CACHE.mValue) {
                if (e9w.CFc(eCs, "EncodedMemoryCacheProducer")) {
                    map = C27311Dbi.A00("cached_value_found", "false");
                } else {
                    map = null;
                }
                e9w.C1q(eCs, "EncodedMemoryCacheProducer", map);
                e9w.C9Q(eCs, "EncodedMemoryCacheProducer", false);
                eCs.CD4("memory_encoded", "nil-result");
                ccD.A07((Object) null, 1);
            } else {
                BSW bsw = new BSW(dak, this.A01, ccD, AnonymousClass000.A1P(8 & i));
                if (e9w.CFc(eCs, "EncodedMemoryCacheProducer")) {
                    map2 = C27311Dbi.A00("cached_value_found", "false");
                }
                e9w.C1q(eCs, "EncodedMemoryCacheProducer", map2);
                this.A02.CCn(bsw, eCs);
            }
        } finally {
            C26212Cuq.A00();
        }
    }

    public DDB(C24661CEb cEb, E7Y e7y, E4W e4w) {
        this.A01 = e7y;
        this.A00 = cEb;
        this.A02 = e4w;
    }
}
