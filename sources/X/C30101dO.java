package X;

import com.whatsapp.bridge.wfal.WfalManager;

/* renamed from: X.1dO  reason: invalid class name and case insensitive filesystem */
public abstract class C30101dO implements C24401Ke {
    public int A00 = -1;
    public long A01 = -1;
    public final C30071dL A02;
    public final C19830z4 A03;
    public final C18030ve A04;

    public void A01(Object obj, String str) {
        C30071dL r3;
        long j;
        String obj2;
        C18070vi.A0d(obj, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/annotateUserFlow: marker=");
        sb.append(C24461Kk.A00(this.A00));
        sb.append(", key=");
        String str2 = str;
        sb.append(str);
        sb.append(", value=");
        sb.append(obj);
        C18070vi.A0d(sb.toString(), 0);
        if (!A06()) {
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

    public void BlT() {
    }

    public void A00() {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/logFlowSuccess: marker=");
        sb.append(C24461Kk.A00(this.A00));
        C18070vi.A0d(sb.toString(), 0);
        if (A06()) {
            this.A02.flowEndSuccess(this.A01);
            if (A06()) {
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public void A02(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/cancelUserFlowWithPoint: marker=");
        sb.append(C24461Kk.A00(this.A00));
        sb.append(", point=");
        sb.append(str);
        C18070vi.A0d(sb.toString(), 0);
        if (A06()) {
            A04(str);
            this.A02.BLP(this.A01, str);
            if (A06()) {
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public void A03(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/failUserFlowWithPoint: marker=");
        sb.append(C24461Kk.A00(this.A00));
        sb.append(", point=");
        sb.append(str);
        C18070vi.A0d(sb.toString(), 0);
        if (A06()) {
            this.A02.flowEndFail(this.A01, str, (String) null);
            if (A06()) {
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public void A04(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/logPoint: marker=");
        sb.append(C24461Kk.A00(this.A00));
        sb.append(", point=");
        sb.append(str);
        C18070vi.A0d(sb.toString(), 0);
        if (A06()) {
            this.A02.flowMarkPoint(this.A01, str);
        }
    }

    public void A05(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/startUserFlowWithPoint: marker=");
        sb.append(C24461Kk.A00(i));
        sb.append(", point=");
        sb.append(str2);
        C18070vi.A0d(sb.toString(), 0);
        if (A06()) {
            if (A06()) {
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
                A01(A0d, "encrypted_rid");
            }
        }
    }

    public boolean A06() {
        if (this instanceof C41791x4) {
            if (C18020vd.A05(C18040vf.A02, ((C41791x4) this).A00, 3989)) {
                return true;
            }
            return false;
        } else if (this instanceof C30111dP) {
            return WfalManager.A00((WfalManager) ((C30111dP) this).A00.get(), false);
        }
        return true;
    }

    public C30101dO(C19830z4 r3, C18030ve r4, C30071dL r5) {
        this.A04 = r4;
        this.A02 = r5;
        this.A03 = r3;
    }

    public void onAppBackgrounded() {
    }
}
