package com.whatsapp.statuscomposer.composer;

import X.AnonymousClass00H;
import X.AnonymousClass1Cd;
import X.AnonymousClass1FU;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass6VM;
import X.AnonymousClass7DX;
import X.AnonymousClass7DY;
import X.AnonymousClass885;
import X.C108955ca;
import X.C108965cb;
import X.C133276oU;
import X.C133286oV;
import X.C135976t4;
import X.C139676zG;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18140vp;
import X.C19740yt;
import X.C219217x;
import X.C23661Hd;
import X.C24771Lp;
import X.C72453Mb;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public final class CameraStatusFragment extends Hilt_CameraStatusFragment implements AnonymousClass885 {
    public int A00 = 1;
    public C24771Lp A01;
    public AnonymousClass7DY A02;
    public C133276oU A03;
    public C219217x A04;
    public AnonymousClass1Cd A05;
    public C23661Hd A06;
    public C18030ve A07;
    public WhatsAppLibLoader A08;
    public C133286oV A09;
    public AnonymousClass00H A0A;
    public C18140vp A0B;
    public boolean A0C;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        Log.i("CameraStatusFragment onCreateView");
        Window A0B2 = C108965cb.A0B(this);
        if (A0B2 != null) {
            AnonymousClass3Ma.A1H(A0B2, C19740yt.A00(A1D(), 2131103052));
        }
        AnonymousClass6VM.A00(C108965cb.A0B(this), false);
        return layoutInflater.inflate(2131624486, viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d1, code lost:
        if (r6 != null) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r25, android.view.View r26) {
        /*
            r24 = this;
            r4 = 0
            r5 = r26
            X.C18070vi.A0d(r5, r4)
            java.lang.String r0 = "CameraStatusFragment onViewCreated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r24
            android.content.Intent r2 = X.C108955ca.A0B(r0)
            java.lang.String r1 = "jids"
            java.util.ArrayList r3 = r2.getStringArrayListExtra(r1)
            r1 = 1
            if (r3 == 0) goto L_0x00d5
            java.lang.Class<X.1BI> r2 = X.AnonymousClass1BI.class
            java.util.ArrayList r17 = X.C22971Dz.A0A(r2, r3)
            X.C18070vi.A0b(r17)
        L_0x0023:
            r2 = 2131435619(0x7f0b2063, float:1.8493085E38)
            android.view.View r7 = X.C18070vi.A05(r5, r2)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            X.7DY r6 = r0.A02
            if (r6 == 0) goto L_0x0032
            r6.A0m = r1
        L_0x0032:
            X.1FL r3 = r0.A1C()
            boolean r2 = r3 instanceof X.C1605288v
            if (r2 == 0) goto L_0x00d1
            X.88v r3 = (X.C1605288v) r3
            if (r3 == 0) goto L_0x00d1
            if (r6 == 0) goto L_0x00ac
            r6.A0R = r3
        L_0x0042:
            X.1FL r8 = X.C72453Mb.A0Z(r0)
            X.1FU r8 = (X.AnonymousClass1FU) r8
            android.content.Intent r3 = X.C108955ca.A0B(r0)
            java.lang.String r2 = "quoted_message_row_id"
            long r19 = X.C108975cc.A06(r3, r2)
            X.1yz r5 = X.AnonymousClass1EC.A01
            android.content.Intent r3 = X.C108955ca.A0B(r0)
            java.lang.String r2 = "quoted_group_jid"
            java.lang.String r2 = r3.getStringExtra(r2)
            X.1EC r11 = r5.A02(r2)
            android.content.Intent r3 = X.C108955ca.A0B(r0)
            java.lang.String r2 = "chat_opened_from_url"
            boolean r21 = r3.getBooleanExtra(r2, r4)
            android.content.Intent r3 = X.C108955ca.A0B(r0)
            java.lang.String r2 = "android.intent.extra.TEXT"
            java.lang.String r14 = r3.getStringExtra(r2)
            android.content.Intent r3 = X.C108955ca.A0B(r0)
            java.lang.String r2 = "mentions"
            java.lang.String r2 = r3.getStringExtra(r2)
            java.util.ArrayList r18 = X.AnonymousClass4aJ.A03(r2)
            android.content.Intent r3 = X.C108955ca.A0B(r0)
            java.lang.String r2 = "enable_qr_scan"
            boolean r22 = r3.getBooleanExtra(r2, r4)
            android.content.Intent r3 = X.C108955ca.A0B(r0)
            java.lang.String r2 = "add_more_image"
            boolean r23 = r3.getBooleanExtra(r2, r4)
            X.00H r2 = r0.A0A
            if (r2 == 0) goto L_0x00f6
            java.lang.Object r12 = X.C18070vi.A0E(r2)
            X.A4v r12 = (X.C20050A4v) r12
            r9 = 0
            java.lang.Integer r13 = X.AnonymousClass00R.A01
            r15 = r9
            r16 = r9
            r10 = r9
            r6.A0s(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23)
        L_0x00ac:
            X.7DY r3 = r0.A02
            if (r3 == 0) goto L_0x00b5
            int r2 = r0.A00
            r3.A0p(r2)
        L_0x00b5:
            r0.A0C = r1
            X.17x r2 = r0.A04
            if (r2 == 0) goto L_0x00f3
            r1 = 30
            boolean r1 = X.AnonymousClass74O.A0R(r0, r2, r1)
            X.7DY r0 = r0.A02
            if (r1 == 0) goto L_0x00cb
            if (r0 == 0) goto L_0x00ca
            r0.A0n()
        L_0x00ca:
            return
        L_0x00cb:
            if (r0 == 0) goto L_0x00ca
            r0.A0i()
            return
        L_0x00d1:
            if (r6 == 0) goto L_0x00ac
            goto L_0x0042
        L_0x00d5:
            X.1Dv r3 = X.AnonymousClass1BI.A00
            X.1FL r2 = r0.A1D()
            java.lang.String r2 = X.C72453Mb.A0u(r2)
            X.1BI r3 = r3.A02(r2)
            if (r3 != 0) goto L_0x00e9
            X.0wS r17 = X.C18460wS.A00
            goto L_0x0023
        L_0x00e9:
            X.1BI[] r2 = new X.AnonymousClass1BI[r1]
            r2[r4] = r3
            java.util.ArrayList r17 = X.AnonymousClass1ZU.A06(r2)
            goto L_0x0023
        L_0x00f3:
            java.lang.String r0 = "waPermissionsHelper"
            goto L_0x00f8
        L_0x00f6:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
        L_0x00f8:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.statuscomposer.composer.CameraStatusFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public void A1t() {
        Log.i("CameraStatusFragment onPause()");
        super.A1t();
        AnonymousClass7DY r0 = this.A02;
        if (r0 != null) {
            r0.A0k();
        }
    }

    public void A1u() {
        Log.i("CameraStatusFragment onResume()");
        super.A1u();
        AnonymousClass7DY r0 = this.A02;
        if (r0 != null) {
            r0.A0l();
        }
        AnonymousClass7DY r1 = this.A02;
        if (r1 != null) {
            r1.A0p(this.A00);
        }
    }

    public void A1w(int i, int i2, Intent intent) {
        if (i != 30) {
            if (i != 90) {
                super.A1w(i, i2, intent);
                return;
            }
            AnonymousClass7DY r0 = this.A02;
            if (r0 != null) {
                r0.A0q(i, i2, intent);
            }
        } else if (i2 == -1) {
            AnonymousClass7DY r1 = this.A02;
            if (r1 != null) {
                r1.A0p(this.A00);
            }
            AnonymousClass7DY r02 = this.A02;
            if (r02 != null) {
                r02.A0n();
            }
        } else {
            C108955ca.A1M(this);
        }
    }

    public boolean Bm9() {
        AnonymousClass7DY r0 = this.A02;
        if (r0 != null) {
            return r0.A0u();
        }
        return false;
    }

    public void A1r() {
        super.A1r();
        AnonymousClass7DY r0 = this.A02;
        if (r0 != null) {
            r0.A0j();
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Log.i("CameraStatusFragment onCreate");
        AnonymousClass7DX r6 = new AnonymousClass7DX(this, 2);
        C133286oV r5 = this.A09;
        if (r5 != null) {
            AnonymousClass1FU r4 = (AnonymousClass1FU) C72453Mb.A0Z(this);
            C18030ve r2 = this.A07;
            if (r2 != null) {
                C139676zG A002 = r5.A00(r4, (C135976t4) null, C18020vd.A05(C18040vf.A02, r2, 611), false);
                C133276oU r1 = this.A03;
                if (r1 != null) {
                    C18140vp r0 = this.A0B;
                    if (r0 != null) {
                        Object obj = r0.get();
                        C18070vi.A0X(obj);
                        this.A02 = r1.A00((Fragment) obj, r6, A002);
                        return;
                    }
                    C18070vi.A11("mediaPickerFragment");
                    throw null;
                }
                C18070vi.A11("cameraUiFactory");
                throw null;
            }
            AnonymousClass3MW.A1A();
        } else {
            C18070vi.A11("qrHandlerFactory");
        }
        throw null;
    }
}
