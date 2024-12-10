package X;

import java.util.List;

/* renamed from: X.6tH  reason: invalid class name and case insensitive filesystem */
public final class C136106tH {
    public final C195989uH A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final List A04;
    public final List A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136106tH) {
                C136106tH r5 = (C136106tH) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A00);
        Integer num = this.A02;
        return AnonymousClass000.A0O(this.A05, (((C17890vO.A02(this.A03, AnonymousClass000.A0N(this.A04, (A0L + C72453Mb.A0E(num, C123666Vi.A00(num))) * 31)) + AnonymousClass001.A0k(this.A01)) * 31 * 31) + 100) * 31 * 31);
    }

    public C136106tH(C195989uH r1, Integer num, Integer num2, String str, List list, List list2) {
        this.A00 = r1;
        this.A02 = num;
        this.A04 = list;
        this.A03 = str;
        this.A01 = num2;
        this.A05 = list2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectsGetMetadataParams(deviceCapabilities=");
        A10.append(this.A00);
        A10.append(", productSurface=");
        A10.append(C123666Vi.A00(this.A02));
        A10.append(", effectCategories=");
        A10.append(this.A04);
        A10.append(", deliveryTier=");
        A10.append(this.A03);
        A10.append(", arClass=");
        A10.append(this.A01);
        C108975cc.A17(A10, ", after=");
        A10.append(", pageSize=");
        A10.append(100);
        C108975cc.A17(A10, ", find=");
        A10.append(", supportedCompressionTypes=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
