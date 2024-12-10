package X;

import java.util.List;

/* renamed from: X.4Yc  reason: invalid class name and case insensitive filesystem */
public final class C88044Yc {
    public final int A00;
    public final AnonymousClass4UD A01;
    public final AnonymousClass1E7 A02;
    public final AnonymousClass206 A03;
    public final List A04;
    public final boolean A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88044Yc() {
        /*
            r7 = this;
            r1 = 0
            java.util.List r4 = java.util.Collections.emptyList()
            X.C18070vi.A0X(r4)
            r5 = 1
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88044Yc.<init>():void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88044Yc) {
                C88044Yc r5 = (C88044Yc) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || this.A00 != r5.A00 || this.A05 != r5.A05 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A04, ((AnonymousClass001.A0k(this.A02) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + this.A00) * 31, this.A05) + C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState(groupContact=");
        A10.append(this.A02);
        A10.append(", parentMessage=");
        A10.append(this.A03);
        A10.append(", bottomSheetListItems=");
        A10.append(this.A04);
        A10.append(", inputState=");
        A10.append(this.A00);
        A10.append(", sendVisibility=");
        A10.append(this.A05);
        A10.append(", errorState=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public C88044Yc(AnonymousClass4UD r1, AnonymousClass1E7 r2, AnonymousClass206 r3, List list, int i, boolean z) {
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = list;
        this.A00 = i;
        this.A05 = z;
        this.A01 = r1;
    }
}
