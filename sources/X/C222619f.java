package X;

import android.app.ActivityManager;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.19f  reason: invalid class name and case insensitive filesystem */
public class C222619f implements C222419d {
    public final AnonymousClass11C A00;
    public final C222519e A01;

    public boolean BgH() {
        return true;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bsc(X.C223419n r11) {
        /*
            r10 = this;
            X.11C r0 = r10.A00
            android.app.ActivityManager r0 = r0.A04()
            if (r0 == 0) goto L_0x0080
            android.app.ActivityManager$MemoryInfo r4 = new android.app.ActivityManager$MemoryInfo
            r4.<init>()
            r0.getMemoryInfo(r4)
            long r0 = r4.availMem
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r8
            long r0 = r0 * r8
            java.lang.String r7 = "avail_mem"
            java.lang.String r6 = "memory_stats"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.A03(r0, r6, r7)
            long r2 = r4.threshold
            long r2 = r2 / r8
            long r2 = r2 * r8
            java.lang.String r1 = "low_mem"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r11.A03(r0, r6, r1)
            long r2 = r4.totalMem
            long r2 = r2 / r8
            long r2 = r2 * r8
            java.lang.String r1 = "total_mem"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r11.A03(r0, r6, r1)
            long r3 = r4.availMem
            long r3 = r3 / r8
            long r3 = r3 * r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0080 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x0080 }
            r1.append(r7)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r0 = "_at_start"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r2 = r1.toString()     // Catch:{ RuntimeException -> 0x0080 }
            java.util.concurrent.ConcurrentHashMap r1 = r11.A08     // Catch:{ RuntimeException -> 0x0080 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ RuntimeException -> 0x0080 }
            r0.<init>(r6, r2)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.Object r5 = r1.get(r0)     // Catch:{ RuntimeException -> 0x0080 }
            java.io.Serializable r5 = (java.io.Serializable) r5     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ RuntimeException -> 0x0080 }
            if (r5 == 0) goto L_0x0080
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            r1.<init>()     // Catch:{  }
            r1.append(r7)     // Catch:{  }
            java.lang.String r0 = "_delta"
            r1.append(r0)     // Catch:{  }
            java.lang.String r2 = r1.toString()     // Catch:{  }
            long r0 = r5.longValue()     // Catch:{  }
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{  }
            r11.A03(r0, r6, r2)     // Catch:{  }
        L_0x0080:
            X.19e r0 = r10.A01
            java.lang.Runtime r0 = r0.A00
            long r6 = r0.totalMemory()
            long r0 = r0.freeMemory()
            long r6 = r6 - r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 / r0
            long r6 = r6 * r0
            java.lang.String r5 = "java_heap"
            java.lang.String r4 = "memory_stats"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00d5 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x00d5 }
            r1.append(r5)     // Catch:{ RuntimeException -> 0x00d5 }
            java.lang.String r0 = "_at_start"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x00d5 }
            java.lang.String r2 = r1.toString()     // Catch:{ RuntimeException -> 0x00d5 }
            java.util.concurrent.ConcurrentHashMap r1 = r11.A08     // Catch:{ RuntimeException -> 0x00d5 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ RuntimeException -> 0x00d5 }
            r0.<init>(r4, r2)     // Catch:{ RuntimeException -> 0x00d5 }
            java.lang.Object r3 = r1.get(r0)     // Catch:{ RuntimeException -> 0x00d5 }
            java.io.Serializable r3 = (java.io.Serializable) r3     // Catch:{ RuntimeException -> 0x00d5 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ RuntimeException -> 0x00d5 }
            if (r3 == 0) goto L_0x00d5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            r1.<init>()     // Catch:{  }
            r1.append(r5)     // Catch:{  }
            java.lang.String r0 = "_delta"
            r1.append(r0)     // Catch:{  }
            java.lang.String r2 = r1.toString()     // Catch:{  }
            long r0 = r3.longValue()     // Catch:{  }
            long r6 = r6 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{  }
            r11.A03(r0, r4, r2)     // Catch:{  }
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222619f.Bsc(X.19n):void");
    }

    public void C6D(C223419n r7) {
        ActivityManager A04 = this.A00.A04();
        if (A04 != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            A04.getMemoryInfo(memoryInfo);
            long j = (memoryInfo.availMem / SearchActionVerificationClientService.MS_TO_NS) * SearchActionVerificationClientService.MS_TO_NS;
            StringBuilder sb = new StringBuilder();
            sb.append("avail_mem");
            sb.append("_at_start");
            r7.A03(Long.valueOf(j), "memory_stats", sb.toString());
        }
        Runtime runtime = this.A01.A00;
        long freeMemory = ((runtime.totalMemory() - runtime.freeMemory()) / SearchActionVerificationClientService.MS_TO_NS) * SearchActionVerificationClientService.MS_TO_NS;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("java_heap");
        sb2.append("_at_start");
        r7.A03(Long.valueOf(freeMemory), "memory_stats", sb2.toString());
    }

    public C222619f(AnonymousClass11C r1, C222519e r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final String BU9() {
        return "memory_stats";
    }
}
