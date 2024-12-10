package X;

/* renamed from: X.6tV  reason: invalid class name and case insensitive filesystem */
public final class C136246tV {
    public long A00 = -1;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public Integer A04 = AnonymousClass00R.A01;
    public boolean A05 = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136246tV) {
                C136246tV r8 = (C136246tV) obj;
                if (!(this.A04 == r8.A04 && this.A05 == r8.A05 && this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A03 == r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A04.intValue();
        if (intValue != 0) {
            str = "FRONT";
        } else {
            str = "BACK";
        }
        return AnonymousClass001.A0J(this.A03, AnonymousClass001.A0K(this.A02, AnonymousClass001.A0K(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass0DV.A00((str.hashCode() + intValue) * 31, this.A05)))));
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PtvRecordingData(cameraCaptureDirection=");
        if (this.A04.intValue() != 0) {
            str = "FRONT";
        } else {
            str = "BACK";
        }
        A10.append(str);
        A10.append(", recordingStoppedAutomatic=");
        A10.append(this.A05);
        A10.append(", cameraStartTime=");
        A10.append(this.A00);
        A10.append(", cameraSwitchCount=");
        A10.append(this.A01);
        A10.append(", draftPlayCount=");
        A10.append(this.A02);
        A10.append(", recordingStopCount=");
        return C17900vP.A0E(A10, this.A03);
    }
}
