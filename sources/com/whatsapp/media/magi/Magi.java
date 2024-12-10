package com.whatsapp.media.magi;

import X.AnonymousClass1AK;
import X.AnonymousClass6S9;
import X.C17970vW;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Magi implements Closeable {
    public static long nativeObject;

    public static native MagiCheckResult check(long j, String str);

    public static native MagiClassifyResult classify(long j, String str, String str2, String str3);

    public static native long create(int i);

    public static native void destroy(long j);

    public final class MagiCheckResult {
        public String errorMsg;
        public List extensions = Collections.emptyList();
        public String mimetype = "application/octet-stream";

        public MagiCheckResult(String str) {
            this.errorMsg = str;
        }
    }

    public final class MagiClassifyResult {
        public final MagiCheckResult checkResult;
        public final int returnValue;

        /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.whatsapp.media.magi.Magi$MagiCheckResult] */
        public MagiClassifyResult(int i, String str, String str2) {
            this.returnValue = i;
            ? obj = new Object();
            obj.extensions = Collections.emptyList();
            obj.mimetype = "application/octet-stream";
            obj.errorMsg = null;
            if (str != null) {
                obj.extensions = Arrays.asList(str.split("/"));
            }
            if (str2 != null) {
                obj.mimetype = str2;
            }
            this.checkResult = obj;
        }
    }

    public static synchronized long getNativeObjectInstance() {
        long j;
        synchronized (Magi.class) {
            j = nativeObject;
            if (j == 0) {
                Boolean bool = C17970vW.A03;
                AnonymousClass1AK.A01("kaleidoscope");
                j = create(0);
                nativeObject = j;
            }
        }
        return j;
    }

    public void close() {
        long j = nativeObject;
        if (j != 0) {
            destroy(j);
            nativeObject = 0;
        }
    }

    public MagiCheckResult check(String str) {
        MagiCheckResult check = check(getNativeObjectInstance(), str);
        if (check != null) {
            String str2 = check.errorMsg;
            if (str2 == null) {
                return check;
            }
            throw new AnonymousClass6S9(str2);
        }
        throw new FileNotFoundException(str);
    }
}
