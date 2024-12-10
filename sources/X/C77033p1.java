package X;

import android.database.Cursor;
import com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.group.GetSubgroupsManager;
import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import com.whatsapp.jid.GroupJid;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3p1  reason: invalid class name and case insensitive filesystem */
public class C77033p1 extends AnonymousClass3Uc {
    public C93924jl A00;
    public final C98864rq A01;
    public final AtomicBoolean A02 = new AtomicBoolean(true);
    public final C18090vk A03 = new C99144sL(this, 34);
    public final C18090vk A04 = new C99144sL(this, 33);
    public final C107955at A05;
    public final AnonymousClass1WR A06;
    public final C83154Ea A07;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.4rq, java.lang.Object] */
    public C77033p1(AnonymousClass190 r8, AnonymousClass4Ix r9, C56352hK r10, C34511kb r11, C187239fU r12, C93914jk r13, C87834Xg r14, GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper, MemberSuggestedGroupsManager memberSuggestedGroupsManager, C57792je r17, C58672l4 r18, AnonymousClass1M9 r19, C24921Me r20, AnonymousClass11P r21, AnonymousClass1CJ r22, AnonymousClass1NN r23, AnonymousClass122 r24, AnonymousClass1QB r25, AnonymousClass1MZ r26, AnonymousClass1R3 r27, C24681Lg r28, AnonymousClass4XG r29, C88194Yr r30, C18030ve r31, GetSubgroupsManager getSubgroupsManager, AnonymousClass126 r33, AnonymousClass12M r34, AnonymousClass1MG r35, C26211Rg r36, GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, C42211xo r38, AnonymousClass1EC r39, C25011Mn r40, C28401aA r41, C27001Ui r42, AnonymousClass1W6 r43, AnonymousClass10I r44, AnonymousClass1OX r45, int i) {
        super(r8, r9, r10, r11, r12, r13, r14, getGroupProfilePicturesProtocolHelper, memberSuggestedGroupsManager, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, getSubgroupsManager, r33, r34, r35, r36, getGroupInfoProtocolHelper, r38, r39, r40, r41, r42, r43, r44, r45, i);
        C95514mM r3 = new C95514mM(this, 1);
        this.A06 = r3;
        AnonymousClass412 r2 = new AnonymousClass412(this, 1);
        this.A07 = r2;
        C93884jh r1 = new C93884jh(this, 0);
        this.A05 = r1;
        this.A01 = new Object();
        this.A0M.A01(r1);
        r28.registerObserver(r3);
        r36.registerObserver(r2);
        C22801Dg r4 = this.A0C;
        r4.A0H(this.A0y, new C91584fv(this, 25));
        r4.A0H(C22791Df.A01(this.A0O.A03, new C99234sU(5)), new C91584fv(this, 25));
    }

    public static C77033p1 A00(AnonymousClass1FD r2, C84284Iw r3, C88114Yj r4, AnonymousClass1EC r5, int i) {
        return (C77033p1) new C24071It(new C91684g5(r3, r4, r5, i), r2).A00(C77033p1.class);
    }

    public static void A03(C77033p1 r2) {
        List list = r2.A1B;
        list.clear();
        list.addAll(r2.A17);
        list.addAll(r2.A16);
        r2.A0x.A0E(list);
    }

    public static void A04(C77033p1 r11) {
        long j;
        if (r11.A03 != null) {
            long j2 = r11.A01 * 1000;
            AnonymousClass122 r3 = r11.A0b;
            AnonymousClass1EC r4 = r11.A0q;
            long BTu = r3.BTu(r4, j2);
            C29691ci r2 = r11.A03;
            synchronized (r2) {
                j = r2.A0P;
            }
            Cursor Ba5 = r3.Ba5(r4, BTu, j, System.currentTimeMillis());
            if (Ba5 != null) {
                while (Ba5.moveToNext()) {
                    try {
                        r11.A0A(r11.A0u.A02(Ba5, r4), j2);
                    } catch (Throwable th) {
                        AnonymousClass0DT.A00(th, th);
                        throw th;
                    }
                }
                Ba5.close();
                r11.A0A(r11.A0u.A01.A03(j), j2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A0i, 8070) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.C77033p1 r5) {
        /*
            int r4 = r5.A0B
            r3 = 1
            if (r4 == r3) goto L_0x0011
            X.0ve r2 = r5.A0i
            r1 = 8070(0x1f86, float:1.1308E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0018
        L_0x0011:
            com.whatsapp.group.GetSubgroupsManager r1 = r5.A0j
            X.1EC r0 = r5.A0q
            r1.A05(r0)
        L_0x0018:
            A06(r5)
            X.1E7 r0 = r5.A04
            if (r0 == 0) goto L_0x002c
            if (r4 != r3) goto L_0x002c
            X.1Ui r4 = r5.A0t
            X.1EC r3 = r5.A0q
            int r2 = r0.A08
            r1 = 2
            r0 = 0
            r4.A02(r3, r0, r2, r1)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77033p1.A05(X.3p1):void");
    }

    public static void A06(C77033p1 r6) {
        GroupJid groupJid;
        boolean z;
        AnonymousClass4YM r1;
        C34511kb r5 = r6.A0N;
        AnonymousClass1EC r4 = r6.A0q;
        A2B A012 = r5.A01(r4);
        if (A012 != null) {
            groupJid = A012.A02;
        } else {
            groupJid = null;
        }
        if (r6.A0p.A01(r6.A04)) {
            r1 = new AnonymousClass4YM();
        } else {
            AnonymousClass1MZ r12 = r6.A0d;
            if (r12.A0K(r4) || (groupJid != null && r12.A0J(groupJid) && !r12.A0K(r4))) {
                z = true;
            } else {
                z = false;
            }
            boolean A0K = r12.A0K(r4);
            C42211xo A0i = AnonymousClass3MX.A0i(r5.A0C);
            r1 = new AnonymousClass4YM(A0K, z, !A0i.A00(A0i.A00.A0H(r4)));
        }
        r6.A0v.A0E(r1);
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0147, code lost:
        if (r12 != 0) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014c, code lost:
        if (r1 == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014e, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014f, code lost:
        if (r2 == false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0154, code lost:
        if (r5.A0B == 1) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0157, code lost:
        if (r10 <= 0) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0159, code lost:
        r0 = java.lang.Integer.toString(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015d, code lost:
        r6.put(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b1, code lost:
        if (r0 == null) goto L_0x01b3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.C77033p1 r16) {
        /*
            r5 = r16
            java.util.List r9 = r5.A17
            r9.clear()
            java.util.List r4 = r5.A16
            r4.clear()
            X.1xo r1 = r5.A0p
            X.1E7 r0 = r5.A04
            boolean r0 = r1.A00(r0)
            java.lang.String r8 = " participating subgroups in "
            r7 = 0
            if (r0 == 0) goto L_0x009c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CommunitySubgroupsViewModel/updateSubgroups: parent is deactivated: "
            r1.append(r0)
            X.1EC r3 = r5.A0q
            X.C17900vP.A0b(r3, r1)
            X.1kb r11 = r5.A0N
            X.1MG r0 = r11.A08
            java.util.HashSet r0 = r0.A03(r3)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r14 = r0.iterator()
        L_0x003b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r2 = r14.next()
            r13 = r2
            X.A2B r13 = (X.A2B) r13
            X.00H r0 = r11.A0C
            X.1xo r12 = X.AnonymousClass3MX.A0i(r0)
            X.C18070vi.A0d(r13, r7)
            int r1 = r13.A00
            r0 = 1
            if (r1 == r0) goto L_0x005d
            r0 = 3
            if (r1 == r0) goto L_0x005d
        L_0x0059:
            r6.add(r2)
            goto L_0x003b
        L_0x005d:
            X.1M9 r1 = r12.A00
            com.whatsapp.jid.GroupJid r0 = r13.A02
            X.1E7 r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0059
            boolean r0 = r12.A00(r0)
            if (r0 == 0) goto L_0x0059
            r10.add(r2)
            goto L_0x003b
        L_0x0071:
            java.util.Iterator r6 = r6.iterator()
        L_0x0075:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r2 = r6.next()
            X.A2B r2 = (X.A2B) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CommunityChatManager/getTerminatedLinkedSubgroups - unexpected subgroup: "
            r1.append(r0)
            com.whatsapp.jid.GroupJid r0 = r2.A02
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0075
        L_0x0094:
            java.util.List r0 = X.C29431cG.A0q(r10)
            r9.addAll(r0)
            goto L_0x00fd
        L_0x009c:
            X.1kb r6 = r5.A0N
            X.1EC r3 = r5.A0q
            java.util.HashSet r0 = r6.A08(r3)
            java.util.List r2 = X.C29431cG.A0q(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CommunitySubgroupsViewModel/updateSubgroups: unfiltered "
            X.C17890vO.A15(r0, r1, r9)
            X.C17900vP.A0Y(r3, r8, r1)
            X.4jk r0 = r5.A0P
            X.4Yj r0 = r0.A00
            boolean r0 = r0.A0D
            if (r0 != 0) goto L_0x00c6
            r0 = 10
            X.4sV r0 = X.C99244sV.A00(r5, r0)
            java.util.List r2 = X.C29431cG.A0z(r2, r0)
        L_0x00c6:
            r9.addAll(r2)
            java.util.HashSet r0 = r6.A07(r3)
            java.util.List r10 = X.C29431cG.A0q(r0)
            X.4XG r0 = r5.A0g
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00fa
            r0 = 6
            X.4sU r6 = new X.4sU
            r6.<init>(r0)
            java.util.Iterator r2 = r10.iterator()
        L_0x00e3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r6.invoke(r1)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x00e3
            if (r1 == 0) goto L_0x00fa
            r7 = 1
        L_0x00fa:
            r4.addAll(r10)
        L_0x00fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CommunitySubgroupsViewModel/updateSubgroups: "
            X.C17890vO.A15(r0, r1, r9)
            X.C17900vP.A0Y(r3, r8, r1)
            A03(r5)
            r5.A0U()
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0173
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0173
            r8 = 0
            r5.A0A = r8
            java.util.HashMap r6 = X.C17880vN.A11()
            java.util.Iterator r16 = r4.iterator()
            r15 = 1
        L_0x0125:
            boolean r1 = r16.hasNext()
            r0 = 0
            if (r1 == 0) goto L_0x0161
            java.lang.Object r2 = r16.next()
            X.A2B r2 = (X.A2B) r2
            X.1M9 r1 = r5.A0W
            com.whatsapp.jid.GroupJid r11 = r2.A02
            X.1E7 r2 = r1.A0H(r11)
            int r10 = r2.A08
            boolean r1 = r2.A0g
            if (r1 != 0) goto L_0x0149
            long r1 = r2.A0E
            r13 = 0
            int r12 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            r2 = 0
            if (r12 == 0) goto L_0x014e
        L_0x0149:
            r2 = 1
            r1 = r15
            r15 = 1
            if (r1 != 0) goto L_0x0151
        L_0x014e:
            r15 = 0
            if (r2 == 0) goto L_0x0157
        L_0x0151:
            int r2 = r5.A0B
            r1 = 1
            if (r2 == r1) goto L_0x0157
            goto L_0x0125
        L_0x0157:
            if (r10 <= 0) goto L_0x015d
            java.lang.String r0 = java.lang.Integer.toString(r10)
        L_0x015d:
            r6.put(r11, r0)
            goto L_0x0125
        L_0x0161:
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x016e
            if (r15 == 0) goto L_0x01c4
            int r2 = r5.A0B
            r1 = 1
            if (r2 == r1) goto L_0x01c4
        L_0x016e:
            java.lang.String r0 = "CommunitySubgroupsViewModel/syncOtherSubgroupsPhotosIfNeeded/skipping"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0173:
            int r1 = r5.A0B
            if (r1 == 0) goto L_0x017b
            r0 = 3
            if (r1 == r0) goto L_0x017b
        L_0x017a:
            return
        L_0x017b:
            if (r7 != 0) goto L_0x018d
            X.4XG r0 = r5.A0g
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x017a
            com.whatsapp.group.GetSubgroupsManager r0 = r5.A0j
            boolean r0 = r0.A06(r3)
            if (r0 == 0) goto L_0x017a
        L_0x018d:
            com.whatsapp.group.GetSubgroupsManager r7 = r5.A0j
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.00H r0 = r7.A01
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r0)
            com.whatsapp.jid.GroupJid r0 = r0.A02(r3)
            X.1EC r9 = X.C42941yz.A00(r0)
            if (r9 == 0) goto L_0x01b3
            r11 = 0
            com.whatsapp.group.GetSubgroupsManager$fetchSubgroupMemberCount$1$1 r6 = new com.whatsapp.group.GetSubgroupsManager$fetchSubgroupMemberCount$1$1
            r10 = r4
            r8 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            X.1OR r0 = X.AnonymousClass1OR.A00
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r0, r6)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x01b7
        L_0x01b3:
            java.util.List r0 = X.C29431cG.A0t(r4)
        L_0x01b7:
            r4.clear()
            r4.addAll(r0)
            A03(r5)
            r5.A0U()
            return
        L_0x01c4:
            com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper r2 = r5.A0S
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x01d6
            java.lang.Object r0 = r9.get(r8)
            X.A2B r0 = (X.A2B) r0
            com.whatsapp.jid.GroupJid r0 = r0.A02
            X.1EC r0 = (X.AnonymousClass1EC) r0
        L_0x01d6:
            r2.A02(r3, r0, r6)
            goto L_0x0173
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77033p1.A07(X.3p1):void");
    }

    public static void A08(C77033p1 r4) {
        AnonymousClass1E7 A0E = r4.A0W.A0E(r4.A0q);
        r4.A04 = A0E;
        if (A0E != null && (A0E.A0J instanceof AnonymousClass1EC)) {
            A0E.A0L = new C53792d6((AnonymousClass1EC) null, 1);
        }
        r4.A0F.A0E(r4.A04);
        AnonymousClass1E7 r2 = r4.A04;
        if (r2 != null) {
            r4.A0D.A0E(r4.A0X.A0I(r2));
        }
    }

    private void A0A(AnonymousClass206 r4, long j) {
        Set<A2B> A1E;
        if (r4 instanceof AnonymousClass98B) {
            AnonymousClass98B r42 = (AnonymousClass98B) r4;
            if (r42.A00 == 88 && r42.A0I > j) {
                A1E = r42.A03;
            } else {
                return;
            }
        } else if (r4 instanceof AnonymousClass98N) {
            C48342Mc r43 = (C48342Mc) r4;
            if (r43.A0I > j) {
                A1E = r43.A1E();
            } else {
                return;
            }
        } else {
            return;
        }
        if (A1E != null) {
            for (A2B a2b : A1E) {
                this.A18.add(a2b.A02);
            }
        }
    }

    private void A0B(Object obj, Object obj2, List list, int i) {
        if (this.A0P.CP4(i, obj) && this.A00.CP4(i, obj)) {
            list.add(new C58482kl(obj, i, obj2));
        }
    }

    private boolean A0C() {
        AnonymousClass4YA r0 = this.A02;
        if (r0 == null || r0.A01 <= 0) {
            return false;
        }
        C18030ve r1 = this.A0g.A01;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 8128)) {
            return true;
        }
        C18030ve r12 = this.A0i;
        if (!C18020vd.A05(r2, r12, 5563) || C18020vd.A05(r2, r12, 9027)) {
            return true;
        }
        return false;
    }

    public void A0S() {
        this.A0M.A02(this.A05);
        this.A0f.unregisterObserver(this.A06);
        this.A0n.unregisterObserver(this.A07);
    }

    public static void A09(C77033p1 r1, Object obj, List list, int i) {
        r1.A0B(obj, Integer.valueOf(i), list, i);
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, X.4FK] */
    /* JADX WARNING: type inference failed for: r7v8, types: [X.4FL, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e8, code lost:
        if (r18.isEmpty() == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ea, code lost:
        r7 = r8.A0I;
        r0 = 2131892978;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ef, code lost:
        if (r7 == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f1, code lost:
        r0 = 2131892977;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f4, code lost:
        r1 = java.lang.Integer.valueOf(r0);
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f9, code lost:
        if (r7 == false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fb, code lost:
        r0 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01fd, code lost:
        A09(r5, r1, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0200, code lost:
        if (r9 == false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A0g.A01, 8128) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0202, code lost:
        A09(r5, r3, r6, 11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0209, code lost:
        if (r18.isEmpty() != false) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x020b, code lost:
        r9 = X.AnonymousClass000.A13();
        r16 = r18.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0217, code lost:
        if (r16.hasNext() == false) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0219, code lost:
        r7 = (X.A2B) r16.next();
        r12 = r5.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0225, code lost:
        if (r12.A00() == false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0227, code lost:
        r0 = r5.A0W;
        r1 = r7.A02;
        r0 = r0.A0E(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x022f, code lost:
        if (r0 == null) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0233, code lost:
        if (r0.A0n == false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x023b, code lost:
        if (X.AnonymousClass3MX.A1Z(r5.A0i) == false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x023d, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x023f, code lost:
        r0 = r5.A0W.A0H(r1);
        r9.add(new X.AnonymousClass4V0(r7, r3, r7.A03, r7.A04, r24, r0.A0n));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0260, code lost:
        r10 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0262, code lost:
        if (r10 == null) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0264, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0275, code lost:
        if ((X.AnonymousClass11P.A01(r12.A00) - r10.longValue()) <= X.AnonymousClass4XG.A02) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0278, code lost:
        r0 = r5.A18;
        r1 = r7.A02;
        r24 = r0.contains(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0281, code lost:
        r10 = java.lang.Math.min(r5.A00, r9.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x028c, code lost:
        if (r10 != -1) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x028e, code lost:
        r10 = r9.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0292, code lost:
        java.util.Collections.sort(r9, r5.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0297, code lost:
        if (r11 >= r10) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0299, code lost:
        r7 = (X.AnonymousClass4V0) r9.get(r11);
        A0B(r7, r7.A00.A02, r6, 4);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02ae, code lost:
        if (r9.size() <= r10) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02b0, code lost:
        r7 = r5.A03;
        X.C18070vi.A0d(r7, 2);
        r1 = new java.lang.Object();
        r1.A00 = r9.size() - r10;
        r1.A01 = r7;
        A09(r5, r1, r6, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02cd, code lost:
        if (r4.size() > 2) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d9, code lost:
        if (X.C29431cG.A19(r4, X.C99244sV.A00(r5, 9)) == false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02df, code lost:
        if (r18.isEmpty() == false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02e3, code lost:
        if (r8.A0A == false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02e9, code lost:
        if (r4.size() != 1) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02eb, code lost:
        A09(r5, 2131889751, r6, 13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02f7, code lost:
        A09(r5, java.lang.Integer.valueOf(r4.size()), r6, 17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
        if (X.C18020vd.A05(r1, r2, 9027) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b8, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A0i, 9027) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r0.intValue() <= 0) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        if (A0C() != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c2, code lost:
        if (r0 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c4, code lost:
        r8 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c6, code lost:
        A09(r5, new X.C87184Up(r3, r5.A06, java.lang.Integer.valueOf(r8), r5.A05, r5.A19), r6, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e1, code lost:
        if (r0 == false) goto L_0x01e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U() {
        /*
            r26 = this;
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            r5 = r26
            java.util.List r0 = r5.A17
            java.util.ArrayList r4 = X.C17880vN.A10(r0)
            java.util.List r0 = r5.A16
            java.util.ArrayList r18 = X.C17880vN.A10(r0)
            X.4rv r0 = r5.A0R
            java.util.Collections.sort(r4, r0)
            X.1xo r1 = r5.A0p
            X.1E7 r0 = r5.A04
            boolean r17 = r1.A01(r0)
            X.1EC r3 = r5.A0q
            r0 = 1
            A09(r5, r3, r6, r0)
            java.lang.Integer r0 = r5.A06
            r10 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0032
            int r0 = r0.intValue()
            r9 = 1
            if (r0 > 0) goto L_0x0033
        L_0x0032:
            r9 = 0
        L_0x0033:
            X.4YA r0 = r5.A02
            if (r0 == 0) goto L_0x004a
            int r0 = r0.A01
            if (r0 <= 0) goto L_0x004a
            X.4XG r0 = r5.A0g
            X.0ve r2 = r0.A01
            r1 = 8128(0x1fc0, float:1.139E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r7 = 1
            if (r0 == 0) goto L_0x004b
        L_0x004a:
            r7 = 0
        L_0x004b:
            java.lang.Integer r0 = r5.A05
            if (r0 == 0) goto L_0x0056
            int r0 = r0.intValue()
            if (r0 > 0) goto L_0x0056
            r10 = 0
        L_0x0056:
            java.lang.Integer r0 = r5.A06
            if (r0 == 0) goto L_0x0094
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0094
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0094
            X.0ve r2 = r5.A0i
            r0 = 8704(0x2200, float:1.2197E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0094
            r0 = 5562(0x15ba, float:7.794E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0094
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.A02
            boolean r0 = r1.get()
            if (r0 == 0) goto L_0x008e
            r1.set(r8)
            X.1aA r2 = r5.A0s
            java.lang.String r1 = "community_events"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r2.A00(r1, r0)
        L_0x008e:
            r1 = 0
            r0 = 21
            A09(r5, r1, r6, r0)
        L_0x0094:
            if (r9 != 0) goto L_0x0098
            if (r7 == 0) goto L_0x00ac
        L_0x0098:
            X.0ve r2 = r5.A0i
            r0 = 5563(0x15bb, float:7.795E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00ac
            r0 = 9027(0x2343, float:1.265E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00ba
        L_0x00ac:
            if (r10 == 0) goto L_0x00df
            X.0ve r2 = r5.A0i
            r1 = 9027(0x2343, float:1.265E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00df
        L_0x00ba:
            boolean r0 = r5.A0C()
            if (r0 != 0) goto L_0x00c6
            X.4YA r0 = r5.A02
            if (r0 == 0) goto L_0x00c6
            int r8 = r0.A01
        L_0x00c6:
            java.lang.Integer r7 = r5.A06
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            X.1Di r2 = r5.A19
            java.lang.Integer r0 = r5.A05
            X.4Up r1 = new X.4Up
            r8 = r1
            r9 = r3
            r10 = r7
            r12 = r0
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = 20
            A09(r5, r1, r6, r0)
        L_0x00df:
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x00ff
            X.4YA r7 = r5.A02
            if (r7 == 0) goto L_0x00ff
            X.1Di r2 = r5.A19
            X.1MZ r0 = r5.A0d
            boolean r0 = r0.A0K(r3)
            if (r0 == 0) goto L_0x01c8
            X.4CT r0 = X.AnonymousClass4CT.ADMIN
        L_0x00f5:
            X.4UX r1 = new X.4UX
            r1.<init>(r0, r7, r3, r2)
            r0 = 18
            A09(r5, r1, r6, r0)
        L_0x00ff:
            if (r17 != 0) goto L_0x010e
            X.1MZ r0 = r5.A0d
            boolean r0 = r0.A0K(r3)
            if (r0 == 0) goto L_0x010e
            r0 = 14
            A09(r5, r3, r6, r0)
        L_0x010e:
            r0 = 15
            A09(r5, r3, r6, r0)
            X.4jk r9 = r5.A0P
            X.4Yj r8 = r9.A00
            boolean r0 = r8.A07
            if (r0 != 0) goto L_0x0149
            r0 = 11
            X.4sV r7 = X.C99244sV.A00(r5, r0)
            java.util.Iterator r2 = r4.iterator()
        L_0x0125:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r7.invoke(r1)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0125
        L_0x0139:
            X.A2B r1 = (X.A2B) r1
            if (r1 == 0) goto L_0x0149
            com.whatsapp.jid.GroupJid r2 = r1.A02
            r0 = 2
            X.1tO r1 = new X.1tO
            r1.<init>((X.AnonymousClass1BI) r2, (int) r0)
            r0 = 3
            r5.A0B(r1, r2, r6, r0)
        L_0x0149:
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x0304
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01cc
            java.util.Iterator r13 = r4.iterator()
            r12 = 0
            r11 = 0
        L_0x0159:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01cc
            java.lang.Object r10 = r13.next()
            X.A2B r10 = (X.A2B) r10
            boolean r0 = r8.A07
            r7 = 3
            if (r0 != 0) goto L_0x016f
            int r0 = r10.A00
            if (r0 != r7) goto L_0x016f
            goto L_0x0159
        L_0x016f:
            if (r12 != 0) goto L_0x0188
            boolean r2 = r8.A0I
            r0 = 2131893538(0x7f121d22, float:1.9421855E38)
            if (r2 == 0) goto L_0x017b
            r0 = 2131893537(0x7f121d21, float:1.9421853E38)
        L_0x017b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2
            if (r2 == 0) goto L_0x0184
            r0 = 13
        L_0x0184:
            A09(r5, r1, r6, r0)
            r12 = 1
        L_0x0188:
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x01b9
            X.1CJ r1 = r5.A0Z
            com.whatsapp.jid.GroupJid r0 = r10.A02
            boolean r0 = r1.A0Q(r0)
            if (r0 == 0) goto L_0x01b9
            if (r11 != 0) goto L_0x0159
            boolean r2 = r5.A08
            X.0vk r1 = r5.A04
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            X.4FL r7 = new X.4FL
            r7.<init>()
            r7.A01 = r2
            r7.A00 = r1
            r2 = 19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            X.2kl r0 = new X.2kl
            r0.<init>(r7, r2, r1)
            r6.add(r0)
            r11 = 1
            goto L_0x0159
        L_0x01b9:
            com.whatsapp.jid.GroupJid r2 = r10.A02
            r1 = 2
            X.1tO r0 = new X.1tO
            r0.<init>((X.AnonymousClass1BI) r2, (int) r1)
            r5.A0B(r0, r2, r6, r7)
            goto L_0x0159
        L_0x01c5:
            r1 = 0
            goto L_0x0139
        L_0x01c8:
            X.4CT r0 = X.AnonymousClass4CT.MEMBER
            goto L_0x00f5
        L_0x01cc:
            X.1vp r0 = r5.A0v
            java.lang.Object r0 = r0.A06()
            X.4YM r0 = (X.AnonymousClass4YM) r0
            boolean r0 = r0.A00
            r11 = 0
            r2 = 1
            r10 = 11
            if (r0 == 0) goto L_0x01e3
            boolean r0 = r9.CP4(r10, r3)
            r9 = 1
            if (r0 != 0) goto L_0x01ea
        L_0x01e3:
            r9 = 0
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x02c8
        L_0x01ea:
            boolean r7 = r8.A0I
            r0 = 2131892978(0x7f121af2, float:1.942072E38)
            if (r7 == 0) goto L_0x01f4
            r0 = 2131892977(0x7f121af1, float:1.9420718E38)
        L_0x01f4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2
            if (r7 == 0) goto L_0x01fd
            r0 = 13
        L_0x01fd:
            A09(r5, r1, r6, r0)
            if (r9 == 0) goto L_0x0205
            A09(r5, r3, r6, r10)
        L_0x0205:
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x02c8
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r16 = r18.iterator()
        L_0x0213:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0281
            java.lang.Object r7 = r16.next()
            X.A2B r7 = (X.A2B) r7
            X.4XG r12 = r5.A0g
            boolean r0 = r12.A00()
            if (r0 == 0) goto L_0x0278
            X.1M9 r0 = r5.A0W
            com.whatsapp.jid.GroupJid r1 = r7.A02
            X.1E7 r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x0260
            boolean r0 = r0.A0n
            if (r0 == 0) goto L_0x0260
            X.0ve r0 = r5.A0i
            boolean r0 = X.AnonymousClass3MX.A1Z(r0)
            if (r0 == 0) goto L_0x0260
        L_0x023d:
            r24 = 0
        L_0x023f:
            X.1M9 r0 = r5.A0W
            X.1E7 r0 = r0.A0H(r1)
            java.lang.Integer r12 = r7.A03
            java.lang.Integer r10 = r7.A04
            boolean r1 = r0.A0n
            X.4V0 r0 = new X.4V0
            r19 = r0
            r20 = r7
            r21 = r3
            r22 = r12
            r23 = r10
            r25 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r9.add(r0)
            goto L_0x0213
        L_0x0260:
            java.lang.Long r10 = r7.A05
            if (r10 == 0) goto L_0x023d
            X.11P r0 = r12.A00
            long r14 = X.AnonymousClass11P.A01(r0)
            long r12 = r10.longValue()
            long r14 = r14 - r12
            long r12 = X.AnonymousClass4XG.A02
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            r24 = 1
            if (r0 <= 0) goto L_0x023f
            goto L_0x023d
        L_0x0278:
            java.util.Set r0 = r5.A18
            com.whatsapp.jid.GroupJid r1 = r7.A02
            boolean r24 = r0.contains(r1)
            goto L_0x023f
        L_0x0281:
            int r1 = r5.A00
            int r0 = r9.size()
            int r10 = java.lang.Math.min(r1, r0)
            r0 = -1
            if (r10 != r0) goto L_0x0292
            int r10 = r9.size()
        L_0x0292:
            X.4rq r0 = r5.A01
            java.util.Collections.sort(r9, r0)
        L_0x0297:
            if (r11 >= r10) goto L_0x02aa
            java.lang.Object r7 = r9.get(r11)
            X.4V0 r7 = (X.AnonymousClass4V0) r7
            X.A2B r0 = r7.A00
            com.whatsapp.jid.GroupJid r1 = r0.A02
            r0 = 4
            r5.A0B(r7, r1, r6, r0)
            int r11 = r11 + 1
            goto L_0x0297
        L_0x02aa:
            int r0 = r9.size()
            if (r0 <= r10) goto L_0x02c8
            int r9 = r9.size()
            int r9 = r9 - r10
            X.0vk r7 = r5.A03
            r0 = 2
            X.C18070vi.A0d(r7, r0)
            X.4FK r1 = new X.4FK
            r1.<init>()
            r1.A00 = r9
            r1.A01 = r7
            r0 = 5
            A09(r5, r1, r6, r0)
        L_0x02c8:
            int r1 = r4.size()
            r0 = 2
            if (r1 > r0) goto L_0x0304
            r0 = 9
            X.4sV r0 = X.C99244sV.A00(r5, r0)
            boolean r0 = X.C29431cG.A19(r4, r0)
            if (r0 == 0) goto L_0x0304
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L_0x0304
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0304
            int r0 = r4.size()
            if (r0 != r2) goto L_0x02f7
            r0 = 2131889751(0x7f120e57, float:1.9414174E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 13
            A09(r5, r1, r6, r0)
        L_0x02f7:
            int r0 = r4.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 17
            A09(r5, r1, r6, r0)
        L_0x0304:
            if (r17 != 0) goto L_0x030b
            r0 = 16
            A09(r5, r3, r6, r0)
        L_0x030b:
            X.1MZ r0 = r5.A0d
            boolean r0 = r0.A0P(r3)
            X.2lV r1 = new X.2lV
            r1.<init>(r3, r0)
            r0 = 10
            A09(r5, r1, r6, r0)
            X.1vp r2 = r5.A0w
            int r1 = r4.size()
            int r0 = r18.size()
            int r1 = r1 + r0
            X.AnonymousClass3MX.A1K(r2, r1)
            X.1vp r0 = r5.A0z
            r0.A0E(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77033p1.A0U():void");
    }
}
