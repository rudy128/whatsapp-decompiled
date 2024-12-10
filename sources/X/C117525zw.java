package X;

import java.util.Arrays;

/* renamed from: X.5zw  reason: invalid class name and case insensitive filesystem */
public final class C117525zw extends C131546lH {
    public final AnonymousClass1KW A00;
    public final C135736sg A01;
    public final Integer A02;
    public final int[] A03;
    public final int[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.emoji.grid.EmojiExpressionsViewItem.EmojiItem");
                C117525zw r5 = (C117525zw) obj;
                if (!Arrays.equals(this.A03, r5.A03) || !Arrays.equals(this.A04, r5.A04) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass1KW r0 = this.A00;
        return AnonymousClass000.A0O(this.A01, (AnonymousClass000.A0N(r0, ((Arrays.hashCode(this.A03) * 31) + Arrays.hashCode(this.A04)) * 31) + C72463Mc.A0B(this.A02)) * 31);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117525zw(AnonymousClass1KW r2, C135736sg r3, Integer num, int[] iArr, int[] iArr2) {
        super(r3);
        C18070vi.A0j(iArr, iArr2);
        C18070vi.A0d(r3, 5);
        this.A03 = iArr;
        this.A04 = iArr2;
        this.A00 = r2;
        this.A02 = num;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiItem(emoji=");
        A10.append(Arrays.toString(this.A03));
        A10.append(", emojiWithSkinTone=");
        A10.append(Arrays.toString(this.A04));
        A10.append(", emojiLoader=");
        A10.append(this.A00);
        A10.append(", qplInstanceKey=");
        C108965cb.A1S(this.A02, A10);
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
