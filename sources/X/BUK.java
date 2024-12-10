package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.List;

public class BUK extends C22891BUc implements EDD, C28626EAz {
    public final int A00;
    public final SurfaceHolder.Callback A01 = new C26566D4g(this);
    public final TextureView.SurfaceTextureListener A02 = new C26567D4h(this, 0);
    public final C25132CZh A03 = new C25132CZh();
    public final int A04;
    public volatile int A05;
    public volatile int A06;
    public volatile View A07;
    public volatile C25742ClC A08;

    public static synchronized void A00(BUK buk) {
        synchronized (buk) {
            View view = buk.A07;
            buk.A07 = null;
            if (view instanceof TextureView) {
                ((TextureView) view).setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            } else if (view instanceof SurfaceView) {
                ((SurfaceView) view).getHolder().removeCallback(buk.A01);
            }
            C25742ClC clC = buk.A08;
            buk.A08 = null;
            if (clC != null) {
                A02(buk, clC);
                clC.A01();
            }
        }
    }

    public synchronized View BXX() {
        if (this.A07 != null) {
        } else {
            throw AnonymousClass000.A0n("Preview view is null when invoking getPreviewView()");
        }
        return this.A07;
    }

    public synchronized void CKA(SurfaceTexture surfaceTexture, int i, int i2) {
        C25742ClC clC = this.A08;
        if (clC != null) {
            if (clC.A05 != surfaceTexture) {
                this.A07 = null;
                this.A08 = null;
                this.A06 = 0;
                this.A05 = 0;
                A02(this, clC);
                clC.A01();
            }
            this.A06 = i;
            this.A05 = i2;
            A03(this, clC, i, i2);
        }
        if (surfaceTexture != null) {
            clC = new C25742ClC(surfaceTexture);
            clC.A03 = this.A04;
            clC.A01 = this.A00;
            this.A08 = clC;
            A01(this, clC);
            this.A06 = i;
            this.A05 = i2;
            A03(this, clC, i, i2);
        }
    }

    public synchronized void CKB(Surface surface, int i, int i2) {
        C25742ClC clC = this.A08;
        if (clC != null) {
            if (clC.A00() != surface) {
                clC.A01();
            }
            this.A06 = i;
            this.A05 = i2;
            A03(this, clC, i, i2);
        }
        C26159CtX.A01(surface);
        clC = new C25742ClC(surface, false);
        clC.A03 = this.A04;
        clC.A01 = this.A00;
        this.A08 = clC;
        A01(this, clC);
        this.A06 = i;
        this.A05 = i2;
        A03(this, clC, i, i2);
    }

    public synchronized void CKC(View view) {
        if (this.A07 != view) {
            A00(this);
            this.A07 = view;
            for (E99 C1l : this.A03.A00) {
                C1l.C1l(this.A07);
            }
            if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                SurfaceHolder holder = surfaceView.getHolder();
                SurfaceHolder.Callback callback = this.A01;
                holder.addCallback(callback);
                SurfaceHolder holder2 = surfaceView.getHolder();
                if (holder2.getSurface() != null && holder2.getSurface().isValid()) {
                    callback.surfaceCreated(holder2);
                    Rect surfaceFrame = holder2.getSurfaceFrame();
                    C26159CtX.A01(surfaceFrame);
                    int i = surfaceFrame.right - surfaceFrame.left;
                    int i2 = surfaceFrame.bottom - surfaceFrame.top;
                    if (i > 0 && i2 > 0) {
                        callback.surfaceChanged(holder2, -1, i, i2);
                    }
                }
            } else if (view instanceof TextureView) {
                TextureView textureView = (TextureView) view;
                TextureView.SurfaceTextureListener surfaceTextureListener = this.A02;
                textureView.setSurfaceTextureListener(surfaceTextureListener);
                SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                if (surfaceTexture != null && width > 0 && height > 0) {
                    surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, width, height);
                }
            }
        }
    }

    public static void A01(BUK buk, C25742ClC clC) {
        List list = buk.A03.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((E99) list.get(i)).C1g(clC);
        }
    }

    public static void A02(BUK buk, C25742ClC clC) {
        List list = buk.A03.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((E99) list.get(i)).C1h(clC);
        }
    }

    public static void A03(BUK buk, C25742ClC clC, int i, int i2) {
        List list = buk.A03.A00;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((E99) list.get(i3)).C1i(clC, i, i2);
        }
    }

    public void BBf(E99 e99) {
        if (this.A03.A01(e99)) {
            if (this.A07 != null) {
                e99.C1l(this.A07);
            }
            C25742ClC clC = this.A08;
            if (clC != null) {
                e99.C1g(clC);
                int i = this.A06;
                int i2 = this.A05;
                if (i > 0 && i2 > 0) {
                    e99.C1i(clC, i, i2);
                }
            }
        }
    }

    public C22892BUd BTg() {
        return EDD.A00;
    }

    public void BXS(DAW daw) {
        IllegalStateException illegalStateException;
        Surface A002;
        View view = this.A07;
        if (view instanceof TextureView) {
            try {
                Bitmap bitmap = ((TextureView) view).getBitmap(view.getWidth(), view.getHeight());
                if (bitmap != null) {
                    daw.A00(bitmap, (C24851CMu) null);
                } else {
                    daw.Bnv(AnonymousClass000.A0n("Failed to acquire bitmap"));
                }
            } catch (Throwable th) {
                illegalStateException = new IllegalStateException("Failed to acquire bitmap", th);
            }
        } else {
            C25742ClC clC = this.A08;
            if (clC == null || (A002 = clC.A00()) == null) {
                illegalStateException = AnonymousClass000.A0n("Preview view or surface is null");
                daw.Bnv(illegalStateException);
                return;
            }
            int i = this.A06;
            int i2 = this.A05;
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    PixelCopy.request(A002, createBitmap, new C26564D4e(createBitmap, daw), ((C22889BUa) ((EDI) this.A00.BP8(EDI.A00))).A00);
                } catch (Throwable th2) {
                    illegalStateException = new IllegalStateException("Failed to acquire bitmap", th2);
                }
            } else {
                throw BE6.A0v("getPreviewBitmap() is not supported");
            }
        }
    }

    public boolean Bcn() {
        return AnonymousClass000.A1W(this.A07);
    }

    public void CEw(E99 e99) {
        this.A03.A02(e99);
    }

    public BUK(C28592E9h e9h) {
        super(e9h);
        C25313CdJ cdJ = C28626EAz.A01;
        int i = 0;
        Object obj = 0;
        C28592E9h e9h2 = this.A00;
        Object BPA = e9h2.BPA(cdJ);
        this.A04 = AnonymousClass000.A0M(BPA != null ? BPA : obj);
        Object BPA2 = e9h2.BPA(C28626EAz.A00);
        this.A00 = AnonymousClass000.A0M(BPA2 != null ? BPA2 : i);
        View view = (View) e9h2.BPA(C24700CGm.A01);
        CKC(view == null ? (View) e9h2.BPA(C24700CGm.A00) : view);
    }

    public View BPJ() {
        return BXX();
    }
}
