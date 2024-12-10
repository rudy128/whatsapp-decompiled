package X;

/* renamed from: X.1dk  reason: invalid class name and case insensitive filesystem */
public final class C30321dk extends C30311dj implements C24411Kf {
    public long A00 = -1;
    public final C19830z4 A01;
    public final C18030ve A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;

    public C30321dk(C19830z4 r3, C18030ve r4, AnonymousClass10I r5, AnonymousClass00H r6) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r6, 4);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
    }

    public void COL(Object obj, String str, int i, int i2, boolean z) {
        C18070vi.A0d(obj, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("WaffleClientAndBloksAcFlowLoggerImpl/startUserFlow: marker=");
        sb.append(C24461Kk.A00(i));
        C18070vi.A0d(sb.toString(), 0);
        A01();
        this.A00 = ((long) i) | (((long) i2) << 32);
        super.COL(obj, str, i, i2, z);
        if (C18020vd.A05(C18040vf.A02, this.A02, 6084)) {
            String A0d = this.A01.A0d();
            C18070vi.A0X(A0d);
            A05("encrypted_rid", A0d);
        }
    }

    public void A03(Exception exc) {
        String str;
        String str2;
        String message;
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder();
        sb.append("WaffleClientAndBloksAcFlowLoggerImpl/endUserFlowWithException: marker=");
        sb.append(C24461Kk.A00(924663622));
        C31081ez.A03(sb.toString(), exc);
        C30071dL r6 = this.A00;
        long j = this.A00;
        if (exc == null || (str = exc.getMessage()) == null) {
            str = "EXCEPTION";
        }
        String str3 = "Error";
        if (exc == null || (stackTrace = exc.getStackTrace()) == null || (str2 = stackTrace.toString()) == null) {
            str2 = str3;
        }
        r6.flowAnnotate(j, str, str2);
        C30071dL r3 = this.A00;
        long j2 = this.A00;
        if (!(exc == null || (message = exc.getMessage()) == null)) {
            str3 = message;
        }
        r3.flowEndFail(j2, "EXCEPTION", str3);
        this.A00 = -1;
    }

    public void A04(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("WaffleClientAndBloksAcFlowLoggerImpl/logPoint: marker=");
        sb.append(C24461Kk.A00(924663622));
        sb.append(", point=");
        sb.append(str);
        C18070vi.A0d(sb.toString(), 0);
        this.A00.flowMarkPoint(this.A00, str);
    }

    public void A05(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("WaffleClientAndBloksAcFlowLoggerImpl/annotateUserFlow: marker=");
        sb.append(C24461Kk.A00(924663622));
        sb.append(", key=");
        sb.append(str);
        sb.append(", value=");
        sb.append(obj);
        C18070vi.A0d(sb.toString(), 0);
        A02(str, obj);
    }

    public void BlT() {
        StringBuilder sb = new StringBuilder();
        sb.append("WaffleClientAndBloksAcFlowLoggerImpl/OnAppForegrounded: marker=");
        sb.append(C24461Kk.A00(924663622));
        C18070vi.A0d(sb.toString(), 0);
    }

    public void onAppBackgrounded() {
        this.A03.CGL(new C146787Qp(this, 38), "ac_flow_on_app_background");
    }
}
