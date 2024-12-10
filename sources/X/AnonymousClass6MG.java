package X;

import android.view.View;
import com.whatsapp.mediacomposer.VideoTimelineView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.6MG  reason: invalid class name */
public final class AnonymousClass6MG extends A34 {
    public long A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final File A04;
    public final WeakReference A05;
    public final AnonymousClass11P A06;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b7, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r19) {
        /*
            r18 = this;
            r13 = 0
            r0 = r19
            X.C18070vi.A0d(r0, r13)
            java.lang.String r0 = "GetFramesTask/doInBackground"
            X.5dc r11 = new X.5dc
            r11.<init>(r0)
            r12 = r18
            java.io.File r0 = r12.A04     // Catch:{ Exception -> 0x00bb }
            r11.A00(r0)     // Catch:{ Exception -> 0x00bb }
            r0 = 9
            java.lang.String r0 = r11.extractMetadata(r0)     // Catch:{ Exception -> 0x00bb }
            X.C17960vV.A07(r0)     // Catch:{ Exception -> 0x00bb }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x00bb }
            long r16 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00bb }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b4 }
            r12.A00 = r0     // Catch:{ all -> 0x00b4 }
            float r10 = r12.A02     // Catch:{ all -> 0x00b4 }
            float r9 = r12.A01     // Catch:{ all -> 0x00b4 }
            android.graphics.RectF r8 = X.C108965cb.A04(r10, r9)     // Catch:{ all -> 0x00b4 }
            android.graphics.Rect r7 = X.AnonymousClass3MW.A07()     // Catch:{ all -> 0x00b4 }
            android.graphics.Paint r6 = X.AnonymousClass3MZ.A0A()     // Catch:{ all -> 0x00b4 }
            int r5 = r12.A03     // Catch:{ all -> 0x00b4 }
            r4 = 0
            goto L_0x0040
        L_0x003e:
            int r4 = r4 + 1
        L_0x0040:
            if (r4 >= r5) goto L_0x00af
            boolean r0 = X.C108945cZ.A1T(r12)     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00af
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r16
            long r0 = (long) r4     // Catch:{ all -> 0x00b4 }
            long r2 = r2 * r0
            long r0 = (long) r5     // Catch:{ all -> 0x00b4 }
            long r2 = r2 / r0
            android.graphics.Bitmap r2 = r11.getFrameAtTime(r2)     // Catch:{ Exception | NoSuchMethodError -> 0x0069 }
            if (r2 == 0) goto L_0x006a
            int r14 = r2.getWidth()     // Catch:{ all -> 0x00b4 }
            int r3 = r2.getHeight()     // Catch:{ all -> 0x00b4 }
            float r0 = (float) r14     // Catch:{ all -> 0x00b4 }
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
            float r0 = (float) r3     // Catch:{ all -> 0x00b4 }
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
            goto L_0x006c
        L_0x0069:
            r2 = 0
        L_0x006a:
            r1 = r2
            goto L_0x008d
        L_0x006c:
            android.graphics.Bitmap$Config r15 = r2.getConfig()     // Catch:{ all -> 0x00b4 }
            if (r15 == 0) goto L_0x003e
            int r1 = (int) r10     // Catch:{ all -> 0x00b4 }
            int r0 = (int) r9     // Catch:{ all -> 0x00b4 }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r0, r15)     // Catch:{ all -> 0x00b4 }
            if (r14 <= r3) goto L_0x0094
            r7.top = r13     // Catch:{ all -> 0x00b4 }
            r7.bottom = r3     // Catch:{ all -> 0x00b4 }
            int r14 = r14 - r3
            int r0 = r14 / 2
            r7.left = r0     // Catch:{ all -> 0x00b4 }
            int r0 = r0 + r3
            r7.right = r0     // Catch:{ all -> 0x00b4 }
        L_0x0086:
            android.graphics.Canvas r0 = X.C108945cZ.A0I(r1)     // Catch:{ all -> 0x00b4 }
            r0.drawBitmap(r2, r7, r8, r6)     // Catch:{ all -> 0x00b4 }
        L_0x008d:
            boolean r0 = X.C18070vi.A18(r1, r2)     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00a6
            goto L_0x00a1
        L_0x0094:
            r7.left = r13     // Catch:{ all -> 0x00b4 }
            r7.right = r14     // Catch:{ all -> 0x00b4 }
            int r3 = r3 - r14
            int r0 = r3 / 2
            r7.top = r0     // Catch:{ all -> 0x00b4 }
            int r0 = r0 + r14
            r7.bottom = r0     // Catch:{ all -> 0x00b4 }
            goto L_0x0086
        L_0x00a1:
            if (r2 == 0) goto L_0x00a6
            r2.recycle()     // Catch:{ all -> 0x00b4 }
        L_0x00a6:
            r0 = 1
            android.graphics.Bitmap[] r0 = new android.graphics.Bitmap[r0]     // Catch:{ all -> 0x00b4 }
            r0[r13] = r1     // Catch:{ all -> 0x00b4 }
            r12.A0C(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x003e
        L_0x00af:
            r0 = 0
            r11.close()
            return r0
        L_0x00b4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            X.CDX.A00(r11, r1)
            throw r0
        L_0x00bb:
            r0 = 0
            r11.close()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MG.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        VideoTimelineView videoTimelineView = (VideoTimelineView) this.A05.get();
        if (videoTimelineView != null) {
            ArrayList arrayList = videoTimelineView.A0I;
            if (arrayList != null) {
                C29401cD.A0L(arrayList, objArr);
            }
            if (System.currentTimeMillis() > this.A00 + 500) {
                this.A00 = System.currentTimeMillis();
                videoTimelineView.invalidate();
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        View A0O = C108945cZ.A0O(this.A05);
        if (A0O != null) {
            A0O.invalidate();
        }
    }

    public AnonymousClass6MG(AnonymousClass11P r2, VideoTimelineView videoTimelineView, File file, float f, float f2, int i) {
        C18070vi.A0k(r2, file);
        this.A06 = r2;
        this.A04 = file;
        this.A03 = i;
        this.A02 = f;
        this.A01 = f2;
        this.A05 = AnonymousClass3MW.A0z(videoTimelineView);
    }
}
