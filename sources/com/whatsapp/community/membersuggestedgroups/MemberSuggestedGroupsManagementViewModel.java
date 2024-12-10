package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.AnonymousClass11E;
import X.AnonymousClass11S;
import X.AnonymousClass1CJ;
import X.AnonymousClass1D6;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1R3;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass411;
import X.AnonymousClass4CS;
import X.AnonymousClass4CT;
import X.AnonymousClass4TH;
import X.AnonymousClass4TI;
import X.AnonymousClass4WB;
import X.C100995An;
import X.C108485bm;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C23421Fz;
import X.C25191Ng;
import X.C27178DXn;
import X.C29351c6;
import X.C30391dr;
import X.C34071js;
import X.C34511kb;
import X.C39501tB;
import X.C41561wd;
import X.C59802mu;
import X.C82904Cp;
import X.C87284Uz;
import X.C96314ne;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

public final class MemberSuggestedGroupsManagementViewModel extends AnonymousClass1J2 {
    public int A00 = -1;
    public final C34511kb A01;
    public final MemberSuggestedGroupsManager A02;
    public final AnonymousClass11E A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass1R3 A05;
    public final AnonymousClass1EC A06;
    public final C18600wl A07;
    public final C108485bm A08;
    public final C23421Fz A09;
    public final AnonymousClass1G4 A0A;
    public final AnonymousClass1G4 A0B;
    public final AnonymousClass1G1 A0C;
    public final AnonymousClass1G1 A0D;
    public final AnonymousClass1G1 A0E;
    public final AnonymousClass1G1 A0F;
    public final C96314ne A0G;
    public final AnonymousClass11S A0H;
    public final AnonymousClass1M9 A0I;
    public final C25191Ng A0J;
    public final AnonymousClass411 A0K;
    public final C39501tB A0L;
    public final AnonymousClass1G4 A0M;
    public final AnonymousClass1G4 A0N;

    public final void A0T(C82904Cp r11, boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        for (AnonymousClass4TH r0 : (Iterable) this.A0E.getValue()) {
            Object obj = r0.A01;
            if (obj instanceof C87284Uz) {
                A13.add(obj);
            }
        }
        ArrayList<C87284Uz> A132 = AnonymousClass000.A13();
        for (Object next : A13) {
            if (((C87284Uz) next).A00 == 0) {
                A132.add(next);
            }
        }
        ArrayList A0D2 = C29351c6.A0D(A132);
        for (C87284Uz r02 : A132) {
            A0D2.add(r02.A02);
        }
        if (AnonymousClass000.A1a(A0D2)) {
            AnonymousClass3MW.A1X(this.A07, new MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1(this, r11, A0D2, (C30391dr) null, z), C41561wd.A00(this));
        }
    }

