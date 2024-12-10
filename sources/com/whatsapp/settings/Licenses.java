package com.whatsapp.settings;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.C72473Md;
import X.C72483Me;
import X.C91034f2;

public class Licenses extends AnonymousClass1FY {
    public boolean A00;

    public Licenses() {
        this(0);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008b, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            X.C72463Mc.A0t(r6)
            r0 = 2131625809(0x7f0e0751, float:1.8878836E38)
            r6.setContentView((int) r0)
            r0 = 2131431983(0x7f0b122f, float:1.848571E38)
            android.view.View r2 = r6.findViewById(r0)
            com.whatsapp.wds.components.topbar.WDSToolbar r2 = (com.whatsapp.wds.components.topbar.WDSToolbar) r2
            r0 = 2131897895(0x7f122e27, float:1.9430692E38)
            r2.setTitle((int) r0)
            boolean r0 = X.C28281Zt.A0B(r6)
            if (r0 == 0) goto L_0x003b
            X.2QJ r0 = X.AnonymousClass2QJ.A00
        L_0x0023:
            r2.setIconSet(r0)
            r1 = 17
            X.4dT r0 = new X.4dT
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.setNavigationOnClickListener(r0)
            r0 = 2131431984(0x7f0b1230, float:1.8485713E38)
            android.widget.TextView r4 = X.AnonymousClass3MX.A0L(r6, r0)
            r1 = 2132017212(0x7f14003c, float:1.9672696E38)
            goto L_0x003e
        L_0x003b:
            X.1YM r0 = X.AnonymousClass1YM.A00
            goto L_0x0023
        L_0x003e:
            android.content.res.Resources r0 = r6.getResources()     // Catch:{ IOException -> 0x0084 }
            java.io.InputStream r5 = r0.openRawResource(r1)     // Catch:{ IOException -> 0x0084 }
            int r0 = r5.available()     // Catch:{ all -> 0x0078 }
            if (r0 > 0) goto L_0x004e
            r0 = 32
        L_0x004e:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0078 }
            r3.<init>(r0)     // Catch:{ all -> 0x0078 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x006e }
        L_0x0057:
            int r1 = r5.read(r2)     // Catch:{ all -> 0x006e }
            r0 = -1
            if (r1 == r0) goto L_0x0063
            r0 = 0
            r3.write(r2, r0, r1)     // Catch:{ all -> 0x006e }
            goto L_0x0057
        L_0x0063:
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x006e }
            r3.close()     // Catch:{ all -> 0x0078 }
            r5.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x008b
        L_0x006e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0078 }
        L_0x0077:
            throw r1     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r1 = move-exception
            if (r5 == 0) goto L_0x0083
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0084 }
        L_0x0083:
            throw r1     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            java.lang.String r0 = "licenses/cannot-load "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x008d
        L_0x008b:
            if (r0 != 0) goto L_0x0094
        L_0x008d:
            r0 = 2131897257(0x7f122ba9, float:1.9429398E38)
            java.lang.String r0 = r6.getString(r0)
        L_0x0094:
            r4.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.Licenses.onCreate(android.os.Bundle):void");
    }

    public Licenses(int i) {
        this.A00 = false;
        C91034f2.A00(this, 9);
    }
}
