package X;

import java.util.Arrays;

/* renamed from: X.5zi  reason: invalid class name and case insensitive filesystem */
public final class C117395zi extends AnonymousClass6T8 {
    public final int A00;
    public final int[] A01;

    public C117395zi(int[] iArr, int i) {
        C18070vi.A0d(iArr, 1);
        this.A01 = iArr;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsSideEffect.ShowSkinTonePopup");
                C117385zh r5 = (C117385zh) obj;
                if (!Arrays.equals(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShowSkinToneTip(emoji=");
        A10.append(Arrays.toString(this.A01));
        A10.append(", position=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
