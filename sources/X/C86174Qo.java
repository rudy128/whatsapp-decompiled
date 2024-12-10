package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4Qo  reason: invalid class name and case insensitive filesystem */
public final class C86174Qo {
    public final AnonymousClass1L9 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11C A02;
    public final C18030ve A03;

    public final void A00(Context context, TextEmojiLabel textEmojiLabel) {
        C18070vi.A0d(textEmojiLabel, 1);
        C18030ve r7 = this.A03;
        AnonymousClass1KB r4 = this.A01;
        AnonymousClass1L9 r3 = this.A00;
        AnonymousClass11C r6 = this.A02;
        String string = context.getString(2131895961);
        C26302CxJ.A0K(context, Uri.parse("https://faq.whatsapp.com/5064231857013976"), r3, r4, textEmojiLabel, r6, r7, string, "passkeys_learn_more_uri");
    }

    public C86174Qo(AnonymousClass1L9 r1, AnonymousClass1KB r2, AnonymousClass11C r3, C18030ve r4) {
        C18070vi.A0s(r4, r2, r1, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
