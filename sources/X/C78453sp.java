package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2;
import com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3;
import com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runOnCoroutineScope$1$1;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3sp  reason: invalid class name and case insensitive filesystem */
public final class C78453sp extends AnonymousClass3uP {
    public AnonymousClass1VP A00;
    public AnonymousClass1VT A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public C18600wl A07;
    public C18600wl A08;
    public AnonymousClass1OX A09;
    public boolean A0A;
    public final TextEmojiLabel A0B = ((TextEmojiLabel) AnonymousClass3MX.A0C(this, 2131428703));
    public final TextEmojiLabel A0C = ((TextEmojiLabel) AnonymousClass3MX.A0C(this, 2131428704));
    public final View A0D = AnonymousClass3MX.A0C(this, 2131428459);
    public final WaImageView A0E = ((WaImageView) AnonymousClass3MX.A0C(this, 2131428749));
    public final C34191k5 A0F = new Af2(this, 0);
    public final AnonymousClass1IV A0G = new C21134Af3(this, 0);
    public final C18100vl A0H = AnonymousClass1DF.A01(new AnonymousClass5GP(this));
    public final C18100vl A0I = AnonymousClass1DF.A01(AnonymousClass5Q4.A00);
    public final C18100vl A0J = AnonymousClass1DF.A01(new AnonymousClass5GQ(this));
    public final C18100vl A0K = AnonymousClass1DF.A01(new AnonymousClass5GR(this));
    public final C18100vl A0L = AnonymousClass1DF.A01(new AnonymousClass5GS(this));
    public final C18100vl A0M = AnonymousClass1DF.A01(new AnonymousClass5GT(this));
    public final C18100vl A0N = AnonymousClass1DF.A01(new AnonymousClass5GU(this));

