package X;

/* renamed from: X.8u7  reason: invalid class name and case insensitive filesystem */
public class C172848u7 extends C173518vD {
    public final Throwable cause;
    public final int code;
    public final String eventName;
    public final String message;
    public final Object parsedErrors;

    public C172848u7(Object obj, String str, String str2, Throwable th, int i) {
        super(str, "CLIENT", str2, th, i);
        this.message = str;
        this.cause = th;
        this.code = i;
        this.parsedErrors = obj;
        this.eventName = str2;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172848u7(java.lang.String r13, java.lang.String r14, java.lang.Throwable[] r15, int r16) {
        /*
            r12 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r13)
            java.lang.String r0 = " due to: "
            r1.append(r0)
            r0 = 0
            r0 = r15[r0]
            java.lang.String r5 = X.C17890vO.A0V(r0, r1)
            int r0 = r15.length
            int r1 = r0 + -1
            r7 = 0
            if (r1 < 0) goto L_0x0042
            int r0 = r1 + -1
            r10 = r15[r1]
        L_0x001a:
            if (r0 < 0) goto L_0x0041
            int r3 = r0 + -1
            r2 = r15[r0]
            X.8u7 r6 = new X.8u7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "caused by "
            r1.append(r0)
            if (r2 == 0) goto L_0x003f
            java.lang.String r0 = r2.getMessage()
        L_0x0031:
            java.lang.String r8 = X.AnonymousClass000.A0y(r0, r1)
            r11 = 417(0x1a1, float:5.84E-43)
            java.lang.String r9 = "mex-parsing-failure"
            r6.<init>(r7, r8, r9, r10, r11)
            r10 = r6
            r0 = r3
            goto L_0x001a
        L_0x003f:
            r0 = r7
            goto L_0x0031
        L_0x0041:
            r7 = r10
        L_0x0042:
            r4 = 0
            r3 = r12
            r6 = r14
            r8 = r16
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172848u7.<init>(java.lang.String, java.lang.String, java.lang.Throwable[], int):void");
    }
}
