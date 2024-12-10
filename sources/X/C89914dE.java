package X;

import android.view.View;

/* renamed from: X.4dE  reason: invalid class name and case insensitive filesystem */
public class C89914dE implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C89914dE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C89914dE(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f1, code lost:
        com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet.A00(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02f4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02f7, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02fb, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0446, code lost:
        X.C87464Vr.A01(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0449, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0482, code lost:
        r1.A0T(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0485, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        r2.A29();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x022c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A00
            r2 = r20
            switch(r0) {
                case 0: goto L_0x0166;
                case 1: goto L_0x0189;
                case 2: goto L_0x0011;
                case 3: goto L_0x0063;
                case 4: goto L_0x0197;
                case 5: goto L_0x01bd;
                case 6: goto L_0x01c2;
                case 7: goto L_0x0009;
                case 8: goto L_0x0009;
                case 9: goto L_0x01f2;
                case 10: goto L_0x01f8;
                case 11: goto L_0x01f2;
                case 12: goto L_0x0009;
                case 13: goto L_0x00a8;
                case 14: goto L_0x021a;
                case 15: goto L_0x022d;
                case 16: goto L_0x0235;
                case 17: goto L_0x00b2;
                case 18: goto L_0x023d;
                case 19: goto L_0x0245;
                case 20: goto L_0x026b;
                case 21: goto L_0x02ab;
                case 22: goto L_0x02fc;
                case 23: goto L_0x0304;
                case 24: goto L_0x030c;
                case 25: goto L_0x0314;
                case 26: goto L_0x031c;
                case 27: goto L_0x0324;
                case 28: goto L_0x0333;
                case 29: goto L_0x0342;
                case 30: goto L_0x0351;
                case 31: goto L_0x0364;
                case 32: goto L_0x00d9;
                case 33: goto L_0x038c;
                case 34: goto L_0x03e5;
                case 35: goto L_0x03ff;
                case 36: goto L_0x0415;
                case 37: goto L_0x0420;
                case 38: goto L_0x0010;
                case 39: goto L_0x0153;
                case 40: goto L_0x0434;
                case 41: goto L_0x044e;
                case 42: goto L_0x045f;
                case 43: goto L_0x0469;
                case 44: goto L_0x0476;
                case 45: goto L_0x0486;
                case 46: goto L_0x048e;
                case 47: goto L_0x0496;
                case 48: goto L_0x0009;
                case 49: goto L_0x049e;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r5 = r1.A01
            X.BqR r5 = (X.C23816BqR) r5
            com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView r4 = r5.A03
            java.lang.Runnable r2 = r5.A03
            r4.removeCallbacks(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r2, r0)
            int r0 = r5.A00
            int r1 = r0 + 1
            r5.A00 = r1
            r0 = 3
            if (r1 != r0) goto L_0x0010
            android.graphics.drawable.Drawable r3 = r5.getPopupDrawable()
            X.5cR r2 = r5.A0k
            if (r2 == 0) goto L_0x0010
            if (r3 == 0) goto L_0x0010
            android.widget.ImageView r0 = r5.A01
            if (r0 != 0) goto L_0x005d
            android.widget.ImageView r0 = X.C72453Mb.A0U(r5)
            r5.A01 = r0
            r0 = -2
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 17
            r1.gravity = r0
            android.widget.ImageView r0 = r5.A01
            r0.setLayoutParams(r1)
            android.widget.ImageView r1 = r5.A01
            r0 = 4
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r5.A01
            r0.setImageDrawable(r3)
            android.widget.ImageView r0 = r5.A01
            r4.addView(r0)
        L_0x005d:
            android.widget.ImageView r0 = r5.A01
            r2.BC4(r3, r0)
            return
        L_0x0063:
            java.lang.Object r7 = r1.A01
            X.BqW r7 = (X.C23819BqW) r7
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r0 = r7.A0M
            boolean r0 = r0.isClickable()
            if (r0 == 0) goto L_0x0010
            X.CWL r1 = r7.A0K
            X.206 r0 = r7.A0I
            X.21V r0 = (X.AnonymousClass21V) r0
            X.22l r0 = (X.C441822l) r0
            r1.A00(r0)
            X.1f4 r0 = r7.A0J
            X.22l r1 = r0.A02()
            X.206 r6 = r7.A0I
            X.21V r6 = (X.AnonymousClass21V) r6
            X.22l r6 = (X.C441822l) r6
            X.C18070vi.A0X(r6)
            X.5cR r5 = r7.A0k
            boolean r0 = r5 instanceof X.C108295bS
            if (r0 == 0) goto L_0x0010
            if (r1 == 0) goto L_0x0010
            long r3 = r1.A0x
            long r1 = r6.A0x
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            X.5bS r5 = (X.C108295bS) r5
            X.18O r1 = r7.A0W
            X.18Q r0 = X.AnonymousClass18O.A0n
            int r0 = r1.A04(r0)
            long r0 = (long) r0
            r5.CFp(r6, r0)
            return
        L_0x00a8:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
            if (r0 == 0) goto L_0x0010
            r0.invoke()
            return
        L_0x00b2:
            java.lang.Object r5 = r1.A01
            X.4C3 r5 = (X.AnonymousClass4C3) r5
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            android.content.Context r0 = r5.A00
            android.app.Activity r4 = X.AnonymousClass1L9.A00(r0)
            boolean r0 = r4 instanceof X.AnonymousClass01E
            r3 = 0
            if (r0 == 0) goto L_0x0010
            X.1EC r1 = r5.A02
            r0 = 1
            android.content.Intent r2 = X.AnonymousClass1LU.A13(r4, r1, r2, r0, r0)
            java.lang.String r1 = X.C72463Mc.A0p(r4)
            X.11P r0 = r5.A01
            X.C60442o2.A00(r2, r0, r1)
            r4.startActivity(r2, r3)
            return
        L_0x00d9:
            java.lang.Object r3 = r1.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            com.whatsapp.conversation.ConversationListView r1 = r3.A2B
            r0 = 0
            r1.onWindowFocusChanged(r0)
            X.3Oz r2 = X.AnonymousClass3MX.A0c(r3)
            X.3VQ r0 = r3.A2b
            java.util.ArrayList r0 = r0.A1G
            boolean r0 = X.C17880vN.A1X(r0)
            if (r0 == 0) goto L_0x0010
            java.util.Set r0 = r2.A0V
            r0.clear()
            com.whatsapp.conversation.ConversationListView r0 = r3.A2B
            int r1 = r0.getFirstVisiblePosition()
            X.206 r7 = r2.getItem(r1)
            if (r7 == 0) goto L_0x010e
            X.205 r0 = r7.A0v
            X.1BI r0 = r0.A00
            if (r0 != 0) goto L_0x010e
            int r0 = r1 + 1
            X.206 r7 = r2.getItem(r0)
        L_0x010e:
            X.3VQ r9 = r3.A2b
            r1 = 2131166321(0x7f070471, float:1.7946884E38)
            android.content.res.Resources r0 = X.AnonymousClass3MW.A04(r3)
            int r14 = r0.getDimensionPixelSize(r1)
            int r15 = r2.A04()
            com.whatsapp.conversation.ConversationListView r0 = r3.A2B
            int r16 = r0.getFirstVisiblePosition()
            int r17 = r2.getCount()
            java.util.ArrayList r6 = r9.A1G
            boolean r0 = X.C17880vN.A1X(r6)
            if (r0 == 0) goto L_0x0010
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            if (r7 == 0) goto L_0x04c2
            java.util.Iterator r8 = r6.iterator()
        L_0x013b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04c2
            X.206 r5 = X.C17880vN.A0Y(r8)
            long r2 = r5.A0y
            long r0 = r7.A0y
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x013b
            X.205 r0 = r5.A0v
            r13.add(r0)
            goto L_0x013b
        L_0x0153:
            java.lang.Object r1 = r1.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            boolean r0 = X.AnonymousClass4aY.A23(r1)
            if (r0 == 0) goto L_0x0010
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r1.A0i
            if (r1 == 0) goto L_0x0010
            r0 = 5
            r1.A0W(r0)
            return
        L_0x0166:
            java.lang.Object r0 = r1.A01
            X.4VQ r0 = (X.AnonymousClass4VQ) r0
            X.4MQ r4 = r0.A0H
            X.0z4 r3 = r4.A01
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r3)
            java.lang.String r2 = "is_last_video_autoplay_mute"
            boolean r0 = X.AnonymousClass3MX.A1T(r0, r2)
            r1 = r0 ^ 1
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r3)
            X.C17880vN.A1F(r0, r2, r1)
            X.2Ku r1 = r4.A00
            r0 = 11
            X.C17890vO.A0q(r1, r0)
            return
        L_0x0189:
            java.lang.Object r0 = r1.A01
            X.4VQ r0 = (X.AnonymousClass4VQ) r0
            X.1KB r2 = r0.A0D
            r1 = 2131897844(0x7f122df4, float:1.9430589E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x0197:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r3 = (com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet) r3
            java.lang.String r0 = "https://www.whatsapp.com/security"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r0)
            X.1L9 r1 = r3.A01
            android.content.Context r0 = r3.A1n()
            r1.A08(r0, r2)
            int r2 = r3.A00
            r0 = -1
            if (r2 == r0) goto L_0x01b9
            X.1nr r1 = r3.A03
            r0 = 2
            r1.A00(r2, r0)
        L_0x01b9:
            r3.A29()
            return
        L_0x01bd:
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.DialogFragment r2 = (androidx.fragment.app.DialogFragment) r2
            goto L_0x0229
        L_0x01c2:
            java.lang.Object r0 = r1.A01
            X.4Q7 r0 = (X.AnonymousClass4Q7) r0
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00
            X.4Zw r0 = r0.A09
            X.5XZ r1 = r0.A04
            X.4lM r1 = (X.C94894lM) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r1 = r1.A01
            X.3uK r1 = (X.AnonymousClass3uK) r1
            X.21V r0 = r1.getFMessage()
            boolean r0 = X.AnonymousClass4H3.A00(r0)
            if (r0 != 0) goto L_0x01e4
            r1.A20()
            return
        L_0x01e4:
            X.1rL r0 = r1.A0M
            r0.A04(r2)
            return
        L_0x01ea:
            java.lang.Object r0 = r1.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            r0.A20()
            return
        L_0x01f2:
            java.lang.Object r0 = r1.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x01f8:
            java.lang.Object r0 = r1.A01
            X.3wT r0 = (X.C80053wT) r0
            com.whatsapp.reactions.ReactionsTrayViewModel r4 = r0.A0K
            X.9mo r3 = r4.A0E
            X.206 r2 = r4.A0M
            if (r2 == 0) goto L_0x0215
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            int r0 = r4.A01
            r3.A00(r2, r1, r0)
            r0 = 2
            r4.A0T(r0)
            X.11C r0 = r4.A09
            X.AnonymousClass4a5.A04(r0)
            return
        L_0x0215:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x021a:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversation.conversationrow.bottomsheets.GenericSystemInfoBottomSheet r2 = (com.whatsapp.conversation.conversationrow.bottomsheets.GenericSystemInfoBottomSheet) r2
            boolean r0 = r2 instanceof com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet
            if (r0 == 0) goto L_0x0229
            r1 = r2
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet r1 = (com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet) r1
            r0 = 1
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet.A00(r1, r0)
        L_0x0229:
            r2.A29()
            return
        L_0x022d:
            java.lang.Object r0 = r1.A01
            X.Bpg r0 = (X.C23797Bpg) r0
            X.C23797Bpg.A0F(r0)
            return
        L_0x0235:
            java.lang.Object r0 = r1.A01
            X.485 r0 = (X.AnonymousClass485) r0
            X.AnonymousClass485.setupReadMoreClickListener$lambda$1(r0, r2)
            return
        L_0x023d:
            java.lang.Object r0 = r1.A01
            X.BwV r0 = (X.C24162BwV) r0
            X.C24162BwV.A01(r0)
            return
        L_0x0245:
            java.lang.Object r4 = r1.A01
            com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet r4 = (com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet) r4
            X.0vl r0 = r4.A0D
            java.lang.Object r3 = X.AnonymousClass3MX.A14(r0)
            r0 = 9
            com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet.A01(r4, r0)
            X.1KB r2 = r4.A01
            if (r2 == 0) goto L_0x02da
            X.11C r1 = r4.A03
            if (r1 == 0) goto L_0x0267
            java.lang.String r0 = r3.toString()
            X.C29551cT.A02(r2, r1, r0)
            r4.A28()
            return
        L_0x0267:
            java.lang.String r0 = "systemServices"
            goto L_0x02f7
        L_0x026b:
            java.lang.Object r4 = r1.A01
            com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet r4 = (com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet) r4
            X.0vl r0 = r4.A0C
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x02dd
            android.content.Context r1 = r4.A14()
            java.lang.Class<X.1FY> r0 = X.AnonymousClass1FY.class
            android.app.Activity r0 = X.AnonymousClass1L9.A01(r1, r0)
            X.1FL r0 = (X.AnonymousClass1FL) r0
            X.1GP r3 = X.AnonymousClass3MX.A0O(r0)
            X.0vl r0 = r4.A09
            java.lang.Object r1 = r0.getValue()
            X.205 r1 = (X.AnonymousClass205) r1
            X.4i5 r2 = new X.4i5
            r2.<init>(r4)
            android.os.Bundle r0 = X.C72463Mc.A0J(r1)
            X.AnonymousClass4aU.A0A(r0, r1)
            com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet r1 = new com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet
            r1.<init>()
            r1.A1R(r0)
            r1.A05 = r2
            java.lang.String r0 = "SMBSuspiciousSenderUrlClickWarningSheet"
            X.C20098A7b.A05(r1, r3, r0)
            return
        L_0x02ab:
            java.lang.Object r4 = r1.A01
            com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet r4 = (com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet) r4
            r2 = 0
            r0 = 1
            com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet.A01(r4, r0)
            r0 = 5
            com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet.A01(r4, r0)
            X.0vl r0 = r4.A0D
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = X.C18070vi.A0H(r0)
            X.46p r1 = new X.46p
            r1.<init>(r0)
            X.4X7 r0 = r4.A08
            android.net.Uri r0 = r0.A01(r1)
            if (r0 != 0) goto L_0x02f1
            X.1KB r1 = r4.A01
            if (r1 == 0) goto L_0x02da
            r0 = 2131896261(0x7f1227c5, float:1.9427378E38)
            r1.A08(r0, r2)
            return
        L_0x02da:
            java.lang.String r0 = "globalUI"
            goto L_0x02f7
        L_0x02dd:
            X.10I r1 = r4.A07
            if (r1 == 0) goto L_0x02f5
            r0 = 8
            X.C98834rn.A01(r1, r4, r0)
            X.0vl r0 = r4.A0D
            java.lang.Object r0 = r0.getValue()
            android.net.Uri r0 = (android.net.Uri) r0
            X.C18070vi.A0X(r0)
        L_0x02f1:
            com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet.A00(r0, r4)
            return
        L_0x02f5:
            java.lang.String r0 = "waWorkers"
        L_0x02f7:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x02fc:
            java.lang.Object r0 = r1.A01
            com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity r0 = (com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity) r0
            com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity.A03(r0)
            return
        L_0x0304:
            java.lang.Object r0 = r1.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x030c:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
            X.AnonymousClass3Ma.A1Q(r0)
            return
        L_0x0314:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
            X.AnonymousClass3Ma.A1Q(r0)
            return
        L_0x031c:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
            X.AnonymousClass3Ma.A1Q(r0)
            return
        L_0x0324:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            r0 = 14
            X.4mP r1 = new X.4mP
            r1.<init>(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            goto L_0x0446
        L_0x0333:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            r0 = 8
            X.4mP r1 = new X.4mP
            r1.<init>(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            goto L_0x0446
        L_0x0342:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            r0 = 10
            X.4mP r1 = new X.4mP
            r1.<init>(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A04
            goto L_0x0446
        L_0x0351:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.5tO r3 = r0.A24
            java.lang.Integer r2 = X.AnonymousClass4aY.A09(r0)
            java.lang.Integer r1 = X.AnonymousClass4aY.A0A(r0)
            r0 = 0
            r3.A0G(r2, r1, r0)
            return
        L_0x0364:
            java.lang.Object r3 = r1.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            com.whatsapp.conversation.ConversationListView r1 = r3.A2B
            r0 = 0
            r1.onWindowFocusChanged(r0)
            java.util.Stack r1 = r3.A7r
            boolean r0 = r1.empty()
            if (r0 == 0) goto L_0x037d
            com.whatsapp.conversation.ConversationListView r1 = r3.A2B
            r0 = 1
            r1.A0B(r0)
            return
        L_0x037d:
            java.lang.Object r0 = r1.pop()
            X.4NG r0 = (X.AnonymousClass4NG) r0
            X.206 r2 = r0.A02
            int r1 = r0.A00
            r0 = 0
            r3.A33(r2, r0, r0, r1)
            return
        L_0x038c:
            java.lang.Object r5 = r1.A01
            X.4aY r5 = (X.AnonymousClass4aY) r5
            X.1E7 r0 = r5.A35
            com.whatsapp.jid.Jid r8 = X.AnonymousClass3Ma.A0m(r0)
            com.whatsapp.jid.GroupJid r8 = (com.whatsapp.jid.GroupJid) r8
            X.1VP r6 = r5.A1k
            X.1E7 r0 = r5.A35
            java.util.List r9 = X.C72483Me.A0a(r5, r0)
            X.1FY r7 = X.AnonymousClass3MW.A0Q(r5)
            r11 = 0
            r13 = 1
            r10 = 59
            r12 = r11
            r6.BjR(r7, r8, r9, r10, r11, r12, r13)
            X.4PK r0 = X.AnonymousClass3Ma.A0Z(r5)
            X.00H r0 = r0.A0B
            java.lang.Object r4 = r0.get()
            X.9sP r4 = (X.C194859sP) r4
            r3 = 0
            X.00H r2 = r4.A02
            java.lang.String r1 = X.C17890vO.A0Q()
            X.C18070vi.A0X(r1)
            X.9rU r0 = new X.9rU
            r0.<init>(r2, r1, r3)
            r4.A00 = r0
            r0 = 35
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.5cQ r0 = r5.A2Q
            X.126 r0 = r0.getGroupChatManager()
            X.1MZ r0 = r0.A0O
            int r0 = X.AnonymousClass3MW.A03(r0, r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 32
            r4.A02(r2, r1, r0)
            return
        L_0x03e5:
            java.lang.Object r1 = r1.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            X.4PK r0 = X.AnonymousClass3Ma.A0Z(r1)
            X.00H r0 = r0.A0C
            java.lang.Object r0 = r0.get()
            X.6uM r0 = (X.C136766uM) r0
            r0.A00()
            X.88y r1 = r1.A7i
            r0 = 0
            r1.CAy(r0)
            return
        L_0x03ff:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.5cQ r2 = r0.A2Q
            X.1FY r1 = r2.getActivityNullable()
            X.1BI r0 = r0.A3R
            X.1ch r0 = (X.C29681ch) r0
            android.content.Intent r0 = X.AnonymousClass1LU.A14(r1, r0)
            r2.startActivity(r0)
            return
        L_0x0415:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            r1 = 0
            X.4PL r0 = r2.A29
            r2.A2o(r0, r1, r1)
            return
        L_0x0420:
            java.lang.Object r3 = r1.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            X.00H r0 = r3.A5C
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r1 = "newsletter-geosuspend"
            X.1FY r0 = X.AnonymousClass3MW.A0P(r3)
            r2.A01(r0, r1)
            return
        L_0x0434:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            boolean r0 = X.AnonymousClass4aY.A29(r2)
            if (r0 == 0) goto L_0x044a
            r0 = 7
            X.4mP r1 = new X.4mP
            r1.<init>(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0A
        L_0x0446:
            X.C87464Vr.A01(r2, r1, r0)
            return
        L_0x044a:
            X.AnonymousClass4aY.A0h(r2)
            return
        L_0x044e:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.0z4 r0 = r0.A2j
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "newsletter_wait_list_subscription"
            X.C17880vN.A1F(r1, r0, r2)
            return
        L_0x045f:
            java.lang.Object r1 = r1.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            X.AEW r0 = r1.A1t
            X.AnonymousClass4aY.A0X(r0, r1)
            return
        L_0x0469:
            java.lang.Object r0 = r1.A01
            X.4f8 r0 = (X.C91094f8) r0
            java.lang.Object r0 = r0.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.3UY r1 = r0.A2Z
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0482
        L_0x0476:
            java.lang.Object r0 = r1.A01
            X.4f8 r0 = (X.C91094f8) r0
            java.lang.Object r0 = r0.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.3UY r1 = r0.A2Z
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
        L_0x0482:
            r1.A0T(r0)
            return
        L_0x0486:
            java.lang.Object r0 = r1.A01
            X.5bu r0 = (X.C108565bu) r0
            r0.Bl0()
            return
        L_0x048e:
            java.lang.Object r0 = r1.A01
            X.5bu r0 = (X.C108565bu) r0
            r0.BzJ()
            return
        L_0x0496:
            java.lang.Object r0 = r1.A01
            X.3Q0 r0 = (X.AnonymousClass3Q0) r0
            r0.Bd0()
            return
        L_0x049e:
            java.lang.Object r3 = r1.A01
            X.4PF r3 = (X.AnonymousClass4PF) r3
            r2 = 0
            X.C18070vi.A0d(r3, r2)
            X.10I r1 = r3.A08
            X.4rL r0 = new X.4rL
            r0.<init>(r3, r2)
            r1.CGF(r0)
            android.view.View r1 = r3.A02
            r0 = 2131893061(0x7f121b45, float:1.9420888E38)
            X.Bik r0 = X.C23520Bik.A01(r1, r0, r2)
            r0.A08()
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x04c2:
            r0 = 0
            java.lang.Object r11 = r6.get(r0)
            X.206 r11 = (X.AnonymousClass206) r11
            r18 = 1
            r10 = 0
            r12 = r10
            r9.A0Y(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89914dE.onClick(android.view.View):void");
    }
}
