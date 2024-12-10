package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class A7S {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1HQ A02;
    public final AnonymousClass1VE A03;
    public final C56752hy A04;
    public final A99 A05;
    public final C190529l6 A06;
    public final C21501AlA A07;
    public final C27301Vn A08;
    public final AnonymousClass1TD A09;
    public final AnonymousClass1TA A0A;
    public final AnonymousClass1MW A0B;
    public final C18030ve A0C;
    public final AnonymousClass10I A0D;
    public final C138426x3 A0E;
    public final C27081Uq A0F;
    public final AnonymousClass1DC A0G;
    public final boolean A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cb, code lost:
        if (r4 == false) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C178119Bw A04(com.whatsapp.jid.DeviceJid r39, com.whatsapp.jid.UserJid r40, java.lang.String r41, int r42, long r43, boolean r45) {
        /*
            r38 = this;
            r7 = 0
            r2 = r38
            r5 = r40
            r4 = r41
            r3 = r42
            X.9Bw r6 = r2.A05(r5, r4, r3, r7)
            if (r6 != 0) goto L_0x01ed
            X.9Bw r6 = r2.A06(r4)
            r31 = r43
            if (r6 == 0) goto L_0x01ca
            X.C178119Bw.A00(r6)
            int r1 = r6.A09
            r0 = 8
            if (r1 == r0) goto L_0x01ed
            java.lang.String r0 = X.C40811vJ.A0A(r4)
            X.4cT r8 = new X.4cT
            r8.<init>(r3, r5, r0, r7)
            int r0 = r6.A08
            X.1TD r5 = r2.A09
            if (r0 != 0) goto L_0x01c5
            X.9Bw r0 = r5.A07(r8)
            boolean r2 = X.AnonymousClass000.A1X(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallsMessageStore/replaceCallLogOnCurrentThread callLog already exists for this key="
            java.lang.String r0 = X.AnonymousClass001.A1E(r8, r0, r1)
            X.C17960vV.A0G(r2, r0)
            java.util.ArrayList r0 = r6.A0B()
            java.util.ArrayList r10 = X.C108975cc.A0g(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0050:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r9.next()
            X.9Bv r0 = (X.C178109Bv) r0
            com.whatsapp.jid.UserJid r4 = r0.A00
            int r3 = r0.A01
            r0 = -1
            X.9Bv r2 = new X.9Bv
            r2.<init>(r4, r3, r0)
            r10.add(r2)
            goto L_0x0050
        L_0x006b:
            X.22J r0 = r6.A03
            r18 = r0
            boolean r0 = r6.A0J
            r35 = r0
            int r0 = r6.A08
            r25 = r0
            int r0 = r6.A06
            r26 = r0
            X.9Il r20 = r6.A0A()
            long r3 = r6.A0A
            boolean r0 = r6.A05
            r36 = r0
            com.whatsapp.jid.GroupJid r0 = r6.A0C
            r17 = r0
            boolean r15 = r6.A0I
            com.whatsapp.jid.DeviceJid r14 = r6.A02
            java.lang.String r13 = r6.A0G
            X.C178119Bw.A00(r6)
            int r12 = r6.A09
            X.2Q4 r11 = r6.A0E
            X.2m4 r9 = r6.A0B
            int r1 = r6.A07
            X.2kW r0 = r6.A0F
            r29 = -1
            X.9Bw r2 = new X.9Bw
            r16 = r14
            r19 = r8
            r21 = r11
            r22 = r0
            r23 = r13
            r24 = r10
            r27 = r12
            r28 = r1
            r33 = r3
            r37 = r15
            r14 = r2
            r15 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r36, r37)
            X.1TB r3 = r5.A04
            monitor-enter(r3)
            monitor-enter(r2)     // Catch:{ all -> 0x01c2 }
            boolean r4 = r2.A04()     // Catch:{ all -> 0x01bb }
            int r10 = r2.A01     // Catch:{ all -> 0x01bb }
            monitor-exit(r2)     // Catch:{ all -> 0x01c2 }
            boolean r0 = r2.A05     // Catch:{ all -> 0x01c2 }
            r16 = 1
            if (r0 != 0) goto L_0x00cd
            r1 = 1
            if (r4 != 0) goto L_0x00ce
        L_0x00cd:
            r1 = 0
        L_0x00ce:
            java.lang.String r0 = "Only regular call log is stored here"
            X.C17960vV.A0G(r1, r0)     // Catch:{ all -> 0x01c2 }
            X.1Cd r0 = r3.A06     // Catch:{ all -> 0x01c2 }
            X.1au r15 = r0.A05()     // Catch:{ all -> 0x01c2 }
            X.1xA r14 = r15.BD0()     // Catch:{ all -> 0x01b4 }
            r0 = r15
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01aa }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x01aa }
            java.lang.String r9 = "call_log"
            java.lang.String r13 = "jid_row_id = ? AND from_me = ? AND call_id = ? AND transaction_id = ?"
            r0 = 4
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ all -> 0x01aa }
            X.1DL r1 = r3.A04     // Catch:{ all -> 0x01aa }
            X.4cT r4 = r6.A04     // Catch:{ all -> 0x01aa }
            com.whatsapp.jid.UserJid r0 = r4.A01     // Catch:{ all -> 0x01aa }
            long r0 = r1.A09(r0)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x01aa }
            r12[r7] = r0     // Catch:{ all -> 0x01aa }
            boolean r0 = r4.A03     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0139
            java.lang.String r0 = "1"
        L_0x00ff:
            r12[r16] = r0     // Catch:{ all -> 0x01aa }
            java.lang.String r1 = r4.A02     // Catch:{ all -> 0x01aa }
            r0 = 2
            r12[r0] = r1     // Catch:{ all -> 0x01aa }
            int r0 = r4.A00     // Catch:{ all -> 0x01aa }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x01aa }
            r0 = 3
            r12[r0] = r1     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "deleteCallLog/DELETE_CALL_LOG"
            r11.A04(r9, r13, r0, r12)     // Catch:{ all -> 0x01aa }
            X.4cT r0 = r2.A04     // Catch:{ all -> 0x01aa }
            android.content.ContentValues r1 = X.AnonymousClass1TB.A00(r3, r2, r0)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "insertCallLog/INSERT_CALL_LOG"
            long r0 = r11.A06(r9, r0, r1)     // Catch:{ all -> 0x01aa }
            r2.A03(r0)     // Catch:{ all -> 0x01aa }
            X.2Q4 r0 = r2.A0E     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0137
            X.2Q4 r9 = r2.A0E     // Catch:{ all -> 0x01aa }
            long r0 = r2.A01()     // Catch:{ all -> 0x01aa }
            r9.A03(r0)     // Catch:{ all -> 0x01aa }
            X.1TA r1 = r3.A05     // Catch:{ all -> 0x01aa }
            X.2Q4 r0 = r2.A0E     // Catch:{ all -> 0x01aa }
            r1.A06(r0)     // Catch:{ all -> 0x01aa }
        L_0x0137:
            monitor-enter(r2)     // Catch:{ all -> 0x01aa }
            goto L_0x013c
        L_0x0139:
            java.lang.String r0 = "0"
            goto L_0x00ff
        L_0x013c:
            int r0 = r2.A01     // Catch:{ all -> 0x01a7 }
            if (r10 != r0) goto L_0x0146
            r2.A02 = r7     // Catch:{ all -> 0x01a7 }
            int r0 = r0 + 1
            r2.A01 = r0     // Catch:{ all -> 0x01a7 }
        L_0x0146:
            monitor-exit(r2)     // Catch:{ all -> 0x01aa }
            X.AnonymousClass1TB.A02(r3, r2)     // Catch:{ all -> 0x01aa }
            r14.A00()     // Catch:{ all -> 0x01aa }
            r14.close()     // Catch:{ all -> 0x01b4 }
            r15.close()     // Catch:{ all -> 0x01c2 }
            monitor-exit(r3)
            X.1TE r0 = r5.A00
            r0.A01(r6)
            r0.A00(r2)
            X.00H r0 = r5.A0E
            java.lang.Object r3 = r0.get()
            X.1gM r3 = (X.C31931gM) r3
            r0 = 45
            X.3Bw r1 = new X.3Bw
            r1.<init>(r5, r2, r0)
            r0 = 16
            r3.A01(r1, r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallsMessageStore/replaceCallLogOnCurrentThread; callLog.key="
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = "; callLog.row_id="
            r3.append(r0)
            long r0 = r6.A01()
            r3.append(r0)
            java.lang.String r0 = "; callLog.timestamp="
            r3.append(r0)
            long r0 = r6.A01
            r3.append(r0)
            java.lang.String r0 = "; new key="
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = "; new row_id="
            r3.append(r0)
            long r0 = r2.A01()
            X.C17890vO.A16(r3, r0)
            return r2
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01aa }
            throw r0     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x01af }
            goto L_0x01b3
        L_0x01af:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01b4 }
        L_0x01b3:
            throw r1     // Catch:{ all -> 0x01b4 }
        L_0x01b4:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x01b9 }
            goto L_0x01c1
        L_0x01b9:
            r0 = move-exception
            goto L_0x01be
        L_0x01bb:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01c2 }
            goto L_0x01c1
        L_0x01be:
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01c2 }
        L_0x01c1:
            throw r1     // Catch:{ all -> 0x01c2 }
        L_0x01c2:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01c5:
            X.9Bw r6 = r5.A06(r6, r8)
            return r6
        L_0x01ca:
            X.1TD r2 = r2.A09
            java.lang.String r1 = X.C40811vJ.A0A(r4)
            r30 = 0
            X.4cT r0 = new X.4cT
            r0.<init>(r3, r5, r1, r7)
            X.AnonymousClass1TD.A03(r2, r0)
            X.9Bw r6 = new X.9Bw
            r28 = r39
            r33 = r45
            r27 = r6
            r29 = r0
            r27.<init>(r28, r29, r30, r31, r33)
            X.AnonymousClass1TD.A00(r2, r6)
            X.AnonymousClass1TD.A01(r2, r6)
        L_0x01ed:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7S.A04(com.whatsapp.jid.DeviceJid, com.whatsapp.jid.UserJid, java.lang.String, int, long, boolean):X.9Bw");
    }

    public void A07(GroupJid groupJid, C178119Bw r11, String str) {
        GroupJid groupJid2 = groupJid;
        if (groupJid != null) {
            String str2 = str;
            if (!TextUtils.isEmpty(str) && this.A0H) {
                C17900vP.A0f("voip/setCallLogIsScheduledCall scheduledId:", str, AnonymousClass000.A10());
                r11.A0F(1);
                C58332kW r1 = new C58332kW(str);
                synchronized (r11) {
                    if (!C42171xk.A00(r11.A0F, r1)) {
                        r11.A0F = r1;
                        r11.A02();
                    }
                }
                C27081Uq r3 = this.A0F;
                ((C31931gM) r3.A04.get()).A01(new C21366Aiv(r3, groupJid2, str2, 5, r11.A01()), 68);
            }
        }
    }

    public void A09(C178119Bw r7, boolean z) {
        synchronized (r7) {
            if (r7.A0I != z) {
                r7.A0I = z;
                r7.A02();
            }
        }
        String A092 = C40811vJ.A09(r7.A09().A02);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/setCallLogIsJoinableGroupCall callId:");
        A10.append(A092);
        C17900vP.A0n(" joinable:", A10, z);
        if (z) {
            C17960vV.A0F(AnonymousClass000.A1W(r7.A02), "Can't rejoin from call logs missing call creator");
            C138426x3 r3 = this.A0E;
            r3.A03.execute(new AnonymousClass7RL(r3, r7, 8));
            if (r7.A0E == null) {
                GroupJid groupJid = r7.A0C;
                if (groupJid != null) {
                    this.A07.execute(new C21467AkY(this, groupJid, r7.A04.A02, 0));
                }
                r7.A0K(new AnonymousClass2Q4(r7.A0C, r7.A09().A02, r7.A01(), r7.A0J));
                return;
            }
            return;
        }
        C138426x3 r32 = this.A0E;
        r32.A03.execute(new AnonymousClass7RL(r32, r7, 9));
        if (r7.A0E != null) {
            r7.A0K((AnonymousClass2Q4) null);
            A01(this, r7);
            synchronized (this) {
                if (r7.A0W() && r7.A0E == null) {
                    Iterator it = r7.A0B().iterator();
                    while (it.hasNext()) {
                        UserJid userJid = ((C178109Bv) it.next()).A00;
                        if (!r7.A0a(userJid)) {
                            synchronized (r7) {
                                C178109Bv r1 = (C178109Bv) r7.A00.get(userJid);
                                if (r1 != null) {
                                    r7.A0K.add(r1);
                                    r7.A00.remove(userJid);
                                    r7.A02();
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.A03.A08(A092);
    }

    public void A0A(C178119Bw r8, AnonymousClass1B7[] r9) {
        String str;
        int i = 0;
        if (r9 != null) {
            HashSet A12 = C17880vN.A12();
            HashSet A122 = C17880vN.A12();
            for (AnonymousClass1B7 r1 : r9) {
                if (r1 != null) {
                    A12.add(r1.getCallUserJid());
                    if (r1.isCallConnected()) {
                        A122.add(r1.getCallUserJid());
                    }
                }
            }
            Iterator it = r8.A0B().iterator();
            while (it.hasNext()) {
                C178109Bv r0 = (C178109Bv) it.next();
                if (r0 != null) {
                    A12.add(r0.A00);
                }
            }
            Iterator it2 = A12.iterator();
            while (true) {
                int i2 = 2;
                if (!it2.hasNext()) {
                    break;
                }
                UserJid userJid = (UserJid) it2.next();
                boolean contains = A122.contains(userJid);
                if (contains) {
                    i2 = 5;
                } else if (r8.A0a(userJid)) {
                    i2 = 100;
                }
                r8.A0J(userJid, i2);
                if (contains) {
                    i++;
                }
            }
            if (i >= 2) {
                A99 a99 = this.A05;
                GroupJid groupJid = r8.A0C;
                if (r8.A0F != null) {
                    str = r8.A0F.A00;
                } else {
                    str = null;
                }
                if (groupJid != null && !TextUtils.isEmpty(str) && a99.A3l) {
                    a99.A31.CGN(new C21467AkY(a99, groupJid, str, 2));
                    return;
                }
                return;
            }
            return;
        }
        C17960vV.A0F(false, "Empty list of participant jids when updating call log");
    }

    public static void A00(A7S a7s, C178119Bw r4) {
        if (C18020vd.A05(C18040vf.A02, a7s.A0C, 12680)) {
            C17960vV.A0F(a7s.A07.A00.A06(), "Not on call log serial executor");
            a7s.A09.A0B(r4);
            return;
        }
        a7s.A09.A0A(r4);
    }

    public static void A01(A7S a7s, C178119Bw r4) {
        C179559Il r1;
        if (r4.A04.A03) {
            r1 = C179559Il.NONE;
        } else {
            A99 a99 = a7s.A05;
            if (a99.A44.A00) {
                if (C18020vd.A05(C18040vf.A02, a99.A2p, 6307)) {
                    r1 = C179559Il.A03;
                }
            }
            if (a99.A44.A03) {
                if (C18020vd.A05(C18040vf.A02, a99.A2p, 6307)) {
                    r1 = C179559Il.A02;
                }
            }
            if (a99.A44.A02) {
                r1 = C179559Il.A04;
            } else if (a99.A44.A01) {
                r1 = C179559Il.A05;
            } else {
                return;
            }
        }
        synchronized (r4) {
            if (r4.A0D != r1) {
                r4.A0D = r1;
                r4.A02();
            }
        }
    }

    public static void A02(CallInfo callInfo, C178119Bw r5) {
        Iterator A15 = AnonymousClass000.A15(callInfo.participants);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            UserJid userJid = (UserJid) A16.getKey();
            int i = ((C134216qE) A16.getValue()).A04;
            int i2 = 2;
            if (i == 1) {
                i2 = 5;
            }
            r5.A0J(userJid, i2);
        }
    }

    public static boolean A03(CallInfo callInfo, String str) {
        if (callInfo == null || str == null || !str.equals(callInfo.callId) || !callInfo.isBotCall) {
            return true;
        }
        return false;
    }

    public C178119Bw A05(UserJid userJid, String str, int i, boolean z) {
        if (!A03(this.A02.BO3(), str)) {
            return null;
        }
        return this.A09.A07(new C89444cT(i, userJid, C40811vJ.A0A(str), z));
    }

    public C178119Bw A06(String str) {
        AnonymousClass2Q4 A042 = this.A0A.A04(C40811vJ.A0A(str));
        if (A042 != null) {
            return this.A09.A05(A042.A01());
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.2MM, X.20i, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (X.C40811vJ.A0C(r6.A00, r6.A02) != false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(com.whatsapp.jid.GroupJid r8, X.C178119Bw r9, java.lang.String r10, int r11) {
        /*
            r7 = this;
            X.2Q4 r0 = r9.A0E
            if (r0 == 0) goto L_0x0014
            X.2Q4 r0 = r9.A0E
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r0 = X.C42171xk.A00(r0, r8)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "VoiceService/setGroupJidInCallLog: mismatched groupJid in joinableCallLog and callLog"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0013:
            return
        L_0x0014:
            if (r8 == 0) goto L_0x002c
            r0 = 2
            if (r11 == r0) goto L_0x001c
            r0 = 3
            if (r11 != r0) goto L_0x002c
        L_0x001c:
            X.11S r0 = r7.A01
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "voip/setCallLogIsAudioChat true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A0F(r11)
        L_0x002c:
            com.whatsapp.jid.GroupJid r0 = r9.A0C
            if (r0 != 0) goto L_0x0013
            if (r8 == 0) goto L_0x0013
            r9.A0I(r8)
            X.1TD r5 = r7.A09
            boolean r1 = X.AnonymousClass8BR.A1S(r10)
            com.whatsapp.jid.GroupJid r0 = r9.A0C
            if (r0 == 0) goto L_0x0013
            if (r1 != 0) goto L_0x0013
            X.1CJ r1 = r5.A05
            com.whatsapp.jid.GroupJid r0 = r9.A0C
            X.1ci r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x0013
            com.whatsapp.jid.GroupJid r0 = r9.A0C
            if (r0 != 0) goto L_0x0013
            X.1TC r6 = r5.A02
            X.1PP r1 = r6.A03
            com.whatsapp.jid.GroupJid r0 = r9.A0C
            X.205 r3 = X.C17880vN.A0Z(r0, r1)
            long r0 = r9.A01
            r2 = 70
            X.2MM r4 = new X.2MM
            r4.<init>(r3, r2, r0)
            boolean r0 = r9.A0W()
            if (r0 == 0) goto L_0x0072
            X.0ve r1 = r6.A02
            X.11S r0 = r6.A00
            boolean r0 = X.C40811vJ.A0C(r0, r1)
            if (r0 == 0) goto L_0x0076
        L_0x0072:
            int r0 = r9.A07
            r4.A00 = r0
        L_0x0076:
            X.4cT r3 = r9.A04
            com.whatsapp.jid.UserJid r2 = r3.A01
            java.lang.Class r0 = r2.getClass()
            boolean r1 = r0.equals(r0)
            java.lang.String r0 = "Jid disparity between callLog.key.jid and callLog.getRemoteJid"
            X.C17960vV.A0F(r1, r0)
            boolean r1 = r9.A0P()
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0095
            X.11S r0 = r6.A00
            com.whatsapp.jid.UserJid r2 = X.C40811vJ.A01(r0, r1)
        L_0x0095:
            r4.A0d(r2)
            boolean r0 = r9.A0J
            r4.A02 = r0
            java.lang.String r0 = r3.A02
            java.lang.String r0 = X.C40811vJ.A09(r0)
            r4.A01 = r0
            X.121 r0 = r5.A06
            r0.BBM(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7S.A08(com.whatsapp.jid.GroupJid, X.9Bw, java.lang.String, int):void");
    }

    public A7S(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass1HQ r4, AnonymousClass1VE r5, C56752hy r6, A99 a99, C190529l6 r8, C21501AlA alA, C138426x3 r10, C27301Vn r11, AnonymousClass1TD r12, AnonymousClass1TA r13, AnonymousClass1MW r14, C27081Uq r15, C18030ve r16, AnonymousClass1DC r17, AnonymousClass10I r18, boolean z) {
        this.A0C = r16;
        this.A00 = r2;
        this.A01 = r3;
        this.A0D = r18;
        this.A02 = r4;
        this.A05 = a99;
        this.A0G = r17;
        this.A09 = r12;
        this.A04 = r6;
        this.A06 = r8;
        this.A0F = r15;
        this.A0A = r13;
        this.A03 = r5;
        this.A08 = r11;
        this.A0E = r10;
        this.A0B = r14;
        this.A0H = z;
        this.A07 = alA;
    }
}
