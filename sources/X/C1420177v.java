package X;

import android.view.SurfaceHolder;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.77v  reason: invalid class name and case insensitive filesystem */
public class C1420177v implements SurfaceHolder.Callback {
    public final int A00;
    public final Object A01;

    public C1420177v(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r2.A06 != r9) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x003e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VideoView/surfaceChanged: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "x"
            X.C17900vP.A0j(r0, r1, r9)
            java.lang.Object r2 = r5.A01
            com.whatsapp.videoplayback.VideoSurfaceView r2 = (com.whatsapp.videoplayback.VideoSurfaceView) r2
            r2.A04 = r8
            r2.A03 = r9
            int r0 = r2.A07
            if (r0 != r8) goto L_0x0027
            int r0 = r2.A06
            r1 = 1
            if (r0 == r9) goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            android.media.MediaPlayer r0 = r2.A0B
            if (r0 == 0) goto L_0x003d
            if (r1 == 0) goto L_0x003d
            int r0 = r2.A02
            if (r0 < 0) goto L_0x0035
            r2.seekTo(r0)
        L_0x0035:
            int r1 = r2.A05
            r0 = 3
            if (r1 != r0) goto L_0x003d
            r2.start()
        L_0x003d:
            return
        L_0x003e:
            java.lang.Object r4 = r5.A01
            X.5e5 r4 = (X.C109835e5) r4
            android.hardware.Camera r0 = r4.A03
            if (r0 != 0) goto L_0x0054
            android.os.Handler r0 = r4.A04
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "qrview/surfacechanged: no camera"
        L_0x004c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 1
            X.C109835e5.A02(r4, r0)
            return
        L_0x0054:
            android.view.SurfaceHolder r3 = r4.A0O
            android.view.Surface r0 = r3.getSurface()
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = "qrview/surfacechanged: no surface"
            goto L_0x004c
        L_0x005f:
            java.lang.Object r0 = r5.A01
            X.6UI r0 = (X.AnonymousClass6UI) r0
            X.DRB r1 = r0.A01
            if (r1 == 0) goto L_0x003d
            android.view.Surface r0 = r6.getSurface()
            r1.A0D(r0, r8, r9)
            return
        L_0x006f:
            android.os.Handler r2 = r4.A04
            r1 = 20
            X.7Pk r0 = new X.7Pk
            r0.<init>(r4, r3, r1)
            r2.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1420177v.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.A00) {
            case 0:
                AnonymousClass6UI r2 = (AnonymousClass6UI) this.A01;
                DRB drb = r2.A01;
                if (drb != null) {
                    drb.A0B(surfaceHolder.getSurface());
                    r2.A01.setCornerRadius(r2.A00);
                    return;
                }
                return;
            case 1:
                Log.i("qrview/surfaceCreated");
                C109835e5 r22 = (C109835e5) this.A01;
                AnonymousClass7RB.A00(r22.A04, r22, 27);
                return;
            default:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A01;
                videoSurfaceView.A0C = surfaceHolder;
                VideoSurfaceView.A02(videoSurfaceView);
                return;
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.A00) {
            case 0:
                DRB drb = ((AnonymousClass6UI) this.A01).A01;
                if (drb != null) {
                    drb.A0C(surfaceHolder.getSurface());
                    return;
                }
                return;
            case 1:
                Log.i("qrview/surfacedestroyed");
                C109835e5 r2 = (C109835e5) this.A01;
                AnonymousClass7RB.A00(r2.A04, r2, 26);
                return;
            default:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A01;
                videoSurfaceView.A02 = videoSurfaceView.getCurrentPosition();
                videoSurfaceView.A0C = null;
                VideoSurfaceView.A03(videoSurfaceView, true);
                return;
        }
    }
}
