package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.debug.tracer.Tracer;
import com.facebook.systrace.Systrace;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.WeakHashMap;

/* renamed from: X.Cqn  reason: case insensitive filesystem */
public class C26029Cqn {
    public int A00;
    public C28652ECm A01;
    public C24786CKf A02;
    public C22924BVm A03;
    public boolean A04 = false;
    public CSU A05;
    public DGF A06;
    public DGG A07;
    public C26698D9w A08;
    public final Handler A09;
    public final C24793CKm A0A;
    public final C27066DRp A0B;
    public final Map A0C;
    public final Map A0D;
    public final Context A0E;
    public final C26185Cu9 A0F;

    public synchronized C28653ECn A02() {
        C28653ECn eCn;
        C27066DRp dRp = this.A0B;
        if (dRp.enableVideoHybridCache) {
            if (this.A06 == null) {
                A00();
            }
            eCn = this.A06;
        } else if (dRp.enableVideoMemoryCache) {
            if (this.A07 == null) {
                A00();
            }
            eCn = this.A07;
        } else {
            if (this.A03 == null) {
                A00();
            }
            eCn = this.A03;
        }
        return eCn;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [X.D9y, java.lang.Object] */
    private void A00() {
        Tracer.A00("CacheManager.initCache");
        try {
            if (this.A05 == null) {
                A01();
            }
            C27066DRp dRp = this.A0B;
            if (dRp.enableVideoMemoryCache) {
                this.A07 = new DGG(dRp.videoMemoryCacheSizeKb);
            } else {
                A03();
                File A17 = C108945cZ.A17(C17900vP.A0A(this.A05.A01, "/ExoPlayerCacheDir/videocache"));
                C28652ECm eCm = this.A01;
                Handler handler = this.A09;
                C27059DRe dRe = dRp.cache;
                boolean z = dRe.skipCacheBeforeInited;
                boolean z2 = dRe.skipEscapeCacheKey;
                boolean z3 = dRe.skipRegex;
                boolean z4 = dRe.cacheFileSizeCall;
                boolean z5 = dRe.fixReadWriteBlock;
                boolean z6 = dRe.enableShardCachedFiles;
                int i = dRe.numSubDirectory;
                long j = dRe.skipDeadSpanLockThresholdMs;
                boolean z7 = dRe.useSimpleCacheLoadV2;
                Handler handler2 = handler;
                C28652ECm eCm2 = eCm;
                this.A03 = new C26697D9v(handler2, eCm2, A17, i, j, dRe.minCacheFileSizeInBytes, z, dRe.bypassUpgrade, z2, z3, z4, z5, z6, z7);
                C27059DRe dRe2 = dRp.cache;
                if (dRe2.enableCacheInstrumentation || dRe2.enableOnlyCacheEvictionInstrumentation || dRe2.enableUtilisationInstrumentation) {
                    Tracer.A00("CacheManager.initializeCacheInstrumentation");
                    C26700D9y d9y = C26700D9y.A04;
                    C26700D9y d9y2 = d9y;
                    if (d9y == null) {
                        ? obj = new Object();
                        C26700D9y.A04 = obj;
                        d9y2 = obj;
                    }
                    C22924BVm bVm = this.A03;
                    C24793CKm cKm = this.A0A;
                    C27059DRe dRe3 = dRp.cache;
                    int i2 = dRe3.cacheInstrumentationEventBatchPeriodS;
                    boolean z8 = dRe3.enableOnlyCacheEvictionInstrumentation;
                    if (cKm != null) {
                        d9y2.A03 = z8;
                        d9y2.A01 = new C25582CiM(handler, cKm, i2);
                        d9y2.A02 = "HeroSimpleCache";
                        d9y2.A00 = new CNZ();
                        bVm.A08(d9y2);
                    }
                    Systrace.A01();
                }
                if (dRp.enableCacheLookUp) {
                    C26698D9w d9w = new C26698D9w();
                    this.A08 = d9w;
                    this.A03.A08(d9w);
                }
                Map map = this.A0D;
                boolean z9 = false;
                if (map.containsKey("dummy_default_setting") && BE9.A0E("dummy_default_setting", map) != 0) {
                    z9 = true;
                }
                if (!z9) {
                    C24793CKm cKm2 = this.A0A;
                    new C22926BVo("", "CACHE", "USE_DEFAULT_CACHE_SETTING", "using default exp settings");
                    cKm2.A00.A09.A00();
                }
                if (!dRp.dummyDefaultSetting) {
                    C24793CKm cKm3 = this.A0A;
                    new C22926BVo("", "CACHE", "USE_DEFAULT_CACHE_SETTING", "using default exp settings");
                    cKm3.A00.A09.A00();
                }
                if (dRp.cache.timeToLiveMs > 0) {
                    handler.postDelayed(C27082DTh.A00(this, 40), 3000);
                }
                if (dRp.enableVideoHybridCache) {
                    DGG dgg = new DGG(dRp.videoMemoryCacheSizeKb);
                    this.A07 = dgg;
                    this.A06 = new DGF(dgg, this.A03);
                }
            }
            try {
                C25922Cog.A01("CacheManager_default", "CacheInitialized", BE6.A1Z());
            } finally {
                Systrace.A01();
            }
        } catch (Throwable th) {
            C25922Cog.A01("CacheManager_default", "CacheInitialized", BE6.A1Z());
            throw th;
        }
    }

    private void A01() {
        C28652ECm duv;
        C27066DRp dRp = this.A0B;
        C27059DRe dRe = dRp.cache;
        String str = dRe.cacheDirectory;
        if (str == null) {
            str = this.A0E.getFilesDir().toString();
        }
        CSU csu = new CSU(str, dRe.cacheSizeInBytes, dRe.useFbLruCacheEvictor, dRe.usePerVideoLruProtectPrefetchCacheEvictor, dRe.usePerVideoLruCache);
        this.A05 = csu;
        int i = csu.A00;
        this.A00 = i;
        if (csu.A04) {
            C27059DRe dRe2 = dRp.cache;
            int i2 = dRe2.perVideoLRUMinOffset;
            double d = dRe2.perVideoLRUMaxPercent;
            int i3 = dRe2.protectPrefetchCacheMinOffset;
            duv = new DUX(d, dRe2.protectPrefetchCacheMaxPercent, i2, i3, (long) i, dRe2.perVideoLruProtectPrefetchCacheConcurrentFix);
        } else if (csu.A03) {
            C27059DRe dRe3 = dRp.cache;
            int i4 = dRe3.perVideoLRUMinOffset;
            duv = new DUW(dRe3.perVideoLRUMaxPercent, i4, (long) i);
        } else {
            duv = new DUV((long) i);
        }
        this.A01 = duv;
        if (this.A05.A02) {
            this.A01 = new C26699D9x(duv, this, this.A0A);
        }
    }

    public void A03() {
        if (this.A05 == null) {
            A01();
        }
        File A17 = C108945cZ.A17(C17900vP.A0A(this.A05.A01, "/ExoPlayerCacheDir/videocache"));
        if (!A17.exists()) {
            A17.mkdirs();
        }
    }

    public C26029Cqn(Context context, Handler handler, C24793CKm cKm, C26185Cu9 cu9, C27066DRp dRp, Map map) {
        try {
            this.A0D = map;
            this.A0B = dRp;
            this.A0F = cu9;
            this.A0A = cKm;
            this.A0C = new WeakHashMap();
            this.A0E = context;
            this.A09 = handler;
            if (!dRp.cache.delayInitCache) {
                A00();
            }
        } finally {
            C25304Cd8.A00();
        }
    }

    public void A04() {
        C28653ECn A022 = A02();
        if (A022 != null) {
            if (this.A02 == null) {
                this.A02 = new C24786CKf(C28617EAp.A00);
            }
            C27066DRp dRp = this.A0B;
            long j = dRp.cache.timeToLiveMs;
            Iterator it = A022.BTn().iterator();
            while (it.hasNext()) {
                NavigableSet<DSC> BNz = A022.BNz(C17880vN.A0v(it));
                if (BNz != null) {
                    for (DSC dsc : BNz) {
                        if (System.currentTimeMillis() - dsc.A03 >= j) {
                            A022.CF1(dsc, "ttl_eviction");
                        }
                    }
                }
            }
            this.A09.postDelayed(C27082DTh.A00(this, 39), dRp.cache.timeToLiveEvictionIntervalForegroundMs);
        }
    }
}
