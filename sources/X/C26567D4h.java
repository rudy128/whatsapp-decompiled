package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.List;

/* renamed from: X.D4h  reason: case insensitive filesystem */
public class C26567D4h implements TextureView.SurfaceTextureListener {
    public final int A00;
    public final Object A01;

    public C26567D4h(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A00) {
            case 0:
                BUK buk = (BUK) this.A01;
                C25742ClC clC = buk.A08;
                buk.A08 = null;
                if (clC != null) {
                    clC.A01();
                }
                C25742ClC clC2 = new C25742ClC(surfaceTexture);
                clC2.A01 = buk.A00;
                buk.A08 = clC2;
                buk.A06 = i;
                buk.A05 = i2;
                BUK.A01(buk, clC2);
                BUK.A03(buk, clC2, i, i2);
                return;
            case 1:
                C18070vi.A0d(surfaceTexture, 0);
                BQ1 bq1 = (BQ1) this.A01;
                C25742ClC clC3 = bq1.A06;
                bq1.A06 = null;
                if (clC3 != null) {
                    clC3.A01();
                }
                C25742ClC clC4 = new C25742ClC(surfaceTexture);
                bq1.A06 = clC4;
                bq1.A04 = i;
                bq1.A03 = i2;
                List list = bq1.A00.A00;
                int A08 = BE7.A08(list);
                for (int i3 = 0; i3 < A08; i3++) {
                    E99 e99 = (E99) list.get(i3);
                    e99.C1g(clC4);
                    e99.C1i(clC4, i, i2);
                }
                return;
            default:
                CTK ctk = (CTK) this.A01;
                Object obj = ctk.A04;
                if (obj != null) {
                    if (ctk.A05) {
                        synchronized (ctk.A03) {
                            EAZ eaz = ctk.A00;
                            if (eaz != null) {
                                eaz.Bzo();
                            }
                        }
                    }
                    synchronized (obj) {
                        ctk.A06 = true;
                        obj.notifyAll();
                    }
                    return;
                }
                throw C17880vN.A0g();
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.A00) {
            case 0:
                BUK buk = (BUK) this.A01;
                C25742ClC clC = buk.A08;
                if (clC == null || clC.A05 != surfaceTexture) {
                    return true;
                }
                buk.A08 = null;
                buk.A06 = 0;
                buk.A05 = 0;
                BUK.A02(buk, clC);
                clC.A01();
                return true;
            case 1:
                C18070vi.A0d(surfaceTexture, 0);
                BQ1 bq1 = (BQ1) this.A01;
                C25742ClC clC2 = bq1.A06;
                if (clC2 == null || clC2.A05 != surfaceTexture) {
                    return true;
                }
                bq1.A06 = null;
                bq1.A04 = 0;
                bq1.A03 = 0;
                List list = bq1.A00.A00;
                int A08 = BE7.A08(list);
                for (int i = 0; i < A08; i++) {
                    ((E99) list.get(i)).C1h(clC2);
                }
                clC2.A01();
                return true;
            default:
                CTK ctk = (CTK) this.A01;
                if (!ctk.A05) {
                    return true;
                }
                synchronized (ctk.A03) {
                    EAZ eaz = ctk.A00;
                    if (eaz != null) {
                        eaz.Bzp();
                    }
                }
                return true;
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A00) {
            case 0:
                BUK buk = (BUK) this.A01;
                C25742ClC clC = buk.A08;
                if (clC != null && clC.A05 == surfaceTexture) {
                    buk.A06 = i;
                    buk.A05 = i2;
                    BUK.A03(buk, clC, i, i2);
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(surfaceTexture, 0);
                BQ1 bq1 = (BQ1) this.A01;
                C25742ClC clC2 = bq1.A06;
                if (clC2 != null && clC2.A05 == surfaceTexture) {
                    bq1.A04 = i;
                    bq1.A03 = i2;
                    List list = bq1.A00.A00;
                    int A08 = BE7.A08(list);
                    for (int i3 = 0; i3 < A08; i3++) {
                        ((E99) list.get(i3)).C1i(bq1.A06, bq1.A04, bq1.A03);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
