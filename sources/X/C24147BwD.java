package X;

import android.os.SystemClock;

/* renamed from: X.BwD  reason: case insensitive filesystem */
public class C24147BwD extends C201010v {
    public final /* synthetic */ CZK A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24147BwD(CZK czk) {
        super("CameraQRCodeProcessor");
        this.A00 = czk;
    }

    public void run() {
        int i;
        int i2;
        C25124CYx cYx;
        C28598E9p e9p;
        while (true) {
            CZK czk = this.A00;
            if (czk.A07) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    CQV BM5 = czk.A06.BM5();
                    if (BM5 != null) {
                        byte[] bArr = BM5.A02;
                        int i3 = BM5.A01;
                        int i4 = BM5.A00;
                        if (i3 < 320) {
                            i = i3;
                        } else {
                            i = (i3 * 3) / 4;
                        }
                        if (i4 < 320) {
                            i2 = i4;
                        } else {
                            i2 = (i4 * 3) / 4;
                        }
                        try {
                            cYx = czk.A04.A00(new CYN(new C23669Bnc(new C23672Bnf(bArr, i3, i4, (i3 - i) / 2, (i4 - i2) / 2, i, i2))), czk.A01);
                        } catch (C2R unused) {
                            cYx = null;
                        }
                        if (czk.A07) {
                            synchronized (czk) {
                                if (cYx != null) {
                                    C25124CYx cYx2 = czk.A00;
                                    if (cYx2 == null || !cYx2.A02.equals(cYx.A02)) {
                                        czk.A00 = cYx;
                                        C26997DOt dOt = (C26997DOt) czk.A05;
                                        if (dOt.A00 != 0) {
                                            e9p = ((C24818CLl) dOt.A01).A00.A06;
                                        } else {
                                            e9p = ((Bq6) dOt.A01).A0F;
                                        }
                                        if (e9p != null) {
                                            e9p.C2G(cYx);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    long uptimeMillis2 = ((long) (1000 / czk.A03)) - (SystemClock.uptimeMillis() - uptimeMillis);
                    if (czk.A07 && uptimeMillis2 > 0) {
                        Thread.sleep(uptimeMillis2);
                    }
                } catch (InterruptedException unused2) {
                }
            } else {
                return;
            }
        }
    }
}
