package com.facebook.jni;

import X.AnonymousClass000;
import X.AnonymousClass1AK;
import X.AnonymousClass1AT;

public class HybridData {
    public final Destructor mDestructor = new AnonymousClass1AT(this);

    public class Destructor extends AnonymousClass1AT {
        public volatile long mNativePointer;

        public static native void deleteNative(long j);

        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }

        public Destructor(Object obj) {
            super(obj);
        }
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    static {
        AnonymousClass1AK.A01("fbjni");
    }

    public boolean isValid() {
        return AnonymousClass000.A1O((this.mDestructor.mNativePointer > 0 ? 1 : (this.mDestructor.mNativePointer == 0 ? 0 : -1)));
    }
}
