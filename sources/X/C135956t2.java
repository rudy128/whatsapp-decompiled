package X;

import java.lang.ref.WeakReference;

/* renamed from: X.6t2  reason: invalid class name and case insensitive filesystem */
public final class C135956t2 {
    public final long A00;
    public final C43271zX A01;
    public final C134316qO A02;
    public final Integer A03;
    public final WeakReference A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135956t2) {
                C135956t2 r8 = (C135956t2) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0I(this.A00) * 31))) + AnonymousClass001.A0k(this.A03);
    }

    public C135956t2(C43271zX r1, C134316qO r2, Integer num, WeakReference weakReference, long j) {
        this.A00 = j;
        this.A01 = r1;
        this.A04 = weakReference;
        this.A02 = r2;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiLoadingTask(emojiDescriptor=");
        A10.append(this.A00);
        A10.append(", emojiSequence=");
        A10.append(this.A01);
        A10.append(", emojiImageViewRef=");
        A10.append(this.A04);
        A10.append(", tag=");
        A10.append(this.A02);
        A10.append(", qplInstanceKey=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