    /* JADX WARNING: type inference failed for: r4v2, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0135, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r12.A0F, 11610) != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0255, code lost:
        if (r0.A09 != 8) goto L_0x0257;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass22M r11, X.C78453sp r12, X.C178119Bw r13, java.lang.Integer r14) {
        /*
            r2 = 0
            X.00H r0 = r12.getPreCallChatThreadLogger()
            java.lang.Object r4 = r0.get()
            X.9sP r4 = (X.C194859sP) r4
            r4.A00()
            X.00H r0 = r12.getCallState()
            java.lang.Object r0 = r0.get()
            X.2rH r0 = (X.C62362rH) r0
            boolean r0 = r0.A01(r11)
            if (r0 == 0) goto L_0x0237
            r3 = 17
        L_0x0020:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r10 = 5
            r9 = r5
            r8 = r14
            r6 = r5
            r4.A01(r5, r6, r7, r8, r9, r10)
            X.00H r0 = r12.getCallState()
            r0.get()
            X.25F r1 = r11.A00
            X.229 r0 = r1.A02
            X.9Bw r0 = (X.C178119Bw) r0
            if (r0 == 0) goto L_0x00ac
            com.whatsapp.jid.GroupJid r0 = r0.A0C
            if (r0 == 0) goto L_0x00ac
            r4 = 0
            X.00H r0 = r12.getCallState()
            r0.get()
            X.229 r0 = r1.A02
            X.9Bw r0 = (X.C178119Bw) r0
            if (r0 == 0) goto L_0x0076
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0076
            X.00H r0 = r12.getCallState()
            r0.get()
            boolean r0 = X.C62362rH.A00(r11)
            if (r0 == 0) goto L_0x0070
            X.5VP r1 = new X.5VP
            r1.<init>(r11, r12, r13)
        L_0x0065:
            X.1Di r1 = (X.C22821Di) r1
            com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runIfGroupContact$1 r0 = new com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runIfGroupContact$1
            r0.<init>(r12, r13, r5, r1)
        L_0x006c:
            r12.A05(r0)
        L_0x006f:
            return
        L_0x0070:
            X.5VQ r1 = new X.5VQ
            r1.<init>(r11, r12, r13)
            goto L_0x0065
        L_0x0076:
            X.00H r0 = r12.getCallState()
            java.lang.Object r0 = r0.get()
            X.2rH r0 = (X.C62362rH) r0
            boolean r0 = r0.A02(r11)
            if (r0 == 0) goto L_0x0125
            X.1VP r3 = r12.getCallsManager()
            android.content.Context r2 = r12.getContext()
            int r1 = A00(r11, r12)
            X.00H r0 = r12.getCallState()
            r0.get()
            boolean r0 = X.C62362rH.A00(r11)
            if (r0 == 0) goto L_0x00a8
            X.0ve r0 = r12.A0F
            boolean r0 = X.C40811vJ.A0X(r0)
            if (r0 != 0) goto L_0x00a8
            r4 = 1
        L_0x00a8:
            r3.BhC(r2, r13, r1, r4)
            return
        L_0x00ac:
            X.00H r0 = r12.getCallState()
            r0.get()
            X.229 r0 = r1.A02
            X.9Bw r0 = (X.C178119Bw) r0
            if (r0 == 0) goto L_0x00e1
            boolean r1 = r0.A0M()
        L_0x00bd:
            X.00H r0 = r12.getCallState()
            java.lang.Object r0 = r0.get()
            X.2rH r0 = (X.C62362rH) r0
            boolean r0 = r0.A02(r11)
            if (r1 == 0) goto L_0x0194
            if (r0 == 0) goto L_0x00e3
            X.1VP r3 = r12.getCallsManager()
            android.content.Context r1 = r12.getContext()
            int r0 = A00(r11, r12)
            X.1VQ r3 = (X.AnonymousClass1VQ) r3
            r3.BhC(r1, r13, r0, r2)
            return
        L_0x00e1:
            r1 = 0
            goto L_0x00bd
        L_0x00e3:
            X.0ve r3 = r12.A0F
            r1 = 11610(0x2d5a, float:1.6269E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 != 0) goto L_0x0137
            X.1KB r0 = r12.A0S
            X.1FR r5 = r0.A00
            if (r5 == 0) goto L_0x006f
            r12.getAdhocBottomSheetBridge()
            X.4cT r1 = r13.A04
            X.C18070vi.A0W(r1)
            int r4 = A00(r11, r12)
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet r6 = new com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet
            r6.<init>()
            r0 = 2
            X.1D6[] r3 = new X.AnonymousClass1D6[r0]
            java.lang.String r0 = "call_log_message_key"
            X.AnonymousClass1D6.A03(r0, r1, r3, r2)
            java.lang.String r1 = "call_from_ui"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            X.C108985cd.A1G(r1, r0, r3)
            android.os.Bundle r0 = X.AnonymousClass9O6.A00(r3)
            r6.A1R(r0)
            r12.getAdhocBottomSheetBridge()
            java.lang.String r0 = "AdhocParticipantBottomSheet"
            goto L_0x022c
        L_0x0125:
            boolean r0 = r13.A0W()
            if (r0 != 0) goto L_0x015a
            X.0ve r3 = r12.A0F
            r1 = 11610(0x2d5a, float:1.6269E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x015a
        L_0x0137:
            X.1KB r0 = r12.A0S
            X.1FR r5 = r0.A00
            if (r5 == 0) goto L_0x006f
            r12.getLgcBottomSheetBridge()
            int r2 = A00(r11, r12)
            r0 = 1
            X.C18070vi.A0d(r13, r0)
            X.4cT r1 = r13.A04
            X.C18070vi.A0W(r1)
            com.whatsapp.jid.GroupJid r0 = r13.A0C
            com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet r6 = X.C87384Vj.A00(r0, r1, r2)
            r12.getLgcBottomSheetBridge()
            java.lang.String r0 = "CallConfirmationSheet"
            goto L_0x022c
        L_0x015a:
            if (r14 == 0) goto L_0x025b
            int r6 = r14.intValue()
            X.1KB r0 = r12.A0S
            X.1FR r5 = r0.A00
            if (r5 == 0) goto L_0x006f
            r12.getBottomSheetBridge()
            X.4cT r1 = r13.A04
            X.C18070vi.A0W(r1)
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet r4 = new com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet
            r4.<init>()
            r0 = 2
            X.1D6[] r3 = new X.AnonymousClass1D6[r0]
            java.lang.String r0 = "call_log_message_key"
            X.AnonymousClass1D6.A03(r0, r1, r3, r2)
            java.lang.String r1 = "call_log_message_group_size"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.C108985cd.A1G(r1, r0, r3)
            android.os.Bundle r0 = X.AnonymousClass9O6.A00(r3)
            r4.A1R(r0)
            r12.getBottomSheetBridge()
            java.lang.String r0 = "CallLogMessageParticipantBottomSheet"
            r5.CMk(r4, r0)
            return
        L_0x0194:
            if (r0 == 0) goto L_0x01c9
            X.1LU r4 = new X.1LU
            r4.<init>()
            android.content.Context r3 = r12.getContext()
            X.4cT r0 = r13.A04
            com.whatsapp.jid.UserJid r1 = r0.A01
            X.C17960vV.A07(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            android.content.Intent r2 = r4.A20(r3, r1, r0)
            X.C18070vi.A0X(r2)
            X.205 r0 = r11.A0v
            java.lang.String r1 = r0.A01
            android.net.Uri r0 = android.net.Uri.parse(r1)
            r2.setData(r0)
            java.lang.String r0 = "call_id"
            r2.putExtra(r0, r1)
            android.content.Context r0 = r12.getContext()
            r0.startActivity(r2)
            return
        L_0x01c9:
            boolean r0 = r13.A0O()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0230
            X.0ve r2 = r12.A0F
            X.0vf r1 = X.C18040vf.A01
            r0 = 4624(0x1210, float:6.48E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0230
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.205 r0 = r11.A0v
            X.1BI r0 = r0.A00
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A01(r0)
            if (r3 == 0) goto L_0x0210
            X.1PM r2 = r12.A0k
            X.1Ok r1 = r12.A0m
            X.2tn r0 = new X.2tn
            r0.<init>((X.AnonymousClass1PM) r2, (X.C25491Ok) r1, (com.whatsapp.jid.UserJid) r3)
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0210
            X.1KB r0 = r12.A0S
            X.1FR r2 = r0.A00
            if (r2 == 0) goto L_0x006f
            r12.getCapiCallConfirmationSheetBridge()
            r0 = 8
            com.whatsapp.calling.capi.view.CapiCallingConfirmationBottomSheetDialogFragment r1 = X.AnonymousClass4Fv.A00(r3, r0)
            r12.getCapiCallConfirmationSheetBridge()
            java.lang.String r0 = "CapiCallingConfirmationBottomSheetDialogFragment"
            r2.CMk(r1, r0)
            return
        L_0x0210:
            X.1KB r0 = r12.A0S
            X.1FR r5 = r0.A00
            if (r5 == 0) goto L_0x006f
            r12.getOneOnOneCallConfirmationSheetBridge()
            X.4cT r0 = r13.A04
            com.whatsapp.jid.UserJid r2 = r0.A01
            boolean r1 = r13.A0J
            int r0 = A00(r11, r12)
            com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet r6 = X.AnonymousClass4Fs.A00(r2, r0, r1)
            r12.getOneOnOneCallConfirmationSheetBridge()
            java.lang.String r0 = "OneOnOneCallConfirmationSheet"
        L_0x022c:
            r5.CMk(r6, r0)
            return
        L_0x0230:
            com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$4$4 r0 = new com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$4$4
            r0.<init>(r11, r12, r13, r5)
            goto L_0x006c
        L_0x0237:
            X.00H r0 = r12.getCallState()
            r0.get()
            X.25F r1 = r11.A00
            boolean r0 = X.C62362rH.A00(r11)
            if (r0 == 0) goto L_0x0257
            X.229 r0 = r1.A02
            X.9Bw r0 = (X.C178119Bw) r0
            if (r0 == 0) goto L_0x0257
            X.C178119Bw.A00(r0)
            int r1 = r0.A09
            r0 = 8
            r3 = 33
            if (r1 == r0) goto L_0x0020
        L_0x0257:
            r3 = 18
            goto L_0x0020
        L_0x025b:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78453sp.A02(X.22M, X.3sp, X.9Bw, java.lang.Integer):void");
    }

    public static final void A03(C78453sp r13) {
        int intValue;
        C78453sp r9 = r13;
        AnonymousClass22M fMessage = r13.getFMessage();
        AnonymousClass25F r4 = fMessage.A00;
        C178119Bw r12 = (C178119Bw) r4.A02;
        View view = r13.A0D;
        AnonymousClass3uP.A0W(view, r13);
        Integer num = null;
        boolean z = false;
        if (r12 == null) {
            r13.A0E.setVisibility(8);
            r13.A0C.setVisibility(8);
            r13.A0B.setVisibility(8);
            view.setVisibility(8);
            r13.getCallLogDeletedStub().A04(0);
            view.setOnClickListener((View.OnClickListener) null);
            return;
        }
        TextEmojiLabel textEmojiLabel = r13.A0C;
        ViewGroup.LayoutParams layoutParams = textEmojiLabel.getLayoutParams();
        if (layoutParams != null) {
            C39151sZ r1 = (C39151sZ) layoutParams;
            r1.A02 = 0.0f;
            textEmojiLabel.setLayoutParams(r1);
            r13.A0E.setVisibility(0);
            textEmojiLabel.setVisibility(0);
            TextEmojiLabel textEmojiLabel2 = r13.A0B;
            textEmojiLabel2.setVisibility(0);
            view.setVisibility(0);
            r13.getCallLogDeletedStub().A04(8);
            if (A01(r13).A0H(fMessage)) {
                r13.A05(new ConversationRowCallLog$fillView$2(fMessage, r13, (C30391dr) null));
            } else {
                textEmojiLabel.setText(r13.getResources().getText(A01(r13).A0C(fMessage)));
                view.setContentDescription(textEmojiLabel.getText());
            }
            C42571yO A012 = A01(r13);
            C22941Dw r0 = UserJid.Companion;
            AnonymousClass205 r8 = fMessage.A0v;
            UserJid A013 = C22941Dw.A01(r8.A00);
            C178119Bw r6 = (C178119Bw) r4.A02;
            Integer num2 = null;
            if (!(A013 == null || r6 == null)) {
                num2 = Integer.valueOf(r6.A07(A013));
            }
            if (!C42571yO.A05(fMessage, A012) || !C42571yO.A08(fMessage, A012) || num2 == null || ((intValue = num2.intValue()) != 100 && (!r8.A02 ? r6 == null || r6.A0Y(A012.A00) : intValue == 5))) {
                C42571yO A014 = A01(r13);
                Resources resources = r13.getResources();
                C18070vi.A0X(resources);
                textEmojiLabel2.setText(A014.A0F(resources, fMessage, (String) null));
            } else {
                r13.A05(new ConversationRowCallLog$fillView$3(fMessage, r13, (C30391dr) null));
            }
            r13.setCallIconDrawable(fMessage);
            r13.getCallState().get();
            C178119Bw r02 = (C178119Bw) r4.A02;
            boolean z2 = false;
            if (!(r02 == null || r02.A0C == null)) {
                z2 = true;
            }
            if (r12.A0C != null) {
                z = true;
            }
            if (z2 && z) {
                AnonymousClass1MZ r03 = r13.A0z;
                GroupJid groupJid = r12.A0C;
                if (groupJid != null) {
                    num = Integer.valueOf(r03.A08.A0A(groupJid));
                } else {
                    throw C17890vO.A0K();
                }
            }
            view.setOnClickListener(new AnonymousClass78E(r9, fMessage, num, r12, 5));
            return;
        }
        throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public static /* synthetic */ void getLatencySensitiveDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A03(this);
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public final void setCallLogObservers(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setCallObservers(AnonymousClass1VT r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setCallState(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setCallingMessageUtil(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setCallsManager(AnonymousClass1VP r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        C17960vV.A0D(r2 instanceof AnonymousClass22M);
        this.A0I = r2;
    }

    public final void setLatencySensitiveDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setPreCallChatThreadLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setVoipUXResponsivenessLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    private final void A05(AnonymousClass1OS r4) {
        AnonymousClass1OX r2 = this.A09;
        if (r2 == null) {
            r2 = AnonymousClass1OW.A02(getLatencySensitiveDispatcher());
        }
        AnonymousClass3MX.A1Q(new ConversationRowCallLog$runOnCoroutineScope$1$1((C30391dr) null, r4), r2);
        this.A09 = r2;
    }

    private final AnonymousClass17V getAdhocBottomSheetBridge() {
        return (AnonymousClass17V) this.A0H.getValue();
    }

    private final C59492mO getAnimatedVectorDrawableHolder() {
        return (C59492mO) this.A0I.getValue();
    }

    private final AnonymousClass17X getBottomSheetBridge() {
        return (AnonymousClass17X) this.A0J.getValue();
    }

    private final C28931bI getCallLogDeletedStub() {
        return (C28931bI) this.A0K.getValue();
    }

    private final AnonymousClass17Y getCapiCallConfirmationSheetBridge() {
        return (AnonymousClass17Y) this.A0L.getValue();
    }

    /* access modifiers changed from: private */
    public final AnonymousClass17W getLgcBottomSheetBridge() {
        return (AnonymousClass17W) this.A0M.getValue();
    }

    private final AnonymousClass17Z getOneOnOneCallConfirmationSheetBridge() {
        return (AnonymousClass17Z) this.A0N.getValue();
    }

    private final void setCallIconDrawable(AnonymousClass22M r7) {
        WaImageView waImageView;
        Drawable A0E2;
        if (!C18020vd.A05(C18040vf.A02, this.A0F, 6121)) {
            WaImageView waImageView2 = this.A0E;
            waImageView2.setImageDrawable(A01(this).A0E(AnonymousClass3MY.A04(waImageView2), getFMessage(), false));
            if (this.A0I.Bf6()) {
                getAnimatedVectorDrawableHolder().A02();
                return;
            }
            return;
        }
        int A0B2 = A01(this).A0B(r7);
        if (A0B2 != 0) {
            waImageView = this.A0E;
            A0E2 = getAnimatedVectorDrawableHolder().A00(AnonymousClass3MY.A04(this), A0B2, true);
        } else {
            getAnimatedVectorDrawableHolder().A02();
            waImageView = this.A0E;
            A0E2 = A01(this).A0E(AnonymousClass3MY.A04(waImageView), getFMessage(), false);
        }
        waImageView.setImageDrawable(A0E2);
    }

    public void A1M() {
        if (!this.A0A) {
            this.A0A = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r1 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r1, A0O, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r1, r2, this);
            AnonymousClass3uQ.A12(r1, r2, this);
            AnonymousClass3uQ.A0y(A0n, r1, this, BE8.A0d(r1));
            AnonymousClass3uQ.A13(r1, r2, this, r1.ABq);
            AnonymousClass3uQ.A0x(A0n, r1, r2, this, r1.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r1, r2, A0O, this);
            AnonymousClass3uQ.A11(r1, r2, this);
            AnonymousClass3uQ.A15(r1, this);
            AnonymousClass3uQ.A0s(r0, A0n, r1, r2, this);
            AnonymousClass3uQ.A0u(r0, r1, r2, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r1, A0O, this);
            AnonymousClass3uQ.A10(r1, r2, this);
            AnonymousClass3uQ.A0z(r1, r2, A0O, this, AnonymousClass3uQ.A0o(r1));
            this.A02 = C000200d.A00(r1.A1U);
            this.A01 = (AnonymousClass1VT) r1.A1X.get();
            this.A03 = C000200d.A00(r1.AMO);
            this.A04 = C000200d.A00(r1.A1h);
            this.A00 = (AnonymousClass1VP) r1.A1l.get();
            this.A07 = C27011Uj.A00();
            this.A08 = (C18600wl) r1.A9F.get();
            this.A05 = C000200d.A00(r1.A8X);
            this.A06 = C000200d.A00(r1.ABV);
        }
    }

    public final AnonymousClass00H getCallLogObservers() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callLogObservers");
        throw null;
    }

    public final AnonymousClass1VT getCallObservers() {
        AnonymousClass1VT r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callObservers");
        throw null;
    }

    public final AnonymousClass00H getCallState() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callState");
        throw null;
    }

    public final AnonymousClass00H getCallingMessageUtil() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callingMessageUtil");
        throw null;
    }

