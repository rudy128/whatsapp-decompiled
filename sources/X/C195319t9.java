package X;

/* renamed from: X.9t9  reason: invalid class name and case insensitive filesystem */
public final class C195319t9 {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final Long A03;
    public final Long A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195319t9) {
                C195319t9 r8 = (C195319t9) obj;
                if (this.A00 != r8.A00 || this.A01 != r8.A01 || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0K(this.A01, this.A00 * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A02);
    }

    public C195319t9(Integer num, Long l, Long l2, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A04 = l;
        this.A03 = l2;
        this.A02 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PushPayloadMetadata(pushProvider=");
        A10.append(this.A00);
        A10.append(", pushReceivedTimeMs=");
        A10.append(this.A01);
        A10.append(", pushSentByPushdTimeMs=");
        A10.append(this.A04);
        A10.append(", pushSentByProviderTimeMs=");
        A10.append(this.A03);
        A10.append(", deliveredPriority=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
