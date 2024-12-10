package com.whatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass190;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass6Nd;
import X.C110995hm;
import X.C111045i2;
import X.C114935sU;
import X.C143897Ff;
import X.C154897rs;
import X.C154907rt;
import X.C157117vp;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C80633xb;
import X.C80643xc;
import X.C91444fh;
import X.C99274sY;
import android.os.Bundle;

public class BloksCDSBottomSheetActivity extends AnonymousClass6Nd {
    public int A00;
    public C91444fh A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public final C18100vl A05 = C99274sY.A00(new C154907rt(this), new C154897rs(this), new C157117vp(this), AnonymousClass3MW.A15(C111045i2.class));
    public final C110995hm A06 = new C110995hm(this);

    /* JADX WARNING: type inference failed for: r5v2, types: [X.ALJ, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4b(android.content.Intent r32, android.os.Bundle r33) {
        /*
            r31 = this;
            r3 = 0
            java.lang.String r0 = "screen_params"
            r4 = r32
            java.lang.String r2 = r4.getStringExtra(r0)
            if (r2 != 0) goto L_0x000d
            java.lang.String r2 = ""
        L_0x000d:
            java.lang.String r0 = "screen_name"
            java.lang.String r0 = r4.getStringExtra(r0)
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            java.lang.String r1 = "mode_half_sheet_extra"
            boolean r6 = r4.getBooleanExtra(r1, r3)
            java.lang.String r1 = "drag_to_dismiss_extra"
            java.lang.String r5 = r4.getStringExtra(r1)
            if (r5 == 0) goto L_0x0089
            int r4 = r5.hashCode()
            r1 = -891611359(0xffffffffcadb1721, float:-7179152.5)
            if (r4 == r1) goto L_0x007e
            r1 = 1053567612(0x3ecc2a7c, float:0.39876163)
            if (r4 != r1) goto L_0x0089
            java.lang.String r1 = "DISABLED"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0089
            X.C07 r17 = X.C07.DISABLED
        L_0x003f:
            r1 = r31
            X.00H r4 = r1.A02
            if (r4 == 0) goto L_0x00fe
            java.lang.Object r4 = r4.get()
            java.util.Set r4 = (java.util.Set) r4
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L_0x008c
            r4 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            X.C108985cd.A14(r1, r4, r3)
            X.00H r3 = r1.A03
            if (r3 == 0) goto L_0x0101
            java.lang.Object r5 = r3.get()
            X.6oA r5 = (X.C133096oA) r5
            java.lang.ref.WeakReference r10 = X.AnonymousClass3MW.A0z(r1)
            boolean r11 = X.C28281Zt.A0B(r1)
            X.11S r3 = r1.A02
            java.lang.String r8 = X.C108985cd.A0j(r3)
            r4 = 2
            X.7ON r3 = new X.7ON
            r3.<init>(r1, r4)
            r6 = 0
            r4 = r5
            r5 = r3
            r7 = r0
            r9 = r2
            r4.A00(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x007e:
            java.lang.String r1 = "ENABLED"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0089
            X.C07 r17 = X.C07.ENABLED
            goto L_0x003f
        L_0x0089:
            X.C07 r17 = X.C07.AUTO
            goto L_0x003f
        L_0x008c:
            r8 = 0
            X.C08 r4 = X.D8F.A0N
            java.lang.Integer r20 = X.AnonymousClass00R.A0C
            X.C0B r18 = X.C0B.FULL_SHEET
            X.C06 r16 = X.C06.AUTO
            X.C08 r13 = X.C08.ANIMATED
            if (r6 == 0) goto L_0x009b
            X.C0B r18 = X.C0B.HALF_SHEET
        L_0x009b:
            r4 = 1
            X.C05 r15 = X.C05.SAME_SIZE
            r25 = 16542(0x409e, float:2.318E-41)
            java.lang.Integer r23 = X.AnonymousClass00R.A00
            X.BpJ r10 = X.C23774BpJ.A00
            r11 = r8
            r12 = r8
            r14 = r8
            r19 = r8
            r21 = r8
            r22 = r8
            r24 = r8
            r27 = r3
            r29 = r3
            r30 = r3
            X.D8F r7 = new X.D8F
            r9 = r8
            r26 = r3
            r28 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r6 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A01(r7, r0)
            X.CXY r5 = r1.A01
            r6.A01 = r5
            X.ALJ r5 = new X.ALJ
            r5.<init>()
            r5.A02 = r0
            X.1D6[] r7 = new X.AnonymousClass1D6[r4]
            java.lang.String r4 = "params"
            X.AnonymousClass1D6.A03(r4, r2, r7, r3)
            java.util.HashMap r3 = X.AnonymousClass1D7.A07(r7)
            X.9gS r2 = new X.9gS
            r2.<init>()
            r2.A01 = r0
            r2.A02 = r3
            X.AHy r4 = new X.AHy
            r4.<init>(r2)
            int r2 = r1.A00
            int r2 = r2 + 1
            r1.A00 = r2
            r3 = 32
            X.8d6 r2 = new X.8d6
            r2.<init>(r8, r3)
            r9 = r6
            r10 = r1
            r11 = r4
            r13 = r5
            r14 = r2
            r15 = r0
            X.A8X.A06(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x00fe:
            java.lang.String r0 = "asyncActionAppIds"
            goto L_0x0103
        L_0x0101:
            java.lang.String r0 = "asyncActionLauncherLazy"
        L_0x0103:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity.A4b(android.content.Intent, android.os.Bundle):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C114935sU.A0Q(this);
        getSupportFragmentManager().A0q(this.A06, false);
        if (getIntent().getBooleanExtra("add_biometric_auth_extra", false)) {
            C143897Ff r6 = new C143897Ff(this);
            int intExtra = getIntent().getIntExtra("biometric_auth_title_res_extra", 0);
            C18030ve r7 = this.A0E;
            C18070vi.A0W(r7);
            AnonymousClass190 r3 = this.A03;
            C18070vi.A0W(r3);
            AnonymousClass1KB r4 = this.A05;
            C18070vi.A0W(r4);
            AnonymousClass11C r5 = this.A08;
            C18070vi.A0W(r5);
            C91444fh r1 = new C80633xb(this, r3, r4, r5, r6, r7, intExtra, 0);
            if (!r1.A05()) {
                r1 = new C80643xc(this, r3, r5, r6, intExtra);
                if (!r1.A05()) {
                    r1 = null;
                }
            }
            this.A01 = r1;
        }
    }

    public void onDestroy() {
        getSupportFragmentManager().A0p(this.A06);
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        C114935sU.A0Q(this);
    }
}
