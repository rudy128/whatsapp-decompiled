package X;

import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.5jQ  reason: invalid class name and case insensitive filesystem */
public final class C111275jQ extends AnonymousClass1J2 implements AnonymousClass87G {
    public HashSet A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass1DT A02;
    public final EmojiSearchProvider A03;

    public final void A0T() {
        this.A02.A0F(AnonymousClass73J.A02(AnonymousClass3MW.A10(this.A01), this.A00));
    }

    public void C3x(C131976ly r6) {
        List list = r6.A01;
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != null) {
                hashSet.add(obj);
            }
        }
        this.A00 = hashSet;
        A0T();
    }

    public C111275jQ(EmojiSearchProvider emojiSearchProvider) {
        this.A03 = emojiSearchProvider;
        AnonymousClass1DT A0S = C108945cZ.A0S();
        this.A01 = A0S;
        AnonymousClass1DT A0S2 = C108945cZ.A0S();
        this.A02 = A0S2;
        A0S.A0F(C17880vN.A0z(0));
        A0S2.A0F(C17880vN.A0z(0));
    }
}
