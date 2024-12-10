package X;

import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.490  reason: invalid class name */
public final class AnonymousClass490 extends A34 {
    public final C24921Me A00;
    public final AnonymousClass1E7 A01;
    public final WeakReference A02;

    public AnonymousClass490(TextEmojiLabel textEmojiLabel, C24921Me r3, AnonymousClass1E7 r4) {
        C18070vi.A0d(r3, 3);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = AnonymousClass3MW.A0z(textEmojiLabel);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C24921Me r3 = this.A00;
        Jid A06 = this.A01.A06(AnonymousClass1E9.class);
        if (A06 != null) {
            String A04 = C24921Me.A04(r3, (AnonymousClass1E9) A06, -1, true);
            C18070vi.A0X(A04);
            return A04;
        }
        throw C17880vN.A0g();
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A02.get();
        if (textEmojiLabel != null) {
            if (AnonymousClass3MZ.A1Y(this.A01, textEmojiLabel.getTag())) {
                textEmojiLabel.setVisibility(0);
                textEmojiLabel.A0S(str, (List) null, 0, false);
            }
        }
    }
}
