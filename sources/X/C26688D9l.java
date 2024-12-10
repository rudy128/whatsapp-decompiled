package X;

import java.util.ArrayList;

/* renamed from: X.D9l  reason: case insensitive filesystem */
public abstract class C26688D9l implements E9Q {
    public int A00;
    public C26115Csd A01;
    public final ArrayList A02 = AnonymousClass8BT.A0z();
    public final boolean A03;

    public final void A02() {
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i);
        }
    }

    public final void A04(C26115Csd csd) {
        this.A01 = csd;
        for (int i = 0; i < this.A00; i++) {
            ((C28570E8b) this.A02.get(i)).C9E(csd, this, this.A03, false);
        }
    }

    public final void A01() {
        C26115Csd csd = this.A01;
        for (int i = 0; i < this.A00; i++) {
            ((C28570E8b) this.A02.get(i)).C9A(csd, this, this.A03);
        }
        this.A01 = null;
    }

    public final void A03(int i) {
        C26115Csd csd = this.A01;
        for (int i2 = 0; i2 < this.A00; i2++) {
            ((C28570E8b) this.A02.get(i2)).Bn4(csd, this, i, this.A03);
        }
    }

    public C26688D9l(boolean z) {
        this.A03 = z;
    }

    public final void BBr(C28570E8b e8b) {
        C26056CrS.A01(e8b);
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(e8b)) {
            arrayList.add(e8b);
            this.A00++;
        }
    }
}
