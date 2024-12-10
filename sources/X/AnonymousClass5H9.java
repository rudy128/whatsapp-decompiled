package X;

import android.view.View;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;

/* renamed from: X.5H9  reason: invalid class name */
public final class AnonymousClass5H9 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ SingleSelectedMessageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5H9(SingleSelectedMessageActivity singleSelectedMessageActivity) {
        super(0);
        this.this$0 = singleSelectedMessageActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        AnonymousClass1BI r0;
        AnonymousClass205 r02;
        SingleSelectedMessageActivity singleSelectedMessageActivity = this.this$0;
        AnonymousClass3U8 r03 = singleSelectedMessageActivity.A04;
        if (r03 == null) {
            str = "singleSelectedMessageViewModel";
        } else {
            AnonymousClass206 A0r = AnonymousClass3MX.A0r(r03.A00);
            C18030ve r6 = singleSelectedMessageActivity.A0E;
            AnonymousClass1L4 r5 = singleSelectedMessageActivity.A09;
            AnonymousClass190 r10 = singleSelectedMessageActivity.A03;
            AnonymousClass1KW r4 = singleSelectedMessageActivity.A0D;
            C1193267r r3 = singleSelectedMessageActivity.A05;
            if (r3 != null) {
                AnonymousClass11C r13 = singleSelectedMessageActivity.A08;
                C18000vb r15 = singleSelectedMessageActivity.A00;
                AnonymousClass00H r04 = singleSelectedMessageActivity.A09;
                if (r04 != null) {
                    EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) r04.get();
                    C19830z4 r14 = singleSelectedMessageActivity.A0A;
                    C18010vc r1 = singleSelectedMessageActivity.A06;
                    if (r1 != null) {
                        KeyboardPopupLayout keyboardPopupLayout = singleSelectedMessageActivity.A01;
                        if (keyboardPopupLayout != null) {
                            WaEditText waEditText = new WaEditText(singleSelectedMessageActivity);
                            if (A0r == null || (r02 = A0r.A0v) == null) {
                                r0 = null;
                            } else {
                                r0 = r02.A00;
                            }
                            Integer A00 = A3P.A00(r0);
                            AnonymousClass00H r05 = singleSelectedMessageActivity.A0A;
                            if (r05 != null) {
                                AnonymousClass1KW r18 = r4;
                                C1193267r r17 = r3;
                                A59 a59 = (A59) r05.get();
                                C74873d3 r7 = new C74873d3(singleSelectedMessageActivity, (View) null, r10, keyboardPopupLayout, waEditText, r13, r14, r15, a59, r17, r18, emojiSearchProvider, r6, r1, r5, 17, A00);
                                r7.A0J(new C92094gk(singleSelectedMessageActivity, 3));
                                AnonymousClass4UI r2 = new AnonymousClass4UI(singleSelectedMessageActivity, r7, (EmojiSearchContainer) C110885hR.A0A(singleSelectedMessageActivity, 2131435123));
                                r7.A0E = new C98554rL(r2, 3);
                                r2.A00 = new AnonymousClass7GE(singleSelectedMessageActivity, r2, 0);
                                r7.A0B = r2;
                                return r7;
                            }
                            str = "expressionUserJourneyLogger";
                        } else {
                            str = "keyboardPopupLayout";
                        }
                    } else {
                        str = "sharedPreferencesFactory";
                    }
                } else {
                    str = "emojiSearchProvider";
                }
            } else {
                str = "recentEmojis";
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
