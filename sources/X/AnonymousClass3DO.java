package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.3DO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DO implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new C201010v(new C146757Qm((Object) runnable, 44), "DecryptMessageExecutor");
    }
}
