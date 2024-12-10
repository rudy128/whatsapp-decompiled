package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ow  reason: invalid class name and case insensitive filesystem */
public final class C37081ow {
    public List A00 = new ArrayList();
    public C65162vw A01;
    public final C64882vU A02 = new C64882vU(this);

    public final synchronized void A00() {
        C65162vw r2 = this.A01;
        if (r2 != null) {
            C64882vU r1 = this.A02;
            C18070vi.A0d(r1, 0);
            r2.A00.A00(r1);
        }
        this.A01 = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|(2:26|(2:30|(2:32|(6:34|(1:36)(1:38)|37|39|40|(2:42|(1:44))))))|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x009f */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01(android.app.Activity r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00da }
            r2 = 29
            if (r3 < r2) goto L_0x0013
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "SM-F700"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0015
            if (r3 != r2) goto L_0x0015
        L_0x0013:
            monitor-exit(r8)
            return
        L_0x0015:
            if (r9 == 0) goto L_0x0013
            X.Cfy r0 = X.EBP.A00     // Catch:{ all -> 0x00da }
            X.0vl r0 = X.C25447Cfy.A01     // Catch:{ all -> 0x00da }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x00da }
            X.E7E r2 = (X.E7E) r2     // Catch:{ all -> 0x00da }
            if (r2 != 0) goto L_0x00ae
            X.D7R r0 = X.D7R.A03     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00a9
            java.util.concurrent.locks.ReentrantLock r7 = X.D7R.A02     // Catch:{ all -> 0x00da }
            r7.lock()     // Catch:{ all -> 0x00da }
            X.D7R r0 = X.D7R.A03     // Catch:{ all -> 0x00d5 }
            if (r0 != 0) goto L_0x00a6
            r4 = 0
            java.lang.String r1 = androidx.window.sidecar.SidecarProvider.getApiVersion()     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            if (r0 != 0) goto L_0x009f
            if (r1 == 0) goto L_0x009f
            boolean r0 = X.AnonymousClass1YF.A0T(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            java.util.regex.Matcher r6 = r0.matcher(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            boolean r0 = r6.matches()     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            if (r0 == 0) goto L_0x009f
            r0 = 1
            java.lang.String r0 = r6.group(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            if (r0 == 0) goto L_0x009f
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            r0 = 2
            java.lang.String r0 = r6.group(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            if (r0 == 0) goto L_0x009f
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            r0 = 3
            java.lang.String r0 = r6.group(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            if (r0 == 0) goto L_0x009f
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            r1 = 4
            java.lang.String r0 = r6.group(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r6.group(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
        L_0x007f:
            X.C18070vi.A0a(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            X.DSG r1 = new X.DSG     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            r1.<init>(r5, r3, r0, r2)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009f }
            goto L_0x008b
        L_0x0088:
            java.lang.String r0 = ""
            goto L_0x007f
        L_0x008b:
            X.DSG r0 = X.DSG.A05     // Catch:{  }
            int r0 = r1.compareTo(r0)     // Catch:{  }
            if (r0 < 0) goto L_0x009f
            X.D7U r1 = new X.D7U     // Catch:{  }
            r1.<init>(r9)     // Catch:{  }
            boolean r0 = r1.A03()     // Catch:{  }
            if (r0 == 0) goto L_0x009f
            r4 = r1
        L_0x009f:
            X.D7R r0 = new X.D7R     // Catch:{ all -> 0x00d5 }
            r0.<init>(r4)     // Catch:{ all -> 0x00d5 }
            X.D7R.A03 = r0     // Catch:{ all -> 0x00d5 }
        L_0x00a6:
            r7.unlock()     // Catch:{ all -> 0x00da }
        L_0x00a9:
            X.D7R r2 = X.D7R.A03     // Catch:{ all -> 0x00da }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x00da }
        L_0x00ae:
            X.1ZS r1 = X.AnonymousClass1ZS.A00     // Catch:{ all -> 0x00da }
            X.D7M r0 = new X.D7M     // Catch:{ all -> 0x00da }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00da }
            X.2vw r4 = new X.2vw     // Catch:{ all -> 0x00da }
            r4.<init>(r0)     // Catch:{ all -> 0x00da }
            r8.A01 = r4     // Catch:{ all -> 0x00da }
            r0 = 0
            X.DVv r3 = new X.DVv     // Catch:{ all -> 0x00da }
            r3.<init>(r0)     // Catch:{ all -> 0x00da }
            X.2vU r2 = r8.A02     // Catch:{ all -> 0x00da }
            r0 = 2
            X.C18070vi.A0d(r2, r0)     // Catch:{ all -> 0x00da }
            X.2kY r1 = r4.A00     // Catch:{ all -> 0x00da }
            X.EBP r0 = r4.A01     // Catch:{ all -> 0x00da }
            X.1Fz r0 = r0.CSC(r9)     // Catch:{ all -> 0x00da }
            r1.A01(r2, r3, r0)     // Catch:{ all -> 0x00da }
            goto L_0x0013
        L_0x00d5:
            r0 = move-exception
            r7.unlock()     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37081ow.A01(android.app.Activity):void");
    }

    public final synchronized void A02(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        this.A00.add(r2);
    }
}
