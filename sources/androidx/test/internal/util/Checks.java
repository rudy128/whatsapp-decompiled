package androidx.test.internal.util;

import X.AnonymousClass000;
import android.os.StrictMode;
import androidx.test.internal.platform.ThreadChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

public abstract class Checks {
    public static final ThreadChecker A00;

    static {
        ThreadChecker threadChecker;
        Class<ThreadChecker> cls = ThreadChecker.class;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator<S> it = ServiceLoader.load(cls).iterator();
        while (it.hasNext()) {
            A13.add(it.next());
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (A13.isEmpty()) {
            threadChecker = new ThreadChecker() {
            };
        } else if (A13.size() == 1) {
            threadChecker = (ThreadChecker) A13.get(0);
        } else {
            throw AnonymousClass000.A0n(String.format("Found more than one %s implementations.", new Object[]{cls.getName()}));
        }
        A00 = threadChecker;
    }
}
