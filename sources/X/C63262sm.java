package X;

/* renamed from: X.2sm  reason: invalid class name and case insensitive filesystem */
public final class C63262sm {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public C63262sm(String str, int i) {
        this(str, (String) null, i, false, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63262sm) {
                C63262sm r5 = (C63262sm) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && this.A00 == r5.A00 && this.A04 == r5.A04 && this.A03 == r5.A03 && C18070vi.A18(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A002 = AnonymousClass0DV.A00(AnonymousClass0DV.A00((C17880vN.A03(this.A01) + this.A00) * 31, this.A04), this.A03);
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A002 + i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupInfoContextData(context=");
        A10.append(this.A01);
        A10.append(", deviceSyncType=");
        A10.append(this.A00);
        A10.append(", messageRevoked=");
        A10.append(this.A04);
        A10.append(", isLid=");
        A10.append(this.A03);
        A10.append(", phash=");
        return C17900vP.A0B(this.A02, A10);
    }

    public C63262sm(String str, String str2, int i, boolean z, boolean z2) {
        this.A01 = str;
        this.A00 = i;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C63262sm(String str, int i, String str2) {
        this(str, str2, i, false, false);
        C18070vi.A0d(str2, 3);
    }
}
