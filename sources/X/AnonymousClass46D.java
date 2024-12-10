package X;

/* renamed from: X.46D  reason: invalid class name */
public final class AnonymousClass46D extends AnonymousClass4F2 {
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass46D) {
                AnonymousClass46D r5 = (AnonymousClass46D) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + this.A00;
    }

    public AnonymousClass46D(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EnqueueModelDownload(isWifi=");
        A10.append(this.A01);
        A10.append(", selectedLanguagePosition=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
