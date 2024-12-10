package X;

/* renamed from: X.6su  reason: invalid class name and case insensitive filesystem */
public final class C135876su {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135876su) {
                C135876su r8 = (C135876su) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A03, C17890vO.A02(this.A01, C17890vO.A02(this.A02, AnonymousClass000.A0I(this.A00) * 31)));
    }

    public C135876su(long j, String str, String str2, String str3) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SnaplMetadata(mediaId=");
        A10.append(this.A00);
        A10.append(", persistentId=");
        A10.append(this.A02);
        A10.append(", currentWatchingModule=");
        A10.append(this.A01);
        A10.append(", trackingType=");
        return C17900vP.A0B(this.A03, A10);
    }
}
