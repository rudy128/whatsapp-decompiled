package X;

import android.os.Binder;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.8Kc  reason: invalid class name and case insensitive filesystem */
public class C162278Kc extends C161278Cn {
    public void A03() {
        MessageQueue myQueue = Looper.myQueue();
        while (true) {
            if (this instanceof C162298Ke) {
                C162298Ke r7 = (C162298Ke) this;
                Message A01 = r7.A01(myQueue);
                if (A01 != null) {
                    AnonymousClass9NS r5 = r7.A00;
                    Field field = r5.A01;
                    Object obj = null;
                    if (field != null) {
                        try {
                            obj = field.get(A01);
                        } catch (Throwable unused) {
                        }
                    }
                    Method method = r5.A02;
                    if (!(method == null || obj == null)) {
                        try {
                            Object obj2 = r5.A00;
                            Object[] A1b = AnonymousClass3MW.A1b();
                            AnonymousClass001.A1Q(A01, obj, A1b);
                            method.invoke(obj2, A1b);
                        } catch (Throwable unused2) {
                        }
                    }
                    r7.A02(A01);
                    Method method2 = r5.A03;
                    if (!(method2 == null || obj == null)) {
                        try {
                            Object obj3 = r5.A00;
                            Object[] A1b2 = AnonymousClass3MW.A1b();
                            AnonymousClass001.A1Q(A01, obj, A1b2);
                            method2.invoke(obj3, A1b2);
                        } catch (Throwable unused3) {
                        }
                    }
                    Binder.clearCallingIdentity();
                    try {
                        r7.A04.A03.invoke(A01, new Object[0]);
                    } catch (Throwable unused4) {
                    }
                } else {
                    return;
                }
            } else {
                Message A012 = A01(myQueue);
                if (A012 != null) {
                    A02(A012);
                    Binder.clearCallingIdentity();
                    this.A04.A03.invoke(A012, new Object[0]);
                } else {
                    return;
                }
            }
        }
    }
}
