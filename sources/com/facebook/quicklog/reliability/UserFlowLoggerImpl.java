package com.facebook.quicklog.reliability;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8QW;
import X.C17880vN;
import X.C26159CtX;
import android.text.TextUtils;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowConfig;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class UserFlowLoggerImpl implements UserFlowLogger {
    public static final String CANCEL_REASON_ANNOTATION = "cancel_reason";
    public static final String DEBUG_INFO_ANNOTATION = "uf_debug_info";
    public static final String HAS_ERROR_ANNOTATION = "uf_has_error";
    public static final AtomicInteger INSTANCE_KEY_COUNTER = new AtomicInteger(1);
    public static final String INVALID_REASON_ANNOTATION = "uf_invalid_reason";
    public static final String SOURCE_ANNOTATION = "trigger_source";
    public static final String SOURCE_OF_RESTART_ANNOTATION = "trigger_source_of_restart";
    public static final String UNSTARTED_DEBUG_INFO_ANNOTATION = "uf_unstarted_debug_info";
    public final boolean mAnnotateTriggerSourceAsCrucial;
    public final Set mOngoingBgCancellableFlows;
    public final Set mOngoingFlows;
    public final QuickPerformanceLogger mQPL;
    public final boolean mStrictMode;

    public static int extractMarkerId(long j) {
        return (int) j;
    }

    private void flowMarkDebugInfo(long j, String str, boolean z, String str2) {
        int A02 = AnonymousClass8BR.A02(j);
        MarkerEditor withMarker = this.mQPL.withMarker((int) j, A02);
        withMarker.annotate(HAS_ERROR_ANNOTATION, z);
        PointEditor pointEditor = withMarker.pointEditor(str);
        if (str2 != null) {
            pointEditor.addPointData(DEBUG_INFO_ANNOTATION, str2);
        }
        withMarker.markerEditingCompleted();
    }

    public void flowDrop(long j) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        synchronized (this) {
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            if (set.contains(valueOf)) {
                this.mQPL.markerDropForUserFlow(i, A02);
            }
            this.mOngoingFlows.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    public void flowEndAbort(long j) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        synchronized (this) {
            if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
                this.mQPL.markerEndForUserFlow(i, (String) null, A02, 105);
            } else {
                logUnstartedSession(i, 10294, "flowEndAbort", "");
            }
            AnonymousClass8BX.A13(this, j);
        }
    }

    public void flowEndCancel(long j, String str, String str2) {
        flowCancelAtPoint(j, (String) null, str, str2);
    }

    public void flowEndNewStartFound(long j) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        synchronized (this) {
            if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
                this.mQPL.markerEndForUserFlow(i, A02, 111);
            }
            AnonymousClass8BX.A13(this, j);
        }
    }

    public void flowEndSuccess(long j, String str) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        synchronized (this) {
            if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
                this.mQPL.markerEndForUserFlow(i, A02, 2);
            } else {
                logUnstartedSession(i, 10294, "flowEndSuccess", str);
            }
            AnonymousClass8BX.A13(this, j);
        }
    }

    public void flowEndTimeout(long j) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        synchronized (this) {
            if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
                this.mQPL.markerEndForUserFlow(i, A02, 113);
            }
            AnonymousClass8BX.A13(this, j);
        }
    }

    public void flowMarkError(long j, String str, String str2) {
        flowMarkDebugInfo(j, str, true, str2);
    }

    public boolean flowStartIfNotOngoing(long j, String str, UserFlowConfig userFlowConfig) {
        return flowStartInternal(j, userFlowConfig, true, str);
    }

    public synchronized int[] getOngoingFlows() {
        int[] iArr;
        iArr = new int[this.mOngoingFlows.size()];
        int i = 0;
        for (Long longValue : this.mOngoingFlows) {
            iArr[i] = (int) longValue.longValue();
            i++;
        }
        return iArr;
    }

    public synchronized boolean isOngoingFlow(long j) {
        return AnonymousClass8BW.A1R(this, j);
    }

    public PointEditor markPointWithEditor(long j, String str, String str2) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
            return this.mQPL.withMarker(i, A02).pointEditor(str);
        }
        logUnstartedSession(i, 10088, str, str2);
        return AnonymousClass8QW.A00;
    }

    public synchronized void onAppBackgrounded() {
        this.mOngoingFlows.removeAll(this.mOngoingBgCancellableFlows);
        this.mOngoingBgCancellableFlows.clear();
    }

    public MarkerEditor withFlow(long j) {
        int A02 = AnonymousClass8BR.A02(j);
        return this.mQPL.withMarker((int) j, A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r23 != false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean flowStartInternal(long r20, com.facebook.quicklog.reliability.UserFlowConfig r22, boolean r23, java.lang.String r24) {
        /*
            r19 = this;
            r2 = r19
            monitor-enter(r2)
            java.util.Set r0 = r2.mOngoingFlows     // Catch:{ all -> 0x007a }
            r4 = r20
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007a }
            boolean r0 = r0.add(r3)     // Catch:{ all -> 0x007a }
            r7 = 1
            r6 = 0
            r1 = r0 ^ 1
            int r9 = (int) r4     // Catch:{ all -> 0x007a }
            int r10 = X.AnonymousClass8BR.A02(r4)     // Catch:{ all -> 0x007a }
            boolean r0 = r2.mStrictMode     // Catch:{ all -> 0x007a }
            r5 = r22
            if (r0 == 0) goto L_0x0023
            if (r1 == 0) goto L_0x0039
            if (r23 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0023:
            if (r1 == 0) goto L_0x0039
            if (r23 == 0) goto L_0x0039
        L_0x0027:
            monitor-exit(r2)
            return r6
        L_0x0029:
            com.facebook.quicklog.QuickPerformanceLogger r4 = r2.mQPL     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "trigger_source_of_restart"
            java.lang.String r0 = r5.mTriggerSource     // Catch:{ all -> 0x007a }
            r4.markerAnnotate((int) r9, (int) r10, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x007a }
            com.facebook.quicklog.QuickPerformanceLogger r1 = r2.mQPL     // Catch:{ all -> 0x007a }
            r0 = 111(0x6f, float:1.56E-43)
            r1.markerEndForUserFlow(r9, r10, r0)     // Catch:{ all -> 0x007a }
        L_0x0039:
            boolean r12 = r5.mCancelOnBackground     // Catch:{ all -> 0x007a }
            r11 = r24
            if (r24 == 0) goto L_0x0054
            com.facebook.quicklog.QuickPerformanceLogger r8 = r2.mQPL     // Catch:{ all -> 0x007a }
            long r13 = r5.mTtlMs     // Catch:{ all -> 0x007a }
            r8.markerStartForUserFlow(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x007a }
        L_0x0046:
            boolean r0 = r2.mAnnotateTriggerSourceAsCrucial     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0062
            com.facebook.quicklog.QuickPerformanceLogger r4 = r2.mQPL     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "trigger_source"
            java.lang.String r0 = r5.mTriggerSource     // Catch:{ all -> 0x007a }
            r4.markerAnnotateCrucialForUserFlow((int) r9, (int) r10, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x007a }
            goto L_0x006b
        L_0x0054:
            com.facebook.quicklog.QuickPerformanceLogger r13 = r2.mQPL     // Catch:{ all -> 0x007a }
            long r0 = r5.mTtlMs     // Catch:{ all -> 0x007a }
            r14 = r9
            r15 = r10
            r16 = r12
            r17 = r0
            r13.markerStartForUserFlow(r14, r15, r16, r17)     // Catch:{ all -> 0x007a }
            goto L_0x0046
        L_0x0062:
            com.facebook.quicklog.QuickPerformanceLogger r4 = r2.mQPL     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "trigger_source"
            java.lang.String r0 = r5.mTriggerSource     // Catch:{ all -> 0x007a }
            r4.markerAnnotate((int) r9, (int) r10, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x007a }
        L_0x006b:
            if (r12 == 0) goto L_0x0073
            java.util.Set r0 = r2.mOngoingBgCancellableFlows     // Catch:{ all -> 0x007a }
            r0.add(r3)     // Catch:{ all -> 0x007a }
            goto L_0x0078
        L_0x0073:
            java.util.Set r0 = r2.mOngoingBgCancellableFlows     // Catch:{ all -> 0x007a }
            r0.remove(r3)     // Catch:{ all -> 0x007a }
        L_0x0078:
            monitor-exit(r2)
            return r7
        L_0x007a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicklog.reliability.UserFlowLoggerImpl.flowStartInternal(long, com.facebook.quicklog.reliability.UserFlowConfig, boolean, java.lang.String):boolean");
    }

    private void logUnstartedSession(int i, short s, String str, String str2) {
        EventBuilder annotate = this.mQPL.markEventBuilder(i, "user_flow_strict_mode").setActionId(s).annotate(INVALID_REASON_ANNOTATION, str);
        if (!TextUtils.isEmpty(str2)) {
            annotate = annotate.annotate(UNSTARTED_DEBUG_INFO_ANNOTATION, str2);
        }
        annotate.report();
    }

    public /* synthetic */ void flowAnnotateWithCrucialData(long j, String str, int i) {
        flowAnnotateWithCrucialData(j, str, i, "");
    }

    public /* synthetic */ void flowCancelAtPoint(long j, String str, String str2) {
        flowCancelAtPoint(j, str, str2, "");
    }

    public /* synthetic */ void flowEndFail(long j, String str, String str2) {
        flowEndFail(j, str, str2, "");
    }

    public /* synthetic */ void flowMarkPoint(long j, String str, String str2) {
        flowMarkPoint(j, str, str2, "");
    }

    public void flowStart(long j, String str, boolean z) {
        flowStartInternal(j, new UserFlowConfig.UserFlowConfigBuilder(str, z).build(), false, (String) null);
    }

    public long flowStartForMarker(int i, String str, boolean z) {
        long A06 = AnonymousClass8BU.A06(INSTANCE_KEY_COUNTER.incrementAndGet(), i);
        flowStartInternal(A06, new UserFlowConfig.UserFlowConfigBuilder(str, z).build(), false, (String) null);
        return A06;
    }

    public long generateNewFlowId(int i) {
        return AnonymousClass8BU.A06(INSTANCE_KEY_COUNTER.incrementAndGet(), i);
    }

    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger, boolean z, boolean z2) {
        this.mOngoingFlows = C17880vN.A12();
        this.mOngoingBgCancellableFlows = C17880vN.A12();
        C26159CtX.A01(quickPerformanceLogger);
        this.mQPL = quickPerformanceLogger;
        this.mStrictMode = z;
        this.mAnnotateTriggerSourceAsCrucial = z2;
    }

    public static int extractInstanceId(long j) {
        return AnonymousClass8BR.A02(j);
    }

    public static long generateUserFlowId(int i, int i2) {
        return AnonymousClass8BU.A06(i2, i);
    }

    public Long flowStartIfNotOngoingForMarker(int i, int i2, String str, boolean z, long j) {
        long A06 = AnonymousClass8BU.A06(i2, i);
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = j;
        if (flowStartInternal(A06, userFlowConfig, true, (String) null)) {
            return Long.valueOf(A06);
        }
        return null;
    }

    public long generateFlowId(int i, int i2) {
        return AnonymousClass8BU.A06(i2, i);
    }

    public /* synthetic */ void flowAnnotate(long j, String str, double d) {
        flowAnnotate(j, str, d, "");
    }

    public void flowAnnotate(long j, String str, double d, String str2) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        String str3 = str;
        if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
            this.mQPL.markerAnnotate(i, A02, str3, d);
        } else {
            logUnstartedSession(i, 10087, str, str2);
        }
    }

    public /* synthetic */ void flowAnnotate(long j, String str, int i) {
        flowAnnotate(j, str, i, "");
    }

    public void flowAnnotate(long j, String str, int i, String str2) {
        int i2 = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
            this.mQPL.markerAnnotate(i2, A02, str, i);
        } else {
            logUnstartedSession(i2, 10087, str, str2);
        }
    }

    public /* synthetic */ void flowAnnotate(long j, String str, long j2) {
        flowAnnotate(j, str, j2, "");
    }

    public void flowAnnotate(long j, String str, long j2, String str2) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        String str3 = str;
        if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
            this.mQPL.markerAnnotate(i, A02, str3, j2);
        } else {
            logUnstartedSession(i, 10087, str, str2);
        }
    }

    public /* synthetic */ void flowAnnotate(long j, String str, String str2) {
        flowAnnotate(j, str, str2, "");
    }

    public void flowAnnotate(long j, String str, String str2, String str3) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
            this.mQPL.markerAnnotate(i, A02, str, str2);
        } else {
            logUnstartedSession(i, 10087, str, str3);
        }
    }

    public /* synthetic */ void flowAnnotate(long j, String str, boolean z) {
        flowAnnotate(j, str, z, "");
    }

    public void flowAnnotate(long j, String str, boolean z, String str2) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
            this.mQPL.markerAnnotate(i, A02, str, z);
        } else {
            logUnstartedSession(i, 10087, str, str2);
        }
    }

    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger) {
        this(quickPerformanceLogger, false, false);
    }

    public void flowAnnotateWithCrucialData(long j, String str, int i, String str2) {
        int i2 = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
            this.mQPL.markerAnnotateCrucialForUserFlow(i2, A02, str, i);
        } else {
            logUnstartedSession(i2, 10087, str, str2);
        }
    }

    public void flowCancelAtPoint(long j, String str, String str2, String str3) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        this.mQPL.markerAnnotate(i, A02, CANCEL_REASON_ANNOTATION, str2);
        synchronized (this) {
            if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
                this.mQPL.markerEndForUserFlow(i, str, A02, 4);
            } else {
                logUnstartedSession(i, 10294, AnonymousClass001.A1H("flowCancelAtPoint|", str2, AnonymousClass000.A10()), str3);
            }
            AnonymousClass8BX.A13(this, j);
        }
    }

    public /* synthetic */ void flowEndCancel(long j, String str) {
        flowEndCancel(j, str, "");
    }

    public void flowEndFail(long j, String str, String str2, String str3) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        flowMarkError(j, str, str2);
        synchronized (this) {
            if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
                this.mQPL.markerEndForUserFlow(i, A02, 3);
            } else {
                logUnstartedSession(i, 10294, AnonymousClass001.A1H("flowEndFail|", str, AnonymousClass000.A10()), str3);
            }
            AnonymousClass8BX.A13(this, j);
        }
    }

    public /* synthetic */ void flowEndSuccess(long j) {
        flowEndSuccess(j, "");
    }

    public void flowMarkPoint(long j, String str, String str2, String str3) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
            MarkerEditor withMarker = this.mQPL.withMarker(i, A02);
            withMarker.pointEditor(str).addPointData(DEBUG_INFO_ANNOTATION, str2);
            withMarker.markerEditingCompleted();
            return;
        }
        logUnstartedSession(i, 10088, str, str3);
    }

    public void flowStart(long j, String str, boolean z, long j2) {
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = j2;
        flowStartInternal(j, userFlowConfig, false, (String) null);
    }

    public boolean flowStartIfNotOngoing(long j, UserFlowConfig userFlowConfig) {
        return flowStartInternal(j, userFlowConfig, true, (String) null);
    }

    public /* synthetic */ PointEditor markPointWithEditor(long j, String str) {
        return markPointWithEditor(j, str, "");
    }

    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger, boolean z) {
        this(quickPerformanceLogger, z, true);
    }

    public /* synthetic */ void flowAnnotateWithCrucialData(long j, String str, String str2) {
        flowAnnotateWithCrucialData(j, str, str2, "");
    }

    public void flowMarkPoint(long j, String str) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
            this.mQPL.markerPoint(i, A02, str);
        } else {
            logUnstartedSession(i, 10088, str, "");
        }
    }

    public void flowStart(long j, String str, UserFlowConfig userFlowConfig) {
        flowStartInternal(j, userFlowConfig, false, str);
    }

    public void flowAnnotateWithCrucialData(long j, String str, String str2, String str3) {
        int i = (int) j;
        int A02 = AnonymousClass8BR.A02(j);
        if (!this.mStrictMode || AnonymousClass8BW.A1R(this, j)) {
            this.mQPL.markerAnnotateCrucialForUserFlow(i, A02, str, str2);
        } else {
            logUnstartedSession(i, 10087, str, str3);
        }
    }

    public void flowStart(long j, UserFlowConfig userFlowConfig) {
        flowStartInternal(j, userFlowConfig, false, (String) null);
    }
}
