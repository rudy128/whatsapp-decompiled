package X;

/* renamed from: X.8vD  reason: invalid class name and case insensitive filesystem */
public abstract class C173518vD extends AnonymousClass1O9 implements BC4 {
    public final String category;
    public final Throwable cause;
    public final int code;
    public final String criticalEventName;
    public final String message;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0022, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0025, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(java.lang.Throwable r4) {
        /*
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x001f }
            r2.<init>(r3)     // Catch:{ all -> 0x001f }
            r2.println(r4)     // Catch:{ all -> 0x0018 }
            java.lang.String r0 = X.C18070vi.A0H(r3)     // Catch:{ all -> 0x0018 }
            r2.close()     // Catch:{ all -> 0x001f }
            r3.close()
            return r0
        L_0x0018:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001a }
        L_0x001a:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x001f }
            throw r0     // Catch:{ all -> 0x001f }
        L_0x001f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173518vD.A01(java.lang.Throwable):java.lang.String");
    }

    public boolean A02() {
        if (this instanceof C172828u5) {
            return ((C172828u5) this).isRecoverable;
        }
        if (!(this instanceof C172848u7)) {
            return C18070vi.A18(this.category, "TRANSPORT");
        }
        Throwable th = this;
        while (th != null && th.getCause() != null) {
            if (th.getCause() instanceof Error) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public int BOq() {
        if (this instanceof C172848u7) {
            return ((C172848u7) this).code;
        }
        return this.code;
    }

    public C59092lk CPC(String str) {
        String str2;
        String str3;
        Throwable cause2;
        String str4;
        C173518vD r1;
        if (this instanceof C172828u5) {
            C172828u5 r4 = (C172828u5) this;
            String str5 = r4.suppressedReason;
            if (str5 == null || (str4 = AnonymousClass001.A1H("  suppressedReason=", str5, AnonymousClass000.A10())) == null) {
                str4 = "";
            }
            Throwable th = r4.cause;
            if (th instanceof C173518vD) {
                r1 = th;
            } else {
                r1 = new C172958uI("Suppressed exception", th);
            }
            return r1.CPC(C17900vP.A0A(str, str4));
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n          ");
        if (str == null || (str2 = AnonymousClass001.A1H("source=", str, AnonymousClass000.A10())) == null) {
            str2 = "";
        }
        A10.append(str2);
        A10.append("\n      exception=");
        A10.append(A01(this));
        A10.append("\n      cause=");
        Throwable cause3 = getCause();
        String str6 = null;
        if (cause3 != null) {
            str3 = A01(cause3);
        } else {
            str3 = null;
        }
        A10.append(str3);
        A10.append("\n      cause.cause=");
        Throwable cause4 = getCause();
        if (!(cause4 == null || (cause2 = cause4.getCause()) == null)) {
            str6 = A01(cause2);
        }
        A10.append(str6);
        A10.append("\n      code=");
        A10.append(BOq());
        A10.append("\n      isRecoverable=");
        A10.append(A02());
        String A0k = AnonymousClass8BW.A0k("\n  ", A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("mex-callback-failure/");
        return new C59092lk(AnonymousClass000.A0y(this.criticalEventName, A102), A0k);
    }

    public C173518vD(String str, String str2, String str3, Throwable th, int i) {
        super(str, th);
        this.message = str;
        this.cause = th;
        this.code = i;
        this.category = str2;
        this.criticalEventName = str3;
    }

    public String BOP() {
        return this.category;
    }

    public String BQa() {
        String message2 = getMessage();
        if (message2 != null) {
            return message2;
        }
        Object cause2 = getCause();
        if (cause2 == null) {
            cause2 = "Unknown Failure";
        }
        return String.valueOf(cause2);
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }
}
