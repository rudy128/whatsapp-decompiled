package X;

import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import java.io.File;

/* renamed from: X.AIa  reason: case insensitive filesystem */
public abstract class C20369AIa implements C22551BCi {
    public final AnonymousClass1IX A00;
    public final C188989iK A01;
    public final Object A02 = C17880vN.A0p();
    public final C18140vp A03;
    public final C22551BCi A04;
    public volatile BCL A05;

    public final boolean A00(A6K a6k, VersionedCapability versionedCapability) {
        C188989iK r2;
        StringBuilder A10;
        String str;
        if (this.A05 != null) {
            String str2 = a6k.A09;
            if (TextUtils.isEmpty(str2)) {
                r2 = this.A01;
                A10 = AnonymousClass000.A10();
                str = "Model cache key is empty when saving for ";
            } else {
                String str3 = a6k.A0C;
                AnonymousClass9JJ r1 = a6k.A06;
                if (!(r1 == null || r1 == AnonymousClass9JJ.A0g)) {
                    str3 = r1.toString();
                }
                if (TextUtils.isEmpty(str3)) {
                    r2 = this.A01;
                    A10 = AnonymousClass000.A10();
                    str = "Model type is empty when saving for ";
                } else {
                    try {
                        BCL bcl = this.A05;
                        C26159CtX.A04(AnonymousClass000.A1Z(a6k.A02, ARAssetType.SUPPORT), "Cannot get Version from Effect Asset");
                        return bcl.addModelForVersionIfInCache(a6k.A01, str2, str3, versionedCapability);
                    } catch (EffectsFrameworkException e) {
                        C26294Cx6.A0C("ModelCacheAssetStorage", "Failed to save model to cache", e);
                        return false;
                    }
                }
            }
            A10.append(str);
            r2.A00("ModelCacheAssetStorage", AnonymousClass000.A0y(a6k.A0B, A10), (Throwable) null, true);
        }
        return false;
    }

    public final File BNx(A6K a6k, StorageCallback storageCallback) {
        return this.A04.BNx(a6k, storageCallback);
    }

    public final boolean BeA(A6K a6k) {
        return this.A04.BeA(a6k);
    }

    public void CEX(A6K a6k) {
        this.A04.CEX(a6k);
    }

    public final File CGf(A6K a6k, StorageCallback storageCallback, File file) {
        return this.A04.CGf(a6k, storageCallback, file);
    }

