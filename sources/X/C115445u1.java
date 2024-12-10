package X;

import android.graphics.Bitmap;

/* renamed from: X.5u1  reason: invalid class name and case insensitive filesystem */
public final class C115445u1 extends C115465u3 {
    public final int A00;
    public final Bitmap A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115445u1) {
                C115445u1 r5 = (C115445u1) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || this.A04 != r5.A04 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00((((AnonymousClass000.A0L(this.A01) + C17900vP.A00(this.A03)) * 31) + C108955ca.A06(this.A02)) * 31, this.A04) + this.A00;
    }

    public C115445u1(Bitmap bitmap, String str, String str2, int i, boolean z) {
        this.A01 = bitmap;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Data(bitmap=");
        A10.append(this.A01);
        A10.append(", emojis=");
        C108965cb.A1U(A10, this.A03);
        A10.append(this.A02);
        A10.append(", isSelected=");
        A10.append(this.A04);
        A10.append(", ringColor=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
