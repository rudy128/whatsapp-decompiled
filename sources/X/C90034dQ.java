package X;

import android.view.View;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;

/* renamed from: X.4dQ  reason: invalid class name and case insensitive filesystem */
public class C90034dQ implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C90034dQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static VoiceChatBottomSheetViewModel A00(AudioChatBottomSheetDialog audioChatBottomSheetDialog, AnonymousClass1V9 r2, int i) {
        r2.A00(i, 35);
        return (VoiceChatBottomSheetViewModel) audioChatBottomSheetDialog.A0Q.getValue();
    }

    public static void A01(View view, Object obj, int i) {
        view.setOnClickListener(new C90034dQ(obj, i));
    }

    /* JADX WARNING: type inference failed for: r1v43, types: [X.23k, X.23j, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0322, code lost:
        if (r1 == 3) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03b7, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0419, code lost:
        r0.callOnClick();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x041c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r5 = r2.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x045f, code lost:
        X.AnonymousClass3MW.A1X(r3, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0462, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04d1, code lost:
        r2.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04d4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05aa, code lost:
        r3.A01(r2, r1, 15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05f6, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05fa, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0619, code lost:
        r1.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x061c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0661, code lost:
        r2.A0E(new X.AnonymousClass4VB(r4.A01, r4.A02, r7, r4.A07, r4.A05, r4.A04, r4.A06));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0675, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        if (r10 == 59) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019e, code lost:
        r2 = ((X.C93584jD) r1).A00;
        r3 = A00(r2, r2.A2K(), X.C72453Mb.A03(r0 ? 1 : 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b2, code lost:
        if (r3.A03 != X.AnonymousClass00R.A01) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b4, code lost:
        r3.A05 = !r3.A05;
        r2 = r3.A0B;
        r4 = (X.AnonymousClass4VB) r2.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c2, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c4, code lost:
        r0 = r4.A03;
        r5 = r3.A05;
        r7 = X.C29351c6.A0D(r0);
        r3 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d4, code lost:
        if (r3.hasNext() == false) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d6, code lost:
        r1 = (X.AnonymousClass4ME) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01de, code lost:
        if ((r1 instanceof X.C76463nM) == false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e0, code lost:
        r1 = new X.C76463nM(r5, ((X.C76463nM) r1).A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e9, code lost:
        r7.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ef, code lost:
        if ((r1 instanceof X.C76473nN) == false) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f1, code lost:
        r1 = new X.C76473nN(r5, ((X.C76473nN) r1).A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01fb, code lost:
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01fd, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ff, code lost:
        r1.A0z((java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0203, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0655;
                case 1: goto L_0x064d;
                case 2: goto L_0x0645;
                case 3: goto L_0x063d;
                case 4: goto L_0x0635;
                case 5: goto L_0x062d;
                case 6: goto L_0x0625;
                case 7: goto L_0x061d;
                case 8: goto L_0x023e;
                case 9: goto L_0x0613;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x05c5;
                case 13: goto L_0x0232;
                case 14: goto L_0x054f;
                case 15: goto L_0x0545;
                case 16: goto L_0x0522;
                case 17: goto L_0x04f0;
                case 18: goto L_0x05ce;
                case 19: goto L_0x04e8;
                case 20: goto L_0x0204;
                case 21: goto L_0x04d5;
                case 22: goto L_0x04b8;
                case 23: goto L_0x0496;
                case 24: goto L_0x046b;
                case 25: goto L_0x0463;
                case 26: goto L_0x044f;
                case 27: goto L_0x043e;
                case 28: goto L_0x042d;
                case 29: goto L_0x0425;
                case 30: goto L_0x041d;
                case 31: goto L_0x018e;
                case 32: goto L_0x0181;
                case 33: goto L_0x0149;
                case 34: goto L_0x00e8;
                case 35: goto L_0x00c8;
                case 36: goto L_0x00a2;
                case 37: goto L_0x0024;
                case 38: goto L_0x040f;
                case 39: goto L_0x0404;
                case 40: goto L_0x03fc;
                case 41: goto L_0x03ea;
                case 42: goto L_0x0425;
                case 43: goto L_0x0425;
                case 44: goto L_0x03c1;
                case 45: goto L_0x03bb;
                case 46: goto L_0x0330;
                case 47: goto L_0x02ec;
                case 48: goto L_0x02ae;
                case 49: goto L_0x02a4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.MoreMenuBottomSheet r0 = (com.whatsapp.calling.controls.view.MoreMenuBottomSheet) r0
            X.4RC r2 = r0.A04
            if (r2 == 0) goto L_0x02a0
            X.AEW r0 = r2.A01
            r1 = 1
            if (r0 == 0) goto L_0x0284
            boolean r0 = r0.A0W
            if (r0 != r1) goto L_0x0284
            X.1wy r3 = r2.A05
            java.lang.Integer r2 = X.AnonymousClass00R.A15
            r1 = 0
            X.4YK r0 = new X.4YK
            r0.<init>(r1, r1, r2)
            r3.A0F(r0)
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.5X4 r0 = r0.A00
            if (r0 == 0) goto L_0x0023
            X.4jD r0 = (X.C93584jD) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r1 = r0.A00
            X.0vl r0 = r1.A0Q
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r2 = (com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel) r2
            android.content.Context r7 = r1.A14()
            android.os.Bundle r1 = r1.A06
            if (r1 == 0) goto L_0x00a0
            java.lang.String r0 = "voice_chat_call_from_ui"
            int r10 = r1.getInt(r0)
        L_0x0046:
            r3 = 0
            com.whatsapp.jid.GroupJid r1 = r2.A01
            if (r1 == 0) goto L_0x0023
            X.1M9 r5 = r2.A0F
            X.1E7 r4 = r5.A0D(r1)
            if (r4 == 0) goto L_0x0023
            X.1TA r0 = r2.A0J
            X.2Q4 r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0081
            X.1DT r0 = r2.A0A
            X.AnonymousClass3MY.A1M(r0, r3)
        L_0x0060:
            X.00H r0 = r2.A0M
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.9sP r3 = (X.C194859sP) r3
            r0 = 32
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.1MZ r0 = r2.A0I
            int r0 = X.AnonymousClass3MW.A03(r0, r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r9 = 32
            r8 = r4
            r5 = r4
            r3.A01(r4, r5, r6, r7, r8, r9)
            return
        L_0x0081:
            X.1VP r6 = r2.A0E
            X.1MZ r3 = r2.A0I
            X.11S r0 = r2.A0C
            java.util.List r9 = X.C63982u1.A04(r0, r5, r3, r4)
            com.whatsapp.jid.GroupJid r8 = r2.A01
            boolean r12 = r2.A05
            r0 = 57
            r11 = 1
            if (r10 == r0) goto L_0x0099
            r0 = 59
            r13 = 0
            if (r10 != r0) goto L_0x009a
        L_0x0099:
            r13 = 1
        L_0x009a:
            r6.BjR(r7, r8, r9, r10, r11, r12, r13)
            r2.A06 = r11
            goto L_0x0060
        L_0x00a0:
            r10 = 0
            goto L_0x0046
        L_0x00a2:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r1 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r1
            X.5X4 r0 = r1.A00
            if (r0 == 0) goto L_0x0023
            boolean r3 = r1.isSelected()
            X.4jD r0 = (X.C93584jD) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.1V9 r1 = r2.A2K()
            r0 = 9
            if (r3 == 0) goto L_0x00bc
            r0 = 10
        L_0x00bc:
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r0 = A00(r2, r1, r0)
            X.A99 r0 = r0.A00
            if (r0 == 0) goto L_0x0023
            r0.A0e()
            return
        L_0x00c8:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.5X4 r0 = r0.A00
            if (r0 == 0) goto L_0x0023
            X.4jD r0 = (X.C93584jD) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.1V9 r1 = r2.A2K()
            r0 = 24
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r0 = A00(r2, r1, r0)
            X.A99 r2 = r0.A00
            if (r2 == 0) goto L_0x0023
            r1 = 1
            r0 = 0
            X.A99.A0G(r2, r0, r0, r1)
            return
        L_0x00e8:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.5X4 r0 = r0.A00
            if (r0 == 0) goto L_0x0023
            X.4jD r0 = (X.C93584jD) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.1V9 r1 = r2.A2K()
            r0 = 6
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r5 = A00(r2, r1, r0)
            android.content.Context r2 = r2.A14()
            X.0ve r3 = r5.A0K
            r1 = 6688(0x1a20, float:9.372E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x011d
            X.1OX r4 = X.C41561wd.A00(r5)
            X.0wl r3 = r5.A0N
            r1 = 0
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$joinCall$1 r0 = new com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$joinCall$1
            r0.<init>(r2, r5, r1)
            X.AnonymousClass3MW.A1X(r3, r0, r4)
            return
        L_0x011d:
            X.A99 r3 = r5.A00
            if (r3 == 0) goto L_0x0023
            X.1HQ r0 = r3.A29
            com.whatsapp.voipcalling.CallInfo r1 = r0.BO3()
            X.C17960vV.A07(r1)
            boolean r0 = r3.A1i
            if (r0 != 0) goto L_0x0142
            com.whatsapp.jid.UserJid r5 = r1.getPeerJid()
            X.C17960vV.A07(r5)
            boolean r8 = r1.videoEnabled
            java.lang.String r6 = r1.callId
            boolean r9 = r1.isGroupCall
            com.whatsapp.jid.GroupJid r4 = r1.groupJid
            r7 = 0
            r10 = r7
            r3.A0u(r4, r5, r6, r7, r8, r9, r10)
        L_0x0142:
            X.1VP r1 = r3.A2F
            r0 = 1
            r1.BAc(r2, r0)
            return
        L_0x0149:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r1 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r1
            X.5X4 r0 = r1.A00
            if (r0 == 0) goto L_0x0023
            boolean r3 = r1.isSelected()
            X.4jD r0 = (X.C93584jD) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.1V9 r1 = r2.A2K()
            r0 = 11
            if (r3 == 0) goto L_0x0163
            r0 = 12
        L_0x0163:
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r3 = A00(r2, r1, r0)
            X.A99 r2 = r3.A00
            if (r2 == 0) goto L_0x0023
            X.Adx r0 = r2.A0R
            X.C17960vV.A07(r0)
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x065d
            java.lang.String r0 = r3.A04
            boolean r0 = r2.A1G(r0)
            if (r0 != 0) goto L_0x065d
            r2.A0d()
            return
        L_0x0181:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.5X4 r1 = r0.A00
            if (r1 == 0) goto L_0x0023
            boolean r0 = r0.isSelected()
            goto L_0x019e
        L_0x018e:
            java.lang.Object r2 = r14.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r2 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.5X4 r1 = r2.A00
            if (r1 == 0) goto L_0x0023
            boolean r0 = r2.isSelected()
        L_0x019e:
            X.4jD r1 = (X.C93584jD) r1
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r1.A00
            X.1V9 r1 = r2.A2K()
            int r0 = X.C72453Mb.A03(r0)
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r3 = A00(r2, r1, r0)
            java.lang.Integer r1 = r3.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x01fb
            boolean r0 = r3.A05
            r0 = r0 ^ 1
            r3.A05 = r0
            X.1DT r2 = r3.A0B
            java.lang.Object r4 = r2.A06()
            X.4VB r4 = (X.AnonymousClass4VB) r4
            if (r4 == 0) goto L_0x0023
            java.util.List r0 = r4.A03
            boolean r5 = r3.A05
            java.util.ArrayList r7 = X.C29351c6.A0D(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x01d0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0661
            java.lang.Object r1 = r3.next()
            X.4ME r1 = (X.AnonymousClass4ME) r1
            boolean r0 = r1 instanceof X.C76463nM
            if (r0 == 0) goto L_0x01ed
            X.3nM r1 = (X.C76463nM) r1
            boolean r0 = r1.A02
            X.3nM r1 = new X.3nM
            r1.<init>(r5, r0)
        L_0x01e9:
            r7.add(r1)
            goto L_0x01d0
        L_0x01ed:
            boolean r0 = r1 instanceof X.C76473nN
            if (r0 == 0) goto L_0x01e9
            X.3nN r1 = (X.C76473nN) r1
            boolean r0 = r1.A03
            X.3nN r1 = new X.3nN
            r1.<init>(r5, r0)
            goto L_0x01e9
        L_0x01fb:
            X.A99 r1 = r3.A00
            if (r1 == 0) goto L_0x0023
            r0 = 0
            r1.A0z(r0)
            return
        L_0x0204:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.header.ui.CallScreenDetailsLayout r0 = (com.whatsapp.calling.header.ui.CallScreenDetailsLayout) r0
            X.4OO r1 = r0.getCallScreenDetailsStateHolder()
            android.content.Context r4 = X.AnonymousClass3MY.A04(r0)
            X.00H r0 = r1.A01
            java.lang.Object r0 = r0.get()
            X.4OP r0 = (X.AnonymousClass4OP) r0
            X.1E7 r3 = r0.A00
            if (r3 == 0) goto L_0x0023
            X.1L9 r2 = r1.A00
            X.00H r0 = r1.A02
            java.lang.Object r1 = r0.get()
            X.1LU r1 = (X.AnonymousClass1LU) r1
            X.1BI r0 = r3.A0J
            android.content.Intent r1 = X.AnonymousClass3MY.A06(r4, r1, r0)
            java.lang.String r0 = "CallScreenDetailsStateHolder onLonelyStateButtonClicked"
            r2.A0B(r4, r1, r0)
            return
        L_0x0232:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r1 = (com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel) r1
            java.util.List r0 = X.C42011xT.A0I
            if (r1 == 0) goto L_0x0023
            r1.A0T()
            return
        L_0x023e:
            java.lang.Object r0 = r14.A01
            X.3mi r0 = (X.C76173mi) r0
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r6 = r0.A00
            X.3nV r0 = r0.A00
            X.1BI r5 = r0.A03
            X.1DT r1 = r6.A02
            r0 = 1
            java.util.ArrayList r0 = com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel.A04(r6, r5, r0)
            r1.A0F(r0)
            boolean r0 = X.C22971Dz.A0d(r5)
            if (r0 == 0) goto L_0x0282
            r4 = r5
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
        L_0x025b:
            X.8yP r0 = r6.A06
            r0.A0B(r4)
            X.1V9 r3 = r6.A09
            r2 = 74
            if (r4 != 0) goto L_0x0268
            r2 = 75
        L_0x0268:
            java.lang.Integer r1 = X.AnonymousClass3MY.A0g()
            r0 = 35
            r3.A01(r1, r2, r0)
            if (r4 == 0) goto L_0x0023
            java.util.Map r1 = r6.A0M
            X.3NP r0 = new X.3NP
            r0.<init>(r6, r5)
            android.os.CountDownTimer r0 = r0.start()
            r1.put(r4, r0)
            return
        L_0x0282:
            r4 = 0
            goto L_0x025b
        L_0x0284:
            X.1wy r4 = r2.A05
            java.lang.Integer r3 = X.AnonymousClass00R.A0u
            X.4Sa r0 = r2.A00
            if (r0 == 0) goto L_0x029e
            boolean r0 = r0.A0Q
            if (r0 != r1) goto L_0x029e
        L_0x0290:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r1 = 0
            X.4YK r0 = new X.4YK
            r0.<init>(r1, r2, r3)
            r4.A0F(r0)
            return
        L_0x029e:
            r1 = 0
            goto L_0x0290
        L_0x02a0:
            java.lang.String r0 = "moreMenuStateHolder"
            goto L_0x05f6
        L_0x02a4:
            java.lang.Object r0 = r14.A01
            X.8J6 r0 = (X.AnonymousClass8J6) r0
            android.widget.PopupMenu r0 = r0.A02
            r0.show()
            return
        L_0x02ae:
            java.lang.Object r3 = r14.A01
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r3 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r3
            X.8Dv r0 = r3.A0C
            if (r0 != 0) goto L_0x02e8
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            android.content.Context r7 = r3.A14()
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            r10 = -1
            r9 = 0
            r6 = 0
            r12 = r10
            X.8Dv r5 = new X.8Dv
            r11 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3.A0C = r5
            android.app.DatePickerDialog$OnDateSetListener r0 = r3.A0I
            r5.A00 = r0
            android.widget.DatePicker r2 = r5.A01
            long r0 = r4.getTimeInMillis()
            r2.setMinDate(r0)
            r1 = 6
            r0 = 180(0xb4, float:2.52E-43)
            r4.add(r1, r0)
            long r0 = r4.getTimeInMillis()
            r2.setMaxDate(r0)
        L_0x02e8:
            X.8Dv r0 = r3.A0C
            goto L_0x03b7
        L_0x02ec:
            java.lang.Object r2 = r14.A01
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r2 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r2
            android.app.TimePickerDialog r3 = r2.A01
            if (r3 != 0) goto L_0x032c
            android.content.Context r4 = r2.A14()
            android.app.TimePickerDialog$OnTimeSetListener r5 = r2.A0J
            java.util.Calendar r1 = r2.A0F
            r0 = 11
            int r6 = r1.get(r0)
            java.util.Calendar r1 = r2.A0F
            r0 = 12
            int r7 = r1.get(r0)
            X.0vb r0 = r2.A0A
            X.1Wz r0 = X.C18000vb.A00(r0)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0324
            X.0vb r0 = r2.A0A
            java.util.Locale r0 = r0.A0N()
            int r1 = X.AnonymousClass1X0.A00(r0)
            if (r1 == 0) goto L_0x0324
            r0 = 3
            r8 = 0
            if (r1 != r0) goto L_0x0325
        L_0x0324:
            r8 = 1
        L_0x0325:
            android.app.TimePickerDialog r3 = new android.app.TimePickerDialog
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A01 = r3
        L_0x032c:
            r3.show()
            return
        L_0x0330:
            java.lang.Object r10 = r14.A01
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r10 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r10
            com.whatsapp.WaEditText r0 = r10.A05
            android.text.Editable r0 = r0.getText()
            X.C17960vV.A07(r0)
            java.lang.String r9 = r0.toString()
            boolean r0 = X.AnonymousClass1EG.A0H(r9)
            if (r0 == 0) goto L_0x0349
            java.lang.String r9 = r10.A0E
        L_0x0349:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            java.util.Calendar r0 = r10.A0F
            boolean r0 = r0.before(r1)
            if (r0 != 0) goto L_0x03a2
            java.util.Calendar r0 = r10.A0F
            long r3 = r0.getTimeInMillis()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x03a2
            X.11P r5 = r10.A09
            X.1BI r4 = r10.A0D
            X.11S r1 = r10.A02
            X.122 r8 = r10.A0B
            boolean r11 = r10.A0H
            java.util.Calendar r0 = r10.A0F
            long r2 = r0.getTimeInMillis()
            r7 = 1
            r0 = 0
            java.lang.String r0 = X.AnonymousClass1PP.A00(r1, r5, r0)
            X.205 r6 = new X.205
            r6.<init>(r4, r0, r7)
            long r4 = X.AnonymousClass11P.A01(r5)
            r0 = 80
            X.23k r1 = new X.23k
            r1.<init>(r6, r0, r4)
            java.lang.Class<X.36s> r0 = X.C693136s.class
            X.25F r0 = r1.A0N(r0)
            r1.A00 = r0
            r1.A01 = r2
            int r0 = X.C72453Mb.A03(r11)
            r1.A00 = r0
            r1.A02 = r9
            r8.BBM(r1)
            r10.A0G = r7
            r10.A28()
            return
        L_0x03a2:
            X.3Rj r1 = X.AnonymousClass4a6.A03(r10)
            r0 = 2131895406(0x7f12246e, float:1.9425644E38)
            java.lang.String r0 = r10.A1H(r0)
            r1.A0S(r0)
            X.C73203Rj.A06(r1)
            X.05w r0 = r1.create()
        L_0x03b7:
            r0.show()
            return
        L_0x03bb:
            java.lang.Object r0 = r14.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x03c1:
            java.lang.Object r4 = r14.A01
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r4 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r4
            boolean r0 = r4.A0H
            r3 = r0 ^ 1
            r1 = 1
            r0 = 2131895598(0x7f12252e, float:1.9426034E38)
            r2 = 2130903047(0x7f030007, float:1.74129E38)
            android.os.Bundle r1 = X.C72483Me.A0I(r1, r3, r0)
            java.lang.String r0 = "itemsArrayResId"
            r1.putInt(r0, r2)
            com.whatsapp.SingleSelectionDialogFragment r2 = new com.whatsapp.SingleSelectionDialogFragment
            r2.<init>()
            r2.A1R(r1)
            X.1GP r1 = r4.A1E()
            r0 = 0
            r2.A2C(r1, r0)
            return
        L_0x03ea:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog r1 = (com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog) r1
            r0 = 1
            r1.A03 = r0
            android.view.View$OnClickListener r0 = r1.A00
            if (r0 == 0) goto L_0x03f8
            r0.onClick(r15)
        L_0x03f8:
            r1.A29()
            return
        L_0x03fc:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r0 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r0
            X.AnonymousClass3RH.setViewModel$lambda$3(r0, r15)
            return
        L_0x0404:
            java.lang.Object r1 = r14.A01
            X.3RH r1 = (X.AnonymousClass3RH) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.WaImageButton r0 = r1.A09
            goto L_0x0419
        L_0x040f:
            java.lang.Object r1 = r14.A01
            X.3RH r1 = (X.AnonymousClass3RH) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.WaImageButton r0 = r1.A08
        L_0x0419:
            r0.callOnClick()
            return
        L_0x041d:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog.A01(r0)
            return
        L_0x0425:
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x042d:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2 r1 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2) r1
            X.1OX r4 = X.C41561wd.A00(r1)
            X.0wl r3 = r1.A0K
            r0 = 0
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$showGlassesStatusIndicator$1$1$1$1 r2 = new com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$showGlassesStatusIndicator$1$1$1$1
            r2.<init>(r1, r0)
            goto L_0x045f
        L_0x043e:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2 r1 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2) r1
            X.1OX r4 = X.C41561wd.A00(r1)
            X.0wl r3 = r1.A0K
            r0 = 0
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onHighDataUsageDetected$1$builder$1$1 r2 = new com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onHighDataUsageDetected$1$builder$1$1
            r2.<init>(r1, r0)
            goto L_0x045f
        L_0x044f:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2 r1 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2) r1
            X.1OX r4 = X.C41561wd.A00(r1)
            X.0wl r3 = r1.A0K
            r0 = 0
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$maybeShowCallOnHold$1$viewState$1$1 r2 = new com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$maybeShowCallOnHold$1$viewState$1$1
            r2.<init>(r1, r0)
        L_0x045f:
            X.AnonymousClass3MW.A1X(r3, r2, r4)
            return
        L_0x0463:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner r0 = (com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner) r0
            r0.A01()
            return
        L_0x046b:
            java.lang.Object r4 = r14.A01
            com.whatsapp.calling.header.ui.CallScreenHeaderView r4 = (com.whatsapp.calling.header.ui.CallScreenHeaderView) r4
            X.AnonymousClass3Ma.A16(r4)
            com.whatsapp.calling.header.CallHeaderStateHolder r0 = r4.getCallHeaderStateHolder()
            X.1wy r1 = r0.A0B
            X.6Qg r0 = X.C122436Qg.AR_EFFECTS
            r1.A0F(r0)
            X.1V9 r3 = r4.getCallUserJourneyLogger()
            java.lang.Integer r2 = X.C17880vN.A0l()
            r1 = 61
            r0 = 16
            r3.A01(r2, r1, r0)
            X.1VF r1 = r4.getCallingAwarenessManager()
            X.1VH r0 = X.AnonymousClass1VH.AR_EFFECT
            r1.A00(r0)
            return
        L_0x0496:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.header.ui.CallScreenHeaderView r0 = (com.whatsapp.calling.header.ui.CallScreenHeaderView) r0
            X.AnonymousClass3Ma.A16(r0)
            com.whatsapp.calling.header.CallHeaderStateHolder r1 = r0.getCallHeaderStateHolder()
            X.0vl r0 = r1.A0F
            java.lang.Object r2 = r0.getValue()
            X.4YS r2 = (X.AnonymousClass4YS) r2
            X.00H r0 = r1.A0D
            java.lang.Object r0 = r0.get()
            X.4aM r0 = (X.AnonymousClass4aM) r0
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x04d1
        L_0x04b8:
            java.lang.Object r2 = r14.A01
            com.whatsapp.calling.header.ui.CallScreenHeaderView r2 = (com.whatsapp.calling.header.ui.CallScreenHeaderView) r2
            r1 = 1
            r0 = 2
            r2.performHapticFeedback(r1, r0)
            com.whatsapp.calling.header.CallHeaderStateHolder r0 = r2.getCallHeaderStateHolder()
            X.0vl r0 = r0.A0F
            java.lang.Object r2 = r0.getValue()
            X.4YS r2 = (X.AnonymousClass4YS) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x04d1:
            r2.A01(r0)
            return
        L_0x04d5:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.header.ui.CallScreenHeaderView r0 = (com.whatsapp.calling.header.ui.CallScreenHeaderView) r0
            X.AnonymousClass3Ma.A16(r0)
            com.whatsapp.calling.header.CallHeaderStateHolder r0 = r0.getCallHeaderStateHolder()
            X.1wy r1 = r0.A0B
            X.6Qg r0 = X.C122436Qg.CAMERA_SWITCH
            r1.A0F(r0)
            return
        L_0x04e8:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity r0 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity) r0
            com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity.A03(r0)
            return
        L_0x04f0:
            java.lang.Object r3 = r14.A01
            com.whatsapp.calling.dialer.DialerActivity r3 = (com.whatsapp.calling.dialer.DialerActivity) r3
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            X.9sx r0 = r3.A0A
            if (r0 == 0) goto L_0x051e
            r0.A01()
            X.1pm r2 = X.AnonymousClass3MZ.A0H(r3)
            r1 = 0
            com.whatsapp.calling.dialer.DialerActivity$onCallButtonClick$1 r0 = new com.whatsapp.calling.dialer.DialerActivity$onCallButtonClick$1
            r0.<init>(r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            X.1V9 r3 = r3.A09
            if (r3 == 0) goto L_0x0518
            r0 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 58
            goto L_0x05aa
        L_0x0518:
            java.lang.String r0 = "callUserJourneyLogger"
            X.C18070vi.A11(r0)
            throw r1
        L_0x051e:
            java.lang.String r0 = "voipUXResponsivenessLogger"
            goto L_0x05f6
        L_0x0522:
            java.lang.Object r4 = r14.A01
            com.whatsapp.calling.dialer.DialerActivity r4 = (com.whatsapp.calling.dialer.DialerActivity) r4
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            com.whatsapp.calling.dialer.DialerViewModel r3 = X.AnonymousClass3MZ.A0X(r4)
            java.lang.StringBuilder r2 = r3.A0C
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0540
            int r1 = r2.length()
            r0 = 1
            int r1 = r1 - r0
            r2.deleteCharAt(r1)
            com.whatsapp.calling.dialer.DialerViewModel.A03(r3)
        L_0x0540:
            r0 = 0
            com.whatsapp.calling.dialer.DialerActivity.A0c(r4, r0)
            return
        L_0x0545:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            r1.finish()
            return
        L_0x054f:
            java.lang.Object r3 = r14.A01
            com.whatsapp.calling.dialer.DialerActivity r3 = (com.whatsapp.calling.dialer.DialerActivity) r3
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            com.whatsapp.calling.dialer.DialerViewModel r5 = X.AnonymousClass3MZ.A0X(r3)
            X.1G4 r0 = r5.A0H
            java.lang.Object r4 = r0.getValue()
            java.lang.String r4 = (java.lang.String) r4
            X.1G1 r0 = r5.A0K
            java.lang.Object r0 = r0.getValue()
            X.4Yg r0 = (X.C88084Yg) r0
            X.1E7 r0 = r0.A01
            if (r0 == 0) goto L_0x05b0
            X.1BI r1 = r0.A0J
            if (r1 == 0) goto L_0x05b0
            X.00H r0 = r5.A0B
            java.lang.Object r0 = r0.get()
            X.1LU r0 = (X.AnonymousClass1LU) r0
            android.content.Intent r2 = X.AnonymousClass3MY.A06(r3, r0, r1)
            X.C18070vi.A0X(r2)
            X.00H r0 = r5.A08
            X.1fA r0 = X.AnonymousClass3MW.A0Y(r0)
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x0593
            java.lang.String r1 = "chatlockEntryPoint"
            r0 = 9
            r2.putExtra(r1, r0)
        L_0x0593:
            X.00H r0 = r5.A07
            java.lang.Object r0 = r0.get()
            X.1L9 r0 = (X.AnonymousClass1L9) r0
            r0.A08(r3, r2)
        L_0x059e:
            X.1V9 r3 = r3.A09
            if (r3 == 0) goto L_0x05c2
            r0 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 56
        L_0x05aa:
            r0 = 15
            r3.A01(r2, r1, r0)
            return
        L_0x05b0:
            X.00H r0 = r5.A0A
            java.lang.Object r2 = r0.get()
            X.733 r2 = (X.AnonymousClass733) r2
            java.lang.Integer r1 = X.AnonymousClass3MY.A0h()
            java.lang.String r0 = "sms:"
            r2.A04(r3, r1, r4, r0)
            goto L_0x059e
        L_0x05c2:
            java.lang.String r0 = "callUserJourneyLogger"
            goto L_0x05f6
        L_0x05c5:
            java.lang.Object r1 = r14.A01
            X.4Un r1 = (X.C87164Un) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r1 = r1.A04
            goto L_0x0619
        L_0x05ce:
            java.lang.Object r5 = r14.A01
            com.whatsapp.calling.dialer.NumberNotInWhatsAppDialog r5 = (com.whatsapp.calling.dialer.NumberNotInWhatsAppDialog) r5
            X.00H r0 = r5.A01
            if (r0 == 0) goto L_0x05fb
            java.lang.Object r4 = r0.get()
            X.1L9 r4 = (X.AnonymousClass1L9) r4
            android.content.Context r3 = r5.A14()
            java.lang.String r0 = "android.intent.action.DIAL"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "tel:"
            r1.append(r0)
            java.lang.String r0 = r5.A02
            if (r0 != 0) goto L_0x05fe
            java.lang.String r0 = "phoneNumberFormatted"
        L_0x05f6:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x05fb:
            java.lang.String r0 = "activityUtilsLazy"
            goto L_0x05f6
        L_0x05fe:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.setData(r0)
            r4.A08(r3, r2)
            r0 = 1
            r5.A03 = r0
            r5.A28()
            return
        L_0x0613:
            java.lang.Object r1 = r14.A01
            X.0vk r1 = (X.C18090vk) r1
            java.util.List r0 = X.C42011xT.A0I
        L_0x0619:
            r1.invoke()
            return
        L_0x061d:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$12(r0, r15)
            return
        L_0x0625:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$10(r0, r15)
            return
        L_0x062d:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$9(r0, r15)
            return
        L_0x0635:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$8(r0, r15)
            return
        L_0x063d:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$7(r0, r15)
            return
        L_0x0645:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$6(r0, r15)
            return
        L_0x064d:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$5(r0, r15)
            return
        L_0x0655:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setCallOnHoldClickListeners$lambda$24(r0, r15)
            return
        L_0x065d:
            r2.A0c()
            return
        L_0x0661:
            X.4OQ r5 = r4.A01
            boolean r8 = r4.A07
            boolean r9 = r4.A05
            X.4ZN r6 = r4.A02
            boolean r10 = r4.A04
            boolean r11 = r4.A06
            X.4VB r4 = new X.4VB
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2.A0E(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90034dQ.onClick(android.view.View):void");
    }
}
