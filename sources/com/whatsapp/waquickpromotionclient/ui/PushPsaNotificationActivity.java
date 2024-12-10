package com.whatsapp.waquickpromotionclient.ui;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C1423379b;

public final class PushPsaNotificationActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A00 = C000200d.A00(A0A.A5I);
            this.A01 = C000200d.A00(A0A.AfM);
            this.A02 = C000200d.A00(A0A.AfN);
        }
    }

    public PushPsaNotificationActivity(int i) {
        this.A03 = false;
        C1423379b.A00(this, 23);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (r3 != null) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cf A[Catch:{ Exception -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            android.content.Intent r0 = r11.getIntent()
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "PushPsaNotificationActivity/null intent"
        L_0x000b:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000f:
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "is_dismiss_intent"
            boolean r4 = X.AnonymousClass3MY.A1a(r1, r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "campaign_id"
            java.lang.String r7 = r1.getStringExtra(r0)
            if (r7 != 0) goto L_0x0028
            java.lang.String r0 = "PushPsaNotificationActiity/null campaign ID"
            goto L_0x000b
        L_0x0028:
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "eligibility_duration_after_impression_ms"
            r2 = -1
            int r10 = r1.getIntExtra(r0, r2)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "surface_id"
            int r8 = r1.getIntExtra(r0, r2)
            if (r4 == 0) goto L_0x007e
            X.00H r0 = r11.A02
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r5 = r0.get()
            X.6wx r5 = (X.C138366wx) r5
            r9 = 2
            X.9Ik r6 = X.C179549Ik.DISMISS_ACTION
            X.C138366wx.A00(r5, r6, r7, r8, r9, r10)
        L_0x004f:
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "inorganic_notification_id"
            java.lang.String r5 = r1.getStringExtra(r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "inorganic_notification_type"
            java.lang.String r6 = r1.getStringExtra(r0)
            if (r5 == 0) goto L_0x007a
            if (r6 == 0) goto L_0x007a
            r8 = 3
            if (r4 == 0) goto L_0x006b
            r8 = 2
        L_0x006b:
            X.00H r0 = r11.A00
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.6pl r2 = (X.C133946pl) r2
            r3 = 0
            r4 = r3
            r2.A01(r3, r4, r5, r6, r7, r8)
        L_0x007a:
            r11.finish()
            return
        L_0x007e:
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "deep_link"
            java.lang.String r3 = r1.getStringExtra(r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "universal_link"
            java.lang.String r2 = r1.getStringExtra(r0)
            X.00H r0 = r11.A02
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r5 = r0.get()
            X.6wx r5 = (X.C138366wx) r5
            r9 = 1
            X.9Ik r6 = X.C179549Ik.PRIMARY_ACTION
            X.C138366wx.A00(r5, r6, r7, r8, r9, r10)
            X.00H r0 = r11.A01
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r1 = r0.get()
            X.6o3 r1 = (X.C133026o3) r1
            if (r3 == 0) goto L_0x00b4
            int r0 = r3.length()
            if (r0 != 0) goto L_0x00be
        L_0x00b4:
            if (r2 == 0) goto L_0x004f
            int r0 = r2.length()
            if (r0 == 0) goto L_0x004f
            if (r3 == 0) goto L_0x00c9
        L_0x00be:
            int r0 = r3.length()     // Catch:{ Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x00c9
            android.net.Uri r2 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00cd
        L_0x00c9:
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00e6 }
        L_0x00cd:
            if (r2 == 0) goto L_0x004f
            if (r3 != 0) goto L_0x00d6
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r2)
            goto L_0x00e1
        L_0x00d6:
            X.118 r0 = r1.A00
            android.content.Context r1 = X.C108945cZ.A0E(r0)
            r0 = 2
            android.content.Intent r0 = X.AnonymousClass1LU.A0O(r1, r2, r0)
        L_0x00e1:
            r11.startActivity(r0)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x004f
        L_0x00e6:
            java.lang.String r0 = "PushPsaNotificationComposer/Couldn't parse URI"
            goto L_0x00f4
        L_0x00e9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PushPsaNotificationComposer/couldn't start activity: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
        L_0x00f4:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x004f
        L_0x00f9:
            java.lang.String r0 = "inorganicNotificationLogger"
            goto L_0x0101
        L_0x00fc:
            java.lang.String r0 = "pushPsaNotificationLogger"
            goto L_0x0101
        L_0x00ff:
            java.lang.String r0 = "pushPsaNotificationComposer"
        L_0x0101:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waquickpromotionclient.ui.PushPsaNotificationActivity.onCreate(android.os.Bundle):void");
    }

    public PushPsaNotificationActivity() {
        this(0);
    }
}
