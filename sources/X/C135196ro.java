package X;

import com.whatsapp.expressionstray.expression.emoji.view.EmojiImageView;

/* renamed from: X.6ro  reason: invalid class name and case insensitive filesystem */
public final class C135196ro {
    public final long A00;
    public final C43271zX A01;
    public final EmojiImageView A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135196ro) {
                C135196ro r8 = (C135196ro) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0I(this.A00) * 31));
    }

    public C135196ro(C43271zX r1, EmojiImageView emojiImageView, long j) {
        this.A00 = j;
        this.A01 = r1;
        this.A02 = emojiImageView;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiTarget(emojiDescriptor=");
        A10.append(this.A00);
        A10.append(", emojiSequence=");
        A10.append(this.A01);
        A10.append(", emojiImageView=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
