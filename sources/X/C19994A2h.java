package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.A2h  reason: case insensitive filesystem */
public class C19994A2h {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1HQ A01;
    public final C190999lr A02;
    public final A99 A03;
    public final C21501AlA A04;
    public final C20111A7t A05;
    public final AnonymousClass1VK A06;
    public final C18030ve A07;
    public final AnonymousClass1N7 A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass11P A0A;

    public static void A00(C19994A2h a2h, AnonymousClass97K r4) {
        DeviceJid deviceJid;
        Jid jid = r4.A00;
        if ((jid instanceof DeviceJid) && (deviceJid = (DeviceJid) jid) != null) {
            UserJid userJid = deviceJid.userJid;
            if (userJid instanceof PhoneUserJid) {
                AnonymousClass1E2 r1 = r4.A05;
                if (r1 != null) {
                    a2h.A03.A2n.A0P(r1, (PhoneUserJid) userJid);
                    return;
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("storePNtoLIDMappings: no senderLid found in ");
                A10.append(r4.A01.tag);
                C17890vO.A1B(A10, " stanza");
            }
        }
    }

    public void A01(DeviceJid deviceJid, DeviceJid deviceJid2, String str, long j, long j2, long j3, boolean z, boolean z2) {
        A99 a99 = this.A03;
        DeviceJid deviceJid3 = deviceJid;
        String str2 = str;
        a99.A0v(deviceJid3.userJid, str2);
        boolean z3 = z;
        if (z) {
            AnonymousClass8BX.A18(a99);
        }
        int peekIncomingOffer = Voip.peekIncomingOffer(str2, deviceJid3, deviceJid2, z3, j2, j3, z2);
        if (peekIncomingOffer == 0) {
            a99.A47 = true;
            C21375Aj4 aj4 = new C21375Aj4(this, deviceJid3, str2, 2, j, z3);
            if (C18020vd.A05(C18040vf.A02, this.A07, 12059)) {
                this.A04.execute(aj4);
            } else {
                aj4.run();
            }
        } else if (peekIncomingOffer != 70020) {
            C17900vP.A0i("voip/service/peekIncomingOffer: Voip.peekIncomingOffer failed: ", AnonymousClass000.A10(), peekIncomingOffer);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass97K r18) {
        /*
            r17 = this;
            r4 = r18
            java.lang.String r7 = r4.A03
            com.whatsapp.jid.Jid r1 = r4.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.DeviceJid
            r12 = 0
            if (r0 == 0) goto L_0x000e
            r12 = r1
            com.whatsapp.jid.DeviceJid r12 = (com.whatsapp.jid.DeviceJid) r12
        L_0x000e:
            X.C17960vV.A07(r12)
            com.whatsapp.jid.DeviceJid r11 = r4.A03
            if (r11 != 0) goto L_0x0016
            r11 = r12
        L_0x0016:
            r3 = r17
            X.0ve r2 = r3.A07
            r1 = 5588(0x15d4, float:7.83E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0052
            boolean r0 = r4.A01()
        L_0x0028:
            if (r0 == 0) goto L_0x0077
            X.9lr r0 = r3.A02
            java.lang.String r1 = "offer"
            X.00H r0 = r0.A03
            X.1OZ r3 = X.C17880vN.A0U(r0)
            X.2lD r2 = new X.2lD
            r2.<init>()
            java.lang.String r0 = "call"
            r2.A06 = r0
            r2.A08 = r7
            r2.A09 = r1
            X.C17960vV.A07(r12)
            r2.A02 = r12
            long r0 = r4.A02
            r2.A00 = r0
            X.2nR r0 = r2.A00()
            r3.A0K(r0)
            return
        L_0x0052:
            com.whatsapp.protocol.VoipStanzaChildNode r5 = r4.A01
            java.lang.String r1 = r5.tag
            java.lang.String r0 = "offer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "silence"
            com.whatsapp.protocol.VoipStanzaChildNode r1 = r5.getFirstChildByTag(r0)
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = "reason"
            X.1MD r0 = r1.getFirstAttributeByName(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "privacy"
            boolean r0 = r1.equals(r0)
            goto L_0x0028
        L_0x0077:
            X.1N7 r1 = r3.A08
            long r8 = r4.A02
            r0 = 3
            X.2tQ r0 = X.AnonymousClass1N7.A00(r1, r0, r8)
            if (r0 == 0) goto L_0x0085
            X.AnonymousClass8BY.A0y(r2, r0)
        L_0x0085:
            java.lang.String r14 = r4.A02
            X.9lr r1 = r3.A02
            X.C18070vi.A0j(r12, r11)
            X.00H r0 = r1.A03
            X.1OZ r2 = X.C17880vN.A0U(r0)
            X.0ve r4 = r1.A02
            X.190 r3 = r1.A00
            java.lang.String r5 = "call"
            java.lang.String r6 = "offer"
            r10 = 1
            X.C63902ts.A07(r3, r4, r5, r6, r7, r8, r10)
            r0 = 4
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r0)
            r13 = r7
            r15 = r8
            X.C63902ts.A06(r10, r11, r12, r13, r14, r15)
            r3 = 0
            r1 = 71
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r0, r3, r1, r3, r10)
            X.C18070vi.A0X(r0)
            r2.A0G(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19994A2h.A02(X.97K):void");
    }

    public void A03(String str) {
        if (str == null || AnonymousClass8BT.A1Y(str)) {
            A99 a99 = this.A03;
            a99.A0n(13, a99.A1r.getString(2131898115));
            return;
        }
        Voip.clearVoipParam(str);
    }

    public boolean A04(String str) {
        A99 a99 = this.A03;
        boolean A1B = a99.A1B();
        if (AnonymousClass8BT.A1Y(str)) {
            return false;
        }
        int i = a99.A04;
        if (i == 1 || (i != 0 && !A1B)) {
            return true;
        }
        return false;
    }

    public C19994A2h(AnonymousClass1KB r1, AnonymousClass1HQ r2, C190999lr r3, A99 a99, C21501AlA alA, C20111A7t a7t, AnonymousClass1VK r7, AnonymousClass11P r8, C18030ve r9, AnonymousClass1N7 r10, AnonymousClass00H r11) {
        this.A0A = r8;
        this.A07 = r9;
        this.A01 = r2;
        this.A03 = a99;
        this.A02 = r3;
        this.A05 = a7t;
        this.A08 = r10;
        this.A09 = r11;
        this.A06 = r7;
        this.A00 = r1;
        this.A04 = alA;
    }
}
