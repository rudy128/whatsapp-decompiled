package com.facebook.profilo.mmapbuf.core;

import X.AnonymousClass000;
import X.AnonymousClass1A8;
import X.C17890vO;
import X.C25634CjL;
import com.facebook.jni.HybridData;
import java.io.File;

public class MmapBufferManager {
    public static final MmapBufferManager $redex_init_class = null;
    public final C25634CjL mFileHelper;
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native Buffer nativeAllocateBuffer(int i);

    private native Buffer nativeAllocateBuffer(int i, String str);

    private native boolean nativeDeallocateBuffer(Buffer buffer);

    public synchronized boolean deallocateBuffer(Buffer buffer) {
        return nativeDeallocateBuffer(buffer);
    }

    static {
        AnonymousClass1A8.A06("profilo_mmapbuf");
    }

    public Buffer allocateBuffer(int i, boolean z) {
        if (!z) {
            return nativeAllocateBuffer(i);
        }
        String A0Q = C17890vO.A0Q();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(C25634CjL.A00(A0Q));
        String A01 = this.mFileHelper.A01(AnonymousClass000.A0y(".buff", A10));
        if (A01 == null) {
            return null;
        }
        return nativeAllocateBuffer(i, A01);
    }

    public MmapBufferManager(File file) {
        this.mFileHelper = new C25634CjL(file);
    }
}
