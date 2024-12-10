package X;

import java.util.List;

/* renamed from: X.DGz  reason: case insensitive filesystem */
public class C26868DGz implements E9F {
    public final /* synthetic */ C26117Csf A00;

    public void BpP(List list) {
    }

    public void C23(double d) {
    }

    public C26868DGz(C26117Csf csf) {
        this.A00 = csf;
    }

    public void Bnq(C25820CmX cmX) {
        C2Z c2z = new C2Z("cancelled");
        C26117Csf csf = this.A00;
        csf.A03();
        E9F e9f = csf.A0B.A05;
        if (e9f != null) {
            e9f.BtX(cmX, c2z);
        }
    }

    public /* bridge */ /* synthetic */ void BtX(C25820CmX cmX, Object obj) {
        C26117Csf csf = this.A00;
        csf.A03();
        E9F e9f = csf.A0B.A05;
        if (e9f != null) {
            e9f.BtX(cmX, obj);
        }
    }
}
