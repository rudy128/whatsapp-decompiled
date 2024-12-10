package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Deprecated
/* renamed from: X.CsR  reason: case insensitive filesystem */
public final class C26107CsR {
    public static C26107CsR A02 = new C26107CsR();
    public final Map A00 = C17880vN.A11();
    public final Map A01 = C17880vN.A11();

    public static C25519ChH A00(C26107CsR csR, Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap A11 = C17880vN.A11();
        if (superclass != null) {
            C25519ChH chH = (C25519ChH) csR.A00.get(superclass);
            if (chH == null) {
                chH = A00(csR, superclass, (Method[]) null);
            }
            A11.putAll(chH.A01);
        }
        for (Class cls2 : cls.getInterfaces()) {
            C25519ChH chH2 = (C25519ChH) csR.A00.get(cls2);
            if (chH2 == null) {
                chH2 = A00(csR, cls2, (Method[]) null);
            }
            Iterator A15 = AnonymousClass000.A15(chH2.A01);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                A01((CY9) A16.getKey(), (C27581Wq) A16.getValue(), cls, A11);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (AnonymousClass1F9.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw AnonymousClass000.A0k("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C27581Wq value = onLifecycleEvent.value();
                if (length > 1) {
                    if (!C27581Wq.class.isAssignableFrom(parameterTypes[1])) {
                        throw AnonymousClass000.A0k("invalid parameter type. second arg must be an event");
                    } else if (value == C27581Wq.ON_ANY) {
                        i = 2;
                        if (length > 2) {
                            throw AnonymousClass000.A0k("cannot have more than 2 params");
                        }
                    } else {
                        throw AnonymousClass000.A0k("Second arg is supported only for ON_ANY value");
                    }
                }
                A01(new CY9(method, i), value, cls, A11);
                z = true;
            }
        }
        C25519ChH chH3 = new C25519ChH(A11);
        csR.A00.put(cls, chH3);
        BE7.A1J(cls, csR.A01, z);
        return chH3;
    }

    public static void A01(CY9 cy9, C27581Wq r5, Class cls, Map map) {
        Object obj = map.get(cy9);
        if (obj == null) {
            map.put(cy9, r5);
        } else if (r5 != obj) {
            Method method = cy9.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Method ");
            A10.append(method.getName());
            A10.append(" in ");
            BE7.A1E(cls, A10);
            A10.append(" already declared with different @OnLifecycleEvent value: previous value ");
            A10.append(obj);
            throw AnonymousClass8BX.A0V(r5, ", new value ", A10);
        }
    }
}
