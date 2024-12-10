package com.whatsapp.companiondevice;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11E;
import X.AnonymousClass11J;
import X.AnonymousClass18O;
import X.AnonymousClass1DT;
import X.AnonymousClass1KB;
import X.AnonymousClass1MQ;
import X.AnonymousClass1RK;
import X.AnonymousClass1TH;
import X.AnonymousClass1TI;
import X.AnonymousClass1VD;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass8FK;
import X.C146817Qs;
import X.C18030ve;
import X.C19830z4;
import X.C19880zA;
import X.C26371Rw;
import X.C26701Td;
import X.C26811To;
import X.C41731wy;
import X.C58392kc;
import X.C59732mn;
import X.C94114k4;
import X.C95524mN;
import X.C98334qx;
import android.app.Application;

public class LinkedDevicesSharedViewModel extends AnonymousClass8FK {
    public Boolean A00;
    public Runnable A01;
    public boolean A02;
    public Integer A03;
    public final Application A04;
    public final AnonymousClass1DT A05 = AnonymousClass3MW.A0L();
    public final C19880zA A06;
    public final AnonymousClass1KB A07;
    public final AnonymousClass18O A08;
    public final C26811To A09;
    public final C26371Rw A0A;
    public final AnonymousClass11J A0B = new C94114k4(this, 1);
    public final AnonymousClass11E A0C;
    public final C19830z4 A0D;
    public final C26701Td A0E = new C95524mN(this, 1);
    public final AnonymousClass1RK A0F;
    public final AnonymousClass1TH A0G;
    public final C41731wy A0H = AnonymousClass3MW.A0o();
    public final C41731wy A0I = AnonymousClass3MW.A0o();
    public final C41731wy A0J = AnonymousClass3MW.A0o();
    public final C41731wy A0K = AnonymousClass3MW.A0o();
    public final C41731wy A0L = AnonymousClass3MW.A0o();
    public final C41731wy A0M = AnonymousClass3MW.A0o();
    public final C41731wy A0N = AnonymousClass3MW.A0o();
    public final C41731wy A0O = AnonymousClass3MW.A0o();
    public final C41731wy A0P = AnonymousClass3MW.A0o();
    public final C41731wy A0Q = AnonymousClass3MW.A0o();
    public final C41731wy A0R = AnonymousClass3MW.A0o();
    public final C41731wy A0S = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A0T;
    public final AnonymousClass1TI A0U = new C98334qx(this, 5);
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final C19880zA A0X;
    public final AnonymousClass1MQ A0Y;
    public final C18030ve A0Z;
    public final AnonymousClass1VD A0a;
    public final AnonymousClass00H A0b;

    public static void A00(LinkedDevicesSharedViewModel linkedDevicesSharedViewModel) {
        C41731wy r1;
        if (linkedDevicesSharedViewModel.A03 != AnonymousClass00R.A01 || !((C58392kc) linkedDevicesSharedViewModel.A0b.get()).A01()) {
            r1 = linkedDevicesSharedViewModel.A0Q;
        } else {
            r1 = linkedDevicesSharedViewModel.A0P;
        }
        r1.A0F((Object) null);
    }

    public void A0T() {
        Boolean valueOf;
        this.A0G.A05(this.A0U, this.A07.A05);
        AnonymousClass11E r2 = this.A0C;
        r2.registerObserver(this.A0B);
        this.A0F.registerObserver(this.A0E);
        C59732mn A052 = r2.A05();
        if (A052 == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(A052.A05);
        }
        this.A00 = valueOf;
    }

    public void A0V(String str) {
        if (!this.A0C.A09()) {
            AnonymousClass3MX.A1J(this.A0I, 2131888732);
            return;
        }
        this.A02 = true;
        AnonymousClass3MY.A1L(this.A05, true);
        this.A0T.CGF(new C146817Qs(this, str));
    }

