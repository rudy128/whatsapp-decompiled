package X;

import java.lang.reflect.InvocationHandler;

/* renamed from: X.DTr  reason: case insensitive filesystem */
public abstract class C27092DTr implements InvocationHandler {
    public final AnonymousClass20E A00;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r7.length == r2) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r5, java.lang.reflect.Method r6, java.lang.Object[] r7) {
        /*
            r4 = this;
            r3 = 0
            boolean r2 = X.C18070vi.A17(r5, r6)
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "test"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x006b
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006b
            if (r7 == 0) goto L_0x006b
            int r1 = r7.length
            r0 = 1
            if (r1 != r2) goto L_0x006b
        L_0x0023:
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x006d
            X.20E r0 = r4.A00
            if (r7 == 0) goto L_0x002d
            r1 = r7[r3]
        L_0x002d:
            X.AnonymousClass2VE.A00(r1, r0)
            r3 = r4
            boolean r0 = r4 instanceof X.C22722BMj
            if (r0 == 0) goto L_0x004a
            X.BMj r3 = (X.C22722BMj) r3
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.1Di r0 = r3.A00
            java.lang.Object r0 = r0.invoke(r1)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
        L_0x0045:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x004a:
            X.BMk r3 = (X.C22723BMk) r3
            android.util.Pair r1 = (android.util.Pair) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.20E r0 = r3.A01
            java.lang.Object r2 = r1.first
            X.AnonymousClass2VE.A00(r2, r0)
            X.20E r0 = r3.A02
            java.lang.Object r1 = r1.second
            X.AnonymousClass2VE.A00(r1, r0)
            X.1OS r0 = r3.A00
            java.lang.Object r0 = r0.invoke(r2, r1)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            goto L_0x0045
        L_0x006b:
            r0 = 0
            goto L_0x0023
        L_0x006d:
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "equals"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0098
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0098
            if (r7 == 0) goto L_0x0098
            int r1 = r7.length
            r0 = 1
            if (r1 != r0) goto L_0x0098
            r0 = r7[r3]
            X.C18070vi.A0b(r0)
            if (r5 != r0) goto L_0x0093
            r2 = 1
        L_0x0093:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0098:
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "hashCode"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00b7
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b7
            if (r7 != 0) goto L_0x00b7
            java.lang.Integer r0 = X.BE8.A0Z(r4)
            return r0
        L_0x00b7:
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "toString"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00d6
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d6
            if (r7 != 0) goto L_0x00d6
            java.lang.String r0 = r4.toString()
            return r0
        L_0x00d6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected method call object:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", method: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", args: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r1)
            java.lang.UnsupportedOperationException r0 = X.BE6.A0v(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27092DTr.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public C27092DTr(AnonymousClass20E r1) {
        this.A00 = r1;
    }
}
