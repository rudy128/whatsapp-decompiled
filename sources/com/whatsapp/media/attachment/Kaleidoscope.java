package com.whatsapp.media.attachment;

import X.AnonymousClass1AK;
import X.AnonymousClass2RN;
import X.C17970vW;
import X.C64062u9;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kaleidoscope implements Closeable {
    public static long nativeObject;

    public static native KaleidoscopeCheckResult check(long j, String str);

    public static native KaleidoscopeCheckResult classify(long j, String str, String str2, String str3, int i);

    public static native int destroy(long j);

    public static native long init(int i);

    public static native boolean matchAny(long j, String str, List list, List list2);

    public final class KaleidoscopeCheckResult {
        public String errorMsg;
        public List extensions;
        public String mimetype;
        public long reason;
        public int score;

        public KaleidoscopeCheckResult(String str) {
            this.extensions = Collections.emptyList();
            this.mimetype = "application/octet-stream";
            this.score = 0;
            this.reason = 0;
            this.errorMsg = str;
        }

        public KaleidoscopeCheckResult(String str, String str2, int i, long j) {
            this.extensions = Collections.emptyList();
            this.mimetype = "application/octet-stream";
            this.errorMsg = null;
            this.score = 0;
            this.reason = 0;
            if (str != null) {
                this.extensions = Arrays.asList(str.split("/"));
            }
            if (str2 != null) {
                this.mimetype = str2;
            }
            this.score = i;
            this.reason = j;
        }
    }

    public static synchronized long getNativeObjectInstance() {
        long j;
        synchronized (Kaleidoscope.class) {
            j = nativeObject;
            if (j == 0) {
                Boolean bool = C17970vW.A03;
                AnonymousClass1AK.A01("kaleidoscope");
                j = init(0);
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

    public KaleidoscopeCheckResult check(String str) {
        KaleidoscopeCheckResult check = check(getNativeObjectInstance(), str);
        if (check != null) {
            return check;
        }
        throw new FileNotFoundException(str);
    }

    public KaleidoscopeCheckResult classify(String str, String str2, String str3, int i) {
        KaleidoscopeCheckResult classify = classify(getNativeObjectInstance(), str, str2, str3, i);
        if (classify == null) {
            throw new FileNotFoundException(str);
        } else if (classify.score >= 0) {
            return classify;
        } else {
            throw new AnonymousClass2RN(classify.errorMsg);
        }
    }

    public boolean matchAny(String str, List list, List list2) {
        return matchAny(getNativeObjectInstance(), str, list, list2);
    }

    public KaleidoscopeCheckResult classify(File file, String str, int i) {
        String absolutePath = file.getAbsolutePath();
        return classify(absolutePath, C64062u9.A09(absolutePath), str, i);
    }

    public KaleidoscopeCheckResult classify(String str, String str2, String str3) {
        return classify(str, str2, str3, 0);
    }

    public KaleidoscopeCheckResult classify(File file, String str) {
        return classify(file, str, 0);
    }
}
