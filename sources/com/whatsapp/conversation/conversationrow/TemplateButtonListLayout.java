package com.whatsapp.conversation.conversationrow;

import X.A89;
import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass026;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass190;
import X.AnonymousClass1GP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3uP;
import X.AnonymousClass4VN;
import X.AnonymousClass4ZE;
import X.AnonymousClass4aX;
import X.AnonymousClass5XK;
import X.AnonymousClass70E;
import X.AnonymousClass70P;
import X.C000200d;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C27691Xc;
import X.C28931bI;
import X.C43421zm;
import X.C439421n;
import X.C61762qD;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72813Np;
import X.C89794d2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import java.util.Collections;
import java.util.List;

public class TemplateButtonListLayout extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass190 A00;
    public AnonymousClass4VN A01;
    public AnonymousClass70E A02;
    public C18030ve A03;
    public A89 A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass031 A07;
    public int A08;
    public int A09;
    public boolean A0A;
    public final List A0B;
    public final List A0C;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.whatsapp.conversation.conversationrow.Hilt_TemplateButtonListBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setSeeAllButton(com.whatsapp.TextEmojiLabel r10, X.AnonymousClass1GP r11, java.util.List r12, X.AnonymousClass3uP r13, X.AnonymousClass5XK r14) {
        /*
            r9 = this;
            r7 = r9
            r9.setButtonIconAndText(r10)
            r4 = r13
            X.206 r0 = r13.getFMessage()
            X.205 r0 = r0.A0v
            java.lang.String r2 = r0.toString()
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r2)
            java.lang.String r0 = "TemplateButtonListBottomSheet_"
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r2, r1)
            androidx.fragment.app.Fragment r6 = r11.A0Q(r2)
            boolean r0 = r6 instanceof com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet
            if (r0 == 0) goto L_0x0045
            com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet r6 = (com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet) r6
        L_0x0023:
            X.4Qw r3 = new X.4Qw
            r8 = r12
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            X.4Qw r0 = r6.A01
            if (r0 != 0) goto L_0x0039
            android.view.View r0 = r6.A0B
            if (r0 == 0) goto L_0x0039
            java.util.List r1 = r6.A02
            java.util.List r0 = r6.A03
            r3.A00(r1, r0)
        L_0x0039:
            r6.A01 = r3
            r1 = 2
            X.78R r0 = new X.78R
            r0.<init>(r6, r11, r2, r1)
            r10.setOnClickListener(r0)
            return
        L_0x0045:
            com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet r6 = new com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet
            r6.<init>()
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.TemplateButtonListLayout.setSeeAllButton(com.whatsapp.TextEmojiLabel, X.1GP, java.util.List, X.3uP, X.5XK):void");
    }

    public void A01(Context context) {
        setOrientation(1);
        View.inflate(context, 2131627164, this);
        C28931bI A0s = C72453Mb.A0s(this, 2131431445);
        C28931bI A0s2 = C72453Mb.A0s(this, 2131431446);
        C28931bI A0s3 = C72453Mb.A0s(this, 2131431447);
        List list = this.A0B;
        list.add(A0s);
        list.add(A0s2);
        list.add(A0s3);
        C28931bI A0s4 = C72453Mb.A0s(this, 2131431448);
        C28931bI A0s5 = C72453Mb.A0s(this, 2131431449);
        C28931bI A0s6 = C72453Mb.A0s(this, 2131431450);
        List list2 = this.A0C;
        list2.add(A0s4);
        list2.add(A0s5);
        list2.add(A0s6);
    }

    private void setLimits(List list, String str) {
        int i;
        int A002 = C18020vd.A00(C18040vf.A02, this.A03, 12301);
        if (!AnonymousClass026.A00(str, "MARKETING") || A002 <= 0) {
            if (list != null) {
                this.A08 = list.size();
            }
            i = 3;
        } else {
            List list2 = this.A0B;
            if (list != null) {
                i = Math.min(list2.size(), Math.min(list.size(), A002));
            } else {
                i = Math.min(list2.size(), A002);
            }
            this.A08 = i;
        }
        this.A09 = i;
    }

    public void A00() {
        if (!this.A0A) {
            this.A0A = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A02 = (AnonymousClass70E) r1.A2I.get();
            this.A06 = C000200d.A00(r2.A0c);
            this.A01 = C72453Mb.A0i(r1);
            this.A00 = AnonymousClass3MY.A0N(r1);
            this.A04 = r1.AKY();
            this.A05 = C000200d.A00(r1.A7q);
            this.A03 = AnonymousClass10E.A8r(r1);
        }
    }

    public void A02(AnonymousClass1GP r28, AnonymousClass3uP r29, AnonymousClass5XK r30) {
        C89794d2 r0;
        AnonymousClass3uP r18 = r29;
        C439421n r3 = (C439421n) r18.getFMessage();
        List list = r3.BaE().A06;
        if (list != null) {
            A89.A03(this.A04, "Render Time", list);
            list = C17880vN.A10(r3.BaE().A06);
            list.removeAll(Collections.singletonList((Object) null));
        }
        List<C28931bI> list2 = this.A0C;
        for (C28931bI r1 : list2) {
            if (r1.A00 != null) {
                C72463Mc.A1G(r1);
            }
        }
        setLimits(list, r3.BaE().A04);
        int i = 0;
        for (C28931bI r4 : this.A0B) {
            if (r4.A00 != null) {
                TextView A0M = AnonymousClass3MX.A0M(r4);
                AnonymousClass3MW.A1S(A0M);
                A0M.setSelected(false);
                A0M.setVisibility(8);
            }
            if (!(list == null || i >= this.A08 || list.get(i) == null)) {
                C61762qD r32 = (C61762qD) list.get(i);
                if (!((AnonymousClass70P) this.A05.get()).A09(r32)) {
                    C43421zm.A04(AnonymousClass3MX.A0M(r4));
                    AnonymousClass5XK r12 = r30;
                    if (i != this.A09 - 1 || list.size() <= this.A09) {
                        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) r4.A02();
                        int i2 = r32.A07;
                        if (i2 == 1) {
                            AnonymousClass4ZE r11 = (AnonymousClass4ZE) this.A06.get();
                            Context context = getContext();
                            C18070vi.A0d(context, 0);
                            C72473Md.A1I(textEmojiLabel, r12);
                            textEmojiLabel.setTextSize(r11.A00.A01(context.getTheme(), context.getResources()));
                            int A022 = C72463Mc.A02(context);
                            if (r32.A04) {
                                A022 = 2131102702;
                            }
                            Drawable A052 = AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, 2131233420), A022);
                            C18070vi.A0X(A052);
                            A052.setAlpha(204);
                            AnonymousClass4ZE.A01(context, A052, textEmojiLabel, r32);
                            boolean z = r32.A04;
                            textEmojiLabel.setSelected(z);
                            if (!z) {
                                r0 = new C89794d2(r11, context, textEmojiLabel, A052, r32, r12, 0);
                            } else {
                                r0 = null;
                            }
                            textEmojiLabel.setOnClickListener(r0);
                        } else if (i2 == 2 || i2 == 3) {
                            TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
                            this.A02.A01(getContext(), textEmojiLabel2, r18, (TemplateButtonListBottomSheet) null, r32, isEnabled(), false);
                        }
                    } else {
                        TextEmojiLabel textEmojiLabel3 = (TextEmojiLabel) r4.A02();
                        setSeeAllButton(textEmojiLabel3, r28, list, r18, r12);
                    }
                    AnonymousClass3MY.A1T(r4, 0);
                    ((C28931bI) list2.get(i)).A04(0);
                }
            }
            i++;
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public TemplateButtonListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0B = AnonymousClass000.A13();
        this.A0C = AnonymousClass000.A13();
        this.A08 = 0;
        this.A09 = 0;
        A01(context);
    }

    private void setButtonIconAndText(TextEmojiLabel textEmojiLabel) {
        Drawable A042 = AnonymousClass4aX.A04(getContext(), getContext(), 2130971977, 2131103150, 2131231926);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168999);
        textEmojiLabel.setText(C72813Np.A01(textEmojiLabel.getPaint(), A042, getResources().getString(2131895584), dimensionPixelSize, getResources().getInteger(2131492940)));
        textEmojiLabel.setTextSize(this.A01.A01(AnonymousClass3Ma.A06(this), getResources()));
    }

    public TemplateButtonListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A00();
    }

    public TemplateButtonListLayout(Context context) {
        super(context);
        A00();
        this.A0B = AnonymousClass000.A13();
        this.A0C = AnonymousClass000.A13();
        this.A08 = 0;
        this.A09 = 0;
        A01(context);
    }
}
