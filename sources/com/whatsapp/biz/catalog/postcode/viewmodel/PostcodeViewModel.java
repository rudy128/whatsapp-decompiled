package com.whatsapp.biz.catalog.postcode.viewmodel;

import X.AEW;
import X.AnonymousClass10I;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass4S5;
import X.AnonymousClass9a1;
import X.C108965cb;
import X.C18070vi;
import X.C18600wl;
import X.C189029iO;
import X.C190929lk;
import X.C192179nw;
import X.C19830z4;
import X.C19973A1i;
import X.C20496ANh;
import X.C41731wy;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.jid.UserJid;

public final class PostcodeViewModel extends AnonymousClass1J2 {
    public AEW A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DS A03;
    public final AnonymousClass1DS A04;
    public final AnonymousClass1DT A05;
    public final AnonymousClass1DT A06;
    public final AnonymousClass1DT A07;
    public final C189029iO A08;
    public final C19973A1i A09;
    public final C19830z4 A0A;
    public final UserJid A0B;
    public final AnonymousClass4S5 A0C;
    public final C41731wy A0D;
    public final AnonymousClass10I A0E;
    public final C18600wl A0F;
    public final C192179nw A0G;
    public final CatalogManager A0H;

    public static void A00(PostcodeViewModel postcodeViewModel, PostcodeChangeBottomSheet postcodeChangeBottomSheet, String str) {
        postcodeChangeBottomSheet.A0D = str;
        postcodeChangeBottomSheet.A0E = (String) postcodeViewModel.A01.A06();
        PostcodeChangeBottomSheet.A00(postcodeChangeBottomSheet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0T(X.C30391dr r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C21680Ao9
            if (r0 == 0) goto L_0x008b
            r7 = r9
            X.Ao9 r7 = (X.C21680Ao9) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008b
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r6 = r7.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L_0x0063
            if (r0 != r5) goto L_0x0091
            java.lang.Object r3 = r7.L$1
            java.lang.Object r4 = r7.L$0
            com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel r4 = (com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel) r4
            X.C30691eM.A01(r6)
        L_0x0026:
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            X.0z4 r2 = r4.A0A
            java.lang.String r0 = r6.getRawString()
            java.lang.String r1 = r2.A0q(r0)
            if (r3 == 0) goto L_0x0096
            if (r1 == 0) goto L_0x0096
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x0096
            X.1DT r0 = r4.A07
            r0.A0F(r1)
            java.lang.String r3 = r6.getRawString()
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "dc_location_name_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            java.lang.String r1 = X.C17880vN.A0r(r2, r0)
            if (r1 == 0) goto L_0x005e
            X.1DT r0 = r4.A06
            r0.A0F(r1)
        L_0x005e:
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            return r0
        L_0x0063:
            X.C30691eM.A01(r6)
            X.A1i r2 = r8.A09
            X.AEW r1 = r8.A00
            java.lang.String r0 = "postcode"
            boolean r0 = X.C19973A1i.A00(r2, r1, r0, r5)
            if (r0 == 0) goto L_0x0096
            X.1DS r0 = r8.A04
            java.lang.Object r3 = r0.A06()
            X.4S5 r1 = r8.A0C
            com.whatsapp.jid.UserJid r0 = r8.A0B
            r7.L$0 = r8
            r7.L$1 = r3
            r7.label = r5
            java.lang.Object r6 = r1.A01(r0, r7)
            if (r6 != r4) goto L_0x0089
            return r4
        L_0x0089:
            r4 = r8
            goto L_0x0026
        L_0x008b:
            X.Ao9 r7 = new X.Ao9
            r7.<init>(r8, r9)
            goto L_0x0012
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0096:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel.A0T(X.1dr):java.lang.Object");
    }

    public final void A0U(String str) {
        if (!C19973A1i.A00(this.A09, this.A00, "postcode", true)) {
            this.A0D.A0F("error");
            return;
        }
        CatalogManager catalogManager = this.A0H;
        UserJid userJid = this.A0B;
        ((C190929lk) catalogManager.A07.get()).A00(new C20496ANh(catalogManager, new AnonymousClass9a1(this, str), userJid), this.A00, userJid, str);
    }

    public PostcodeViewModel(C192179nw r2, CatalogManager catalogManager, C189029iO r4, C19973A1i a1i, C19830z4 r6, UserJid userJid, AnonymousClass4S5 r8, AnonymousClass10I r9, C18600wl r10) {
        C18070vi.A0s(r6, catalogManager, a1i, r2);
        C108965cb.A1P(r8, 7, r9);
        C18070vi.A0d(r10, 9);
        this.A0A = r6;
        this.A0H = catalogManager;
        this.A09 = a1i;
        this.A0G = r2;
        this.A08 = r4;
        this.A0B = userJid;
        this.A0C = r8;
        this.A0E = r9;
        this.A0F = r10;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A07 = A0L;
        this.A04 = A0L;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A06 = A0L2;
        this.A03 = A0L2;
        AnonymousClass1DT A0L3 = AnonymousClass3MW.A0L();
        this.A05 = A0L3;
        this.A01 = A0L3;
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A0D = A0o;
        this.A02 = A0o;
    }
}
