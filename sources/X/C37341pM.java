package X;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.1pM  reason: invalid class name and case insensitive filesystem */
public final class C37341pM extends C27631Wv implements C24051Ir {
    public C23381Fv A00;
    public AnonymousClass1GB A01;
    public Application A02;
    public Bundle A03;
    public final C24051Ir A04;

    public C37341pM(Application application, Bundle bundle, AnonymousClass1FE r4) {
        C24131Iz r0;
        C18070vi.A0d(r4, 2);
        this.A01 = r4.BYX();
        this.A00 = r4.getLifecycle();
        this.A03 = bundle;
        this.A02 = application;
        if (application != null) {
            r0 = C24131Iz.A01;
            if (r0 == null) {
                r0 = new C24131Iz(application);
                C24131Iz.A01 = r0;
            }
        } else {
            r0 = new C24131Iz();
        }
        this.A04 = r0;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.1Iy, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        r2 = r9.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1J2 A00(java.lang.Class r10, java.lang.String r11) {
        /*
            r9 = this;
            r6 = 0
            r5 = 1
            X.1Fv r8 = r9.A00
            if (r8 == 0) goto L_0x0075
            java.lang.Class<X.8FK> r0 = X.AnonymousClass8FK.class
            boolean r7 = r0.isAssignableFrom(r10)
            if (r7 == 0) goto L_0x0025
            android.app.Application r0 = r9.A02
            if (r0 == 0) goto L_0x0025
            java.util.List r0 = X.C62942sF.A00
        L_0x0014:
            java.lang.reflect.Constructor r4 = X.C62942sF.A01(r10, r0)
            if (r4 != 0) goto L_0x0038
            android.app.Application r0 = r9.A02
            if (r0 == 0) goto L_0x0028
            X.1Ir r0 = r9.A04
            X.1J2 r0 = r0.BG9(r10)
            return r0
        L_0x0025:
            java.util.List r0 = X.C62942sF.A01
            goto L_0x0014
        L_0x0028:
            X.1Iy r0 = X.C24121Iy.A00
            if (r0 != 0) goto L_0x0033
            X.1Iy r0 = new X.1Iy
            r0.<init>()
            X.C24121Iy.A00 = r0
        L_0x0033:
            X.1J2 r0 = r0.BG9(r10)
            return r0
        L_0x0038:
            X.1GB r2 = r9.A01
            X.C18070vi.A0b(r2)
            android.os.Bundle r1 = r9.A03
            X.C18070vi.A0d(r2, r6)
            android.os.Bundle r0 = r2.A00(r11)
            X.1pP r0 = X.C37371pQ.A00(r0, r1)
            X.2vf r3 = new X.2vf
            r3.<init>(r0, r11)
            r3.A00(r8, r2)
            X.C60272ng.A01(r8, r2)
            if (r7 == 0) goto L_0x006e
            android.app.Application r2 = r9.A02
            if (r2 == 0) goto L_0x006e
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r6] = r2
            X.1pP r0 = r3.A01
            r1[r5] = r0
        L_0x0064:
            X.1J2 r1 = X.C62942sF.A00(r10, r4, r1)
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            r1.A0Q(r3, r0)
            return r1
        L_0x006e:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.1pP r0 = r3.A01
            r1[r6] = r0
            goto L_0x0064
        L_0x0075:
            java.lang.String r1 = "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37341pM.A00(java.lang.Class, java.lang.String):X.1J2");
    }

    public AnonymousClass1J2 BG9(Class cls) {
        C18070vi.A0d(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return A00(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public AnonymousClass1J2 BGl(C24091Iv r7, Class cls) {
        List list;
        C18070vi.A0d(cls, 0);
        C18070vi.A0d(r7, 1);
        String str = (String) r7.A00(C24121Iy.A01);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (r7.A00(AnonymousClass1GG.A01) != null && r7.A00(AnonymousClass1GG.A02) != null) {
            Object A002 = r7.A00(C24131Iz.A02);
            boolean isAssignableFrom = AnonymousClass8FK.class.isAssignableFrom(cls);
            if (!isAssignableFrom || A002 == null) {
                list = C62942sF.A01;
            } else {
                list = C62942sF.A00;
            }
            Constructor A012 = C62942sF.A01(cls, list);
            if (A012 == null) {
                return this.A04.BGl(r7, cls);
            }
            if (!isAssignableFrom || A002 == null) {
                return C62942sF.A00(cls, A012, AnonymousClass1GG.A00(r7));
            }
            return C62942sF.A00(cls, A012, A002, AnonymousClass1GG.A00(r7));
        } else if (this.A00 != null) {
            return A00(cls, str);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public C37341pM() {
        this.A04 = new C24131Iz();
    }
}
