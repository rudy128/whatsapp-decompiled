package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.9yV  reason: invalid class name and case insensitive filesystem */
public class C198539yV {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass11C A02;
    public C18030ve A03;
    public AnonymousClass190 A04;
    public AnonymousClass129 A05;

    public static void A00(Context context, TextEmojiLabel textEmojiLabel, C198539yV r11, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            AnonymousClass190 r3 = r11.A04;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("groupname=");
            A10.append(str2);
            r3.A0G("BusinessDirectoryFaqLinkHelper/addDirectoryGeneralFaqLink/group name or article name are null or empty", AnonymousClass001.A1H(", articleName=", str3, A10), true);
            return;
        }
        Uri A052 = r11.A05.A05(str2, str3);
        C18030ve r6 = r11.A03;
        Context context2 = context;
        C26302CxJ.A0K(context2, A052, r11.A00, r11.A01, textEmojiLabel, r11.A02, r6, str, "learn-more");
    }

    public C198539yV(AnonymousClass1L9 r1, AnonymousClass190 r2, AnonymousClass1KB r3, AnonymousClass11C r4, C18030ve r5, AnonymousClass129 r6) {
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r2;
        this.A05 = r6;
        this.A00 = r1;
        this.A02 = r4;
    }
}