    public final AnonymousClass1VP getCallsManager() {
        AnonymousClass1VP r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callsManager");
        throw null;
    }

    public AnonymousClass22M getFMessage() {
        AnonymousClass206 r1 = this.A0I;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.calling.fmessage.FMessageCallLog");
        return (AnonymousClass22M) r1;
    }

    public final C18600wl getLatencySensitiveDispatcher() {
        C18600wl r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("latencySensitiveDispatcher");
        throw null;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mainDispatcher");
        throw null;
    }

    public final AnonymousClass00H getPreCallChatThreadLogger() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("preCallChatThreadLogger");
        throw null;
    }

    public final AnonymousClass00H getVoipUXResponsivenessLogger() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("voipUXResponsivenessLogger");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78453sp(Context context, AnonymousClass22M r4, C108875cR r5) {
        super(context, r5, r4);
        C18070vi.A0j(context, r4);
        A1M();
        A03(this);
    }

    public static final int A00(AnonymousClass22M r1, C78453sp r2) {
        if (((C62362rH) r2.getCallState().get()).A02(r1)) {
            return 22;
        }
        if (((C62362rH) r2.getCallState().get()).A01(r1)) {
            return 45;
        }
        r2.getCallState().get();
        C18070vi.A0d(r1, 0);
        C178119Bw r0 = (C178119Bw) r1.A00.A02;
        if (r0 == null || !r0.A0N()) {
            return 46;
        }
        return 47;
    }

    public static C42571yO A01(C78453sp r0) {
        return (C42571yO) r0.getCallingMessageUtil().get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            X.5cR r3 = r4.A0k
            if (r3 == 0) goto L_0x0080
            X.0ve r2 = r4.A0F
            X.0vf r1 = X.C18040vf.A01
            r0 = 10429(0x28bd, float:1.4614E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0080
            X.00H r0 = r4.getCallLogObservers()
            java.lang.Object r2 = r0.get()
            X.10T r2 = (X.AnonymousClass10T) r2
            X.1k5 r1 = r4.A0F
            X.1F9 r0 = r3.getLifecycleOwner()
            X.C18070vi.A0X(r0)
            r2.observeUntilDestroy(r1, r0)
            X.1VT r2 = r4.getCallObservers()
            X.1IV r1 = r4.A0G
            X.1F9 r0 = r3.getLifecycleOwner()
            X.C18070vi.A0X(r0)
            r2.observeUntilDestroy(r1, r0)
        L_0x0039:
            X.0ve r2 = r4.A0F
            r1 = 6121(0x17e9, float:8.577E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x006e
            X.2mO r3 = r4.getAnimatedVectorDrawableHolder()
            android.content.Context r1 = X.AnonymousClass3MY.A04(r4)
            X.2m2 r2 = r3.A01
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0065
            X.28v r0 = r3.A00
            if (r0 != 0) goto L_0x0065
            r3.A01()
            int r0 = r2.A00
            X.28v r1 = X.C454028v.A03(r1, r0)
            if (r1 != 0) goto L_0x006f
            r1 = 0
        L_0x0063:
            r3.A00 = r1
        L_0x0065:
            X.28v r1 = r3.A00
            if (r1 == 0) goto L_0x006e
            com.whatsapp.WaImageView r0 = r4.A0E
            r0.setImageDrawable(r1)
        L_0x006e:
            return
        L_0x006f:
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0078
            X.BMd r0 = r3.A03
            r1.A08(r0)
        L_0x0078:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0063
            r1.start()
            goto L_0x0063
        L_0x0080:
            X.00H r0 = r4.getCallLogObservers()
            java.lang.Object r1 = r0.get()
            X.10T r1 = (X.AnonymousClass10T) r1
            X.1k5 r0 = r4.A0F
            r1.registerObserver(r0)
            X.1VT r1 = r4.getCallObservers()
            X.1IV r0 = r4.A0G
            r1.registerObserver(r0)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78453sp.onAttachedToWindow():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r4 != X.C23401Fx.DESTROYED) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDetachedFromWindow() {
        /*
            r5 = this;
            super.onDetachedFromWindow()
            X.1OX r0 = r5.A09
            r4 = 0
            if (r0 == 0) goto L_0x000b
            X.AnonymousClass1OW.A04(r4, r0)
        L_0x000b:
            r5.A09 = r4
            X.5cR r3 = r5.A0k
            if (r3 == 0) goto L_0x0031
            X.0ve r2 = r5.A0F
            X.0vf r1 = X.C18040vf.A01
            r0 = 10429(0x28bd, float:1.4614E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0031
            X.1F9 r0 = r3.getLifecycleOwner()
            if (r0 == 0) goto L_0x002d
            X.1Fv r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x002d
            X.1Fw r0 = (X.C23391Fw) r0
            X.1Fx r4 = r0.A02
        L_0x002d:
            X.1Fx r0 = X.C23401Fx.DESTROYED
            if (r4 == r0) goto L_0x0049
        L_0x0031:
            X.00H r0 = r5.getCallLogObservers()
            java.lang.Object r1 = r0.get()
            X.10T r1 = (X.AnonymousClass10T) r1
            X.1k5 r0 = r5.A0F
            r1.unregisterObserver(r0)
            X.1VT r1 = r5.getCallObservers()
            X.1IV r0 = r5.A0G
            r1.unregisterObserver(r0)
        L_0x0049:
            X.0ve r2 = r5.A0F
            r1 = 6121(0x17e9, float:8.577E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x005c
            X.2mO r0 = r5.getAnimatedVectorDrawableHolder()
            r0.A01()
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78453sp.onDetachedFromWindow():void");
    }

    public int getCenteredLayoutId() {
        return 2131624792;
    }

    public int getIncomingLayoutId() {
        return 2131624792;
    }

    public int getOutgoingLayoutId() {
        return 2131624793;
    }

    public int getUserNameViewId() {
        return 2131429591;
    }
}
