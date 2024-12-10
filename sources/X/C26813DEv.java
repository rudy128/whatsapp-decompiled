package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.DEv  reason: case insensitive filesystem */
public class C26813DEv implements EAW {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C25742ClC A05;
    public boolean A06;
    public final C26790DDy A07 = new C26790DDy();
    public final /* synthetic */ BUN A08;

    public void C4V() {
        this.A05 = null;
        BUN.A03(this.A08, (C25742ClC) null);
    }

    public boolean CSA() {
        return true;
    }

    public C26813DEv(BUN bun) {
        this.A08 = bun;
    }

    public static void A00(C26813DEv dEv) {
        if (dEv.A07.A03 != null) {
            BUN bun = dEv.A08;
            bun.A0J.post(new DTI(bun, dEv.A03, dEv.A01, dEv.A02, dEv.A04, dEv.A00, 1, dEv.A06));
        }
    }

    public Object BVm(C24556C9c c9c) {
        if (c9c == EB1.A00) {
            return this.A07.A00;
        }
        if (c9c == C28628EBb.A00) {
            return this.A08.A0M;
        }
        return null;
    }

    public E9U BX6() {
        return null;
    }

    public /* synthetic */ Surface BZz() {
        return null;
    }

    public SurfaceTexture Ba0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i5;
        this.A04 = i3;
        this.A00 = i4;
        this.A06 = AnonymousClass000.A1T(i6, 1);
        int i8 = 7;
        if (i7 != 7) {
            i8 = 0;
        }
        BUN bun = this.A08;
        if (i8 != bun.A00) {
            bun.A00 = i8;
            if (i8 == 7) {
                bun.A0R = true;
            } else {
                bun.A0R = false;
            }
            C25742ClC clC = this.A05;
            if (clC != null) {
                bun.CEv(clC);
                BUN.A03(bun, this.A05);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean z = bun.A0O;
        if (z) {
            C26790DDy dDy = this.A07;
            dDy.A01();
            C26294Cx6.A05("ar-session", "regular surface used - async");
            dDy.A03 = new SurfaceTexture(0);
        }
        C27076DTa.A00(bun.A0J, this, countDownLatch, 10);
        if (!z) {
            try {
                BE9.A1L(countDownLatch);
            } catch (InterruptedException e) {
                Object[] objArr = new Object[1];
                BE6.A1M(e, objArr, 0);
                C26294Cx6.A0D("RtcSurfacePipeComponent", "Timeout when creating SurfaceNode: %s", e, objArr);
            }
        }
        A00(this);
        return this.A07.A03;
    }

    public /* synthetic */ void Ba1() {
    }

    public C28553E7e BbR() {
        return this.A08.A0A;
    }

    public void Bnd(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            A00(this);
        }
    }

    public void BrQ(int i) {
        this.A08.A0I.post(new AnonymousClass7RP(this, i, 6));
    }

    public void C4T(int i, int i2) {
        BUN bun = this.A08;
        C27082DTh.A01(bun.A0J, bun, 22);
    }

    public void C4U(SurfaceTexture surfaceTexture, int i, int i2) {
        C25742ClC clC = this.A05;
        if (clC == null || clC.A05 != surfaceTexture) {
            this.A05 = new C25742ClC(surfaceTexture);
        }
        BUN bun = this.A08;
        BUN.A03(bun, this.A05);
        C27082DTh.A01(bun.A0J, bun, 23);
    }

    public void CEN() {
        this.A07.A01();
        A00(this);
    }
}
