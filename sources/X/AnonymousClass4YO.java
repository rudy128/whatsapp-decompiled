package X;

/* renamed from: X.4YO  reason: invalid class name */
public final class AnonymousClass4YO {
    public final float A00;
    public final boolean A01;
    public final boolean A02;

    public AnonymousClass4YO() {
        this(0.0f, false, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YO) {
                AnonymousClass4YO r5 = (AnonymousClass4YO) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A02), this.A01) + Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParticipantAudio(isSelfSpeaking=");
        A10.append(this.A02);
        A10.append(", isBotSpeaking=");
        A10.append(this.A01);
        A10.append(", botAudioLevel=");
        return AnonymousClass001.A1K(A10, this.A00);
    }

    public AnonymousClass4YO(float f, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = f;
    }
}
