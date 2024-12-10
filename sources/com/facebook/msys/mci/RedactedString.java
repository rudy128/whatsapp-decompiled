package com.facebook.msys.mci;

import X.C17960vV;
import com.facebook.simplejni.NativeHolder;

public class RedactedString {
    public NativeHolder mNativeHolder;

    private native boolean equalsNative(Object obj);

    public static native NativeHolder initNativeHolder(String str);

    public static native NativeHolder initNativeHolder(String str, int i);

    public native String getOriginalString();

    public native int hashCode();

    public native int leakAllowance();

    public native String toString();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof RedactedString)) {
            return false;
        }
        return equalsNative(obj);
    }

    public RedactedString(String str) {
        C17960vV.A07(str);
        this.mNativeHolder = initNativeHolder(str);
    }

    public RedactedString(String str, int i) {
        C17960vV.A07(str);
        this.mNativeHolder = initNativeHolder(str, i);
    }

    public RedactedString(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
