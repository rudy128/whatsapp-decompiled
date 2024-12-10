package X;

import android.view.View;

/* renamed from: X.4dU  reason: invalid class name and case insensitive filesystem */
public class C90074dU implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90074dU(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C90074dU(view, obj, i));
    }

    public static void A01(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C90074dU(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v114, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v115, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageButton} */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x031e, code lost:
        r2 = (X.C86314Rd) r0.get();
        r1 = r1.getContext();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0329, code lost:
        r2.A00(r1, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x032c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0399, code lost:
        X.AnonymousClass3tT.A02(r1, r4, r3, java.lang.Integer.valueOf(r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0441, code lost:
        r0 = r3.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0445, code lost:
        r0.startActivity(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0448, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x057f, code lost:
        if (r2 != 3) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x05d9, code lost:
        r4.onClick(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x05dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x064b, code lost:
        r0.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x064e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x06a5, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02df, code lost:
        X.C18070vi.A0X(r1);
        r2.CGU(r1, android.net.Uri.parse(r3.A07), r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0663;
                case 1: goto L_0x064f;
                case 2: goto L_0x0635;
                case 3: goto L_0x0629;
                case 4: goto L_0x0629;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x05f0;
                case 8: goto L_0x05dd;
                case 9: goto L_0x05c0;
                case 10: goto L_0x05a6;
                case 11: goto L_0x0569;
                case 12: goto L_0x055d;
                case 13: goto L_0x0551;
                case 14: goto L_0x0186;
                case 15: goto L_0x04e5;
                case 16: goto L_0x04d9;
                case 17: goto L_0x04cd;
                case 18: goto L_0x04c1;
                case 19: goto L_0x04b5;
                case 20: goto L_0x04a3;
                case 21: goto L_0x0166;
                case 22: goto L_0x0495;
                case 23: goto L_0x0449;
                case 24: goto L_0x040c;
                case 25: goto L_0x03cf;
                case 26: goto L_0x03a1;
                case 27: goto L_0x0130;
                case 28: goto L_0x0387;
                case 29: goto L_0x0374;
                case 30: goto L_0x0368;
                case 31: goto L_0x010f;
                case 32: goto L_0x035c;
                case 33: goto L_0x0345;
                case 34: goto L_0x0339;
                case 35: goto L_0x032d;
                case 36: goto L_0x00e4;
                case 37: goto L_0x0314;
                case 38: goto L_0x0309;
                case 39: goto L_0x02ec;
                case 40: goto L_0x026c;
                case 41: goto L_0x0091;
                case 42: goto L_0x025b;
                case 43: goto L_0x0231;
                case 44: goto L_0x068f;
                case 45: goto L_0x0057;
                case 46: goto L_0x0200;
                case 47: goto L_0x01d9;
                case 48: goto L_0x01bb;
                case 49: goto L_0x003c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r13.A01
            X.3uR r6 = (X.C79093uR) r6
            java.lang.Object r0 = r13.A02
            X.206 r0 = (X.AnonymousClass206) r0
            X.36g r0 = X.AnonymousClass2UY.A00(r0)
            if (r0 == 0) goto L_0x0039
            com.whatsapp.jid.UserJid r5 = r0.A01
            X.0ve r2 = r6.A0F
            r1 = 5431(0x1537, float:7.61E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r4 = 0
            if (r0 == 0) goto L_0x003a
            r0 = 25
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x0028:
            android.content.Context r2 = r6.getContext()
            r1 = 0
            r0 = 1
            android.content.Intent r1 = X.AnonymousClass1LU.A1D(r2, r5, r3, r0, r1)
            android.content.Context r0 = r6.getContext()
            r0.startActivity(r1, r4)
        L_0x0039:
            return
        L_0x003a:
            r3 = r4
            goto L_0x0028
        L_0x003c:
            java.lang.Object r1 = r13.A01
            X.4NE r1 = (X.AnonymousClass4NE) r1
            java.lang.Object r4 = r13.A02
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            r3 = 0
            java.lang.ref.WeakReference r0 = r1.A02
            java.lang.Object r2 = r0.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x0039
            X.1pj r1 = r1.A01
            java.lang.String r0 = "chat"
            r1.A0H(r2, r4, r0, r3)
            return
        L_0x0057:
            java.lang.Object r8 = r13.A01
            X.20i r8 = (X.C436420i) r8
            java.lang.Object r7 = r13.A02
            X.4C0 r7 = (X.AnonymousClass4C0) r7
            r6 = 1
            X.C18070vi.A0d(r7, r6)
            r0 = r8
            X.2Mg r0 = (X.C48382Mg) r0
            r5 = 2
            com.whatsapp.jid.GroupJid r4 = r0.A19(r5)
            com.whatsapp.jid.GroupJid r3 = r0.A19(r6)
            X.1EC r2 = X.AnonymousClass3MW.A0i(r3)
            if (r2 == 0) goto L_0x007e
            X.10I r1 = r7.getWaWorkers()
            r0 = 18
            X.C98714rb.A00(r1, r7, r8, r2, r0)
        L_0x007e:
            if (r3 == 0) goto L_0x0039
            if (r4 == 0) goto L_0x0039
            X.1FU r2 = X.C72473Md.A0O(r7)
            if (r2 == 0) goto L_0x0039
            com.whatsapp.community.JoinGroupBottomSheetFragment r1 = com.whatsapp.community.JoinGroupBottomSheetFragment.A00(r3, r4, r6, r5)
            r0 = 0
            r2.CMk(r1, r0)
            return
        L_0x0091:
            java.lang.Object r5 = r13.A01
            com.whatsapp.conversation.conversationrow.bottomsheets.GenericSystemInfoBottomSheet r5 = (com.whatsapp.conversation.conversationrow.bottomsheets.GenericSystemInfoBottomSheet) r5
            java.lang.Object r4 = r13.A02
            X.4U8 r4 = (X.AnonymousClass4U8) r4
            boolean r0 = r5 instanceof com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet
            if (r0 == 0) goto L_0x00c4
            r2 = r5
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet r2 = (com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet) r2
            r3 = 2
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet.A00(r2, r3)
            int r1 = r2.A01
            r0 = 30
            if (r1 != r0) goto L_0x00c4
            X.18K r2 = r2.A04
            if (r2 == 0) goto L_0x068b
            X.8qp r1 = new X.8qp
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A00 = r0
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            r2.CC7(r1)
        L_0x00c4:
            r5.A29()
            if (r4 == 0) goto L_0x0039
            android.net.Uri r3 = r4.A00
            if (r3 == 0) goto L_0x0039
            X.1L9 r2 = r5.A00
            if (r2 == 0) goto L_0x0688
            android.content.Context r1 = r5.A14()
            X.00H r0 = r5.A03
            if (r0 == 0) goto L_0x0685
            r0.get()
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r3)
            r2.A08(r1, r0)
            return
        L_0x00e4:
            java.lang.Object r1 = r13.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r13.A02
            X.206 r0 = (X.AnonymousClass206) r0
            X.1FU r4 = X.AnonymousClass3Ma.A0K(r1)
            if (r4 == 0) goto L_0x0039
            X.205 r0 = r0.A0v
            java.lang.String r3 = r0.A01
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            com.whatsapp.bot.botmemory.bottomsheet.MemoryBottomSheet r2 = new com.whatsapp.bot.botmemory.bottomsheet.MemoryBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "annotated_message_key_id"
            r1.putString(r0, r3)
            r2.A1R(r1)
            r4.CMl(r2)
            return
        L_0x010f:
            java.lang.Object r5 = r13.A01
            X.3uP r5 = (X.AnonymousClass3uP) r5
            java.lang.Object r4 = r13.A02
            X.206 r4 = (X.AnonymousClass206) r4
            X.205 r0 = r4.A0v
            X.1BI r0 = r0.A00
            if (r0 == 0) goto L_0x0039
            X.1EC r3 = X.AnonymousClass3MW.A0i(r0)
            if (r3 == 0) goto L_0x0039
            X.10I r2 = r5.A1X
            r1 = 11
            X.4rb r0 = new X.4rb
            r0.<init>(r5, r4, r3, r1)
            r2.CGN(r0)
            return
        L_0x0130:
            java.lang.Object r3 = r13.A01
            X.3sm r3 = (X.C78423sm) r3
            java.lang.Object r4 = r13.A02
            android.content.Context r4 = (android.content.Context) r4
            X.0ve r2 = r3.A0F
            r1 = 1948(0x79c, float:2.73E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0039
            com.whatsapp.WaTextView r0 = r3.A0A
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0039
            X.206 r3 = r3.getFMessage()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.polls.results.PollResultsActivity"
            r2.setClassName(r1, r0)
            X.205 r0 = r3.A0v
            X.AnonymousClass4aU.A00(r2, r0)
            r4.startActivity(r2)
            return
        L_0x0166:
            java.lang.Object r2 = r13.A01
            X.3uP r2 = (X.AnonymousClass3uP) r2
            java.lang.Object r1 = r13.A02
            X.AW0 r1 = (X.AW0) r1
            X.00H r0 = r2.A2L
            java.lang.Object r0 = r0.get()
            X.2lL r0 = (X.C58842lL) r0
            X.206 r1 = r0.A01(r1)
            X.5cS r0 = X.C88404Zo.A02(r2)
            if (r1 == 0) goto L_0x0039
            if (r0 == 0) goto L_0x0039
            r0.CH3(r1)
            return
        L_0x0186:
            java.lang.Object r2 = r13.A01
            X.3tE r2 = (X.C78623tE) r2
            java.lang.Object r1 = r13.A02
            X.21e r1 = (X.C438521e) r1
            boolean r0 = X.C78623tE.A04(r2, r1)
            if (r0 == 0) goto L_0x01a6
            boolean r0 = X.C78623tE.A03(r2, r1)
            if (r0 != 0) goto L_0x01a2
            X.2rc r0 = r1.A02
            if (r0 == 0) goto L_0x01a6
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x01a6
        L_0x01a2:
            X.C78623tE.A01(r2, r1)
            return
        L_0x01a6:
            r2.A20()
            boolean r0 = X.C78623tE.A03(r2, r1)
            if (r0 == 0) goto L_0x0039
            X.2rc r0 = r1.A02
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.A0V
            if (r0 != 0) goto L_0x0039
            r2.A2o()
            return
        L_0x01bb:
            java.lang.Object r4 = r13.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            r3 = 1
            X.C18070vi.A0d(r4, r3)
            android.content.Context r2 = r14.getContext()
            android.content.Context r1 = r14.getContext()
            r0 = 22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.content.Intent r0 = X.AnonymousClass1LU.A1D(r1, r4, r0, r3, r3)
            r2.startActivity(r0)
            return
        L_0x01d9:
            java.lang.Object r4 = r13.A02
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2
            X.C18070vi.A0d(r14, r0)
            android.content.Context r3 = r14.getContext()
            X.C18070vi.A0b(r3)
            android.content.Intent r2 = X.C72463Mc.A0G(r3)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.reporttoadminreporterslist.ReportToAdminReportersActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "reporters_user_jid"
            r2.putParcelableArrayListExtra(r0, r4)
            r3.startActivity(r2)
            return
        L_0x0200:
            java.lang.Object r6 = r13.A01
            X.4C2 r6 = (X.AnonymousClass4C2) r6
            java.lang.Object r5 = r13.A02
            X.1BI r5 = (X.AnonymousClass1BI) r5
            r4 = 0
            X.C18070vi.A0d(r6, r4)
            r3 = 1
            X.0ve r2 = r6.A03
            X.18K r1 = r6.A01
            r0 = 3
            X.AnonymousClass4ZP.A00(r2, r1, r5, r4, r0)
            X.1Mc r1 = r6.A02
            r0 = 4
            r1.A03(r5, r0, r4)
            r1.A08(r5, r3)
            X.1Q1 r3 = r6.A00
            X.00H r0 = r3.A00
            X.11A r2 = X.C17880vN.A0d(r0)
            r1 = 10
            X.3Bx r0 = new X.3Bx
            r0.<init>(r3, r5, r1)
            r2.A00(r0)
            return
        L_0x0231:
            java.lang.Object r2 = r13.A01
            X.4C5 r2 = (X.AnonymousClass4C5) r2
            java.lang.Object r4 = r13.A02
            X.1FL r4 = (X.AnonymousClass1FL) r4
            r10 = 1
            X.C18070vi.A0d(r4, r10)
            X.1EC r6 = r2.A05
            if (r6 == 0) goto L_0x0247
            X.10I r1 = r2.A07
            r0 = 6
            X.C98704ra.A00(r1, r2, r6, r0)
        L_0x0247:
            X.1GP r3 = X.AnonymousClass3MX.A0O(r4)
            X.1EC r5 = r2.A04
            boolean r12 = r2.A08
            int r11 = r2.A00
            X.0wS r7 = X.C18460wS.A00
            X.5QE r8 = X.AnonymousClass5QE.A00
            X.5Vw r9 = X.C106445Vw.A00
            X.C83744Gm.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x025b:
            java.lang.Object r0 = r13.A01
            X.3ul r0 = (X.C79163ul) r0
            java.lang.Object r3 = r13.A02
            X.210 r3 = (X.AnonymousClass210) r3
            X.1nl r2 = r0.getLinkLauncher()
            android.content.Context r1 = r0.getContext()
            goto L_0x02df
        L_0x026c:
            java.lang.Object r5 = r13.A01
            X.3ud r5 = (X.C79133ud) r5
            java.lang.Object r3 = r13.A02
            X.210 r3 = (X.AnonymousClass210) r3
            r6 = 1
            android.content.Context r4 = r5.getContext()
            X.11C r2 = r5.getSystemServices()
            android.content.Context r1 = r5.getContext()
            r0 = 2131887320(0x7f1204d8, float:1.9409244E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            X.AnonymousClass1Y5.A00(r4, r2, r0)
            X.0ve r2 = r5.getAbProps()
            r1 = 12073(0x2f29, float:1.6918E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x02d7
            X.18K r4 = r5.getWamRuntime()
            X.2Hl r2 = new X.2Hl
            r2.<init>()
            r0 = 90
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.A05 = r0
            r1 = 0
            java.lang.String r0 = X.C50542Uv.A00()
            r2.A0E = r0
            int r0 = r5.A04
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A09 = r0
            X.36i r0 = X.AnonymousClass2UX.A00(r3)
            if (r0 == 0) goto L_0x02d2
            java.lang.Integer r0 = r0.A02
            if (r0 == 0) goto L_0x02d2
            int r0 = r0.intValue()
            int r0 = r0 - r6
            java.lang.Long r1 = X.C17880vN.A0n(r0)
        L_0x02d2:
            r2.A08 = r1
            r4.CC7(r2)
        L_0x02d7:
            X.1nl r2 = r5.getLinkLauncher()
            android.content.Context r1 = r5.getContext()
        L_0x02df:
            X.C18070vi.A0X(r1)
            java.lang.String r0 = r3.A07
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.CGU(r1, r0, r3)
            return
        L_0x02ec:
            java.lang.Object r1 = r13.A01
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r1 = (com.whatsapp.conversation.conversationrow.InteractiveMessageView) r1
            java.lang.Object r3 = r13.A02
            X.206 r3 = (X.AnonymousClass206) r3
            X.00H r0 = r1.A0G
            java.lang.Object r2 = r0.get()
            X.4Rd r2 = (X.C86314Rd) r2
            android.content.Context r1 = r1.getContext()
            java.lang.Integer r0 = X.C17880vN.A0j()
            X.4lI r0 = X.AnonymousClass4GK.A00(r3, r0)
            goto L_0x0329
        L_0x0309:
            java.lang.Object r1 = r13.A01
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r1 = (com.whatsapp.conversation.conversationrow.InteractiveMessageView) r1
            java.lang.Object r3 = r13.A02
            X.206 r3 = (X.AnonymousClass206) r3
            X.00H r0 = r1.A0G
            goto L_0x031e
        L_0x0314:
            java.lang.Object r1 = r13.A01
            com.whatsapp.conversation.conversationrow.InteractiveMessageButton r1 = (com.whatsapp.conversation.conversationrow.InteractiveMessageButton) r1
            java.lang.Object r3 = r13.A02
            X.206 r3 = (X.AnonymousClass206) r3
            X.00H r0 = r1.A0E
        L_0x031e:
            java.lang.Object r2 = r0.get()
            X.4Rd r2 = (X.C86314Rd) r2
            android.content.Context r1 = r1.getContext()
            r0 = 0
        L_0x0329:
            r2.A00(r1, r0, r3)
            return
        L_0x032d:
            java.lang.Object r1 = r13.A01
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            java.lang.Object r0 = r13.A02
            X.3uI r0 = (X.C79063uI) r0
            X.C79063uI.setLottieComposition$lambda$13$lambda$11(r1, r0, r14)
            return
        L_0x0339:
            java.lang.Object r1 = r13.A01
            X.3sc r1 = (X.AnonymousClass3sc) r1
            java.lang.Object r0 = r13.A02
            X.3wV r0 = (X.C80073wV) r0
            r1.A2i(r0)
            return
        L_0x0345:
            java.lang.Object r0 = r13.A01
            X.3sc r0 = (X.AnonymousClass3sc) r0
            java.lang.Object r1 = r13.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1FU r2 = r0.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = 14
            android.content.Intent r1 = X.C72463Mc.A0F(r2, r1, r0)
            r0 = 0
            r2.startActivity(r1, r0)
            return
        L_0x035c:
            java.lang.Object r1 = r13.A01
            X.8nW r1 = (X.AnonymousClass8nW) r1
            java.lang.Object r0 = r13.A02
            X.23j r0 = (X.C444223j) r0
            r1.A2l(r0)
            return
        L_0x0368:
            java.lang.Object r1 = r13.A01
            X.3tT r1 = (X.AnonymousClass3tT) r1
            java.lang.Object r0 = r13.A02
            X.23u r0 = (X.C445323u) r0
            X.AnonymousClass3tT.A03(r1, r0)
            return
        L_0x0374:
            java.lang.Object r4 = r13.A01
            X.3tT r4 = (X.AnonymousClass3tT) r4
            java.lang.Object r3 = r13.A02
            X.22Q r3 = (X.AnonymousClass22Q) r3
            boolean r2 = X.C72453Mb.A1Z(r3)
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r4.A05
            X.C18070vi.A0W(r1)
            r0 = 3
            goto L_0x0399
        L_0x0387:
            java.lang.Object r4 = r13.A01
            X.3tT r4 = (X.AnonymousClass3tT) r4
            java.lang.Object r3 = r13.A02
            X.22Q r3 = (X.AnonymousClass22Q) r3
            boolean r2 = X.C72453Mb.A1Z(r3)
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r4.A05
            X.C18070vi.A0W(r1)
            r0 = 4
        L_0x0399:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AnonymousClass3tT.A02(r1, r4, r3, r0, r2)
            return
        L_0x03a1:
            java.lang.Object r5 = r13.A01
            X.3sf r5 = (X.C78353sf) r5
            java.lang.Object r4 = r13.A02
            X.AW0 r4 = (X.AW0) r4
            android.content.Context r1 = r5.getContext()
            X.1QS r0 = r5.A01
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BWx()
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r1, r0)
            X.1BI r3 = r4.A0C
            boolean r2 = r4.A0Q
            java.lang.String r1 = r4.A0L
            X.205 r0 = new X.205
            r0.<init>(r3, r1, r2)
            X.AnonymousClass4aU.A00(r6, r0)
            android.content.Context r0 = r5.getContext()
            goto L_0x0445
        L_0x03cf:
            java.lang.Object r3 = r13.A01
            X.3uF r3 = (X.AnonymousClass3uF) r3
            java.lang.Object r2 = r13.A02
            X.206 r2 = (X.AnonymousClass206) r2
            android.content.Context r1 = r3.getContext()
            X.1QS r0 = r3.A02
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BYz()
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r1, r0)
            X.1BI r0 = r2.A0H()
            java.lang.String r1 = X.C22971Dz.A06(r0)
            java.lang.String r0 = "extra_jid"
            r6.putExtra(r0, r1)
            X.1BI r0 = r2.A0H()
            java.lang.String r1 = X.C22971Dz.A06(r0)
            java.lang.String r0 = "extra_inviter_jid"
            r6.putExtra(r0, r1)
            java.lang.String r1 = "extra_referral_screen"
            java.lang.String r0 = "chat"
            r6.putExtra(r1, r0)
            goto L_0x0441
        L_0x040c:
            java.lang.Object r3 = r13.A01
            X.3uF r3 = (X.AnonymousClass3uF) r3
            java.lang.Object r2 = r13.A02
            X.206 r2 = (X.AnonymousClass206) r2
            android.content.Context r1 = r3.getContext()
            X.1QS r0 = r3.A02
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BMM()
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r1, r0)
            java.lang.String r1 = "extra_setup_mode"
            r0 = 1
            r6.putExtra(r1, r0)
            X.1BI r0 = r2.A0H()
            java.lang.String r1 = X.C22971Dz.A06(r0)
            java.lang.String r0 = "extra_jid"
            r6.putExtra(r0, r1)
            java.lang.String r1 = "acceptInvite"
            X.11P r0 = r3.A0B
            X.C60442o2.A00(r6, r0, r1)
        L_0x0441:
            android.content.Context r0 = r3.getContext()
        L_0x0445:
            r0.startActivity(r6)
            return
        L_0x0449:
            java.lang.Object r3 = r13.A01
            X.3uF r3 = (X.AnonymousClass3uF) r3
            java.lang.Object r5 = r13.A02
            X.206 r5 = (X.AnonymousClass206) r5
            android.content.Context r1 = r3.getContext()
            X.1QS r0 = r3.A02
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BMM()
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r1, r0)
            java.lang.String r1 = "extra_is_first_payment_method"
            r0 = 1
            r4.putExtra(r1, r0)
            java.lang.String r0 = "extra_payments_entry_type"
            r2 = 2
            r4.putExtra(r0, r2)
            java.lang.String r1 = "extra_skip_value_props_display"
            r0 = 0
            r4.putExtra(r1, r0)
            java.lang.String r0 = "extra_setup_mode"
            r4.putExtra(r0, r2)
            X.1BI r0 = r5.A0H()
            java.lang.String r1 = X.C22971Dz.A06(r0)
            java.lang.String r0 = "extra_jid"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "acceptInvite"
            X.11P r0 = r3.A0B
            X.C60442o2.A00(r4, r0, r1)
            android.content.Context r0 = r3.getContext()
            goto L_0x064b
        L_0x0495:
            java.lang.Object r0 = r13.A01
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r4 = r13.A02
            android.content.Intent r4 = (android.content.Intent) r4
            android.content.Context r0 = r0.getContext()
            goto L_0x064b
        L_0x04a3:
            java.lang.Object r1 = r13.A01
            X.8nY r1 = (X.AnonymousClass8nY) r1
            java.lang.Object r0 = r13.A02
            X.AW0 r0 = (X.AW0) r0
            X.72F r1 = r1.A0B
            X.AEX r0 = r0.A04()
            r1.A04(r0)
            return
        L_0x04b5:
            java.lang.Object r1 = r13.A01
            X.3sq r1 = (X.C78463sq) r1
            java.lang.Object r0 = r13.A02
            X.2Dk r0 = (X.C46162Dk) r0
            X.C78463sq.setupAddNewsletterDescriptionButton$lambda$9(r1, r0, r14)
            return
        L_0x04c1:
            java.lang.Object r1 = r13.A01
            X.3sq r1 = (X.C78463sq) r1
            java.lang.Object r0 = r13.A02
            X.2Dk r0 = (X.C46162Dk) r0
            X.C78463sq.setupNewsletterIcon$lambda$0(r1, r0, r14)
            return
        L_0x04cd:
            java.lang.Object r1 = r13.A01
            X.3sq r1 = (X.C78463sq) r1
            java.lang.Object r0 = r13.A02
            X.2Dk r0 = (X.C46162Dk) r0
            X.C78463sq.setupShareToMyStatusButton$lambda$14(r1, r0, r14)
            return
        L_0x04d9:
            java.lang.Object r1 = r13.A01
            X.3sq r1 = (X.C78463sq) r1
            java.lang.Object r0 = r13.A02
            X.2Dk r0 = (X.C46162Dk) r0
            X.C78463sq.setupShareNewsletterLinkButton$lambda$10(r1, r0, r14)
            return
        L_0x04e5:
            java.lang.Object r2 = r13.A01
            X.3sv r2 = (X.C78513sv) r2
            java.lang.Object r4 = r13.A02
            X.22O r4 = (X.AnonymousClass22O) r4
            X.00H r0 = r2.A01
            X.C72453Mb.A1P(r0)
            java.util.List r0 = r4.A00
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x050c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "call logs are empty, message.key="
            java.lang.String r0 = X.AnonymousClass206.A03(r4, r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x050c:
            r0 = 0
            java.lang.Object r9 = r1.get(r0)
            java.lang.String r0 = "null call log"
            X.C17960vV.A08(r9, r0)
            X.9Bw r9 = (X.C178119Bw) r9
            android.content.Context r0 = r2.getContext()
            android.app.Activity r5 = X.C18050vg.A00(r0)
            boolean r0 = r5 instanceof X.AnonymousClass1FL
            if (r0 == 0) goto L_0x0538
            boolean r0 = r9.A0O()
            if (r0 == 0) goto L_0x0538
            X.0ve r8 = r2.A0F
            X.11S r6 = r2.A0U
            X.1M9 r7 = r2.A0j
            X.1FL r5 = (X.AnonymousClass1FL) r5
            r10 = 39
            X.AnonymousClass74H.A08(r5, r6, r7, r8, r9, r10)
            return
        L_0x0538:
            r4.A18()
            X.1VP r3 = r2.A00
            X.1M9 r1 = r2.A0j
            X.1BI r0 = X.AnonymousClass205.A00(r4)
            X.1E7 r2 = r1.A0H(r0)
            r1 = 39
            boolean r0 = r4.A18()
            r3.CNw(r5, r2, r1, r0)
            return
        L_0x0551:
            java.lang.Object r1 = r13.A01
            X.3tE r1 = (X.C78623tE) r1
            java.lang.Object r0 = r13.A02
            X.21e r0 = (X.C438521e) r0
            X.C78623tE.A01(r1, r0)
            return
        L_0x055d:
            java.lang.Object r1 = r13.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r13.A02
            X.3u7 r0 = (X.AnonymousClass3u7) r0
            X.AnonymousClass3u7.setAlbumMessages$lambda$5(r1, r0, r14)
            return
        L_0x0569:
            java.lang.Object r4 = r13.A01
            X.3u2 r4 = (X.C78983u2) r4
            java.lang.Object r3 = r13.A02
            X.21t r3 = (X.C440021t) r3
            X.49n r0 = r4.A0D
            X.4a0 r1 = r0.A00
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0581
            int r2 = r1.A02()
            r0 = 3
            r1 = 1
            if (r2 == r0) goto L_0x0582
        L_0x0581:
            r1 = 0
        L_0x0582:
            X.4TR r0 = r4.A0C
            if (r0 == 0) goto L_0x05a0
            if (r1 != 0) goto L_0x05a0
            boolean r0 = X.C79103uS.A1J(r4)
            if (r0 == 0) goto L_0x059c
            X.10I r2 = r4.A1X
            r0 = 7
            X.4rl r1 = new X.4rl
            r1.<init>(r4, r3, r0)
            java.lang.String r0 = "conversation_row_play_gif_worker_token"
            r2.CGL(r1, r0)
            return
        L_0x059c:
            X.C78983u2.A0C(r4, r3)
            return
        L_0x05a0:
            X.1rL r0 = r4.A0F
            r0.onClick(r14)
            return
        L_0x05a6:
            java.lang.Object r0 = r13.A01
            X.3so r0 = (X.C78443so) r0
            java.lang.Object r4 = r13.A02
            X.1rL r4 = (X.C38471rL) r4
            X.00H r0 = r0.A0F
            java.lang.Object r3 = r0.get()
            X.6mK r3 = (X.C132176mK) r3
            java.lang.Integer r2 = X.C17880vN.A0h()
            r1 = 3
            r0 = 2
            r3.A00(r2, r1, r0)
            goto L_0x05d9
        L_0x05c0:
            java.lang.Object r0 = r13.A01
            X.3so r0 = (X.C78443so) r0
            java.lang.Object r4 = r13.A02
            X.1rL r4 = (X.C38471rL) r4
            X.00H r0 = r0.A0F
            java.lang.Object r3 = r0.get()
            X.6mK r3 = (X.C132176mK) r3
            r2 = 2
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A00(r0, r1, r2)
        L_0x05d9:
            r4.onClick(r14)
            return
        L_0x05dd:
            java.lang.Object r2 = r13.A01
            X.3ts r2 = (X.C78903ts) r2
            java.lang.Object r1 = r13.A02
            X.4T6 r1 = (X.AnonymousClass4T6) r1
            java.lang.String r0 = "ConversationRowCallLink/on-click"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r1.A00
            X.C78903ts.A02(r2, r0)
            return
        L_0x05f0:
            java.lang.Object r4 = r13.A01
            X.1FU r4 = (X.AnonymousClass1FU) r4
            java.lang.Object r0 = r13.A02
            X.3tp r0 = (X.C78873tp) r0
            java.util.Collection r0 = r0.A00
            com.whatsapp.plugins.AiSearchSourcesBottomSheet r3 = new com.whatsapp.plugins.AiSearchSourcesBottomSheet
            r3.<init>()
            if (r0 == 0) goto L_0x0613
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0609:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0615
            X.C72463Mc.A1L(r2, r1)
            goto L_0x0609
        L_0x0613:
            X.0wS r2 = X.C18460wS.A00
        L_0x0615:
            boolean r0 = X.AnonymousClass000.A1a(r2)
            if (r0 == 0) goto L_0x0625
            android.os.Bundle r0 = X.C17880vN.A0D()
            X.AnonymousClass4aU.A0C(r0, r2)
            r3.A1R(r0)
        L_0x0625:
            r4.CMl(r3)
            return
        L_0x0629:
            java.lang.Object r1 = r13.A01
            X.3uP r1 = (X.AnonymousClass3uP) r1
            java.lang.Object r0 = r13.A02
            X.206 r0 = (X.AnonymousClass206) r0
            X.AnonymousClass3uP.A0g(r1, r0)
            return
        L_0x0635:
            java.lang.Object r2 = r13.A01
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r1 = r13.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            r4.setData(r2)
            android.content.Context r0 = r1.getContext()
        L_0x064b:
            r0.startActivity(r4)
            return
        L_0x064f:
            java.lang.Object r2 = r13.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r1 = r13.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            android.content.Context r0 = r2.A14()
            android.content.Intent r0 = X.AnonymousClass1LU.A1B(r0, r1)
            r2.A1k(r0)
            return
        L_0x0663:
            java.lang.Object r5 = r13.A01
            X.3rv r5 = (X.C77983rv) r5
            java.lang.Object r3 = r13.A02
            X.9tI r3 = (X.C195409tI) r3
            r4 = 1
            X.9lF r2 = r5.A05
            X.5cS r1 = r5.A01
            r0 = 3
            r2.A00(r1, r3, r0)
            X.5YR r3 = r5.A02
            if (r3 == 0) goto L_0x0681
            X.1o6 r2 = r5.A0A
            X.9Ik r1 = X.C179549Ik.PRIMARY_ACTION
            r0 = 11389(0x2c7d, float:1.596E-41)
            r2.A00(r1, r3, r0)
        L_0x0681:
            r5.A06(r4)
            return
        L_0x0685:
            java.lang.String r0 = "waIntents"
            goto L_0x06a1
        L_0x0688:
            java.lang.String r0 = "activityUtils"
            goto L_0x06a1
        L_0x068b:
            X.AnonymousClass3MW.A1J()
            goto L_0x06a4
        L_0x068f:
            java.lang.Object r0 = r13.A01
            X.4Bx r0 = (X.AnonymousClass4Bx) r0
            java.lang.Object r6 = r13.A02
            X.1FB r6 = (X.AnonymousClass1FB) r6
            boolean r3 = X.C18070vi.A15(r0, r6)
            X.3Ut r2 = r0.A01
            if (r2 != 0) goto L_0x06a6
            java.lang.String r0 = "viewModel"
        L_0x06a1:
            X.C18070vi.A11(r0)
        L_0x06a4:
            r0 = 0
            throw r0
        L_0x06a6:
            X.10I r1 = r2.A0A
            X.1kk r8 = r2.A04
            X.1kb r7 = r2.A02
            X.1EC r0 = r2.A08
            java.util.Set r9 = X.C18070vi.A0P(r0)
            r0 = 2
            X.4fJ r5 = new X.4fJ
            r5.<init>(r2, r0)
            X.2PS r4 = new X.2PS
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1.CGD(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90074dU.onClick(android.view.View):void");
    }
}
