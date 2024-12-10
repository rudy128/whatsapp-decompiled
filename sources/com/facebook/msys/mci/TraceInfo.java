package com.facebook.msys.mci;

import X.C17960vV;
import com.facebook.simplejni.NativeHolder;

public class TraceInfo {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native String getTraceIdNative(long j);

    private native Integer getTraceTypeNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(Integer num, String str);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TraceInfo)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj2, ((TraceInfo) obj2).mNativeHolder.mNativePointer);
    }

    public String getTraceId() {
        return getTraceIdNative(this.mNativeHolder.mNativePointer);
    }

    public Integer getTraceType() {
        return getTraceTypeNative(this.mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }

    public TraceInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public TraceInfo(Integer num, String str) {
        C17960vV.A07(num);
        C17960vV.A07(str);
        this.mNativeHolder = initNativeHolder(num, str);
    }
}
