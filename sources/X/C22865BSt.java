package X;

import java.util.Map;

/* renamed from: X.BSt  reason: case insensitive filesystem */
public class C22865BSt extends C22814BQp {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22865BSt(C25268CcD ccD, ECs eCs, C28605E9w e9w, DD7 dd7) {
        super(ccD, eCs, e9w, "BackgroundThreadHandoffProducer");
        this.A01 = ccD;
        this.A03 = e9w;
        this.A02 = eCs;
        this.A04 = dd7;
    }

    public void A02(Exception exc) {
        if (this.A00 != 0) {
            super.A02(exc);
            return;
        }
        super.A02(exc);
        ECs eCs = (ECs) this.A04;
        ((C28605E9w) this.A03).C9Q(eCs, "VideoThumbnailProducer", false);
        eCs.CD4("local", "video");
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        if (this.A00 != 0) {
            ECs eCs = (ECs) this.A02;
            ((C28605E9w) this.A03).C1q(eCs, "BackgroundThreadHandoffProducer", (Map) null);
            ((DD7) this.A04).A00.CCn((C25268CcD) this.A01, eCs);
            return;
        }
        super.A04(obj);
        ECs eCs2 = (ECs) this.A04;
        ((C28605E9w) this.A03).C9Q(eCs2, "VideoThumbnailProducer", AnonymousClass000.A1W(obj));
        eCs2.CD4("local", "video");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22865BSt(C25268CcD ccD, DD6 dd6, ECs eCs, ECs eCs2, C28605E9w e9w, C28605E9w e9w2, C25256Cbv cbv) {
        super(ccD, eCs, e9w, "VideoThumbnailProducer");
        this.A01 = dd6;
        this.A03 = e9w2;
        this.A04 = eCs2;
        this.A02 = cbv;
    }
}
