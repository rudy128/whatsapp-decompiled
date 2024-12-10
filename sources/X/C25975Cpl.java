package X;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.concurrent.Callable;

/* renamed from: X.Cpl  reason: case insensitive filesystem */
public class C25975Cpl {
    public static CWO A01;
    public final Callable A00 = new C27132DVt((Object) A01, 20);

    static {
        CWO cwo = new CWO();
        A01 = cwo;
        CWO A002 = A00(BigInteger.class, new C25769Clg((CWO) null), A00(Date.class, new C25769Clg((CWO) null), A00(String.class, new C25769Clg((CWO) null), A00(BigDecimal.class, new C25769Clg((CWO) null), A00(Float.TYPE, new C25769Clg((CWO) null), A00(Float.class, new C25769Clg((CWO) null), A00(Double.TYPE, new C25769Clg((CWO) null), A00(Double.class, new C25769Clg((CWO) null), A00(Integer.TYPE, new C25769Clg((CWO) null), A00(Integer.class, new C25769Clg((CWO) null), A00(Long.TYPE, new C25769Clg((CWO) null), A00(Long.class, new C25769Clg((CWO) null), cwo))))))))))));
        A002.A02.put(Boolean.TYPE, new C25769Clg((CWO) null));
    }

    public static CWO A00(Object obj, Object obj2, CWO cwo) {
        cwo.A02.put(obj, obj2);
        return A01;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Du6, X.CtO] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|(3:21|22|23)(1:24)|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(java.lang.Class r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r2 = r6.getClass()
            boolean r0 = r5.isAssignableFrom(r2)
            if (r0 != 0) goto L_0x008c
            boolean r1 = r6 instanceof java.util.Map     // Catch:{ Exception -> 0x0085 }
            if (r1 != 0) goto L_0x0023
            boolean r0 = r6 instanceof java.util.List     // Catch:{ Exception -> 0x0085 }
            if (r0 != 0) goto L_0x0023
            java.util.concurrent.Callable r0 = r4.A00     // Catch:{ Exception -> 0x0085 }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0085 }
            X.CWO r0 = (X.CWO) r0     // Catch:{ Exception -> 0x0085 }
            X.Clg r0 = r0.A00(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.Object r6 = r0.A03(r6)     // Catch:{ Exception -> 0x0085 }
            return r6
        L_0x0023:
            if (r1 == 0) goto L_0x003b
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x0085 }
            X.Ck3 r2 = X.C25672Ck3.A04     // Catch:{ Exception -> 0x0085 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0085 }
            if (r6 != 0) goto L_0x0035
            java.lang.String r0 = "null"
            r1.append(r0)     // Catch:{ IOException -> 0x0059 }
            goto L_0x0059
        L_0x0035:
            X.E6x r0 = X.C25722Cks.A06     // Catch:{ IOException -> 0x0059 }
            r0.CSS(r1, r6, r2)     // Catch:{ IOException -> 0x0059 }
            goto L_0x0059
        L_0x003b:
            boolean r0 = r6 instanceof java.util.List     // Catch:{ Exception -> 0x0085 }
            if (r0 == 0) goto L_0x0073
            java.util.List r6 = (java.util.List) r6     // Catch:{ Exception -> 0x0085 }
            X.Ck3 r2 = X.C25672Ck3.A04     // Catch:{ Exception -> 0x0085 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0085 }
            if (r6 != 0) goto L_0x004f
            java.lang.String r0 = "null"
            r1.append(r0)     // Catch:{ IOException -> 0x0054 }
            goto L_0x0054
        L_0x004f:
            X.E6x r0 = X.C25722Cks.A03     // Catch:{ IOException -> 0x0054 }
            r0.CSS(r1, r6, r2)     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x0085 }
            goto L_0x005d
        L_0x0059:
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x0085 }
        L_0x005d:
            X.Ck3 r0 = X.C25453Cg5.A00     // Catch:{ Exception -> 0x0085 }
            int r2 = X.CGU.A00     // Catch:{ Exception -> 0x0071 }
            X.CWO r0 = X.C25453Cg5.A02     // Catch:{ Exception -> 0x0071 }
            X.Clg r1 = r0.A00(r5)     // Catch:{ Exception -> 0x0071 }
            X.Du6 r0 = new X.Du6     // Catch:{ Exception -> 0x0071 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0071 }
            java.lang.Object r6 = r0.A0D(r3, r1)     // Catch:{ Exception -> 0x0071 }
            return r6
        L_0x0071:
            r6 = 0
            return r6
        L_0x0073:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0085 }
            X.BE7.A1E(r2, r1)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r0 = " can not be converted to JSON"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x0085 }
            java.lang.UnsupportedOperationException r0 = X.BE6.A0v(r0)     // Catch:{ Exception -> 0x0085 }
            throw r0     // Catch:{ Exception -> 0x0085 }
        L_0x0085:
            r1 = move-exception
            X.Bok r0 = new X.Bok
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x008c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25975Cpl.A01(java.lang.Class, java.lang.Object):java.lang.Object");
    }
}
