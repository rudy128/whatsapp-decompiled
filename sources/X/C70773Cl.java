package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.Jid;

/* renamed from: X.3Cl  reason: invalid class name and case insensitive filesystem */
public class C70773Cl implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C70773Cl(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public static C55922ga A00(C70773Cl r2) {
        ((C32951i1) r2.A01).A09();
        return new C55922ga((SharedPreferences) r2.A03, ((Jid) r2.A02).getRawString());
    }

    public static C56132gx A01(C70773Cl r2) {
        ((C32951i1) r2.A01).A09();
        return new C56132gx((SharedPreferences) r2.A03, ((Jid) r2.A02).getRawString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03e8, code lost:
        if (r3.A05 <= 0) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0633, code lost:
        if ((!android.text.TextUtils.isEmpty(r4.A0c)) != false) goto L_0x0635;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x07b5, code lost:
        r4.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x07b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0891, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0895, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0b34, code lost:
        r3 = new java.lang.Long[9];
        X.C17890vO.A1L(r3, r2.A03);
        X.C17890vO.A1M(r3, r2.A04);
        X.C17890vO.A1N(r3, r2.A07);
        X.C17890vO.A1O(r3, r2.A08);
        X.C17890vO.A1P(r3, r2.A02);
        X.C17890vO.A1Q(r3, r2.A01);
        r3[6] = java.lang.Long.valueOf(r2.A00);
        r3[7] = java.lang.Long.valueOf(r2.A06);
        r3[8] = java.lang.Long.valueOf(r2.A05);
        r3 = X.C200410p.A0I(",", "", "", r3);
        r1 = r2.A09.edit();
        r0 = r2.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0c24, code lost:
        r3 = new java.lang.Long[5];
        X.C17890vO.A1L(r3, r2.A02);
        X.C17890vO.A1M(r3, r2.A01);
        X.C17890vO.A1N(r3, r2.A00);
        X.C17890vO.A1O(r3, r2.A04);
        X.C17890vO.A1P(r3, r2.A03);
        r3 = X.C200410p.A0I(",", "", "", r3);
        r1 = r2.A05.edit();
        r0 = r2.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0c50, code lost:
        r0 = r1.putString((java.lang.String) r0.getValue(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0ca5, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0ca8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0234, code lost:
        if (r2.A05 <= 0) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0279, code lost:
        if (r2.A05 <= 0) goto L_0x027b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r0 = r33
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0509;
                case 1: goto L_0x0022;
                case 2: goto L_0x0573;
                case 3: goto L_0x00e4;
                case 4: goto L_0x05b5;
                case 5: goto L_0x05cd;
                case 6: goto L_0x05ef;
                case 7: goto L_0x013c;
                case 8: goto L_0x086c;
                case 9: goto L_0x086c;
                case 10: goto L_0x0665;
                case 11: goto L_0x06cb;
                case 12: goto L_0x0178;
                case 13: goto L_0x0755;
                case 14: goto L_0x0780;
                case 15: goto L_0x07b9;
                case 16: goto L_0x0007;
                case 17: goto L_0x0007;
                case 18: goto L_0x07e3;
                case 19: goto L_0x01d7;
                case 20: goto L_0x07f6;
                case 21: goto L_0x0808;
                case 22: goto L_0x020b;
                case 23: goto L_0x0972;
                case 24: goto L_0x097f;
                case 25: goto L_0x0a21;
                case 26: goto L_0x0a2e;
                case 27: goto L_0x0a3b;
                case 28: goto L_0x023f;
                case 29: goto L_0x0a48;
                case 30: goto L_0x0a55;
                case 31: goto L_0x0a62;
                case 32: goto L_0x08a9;
                case 33: goto L_0x0944;
                case 34: goto L_0x0a6f;
                case 35: goto L_0x0327;
                case 36: goto L_0x03c5;
                case 37: goto L_0x0a7c;
                case 38: goto L_0x0ac8;
                case 39: goto L_0x0ad4;
                case 40: goto L_0x0ae1;
                case 41: goto L_0x0aed;
                case 42: goto L_0x0b29;
                case 43: goto L_0x0b84;
                case 44: goto L_0x0c19;
                case 45: goto L_0x0c5b;
                case 46: goto L_0x040a;
                case 47: goto L_0x0467;
                case 48: goto L_0x049c;
                case 49: goto L_0x04cc;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r0.A01
            X.2c6 r3 = (X.C53172c6) r3
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r0.A03
            X.1Ug r1 = (X.C26981Ug) r1
            X.2gZ r0 = r3.A00
            X.1kM r0 = r0.A04
            r0.A01(r2)
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.BrF(r0)
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r1 = r0.A01
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r1 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r1
            java.lang.Object r5 = r0.A02
            java.lang.Object r2 = r0.A03
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            X.00H r4 = r1.A0A
            X.10T r1 = X.C17880vN.A0V(r4)
            r0 = 24
            X.C17890vO.A0r(r1, r5, r0)
            java.util.LinkedHashMap r6 = X.C17880vN.A13()
            java.util.Iterator r3 = r2.iterator()
        L_0x0043:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r3.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r2 = r0.second
            java.lang.Object r1 = r6.get(r2)
            if (r1 != 0) goto L_0x005a
            r6.containsKey(r2)
        L_0x005a:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0062
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
        L_0x0062:
            java.lang.Object r0 = r0.first
            X.2m5 r0 = (X.C59302m5) r0
            X.1EC r0 = r0.A00
            r1.add(r0)
            r6.put(r2, r1)
            goto L_0x0043
        L_0x006f:
            java.util.Iterator r7 = X.AnonymousClass000.A15(r6)
        L_0x0073:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0021
            java.util.Map$Entry r6 = X.AnonymousClass000.A16(r7)
            java.lang.String r2 = X.C17880vN.A0x(r6)
            if (r2 == 0) goto L_0x00d5
            int r1 = r2.hashCode()
            r0 = -608496514(0xffffffffdbbb147e, float:-1.05316704E17)
            if (r1 == r0) goto L_0x00be
            r0 = 476588369(0x1c682951, float:7.681576E-22)
            if (r1 == r0) goto L_0x00b5
            r0 = 1185244855(0x46a566b7, float:21171.357)
            if (r1 != r0) goto L_0x0073
            java.lang.String r0 = "approved"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0073
            X.10T r3 = X.C17880vN.A0V(r4)
            java.lang.Object r2 = r6.getValue()
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r1 = 12
        L_0x00ac:
            X.35N r0 = new X.35N
            r0.<init>(r5, r2, r1)
            r3.notifyAllObservers(r0)
            goto L_0x0073
        L_0x00b5:
            java.lang.String r0 = "cancelled"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00d5
            goto L_0x0073
        L_0x00be:
            java.lang.String r0 = "rejected"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0073
            X.10T r3 = X.C17880vN.A0V(r4)
            java.lang.Object r2 = r6.getValue()
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r1 = 11
            goto L_0x00ac
        L_0x00d5:
            X.10T r3 = X.C17880vN.A0V(r4)
            java.lang.Object r2 = r6.getValue()
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r1 = 14
            goto L_0x00ac
        L_0x00e4:
            java.lang.Object r3 = r0.A01
            X.1To r3 = (X.C26811To) r3
            java.lang.Object r4 = r0.A02
            X.2Cl r4 = (X.C45992Cl) r4
            java.lang.Object r5 = r0.A03
            java.util.Locale r5 = (java.util.Locale) r5
            boolean r0 = r3.A0T()
            if (r0 == 0) goto L_0x0021
            java.lang.String[] r2 = X.C17880vN.A1Y()
            r1 = 0
            java.lang.String r0 = "setting_locale"
            r2[r1] = r0
            java.lang.String r1 = X.AnonymousClass9QR.A00(r2)
            X.1Rs r0 = r4.A00
            X.A8l r2 = r0.A09(r1)
            if (r2 != 0) goto L_0x0112
            X.A8l r2 = r0.A0A(r1)
            if (r2 == 0) goto L_0x0021
        L_0x0112:
            java.lang.String[] r0 = X.AnonymousClass1X0.A04
            java.lang.String r1 = r5.toLanguageTag()
            X.8cn r0 = r2.A09()
            X.C17960vV.A07(r0)
            X.8Y8 r0 = r0.localeSetting_
            if (r0 != 0) goto L_0x0125
            X.8Y8 r0 = X.AnonymousClass8Y8.DEFAULT_INSTANCE
        L_0x0125:
            java.lang.String r0 = r0.locale_
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0021
            X.8q9 r0 = r4.A0K()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r3.A0N(r0)
            r3.A0I()
            return
        L_0x013c:
            java.lang.Object r6 = r0.A01
            X.1UB r6 = (X.AnonymousClass1UB) r6
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r0.A03
            java.util.Map r5 = (java.util.Map) r5
            java.util.Iterator r4 = r1.iterator()
        L_0x014c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0021
            com.whatsapp.jid.DeviceJid r3 = X.C17880vN.A0R(r4)
            com.whatsapp.jid.UserJid r0 = r3.userJid
            java.lang.Object r2 = r5.get(r0)
            X.AEW r2 = (X.AEW) r2
            X.00H r1 = r6.A06
            java.lang.Object r0 = r1.get()
            X.1tC r0 = (X.C39511tC) r0
            r0.A00(r2)
            X.10T r2 = X.C17880vN.A0V(r1)
            com.whatsapp.jid.UserJid r1 = r3.userJid
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 6
            X.C17890vO.A0s(r2, r1, r0)
            goto L_0x014c
        L_0x0178:
            java.lang.Object r3 = r0.A01
            X.73j r3 = (X.C1408673j) r3
            java.lang.Object r4 = r0.A02
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r5 = r0.A03
            java.lang.Long r5 = (java.lang.Long) r5
            X.6to r6 = r3.A00
            if (r6 == 0) goto L_0x0021
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0021
            r2 = 0
            X.2Gg r1 = new X.2Gg
            r1.<init>()
            java.lang.String r0 = r6.A06
            r1.A06 = r0
            java.util.UUID r0 = r6.A07
            java.lang.String r0 = r0.toString()
            r1.A07 = r0
            com.whatsapp.voipcalling.CallInfo r0 = r6.A05
            if (r0 == 0) goto L_0x01a8
            boolean r0 = r0.isGroupCall
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x01a8:
            r1.A00 = r2
            X.00H r0 = r3.A03
            java.lang.Object r0 = r0.get()
            X.9iv r0 = (X.C189339iv) r0
            java.lang.String r0 = r0.A00()
            r1.A05 = r0
            int r0 = r6.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            java.lang.Integer r0 = X.C17880vN.A0m()
            r1.A01 = r0
            r1.A03 = r4
            r1.A04 = r5
            X.18K r0 = r3.A01
            r0.CC7(r1)
            X.6to r1 = r3.A00
            if (r1 == 0) goto L_0x0021
            r0 = 1
            r1.A00 = r0
            return
        L_0x01d7:
            java.lang.Object r6 = r0.A01
            X.2ri r6 = (X.C62632ri) r6
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A03
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            X.00H r0 = r6.A0F
            java.lang.Object r3 = r0.get()
            X.2cC r3 = (X.C53232cC) r3
            r2 = 1
            boolean r0 = r4.A0F()
            if (r0 != 0) goto L_0x0203
            X.11S r1 = r3.A00
            X.1BI r0 = r4.A0J
            boolean r0 = r1.A0O(r0)
            if (r0 != 0) goto L_0x0203
            java.util.concurrent.ConcurrentHashMap r1 = r3.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.put(r5, r0)
        L_0x0203:
            X.3Kq r0 = r6.A03
            if (r0 == 0) goto L_0x0021
            r0.Buf()
            return
        L_0x020b:
            java.lang.Object r3 = r0.A01
            X.1i1 r3 = (X.C32951i1) r3
            java.lang.Object r6 = r0.A02
            X.205 r6 = (X.AnonymousClass205) r6
            java.lang.Object r4 = r0.A03
            X.1BI r4 = (X.AnonymousClass1BI) r4
            X.00H r0 = r3.A0Z
            X.206 r2 = X.AnonymousClass1W2.A01(r6, r0)
            boolean r0 = X.C32951i1.A07(r3, r2, r6)
            if (r0 == 0) goto L_0x0021
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ChatMessageCounts/onChatMessageRevoked jid:"
            X.C17900vP.A0Y(r4, r0, r1)
            r3.A09()
            if (r2 == 0) goto L_0x0236
            int r0 = r2.A05
            r9 = 1
            if (r0 > 0) goto L_0x0237
        L_0x0236:
            r9 = 0
        L_0x0237:
            r8 = 1
            r5 = 0
            r7 = r5
            r10 = r8
            X.C32951i1.A04(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x023f:
            java.lang.Object r5 = r0.A01
            X.1i1 r5 = (X.C32951i1) r5
            java.lang.Object r6 = r0.A02
            X.1BI r6 = (X.AnonymousClass1BI) r6
            java.lang.Object r3 = r0.A03
            X.2sw r3 = (X.C63362sw) r3
            X.205 r8 = r3.A0B
            r5.A09()
            X.00H r0 = r5.A0Z
            X.206 r2 = X.AnonymousClass1W2.A01(r8, r0)
            X.11S r1 = r5.A02
            X.1BI r0 = r3.A03()
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x0268
            boolean r0 = X.C22971Dz.A0d(r6)
            if (r0 != 0) goto L_0x0283
        L_0x0268:
            com.whatsapp.jid.UserJid r7 = r3.A05()
            boolean r10 = r8.A02
            int r0 = r3.A01
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L_0x027b
            int r0 = r2.A05
            r11 = 1
            if (r0 > 0) goto L_0x027c
        L_0x027b:
            r11 = 0
        L_0x027c:
            boolean r12 = X.C32951i1.A07(r5, r2, r8)
            X.C32951i1.A04(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0283:
            if (r2 == 0) goto L_0x029d
            X.00H r0 = r5.A0U
            java.lang.Object r4 = r0.get()
            X.A5M r4 = (X.A5M) r4
            X.205 r0 = r2.A0v
            X.1BI r3 = r0.A00
            if (r3 == 0) goto L_0x029d
            r1 = 34
            X.AkM r0 = new X.AkM
            r0.<init>(r4, r3, r2, r1)
            X.A5M.A01(r4, r0)
        L_0x029d:
            X.00H r0 = r5.A0b
            java.lang.Object r1 = r0.get()
            X.4Qc r1 = (X.C86084Qc) r1
            X.00H r0 = r1.A03
            r0.get()
            java.lang.String r0 = X.C35771mm.A00(r2)
            if (r0 == 0) goto L_0x0021
            java.lang.String r4 = "MARKETING"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.0ve r3 = r1.A02
            r1 = 11241(0x2be9, float:1.5752E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x0021
            X.00H r0 = r5.A0V
            java.lang.Object r1 = r0.get()
            X.1mm r1 = (X.C35771mm) r1
            if (r2 == 0) goto L_0x0325
            com.whatsapp.jid.UserJid r3 = r2.A0I()
        L_0x02d2:
            java.lang.String r0 = X.C35771mm.A00(r2)
            if (r0 == 0) goto L_0x0021
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0021
            if (r3 == 0) goto L_0x0021
            X.00H r0 = r1.A08
            java.lang.Object r2 = r0.get()
            X.2hu r2 = (X.C56712hu) r2
            X.0vc r1 = r2.A00
            java.lang.String r0 = "marketing_opt_out"
            android.content.SharedPreferences r4 = r1.A05(r0)
            X.C18070vi.A0X(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "jids_receiving_marketing_message"
            r1.append(r0)
            java.lang.String r0 = r3.getRawString()
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r1)
            X.C18070vi.A0X(r3)
            org.json.JSONObject r2 = r2.A00(r3)
            java.lang.String r1 = "marketing_msg_received"
            boolean r0 = r2.optBoolean(r1)
            if (r0 != 0) goto L_0x0021
            r0 = 1
            r2.put(r1, r0)
            android.content.SharedPreferences$Editor r1 = r4.edit()
            java.lang.String r0 = r2.toString()
            android.content.SharedPreferences$Editor r0 = r1.putString(r3, r0)
            goto L_0x0ca5
        L_0x0325:
            r3 = 0
            goto L_0x02d2
        L_0x0327:
            java.lang.Object r4 = r0.A01
            X.1i1 r4 = (X.C32951i1) r4
            java.lang.Object r3 = r0.A02
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r1 = r0.A03
            java.util.Collection r1 = (java.util.Collection) r1
            int r0 = r3.size()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x0340:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0384
            X.206 r1 = X.C17880vN.A0Y(r6)
            X.205 r0 = r1.A0v
            X.1BI r5 = r0.A00
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0340
            int r1 = r1.A0D()
            r0 = 16
            if (r1 == r0) goto L_0x0340
            r0 = 18
            if (r1 == r0) goto L_0x0340
            r0 = 17
            if (r1 == r0) goto L_0x0340
            r0 = 9
            if (r1 == r0) goto L_0x0340
            r0 = 10
            if (r1 == r0) goto L_0x0340
            boolean r0 = r3.containsKey(r5)
            if (r0 == 0) goto L_0x0340
            boolean r0 = r2.containsKey(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0380
            java.lang.Object r0 = r2.get(r5)
            int r0 = X.AnonymousClass000.A0M(r0)
            int r1 = r1 + r0
        L_0x0380:
            X.C17890vO.A0z(r5, r2, r1)
            goto L_0x0340
        L_0x0384:
            android.content.SharedPreferences r6 = X.C32951i1.A00(r4)
            java.util.Iterator r5 = X.C17890vO.A0i(r2)
        L_0x038c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0021
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r5)
            java.lang.Object r0 = r1.getKey()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r4 = r0.getRawString()
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            java.lang.String r0 = X.C60332nq.A01()
            java.lang.String r0 = r6.getString(r4, r0)
            X.2S9 r3 = X.C60332nq.A00(r0)
            java.lang.Long r2 = r3.A0M
            java.lang.Object r0 = r1.getValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            long r0 = (long) r0
            java.lang.Long r0 = X.C63782tg.A04(r2, r0)
            r3.A0M = r0
            X.C32951i1.A02(r6, r3, r4)
            goto L_0x038c
        L_0x03c5:
            java.lang.Object r4 = r0.A01
            X.1i1 r4 = (X.C32951i1) r4
            java.lang.Object r5 = r0.A02
            X.1BI r5 = (X.AnonymousClass1BI) r5
            java.lang.Object r7 = r0.A03
            X.205 r7 = (X.AnonymousClass205) r7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ChatMessageCounts/onChatMessagesSent jid:"
            X.C17900vP.A0Y(r5, r0, r1)
            r4.A09()
            X.00H r0 = r4.A0Z
            X.206 r3 = X.AnonymousClass1W2.A01(r7, r0)
            if (r3 == 0) goto L_0x03ea
            int r0 = r3.A05
            r10 = 1
            if (r0 > 0) goto L_0x03eb
        L_0x03ea:
            r10 = 0
        L_0x03eb:
            boolean r11 = X.C32951i1.A07(r4, r3, r7)
            r6 = 0
            r9 = 1
            r8 = r6
            X.C32951i1.A04(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 == 0) goto L_0x0021
            X.00H r0 = r4.A0U
            java.lang.Object r2 = r0.get()
            X.A5M r2 = (X.A5M) r2
            r1 = 43
            X.AkH r0 = new X.AkH
            r0.<init>(r3, r2, r1)
            X.A5M.A01(r2, r0)
            return
        L_0x040a:
            java.lang.Object r5 = r0.A01
            X.1i1 r5 = (X.C32951i1) r5
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r8 = r0.A03
            X.205 r8 = (X.AnonymousClass205) r8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ChatMessageCounts/onChatMessagesSent jids:"
            X.C17900vP.A0Y(r2, r0, r1)
            r5.A09()
            X.00H r1 = r5.A0Z
            X.206 r4 = X.AnonymousClass1W2.A01(r8, r1)
            X.1BI r0 = r8.A00
            boolean r0 = X.C22971Dz.A0O(r0)
            if (r0 == 0) goto L_0x0465
            X.206 r3 = X.AnonymousClass1W2.A01(r8, r1)
        L_0x0434:
            java.util.Iterator r2 = r2.iterator()
        L_0x0438:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0021
            com.whatsapp.jid.UserJid r6 = X.C17880vN.A0T(r2)
            r11 = 0
            if (r3 == 0) goto L_0x045a
            java.util.Map r1 = r3.A0j
            if (r1 == 0) goto L_0x045a
            com.whatsapp.jid.DeviceJid r0 = r6.getPrimaryDevice()
            java.lang.Object r0 = r1.get(r0)
            X.1cl r0 = (X.C29721cl) r0
            if (r0 == 0) goto L_0x045a
            int r0 = r0.expiration
            if (r0 <= 0) goto L_0x045a
            r11 = 1
        L_0x045a:
            boolean r12 = X.C32951i1.A07(r5, r4, r8)
            r7 = 0
            r10 = 1
            r9 = r7
            X.C32951i1.A04(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0438
        L_0x0465:
            r3 = 0
            goto L_0x0434
        L_0x0467:
            java.lang.Object r4 = r0.A01
            X.70E r4 = (X.AnonymousClass70E) r4
            java.lang.Object r3 = r0.A02
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r1 = r0.A03
            X.2qD r1 = (X.C61762qD) r1
            X.00H r0 = r4.A0D
            java.lang.Object r2 = r0.get()
            X.1iV r2 = (X.C33241iV) r2
            int r1 = r1.A06
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r0 = 5
            X.C33241iV.A00(r2, r3, r0, r1)
            com.whatsapp.jid.UserJid r0 = r3.A0I()
            if (r0 == 0) goto L_0x0021
            X.00H r0 = r4.A06
            java.lang.Object r2 = r0.get()
            X.A5M r2 = (X.A5M) r2
            com.whatsapp.jid.UserJid r1 = r3.A0I()
            r0 = 2
            r2.A02(r1, r3, r0)
            return
        L_0x049c:
            java.lang.Object r4 = r0.A01
            X.70E r4 = (X.AnonymousClass70E) r4
            java.lang.Object r3 = r0.A02
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r2 = r0.A03
            X.2qD r2 = (X.C61762qD) r2
            X.00H r0 = r4.A0D
            java.lang.Object r1 = r0.get()
            X.1iV r1 = (X.C33241iV) r1
            int r0 = r2.A06
            r2 = 3
            X.C33241iV.A00(r1, r3, r2, r0)
            com.whatsapp.jid.UserJid r0 = r3.A0I()
            if (r0 == 0) goto L_0x0021
            X.00H r0 = r4.A06
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            com.whatsapp.jid.UserJid r0 = r3.A0I()
            r1.A02(r0, r3, r2)
            return
        L_0x04cc:
            java.lang.Object r4 = r0.A01
            X.3uP r4 = (X.AnonymousClass3uP) r4
            java.lang.Object r3 = r0.A02
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r1 = r0.A03
            X.2qD r1 = (X.C61762qD) r1
            X.00H r0 = r4.A2K
            java.lang.Object r2 = r0.get()
            X.1iV r2 = (X.C33241iV) r2
            int r1 = r1.A06
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r0 = 4
            X.C33241iV.A00(r2, r3, r0, r1)
            X.0ve r2 = r4.A0F
            r1 = 12869(0x3245, float:1.8033E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0021
            com.whatsapp.jid.UserJid r2 = r3.A0I()
            if (r2 == 0) goto L_0x0021
            X.00H r0 = r4.A0L
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            r0 = 1
            r1.A02(r2, r3, r0)
            return
        L_0x0509:
            java.lang.Object r4 = r0.A01
            com.whatsapp.community.LinkExistingGroups r4 = (com.whatsapp.community.LinkExistingGroups) r4
            java.lang.Object r1 = r0.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.Object r5 = r0.A03
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            X.126 r6 = r4.A05
            if (r6 == 0) goto L_0x056f
            X.1M9 r0 = r4.A06
            X.1E7 r3 = r0.A0H(r1)
            X.1BI r1 = r3.A0J
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r1 = X.C42941yz.A00(r1)
            if (r1 == 0) goto L_0x053f
            X.1CJ r0 = r6.A0I
            int r2 = r0.A06(r1)
            r0 = 2
            if (r2 == r0) goto L_0x0562
            if (r2 != 0) goto L_0x053f
            r0 = 0
        L_0x0535:
            X.2d6 r1 = new X.2d6
            r1.<init>(r0, r2)
            X.190 r0 = r6.A03
            r3.A0I(r0, r1)
        L_0x053f:
            java.util.ArrayList r2 = r4.A0h
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            X.3r7 r0 = new X.3r7
            r0.<init>(r5)
            int r1 = r2.indexOf(r0)
            X.3r7 r0 = new X.3r7
            r0.<init>(r3)
            r2.set(r1, r0)
            X.2Do r0 = new X.2Do
            r0.<init>(r3)
            r4.A50(r0)
            X.C70773Cl.super.BEb(r3)
            return
        L_0x0562:
            X.00H r0 = r6.A0m
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r0 = r0.A05(r1)
            goto L_0x0535
        L_0x056f:
            java.lang.String r0 = "groupChatManager"
            goto L_0x0891
        L_0x0573:
            java.lang.Object r4 = r0.A01
            com.whatsapp.community.suspend.CommunityIntegritySuspendBottomSheet r4 = (com.whatsapp.community.suspend.CommunityIntegritySuspendBottomSheet) r4
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A03
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            android.os.Bundle r6 = X.C17880vN.A0D()
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.suspendedEntityJid"
            java.lang.String r0 = r2.getRawString()
            r6.putString(r1, r0)
            X.6np r5 = r4.A07
            if (r5 == 0) goto L_0x05b0
            X.1MB r0 = r4.A06
            if (r0 == 0) goto L_0x05ab
            boolean r13 = r0.A00()
            r7 = 0
            java.lang.String r9 = "community-suspend-appeal"
            r10 = r7
            r11 = r7
            r12 = r7
            r8 = r7
            android.content.Intent r0 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.startActivity(r0)
            return
        L_0x05ab:
            java.lang.String r0 = "supportGatingUtils"
            goto L_0x0891
        L_0x05b0:
            java.lang.String r0 = "sendFeedbackUtils"
            goto L_0x0891
        L_0x05b5:
            java.lang.Object r1 = r0.A01
            X.2Cp r1 = (X.C46032Cp) r1
            java.lang.Object r2 = r0.A02
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.Object r3 = r0.A03
            X.8qE r3 = (X.C170568qE) r3
            X.2lf r0 = r2.A0H
            long r5 = r0.A00
            r4 = 0
            X.C46032Cp.A03(r1, r2, r3, r4, r5)
            X.C46032Cp.A02(r1, r2, r3)
            return
        L_0x05cd:
            java.lang.Object r2 = r0.A01
            X.2tk r2 = (X.C63822tk) r2
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r3 = r0.A03
            X.1jP r3 = (X.C33801jP) r3
            X.C18070vi.A0j(r1, r3)
            X.1P3 r2 = r2.A09
            com.whatsapp.jid.DeviceJid r0 = r1.getPrimaryDevice()
            X.2nE r1 = X.C63962tz.A02(r0)
            X.2kO r0 = new X.2kO
            r0.<init>(r3)
            r2.A0a(r0, r1)
            return
        L_0x05ef:
            java.lang.Object r3 = r0.A01
            X.1M2 r3 = (X.AnonymousClass1M2) r3
            java.lang.Object r2 = r0.A02
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.Object r4 = r0.A03
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            X.1Lx r0 = r3.A04
            X.0ve r5 = r0.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 9844(0x2674, float:1.3794E-41)
            boolean r0 = X.C18020vd.A05(r1, r5, r0)
            r6 = 1
            r5 = r0 ^ 1
            X.1BI r0 = r2.A0J
            boolean r0 = X.C22971Dz.A0T(r0)
            r1 = r0 ^ 1
            X.1BI r0 = r4.A0J
            boolean r0 = X.C22971Dz.A0X(r0)
            r0 = r0 ^ 1
            if (r5 != 0) goto L_0x0661
            if (r1 != 0) goto L_0x0661
            if (r0 != 0) goto L_0x0661
            java.lang.String r0 = r2.A0c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0635
            java.lang.String r0 = r4.A0c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            r1 = 1
            if (r0 == 0) goto L_0x0636
        L_0x0635:
            r1 = 0
        L_0x0636:
            int r0 = r2.A07
            if (r0 > 0) goto L_0x063e
            int r0 = r2.A08
            if (r0 <= 0) goto L_0x0646
        L_0x063e:
            int r0 = r4.A07
            if (r0 > 0) goto L_0x0646
            int r0 = r4.A08
            if (r0 <= 0) goto L_0x0647
        L_0x0646:
            r6 = 0
        L_0x0647:
            if (r1 == 0) goto L_0x0650
            java.lang.String r0 = r2.A0c
            r4.A0c = r0
            r3.A0Q(r4)
        L_0x0650:
            if (r6 == 0) goto L_0x0661
            int r0 = r2.A07
            r4.A07 = r0
            int r0 = r2.A08
            r4.A08 = r0
            long r0 = r2.A0E
            r4.A0E = r0
            r3.A0T(r4)
        L_0x0661:
            X.AnonymousClass1M2.A0B(r3, r2)
            return
        L_0x0665:
            java.lang.Object r3 = r0.A01
            X.3qm r3 = (X.AnonymousClass3qm) r3
            java.lang.Object r7 = r0.A02
            X.2Jo r7 = (X.C47712Jo) r7
            java.lang.Object r5 = r0.A03
            java.util.List r5 = (java.util.List) r5
            r0 = 2
            X.C18070vi.A0d(r5, r0)
            X.00H r0 = r3.A03
            if (r0 == 0) goto L_0x06c7
            java.lang.Object r4 = r0.get()
            X.2to r4 = (X.C63862to) r4
            X.2Mh r1 = X.C63862to.A00(r4, r7, r5)
            X.121 r0 = r4.A06
            r0.BBM(r1)
            X.1M9 r6 = r4.A03
            long r10 = java.lang.System.currentTimeMillis()
            X.0ve r2 = r4.A09
            r1 = 4509(0x119d, float:6.318E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            java.lang.String r9 = "pn"
            if (r0 == 0) goto L_0x06a4
            boolean r0 = X.C63862to.A05(r5)
            if (r0 == 0) goto L_0x06a4
            java.lang.String r9 = "lid"
        L_0x06a4:
            java.lang.String r8 = ""
            X.1E7 r2 = r6.A0C(r7, r8, r9, r10)
            X.0zA r1 = r4.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x06bc
            X.C19880zA.A02(r1)
            java.lang.String r0 = "isMarketingMessageHighIntentEnabled"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x06bc:
            X.1KB r4 = r3.A05
            r0 = 45
            X.3Bv r1 = new X.3Bv
            r1.<init>(r3, r2, r0)
            goto L_0x07b5
        L_0x06c7:
            java.lang.String r0 = "broadcastListManager"
            goto L_0x0891
        L_0x06cb:
            java.lang.Object r4 = r0.A01
            com.whatsapp.contact.picker.PhoneContactsSelector r4 = (com.whatsapp.contact.picker.PhoneContactsSelector) r4
            java.lang.Object r2 = r0.A02
            X.25N r2 = (X.AnonymousClass25N) r2
            java.lang.Object r8 = r0.A03
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            android.widget.ListView r0 = r4.A03
            android.content.Context r14 = r0.getContext()
            X.1E7 r15 = r2.A01
            java.lang.String r5 = r15.A0K()
            X.0vb r3 = r4.A0N
            X.1LA r1 = r4.A05
            X.1Vc r13 = r4.A0E
            X.1E7 r0 = r2.A01
            boolean r4 = r0.A0C()
            X.73C r7 = new X.73C
            r7.<init>()
            X.6oE r0 = r7.A0A
            r0.A01 = r5
            java.lang.String r9 = X.AnonymousClass17K.A02(r15)
            if (r4 == 0) goto L_0x0712
            java.lang.String r10 = "WORK"
        L_0x0700:
            r12 = 1
            r11 = 2
            r7.A03(r8, r9, r10, r11, r12)
            r17 = 0
            java.lang.String r16 = "PhoneContactsSelector.getVcardForWaOnlyContact"
            r18 = 96
            android.graphics.Bitmap r6 = r13.BX4(r14, r15, r16, r17, r18)
            if (r6 == 0) goto L_0x073e
            goto L_0x0715
        L_0x0712:
            java.lang.String r10 = "HOME"
            goto L_0x0700
        L_0x0715:
            r0 = 4096(0x1000, float:5.74E-42)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x073a }
            r5.<init>(r0)     // Catch:{ IOException -> 0x073a }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0730 }
            r0 = 75
            boolean r0 = r6.compress(r4, r0, r5)     // Catch:{ all -> 0x0730 }
            if (r0 == 0) goto L_0x072c
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x0730 }
            r7.A0B = r0     // Catch:{ all -> 0x0730 }
        L_0x072c:
            r5.close()     // Catch:{ IOException -> 0x073a }
            goto L_0x073e
        L_0x0730:
            r4 = move-exception
            r5.close()     // Catch:{ all -> 0x0735 }
            goto L_0x0739
        L_0x0735:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r4, r0)     // Catch:{ IOException -> 0x073a }
        L_0x0739:
            throw r4     // Catch:{ IOException -> 0x073a }
        L_0x073a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x073e:
            X.6yH r0 = new X.6yH
            r0.<init>(r1, r3)
            java.lang.String r0 = r0.A01(r7)     // Catch:{ 1iZ -> 0x0748 }
            goto L_0x0752
        L_0x0748:
            r1 = move-exception
            X.2RP r0 = new X.2RP
            r0.<init>(r1)
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x0752:
            r2.A02 = r0
            return
        L_0x0755:
            java.lang.Object r3 = r0.A01
            X.1kL r3 = (X.C34351kL) r3
            java.lang.Object r2 = r0.A02
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.Object r4 = r0.A03
            X.1BI r4 = (X.AnonymousClass1BI) r4
            r8 = 0
            X.1Lr r0 = r3.A09
            boolean r1 = r0.A06(r2)
            X.1Tv r0 = r3.A0A
            r0.A00(r2)
            if (r1 == 0) goto L_0x077a
            X.1Ui r3 = r3.A0O
            int r6 = r2.A08
            java.lang.String r5 = "ContactUpdateNotificationHandler.handleContactUpdate"
            r7 = 2
            r3.A03(r4, r5, r6, r7, r8)
            return
        L_0x077a:
            X.1Lf r0 = r3.A07
            r0.A00(r4)
            return
        L_0x0780:
            java.lang.Object r5 = r0.A01
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            java.lang.Object r3 = r0.A02
            X.1kL r3 = (X.C34351kL) r3
            java.lang.Object r2 = r0.A03
            r0 = 0
            r5.A0E = r0
            X.1M9 r1 = r3.A06
            X.1M2 r0 = r1.A04
            r0.A0T(r5)
            X.1MA r0 = r1.A03
            r0.A0B(r5)
            X.00H r0 = r3.A0T
            java.lang.Object r1 = r0.get()
            X.2eL r1 = (X.C54562eL) r1
            X.2lS r0 = r1.A01
            r0.A01(r2)
            X.2lS r0 = r1.A02
            r0.A01(r2)
            X.1KB r4 = r3.A02
            r0 = 13
            X.3Cl r1 = new X.3Cl
            r1.<init>(r3, r5, r2, r0)
        L_0x07b5:
            r4.A0J(r1)
            return
        L_0x07b9:
            java.lang.Object r3 = r0.A01
            X.67x r3 = (X.C1193867x) r3
            java.lang.Object r1 = r0.A02
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r2 = r0.A03
            r10 = 1
            X.C18070vi.A0d(r1, r10)
            X.1iW r4 = r3.A04
            X.1kd r5 = r3.A02
            java.util.ArrayList r8 = X.C17880vN.A10(r1)
            r1 = 15
            X.4rw r0 = new X.4rw
            r0.<init>(r1)
            java.util.Collections.sort(r8, r0)
            java.util.List r9 = X.C18070vi.A0M(r2)
            r6 = 0
            r7 = r6
            r4.A0N(r5, r6, r7, r8, r9, r10)
            return
        L_0x07e3:
            java.lang.Object r2 = r0.A01
            X.1NN r2 = (X.AnonymousClass1NN) r2
            java.lang.Object r1 = r0.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.Object r0 = r0.A03
            X.1an r0 = (X.C28721an) r0
            r2.A02(r1)
            r0.A01()
            return
        L_0x07f6:
            java.lang.Object r2 = r0.A01
            X.3rV r2 = (X.C77803rV) r2
            java.lang.Object r1 = r0.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            java.lang.Object r0 = r0.A03
            X.1GV r0 = (X.AnonymousClass1GV) r0
            r2.A03 = r1
            r0.accept(r1)
            return
        L_0x0808:
            java.lang.Object r4 = r0.A01
            X.3s0 r4 = (X.AnonymousClass3s0) r4
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r5 = r0.A03
            X.2mw r5 = (X.C59822mw) r5
            android.content.Context r0 = r1.getContext()
            X.C18070vi.A0X(r0)
            com.whatsapp.WaTextView r3 = r4.A04
            if (r3 == 0) goto L_0x0839
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            if (r2 == 0) goto L_0x0865
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            r2.setMargins(r0, r0, r1, r0)
            r3.setLayoutParams(r2)
        L_0x0839:
            com.whatsapp.WaTextView r3 = r4.A05
            if (r3 == 0) goto L_0x084b
            int r2 = r5.A00
            r1 = 2
            r0 = 2131895439(0x7f12248f, float:1.9425711E38)
            if (r2 != r1) goto L_0x0848
            r0 = 2131895438(0x7f12248e, float:1.942571E38)
        L_0x0848:
            r3.setText(r0)
        L_0x084b:
            com.whatsapp.WaTextView r1 = r4.A04
            if (r1 == 0) goto L_0x0856
            java.lang.String r0 = r5.A00()
            r1.setText(r0)
        L_0x0856:
            com.whatsapp.calling.PeerAvatarLayout r0 = r4.A06
            if (r0 == 0) goto L_0x0861
            X.0wS r1 = X.C18460wS.A00
            X.3WM r0 = r0.A05
            r0.A0W(r1)
        L_0x0861:
            X.AnonymousClass3s0.A00(r4)
            return
        L_0x0865:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x086c:
            java.lang.Object r3 = r0.A01
            X.6oN r3 = (X.C133226oN) r3
            java.lang.Object r2 = r0.A02
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r1 = r0.A03
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.84u r6 = r3.A02
            com.whatsapp.contact.contactform.ContactFormActivity r6 = (com.whatsapp.contact.contactform.ContactFormActivity) r6
            r5 = 1
            r0 = -1
            r6.setResult(r0, r2)
            int r0 = r1.A09
            boolean r4 = X.AnonymousClass000.A1P(r0)
            X.6oN r3 = r6.A0A
            if (r3 != 0) goto L_0x0896
            java.lang.String r0 = "contactFormDeleteContactController"
        L_0x0891:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0896:
            boolean r2 = r1.A10
            X.0z4 r0 = r6.A0A
            boolean r1 = r0.A2J()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.A00(r0, r2, r4, r1)
            r6.finish()
            return
        L_0x08a9:
            java.lang.Object r1 = r0.A01
            X.1i1 r1 = (X.C32951i1) r1
            java.lang.Object r4 = r0.A02
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            java.lang.Object r2 = r0.A03
            X.9Bw r2 = (X.C178119Bw) r2
            r1.A09()
            X.4cT r0 = r2.A09()
            boolean r7 = r0.A03
            boolean r6 = r2.A0J
            int r3 = r2.A08
            monitor-enter(r1)
            android.content.SharedPreferences r5 = X.C32951i1.A00(r1)     // Catch:{ all -> 0x0941 }
            java.lang.String r10 = r4.getRawString()     // Catch:{ all -> 0x0941 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r10)     // Catch:{ all -> 0x0941 }
            java.lang.String r4 = "_voip"
            java.lang.String r2 = X.AnonymousClass000.A0y(r4, r0)     // Catch:{ all -> 0x0941 }
            java.lang.String r0 = "0,0,0,0,0,0,0,0,0,0,0"
            java.lang.String r2 = r5.getString(r2, r0)     // Catch:{ all -> 0x0941 }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r2.split(r0)     // Catch:{ all -> 0x0941 }
            r2 = 0
            long r13 = X.C63782tg.A01(r0, r2)     // Catch:{ all -> 0x0941 }
            r2 = 1
            long r11 = X.C63782tg.A01(r0, r2)     // Catch:{ all -> 0x0941 }
            r2 = 2
            long r27 = X.C63782tg.A01(r0, r2)     // Catch:{ all -> 0x0941 }
            r2 = 3
            long r29 = X.C63782tg.A01(r0, r2)     // Catch:{ all -> 0x0941 }
            r2 = 4
            long r31 = X.C63782tg.A01(r0, r2)     // Catch:{ all -> 0x0941 }
            r2 = 5
            long r19 = X.C63782tg.A01(r0, r2)     // Catch:{ all -> 0x0941 }
            r2 = 6
            long r23 = X.C63782tg.A01(r0, r2)     // Catch:{ all -> 0x0941 }
            r2 = 7
            long r25 = X.C63782tg.A01(r0, r2)     // Catch:{ all -> 0x0941 }
            r2 = 8
            long r15 = X.C63782tg.A01(r0, r2)     // Catch:{ all -> 0x0941 }
            r2 = 9
            long r17 = X.C63782tg.A01(r0, r2)     // Catch:{ all -> 0x0941 }
            r2 = 10
            long r21 = X.C63782tg.A01(r0, r2)     // Catch:{ all -> 0x0941 }
            long r2 = (long) r3     // Catch:{ all -> 0x0941 }
            r8 = 1
            if (r7 == 0) goto L_0x0929
            long r13 = r13 + r8
            if (r6 == 0) goto L_0x0926
            long r29 = r29 + r8
            goto L_0x092a
        L_0x0926:
            long r31 = r31 + r8
            goto L_0x092a
        L_0x0929:
            long r11 = r11 + r8
        L_0x092a:
            long r27 = r27 + r2
            android.content.SharedPreferences$Editor r2 = r5.edit()     // Catch:{ all -> 0x0941 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r10)     // Catch:{ all -> 0x0941 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r4, r0)     // Catch:{ all -> 0x0941 }
            java.lang.String r3 = X.AnonymousClass2T6.A00(r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31)     // Catch:{ all -> 0x0941 }
            X.C17880vN.A1E(r2, r0, r3)     // Catch:{ all -> 0x0941 }
            monitor-exit(r1)
            return
        L_0x0941:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0944:
            java.lang.Object r2 = r0.A01
            X.1i1 r2 = (X.C32951i1) r2
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.Object r3 = r0.A03
            X.2R2 r3 = (X.AnonymousClass2R2) r3
            r2.A09()
            android.content.SharedPreferences r2 = X.C32951i1.A00(r2)
            java.lang.String r1 = r1.getRawString()
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = X.C60332nq.A01()
            java.lang.String r0 = r2.getString(r1, r0)
            X.2S9 r0 = X.C60332nq.A00(r0)
            r0.A00(r3)
            X.C32951i1.A02(r2, r0, r1)
            return
        L_0x0972:
            X.2gx r2 = A01(r0)
            long r3 = r2.A07
            r0 = 1
            long r3 = r3 + r0
            r2.A07 = r3
            goto L_0x0b34
        L_0x097f:
            java.lang.Object r9 = r0.A01
            X.1i1 r9 = (X.C32951i1) r9
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.Object r5 = r0.A03
            java.util.Collection r5 = (java.util.Collection) r5
            r9.A09()
            android.content.SharedPreferences r11 = X.C32951i1.A00(r9)
            java.lang.String r0 = r1.getRawString()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "_integrity"
            java.lang.String r7 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "0,null,null,0,null"
            java.lang.String r0 = r11.getString(r7, r0)
            java.lang.String r8 = ","
            java.lang.String[] r1 = r0.split(r8)
            r0 = 0
            long r14 = X.C63782tg.A01(r1, r0)
            r0 = 3
            long r3 = X.C63782tg.A01(r1, r0)
            r0 = 1
            java.lang.Integer r10 = X.C63782tg.A03(r1, r0)
            r0 = 2
            java.lang.Boolean r13 = X.C63782tg.A02(r1, r0)
            r0 = 4
            java.lang.Boolean r12 = X.C63782tg.A02(r1, r0)
            r0 = 1
            long r14 = r14 + r0
            X.0ve r2 = r9.A0N
            r1 = 8278(0x2056, float:1.16E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x09d8
            java.lang.Boolean r12 = X.AnonymousClass000.A0i()
        L_0x09d8:
            monitor-enter(r9)
            if (r5 == 0) goto L_0x09fb
            java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x09f6 }
            r5 = 0
        L_0x09e0:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x09f6 }
            if (r0 == 0) goto L_0x09f9
            X.206 r2 = X.C17880vN.A0Y(r6)     // Catch:{ all -> 0x09f6 }
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = r2.A11(r0)     // Catch:{ all -> 0x09f6 }
            if (r0 == 0) goto L_0x09e0
            int r5 = r5 + 1
            goto L_0x09e0
        L_0x09f6:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x09f9:
            long r0 = (long) r5
            long r3 = r3 + r0
        L_0x09fb:
            monitor-exit(r9)
            android.content.SharedPreferences$Editor r2 = r11.edit()
            r0 = 5
            java.io.Serializable[] r1 = new java.io.Serializable[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            X.AnonymousClass001.A1Q(r0, r10, r1)
            r0 = 2
            r1[r0] = r13
            X.C17890vO.A1O(r1, r3)
            r0 = 4
            r1[r0] = r12
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.lang.String r0 = android.text.TextUtils.join(r8, r0)
            android.content.SharedPreferences$Editor r0 = r2.putString(r7, r0)
            goto L_0x0ca5
        L_0x0a21:
            X.2ga r2 = A00(r0)
            long r3 = r2.A03
            r0 = 1
            long r3 = r3 + r0
            r2.A03 = r3
            goto L_0x0c24
        L_0x0a2e:
            X.2gx r2 = A01(r0)
            long r3 = r2.A02
            r0 = 1
            long r3 = r3 + r0
            r2.A02 = r3
            goto L_0x0b34
        L_0x0a3b:
            X.2ga r2 = A00(r0)
            long r3 = r2.A04
            r0 = 1
            long r3 = r3 + r0
            r2.A04 = r3
            goto L_0x0c24
        L_0x0a48:
            X.2gx r2 = A01(r0)
            long r3 = r2.A08
            r0 = 1
            long r3 = r3 + r0
            r2.A08 = r3
            goto L_0x0b34
        L_0x0a55:
            X.2gx r2 = A01(r0)
            long r3 = r2.A01
            r0 = 1
            long r3 = r3 + r0
            r2.A01 = r3
            goto L_0x0b34
        L_0x0a62:
            X.2gx r2 = A01(r0)
            long r3 = r2.A04
            r0 = 1
            long r3 = r3 + r0
            r2.A04 = r3
            goto L_0x0b34
        L_0x0a6f:
            X.2gx r2 = A01(r0)
            long r3 = r2.A05
            r0 = 1
            long r3 = r3 + r0
            r2.A05 = r3
            goto L_0x0b34
        L_0x0a7c:
            java.lang.Object r2 = r0.A01
            X.1i1 r2 = (X.C32951i1) r2
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.Object r3 = r0.A03
            X.2nM r3 = (X.C60082nM) r3
            r2.A09()
            android.content.SharedPreferences r2 = X.C32951i1.A00(r2)
            java.lang.String r0 = r1.getRawString()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "_discovery"
            java.lang.String r7 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "null,null"
            java.lang.String r0 = r2.getString(r7, r0)
            java.lang.String r6 = ","
            r0.split(r6)
            r5 = 1
            java.lang.String r4 = r3.A05
            java.lang.String r3 = r3.A08
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String[] r1 = X.C17880vN.A1Z()
            r0 = 0
            r1[r0] = r4
            r1[r5] = r3
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.lang.String r0 = android.text.TextUtils.join(r6, r0)
            android.content.SharedPreferences$Editor r0 = r2.putString(r7, r0)
            goto L_0x0ca5
        L_0x0ac8:
            X.2gx r2 = A01(r0)
            long r3 = r2.A00
            r0 = 1
            long r3 = r3 + r0
            r2.A00 = r3
            goto L_0x0b34
        L_0x0ad4:
            X.2ga r2 = A00(r0)
            long r3 = r2.A02
            r0 = 1
            long r3 = r3 + r0
            r2.A02 = r3
            goto L_0x0c24
        L_0x0ae1:
            X.2gx r2 = A01(r0)
            long r3 = r2.A03
            r0 = 1
            long r3 = r3 + r0
            r2.A03 = r3
            goto L_0x0b34
        L_0x0aed:
            java.lang.Object r2 = r0.A01
            X.1i1 r2 = (X.C32951i1) r2
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.Object r4 = r0.A03
            X.1GV r4 = (X.AnonymousClass1GV) r4
            r2.A09()
            android.content.SharedPreferences r3 = X.C32951i1.A00(r2)
            java.lang.String r0 = r1.getRawString()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "_commerce"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "null,false,false,null,false,null,null,null,null,null"
            java.lang.String r0 = r3.getString(r2, r0)
            X.2kC r0 = X.C58132kC.A00(r0)
            r4.accept(r0)
            android.content.SharedPreferences$Editor r1 = r3.edit()
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            goto L_0x0ca5
        L_0x0b29:
            X.2gx r2 = A01(r0)
            long r3 = r2.A06
            r0 = 1
            long r3 = r3 + r0
            r2.A06 = r3
        L_0x0b34:
            r0 = 9
            java.lang.Long[] r3 = new java.lang.Long[r0]
            long r0 = r2.A03
            X.C17890vO.A1L(r3, r0)
            long r0 = r2.A04
            X.C17890vO.A1M(r3, r0)
            long r0 = r2.A07
            X.C17890vO.A1N(r3, r0)
            long r0 = r2.A08
            X.C17890vO.A1O(r3, r0)
            long r0 = r2.A02
            X.C17890vO.A1P(r3, r0)
            long r0 = r2.A01
            X.C17890vO.A1Q(r3, r0)
            long r0 = r2.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 6
            r3[r0] = r1
            long r0 = r2.A06
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 7
            r3[r0] = r1
            long r0 = r2.A05
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 8
            r3[r0] = r1
            java.lang.String r1 = ","
            java.lang.String r0 = ""
            java.lang.String r3 = X.C200410p.A0I(r1, r0, r0, r3)
            android.content.SharedPreferences r0 = r2.A09
            android.content.SharedPreferences$Editor r1 = r0.edit()
            X.0vl r0 = r2.A0B
            goto L_0x0c50
        L_0x0b84:
            java.lang.Object r3 = r0.A01
            X.1i1 r3 = (X.C32951i1) r3
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.Object r2 = r0.A03
            java.lang.Number r2 = (java.lang.Number) r2
            r3.A09()
            android.content.SharedPreferences r4 = X.C32951i1.A00(r3)
            java.lang.String r5 = r1.getRawString()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r5)
            java.lang.String r1 = "_voip"
            java.lang.String r3 = X.AnonymousClass000.A0y(r1, r0)
            java.lang.String r0 = "0,0,0,0,0,0,0,0,0,0,0"
            java.lang.String r3 = r4.getString(r3, r0)
            java.lang.String r0 = ","
            java.lang.String[] r0 = r3.split(r0)
            r3 = 0
            long r8 = X.C63782tg.A01(r0, r3)
            r3 = 1
            long r6 = X.C63782tg.A01(r0, r3)
            r3 = 2
            long r22 = X.C63782tg.A01(r0, r3)
            r3 = 3
            long r24 = X.C63782tg.A01(r0, r3)
            r3 = 4
            long r26 = X.C63782tg.A01(r0, r3)
            r3 = 5
            long r14 = X.C63782tg.A01(r0, r3)
            r3 = 6
            long r18 = X.C63782tg.A01(r0, r3)
            r3 = 7
            long r20 = X.C63782tg.A01(r0, r3)
            r3 = 8
            long r10 = X.C63782tg.A01(r0, r3)
            r3 = 9
            long r12 = X.C63782tg.A01(r0, r3)
            r3 = 10
            long r16 = X.C63782tg.A01(r0, r3)
            int r0 = r2.intValue()
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0c16;
                case 1: goto L_0x0c14;
                case 2: goto L_0x0c11;
                case 3: goto L_0x0c16;
                case 4: goto L_0x0c0e;
                case 5: goto L_0x0c0c;
                case 6: goto L_0x0c16;
                case 7: goto L_0x0c16;
                case 8: goto L_0x0c16;
                case 9: goto L_0x0c0e;
                case 10: goto L_0x0c16;
                case 11: goto L_0x0c0a;
                case 12: goto L_0x0c0a;
                case 13: goto L_0x0c0a;
                case 14: goto L_0x0c0a;
                case 15: goto L_0x0c16;
                case 16: goto L_0x0c16;
                case 17: goto L_0x0c16;
                case 18: goto L_0x0c0a;
                case 19: goto L_0x0c16;
                case 20: goto L_0x0c14;
                case 21: goto L_0x0c16;
                case 22: goto L_0x0c14;
                case 23: goto L_0x0c11;
                case 24: goto L_0x0bf4;
                case 25: goto L_0x0c16;
                default: goto L_0x0bf4;
            }
        L_0x0bf4:
            android.content.SharedPreferences$Editor r2 = r4.edit()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r5)
            java.lang.String r0 = X.AnonymousClass000.A0y(r1, r0)
            java.lang.String r1 = X.AnonymousClass2T6.A00(r6, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26)
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)
            goto L_0x0ca5
        L_0x0c0a:
            long r12 = r12 + r2
            goto L_0x0bf4
        L_0x0c0c:
            long r10 = r10 + r2
            goto L_0x0bf4
        L_0x0c0e:
            long r18 = r18 + r2
            goto L_0x0bf4
        L_0x0c11:
            long r20 = r20 + r2
            goto L_0x0bf4
        L_0x0c14:
            long r14 = r14 + r2
            goto L_0x0bf4
        L_0x0c16:
            long r16 = r16 + r2
            goto L_0x0bf4
        L_0x0c19:
            X.2ga r2 = A00(r0)
            long r3 = r2.A01
            r0 = 1
            long r3 = r3 + r0
            r2.A01 = r3
        L_0x0c24:
            r0 = 5
            java.lang.Long[] r3 = new java.lang.Long[r0]
            long r0 = r2.A02
            X.C17890vO.A1L(r3, r0)
            long r0 = r2.A01
            X.C17890vO.A1M(r3, r0)
            long r0 = r2.A00
            X.C17890vO.A1N(r3, r0)
            long r0 = r2.A04
            X.C17890vO.A1O(r3, r0)
            long r0 = r2.A03
            X.C17890vO.A1P(r3, r0)
            java.lang.String r1 = ","
            java.lang.String r0 = ""
            java.lang.String r3 = X.C200410p.A0I(r1, r0, r0, r3)
            android.content.SharedPreferences r0 = r2.A05
            android.content.SharedPreferences$Editor r1 = r0.edit()
            X.0vl r0 = r2.A07
        L_0x0c50:
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r3)
            goto L_0x0ca5
        L_0x0c5b:
            java.lang.Object r2 = r0.A01
            X.1i1 r2 = (X.C32951i1) r2
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.Object r6 = r0.A03
            java.util.Collection r6 = (java.util.Collection) r6
            r2.A09()
            android.content.SharedPreferences r5 = X.C32951i1.A00(r2)
            java.lang.String r0 = r1.getRawString()
            java.lang.String r4 = X.AnonymousClass72V.A03(r0)
            java.lang.String r0 = X.AnonymousClass72V.A02()
            java.lang.String r0 = r5.getString(r4, r0)
            X.6Uc r3 = X.AnonymousClass72V.A01(r0)
            r1 = 1
            java.lang.Long r0 = r3.A05
            java.lang.Long r0 = X.C63782tg.A04(r0, r1)
            r3.A05 = r0
            int r0 = r6.size()
            long r1 = (long) r0
            java.lang.Long r0 = r3.A06
            java.lang.Long r0 = X.C63782tg.A04(r0, r1)
            r3.A06 = r0
            android.content.SharedPreferences$Editor r1 = r5.edit()
            java.lang.String r0 = r3.toString()
            android.content.SharedPreferences$Editor r0 = r1.putString(r4, r0)
        L_0x0ca5:
            r0.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70773Cl.run():void");
    }
}
