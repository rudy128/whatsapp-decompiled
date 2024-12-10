package X;

import java.util.List;

/* renamed from: X.6rM  reason: invalid class name and case insensitive filesystem */
public final class C134916rM {
    public final String A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134916rM) {
                C134916rM r5 = (C134916rM) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public C134916rM(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MusicCreationReportingResponse(musicContentMediaId=");
        A10.append(this.A00);
        A10.append(", countryBlockList=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
