package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D9N implements C28649ECi, C28569E8a {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public byte[] A04;
    public final long A05;
    public final D48 A06;
    public final C26154CtM A07;
    public final C25667Cjx A08 = new C25667Cjx("Loader:SingleSampleMediaPeriod");
    public final C26539D3a A09;
    public final E41 A0A;
    public final C26115Csd A0B;
    public final ArrayList A0C = AnonymousClass000.A13();

    public void BEV(long j) {
    }

    public void BIl(long j, boolean z) {
    }

    public long BMc(C25721Ckr ckr, long j) {
        return j;
    }

    public void BjV() {
    }

    public long CHB(long j, boolean z) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i >= arrayList.size()) {
                return j;
            }
            D9V d9v = (D9V) arrayList.get(i);
            if (d9v.A00 == 2) {
                d9v.A00 = 1;
            }
            i++;
        }
    }

    public long CHG(E90[] e90Arr, C28650ECj[] eCjArr, boolean[] zArr, boolean[] zArr2, long j) {
        for (int i = 0; i < eCjArr.length; i++) {
            E90 e90 = e90Arr[i];
            if (e90 != null && (eCjArr[i] == null || !zArr[i])) {
                this.A0C.remove(e90);
                e90Arr[i] = null;
            }
            if (e90Arr[i] == null && eCjArr[i] != null) {
                D9V d9v = new D9V(this);
                this.A0C.add(d9v);
                e90Arr[i] = d9v;
                zArr2[i] = true;
            }
        }
        return j;
    }

    public void CK0(boolean z) {
    }

    public void CQr(byte b, boolean z) {
    }

    public boolean BFn(long j, long j2) {
        if (this.A01) {
            return false;
        }
        C25667Cjx cjx = this.A08;
        if (cjx.A00 != null) {
            return false;
        }
        C26115Csd csd = this.A0B;
        cjx.A00(this, new C26694D9s(this.A0A.BHH(), csd), 3);
        this.A07.A07(new CJ1(csd), new CTB(this.A06, (Object) null, 1, -1, 0, C26154CtM.A00(0), C26154CtM.A00(this.A05)));
        return true;
    }

    public long BNp(long j) {
        if (this.A01) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public long BNq() {
        if (this.A01) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public long BVO() {
        if (this.A01 || this.A08.A00 != null) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public C26539D3a Bag() {
        return this.A09;
    }

    public /* bridge */ /* synthetic */ void Bwq(E7O e7o, boolean z) {
        this.A07.A06(new CJ1(((C26694D9s) e7o).A02), new CTB((D48) null, (Object) null, 1, -1, 0, C26154CtM.A00(0), C26154CtM.A00(this.A05)));
    }

    public /* bridge */ /* synthetic */ void Bws(E7O e7o) {
        C26694D9s d9s = (C26694D9s) e7o;
        this.A07.A09(new CJ1(d9s.A02), new CTB(this.A06, (Object) null, 1, -1, 0, C26154CtM.A00(0), C26154CtM.A00(this.A05)), d9s);
        this.A00 = d9s.A00;
        this.A04 = d9s.A01;
        this.A01 = true;
        this.A02 = true;
    }

    public /* bridge */ /* synthetic */ CJ6 Bww(E7O e7o, IOException iOException) {
        this.A07.A08(new CJ1(((C26694D9s) e7o).A02), new CTB(this.A06, (Object) null, 1, -1, 0, C26154CtM.A00(0), C26154CtM.A00(this.A05)), iOException, false);
        return C25667Cjx.A05;
    }

    public long CDQ() {
        if (this.A03) {
            return -9223372036854775807L;
        }
        this.A07.A04();
        this.A03 = true;
        return -9223372036854775807L;
    }

    public D9N(D48 d48, C26154CtM ctM, E41 e41, C26115Csd csd, long j) {
        this.A0B = csd;
        this.A0A = e41;
        this.A06 = d48;
        this.A05 = j;
        this.A07 = ctM;
        E0X e0x = C26539D3a.CREATOR;
        this.A09 = new C26539D3a(new D3X(d48));
        ctM.A02();
    }

    public void CCK(C28648ECh eCh, long j) {
        eCh.C1a(this);
    }
}
