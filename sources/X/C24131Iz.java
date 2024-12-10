package X;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.1Iz  reason: invalid class name and case insensitive filesystem */
public class C24131Iz extends C24121Iy {
    public static C24131Iz A01;
    public static final AnonymousClass1GH A02 = AnonymousClass1J1.A00;
    public final Application A00;

    public AnonymousClass1J2 BG9(Class cls) {
        C18070vi.A0d(cls, 0);
        Application application = this.A00;
        if (application != null) {
            return A00(application, cls);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public AnonymousClass1J2 BGl(C24091Iv r3, Class cls) {
        C18070vi.A0d(cls, 0);
        C18070vi.A0d(r3, 1);
        if (this.A00 != null) {
            return BG9(cls);
        }
        Application application = (Application) r3.A00(A02);
        if (application != null) {
            return A00(application, cls);
        }
        if (!AnonymousClass8FK.class.isAssignableFrom(cls)) {
            return super.BG9(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    private final AnonymousClass1J2 A00(Application application, Class cls) {
        if (!AnonymousClass8FK.class.isAssignableFrom(cls)) {
            return super.BG9(cls);
        }
        try {
            AnonymousClass1J2 r0 = (AnonymousClass1J2) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
            C18070vi.A0V(r0);
            return r0;
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e2);
        } catch (InstantiationException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot create an instance of ");
            sb3.append(cls);
            throw new RuntimeException(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Cannot create an instance of ");
            sb4.append(cls);
            throw new RuntimeException(sb4.toString(), e4);
        }
    }

    public C24131Iz(Application application) {
        this.A00 = application;
    }

    public C24131Iz() {
        this.A00 = null;
    }
}
