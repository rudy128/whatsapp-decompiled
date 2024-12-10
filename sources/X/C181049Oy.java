package X;

import java.util.concurrent.Future;

/* renamed from: X.9Oy  reason: invalid class name and case insensitive filesystem */
public abstract class C181049Oy {
    public static Object A00(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    AnonymousClass8BS.A0x();
                }
                throw th;
            }
        }
        if (z) {
            AnonymousClass8BS.A0x();
        }
        return obj;
    }
}
