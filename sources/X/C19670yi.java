package X;

import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.0yi  reason: invalid class name and case insensitive filesystem */
public final class C19670yi {
    public final SharedPreferences A00;
    public final ArrayDeque A01 = new ArrayDeque();
    public final Executor A02;

    public C19670yi(SharedPreferences sharedPreferences, Executor executor) {
        this.A00 = sharedPreferences;
        this.A02 = executor;
    }
}
