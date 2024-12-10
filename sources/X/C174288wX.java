package X;

/* renamed from: X.8wX  reason: invalid class name and case insensitive filesystem */
public final class C174288wX extends C174358we {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final C22821Di A03;
    public final AnonymousClass1OS A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C174288wX) {
                C174288wX r5 = (C174288wX) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C174288wX(Integer num, String str, String str2, C22821Di r5, AnonymousClass1OS r6) {
        super(60);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = r5;
        this.A04 = r6;
    }

    public int hashCode() {
        int A032 = C17880vN.A03(this.A01);
        return AnonymousClass000.A0O(this.A04, AnonymousClass000.A0N(this.A03, (C17890vO.A02(this.A02, A032) + AnonymousClass001.A0k(this.A00)) * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessApiCategoryListItemData(displayName=");
        A10.append(this.A01);
        A10.append(", imageUrl=");
        A10.append(this.A02);
        A10.append(", bizNumber=");
        A10.append(this.A00);
        A10.append(", onClick=");
        A10.append(this.A03);
        A10.append(", loadImage=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
