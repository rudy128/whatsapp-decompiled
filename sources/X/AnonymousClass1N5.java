package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1N5  reason: invalid class name */
public class AnonymousClass1N5 {
    public final AnonymousClass190 A00;
    public final AnonymousClass1MR A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass11P A03;
    public final C19830z4 A04;
    public final AnonymousClass1N4 A05;
    public final C18030ve A06;
    public final C24901Mc A07;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1.A02() != false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A00(X.AnonymousClass1BI r5) {
        /*
            r4 = this;
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A01(r5)
            r2 = 0
            if (r5 == 0) goto L_0x002b
            if (r3 == 0) goto L_0x002b
            X.1Mc r0 = r4.A07
            boolean r0 = r0.A0A(r3)
            if (r0 != 0) goto L_0x002b
            X.1M9 r0 = r4.A02
            X.1E7 r0 = r0.A0E(r5)
            if (r0 == 0) goto L_0x002b
            X.1yf r1 = r0.A0G
            if (r1 == 0) goto L_0x002c
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x0037
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            return r2
        L_0x002c:
            X.0ve r2 = r4.A06
            r1 = 3962(0xf7a, float:5.552E-42)
        L_0x0030:
            X.0vf r0 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r0, r2, r1)
            goto L_0x004d
        L_0x0037:
            X.1N4 r0 = r4.A05
            boolean r0 = r0.A00(r3)
            X.0ve r2 = r4.A06
            r1 = 5263(0x148f, float:7.375E-42)
            if (r0 == 0) goto L_0x0030
            r1 = 9804(0x264c, float:1.3738E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r2 = r0 ^ 1
        L_0x004d:
            if (r2 == 0) goto L_0x002b
            java.lang.String r0 = "Disabling read receipts for possible spam"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1N5.A00(X.1BI):boolean");
    }

    public C55942gc A01(AnonymousClass1BI r20, AnonymousClass1BI r21, DeviceJid deviceJid, UserJid userJid, String[] strArr, int i, long j, boolean z) {
        C55942gc r12;
        AnonymousClass1BI r13 = r21;
        AnonymousClass1BI r6 = r20;
        String A022 = A02(r6, z);
        DeviceJid deviceJid2 = deviceJid;
        UserJid userJid2 = userJid;
        String[] strArr2 = strArr;
        int i2 = i;
        if (C22971Dz.A0a(r13)) {
            Log.w("ReadReceiptUtils/buildReadReceiptHandler malformed participant flipping");
            r12 = new C55942gc(r6, deviceJid2, userJid2, new AnonymousClass205(C29671cg.A00, strArr[0], false), A022, i2);
        } else {
            AnonymousClass205 r1 = new AnonymousClass205(r6, strArr[0], false);
            if (C22971Dz.A0Z(r6)) {
                r13 = null;
            }
            r12 = new C55942gc(r13, deviceJid2, userJid2, r1, A022, i2);
        }
        r12.A01 = j;
        int length = strArr2.length;
        if (length > 1) {
            int i3 = length - 1;
            String[] strArr3 = new String[i3];
            r12.A02 = strArr3;
            System.arraycopy(strArr2, 1, strArr3, 0, i3);
        }
        return r12;
    }

    public String A02(AnonymousClass1BI r3, boolean z) {
        return (z || (!C22971Dz.A0e(r3) && !this.A04.A2U()) || C22971Dz.A0V(r3) || C22971Dz.A0Z(r3) || A00(r3)) ? "read-self" : "read";
    }

    public boolean A06(AnonymousClass206 r6) {
        if (r6.A0I < 1415214000000L || (r6 instanceof C445623x) || (r6 instanceof AnonymousClass212) || (r6 instanceof AnonymousClass22M) || !A04(r6.A0v.A00)) {
            return false;
        }
        return true;
    }

    public AnonymousClass1N5(AnonymousClass190 r1, AnonymousClass1M9 r2, AnonymousClass11P r3, C19830z4 r4, AnonymousClass1N4 r5, AnonymousClass1MR r6, C18030ve r7, C24901Mc r8) {
        this.A03 = r3;
        this.A06 = r7;
        this.A00 = r1;
        this.A07 = r8;
        this.A02 = r2;
        this.A01 = r6;
        this.A04 = r4;
        this.A05 = r5;
    }

    public boolean A03(AnonymousClass1BI r3) {
        if (A04(r3) || (!this.A01.A02().isEmpty())) {
            return true;
        }
        return false;
    }

    public boolean A04(AnonymousClass1BI r4) {
        if (C22971Dz.A0e(r4) || C22971Dz.A0V(r4) || C22971Dz.A0Z(r4)) {
            return true;
        }
        if (!C22971Dz.A0S(r4) && this.A04.A2U() && !A00(r4)) {
            return true;
        }
        return false;
    }

    public boolean A05(AnonymousClass1BI r5, Throwable th, String[] strArr, long j, boolean z) {
        if (A03(r5)) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (AnonymousClass1EG.A0H(strArr[i])) {
                    Log.e("ReadReceiptUtils/buildReadReceiptHandler received invalid message id(s)");
                    if (th != null) {
                        this.A00.A0E("SendReadReceiptInvalidMessageIds", "Unable to send read receipts as it has invalid message id(s)", th);
                    }
                } else {
                    i++;
                }
            }
            if (C22971Dz.A0a(r5) && j > 0 && j + 86400000 < AnonymousClass11P.A01(this.A03)) {
                return false;
            }
            if (!"read-self".equals(A02(r5, z)) || (!this.A01.A02().isEmpty())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
