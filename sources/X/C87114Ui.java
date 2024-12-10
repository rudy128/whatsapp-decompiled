package X;

/* renamed from: X.4Ui  reason: invalid class name and case insensitive filesystem */
public final class C87114Ui {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87114Ui) {
                C87114Ui r8 = (C87114Ui) obj;
                if (!(this.A00 == r8.A00 && this.A02 == r8.A02 && this.A01 == r8.A01 && this.A03 == r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A02;
        return C17880vN.A01(AnonymousClass001.A0K(this.A01, ((this.A00 * 31) + C72453Mb.A0E(num, C87534Vy.A01(num))) * 31), this.A03);
    }

    public C87114Ui(Integer num, int i, long j, boolean z) {
        this.A00 = i;
        this.A02 = num;
        this.A01 = j;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TranscriptionInitConfig(toolbarTitle=");
        A10.append(this.A00);
        A10.append(", screenType=");
        A10.append(C87534Vy.A01(this.A02));
        A10.append(", fileSizeInMbs=");
        A10.append(this.A01);
        A10.append(", isWifi=");
        return C17900vP.A0F(A10, this.A03);
    }
}
