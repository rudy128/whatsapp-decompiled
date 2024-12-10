package X;

/* renamed from: X.3x5  reason: invalid class name and case insensitive filesystem */
public final class C80403x5 extends AnonymousClass4EQ {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80403x5) {
                C80403x5 r5 = (C80403x5) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C80403x5(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ThemesWallpaperCategoryListItem(icon=");
        A10.append(this.A00);
        A10.append(", text=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
