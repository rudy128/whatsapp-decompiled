package X;

import java.io.InputStream;
import java.util.concurrent.Executor;

public abstract class DDG implements E4W {
    public final C25052CVg A00;
    public final Executor A01;

    public DRJ A00(InputStream inputStream, int i) {
        DRN drn;
        C24230Bxi bxi;
        DRN drn2 = null;
        if (i <= 0) {
            try {
                C25052CVg cVg = this.A00;
                C18070vi.A0d(inputStream, 0);
                BSG bsg = cVg.A01;
                bxi = new C24230Bxi(bsg, bsg.A00[0]);
                cVg.A00.A00(inputStream, bxi);
                DRG A002 = bxi.A00();
                bxi.close();
                drn = DRN.A01(A002);
            } catch (Throwable th) {
                C26075Crp.A01(inputStream);
                if (drn2 != null) {
                    drn2.close();
                }
                throw th;
            }
        } else {
            drn = DRN.A01(this.A00.A00(inputStream, i));
        }
        DRJ drj = new DRJ(drn);
        C26075Crp.A01(inputStream);
        drn.close();
        return drj;
    }

    public void CCn(C25268CcD ccD, ECs eCs) {
        ECs eCs2 = eCs;
        DDI ddi = (DDI) eCs2;
        C28605E9w e9w = ddi.A05;
        C25256Cbv cbv = ddi.A07;
        eCs.CD4("local", "fetch");
        C22863BSr bSr = new C22863BSr(ccD, this, eCs2, eCs, e9w, e9w, cbv, A01());
        C25027CUe.A00(eCs, bSr, this, 2);
        this.A01.execute(bSr);
    }

    public String A01() {
        if (this instanceof C22858BSm) {
            return "QualifiedResourceFetchProducer";
        }
        if (this instanceof C22857BSl) {
            return "LocalResourceFetchProducer";
        }
        if (this instanceof C22856BSi) {
            return "LocalFileFetchProducer";
        }
        if (this instanceof C22859BSn) {
            return "LocalContentUriThumbnailFetchProducer";
        }
        if (this instanceof BSk) {
            return "LocalContentUriFetchProducer";
        }
        if (this instanceof BSj) {
            return "LocalAssetFetchProducer";
        }
        return "DataFetchProducer";
    }

    public DDG(C25052CVg cVg, Executor executor) {
        this.A01 = executor;
        this.A00 = cVg;
    }
}
