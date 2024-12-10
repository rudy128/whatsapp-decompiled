package X;

import android.content.Context;
import android.graphics.Rect;
import com.whatsapp.TextEmojiLabel;
import java.util.HashMap;

/* renamed from: X.1oM  reason: invalid class name and case insensitive filesystem */
public final class C36721oM {
    public final C18030ve A00;
    public final HashMap A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass129 A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public C36721oM(AnonymousClass11C r8, C18030ve r9, AnonymousClass129 r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0d(r9, 1);
        C18070vi.A0d(r11, 2);
        C18070vi.A0d(r8, 3);
        C18070vi.A0d(r10, 4);
        C18070vi.A0d(r12, 5);
        this.A00 = r9;
        this.A05 = r11;
        this.A02 = r8;
        this.A03 = r10;
        this.A04 = r12;
        StringBuilder sb = new StringBuilder();
        sb.append(r10.A02().build());
        sb.append('/');
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("austria-users-options/");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append("uk-users-privacy-policy/");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj);
        sb4.append("austria-users-privacy-policy/");
        this.A01 = AnonymousClass1D7.A07(new AnonymousClass1D6("austria-users-options", sb2.toString()), new AnonymousClass1D6("uk-users-privacy-policy", sb3.toString()), new AnonymousClass1D6("austria-users-privacy-policy", sb4.toString()));
    }

    public final void A00(AnonymousClass1FL r10, TextEmojiLabel textEmojiLabel, String str, String str2, String str3) {
        C18070vi.A0d(str, 0);
        C18070vi.A0d(textEmojiLabel, 4);
        C38541rS r3 = (C38541rS) this.A05.get();
        Context context = textEmojiLabel.getContext();
        C18070vi.A0X(context);
        int A002 = AnonymousClass1YL.A00(textEmojiLabel.getContext(), 2130971981, 2131101293);
        textEmojiLabel.setText(r3.A04(context, new C21467AkY(r10, this, str3), str, str2, A002));
        textEmojiLabel.setMovementMethod(new C39441t5(textEmojiLabel.getAbProps()));
        Rect rect = C39401t1.A0A;
        textEmojiLabel.setAccessibilityHelper(new C39411t2(textEmojiLabel, textEmojiLabel.getSystemServices()));
    }

    public final void A01(AnonymousClass1FL r2, String str) {
        C18070vi.A0d(r2, 1);
        ((C36531o3) this.A04.get()).A01(r2, str);
    }
}
