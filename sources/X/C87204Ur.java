package X;

import java.util.List;

/* renamed from: X.4Ur  reason: invalid class name and case insensitive filesystem */
public final class C87204Ur {
    public final int A00;
    public final long A01;
    public final C87054Uc A02;
    public final C54242dp A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87204Ur) {
                C87204Ur r8 = (C87204Ur) obj;
                if (!C18070vi.A18(this.A03, r8.A03) || this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02) || this.A01 != r8.A01 || !C18070vi.A18(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A01, (((AnonymousClass000.A0L(this.A03) + this.A00) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A04);
    }

    public C87204Ur(C87054Uc r1, C54242dp r2, List list, int i, long j) {
        this.A03 = r2;
        this.A00 = i;
        this.A02 = r1;
        this.A01 = j;
        this.A04 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LoadMessagesResult(newCursorRef=");
        A10.append(this.A03);
        A10.append(", initialPosition=");
        A10.append(this.A00);
        A10.append(", scrollToMessage=");
        A10.append(this.A02);
        A10.append(", startRef=");
        A10.append(this.A01);
        A10.append(", preloadedMessagesMetadata=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
