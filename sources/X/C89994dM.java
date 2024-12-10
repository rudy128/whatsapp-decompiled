package X;

import android.view.View;

/* renamed from: X.4dM  reason: invalid class name and case insensitive filesystem */
public class C89994dM implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C89994dM(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C89994dM(obj, obj2, i));
    }

    /* JADX WARNING: type inference failed for: r2v59, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ba, code lost:
        X.C72453Mb.A1P(r4.A0K);
        com.whatsapp.calling.callhistory.group.GroupCallLogActivity.A0Q(r4, true, r5);
        r3 = X.AnonymousClass000.A13();
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02cf, code lost:
        if (r2.hasNext() == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d1, code lost:
        r0 = r4.A02;
        r1 = ((X.C178109Bv) r2.next()).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02df, code lost:
        if (r0.A0O(r1) != false) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02e1, code lost:
        r0 = r4.A08.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02e7, code lost:
        if (r0 == null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02e9, code lost:
        r3.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f5, code lost:
        if (r4.A03.CNx(r4, r3, 20, r5) != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f7, code lost:
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x034d, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x034f, code lost:
        r0.Bon(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0352, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03dd, code lost:
        r2.invoke(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x079d, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x07a1, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0280, code lost:
        r0.invoke(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0283, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x075b;
                case 1: goto L_0x074c;
                case 2: goto L_0x073d;
                case 3: goto L_0x0716;
                case 4: goto L_0x0700;
                case 5: goto L_0x06e0;
                case 6: goto L_0x06cc;
                case 7: goto L_0x06b8;
                case 8: goto L_0x06a4;
                case 9: goto L_0x03b6;
                case 10: goto L_0x05ec;
                case 11: goto L_0x05b6;
                case 12: goto L_0x036c;
                case 13: goto L_0x0353;
                case 14: goto L_0x0341;
                case 15: goto L_0x0336;
                case 16: goto L_0x032b;
                case 17: goto L_0x05a8;
                case 18: goto L_0x057a;
                case 19: goto L_0x02fb;
                case 20: goto L_0x055b;
                case 21: goto L_0x0538;
                case 22: goto L_0x02b1;
                case 23: goto L_0x02a7;
                case 24: goto L_0x0284;
                case 25: goto L_0x051e;
                case 26: goto L_0x0200;
                case 27: goto L_0x01d7;
                case 28: goto L_0x0507;
                case 29: goto L_0x04d8;
                case 30: goto L_0x04cc;
                case 31: goto L_0x048b;
                case 32: goto L_0x01af;
                case 33: goto L_0x0170;
                case 34: goto L_0x0158;
                case 35: goto L_0x047f;
                case 36: goto L_0x0473;
                case 37: goto L_0x012d;
                case 38: goto L_0x0443;
                case 39: goto L_0x00cf;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x0437;
                case 43: goto L_0x042b;
                case 44: goto L_0x008c;
                case 45: goto L_0x003d;
                case 46: goto L_0x001d;
                case 47: goto L_0x041f;
                case 48: goto L_0x03f5;
                case 49: goto L_0x03e1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r0
            java.lang.Object r2 = r13.A02
            android.view.View r2 = (android.view.View) r2
            X.0vl r0 = r0.A0O
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r1
            android.content.Context r0 = X.AnonymousClass3MY.A04(r2)
            r1.A0X(r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r4 = r13.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r13.A02
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView r3 = (com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView) r3
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.1F9 r0 = X.AnonymousClass1ZG.A00(r4)
            if (r0 == 0) goto L_0x001c
            X.1pm r2 = X.AnonymousClass3MZ.A0H(r0)
            r1 = 0
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView$addA11yFooterIfNeeded$1$1$1 r0 = new com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView$addA11yFooterIfNeeded$1$1$1
            r0.<init>(r4, r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x003d:
            java.lang.Object r2 = r13.A01
            com.whatsapp.calling.vcoverscroll.view.VCMiniPlayerView r2 = (com.whatsapp.calling.vcoverscroll.view.VCMiniPlayerView) r2
            java.lang.Object r0 = r13.A02
            X.3nj r0 = (X.C76653nj) r0
            X.4PJ r5 = r2.getStateHolder()
            X.4N3 r1 = r0.A03
            android.content.Context r4 = X.AnonymousClass3MY.A04(r2)
            r3 = 1
            X.3nh r0 = X.C76633nh.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x001c
            X.00H r0 = r5.A0A
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.9sP r6 = (X.C194859sP) r6
            r0 = 34
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            X.1EC r1 = r5.A00
            if (r1 == 0) goto L_0x008a
            X.00H r0 = r5.A09
            java.lang.Integer r10 = X.C72473Md.A0d(r1, r0)
        L_0x0070:
            r7 = 0
            r12 = 40
            r11 = r7
            r8 = r7
            r6.A01(r7, r8, r9, r10, r11, r12)
            X.00H r0 = r5.A08
            java.lang.Object r2 = r0.get()
            X.1VP r2 = (X.AnonymousClass1VP) r2
            X.9Bw r1 = r5.A01
            if (r1 == 0) goto L_0x001c
            r0 = 9
            r2.BhC(r4, r1, r0, r3)
            return
        L_0x008a:
            r10 = 0
            goto L_0x0070
        L_0x008c:
            java.lang.Object r3 = r13.A01
            X.4TB r3 = (X.AnonymousClass4TB) r3
            java.lang.Object r2 = r13.A02
            X.4Kp r2 = (X.C84724Kp) r2
            java.util.List r0 = X.C42011xT.A0I
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupChatViewHolder/onGroupClicked: "
            r1.append(r0)
            java.lang.String r0 = r3.A01
            X.C17890vO.A1A(r1, r0)
            X.1E7 r5 = r3.A00
            com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet r4 = r2.A00
            r1 = 1
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.String r0 = "calling-tooltip-scenario"
            r3.putInt(r0, r1)
            X.1LU r2 = new X.1LU
            r2.<init>()
            android.content.Context r1 = r4.A14()
            X.1BI r0 = r5.A0J
            android.content.Intent r0 = X.AnonymousClass3MY.A06(r1, r2, r0)
            r0.putExtras(r3)
            r4.A1k(r0)
            X.0vk r0 = r4.A02
            if (r0 == 0) goto L_0x001c
            r0.invoke()
            return
        L_0x00cf:
            java.lang.Object r1 = r13.A01
            X.3my r1 = (X.C76253my) r1
            java.lang.Object r4 = r13.A02
            X.4jB r4 = (X.C93564jB) r4
            java.util.List r0 = X.C42011xT.A0I
            X.5Yt r5 = r1.A00
            com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity r5 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity) r5
            r3 = 0
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x0102
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0102
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x0102
            X.1L9 r2 = r5.A01
            X.00H r0 = r5.A0B
            if (r0 == 0) goto L_0x078e
            java.lang.Object r1 = r0.get()
            X.1LU r1 = (X.AnonymousClass1LU) r1
            X.2rT r0 = r4.A01
            X.1BI r0 = r0.A03
            android.content.Intent r0 = r1.A1w(r5, r0, r3)
        L_0x00fe:
            r2.A09(r5, r0)
            return
        L_0x0102:
            X.0ve r2 = r5.A0E
            r1 = 8567(0x2177, float:1.2005E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001c
            X.1L9 r2 = r5.A01
            X.00H r0 = r5.A0B
            if (r0 == 0) goto L_0x078e
            r0.get()
            X.2rT r0 = r4.A01
            X.1BI r6 = r0.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            X.0ve r0 = r5.A0E
            boolean r10 = X.C40811vJ.A0a(r0, r6, r1)
            r7 = 0
            r9 = r7
            r8 = r7
            android.content.Intent r0 = X.AnonymousClass1LU.A0e(r5, r6, r7, r8, r9, r10)
            goto L_0x00fe
        L_0x012d:
            java.lang.Object r0 = r13.A01
            X.3ZY r0 = (X.AnonymousClass3ZY) r0
            java.lang.Object r1 = r13.A02
            X.3nV r1 = (X.C76533nV) r1
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r0 = r0.A00
            if (r0 == 0) goto L_0x001c
            X.1BI r3 = r1.A03
            X.6lg r1 = r0.A00
            if (r1 == 0) goto L_0x001c
            boolean r0 = X.C22971Dz.A0d(r3)
            if (r0 == 0) goto L_0x001c
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r1.A00
            X.A99 r0 = r0.A0u
            if (r0 == 0) goto L_0x001c
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r0.A1E
            r1 = 37
            X.7Pb r0 = new X.7Pb
            r0.<init>(r3, r1)
            r2.execute(r0)
            return
        L_0x0158:
            java.lang.Object r2 = r13.A01
            X.3ma r2 = (X.C76093ma) r2
            java.lang.Object r1 = r13.A02
            X.3mZ r1 = (X.C76083mZ) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.1E7 r0 = r2.A00
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass3MZ.A0w(r0)
            if (r2 == 0) goto L_0x001c
            X.1Di r0 = r1.A05
            goto L_0x0280
        L_0x0170:
            java.lang.Object r1 = r13.A01
            X.4UT r1 = (X.AnonymousClass4UT) r1
            java.lang.Object r4 = r13.A02
            X.3ZQ r4 = (X.AnonymousClass3ZQ) r4
            java.util.List r0 = X.C42011xT.A0I
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.1E7 r0 = r1.A02
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MZ.A0w(r0)
            if (r3 == 0) goto L_0x001c
            X.0vl r2 = r4.A03
            java.lang.Object r1 = r2.getValue()
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            java.lang.Object r0 = r2.getValue()
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            X.1OS r1 = r4.A05
            java.lang.Object r0 = r2.getValue()
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r3, r0)
            return
        L_0x01af:
            java.lang.Object r2 = r13.A01
            X.4UT r2 = (X.AnonymousClass4UT) r2
            java.lang.Object r1 = r13.A02
            X.3ZQ r1 = (X.AnonymousClass3ZQ) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.1E7 r0 = r2.A02
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MZ.A0w(r0)
            if (r3 == 0) goto L_0x001c
            X.1OS r2 = r1.A05
            X.0vl r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x03dd
        L_0x01d7:
            java.lang.Object r1 = r13.A01
            X.3mP r1 = (X.C76033mP) r1
            java.lang.Object r6 = r13.A02
            X.1mI r6 = (X.C35471mI) r6
            java.util.List r0 = X.C42011xT.A0I
            X.1E7 r5 = r1.A05
            if (r5 == 0) goto L_0x0791
            X.1BI r0 = r5.A0J
            if (r0 == 0) goto L_0x0791
            boolean r4 = r1.A06
            long r2 = r1.A01
            int r1 = r1.A00
            if (r1 != 0) goto L_0x01f7
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r0 = r6.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A0A(r0, r5, r2)
            return
        L_0x01f7:
            r0 = 1
            if (r1 == r0) goto L_0x001c
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r0 = r6.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A0B(r0, r5, r4)
            return
        L_0x0200:
            java.lang.Object r8 = r13.A01
            X.2yL r8 = (X.C66542yL) r8
            java.lang.Object r5 = r13.A02
            X.3ZJ r5 = (X.AnonymousClass3ZJ) r5
            java.util.List r0 = X.C42011xT.A0I
            r2 = 1
            java.util.List r1 = r8.A02
            int r0 = r1.size()
            if (r0 != r2) goto L_0x022f
            X.1E7 r0 = r8.A00
            java.lang.String r4 = X.AnonymousClass17K.A02(r0)
            if (r4 == 0) goto L_0x001c
            X.733 r3 = r5.A02
            android.view.View r0 = r5.A00
            android.content.Context r2 = X.AnonymousClass3MY.A04(r0)
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sms:"
            r3.A04(r2, r1, r4, r0)
            return
        L_0x022f:
            android.content.Context r7 = X.AnonymousClass3MY.A04(r14)
            X.0vb r6 = r5.A03
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r1.iterator()
        L_0x023d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0268
            X.1E7 r0 = X.C17880vN.A0O(r3)
            java.lang.String r2 = X.C24921Me.A02(r7, r6, r0)
            java.lang.String r1 = X.AnonymousClass17K.A02(r0)
            if (r2 == 0) goto L_0x023d
            int r0 = r2.length()
            if (r0 == 0) goto L_0x023d
            if (r1 == 0) goto L_0x023d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x023d
            X.4cK r0 = new X.4cK
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x023d
        L_0x0268:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x001c
            X.1E7 r0 = r8.A00
            java.lang.String r0 = r0.A0K()
            if (r0 != 0) goto L_0x0278
            java.lang.String r0 = ""
        L_0x0278:
            com.whatsapp.contact.picker.PhoneNumberSelectionDialog r2 = com.whatsapp.contact.picker.PhoneNumberSelectionDialog.A00(r0, r4)
            X.1Di r0 = r5.A04
            if (r0 == 0) goto L_0x001c
        L_0x0280:
            r0.invoke(r2)
            return
        L_0x0284:
            java.lang.Object r2 = r13.A01
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet r2 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet) r2
            java.lang.Object r1 = r13.A02
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.view.View r0 = r2.A04
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x001c
            float r1 = r1.y
            android.view.View r0 = r2.A03
            float r0 = r0.getY()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x001c
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A05
            r0 = 5
            r1.A0W(r0)
            return
        L_0x02a7:
            java.lang.Object r4 = r13.A01
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r4 = (com.whatsapp.calling.callhistory.group.GroupCallLogActivity) r4
            java.lang.Object r1 = r13.A02
            java.util.List r1 = (java.util.List) r1
            r5 = 1
            goto L_0x02ba
        L_0x02b1:
            java.lang.Object r4 = r13.A01
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r4 = (com.whatsapp.calling.callhistory.group.GroupCallLogActivity) r4
            java.lang.Object r1 = r13.A02
            java.util.List r1 = (java.util.List) r1
            r5 = 0
        L_0x02ba:
            X.00H r0 = r4.A0K
            X.C72453Mb.A1P(r0)
            r0 = 1
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity.A0Q(r4, r0, r5)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r1.iterator()
        L_0x02cb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ed
            java.lang.Object r1 = r2.next()
            X.9Bv r1 = (X.C178109Bv) r1
            X.11S r0 = r4.A02
            com.whatsapp.jid.UserJid r1 = r1.A00
            boolean r0 = r0.A0O(r1)
            if (r0 != 0) goto L_0x02cb
            X.1M9 r0 = r4.A08
            X.1E7 r0 = r0.A0F(r1)
            if (r0 == 0) goto L_0x02cb
            r3.add(r0)
            goto L_0x02cb
        L_0x02ed:
            X.1VP r1 = r4.A03
            r0 = 20
            int r0 = r1.CNx(r4, r3, r0, r5)
            if (r0 != 0) goto L_0x001c
            r4.finish()
            return
        L_0x02fb:
            java.lang.Object r5 = r13.A01
            X.3mL r5 = (X.C76023mL) r5
            java.lang.Object r4 = r13.A02
            X.4is r4 = (X.C93374is) r4
            java.util.List r0 = X.C42011xT.A0I
            r3 = 1
            X.1OS r2 = r5.A0B
            android.content.Context r1 = X.AnonymousClass3MY.A04(r14)
            X.9Bw r0 = r4.A06
            java.lang.Object r0 = r2.invoke(r1, r0)
            boolean r1 = X.AnonymousClass000.A1Y(r0)
            boolean r0 = X.C76023mL.A01(r5, r1)
            if (r0 == 0) goto L_0x001c
            X.C76023mL.A00(r4, r5, r1, r3)
            X.0vl r0 = r5.A07
            android.view.View r0 = X.C72463Mc.A0O(r0)
            com.whatsapp.components.SelectionCheckView r0 = (com.whatsapp.components.SelectionCheckView) r0
            r0.A04(r1, r3)
            return
        L_0x032b:
            java.lang.Object r0 = r13.A01
            X.5wV r0 = (X.C116165wV) r0
            java.lang.Object r1 = r13.A02
            X.70A r1 = (X.AnonymousClass70A) r1
            X.5bq r0 = r0.A03
            goto L_0x034d
        L_0x0336:
            java.lang.Object r0 = r13.A01
            X.5wX r0 = (X.C116185wX) r0
            java.lang.Object r1 = r13.A02
            X.70A r1 = (X.AnonymousClass70A) r1
            X.5bq r0 = r0.A03
            goto L_0x034d
        L_0x0341:
            java.lang.Object r2 = r13.A01
            X.5wR r2 = (X.C116125wR) r2
            java.lang.Object r1 = r13.A02
            X.70A r1 = (X.AnonymousClass70A) r1
            java.util.List r0 = X.C42011xT.A0I
            X.5bq r0 = r2.A00
        L_0x034d:
            if (r0 == 0) goto L_0x001c
            r0.Bon(r1)
            return
        L_0x0353:
            java.lang.Object r2 = r13.A01
            com.whatsapp.calling.callgrid.view.FocusViewContainer r2 = (com.whatsapp.calling.callgrid.view.FocusViewContainer) r2
            java.lang.Object r0 = r13.A02
            X.4Wg r0 = (X.C87614Wg) r0
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r1 = r2.A03
            int r0 = r0.A01
            r1.A0T(r0)
            X.5nN r0 = r2.A02
            if (r0 == 0) goto L_0x001c
            android.view.View r0 = r0.A0H
            r0.performClick()
            return
        L_0x036c:
            java.lang.Object r0 = r13.A01
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel r0 = (com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel) r0
            java.lang.Object r7 = r13.A02
            X.3RI r7 = (X.AnonymousClass3RI) r7
            r6 = 1
            X.C18070vi.A0d(r7, r6)
            X.00H r0 = r0.A04
            X.4jI r2 = com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase.A00(r0)
            X.4ON r1 = r2.A02
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x03ac
            r5 = 4
            r0 = 34
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x038b:
            X.A99 r3 = r2.A00
            X.1V9 r2 = r2.A04
            com.whatsapp.wds.components.button.WDSButton r0 = r7.getMuteCallButton()
            boolean r1 = r0.isSelected()
            r0 = 1
            if (r1 != r6) goto L_0x03a5
            r0 = 2
        L_0x039b:
            r2.A01(r4, r0, r5)
            if (r3 == 0) goto L_0x001c
            r0 = 0
            r3.A0z(r0)
            return
        L_0x03a5:
            if (r1 == 0) goto L_0x039b
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x03ac:
            boolean r0 = r1.A04
            r5 = 86
            if (r0 == 0) goto L_0x03b4
            r5 = 37
        L_0x03b4:
            r4 = 0
            goto L_0x038b
        L_0x03b6:
            java.lang.Object r5 = r13.A01
            X.8lI r5 = (X.AnonymousClass8lI) r5
            java.lang.Object r4 = r13.A02
            X.99s r4 = (X.C1776199s) r4
            java.util.List r0 = X.C42011xT.A0I
            X.12E r2 = r5.A07
            X.1E7 r0 = r5.A01
            java.lang.String r1 = "waContact"
            if (r0 == 0) goto L_0x0797
            r2.A0B(r0)
            X.1E7 r0 = r5.A01
            if (r0 == 0) goto L_0x0797
            X.1BI r3 = r0.A0J
            if (r3 == 0) goto L_0x001c
            X.1OS r2 = r4.A04
            int r0 = r5.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x03dd:
            r2.invoke(r3, r0)
            return
        L_0x03e1:
            java.lang.Object r3 = r13.A01
            X.8A5 r3 = (X.AnonymousClass8A5) r3
            java.lang.Object r2 = r13.A02
            X.741 r2 = (X.AnonymousClass741) r2
            r1 = 0
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r3.C87(r0)
            X.AnonymousClass741.A04(r2, r1)
            return
        L_0x03f5:
            java.lang.Object r1 = r13.A01
            X.741 r1 = (X.AnonymousClass741) r1
            java.lang.Object r3 = r13.A02
            X.8A5 r3 = (X.AnonymousClass8A5) r3
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.areffects.button.ArEffectsLottieButton r0 = r1.A06
            if (r0 == 0) goto L_0x0408
            r0.A01()
        L_0x0408:
            X.7DY r3 = (X.AnonymousClass7DY) r3
            X.11C r0 = r3.A1B
            X.AnonymousClass4a5.A03(r0)
            r2 = 69
            X.A4v r1 = r3.A1L
            int r0 = X.AnonymousClass7DY.A01(r3)
            X.C72463Mc.A1F(r1, r2, r0)
            r0 = 1
            X.AnonymousClass7DY.A0Y(r3, r0)
            return
        L_0x041f:
            java.lang.Object r1 = r13.A01
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r13.A02
            com.whatsapp.calling.views.InCallDialPadView r0 = (com.whatsapp.calling.views.InCallDialPadView) r0
            com.whatsapp.calling.views.InCallDialPadView.setupKeypad$lambda$1$lambda$0(r1, r0, r14)
            return
        L_0x042b:
            java.lang.Object r1 = r13.A01
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r1
            java.lang.Object r0 = r13.A02
            X.3RH r0 = (X.AnonymousClass3RH) r0
            X.AnonymousClass3RH.setViewModel$lambda$4(r1, r0, r14)
            return
        L_0x0437:
            java.lang.Object r1 = r13.A01
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r1
            java.lang.Object r0 = r13.A02
            X.3RH r0 = (X.AnonymousClass3RH) r0
            X.AnonymousClass3RH.setViewModel$lambda$2(r1, r0, r14)
            return
        L_0x0443:
            java.lang.Object r0 = r13.A01
            X.3ZY r0 = (X.AnonymousClass3ZY) r0
            java.lang.Object r4 = r13.A02
            android.view.View r4 = (android.view.View) r4
            X.AnonymousClass3MX.A1P(r4)
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r1 = r0.A00
            if (r1 == 0) goto L_0x046d
            X.8yP r0 = r1.A06
            r0.A08()
            X.1vp r0 = r1.A0F
            boolean r0 = X.C72463Mc.A1O(r0)
            r3 = 16
            if (r0 == 0) goto L_0x0463
            r3 = 35
        L_0x0463:
            X.1V9 r2 = r1.A09
            java.lang.Integer r1 = X.AnonymousClass3MY.A0g()
            r0 = 5
            r2.A01(r1, r0, r3)
        L_0x046d:
            r0 = 8
            r4.setVisibility(r0)
            return
        L_0x0473:
            java.lang.Object r1 = r13.A01
            com.whatsapp.calling.controls.view.CallControlCard r1 = (com.whatsapp.calling.controls.view.CallControlCard) r1
            java.lang.Object r0 = r13.A02
            android.view.View r0 = (android.view.View) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$16$lambda$15(r1, r0, r14)
            return
        L_0x047f:
            java.lang.Object r1 = r13.A01
            com.whatsapp.calling.controls.view.CallControlCard r1 = (com.whatsapp.calling.controls.view.CallControlCard) r1
            java.lang.Object r0 = r13.A02
            android.view.View r0 = (android.view.View) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$16$lambda$14(r1, r0, r14)
            return
        L_0x048b:
            java.lang.Object r4 = r13.A01
            com.whatsapp.calling.calllink.view.CallLinkActivity r4 = (com.whatsapp.calling.calllink.view.CallLinkActivity) r4
            java.lang.Object r3 = r13.A02
            X.76u r3 = (X.C1417476u) r3
            X.0ve r2 = r4.A0E
            r1 = 10631(0x2987, float:1.4897E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            X.1VP r5 = r4.A08
            java.lang.String r6 = r3.A06
            boolean r9 = r3.A00()
            if (r0 == 0) goto L_0x04c5
            X.1VQ r5 = (X.AnonymousClass1VQ) r5
            r8 = 16
            java.lang.String r7 = "skip_lobby_join_call_link"
        L_0x04ad:
            X.AnonymousClass1VQ.A07(r4, r5, r6, r7, r8, r9)
            X.00H r0 = r4.A0E
            java.lang.Object r3 = r0.get()
            X.9oZ r3 = (X.C192539oZ) r3
            r0 = 25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 9
            r0 = 0
            r3.A01(r2, r0, r1)
            return
        L_0x04c5:
            r8 = 16
            X.1VQ r5 = (X.AnonymousClass1VQ) r5
            java.lang.String r7 = "preview_call_link"
            goto L_0x04ad
        L_0x04cc:
            java.lang.Object r1 = r13.A01
            com.whatsapp.calling.calllink.view.CallLinkActivity r1 = (com.whatsapp.calling.calllink.view.CallLinkActivity) r1
            java.lang.Object r0 = r13.A02
            X.76u r0 = (X.C1417476u) r0
            com.whatsapp.calling.calllink.view.CallLinkActivity.A0Q(r1, r0)
            return
        L_0x04d8:
            java.lang.Object r4 = r13.A01
            X.46t r4 = (X.AnonymousClass46t) r4
            java.lang.Object r0 = r13.A02
            X.76u r0 = (X.C1417476u) r0
            java.lang.Integer r0 = r0.A04
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0505
            r3 = 0
        L_0x04e9:
            r1 = 1
            r0 = 2131895598(0x7f12252e, float:1.9426034E38)
            r2 = 2130903047(0x7f030007, float:1.74129E38)
            android.os.Bundle r1 = X.C72483Me.A0I(r1, r3, r0)
            java.lang.String r0 = "itemsArrayResId"
            r1.putInt(r0, r2)
            com.whatsapp.SingleSelectionDialogFragment r0 = new com.whatsapp.SingleSelectionDialogFragment
            r0.<init>()
            r0.A1R(r1)
            r4.CMl(r0)
            return
        L_0x0505:
            r3 = 1
            goto L_0x04e9
        L_0x0507:
            java.lang.Object r1 = r13.A01
            X.3Y2 r1 = (X.AnonymousClass3Y2) r1
            java.lang.Object r3 = r13.A02
            X.0vk r3 = (X.C18090vk) r3
            java.util.List r0 = X.C42011xT.A0I
            X.1V9 r2 = r1.A00
            r1 = 43
            r0 = 15
            r2.A00(r1, r0)
            r3.invoke()
            return
        L_0x051e:
            java.lang.Object r1 = r13.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            java.util.List r0 = X.C42011xT.A0I
            android.content.Context r4 = r14.getContext()
            android.content.Context r3 = r14.getContext()
            X.1BI r2 = r1.A0J
            r1 = 1
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A13(r3, r2, r1, r0, r1)
            r4.startActivity(r0)
            return
        L_0x0538:
            java.lang.Object r4 = r13.A01
            X.3mK r4 = (X.C76013mK) r4
            java.lang.Object r3 = r13.A02
            X.4ir r3 = (X.C93364ir) r3
            java.util.List r0 = X.C42011xT.A0I
            r2 = 0
            r1 = 1
            X.20H r5 = r4.A07
            android.view.View r0 = r4.A0H
            android.content.Context r6 = X.AnonymousClass3MY.A04(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            X.1E7 r9 = r3.A00
            r10 = r8
            r5.invoke(r6, r7, r8, r9, r10)
            return
        L_0x055b:
            java.lang.Object r3 = r13.A01
            X.3mK r3 = (X.C76013mK) r3
            java.lang.Object r2 = r13.A02
            X.4ir r2 = (X.C93364ir) r2
            java.util.List r0 = X.C42011xT.A0I
            r1 = 0
            X.20H r4 = r3.A07
            android.view.View r0 = r3.A0H
            android.content.Context r5 = X.AnonymousClass3MY.A04(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            X.1E7 r8 = r2.A00
            r9 = r6
            r7 = r6
            r4.invoke(r5, r6, r7, r8, r9)
            return
        L_0x057a:
            java.lang.Object r5 = r13.A01
            X.4RY r5 = (X.AnonymousClass4RY) r5
            java.lang.Object r4 = r13.A02
            X.9Bw r4 = (X.C178119Bw) r4
            com.whatsapp.calling.callhistory.CallLogActivity r3 = r5.A0B
            java.util.HashSet r0 = r3.A0p
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0595
            boolean r1 = com.whatsapp.calling.callhistory.CallLogActivity.A0d(r3, r4)
        L_0x0590:
            r0 = 1
            r5.A00(r1, r0, r0)
            return
        L_0x0595:
            X.0ve r2 = r3.A0E
            r1 = 9034(0x234a, float:1.266E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x05a6
            boolean r0 = r4.A0J
            com.whatsapp.calling.callhistory.CallLogActivity.A0c(r3, r0)
        L_0x05a6:
            r1 = 0
            goto L_0x0590
        L_0x05a8:
            java.lang.Object r0 = r13.A01
            X.5wV r0 = (X.C116165wV) r0
            java.lang.Object r1 = r13.A02
            X.70A r1 = (X.AnonymousClass70A) r1
            X.5bq r0 = r0.A03
            r0.Byi(r1)
            return
        L_0x05b6:
            java.lang.Object r2 = r13.A01
            X.1xT r2 = (X.C42011xT) r2
            java.lang.Object r1 = r13.A02
            X.99r r1 = (X.AnonymousClass99r) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r3 = r1.A00
            android.view.View r0 = r2.A0H
            android.content.Context r0 = X.AnonymousClass3MY.A04(r0)
            X.3Rj r2 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131887134(0x7f12041e, float:1.9408867E38)
            r2.A0E(r0)
            r0 = 2131887133(0x7f12041d, float:1.9408864E38)
            r2.A0D(r0)
            r1 = 2131887448(0x7f120558, float:1.9409503E38)
            r0 = 19
            X.C73203Rj.A09(r2, r3, r0, r1)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 9
            X.C73203Rj.A07(r2, r0, r1)
            r2.A0C()
            return
        L_0x05ec:
            java.lang.Object r2 = r13.A01
            X.99s r2 = (X.C1776199s) r2
            java.lang.Object r1 = r13.A02
            X.3lz r1 = (X.C75883lz) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r0 = r2.A03
            r0.invoke()
            X.4Zt r4 = r1.A00
            X.9tx r0 = r2.A02
            java.lang.String r3 = r0.A07
            android.view.View r2 = r1.A0H
            X.C18070vi.A0W(r2)
            X.1M9 r1 = r4.A03     // Catch:{ 11T -> 0x069e }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ 11T -> 0x069e }
            X.1BI r0 = X.C22931Dv.A01(r3)     // Catch:{ 11T -> 0x069e }
            X.C17960vV.A07(r0)     // Catch:{ 11T -> 0x069e }
            X.1E7 r0 = r1.A0E(r0)     // Catch:{ 11T -> 0x069e }
            if (r0 == 0) goto L_0x061f
            boolean r0 = r0.A0u     // Catch:{ 11T -> 0x069e }
            if (r0 == 0) goto L_0x061f
            X.C88454Zt.A01(r2, r4, r3)     // Catch:{ 11T -> 0x069e }
            return
        L_0x061f:
            X.C88454Zt.A02(r4)     // Catch:{ 11T -> 0x069e }
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r2)     // Catch:{ 11T -> 0x069e }
            android.view.LayoutInflater r1 = r0.getLayoutInflater()     // Catch:{ 11T -> 0x069e }
            r0 = 2131624273(0x7f0e0151, float:1.8875721E38)
            android.view.View r6 = X.AnonymousClass3MY.A0D(r1, r0)     // Catch:{ 11T -> 0x069e }
            X.C18070vi.A0X(r6)     // Catch:{ 11T -> 0x069e }
            android.content.Context r0 = X.AnonymousClass3MY.A04(r2)     // Catch:{ 11T -> 0x069e }
            X.3Rj r5 = X.AnonymousClass4a6.A00(r0)     // Catch:{ 11T -> 0x069e }
            r1 = 5
            X.4an r0 = new X.4an     // Catch:{ 11T -> 0x069e }
            r0.<init>(r4, r1)     // Catch:{ 11T -> 0x069e }
            r5.A0G(r0)     // Catch:{ 11T -> 0x069e }
            r5.A0c(r6)     // Catch:{ 11T -> 0x069e }
            X.05w r0 = r5.create()     // Catch:{ 11T -> 0x069e }
            r4.A00 = r0     // Catch:{ 11T -> 0x069e }
            if (r0 == 0) goto L_0x0653
            r0.show()     // Catch:{ 11T -> 0x069e }
        L_0x0653:
            X.4KM r0 = r4.A02     // Catch:{ 11T -> 0x069e }
            com.whatsapp.jid.UserJid r9 = X.C22941Dw.A02(r3)     // Catch:{ 11T -> 0x069e }
            X.C17960vV.A07(r9)     // Catch:{ 11T -> 0x069e }
            X.C18070vi.A0X(r9)     // Catch:{ 11T -> 0x069e }
            X.4N0 r6 = new X.4N0     // Catch:{ 11T -> 0x069e }
            r6.<init>(r2, r4, r3)     // Catch:{ 11T -> 0x069e }
            X.10H r0 = r0.A00     // Catch:{ 11T -> 0x069e }
            X.10E r1 = r0.A00     // Catch:{ 11T -> 0x069e }
            X.10I r11 = X.AnonymousClass10E.AL1(r1)     // Catch:{ 11T -> 0x069e }
            X.00S r0 = r1.A6N     // Catch:{ 11T -> 0x069e }
            java.lang.Object r10 = r0.get()     // Catch:{ 11T -> 0x069e }
            X.1OZ r10 = (X.AnonymousClass1OZ) r10     // Catch:{ 11T -> 0x069e }
            X.10G r0 = r1.A00     // Catch:{ 11T -> 0x069e }
            X.00S r0 = r0.A10     // Catch:{ 11T -> 0x069e }
            java.lang.Object r8 = r0.get()     // Catch:{ 11T -> 0x069e }
            X.31f r8 = (X.C678831f) r8     // Catch:{ 11T -> 0x069e }
            X.11E r7 = X.AnonymousClass3MZ.A0d(r1)     // Catch:{ 11T -> 0x069e }
            X.4lo r5 = new X.4lo     // Catch:{ 11T -> 0x069e }
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ 11T -> 0x069e }
            r4.A01 = r5     // Catch:{ 11T -> 0x069e }
            X.11E r0 = r5.A01     // Catch:{ 11T -> 0x069e }
            boolean r0 = r0.A09()     // Catch:{ 11T -> 0x069e }
            if (r0 != 0) goto L_0x0696
            X.2rf r0 = X.C62602rf.A04     // Catch:{ 11T -> 0x069e }
            X.C95174lo.A00(r5, r0)     // Catch:{ 11T -> 0x069e }
        L_0x0696:
            X.10I r1 = r5.A03     // Catch:{ 11T -> 0x069e }
            X.9BS r0 = r5.A02     // Catch:{ 11T -> 0x069e }
            X.C17890vO.A0u(r0, r1)     // Catch:{ 11T -> 0x069e }
            return
        L_0x069e:
            X.2rf r0 = X.C62602rf.A02
            X.C88454Zt.A00(r2, r4, r0, r3)
            return
        L_0x06a4:
            java.lang.Object r1 = r13.A01
            X.8J2 r1 = (X.AnonymousClass8J2) r1
            java.lang.Object r0 = r13.A02
            X.9Nd r0 = (X.C180589Nd) r0
            X.BCk r1 = r1.A00
            boolean r0 = r0.A00()
            r0 = r0 ^ 1
            r1.BzZ(r0)
            return
        L_0x06b8:
            java.lang.Object r1 = r13.A01
            X.8J2 r1 = (X.AnonymousClass8J2) r1
            java.lang.Object r0 = r13.A02
            X.9Nd r0 = (X.C180589Nd) r0
            X.BCk r1 = r1.A00
            boolean r0 = r0.A00()
            r0 = r0 ^ 1
            r1.BvZ(r0)
            return
        L_0x06cc:
            java.lang.Object r1 = r13.A01
            X.8J2 r1 = (X.AnonymousClass8J2) r1
            java.lang.Object r0 = r13.A02
            X.9Nd r0 = (X.C180589Nd) r0
            X.BCk r1 = r1.A00
            boolean r0 = r0.A00()
            r0 = r0 ^ 1
            r1.Bry(r0)
            return
        L_0x06e0:
            java.lang.Object r6 = r13.A01
            X.8xY r6 = (X.C174918xY) r6
            java.lang.Object r5 = r13.A02
            X.8wI r5 = (X.C174138wI) r5
            X.9ad r0 = r5.A00
            X.A2L r4 = r0.A01
            X.AEx r3 = r0.A00
            r2 = 0
            r1 = 34
            r0 = 4
            X.A2L.A00(r3, r4, r1, r0, r2)
            X.A6I r3 = r6.A06
            java.lang.String r2 = r5.A03
            r1 = 0
            android.view.View r0 = r6.A0H
            r3.A04(r0, r1, r1, r2)
            return
        L_0x0700:
            java.lang.Object r3 = r13.A01
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog r3 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog) r3
            java.lang.Object r2 = r13.A02
            android.app.Dialog r2 = (android.app.Dialog) r2
            r1 = 0
            X.5ba r0 = r3.A02
            if (r0 == 0) goto L_0x0710
            r0.BtI()
        L_0x0710:
            r3.A03 = r1
            r2.dismiss()
            return
        L_0x0716:
            java.lang.Object r1 = r13.A01
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog r1 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog) r1
            java.lang.Object r3 = r13.A02
            android.app.Dialog r3 = (android.app.Dialog) r3
            X.5ba r2 = r1.A02
            if (r2 == 0) goto L_0x0736
            X.A5L r0 = r1.A00
            if (r0 == 0) goto L_0x073a
            X.A4k r1 = r1.A01
            if (r1 == 0) goto L_0x079b
            X.A6f r0 = r0.A02()
            if (r0 != 0) goto L_0x0733
            r1.A02()
        L_0x0733:
            r2.C0Z()
        L_0x0736:
            r3.dismiss()
            return
        L_0x073a:
            java.lang.String r0 = "searchLocationRepository"
            goto L_0x079d
        L_0x073d:
            java.lang.Object r1 = r13.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.Object r0 = r13.A02
            X.5ao r0 = (X.C107905ao) r0
            r1.dismiss()
            r0.BxI()
            return
        L_0x074c:
            java.lang.Object r1 = r13.A01
            X.5ao r1 = (X.C107905ao) r1
            java.lang.Object r0 = r13.A02
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.BxH()
            r0.dismiss()
            return
        L_0x075b:
            java.lang.Object r6 = r13.A01
            X.A7p r6 = (X.C20109A7p) r6
            java.lang.Object r5 = r13.A02
            X.8wY r5 = (X.C174298wY) r5
            android.view.View r4 = r6.A00
            X.AF0 r0 = r5.A0B
            X.B7r r3 = r5.A09
            X.BD3 r2 = r5.A0A
            X.A6I r1 = r6.A0F
            java.lang.String r0 = r0.A0F
            r1.A04(r4, r3, r2, r0)
            X.BAb r4 = r5.A08
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x078c
            java.lang.Integer r3 = X.C17880vN.A0h()
        L_0x077c:
            java.lang.Integer r2 = X.C20109A7p.A00(r6, r5)
            java.lang.Integer r1 = X.C20109A7p.A02(r6, r5)
            java.lang.Integer r0 = X.C20109A7p.A01(r6, r5)
            r4.C1v(r3, r2, r1, r0)
            return
        L_0x078c:
            r3 = 0
            goto L_0x077c
        L_0x078e:
            java.lang.String r0 = "waIntents"
            goto L_0x079d
        L_0x0791:
            java.lang.String r0 = "ScheduledCallItemViewHolder/callTypeIconClicked group contact null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0797:
            X.C18070vi.A11(r1)
            goto L_0x07a0
        L_0x079b:
            java.lang.String r0 = "defaultSearchLocationProvider"
        L_0x079d:
            X.C18070vi.A11(r0)
        L_0x07a0:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89994dM.onClick(android.view.View):void");
    }
}
