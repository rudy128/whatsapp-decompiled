package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* renamed from: X.CsD  reason: case insensitive filesystem */
public final class C26093CsD {
    public static final C26093CsD A00 = new Object();
    public static final Map A01 = C17880vN.A11();
    public static final Map A02 = C17880vN.A11();

    public static final void A01(Object obj, Constructor constructor) {
        try {
            C18070vi.A0X(constructor.newInstance(AnonymousClass000.A1b(obj, 1)));
        } catch (IllegalAccessException e) {
            throw AnonymousClass8BR.A0x(e);
        } catch (InstantiationException e2) {
            throw AnonymousClass8BR.A0x(e2);
        } catch (InvocationTargetException e3) {
            throw AnonymousClass8BR.A0x(e3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r0.booleanValue() != false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C26093CsD r10, java.lang.Class r11) {
        /*
            java.util.Map r5 = A02
            java.lang.Number r0 = X.C108945cZ.A1E(r11, r5)
            if (r0 == 0) goto L_0x000d
            int r0 = r0.intValue()
            return r0
        L_0x000d:
            java.lang.String r0 = r11.getCanonicalName()
            r7 = 1
            if (r0 == 0) goto L_0x009b
            java.lang.Package r0 = r11.getPackage()     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            java.lang.String r8 = r11.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r6 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
        L_0x0022:
            X.C18070vi.A0a(r6)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            int r4 = r6.length()     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            if (r4 == 0) goto L_0x0035
            X.C18070vi.A0X(r8)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            java.lang.String r8 = X.BE6.A0p(r4, r8)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            X.C18070vi.A0X(r8)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
        L_0x0035:
            X.C18070vi.A0a(r8)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            java.lang.String r1 = "."
            java.lang.String r0 = "_"
            r3 = 0
            java.lang.String r0 = X.AnonymousClass1YE.A07(r8, r1, r0, r3)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            r2.append(r0)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            java.lang.String r0 = "_LifecycleAdapter"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            goto L_0x0052
        L_0x004f:
            java.lang.String r6 = ""
            goto L_0x0022
        L_0x0052:
            if (r4 == 0) goto L_0x005e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r6)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            r0 = 46
            java.lang.String r2 = X.C17890vO.A0Z(r2, r1, r0)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
        L_0x005e:
            java.lang.Class r1 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>"
            X.C18070vi.A0z(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            r0[r3] = r11     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            java.lang.reflect.Constructor r2 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            boolean r0 = r2.isAccessible()     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
            if (r0 != 0) goto L_0x0078
            r2.setAccessible(r7)     // Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0083 }
        L_0x0078:
            java.util.Map r1 = A01
            java.util.List r0 = X.C18070vi.A0M(r2)
            r1.put(r11, r0)
            goto L_0x011d
        L_0x0083:
            r0 = move-exception
            java.lang.RuntimeException r2 = X.AnonymousClass8BR.A0x(r0)
            throw r2
        L_0x0089:
            X.CsR r9 = X.C26107CsR.A02
            java.util.Map r8 = r9.A01
            java.lang.Object r0 = r8.get(r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bd
        L_0x009b:
            r0 = 1
        L_0x009c:
            X.C17880vN.A1P(r11, r5, r0)
            return r0
        L_0x00a0:
            java.lang.reflect.Method[] r6 = r11.getDeclaredMethods()     // Catch:{ NoClassDefFoundError -> 0x0120 }
            int r4 = r6.length
            r3 = 0
            r2 = 0
        L_0x00a7:
            if (r2 >= r4) goto L_0x00ba
            r1 = r6[r2]
            java.lang.Class<androidx.lifecycle.OnLifecycleEvent> r0 = androidx.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            if (r0 == 0) goto L_0x00b7
            X.C26107CsR.A00(r9, r11, r6)
            goto L_0x009b
        L_0x00b7:
            int r2 = r2 + 1
            goto L_0x00a7
        L_0x00ba:
            X.BE7.A1J(r11, r8, r3)
        L_0x00bd:
            java.lang.Class r1 = r11.getSuperclass()
            if (r1 == 0) goto L_0x0114
            java.lang.Class<X.17o> r0 = X.C218317o.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0114
            int r0 = A00(r10, r1)
            if (r0 == r7) goto L_0x009b
            java.util.Map r0 = A01
            java.lang.Object r0 = r0.get(r1)
            X.C18070vi.A0b(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r6 = X.C17880vN.A10(r0)
        L_0x00e0:
            java.lang.Class[] r4 = r11.getInterfaces()
            X.C18070vi.A0X(r4)
            int r3 = r4.length
            r2 = 0
        L_0x00e9:
            if (r2 >= r3) goto L_0x0116
            r1 = r4[r2]
            if (r1 == 0) goto L_0x0111
            java.lang.Class<X.17o> r0 = X.C218317o.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0111
            int r0 = A00(r10, r1)
            if (r0 == r7) goto L_0x009b
            if (r6 != 0) goto L_0x0103
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
        L_0x0103:
            java.util.Map r0 = A01
            java.lang.Object r0 = r0.get(r1)
            X.C18070vi.A0b(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r6.addAll(r0)
        L_0x0111:
            int r2 = r2 + 1
            goto L_0x00e9
        L_0x0114:
            r6 = 0
            goto L_0x00e0
        L_0x0116:
            if (r6 == 0) goto L_0x009b
            java.util.Map r0 = A01
            r0.put(r11, r6)
        L_0x011d:
            r0 = 2
            goto L_0x009c
        L_0x0120:
            r1 = move-exception
            java.lang.String r0 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26093CsD.A00(X.CsD, java.lang.Class):int");
    }
}
