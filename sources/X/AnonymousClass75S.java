package X;

import android.media.MediaPlayer;

/* renamed from: X.75S  reason: invalid class name */
public class AnonymousClass75S implements MediaPlayer.OnErrorListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass75S(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0071, code lost:
        X.AnonymousClass000.A1E(r0, r2, r1, r7);
        r3 = X.C17880vN.A0t(r1, r8);
        r0 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007c, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007e, code lost:
        r0.BtC((java.lang.String) null, r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r2.onError(r0, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onError(android.media.MediaPlayer r6, int r7, int r8) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x003a;
                case 2: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A01
            X.6Mi r1 = (X.C121986Mi) r1
            r0 = -1
            r1.A00 = r0
            r1.A03 = r0
            android.media.MediaPlayer$OnErrorListener r2 = r1.A07
            if (r2 == 0) goto L_0x0017
            android.media.MediaPlayer r0 = r1.A09
        L_0x0014:
            r2.onError(r0, r7, r8)
        L_0x0017:
            r0 = 1
            return r0
        L_0x0019:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VideoView/ Error: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ","
            X.C17900vP.A0k(r0, r1, r8)
            java.lang.Object r1 = r5.A01
            com.whatsapp.videoplayback.VideoSurfaceView r1 = (com.whatsapp.videoplayback.VideoSurfaceView) r1
            r0 = -1
            r1.A01 = r0
            r1.A05 = r0
            android.media.MediaPlayer$OnErrorListener r2 = r1.A09
            if (r2 == 0) goto L_0x0017
            android.media.MediaPlayer r0 = r1.A0B
            goto L_0x0014
        L_0x003a:
            java.lang.Object r4 = r5.A01
            X.70X r4 = (X.AnonymousClass70X) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VideoPlayerOnTextureView/error "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r2 = " "
            X.C17900vP.A0i(r2, r1, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VideoPlayerOnTextureView "
            goto L_0x0071
        L_0x0056:
            java.lang.Object r4 = r5.A01
            X.70X r4 = (X.AnonymousClass70X) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VideoPlayerOnSurfaceView/error "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r2 = " "
            X.C17900vP.A0i(r2, r1, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VideoPlayerOnSurfaceView "
        L_0x0071:
            X.AnonymousClass000.A1E(r0, r2, r1, r7)
            java.lang.String r3 = X.C17880vN.A0t(r1, r8)
            r2 = 0
            r1 = 1
            X.88Q r0 = r4.A09
            if (r0 == 0) goto L_0x0081
            r0.BtC(r2, r3, r1)
        L_0x0081:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75S.onError(android.media.MediaPlayer, int, int):boolean");
    }
}