    public MemberSuggestedGroupsManagementViewModel(AnonymousClass11S r6, C34511kb r7, MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass11E r9, AnonymousClass1M9 r10, AnonymousClass1CJ r11, AnonymousClass1R3 r12, C25191Ng r13, C39501tB r14, AnonymousClass1EC r15, C18600wl r16) {
        C18600wl r1 = r16;
        C18070vi.A0w(r15, r1, memberSuggestedGroupsManager, r7, r10);
        C18070vi.A0x(r13, r14, r9, r11, r12);
        C18070vi.A0d(r6, 11);
        this.A06 = r15;
        this.A07 = r1;
        this.A02 = memberSuggestedGroupsManager;
        this.A01 = r7;
        this.A0I = r10;
        this.A0J = r13;
        this.A0L = r14;
        this.A03 = r9;
        this.A04 = r11;
        this.A05 = r12;
        this.A0H = r6;
        AnonymousClass1G7 A002 = C34071js.A00(C18460wS.A00);
        this.A0N = A002;
        this.A0E = A002;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(AnonymousClass1D6.A00(0, C18020vd.A00(C18040vf.A02, r7.A07, 1238) + 1));
        this.A0M = A18;
        this.A0D = A18;
        C27178DXn dXn = new C27178DXn(0);
        this.A08 = dXn;
        this.A09 = AnonymousClass4WB.A01(dXn);
        AnonymousClass1G7 A182 = AnonymousClass3MW.A18(AnonymousClass4CT.MEMBER);
        this.A0B = A182;
        this.A0F = A182;
        AnonymousClass1G7 A183 = AnonymousClass3MW.A18(AnonymousClass4CS.LOADING);
        this.A0A = A183;
        this.A0C = A183;
        AnonymousClass411 r2 = new AnonymousClass411(this, 4);
        this.A0K = r2;
        C96314ne r0 = new C96314ne(this, 10);
        this.A0G = r0;
        r14.registerObserver(r2);
        r13.registerObserver(r0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r7, java.util.Map r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.C100614un
            if (r0 == 0) goto L_0x008d
            r3 = r9
            X.4un r3 = (X.C100614un) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008d
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r1 = r3.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L_0x0081
            if (r0 != r2) goto L_0x0096
            java.lang.Object r5 = r3.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r7 = r3.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r7 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r7
            X.C30691eM.A01(r1)
        L_0x0028:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0093
            java.util.Map$Entry r6 = X.AnonymousClass000.A16(r5)
            java.lang.Object r0 = r6.getKey()
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = 2
            if (r1 == r0) goto L_0x0071
            r0 = 3
            if (r1 == r0) goto L_0x0061
            r0 = 4
            if (r1 != r0) goto L_0x0028
            java.lang.Object r0 = r6.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            X.3pk r1 = new X.3pk
            r1.<init>(r0)
        L_0x0052:
            X.5bm r0 = r7.A08
            r3.L$0 = r7
            r3.L$1 = r5
            r3.label = r2
            java.lang.Object r0 = r0.CHH(r1, r3)
            if (r0 != r4) goto L_0x0028
            return r4
        L_0x0061:
            java.lang.Object r0 = r6.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            X.3pl r1 = new X.3pl
            r1.<init>(r0)
            goto L_0x0052
        L_0x0071:
            java.lang.Object r0 = r6.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            X.3pj r1 = new X.3pj
            r1.<init>(r0)
            goto L_0x0052
        L_0x0081:
            X.C30691eM.A01(r1)
            java.util.LinkedHashMap r0 = X.AnonymousClass4Z0.A01(r8)
            java.util.Iterator r5 = X.AnonymousClass000.A15(r0)
            goto L_0x0028
        L_0x008d:
            X.4un r3 = new X.4un
            r3.<init>(r7, r9)
            goto L_0x0012
        L_0x0093:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A00(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel, java.util.Map, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r9, java.util.Map r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.C100364uO
            if (r0 == 0) goto L_0x002c
            r4 = r11
            X.4uO r4 = (X.C100364uO) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r5 = 0
            r8 = 4
            r7 = 3
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r2) goto L_0x006d
            if (r0 == r6) goto L_0x0083
            if (r0 == r7) goto L_0x005d
            if (r0 == r8) goto L_0x0083
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002c:
            X.4uO r4 = new X.4uO
            r4.<init>(r9, r11)
            goto L_0x0012
        L_0x0032:
            X.C30691eM.A01(r1)
            X.1EC r0 = r9.A06
            java.lang.Object r0 = r10.get(r0)
            boolean r0 = X.C18070vi.A19(r0, r2)
            X.1G4 r1 = r9.A0A
            if (r0 == 0) goto L_0x0050
            X.4CS r0 = X.AnonymousClass4CS.LOADING
            r4.L$0 = r9
            r4.label = r2
            java.lang.Object r0 = r1.BJt(r0, r4)
            if (r0 != r3) goto L_0x0074
            return r3
        L_0x0050:
            X.4CS r0 = X.AnonymousClass4CS.READY
            r4.L$0 = r9
            r4.label = r7
            java.lang.Object r0 = r1.BJt(r0, r4)
            if (r0 != r3) goto L_0x0064
            return r3
        L_0x005d:
            java.lang.Object r9 = r4.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r9 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r9
            X.C30691eM.A01(r1)
        L_0x0064:
            r4.L$0 = r5
            r4.label = r8
            java.lang.Object r0 = A04(r9, r4)
            goto L_0x0080
        L_0x006d:
            java.lang.Object r9 = r4.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r9 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r9
            X.C30691eM.A01(r1)
        L_0x0074:
            X.1G4 r1 = r9.A0N
            X.0wS r0 = X.C18460wS.A00
            r4.L$0 = r5
            r4.label = r6
            java.lang.Object r0 = r1.BJt(r0, r4)
        L_0x0080:
            if (r0 != r3) goto L_0x0086
            return r3
        L_0x0083:
            X.C30691eM.A01(r1)
        L_0x0086:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A03(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel, java.util.Map, X.1dr):java.lang.Object");
    }

    public static final Object A04(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C30391dr r10) {
        SortedSet<C59802mu> A032 = memberSuggestedGroupsManagementViewModel.A02.A03(memberSuggestedGroupsManagementViewModel.A06);
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        HashMap A11 = C17880vN.A11();
        for (C59802mu r7 : A032) {
            if (memberSuggestedGroupsManagementViewModel.A0B.getValue() != AnonymousClass4CT.MEMBER || memberSuggestedGroupsManagementViewModel.A0H.A0O(r7.A04)) {
                if (r7.A07) {
                    AnonymousClass1EC r3 = r7.A02;
                    if (!A11.containsKey(r3)) {
                        A11.put(r3, AnonymousClass1ZU.A06(r7.A04));
                        memberSuggestedGroupsManagementViewModel.A08(r7, A13);
                    } else {
                        List list = (List) A11.get(r3);
                        if (list != null) {
                            list.add(r7.A04);
                        }
                    }
                } else {
                    memberSuggestedGroupsManagementViewModel.A08(r7, A132);
                }
            }
        }
        ArrayList A133 = AnonymousClass000.A13();
        if (A13.size() > 0) {
            A133.add(new AnonymousClass4TH(2, new AnonymousClass4TI(2131890171, A13.size())));
            A133.addAll(A13);
        }
        if (A132.size() > 0) {
            A133.add(new AnonymousClass4TH(2, new AnonymousClass4TI(2131892491, A132.size())));
            A133.addAll(A132);
        }
        memberSuggestedGroupsManagementViewModel.A00 = A132.size() + A13.size();
        return AnonymousClass3MX.A13(memberSuggestedGroupsManagementViewModel.A0N.BJt(A133, r10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C31751g4 A05(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r9, java.util.List r10, X.C30391dr r11, X.C22821Di r12, int r13) {
        /*
            boolean r0 = r11 instanceof X.C100624uo
            if (r0 == 0) goto L_0x0026
            r5 = r11
            X.4uo r5 = (X.C100624uo) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r8 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r5.label
            r6 = 0
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r0) goto L_0x005a
            if (r1 == r3) goto L_0x0074
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0026:
            X.4uo r5 = new X.4uo
            r5.<init>(r9, r11)
            goto L_0x0012
        L_0x002c:
            X.C30691eM.A01(r8)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$2 r7 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$2
            r7.<init>(r6, r12)
            r5.L$0 = r9
            r5.I$0 = r13
            r5.label = r0
            r0 = 0
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r10)
            java.util.Map r0 = X.C200610r.A04(r0)
            X.1G7 r8 = X.C34071js.A00(r0)
            X.1OX r2 = X.C41561wd.A00(r9)
            X.0wl r1 = r9.A07
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1
            r0.<init>(r10, r6, r7, r8)
            X.AnonymousClass3MW.A1X(r1, r0, r2)
            goto L_0x0061
        L_0x005a:
            int r13 = r5.I$0
            java.lang.Object r9 = r5.L$0
            X.C30691eM.A01(r8)
        L_0x0061:
            X.1G0 r8 = (X.AnonymousClass1G0) r8
            r1 = 0
            X.4t6 r0 = new X.4t6
            r0.<init>(r9, r13, r1)
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r0 = r8.BFC(r5, r0)
            if (r0 != r4) goto L_0x0077
            return r4
        L_0x0074:
            X.C30691eM.A01(r8)
        L_0x0077:
            X.7Sr r0 = X.AnonymousClass3MW.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A05(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel, java.util.List, X.1dr, X.1Di, int):X.1g4");
    }

    public static final void A06(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel) {
        Object value;
        C34511kb r2;
        AnonymousClass1G4 r5 = memberSuggestedGroupsManagementViewModel.A0M;
        do {
            value = r5.getValue();
            r2 = memberSuggestedGroupsManagementViewModel.A01;
        } while (!r5.BFK(value, AnonymousClass1D6.A00(Integer.valueOf(r2.A08.A03(memberSuggestedGroupsManagementViewModel.A06).size()), C18020vd.A00(C18040vf.A02, r2.A07, 1238) + 1)));
    }

    public static final void A07(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, Map map) {
        int i;
        AnonymousClass1G4 r2 = memberSuggestedGroupsManagementViewModel.A0N;
        Iterable<AnonymousClass4TH> iterable = (Iterable) r2.getValue();
        ArrayList A0D2 = C29351c6.A0D(iterable);
        for (AnonymousClass4TH r4 : iterable) {
            Object obj = r4.A01;
            if (obj instanceof C87284Uz) {
                C87284Uz r3 = (C87284Uz) obj;
                C59802mu r8 = r3.A02;
                Number number = (Number) map.get(r8.A02);
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = r3.A00;
                }
                r4 = new AnonymousClass4TH(r4.A00, new C87284Uz(r3.A01, r8, r3.A04, r3.A03, r3.A05, i));
            }
            A0D2.add(r4);
        }
        do {
        } while (!r2.BFK(r2.getValue(), A0D2));
    }

    private final void A08(C59802mu r10, List list) {
        AnonymousClass1M9 r1 = this.A0I;
        AnonymousClass1E7 A0H2 = r1.A0H(r10.A02);
        AnonymousClass1E7 A0H3 = r1.A0H(r10.A04);
        C100995An r7 = new C100995An(this, 5);
        list.add(new AnonymousClass4TH(1, new C87284Uz((AnonymousClass4CT) this.A0F.getValue(), r10, A0H2, A0H3, r7, 0)));
    }

    public void A0S() {
        this.A0L.unregisterObserver(this.A0K);
    }
}
