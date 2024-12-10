package X;

import java.util.Arrays;

/* renamed from: X.5zJ  reason: invalid class name and case insensitive filesystem */
public final class C117155zJ extends C125876bp {
    public final AnonymousClass1BI A00;
    public final int[] A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117155zJ(AnonymousClass1BI r2, int[] iArr) {
        super(r2);
        C18070vi.A0d(iArr, 1);
        this.A01 = iArr;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.ExpressionsSideEffects.EmojiSelected");
                if (!Arrays.equals(this.A01, ((C117155zJ) obj).A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiSelected(emoji=");
        A10.append(Arrays.toString(this.A01));
        A10.append(", chatJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
