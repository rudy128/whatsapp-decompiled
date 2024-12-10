package X;

import android.graphics.Bitmap;

/* renamed from: X.6M2  reason: invalid class name */
public final class AnonymousClass6M2 extends A34 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ Bitmap A03;
    public final /* synthetic */ AnonymousClass740 A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ Runnable A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6M2(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, AnonymousClass1FL r5, AnonymousClass740 r6, Runnable runnable, Runnable runnable2, int i) {
        super(r5, true);
        this.A03 = bitmap;
        this.A01 = bitmap2;
        this.A04 = r6;
        this.A00 = i;
        this.A02 = bitmap3;
        this.A06 = runnable;
        this.A05 = runnable2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.1D6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.1D6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.1D6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.1D6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.1D6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.1D6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r9) {
        /*
            r8 = this;
            android.graphics.Bitmap r7 = r8.A03
            android.graphics.Bitmap r6 = r8.A01
            if (r7 == 0) goto L_0x004e
            boolean r0 = r7.equals(r6)
            if (r0 != 0) goto L_0x004e
            int r1 = r7.getHeight()
            int r0 = r6.getHeight()
            if (r1 != r0) goto L_0x004e
            int r1 = r7.getWidth()
            int r0 = r6.getWidth()
            if (r1 != r0) goto L_0x004e
            int r4 = r8.A00
            X.740 r5 = r8.A04
            X.2E5 r3 = r5.A0V
            boolean r0 = com.whatsapp.filter.FilterUtils.A03(r6, r7, r3, r4)
            r2 = 0
            if (r0 == 0) goto L_0x003e
            android.graphics.Bitmap r0 = r5.A02
            if (r0 == 0) goto L_0x003a
            android.graphics.Bitmap r1 = r8.A02
            boolean r0 = com.whatsapp.filter.FilterUtils.A03(r0, r1, r3, r4)
            if (r0 == 0) goto L_0x003a
            r2 = r1
        L_0x003a:
            X.1D6 r2 = X.AnonymousClass1D6.A01(r7, r2)
        L_0x003e:
            r1 = 0
            if (r2 == 0) goto L_0x004d
            java.lang.Object r0 = r2.first
            if (r0 == 0) goto L_0x004d
            android.graphics.Bitmap r0 = r5.A02
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r2.second
            if (r0 != 0) goto L_0x0068
        L_0x004d:
            return r1
        L_0x004e:
            int r4 = r8.A00
            X.740 r5 = r8.A04
            X.2E5 r3 = r5.A0V
            r2 = 1
            android.graphics.Bitmap r1 = com.whatsapp.filter.FilterUtils.A00(r6, r3, r4, r2)
            android.graphics.Bitmap r0 = r5.A02
            if (r0 == 0) goto L_0x0066
            android.graphics.Bitmap r0 = com.whatsapp.filter.FilterUtils.A00(r0, r3, r4, r2)
        L_0x0061:
            X.1D6 r2 = X.AnonymousClass1D6.A01(r1, r0)
            goto L_0x003e
        L_0x0066:
            r0 = 0
            goto L_0x0061
        L_0x0068:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6M2.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Object obj2;
        AnonymousClass1D6 r3 = (AnonymousClass1D6) obj;
        if (r3 == null || (obj2 = r3.first) == null) {
            Bitmap bitmap = this.A03;
            if (bitmap != null) {
                AnonymousClass740 r1 = this.A04;
                r1.A05 = bitmap;
                r1.A04 = this.A02;
                r1.A0W.A00();
                AnonymousClass740.A00(r1.A0T, r1);
            }
            this.A05.run();
            return;
        }
        AnonymousClass740 r12 = this.A04;
        r12.A05 = (Bitmap) obj2;
        r12.A04 = (Bitmap) r3.second;
        Runnable runnable = this.A06;
        if (runnable != null) {
            runnable.run();
        }
        r12.A01 = this.A00;
        r12.A0W.A00();
        AnonymousClass740.A00(r12.A0T, r12);
    }
}
