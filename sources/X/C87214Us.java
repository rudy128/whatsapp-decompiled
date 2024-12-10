package X;

import android.graphics.Bitmap;

/* renamed from: X.4Us  reason: invalid class name and case insensitive filesystem */
public final class C87214Us {
    public Bitmap A00 = null;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;

    public C87214Us(int i, int i2, String str, String str2) {
        this.A01 = i;
        this.A03 = str;
        this.A02 = i2;
        this.A04 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87214Us) {
                C87214Us r5 = (C87214Us) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A03, r5.A03) || this.A02 != r5.A02 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.A01 * 31;
        return C17890vO.A02(this.A04, (C17890vO.A02(this.A03, i) + this.A02) * 31) + AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RowData(textRes=");
        A10.append(this.A01);
        A10.append(", textStringKey=");
        A10.append(this.A03);
        A10.append(", titleTextRes=");
        A10.append(this.A02);
        A10.append(", titleTextStringKey=");
        A10.append(this.A04);
        A10.append(", bitmap=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
