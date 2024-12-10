package X;

/* renamed from: X.4pf  reason: invalid class name and case insensitive filesystem */
public class C97554pf implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C97554pf(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void BrD(String str) {
        StringBuilder A10;
        String str2;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                A10 = AnonymousClass000.A10();
                str2 = "GroupIqResponseUtil/add-participants/delivery fail; groupId=";
                break;
            case 2:
                A10 = AnonymousClass000.A10();
                str2 = "GroupIqResponseUtil/remove-participants/delivery fail; groupId=";
                break;
            default:
                A10 = AnonymousClass000.A10();
                str2 = "GroupIqResponseUtil/add-admin/delivery fail; groupId=";
                break;
        }
        A10.append(str2);
        C17900vP.A0b(((C75033dN) this.A02).A03, A10);
    }

    public void Bt9(C29621ca r4, String str) {
        int i = this.A00;
        C75033dN r1 = (C75033dN) this.A02;
        int A002 = C60482o6.A00(r4);
        if (1 - i != 0) {
            r1.CGB(A002);
        } else {
            r1.CGB(A002);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013c, code lost:
        if (r7.size() != r10.size()) goto L_0x013e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r12, java.lang.String r13) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x01fd;
                case 1: goto L_0x002d;
                case 2: goto L_0x01b8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r11.A01
            X.12M r7 = (X.AnonymousClass12M) r7
            X.00H r0 = r7.A07
            java.lang.Object r1 = r0.get()
            X.1PU r1 = (X.AnonymousClass1PU) r1
            java.lang.Object r5 = r11.A02
            X.3dN r5 = (X.C75033dN) r5
            X.1EC r0 = r5.A03
            boolean r2 = r1.A03(r0)
            java.lang.Class<X.1EC> r1 = X.AnonymousClass1EC.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r6 = r12.A0F(r1, r0)
            X.1EC r6 = (X.AnonymousClass1EC) r6
            if (r6 != 0) goto L_0x0178
            r0 = 800(0x320, float:1.121E-42)
            r5.CGB(r0)
        L_0x002c:
            return
        L_0x002d:
            java.lang.Object r4 = r11.A02
            X.40e r4 = (X.AnonymousClass40e) r4
            X.1EC r0 = r4.A03
            X.4OX r8 = new X.4OX
            r8.<init>(r0)
            java.lang.Class<X.1EC> r1 = X.AnonymousClass1EC.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r5 = r12.A0F(r1, r0)
            if (r5 != 0) goto L_0x0048
            r0 = 800(0x320, float:1.121E-42)
            r4.CGB(r0)
            return
        L_0x0048:
            java.lang.Object r1 = r11.A01
            X.12M r1 = (X.AnonymousClass12M) r1
            java.lang.String r0 = "add"
            X.C20060A5j.A00(r8, r12, r0)
            X.00H r0 = r1.A06
            java.lang.Object r2 = r0.get()
            X.126 r2 = (X.AnonymousClass126) r2
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "groupmgr/onAddGroupParticipants/"
            r3.append(r0)
            r3.append(r5)
            java.lang.String r1 = "/"
            r3.append(r1)
            java.util.Map r9 = r8.A04
            java.util.Set r0 = r9.keySet()
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            r3.append(r0)
            r3.append(r1)
            java.util.Map r7 = r8.A02
            java.util.Set r0 = r7.keySet()
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            X.C17890vO.A1A(r3, r0)
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x009a
            r0 = 3001(0xbb9, float:4.205E-42)
            r2.A0O(r0, r7)
        L_0x009a:
            r4.run()
            boolean r0 = r4 instanceof X.AnonymousClass40R
            if (r0 == 0) goto L_0x0149
            X.40R r4 = (X.AnonymousClass40R) r4
            java.util.Map r0 = r8.A03
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0117
            X.4X6 r3 = r4.A00
            X.1KB r2 = r3.A06
            r1 = 28
            X.7Qq r0 = new X.7Qq
            r0.<init>(r8, r3, r1)
            r2.A0J(r0)
        L_0x00bb:
            java.util.Iterator r2 = X.AnonymousClass000.A15(r7)
        L_0x00bf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = X.C17890vO.A0P(r2)
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = 421(0x1a5, float:5.9E-43)
            if (r1 != r0) goto L_0x00bf
            X.4X6 r3 = r4.A00
            X.1KB r2 = r3.A06
            r1 = 9
            X.Aik r0 = new X.Aik
            r0.<init>(r3, r1)
            r2.A0J(r0)
        L_0x00df:
            X.4X6 r4 = r4.A00
            android.content.Context r0 = r4.A03
            java.lang.String r3 = X.C83764Go.A00(r0, r8)
            if (r3 == 0) goto L_0x00fb
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00fb
            X.1KB r2 = r4.A06
            r1 = 18
            X.7Qs r0 = new X.7Qs
            r0.<init>(r1, r3, r4)
            r2.A0J(r0)
        L_0x00fb:
            java.util.Set r0 = r9.keySet()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002c
            X.1Di r1 = r4.A0H
            java.util.Set r0 = r9.keySet()
            java.util.List r0 = X.C29431cG.A0t(r0)
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            r1.invoke(r0)
            return
        L_0x0117:
            java.util.ArrayList r10 = r8.A01
            boolean r0 = X.C17880vN.A1X(r10)
            if (r0 == 0) goto L_0x00bb
            X.4X6 r1 = r4.A00
            X.1FU r6 = r1.A05
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x00bb
            android.content.Context r5 = r1.A03
            X.1EC r3 = r8.A00
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x013e
            int r2 = r7.size()
            int r0 = r10.size()
            r1 = 1
            if (r2 == r0) goto L_0x013f
        L_0x013e:
            r1 = 0
        L_0x013f:
            r0 = 2
            android.content.Intent r0 = X.AnonymousClass1LU.A0q(r5, r3, r10, r0, r1)
            r6.startActivity(r0)
            goto L_0x00bb
        L_0x0149:
            X.40S r4 = (X.AnonymousClass40S) r4
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0163
            java.util.Set r0 = r9.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r0.next()
            X.1wy r0 = r4.A03
        L_0x015f:
            r0.A0E(r1)
            return
        L_0x0163:
            java.util.Map r1 = r8.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x016e
            X.1wy r0 = r4.A02
            goto L_0x015f
        L_0x016e:
            r1 = r7
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x002c
            X.1wy r0 = r4.A01
            goto L_0x015f
        L_0x0178:
            java.util.HashMap r4 = X.C17880vN.A11()
            java.util.HashMap r3 = X.C17880vN.A11()
            if (r2 == 0) goto L_0x01b5
            java.lang.String r0 = "admin"
        L_0x0184:
            X.C20060A5j.A02(r12, r0, r4, r3)
            X.00H r0 = r7.A06
            java.lang.Object r2 = r0.get()
            X.126 r2 = (X.AnonymousClass126) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "groupmgr/onPromoteGroupParticipants/"
            java.lang.String r0 = X.C72483Me.A0X(r6, r0, r1, r4, r3)
            X.C17890vO.A1A(r1, r0)
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x01b1
            X.1PU r0 = r2.A0j
            boolean r1 = r0.A03(r6)
            r0 = 3003(0xbbb, float:4.208E-42)
            if (r1 == 0) goto L_0x01ae
            r0 = 3019(0xbcb, float:4.23E-42)
        L_0x01ae:
            r2.A0O(r0, r3)
        L_0x01b1:
            r5.run()
            return
        L_0x01b5:
            java.lang.String r0 = "promote"
            goto L_0x0184
        L_0x01b8:
            java.lang.Class<X.1EC> r1 = X.AnonymousClass1EC.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r5 = r12.A0F(r1, r0)
            if (r5 != 0) goto L_0x01cc
            java.lang.Object r1 = r11.A02
            X.3dN r1 = (X.C75033dN) r1
            r0 = 800(0x320, float:1.121E-42)
            r1.CGB(r0)
            return
        L_0x01cc:
            java.util.HashMap r4 = X.C17880vN.A11()
            java.util.HashMap r3 = X.C17880vN.A11()
            java.lang.Object r1 = r11.A01
            X.12M r1 = (X.AnonymousClass12M) r1
            java.lang.String r0 = "remove"
            X.C20060A5j.A02(r12, r0, r4, r3)
            X.00H r0 = r1.A06
            java.lang.Object r2 = r0.get()
            X.126 r2 = (X.AnonymousClass126) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "groupmgr/onRemoveGroupParticipants/"
            java.lang.String r0 = X.C72483Me.A0X(r5, r0, r1, r4, r3)
            X.C17890vO.A1A(r1, r0)
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x01fd
            r0 = 3002(0xbba, float:4.207E-42)
            r2.A0O(r0, r3)
        L_0x01fd:
            java.lang.Object r0 = r11.A02
            X.3dN r0 = (X.C75033dN) r0
            r0.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97554pf.C7Z(X.1ca, java.lang.String):void");
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
