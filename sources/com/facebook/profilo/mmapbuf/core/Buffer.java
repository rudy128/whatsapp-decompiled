package com.facebook.profilo.mmapbuf.core;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1A8;
import X.C108945cZ;
import X.C25634CjL;
import android.util.Log;
import com.facebook.jni.HybridData;
import java.io.File;

public class Buffer {
    public static final String LOG_TAG = "Prflo/Buffer";
    public final HybridData mHybridData;

    private native void nativeUpdateId(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String generateLocalSymbolsFilePath() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.getFilePath()     // Catch:{ all -> 0x003d }
            boolean r0 = X.AnonymousClass000.A1W(r0)     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x000e:
            java.lang.String r0 = r3.getLocalSymbolsFilePath()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x003b
            java.io.File r0 = r3.getBufferContainingFolder()     // Catch:{ all -> 0x003d }
            X.CjL r2 = new X.CjL     // Catch:{ all -> 0x003d }
            r2.<init>(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = X.C17890vO.A0Q()     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x003d }
            java.lang.String r0 = X.C25634CjL.A00(r0)     // Catch:{ all -> 0x003d }
            r1.append(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = ".sym"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = r2.A01(r0)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003b
            r3.updateLocalSymbolsFilePath(r0)     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r3)
            return r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.mmapbuf.core.Buffer.generateLocalSymbolsFilePath():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String generateMemoryMappingFilePath() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.getFilePath()     // Catch:{ all -> 0x003d }
            boolean r0 = X.AnonymousClass000.A1W(r0)     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x000e:
            java.lang.String r0 = r3.getMemoryMappingFilePath()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x003b
            java.io.File r0 = r3.getBufferContainingFolder()     // Catch:{ all -> 0x003d }
            X.CjL r2 = new X.CjL     // Catch:{ all -> 0x003d }
            r2.<init>(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = X.C17890vO.A0Q()     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x003d }
            java.lang.String r0 = X.C25634CjL.A00(r0)     // Catch:{ all -> 0x003d }
            r1.append(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = ".maps"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = r2.A01(r0)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003b
            r3.updateMemoryMappingFilePath(r0)     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r3)
            return r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.mmapbuf.core.Buffer.generateMemoryMappingFilePath():java.lang.String");
    }

    public native synchronized String getFilePath();

    public native synchronized String getLocalSymbolsFilePath();

    public native synchronized String getMemoryMappingFilePath();

    public native synchronized boolean isForeground();

    public native synchronized void setForegroundState(boolean z);

    public native synchronized void updateFilePath(String str);

    public native synchronized void updateHeader(int i, long j, long j2, long j3);

    public synchronized void updateId(String str, String str2) {
        String str3;
        if (AnonymousClass000.A1W(getFilePath())) {
            if (str == null) {
                str3 = str2;
            } else {
                str3 = AnonymousClass001.A1H("_", str2, AnonymousClass000.A11(str));
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(C25634CjL.A00(str3));
            String A01 = new C25634CjL(getBufferContainingFolder()).A01(AnonymousClass000.A0y(".buff", A10));
            if (A01 != null) {
                try {
                    nativeUpdateId(str2);
                    updateFilePath(A01);
                } catch (Exception e) {
                    Log.e(LOG_TAG, "Id update failed", e);
                }
            }
        }
        return;
    }

    public native synchronized void updateLocalSymbolsFilePath(String str);

    public native synchronized void updateMemoryMappingFilePath(String str);

    static {
        AnonymousClass1A8.A06("profilo_mmapbuf");
    }

    public Buffer(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private File getBufferContainingFolder() {
        return C108945cZ.A17(getFilePath()).getParentFile();
    }

    public boolean isFileBacked() {
        return AnonymousClass000.A1W(getFilePath());
    }

    public synchronized void updateId(String str) {
        updateId((String) null, str);
    }
}
