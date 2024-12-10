package X;

import java.util.List;

/* renamed from: X.2Dr  reason: invalid class name */
public final class AnonymousClass2Dr extends AnonymousClass25L {
    public int A00;
    public Long A01;
    public final int A02;
    public final long A03;
    public final C49472Qp A04;
    public final AnonymousClass25H A05;
    public final AnonymousClass1BI A06;
    public final String A07;
    public final List A08;

    public AnonymousClass2Dr(C49472Qp r3, AnonymousClass25H r4, AnonymousClass1BI r5, Long l, String str, List list, int i, int i2, long j) {
        C18070vi.A0d(r3, 6);
        C18070vi.A0d(list, 8);
        this.A02 = i;
        this.A06 = r5;
        this.A07 = str;
        this.A03 = j;
        this.A05 = r4;
        this.A04 = r3;
        this.A01 = l;
        this.A08 = list;
        this.A00 = i2;
        if (AnonymousClass000.A1a(list)) {
            this.A00 = 2 | this.A00;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2Dr) {
                AnonymousClass2Dr r8 = (AnonymousClass2Dr) obj;
                if (!(this.A02 == r8.A02 && C18070vi.A18(this.A06, r8.A06) && C18070vi.A18(this.A07, r8.A07) && this.A03 == r8.A03 && this.A05 == r8.A05 && this.A04 == r8.A04 && C18070vi.A18(this.A01, r8.A01) && C18070vi.A18(this.A08, r8.A08) && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.A02 * 31;
        int A0N = AnonymousClass000.A0N(this.A05, AnonymousClass001.A0K(this.A03, (AnonymousClass000.A0N(this.A06, i) + C17900vP.A00(this.A07)) * 31));
        return AnonymousClass000.A0N(this.A08, (AnonymousClass000.A0N(this.A04, A0N) + C17880vN.A02(this.A01)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CompositionTextMessage(id=");
        A10.append(this.A02);
        A10.append(", chatJid=");
        A10.append(this.A06);
        A10.append(", text=");
        A10.append(this.A07);
        A10.append(", timestamp=");
        A10.append(this.A03);
        A10.append(", compositionType=");
        A10.append(this.A05);
        A10.append(", messageType=");
        A10.append(this.A04);
        A10.append(", quotedMessageId=");
        A10.append(this.A01);
        A10.append(", mentions=");
        A10.append(this.A08);
        A10.append(", lookupFlags=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
