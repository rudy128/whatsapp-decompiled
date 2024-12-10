package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.whatsapp.util.Log;

/* renamed from: X.6Mk  reason: invalid class name and case insensitive filesystem */
public abstract class C122006Mk extends C110415fb {
    public int A00 = -1;
    public C133906ph A01;
    public C121996Mj A02;
    public String A03;
    public boolean A04 = false;
    public final View A05;
    public final View A06;
    public final AspectRatioFrameLayout A07;
    public final boolean A08;
    public final AnonymousClass7O5 A09;

    public void setController(C121996Mj r2) {
        A03(r2, true);
    }

    public void A03(C121996Mj r2, boolean z) {
        this.A02 = r2;
        if (r2 != null && z) {
            r2.A07 = this.A09;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C121996Mj r0 = this.A02;
        if (r0 != null) {
            return r0.dispatchKeyEvent(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public Bitmap getCurrentFrame() {
        try {
            View view = this.A06;
            int width = view.getWidth() / 4;
            int height = view.getHeight() / 4;
            if (!this.A08) {
                return ((TextureView) view).getBitmap(width, height);
            }
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            if (!isDrawingCacheEnabled) {
                view.setDrawingCacheEnabled(true);
            }
            view.buildDrawingCache(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache == null) {
                return null;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(drawingCache, width, height, true);
            if (!isDrawingCacheEnabled) {
                view.setDrawingCacheEnabled(false);
            }
            view.destroyDrawingCache();
            return createScaledBitmap;
        } catch (OutOfMemoryError e) {
            Log.e("HeroPlayerView/getCurrentFrame/", e);
            return null;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        C121996Mj r0 = this.A02;
        if (r0 == null) {
            return false;
        }
        r0.A05();
        return true;
    }

    public void setLayoutResizeMode(int i) {
        this.A07.setResizeMode(i);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.TextureView, X.5e7] */
    public C122006Mk(Context context, int i, boolean z) {
        super(context);
        SurfaceView surfaceView;
        A02();
        LayoutInflater.from(context).inflate(i, this);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(2131436751);
        this.A07 = aspectRatioFrameLayout;
        this.A05 = findViewById(2131435443);
        this.A08 = z;
        if (z) {
            surfaceView = new SurfaceView(context);
        } else {
            ? textureView = new TextureView(context);
            boolean z2 = textureView.A01;
            surfaceView = textureView;
            if (!z2) {
                textureView.A01 = true;
                textureView.generatedComponent();
                surfaceView = textureView;
            }
        }
        this.A06 = surfaceView;
        surfaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aspectRatioFrameLayout.addView(surfaceView, 0);
        this.A09 = new AnonymousClass7O5(this);
    }

    public void setExoPlayerErrorActionsController(C133906ph r1) {
        this.A01 = r1;
    }
}
