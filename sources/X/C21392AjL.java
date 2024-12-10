package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.AjL  reason: case insensitive filesystem */
public class C21392AjL implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public final void run() {
        AnonymousClass1P3 r3;
        String str;
        A4S A09;
        C36141nP r8 = (C36141nP) this.A02;
        String str2 = this.A07;
        C194059r6 r7 = (C194059r6) this.A03;
        int i = this.A00;
        long j = this.A01;
        Object obj = this.A04;
        DeviceJid deviceJid = (DeviceJid) this.A05;
        C72123Ks r5 = (C72123Ks) this.A06;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LocationNotificationHandler/onFinalLocationNotification/axolotl received a location notification; jid=");
        A10.append(obj);
        A10.append("senderJid=");
        A10.append(deviceJid);
        C17900vP.A0j("; retryCount=", A10, i);
        C60002nE A022 = C63962tz.A02(deviceJid);
        int i2 = r7.A00;
        if (i2 == 3) {
            C59982nC r4 = new C59982nC(A022, C173408v1.A00.getRawString());
            r3 = r8.A03;
            int i3 = r3.A0A(r5, r4, r7.A01).A00;
            if (i3 != 0) {
                C17900vP.A0k("LocationNotificationHandler/axolotl error while decrypt-group-using-fast-fatchet; status=", AnonymousClass000.A10(), i3);
                if (i3 == -1001) {
                    if (j != 0) {
                        return;
                    }
                } else if (i3 == -1005 || i3 == -1203 || i3 == -1202 || i3 == -1204 || i3 == -1205 || i3 == -1206 || i3 == -1008) {
                    str = "LocationNotificationHandler/axolotl|should try to send retry";
                    Log.w(str);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (i2 == 0) {
                r3 = r8.A03;
                A09 = r3.A08(r5, A022, r7.A01);
            } else if (i2 == 1) {
                r3 = r8.A03;
                A09 = r3.A09(r5, A022, r7.A01);
            } else {
                C17900vP.A0k("LocationNotificationHandler/onFinalLocationNotification/axolotl unrecognized ciphertext type; type=", AnonymousClass000.A10(), i2);
                return;
            }
            int i4 = A09.A00;
            if (i4 != 0) {
                C17900vP.A0k("LocationNotificationHandler/axolotl error; status=", AnonymousClass000.A10(), i4);
            }
            if (A09.A01()) {
                str = AnonymousClass001.A1I("LocationNotificationHandler/axolotl|should try to send retry; status=", AnonymousClass000.A10(), i4);
                Log.w(str);
            } else {
                return;
            }
        }
        r8.A00.A0J(new C21379Aj8(r8, obj, deviceJid, str2, i, r3.A06(), 1));
    }

    public C21392AjL(C72123Ks r1, AnonymousClass1BI r2, DeviceJid deviceJid, C36141nP r4, C194059r6 r5, String str, int i, long j) {
        this.A02 = r4;
        this.A07 = str;
        this.A03 = r5;
        this.A00 = i;
        this.A01 = j;
        this.A04 = r2;
        this.A05 = deviceJid;
        this.A06 = r1;
    }
}