    public void CRS(A6K a6k) {
        this.A04.CRS(a6k);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0067=Splitter:B:26:0x0067, B:17:0x0049=Splitter:B:17:0x0049} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20369AIa(X.C22551BCi r9, X.AnonymousClass1IX r10, X.C188989iK r11, X.C18140vp r12) {
        /*
            r8 = this;
            r8.<init>()
            java.lang.Object r0 = X.C17880vN.A0p()
            r8.A02 = r0
            r8.A04 = r9
            r8.A03 = r12
            r8.A01 = r11
            r8.A00 = r10
            X.BCL r0 = r8.A05
            if (r0 != 0) goto L_0x00c9
            java.lang.Object r5 = r8.A02
            monitor-enter(r5)
            X.BCL r0 = r8.A05     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x00c4
            X.0vp r0 = r8.A03     // Catch:{ all -> 0x00c6 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x00c6 }
            X.B4X r6 = (X.B4X) r6     // Catch:{ all -> 0x00c6 }
            if (r6 == 0) goto L_0x00c4
            boolean r0 = r8 instanceof X.C162458Ku     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x0050
            X.9Oa r0 = com.facebook.cameracore.ardelivery.modelcache.singlemodelcache.SingleModelCache.Companion     // Catch:{ all -> 0x00c6 }
            X.1IX r0 = r8.A00     // Catch:{ all -> 0x00c6 }
            java.lang.Object r7 = X.C108955ca.A0p(r0)     // Catch:{ all -> 0x00c6 }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r7 = (com.facebook.cameracore.ardelivery.model.VersionedCapability) r7     // Catch:{ all -> 0x00c6 }
            r4 = r6
            X.AIe r4 = (X.C20373AIe) r4     // Catch:{ all -> 0x00c6 }
            monitor-enter(r6)     // Catch:{ all -> 0x00c6 }
            com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache r3 = r4.A00     // Catch:{ all -> 0x00b7 }
            if (r3 != 0) goto L_0x0049
            X.9Oc r0 = com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache.Companion     // Catch:{ all -> 0x00b7 }
            long r1 = r4.A01     // Catch:{ all -> 0x00b7 }
            com.facebook.stash.core.FileStash r0 = r4.A02     // Catch:{ all -> 0x00b7 }
            com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache r3 = new com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache     // Catch:{ all -> 0x00b7 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x00b7 }
            r4.A00 = r3     // Catch:{ all -> 0x00b7 }
        L_0x0049:
            monitor-exit(r6)     // Catch:{ all -> 0x00c6 }
            com.facebook.cameracore.ardelivery.modelcache.singlemodelcache.SingleModelCache r0 = new com.facebook.cameracore.ardelivery.modelcache.singlemodelcache.SingleModelCache     // Catch:{ all -> 0x00c6 }
            r0.<init>(r7, r3)     // Catch:{ all -> 0x00c6 }
            goto L_0x006f
        L_0x0050:
            X.9Ob r0 = com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache.VersionedModelCache.Companion     // Catch:{ all -> 0x00c6 }
            r4 = r6
            X.AIe r4 = (X.C20373AIe) r4     // Catch:{ all -> 0x00c6 }
            monitor-enter(r6)     // Catch:{ all -> 0x00c6 }
            com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache r3 = r4.A00     // Catch:{ all -> 0x00b7 }
            if (r3 != 0) goto L_0x0067
            X.9Oc r0 = com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache.Companion     // Catch:{ all -> 0x00b7 }
            long r1 = r4.A01     // Catch:{ all -> 0x00b7 }
            com.facebook.stash.core.FileStash r0 = r4.A02     // Catch:{ all -> 0x00b7 }
            com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache r3 = new com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache     // Catch:{ all -> 0x00b7 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x00b7 }
            r4.A00 = r3     // Catch:{ all -> 0x00b7 }
        L_0x0067:
            monitor-exit(r6)     // Catch:{ all -> 0x00c6 }
            X.1IX r1 = r8.A00     // Catch:{ all -> 0x00c6 }
            com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache.VersionedModelCache r0 = new com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache.VersionedModelCache     // Catch:{ all -> 0x00c6 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x00c6 }
        L_0x006f:
            r8.A05 = r0     // Catch:{ all -> 0x00c6 }
            boolean r0 = r8 instanceof X.C162448Kt     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            if (r0 == 0) goto L_0x00a2
            X.BCL r0 = r8.A05     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            java.lang.String r3 = "MultiModelCacheAssetStorage"
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "model cache is not initialized before trimming"
            X.C26294Cx6.A08(r3, r0)     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            goto L_0x00c4
        L_0x0081:
            X.1IX r0 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            X.1IZ r2 = r0.iterator()     // Catch:{ EffectsFrameworkException -> 0x00b5 }
        L_0x0087:
            boolean r0 = r2.hasNext()     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r1 = r2.next()     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r1 = (com.facebook.cameracore.ardelivery.model.VersionedCapability) r1     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            X.BCL r0 = r8.A05     // Catch:{ EffectsFrameworkException -> 0x009b }
            com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache.VersionedModelCache r0 = (com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache.VersionedModelCache) r0     // Catch:{ EffectsFrameworkException -> 0x009b }
            r0.trimExceptLatestSavedVersion((com.facebook.cameracore.ardelivery.model.VersionedCapability) r1)     // Catch:{ EffectsFrameworkException -> 0x009b }
            goto L_0x0087
        L_0x009b:
            r1 = move-exception
            java.lang.String r0 = "Failed call to trimExceptVersion"
            X.C26294Cx6.A0C(r3, r0, r1)     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            goto L_0x0087
        L_0x00a2:
            X.BCL r0 = r8.A05     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            if (r0 != 0) goto L_0x00ae
            java.lang.String r1 = "ModelCacheAssetStorage"
            java.lang.String r0 = "model cache is not initialized before trimming"
            X.C26294Cx6.A08(r1, r0)     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            goto L_0x00c4
        L_0x00ae:
            X.BCL r1 = r8.A05     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            r0 = 0
            r1.trimExceptLatestSavedVersion(r0)     // Catch:{ EffectsFrameworkException -> 0x00b5 }
            goto L_0x00c4
        L_0x00b5:
            r4 = move-exception
            goto L_0x00ba
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00c6 }
            throw r0     // Catch:{ all -> 0x00c6 }
        L_0x00ba:
            X.9iK r3 = r8.A01     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "ModelCacheAssetStorage"
            java.lang.String r1 = "Failed to trim the cache"
            r0 = 0
            r3.A00(r2, r1, r4, r0)     // Catch:{ all -> 0x00c6 }
        L_0x00c4:
            monitor-exit(r5)     // Catch:{ all -> 0x00c6 }
            goto L_0x00c9
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00c6 }
            throw r0
        L_0x00c9:
            X.BCL r0 = r8.A05
            if (r0 != 0) goto L_0x00d4
            java.lang.String r1 = "ModelCacheAssetStorage"
            java.lang.String r0 = "Model cache could not be initialized"
            X.C26294Cx6.A08(r1, r0)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20369AIa.<init>(X.BCi, X.1IX, X.9iK, X.0vp):void");
    }
}
