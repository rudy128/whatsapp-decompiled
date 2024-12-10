package X;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;

/* renamed from: X.DOf  reason: case insensitive filesystem */
public final class C26983DOf implements C28596E9n {
    public SurfaceTexture A00;
    public DE3 A01;
    public C25742ClC A02;
    public C28629EBc A03;
    public C25230CbR A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public Handler A08;
    public final DDU A09;
    public final E6T A0A;
    public final C18100vl A0B;
    public final C18100vl A0C = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C27634Die(this));
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;

    public static final synchronized void A00(C25230CbR cbR, C26983DOf dOf) {
        int i;
        synchronized (dOf) {
            C26782DDo dDo = (C26782DDo) dOf.A0D.getValue();
            C18100vl r1 = cbR.A06;
            int A0I = C72453Mb.A0I(r1);
            C18100vl r0 = cbR.A03;
            int A0I2 = C72453Mb.A0I(r0);
            int A0I3 = C72453Mb.A0I(r1);
            int A0I4 = C72453Mb.A0I(r0);
            boolean z = cbR.A07;
            if (z) {
                i = (360 - dOf.A07) % 360;
            } else {
                i = dOf.A07;
            }
            dDo.CQm(A0I, A0I2, A0I3, A0I4, 0, i, 0, z);
        }
    }

    public static final synchronized void A01(C26983DOf dOf) {
        ImageReader imageReader;
        Image acquireLatestImage;
        synchronized (dOf) {
            BUI bui = (BUI) ((ED7) dOf.A09.BP7(ED7.A00));
            synchronized (bui) {
                imageReader = bui.A00;
            }
            if (!(imageReader == null || (acquireLatestImage = imageReader.acquireLatestImage()) == null)) {
                acquireLatestImage.close();
            }
            C28629EBc eBc = dOf.A03;
            if (imageReader != null) {
                if (eBc == null) {
                    imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
                } else {
                    imageReader.setOnImageAvailableListener(new C26358CyK(eBc, dOf), dOf.A08);
                }
            }
        }
    }

    public synchronized void BD8(Handler handler, C28629EBc eBc) {
        C18070vi.A0d(handler, 0);
        this.A03 = eBc;
        this.A08 = handler;
        A01(this);
    }

    public synchronized void CQ5() {
        this.A03 = null;
        this.A08 = null;
        A01(this);
    }

    public synchronized void CQ6() {
        DE3 de3 = this.A01;
        if (de3 != null && !this.A06) {
            DDR.A08((EDC) this.A09.BP7(EDC.A01)).A02(0, de3);
        }
        this.A06 = false;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
    }

    public synchronized void CR6(int i) {
        this.A07 = i;
        C25230CbR cbR = this.A04;
        if (cbR != null) {
            A00(cbR, this);
        }
    }

    public synchronized void start() {
        this.A05 = true;
        DDU ddu = this.A09;
        ddu.CG0();
        DDR.A08((EDC) ddu.BP7(EDC.A01)).A04((DDm) this.A0G.getValue(), 0);
    }

    public synchronized void stop() {
        boolean A1T;
        this.A05 = false;
        DDU ddu = this.A09;
        synchronized (ddu) {
            A1T = AnonymousClass000.A1T(ddu.A00, 2);
        }
        if (A1T) {
            ddu.pause();
        }
    }

    public C26983DOf(DDU ddu, E6T e6t, C18030ve r5) {
        this.A09 = ddu;
        this.A0A = e6t;
        Integer A002 = C87484Vt.A00(r5);
        this.A0F = AnonymousClass1DF.A00(A002, new C27636Dig(this));
        this.A0E = AnonymousClass1DF.A00(A002, C27902Dnd.A00);
        this.A0D = AnonymousClass1DF.A00(A002, new C27635Dif(this));
        this.A0B = AnonymousClass1DF.A00(A002, C27901Dnc.A00);
        this.A0G = AnonymousClass1DF.A00(A002, new C27637Dih(this));
    }
}
