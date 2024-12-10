package X;

import java.util.Arrays;

/* renamed from: X.5zj  reason: invalid class name and case insensitive filesystem */
public final class C117405zj extends AnonymousClass6T8 {
    public final int A00;
    public final int[] A01;

    public C117405zj(int[] iArr, int i) {
        C18070vi.A0d(iArr, 2);
        this.A00 = i;
        this.A01 = iArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsSideEffect.UpdateEmojiSkinTone");
                C117405zj r5 = (C117405zj) obj;
                if (this.A00 != r5.A00 || !Arrays.equals(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UpdateEmojiSkinTone(position=");
        A10.append(this.A00);
        A10.append(", emoji=");
        return C17900vP.A0B(Arrays.toString(this.A01), A10);
    }
}
