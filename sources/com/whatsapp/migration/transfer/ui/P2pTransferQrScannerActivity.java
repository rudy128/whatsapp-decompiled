package com.whatsapp.migration.transfer.ui;

import X.A7P;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass46N;
import X.AnonymousClass5YV;
import X.C130436jQ;
import X.C18070vi;
import X.C36401np;
import X.C72473Md;
import X.C72483Me;
import X.C91014f0;
import com.whatsapp.util.Log;

public class P2pTransferQrScannerActivity extends AnonymousClass46N implements AnonymousClass5YV {
    public int A00;
    public AnonymousClass1LU A01;
    public A7P A02;
    public C130436jQ A03;
    public C36401np A04;
    public AnonymousClass00H A05;
    public boolean A06;

    public P2pTransferQrScannerActivity() {
        this(0);
        this.A00 = -1;
    }

    public void Bjo(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("dialog_invalid_qr_code_tag")) {
            recreate();
        }
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A03 = AnonymousClass3MZ.A0Z(A0L);
            this.A04 = AnonymousClass3Ma.A0b(A0L);
            this.A05 = AnonymousClass3MX.A10(A0L);
            this.A04 = AnonymousClass3MY.A0e(r1);
            this.A02 = (A7P) r1.A32.get();
            this.A03 = (C130436jQ) r1.AI2.get();
            this.A01 = AnonymousClass3MY.A0Z(A0L);
        }
    }

    public boolean C5Z() {
        Log.i("p2p/P2pTransferQrScannerActivity/logout received from the server");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r1 == 4) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            android.content.Intent r2 = r11.getIntent()
            java.lang.String r1 = "hint"
            r0 = 0
            int r8 = r2.getIntExtra(r1, r0)
            if (r8 == 0) goto L_0x0088
            android.content.Intent r2 = r11.getIntent()
            java.lang.String r1 = "entry_point"
            r0 = -1
            int r1 = r2.getIntExtra(r1, r0)
            r11.A00 = r1
            r0 = 1
            if (r1 == r0) goto L_0x0089
            r0 = 2
            r6 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 == r0) goto L_0x002f
            r0 = 4
            r4 = 2131103241(0x7f060e09, float:1.7818943E38)
            r5 = 2132083119(0x7f1501af, float:1.9806371E38)
            if (r1 != r0) goto L_0x003c
        L_0x002f:
            r4 = 2131103241(0x7f060e09, float:1.7818943E38)
            r5 = 2132083119(0x7f1501af, float:1.9806371E38)
            X.A7P r0 = r11.A02
            if (r0 == 0) goto L_0x00b6
            r0.A03()
        L_0x003c:
            X.1np r10 = r11.A04
            if (r10 == 0) goto L_0x00b3
            X.00H r0 = r11.A05
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r9 = X.C18070vi.A0E(r0)
            r7 = 0
            r1 = 1
            r0 = 0
            java.lang.String r3 = "learn-more"
            java.lang.String r2 = X.C17890vO.A0R(r11, r3, r1, r0, r8)
            X.C18070vi.A0b(r2)
            r1 = 49
            X.7R0 r0 = new X.7R0
            r0.<init>(r7, r9, r11, r1)
            android.text.SpannableStringBuilder r2 = X.AnonymousClass3MY.A0A(r11, r10, r0, r2, r3)
            android.widget.TextView r0 = r11.A02
            X.C29261bv.A08(r0, r5)
            android.widget.TextView r1 = r11.A02
            android.content.res.Resources r0 = r11.getResources()
            int r0 = r0.getColor(r4)
            r1.setBackgroundColor(r0)
            android.widget.TextView r0 = r11.A02
            r0.setGravity(r6)
            android.widget.TextView r0 = r11.A02
            r0.setText(r2)
            android.widget.TextView r1 = r11.A02
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r1 = r11.A02
            X.0ve r0 = r11.A0E
            X.AnonymousClass3Ma.A1I(r1, r0)
        L_0x0088:
            return
        L_0x0089:
            r5 = 2132084269(0x7f15062d, float:1.9808704E38)
            r4 = 2131103104(0x7f060d80, float:1.7818665E38)
            r0 = 2131896913(0x7f122a51, float:1.94287E38)
            java.lang.String r3 = r11.getString(r0)
            r0 = 19
            X.4dS r2 = new X.4dS
            r2.<init>(r11, r0)
            r0 = 2131428325(0x7f0b03e5, float:1.8478291E38)
            X.1bI r1 = X.AnonymousClass3Ma.A0x(r11, r0)
            android.view.View r0 = X.C72463Mc.A0N(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r3)
            r1.A05(r2)
            r6 = 17
            goto L_0x003c
        L_0x00b3:
            java.lang.String r0 = "linkifier"
            goto L_0x00bb
        L_0x00b6:
            java.lang.String r0 = "loggingManager"
            goto L_0x00bb
        L_0x00b9:
            java.lang.String r0 = "contextualHelpHandler"
        L_0x00bb:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.P2pTransferQrScannerActivity.onCreate(android.os.Bundle):void");
    }

    public P2pTransferQrScannerActivity(int i) {
        this.A06 = false;
        C91014f0.A00(this, 46);
    }
}
