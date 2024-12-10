package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass6JB;
import X.AnonymousClass7AS;
import X.BCA;
import X.C108945cZ;
import X.C121326Jf;
import X.C132496mu;
import X.C135536sM;
import X.C146997Rk;
import X.C1585981h;
import X.C175048xu;
import X.C175058xv;
import X.C179509Ig;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C21598Amm;
import X.C22801Dg;
import X.C29351c6;
import X.C29431cG;
import X.C35681md;
import X.C46162Dk;
import X.C72453Mb;
import com.whatsapp.newsletter.mex.BaseNewsletterDirectoryV2GraphqlJob;
import java.util.ArrayList;
import java.util.List;

public final class SearchUsecase implements BCA {
    public AnonymousClass1BI A00;
    public BaseNewsletterDirectoryV2GraphqlJob A01;
    public C132496mu A02;
    public CharSequence A03;
    public final C22801Dg A04;
    public final AnonymousClass1DT A05;
    public final AnonymousClass1M9 A06;
    public final C35681md A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final C18600wl A0B;

    public /* synthetic */ void Bsr(C21598Amm amm, String str) {
    }

    public void CDZ(List list, String str) {
        C18070vi.A0d(list, 0);
        AnonymousClass1DT r5 = this.A05;
        ArrayList<C46162Dk> A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (AnonymousClass000.A1Z(((C46162Dk) next).A02, C179509Ig.GUEST)) {
                A13.add(next);
            }
        }
        ArrayList A0D = C29351c6.A0D(A13);
        for (C46162Dk r2 : A13) {
            A0D.add(new C121326Jf(r2, this.A06.A0H(r2.A0M()), false));
        }
        r5.A0E(A0D);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.updates.viewmodels.SearchUsecase r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass7UE
            if (r0 == 0) goto L_0x0064
            r5 = r8
            X.7UE r5 = (X.AnonymousClass7UE) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0064
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r6 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 != r6) goto L_0x006a
            X.C30691eM.A01(r1)
        L_0x0020:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0023:
            X.C30691eM.A01(r1)
            com.whatsapp.newsletter.mex.BaseNewsletterDirectoryV2GraphqlJob r0 = r7.A01
            if (r0 == 0) goto L_0x002d
            r0.cancel()
        L_0x002d:
            X.6mu r0 = r7.A02
            if (r0 == 0) goto L_0x0037
            java.lang.Object r1 = r0.A01
            monitor-enter(r1)
            r0.A00 = r6     // Catch:{ all -> 0x006f }
            monitor-exit(r1)
        L_0x0037:
            java.lang.String r0 = r7.A03()
            X.6mu r3 = new X.6mu
            r3.<init>(r0)
            r7.A02 = r3
            r0 = 5
            X.7Se r2 = new X.7Se
            r2.<init>(r3, r0)
            r1 = 0
            com.whatsapp.updates.viewmodels.SearchUsecase$fetchRemoteNewsletterResults$2$1 r0 = new com.whatsapp.updates.viewmodels.SearchUsecase$fetchRemoteNewsletterResults$2$1
            r0.<init>(r7, r1)
            X.DXs r2 = X.C108955ca.A0I(r0, r2)
            r1 = 34
            X.7Sn r0 = new X.7Sn
            r0.<init>(r7, r1)
            r5.L$0 = r3
            r5.label = r6
            java.lang.Object r0 = r2.BFC(r5, r0)
            if (r0 != r4) goto L_0x0020
            return r4
        L_0x0064:
            X.7UE r5 = new X.7UE
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x006f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.viewmodels.SearchUsecase.A00(com.whatsapp.updates.viewmodels.SearchUsecase, X.1dr):java.lang.Object");
    }

    public static final void A02(SearchUsecase searchUsecase, Integer num, boolean z) {
        List A10;
        C22801Dg r2 = searchUsecase.A04;
        if (r2.A06() != null && (A10 = AnonymousClass3MW.A10(searchUsecase.A05)) != null) {
            r2.A0E(new C135536sM(num, A10, z));
        }
    }

    public final String A03() {
        String obj;
        CharSequence charSequence = this.A03;
        if (charSequence == null || (obj = charSequence.toString()) == null) {
            return "";
        }
        return obj;
    }

    public final void A04(C46162Dk r7) {
        AnonymousClass1DT r5 = this.A05;
        List<C121326Jf> A10 = AnonymousClass3MW.A10(r5);
        if (A10 != null) {
            ArrayList A0D = C29351c6.A0D(A10);
            for (C121326Jf r2 : A10) {
                if (C18070vi.A18(r2.A02.A0M(), r7.A0M())) {
                    AnonymousClass1E7 r1 = r2.A00;
                    r2 = new C121326Jf(r7, r1, C72453Mb.A1Z(r1));
                }
                A0D.add(r2);
            }
            r5.A0E(A0D);
        }
    }

    public final boolean A05() {
        CharSequence charSequence = this.A03;
        if (charSequence == null || !(!AnonymousClass1YF.A0T(charSequence))) {
            return false;
        }
        return true;
    }

    public void Bsq(C21598Amm amm) {
        Integer num;
        if (amm instanceof C175048xu) {
            num = AnonymousClass00R.A01;
        } else if (amm instanceof C175058xv) {
            num = AnonymousClass00R.A0C;
        } else {
            num = AnonymousClass00R.A0N;
        }
        A02(this, num, false);
    }

    public SearchUsecase(AnonymousClass1M9 r7, C35681md r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, C18600wl r12) {
        C18070vi.A0w(r9, r7, r8, r10, r11);
        C18070vi.A0d(r12, 6);
        this.A08 = r9;
        this.A06 = r7;
        this.A07 = r8;
        this.A0A = r10;
        this.A09 = r11;
        this.A0B = r12;
        Integer num = AnonymousClass00R.A0Y;
        AnonymousClass1DT A0S = C108945cZ.A0S();
        this.A05 = A0S;
        C22801Dg A0R = C108945cZ.A0R();
        this.A04 = A0R;
        C18460wS r2 = C18460wS.A00;
        A0S.A0F(r2);
        A0R.A0F(new C135536sM(num, r2, false));
        AnonymousClass7AS.A01(A0S, A0R, new C1585981h(this), 30);
    }

    public static final List A01(SearchUsecase searchUsecase, List list) {
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            String A0K = ((AnonymousClass6JB) next).A00.A0K();
            if (A0K != null && AnonymousClass1YF.A0Y(A0K, searchUsecase.A03(), true)) {
                A13.add(next);
            }
        }
        return C29431cG.A0y(A13, new C146997Rk((Object) searchUsecase, 18));
    }
}
