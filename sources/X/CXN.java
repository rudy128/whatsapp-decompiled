package X;

import android.content.Context;

public class CXN {
    public final C51552Ys A00;
    public final C45682Ba A01;
    public final C26285Cwg A02;
    public final BNJ A03;
    public final C23728BoZ A04;
    public final C25708Cke A05;
    public final C24936CQj A06;
    public final C191469me A07;

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.CC9] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.CBu] */
    public void A00(Context context, C22415B6x b6x, CXY cxy) {
        DWR dwr = new DWR(cxy, 1);
        C26285Cwg cwg = this.A02;
        BNJ bnj = this.A03;
        C23728BoZ boZ = this.A04;
        C45682Ba r7 = this.A01;
        C25708Cke cke = this.A05;
        C25415CfN cfN = C25415CfN.A00;
        ? obj = new Object();
        Context context2 = context;
        C25995CqB cqB = new C25995CqB(context2, bnj, r7, cfN, new Object(), new DNO(this, dwr), boZ, obj, b6x, cwg, cke, this.A07);
        synchronized (C25995CqB.class) {
            C25995CqB.A0C = cqB;
            synchronized (AnonymousClass0PG.class) {
            }
        }
        synchronized (C24615CCb.class) {
        }
        DFF dff = new DFF(this.A06, false);
        AnonymousClass0MD.A00 = dff;
        C25913CoX.A00 = dff;
    }

    public CXN(C51552Ys r1, C45682Ba r2, C26285Cwg cwg, BNJ bnj, C23728BoZ boZ, C25708Cke cke, C24936CQj cQj, C191469me r8) {
        this.A07 = r8;
        this.A06 = cQj;
        this.A03 = bnj;
        this.A01 = r2;
        this.A02 = cwg;
        this.A04 = boZ;
        this.A00 = r1;
        this.A05 = cke;
    }
}
