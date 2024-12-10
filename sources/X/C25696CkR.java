package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.CkR  reason: case insensitive filesystem */
public final class C25696CkR {
    public static final CancellationException A0D = new CancellationException("Modified URL is null");
    public static final CancellationException A0E = new CancellationException("ImageRequest is null");
    public static final CancellationException A0F = new CancellationException("Prefetching is not enabled");
    public final CUW A00;
    public final C26220Cv8 A01;
    public final C25279Ccb A02;
    public final C28659ECw A03;
    public final AtomicLong A04 = new AtomicLong();
    public final E4K A05;
    public final E4K A06;
    public final E4K A07;
    public final E4K A08;
    public final C24661CEb A09;
    public final E7Y A0A;
    public final E7Y A0B;
    public final CNH A0C;

    /* JADX WARNING: type inference failed for: r3v2, types: [X.BSc, X.DDI] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.BSc, X.DDI] */
    public final C26048CrF A00(C25256Cbv cbv, Object obj) {
        E4W A042;
        C26048CrF crF;
        try {
            C26220Cv8 cv8 = this.A01;
            C25256Cbv cbv2 = cbv;
            if (!C26212Cuq.A04()) {
                A042 = C26220Cv8.A04(cv8, cbv);
            } else {
                C26212Cuq.A03("ProducerSequenceFactory#getDecodedImageProducerSequence");
                try {
                    A042 = C26220Cv8.A04(cv8, cbv);
                    C26212Cuq.A01();
                } catch (Exception e) {
                    crF = new C26048CrF();
                    crF.A09(e, (Map) null);
                } catch (Throwable th) {
                    C26212Cuq.A01();
                    throw th;
                }
            }
            C24330BzR bzR = C24330BzR.FULL_FETCH;
            Object obj2 = obj;
            if (!C26212Cuq.A04()) {
                DDJ ddj = new DDJ(this.A02, this.A03);
                try {
                    C24330BzR bzR2 = cbv.A08;
                    if (bzR2.mValue <= bzR.mValue) {
                        bzR2 = bzR;
                    }
                    ? ddi = new DDI(cbv.A05, this.A00, ddj, bzR2, cbv2, obj2, String.valueOf(this.A04.getAndIncrement()), false, AnonymousClass000.A1P(C20012A3c.A01(cbv.A03) ? 1 : 0));
                    if (C26212Cuq.A04()) {
                        C26212Cuq.A03("CloseableProducerToDataSourceAdapter#create");
                    }
                    BRM brm = new BRM(ddj, A042, ddi);
                    C26212Cuq.A00();
                    return brm;
                } catch (Exception e2) {
                    C26048CrF crF2 = new C26048CrF();
                    crF2.A09(e2, (Map) null);
                    return crF2;
                }
            } else {
                C26212Cuq.A03("ImagePipeline#submitFetchRequest");
                DDJ ddj2 = new DDJ(this.A02, this.A03);
                C24330BzR bzR3 = cbv.A08;
                if (bzR3.mValue <= bzR.mValue) {
                    bzR3 = bzR;
                }
                ? ddi2 = new DDI(cbv.A05, this.A00, ddj2, bzR3, cbv2, obj2, String.valueOf(this.A04.getAndIncrement()), false, AnonymousClass000.A1P(C20012A3c.A01(cbv.A03) ? 1 : 0));
                if (C26212Cuq.A04()) {
                    C26212Cuq.A03("CloseableProducerToDataSourceAdapter#create");
                }
                crF = new BRM(ddj2, A042, ddi2);
                C26212Cuq.A00();
                C26212Cuq.A01();
                return crF;
            }
        } catch (Exception e3) {
            C26048CrF crF3 = new C26048CrF();
            crF3.A09(e3, (Map) null);
            return crF3;
        }
    }

    public C25696CkR(E4K e4k, E4K e4k2, E4K e4k3, E4K e4k4, C24661CEb cEb, E7Y e7y, E7Y e7y2, CUW cuw, C26220Cv8 cv8, CNH cnh, Set set, Set set2) {
        C18070vi.A0p(set, set2, e4k);
        C18070vi.A0d(e4k2, 7);
        C18070vi.A0d(cEb, 8);
        C18070vi.A0d(cnh, 9);
        C18070vi.A0d(e4k3, 10);
        C18070vi.A0d(e4k4, 11);
        this.A01 = cv8;
        this.A07 = e4k;
        this.A05 = e4k2;
        this.A02 = new C25279Ccb(set);
        this.A03 = new C26768DCx(set2);
        this.A0A = e7y;
        this.A0B = e7y2;
        this.A09 = cEb;
        this.A0C = cnh;
        this.A08 = e4k3;
        this.A06 = e4k4;
        this.A00 = cuw;
    }
}
