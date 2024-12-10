package com.facebook.profilo.provider.stacktrace;

import X.AnonymousClass8BR;
import X.C25159CaA;
import X.C26552D3s;
import X.Cn8;
import X.DFA;
import android.app.Application;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class StackFrameThread extends Cn8 {
    public static final int PROVIDER_NATIVE_STACK_TRACE;
    public static final int PROVIDER_STACK_FRAME;
    public static final int PROVIDER_WALL_TIME_STACK_TRACE;
    public final Context mContext;
    public volatile boolean mEnabled;
    public Thread mProfilerThread;
    public C26552D3s mSavedTraceContext;
    public int mSystemClockTimeIntervalMs = -1;

    public static native int nativeCpuClockResolutionMicros();

    static {
        C25159CaA caA = ProvidersRegistry.A00;
        PROVIDER_STACK_FRAME = caA.A02("stack_trace");
        PROVIDER_WALL_TIME_STACK_TRACE = caA.A02("wall_time_stack_trace");
        PROVIDER_NATIVE_STACK_TRACE = caA.A02("native_stack_trace");
    }

    public StackFrameThread(Context context) {
        this.A01 = "profilo_stacktrace";
        this.A02 = false;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null || !(context instanceof Application)) {
            this.mContext = applicationContext;
        } else {
            this.mContext = context;
        }
    }

    public void disable() {
        if (!this.mEnabled) {
            this.mProfilerThread = null;
            return;
        }
        this.mSavedTraceContext = null;
        this.mEnabled = false;
        synchronized (CPUProfiler.class) {
            if (CPUProfiler.sInitialized) {
                CPUProfiler.nativeStopProfiling();
            }
        }
        Thread thread = this.mProfilerThread;
        if (thread != null) {
            try {
                thread.join();
                this.mProfilerThread = null;
            } catch (InterruptedException e) {
                throw AnonymousClass8BR.A0x(e);
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4  */
    public void enable() {
        /*
            r19 = this;
            r1 = r19
            X.D3s r0 = r1.A00
            int r5 = r0.A02
            int r4 = PROVIDER_STACK_FRAME
            int r2 = PROVIDER_WALL_TIME_STACK_TRACE
            r4 = r4 | r2
            r4 = r4 & r5
            r3 = 0
            if (r4 == 0) goto L_0x0011
            r3 = 32752(0x7ff0, float:4.5895E-41)
        L_0x0011:
            int r2 = PROVIDER_NATIVE_STACK_TRACE
            r5 = r5 & r2
            if (r5 == 0) goto L_0x0018
            r3 = r3 | 4
        L_0x0018:
            if (r3 == 0) goto L_0x0025
            java.lang.Thread r2 = r1.mProfilerThread
            if (r2 == 0) goto L_0x0026
            java.lang.String r1 = "StackFrameThread"
            java.lang.String r0 = "Duplicate attempt to enable sampling profiler."
            android.util.Log.e(r1, r0)
        L_0x0025:
            return
        L_0x0026:
            X.D3x r2 = r0.A08
            java.lang.String r3 = "provider.stack_trace.time_source"
            java.util.TreeMap r2 = r2.A02
            if (r2 == 0) goto L_0x0052
            java.lang.String r3 = X.C108945cZ.A1G(r3, r2)
            if (r3 == 0) goto L_0x0052
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0052
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0045 }
            java.lang.String r2 = r3.toUpperCase(r2)     // Catch:{ IllegalArgumentException -> 0x0045 }
            X.ByG r8 = X.C24257ByG.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0045 }
            goto L_0x0054
        L_0x0045:
            r4 = move-exception
            java.lang.String r3 = "StackFrameThread"
            java.lang.String r2 = r4.getMessage()
            android.util.Log.e(r3, r2, r4)
            X.ByG r8 = X.C24257ByG.NONE
            goto L_0x0054
        L_0x0052:
            X.ByG r8 = X.C24257ByG.NONE
        L_0x0054:
            X.D3x r3 = r0.A08
            java.lang.String r2 = "provider.stack_trace.cpu_sampling_rate_ms"
            r11 = 0
            int r4 = r3.A00(r2, r11)
            X.D3x r3 = r0.A08
            java.lang.String r2 = "provider.stack_trace.thread_detect_interval_ms"
            int r7 = r3.A00(r2, r11)
            int r5 = r0.A02
            X.D3x r3 = r0.A08
            java.lang.String r2 = "provider.native_stack_trace.unwind_dex_frames"
            boolean r14 = r3.A01(r2, r11)
            X.D3x r6 = r0.A08
            java.lang.String r3 = "provider.native_stack_trace.unwind_jit_frames"
            r2 = 1
            boolean r15 = r6.A01(r3, r2)
            X.D3x r6 = r0.A08
            java.lang.String r3 = "provider.native_stack_trace.unwinder_thread_pri"
            r2 = 5
            int r16 = r6.A00(r3, r2)
            X.D3x r6 = r0.A08
            java.lang.String r3 = "provider.native_stack_trace.unwinder_queue_size"
            r2 = 256(0x100, float:3.59E-43)
            int r17 = r6.A00(r3, r2)
            X.D3x r3 = r0.A08
            java.lang.String r2 = "provider.native_stack_trace.log_partial_stacks"
            boolean r18 = r3.A01(r2, r11)
            monitor-enter(r1)
            android.content.Context r12 = r1.mContext     // Catch:{ Exception -> 0x0121 }
            com.facebook.profilo.logger.MultiBufferLogger r13 = r1.A01()     // Catch:{ Exception -> 0x0121 }
            boolean r2 = com.facebook.profilo.provider.stacktrace.CPUProfiler.init(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0121 }
            if (r2 == 0) goto L_0x012b
            r10 = 23
            if (r4 > 0) goto L_0x00a6
            r4 = 23
        L_0x00a6:
            if (r7 <= 0) goto L_0x00a9
            r10 = r7
        L_0x00a9:
            int r7 = PROVIDER_WALL_TIME_STACK_TRACE     // Catch:{ all -> 0x0132 }
            r6 = r5 & r7
            r3 = 1
            r2 = 3
            if (r6 != 0) goto L_0x00c2
            int r6 = r8.ordinal()     // Catch:{ all -> 0x0132 }
            if (r6 == r2) goto L_0x00c4
            if (r6 == r3) goto L_0x00c2
            if (r6 == r11) goto L_0x00bf
            r2 = 2
            r9 = 0
            if (r6 != r2) goto L_0x00c0
        L_0x00bf:
            r9 = 1
        L_0x00c0:
            r8 = 0
            goto L_0x00c6
        L_0x00c2:
            r9 = 0
            goto L_0x00c5
        L_0x00c4:
            r9 = 1
        L_0x00c5:
            r8 = 1
        L_0x00c6:
            int r2 = PROVIDER_STACK_FRAME     // Catch:{ all -> 0x0132 }
            r2 = r2 | r7
            r2 = r2 & r5
            r7 = 0
            if (r2 == 0) goto L_0x00cf
            r7 = 32752(0x7ff0, float:4.5895E-41)
        L_0x00cf:
            int r2 = PROVIDER_NATIVE_STACK_TRACE     // Catch:{ all -> 0x0132 }
            r5 = r5 & r2
            if (r5 == 0) goto L_0x00d6
            r7 = r7 | 4
        L_0x00d6:
            java.lang.Class<com.facebook.profilo.provider.stacktrace.CPUProfiler> r6 = com.facebook.profilo.provider.stacktrace.CPUProfiler.class
            monitor-enter(r6)     // Catch:{ all -> 0x0132 }
            r5 = 0
            if (r9 != 0) goto L_0x00df
            if (r8 != 0) goto L_0x00df
            goto L_0x00f1
        L_0x00df:
            int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x012f }
            com.facebook.profilo.provider.stacktrace.StackTraceWhitelist.nativeAddToWhitelist(r2)     // Catch:{ all -> 0x012f }
            boolean r2 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ all -> 0x012f }
            if (r2 == 0) goto L_0x00f1
            boolean r2 = com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeStartProfiling(r7, r4, r10, r9, r8)     // Catch:{ all -> 0x012f }
            if (r2 == 0) goto L_0x00f1
            r5 = 1
        L_0x00f1:
            monitor-exit(r6)     // Catch:{ all -> 0x0132 }
            if (r5 == 0) goto L_0x012b
            com.facebook.profilo.logger.MultiBufferLogger r6 = r1.A01()     // Catch:{ all -> 0x0132 }
            long r14 = (long) r4     // Catch:{ all -> 0x0132 }
            r7 = 6
            r8 = 52
            r9 = 0
            r12 = 8126495(0x7c001f, float:1.1387645E-38)
            r13 = r11
            r6.writeStandardEntry(r7, r8, r9, r11, r12, r13, r14)     // Catch:{ all -> 0x0132 }
            r1.mEnabled = r3     // Catch:{ all -> 0x0132 }
            boolean r2 = r1.mEnabled     // Catch:{ all -> 0x0132 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0025
            r1.mSavedTraceContext = r0
            r0 = 30
            X.DTh r3 = X.C27082DTh.A00(r1, r0)
            java.lang.String r2 = "Prflo:Profiler"
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r3, r2)
            r1.mProfilerThread = r0
            r0.start()
            return
        L_0x0121:
            r3 = move-exception
            java.lang.String r2 = "StackFrameThread"
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x012d }
            android.util.Log.e(r2, r0, r3)     // Catch:{ all -> 0x012d }
        L_0x012b:
            monitor-exit(r1)
            return
        L_0x012d:
            r0 = move-exception
            goto L_0x0131
        L_0x012f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0132 }
        L_0x0131:
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.enable():void");
    }

    public int getSupportedProviders() {
        return PROVIDER_NATIVE_STACK_TRACE | PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if ((r2 & r1) != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getTracingProviders() {
        /*
            r4 = this;
            X.D3s r1 = r4.mSavedTraceContext
            boolean r0 = r4.mEnabled
            r3 = 0
            if (r0 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            int r2 = r1.A02
            int r1 = PROVIDER_WALL_TIME_STACK_TRACE
            r0 = r2 & r1
            if (r0 != 0) goto L_0x0017
            int r1 = PROVIDER_STACK_FRAME
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r3 = r3 | r1
        L_0x0018:
            int r0 = PROVIDER_NATIVE_STACK_TRACE
            r2 = r2 & r0
            r2 = r2 | r3
            return r2
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.getTracingProviders():int");
    }

    public void onTraceEnded(C26552D3s d3s, DFA dfa) {
        int i;
        int i2 = d3s.A02;
        int i3 = PROVIDER_STACK_FRAME;
        int i4 = PROVIDER_WALL_TIME_STACK_TRACE;
        if ((i2 & (i3 | i4)) != 0) {
            logAnnotation("provider.stack_trace.art_compatibility", Boolean.toString(ArtCompatibility.isCompatible(this.mContext)));
            int i5 = d3s.A02;
            int i6 = (PROVIDER_STACK_FRAME | i4) & i5;
            int i7 = 0;
            if (i6 != 0) {
                i7 = 32752;
            }
            if ((i5 & PROVIDER_NATIVE_STACK_TRACE) != 0) {
                i7 |= 4;
            }
            synchronized (CPUProfiler.class) {
                i = CPUProfiler.sAvailableTracers;
            }
            logAnnotation("provider.stack_trace.tracers", Integer.toBinaryString(i7 & i));
        }
        if ((d3s.A02 & getSupportedProviders()) != 0) {
            logAnnotation("provider.stack_trace.cpu_timer_res_us", Integer.toString(nativeCpuClockResolutionMicros()));
        }
    }

    public void onTraceStarted(C26552D3s d3s, DFA dfa) {
        if (CPUProfiler.sInitialized) {
            CPUProfiler.nativeResetFrameworkNamesSet();
        }
    }

    private void logAnnotation(String str, String str2) {
        MultiBufferLogger A01 = A01();
        A01.writeBytesEntry(0, 57, A01.writeBytesEntry(0, 56, A01.writeStandardEntry(6, 52, 0, 0, 0, 0, 0), str), str2);
    }
}
