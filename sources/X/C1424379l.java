package X;

/* renamed from: X.79l  reason: invalid class name and case insensitive filesystem */
public class C1424379l implements C15930rR {
    public final int A00;
    public final Object A01;

    public C1424379l(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ca, code lost:
        r1 = r2.A0B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            r6 = r16
            if (r0 == 0) goto L_0x0259
            java.lang.Object r0 = r15.A01
            X.78S r0 = (X.AnonymousClass78S) r0
            r13 = 1
            X.C18070vi.A0d(r6, r13)
            java.lang.Object r1 = r0.A05
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r1
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            r8 = 0
            X.1FL r5 = r1.A1B()
            if (r5 == 0) goto L_0x0274
            java.util.List r4 = r1.A0w
            if (r4 == 0) goto L_0x0274
            int r0 = r1.A00
            java.lang.Object r7 = X.C29431cG.A0f(r4, r0)
            X.206 r7 = (X.AnonymousClass206) r7
            if (r7 == 0) goto L_0x0274
            X.70K r2 = r1.A2G(r7)
            com.whatsapp.jid.UserJid r9 = r1.A0N
            if (r9 == 0) goto L_0x0274
            boolean r0 = r1.A13
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r2 instanceof X.C120906Gm
            if (r0 == 0) goto L_0x00e8
            X.6Gm r2 = (X.C120906Gm) r2
            boolean r0 = r2.A0H
            if (r0 == 0) goto L_0x0274
            int r1 = r6.getItemId()
            r0 = 2131432588(0x7f0b148c, float:1.8486938E38)
            if (r1 != r0) goto L_0x0051
            X.6p9 r1 = r2.A0N
            X.206 r0 = r2.A07
            r1.A00(r0)
        L_0x004f:
            r4 = 1
            return r4
        L_0x0051:
            r0 = 2131432625(0x7f0b14b1, float:1.8487013E38)
            if (r1 != r0) goto L_0x0066
            X.6p9 r4 = r2.A0N
            X.206 r5 = r2.A07
            X.72B r0 = r2.A0C
            X.6R1 r6 = r0.A02(r8)
            r9 = 0
            r7 = 0
        L_0x0062:
            r4.A01(r5, r6, r7, r8, r9)
            goto L_0x004f
        L_0x0066:
            r0 = 2131432627(0x7f0b14b3, float:1.8487017E38)
            if (r1 != r0) goto L_0x007b
            X.6p9 r9 = r2.A0N
            X.206 r10 = r2.A07
            X.72B r0 = r2.A0C
            X.6R1 r11 = r0.A02(r8)
            r12 = 7
            r14 = r8
            r9.A01(r10, r11, r12, r13, r14)
            goto L_0x004f
        L_0x007b:
            r0 = 2131432628(0x7f0b14b4, float:1.8487019E38)
            if (r1 != r0) goto L_0x008d
            X.6p9 r4 = r2.A0N
            X.206 r5 = r2.A07
            X.72B r0 = r2.A0C
            X.6R1 r6 = r0.A02(r8)
            r9 = 1
            r7 = 7
            goto L_0x0062
        L_0x008d:
            r0 = 2131432582(0x7f0b1486, float:1.8486926E38)
            if (r1 != r0) goto L_0x00b3
            X.6p9 r1 = r2.A0N
            X.206 r0 = r2.A07
            X.C18070vi.A0d(r0, r8)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = r1.A02
            X.205 r2 = r0.A0v
            X.C18070vi.A0W(r2)
            com.whatsapp.status.StatusDeleteDialogFragment r1 = new com.whatsapp.status.StatusDeleteDialogFragment
            r1.<init>()
            android.os.Bundle r0 = X.C17880vN.A0D()
            X.AnonymousClass4aU.A0A(r0, r2)
            r1.A1R(r0)
            X.C137086ut.A01(r1, r3)
            goto L_0x004f
        L_0x00b3:
            r0 = 2131432630(0x7f0b14b6, float:1.8487023E38)
            if (r1 != r0) goto L_0x0274
            X.6p9 r0 = r2.A0N
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = r0.A02
            X.206 r0 = r0.A00
            X.70K r2 = r1.A2G(r0)
            boolean r0 = r2 instanceof X.C120906Gm
            if (r0 == 0) goto L_0x004f
            X.6Gm r2 = (X.C120906Gm) r2
            if (r2 == 0) goto L_0x004f
            X.6Gk r1 = r2.A0B
            X.6k8 r0 = r1.A0B
            if (r0 == 0) goto L_0x004f
            android.view.View r0 = r0.A02
            r0.setVisibility(r8)
            X.72l r0 = r1.A0A
            if (r0 == 0) goto L_0x00e0
            r1 = 8
            android.view.View r0 = r0.A06
            r0.setVisibility(r1)
        L_0x00e0:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A01
            r0 = 3
            r1.A0W(r0)
            goto L_0x004f
        L_0x00e8:
            int r6 = r6.getItemId()
            r2 = 262144(0x40000, double:1.295163E-318)
            boolean r14 = r7.A11(r2)
            r0 = 2131432573(0x7f0b147d, float:1.8486907E38)
            if (r6 != r0) goto L_0x010e
            X.205 r0 = r7.A0v
            java.lang.String r11 = r0.A01
            int r0 = r1.A00
            java.lang.Long r10 = X.C17880vN.A0n(r0)
            java.lang.String r12 = r1.A0v
            r13 = 0
            com.whatsapp.status.StatusConfirmUnmuteDialogFragment r0 = X.AnonymousClass6XU.A00(r9, r10, r11, r12, r13, r14)
        L_0x0109:
            X.C137086ut.A01(r0, r1)
            goto L_0x004f
        L_0x010e:
            r0 = 2131432563(0x7f0b1473, float:1.8486887E38)
            if (r6 != r0) goto L_0x0125
            X.205 r0 = r7.A0v
            java.lang.String r11 = r0.A01
            int r0 = r1.A00
            java.lang.Long r10 = X.C17880vN.A0n(r0)
            java.lang.String r12 = r1.A0v
            r13 = 0
            com.whatsapp.status.StatusConfirmMuteDialogFragment r0 = X.AnonymousClass6XT.A00(r9, r10, r11, r12, r13, r14)
            goto L_0x0109
        L_0x0125:
            r0 = 2131432576(0x7f0b1480, float:1.8486913E38)
            r3 = 22
            if (r6 != r0) goto L_0x0144
            X.00H r0 = r1.A0l
            if (r0 == 0) goto L_0x023d
            X.C72453Mb.A1P(r0)
            X.1M9 r0 = r1.A09
            if (r0 == 0) goto L_0x0240
            X.1E7 r2 = r0.A0H(r9)
            X.1VP r0 = r1.A07
            if (r0 == 0) goto L_0x0252
            r0.CNw(r5, r2, r3, r8)
            goto L_0x004f
        L_0x0144:
            r0 = 2131432575(0x7f0b147f, float:1.8486911E38)
            if (r6 != r0) goto L_0x0161
            X.00H r0 = r1.A0l
            if (r0 == 0) goto L_0x023d
            X.C72453Mb.A1P(r0)
            X.1M9 r0 = r1.A09
            if (r0 == 0) goto L_0x0240
            X.1E7 r2 = r0.A0H(r9)
            X.1VP r0 = r1.A07
            if (r0 == 0) goto L_0x0252
            r0.CNw(r5, r2, r3, r13)
            goto L_0x004f
        L_0x0161:
            r0 = 2131432552(0x7f0b1468, float:1.8486865E38)
            if (r6 != r0) goto L_0x0177
            X.6kV r2 = r1.A05
            if (r2 == 0) goto L_0x004f
            X.1M9 r0 = r1.A09
            if (r0 == 0) goto L_0x0240
            X.1E7 r0 = r0.A0H(r9)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A05(r0, r2, r1)
            goto L_0x004f
        L_0x0177:
            r0 = 2131432562(0x7f0b1472, float:1.8486885E38)
            if (r6 != r0) goto L_0x01ae
            X.00H r0 = r1.A0m
            if (r0 == 0) goto L_0x0246
            X.1LU r3 = X.C108945cZ.A0h(r0)
            android.content.Context r2 = r1.A14()
            com.whatsapp.jid.UserJid r0 = r1.A0N
            android.content.Intent r3 = r3.A1w(r2, r0, r8)
            X.C18070vi.A0X(r3)
            com.whatsapp.jid.UserJid r2 = r1.A0N
            if (r2 == 0) goto L_0x01a5
            X.1fA r0 = r1.A08
            if (r0 == 0) goto L_0x0243
            boolean r0 = r0.A0M(r2)
            if (r0 == 0) goto L_0x01a5
            java.lang.String r2 = "chatlockEntryPoint"
            r0 = 3
            r3.putExtra(r2, r0)
        L_0x01a5:
            X.11P r0 = r1.A2F()
            X.C137086ut.A00(r3, r1, r0)
            goto L_0x004f
        L_0x01ae:
            r0 = 2131432617(0x7f0b14a9, float:1.8486997E38)
            if (r6 != r0) goto L_0x01ec
            X.627 r2 = new X.627
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.A00 = r0
            X.18K r0 = r1.A0L
            if (r0 == 0) goto L_0x0249
            r0.CC7(r2)
            X.1cg r5 = X.C29671cg.A00
            X.1Lc r0 = r1.A2C()
            X.0ve r3 = r0.A01
            java.lang.String r0 = "status_post_report"
            X.6q6 r2 = new X.6q6
            r2.<init>(r3, r5, r0, r8)
            r2.A00 = r8
            r2.A05 = r13
            r2.A06 = r8
            r2.A01 = r9
            int r0 = r1.A00
            X.206 r0 = X.AnonymousClass3MW.A0k(r4, r0)
            X.205 r0 = r0.A0v
            r2.A02 = r0
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r2.A00()
            goto L_0x0109
        L_0x01ec:
            r0 = 2131432579(0x7f0b1483, float:1.848692E38)
            if (r6 != r0) goto L_0x004f
            X.11C r0 = r1.A02
            if (r0 == 0) goto L_0x024f
            android.content.ClipboardManager r7 = r0.A09()
            if (r7 == 0) goto L_0x004f
            java.util.ArrayList r6 = X.C29351c6.A0D(r4)
            java.util.Iterator r5 = r4.iterator()
        L_0x0203:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0222
            X.206 r0 = X.C17880vN.A0Y(r5)
            long r2 = r0.A0x
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            X.205 r0 = r0.A0v
            java.lang.String r0 = r0.A01
            X.C108975cc.A14(r4, r0)
            java.lang.String r0 = X.C17880vN.A0u(r4, r2)
            r6.add(r0)
            goto L_0x0203
        L_0x0222:
            java.lang.String r0 = ",\n"
            java.lang.String r0 = X.AnonymousClass1EG.A07(r0, r6)
            X.C18070vi.A0X(r0)
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)
            r7.setPrimaryClip(r0)
            X.1KB r1 = r1.A00
            if (r1 == 0) goto L_0x024c
            java.lang.String r0 = "Message ids copied"
            r1.A0G(r0, r8)
            goto L_0x004f
        L_0x023d:
            java.lang.String r0 = "voipUXResponsivenessLogger"
            goto L_0x0254
        L_0x0240:
            java.lang.String r0 = "contactManager"
            goto L_0x0254
        L_0x0243:
            java.lang.String r0 = "chatLockManager"
            goto L_0x0254
        L_0x0246:
            java.lang.String r0 = "waIntents"
            goto L_0x0254
        L_0x0249:
            java.lang.String r0 = "wamRuntime"
            goto L_0x0254
        L_0x024c:
            java.lang.String r0 = "globalUI"
            goto L_0x0254
        L_0x024f:
            java.lang.String r0 = "systemServices"
            goto L_0x0254
        L_0x0252:
            java.lang.String r0 = "callsManager"
        L_0x0254:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0259:
            java.lang.Object r3 = r15.A01
            com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet r3 = (com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet) r3
            r2 = 0
            int r1 = r6.getItemId()
            r4 = 1
            if (r1 == r4) goto L_0x0276
            r0 = 2
            if (r1 != r0) goto L_0x0274
            X.0vl r0 = r3.A0U
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel r0 = (com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel) r0
            r0.A0T(r2)
            return r4
        L_0x0274:
            r4 = 0
            return r4
        L_0x0276:
            X.0vl r0 = r3.A0U
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel r0 = (com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel) r0
            r0.A0T(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1424379l.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
