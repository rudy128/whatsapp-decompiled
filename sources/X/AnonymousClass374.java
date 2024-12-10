package X;

/* renamed from: X.374  reason: invalid class name */
public class AnonymousClass374 implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AnonymousClass374(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    public void BrD(String str) {
        if (this.A00 != 0) {
            AnonymousClass00N.A00((Object) null, this.A03, ((C31461fb) this.A01).A03);
            return;
        }
        ((AnonymousClass1O5) this.A02).BrD(str);
    }

    public void Bt9(C29621ca r2, String str) {
        if (this.A00 == 0) {
            ((AnonymousClass1O5) this.A02).Bt9(r2, str);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r13, java.lang.String r14) {
        /*
            r12 = this;
            int r0 = r12.A00
            if (r0 == 0) goto L_0x0067
            java.lang.Object r1 = r12.A02
            X.9F7 r1 = (X.AnonymousClass9F7) r1
            r0 = 1
            X.C18070vi.A0d(r13, r0)
            java.lang.String r0 = "iq"
            X.C29621ca.A04(r13, r0)
            java.lang.Object r4 = r1.A00
            X.2rm r3 = new X.2rm
            r3.<init>()
            X.2oz r2 = X.C61022oz.A00
            r1 = 26
            X.Aha r0 = new X.Aha
            r0.<init>(r4, r2, r1)
            java.lang.Object r0 = r0.BCF(r13, r3)
            if (r0 == 0) goto L_0x0062
            r1 = 4
            X.AhW r0 = new X.AhW
            r0.<init>(r2, r1)
            java.lang.Object r0 = r0.BCF(r13, r3)
            X.9DM r0 = (X.AnonymousClass9DM) r0
            if (r0 == 0) goto L_0x0061
            java.lang.Object r4 = r12.A01
            X.1fb r4 = (X.C31461fb) r4
            X.0z4 r3 = r4.A01
            java.lang.Object r1 = r0.A00
            byte[] r1 = (byte[]) r1
            r0 = 3
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)
            java.lang.String r0 = "pref_client_auth_token"
            X.C17880vN.A1E(r1, r0, r2)
            X.1fa r0 = r4.A00
            r0.A00()
            X.00H r0 = r4.A02
            X.1OZ r1 = X.C17880vN.A0U(r0)
            X.1Nz r0 = r1.A06
            java.util.LinkedHashMap r0 = r0.A01()
            X.AnonymousClass1OZ.A05(r1, r0)
        L_0x0061:
            return
        L_0x0062:
            X.1UI r0 = X.AnonymousClass1O9.A00(r3)
            throw r0
        L_0x0067:
            java.lang.Class<X.1EC> r1 = X.AnonymousClass1EC.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r6 = r13.A0F(r1, r0)
            X.C17960vV.A07(r6)
            X.1EC r6 = (X.AnonymousClass1EC) r6
            java.lang.String r0 = "addressing_mode"
            java.lang.String r1 = X.C29621ca.A02(r13, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "GroupXmppMethods/onSuccess/empty addressing mode"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0085:
            java.lang.Object r0 = r12.A02
            X.1O5 r0 = (X.AnonymousClass1O5) r0
            r0.C7Z(r13, r14)
            return
        L_0x008d:
            java.lang.String r9 = X.C42671yY.A00(r1)
            java.lang.Object r2 = r12.A01
            X.12M r2 = (X.AnonymousClass12M) r2
            java.lang.String r5 = r12.A03
            X.00H r0 = r2.A08
            java.lang.Object r0 = r0.get()
            X.2mo r0 = (X.C59742mo) r0
            boolean r0 = r0.A02(r6, r9)
            if (r0 == 0) goto L_0x0085
            int r0 = r5.hashCode()
            r4 = 3
            r3 = 2
            r1 = 1
            switch(r0) {
                case -1335418988: goto L_0x00c2;
                case -934610812: goto L_0x00cf;
                case -309211200: goto L_0x00dc;
                case 96417: goto L_0x00e9;
                default: goto L_0x00af;
            }
        L_0x00af:
            r8 = 0
        L_0x00b0:
            X.00H r0 = r2.A06
            java.lang.Object r5 = r0.get()
            X.126 r5 = (X.AnonymousClass126) r5
            r11 = 5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r10 = 0
            r5.A0d(r6, r7, r8, r9, r10, r11)
            goto L_0x0085
        L_0x00c2:
            java.lang.String r0 = "demote"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00af
            java.lang.Integer r8 = X.C17880vN.A0k()
            goto L_0x00b0
        L_0x00cf:
            java.lang.String r0 = "remove"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00af
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            goto L_0x00b0
        L_0x00dc:
            java.lang.String r0 = "promote"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00af
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            goto L_0x00b0
        L_0x00e9:
            java.lang.String r0 = "add"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00af
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass374.C7Z(X.1ca, java.lang.String):void");
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
