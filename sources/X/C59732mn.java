package X;

/* renamed from: X.2mn  reason: invalid class name and case insensitive filesystem */
public final class C59732mn {
    public final long A00;
    public final AnonymousClass1LR A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59732mn) {
                C59732mn r8 = (C59732mn) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass001.A0k(this.A01) * 31);
    }

    public C59732mn(AnonymousClass1LR r3, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        this.A01 = r3;
        this.A00 = j;
        boolean z4 = false;
        if (r3 != null) {
            z = r3.A03;
        } else {
            z = false;
        }
        this.A02 = z;
        if (r3 != null) {
            z2 = r3.A06;
        } else {
            z2 = false;
        }
        this.A05 = z2;
        if (r3 != null) {
            z3 = r3.A05;
        } else {
            z3 = false;
        }
        this.A04 = z3;
        this.A03 = r3 != null ? r3.A04 : z4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Connectivity{connected=");
        A10.append(this.A02);
        A10.append(", roaming=");
        A10.append(this.A04);
        A10.append(", typeWifi=");
        A10.append(this.A05);
        A10.append(", typeMobile=");
        A10.append(this.A03);
        A10.append(", eventUptimeMillis=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
