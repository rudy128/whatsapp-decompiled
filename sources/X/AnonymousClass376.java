package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.376  reason: invalid class name */
public final class AnonymousClass376 implements AnonymousClass1O5 {
    public boolean A00;
    public final AnonymousClass1BI A01;
    public final AnonymousClass1OZ A02;
    public final AnonymousClass73O A03;

    public AnonymousClass376(AnonymousClass1BI r2, AnonymousClass1OZ r3, AnonymousClass73O r4) {
        C18070vi.A0d(r3, 2);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public void BrD(String str) {
    }

    public void Bt9(C29621ca r7, String str) {
        AnonymousClass1KB r2;
        int i;
        C18070vi.A0d(r7, 1);
        AnonymousClass73O r3 = this.A03;
        int A002 = C60482o6.A00(r7);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("profilePhotoHandler/request failed : ");
        A10.append(A002);
        A10.append(" | ");
        AnonymousClass1BI r22 = r3.A0F;
        C17900vP.A0b(r22, A10);
        AnonymousClass73O.A01(r3, 3);
        r3.A00 = true;
        r3.A0G.cancel();
        AnonymousClass73O.A0O.remove(r3.A0J.toString());
        if (!r3.A01) {
            AnonymousClass1E7 A0H = r3.A07.A0H(r22);
            GroupJid groupJid = (GroupJid) A0H.A06(GroupJid.class);
            if (A002 != 401 || groupJid == null || !A0H.A0F() || r3.A0D.A0J(groupJid)) {
                r2 = r3.A05;
                i = 32;
            } else {
                r2 = r3.A05;
                i = 31;
            }
            r2.A0J(new AnonymousClass7RM(r3, A002, i));
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.2MP, X.20i, X.206] */
    /* JADX WARNING: type inference failed for: r11v2, types: [com.whatsapp.data.ProfilePhotoChange, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ef, code lost:
        if (r1 == 167) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
        if (r7 != false) goto L_0x0111;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 1
            X.C18070vi.A0d(r14, r0)
            boolean r0 = r13.A00
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002b
            X.1ca r3 = r14.A0J(r3)
            java.lang.String r0 = "picture"
            X.C29621ca.A04(r3, r0)
            if (r3 == 0) goto L_0x0063
            java.lang.String r0 = "id"
            java.lang.String r4 = r3.A0Q(r0, r2)
            java.lang.String r1 = "has_staging"
            java.lang.String r0 = ""
            java.lang.String r2 = r3.A0Q(r1, r0)
        L_0x0023:
            java.lang.String r0 = "true"
            boolean r3 = r0.equals(r2)
            r2 = r4
        L_0x002b:
            X.73O r4 = r13.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "profilePhotoHandler/request success : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " | "
            r1.append(r0)
            X.1BI r10 = r4.A0F
            X.C17900vP.A0b(r10, r1)
            r7 = 1
            r4.A00 = r7
            X.7T8 r0 = r4.A0G
            r0.cancel()
            java.util.HashMap r1 = X.AnonymousClass73O.A0O
            java.lang.Long r0 = r4.A0J
            java.lang.String r0 = r0.toString()
            r1.remove(r0)
            X.AnonymousClass73O.A01(r4, r7)
            X.1M9 r0 = r4.A07
            X.1E7 r5 = r0.A0H(r10)
            r12 = -1
            if (r2 == 0) goto L_0x0069
            goto L_0x0065
        L_0x0063:
            r4 = r2
            goto L_0x0023
        L_0x0065:
            int r12 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x006e }
        L_0x0069:
            X.1Tv r0 = r4.A0A     // Catch:{ NumberFormatException -> 0x006e }
            r0.A01(r5, r12, r12)     // Catch:{ NumberFormatException -> 0x006e }
        L_0x006e:
            if (r3 == 0) goto L_0x0082
            X.0zA r1 = r4.A04
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0082
            X.C19880zA.A02(r1)
            java.lang.String r0 = "clearEligibilityStatus"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0082:
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0131
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x0111
            X.1Lr r0 = r4.A09
            java.io.File r1 = r0.A01(r5)
            if (r1 == 0) goto L_0x00b3
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00b3
            com.whatsapp.data.ProfilePhotoChange r11 = new com.whatsapp.data.ProfilePhotoChange
            r11.<init>()
            byte[] r0 = X.AnonymousClass1EW.A00(r1)     // Catch:{ IOException -> 0x00a6 }
            r11.oldPhoto = r0     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00ac
        L_0x00a6:
            r1 = move-exception
            java.lang.String r0 = "profilePhotoHandler/"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00ac:
            byte[] r0 = r4.A03
            r11.newPhoto = r0
            r11.newPhotoId = r12
            goto L_0x00b4
        L_0x00b3:
            r11 = 0
        L_0x00b4:
            X.1PQ r6 = r4.A0I
            X.11P r0 = r4.A0B
            long r0 = X.AnonymousClass11P.A01(r0)
            X.11S r2 = r4.A06
            com.whatsapp.jid.PhoneUserJid r9 = X.AnonymousClass11S.A01(r2)
            X.1PP r2 = r6.A02
            X.205 r8 = r2.A01(r10, r7)
            r2 = 6
            X.2MP r6 = new X.2MP
            r6.<init>(r8, r2, r0)
            r0 = -1
            if (r12 != r0) goto L_0x013e
            r0 = 0
        L_0x00d2:
            r6.A0i(r0)
            r6.A0d(r9)
            r6.A00 = r11
            X.1R3 r0 = r4.A0E
            X.206 r8 = r0.A05(r10)
            boolean r0 = r8 instanceof X.C436420i
            if (r0 == 0) goto L_0x010c
            X.20i r8 = (X.C436420i) r8
            int r1 = r8.A00
            r0 = 11
            if (r1 == r0) goto L_0x00f1
            r0 = 167(0xa7, float:2.34E-43)
            r2 = 0
            if (r1 != r0) goto L_0x00f2
        L_0x00f1:
            r2 = 1
        L_0x00f2:
            X.1BI r1 = r6.A0H()
            if (r1 == 0) goto L_0x013c
            boolean r0 = r8.A17()
            if (r0 == 0) goto L_0x013c
            X.1BI r0 = r8.A0H()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x013c
        L_0x0108:
            if (r2 == 0) goto L_0x010c
            if (r7 != 0) goto L_0x0111
        L_0x010c:
            X.121 r0 = r4.A0C
            r0.BBM(r6)
        L_0x0111:
            byte[] r2 = r4.A02
            if (r2 != 0) goto L_0x0132
            byte[] r0 = r4.A03
            if (r0 != 0) goto L_0x0132
            X.1Tv r0 = r4.A0A
            X.1Lr r0 = r0.A03
            r0.A03(r5)
        L_0x0120:
            X.1Tv r0 = r4.A0A
            r0.A00(r5)
            X.1KB r2 = r4.A05
            r1 = 28
            X.3Cp r0 = new X.3Cp
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.A0J(r0)
        L_0x0131:
            return
        L_0x0132:
            if (r3 != 0) goto L_0x0120
            X.1Tv r1 = r4.A0A
            byte[] r0 = r4.A03
            r1.A02(r5, r2, r0)
            goto L_0x0120
        L_0x013c:
            r7 = 0
            goto L_0x0108
        L_0x013e:
            java.lang.String r0 = java.lang.Integer.toString(r12)
            goto L_0x00d2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass376.C7Z(X.1ca, java.lang.String):void");
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
