package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.0yc  reason: invalid class name and case insensitive filesystem */
public final class C19610yc {
    public static WeakReference A03;
    public C19670yi A00;
    public final SharedPreferences A01;
    public final Executor A02;

    public synchronized C62252r6 A00() {
        String str;
        C62252r6 r3;
        ArrayDeque arrayDeque = this.A00.A01;
        synchronized (arrayDeque) {
            str = (String) arrayDeque.peek();
        }
        r3 = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                r3 = new C62252r6(split[0], split[1]);
            }
        }
        return r3;
    }

    public C19610yc(SharedPreferences sharedPreferences, Executor executor) {
        this.A02 = executor;
        this.A01 = sharedPreferences;
    }
}
