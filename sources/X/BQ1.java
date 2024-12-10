package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;

public final class BQ1 extends DDR implements EDD {
    public final C25132CZh A00 = new C25132CZh();
    public final Context A01;
    public final TextureView.SurfaceTextureListener A02 = new C26567D4h(this, 1);
    public volatile int A03;
    public volatile int A04;
    public volatile TextureView A05;
    public volatile C25742ClC A06;

    public void BBf(E99 e99) {
        C18070vi.A0d(e99, 0);
        if (this.A00.A01(e99)) {
            if (this.A05 != null) {
                e99.C1l(this.A05);
            }
            C25742ClC clC = this.A06;
            if (clC != null) {
                e99.C1g(clC);
                int i = this.A04;
                int i2 = this.A03;
                if (i > 0 && i2 > 0) {
                    e99.C1i(clC, i, i2);
                }
            }
        }
    }

    public synchronized void BXS(DAW daw) {
        IllegalStateException illegalStateException;
        TextureView textureView = this.A05;
        if (textureView == null) {
            illegalStateException = AnonymousClass000.A0n("Preview view is null");
        } else {
            try {
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), textureView.getHeight());
                if (bitmap != null) {
                    daw.A00(bitmap, (C24851CMu) null);
                } else {
                    daw.Bnv(AnonymousClass000.A0n("Failed to acquire bitmap"));
                }
            } catch (Throwable th) {
                illegalStateException = new IllegalStateException("Failed to acquire bitmap", th);
            }
        }
        daw.Bnv(illegalStateException);
        return;
    }

    public synchronized View BXX() {
        TextureView textureView;
        textureView = this.A05;
        if (textureView == null) {
            textureView = new TextureView(this.A01);
            textureView.setSurfaceTextureListener(this.A02);
            this.A05 = textureView;
            for (E99 C1l : this.A00.A00) {
                C1l.C1l(this.A05);
            }
        }
        return textureView;
    }

    public void CEw(E99 e99) {
        C18070vi.A0d(e99, 0);
        this.A00.A02(e99);
    }

    public C22892BUd BTg() {
        C22892BUd bUd = EDD.A00;
        C18070vi.A0Z(bUd);
        return bUd;
    }

    public boolean Bcn() {
        return AnonymousClass000.A1W(this.A05);
    }

    public void CKA(SurfaceTexture surfaceTexture, int i, int i2) {
        throw BE6.A0v("setPreviewSurface() is not supported");
    }

    public void CKB(Surface surface, int i, int i2) {
        throw BE6.A0v("setPreviewSurface() is not supported");
    }

    public void CKC(View view) {
        throw BE6.A0v("setPreviewView() is not supported");
    }

    public BQ1(C28592E9h e9h) {
        this.A00 = e9h;
        Context context = e9h.getContext();
        C18070vi.A0X(context);
        this.A01 = context;
    }

    public View BPJ() {
        return BXX();
    }
}
