package X;

/* renamed from: X.6Po  reason: invalid class name */
public final class AnonymousClass6Po extends AnonymousClass286 {
    public boolean A00 = true;
    public boolean A01;
    public final C130776jz A02;
    public final C24521Kq A03;
    public final AnonymousClass00H A04;

    public AnonymousClass6Po(C24521Kq r3, C130776jz r4, AnonymousClass00H r5) {
        C18070vi.A0d(r4, 2);
        this.A04 = r5;
        this.A02 = r4;
        this.A03 = r3;
    }

    public int A0T() {
        return C72453Mb.A0I(this.A02.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010b, code lost:
        r6 = r2.A00;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092 A[Catch:{ Exception -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U() {
        /*
            r17 = this;
            X.6wC r14 = X.C137896wC.A01     // Catch:{ Exception -> 0x016f }
            r12 = 0
            X.6hs r7 = r14.A00     // Catch:{ Exception -> 0x016f }
            boolean r0 = r7.A03     // Catch:{ Exception -> 0x016f }
            if (r0 != 0) goto L_0x0085
            java.lang.String r2 = "reflective setup failed using obj: %s method: %s field: %s"
            java.lang.String r10 = "mParams"
            java.lang.String r8 = "mViews"
            r6 = 1
            r7.A03 = r6     // Catch:{ Exception -> 0x016f }
            java.lang.String r5 = "android.view.WindowManagerGlobal"
            java.lang.String r9 = "getInstance"
            r4 = 3
            r3 = 2
            r1 = 0
            java.lang.Class r11 = java.lang.Class.forName(r5)     // Catch:{ InvocationTargetException -> 0x0056, ClassNotFoundException -> 0x0063, NoSuchFieldException -> 0x0072, NoSuchMethodException -> 0x0049, IllegalAccessException | RuntimeException -> 0x003a }
            java.lang.Object r0 = X.C108995ce.A0V(r11, r12, r9)     // Catch:{ InvocationTargetException -> 0x0056, ClassNotFoundException -> 0x0063, NoSuchFieldException -> 0x0072, NoSuchMethodException -> 0x0049, IllegalAccessException | RuntimeException -> 0x003a }
            r7.A00 = r0     // Catch:{ InvocationTargetException -> 0x0056, ClassNotFoundException -> 0x0063, NoSuchFieldException -> 0x0072, NoSuchMethodException -> 0x0049, IllegalAccessException | RuntimeException -> 0x003a }
            java.lang.reflect.Field r0 = r11.getDeclaredField(r8)     // Catch:{ InvocationTargetException -> 0x0056, ClassNotFoundException -> 0x0063, NoSuchFieldException -> 0x0072, NoSuchMethodException -> 0x0049, IllegalAccessException | RuntimeException -> 0x003a }
            r7.A02 = r0     // Catch:{ InvocationTargetException -> 0x0056, ClassNotFoundException -> 0x0063, NoSuchFieldException -> 0x0072, NoSuchMethodException -> 0x0049, IllegalAccessException | RuntimeException -> 0x003a }
            if (r0 == 0) goto L_0x002e
            r0.setAccessible(r6)     // Catch:{ InvocationTargetException -> 0x0056, ClassNotFoundException -> 0x0063, NoSuchFieldException -> 0x0072, NoSuchMethodException -> 0x0049, IllegalAccessException | RuntimeException -> 0x003a }
        L_0x002e:
            java.lang.reflect.Field r0 = r11.getDeclaredField(r10)     // Catch:{ InvocationTargetException -> 0x0056, ClassNotFoundException -> 0x0063, NoSuchFieldException -> 0x0072, NoSuchMethodException -> 0x0049, IllegalAccessException | RuntimeException -> 0x003a }
            r7.A01 = r0     // Catch:{ InvocationTargetException -> 0x0056, ClassNotFoundException -> 0x0063, NoSuchFieldException -> 0x0072, NoSuchMethodException -> 0x0049, IllegalAccessException | RuntimeException -> 0x003a }
            if (r0 == 0) goto L_0x0085
            r0.setAccessible(r6)     // Catch:{ InvocationTargetException -> 0x0056, ClassNotFoundException -> 0x0063, NoSuchFieldException -> 0x0072, NoSuchMethodException -> 0x0049, IllegalAccessException | RuntimeException -> 0x003a }
            goto L_0x0085
        L_0x003a:
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r0 = X.C108945cZ.A1a(r5, r9, r4, r6)     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r0 = X.C108945cZ.A1b(r8, r0, r3, r4)     // Catch:{ Exception -> 0x016f }
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)     // Catch:{ Exception -> 0x016f }
            goto L_0x0082
        L_0x0049:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r0 = X.C108945cZ.A1a(r9, r5, r3, r6)     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r3)     // Catch:{ Exception -> 0x016f }
            java.lang.String r0 = "could not find method: %s on %s"
            goto L_0x006d
        L_0x0056:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r0 = X.C108945cZ.A1a(r9, r5, r3, r6)     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r3)     // Catch:{ Exception -> 0x016f }
            java.lang.String r0 = "could not invoke: %s on %s"
            goto L_0x006d
        L_0x0063:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r1 = X.C108945cZ.A1b(r5, r0, r1, r6)     // Catch:{ Exception -> 0x016f }
            java.lang.String r0 = "could not find class: %s"
        L_0x006d:
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)     // Catch:{ Exception -> 0x016f }
            goto L_0x0082
        L_0x0072:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r0 = X.C108945cZ.A1a(r10, r8, r4, r6)     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r1 = X.C108945cZ.A1b(r5, r0, r3, r4)     // Catch:{ Exception -> 0x016f }
            java.lang.String r0 = "could not find field: %s or %s on %s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)     // Catch:{ Exception -> 0x016f }
        L_0x0082:
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x016f }
        L_0x0085:
            java.lang.Object r2 = r7.A00     // Catch:{ Exception -> 0x016f }
            r9 = 0
            if (r2 == 0) goto L_0x016f
            java.lang.reflect.Field r1 = r7.A02     // Catch:{ Exception -> 0x016f }
            if (r1 == 0) goto L_0x016f
            java.lang.reflect.Field r0 = r7.A01     // Catch:{ Exception -> 0x016f }
            if (r0 == 0) goto L_0x016f
            r5 = 2
            r6 = 3
            java.lang.String r4 = "Reflective access to %s or %s on %s failed."
            r3 = 1
            r8 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch:{ RuntimeException -> 0x015a, IllegalAccessException -> 0x0144 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ RuntimeException -> 0x015a, IllegalAccessException -> 0x0144 }
            java.lang.reflect.Field r1 = r7.A01     // Catch:{ RuntimeException -> 0x015a, IllegalAccessException -> 0x0144 }
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r0 = r7.A00     // Catch:{ RuntimeException -> 0x015a, IllegalAccessException -> 0x0144 }
            java.lang.Object r9 = r1.get(r0)     // Catch:{ RuntimeException -> 0x015a, IllegalAccessException -> 0x0144 }
        L_0x00a8:
            java.util.List r9 = (java.util.List) r9     // Catch:{ RuntimeException -> 0x015a, IllegalAccessException -> 0x0144 }
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x016f }
            if (r2 == 0) goto L_0x00dc
            java.util.Iterator r6 = r2.iterator()     // Catch:{ Exception -> 0x016f }
        L_0x00b4:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x016f }
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r4 = r6.next()     // Catch:{ Exception -> 0x016f }
            int r2 = r8 + 1
            if (r8 >= 0) goto L_0x00c6
            X.AnonymousClass1ZU.A0B()     // Catch:{ Exception -> 0x016f }
            throw r12     // Catch:{ Exception -> 0x016f }
        L_0x00c6:
            android.view.View r4 = (android.view.View) r4     // Catch:{ Exception -> 0x016f }
            if (r9 == 0) goto L_0x00da
            java.lang.Object r1 = r9.get(r8)     // Catch:{ Exception -> 0x016f }
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1     // Catch:{ Exception -> 0x016f }
            if (r1 == 0) goto L_0x00da
            X.6fU r0 = new X.6fU     // Catch:{ Exception -> 0x016f }
            r0.<init>(r4, r1)     // Catch:{ Exception -> 0x016f }
            r7.add(r0)     // Catch:{ Exception -> 0x016f }
        L_0x00da:
            r8 = r2
            goto L_0x00b4
        L_0x00dc:
            r6 = 0
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x016f }
            if (r0 != 0) goto L_0x016f
            int r0 = r7.size()     // Catch:{ Exception -> 0x016f }
            r2 = r6
        L_0x00e8:
            int r4 = r0 + -1
            if (r0 <= 0) goto L_0x00ed
            goto L_0x00f0
        L_0x00ed:
            if (r2 == 0) goto L_0x010d
            goto L_0x010b
        L_0x00f0:
            java.lang.Object r2 = r7.get(r4)     // Catch:{ Exception -> 0x016f }
            X.6fU r2 = (X.C128126fU) r2     // Catch:{ Exception -> 0x016f }
            android.view.View r1 = r2.A00     // Catch:{ Exception -> 0x016f }
            boolean r0 = X.C18070vi.A18(r1, r12)     // Catch:{ Exception -> 0x016f }
            if (r0 != 0) goto L_0x0141
            r0 = 2131430905(0x7f0b0df9, float:1.8483524E38)
            java.lang.Object r0 = r1.getTag(r0)     // Catch:{ Exception -> 0x016f }
            boolean r0 = X.C18070vi.A19(r0, r3)     // Catch:{ Exception -> 0x016f }
            if (r0 != 0) goto L_0x0141
        L_0x010b:
            android.view.View r6 = r2.A00     // Catch:{ Exception -> 0x016f }
        L_0x010d:
            boolean r0 = r6 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x016f }
            if (r0 == 0) goto L_0x016f
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ Exception -> 0x016f }
            X.C18070vi.A0d(r6, r5)     // Catch:{ Exception -> 0x016f }
            java.lang.Integer r15 = X.AnonymousClass00R.A00     // Catch:{ Exception -> 0x016f }
            X.6Pp r11 = new X.6Pp     // Catch:{ Exception -> 0x016f }
            r13 = r12
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x016f }
            X.6km r0 = X.AnonymousClass6Ps.A00     // Catch:{ Exception -> 0x016f }
            r0.A00(r11)     // Catch:{ Exception -> 0x016f }
            r1 = r17
            X.00H r0 = r1.A04     // Catch:{ Exception -> 0x016f }
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.6hq r4 = (X.C129466hq) r4     // Catch:{ Exception -> 0x016f }
            r0 = 45
            X.7S4 r2 = new X.7S4     // Catch:{ Exception -> 0x016f }
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x016f }
            X.10I r1 = r4.A01     // Catch:{ Exception -> 0x016f }
            X.7Qw r0 = new X.7Qw     // Catch:{ Exception -> 0x016f }
            r0.<init>(r4, r11, r2, r3)     // Catch:{ Exception -> 0x016f }
            r1.CGF(r0)     // Catch:{ Exception -> 0x016f }
            goto L_0x0143
        L_0x0141:
            r0 = r4
            goto L_0x00e8
        L_0x0143:
            return
        L_0x0144:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x016f }
            java.lang.reflect.Field r0 = r7.A02     // Catch:{ Exception -> 0x016f }
            r1[r8] = r0     // Catch:{ Exception -> 0x016f }
            java.lang.reflect.Field r0 = r7.A01     // Catch:{ Exception -> 0x016f }
            r1[r3] = r0     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r7.A00     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r0 = X.C108945cZ.A1b(r0, r1, r5, r6)     // Catch:{ Exception -> 0x016f }
            X.C108955ca.A1W(r4, r2, r0)     // Catch:{ Exception -> 0x016f }
            return
        L_0x015a:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x016f }
            java.lang.reflect.Field r0 = r7.A02     // Catch:{ Exception -> 0x016f }
            r1[r8] = r0     // Catch:{ Exception -> 0x016f }
            java.lang.reflect.Field r0 = r7.A01     // Catch:{ Exception -> 0x016f }
            r1[r3] = r0     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r7.A00     // Catch:{ Exception -> 0x016f }
            java.lang.Object[] r0 = X.C108945cZ.A1b(r0, r1, r5, r6)     // Catch:{ Exception -> 0x016f }
            X.C108955ca.A1W(r4, r2, r0)     // Catch:{ Exception -> 0x016f }
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Po.A0U():void");
    }

    public void A0V() {
        C24521Kq r0 = C24521Kq.$redex_init_class;
    }

    public boolean A0X() {
        return this.A00;
    }

    public boolean A0Y() {
        return this.A01;
    }

    public void A0W(boolean z) {
        this.A01 = z;
    }
}
