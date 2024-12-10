package X;

import java.util.Set;

public final class AVI implements C72443Lz {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ce, code lost:
        if (r3.A00 != null) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e4, code lost:
        if (r2 == null) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r11.A05 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BLq(X.C196049uN r23, X.C195829ty r24, X.A1O r25) {
        /*
            r22 = this;
            r13 = r23
            r12 = r24
            r11 = r25
            boolean r10 = X.AnonymousClass8BX.A1U(r11, r12, r13)
            com.whatsapp.jid.Jid r0 = r11.A06
            r21 = r0
            X.1BI r14 = X.C22971Dz.A00(r21)
            X.C17960vV.A07(r14)
            X.C18070vi.A0X(r14)
            boolean r0 = r14 instanceof X.AnonymousClass1E9
            if (r0 == 0) goto L_0x0021
            com.whatsapp.jid.DeviceJid r0 = r11.A05
            r9 = 1
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r9 = 0
        L_0x0022:
            X.9mc r8 = r13.A03
            X.BC8 r7 = r13.A01
            X.9ry r0 = r8.A04
            r6 = r22
            if (r0 == 0) goto L_0x004f
            java.util.Map r1 = r0.A02
            X.9s0 r3 = r0.A01
        L_0x0030:
            java.util.Map r2 = r3.A02
            if (r2 == 0) goto L_0x0156
            java.util.Iterator r4 = X.AnonymousClass000.A15(r2)
        L_0x0038:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r0 = X.C17890vO.A0P(r4)
            X.9r6 r0 = (X.C194059r6) r0
            int r0 = r0.A00
            if (r0 != r10) goto L_0x0038
            int r0 = r13.A00
            int r0 = r0 + 1
            r13.A00 = r0
            goto L_0x0038
        L_0x004f:
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x0092
            r0 = r21
            boolean r0 = r0 instanceof X.AnonymousClass1E9
            if (r0 != 0) goto L_0x0092
            X.11S r15 = r6.A01
            boolean r0 = r15.A0S(r14)
            java.util.Collection r5 = r12.A05
            if (r0 == 0) goto L_0x0088
            java.util.Map r1 = r7.BV7(r5)
            boolean r0 = X.AnonymousClass8BR.A1Y(r1)
            if (r0 != 0) goto L_0x0096
            r15.A0I()
            X.1E3 r2 = r15.A02
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            X.2kT r0 = r12.A01
            if (r0 == 0) goto L_0x0086
            int r1 = r0.A00(r2)
        L_0x0080:
            X.2RT r0 = new X.2RT
            r0.<init>(r2, r1)
            throw r0
        L_0x0086:
            r1 = 0
            goto L_0x0080
        L_0x0088:
            int r0 = r5.size()
            if (r0 > r10) goto L_0x009f
            boolean r0 = r12.A07
            if (r0 != 0) goto L_0x009f
        L_0x0092:
            X.1CQ r1 = X.AnonymousClass1D7.A0I()
        L_0x0096:
            boolean r2 = r12.A06
            boolean r0 = r12.A08
            X.9s0 r3 = r7.BWN(r9, r2, r0)
            goto L_0x0030
        L_0x009f:
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A00(r14)
            if (r4 == 0) goto L_0x0128
            boolean r20 = X.C22971Dz.A0X(r4)
            boolean r19 = X.C22971Dz.A0T(r4)
            boolean r18 = X.C22971Dz.A0M(r4)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.util.Iterator r17 = r5.iterator()
        L_0x00b9:
            boolean r0 = r17.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x0101
            java.lang.Object r1 = r17.next()
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            if (r18 != 0) goto L_0x00d8
            if (r20 == 0) goto L_0x00d0
            boolean r0 = X.C22971Dz.A0X(r1)
            if (r0 != 0) goto L_0x00d8
        L_0x00d0:
            if (r19 == 0) goto L_0x00fe
            boolean r0 = X.C22971Dz.A0T(r1)
            if (r0 == 0) goto L_0x00fe
        L_0x00d8:
            r16 = 1
        L_0x00da:
            int r0 = r1.getDevice()
            if (r0 != 0) goto L_0x00f1
            com.whatsapp.jid.UserJid r0 = r1.userJid
            boolean r0 = r15.A0O(r0)
            if (r0 != 0) goto L_0x00f1
            com.whatsapp.jid.UserJid r0 = r1.userJid
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00f1
            r2 = 1
        L_0x00f1:
            if (r16 == 0) goto L_0x00f5
            if (r2 == 0) goto L_0x00b9
        L_0x00f5:
            r3.append(r1)
            java.lang.String r0 = ","
            r3.append(r0)
            goto L_0x00b9
        L_0x00fe:
            r16 = 0
            goto L_0x00da
        L_0x0101:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0128
            int r0 = r3.length()
            int r0 = r0 - r10
            r3.setLength(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "remoteChatJid="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; invalid devices="
            java.lang.String r3 = X.AnonymousClass001.A1E(r3, r0, r1)
            X.190 r1 = r6.A00
            java.lang.String r0 = "InvalidDevicesForMdFanoutMessage"
            r1.A0G(r0, r3, r2)
        L_0x0128:
            java.util.Map r1 = r7.BV7(r5)
            com.whatsapp.jid.DeviceJid r2 = X.AnonymousClass1E0.A00(r14)
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            boolean r0 = r12.A07
            if (r0 != 0) goto L_0x0096
            int r0 = r5.size()
            if (r0 <= r10) goto L_0x0096
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x0096
            X.2kT r0 = r12.A01
            if (r0 == 0) goto L_0x0154
            int r1 = r0.A00(r2)
        L_0x014e:
            X.2RT r0 = new X.2RT
            r0.<init>(r2, r1)
            throw r0
        L_0x0154:
            r1 = 0
            goto L_0x014e
        L_0x0156:
            java.util.Iterator r4 = X.AnonymousClass000.A15(r1)
        L_0x015a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0171
            java.lang.Object r0 = X.C17890vO.A0P(r4)
            X.9r6 r0 = (X.C194059r6) r0
            int r0 = r0.A00
            if (r0 != r10) goto L_0x015a
            int r0 = r13.A00
            int r0 = r0 + 1
            r13.A00 = r0
            goto L_0x015a
        L_0x0171:
            r8.A03 = r1
            r8.A02 = r3
            X.205 r0 = r11.A08
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0O(r0)
            if (r0 == 0) goto L_0x01aa
            java.util.LinkedHashSet r7 = X.C17880vN.A14()
            if (r2 == 0) goto L_0x0192
            X.190 r4 = r6.A00
            java.util.Set r0 = r2.keySet()
            java.util.Set r0 = X.C22971Dz.A0D(r4, r0)
            r7.addAll(r0)
        L_0x0192:
            java.util.List r5 = r3.A00
            if (r5 == 0) goto L_0x01a5
            X.190 r4 = r6.A00
            X.C17960vV.A07(r5)
            java.util.LinkedHashSet r0 = X.C17880vN.A14()
            X.C22971Dz.A0F(r4, r5, r0)
            r7.addAll(r0)
        L_0x01a5:
            java.util.Set r0 = r11.A0C
            r0.addAll(r7)
        L_0x01aa:
            boolean r0 = X.AnonymousClass8BR.A1Y(r1)
            if (r0 != 0) goto L_0x01b4
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x01b9
        L_0x01b4:
            X.9IM r0 = X.AnonymousClass9IM.COMMON_ENC
            r13.A00(r0, r6)
        L_0x01b9:
            boolean r0 = X.AnonymousClass8BR.A1Y(r1)
            if (r0 == 0) goto L_0x01d6
            int r1 = r11.A02
            r0 = r21
            boolean r0 = X.C63792th.A03(r0, r1)
            if (r0 != 0) goto L_0x01d6
            if (r2 != 0) goto L_0x01d0
            java.util.List r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x01d1
        L_0x01d0:
            r1 = 0
        L_0x01d1:
            java.lang.String r0 = "Message fanout is only supported for 1:1 chat"
            X.C17960vV.A0H(r1, r0)
        L_0x01d6:
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x01dd
            r8.A00 = r10
            return
        L_0x01dd:
            if (r9 == 0) goto L_0x01e6
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x01e6
            r0 = 2
            if (r2 != 0) goto L_0x01e7
        L_0x01e6:
            r0 = 0
        L_0x01e7:
            r8.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVI.BLq(X.9uN, X.9ty, X.A1O):void");
    }

    public Set CGK() {
        return C18070vi.A0P(AnonymousClass9IM.COMMON_ENC);
    }

    public AVI(AnonymousClass190 r1, AnonymousClass11S r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public AnonymousClass9IM Ba7() {
        return AnonymousClass9IM.PARTICIPANTS;
    }

    public /* synthetic */ Set CGJ() {
        return C25511Om.A00;
    }
}
