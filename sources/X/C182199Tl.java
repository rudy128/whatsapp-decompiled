package X;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.9Tl  reason: invalid class name and case insensitive filesystem */
public abstract class C182199Tl {
    public static final Collection A00;

    static {
        Class<CoroutineExceptionHandler> cls = CoroutineExceptionHandler.class;
        A00 = AnonymousClass1b2.A06(AnonymousClass1JO.A01(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }
}
