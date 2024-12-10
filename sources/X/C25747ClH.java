package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.ClH  reason: case insensitive filesystem */
public final class C25747ClH {
    public D50 A00;
    public ED9 A01;
    public DDv A02;
    public DGT A03;
    public EDD A04;
    public C28561E7n A05;
    public C24483C5z A06;
    public final E99 A07;
    public final int A08;
    public final CJG A09;
    public final C26376Cyc A0A;
    public final boolean A0B;

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.C5z] */
    public final void A00() {
        boolean z;
        C26294Cx6.A04("AREngineHelper", "updateTouchInput ");
        ED9 ed9 = this.A01;
        EDD edd = this.A04;
        if (edd != null && edd.Bcn() && ed9 != null) {
            C26294Cx6.A04("AREngineHelper", "updateTouchInput went inside");
            View BXX = edd.BXX();
            C18070vi.A0X(BXX);
            C22806BPu bPu = (C22806BPu) ed9;
            bPu.A03 = BXX;
            BXX.setOnTouchListener(bPu.A08);
            D50 d50 = this.A00;
            if (d50 != null) {
                View BXX2 = edd.BXX();
                C18070vi.A0X(BXX2);
                C24483C5z c5z = d50.A00;
                WeakReference A0z = AnonymousClass3MW.A0z(BXX2);
                if (c5z == null) {
                    ? obj = new Object();
                    obj.A01 = A0z;
                    d50.A00 = obj;
                } else {
                    if (A0z != c5z.A01) {
                        c5z.A01 = A0z;
                        z = true;
                    } else {
                        z = false;
                    }
                    synchronized (c5z) {
                        if (z) {
                            CWV cwv = c5z.A00;
                            if (cwv != null) {
                                cwv.A00(c5z.A01);
                            }
                        }
                    }
                }
                C24483C5z c5z2 = d50.A00;
                C18070vi.A0b(c5z2);
                DDv dDv = this.A02;
                if (dDv != null) {
                    DDv.A06(dDv, new C26848DGf(c5z2), (C28561E7n) null);
                    this.A06 = c5z2;
                    return;
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
    }

    public final void A01(CJH cjh, C25376Ceb ceb, DDv dDv) {
        this.A02 = dDv;
        if (cjh != null) {
            dDv.A03 = cjh;
        }
        if (ceb != null) {
            dDv.A04 = ceb;
        }
        C26376Cyc cyc = this.A0A;
        if (cyc != null) {
            dDv.A0W = cyc.A04.A00;
            dDv.A08 = true;
            dDv.A01 = this.A08;
            dDv.A07 = this.A0B;
            cyc.A01(dDv);
        }
    }

    public C25747ClH(C26376Cyc cyc, int i, boolean z) {
        this.A0A = cyc;
        this.A08 = i;
        this.A0B = z;
        this.A09 = new CJG(this);
        this.A07 = new DE8(this, 0);
    }

    public C25747ClH() {
        this((C26376Cyc) null, 0, false);
    }
}
