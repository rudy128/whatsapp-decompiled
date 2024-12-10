package X;

import android.app.Activity;
import android.widget.PopupWindow;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.9p9  reason: invalid class name and case insensitive filesystem */
public class C192889p9 {
    public final Activity A00;
    public final AnonymousClass190 A01;
    public final KeyboardPopupLayout A02;
    public final AnonymousClass11C A03;
    public final C19830z4 A04;
    public final C18000vb A05;
    public final C136686uD A06;
    public final A59 A07;
    public final C1193267r A08;
    public final AnonymousClass1KW A09;
    public final EmojiSearchProvider A0A;
    public final C18030ve A0B;
    public final AnonymousClass18K A0C;
    public final C134206qD A0D;
    public final C140126zz A0E;
    public final C18010vc A0F;
    public final C111185ii A0G;
    public final AnonymousClass1L4 A0H;
    public final HashMap A0I = C17880vN.A11();

    public void A00() {
        PopupWindow popupWindow;
        HashMap hashMap = this.A0I;
        if (hashMap.containsKey(1) && (popupWindow = (PopupWindow) hashMap.get(1)) != null) {
            popupWindow.dismiss();
        }
    }

    public void A01(int i) {
        AnonymousClass3RR r0;
        PopupWindow popupWindow;
        HashMap hashMap = this.A0I;
        Iterator A0k = C17890vO.A0k(hashMap);
        while (A0k.hasNext()) {
            Number number = (Number) A0k.next();
            if (!(number.intValue() == i || (popupWindow = (PopupWindow) hashMap.get(number)) == null)) {
                popupWindow.dismiss();
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf) && (r0 = (AnonymousClass3RR) hashMap.get(valueOf)) != null) {
            r0.A0D();
        }
    }

    public C192889p9(Activity activity, AnonymousClass190 r3, KeyboardPopupLayout keyboardPopupLayout, AnonymousClass11C r5, C19830z4 r6, C18000vb r7, C136686uD r8, A59 a59, C1193267r r10, AnonymousClass1KW r11, EmojiSearchProvider emojiSearchProvider, C18030ve r13, AnonymousClass18K r14, C134206qD r15, C140126zz r16, C18010vc r17, C111185ii r18, AnonymousClass1L4 r19) {
        this.A0B = r13;
        this.A0H = r19;
        this.A01 = r3;
        this.A0C = r14;
        this.A09 = r11;
        this.A08 = r10;
        this.A03 = r5;
        this.A05 = r7;
        this.A0E = r16;
        this.A0A = emojiSearchProvider;
        this.A04 = r6;
        this.A0F = r17;
        this.A07 = a59;
        this.A0D = r15;
        this.A0G = r18;
        this.A00 = activity;
        this.A02 = keyboardPopupLayout;
        this.A06 = r8;
    }
}
