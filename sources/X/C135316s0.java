package X;

import java.util.List;

/* renamed from: X.6s0  reason: invalid class name and case insensitive filesystem */
public final class C135316s0 {
    public final String A00;
    public final List A01;
    public final CharSequence A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135316s0) {
                C135316s0 r5 = (C135316s0) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C17900vP.A00(this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A02);
    }

    public C135316s0(CharSequence charSequence, String str, List list) {
        this.A00 = str;
        this.A01 = list;
        this.A02 = charSequence;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaCaptionData(captionText=");
        A10.append(this.A00);
        A10.append(", mentions=");
        A10.append(this.A01);
        A10.append(", rawCaptionText=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
