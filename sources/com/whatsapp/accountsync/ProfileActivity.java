package com.whatsapp.accountsync;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass126;
import X.AnonymousClass190;
import X.AnonymousClass1Cd;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass4Yv;
import X.C166678dR;
import X.C166708dq;
import X.C177709Ag;
import X.C17900vP;
import X.C19880zA;
import X.C26271Rm;
import X.C33621j7;
import X.C33841jT;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public class ProfileActivity extends C166708dq {
    public C19880zA A00;
    public AnonymousClass190 A01;
    public C26271Rm A02;
    public C177709Ag A03 = null;
    public C33621j7 A04;
    public AnonymousClass1M9 A05;
    public AnonymousClass1Cd A06;
    public AnonymousClass126 A07;
    public AnonymousClass1LU A08;
    public WhatsAppLibLoader A09;
    public C33841jT A0A;
    public AnonymousClass00H A0B;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150) {
            if (i2 == -1) {
                A0Q(this);
            } else {
                Log.w("profileactivity/contact access denied");
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        if ("vnd.android.cursor.item/vnd.com.whatsapp.video.call".equals(r6) == false) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Q(com.whatsapp.accountsync.ProfileActivity r10) {
        /*
            boolean r0 = r10.Bed()
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "sync profile activity already finishing, ignoring gotoActivity call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x000c:
            X.00H r0 = r10.A0B
            boolean r0 = X.C72463Mc.A1W(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0021
            r2 = 2131894324(0x7f122034, float:1.942345E38)
            r1 = 2131894328(0x7f122038, float:1.9423458E38)
            r0 = 150(0x96, float:2.1E-43)
            X.AnonymousClass74O.A0A(r10, r2, r1, r0, r3)
            return
        L_0x0021:
            android.net.Uri r0 = X.AnonymousClass8BT.A06(r10)
            if (r0 == 0) goto L_0x00bf
            X.11S r0 = r10.A02
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x00bf
            X.11C r0 = r10.A08     // Catch:{ IllegalArgumentException -> 0x00ae }
            X.11B r4 = r0.A0O()     // Catch:{ IllegalArgumentException -> 0x00ae }
            android.net.Uri r5 = X.AnonymousClass8BT.A06(r10)     // Catch:{ IllegalArgumentException -> 0x00ae }
            r6 = 0
            r8 = r6
            r9 = r6
            r7 = r6
            android.database.Cursor r2 = r4.A03(r5, r6, r7, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00ae }
            if (r2 == 0) goto L_0x00bf
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = "mimetype"
            java.lang.String r6 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "data1"
            java.lang.String r0 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x00a4 }
            com.whatsapp.jid.UserJid r5 = X.C22941Dw.A02(r0)     // Catch:{ all -> 0x00a4 }
            if (r5 == 0) goto L_0x00a0
            boolean r0 = r10 instanceof com.whatsapp.accountsync.CallContactLandingActivity     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0088
            r4 = r10
            com.whatsapp.accountsync.CallContactLandingActivity r4 = (com.whatsapp.accountsync.CallContactLandingActivity) r4     // Catch:{ all -> 0x00a4 }
            X.00H r0 = r4.A04     // Catch:{ all -> 0x00a4 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00a4 }
            X.9sx r0 = (X.C195199sx) r0     // Catch:{ all -> 0x00a4 }
            r0.A01()     // Catch:{ all -> 0x00a4 }
            X.10I r1 = r4.A05     // Catch:{ all -> 0x00a4 }
            r0 = 16
            X.C21459AkQ.A01(r1, r4, r5, r6, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x00a0
        L_0x0084:
            r10.finish()     // Catch:{ all -> 0x00a4 }
            goto L_0x009c
        L_0x0088:
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x00a0
            X.1L9 r1 = r10.A01     // Catch:{ all -> 0x00a4 }
            X.1LU r0 = r10.A08     // Catch:{ all -> 0x00a4 }
            android.content.Intent r0 = X.AnonymousClass3MY.A06(r10, r0, r5)     // Catch:{ all -> 0x00a4 }
            r1.A09(r10, r0)     // Catch:{ all -> 0x00a4 }
            goto L_0x0084
        L_0x009c:
            r2.close()     // Catch:{ IllegalArgumentException -> 0x00ae }
            return
        L_0x00a0:
            r2.close()     // Catch:{ IllegalArgumentException -> 0x00ae }
            goto L_0x00bf
        L_0x00a4:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00ae }
        L_0x00ad:
            throw r1     // Catch:{ IllegalArgumentException -> 0x00ae }
        L_0x00ae:
            r1 = move-exception
            java.lang.String r0 = "Error trying to get jid from intent"
            com.whatsapp.util.Log.e(r0, r1)
            X.190 r2 = r10.A01
            java.lang.String r1 = "Error parsing JID from intent"
            r0 = 0
            r2.A0G(r1, r0, r3)
            r10.finish()
        L_0x00bf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "failed to go anywhere from sync profile activity; intent="
            r1.append(r0)
            android.content.Intent r0 = r10.getIntent()
            r1.append(r0)
            X.C17890vO.A0w(r1)
            X.11S r0 = r10.A02
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x00f7
            X.0ve r2 = r10.A0E
            r1 = 8680(0x21e8, float:1.2163E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = "Companion mode is not supported triggering removal of contact mimetypes in background"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.10I r2 = r10.A05
            r1 = 28
            X.3Bu r0 = new X.3Bu
            r0.<init>(r10, r1)
            r2.CGF(r0)
        L_0x00f7:
            r10.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.ProfileActivity.A0Q(com.whatsapp.accountsync.ProfileActivity):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A09.A04()) {
            Log.i("aborting due to native libraries missing");
        } else {
            AnonymousClass11S r0 = this.A02;
            r0.A0I();
            if (r0.A00 == null || !this.A07.A04()) {
                this.A05.A08(2131890425, 1);
            } else {
                AnonymousClass1Cd r02 = this.A06;
                r02.A06();
                if (r02.A08) {
                    A4c();
                    return;
                } else if (C166678dR.A2B(this).BEi()) {
                    int A0E = C33621j7.A00(this.A04).A09.A0E();
                    C17900vP.A0j("profileactivity/create/backupfilesfound ", AnonymousClass000.A10(), A0E);
                    if (A0E > 0) {
                        AnonymousClass4Yv.A01(this, 105);
                        return;
                    } else {
                        A4e(false);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        finish();
    }
}
