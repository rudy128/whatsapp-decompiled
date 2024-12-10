package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9oB  reason: invalid class name and case insensitive filesystem */
public final class C192329oB {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public final C29621ca A00(UserJid userJid, String str, String str2, List list) {
        C18070vi.A0o(str2, userJid, list);
        C18460wS r7 = C18460wS.A00;
        return (C29621ca) A01(userJid, ((A2P) this.A00.get()).A02(userJid), str, str2, list, r7).A00;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass9F7 A01(com.whatsapp.jid.UserJid r25, X.C178749Eh r26, java.lang.String r27, java.lang.String r28, java.util.List r29, java.util.List r30) {
        /*
            r24 = this;
            r14 = r25
            java.util.ArrayList r6 = X.C29351c6.A0D(r29)
            java.util.Iterator r9 = r29.iterator()
        L_0x000a:
            boolean r0 = r9.hasNext()
            r5 = r24
            r7 = r28
            if (r0 == 0) goto L_0x005f
            X.206 r8 = X.C17880vN.A0Y(r9)
            java.lang.String r0 = "extension_menu_report"
            boolean r0 = r7.equals(r0)
            java.lang.String r4 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            if (r0 == 0) goto L_0x0057
            X.00H r0 = r5.A01
            java.lang.Object r2 = r0.get()
            X.4S5 r2 = (X.AnonymousClass4S5) r2
            X.205 r1 = r8.A0v
            X.1BI r0 = r1.A00
            X.C18070vi.A0z(r0, r4)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            com.whatsapp.jid.UserJid r3 = r2.A00(r0)
        L_0x0037:
            boolean r1 = r1.A02
            r0 = 1
            if (r1 == 0) goto L_0x003d
            r0 = 0
        L_0x003d:
            X.9En r2 = new X.9En
            r2.<init>(r3, r0)
            X.00H r0 = r5.A00
            java.lang.Object r0 = r0.get()
            X.A2P r0 = (X.A2P) r0
            X.9Eg r1 = r0.A03(r8, r7)
            X.9Ee r0 = new X.9Ee
            r0.<init>((X.C178809En) r2, (X.C178739Eg) r1)
            r6.add(r0)
            goto L_0x000a
        L_0x0057:
            X.205 r1 = r8.A0v
            X.1BI r3 = r1.A00
            X.C18070vi.A0z(r3, r4)
            goto L_0x0037
        L_0x005f:
            X.00H r1 = r5.A00
            java.lang.Object r0 = r1.get()
            X.A2P r0 = (X.A2P) r0
            X.9Ei r15 = r0.A01(r14)
            java.lang.Object r3 = r1.get()
            X.A2P r3 = (X.A2P) r3
            if (r25 == 0) goto L_0x01a1
            X.0ve r2 = r3.A05
            r1 = 6551(0x1997, float:9.18E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01a1
            X.00H r0 = r3.A0D
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass8BV.A0F(r14, r0)
            X.A4x r4 = r3.A06
            java.lang.String r3 = r0.getRawString()
            r8 = 0
            X.C18070vi.A0d(r3, r8)
            java.util.LinkedHashMap r11 = X.C17880vN.A13()
            X.9uT r0 = r4.A02     // Catch:{ Exception -> 0x00d0 }
            X.0vl r0 = r0.A01     // Catch:{ Exception -> 0x00d0 }
            android.content.SharedPreferences r2 = X.C17880vN.A0C(r0)     // Catch:{ Exception -> 0x00d0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r0 = "messageless_flow_ids_per_business_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r1 = X.C17880vN.A0r(r2, r0)     // Catch:{ Exception -> 0x00d0 }
            if (r1 == 0) goto L_0x00eb
            int r0 = r1.length()     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x00eb
            r0 = 1
            java.util.List r0 = X.C108985cd.A0s(r1, r0)     // Catch:{ Exception -> 0x00d0 }
            java.util.Set r0 = X.C29431cG.A12(r0)     // Catch:{ Exception -> 0x00d0 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x00d0 }
        L_0x00be:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x00eb
            java.lang.String r1 = X.C17880vN.A0v(r2)     // Catch:{ Exception -> 0x00d0 }
            java.util.List r0 = r4.A02(r1)     // Catch:{ Exception -> 0x00d0 }
            r11.put(r1, r0)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00be
        L_0x00d0:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/getReportingDataForMessagelessFlow throws exception"
            X.C108995ce.A1M(r0, r1, r3)
            X.190 r2 = r4.A00
            java.lang.String r1 = r3.getMessage()
            X.0ve r0 = r4.A03
            java.lang.String r1 = X.AnonymousClass8BX.A0a(r0, r1)
            java.lang.String r0 = "ExtensionsLogger/getReportingDataForMessagelessFlow"
            r2.A0G(r0, r1, r8)
        L_0x00eb:
            java.util.Set r0 = r11.keySet()
            java.util.ArrayList r3 = X.C108965cb.A0t(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x00f7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r2 = r4.next()
            int r1 = r8 + 1
            if (r8 >= 0) goto L_0x010a
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x010a:
            java.util.Set r0 = r11.keySet()
            int r0 = r0.size()
            int r0 = r0 + -5
            if (r8 < r0) goto L_0x0127
            java.lang.Object r0 = r11.get(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0127
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0127
            r3.add(r2)
        L_0x0127:
            r8 = r1
            goto L_0x00f7
        L_0x0129:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r3.iterator()
        L_0x0131:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0184
            java.lang.Object r0 = r13.next()
            java.lang.Object r0 = r11.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0131
            java.util.ArrayList r9 = X.C29351c6.A0E(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x014b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r1 = r12.next()
            X.9tH r1 = (X.C195399tH) r1
            java.lang.String r8 = r1.A00
            java.lang.String r4 = r1.A05
            java.lang.String r0 = r1.A01
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r0)
            long r22 = X.C17900vP.A01(r0)
            java.lang.String r3 = r1.A04
            java.lang.String r2 = r1.A03
            java.lang.String r1 = r1.A02
            X.9Ee r0 = new X.9Ee
            r17 = r8
            r18 = r4
            r19 = r3
            r20 = r2
            r21 = r1
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r9.add(r0)
            goto L_0x014b
        L_0x0180:
            r10.add(r9)
            goto L_0x0131
        L_0x0184:
            java.util.ArrayList r3 = X.C29351c6.A0E(r10)
            java.util.Iterator r2 = r10.iterator()
        L_0x018c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            X.9Ee r0 = new X.9Ee
            r0.<init>((java.util.List) r1)
            r3.add(r0)
            goto L_0x018c
        L_0x01a1:
            X.0wS r3 = X.C18460wS.A00
        L_0x01a3:
            java.lang.String r0 = "extension_menu_report"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x01b9
            X.00H r0 = r5.A01
            java.lang.Object r0 = r0.get()
            X.4S5 r0 = (X.AnonymousClass4S5) r0
            if (r25 == 0) goto L_0x01d5
            com.whatsapp.jid.UserJid r14 = r0.A00(r14)
        L_0x01b9:
            java.lang.String r2 = X.C83914Hd.A00(r7)
            r1 = 5
            X.4A4 r0 = new X.4A4
            r0.<init>((java.lang.String) r2, (int) r1)
            X.9F7 r13 = new X.9F7
            r16 = r26
            r18 = r27
            r20 = r30
            r17 = r0
            r19 = r6
            r21 = r3
            r13.<init>((com.whatsapp.jid.Jid) r14, (X.C178759Ei) r15, (X.C178749Eh) r16, (X.AnonymousClass4A4) r17, (java.lang.String) r18, (java.util.List) r19, (java.util.List) r20, (java.util.List) r21)
            return r13
        L_0x01d5:
            r14 = 0
            goto L_0x01b9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192329oB.A01(com.whatsapp.jid.UserJid, X.9Eh, java.lang.String, java.lang.String, java.util.List, java.util.List):X.9F7");
    }

    public C192329oB(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
