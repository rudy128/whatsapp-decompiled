package X;

import java.lang.ref.WeakReference;

/* renamed from: X.4re  reason: invalid class name and case insensitive filesystem */
public class C98744re implements Runnable {
    public final int A00 = 0;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    public C98744re(C94934lQ r2, AnonymousClass206 r3, C441822l r4, int i, int i2, boolean z) {
        this.A03 = r3;
        this.A01 = i;
        this.A04 = r2;
        this.A05 = r4;
        this.A06 = z;
        this.A02 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008c, code lost:
        if (r2 == 10) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ad, code lost:
        if (r7 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0109, code lost:
        if (r11 != null) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A00
            if (r0 == 0) goto L_0x0040
            boolean r1 = r12.A06
            java.lang.Object r3 = r12.A03
            X.C0L r3 = (X.C0L) r3
            java.lang.Object r2 = r12.A04
            X.4R2 r2 = (X.AnonymousClass4R2) r2
            int r7 = r12.A01
            int r6 = r12.A02
            java.lang.Object r5 = r12.A05
            java.lang.ref.Reference r5 = (java.lang.ref.Reference) r5
            r0 = 5
            X.C18070vi.A0d(r5, r0)
            if (r1 == 0) goto L_0x00e6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r3.id
            r1.append(r0)
            java.lang.String r0 = "_night"
            java.lang.String r10 = X.AnonymousClass000.A0y(r0, r1)
            X.C0L[] r9 = X.C0L.values()
            int r8 = r9.length
            r1 = 0
        L_0x0031:
            if (r1 >= r8) goto L_0x00da
            r4 = r9[r1]
            java.lang.String r0 = r4.id
            boolean r0 = X.C18070vi.A18(r0, r10)
            if (r0 != 0) goto L_0x00db
            int r1 = r1 + 1
            goto L_0x0031
        L_0x0040:
            java.lang.Object r5 = r12.A03
            X.206 r5 = (X.AnonymousClass206) r5
            int r8 = r12.A01
            java.lang.Object r4 = r12.A04
            X.4lQ r4 = (X.C94934lQ) r4
            java.lang.Object r2 = r12.A05
            X.206 r2 = (X.AnonymousClass206) r2
            boolean r1 = r12.A06
            int r10 = r12.A02
            java.lang.ref.WeakReference r0 = r4.A0D
            java.lang.Object r7 = r0.get()
            android.app.Activity r7 = (android.app.Activity) r7
            if (r5 == 0) goto L_0x00ad
            if (r7 == 0) goto L_0x00af
            X.0ve r0 = r4.A09
            boolean r0 = X.C83934Hf.A00(r0, r2, r5, r1)
            if (r0 == 0) goto L_0x00d5
            r0 = 100
            if (r8 >= r0) goto L_0x00d5
            X.22l r5 = (X.C441822l) r5
            X.6qC r3 = r4.A06
            X.4lP r6 = new X.4lP
            r6.<init>(r4, r5, r8)
            r2 = 0
            r1 = 1
            r0 = 2
            X.C18070vi.A0d(r5, r0)
            X.7Mo r3 = r3.A01(r7, r2, r1)
            r3.A0K = r5
            r3.A08 = r1
            int r2 = r5.A0D()
            r0 = 9
            if (r2 == r0) goto L_0x008e
            r1 = 10
            r0 = 0
            if (r2 != r1) goto L_0x008f
        L_0x008e:
            r0 = 1
        L_0x008f:
            r3.A0Q = r0
            r3.A0G = r6
            android.content.Context r6 = r7.getBaseContext()
            X.1KB r8 = r4.A01
            X.10I r7 = r4.A0B
            r0 = 25
            X.Ak2 r9 = new X.Ak2
            r9.<init>(r4, r3, r5, r0)
            r11 = 18
            X.7Q7 r5 = new X.7Q7
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r7.CGF(r5)
            return
        L_0x00ad:
            if (r7 != 0) goto L_0x00d5
        L_0x00af:
            android.view.View r0 = r4.A00
            android.content.Context r1 = r0.getContext()
        L_0x00b5:
            if (r8 <= 0) goto L_0x00ee
            X.10I r0 = r4.A0B
            X.C83924He.A00(r1, r0, r10)
            X.0ve r2 = r4.A09
            r1 = 6129(0x17f1, float:8.589E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00ee
            X.Cub r0 = X.C26204Cub.A0W
            if (r0 == 0) goto L_0x00ee
            r0.A04()
            java.lang.String r0 = "OutOfChatMessageAudioCompletionListener/continueVoiceMemoSequence/clearAllPlayers"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00d5:
            android.content.Context r1 = r7.getBaseContext()
            goto L_0x00b5
        L_0x00da:
            r4 = 0
        L_0x00db:
            int r1 = X.AnonymousClass013.A00
            r0 = 2
            if (r1 == r0) goto L_0x0101
            r0 = -1
            if (r1 == r0) goto L_0x00ef
            r0 = 3
            if (r1 == r0) goto L_0x00ef
        L_0x00e6:
            X.A1I r0 = r2.A02
        L_0x00e8:
            java.io.File r11 = r0.A01(r3)
            if (r11 != 0) goto L_0x010b
        L_0x00ee:
            return
        L_0x00ef:
            X.118 r0 = r2.A01
            android.content.res.Resources r0 = X.AnonymousClass3MW.A05(r0)
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r1 = r0 & 48
            r0 = 32
            if (r1 != r0) goto L_0x00e6
        L_0x0101:
            if (r4 == 0) goto L_0x00e6
            X.A1I r0 = r2.A02
            java.io.File r11 = r0.A01(r4)
            if (r11 == 0) goto L_0x00e8
        L_0x010b:
            X.190 r8 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0171 }
            java.lang.String r4 = r11.getAbsolutePath()     // Catch:{ IllegalArgumentException -> 0x0171 }
            X.C18070vi.A0X(r4)     // Catch:{ IllegalArgumentException -> 0x0171 }
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options     // Catch:{ IllegalArgumentException -> 0x0171 }
            r10.<init>()     // Catch:{ IllegalArgumentException -> 0x0171 }
            r0 = 1
            r10.inJustDecodeBounds = r0     // Catch:{ IllegalArgumentException -> 0x0171 }
            android.graphics.BitmapFactory.decodeFile(r4, r10)     // Catch:{ IllegalArgumentException -> 0x0171 }
            int r1 = r10.outHeight     // Catch:{ IllegalArgumentException -> 0x0171 }
            int r0 = r10.outWidth     // Catch:{ IllegalArgumentException -> 0x0171 }
            r9 = 1
            if (r1 > r6) goto L_0x0128
            if (r0 <= r7) goto L_0x0137
        L_0x0128:
            int r3 = r1 / 2
            int r1 = r0 / 2
        L_0x012c:
            int r0 = r3 / r9
            if (r0 < r6) goto L_0x0137
            int r0 = r1 / r9
            if (r0 < r7) goto L_0x0137
            int r9 = r9 * 2
            goto L_0x012c
        L_0x0137:
            r10.inSampleSize = r9     // Catch:{ IllegalArgumentException -> 0x0171 }
            r3 = 0
            r10.inJustDecodeBounds = r3     // Catch:{ IllegalArgumentException -> 0x0171 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r4, r10)     // Catch:{ IllegalArgumentException -> 0x0171 }
            if (r0 != 0) goto L_0x015b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x0171 }
            java.lang.String r0 = "unable to decode"
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r4, r1)     // Catch:{ IllegalArgumentException -> 0x0171 }
            java.lang.String r0 = "NetworkResourceLoader/"
            r8.A0G(r0, r1, r3)     // Catch:{ IllegalArgumentException -> 0x0171 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x0171 }
            java.lang.String r0 = "NetworkResourceLoader/unable-to-decode/"
            X.C17900vP.A0e(r0, r4, r1)     // Catch:{ IllegalArgumentException -> 0x0171 }
            goto L_0x0170
        L_0x015b:
            android.graphics.Bitmap r1 = X.C84054Hr.A00(r0, r7, r6)     // Catch:{ IllegalArgumentException -> 0x0171 }
            java.lang.Object r0 = r5.get()
            com.whatsapp.WaNetworkResourceImageView r0 = (com.whatsapp.WaNetworkResourceImageView) r0
            r11.getAbsolutePath()
            if (r0 == 0) goto L_0x00ee
            r0.A00 = r1
            r0.postInvalidate()
            return
        L_0x0170:
            return
        L_0x0171:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NetworkResourceLoader/decodeFile/failed to generate bitmap/"
            r1.append(r0)
            java.lang.String r0 = r11.getAbsolutePath()
            X.C17890vO.A19(r1, r0)
            X.190 r2 = r2.A00
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "NetworkResourceLoader/"
            r2.A0E(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98744re.run():void");
    }

    public C98744re(C0L c0l, AnonymousClass4R2 r3, WeakReference weakReference, int i, int i2, boolean z) {
        this.A06 = z;
        this.A03 = c0l;
        this.A04 = r3;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = weakReference;
    }
}
