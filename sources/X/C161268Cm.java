package X;

import android.os.Handler;
import android.os.Looper;
import androidx.preference.PreferenceFragmentCompat;

/* renamed from: X.8Cm  reason: invalid class name and case insensitive filesystem */
public class C161268Cm extends Handler {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161268Cm(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0123, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0128, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014c, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014d, code lost:
        r5 = r7[r6];
        r4 = r5.A01.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0156, code lost:
        if (r3 >= r4) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0158, code lost:
        r1 = (X.C190869le) r5.A01.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0162, code lost:
        if (r1.A01 != false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0164, code lost:
        r1.A02.onReceive(r9.A00, r5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x016d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0170, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0172, code lost:
        if (r6 >= r8) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017f, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0129;
                case 1: goto L_0x00d6;
                case 2: goto L_0x010f;
                case 3: goto L_0x00f4;
                case 4: goto L_0x0085;
                case 5: goto L_0x00ec;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            int r6 = r11.what
            r5 = 2
            java.lang.String r4 = "oldNumberEntry"
            r2 = 4
            r3 = 1
            if (r6 == r3) goto L_0x0050
            if (r6 == r5) goto L_0x0034
            r0 = 3
            r1 = 109(0x6d, float:1.53E-43)
            if (r6 == r0) goto L_0x002e
            if (r6 != r2) goto L_0x002d
            java.lang.String r0 = "ChangeNumber/timeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r10.removeMessages(r2)
        L_0x0023:
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass4Yv.A00(r0, r3)
            X.AnonymousClass4Yv.A01(r0, r1)
        L_0x002d:
            return
        L_0x002e:
            java.lang.String r0 = "ChangeNumber/error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0023
        L_0x0034:
            java.lang.String r0 = "ChangeNumber/check-number/mismatch"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r10.removeMessages(r2)
            java.lang.Object r1 = r10.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumber r1 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r1
            X.AnonymousClass4Yv.A00(r1, r3)
            r0 = 2131889268(0x7f120c74, float:1.9413195E38)
            r1.BhQ(r0)
            X.9gv r0 = r1.A0E
            if (r0 == 0) goto L_0x00e3
            android.widget.EditText r0 = r0.A03
            goto L_0x007f
        L_0x0050:
            java.lang.String r0 = "ChangeNumber/check-number/match"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r10.removeMessages(r2)
            java.lang.Object r2 = r10.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumber r2 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r2
            X.10I r1 = r2.A05
            r0 = 24
            X.C21428Ajv.A00(r1, r2, r0)
            java.lang.String r1 = com.whatsapp.registration.phonenumberentry.ChangeNumber.A0T
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r2.A0M
            X.1DT r0 = r0.A06
            java.lang.Object r0 = r0.A06()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x00e8
            X.AnonymousClass4Yv.A00(r2, r3)
            X.AnonymousClass4Yv.A01(r2, r5)
            X.9gv r0 = r2.A0E
            if (r0 == 0) goto L_0x00e3
            android.widget.EditText r0 = r0.A02
        L_0x007f:
            if (r0 == 0) goto L_0x002d
            r0.requestFocus()
            return
        L_0x0085:
            X.3Ce r4 = com.whatsapp.registration.RegisterName.A1n
            if (r4 == 0) goto L_0x002d
            java.lang.Object r3 = r10.A01
            com.whatsapp.registration.RegisterName r3 = (com.whatsapp.registration.RegisterName) r3
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x002d
            boolean r0 = r4.A04
            r2 = 1
            if (r0 == 0) goto L_0x00b1
            X.8dI r0 = r3.A0t
            if (r0 == 0) goto L_0x009d
            r0.A00(r2)
        L_0x009d:
            X.0zA r1 = r3.A0E
            if (r1 == 0) goto L_0x0179
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002d
            r1.A03()
            java.lang.String r0 = "isPremiumOrMetaVerifiedFeatureEnabled"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00b1:
            int r1 = X.AnonymousClass8BU.A02(r3)
            r0 = 37
            if (r1 != r0) goto L_0x00c5
            X.1jT r1 = r3.A4j()
            r0 = 2
            X.C33841jT.A03(r1, r0, r2)
            r0 = 0
            X.AnonymousClass4Yv.A00(r3, r0)
        L_0x00c5:
            r0 = 0
            X.AnonymousClass4Yv.A00(r3, r0)
            int r1 = r4.A00
            if (r1 == r2) goto L_0x0180
            r0 = 3
            if (r1 != r0) goto L_0x002d
            r0 = 109(0x6d, float:1.53E-43)
            X.AnonymousClass4Yv.A01(r3, r0)
            return
        L_0x00d6:
            int r1 = r11.what
            r0 = 1
            if (r1 != r0) goto L_0x002d
            java.lang.Object r0 = r10.A01
            androidx.preference.PreferenceFragmentCompat r0 = (androidx.preference.PreferenceFragmentCompat) r0
            r0.A25()
            return
        L_0x00e3:
            X.C18070vi.A11(r4)
            goto L_0x017e
        L_0x00e8:
            com.whatsapp.registration.phonenumberentry.ChangeNumber.A11(r2)
            return
        L_0x00ec:
            java.lang.Object r0 = r10.A01
            com.whatsapp.registration.RegisterName r0 = (com.whatsapp.registration.RegisterName) r0
            com.whatsapp.registration.RegisterName.A0d(r0)
            return
        L_0x00f4:
            java.lang.Object r3 = r10.A01
            X.97G r3 = (X.AnonymousClass97G) r3
            X.1KB r2 = r3.A05
            X.1E7 r0 = r3.A09
            boolean r0 = r0.A0F()
            r1 = 2131890333(0x7f12109d, float:1.9415355E38)
            if (r0 == 0) goto L_0x0108
            r1 = 2131890330(0x7f12109a, float:1.9415349E38)
        L_0x0108:
            r0 = 0
            r2.A08(r1, r0)
            android.view.View r1 = r3.A00
            goto L_0x0123
        L_0x010f:
            java.lang.Object r3 = r10.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.1KB r2 = r3.A05
            r1 = 2131890333(0x7f12109d, float:1.9415355E38)
            r0 = 0
            r2.A08(r1, r0)
            r0 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            android.view.View r1 = r3.findViewById(r0)
        L_0x0123:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0129:
            int r1 = r11.what
            r0 = 1
            if (r1 == r0) goto L_0x0132
            super.handleMessage(r11)
            return
        L_0x0132:
            java.lang.Object r9 = r10.A01
            X.A57 r9 = (X.A57) r9
        L_0x0136:
            java.util.HashMap r1 = r9.A02
            monitor-enter(r1)
            java.util.ArrayList r0 = r9.A01     // Catch:{ all -> 0x0176 }
            int r8 = r0.size()     // Catch:{ all -> 0x0176 }
            if (r8 > 0) goto L_0x0143
            monitor-exit(r1)     // Catch:{ all -> 0x0176 }
            goto L_0x0175
        L_0x0143:
            X.9ZQ[] r7 = new X.AnonymousClass9ZQ[r8]     // Catch:{ all -> 0x0176 }
            r0.toArray(r7)     // Catch:{ all -> 0x0176 }
            r0.clear()     // Catch:{ all -> 0x0176 }
            monitor-exit(r1)     // Catch:{ all -> 0x0176 }
            r6 = 0
        L_0x014d:
            r5 = r7[r6]
            java.util.ArrayList r0 = r5.A01
            int r4 = r0.size()
            r3 = 0
        L_0x0156:
            if (r3 >= r4) goto L_0x0170
            java.util.ArrayList r0 = r5.A01
            java.lang.Object r1 = r0.get(r3)
            X.9le r1 = (X.C190869le) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x016d
            android.content.BroadcastReceiver r2 = r1.A02
            android.content.Context r1 = r9.A00
            android.content.Intent r0 = r5.A00
            r2.onReceive(r1, r0)
        L_0x016d:
            int r3 = r3 + 1
            goto L_0x0156
        L_0x0170:
            int r6 = r6 + 1
            if (r6 >= r8) goto L_0x0136
            goto L_0x014d
        L_0x0175:
            return
        L_0x0176:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0176 }
            throw r0
        L_0x0179:
            java.lang.String r0 = "subscriptionManager"
            X.C18070vi.A11(r0)
        L_0x017e:
            r0 = 0
            throw r0
        L_0x0180:
            X.AnonymousClass4Yv.A01(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161268Cm.handleMessage(android.os.Message):void");
    }

    public C161268Cm(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.A00 = 1;
        this.A01 = preferenceFragmentCompat;
    }
}
