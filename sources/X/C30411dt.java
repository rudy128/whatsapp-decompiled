package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* renamed from: X.1dt  reason: invalid class name and case insensitive filesystem */
public abstract class C30411dt implements C30391dr, C30401ds, Serializable {
    public final C30391dr completion;

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        C30391dr r2 = this;
        while (true) {
            C30411dt r22 = (C30411dt) r2;
            C30391dr r1 = r22.completion;
            C18070vi.A0b(r1);
            try {
                obj = r22.invokeSuspend(obj);
                if (obj == C31751g4.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new AnonymousClass1IU(th);
            }
            r22.releaseIntercepted();
            if (r1 instanceof C30411dt) {
                r2 = r1;
            } else {
                r1.resumeWith(obj);
                return;
            }
        }
    }

    public static C30391dr A04(Object obj, Object obj2, C30411dt r2) {
        return r2.create(obj2, (C30391dr) obj);
    }

    public C30391dr create(C30391dr r3) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public C30401ds getCallerFrame() {
        C30391dr r1 = this.completion;
        if (r1 instanceof C30401ds) {
            return (C30401ds) r1;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public C30411dt(C30391dr r1) {
        this.completion = r1;
    }

    public final C30391dr getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        int i2;
        String obj;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj2;
        int i3;
        Integer num;
        Class<?> cls = getClass();
        DebugMetadata debugMetadata = (DebugMetadata) cls.getAnnotation(DebugMetadata.class);
        if (debugMetadata == null) {
            return null;
        }
        int v = debugMetadata.v();
        if (v <= 1) {
            try {
                Field declaredField = cls.getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj3 = declaredField.get(this);
                if (!(obj3 instanceof Integer) || (num = (Integer) obj3) == null) {
                    i3 = 0;
                } else {
                    i3 = num.intValue();
                }
                i = i3 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i < 0) {
                i2 = -1;
            } else {
                i2 = debugMetadata.l()[i];
            }
            C54642eT r8 = AnonymousClass2WW.A00;
            if (r8 == null) {
                try {
                    r8 = new C54642eT(Class.class.getDeclaredMethod("getModule", new Class[0]), cls.getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), cls.getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, new Class[0]));
                    AnonymousClass2WW.A00 = r8;
                } catch (Exception unused2) {
                    r8 = AnonymousClass2WW.A01;
                    AnonymousClass2WW.A00 = r8;
                }
            }
            String str = null;
            if (!(r8 == AnonymousClass2WW.A01 || (method = r8.A01) == null || (invoke = method.invoke(cls, new Object[0])) == null || (method2 = r8.A00) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null)) {
                Method method3 = r8.A02;
                if (method3 != null) {
                    obj2 = method3.invoke(invoke2, new Object[0]);
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str = (String) obj2;
                }
            }
            if (str == null) {
                obj = debugMetadata.c();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('/');
                sb.append(debugMetadata.c());
                obj = sb.toString();
            }
            return new StackTraceElement(obj, debugMetadata.m(), debugMetadata.f(), i2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Debug metadata version mismatch. Expected: ");
        sb2.append(1);
        sb2.append(", got ");
        sb2.append(v);
        sb2.append(". Please update the Kotlin standard library.");
        throw new IllegalStateException(sb2.toString());
    }

    public C30391dr create(Object obj, C30391dr r4) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
