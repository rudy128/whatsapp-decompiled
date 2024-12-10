package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.facebook.android.exoplayer2.ui.SubtitleView;

/* renamed from: X.6Mw  reason: invalid class name and case insensitive filesystem */
public final class C122126Mw extends C122006Mk {
    public C26378Cye A00;
    public AnonymousClass7BD A01 = new AnonymousClass7BD(this);
    public boolean A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public boolean A06;
    public final SubtitleView A07;
    public final AnonymousClass1KB A08;
    public final C18030ve A09;

    public static void A00(Surface surface, C122126Mw r3, boolean z) {
        C26378Cye cye = r3.A00;
        if (cye != null) {
            cye.A0H(surface);
        }
        Surface surface2 = r3.A03;
        if (!(surface2 == null || surface2 == surface || !r3.A06)) {
            surface2.release();
        }
        r3.A03 = surface;
        r3.A06 = z;
    }

    public static void A01(C122126Mw r3) {
        TextureView textureView = r3.A05;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != r3.A01) {
                Log.d("HeroPlayerView", "SurfaceTextureListener already unset or replaced.");
            } else {
                r3.A05.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            r3.A05 = null;
        }
        SurfaceHolder surfaceHolder = r3.A04;
        if (surfaceHolder != null) {
            AnonymousClass7BD r0 = r3.A01;
            if (r0 != null) {
                surfaceHolder.removeCallback(r0);
            }
            r3.A04 = null;
        }
    }

    public void setCaptionsEnabled(boolean z) {
        this.A07.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public void setPlayer(C26378Cye cye) {
        C26378Cye cye2 = this.A00;
        if (cye2 != null) {
            AnonymousClass7BD r2 = this.A01;
            if (r2 != null) {
                C108955ca.A1F(cye2.A0C, r2, 45);
            }
            this.A00.A0H((Surface) null);
        }
        this.A00 = cye;
        if (cye != null) {
            if (this.A01 == null) {
                this.A01 = new AnonymousClass7BD(this);
            }
            boolean z = this.A08;
            View view = this.A06;
            if (z) {
                setVideoSurfaceView((SurfaceView) view);
            } else {
                setVideoTextureView((TextureView) view);
            }
            AnonymousClass7BD r22 = this.A01;
            if (r22 != null) {
                C108955ca.A1F(cye.A0C, r22, 44);
            }
            C121996Mj r0 = this.A02;
            if (r0 != null) {
                r0.setPlayer(cye);
            }
        } else {
            this.A05.setVisibility(0);
        }
        this.A04 = false;
    }

    public void setVideoSurfaceView(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        setVideoSurfaceHolder(holder);
    }

    public C122126Mw(Context context, AnonymousClass1KB r3, C18030ve r4, boolean z) {
        super(context, 2131627527, z);
        A02();
        SubtitleView subtitleView = (SubtitleView) findViewById(2131435899);
        this.A07 = subtitleView;
        subtitleView.A00();
        subtitleView.A01();
        this.A08 = r3;
        this.A09 = r4;
    }

    public void A03(C121996Mj r3, boolean z) {
        C26378Cye cye;
        super.A03(r3, z);
        C121996Mj r1 = this.A02;
        if (r1 != null && (cye = this.A00) != null) {
            r1.setPlayer(cye);
        }
    }

    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        A01(this);
        this.A04 = surfaceHolder;
        if (surfaceHolder != null) {
            AnonymousClass7BD r0 = this.A01;
            if (r0 != null) {
                surfaceHolder.addCallback(r0);
            }
            Surface surface = surfaceHolder.getSurface();
            if (surface != null && surface.isValid()) {
                A00(surface, this, false);
                return;
            }
        }
        A00((Surface) null, this, false);
    }

    public void setVideoTextureView(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        A01(this);
        this.A05 = textureView;
        Surface surface = null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                Log.w("HeroPlayerView", "Replacing existing SurfaceTextureListener.");
            }
            AnonymousClass7BD r0 = this.A01;
            if (r0 != null) {
                textureView.setSurfaceTextureListener(r0);
            }
            if (textureView.isAvailable() && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                surface = new Surface(surfaceTexture);
            }
        }
        A00(surface, this, true);
    }
}
