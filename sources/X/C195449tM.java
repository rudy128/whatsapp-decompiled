package X;

/* renamed from: X.9tM  reason: invalid class name and case insensitive filesystem */
public final class C195449tM {
    public long A00;
    public long A01;
    public String A02;
    public String A03 = null;
    public final String A04;
    public final String A05;
    public final long A06;

    public C195449tM(String str, String str2, String str3, long j, long j2, long j3) {
        this.A05 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A06 = j2;
        this.A01 = j3;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195449tM) {
                C195449tM r8 = (C195449tM) obj;
                if (!C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A04, r8.A04) || this.A00 != r8.A00 || this.A06 != r8.A06 || this.A01 != r8.A01 || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0K(this.A01, AnonymousClass001.A0K(this.A06, AnonymousClass001.A0K(this.A00, C17890vO.A02(this.A04, C17880vN.A03(this.A05))))) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NotificationUiData(notificationType=");
        A10.append(this.A05);
        A10.append(", from=");
        A10.append(this.A04);
        A10.append(", notificationCount=");
        A10.append(this.A00);
        A10.append(", timestampMs=");
        A10.append(this.A06);
        A10.append(", senderCount=");
        A10.append(this.A01);
        A10.append(", sender1=");
        A10.append(this.A02);
        A10.append(", sender2=");
        return C17900vP.A0B(this.A03, A10);
    }
}
