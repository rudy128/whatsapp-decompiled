package X;

import com.whatsapp.comments.MessageCommentsManager;

/* renamed from: X.7RL  reason: invalid class name */
public class AnonymousClass7RL implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7RL(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0396, code lost:
        r0.A0E(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0399, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0409, code lost:
        r0.A0E(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x040c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0626, code lost:
        if (r15 != false) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x096b, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x096e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0998, code lost:
        X.AnonymousClass4GT.A00(X.AnonymousClass1OR.A00, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x099d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0a14, code lost:
        r3.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0a17, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r4 = r33
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x04d3;
                case 1: goto L_0x04d3;
                case 2: goto L_0x04e1;
                case 3: goto L_0x0516;
                case 4: goto L_0x0522;
                case 5: goto L_0x052e;
                case 6: goto L_0x0037;
                case 7: goto L_0x0691;
                case 8: goto L_0x06b3;
                case 9: goto L_0x06eb;
                case 10: goto L_0x070c;
                case 11: goto L_0x0169;
                case 12: goto L_0x0718;
                case 13: goto L_0x0750;
                case 14: goto L_0x01d3;
                case 15: goto L_0x01f7;
                case 16: goto L_0x075c;
                case 17: goto L_0x07e2;
                case 18: goto L_0x076a;
                case 19: goto L_0x09f6;
                case 20: goto L_0x07b3;
                case 21: goto L_0x07c1;
                case 22: goto L_0x07cd;
                case 23: goto L_0x001c;
                case 24: goto L_0x021b;
                case 25: goto L_0x0231;
                case 26: goto L_0x0333;
                case 27: goto L_0x035d;
                case 28: goto L_0x037a;
                case 29: goto L_0x039a;
                case 30: goto L_0x03b7;
                case 31: goto L_0x03f1;
                case 32: goto L_0x0801;
                case 33: goto L_0x080d;
                case 34: goto L_0x0819;
                case 35: goto L_0x040d;
                case 36: goto L_0x0908;
                case 37: goto L_0x0438;
                case 38: goto L_0x0935;
                case 39: goto L_0x096f;
                case 40: goto L_0x097b;
                case 41: goto L_0x098a;
                case 42: goto L_0x099e;
                case 43: goto L_0x0007;
                case 44: goto L_0x0007;
                case 45: goto L_0x09b2;
                case 46: goto L_0x09cc;
                case 47: goto L_0x048c;
                case 48: goto L_0x04c0;
                case 49: goto L_0x09e2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A01
            X.1kb r0 = (X.C34511kb) r0
            java.lang.Object r2 = r4.A02
            X.00H r0 = r0.A0B
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 5
            X.AnonymousClass7KY.A00(r1, r2, r0)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r2 = r4.A01
            X.3VZ r2 = (X.AnonymousClass3VZ) r2
            java.lang.Object r1 = r4.A02
            X.1E2 r1 = (X.AnonymousClass1E2) r1
            X.C18070vi.A0h(r2, r1)
            X.1RL r0 = r2.A02
            java.lang.Boolean r3 = r0.A06(r1)
            if (r3 != 0) goto L_0x0033
            r0.A07(r1)
            return
        L_0x0033:
            X.1DT r0 = r2.A00
            goto L_0x0396
        L_0x0037:
            java.lang.Object r1 = r4.A01
            X.9l6 r1 = (X.C190529l6) r1
            java.lang.Object r11 = r4.A02
            X.9Bw r11 = (X.C178119Bw) r11
            java.lang.String r0 = "CallLogSyncManager/sendCallLogSync call log history sync sent"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1xI r1 = r1.A01
            X.1To r3 = r1.A01
            boolean r0 = r3.A0T()
            if (r0 == 0) goto L_0x001b
            X.11S r0 = r1.A00
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x001b
            X.00H r0 = r1.A02
            java.lang.Object r0 = r0.get()
            X.2lN r0 = (X.C58862lN) r0
            java.lang.String r4 = "call_log"
            X.2nY r2 = r0.A00(r4)
            X.8ms r2 = (X.C169778ms) r2
            if (r2 == 0) goto L_0x001b
            X.1RK r7 = r2.A02
            java.util.ArrayList r1 = r7.A06()
            boolean r0 = r1 instanceof java.util.Collection
            r6 = 1
            if (r0 == 0) goto L_0x0150
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0150
        L_0x0079:
            r8 = 0
        L_0x007a:
            java.util.ArrayList r1 = r7.A06()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0133
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0133
        L_0x0088:
            r7 = 0
        L_0x0089:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallLogSyncMutationHandler/shouldSendCallLogSyncMutation hasUwpCompanion = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " hasIosCompanion = "
            X.C17900vP.A0n(r0, r1, r7)
            if (r8 != 0) goto L_0x00aa
            X.0ve r5 = r2.A04
            r1 = 6646(0x19f6, float:9.313E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r5, r1)
            if (r0 < r6) goto L_0x001b
            if (r7 == 0) goto L_0x001b
        L_0x00aa:
            com.whatsapp.jid.DeviceJid r0 = r11.A02
            if (r0 == 0) goto L_0x001b
            com.whatsapp.jid.UserJid r6 = r0.userJid
            if (r6 == 0) goto L_0x001b
            X.11P r0 = r2.A01
            long r13 = X.AnonymousClass11P.A01(r0)
            X.2rJ r9 = X.C62382rJ.A03
            X.4cT r5 = r11.A04
            java.lang.String r0 = r5.A02
            java.lang.String r1 = X.C40811vJ.A09(r0)
            X.C18070vi.A0X(r1)
            boolean r0 = r5.A03
            r0 = r0 ^ 1
            X.9rf r8 = new X.9rf
            r8.<init>(r6, r1, r0)
            X.11S r7 = r2.A00
            r10 = 0
            X.8q4 r6 = new X.8q4
            r12 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.1Rs r1 = r2.A03
            r0 = 0
            java.util.ArrayList r5 = X.C26331Rs.A03(r1, r4, r0)
            int r4 = r5.size()
            X.0ve r2 = r2.A04
            r1 = 5267(0x1493, float:7.38E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            if (r4 >= r0) goto L_0x00fe
            X.0wS r5 = X.C18460wS.A00
        L_0x00f0:
            java.util.ArrayList r0 = X.C108965cb.A0s(r6)
            r0.addAll(r5)
            r3.A0N(r0)
            r3.A0I()
            return
        L_0x00fe:
            r0 = 6
            java.util.List r1 = X.C147027Rn.A00(r5, r0)
            r0 = 2
            java.util.List r0 = X.C29431cG.A0v(r1, r0)
            java.util.ArrayList r5 = X.C29351c6.A0D(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0110:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r2 = r4.next()
            X.8q4 r2 = (X.AnonymousClass8q4) r2
            long r0 = r2.A04
            X.2rJ r14 = X.C62382rJ.A02
            X.9rf r13 = r2.A00
            r16 = r10
            r17 = r10
            X.8q4 r11 = new X.8q4
            r12 = r7
            r15 = r10
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r5.add(r11)
            goto L_0x0110
        L_0x0133:
            java.util.Iterator r5 = r1.iterator()
        L_0x0137:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r5.next()
            X.4Zh r0 = (X.C88344Zh) r0
            X.2RG r1 = r0.A09
            X.2RG r0 = X.AnonymousClass2RG.IOS_PHONE
            if (r1 == r0) goto L_0x014d
            X.2RG r0 = X.AnonymousClass2RG.IPAD
            if (r1 != r0) goto L_0x0137
        L_0x014d:
            r7 = 1
            goto L_0x0089
        L_0x0150:
            java.util.Iterator r5 = r1.iterator()
        L_0x0154:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r5.next()
            X.4Zh r0 = (X.C88344Zh) r0
            X.2RG r1 = r0.A09
            X.2RG r0 = X.AnonymousClass2RG.UWP
            if (r1 != r0) goto L_0x0154
            r8 = 1
            goto L_0x007a
        L_0x0169:
            java.lang.Object r3 = r4.A01
            X.DRB r3 = (X.DRB) r3
            java.lang.Object r4 = r4.A02
            X.E8J r4 = (X.E8J) r4
            boolean r0 = r3.A0M
            if (r0 != 0) goto L_0x001b
            X.E8J r0 = r3.A05
            if (r0 == r4) goto L_0x001b
            r3.A05 = r4
            if (r4 == 0) goto L_0x01b8
            r0 = 22
            X.DVt r2 = new X.DVt
            r2.<init>((java.lang.Object) r3, (int) r0)
            android.os.Handler r1 = r3.A0A
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            java.lang.Object r0 = X.C24617CCd.A00(r1, r0, r2)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x01b4
            r1 = 23
            X.DVt r0 = new X.DVt
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.DRB.A02(r3, r0)
            java.lang.ref.WeakReference r0 = r3.A0L
            if (r0 == 0) goto L_0x01b4
            java.lang.ref.WeakReference r0 = r3.A0L
            r0.get()
            java.lang.ref.WeakReference r0 = r3.A0L
            java.lang.Object r2 = r0.get()
            int r1 = r3.A02
            int r0 = r3.A00
            r4.onSurfaceSizeChanged(r2, r1, r0)
        L_0x01b4:
            X.DRB.A04(r3)
            return
        L_0x01b8:
            java.lang.ref.WeakReference r0 = r3.A0L
            if (r0 == 0) goto L_0x01b4
            java.lang.ref.WeakReference r0 = r3.A0L
            java.lang.Object r0 = r0.get()
            r3.A0B(r0)
            java.lang.ref.WeakReference r0 = r3.A0L
            java.lang.Object r2 = r0.get()
            int r1 = r3.A02
            int r0 = r3.A00
            r3.A0D(r2, r1, r0)
            goto L_0x01b4
        L_0x01d3:
            java.lang.Object r2 = r4.A01
            com.whatsapp.calling.views.VoipCallFooter r2 = (com.whatsapp.calling.views.VoipCallFooter) r2
            java.lang.Object r0 = r4.A02
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x001b
            X.1Ty r0 = r2.A05
            X.AEW r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.A0W
            if (r0 == 0) goto L_0x001b
            X.1KB r3 = r2.A04
            r0 = 7
            X.7R9 r1 = new X.7R9
            r1.<init>((java.lang.Object) r2, (int) r0)
            goto L_0x0a14
        L_0x01f7:
            java.lang.Object r0 = r4.A02
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x01ff:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r2 = r3.next()
            java.io.File r2 = (java.io.File) r2
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x01ff
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CameraStateManager/cannot-delete-file "
            X.C17900vP.A0Z(r2, r0, r1)
            goto L_0x01ff
        L_0x021b:
            java.lang.Object r2 = r4.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.Object r1 = r4.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Ln r0 = r2.A10
            X.1E1 r1 = (X.AnonymousClass1E1) r1
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x001b
            r2.A4o(r0)
            return
        L_0x0231:
            java.lang.Object r0 = r4.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            java.lang.Object r5 = r4.A02
            java.util.List r5 = (java.util.List) r5
            X.3oR r4 = r0.A08
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.util.Set r1 = X.C29431cG.A12(r5)
            java.util.List r0 = r4.A0V()
            java.util.Set r0 = X.C29431cG.A12(r0)
            java.util.Set r11 = X.C41841x9.A06(r1, r0)
            java.util.Set r1 = X.C41841x9.A06(r0, r1)
            boolean r0 = X.C108945cZ.A1U(r1)
            if (r0 == 0) goto L_0x02c3
            X.00H r0 = r4.A09
            java.lang.Object r8 = r0.get()
            X.2to r8 = (X.C63862to) r8
            X.2Jo r6 = r4.A05
            java.util.List r9 = X.C29431cG.A0t(r1)
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.1M9 r0 = r8.A03
            X.1E7 r0 = r0.A0G(r6)
            if (r0 == 0) goto L_0x0318
            java.lang.String r0 = r0.A0O
        L_0x0275:
            java.lang.String r10 = "lid"
            boolean r7 = r0.equals(r10)
            boolean r3 = X.C63862to.A05(r9)
            X.0ve r2 = r8.A09
            r1 = 4509(0x119d, float:6.318E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r0, r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BroadcastListManager/addListParticipants adding to list: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; isCurrentAddressingModeLid="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; addingLidParticipant="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; lidAbPropEnabled="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ";  participants="
            X.C17900vP.A0Y(r9, r0, r1)
            if (r7 == 0) goto L_0x0302
            if (r2 == 0) goto L_0x02f8
            java.util.ArrayList r0 = X.C63862to.A01(r8, r9)
        L_0x02ba:
            X.126 r1 = r8.A0A
            java.util.ArrayList r0 = X.C29431cG.A0m(r0)
            r1.A0V(r6, r0)
        L_0x02c3:
            boolean r0 = X.C108945cZ.A1U(r11)
            if (r0 == 0) goto L_0x02e0
            X.00H r0 = r4.A09
            java.lang.Object r3 = r0.get()
            X.2to r3 = (X.C63862to) r3
            X.2Jo r2 = r4.A05
            java.util.ArrayList r1 = X.C17880vN.A10(r11)
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.126 r0 = r3.A0A
            r0.A0W(r2, r1)
        L_0x02e0:
            java.util.ArrayList r3 = X.C29351c6.A0D(r5)
            java.util.Iterator r2 = r5.iterator()
        L_0x02e8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x031c
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1M9 r0 = r4.A03
            X.AnonymousClass3MY.A1O(r0, r1, r3)
            goto L_0x02e8
        L_0x02f8:
            java.lang.String r0 = "pn"
            X.C63862to.A03(r8, r6, r0)
            java.util.List r0 = X.C63862to.A02(r9)
            goto L_0x02ba
        L_0x0302:
            if (r3 == 0) goto L_0x0313
            if (r2 == 0) goto L_0x030e
            X.C63862to.A03(r8, r6, r10)
            java.util.ArrayList r0 = X.C63862to.A01(r8, r9)
            goto L_0x02ba
        L_0x030e:
            java.util.List r0 = X.C63862to.A02(r9)
            goto L_0x02ba
        L_0x0313:
            java.util.List r0 = X.C29431cG.A0t(r9)
            goto L_0x02ba
        L_0x0318:
            java.lang.String r0 = "pn"
            goto L_0x0275
        L_0x031c:
            X.1vp r0 = r4.A06
            r0.A0E(r3)
            X.0zA r1 = r4.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x001b
            r1.A03()
            java.lang.String r0 = "notifyBroadCastListParticipantUpdated"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r0)
            throw r1
        L_0x0333:
            java.lang.Object r5 = r4.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r5 = (com.whatsapp.chatinfo.ListChatInfoActivity) r5
            java.lang.Object r3 = r4.A02
            X.1E9 r3 = (X.AnonymousClass1E9) r3
            X.0ve r2 = r5.A0E
            r1 = 1071(0x42f, float:1.501E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001b
            X.1MZ r0 = r5.A0J
            boolean r0 = r0.A0M(r3)
            if (r0 != 0) goto L_0x001b
            X.00H r0 = r5.A0Y
            java.lang.Object r2 = r0.get()
            X.1nr r2 = (X.C36421nr) r2
            r1 = 5
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x035d:
            java.lang.Object r1 = r4.A01
            X.49f r1 = (X.C826549f) r1
            java.lang.Object r3 = r4.A02
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            boolean r0 = X.C108945cZ.A1T(r1)
            if (r0 != 0) goto L_0x001b
            java.lang.ref.WeakReference r0 = r1.A0C
            java.lang.Object r0 = r0.get()
            X.3Ua r0 = (X.AnonymousClass3Ua) r0
            if (r0 == 0) goto L_0x001b
            X.1DT r0 = r0.A0C
            goto L_0x0396
        L_0x037a:
            java.lang.Object r1 = r4.A01
            X.49f r1 = (X.C826549f) r1
            java.lang.Object r3 = r4.A02
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            boolean r0 = X.C108945cZ.A1T(r1)
            if (r0 != 0) goto L_0x001b
            java.lang.ref.WeakReference r0 = r1.A0C
            java.lang.Object r0 = r0.get()
            X.3Ua r0 = (X.AnonymousClass3Ua) r0
            if (r0 == 0) goto L_0x001b
            X.1DT r0 = r0.A08
        L_0x0396:
            r0.A0E(r3)
            return
        L_0x039a:
            java.lang.Object r2 = r4.A01
            X.2Cb r2 = (X.C45892Cb) r2
            java.lang.Object r3 = r4.A02
            java.lang.ref.WeakReference r0 = r2.A09
            java.lang.Object r1 = r0.get()
            X.3oT r1 = (X.C76813oT) r1
            if (r1 == 0) goto L_0x001b
            boolean r0 = X.C108945cZ.A1T(r2)
            if (r0 != 0) goto L_0x001b
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1DT r0 = r1.A0H
            goto L_0x0409
        L_0x03b7:
            java.lang.Object r1 = r4.A01
            X.2Cb r1 = (X.C45892Cb) r1
            java.lang.Object r5 = r4.A02
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.ref.WeakReference r0 = r1.A09
            java.lang.Object r4 = r0.get()
            X.3oT r4 = (X.C76813oT) r4
            if (r4 == 0) goto L_0x001b
            boolean r0 = X.C108945cZ.A1T(r1)
            if (r0 != 0) goto L_0x001b
            X.1E7 r0 = r4.A02
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MZ.A0x(r0)
            X.0ve r2 = r4.A0R
            r1 = 9156(0x23c4, float:1.283E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x09f0
            if (r3 == 0) goto L_0x09f0
            X.1OX r2 = X.C41561wd.A00(r4)
            r1 = 0
            com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$setAvatarCoinFlip$1 r0 = new com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$setAvatarCoinFlip$1
            r0.<init>(r5, r4, r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x03f1:
            java.lang.Object r2 = r4.A01
            X.2Cb r2 = (X.C45892Cb) r2
            java.lang.Object r3 = r4.A02
            java.lang.ref.WeakReference r0 = r2.A09
            java.lang.Object r1 = r0.get()
            X.3oT r1 = (X.C76813oT) r1
            if (r1 == 0) goto L_0x001b
            boolean r0 = X.C108945cZ.A1T(r2)
            if (r0 != 0) goto L_0x001b
            X.1DT r0 = r1.A0G
        L_0x0409:
            r0.A0E(r3)
            return
        L_0x040d:
            java.lang.Object r5 = r4.A01
            X.1fA r5 = (X.C31191fA) r5
            java.lang.Object r3 = r4.A02
            X.00H r0 = r5.A0F
            java.lang.Object r0 = r0.get()
            X.1MQ r0 = (X.AnonymousClass1MQ) r0
            X.10w r0 = r0.A04()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x001b
            X.00H r0 = r5.A0G
            java.lang.Object r2 = r0.get()
            X.11A r2 = (X.AnonymousClass11A) r2
            r1 = 36
            X.7RL r0 = new X.7RL
            r0.<init>(r3, r5, r1)
            r2.A00(r0)
            return
        L_0x0438:
            java.lang.Object r3 = r4.A01
            X.1fA r3 = (X.C31191fA) r3
            java.lang.Object r2 = r4.A02
            X.4EF r2 = (X.AnonymousClass4EF) r2
            boolean r0 = r2 instanceof X.C76863oY
            if (r0 == 0) goto L_0x046d
            X.3oY r2 = (X.C76863oY) r2
            java.util.Collection r0 = r2.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x044c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1CJ r0 = r3.A05
            X.1ci r1 = r0.A0A(r1)
            if (r1 == 0) goto L_0x044c
            r0 = 0
            r1.A0l = r0
            X.00H r0 = r3.A0C
            java.lang.Object r0 = r0.get()
            X.1LW r0 = (X.AnonymousClass1LW) r0
            r0.A06(r1)
            goto L_0x044c
        L_0x046d:
            boolean r0 = r2 instanceof X.C76853oX
            if (r0 == 0) goto L_0x001b
            X.1CJ r1 = r3.A05
            X.3oX r2 = (X.C76853oX) r2
            X.1BI r0 = r2.A00
            X.1ci r1 = r1.A0A(r0)
            if (r1 == 0) goto L_0x001b
            r0 = 0
            r1.A0l = r0
            X.00H r0 = r3.A0C
            java.lang.Object r0 = r0.get()
            X.1LW r0 = (X.AnonymousClass1LW) r0
            r0.A06(r1)
            return
        L_0x048c:
            java.lang.Object r0 = r4.A01
            com.whatsapp.community.CommunityExitDialogFragment r0 = (com.whatsapp.community.CommunityExitDialogFragment) r0
            java.lang.Object r4 = r4.A02
            java.util.List r4 = (java.util.List) r4
            X.00H r0 = r0.A0F
            java.lang.Object r3 = r0.get()
            X.6mk r3 = (X.C132416mk) r3
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.0ve r2 = r3.A01
            r1 = 5245(0x147d, float:7.35E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001b
            java.util.Iterator r1 = r4.iterator()
        L_0x04b0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            X.1EC r0 = (X.AnonymousClass1EC) r0
            r3.A00(r0)
            goto L_0x04b0
        L_0x04c0:
            java.lang.Object r0 = r4.A01
            com.whatsapp.community.CommunityFragment r0 = (com.whatsapp.community.CommunityFragment) r0
            java.lang.Object r2 = r4.A02
            java.util.List r2 = (java.util.List) r2
            X.1ue r0 = r0.A05
            if (r0 == 0) goto L_0x001b
            X.1uh r1 = r0.A00
            r0 = 0
            r1.A00(r0, r2)
            return
        L_0x04d3:
            java.lang.Object r0 = r4.A01
            X.A99 r0 = (X.A99) r0
            java.lang.Object r1 = r4.A02
            X.9Bw r1 = (X.C178119Bw) r1
            X.1TD r0 = r0.A2j
            r0.A0B(r1)
            return
        L_0x04e1:
            java.lang.Object r1 = r4.A01
            X.A99 r1 = (X.A99) r1
            java.lang.Object r0 = r4.A02
            X.9ah r0 = (X.C184279ah) r0
            X.1TD r4 = r1.A2j
            java.lang.String r0 = r0.A01
            monitor-enter(r4)
            java.lang.String r2 = X.C40811vJ.A0A(r0)     // Catch:{ all -> 0x0513 }
            r1 = 2
            X.1TB r0 = r4.A04     // Catch:{ all -> 0x0513 }
            X.9Bw r3 = r0.A06(r2)     // Catch:{ all -> 0x0513 }
            if (r3 == 0) goto L_0x0511
            r3.A0E(r1)     // Catch:{ all -> 0x0513 }
            X.1TE r0 = r4.A00     // Catch:{ all -> 0x0513 }
            r0.A00(r3)     // Catch:{ all -> 0x0513 }
            X.1Q2 r0 = r4.A07     // Catch:{ all -> 0x0513 }
            android.os.Handler r2 = r0.A02     // Catch:{ all -> 0x0513 }
            r1 = 46
            X.3Bw r0 = new X.3Bw     // Catch:{ all -> 0x0513 }
            r0.<init>(r4, r3, r1)     // Catch:{ all -> 0x0513 }
            r2.post(r0)     // Catch:{ all -> 0x0513 }
        L_0x0511:
            monitor-exit(r4)
            return
        L_0x0513:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0516:
            java.lang.Object r1 = r4.A01
            com.whatsapp.voipcalling.Voip$RecordingInfo[] r1 = (com.whatsapp.voipcalling.Voip.RecordingInfo[]) r1
            java.lang.Object r0 = r4.A02
            com.whatsapp.voipcalling.Voip$DebugTapType r0 = (com.whatsapp.voipcalling.Voip.DebugTapType) r0
            com.whatsapp.calling.service.VoiceServiceEventCallback.lambda$callCaptureEnded$3(r1, r0)
            return
        L_0x0522:
            java.lang.Object r1 = r4.A01
            X.9xI r1 = (X.C197809xI) r1
            java.lang.Object r0 = r4.A02
            X.9X9 r0 = (X.AnonymousClass9X9) r0
            X.C197809xI.A00(r0, r1)
            return
        L_0x052e:
            java.lang.Object r0 = r4.A01
            com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r0 = (com.whatsapp.calling.spam.CallSpamActivity.ReportSpamOrBlockDialogFragment) r0
            java.lang.Object r2 = r4.A02
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r3 = r0.A0M
            r1 = 1
            if (r3 == 0) goto L_0x0628
            android.widget.CheckBox r3 = r0.A01
            if (r3 == 0) goto L_0x067c
            boolean r3 = r3.isChecked()
            if (r3 == 0) goto L_0x067c
            X.00H r3 = r0.A0H
            java.lang.Object r6 = r3.get()
            X.2pt r6 = (X.C61562pt) r6
            java.lang.String r5 = r0.A0K
            com.whatsapp.jid.UserJid r4 = r0.A0A
            X.C108975cc.A12(r5, r4, r1)
            r3 = 3
            X.C61562pt.A00(r6, r4, r5, r3)
            r15 = 1
        L_0x0559:
            X.6hQ r5 = r0.A0C
            com.whatsapp.jid.UserJid r7 = r0.A0A
            com.whatsapp.jid.UserJid r9 = r0.A09
            java.lang.String r8 = r0.A0I
            long r12 = r0.A00
            boolean r11 = r0.A0L
            java.lang.String r6 = r0.A0J
            boolean r3 = r0.A0N
            if (r3 == 0) goto L_0x0678
            java.lang.String r24 = "video"
        L_0x056d:
            java.lang.String r30 = "call_spam_dialog_report"
            X.C17960vV.A00()
            X.11S r3 = r5.A00
            com.whatsapp.jid.PhoneUserJid r4 = X.AnonymousClass11S.A00(r3)
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r3 = "SpamXmppMethods/sendSpamCallReport; callerJid="
            r10.append(r3)
            r10.append(r7)
            java.lang.String r3 = "; calleeJid="
            r10.append(r3)
            r10.append(r4)
            java.lang.String r3 = "; callId="
            r10.append(r3)
            r10.append(r8)
            java.lang.String r3 = "; creatorJid="
            X.C17900vP.A0Y(r9, r3, r10)
            if (r7 == 0) goto L_0x0672
            if (r4 == 0) goto L_0x0672
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x0672
            if (r6 == 0) goto L_0x0672
            X.00H r14 = r5.A02
            java.lang.String r29 = X.C17890vO.A0T(r14)
            X.00H r3 = r5.A03
            java.lang.Object r10 = r3.get()
            X.6iP r10 = (X.C129816iP) r10
            r3 = 4
            X.C18070vi.A0d(r8, r3)
            X.00H r3 = r10.A00
            java.lang.Object r3 = r3.get()
            X.6eo r3 = (X.C127716eo) r3
            r19 = r7
            if (r11 == 0) goto L_0x05c5
            r19 = r4
        L_0x05c5:
            r20 = 0
            if (r9 == 0) goto L_0x05cb
            r20 = r7
        L_0x05cb:
            r27 = 0
            X.9Ea r16 = new X.9Ea
            r25 = r12
            r21 = r9
            r22 = r8
            r23 = r6
            r18 = r7
            r17 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.00H r4 = r3.A00
            java.lang.Object r4 = r4.get()
            X.9oB r4 = (X.C192329oB) r4
            X.0wS r31 = X.C18460wS.A00
            java.util.List r32 = X.C18070vi.A0M(r16)
            X.00H r3 = r3.A01
            java.lang.Object r3 = r3.get()
            X.A2P r3 = (X.A2P) r3
            X.9Eh r28 = r3.A02(r7)
            r26 = r4
            X.9F7 r3 = r26.A01(r27, r28, r29, r30, r31, r32)
            java.lang.Object r6 = r3.A00
            X.1ca r6 = (X.C29621ca) r6
            X.1OZ r26 = X.C17880vN.A0U(r14)
            r4 = 4
            X.36y r3 = new X.36y
            r3.<init>(r5, r4)
            r30 = 104(0x68, float:1.46E-43)
            r31 = 32000(0x7d00, double:1.581E-319)
            r27 = r3
            r28 = r6
            r26.A0N(r27, r28, r29, r30, r31)
        L_0x0617:
            X.00H r3 = r0.A0G
            java.lang.Object r5 = r3.get()
            X.2qh r5 = (X.C62042qh) r5
            com.whatsapp.jid.UserJid r4 = r0.A0A
            X.1E7 r3 = r0.A08
            r5.A01(r3, r4)
            if (r15 == 0) goto L_0x0655
        L_0x0628:
            boolean r3 = r0.A0M
            if (r3 != 0) goto L_0x063e
            X.00H r3 = r0.A0E
            java.lang.Object r5 = r3.get()
            X.2ps r5 = (X.C61552ps) r5
            java.lang.String r4 = r0.A0K
            com.whatsapp.jid.UserJid r3 = r0.A0A
            X.C108975cc.A12(r4, r3, r1)
            X.C61552ps.A00(r5, r3, r4, r1)
        L_0x063e:
            X.00H r3 = r0.A0F
            X.1pj r6 = X.AnonymousClass3MW.A0V(r3)
            com.whatsapp.jid.UserJid r5 = r0.A0A
            java.lang.String r4 = r0.A0K
            X.1E7 r3 = r0.A08
            r10 = 0
            r12 = r10
            r13 = r10
            r7 = r2
            r8 = r3
            r9 = r5
            r11 = r10
            r14 = r4
            r6.A0G(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0655:
            X.1hl r4 = r0.A06
            com.whatsapp.jid.UserJid r3 = r0.A0A
            r6 = 3
            r10 = 0
            r9 = r1
            r5 = r3
            r7 = r6
            r8 = r1
            r4.A00(r5, r6, r7, r8, r9, r10)
            X.1gx r3 = r0.A0B
            r3.A08()
            X.122 r3 = r0.A07
            com.whatsapp.jid.UserJid r0 = r0.A0A
            r3.BIE(r0, r1)
            r2.finish()
            return
        L_0x0672:
            java.lang.String r3 = "SpamXmppMethods/sendSpamCallReport; invalid request, missing fields; skipping..."
            com.whatsapp.util.Log.i((java.lang.String) r3)
            goto L_0x0617
        L_0x0678:
            java.lang.String r24 = "audio"
            goto L_0x056d
        L_0x067c:
            X.00H r3 = r0.A0H
            java.lang.Object r5 = r3.get()
            X.2pt r5 = (X.C61562pt) r5
            java.lang.String r4 = r0.A0K
            com.whatsapp.jid.UserJid r3 = r0.A0A
            X.C108975cc.A12(r4, r3, r1)
            X.C61562pt.A00(r5, r3, r4, r1)
            r15 = 0
            goto L_0x0559
        L_0x0691:
            java.lang.Object r2 = r4.A01
            java.util.concurrent.Exchanger r2 = (java.util.concurrent.Exchanger) r2
            java.lang.Object r1 = r4.A02
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.lang.Object r0 = r1.call()     // Catch:{ Exception -> 0x06ac }
            r2.exchange(r0)     // Catch:{ InterruptedException -> 0x06a5 }
            return
        L_0x06a5:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x06ac:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x06b3:
            java.lang.Object r5 = r4.A01
            X.6x3 r5 = (X.C138426x3) r5
            java.lang.Object r4 = r4.A02
            X.9Bw r4 = (X.C178119Bw) r4
            X.C138426x3.A00(r5)
            java.util.Set r0 = r5.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x06d5
            X.0z4 r0 = r5.A01
            long r2 = r4.A01()
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "first_unseen_joinable_call"
            X.C17880vN.A1D(r1, r0, r2)
        L_0x06d5:
            X.4cT r0 = r4.A04
            java.lang.String r0 = r0.A02
            java.lang.String r1 = X.C40811vJ.A09(r0)
            monitor-enter(r5)
            java.util.Set r0 = r5.A00     // Catch:{ all -> 0x06e8 }
            r0.add(r1)     // Catch:{ all -> 0x06e8 }
            monitor-exit(r5)     // Catch:{ all -> 0x06e8 }
            X.1NN r0 = r5.A02
            goto L_0x096b
        L_0x06e8:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x06e8 }
            throw r1
        L_0x06eb:
            java.lang.Object r2 = r4.A01
            X.6x3 r2 = (X.C138426x3) r2
            java.lang.Object r0 = r4.A02
            X.9Bw r0 = (X.C178119Bw) r0
            X.C138426x3.A00(r2)
            X.4cT r0 = r0.A04
            java.lang.String r0 = r0.A02
            java.lang.String r1 = X.C40811vJ.A09(r0)
            monitor-enter(r2)
            java.util.Set r0 = r2.A00     // Catch:{ all -> 0x0709 }
            r0.remove(r1)     // Catch:{ all -> 0x0709 }
            monitor-exit(r2)     // Catch:{ all -> 0x0709 }
            X.1NN r0 = r2.A02
            goto L_0x096b
        L_0x0709:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0709 }
            throw r1
        L_0x070c:
            java.lang.Object r1 = r4.A01
            com.whatsapp.calling.vcoverscroll.view.VCMiniPlayerView r1 = (com.whatsapp.calling.vcoverscroll.view.VCMiniPlayerView) r1
            java.lang.Object r0 = r4.A02
            X.3ne r0 = (X.C76603ne) r0
            com.whatsapp.calling.vcoverscroll.view.VCMiniPlayerView.A00(r0, r1)
            return
        L_0x0718:
            java.lang.Object r1 = r4.A01
            X.AfC r1 = (X.C21141AfC) r1
            java.lang.Object r2 = r4.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.util.concurrent.ConcurrentHashMap r0 = r1.A09
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L_0x0737
            X.1HQ r0 = r1.A04
            X.1HR r0 = (X.AnonymousClass1HR) r0
            boolean r0 = X.AnonymousClass1HR.A00(r0)
            if (r0 == 0) goto L_0x0748
            java.lang.String r0 = "VoipNative/stopVideoRenderStream skipping as call ended or ending"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0737:
            X.1HQ r0 = r1.A04
            r1 = 0
            X.1HR r0 = (X.AnonymousClass1HR) r0
            boolean r0 = X.AnonymousClass1HR.A00(r0)
            if (r0 == 0) goto L_0x074c
            java.lang.String r0 = "VoipNative/setVideoDisplayPort skipping as call ended or ending"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0748:
            com.whatsapp.voipcalling.Voip.stopVideoRenderStream(r2)
            goto L_0x0737
        L_0x074c:
            com.whatsapp.voipcalling.Voip.setVideoDisplayPort(r2, r1)
            return
        L_0x0750:
            java.lang.Object r1 = r4.A01
            X.AfC r1 = (X.C21141AfC) r1
            java.lang.Object r0 = r4.A02
            X.DRB r0 = (X.DRB) r0
            X.C21141AfC.A02(r0, r1)
            return
        L_0x075c:
            java.lang.Object r3 = r4.A01
            X.7DY r3 = (X.AnonymousClass7DY) r3
            java.lang.Object r2 = r4.A02
            X.7Gz r2 = (X.C144357Gz) r2
            r1 = 1
            r0 = 0
            X.AnonymousClass7DY.A0T(r3, r2, r0, r1)
            return
        L_0x076a:
            java.lang.Object r3 = r4.A01
            X.Bq6 r3 = (X.Bq6) r3
            java.lang.Object r1 = r4.A02
            android.view.SurfaceHolder r1 = (android.view.SurfaceHolder) r1
            monitor-enter(r3)
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x07b0 }
            if (r0 == 0) goto L_0x07ae
            r2 = 0
            boolean r0 = r1.isCreating()     // Catch:{ RuntimeException -> 0x079d, IOException -> 0x078f }
            if (r0 != 0) goto L_0x0786
            android.hardware.Camera r0 = r3.A07     // Catch:{ RuntimeException -> 0x079d, IOException -> 0x078f }
            r0.stopPreview()     // Catch:{ RuntimeException -> 0x079d, IOException -> 0x078f }
            r0 = 0
            r3.A0M = r0     // Catch:{ RuntimeException -> 0x079d, IOException -> 0x078f }
        L_0x0786:
            android.hardware.Camera r0 = r3.A07     // Catch:{ RuntimeException -> 0x079d, IOException -> 0x078f }
            r0.setPreviewDisplay(r1)     // Catch:{ RuntimeException -> 0x079d, IOException -> 0x078f }
            X.Bq6.A07(r3)     // Catch:{ RuntimeException -> 0x079d, IOException -> 0x078f }
            goto L_0x07ae
        L_0x078f:
            r1 = move-exception
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x07b0 }
            r0.release()     // Catch:{ all -> 0x07b0 }
            r3.A07 = r2     // Catch:{ all -> 0x07b0 }
            java.lang.String r0 = "cameraview/restart-preview: error setting preview display"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x07b0 }
            goto L_0x07aa
        L_0x079d:
            r1 = move-exception
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x07b0 }
            r0.release()     // Catch:{ all -> 0x07b0 }
            r3.A07 = r2     // Catch:{ all -> 0x07b0 }
            java.lang.String r0 = "cameraview/restart-preview "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x07b0 }
        L_0x07aa:
            r0 = 1
            X.Bq6.A09(r3, r1, r0)     // Catch:{ all -> 0x07b0 }
        L_0x07ae:
            monitor-exit(r3)
            return
        L_0x07b0:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x07b3:
            java.lang.Object r1 = r4.A01
            X.5lB r1 = (X.C112255lB) r1
            java.lang.Object r0 = r4.A02
            X.8Ah r0 = (X.C160878Ah) r0
            r1.A00 = r0
            r1.notifyDataSetChanged()
            return
        L_0x07c1:
            java.lang.Object r1 = r4.A01
            X.ECo r1 = (X.C28654ECo) r1
            java.lang.Object r0 = r4.A02
            byte[] r0 = (byte[]) r0
            r1.C0X(r0)
            return
        L_0x07cd:
            java.lang.Object r0 = r4.A01
            com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel r0 = (com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel) r0
            java.lang.Object r3 = r4.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.9oc r2 = r0.A01
            X.B0d r1 = new X.B0d
            r1.<init>(r0, r3)
            java.lang.String r0 = "catalog_category_dummy_root_id"
            r2.A00(r3, r0, r1)
            return
        L_0x07e2:
            java.lang.Object r0 = r4.A02
            X.7DY r0 = (X.AnonymousClass7DY) r0
            X.8Av r0 = r0.A0K
            r1 = 0
            if (r0 != 0) goto L_0x07f1
            java.lang.String r0 = "camera"
            X.C18070vi.A11(r0)
            throw r1
        L_0x07f1:
            r0.setCameraSwitchedCallback(r1)
            java.lang.Object r2 = r4.A01
            android.animation.Animator r2 = (android.animation.Animator) r2
            r0 = 300(0x12c, double:1.48E-321)
            r2.setStartDelay(r0)
            r2.start()
            return
        L_0x0801:
            java.lang.Object r1 = r4.A01
            X.4Xo r1 = (X.C87914Xo) r1
            java.lang.Object r0 = r4.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.C87914Xo.A00(r1, r0)
            return
        L_0x080d:
            java.lang.Object r1 = r4.A01
            X.4R5 r1 = (X.AnonymousClass4R5) r1
            java.lang.Object r0 = r4.A02
            X.1FL r0 = (X.AnonymousClass1FL) r0
            r1.A00(r0)
            return
        L_0x0819:
            java.lang.Object r10 = r4.A01
            X.1fA r10 = (X.C31191fA) r10
            java.lang.Object r12 = r4.A02
            r0 = 1
            X.C18070vi.A0d(r12, r0)
            X.00H r0 = r10.A08
            java.lang.Object r5 = r0.get()
            X.7Fa r5 = (X.C143847Fa) r5
            X.1RK r0 = r5.A00
            java.util.ArrayList r0 = r0.A07()
            java.util.ArrayList r3 = X.C29351c6.A0E(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0839:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x084f
            java.lang.Object r0 = r1.next()
            X.4Zh r0 = (X.C88344Zh) r0
            com.whatsapp.jid.DeviceJid r0 = r0.A08
            java.lang.String r0 = r0.getRawStringWithNoAgent()
            r3.add(r0)
            goto L_0x0839
        L_0x084f:
            int r0 = X.C72483Me.A07(r3)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L_0x085c:
            boolean r0 = r1.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x086b
            java.lang.Object r0 = r1.next()
            X.C17880vN.A1P(r0, r2, r4)
            goto L_0x085c
        L_0x086b:
            java.util.LinkedHashMap r8 = X.AnonymousClass1D7.A08(r2)
            X.00H r0 = r5.A01
            java.lang.Object r0 = r0.get()
            X.6lG r0 = (X.C131536lG) r0
            X.00H r7 = r0.A00
            java.lang.Object r0 = r7.get()
            X.COS r0 = (X.COS) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r2 = X.C17880vN.A0C(r0)
            java.lang.String r1 = "registered_devices"
            X.1Om r0 = X.C25511Om.A00
            java.util.Set r1 = r2.getStringSet(r1, r0)
            if (r1 != 0) goto L_0x0890
            r1 = r0
        L_0x0890:
            int r0 = X.C200510q.A00(r1)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            java.util.Iterator r9 = r1.iterator()
        L_0x089d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x08cb
            java.lang.Object r5 = r9.next()
            r3 = r5
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r7.get()
            X.COS r0 = (X.COS) r0
            X.C18070vi.A0d(r3, r4)
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r2 = X.C17880vN.A0C(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "chat_lock_support_level:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            int r0 = r2.getInt(r0, r4)
            X.C17880vN.A1P(r5, r6, r0)
            goto L_0x089d
        L_0x08cb:
            r8.putAll(r6)
            java.util.Iterator r2 = X.C17890vO.A0l(r8)
            r1 = 2
        L_0x08d3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08e6
            int r0 = X.C72453Mb.A0H(r2)
            int r1 = java.lang.Math.min(r1, r0)
            int r4 = java.lang.Math.max(r4, r0)
            goto L_0x08d3
        L_0x08e6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r0, r4)
            int r11 = X.AnonymousClass3MZ.A04(r0)
            int r13 = X.C108955ca.A09(r0)
            X.00H r0 = r10.A0G
            java.lang.Object r0 = r0.get()
            X.11A r0 = (X.AnonymousClass11A) r0
            r14 = 2
            X.3Cq r9 = new X.3Cq
            r9.<init>((java.lang.Object) r10, (int) r11, (java.lang.Object) r12, (int) r13, (int) r14)
            r0.A00(r9)
            return
        L_0x0908:
            java.lang.Object r5 = r4.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r4.A02
            r1 = 0
            X.3Ri r3 = X.C73193Ri.A00(r5)
            r0 = 2131888146(0x7f120812, float:1.941092E38)
            r3.A0V(r0)
            r0 = 2131888166(0x7f120826, float:1.941096E38)
            r3.A0U(r0)
            r0 = 2131888260(0x7f120884, float:1.941115E38)
            r3.A0X(r1, r0)
            r2 = 2131888158(0x7f12081e, float:1.9410943E38)
            r1 = 0
            X.74v r0 = new X.74v
            r0.<init>(r5, r4, r1)
            r3.A0W(r0, r2)
            X.AnonymousClass3MY.A1G(r3)
            return
        L_0x0935:
            java.lang.Object r7 = r4.A01
            X.1fA r7 = (X.C31191fA) r7
            java.lang.Object r6 = r4.A02
            X.1BI r6 = (X.AnonymousClass1BI) r6
            X.00H r5 = r7.A0J
            java.lang.Object r4 = r5.get()
            X.1To r4 = (X.C26811To) r4
            r3 = 0
            r7.A0G(r6, r3)
            X.0vp r0 = r7.A0M
            java.lang.Object r2 = r0.get()
            X.121 r2 = (X.AnonymousClass121) r2
            r1 = 0
            r0 = 1
            r2.BEq(r6, r1, r3, r0)
            java.lang.Object r0 = r5.get()
            X.1To r0 = (X.C26811To) r0
            java.util.Set r0 = r0.A08(r6, r3)
            r4.A0R(r0)
            X.00H r0 = r7.A0E
            java.lang.Object r0 = r0.get()
            X.1NN r0 = (X.AnonymousClass1NN) r0
        L_0x096b:
            r0.A00()
            return
        L_0x096f:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r4.A02
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            r1.dispatchTouchEvent(r0)
            return
        L_0x097b:
            java.lang.Object r2 = r4.A01
            com.whatsapp.comments.MessageCommentsManager r2 = (com.whatsapp.comments.MessageCommentsManager) r2
            java.lang.Object r1 = r4.A02
            X.206 r1 = (X.AnonymousClass206) r1
            r0 = 0
            com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1 r3 = new com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1
            r3.<init>(r2, r1, r0, r0)
            goto L_0x0998
        L_0x098a:
            java.lang.Object r2 = r4.A01
            com.whatsapp.comments.MessageCommentsManager r2 = (com.whatsapp.comments.MessageCommentsManager) r2
            java.lang.Object r1 = r4.A02
            X.206 r1 = (X.AnonymousClass206) r1
            r0 = 0
            com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessageAsync$1$1 r3 = new com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessageAsync$1$1
            r3.<init>(r2, r1, r0, r0)
        L_0x0998:
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.AnonymousClass4GT.A00(r0, r3)
            return
        L_0x099e:
            java.lang.Object r1 = r4.A01
            X.30r r1 = (X.C677430r) r1
            java.lang.Object r2 = r4.A02
            java.util.Collection r2 = (java.util.Collection) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.1Lg r1 = r1.A00
            r0 = 39
            r1.A04(r2, r0)
            return
        L_0x09b2:
            java.lang.Object r0 = r4.A01
            X.1kb r0 = (X.C34511kb) r0
            java.lang.Object r1 = r4.A02
            X.1ci r1 = (X.C29691ci) r1
            X.00H r0 = r0.A0B
            X.10T r2 = X.C17880vN.A0V(r0)
            X.1BI r1 = r1.A08()
            X.C18070vi.A0X(r1)
            r0 = 6
            X.AnonymousClass7KY.A00(r2, r1, r0)
            return
        L_0x09cc:
            java.lang.Object r0 = r4.A01
            com.whatsapp.community.CommunityExitDialogFragment r0 = (com.whatsapp.community.CommunityExitDialogFragment) r0
            java.lang.Object r3 = r4.A02
            java.util.List r3 = (java.util.List) r3
            X.1Co r2 = r0.A07
            java.lang.Integer r1 = X.C17880vN.A0j()
            r0 = 1
            r2.A0A(r1, r3, r0)
            r2.A04(r3)
            return
        L_0x09e2:
            java.lang.Object r0 = r4.A01
            com.whatsapp.community.CommunityHomeActivity r0 = (com.whatsapp.community.CommunityHomeActivity) r0
            java.lang.Object r1 = r4.A02
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.whatsapp.community.CommunityMembersViewModel r0 = r0.A0Q
            r0.A0T(r1)
            return
        L_0x09f0:
            X.1DT r0 = r4.A0J
            r0.A0E(r5)
            return
        L_0x09f6:
            java.lang.Object r5 = r4.A01
            X.5lB r5 = (X.C112255lB) r5
            java.lang.Object r2 = r4.A02
            X.10s r0 = r5.A08
            r0.A03()
            X.8Ah r0 = r5.A00
            if (r0 == 0) goto L_0x0a0b
            r0.close()
            r0 = 0
            r5.A00 = r0
        L_0x0a0b:
            X.1KB r3 = r5.A02
            r0 = 20
            X.7RL r1 = new X.7RL
            r1.<init>(r5, r2, r0)
        L_0x0a14:
            r3.A0J(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RL.run():void");
    }

    public AnonymousClass7RL(MessageCommentsManager messageCommentsManager, AnonymousClass206 r3, AnonymousClass1OS r4, int i) {
        this.A00 = 40;
        this.A01 = messageCommentsManager;
        this.A02 = r3;
    }

    public AnonymousClass7RL(AnonymousClass1FL r2, AnonymousClass4R5 r3) {
        this.A00 = 33;
        this.A01 = r3;
        this.A02 = r2;
    }

    public AnonymousClass7RL(MessageCommentsManager messageCommentsManager, AnonymousClass206 r3) {
        this.A00 = 41;
        this.A01 = messageCommentsManager;
        this.A02 = r3;
    }
}
