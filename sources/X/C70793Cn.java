package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Cn  reason: invalid class name and case insensitive filesystem */
public class C70793Cn implements Runnable {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    public C70793Cn(Context context, C62092qm r3, String str, C36001nB r5, int i, boolean z) {
        this.A02 = r3;
        this.A05 = str;
        this.A03 = r5;
        this.A04 = context;
        this.A01 = i;
        this.A06 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0091, code lost:
        if (X.C18020vd.A05(r2, r3, 2792) != false) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x005d;
                case 1: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r15.A02
            X.6tQ r1 = (X.C136196tQ) r1
            java.lang.String r2 = "wa_bwe_pl_classifier_mobile"
            int r5 = r15.A01
            java.lang.Object r3 = r15.A03
            X.1Di r3 = (X.C22821Di) r3
            java.lang.Object r4 = r15.A04
            X.1Di r4 = (X.C22821Di) r4
            boolean r6 = r15.A06
            r0 = 3
            X.C18070vi.A0f(r3, r0, r4)
            r1.A01(r2, r3, r4, r5, r6)
        L_0x001f:
            return
        L_0x0020:
            boolean r0 = r15.A06
            java.lang.Object r5 = r15.A02
            X.4aI r5 = (X.C88654aI) r5
            java.lang.Object r4 = r15.A03
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r3 = r15.A04
            X.4YT r3 = (X.AnonymousClass4YT) r3
            int r1 = r15.A01
            java.lang.String r2 = r15.A05
            if (r0 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x001f
            X.1eS r0 = r5.A01
            X.8oR r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x001f
        L_0x003e:
            X.1M9 r0 = r5.A00
            X.1E7 r0 = r0.A0H(r4)
            X.3ze r1 = X.C88654aI.A01(r5, r3, r0, r1)
            if (r2 == 0) goto L_0x004c
            r1.A06 = r2
        L_0x004c:
            X.00H r0 = r5.A09
            java.lang.Object r0 = r0.get()
            X.4QA r0 = (X.AnonymousClass4QA) r0
            r0.A00()
            X.18K r0 = r5.A05
            r0.CC7(r1)
            return
        L_0x005d:
            java.lang.Object r11 = r15.A02
            X.2qm r11 = (X.C62092qm) r11
            java.lang.String r6 = r15.A05
            java.lang.Object r12 = r15.A03
            X.1nB r12 = (X.C36001nB) r12
            java.lang.Object r10 = r15.A04
            android.content.Context r10 = (android.content.Context) r10
            int r13 = r15.A01
            boolean r14 = r15.A06
            r1 = 1
            r0 = 2
            X.C18070vi.A0d(r12, r0)
            X.00H r0 = r11.A05
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r0.get()
            X.2iu r0 = (X.C57332iu) r0
            X.0ve r3 = r0.A00
            r0 = 283(0x11b, float:3.97E-43)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 != 0) goto L_0x0093
            r0 = 2792(0xae8, float:3.912E-42)
            boolean r2 = X.C18020vd.A05(r2, r3, r0)
            r0 = 0
            if (r2 == 0) goto L_0x0094
        L_0x0093:
            r0 = 1
        L_0x0094:
            r8 = 0
            if (r0 == 0) goto L_0x0107
            X.00H r0 = r11.A05
            if (r0 == 0) goto L_0x011b
            java.lang.Object r0 = r0.get()
            X.2iu r0 = (X.C57332iu) r0
            X.9nz r3 = r0.A00()
        L_0x00a5:
            X.00H r0 = r11.A06
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r0.get()
            X.A1D r0 = (X.A1D) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00c7
            X.00H r0 = r11.A06
            if (r0 == 0) goto L_0x010f
            java.lang.Object r0 = r0.get()
            X.A1D r0 = (X.A1D) r0
            android.util.Pair r0 = r0.A01(r8, r1)
            java.lang.Object r8 = r0.second
            java.lang.String r8 = (java.lang.String) r8
        L_0x00c7:
            X.1KB r2 = r11.A00
            if (r2 == 0) goto L_0x010c
            r1 = 27
            X.3Bu r0 = new X.3Bu
            r0.<init>(r11, r1)
            r2.A0J(r0)
            X.00H r0 = r11.A04
            if (r0 == 0) goto L_0x0109
            X.1cN r0 = X.C17880vN.A0I(r0)
            X.00H r0 = r0.A0F
            X.2u4 r0 = X.C17880vN.A0J(r0)
            java.util.List r0 = r0.A0F()
            int r0 = r0.size()
            int r1 = r0 + 2
            X.00H r0 = r11.A07
            if (r0 == 0) goto L_0x0124
            java.lang.Object r2 = r0.get()
            X.9m7 r2 = (X.C191159m7) r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            X.37i r4 = new X.37i
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.String r7 = "gcm"
            r2.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x0107:
            r3 = r8
            goto L_0x00a5
        L_0x0109:
            java.lang.String r0 = "accountSwitcher"
            goto L_0x0126
        L_0x010c:
            java.lang.String r0 = "globalUI"
            goto L_0x0126
        L_0x010f:
            java.lang.String r0 = "pushEncryptionHelper"
            X.C18070vi.A11(r0)
            throw r8
        L_0x0115:
            java.lang.String r0 = "pushEncryptionHelper"
            X.C18070vi.A11(r0)
            throw r8
        L_0x011b:
            java.lang.String r0 = "mutedChatPushConfigHelper"
            X.C18070vi.A11(r0)
            throw r8
        L_0x0121:
            java.lang.String r0 = "mutedChatPushConfigHelper"
            goto L_0x0126
        L_0x0124:
            java.lang.String r0 = "pushXmppMethods"
        L_0x0126:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70793Cn.run():void");
    }

    public C70793Cn(C136196tQ r2, C22821Di r3, C22821Di r4, int i, boolean z) {
        this.A02 = r2;
        this.A05 = "wa_bwe_pl_classifier_mobile";
        this.A01 = i;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = z;
    }

    public C70793Cn(C88654aI r2, AnonymousClass4YT r3, UserJid userJid, String str, int i, boolean z) {
        this.A06 = z;
        this.A02 = r2;
        this.A03 = userJid;
        this.A04 = r3;
        this.A01 = i;
        this.A05 = str;
    }
}
