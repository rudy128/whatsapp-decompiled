package X;

/* renamed from: X.3nK  reason: invalid class name and case insensitive filesystem */
public final class C76443nK extends AnonymousClass4ME {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76443nK) {
                C76443nK r5 = (C76443nK) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.A02), this.A01);
    }

    public C76443nK(boolean z, boolean z2) {
        super(z2, z);
        this.A02 = z;
        this.A01 = z2;
        this.A00 = z ? 2131898223 : 2131898224;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SpeakerToggle(isSpeakerOn=");
        A10.append(this.A02);
        A10.append(", canToggleSpeaker=");
        return C17900vP.A0F(A10, this.A01);
    }
}
