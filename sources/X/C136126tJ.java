package X;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: X.6tJ  reason: invalid class name and case insensitive filesystem */
public final class C136126tJ {
    public Drawable A00 = null;
    public final long A01;
    public final C43271zX A02;
    public final C134316qO A03;
    public final WeakReference A04;
    public final Integer A05;

    public C136126tJ(C43271zX r3, C134316qO r4, Integer num, WeakReference weakReference, long j) {
        C18070vi.A0d(r3, 2);
        this.A01 = j;
        this.A02 = r3;
        this.A04 = weakReference;
        this.A03 = r4;
        this.A05 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136126tJ) {
                C136126tJ r8 = (C136126tJ) obj;
                if (this.A01 != r8.A01 || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A00, r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0I(this.A01) * 31))) + AnonymousClass001.A0k(this.A05)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InternalEmojiTarget(emojiDescriptor=");
        A10.append(this.A01);
        A10.append(", emojiSequence=");
        A10.append(this.A02);
        A10.append(", emojiImageViewRef=");
        A10.append(this.A04);
        A10.append(", tag=");
        A10.append(this.A03);
        A10.append(", qplInstanceKey=");
        A10.append(this.A05);
        A10.append(", icon=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
