package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.2jx  reason: invalid class name and case insensitive filesystem */
public final class C57982jx {
    public C20944Aby A00;
    public C20945Abz A01;
    public C20949Ac3 A02;
    public C20955Ac9 A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public final C61712q8 A00() {
        Boolean[] boolArr = new Boolean[3];
        int i = 0;
        boolArr[0] = Boolean.valueOf(this.A06);
        boolArr[1] = Boolean.valueOf(this.A05);
        List<Object> A0O = C18070vi.A0O(Boolean.valueOf(this.A04), boolArr, 2);
        if (!(A0O instanceof Collection) || !A0O.isEmpty()) {
            for (Object A1Y : A0O) {
                if (AnonymousClass000.A1Y(A1Y) && (i = i + 1) < 0) {
                    AnonymousClass1ZU.A0A();
                    throw null;
                }
            }
            if (i > 1) {
                C17960vV.A0B(AnonymousClass000.A0n(AnonymousClass001.A1E(A0O, "More than 1 exclusive flag is true. Flags=", AnonymousClass000.A10())));
            }
        }
        C20955Ac9 ac9 = this.A03;
        C20949Ac3 ac3 = this.A02;
        return new C61712q8(this.A00, this.A01, ac3, ac9, this.A06, this.A05, this.A04);
    }
}
