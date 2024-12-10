package X;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.IBinder;

/* renamed from: X.8Bn  reason: invalid class name */
public final class AnonymousClass8Bn extends JobServiceEngine implements C22491B9x {
    public JobParameters A00;
    public final C161078Bi A01;
    public final Object A02 = C17880vN.A0p();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        r2.getIntent().setExtrasClassLoader(r4.A01.getClassLoader());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return new X.AGO(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        if (r2 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AGO BIU() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A02
            monitor-enter(r3)
            android.app.job.JobParameters r1 = r4.A00     // Catch:{ all -> 0x0024 }
            r0 = 0
            if (r1 != 0) goto L_0x000a
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            return r0
        L_0x000a:
            android.app.job.JobWorkItem r2 = r1.dequeueWork()     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0023
            android.content.Intent r1 = r2.getIntent()
            X.8Bi r0 = r4.A01
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1.setExtrasClassLoader(r0)
            X.AGO r0 = new X.AGO
            r0.<init>(r2, r4)
        L_0x0023:
            return r0
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Bn.BIU():X.AGO");
    }

    public boolean onStartJob(JobParameters jobParameters) {
        this.A00 = jobParameters;
        this.A01.A09(false);
        return true;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public boolean onStopJob(android.app.job.JobParameters r5) {
        /*
            r4 = this;
            X.8Bi r2 = r4.A01
            X.8CT r1 = r2.A00
            if (r1 == 0) goto L_0x000a
            r0 = 0
            r1.cancel(r0)
        L_0x000a:
            boolean r0 = r2 instanceof com.whatsapp.push.RegistrationIntentService
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "GCM: Stop current work"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0013:
            r3 = 1
        L_0x0014:
            java.lang.Object r1 = r4.A02
            monitor-enter(r1)
            r0 = 0
            goto L_0x0045
        L_0x0019:
            boolean r0 = r2 instanceof com.whatsapp.AlarmService
            if (r0 == 0) goto L_0x0013
            com.whatsapp.AlarmService r2 = (com.whatsapp.AlarmService) r2
            X.9u4 r2 = r2.A02
            if (r2 != 0) goto L_0x0025
            r3 = 0
            goto L_0x0014
        L_0x0025:
            boolean r0 = r2 instanceof X.C167078fM
            if (r0 == 0) goto L_0x0043
            r3 = 0
        L_0x002a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AlarmService/onStopCurrentWork; retry="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", handler= "
            r1.append(r0)
            java.lang.String r0 = X.C17890vO.A0U(r2)
            X.C17890vO.A1A(r1, r0)
            goto L_0x0014
        L_0x0043:
            r3 = 1
            goto L_0x002a
        L_0x0045:
            r4.A00 = r0     // Catch:{ all -> 0x0049 }
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            return r3
        L_0x0049:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Bn.onStopJob(android.app.job.JobParameters):boolean");
    }

    public AnonymousClass8Bn(C161078Bi r2) {
        super(r2);
        this.A01 = r2;
    }

    public IBinder BFL() {
        return getBinder();
    }
}
