package X;

/* renamed from: X.4YD  reason: invalid class name */
public final class AnonymousClass4YD {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YD) {
                AnonymousClass4YD r5 = (AnonymousClass4YD) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.A01), this.A00);
    }

    public AnonymousClass4YD(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SpeakingState(isSelfSpeaking=");
        A10.append(this.A01);
        A10.append(", isBotSpeaking=");
        return C17900vP.A0F(A10, this.A00);
    }

    public AnonymousClass4YD() {
        this(false, false);
    }
}
