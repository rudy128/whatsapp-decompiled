package com.facebook.systrace;

import X.AnonymousClass8BR;
import X.BE6;
import X.C221718w;
import X.C25324CdV;
import X.C25394Cev;
import X.C25437Cfk;
import X.C25457CgA;
import X.C25665Cjv;
import X.C25927Coq;
import X.C27247DaR;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Systrace {
    public static final ThreadLocal A00 = new C27247DaR();
    public static final AtomicInteger A01 = new AtomicInteger();
    public static final String[][] A02 = {new String[]{"com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onActivate", "com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onDeactivate"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerEnd"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsEnd"}};

    static {
        C25665Cjv cjv = C25927Coq.A01;
        if (C25457CgA.A03) {
            Method method = C25457CgA.A02;
            C221718w.A00(method);
            Object[] objArr = new Object[1];
            AnonymousClass8BR.A1L(objArr, 0, true);
            C25457CgA.A00(method, objArr);
        }
        C25927Coq.A00(false);
        C25324CdV cdV = C25324CdV.$redex_init_class;
    }

    public static char A00(char c) {
        if (c == 0 || c == 13 || c == ';' || c == '|' || c == 9 || c == 10) {
            return ' ';
        }
        return c;
    }

    public static void A01() {
        if (Build.VERSION.SDK_INT >= 30) {
            C25394Cev.A00();
        }
        if (!A04(32)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeEndSection();
        } else {
            C25437Cfk.A00("E");
        }
    }

    public static void A02(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            C25394Cev.A00();
        }
        if (!A04(32)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeBeginSection(str);
            return;
        }
        FileOutputStream fileOutputStream = C25437Cfk.A00;
        StringBuilder A0t = BE6.A0t(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        A0t.append('B');
        int myPid = Process.myPid();
        A0t.append('|');
        A0t.append(myPid);
        A0t.append('|');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            A0t.append(A00(str.charAt(i)));
        }
        C25437Cfk.A00(A0t.toString());
    }

    public static void A03(String str, int i, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C25394Cev.A00();
        }
        if (!A04(64)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeTraceMetadata(str, str2, i);
            return;
        }
        FileOutputStream fileOutputStream = C25437Cfk.A00;
        StringBuilder A0t = BE6.A0t(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        A0t.append('M');
        int myPid = Process.myPid();
        A0t.append('|');
        A0t.append(myPid);
        A0t.append('|');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            A0t.append(A00(str.charAt(i2)));
        }
        A0t.append('|');
        A0t.append(i);
        A0t.append('|');
        int length2 = str2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            A0t.append(A00(str2.charAt(i3)));
        }
        C25437Cfk.A00(A0t.toString());
    }

    public static boolean A04(long j) {
        if ((j & C25927Coq.A02) != 0) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        if ((j == 4 || j == 274877906944L) && Trace.isEnabled()) {
            return true;
        }
        return false;
    }
}
