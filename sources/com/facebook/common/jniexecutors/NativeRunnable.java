package com.facebook.common.jniexecutors;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1AK;
import X.C18070vi;
import X.C26294Cx6;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.jni.HybridData;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

public class NativeRunnable implements Runnable {
    public HybridData mHybridData;
    public volatile String mNativeExecutor;

    private native void nativeRun();

    static {
        AnonymousClass1AK.A00("jniexecutors");
    }

    public void run() {
        String str = "%s";
        if (Systrace.A04(32)) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str, (Object) this);
            } catch (IllegalFormatException e) {
                C26294Cx6.A0C("Tracer", "Bad format string", e);
            }
            C18070vi.A0b(str);
            Systrace.A02(str);
        }
        try {
            nativeRun();
        } finally {
            Systrace.A01();
        }
    }

    public String toString() {
        String str = this.mNativeExecutor;
        if (str == null) {
            return "NativeRunnable";
        }
        return AnonymousClass001.A1H("NativeRunnable - ", str, AnonymousClass000.A10());
    }

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
