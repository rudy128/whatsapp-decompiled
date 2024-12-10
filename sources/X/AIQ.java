package X;

import com.whatsapp.util.Log;
import java.util.UUID;

public class AIQ implements BA6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public AIQ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A00 = i;
        this.A01 = obj4;
        this.A05 = obj;
        this.A03 = obj5;
        this.A02 = obj3;
        this.A04 = obj2;
    }

    public void Btj(AnonymousClass9LV r7) {
        UUID uuid;
        if (this.A00 != 0) {
            C17900vP.A0X(r7, "ArdJobManager/loadArEngineEffect Failure: ", AnonymousClass000.A10());
            A4B a4b = (A4B) this.A05;
            Object obj = this.A02;
            C92384hD r3 = (C92384hD) this.A03;
            synchronized (a4b) {
                C193309ps r0 = a4b.A00;
                UUID uuid2 = null;
                if (r0 != null) {
                    uuid = r0.A01;
                } else {
                    uuid = null;
                }
                if (C18070vi.A18(uuid, obj)) {
                    C193309ps r02 = (C193309ps) AnonymousClass8BT.A0r(a4b.A02, C83454Fe.A00(r3));
                    if (r02 != null) {
                        uuid2 = r02.A01;
                    }
                    C17960vV.A0F(C18070vi.A18(uuid2, obj), "Job Map is out of sync");
                    A4B.A01(a4b, C83454Fe.A00(r3));
                    ((BCO) this.A01).Btl(new C75513he(r7));
                    return;
                }
                Log.i("ArdJobManager/loadArEngineEffect Job was cancelled, skipping any operation");
                return;
            }
        }
        ((C190399ks) this.A02).A00(r7);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r10 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        ((X.BCO) r9.A01).Btl(new X.C75513he(X.AnonymousClass000.A0n("Null effect loaded")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r1 = r10.A04;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r0 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r0 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        r0 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r1.A00 = r0;
        ((X.C22821Di) r9.A04).invoke(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            if (r0 == 0) goto L_0x007e
            X.9g1 r10 = (X.C187569g1) r10
            java.lang.String r0 = "ArdJobManager/loadArEngineEffect Success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r4 = r9.A05
            X.A4B r4 = (X.A4B) r4
            java.lang.Object r5 = r9.A02
            java.lang.Object r3 = r9.A03
            X.4hD r3 = (X.C92384hD) r3
            monitor-enter(r4)
            X.9ps r0 = r4.A00     // Catch:{ all -> 0x007b }
            r2 = 0
            if (r0 == 0) goto L_0x0044
            java.util.UUID r0 = r0.A01     // Catch:{ all -> 0x007b }
        L_0x001d:
            boolean r0 = X.C18070vi.A18(r0, r5)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0074
            java.util.LinkedHashMap r1 = r4.A02     // Catch:{ all -> 0x007b }
            int r0 = X.C83454Fe.A00(r3)     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = X.AnonymousClass8BT.A0r(r1, r0)     // Catch:{ all -> 0x007b }
            X.9ps r0 = (X.C193309ps) r0     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0033
            java.util.UUID r2 = r0.A01     // Catch:{ all -> 0x007b }
        L_0x0033:
            boolean r1 = X.C18070vi.A18(r2, r5)     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "Job Map is out of sync"
            X.C17960vV.A0F(r1, r0)     // Catch:{ all -> 0x007b }
            int r0 = X.C83454Fe.A00(r3)     // Catch:{ all -> 0x007b }
            X.A4B.A01(r4, r0)     // Catch:{ all -> 0x007b }
            goto L_0x0046
        L_0x0044:
            r0 = r2
            goto L_0x001d
        L_0x0046:
            monitor-exit(r4)
            if (r10 != 0) goto L_0x005c
            java.lang.Object r2 = r9.A01
            X.BCO r2 = (X.BCO) r2
            java.lang.String r0 = "Null effect loaded"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)
            X.3he r0 = new X.3he
            r0.<init>(r1)
            r2.Btl(r0)
            return
        L_0x005c:
            X.9UR r1 = r10.A04
            X.A1g r0 = r3.A02
            if (r0 == 0) goto L_0x0072
            X.9sH r0 = r0.A00
            if (r0 == 0) goto L_0x0072
            boolean r0 = r0.A03
        L_0x0068:
            r1.A00 = r0
            java.lang.Object r0 = r9.A04
            X.1Di r0 = (X.C22821Di) r0
            r0.invoke(r10)
            return
        L_0x0072:
            r0 = 0
            goto L_0x0068
        L_0x0074:
            java.lang.String r0 = "ArdJobManager/loadArEngineEffect Job was cancelled, skipping any operation"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x007b }
            monitor-exit(r4)
            return
        L_0x007b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x007e:
            java.lang.Object r6 = r9.A01
            X.A4c r6 = (X.C20033A4c) r6
            java.lang.Object r7 = r9.A05
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r7 = (com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest) r7
            java.lang.Object r8 = r9.A03
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r3 = r9.A02
            X.9ks r3 = (X.C190399ks) r3
            java.lang.Object r5 = r9.A04
            X.9zQ r5 = (X.C199099zQ) r5
            java.lang.Object r0 = X.C108955ca.A0p(r8)
            X.AEq r0 = (X.C20282AEq) r0
            X.A6K r2 = r0.A01
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = r2.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.SUPPORT
            boolean r1 = X.AnonymousClass000.A1Z(r1, r0)
            java.lang.String r0 = "Cannot get Version from Effect Asset"
            X.C26159CtX.A04(r1, r0)
            int r4 = r2.A01
            java.util.Iterator r2 = r8.iterator()
        L_0x00ad:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r1 = r2.next()
            X.AEq r1 = (X.C20282AEq) r1
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r7.mCapability     // Catch:{ 9LN -> 0x00de }
            boolean r0 = X.C20033A4c.A01(r1, r0, r6)     // Catch:{ 9LN -> 0x00de }
            if (r0 != 0) goto L_0x00ad
            goto L_0x00c9
        L_0x00c2:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r7.mCapability     // Catch:{ 9LN -> 0x00de }
            X.C20033A4c.A00(r5, r0, r6, r4)     // Catch:{ 9LN -> 0x00de }
            r0 = 0
            goto L_0x00da
        L_0x00c9:
            X.9zw r1 = new X.9zw
            r1.<init>()
            X.9Is r0 = X.C179629Is.MODEL_FETCH_FAILURE
            r1.A00 = r0
            java.lang.String r0 = "Models not found in cache even after download"
            r1.A01 = r0
            X.9LV r0 = r1.A01()
        L_0x00da:
            r3.A00(r0)
            return
        L_0x00de:
            r2 = move-exception
            X.9zw r1 = new X.9zw
            r1.<init>()
            X.9Is r0 = X.C179629Is.MODEL_FETCH_FAILURE
            r1.A00 = r0
            r1.A03 = r2
            X.9LV r0 = r1.A01()
            r3.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIQ.onSuccess(java.lang.Object):void");
    }
}
