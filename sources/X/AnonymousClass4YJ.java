package X;

/* renamed from: X.4YJ  reason: invalid class name */
public final class AnonymousClass4YJ {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public AnonymousClass4YJ() {
        this((String) null, false, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YJ) {
                AnonymousClass4YJ r5 = (AnonymousClass4YJ) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && C18070vi.A18(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A02), this.A01) + C17900vP.A00(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallArEffectsPendingCallState(isShowingPendingVideoCallUi=");
        A10.append(this.A02);
        A10.append(", isCallAccepted=");
        A10.append(this.A01);
        A10.append(", pendingCallId=");
        return C17900vP.A0B(this.A00, A10);
    }

    public AnonymousClass4YJ(String str, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = str;
    }
}