    public void A0W(boolean z) {
        C41731wy r1;
        Integer num;
        if (!this.A0C.A09()) {
            boolean A022 = AnonymousClass11E.A02(this.A04);
            r1 = this.A0I;
            int i = 2131892439;
            if (A022) {
                i = 2131892440;
            }
            num = Integer.valueOf(i);
        } else if (!this.A08.A09(AnonymousClass18O.A0L) || !z) {
            A00(this);
            return;
        } else {
            r1 = this.A0O;
            num = null;
        }
        r1.A0F(num);
    }

    public LinkedDevicesSharedViewModel(Application application, C19880zA r5, C19880zA r6, AnonymousClass1KB r7, AnonymousClass18O r8, C26811To r9, C26371Rw r10, AnonymousClass11E r11, C19830z4 r12, AnonymousClass1RK r13, AnonymousClass1MQ r14, AnonymousClass1TH r15, C18030ve r16, AnonymousClass1VD r17, AnonymousClass10I r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21) {
        super(application);
        this.A0Z = r16;
        this.A07 = r7;
        this.A0T = r18;
        this.A04 = application;
        this.A08 = r8;
        this.A09 = r9;
        this.A0Y = r14;
        this.A0A = r10;
        this.A0W = r19;
        this.A0D = r12;
        this.A0a = r17;
        this.A0F = r13;
        this.A0V = r20;
        this.A0G = r15;
        this.A0C = r11;
        this.A0X = r5;
        this.A0b = r21;
        this.A06 = r6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(java.lang.Integer r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LinkedDevicesSharedViewModel/onLinkNewDeviceClicked devicePairFlowType: "
            r1.append(r0)
            int r0 = r11.intValue()
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = "PHONE_NUMBER_AND_CODE"
        L_0x0011:
            X.C17890vO.A1A(r1, r0)
            X.1VD r0 = r10.A0a
            X.1VC r0 = r0.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0025
            X.1wy r1 = r10.A0M
            r0 = 0
        L_0x0021:
            r1.A0F(r0)
        L_0x0024:
            return
        L_0x0025:
            X.00H r1 = r10.A0W
            boolean r0 = X.C72473Md.A1Y(r1)
            if (r0 == 0) goto L_0x0036
            if (r12 < r13) goto L_0x0036
            X.1wy r1 = r10.A0L
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            goto L_0x0021
        L_0x0036:
            r10.A03 = r11
            boolean r0 = X.C72473Md.A1Y(r1)
            if (r0 == 0) goto L_0x009e
            X.11E r0 = r10.A0C
            r1 = 1
            int r0 = r0.A03(r1)
            if (r0 == r1) goto L_0x009e
            X.0z4 r0 = r10.A0D
            android.content.SharedPreferences r3 = X.C17890vO.A0B(r0)
            java.lang.String r2 = "md_initial_sync_estimate_bytes"
            r0 = -1
            long r2 = r3.getLong(r2, r0)
            r4 = 0
            r8 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x006c
            long r6 = r2 / r8
            X.18O r1 = r10.A08
            X.18Q r0 = X.AnonymousClass18O.A1M
            int r0 = r1.A04(r0)
            long r4 = (long) r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x009e
        L_0x006c:
            X.1wy r1 = r10.A0N
            r0 = 0
            r1.A0F(r0)
            X.1Rw r4 = r10.A0A
            long r0 = r2 / r8
            long r2 = java.lang.Math.min(r2, r0)
            X.3ya r1 = new X.3ya
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.18K r0 = r4.A08
            r0.CC7(r1)
        L_0x008a:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r11 != r0) goto L_0x0024
            X.00H r0 = r10.A0V
            java.lang.Object r1 = r0.get()
            X.4Qn r1 = (X.AnonymousClass4Qn) r1
            X.3yw r0 = new X.3yw
            r0.<init>()
            r1.A01 = r0
            return
        L_0x009e:
            r10.A0W(r14)
            goto L_0x008a
        L_0x00a2:
            java.lang.String r0 = "QR_CODE"
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDevicesSharedViewModel.A0U(java.lang.Integer, int, int, boolean):void");
    }
}
