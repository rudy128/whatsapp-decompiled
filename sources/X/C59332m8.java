package X;

import java.util.Map;

/* renamed from: X.2m8  reason: invalid class name and case insensitive filesystem */
public final class C59332m8 {
    public final int A00;
    public final C199410f A01;
    public final Map A02;

    public C59332m8(C199410f r2, Map map, int i) {
        C18070vi.A0d(map, 2);
        this.A00 = i;
        this.A02 = map;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59332m8) {
                C59332m8 r5 = (C59332m8) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessContactSyncUpdateResult(usersModified=");
        A10.append(this.A00);
        A10.append(", sideListOldVnameMap=");
        A10.append(this.A02);
        A10.append(", userMightNeedPrivacySystemMessageUpdate=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
