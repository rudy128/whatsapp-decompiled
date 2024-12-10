package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.8Ga  reason: invalid class name and case insensitive filesystem */
public class C161578Ga extends AnonymousClass1J2 implements B8a {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass1QR A03;
    public final C18030ve A04;
    public final AnonymousClass10I A05;
    public final HashMap A06 = C17880vN.A11();
    public final C20752AXh A07;
    public final A7U A08;
    public final C175788zH A09;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r16 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C3q(com.whatsapp.jid.UserJid r12, X.C1418477e r13, X.C1418477e r14, X.C1418477e r15, X.A7B r16, java.lang.String r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22) {
        /*
            r11 = this;
            X.1DT r1 = r11.A00
            r0 = 0
            X.AnonymousClass3MY.A1L(r1, r0)
            X.9hR r2 = new X.9hR
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r17
            r8 = r18
            r10 = r20
            r9 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r16
            if (r19 == 0) goto L_0x0028
            if (r16 != 0) goto L_0x002a
            if (r21 == 0) goto L_0x0020
            r0 = 1
        L_0x0020:
            r2.A06 = r0
            X.1DT r1 = r11.A01
        L_0x0024:
            r1.A0F(r2)
            return
        L_0x0028:
            if (r16 == 0) goto L_0x0044
        L_0x002a:
            X.AXh r2 = r11.A07
            int r1 = r1.A00
            X.A7U r0 = r11.A08
            X.9ui r0 = r0.A04
            X.A1c r1 = r2.A02(r0, r1)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x0044
        L_0x003e:
            X.1DT r0 = r11.A02
            r0.A0F(r1)
            return
        L_0x0044:
            X.1DT r1 = r11.A02
            r0 = 2131893867(0x7f121e6b, float:1.9422523E38)
            X.A1c r2 = new X.A1c
            r2.<init>(r0)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161578Ga.C3q(com.whatsapp.jid.UserJid, X.77e, X.77e, X.77e, X.A7B, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    public C161578Ga(AnonymousClass1QR r2, C18030ve r3, C20752AXh aXh, A7U a7u, C175788zH r6, AnonymousClass10I r7) {
        this.A04 = r3;
        this.A05 = r7;
        this.A07 = aXh;
        this.A08 = a7u;
        this.A03 = r2;
        this.A09 = r6;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.9hR, java.lang.Object] */
    public void A0T(C1418477e r5, C1418477e r6) {
        String str = (String) AnonymousClass8BT.A0q(r5);
        if (!TextUtils.isEmpty(str) && C20061A5k.A02(r6)) {
            C1418477e A0K = AnonymousClass8BW.A0K(this.A06.get(AnonymousClass8BS.A0n(str)), "accountHolderName");
            if (!C20061A5k.A02(A0K)) {
                ? obj = new Object();
                obj.A06 = false;
                obj.A03 = r5;
                obj.A01 = A0K;
                obj.A09 = true;
                this.A01.A0F(obj);
                return;
            }
        }
        AnonymousClass3MY.A1L(this.A00, true);
        this.A09.A01(r5, r6, this);
    }
}
