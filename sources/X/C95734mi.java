package X;

/* renamed from: X.4mi  reason: invalid class name and case insensitive filesystem */
public final class C95734mi implements C108385bc {
    public boolean A00;
    public final long A01;
    public final int A02;
    public final long A03;

    public void CKy() {
        this.A00 = true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C95734mi) {
                C95734mi r8 = (C95734mi) obj;
                if (!(this.A03 == r8.A03 && this.A02 == r8.A02 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public boolean BZo() {
        return this.A00;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, ((AnonymousClass000.A0I(this.A03) * 31) + this.A02) * 31);
    }

    public C95734mi(long j, int i, long j2) {
        this.A03 = j;
        this.A02 = i;
        this.A01 = j2;
    }

    public String BPi() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Message inflation time: ");
        A10.append(this.A03);
        return AnonymousClass000.A0y("ms", A10);
    }

    public String BQI() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n            One of your messages took: ");
        A10.append(this.A03);
        A10.append("ms to inflate.\n            It is considered to be very slow.\n            The rendered bubble type is: ");
        A10.append(this.A02);
        return AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n        ", A10));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConversationRowEventData(inflationTimeMs=");
        A10.append(this.A03);
        A10.append(", renderedBubbleType=");
        A10.append(this.A02);
        A10.append(", rowId=");
        return C17900vP.A0E(A10, this.A01);
    }
}
