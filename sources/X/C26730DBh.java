package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.DBh  reason: case insensitive filesystem */
public class C26730DBh implements ECl {
    public List A00 = AnonymousClass000.A13();
    public final C24769CJm A01 = new C24769CJm(this);
    public final boolean A02;

    public void Bn4(C26115Csd csd, Object obj, int i, boolean z) {
        if (this.A02) {
            for (C28570E8b Bn4 : this.A00) {
                Bn4.Bn4(csd, obj, i, z);
            }
            return;
        }
        synchronized (this) {
            for (ECl Bn42 : this.A00) {
                Bn42.Bn4(csd, obj, i, z);
            }
        }
    }

    public void Bug(C24356Bzr bzr, long j, long j2, long j3) {
        for (ECl Bug : this.A00) {
            Bug.Bug(bzr, j, j2, j3);
        }
    }

    public void Buh(long j, long j2) {
        for (ECl Buh : this.A00) {
            Buh.Buh(j, j2);
        }
    }

    public void Bvw(C24356Bzr bzr) {
        for (ECl Bvw : this.A00) {
            Bvw.Bvw(bzr);
        }
    }

    public void Bvx() {
        for (ECl Bvx : this.A00) {
            Bvx.Bvx();
        }
    }

    public void C9A(C26115Csd csd, Object obj, boolean z) {
        if (this.A02) {
            for (C28570E8b C9A : this.A00) {
                C9A.C9A(csd, obj, z);
            }
            return;
        }
        synchronized (this) {
            for (ECl C9A2 : this.A00) {
                C9A2.C9A(csd, obj, z);
            }
        }
    }

    public void C9B(IOException iOException) {
        if (this.A02) {
            for (ECl C9B : this.A00) {
                C9B.C9B(iOException);
            }
            return;
        }
        synchronized (this) {
            for (ECl C9B2 : this.A00) {
                C9B2.C9B(iOException);
            }
        }
    }

    public void C9C(String str, Object obj) {
        for (E42 C9C : this.A00) {
            C9C.C9C(str, obj);
        }
    }

    public void C9D(C26115Csd csd, C24356Bzr bzr) {
        for (ECl C9D : this.A00) {
            C9D.C9D(csd, bzr);
        }
    }

    public void C9E(C26115Csd csd, Object obj, boolean z, boolean z2) {
        if (this.A02) {
            for (C28570E8b C9E : this.A00) {
                C9E.C9E(csd, obj, z, z2);
            }
            return;
        }
        synchronized (this) {
            for (ECl C9E2 : this.A00) {
                C9E2.C9E(csd, obj, z, z2);
            }
        }
    }

    public void CIV(long j) {
        for (ECl CIV : this.A00) {
            CIV.CIV(j);
        }
    }

    public C26730DBh(boolean z) {
        this.A02 = z;
    }
}
