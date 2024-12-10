package X;

/* renamed from: X.6vI  reason: invalid class name and case insensitive filesystem */
public abstract class C137336vI {
    public static final String A01(AnonymousClass6TT r3) {
        C18070vi.A0d(r3, 0);
        if (r3 instanceof C119926Al) {
            return "Idle";
        }
        if (r3 instanceof C119936Am) {
            return "NoWorkFound";
        }
        if (r3 instanceof C119916Ak) {
            return "Enqueued";
        }
        if (r3 instanceof C119886Ah) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Progress:");
            return C17880vN.A0t(A10, ((C119886Ah) r3).A00);
        } else if (r3 instanceof C119956Ao) {
            return "Succeeded";
        } else {
            if (r3 instanceof C119876Ag) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Failed:");
                Exception exc = ((C119876Ag) r3).A00;
                C108975cc.A14(A102, C17890vO.A0U(exc));
                return AnonymousClass000.A0y(exc.getMessage(), A102);
            } else if (r3 instanceof C119896Ai) {
                return "Blocked";
            } else {
                if (r3 instanceof C119906Aj) {
                    return "Cancelled";
                }
                if (r3 instanceof C119946An) {
                    return "OutOfDate";
                }
                throw AnonymousClass3MW.A14();
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r6.equals("NoWorkFound") == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00af, code lost:
        return X.C119936Am.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass6TT A00(java.lang.String r6) {
        /*
            if (r6 == 0) goto L_0x00b0
            int r0 = r6.hashCode()
            switch(r0) {
                case -2112710788: goto L_0x0054;
                case -1814410959: goto L_0x0049;
                case -1345265087: goto L_0x003e;
                case -1075366157: goto L_0x0033;
                case 9848336: goto L_0x002a;
                case 1643215308: goto L_0x001f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r1 = "Progress:"
            boolean r0 = X.C108975cc.A1N(r1, r6)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = X.AnonymousClass1YF.A0N(r6, r1, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            X.6Ah r1 = new X.6Ah
            r1.<init>(r0)
            return r1
        L_0x001f:
            java.lang.String r0 = "Blocked"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.6Ai r1 = X.C119896Ai.A00
            return r1
        L_0x002a:
            java.lang.String r0 = "NoWorkFound"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x00ad
            goto L_0x0009
        L_0x0033:
            java.lang.String r0 = "OutOfDate"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.6An r1 = X.C119946An.A00
            return r1
        L_0x003e:
            java.lang.String r0 = "Succeeded"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.6Ao r1 = X.C119956Ao.A00
            return r1
        L_0x0049:
            java.lang.String r0 = "Cancelled"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.6Aj r1 = X.C119906Aj.A00
            return r1
        L_0x0054:
            java.lang.String r0 = "Enqueued"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.6Ak r1 = X.C119916Ak.A00
            return r1
        L_0x005f:
            java.lang.String r1 = "Failed:"
            boolean r0 = X.C108975cc.A1N(r1, r6)
            if (r0 == 0) goto L_0x00ad
            java.lang.String r5 = X.AnonymousClass1YF.A0N(r6, r1, r6)
            java.lang.String r4 = ":"
            r1 = 0
            int r0 = X.AnonymousClass1YF.A0F(r5, r4, r1, r1)
            r3 = -1
            if (r0 == r3) goto L_0x0079
            java.lang.String r5 = X.C108955ca.A0q(r1, r0, r5)
        L_0x0079:
            int r2 = r6.length()
            int r0 = r2 + -1
            int r1 = X.AnonymousClass1YF.A0E(r6, r4, r0)
            if (r1 == r3) goto L_0x008e
            int r0 = r4.length()
            int r1 = r1 + r0
            java.lang.String r6 = X.C108955ca.A0q(r1, r2, r6)
        L_0x008e:
            X.9pH r2 = new X.9pH
            r2.<init>()
            java.lang.String r0 = "MODEL_DOWNLOADING_ERROR_KEY"
            java.util.Map r1 = r2.A00
            r1.put(r0, r5)
            java.lang.String r0 = "MODEL_DOWNLOADING_ERROR_REASON_KEY"
            r1.put(r0, r6)
            X.A6Y r0 = r2.A00()
            java.lang.Exception r0 = X.C124046Wv.A00(r0)
            X.6Ag r1 = new X.6Ag
            r1.<init>(r0)
            return r1
        L_0x00ad:
            X.6Am r1 = X.C119936Am.A00
            return r1
        L_0x00b0:
            X.6Al r1 = X.C119926Al.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137336vI.A00(java.lang.String):X.6TT");
    }
}
