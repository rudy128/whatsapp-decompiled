package com.whatsapp.community.communityInfo;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass12M;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1MW;
import X.AnonymousClass1NN;
import X.AnonymousClass3L6;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3VF;
import X.AnonymousClass5F3;
import X.AnonymousClass5F4;
import X.AnonymousClass5F5;
import X.C107505Zy;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C22801Dg;
import X.C24681Lg;
import X.C24921Me;
import X.C25841Pv;
import X.C29691ci;
import X.C31191fA;
import X.C41731wy;
import X.C76763oB;
import X.C76803oS;
import X.C86614Si;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class CAGInfoViewModel extends AnonymousClass1J2 {
    public AnonymousClass1E7 A00;
    public AnonymousClass3VF A01;
    public C76803oS A02;
    public AnonymousClass1EC A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public C76763oB A07;
    public final C22801Dg A08 = new C22801Dg();
    public final AnonymousClass1KB A09;
    public final C31191fA A0A;
    public final AnonymousClass1M9 A0B;
    public final C24921Me A0C;
    public final AnonymousClass1CJ A0D;
    public final AnonymousClass1NN A0E;
    public final C24681Lg A0F;
    public final AnonymousClass1MW A0G;
    public final C18030ve A0H;
    public final C25841Pv A0I;
    public final AnonymousClass12M A0J;
    public final C41731wy A0K = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A0L;
    public final List A0M = new CopyOnWriteArrayList();
    public final C18100vl A0N = AnonymousClass1DF.A01(new AnonymousClass5F3(this));
    public final C18100vl A0O = AnonymousClass1DF.A01(new AnonymousClass5F4(this));
    public final C18100vl A0P = AnonymousClass1DF.A01(new AnonymousClass5F5(this));
    public final C107505Zy A0Q;
    public final AnonymousClass10I A0R;

    public static void A00(int i, List list) {
        list.add(new C86614Si(i));
    }

    public static final void A03(CAGInfoViewModel cAGInfoViewModel) {
        String str;
        List list = cAGInfoViewModel.A0M;
        list.clear();
        A00(17, list);
        if (cAGInfoViewModel.A05) {
            A00(7, list);
            A00(10, list);
        }
        C76803oS r0 = cAGInfoViewModel.A02;
        if (r0 == null) {
            str = "groupChatInfoViewModel";
        } else {
            Collection collection = (Collection) r0.A01.A06();
            if (collection != null && !collection.isEmpty()) {
                A00(15, list);
                A00(16, list);
            }
            int i = 14;
            if (!C18020vd.A05(C18040vf.A02, cAGInfoViewModel.A0H, 7628)) {
                A00(9, list);
                i = 3;
            }
            A00(i, list);
            A00(8, list);
            if (cAGInfoViewModel.A06) {
                A00(5, list);
            }
            A00(11, list);
            A00(1, list);
            if (cAGInfoViewModel.A04) {
                A00(6, list);
            }
            AnonymousClass1CJ r1 = cAGInfoViewModel.A0D;
            AnonymousClass1EC r02 = cAGInfoViewModel.A03;
            if (r02 == null) {
                str = "cagJid";
            } else {
                C29691ci A002 = AnonymousClass1CJ.A00(r1, r02);
                if (cAGInfoViewModel.A0A.A0L() && A002 != null) {
                    A00(4, list);
                }
                A00(2, list);
                A00(12, list);
                A00(13, list);
                A00(0, list);
                cAGInfoViewModel.A08.A0E(list);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A04(CAGInfoViewModel cAGInfoViewModel) {
        String str;
        AnonymousClass3VF r0 = cAGInfoViewModel.A01;
        if (r0 == null) {
            str = "groupParticipantsViewModel";
        } else {
            r0.A0T();
            C17890vO.A0t(cAGInfoViewModel.A07);
            C76803oS r02 = cAGInfoViewModel.A02;
            str = "groupChatInfoViewModel";
            if (r02 != null) {
                r02.A0U();
                C107505Zy r2 = cAGInfoViewModel.A0Q;
                C76803oS r1 = cAGInfoViewModel.A02;
                if (r1 != null) {
                    AnonymousClass1EC r03 = cAGInfoViewModel.A03;
                    if (r03 == null) {
                        str = "cagJid";
                    } else {
                        C76763oB BGX = r2.BGX(r1, r03);
                        cAGInfoViewModel.A07 = BGX;
                        C17890vO.A0u(BGX, cAGInfoViewModel.A0R);
                        return;
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A0S() {
        if (this.A03 != null) {
            AnonymousClass3MY.A1R(this.A0F, this.A0P);
            AnonymousClass3MY.A1R(this.A0E, this.A0N);
            AnonymousClass3MW.A0e(this.A0L).A01((AnonymousClass3L6) this.A0O.getValue());
        }
    }

    public CAGInfoViewModel(AnonymousClass1KB r2, C31191fA r3, AnonymousClass1M9 r4, C24921Me r5, AnonymousClass1CJ r6, AnonymousClass1NN r7, C24681Lg r8, AnonymousClass1MW r9, C18030ve r10, C25841Pv r11, AnonymousClass12M r12, C107505Zy r13, AnonymousClass10I r14, AnonymousClass00H r15) {
        C18070vi.A0w(r10, r2, r14, r6, r4);
        C18070vi.A0x(r11, r5, r3, r12, r8);
        C18070vi.A0r(r9, r7, r13);
        C18070vi.A0d(r15, 14);
        this.A0H = r10;
        this.A09 = r2;
        this.A0R = r14;
        this.A0D = r6;
        this.A0B = r4;
        this.A0I = r11;
        this.A0C = r5;
        this.A0A = r3;
        this.A0J = r12;
        this.A0F = r8;
        this.A0G = r9;
        this.A0E = r7;
        this.A0Q = r13;
        this.A0L = r15;
    }
}
