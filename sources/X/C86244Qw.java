package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet;
import com.whatsapp.conversation.conversationrow.TemplateButtonListLayout;
import java.util.List;

/* renamed from: X.4Qw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C86244Qw {
    public final /* synthetic */ AnonymousClass3uP A00;
    public final /* synthetic */ AnonymousClass5XK A01;
    public final /* synthetic */ TemplateButtonListBottomSheet A02;
    public final /* synthetic */ TemplateButtonListLayout A03;
    public final /* synthetic */ List A04;

    public final void A00(List list, List list2) {
        AnonymousClass78S r0;
        TemplateButtonListLayout templateButtonListLayout = this.A03;
        List<C61762qD> list3 = this.A04;
        TemplateButtonListBottomSheet templateButtonListBottomSheet = this.A02;
        AnonymousClass3uP r25 = this.A00;
        AnonymousClass5XK r8 = this.A01;
        List<C28931bI> list4 = list;
        if (list != null) {
            for (C28931bI r1 : list4) {
                if (r1.A00 != null) {
                    TextView A0M = AnonymousClass3MX.A0M(r1);
                    AnonymousClass3MW.A1S(A0M);
                    A0M.setSelected(false);
                    A0M.setVisibility(8);
                }
            }
        }
        List<C28931bI> list5 = list2;
        if (list2 != null) {
            for (C28931bI r12 : list5) {
                if (r12.A00 != null) {
                    C72463Mc.A1G(r12);
                }
            }
        }
        if (list != null) {
            int min = Math.min(list4.size(), list3.size());
            for (int i = 0; i < min; i++) {
                C28931bI r4 = (C28931bI) list4.get(i);
                C43421zm.A04(AnonymousClass3MX.A0M(r4));
                C61762qD r3 = (C61762qD) list3.get(i);
                if (r3 != null) {
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) r4.A02();
                    int i2 = r3.A07;
                    if (i2 == 1) {
                        AnonymousClass4ZE r14 = (AnonymousClass4ZE) templateButtonListLayout.A06.get();
                        Context context = templateButtonListLayout.getContext();
                        boolean A17 = C18070vi.A17(context, textEmojiLabel);
                        C18070vi.A0f(templateButtonListBottomSheet, 2, r8);
                        textEmojiLabel.setTextSize(r14.A00.A01(context.getTheme(), context.getResources()));
                        int i3 = 2131102701;
                        if (r3.A04) {
                            i3 = 2131102702;
                        }
                        Drawable A05 = AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, 2131233420), i3);
                        C18070vi.A0X(A05);
                        A05.setAlpha(204);
                        AnonymousClass4ZE.A01(context, A05, textEmojiLabel, r3);
                        boolean z = r3.A04;
                        textEmojiLabel.setSelected(z);
                        if (!z) {
                            AnonymousClass4ZE r17 = r14;
                            Context context2 = context;
                            r0 = new AnonymousClass78S(r17, context2, textEmojiLabel, A05, r3, r8, templateButtonListBottomSheet, A17 ? 1 : 0);
                        } else {
                            r0 = null;
                        }
                        textEmojiLabel.setOnClickListener(r0);
                    } else if (i2 == 2 || i2 == 3) {
                        templateButtonListLayout.A02.A01(templateButtonListLayout.getContext(), textEmojiLabel, r25, templateButtonListBottomSheet, r3, templateButtonListLayout.isEnabled(), true);
                    }
                }
                r4.A04(0);
            }
        }
        if (list2 != null) {
            int i4 = 0;
            boolean z2 = false;
            for (C61762qD r02 : list3) {
                boolean A1T = AnonymousClass000.A1T(r02.A07, 1);
                if (i4 == 0) {
                    z2 = A1T;
                } else if (z2 != A1T) {
                    ((C28931bI) list5.get(i4 - 1)).A04(0);
                    return;
                }
                i4++;
            }
        }
    }

    public /* synthetic */ C86244Qw(AnonymousClass3uP r1, AnonymousClass5XK r2, TemplateButtonListBottomSheet templateButtonListBottomSheet, TemplateButtonListLayout templateButtonListLayout, List list) {
        this.A03 = templateButtonListLayout;
        this.A04 = list;
        this.A02 = templateButtonListBottomSheet;
        this.A00 = r1;
        this.A01 = r2;
    }
}
