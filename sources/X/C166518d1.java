package X;

import java.util.Map;

/* renamed from: X.8d1  reason: invalid class name and case insensitive filesystem */
public final class C166518d1 extends C182419Uh {
    public final C26235CvV A00;
    public final C198009xd A01;
    public final Map A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166518d1(C26235CvV cvV, C198009xd r4) {
        super(r4);
        int A0G = C72453Mb.A0G(cvV, r4, 1);
        AnonymousClass1CQ A0I = AnonymousClass1D7.A0I();
        C18070vi.A0d(A0I, A0G);
        this.A00 = cvV;
        this.A02 = A0I;
        this.A01 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166518d1) {
                C166518d1 r5 = (C166518d1) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A00)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(data=");
        A10.append(this.A00);
        A10.append(", externalVariables=");
        A10.append(this.A02);
        A10.append(", fetchSummaryData=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
