package X;

/* renamed from: X.99s  reason: invalid class name and case insensitive filesystem */
public final class C1776199s extends C39611tM {
    public C22821Di A00;
    public final C20079A6f A01;
    public final C195819tx A02;
    public final C18090vk A03;
    public final AnonymousClass1OS A04;
    public final boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1776199s(C20079A6f a6f, C195819tx r3, C18090vk r4, AnonymousClass1OS r5, int i, boolean z) {
        super(r3, i);
        C18070vi.A0d(r3, 2);
        this.A06 = i;
        this.A02 = r3;
        this.A01 = a6f;
        this.A05 = z;
        this.A03 = r4;
        this.A04 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1776199s) {
                C1776199s r5 = (C1776199s) obj;
                if (this.A06 != r5.A06 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || this.A05 != r5.A05 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A04, AnonymousClass000.A0N(this.A03, AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A02, this.A06 * 31)), this.A05)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessProfileListItem(itemType=");
        A10.append(this.A06);
        A10.append(", data=");
        A10.append(this.A02);
        A10.append(", searchLocation=");
        A10.append(this.A01);
        A10.append(", isCached=");
        A10.append(this.A05);
        A10.append(", onViewProfileBtnClicked=");
        A10.append(this.A03);
        A10.append(", onProfileClicked=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
