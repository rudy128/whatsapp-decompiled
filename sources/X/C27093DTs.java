package X;

import java.lang.reflect.InvocationHandler;

/* renamed from: X.DTs  reason: case insensitive filesystem */
public final class C27093DTs implements InvocationHandler {
    public final C22821Di A00;
    public final AnonymousClass20E A01;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r7.length == r2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r5, java.lang.reflect.Method r6, java.lang.Object[] r7) {
        /*
            r4 = this;
            r3 = 0
            boolean r2 = X.C18070vi.A17(r5, r6)
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "accept"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x002f
            if (r7 == 0) goto L_0x002f
            int r1 = r7.length
            r0 = 1
            if (r1 != r2) goto L_0x002f
        L_0x0017:
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0031
            X.20E r0 = r4.A01
            if (r7 == 0) goto L_0x0021
            r1 = r7[r3]
        L_0x0021:
            X.AnonymousClass2VE.A00(r1, r0)
            X.C18070vi.A0d(r1, r3)
            X.1Di r0 = r4.A00
            r0.invoke(r1)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002f:
            r0 = 0
            goto L_0x0017
        L_0x0031:
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "equals"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0059
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0059
            if (r7 == 0) goto L_0x0059
            int r1 = r7.length
            r0 = 1
            if (r1 != r0) goto L_0x0059
            r0 = r7[r3]
            if (r5 != r0) goto L_0x0054
            r2 = 1
        L_0x0054:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0059:
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "hashCode"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x007a
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007a
            if (r7 != 0) goto L_0x007a
            X.1Di r0 = r4.A00
            java.lang.Integer r0 = X.BE8.A0Z(r0)
            return r0
        L_0x007a:
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "toString"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x009b
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009b
            if (r7 != 0) goto L_0x009b
            X.1Di r0 = r4.A00
            java.lang.String r0 = r0.toString()
            return r0
        L_0x009b:
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
        throw new UnsupportedOperationException("Method not decompiled: X.C27093DTs.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public C27093DTs(C22821Di r1, AnonymousClass20E r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
