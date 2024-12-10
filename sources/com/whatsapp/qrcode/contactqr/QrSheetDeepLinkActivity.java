package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass18K;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LA;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass1XN;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6h0;
import X.C000200d;
import X.C107625aK;
import X.C108955ca;
import X.C108985cd;
import X.C109005cf;
import X.C132996o0;
import X.C133286oV;
import X.C139676zG;
import X.C1423279a;
import X.C1596385h;
import X.C192639oj;
import X.C24921Me;
import X.C25161Nd;
import X.C30801eX;
import X.C31041ev;
import X.C32971i3;
import X.C36361nl;
import X.C37511pf;
import X.C678831f;
import X.C72453Mb;

public class QrSheetDeepLinkActivity extends AnonymousClass1FY implements C107625aK, C1596385h {
    public AnonymousClass1LA A00;
    public C36361nl A01;
    public AnonymousClass6h0 A02;
    public AnonymousClass1M9 A03;
    public C37511pf A04;
    public AnonymousClass1PM A05;
    public C24921Me A06;
    public C678831f A07;
    public C25161Nd A08;
    public C30801eX A09;
    public C32971i3 A0A;
    public C192639oj A0B;
    public AnonymousClass18K A0C;
    public AnonymousClass1XN A0D;
    public AnonymousClass1QO A0E;
    public AnonymousClass1QS A0F;
    public C31041ev A0G;
    public C139676zG A0H;
    public C133286oV A0I;
    public C132996o0 A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public String A0O;
    public boolean A0P;

    public void A2y() {
        if (!this.A0P) {
            this.A0P = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r2 = A0A2.A00;
            C109005cf.A0d(A0A2, r2, this);
            C109005cf.A0e(A0A2, r2, this, r2.A5A);
            this.A0C = AnonymousClass3Ma.A0g(A0A2);
            this.A0K = C000200d.A00(r2.A00);
            this.A01 = C108985cd.A0N(A0A2);
            this.A0M = C000200d.A00(A0A2.A6N);
            this.A03 = AnonymousClass10E.A4z(A0A2);
            this.A06 = AnonymousClass3MZ.A0g(A0A2);
            this.A0L = C000200d.A00(A0A2.A3B);
            this.A0F = (AnonymousClass1QS) A0A2.A8J.get();
            this.A07 = (C678831f) r2.A10.get();
            this.A00 = C72453Mb.A0b(A0A2);
            this.A0A = (C32971i3) A0A2.AJn.get();
            this.A05 = AnonymousClass3MZ.A0f(A0A2);
            this.A08 = (C25161Nd) A0A2.A2v.get();
            this.A0E = (AnonymousClass1QO) A0A2.A8G.get();
            this.A0J = (C132996o0) A0K2.A5d.get();
            this.A0D = (AnonymousClass1XN) r2.A0d.get();
            this.A0G = (C31041ev) A0A2.AcR.get();
            this.A04 = (C37511pf) A0A2.AX7.get();
            this.A09 = (C30801eX) A0A2.AL8.get();
            this.A0N = C000200d.A00(A0A2.ABc);
            this.A02 = (AnonymousClass6h0) r2.A7K.get();
            this.A0B = (C192639oj) r2.A7O.get();
            this.A0I = AnonymousClass1K1.A1b(A0K2);
        }
    }

    public QrSheetDeepLinkActivity(int i) {
        this.A0P = false;
        C1423279a.A00(this, 35);
    }

    public void C2J() {
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a A[Catch:{ Exception -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[Catch:{ Exception -> 0x0083 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            X.0ve r2 = r11.A0E
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r1 = 11655(0x2d87, float:1.6332E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0081
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "external_entry_point_data"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 == 0) goto L_0x0081
            r4 = 0
            org.json.JSONObject r2 = X.C17880vN.A16(r0)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r1 = "type"
            boolean r0 = r2.isNull(r1)     // Catch:{ Exception -> 0x0083 }
            if (r0 != 0) goto L_0x005b
            int r3 = r2.optInt(r1)     // Catch:{ Exception -> 0x0083 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0083 }
            if (r0 == 0) goto L_0x005b
            X.0z2 r0 = X.AnonymousClass6RX.A00     // Catch:{ Exception -> 0x0083 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x0083 }
        L_0x003c:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0083 }
            if (r0 == 0) goto L_0x0079
            java.lang.Object r6 = r1.next()     // Catch:{ Exception -> 0x0083 }
            X.6RX r6 = (X.AnonymousClass6RX) r6     // Catch:{ Exception -> 0x0083 }
            int r0 = r6.value     // Catch:{ Exception -> 0x0083 }
            if (r0 != r3) goto L_0x003c
        L_0x004c:
            java.lang.String r0 = "token"
            java.lang.String r8 = X.A6n.A02(r0, r2)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r1 = "source"
            boolean r0 = r2.isNull(r1)     // Catch:{ Exception -> 0x0083 }
            if (r0 == 0) goto L_0x005f
            goto L_0x005d
        L_0x005b:
            r6 = r4
            goto L_0x004c
        L_0x005d:
            r7 = 0
            goto L_0x0067
        L_0x005f:
            int r0 = r2.optInt(r1)     // Catch:{ Exception -> 0x0083 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0083 }
        L_0x0067:
            java.lang.String r0 = "referer"
            java.lang.String r9 = X.A6n.A02(r0, r2)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r0 = "text_hash"
            java.lang.String r10 = X.A6n.A02(r0, r2)     // Catch:{ Exception -> 0x0083 }
            X.6t4 r5 = new X.6t4     // Catch:{ Exception -> 0x0083 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0083 }
            goto L_0x008e
        L_0x0079:
            java.lang.String r1 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x0083 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0083 }
            throw r0     // Catch:{ Exception -> 0x0083 }
        L_0x0081:
            r5 = 0
            goto L_0x008e
        L_0x0083:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "QrHandlerExternalEntryPointData.fromJsonString/"
            X.C108995ce.A1M(r0, r1, r2)
            r5 = r4
        L_0x008e:
            X.6oV r0 = r11.A0I
            r6 = 0
            r3 = 0
            X.6zG r2 = r0.A00(r11, r5, r6, r6)
            r11.A0H = r2
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "extra_deep_link_session_id"
            java.lang.String r0 = r1.getStringExtra(r0)
            r2.A01 = r0
            X.6zG r1 = r11.A0H
            r0 = 1
            r1.A02 = r0
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "qrcode"
            java.lang.String r0 = r1.getStringExtra(r0)
            r11.A0O = r0
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "from_internal_deep_link_click"
            boolean r7 = r1.getBooleanExtra(r0, r6)
            java.lang.String r4 = r11.A0O
            if (r4 == 0) goto L_0x00d1
            X.6zG r0 = r11.A0H
            boolean r0 = r0.A0j
            if (r0 != 0) goto L_0x00d1
            r11.A0O = r4
            X.6zG r2 = r11.A0H
            r5 = 5
            r2.A02(r3, r4, r5, r6, r7)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.contactqr.QrSheetDeepLinkActivity.onCreate(android.os.Bundle):void");
    }

    public QrSheetDeepLinkActivity() {
        this(0);
    }
}
