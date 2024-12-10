package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.30J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass30J implements C72123Ks {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass1BI A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ C36141nP A03;
    public final /* synthetic */ String A04;

    public final void BcN(byte[] bArr) {
        C60072nL r0;
        C36141nP r7 = this.A03;
        DeviceJid deviceJid = this.A02;
        AnonymousClass1BI r10 = this.A01;
        String str = this.A04;
        long j = this.A00;
        byte[] A022 = A3S.A02((AnonymousClass2HL) null, (C173578vJ) null, bArr);
        if (A022 != null) {
            try {
                C166418cr A012 = C166418cr.A01(A022);
                if (!AnonymousClass000.A1O(A012.bitField0_ & 65536)) {
                    C17900vP.A0Z(deviceJid, "LocationNotificationHandler/onFinalLocationNotification/axolotl e2eMessage is missing live location message; senderJid=", AnonymousClass000.A10());
                    return;
                }
                C27131Uv r8 = r7.A05;
                UserJid userJid = deviceJid.userJid;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("LocationSharingManager/onReceiveFinalLocation/jid=");
                A10.append(r10);
                A10.append("; senderJid=");
                A10.append(userJid);
                C17900vP.A0f("; msgId=", str, A10);
                AnonymousClass219 A032 = C27131Uv.A03(r8, AnonymousClass205.A01(r10, str, false));
                if (A032 == null) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("LocationSharingManager/onReceiveFinalLocation/Live location message not found; jid=");
                    A102.append(r10);
                    C17900vP.A0f("; msgId=", str, A102);
                    return;
                }
                C60072nL A023 = C27131Uv.A02(userJid, A012, A032);
                if (j > 0) {
                    A023.A05 = j;
                }
                synchronized (r8.A0T) {
                    C60072nL r02 = (C60072nL) r8.A0c.get(userJid);
                    if (r02 != null && r02.A05 < A023.A05) {
                        r8.A0f(A023);
                    }
                    Map map = (Map) C27131Uv.A05(r8).get(r10);
                    if ((map == null || !map.containsKey(userJid)) && ((r0 = A032.A02) == null || r0.A05 < A023.A05)) {
                        r8.A0Z(A023, A032);
                    }
                }
            } catch (AnonymousClass1PN e) {
                Log.w(AnonymousClass001.A1E(deviceJid, "LocationNotificationHandler/onFinalLocationNotification/axolotl derived plaintext does not represent valid protocol buffer; senderJid=", AnonymousClass000.A10()), e);
            }
        }
    }

    public /* synthetic */ AnonymousClass30J(AnonymousClass1BI r1, DeviceJid deviceJid, C36141nP r3, String str, long j) {
        this.A03 = r3;
        this.A02 = deviceJid;
        this.A01 = r1;
        this.A04 = str;
        this.A00 = j;
    }
}
