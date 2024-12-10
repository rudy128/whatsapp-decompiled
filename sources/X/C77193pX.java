package X;

/* renamed from: X.3pX  reason: invalid class name and case insensitive filesystem */
public final class C77193pX extends AnonymousClass4FI {
    public final int A00 = 2131899286;
    public final AnonymousClass4Y9 A01;
    public final C86604Sh A02;
    public final Integer A03;
    public final C22821Di A04;
    public final C22821Di A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C77193pX) {
                C77193pX r5 = (C77193pX) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A01);
        return ((AnonymousClass000.A0N(this.A05, (AnonymousClass000.A0N(this.A02, A0L) + this.A00) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A04);
    }

    public C77193pX(AnonymousClass4Y9 r3, C86604Sh r4, Integer num, C22821Di r6, C22821Di r7) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r6;
        this.A03 = num;
        this.A04 = r7;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DialogState(input=");
        A10.append(this.A01);
        A10.append(", userMessage=");
        A10.append(this.A02);
        A10.append(", positiveButtonText=");
        A10.append(this.A00);
        A10.append(", positiveButtonHandler=");
        A10.append(this.A05);
        A10.append(", negativeButtonText=");
        A10.append(this.A03);
        A10.append(", negativeButtonHandler=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
