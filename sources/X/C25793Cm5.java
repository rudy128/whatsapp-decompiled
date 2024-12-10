package X;

/* renamed from: X.Cm5  reason: case insensitive filesystem */
public final class C25793Cm5 {
    public final C24867CNl A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25793Cm5) {
                C25793Cm5 cm5 = (C25793Cm5) obj;
                if (!(this.A02 == cm5.A02 && C18070vi.A18(this.A00, cm5.A00) && this.A01 == cm5.A01 && this.A03 == cm5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00((AnonymousClass3MX.A03(this.A02) + AnonymousClass001.A0k(this.A00)) * 31, this.A01), this.A03);
    }

    public C25793Cm5(C24867CNl cNl, boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A00 = cNl;
        this.A01 = z2;
        this.A03 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusIndicatorViewState(isStatusIndicatorExpanded=");
        A10.append(this.A02);
        A10.append(", statusIndicatorState=");
        A10.append(this.A00);
        A10.append(", isDoublePressPromptVisible=");
        A10.append(this.A01);
        A10.append(", isStreamingOverWifi=");
        return C17900vP.A0F(A10, this.A03);
    }

    public C25793Cm5() {
        this((C24867CNl) null, false, false, false);
    }
}
