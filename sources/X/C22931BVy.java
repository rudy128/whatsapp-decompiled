package X;

import java.io.File;
import java.util.List;

/* renamed from: X.BVy  reason: case insensitive filesystem */
public final class C22931BVy extends C26867DGy {
    public final E9F A00;
    public final C25833Cmm A01;
    public final /* synthetic */ C26117Csf A02;

    public C22931BVy(E9F e9f, C25833Cmm cmm, C26117Csf csf) {
        this.A02 = csf;
        this.A01 = cmm;
        this.A00 = e9f;
    }

    public /* bridge */ /* synthetic */ void BtX(C25820CmX cmX, Object obj) {
        E9F e9f = this.A00;
        if (e9f != null) {
            e9f.BtX(cmX, obj);
        }
    }

    public void BpP(List list) {
        File file = ((C25241Cbc) C108955ca.A0p(list)).A0I;
        C26117Csf csf = this.A02;
        csf.A0E.put(this.A01, file);
    }
}
