package X;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.9Se  reason: invalid class name and case insensitive filesystem */
public abstract class C181879Se {
    public static final void A00(C18560wh r4, Throwable th) {
        Throwable runtimeException;
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) r4.get(CoroutineExceptionHandler.A00);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(r4, th);
                return;
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException2 = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C25359CeJ.A01(runtimeException2, th);
                th = runtimeException2;
            }
        }
        for (CoroutineExceptionHandler handleException : C182199Tl.A00) {
            try {
                handleException.handleException(r4, th);
            } catch (AnonymousClass9LS unused) {
                return;
            } catch (Throwable th3) {
                if (th == th3) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    C25359CeJ.A01(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            C25359CeJ.A01(th, new C21579AmT(r4));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
