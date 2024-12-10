package com.whatsapp.mediacomposer.ui.caption;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11C;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass48A;
import X.AnonymousClass48C;
import X.AnonymousClass48E;
import X.C108515bp;
import X.C135316s0;
import X.C17880vN;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C28931bI;
import X.C72453Mb;
import X.C72563Mq;
import X.C90944et;
import X.C94354kU;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.mentions.MentionableEntry;

public final class CaptionFragment extends Hilt_CaptionFragment {
    public AnonymousClass11C A00;
    public AnonymousClass1KW A01;
    public C18010vc A02;
    public CaptionView A03;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        CaptionView captionView = (CaptionView) view.findViewById(2131428836);
        AnonymousClass1Y5.A02(captionView, 2131886466);
        captionView.setLayoutTransition(new C72563Mq());
        this.A03 = captionView;
    }

    public final CaptionView A26() {
        CaptionView captionView = this.A03;
        if (captionView != null) {
            return captionView;
        }
        throw C17880vN.A0g();
    }

    public final void A29(C108515bp r18) {
        String str;
        CaptionView A26 = A26();
        AnonymousClass1KW r9 = this.A01;
        if (r9 != null) {
            AnonymousClass11C r6 = this.A00;
            if (r6 != null) {
                C18010vc r11 = this.A02;
                if (r11 != null) {
                    MentionableEntry mentionableEntry = A26.A0B;
                    C18030ve abProps = A26.getAbProps();
                    C18000vb whatsAppLocale = A26.getWhatsAppLocale();
                    AnonymousClass1L2 emojiRichFormatterStaticCaller = A26.getEmojiRichFormatterStaticCaller();
                    TextView A0M = AnonymousClass3MX.A0M(C28931bI.A00(A26, 2131429680));
                    A0M.setVisibility(8);
                    mentionableEntry.addTextChangedListener(new AnonymousClass48A(mentionableEntry, A0M, r6, whatsAppLocale, emojiRichFormatterStaticCaller, r9, abProps, r11, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 30, true, true, true));
                    mentionableEntry.addTextChangedListener(new AnonymousClass48C(mentionableEntry, A26.getWhatsAppLocale()));
                    AnonymousClass48E.A00(mentionableEntry, A26, 14);
                    C108515bp r3 = r18;
                    mentionableEntry.setOnEditorActionListener(new C90944et(r3, 4));
                    mentionableEntry.A01 = new C94354kU(A26, r3);
                    return;
                }
                str = "sharedPreferencesFactory";
            } else {
                str = "systemServices";
            }
        } else {
            str = "emojiLoader";
        }
        C18070vi.A11(str);
        throw null;
    }

    public final void A2B(Integer num) {
        int intValue;
        C28931bI r1;
        int i;
        CaptionView A26;
        View A022;
        Context context;
        int i2;
        if (num != null && (intValue = num.intValue()) != -1) {
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        A26 = A26();
                        C28931bI r2 = A26.A0C;
                        boolean z = false;
                        if (r2.A00 != null) {
                            z = true;
                        }
                        if (z) {
                            r2.A09(true);
                        }
                        C28931bI r22 = A26.A0G;
                        r22.A04(0);
                        r22.A09(true);
                        r22.A02().setActivated(false);
                        A022 = r22.A02();
                        context = A26.getContext();
                        i2 = 2131897947;
                    } else if (intValue == 3) {
                        A26 = A26();
                        A26.A0C.A09(false);
                        C28931bI r23 = A26.A0G;
                        r23.A04(0);
                        r23.A09(true);
                        r23.A02().setActivated(true);
                        A022 = r23.A02();
                        context = A26.getContext();
                        i2 = 2131897946;
                    } else {
                        throw AnonymousClass000.A0n(AnonymousClass001.A1E(num, "Unexpected value: ", AnonymousClass000.A10()));
                    }
                    AnonymousClass3MY.A0w(context, A022, i2);
                } else {
                    A26 = A26();
                    C28931bI r12 = A26.A0C;
                    if (r12.A00 != null) {
                        r12.A09(true);
                    }
                    C28931bI r24 = A26.A0G;
                    AnonymousClass3MY.A0I(r24, 0).setActivated(false);
                    r24.A09(false);
                }
                r1 = A26.A0H;
                i = 8;
            } else {
                CaptionView A262 = A26();
                C28931bI r13 = A262.A0C;
                if (r13.A00 != null) {
                    r13.A09(true);
                }
                A262.A0G.A04(8);
                r1 = A262.A0H;
                i = 0;
            }
            r1.A04(i);
        }
    }

    public void A1r() {
        super.A1r();
        A26().A0B.A0L();
    }

    public final ImageButton A25() {
        int A012 = A26().A0D.A01();
        ImageButton imageButton = (ImageButton) AnonymousClass3MX.A0D(A26().A0D);
        imageButton.setVisibility(A012);
        return imageButton;
    }

    public final C135316s0 A27() {
        return new C135316s0(new SpannedString(A26().getCaptionText()), A26().getCaptionStringText(), A26().A0B.getMentions());
    }

    public final void A28() {
        CaptionView A26 = A26();
        A26.A0C.A04(8);
        A26.A0E.A04(0);
    }

    public final void A2A(Boolean bool) {
        CaptionView A26 = A26();
        boolean A1Y = C72453Mb.A1Y(bool);
        MentionableEntry mentionableEntry = A26.A0B;
        mentionableEntry.setScrollBarStyle(33554432);
        int i = 0;
        mentionableEntry.setClickable(false);
        mentionableEntry.setCursorVisible(false);
        mentionableEntry.setFocusable(false);
        mentionableEntry.setFocusableInTouchMode(false);
        mentionableEntry.setImportantForAccessibility(2);
        A26.A0C.A04(0);
        C28931bI r0 = A26.A0F;
        if (!A1Y) {
            i = 8;
        }
        r0.A04(i);
        A26.A0D.A04(8);
    }
}
