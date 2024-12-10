package X;

import android.view.View;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet;
import com.whatsapp.expressionstray.ExpressionsTrayView;
import com.whatsapp.group.GroupProfileEmojiEditor;

/* renamed from: X.3bk  reason: invalid class name and case insensitive filesystem */
public class C74483bk extends C6X {
    public final int A00;
    public final Object A01;

    public C74483bk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A02(View view, float f) {
        switch (this.A00) {
            case 0:
                GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = (GroupCallParticipantPickerSheet) this.A01;
                int top = ((int) (((groupCallParticipantPickerSheet.A01 - ((float) view.getTop())) / groupCallParticipantPickerSheet.A00) * 127.0f)) << 24;
                groupCallParticipantPickerSheet.A02.setColor(top);
                groupCallParticipantPickerSheet.getWindow().setStatusBarColor(top);
                return;
            case 1:
                AnonymousClass4aY r2 = (AnonymousClass4aY) this.A01;
                ExpressionsTrayView expressionsTrayView = r2.A3D;
                if (expressionsTrayView != null) {
                    expressionsTrayView.A0F(1);
                    if (!r2.A6f) {
                        AnonymousClass4aY.A0R(view, r2);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                GroupProfileEmojiEditor groupProfileEmojiEditor = (GroupProfileEmojiEditor) this.A01;
                View view2 = groupProfileEmojiEditor.A01;
                if (view2 != null) {
                    GroupProfileEmojiEditor.A0Q(groupProfileEmojiEditor, view2.getHeight() - view.getTop(), view.getTop() - groupProfileEmojiEditor.getSupportActionBar().A09());
                    return;
                }
                return;
            case 4:
                View A06 = AnonymousClass1HF.A06(view, 2131436286);
                if (((double) f) > 0.7d && f < 1.0f) {
                    A06.setAlpha(1.0f - f);
                    return;
                } else if (f == 1.0f) {
                    A06.setAlpha(0.0f);
                    A06.setVisibility(8);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f9, code lost:
        if (r0.getVisibility() != 0) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x018a;
                case 1: goto L_0x009a;
                case 2: goto L_0x008e;
                case 3: goto L_0x0199;
                case 4: goto L_0x002f;
                case 5: goto L_0x001e;
                case 6: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 4
            if (r9 == r0) goto L_0x000b
            r0 = 5
            if (r9 != r0) goto L_0x0012
        L_0x000b:
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
        L_0x0012:
            return
        L_0x0013:
            r1 = 3
            if (r9 == r1) goto L_0x0012
            java.lang.Object r0 = r7.A01
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            r0.A0W(r1)
            return
        L_0x001e:
            r0 = 5
            if (r9 != r0) goto L_0x0012
            java.lang.Object r0 = r7.A01
            com.whatsapp.messagetranslation.onboarding.TranslationViewModel r0 = (com.whatsapp.messagetranslation.onboarding.TranslationViewModel) r0
            X.1NN r1 = r0.A04
            X.1BI r0 = r0.A00
            if (r0 == 0) goto L_0x01ca
            r1.A02(r0)
            return
        L_0x002f:
            java.lang.Object r3 = r7.A01
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r3 = (com.whatsapp.languageselector.LanguageSelectorBottomSheet) r3
            android.app.Dialog r5 = r3.A03
            r0 = 2131436286(0x7f0b22fe, float:1.8494438E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r8, r0)
            r0 = 3
            if (r9 != r0) goto L_0x006e
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A00
            r0 = 1
            r1.A0h = r0
            if (r5 == 0) goto L_0x0057
            android.content.Context r2 = r5.getContext()
            r1 = 2130970200(0x7f040658, float:1.7549103E38)
            r0 = 2131101267(0x7f060653, float:1.7814939E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            X.C28281Zt.A03(r0, r5)
        L_0x0057:
            android.content.res.Resources r3 = X.AnonymousClass3MZ.A09(r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2130970200(0x7f040658, float:1.7549103E38)
            r0 = 2131101267(0x7f060653, float:1.7814939E38)
            X.C72463Mc.A0x(r2, r3, r8, r1, r0)
            r0 = 8
            r4.setVisibility(r0)
            return
        L_0x006e:
            if (r5 == 0) goto L_0x0076
            r0 = 2131102739(0x7f060c13, float:1.7817924E38)
            X.C28281Zt.A03(r0, r5)
        L_0x0076:
            android.content.Context r1 = r8.getContext()
            r0 = 2131232523(0x7f08070b, float:1.8081158E38)
            X.C72453Mb.A17(r1, r8, r0)
            r0 = 4
            if (r9 == r0) goto L_0x0012
            r0 = 0
            r4.setVisibility(r0)
            r0 = 5
            if (r9 != r0) goto L_0x0012
            r3.A28()
            return
        L_0x008e:
            r0 = 4
            if (r9 == r0) goto L_0x0094
            r0 = 5
            if (r9 != r0) goto L_0x0012
        L_0x0094:
            java.lang.Object r0 = r7.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x009a:
            r0 = 5
            r6 = 4
            r3 = 1
            r5 = 0
            if (r9 != r0) goto L_0x011e
            java.lang.Object r4 = r7.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r4.A3D
            if (r0 == 0) goto L_0x00b2
            r0.A0E()
            com.whatsapp.expressionstray.ExpressionsTrayView r1 = r4.A3D
            r0 = 8
            r1.setVisibility(r0)
        L_0x00b2:
            X.0ve r1 = r4.A3F
            X.C18070vi.A0d(r1, r5)
            r0 = 10925(0x2aad, float:1.5309E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            r2 = 2131232116(0x7f080574, float:1.8080332E38)
            if (r0 == 0) goto L_0x00c5
            r2 = 2131232331(0x7f08064b, float:1.8080768E38)
        L_0x00c5:
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131890250(0x7f12104a, float:1.9415187E38)
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass4aY.A1b(r4, r0, r2)
            com.whatsapp.KeyboardPopupLayout r0 = r4.A1M
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -1
            r1.height = r0
            com.whatsapp.KeyboardPopupLayout r0 = r4.A1M
            r0.requestLayout()
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A0i
            if (r0 == 0) goto L_0x00ea
            r4.A6f = r3
            r0.A0W(r6)
        L_0x00ea:
            X.5cQ r0 = r4.A2Q
            com.whatsapp.reactions.ReactionsTrayViewModel r2 = r0.getReactionsTrayViewModel()
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r4.A39
            if (r0 == 0) goto L_0x00fb
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == 0) goto L_0x00fc
        L_0x00fb:
            r1 = 0
        L_0x00fc:
            X.5cQ r0 = r4.A2Q
            boolean r0 = r0.Bg6()
            if (r0 == 0) goto L_0x0110
            if (r2 == 0) goto L_0x0110
            if (r1 != 0) goto L_0x0110
            X.5cQ r0 = r4.A2Q
            r0.BLL()
            r2.A0T(r5)
        L_0x0110:
            java.lang.Object r0 = r7.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r0.A3D
            if (r0 == 0) goto L_0x0012
            if (r9 == r3) goto L_0x0012
            r0.A0F(r9)
            return
        L_0x011e:
            if (r9 != r6) goto L_0x017a
            java.lang.Object r4 = r7.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            boolean r0 = r4.A6f
            if (r0 == 0) goto L_0x012a
            r4.A6f = r5
        L_0x012a:
            com.whatsapp.expressionstray.ExpressionsTrayView r2 = r4.A3D
            if (r2 == 0) goto L_0x0138
            r1 = 41
            X.4rj r0 = new X.4rj
            r0.<init>((java.lang.Object) r7, (int) r1)
            r2.post(r0)
        L_0x0138:
            boolean r0 = X.AnonymousClass4aY.A25(r4)
            if (r0 == 0) goto L_0x0149
            X.4Ys r0 = X.C72473Md.A0Q(r4)
            X.3rd r0 = r0.A00
            if (r0 == 0) goto L_0x0149
            r0.A06()
        L_0x0149:
            boolean r0 = r4.A71
            if (r0 == 0) goto L_0x0153
            r4.A71 = r5
            X.AnonymousClass4aY.A1A(r4)
            return
        L_0x0153:
            boolean r0 = r4.A70
            if (r0 == 0) goto L_0x015d
            r4.A70 = r5
            X.AnonymousClass4aY.A12(r4)
            return
        L_0x015d:
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r4.A3D
            if (r0 == 0) goto L_0x0164
            r0.A0C()
        L_0x0164:
            boolean r0 = r4.A6j
            if (r0 == 0) goto L_0x0186
            X.0ve r2 = r4.A3F
            X.C18070vi.A0d(r2, r5)
            r1 = 8304(0x2070, float:1.1636E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0186
            r4.A6j = r5
            goto L_0x0110
        L_0x017a:
            r0 = 3
            if (r9 != r0) goto L_0x0110
            java.lang.Object r4 = r7.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            boolean r0 = r4.A6f
            if (r0 == 0) goto L_0x0186
            return
        L_0x0186:
            r4.A2N()
            goto L_0x0110
        L_0x018a:
            r0 = 5
            if (r9 != r0) goto L_0x0012
            java.lang.Object r1 = r7.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r1.finish()
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x0199:
            r0 = 5
            java.lang.Object r3 = r7.A01
            com.whatsapp.group.GroupProfileEmojiEditor r3 = (com.whatsapp.group.GroupProfileEmojiEditor) r3
            if (r9 != r0) goto L_0x01b4
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r3.A09
            r0.A0E()
            com.whatsapp.KeyboardPopupLayout r0 = r3.A06
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -1
            r1.height = r0
        L_0x01ae:
            com.whatsapp.KeyboardPopupLayout r0 = r3.A06
            r0.requestLayout()
            return
        L_0x01b4:
            com.whatsapp.KeyboardPopupLayout r0 = r3.A06
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            int r1 = r8.getTop()
            X.01n r0 = r3.getSupportActionBar()
            int r0 = r0.A09()
            int r1 = r1 - r0
            r2.height = r1
            goto L_0x01ae
        L_0x01ca:
            java.lang.String r0 = "chatJid"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74483bk.A03(android.view.View, int):void");
    }
}
