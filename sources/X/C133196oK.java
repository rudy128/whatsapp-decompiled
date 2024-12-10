package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6oK  reason: invalid class name and case insensitive filesystem */
public final class C133196oK {
    public final Activity A00;
    public final AnonymousClass1L9 A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1M9 A03;
    public final C37451pZ A04;
    public final C36531o3 A05;
    public final C18030ve A06;
    public final AnonymousClass129 A07;
    public final AnonymousClass11C A08;
    public final AnonymousClass1LU A09;
    public final C38541rS A0A;

    public final void A00(Context context, TextEmojiLabel textEmojiLabel, String str) {
        boolean A15 = C18070vi.A15(textEmojiLabel, str);
        int A022 = C72463Mc.A02(context);
        textEmojiLabel.setText(this.A0A.A04(context, new C21431Ajy(this, context, A15 ? 1 : 0), str, "learn-more", A022));
        AnonymousClass3Ma.A1K(textEmojiLabel, this.A08);
        AnonymousClass3Ma.A1I(textEmojiLabel, this.A06);
    }

    public C133196oK(Activity activity, AnonymousClass1L9 r3, AnonymousClass1KB r4, AnonymousClass1M9 r5, C37451pZ r6, C36531o3 r7, AnonymousClass11C r8, C18030ve r9, AnonymousClass1LU r10, AnonymousClass129 r11, C38541rS r12) {
        C18070vi.A0w(r9, r10, r3, r8, r12);
        C18070vi.A0q(r11, r5, r4);
        C18070vi.A0d(r7, 9);
        this.A06 = r9;
        this.A09 = r10;
        this.A01 = r3;
        this.A08 = r8;
        this.A0A = r12;
        this.A07 = r11;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = r7;
        this.A00 = activity;
        this.A04 = r6;
    }
}
