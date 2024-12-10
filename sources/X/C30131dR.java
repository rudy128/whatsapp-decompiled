package X;

/* renamed from: X.1dR  reason: invalid class name and case insensitive filesystem */
public class C30131dR implements C24411Kf {
    public int A00 = -1;
    public long A01 = -1;
    public final C30071dL A02;
    public final C19830z4 A03;
    public final C18030ve A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;

    public C30131dR(C19830z4 r3, C18030ve r4, C30071dL r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r7, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r4, 4);
        C18070vi.A0d(r3, 5);
        this.A02 = r5;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r4;
        this.A03 = r3;
    }

    public void A02(Object obj, String str) {
        C30071dL r3;
        long j;
        String obj2;
        C18070vi.A0d(obj, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/annotateUserFlow: marker=");
        sb.append(C24461Kk.A00(this.A00));
        sb.append(", key=");
        String str2 = str;
        sb.append(str);
        sb.append(", value=");
        sb.append(obj);
        C18070vi.A0d(sb.toString(), 0);
        if (!A00()) {
            return;
        }
        if (obj instanceof Long) {
            this.A02.flowAnnotate(this.A01, str2, ((Number) obj).longValue());
        } else if (obj instanceof Double) {
            C30071dL r32 = this.A02;
            long j2 = this.A01;
            double doubleValue = ((Number) obj).doubleValue();
            ((C30081dM) r32).A00.markerAnnotate((int) j2, (int) (j2 >>> 32), str2, doubleValue);
        } else if (obj instanceof Integer) {
            this.A02.flowAnnotate(this.A01, str, ((Number) obj).intValue());
        } else {
            if (obj instanceof String) {
                r3 = this.A02;
                j = this.A01;
                obj2 = (String) obj;
            } else {
                boolean z = obj instanceof Boolean;
                r3 = this.A02;
                j = this.A01;
                if (z) {
                    r3.flowAnnotate(j, str, ((Boolean) obj).booleanValue());
                    return;
                }
                obj2 = obj.toString();
            }
            r3.flowAnnotate(j, str, obj2);
        }
    }

    public void A05(String str, String str2) {
        C18070vi.A0d(str2, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/failUserFlowWithPoint: marker=");
        sb.append(C24461Kk.A00(this.A00));
        sb.append(", point=");
        sb.append(str);
        C18070vi.A0d(sb.toString(), 0);
        if (A00()) {
            this.A02.flowEndFail(this.A01, str, str2);
            if (A00()) {
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public /* synthetic */ void BlT() {
    }

    private final boolean A00() {
        return ((C30141dS) this.A06.get()).A00();
    }

    public void A01() {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/logFlowSuccess: marker=");
        sb.append(C24461Kk.A00(this.A00));
        C18070vi.A0d(sb.toString(), 0);
        if (A00()) {
            this.A02.flowEndSuccess(this.A01);
            if (A00()) {
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public void A03(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/cancelUserFlowWithPoint: marker=");
        sb.append(C24461Kk.A00(this.A00));
        sb.append(", point=");
        sb.append(str);
        C18070vi.A0d(sb.toString(), 0);
        if (A00()) {
            A04(str);
            this.A02.BLP(this.A01, str);
            if (A00()) {
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public void A04(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/logPoint: marker=");
        sb.append(C24461Kk.A00(this.A00));
        sb.append(", point=");
        sb.append(str);
        C18070vi.A0d(sb.toString(), 0);
        if (A00()) {
            this.A02.flowMarkPoint(this.A01, str);
        }
    }

    public void A06(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/startUserFlowWithPoint: marker=");
        sb.append(C24461Kk.A00(i));
        sb.append(", point=");
        sb.append(str2);
        C18070vi.A0d(sb.toString(), 0);
        if (A00()) {
            if (A00()) {
                long j = this.A01;
                if (j != -1) {
                    C30071dL r4 = this.A02;
                    r4.flowMarkPoint(j, "FLOW_START_BEFORE_PREVIOUS_ENDED");
                    r4.flowEndFail(this.A01, "FLOW_STARTED_BEFORE_PREVIOUS_ENDED", (String) null);
                }
            }
            C30071dL r42 = this.A02;
            long j2 = ((long) i) | (0 << 32);
            this.A01 = j2;
            this.A00 = i;
            r42.BLQ(new C58442kh(str, false), j2);
            r42.flowMarkPoint(this.A01, str2);
            if (C18020vd.A05(C18040vf.A02, this.A04, 6084)) {
                String A0d = this.A03.A0d();
                C18070vi.A0X(A0d);
                A02(A0d, "encrypted_rid");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Current flow is:");
            sb2.append(this.A01);
            sb2.append(", ");
            sb2.append(this);
            C18070vi.A0d(sb2.toString(), 0);
        }
    }

    public void onAppBackgrounded() {
        this.A05.CGL(new C21429Ajw(this, 13), "xfam_flow_on_app_bg");
    }
}
