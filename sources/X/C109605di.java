package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5di  reason: invalid class name and case insensitive filesystem */
public final class C109605di extends Handler {
    public final Context A00;
    public final /* synthetic */ AnonymousClass72m A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109605di(Context context, Looper looper, AnonymousClass72m r3) {
        super(looper);
        this.A01 = r3;
        C17960vV.A07(looper);
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (r0 == null) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r17) {
        /*
            r16 = this;
            r1 = r16
            X.72m r6 = r1.A01
            r7 = r17
            android.os.Bundle r0 = r7.getData()
            java.lang.String r4 = "tag_bundle_key"
            java.lang.String r3 = X.C108955ca.A0s(r0, r4)
            android.content.Context r8 = r1.A00
            java.util.concurrent.ConcurrentHashMap r5 = r6.A0c
            java.lang.Object r0 = r5.get(r3)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0048
        L_0x0022:
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r1)
            r5.put(r3, r0)
            java.lang.Object r2 = r7.obj
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0047
            r2.setTag(r1)
            X.5dg r1 = r6.A0J
            r0 = 0
            android.os.Message r1 = android.os.Message.obtain(r1, r0, r0, r0, r2)
            android.os.Bundle r0 = X.C17880vN.A0D()
            r0.putString(r4, r3)
            r1.setData(r0)
            r1.sendToTarget()
        L_0x0047:
            return
        L_0x0048:
            java.util.concurrent.ConcurrentHashMap r9 = r6.A0d
            java.lang.Object r0 = r9.get(r3)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r10 = r0.get()
            X.73u r10 = (X.C1409773u) r10
            if (r10 == 0) goto L_0x00b7
        L_0x005a:
            java.lang.String r2 = r10.A0E(r8)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168689(0x7f070db1, float:1.7951687E38)
            int r1 = r1.getDimensionPixelSize(r0)
            boolean r0 = r10.A0S()
            if (r0 == 0) goto L_0x0074
            int r0 = r6.A01
            r10.A0K(r0)
        L_0x0074:
            boolean r0 = r10.A0T()
            if (r0 == 0) goto L_0x007f
            float r0 = r6.A00
            r10.A0J(r0)
        L_0x007f:
            boolean r0 = r10 instanceof X.AnonymousClass69N
            if (r0 == 0) goto L_0x00ad
            r0 = r10
            X.69N r0 = (X.AnonymousClass69N) r0
            android.graphics.drawable.Drawable r0 = r0.A00
        L_0x0088:
            if (r0 != 0) goto L_0x00a6
        L_0x008a:
            android.graphics.RectF r11 = X.AnonymousClass3MW.A08()
            float r14 = (float) r1
            r12 = 0
            r13 = r12
            r15 = r14
            r10.A0O(r11, r12, r13, r14, r15)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r1, r0)
            android.graphics.Canvas r0 = X.C108945cZ.A0I(r1)
            r10.A0M(r0)
            android.graphics.drawable.BitmapDrawable r0 = X.C108975cc.A08(r8, r1)
        L_0x00a6:
            X.6eP r1 = new X.6eP
            r1.<init>(r0, r2)
            goto L_0x0022
        L_0x00ad:
            boolean r0 = r10 instanceof X.AnonymousClass69M
            if (r0 == 0) goto L_0x008a
            r0 = r10
            X.69M r0 = (X.AnonymousClass69M) r0
            android.graphics.drawable.Drawable r0 = r0.A00
            goto L_0x0088
        L_0x00b7:
            java.util.concurrent.ConcurrentHashMap r0 = r6.A0e
            java.lang.Object r2 = r0.get(r3)
            X.8B0 r2 = (X.AnonymousClass8B0) r2
            if (r2 == 0) goto L_0x0047
            X.0vb r1 = r6.A0B
            r0 = 1
            X.73u r10 = r2.BHq(r8, r1, r0)
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r10)
            r9.put(r3, r0)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109605di.handleMessage(android.os.Message):void");
    }
}
