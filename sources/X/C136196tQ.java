package X;

import com.whatsapp.ml.graphql.MLModelMetadataGraphqlFetcher;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6tQ  reason: invalid class name and case insensitive filesystem */
public final class C136196tQ {
    public final AnonymousClass1DT A00 = C108945cZ.A0S();
    public final C139056y8 A01;
    public final C128556gJ A02;
    public final AnonymousClass10I A03;
    public final Set A04 = C17880vN.A14();
    public final MLModelMetadataGraphqlFetcher A05;

    public C136196tQ(C139056y8 r2, C128556gJ r3, MLModelMetadataGraphqlFetcher mLModelMetadataGraphqlFetcher, AnonymousClass10I r5) {
        C18070vi.A0d(r5, 1);
        this.A03 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = mLModelMetadataGraphqlFetcher;
    }

    public final void A01(String str, C22821Di r12, C22821Di r13, int i, boolean z) {
        String str2 = str;
        C18070vi.A0d(str, 0);
        AnonymousClass1DT r3 = this.A00;
        r3.A0E(C145077Ju.A00);
        int i2 = i;
        String A1I = AnonymousClass001.A1I("##", AnonymousClass000.A11(str), i);
        String A002 = A00(str, i);
        C22821Di r7 = r12;
        if (A002 != null && C108975cc.A1M(A002)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MLModelManager/fetchModel/found ml model file in cache for ");
            C108995ce.A1L(str, A10, i);
            if (r12 != null) {
                r12.invoke(A002);
            }
            r3.A0E(new C145067Jt(str, i, A002));
            this.A04.remove(A1I);
        } else if (!z || !this.A04.contains(A1I)) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("MLModelManager/fetchModel/start to fetch ml model file for ");
            C108995ce.A1L(str, A102, i);
            this.A04.add(A1I);
            this.A05.A01(str, "NONE", new AnonymousClass83H(this, str2, A1I, r7, r13, i2), i);
        } else {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("MLModelManager/fetchModel/Already fetching ");
            C108995ce.A1L(str, A103, i);
        }
    }

    public final void A02(List list) {
        C18070vi.A0d(list, 0);
        C139056y8 r6 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C139906zd r4 = (C139906zd) it.next();
            Map map = r6.A03;
            String str = r4.A01;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = C17880vN.A13();
            }
            C17880vN.A1O(r4, map2, r4.A00);
            map.put(str, map2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(java.lang.String r7, int r8) {
        /*
            r6 = this;
            X.6y8 r5 = r6.A01     // Catch:{ 6SB -> 0x00b3 }
            java.io.File r4 = r5.A01(r7, r8)     // Catch:{ 6SB -> 0x00b3 }
            boolean r0 = r4.exists()     // Catch:{ 6SB -> 0x00b3 }
            r2 = 0
            java.lang.String r3 = " #"
            if (r0 != 0) goto L_0x001c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 6SB -> 0x00b3 }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/model file not found for "
            X.C108985cd.A1K(r0, r7, r1, r8)     // Catch:{ 6SB -> 0x00b3 }
            X.C17890vO.A1B(r1, r3)     // Catch:{ 6SB -> 0x00b3 }
            return r2
        L_0x001c:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 6SB -> 0x00b3 }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/model file path found for "
            X.C108985cd.A1K(r0, r7, r2, r8)     // Catch:{ 6SB -> 0x00b3 }
            java.lang.String r0 = ", file size is "
            r2.append(r0)     // Catch:{ 6SB -> 0x00b3 }
            long r0 = r4.length()     // Catch:{ 6SB -> 0x00b3 }
            X.C17890vO.A16(r2, r0)     // Catch:{ 6SB -> 0x00b3 }
            java.util.Map r0 = r5.A03     // Catch:{ 6SB -> 0x00b3 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ 6SB -> 0x00b3 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ 6SB -> 0x00b3 }
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = X.AnonymousClass000.A0w(r0, r8)     // Catch:{ 6SB -> 0x00b3 }
            X.6zd r0 = (X.C139906zd) r0     // Catch:{ 6SB -> 0x00b3 }
            if (r0 == 0) goto L_0x0080
            java.io.FileInputStream r2 = X.C108945cZ.A18(r4)     // Catch:{ IOException -> 0x00a0, NoSuchAlgorithmException -> 0x006d }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x0057 }
            boolean r0 = X.C139056y8.A00(r2, r0)     // Catch:{ all -> 0x0057 }
            r2.close()     // Catch:{ IOException -> 0x00a0, NoSuchAlgorithmException -> 0x006d }
            if (r0 == 0) goto L_0x005e
            java.lang.String r2 = r4.getCanonicalPath()     // Catch:{ IOException -> 0x00a0, NoSuchAlgorithmException -> 0x006d }
            return r2
        L_0x0057:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            X.CDX.A00(r2, r0)     // Catch:{ IOException -> 0x00a0, NoSuchAlgorithmException -> 0x006d }
            goto L_0x006c
        L_0x005e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x00a0, NoSuchAlgorithmException -> 0x006d }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/hash verification failed for "
            X.C108985cd.A1K(r0, r7, r1, r8)     // Catch:{ IOException -> 0x00a0, NoSuchAlgorithmException -> 0x006d }
            X.C17890vO.A19(r1, r3)     // Catch:{ IOException -> 0x00a0, NoSuchAlgorithmException -> 0x006d }
            X.6AZ r1 = X.AnonymousClass6AZ.A00     // Catch:{ IOException -> 0x00a0, NoSuchAlgorithmException -> 0x006d }
        L_0x006c:
            throw r1     // Catch:{ IOException -> 0x00a0, NoSuchAlgorithmException -> 0x006d }
        L_0x006d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 6SB -> 0x00b3 }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/NoSuchAlgorithmException on "
            X.C108985cd.A1K(r0, r7, r1, r8)     // Catch:{ 6SB -> 0x00b3 }
            X.C108985cd.A1M(r3, r1, r2)     // Catch:{ 6SB -> 0x00b3 }
            X.6AW r0 = new X.6AW     // Catch:{ 6SB -> 0x00b3 }
            r0.<init>(r2)     // Catch:{ 6SB -> 0x00b3 }
            goto L_0x00b2
        L_0x0080:
            X.0ve r2 = r5.A02     // Catch:{ 6SB -> 0x00b3 }
            r1 = 11454(0x2cbe, float:1.605E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ 6SB -> 0x00b3 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ 6SB -> 0x00b3 }
            if (r0 == 0) goto L_0x0091
            java.lang.String r2 = r4.getCanonicalPath()     // Catch:{ 6SB -> 0x00b3 }
            return r2
        L_0x0091:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 6SB -> 0x00b3 }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/model hash not found for "
            X.C108985cd.A1K(r0, r7, r1, r8)     // Catch:{ 6SB -> 0x00b3 }
            X.C17890vO.A19(r1, r3)     // Catch:{ 6SB -> 0x00b3 }
            X.6AY r0 = X.AnonymousClass6AY.A00     // Catch:{ 6SB -> 0x00b3 }
            goto L_0x00b2
        L_0x00a0:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 6SB -> 0x00b3 }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/IOException on "
            X.C108985cd.A1K(r0, r7, r1, r8)     // Catch:{ 6SB -> 0x00b3 }
            X.C108985cd.A1M(r3, r1, r2)     // Catch:{ 6SB -> 0x00b3 }
            X.6AX r0 = new X.6AX     // Catch:{ 6SB -> 0x00b3 }
            r0.<init>(r2)     // Catch:{ 6SB -> 0x00b3 }
        L_0x00b2:
            throw r0     // Catch:{ 6SB -> 0x00b3 }
        L_0x00b3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MLModelManager/getModelFilePath/Failed to get model path from cacheManager: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " with "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " #"
            X.C108985cd.A1M(r0, r1, r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136196tQ.A00(java.lang.String, int):java.lang.String");
    }
}
