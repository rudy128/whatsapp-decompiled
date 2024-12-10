package X;

import java.io.IOException;

public final class D9L implements C28649ECi, C28648ECh {
    public long A00 = -9223372036854775807L;
    public long A01;
    public C28648ECh A02;
    public C28649ECi A03;
    public final C25199Caq A04;
    public final E9e A05;
    public final C25215CbB A06;

    public void BEV(long j) {
        C28649ECi eCi = this.A03;
        if (eCi != null) {
            eCi.BEV(j);
        }
    }

    public boolean BFn(long j, long j2) {
        C28649ECi eCi = this.A03;
        if (eCi == null || !eCi.BFn(j, j2)) {
            return false;
        }
        return true;
    }

    public void BIl(long j, boolean z) {
        this.A03.BIl(j, z);
    }

    public long BMc(C25721Ckr ckr, long j) {
        return this.A03.BMc(ckr, j);
    }

    public long BNp(long j) {
        return this.A03.BNp(j);
    }

    public long BNq() {
        return this.A03.BNq();
    }

    public long BVO() {
        return this.A03.BVO();
    }

    public C26539D3a Bag() {
        return this.A03.Bag();
    }

    public void BjV() {
        try {
            C28649ECi eCi = this.A03;
            if (eCi != null) {
                eCi.BjV();
            } else {
                this.A05.BjW();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public /* bridge */ /* synthetic */ void BqD(C28601E9s e9s) {
        this.A02.BqD(this);
    }

    public void C1a(C28649ECi eCi) {
        this.A02.C1a(this);
    }

    public void CCK(C28648ECh eCh, long j) {
        this.A02 = eCh;
        this.A01 = j;
        C28649ECi eCi = this.A03;
        if (eCi != null) {
            eCi.CCK(this, j);
        }
    }

    public long CDQ() {
        return this.A03.CDQ();
    }

    public long CHB(long j, boolean z) {
        return this.A03.CHB(j, z);
    }

    public long CHG(E90[] e90Arr, C28650ECj[] eCjArr, boolean[] zArr, boolean[] zArr2, long j) {
        long j2 = this.A00;
        if (j2 == -9223372036854775807L || j != 0) {
            j2 = j;
        } else {
            this.A00 = -9223372036854775807L;
        }
        return this.A03.CHG(e90Arr, eCjArr, zArr, zArr2, j2);
    }

    public void CK0(boolean z) {
        C28649ECi eCi = this.A03;
        if (eCi != null) {
            eCi.CK0(z);
        }
    }

    public void CQr(byte b, boolean z) {
        C28649ECi eCi = this.A03;
        if (eCi != null) {
            eCi.CQr(b, z);
        }
    }

    public D9L(C25199Caq caq, E9e e9e, C25215CbB cbB) {
        this.A04 = caq;
        this.A06 = cbB;
        this.A05 = e9e;
    }
}
