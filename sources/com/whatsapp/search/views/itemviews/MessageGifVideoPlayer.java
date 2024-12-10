package com.whatsapp.search.views.itemviews;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass75R;
import X.AnonymousClass75U;
import X.AnonymousClass77Y;
import X.C120846Fp;
import X.C1420277w;
import X.C145617Ly;
import X.C1596685k;
import X.C27691Xc;
import X.C440021t;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;

public class MessageGifVideoPlayer extends TextureView implements AnonymousClass009 {
    public MediaPlayer A00;
    public Surface A01;
    public AnonymousClass77Y A02;
    public C440021t A03;
    public C1596685k A04;
    public AnonymousClass10I A05;
    public AnonymousClass031 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final MediaPlayer.OnErrorListener A0E;
    public final MediaPlayer.OnPreparedListener A0F;
    public final TextureView.SurfaceTextureListener A0G;

    private void A00() {
        this.A07 = false;
        if (this.A0D) {
            this.A0B = true;
        } else if (!this.A09) {
            this.A0A = true;
        } else {
            setSurfaceTextureListener(this.A0G);
            AnonymousClass3MZ.A1U(this.A05, this, 22);
        }
    }

    public static void A01(MessageGifVideoPlayer messageGifVideoPlayer) {
        if (messageGifVideoPlayer.A09 && messageGifVideoPlayer.A00 != null && messageGifVideoPlayer.A07) {
            C1596685k r0 = messageGifVideoPlayer.A04;
            if (r0 != null) {
                C120846Fp.A01(((C145617Ly) r0).A00, false);
            }
            messageGifVideoPlayer.setVisibility(0);
            messageGifVideoPlayer.A00.start();
            messageGifVideoPlayer.A08 = true;
        }
    }

    public static void A02(MessageGifVideoPlayer messageGifVideoPlayer) {
        MediaPlayer mediaPlayer;
        messageGifVideoPlayer.setVisibility(8);
        C1596685k r0 = messageGifVideoPlayer.A04;
        if (r0 != null) {
            C120846Fp.A01(((C145617Ly) r0).A00, true);
        }
        if (messageGifVideoPlayer.A08 && (mediaPlayer = messageGifVideoPlayer.A00) != null) {
            mediaPlayer.pause();
            messageGifVideoPlayer.A00.seekTo(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r3 < r2) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r4 > r6) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r1 = r3 / r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r2 = 1.0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.whatsapp.search.views.itemviews.MessageGifVideoPlayer r8) {
        /*
            X.77Y r1 = r8.A02
            if (r1 == 0) goto L_0x003c
            int r0 = r1.A01
            float r7 = (float) r0
            int r0 = r1.A00
            float r6 = (float) r0
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            float r5 = X.C108945cZ.A03(r8)
            float r4 = X.C108945cZ.A04(r8)
            float r3 = r7 / r6
            float r2 = r5 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
        L_0x0029:
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
        L_0x002d:
            float r2 = r2 / r3
        L_0x002e:
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r4 = r4 / r0
            android.graphics.Matrix r0 = X.C108945cZ.A0J()
            r0.setScale(r1, r2, r5, r4)
            r8.setTransform(r0)
        L_0x003c:
            return
        L_0x003d:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            goto L_0x0029
        L_0x0046:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x002d
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
        L_0x004e:
            float r3 = r3 / r2
            r1 = r3
        L_0x0050:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.itemviews.MessageGifVideoPlayer.A03(com.whatsapp.search.views.itemviews.MessageGifVideoPlayer):void");
    }

    public void A04() {
        if (!this.A0C) {
            this.A0C = true;
            this.A05 = AnonymousClass10E.AL1(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A06;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public void setMessage(C440021t r2) {
        if ((this.A03 != r2 || this.A00 == null) && r2.A02 != null) {
            this.A03 = r2;
            A00();
        }
    }

    public void setScrolling(boolean z) {
        this.A0D = z;
        if (!z && this.A0B) {
            this.A0B = false;
            A00();
        }
    }

    public void setShouldPlay(boolean z) {
        if (this.A09 != z) {
            this.A09 = z;
            if (!z) {
                if (this.A08 && this.A00 != null) {
                    A02(this);
                }
            } else if (this.A0A) {
                A00();
            } else if (this.A07) {
                A01(this);
            }
        }
    }

    public MessageGifVideoPlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A04();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A01(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A02(this);
    }

    public void setPlayingListener(C1596685k r1) {
        this.A04 = r1;
    }

    public MessageGifVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
        this.A09 = false;
        this.A0D = false;
        this.A0G = new C1420277w(this, 1);
        this.A0F = new AnonymousClass75U(this, 2);
        this.A0E = new AnonymousClass75R(1);
    }

    public MessageGifVideoPlayer(Context context) {
        super(context);
        A04();
        this.A09 = false;
        this.A0D = false;
        this.A0G = new C1420277w(this, 1);
        this.A0F = new AnonymousClass75U(this, 2);
        this.A0E = new AnonymousClass75R(1);
    }
}
