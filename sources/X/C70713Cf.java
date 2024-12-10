package X;

import java.util.Arrays;

/* renamed from: X.3Cf  reason: invalid class name and case insensitive filesystem */
public class C70713Cf implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70713Cf(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0333, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0441, code lost:
        if ((r1.A01 / com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS) <= 100) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0b0f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0b10, code lost:
        r3.setException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0b13, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0b6f, code lost:
        r1.A04(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0b72, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0c22, code lost:
        X.C61752qC.A00(r5, r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0c25, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f0, code lost:
        if (r5 == null) goto L_0x01f2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r230 = this;
            r2 = r230
            int r0 = r2.A00
            switch(r0) {
                case 6: goto L_0x0c04;
                case 7: goto L_0x0bcb;
                case 8: goto L_0x0bab;
                case 9: goto L_0x0b8c;
                case 10: goto L_0x0b77;
                case 11: goto L_0x0b5f;
                case 12: goto L_0x0b4e;
                case 13: goto L_0x0b39;
                case 14: goto L_0x0b31;
                case 15: goto L_0x0b29;
                case 16: goto L_0x0b14;
                case 17: goto L_0x0ab2;
                case 18: goto L_0x0996;
                case 19: goto L_0x032d;
                case 20: goto L_0x0007;
                case 21: goto L_0x0965;
                case 22: goto L_0x0955;
                case 23: goto L_0x0949;
                case 24: goto L_0x093d;
                case 25: goto L_0x0930;
                case 26: goto L_0x0224;
                case 27: goto L_0x0918;
                case 28: goto L_0x090b;
                case 29: goto L_0x08ee;
                case 30: goto L_0x01df;
                case 31: goto L_0x08dd;
                case 32: goto L_0x040f;
                case 33: goto L_0x03f7;
                case 34: goto L_0x03a0;
                case 35: goto L_0x0173;
                case 36: goto L_0x038f;
                case 37: goto L_0x037f;
                case 38: goto L_0x035c;
                case 39: goto L_0x034e;
                case 40: goto L_0x00ec;
                case 41: goto L_0x00a5;
                case 42: goto L_0x004c;
                case 43: goto L_0x0334;
                case 44: goto L_0x02bf;
                case 45: goto L_0x02bf;
                case 46: goto L_0x0008;
                case 47: goto L_0x02b3;
                case 48: goto L_0x02a7;
                case 49: goto L_0x0299;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r1 = r2.A01
            X.2jo r1 = (X.C57892jo) r1
            java.lang.Object r0 = r2.A02
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            X.C18070vi.A0d(r0, r5)
            X.1Rj r4 = r1.A01
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x001e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0038
            X.1BI r1 = X.C17880vN.A0Q(r2)
            boolean r0 = X.C26241Rj.A03(r1)
            if (r0 == 0) goto L_0x001e
            int r0 = r4.A04(r1)
            if (r0 == r5) goto L_0x001e
            r3.add(r1)
            goto L_0x001e
        L_0x0038:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0007
            X.10I r2 = r4.A09
            X.2PN r1 = new X.2PN
            r1.<init>(r4, r3)
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r2.CGM(r1, r0)
            return
        L_0x004c:
            java.lang.Object r0 = r2.A01
            X.30i r0 = (X.C676530i) r0
            java.lang.Object r3 = r2.A02
            X.206 r3 = (X.AnonymousClass206) r3
            X.2qC r8 = r0.A0E
            X.205 r0 = r3.A0v
            X.1BI r7 = r0.A00
            com.whatsapp.jid.GroupJid r7 = (com.whatsapp.jid.GroupJid) r7
            if (r7 == 0) goto L_0x0007
            X.1CJ r4 = r8.A03
            boolean r0 = r4.A0R(r7)
            if (r0 != 0) goto L_0x0007
            X.00H r0 = r8.A06
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            r2 = r7
            X.1EC r2 = (X.AnonymousClass1EC) r2
            X.A2B r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0007
            com.whatsapp.jid.GroupJid r1 = r0.A02
            X.1Nb r0 = r8.A05
            X.1yM r0 = r0.A0a(r1)
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0007
            X.118 r0 = r8.A01
            android.content.Context r6 = r0.A00
            java.lang.String r10 = r4.A0F(r7)
            if (r10 == 0) goto L_0x0007
            X.17d r0 = r8.A04
            r6.getApplicationContext()
            java.lang.CharSequence r9 = r0.A0J(r3)
            android.content.Intent r1 = X.AnonymousClass1LU.A1A(r6, r2)
            r0 = 6
            android.app.PendingIntent r5 = X.C17880vN.A07(r6, r1, r0)
            r11 = 72
            goto L_0x0c22
        L_0x00a5:
            java.lang.Object r0 = r2.A01
            X.30i r0 = (X.C676530i) r0
            java.lang.Object r2 = r2.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.2qC r5 = r0.A0E
            X.205 r0 = r2.A0v
            X.1BI r1 = r0.A00
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            if (r1 == 0) goto L_0x0007
            X.00H r0 = r5.A06
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.1EC r4 = r0.A05(r1)
            if (r4 == 0) goto L_0x0007
            X.1CJ r0 = r5.A03
            java.lang.String r7 = r0.A0F(r4)
            if (r7 == 0) goto L_0x0007
            X.118 r0 = r5.A01
            android.content.Context r3 = r0.A00
            X.17d r0 = r5.A04
            r3.getApplicationContext()
            java.lang.CharSequence r6 = r0.A0J(r2)
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass1LU.A0n(r3, r4, r0)
            r0 = 6
            android.app.PendingIntent r2 = X.C17880vN.A07(r3, r1, r0)
            r8 = 95
            X.C61752qC.A00(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x00ec:
            java.lang.Object r0 = r2.A01
            X.30i r0 = (X.C676530i) r0
            java.lang.Object r4 = r2.A02
            X.206 r4 = (X.AnonymousClass206) r4
            X.2qC r8 = r0.A0E
            X.2Mh r4 = (X.C48392Mh) r4
            X.1CJ r1 = r8.A03
            X.2rV r0 = r4.A03
            if (r0 == 0) goto L_0x0171
            X.1BI r0 = r0.A02
        L_0x0100:
            X.1ci r5 = r1.A0A(r0)
            if (r5 == 0) goto L_0x0007
            boolean r0 = r5.A0l
            r3 = 0
            if (r0 == 0) goto L_0x0118
            X.1Co r2 = r8.A02
            X.1BI r1 = r5.A08()
            java.lang.Integer r0 = X.C17880vN.A0j()
            r2.A08(r1, r0, r3, r3)
        L_0x0118:
            X.1Nb r1 = r8.A05
            X.1BI r0 = r5.A08()
            X.1yM r0 = r1.A0a(r0)
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0007
            X.118 r0 = r8.A01
            android.content.Context r6 = r0.A00
            java.lang.String r10 = r5.A0A()
            X.17d r0 = r8.A04
            r6.getApplicationContext()
            java.lang.CharSequence r9 = r0.A0J(r4)
            X.1BI r1 = r5.A08()
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.00H r0 = r8.A06
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.1EC r7 = r0.A05(r1)
            if (r7 == 0) goto L_0x0007
            java.util.List r2 = r4.A01
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x0c17
            X.11S r1 = r8.A00
            java.lang.Object r0 = r2.get(r3)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x0c17
            X.1BI r0 = r4.A0H()
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x0c17
            return
        L_0x0171:
            r0 = 0
            goto L_0x0100
        L_0x0173:
            java.lang.Object r0 = r2.A01
            X.30i r0 = (X.C676530i) r0
            java.lang.Object r4 = r2.A02
            X.206 r4 = (X.AnonymousClass206) r4
            X.00H r0 = r0.A0N
            java.lang.Object r3 = r0.get()
            X.9nE r3 = (X.C191819nE) r3
            X.21L r4 = (X.AnonymousClass21L) r4
            r1 = 0
            X.C18070vi.A0d(r4, r1)
            X.AEt r0 = r4.A00
            if (r0 == 0) goto L_0x0007
            X.AEE r0 = r0.A05
            if (r0 == 0) goto L_0x0007
            X.AEi r2 = r0.A00
            if (r2 == 0) goto L_0x0007
            boolean r5 = r2.A00()
            r0 = 1
            if (r5 != r0) goto L_0x0007
            java.lang.String r0 = r2.A00
            if (r0 == 0) goto L_0x01a6
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0007
        L_0x01a6:
            boolean r0 = r3.A00(r2)
            if (r0 == 0) goto L_0x0007
            X.1nT r5 = r3.A07
            X.1So r7 = X.C26551So.A0B
            java.lang.String r11 = r2.A06
            java.lang.String r12 = r2.A05
            java.lang.String r13 = r2.A08
            java.lang.String r14 = r2.A03
            java.lang.String r15 = r2.A07
            byte[] r0 = r2.A09
            java.lang.Long r2 = r2.A01
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            long r21 = r2.longValue()
            r2 = 5
            X.7Is r6 = new X.7Is
            r6.<init>(r3, r4, r2)
            r8 = 0
            r17 = 6
            r18 = 8
            r19 = 1
            r10 = r8
            r9 = r8
            r20 = r1
            r16 = r0
            r5.A0A(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x01df:
            java.lang.Object r3 = r2.A01
            X.1Zk r3 = (X.C28221Zk) r3
            java.lang.Object r4 = r2.A02
            X.1bm r4 = (X.C29201bm) r4
            java.lang.String r5 = r4.BYn()
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x01f2
            r6 = 0
            if (r5 != 0) goto L_0x01f4
        L_0x01f2:
            r6 = 8
        L_0x01f4:
            X.0ve r2 = r3.A0C
            r1 = 11825(0x2e31, float:1.657E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r1 = 8
            if (r0 == 0) goto L_0x021b
            X.5eT r0 = r3.A03
            if (r0 == 0) goto L_0x020d
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x020d
            r1 = 0
        L_0x020d:
            if (r6 == r1) goto L_0x0007
            X.11A r0 = r3.A0D
            r7 = 1
            X.3Cm r2 = new X.3Cm
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A00(r2)
            return
        L_0x021b:
            android.widget.TextView r0 = r3.A02
            if (r0 == 0) goto L_0x020d
            int r1 = r0.getVisibility()
            goto L_0x020d
        L_0x0224:
            java.lang.Object r4 = r2.A01
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            java.lang.Object r1 = r2.A02
            X.1bm r1 = (X.C29201bm) r1
            X.00H r0 = r4.A1c
            java.lang.Object r0 = r0.get()
            X.1rp r0 = (X.C38751rp) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x023f
            X.1Zk r0 = r4.A03
            r0.A06(r1)
        L_0x023f:
            X.00H r0 = r4.A1I
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            X.0ve r2 = r0.A01
            r1 = 5288(0x14a8, float:7.41E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0007
            X.00H r0 = r4.A1I
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r0)
            java.lang.String r3 = "one_of_create_group_tool_tip_activated"
            r2 = 0
            boolean r1 = r0.getBoolean(r3, r2)
            X.00H r0 = r4.A1I
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            X.0z4 r0 = r0.A00
            if (r1 == 0) goto L_0x0281
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)
            X.C17880vN.A1F(r0, r3, r2)
        L_0x027b:
            X.1Zk r0 = r4.A03
            X.C28221Zk.A04(r0)
            return
        L_0x0281:
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "create_group_tool_tip_temp_dismissed"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0007
            X.00H r0 = r4.A1I
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            r0.A01()
            goto L_0x027b
        L_0x0299:
            java.lang.Object r0 = r2.A01
            X.1kd r0 = (X.C34531kd) r0
            java.lang.Object r1 = r2.A02
            X.1iZ r1 = (X.C33281iZ) r1
            X.1kY r0 = r0.A0H
            r0.A02(r1)
            return
        L_0x02a7:
            java.lang.Object r1 = r2.A01
            X.3Ly r1 = (X.C72433Ly) r1
            java.lang.Object r0 = r2.A02
            android.net.Uri r0 = (android.net.Uri) r0
            r1.C9g(r0)
            return
        L_0x02b3:
            java.lang.Object r1 = r2.A01
            com.whatsapp.SecondaryProcessAbstractAppShellDelegate r1 = (com.whatsapp.SecondaryProcessAbstractAppShellDelegate) r1
            java.lang.Object r0 = r2.A02
            X.10C r0 = (X.AnonymousClass10C) r0
            r1.m34lambda$onCreate$0$comwhatsappSecondaryProcessAbstractAppShellDelegate(r0)
            return
        L_0x02bf:
            java.lang.Object r4 = r2.A01
            X.120 r4 = (X.AnonymousClass120) r4
            java.lang.Object r7 = r2.A02
            X.2eE[] r7 = (X.C54492eE[]) r7
            X.1Os r0 = r4.A0B
            X.3Ez r6 = r0.A07()
            X.1P3 r5 = r4.A0A     // Catch:{ all -> 0x0321 }
            if (r7 == 0) goto L_0x0302
            int r2 = r7.length     // Catch:{ all -> 0x0321 }
            if (r2 == 0) goto L_0x0302
            int[] r3 = new int[r2]     // Catch:{ all -> 0x0321 }
            r1 = 0
        L_0x02d7:
            r0 = r7[r1]     // Catch:{ all -> 0x0321 }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0321 }
            int r0 = X.A8G.A00(r0)     // Catch:{ all -> 0x0321 }
            r3[r1] = r0     // Catch:{ all -> 0x0321 }
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x02d7
            X.1Os r0 = r5.A0H     // Catch:{ all -> 0x0321 }
            X.3Ez r2 = r0.A07()     // Catch:{ all -> 0x0321 }
            X.1PC r0 = r5.A07     // Catch:{ all -> 0x02f6 }
            r0.A03(r3)     // Catch:{ all -> 0x02f6 }
            if (r2 == 0) goto L_0x0307
            r2.close()     // Catch:{ all -> 0x0321 }
            goto L_0x0307
        L_0x02f6:
            r1 = move-exception
            if (r2 == 0) goto L_0x0301
            r2.close()     // Catch:{ all -> 0x02fd }
            goto L_0x0301
        L_0x02fd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0321 }
        L_0x0301:
            throw r1     // Catch:{ all -> 0x0321 }
        L_0x0302:
            java.lang.String r0 = "SignalCoordinator/tried to mark an empty list of preKeys as sent to server"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0321 }
        L_0x0307:
            X.0z4 r1 = r4.A09     // Catch:{ all -> 0x0321 }
            boolean r0 = r1.A2X()     // Catch:{ all -> 0x0321 }
            if (r0 == 0) goto L_0x0316
            r0 = 0
            r1.A2D(r0)     // Catch:{ all -> 0x0321 }
            r1.A2A(r0)     // Catch:{ all -> 0x0321 }
        L_0x0316:
            if (r6 == 0) goto L_0x031b
            r6.close()
        L_0x031b:
            r0 = 0
            X.AnonymousClass120.A01(r4, r0)
            return
        L_0x0321:
            r2 = move-exception
            if (r6 == 0) goto L_0x0333
            r6.close()     // Catch:{ all -> 0x0328 }
            throw r2
        L_0x0328:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)
            throw r2
        L_0x032d:
            java.lang.String r0 = "failure"
            java.lang.NullPointerException r2 = X.AnonymousClass000.A0s(r0)
        L_0x0333:
            throw r2
        L_0x0334:
            java.lang.Object r4 = r2.A01
            X.30i r4 = (X.C676530i) r4
            java.lang.Object r3 = r2.A02
            X.22g r3 = (X.C441322g) r3
            X.00H r0 = r4.A0O
            java.lang.Object r2 = r0.get()
            X.6mt r2 = (X.C132486mt) r2
            r1 = 0
            X.38g r0 = new X.38g
            r0.<init>(r4, r3, r1)
            r2.A00(r3, r0)
            return
        L_0x034e:
            java.lang.Object r0 = r2.A01
            X.30i r0 = (X.C676530i) r0
            java.lang.Object r1 = r2.A02
            X.206 r1 = (X.AnonymousClass206) r1
            X.1N9 r0 = r0.A0D
            r0.A08(r1)
            return
        L_0x035c:
            java.lang.Object r3 = r2.A01
            X.30i r3 = (X.C676530i) r3
            java.lang.Object r2 = r2.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.205 r0 = r2.A0N
            if (r0 == 0) goto L_0x0379
            X.1N9 r1 = r3.A0D
            X.00H r0 = r3.A0J
            java.lang.Object r0 = r0.get()
            X.207 r0 = (X.AnonymousClass207) r0
            X.206 r0 = X.AnonymousClass9AU.A00(r0, r2)
            r1.A08(r0)
        L_0x0379:
            X.1N9 r0 = r3.A0D
            r0.A08(r2)
            return
        L_0x037f:
            java.lang.Object r0 = r2.A01
            X.30i r0 = (X.C676530i) r0
            java.lang.Object r1 = r2.A02
            X.206 r1 = (X.AnonymousClass206) r1
            X.2nS r0 = r0.A01
            X.219 r1 = (X.AnonymousClass219) r1
            r0.A04(r1)
            return
        L_0x038f:
            java.lang.Object r0 = r2.A01
            X.30i r0 = (X.C676530i) r0
            java.lang.Object r1 = r2.A02
            X.206 r1 = (X.AnonymousClass206) r1
            X.2nS r0 = r0.A01
            r0.A03(r1)
            r0.A02(r1)
            return
        L_0x03a0:
            java.lang.Object r0 = r2.A01
            X.30i r0 = (X.C676530i) r0
            java.lang.Object r5 = r2.A02
            X.206 r5 = (X.AnonymousClass206) r5
            X.2e7 r4 = r0.A0F
            X.21L r5 = (X.AnonymousClass21L) r5
            X.AEt r0 = r5.A00
            X.C17960vV.A07(r0)
            X.AEn r1 = r0.A02
            if (r1 != 0) goto L_0x03bb
            java.lang.String r0 = "BipRepository/updateTransaction Checkout content was null"
        L_0x03b7:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x03bb:
            java.lang.String r0 = r1.A08
            if (r0 != 0) goto L_0x03c2
            java.lang.String r0 = "BipRepository/updateTransaction transaction was null"
            goto L_0x03b7
        L_0x03c2:
            X.1QR r6 = r4.A01
            X.AW0 r7 = r6.A0M(r0)
            if (r7 != 0) goto L_0x03cd
            java.lang.String r0 = "BipRepository/updateTransaction old transaction was null"
            goto L_0x03b7
        L_0x03cd:
            int r9 = r7.A02
            X.8pG r3 = r7.A0A
            if (r3 == 0) goto L_0x03e1
            java.lang.String r2 = r1.A0K
            X.205 r0 = r5.A0v
            java.lang.String r1 = r0.A01
            X.AEo r0 = new X.AEo
            r0.<init>(r2, r1)
            r7.A07(r0, r3)
        L_0x03e1:
            X.1BI r2 = r7.A0C
            boolean r1 = r7.A0Q
            java.lang.String r0 = r7.A0L
            X.205 r8 = X.AnonymousClass205.A01(r2, r0, r1)
            r11 = -1
            r10 = 0
            r6.A0f(r7, r8, r9, r10, r11)
            X.121 r0 = r4.A00
            r0.CQc(r7)
            return
        L_0x03f7:
            java.lang.Object r0 = r2.A01
            X.30i r0 = (X.C676530i) r0
            java.lang.Object r2 = r2.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.00H r0 = r0.A0Q
            java.lang.Object r1 = r0.get()
            X.707 r1 = (X.AnonymousClass707) r1
            X.2mc r0 = r2.A0P
            java.lang.String r0 = r0.A00
            r1.A03(r0)
            return
        L_0x040f:
            java.lang.Object r7 = r2.A01
            X.30i r7 = (X.C676530i) r7
            java.lang.Object r1 = r2.A02
            X.21V r1 = (X.AnonymousClass21V) r1
            X.1hP r8 = r7.A0A
            X.00H r0 = r7.A0L
            int r0 = X.C62242r5.A00(r1, r0)
            int r4 = X.A8F.A02(r1)
            X.00H r2 = r7.A0K
            java.lang.Object r13 = r2.get()
            X.6mb r13 = (X.C132326mb) r13
            r10 = 0
            X.C18070vi.A0d(r1, r10)
            X.A8F.A02(r1)
            boolean r2 = r1 instanceof X.C438921i
            if (r2 == 0) goto L_0x0443
            long r2 = r1.A01
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r5
            r11 = 100
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            r9 = 1
            if (r5 > 0) goto L_0x0444
        L_0x0443:
            r9 = 0
        L_0x0444:
            X.1CJ r3 = r13.A00
            X.205 r2 = r1.A0v
            X.1BI r2 = r2.A00
            boolean r13 = r3.A0R(r2)
            monitor-enter(r8)
            X.0ve r5 = r8.A00     // Catch:{ all -> 0x08da }
            r3 = 12670(0x317e, float:1.7754E-41)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ all -> 0x08da }
            boolean r2 = X.C18020vd.A05(r2, r5, r3)     // Catch:{ all -> 0x08da }
            if (r2 != 0) goto L_0x0487
            long r19 = X.C32571hP.A01(r8)     // Catch:{ all -> 0x08da }
            int r17 = X.C32571hP.A00(r8)     // Catch:{ all -> 0x08da }
            X.1hO r12 = r8.A02     // Catch:{ all -> 0x08da }
            r21 = r12
            r22 = r0
            r23 = r17
            r24 = r4
            r25 = r19
            r27 = r10
            X.2sZ r11 = r21.A01(r22, r23, r24, r25, r27)     // Catch:{ all -> 0x08da }
            long r2 = r11.A04     // Catch:{ all -> 0x08da }
            r5 = 1
            long r2 = r2 + r5
            r11.A04 = r2     // Catch:{ all -> 0x08da }
            r18 = r4
            r21 = r10
            r14 = r12
            r15 = r11
            r16 = r0
            r14.A02(r15, r16, r17, r18, r19, r21)     // Catch:{ all -> 0x08da }
        L_0x0487:
            X.00H r2 = r8.A03     // Catch:{ all -> 0x08da }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x08da }
            X.6m1 r2 = (X.C132006m1) r2     // Catch:{ all -> 0x08da }
            X.00H r10 = r2.A01     // Catch:{ all -> 0x08da }
            java.lang.Object r2 = r10.get()     // Catch:{ all -> 0x08da }
            X.Cmh r2 = (X.C25830Cmh) r2     // Catch:{ all -> 0x08da }
            X.Cqo r14 = r2.A01()     // Catch:{ all -> 0x08da }
            r2 = 1
            r11 = 1
            if (r4 == r2) goto L_0x065b
            r2 = 2
            if (r4 == r2) goto L_0x0535
            long r2 = r14.A0I     // Catch:{ all -> 0x08da }
            long r2 = r2 + r11
            r16 = 15
            r17 = 0
            r15 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r89 = 0
            r91 = 0
            r93 = 0
            r95 = 0
            r97 = 0
            r99 = 0
            r101 = 0
            r103 = 0
            r105 = 0
            r107 = 0
            r109 = 0
            r111 = 0
            r113 = 0
            r115 = 0
            r117 = 0
            r119 = 0
            r121 = 0
            r123 = 0
            r125 = 0
            r127 = 0
            r129 = 0
            r131 = 0
            r135 = 0
            r139 = 0
            r143 = 0
            r147 = 0
            r149 = 0
            r151 = 0
            r153 = 0
            r224 = 0
            r21 = r17
            r23 = r17
            r25 = r17
            r27 = r17
            r29 = r17
            r31 = r17
            r33 = r17
            r35 = r17
            r37 = r17
            r39 = r17
            r41 = r17
            r43 = r17
            r45 = r17
            r47 = r17
            r49 = r17
            r51 = r17
            r53 = r17
            r55 = r17
            r57 = r17
            r59 = r17
            r61 = r17
            r63 = r17
            r65 = r17
            r67 = r17
            r69 = r17
            r71 = r17
            r73 = r17
            r75 = r17
            r79 = r17
            r81 = r17
            r83 = r17
            r85 = r17
            r87 = r17
            r19 = r17
            r77 = r2
            X.Cqo r6 = X.C26030Cqo.A00(r14, r15, r16, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87)     // Catch:{ all -> 0x08da }
            goto L_0x06eb
        L_0x0535:
            if (r13 == 0) goto L_0x05c9
            long r2 = r14.A0D     // Catch:{ all -> 0x08da }
            long r2 = r2 + r11
            r16 = 15
            r17 = 0
            r15 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            r89 = 0
            r91 = 0
            r93 = 0
            r95 = 0
            r97 = 0
            r99 = 0
            r101 = 0
            r103 = 0
            r105 = 0
            r107 = 0
            r109 = 0
            r111 = 0
            r113 = 0
            r115 = 0
            r117 = 0
            r119 = 0
            r121 = 0
            r123 = 0
            r125 = 0
            r127 = 0
            r129 = 0
            r131 = 0
            r135 = 0
            r139 = 0
            r143 = 0
            r147 = 0
            r149 = 0
            r151 = 0
            r153 = 0
            r224 = 0
            r21 = r17
            r23 = r17
            r25 = r17
            r27 = r17
            r29 = r17
            r31 = r17
            r33 = r17
            r35 = r17
            r37 = r17
            r39 = r17
            r41 = r17
            r43 = r17
            r45 = r17
            r47 = r17
            r49 = r17
            r51 = r17
            r53 = r17
            r55 = r17
            r57 = r17
            r59 = r17
            r61 = r17
            r63 = r17
            r65 = r17
            r67 = r17
            r71 = r17
            r73 = r17
            r75 = r17
            r77 = r17
            r79 = r17
            r81 = r17
            r83 = r17
            r85 = r17
            r87 = r17
            r19 = r17
            r69 = r2
            X.Cqo r6 = X.C26030Cqo.A00(r14, r15, r16, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87)     // Catch:{ all -> 0x08da }
            goto L_0x06eb
        L_0x05c9:
            long r2 = r14.A0G     // Catch:{ all -> 0x08da }
            long r2 = r2 + r11
            r16 = 15
            r17 = 0
            r15 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r89 = 0
            r91 = 0
            r93 = 0
            r95 = 0
            r97 = 0
            r99 = 0
            r101 = 0
            r103 = 0
            r105 = 0
            r107 = 0
            r109 = 0
            r111 = 0
            r113 = 0
            r115 = 0
            r117 = 0
            r119 = 0
            r121 = 0
            r123 = 0
            r125 = 0
            r127 = 0
            r129 = 0
            r131 = 0
            r135 = 0
            r139 = 0
            r143 = 0
            r147 = 0
            r149 = 0
            r151 = 0
            r153 = 0
            r224 = 0
            r21 = r17
            r23 = r17
            r25 = r17
            r27 = r17
            r29 = r17
            r31 = r17
            r33 = r17
            r35 = r17
            r37 = r17
            r39 = r17
            r41 = r17
            r43 = r17
            r45 = r17
            r47 = r17
            r49 = r17
            r51 = r17
            r53 = r17
            r55 = r17
            r57 = r17
            r59 = r17
            r61 = r17
            r63 = r17
            r65 = r17
            r67 = r17
            r69 = r17
            r71 = r17
            r75 = r17
            r77 = r17
            r79 = r17
            r81 = r17
            r83 = r17
            r85 = r17
            r87 = r17
            r19 = r17
            r73 = r2
            X.Cqo r6 = X.C26030Cqo.A00(r14, r15, r16, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87)     // Catch:{ all -> 0x08da }
            goto L_0x06eb
        L_0x065b:
            long r2 = r14.A0B     // Catch:{ all -> 0x08da }
            long r2 = r2 + r11
            r16 = 15
            r17 = 0
            r15 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            r89 = 0
            r91 = 0
            r93 = 0
            r95 = 0
            r97 = 0
            r99 = 0
            r101 = 0
            r103 = 0
            r105 = 0
            r107 = 0
            r109 = 0
            r111 = 0
            r113 = 0
            r115 = 0
            r117 = 0
            r119 = 0
            r121 = 0
            r123 = 0
            r125 = 0
            r127 = 0
            r129 = 0
            r131 = 0
            r135 = 0
            r139 = 0
            r143 = 0
            r147 = 0
            r149 = 0
            r151 = 0
            r153 = 0
            r224 = 0
            r21 = r17
            r23 = r17
            r25 = r17
            r27 = r17
            r29 = r17
            r31 = r17
            r33 = r17
            r35 = r17
            r37 = r17
            r39 = r17
            r41 = r17
            r43 = r17
            r45 = r17
            r47 = r17
            r49 = r17
            r51 = r17
            r53 = r17
            r55 = r17
            r57 = r17
            r59 = r17
            r61 = r17
            r63 = r17
            r67 = r17
            r69 = r17
            r71 = r17
            r73 = r17
            r75 = r17
            r77 = r17
            r79 = r17
            r81 = r17
            r83 = r17
            r85 = r17
            r87 = r17
            r19 = r17
            r65 = r2
            X.Cqo r6 = X.C26030Cqo.A00(r14, r15, r16, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87)     // Catch:{ all -> 0x08da }
        L_0x06eb:
            r2 = 2
            if (r0 == r2) goto L_0x0825
            r2 = 3
            if (r0 == r2) goto L_0x07d1
            r2 = 4
            if (r0 == r2) goto L_0x077b
            r2 = 5
            if (r0 == r2) goto L_0x077b
            r2 = 8
            if (r0 == r2) goto L_0x0722
            r2 = 16
            if (r0 == r2) goto L_0x0705
            r2 = 64
            if (r0 != r2) goto L_0x0894
            goto L_0x0879
        L_0x0705:
            long r2 = r6.A0S     // Catch:{ all -> 0x08da }
            long r2 = r2 + r11
            r88 = 7
            r87 = -1
            r133 = 0
            r137 = 0
            r141 = 0
            r145 = 0
            r157 = 0
            r86 = r6
            r155 = r224
            r159 = r2
            X.Cqo r14 = X.C26030Cqo.A00(r86, r87, r88, r89, r91, r93, r95, r97, r99, r101, r103, r105, r107, r109, r111, r113, r115, r117, r119, r121, r123, r125, r127, r129, r131, r133, r135, r137, r139, r141, r143, r145, r147, r149, r151, r153, r155, r157, r159)     // Catch:{ all -> 0x08da }
            goto L_0x0894
        L_0x0722:
            long r4 = r6.A08     // Catch:{ all -> 0x08da }
            long r2 = (long) r9     // Catch:{ all -> 0x08da }
            long r4 = r4 + r2
            long r2 = r6.A05     // Catch:{ all -> 0x08da }
            long r2 = r2 + r11
            r156 = -20481(0xffffffffffffafff, float:NaN)
            r202 = 0
            r206 = 0
            r210 = 0
            r214 = 0
            r226 = 0
            r228 = 0
            r155 = r6
            r157 = r16
            r158 = r89
            r160 = r91
            r162 = r93
            r164 = r95
            r166 = r97
            r168 = r99
            r170 = r101
            r172 = r103
            r174 = r105
            r176 = r107
            r178 = r109
            r180 = r111
            r182 = r2
            r184 = r115
            r186 = r4
            r188 = r119
            r190 = r121
            r192 = r123
            r194 = r125
            r196 = r127
            r198 = r129
            r200 = r131
            r204 = r135
            r208 = r139
            r212 = r143
            r216 = r147
            r218 = r149
            r220 = r151
            r222 = r153
            X.Cqo r14 = X.C26030Cqo.A00(r155, r156, r157, r158, r160, r162, r164, r166, r168, r170, r172, r174, r176, r178, r180, r182, r184, r186, r188, r190, r192, r194, r196, r198, r200, r202, r204, r206, r208, r210, r212, r214, r216, r218, r220, r222, r224, r226, r228)     // Catch:{ all -> 0x08da }
            goto L_0x0894
        L_0x077b:
            long r2 = r6.A01     // Catch:{ all -> 0x08da }
            long r2 = r2 + r11
            r156 = -262145(0xfffffffffffbffff, float:NaN)
            r202 = 0
            r206 = 0
            r210 = 0
            r214 = 0
            r226 = 0
            r228 = 0
            r155 = r6
            r157 = r16
            r158 = r89
            r160 = r91
            r162 = r93
            r164 = r95
            r166 = r97
            r168 = r99
            r170 = r101
            r172 = r103
            r174 = r105
            r176 = r107
            r178 = r109
            r180 = r111
            r182 = r113
            r184 = r115
            r186 = r117
            r188 = r119
            r190 = r121
            r192 = r123
            r194 = r2
            r196 = r127
            r198 = r129
            r200 = r131
            r204 = r135
            r208 = r139
            r212 = r143
            r216 = r147
            r218 = r149
            r220 = r151
            r222 = r153
            X.Cqo r14 = X.C26030Cqo.A00(r155, r156, r157, r158, r160, r162, r164, r166, r168, r170, r172, r174, r176, r178, r180, r182, r184, r186, r188, r190, r192, r194, r196, r198, r200, r202, r204, r206, r208, r210, r212, r214, r216, r218, r220, r222, r224, r226, r228)     // Catch:{ all -> 0x08da }
            goto L_0x0894
        L_0x07d1:
            long r2 = r6.A0Y     // Catch:{ all -> 0x08da }
            long r2 = r2 + r11
            r156 = -65
            r202 = 0
            r206 = 0
            r210 = 0
            r214 = 0
            r226 = 0
            r228 = 0
            r155 = r6
            r157 = r16
            r158 = r89
            r160 = r91
            r162 = r93
            r164 = r95
            r166 = r97
            r168 = r99
            r170 = r2
            r172 = r103
            r174 = r105
            r176 = r107
            r178 = r109
            r180 = r111
            r182 = r113
            r184 = r115
            r186 = r117
            r188 = r119
            r190 = r121
            r192 = r123
            r194 = r125
            r196 = r127
            r198 = r129
            r200 = r131
            r204 = r135
            r208 = r139
            r212 = r143
            r216 = r147
            r218 = r149
            r220 = r151
            r222 = r153
            X.Cqo r14 = X.C26030Cqo.A00(r155, r156, r157, r158, r160, r162, r164, r166, r168, r170, r172, r174, r176, r178, r180, r182, r184, r186, r188, r190, r192, r194, r196, r198, r200, r202, r204, r206, r208, r210, r212, r214, r216, r218, r220, r222, r224, r226, r228)     // Catch:{ all -> 0x08da }
            goto L_0x0894
        L_0x0825:
            long r2 = r6.A0M     // Catch:{ all -> 0x08da }
            long r2 = r2 + r11
            r156 = -2
            r202 = 0
            r206 = 0
            r210 = 0
            r214 = 0
            r226 = 0
            r228 = 0
            r155 = r6
            r157 = r16
            r158 = r2
            r160 = r91
            r162 = r93
            r164 = r95
            r166 = r97
            r168 = r99
            r170 = r101
            r172 = r103
            r174 = r105
            r176 = r107
            r178 = r109
            r180 = r111
            r182 = r113
            r184 = r115
            r186 = r117
            r188 = r119
            r190 = r121
            r192 = r123
            r194 = r125
            r196 = r127
            r198 = r129
            r200 = r131
            r204 = r135
            r208 = r139
            r212 = r143
            r216 = r147
            r218 = r149
            r220 = r151
            r222 = r153
            X.Cqo r14 = X.C26030Cqo.A00(r155, r156, r157, r158, r160, r162, r164, r166, r168, r170, r172, r174, r176, r178, r180, r182, r184, r186, r188, r190, r192, r194, r196, r198, r200, r202, r204, r206, r208, r210, r212, r214, r216, r218, r220, r222, r224, r226, r228)     // Catch:{ all -> 0x08da }
            goto L_0x0894
        L_0x0879:
            long r2 = r6.A0R     // Catch:{ all -> 0x08da }
            long r2 = r2 + r11
            r88 = 13
            r87 = -1
            r133 = 0
            r137 = 0
            r141 = 0
            r145 = 0
            r157 = 0
            r159 = 0
            r86 = r6
            r155 = r2
            X.Cqo r14 = X.C26030Cqo.A00(r86, r87, r88, r89, r91, r93, r95, r97, r99, r101, r103, r105, r107, r109, r111, r113, r115, r117, r119, r121, r123, r125, r127, r129, r131, r133, r135, r137, r139, r141, r143, r145, r147, r149, r151, r153, r155, r157, r159)     // Catch:{ all -> 0x08da }
        L_0x0894:
            java.lang.Object r0 = r10.get()     // Catch:{ all -> 0x08da }
            X.Cmh r0 = (X.C25830Cmh) r0     // Catch:{ all -> 0x08da }
            r0.A03(r14)     // Catch:{ all -> 0x08da }
            monitor-exit(r8)
            X.1ha r2 = r7.A0C
            boolean r0 = X.C32681ha.A02(r2, r1)
            if (r0 == 0) goto L_0x08a9
            X.C32681ha.A00(r2, r1)
        L_0x08a9:
            boolean r0 = r1.A19
            if (r0 == 0) goto L_0x08be
            boolean r0 = r1 instanceof X.C441322g
            if (r0 == 0) goto L_0x08be
            X.1j3 r3 = r7.A0B
            r0 = 0
            X.7Is r2 = new X.7Is
            r2.<init>(r7, r1, r0)
            r0 = 1
            r3.A04(r2, r1, r0, r0)
            return
        L_0x08be:
            boolean r0 = r1.A0w()
            if (r0 == 0) goto L_0x08d4
            X.00H r0 = r7.A0M
            java.lang.Object r2 = r0.get()
            X.1c4 r2 = (X.AnonymousClass1c4) r2
            r0 = 3
            boolean r0 = X.AnonymousClass1c4.A00(r2, r0)
            if (r0 != 0) goto L_0x08d4
            return
        L_0x08d4:
            X.1j3 r0 = r7.A0B
            r0.A05(r1)
            return
        L_0x08da:
            r2 = move-exception
            monitor-exit(r8)
            throw r2
        L_0x08dd:
            java.lang.Object r3 = r2.A01
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r1 = r2.A02
            android.view.animation.Animation r1 = (android.view.animation.Animation) r1
            r0 = 8
            r3.setVisibility(r0)
            r3.startAnimation(r1)
            return
        L_0x08ee:
            java.lang.Object r5 = r2.A01
            X.1Zk r5 = (X.C28221Zk) r5
            java.lang.Object r0 = r2.A02
            X.1bm r0 = (X.C29201bm) r0
            android.graphics.drawable.Drawable r4 = r0.BYm()
            java.lang.String r3 = r0.BYl()
            X.11A r2 = r5.A0D
            r1 = 10
            X.AkQ r0 = new X.AkQ
            r0.<init>(r5, r4, r3, r1)
            r2.A00(r0)
            return
        L_0x090b:
            java.lang.Object r3 = r2.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.Object r1 = r2.A02
            android.content.Intent r1 = (android.content.Intent) r1
            r0 = 0
            r3.A3q(r1, r0)
            return
        L_0x0918:
            java.lang.Object r3 = r2.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.Object r1 = r2.A02
            android.content.Intent r1 = (android.content.Intent) r1
            boolean r0 = r3.Bed()
            if (r0 != 0) goto L_0x092a
            r3.startActivity(r1)
            return
        L_0x092a:
            java.lang.String r0 = "HomeActivity/show-low-free-space-on-internal-storage/cannot-start/home-activity-ended"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0930:
            java.lang.Object r3 = r2.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.Object r1 = r2.A02
            android.content.Intent r1 = (android.content.Intent) r1
            r0 = 0
            r3.CNh(r1, r0)
            return
        L_0x093d:
            java.lang.Object r1 = r2.A01
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r0 = r2.A02
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            X.AnonymousClass1FU.A0b(r0, r1)
            return
        L_0x0949:
            java.lang.Object r1 = r2.A01
            X.5YU r1 = (X.AnonymousClass5YU) r1
            java.lang.Object r0 = r2.A02
            java.util.Set r0 = (java.util.Set) r0
            r1.Br4(r0)
            return
        L_0x0955:
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r2.A02
            android.view.ViewTreeObserver$OnPreDrawListener r1 = (android.view.ViewTreeObserver.OnPreDrawListener) r1
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnPreDrawListener(r1)
            return
        L_0x0965:
            java.lang.Object r3 = r2.A01
            X.2n7 r3 = (X.C59932n7) r3
            java.lang.Object r1 = r2.A02
            X.37N r1 = (X.AnonymousClass37N) r1
            r0 = 0
            r3.A01 = r0
            X.2n7 r1 = r1.A01
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x0986
            java.lang.String r0 = "mystatus/onError Not notifying observers because mystatus hasn't been initialized (the value is null) #mexmigrationperftracker"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.190 r3 = r1.A03
            java.lang.String r2 = "fetching MyStatus resulted in an error causing the value to never get initialized. This can lead to looping as other areas of the app indirectly attempt to fetch the missing status because `getMyStatus()` has a side-effect of triggering a network call when myStatus is null."
            r1 = 1
            java.lang.String r0 = "my-status-failed-init"
            r3.A0G(r0, r2, r1)
            return
        L_0x0986:
            X.00H r0 = r1.A06
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 0
            X.7KX r0 = new X.7KX
            r0.<init>(r1)
            r2.notifyAllObservers(r0)
            return
        L_0x0996:
            java.lang.Object r3 = r2.A01
            X.AiD r3 = (X.C21328AiD) r3
            java.lang.Object r2 = r2.A02
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2
            r0 = 4
            java.lang.String r5 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r5, r0)     // Catch:{ Exception -> 0x0aad }
            if (r0 == 0) goto L_0x09b9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0aad }
            java.lang.String r0 = "Starting download of: "
            r1.append(r0)     // Catch:{ Exception -> 0x0aad }
            java.net.URL r0 = r3.A01     // Catch:{ Exception -> 0x0aad }
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)     // Catch:{ Exception -> 0x0aad }
            android.util.Log.i(r5, r0)     // Catch:{ Exception -> 0x0aad }
        L_0x09b9:
            java.net.URL r4 = r3.A01     // Catch:{ Exception -> 0x0aad }
            java.net.URLConnection r1 = r4.openConnection()     // Catch:{ Exception -> 0x0aad }
            int r0 = r1.getContentLength()     // Catch:{ Exception -> 0x0aad }
            r3 = 1048576(0x100000, float:1.469368E-39)
            if (r0 > r3) goto L_0x0a9f
            java.io.InputStream r10 = r1.getInputStream()     // Catch:{ Exception -> 0x0aad }
            X.6QT r13 = new X.6QT     // Catch:{ all -> 0x0a93 }
            r13.<init>(r10)     // Catch:{ all -> 0x0a93 }
            r0 = 20
            java.util.ArrayDeque r12 = new java.util.ArrayDeque     // Catch:{ all -> 0x0a93 }
            r12.<init>(r0)     // Catch:{ all -> 0x0a93 }
            r11 = 0
            int r0 = java.lang.Integer.highestOneBit(r11)     // Catch:{ all -> 0x0a93 }
            int r1 = r0 * 2
            r0 = 128(0x80, float:1.794E-43)
            int r1 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x0a93 }
            r0 = 8192(0x2000, float:1.14794E-41)
            int r8 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0a93 }
        L_0x09ea:
            r7 = -1
            r1 = 2147483639(0x7ffffff7, float:NaN)
            if (r11 >= r1) goto L_0x0a2e
            int r1 = r1 - r11
            int r0 = java.lang.Math.min(r8, r1)     // Catch:{ all -> 0x0a93 }
            byte[] r6 = new byte[r0]     // Catch:{ all -> 0x0a93 }
            r12.add(r6)     // Catch:{ all -> 0x0a93 }
            r1 = 0
        L_0x09fb:
            int r0 = r6.length     // Catch:{ all -> 0x0a93 }
            if (r1 >= r0) goto L_0x0a0e
            int r0 = r6.length     // Catch:{ all -> 0x0a93 }
            int r0 = r0 - r1
            int r0 = r13.read(r6, r1, r0)     // Catch:{ all -> 0x0a93 }
            if (r0 != r7) goto L_0x0a0b
            byte[] r6 = X.C49812Sa.A00(r12, r11)     // Catch:{ all -> 0x0a93 }
            goto L_0x0a38
        L_0x0a0b:
            int r1 = r1 + r0
            int r11 = r11 + r0
            goto L_0x09fb
        L_0x0a0e:
            long r6 = (long) r8     // Catch:{ all -> 0x0a93 }
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = 2
            if (r8 >= r1) goto L_0x0a15
            r0 = 4
        L_0x0a15:
            long r0 = (long) r0     // Catch:{ all -> 0x0a93 }
            long r6 = r6 * r0
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a22
            r8 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x09ea
        L_0x0a22:
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0a2c
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x09ea
        L_0x0a2c:
            int r8 = (int) r6     // Catch:{ all -> 0x0a93 }
            goto L_0x09ea
        L_0x0a2e:
            int r0 = r13.read()     // Catch:{ all -> 0x0a93 }
            if (r0 != r7) goto L_0x0a8b
            byte[] r6 = X.C49812Sa.A00(r12, r1)     // Catch:{ all -> 0x0a93 }
        L_0x0a38:
            if (r10 == 0) goto L_0x0a3d
            r10.close()     // Catch:{ Exception -> 0x0aad }
        L_0x0a3d:
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r5, r0)     // Catch:{ Exception -> 0x0aad }
            if (r0 == 0) goto L_0x0a5a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0aad }
            java.lang.String r0 = "Downloaded "
            r1.append(r0)     // Catch:{ Exception -> 0x0aad }
            int r0 = r6.length     // Catch:{ Exception -> 0x0aad }
            r1.append(r0)     // Catch:{ Exception -> 0x0aad }
            java.lang.String r0 = " bytes from "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)     // Catch:{ Exception -> 0x0aad }
            android.util.Log.v(r5, r0)     // Catch:{ Exception -> 0x0aad }
        L_0x0a5a:
            int r1 = r6.length     // Catch:{ Exception -> 0x0aad }
            if (r1 > r3) goto L_0x0aa6
            r0 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r6, r0, r1)     // Catch:{ Exception -> 0x0aad }
            if (r3 == 0) goto L_0x0a7c
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r5, r0)     // Catch:{ Exception -> 0x0aad }
            if (r0 == 0) goto L_0x0a78
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0aad }
            java.lang.String r0 = "Successfully downloaded image: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)     // Catch:{ Exception -> 0x0aad }
            android.util.Log.d(r5, r0)     // Catch:{ Exception -> 0x0aad }
        L_0x0a78:
            r2.setResult(r3)     // Catch:{ Exception -> 0x0aad }
            return
        L_0x0a7c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0aad }
            java.lang.String r0 = "Failed to decode image: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)     // Catch:{ Exception -> 0x0aad }
            java.io.IOException r1 = X.C17880vN.A0f(r0)     // Catch:{ Exception -> 0x0aad }
            goto L_0x0aac
        L_0x0a8b:
            java.lang.String r1 = "input is too large to fit in a byte array"
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0a93 }
            r0.<init>(r1)     // Catch:{ all -> 0x0a93 }
            throw r0     // Catch:{ all -> 0x0a93 }
        L_0x0a93:
            r1 = move-exception
            if (r10 == 0) goto L_0x0aac
            r10.close()     // Catch:{ all -> 0x0a9a }
            goto L_0x0aac
        L_0x0a9a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0aad }
            goto L_0x0aac
        L_0x0a9f:
            java.lang.String r0 = "Content-Length exceeds max size of 1048576"
            java.io.IOException r1 = X.C17880vN.A0f(r0)     // Catch:{ Exception -> 0x0aad }
            goto L_0x0aac
        L_0x0aa6:
            java.lang.String r0 = "Image exceeds max size of 1048576"
            java.io.IOException r1 = X.C17880vN.A0f(r0)     // Catch:{ Exception -> 0x0aad }
        L_0x0aac:
            throw r1     // Catch:{ Exception -> 0x0aad }
        L_0x0aad:
            r0 = move-exception
            r2.setException(r0)
            return
        L_0x0ab2:
            java.lang.Object r4 = r2.A01
            com.google.firebase.messaging.FirebaseMessaging r4 = (com.google.firebase.messaging.FirebaseMessaging) r4
            java.lang.Object r3 = r2.A02
            com.google.android.gms.tasks.TaskCompletionSource r3 = (com.google.android.gms.tasks.TaskCompletionSource) r3
            X.0yI r5 = r4.A07     // Catch:{ Exception -> 0x0b0f }
            android.os.Bundle r2 = X.C17880vN.A0D()     // Catch:{ Exception -> 0x0b0f }
            java.lang.String r1 = "delete"
            java.lang.String r0 = "1"
            r2.putString(r1, r0)     // Catch:{ Exception -> 0x0b0f }
            X.0vy r0 = r5.A01     // Catch:{ Exception -> 0x0b0f }
            java.lang.String r1 = X.C19480yH.A01(r0)     // Catch:{ Exception -> 0x0b0f }
            java.lang.String r0 = "*"
            com.google.android.gms.tasks.Task r2 = X.C19490yI.A00(r2, r5, r1, r0)     // Catch:{ Exception -> 0x0b0f }
            r0 = 0
            X.DVv r1 = new X.DVv     // Catch:{ Exception -> 0x0b0f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0b0f }
            X.2wM r0 = new X.2wM     // Catch:{ Exception -> 0x0b0f }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0b0f }
            com.google.android.gms.tasks.Task r0 = r2.continueWith(r1, r0)     // Catch:{ Exception -> 0x0b0f }
            com.google.android.gms.tasks.Tasks.await(r0)     // Catch:{ Exception -> 0x0b0f }
            android.content.Context r0 = r4.A02     // Catch:{ Exception -> 0x0b0f }
            X.0z6 r2 = com.google.firebase.messaging.FirebaseMessaging.A00(r0)     // Catch:{ Exception -> 0x0b0f }
            java.lang.String r1 = com.google.firebase.messaging.FirebaseMessaging.A01(r4)     // Catch:{ Exception -> 0x0b0f }
            X.0vy r0 = r4.A04     // Catch:{ Exception -> 0x0b0f }
            java.lang.String r0 = X.C19480yH.A01(r0)     // Catch:{ Exception -> 0x0b0f }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0b0f }
            java.lang.String r1 = X.C19840z6.A01(r1, r0)     // Catch:{ all -> 0x0b0c }
            android.content.SharedPreferences r0 = r2.A00     // Catch:{ all -> 0x0b0c }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0b0c }
            r0.remove(r1)     // Catch:{ all -> 0x0b0c }
            r0.commit()     // Catch:{ all -> 0x0b0c }
            monitor-exit(r2)     // Catch:{ Exception -> 0x0b0f }
            r0 = 0
            r3.setResult(r0)     // Catch:{ Exception -> 0x0b0f }
            return
        L_0x0b0c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x0b0f }
            throw r0     // Catch:{ Exception -> 0x0b0f }
        L_0x0b0f:
            r0 = move-exception
            r3.setException(r0)
            return
        L_0x0b14:
            java.lang.Object r0 = r2.A01
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            java.lang.Object r1 = r2.A02
            com.google.android.gms.tasks.TaskCompletionSource r1 = (com.google.android.gms.tasks.TaskCompletionSource) r1
            java.lang.String r0 = r0.A04()     // Catch:{ Exception -> 0x0b24 }
            r1.setResult(r0)     // Catch:{ Exception -> 0x0b24 }
            return
        L_0x0b24:
            r0 = move-exception
            r1.setException(r0)
            return
        L_0x0b29:
            java.lang.Object r0 = r2.A02
            android.content.Intent r0 = (android.content.Intent) r0
            X.C19570yQ.A00(r0)
            return
        L_0x0b31:
            java.lang.Object r0 = r2.A02
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0b39:
            java.lang.Object r1 = r2.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r0 = r2.A02
            X.CLT r0 = (X.CLT) r0
            r1.run()     // Catch:{ Exception -> 0x0b45 }
            return
        L_0x0b45:
            r2 = move-exception
            X.BJN r1 = r0.A00
            boolean r0 = X.DMr.A02
            r1.A03(r2)
            throw r2
        L_0x0b4e:
            java.lang.Object r0 = r2.A01
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.lang.Object r3 = r2.A02
            X.CLT r3 = (X.CLT) r3
            java.lang.Object r2 = r0.call()     // Catch:{ Exception -> 0x0b73 }
            X.BJN r1 = r3.A00     // Catch:{ Exception -> 0x0b73 }
            boolean r0 = X.DMr.A02     // Catch:{ Exception -> 0x0b73 }
            goto L_0x0b6f
        L_0x0b5f:
            java.lang.Object r0 = r2.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Object r3 = r2.A02
            X.CLT r3 = (X.CLT) r3
            r0.run()     // Catch:{ Exception -> 0x0b73 }
            r2 = 0
            X.BJN r1 = r3.A00     // Catch:{ Exception -> 0x0b73 }
            boolean r0 = X.DMr.A02     // Catch:{ Exception -> 0x0b73 }
        L_0x0b6f:
            r1.A04(r2)     // Catch:{ Exception -> 0x0b73 }
            return
        L_0x0b73:
            r2 = move-exception
            X.BJN r1 = r3.A00
            goto L_0x0b86
        L_0x0b77:
            java.lang.Object r1 = r2.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r0 = r2.A02
            X.CLT r0 = (X.CLT) r0
            r1.run()     // Catch:{ Exception -> 0x0b83 }
            return
        L_0x0b83:
            r2 = move-exception
            X.BJN r1 = r0.A00
        L_0x0b86:
            boolean r0 = X.DMr.A02
            r1.A03(r2)
            return
        L_0x0b8c:
            java.lang.Object r3 = r2.A01
            X.0x2 r3 = (X.C18710x2) r3
            java.lang.Object r1 = r2.A02
            X.0w6 r1 = (X.C18290w6) r1
            monitor-enter(r3)
            java.util.Set r0 = r3.A00     // Catch:{ all -> 0x0ba8 }
            if (r0 != 0) goto L_0x0b9f
            java.util.Set r0 = r3.A01     // Catch:{ all -> 0x0ba8 }
        L_0x0b9b:
            r0.add(r1)     // Catch:{ all -> 0x0ba8 }
            goto L_0x0ba6
        L_0x0b9f:
            java.util.Set r0 = r3.A00     // Catch:{ all -> 0x0ba8 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0ba8 }
            goto L_0x0b9b
        L_0x0ba6:
            monitor-exit(r3)
            return
        L_0x0ba8:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L_0x0bab:
            java.lang.Object r3 = r2.A01
            X.0x3 r3 = (X.C18720x3) r3
            java.lang.Object r2 = r2.A02
            X.0w6 r2 = (X.C18290w6) r2
            X.0w6 r1 = r3.A01
            X.0w6 r0 = X.C18720x3.A03
            if (r1 != r0) goto L_0x0bc4
            monitor-enter(r3)
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0bc1 }
            r3.A01 = r2     // Catch:{ all -> 0x0bc1 }
            monitor-exit(r3)     // Catch:{ all -> 0x0bc1 }
            return
        L_0x0bc1:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0bc1 }
            throw r2
        L_0x0bc4:
            java.lang.String r0 = "provide() can be called only once."
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r0)
            throw r2
        L_0x0bcb:
            java.lang.Object r3 = r2.A02
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            boolean r0 = r3.isDone()     // Catch:{ ExecutionException -> 0x0bf7, all -> 0x0bf1 }
            java.lang.String r1 = "Future was expected to be done: %s"
            if (r0 == 0) goto L_0x0be3
            java.lang.Object r1 = X.C181049Oy.A00(r3)     // Catch:{ ExecutionException -> 0x0bf7, all -> 0x0bf1 }
            java.lang.Object r0 = r2.A01
            X.3LY r0 = (X.AnonymousClass3LY) r0
            r0.onSuccess(r1)
            return
        L_0x0be3:
            r0 = 1
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r3, r0)     // Catch:{ ExecutionException -> 0x0bf7, all -> 0x0bf1 }
            java.lang.String r0 = com.google.common.base.Strings.A00(r1, r0)     // Catch:{ ExecutionException -> 0x0bf7, all -> 0x0bf1 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ ExecutionException -> 0x0bf7, all -> 0x0bf1 }
            throw r0     // Catch:{ ExecutionException -> 0x0bf7, all -> 0x0bf1 }
        L_0x0bf1:
            r0 = move-exception
            java.lang.Object r1 = r2.A01
            X.3LY r1 = (X.AnonymousClass3LY) r1
            goto L_0x0c00
        L_0x0bf7:
            r0 = move-exception
            java.lang.Object r1 = r2.A01
            X.3LY r1 = (X.AnonymousClass3LY) r1
            java.lang.Throwable r0 = r0.getCause()
        L_0x0c00:
            r1.Btr(r0)
            return
        L_0x0c04:
            java.lang.Object r1 = r2.A01
            X.Bbo r1 = (X.C23135Bbo) r1
            java.lang.Object r0 = r2.A02
            X.BiI r0 = (X.C23508BiI) r0
            X.BEf r0 = r0.A01
            r1.A00(r0)
            X.DL0 r0 = r0.A03
            r1.A00(r0)
            return
        L_0x0c17:
            android.content.Intent r1 = X.AnonymousClass1LU.A0n(r6, r7, r3)
            r0 = 6
            android.app.PendingIntent r5 = X.C17880vN.A07(r6, r1, r0)
            r11 = 49
        L_0x0c22:
            X.C61752qC.A00(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70713Cf.run():void");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.2Wu, java.lang.Object] */
    public String toString() {
        switch (this.A00) {
            case 7:
                String simpleName = getClass().getSimpleName();
                C199610h.A04(simpleName);
                Object obj = this.A01;
                new Object().A00 = obj;
                StringBuilder sb = new StringBuilder(32);
                sb.append(simpleName);
                sb.append('{');
                sb.append("");
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(AnonymousClass000.A1b(obj, 1));
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                return C17890vO.A0b(sb);
            case 14:
                return this.A02.toString();
            default:
                return super.toString();
        }
    }
}
