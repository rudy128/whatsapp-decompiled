package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass1NM;
import X.AnonymousClass8EC;
import X.C008203r;
import X.C008503u;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C25081Mu;
import X.C31221fD;
import X.C33621j7;
import X.C61622pz;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class ExternalMediaManager extends AnonymousClass8EC implements AnonymousClass009 {
    public C33621j7 A00;
    public AnonymousClass1NM A01;
    public C61622pz A02;
    public AnonymousClass10I A03;
    public boolean A04;
    public final Object A05;
    public volatile C008203r A06;

    public final class ExternalMediaStateReceiver extends BroadcastReceiver {
        public C25081Mu A00;
        public final Object A01;
        public volatile boolean A02;

        public void onReceive(Context context, Intent intent) {
            if (!this.A02) {
                synchronized (this.A01) {
                    if (!this.A02) {
                        this.A00 = (C25081Mu) AnonymousClass10E.A10(context).AJU.ABa.get();
                        this.A02 = true;
                    }
                }
            }
            C18070vi.A0d(context, 0);
            if (intent == null) {
                return;
            }
            if (C17890vO.A1S(intent, "android.intent.action.MEDIA_BAD_REMOVAL") || C17890vO.A1S(intent, "android.intent.action.MEDIA_EJECT") || C17890vO.A1S(intent, "android.intent.action.MEDIA_MOUNTED") || C17890vO.A1S(intent, "android.intent.action.MEDIA_REMOVED") || C17890vO.A1S(intent, "android.intent.action.MEDIA_SHARED") || C17890vO.A1S(intent, "android.intent.action.MEDIA_UNMOUNTED")) {
                C25081Mu r3 = this.A00;
                if (r3 != null) {
                    Class<ExternalMediaManager> cls = ExternalMediaManager.class;
                    r3.A01(context, intent.setClass(context, cls), cls, 5);
                    return;
                }
                C18070vi.A11("waContextHelper");
                throw null;
            }
        }

        public ExternalMediaStateReceiver(int i) {
            this.A02 = false;
            this.A01 = C17880vN.A0p();
        }

        public ExternalMediaStateReceiver() {
            this(0);
        }
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new C008203r(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public void onCreate() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E r1 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            this.A00 = (C33621j7) r1.A0g.get();
            this.A01 = (AnonymousClass1NM) r1.A6D.get();
            this.A02 = (C61622pz) r1.A00.A35.get();
            this.A03 = AnonymousClass10E.AL1(r1);
        }
        super.onCreate();
    }

    public ExternalMediaManager(int i) {
        this.A05 = C17880vN.A0p();
        this.A04 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r3 = android.os.Environment.getExternalStorageState()
            X.C18070vi.A0b(r3)
            java.lang.String r0 = "mounted"
            boolean r0 = X.C18070vi.A18(r3, r0)
            if (r0 == 0) goto L_0x0076
            X.1NM r0 = r5.A01
            if (r0 == 0) goto L_0x00be
            X.00H r0 = r0.A01
            java.lang.Object r2 = r0.get()
            X.2dm r2 = (X.C54212dm) r2
            boolean r0 = r2.A00
            r1 = 0
            if (r0 != 0) goto L_0x0024
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0068
        L_0x0024:
            r2.A00 = r1
            r2.A01 = r1
            java.lang.String r0 = "media-state-manager/external/available"
        L_0x002a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2pz r2 = r5.A02
            if (r2 == 0) goto L_0x00bb
            X.1NM r4 = r2.A02
            X.00H r1 = r4.A01
            java.lang.Object r0 = r1.get()
            X.2dm r0 = (X.C54212dm) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0068
            java.lang.Object r0 = r1.get()
            X.2dm r0 = (X.C54212dm) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0051
            X.17r r0 = r2.A00
            r0.A0h()
            X.C61622pz.A00(r2)
        L_0x0051:
            X.00H r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.A1Q r0 = (X.A1Q) r0
            r0.A02()
            X.1KB r2 = r2.A01
            r1 = 17
            X.7RA r0 = new X.7RA
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.CGP(r0)
        L_0x0068:
            X.1j7 r0 = r5.A00
            if (r0 == 0) goto L_0x00c1
            X.11r r0 = X.C33621j7.A00(r0)
            X.1oU r0 = r0.A01
            r0.A0C(r3)
            return
        L_0x0076:
            java.lang.String r0 = "mounted_ro"
            boolean r1 = X.C18070vi.A18(r3, r0)
            X.1NM r0 = r5.A01
            if (r0 == 0) goto L_0x00be
            X.00H r0 = r0.A01
            if (r1 == 0) goto L_0x009b
            java.lang.Object r2 = r0.get()
            X.2dm r2 = (X.C54212dm) r2
            boolean r0 = r2.A00
            r1 = 0
            if (r0 != 0) goto L_0x0093
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0068
        L_0x0093:
            r2.A00 = r1
            r0 = 1
            r2.A01 = r0
            java.lang.String r0 = "media-state-manager/read-only"
            goto L_0x002a
        L_0x009b:
            java.lang.Object r1 = r0.get()
            X.2dm r1 = (X.C54212dm) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0068
            r0 = 1
            r1.A00 = r0
            r1.A01 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "media-state-manager/external/unavailable "
            r1.append(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.C17890vO.A1A(r1, r0)
            goto L_0x0068
        L_0x00bb:
            java.lang.String r0 = "mediaStateRefresher"
            goto L_0x00c3
        L_0x00be:
            java.lang.String r0 = "mediaStateManager"
            goto L_0x00c3
        L_0x00c1:
            java.lang.String r0 = "backupManager"
        L_0x00c3:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ExternalMediaManager.A08(android.content.Intent):void");
    }

    public ExternalMediaManager() {
        this(0);
    }
}
