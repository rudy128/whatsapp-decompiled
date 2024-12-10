package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.DEu  reason: case insensitive filesystem */
public class C26812DEu implements EAW {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C25742ClC A05;
    public boolean A06;
    public final C26790DDy A07 = new C26790DDy();
    public final /* synthetic */ BUO A08;

    public void C4V() {
        this.A05 = null;
        BUO.A02(this.A08, (C25742ClC) null);
    }

    public boolean CSA() {
        return true;
    }

    public C26812DEu(BUO buo) {
        this.A08 = buo;
    }

    public static void A00(C26812DEu dEu) {
        if (dEu.A07.A03 != null) {
            BUO buo = dEu.A08;
            buo.A0K.post(new DTI(buo, dEu.A03, dEu.A01, dEu.A02, dEu.A04, dEu.A00, 0, dEu.A06));
        }
    }

    public Object BVm(C24556C9c c9c) {
        if (c9c == EB1.A00) {
            return this.A07.A00;
        }
        if (c9c == C28628EBb.A00) {
            return this.A08.A0O;
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
        BUO buo = this.A08;
        if (i8 != buo.A00) {
            buo.A00 = i8;
            if (i8 == 7) {
                buo.A0S = true;
            } else {
                buo.A0S = false;
            }
            C25742ClC clC = this.A05;
            if (clC != null) {
                buo.CEv(clC);
                BUO.A02(buo, this.A05);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean z = buo.A0P;
        if (z) {
            C26790DDy dDy = this.A07;
            dDy.A01();
            C26294Cx6.A05("ar-session", "regular surface used - async");
            dDy.A03 = new SurfaceTexture(0);
        }
        C27076DTa.A00(buo.A0K, this, countDownLatch, 9);
        if (!z) {
            try {
                BE9.A1L(countDownLatch);
            } catch (InterruptedException e) {
                String str = BUO.A0U;
                Object[] objArr = new Object[1];
                BE6.A1M(e, objArr, 0);
                C26294Cx6.A0D(str, "Timeout when creating SurfaceNode: %s", e, objArr);
            }
        }
        A00(this);
        return this.A07.A03;
    }

    public /* synthetic */ void Ba1() {
    }

    public C28553E7e BbR() {
        return this.A08.A0E;
    }

    public void Bnd(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            A00(this);
        }
    }

    public void BrQ(int i) {
        Handler handler = this.A08.A0J;
        if (handler != null) {
            handler.post(new AnonymousClass7RP(this, i, 5));
        }
    }

    public void C4T(int i, int i2) {
        BUO buo = this.A08;
        buo.A05 = i;
        buo.A04 = i2;
        C27082DTh.A01(buo.A0K, buo, 20);
    }

    public void C4U(SurfaceTexture surfaceTexture, int i, int i2) {
        C25742ClC clC = this.A05;
        if (clC == null || !(surfaceTexture == null || clC.A05 == surfaceTexture)) {
            C25742ClC clC2 = new C25742ClC(surfaceTexture);
            this.A05 = clC2;
            BUO.A02(this.A08, clC2);
        }
        BUO buo = this.A08;
        buo.A05 = i;
        buo.A04 = i2;
        C27082DTh.A01(buo.A0K, buo, 19);
    }

    public void CEN() {
        this.A07.A01();
        A00(this);
    }
}
