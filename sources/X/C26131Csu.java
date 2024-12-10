package X;

/* renamed from: X.Csu  reason: case insensitive filesystem */
public final class C26131Csu {
    public static final C26131Csu A02 = new C26131Csu(0, false);
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26131Csu) {
                C26131Csu csu = (C26131Csu) obj;
                if (!(this.A01 == csu.A01 && this.A00 == csu.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + this.A00;
    }

    public C26131Csu(int i, boolean z) {
        this.A01 = z;
        this.A00 = i;
    }

    public String toString() {
        String A1L;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PlatformParagraphStyle(includeFontPadding=");
        A10.append(this.A01);
        A10.append(", emojiSupportMatch=");
        int i = this.A00;
        if (i == 0) {
            A1L = "EmojiSupportMatch.Default";
        } else if (i == 1) {
            A1L = "EmojiSupportMatch.None";
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Invalid(value=");
            A1L = AnonymousClass001.A1L(A102, i);
        }
        return AnonymousClass001.A1F(A1L, A10);
    }

    public C26131Csu(boolean z) {
        this.A01 = true;
        this.A00 = 0;
    }

    public C26131Csu() {
        this(0, false);
    }
}
