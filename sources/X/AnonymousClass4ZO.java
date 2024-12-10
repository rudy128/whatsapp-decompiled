package X;

/* renamed from: X.4ZO  reason: invalid class name */
public final class AnonymousClass4ZO {
    public static final AnonymousClass4ZO A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r2 != 2) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.AnonymousClass4D9 r2) {
        /*
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            int r2 = r2.ordinal()
            if (r2 == r0) goto L_0x0010
            r1 = 1
            if (r2 == r1) goto L_0x0010
            r0 = 2
            if (r2 != r0) goto L_0x0011
        L_0x0010:
            r1 = 4
        L_0x0011:
            java.lang.Boolean r0 = X.C17960vV.A01
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZO.A00(X.4D9):int");
    }

    public final int A01(AnonymousClass4DE r7, AnonymousClass4D9 r8) {
        C18070vi.A0d(r8, 0);
        int ordinal = r8.ordinal();
        int i = 3;
        boolean z = false;
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            switch (r7.ordinal()) {
                case 0:
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    i = 2;
                    break;
                case 6:
                    break;
                default:
                    throw AnonymousClass3MW.A14();
            }
        }
        i = 0;
        if (i < A00(r8)) {
            z = true;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Index ");
        A10.append(i);
        A10.append(" is out of bounds (0..");
        A10.append(A00(r8) - 1);
        C17960vV.A0F(z, AnonymousClass001.A1E(r8, ") for ", A10));
        return i;
    }
}
