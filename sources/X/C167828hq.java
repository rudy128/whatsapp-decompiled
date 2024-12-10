package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.8hq  reason: invalid class name and case insensitive filesystem */
public final class C167828hq extends C20997Acp {
    public AnonymousClass9ZD A00;
    public final C182899Wd A01;
    public final C187669gB A02;
    public final C18030ve A03;
    public final C20004A2u A04;
    public final C19949A0g A05;
    public final AnonymousClass1OZ A06;
    public final AnonymousClass4S5 A07;
    public final AnonymousClass10I A08;

    public final boolean A03() {
        C29621ca r7;
        boolean z;
        String A0B = this.A06.A0B();
        this.A04.A03("report_product_tag");
        C26911Ty r2 = this.A01;
        AnonymousClass4S5 r1 = this.A07;
        C187669gB r3 = this.A02;
        String A0A = r2.A0A(r1.A00(r3.A02));
        C19949A0g a0g = this.A05;
        AnonymousClass9ZD r22 = this.A00;
        C22025AwR awR = new C22025AwR(this, A0B, A0A);
        C22026AwS awS = new C22026AwS(this, A0B, A0A);
        if (r22 != null) {
            C20121A8g a8g = (C20121A8g) awR.invoke();
            C18070vi.A0d(a8g, 1);
            r22.A00.put(A0B, a8g);
            r7 = a8g.BVP();
        } else {
            r7 = (C29621ca) awS.invoke();
        }
        try {
            if (AnonymousClass8BS.A1N(a0g.A00)) {
                z = C19949A0g.A00(this, A0B);
            } else {
                z = C17880vN.A0U(a0g.A01).A0N(this, r7, A0B, 193, 32000);
            }
        } catch (AnonymousClass1UI e) {
            Log.e(e.getMessage());
            z = false;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("app/sendReportBizProduct productId=");
        A10.append(r3.A03);
        C17900vP.A0n(" success:", A10, z);
        return z;
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        Log.e("sendReportBizProduct/delivery-error");
        AnonymousClass9ZD r0 = this.A00;
        if (r0 != null) {
            r0.A00.remove(str);
        }
        C20004A2u a2u = this.A04;
        a2u.A02("report_product_tag");
        C182899Wd r02 = this.A01;
        r02.A00.A0C(this.A02, false);
        a2u.A06("report_product_tag", false);
    }

    public void Brd(UserJid userJid) {
        StringBuilder A19 = AnonymousClass3MZ.A19(userJid, 0);
        C17890vO.A19(A19, AnonymousClass8BS.A0g(userJid, "sendReportBizProduct/direct-connection-error/jid=", A19));
        C182899Wd r0 = this.A01;
        r0.A00.A0C(this.A02, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167828hq(C26911Ty r3, C182899Wd r4, C187669gB r5, C18030ve r6, C19949A0g a0g, AnonymousClass1OZ r8, C20004A2u a2u, AnonymousClass4S5 r10, AnonymousClass10I r11) {
        super(r3);
        AnonymousClass9ZD r0;
        C18070vi.A0o(a2u, r8, r3);
        C18070vi.A0d(a0g, 5);
        C108965cb.A1P(r6, 7, r10);
        C18070vi.A0d(r11, 9);
        this.A04 = a2u;
        this.A06 = r8;
        this.A02 = r5;
        this.A05 = a0g;
        this.A01 = r4;
        this.A03 = r6;
        this.A07 = r10;
        this.A08 = r11;
        if (C18020vd.A05(C18040vf.A02, r6, 3497)) {
            r0 = new AnonymousClass9ZD();
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    public void Bre(UserJid userJid) {
        StringBuilder A0K = C18070vi.A0K(userJid);
        C17890vO.A19(A0K, AnonymousClass8BS.A0g(userJid, "sendReportBizProduct/direct-connection-success/jid=", A0K));
        C21445AkC.A01(this.A08, this, 8);
    }

    public void Bt9(C29621ca r11, String str) {
        AnonymousClass9F7 r6;
        boolean z;
        AnonymousClass1UI r0;
        C18070vi.A0h(str, r11);
        Log.e("sendReportBizProduct/response-error");
        C20004A2u a2u = this.A04;
        a2u.A02("report_product_tag");
        try {
            AnonymousClass9ZD r3 = this.A00;
            if (r3 != null) {
                r6 = (AnonymousClass9F7) ((C20121A8g) r3.A00.get(str));
            } else {
                r6 = null;
            }
            if (!C18020vd.A05(C18040vf.A02, this.A03, 3497) || r6 == null) {
                C187669gB r2 = this.A02;
                z = false;
                if (!A02(r2.A02, C60482o6.A00(r11))) {
                    this.A01.A00.A0C(r2, false);
                }
            } else {
                C108945cZ.A1N(r11);
                C62672rm A0s = AnonymousClass8BR.A0s();
                C197369wa r9 = C197369wa.A00;
                C21289Aha aha = new C21289Aha((C29621ca) r6.A00, r9, 23);
                C18070vi.A0d(aha, 1);
                if (((AnonymousClass9DJ) aha.BCF(r11, A0s)) != null) {
                    C22470B9c[] b9cArr = new C22470B9c[8];
                    C21284AhV.A00(b9cArr, 38, 0, r9);
                    C21284AhV.A00(b9cArr, 39, 1, r9);
                    C21284AhV.A00(b9cArr, 40, 2, r9);
                    b9cArr[3] = new C21284AhV(r9, 41);
                    b9cArr[4] = new C21284AhV(r9, 42);
                    b9cArr[5] = new C21284AhV(r9, 43);
                    b9cArr[6] = new C21284AhV(r9, 44);
                    Object A062 = A0s.A06(r11, "IQErrorBadRequest|IQErrorNotAuthorized|IQErrorItemNotFound|IQErrorNotAcceptable|IQErrorInternalServerError|IQErrorServiceUnavailable|IQErrorDirectConnectionInvalidEncryptedInfo|IQErrorUnavailableForLegalReasons", C18070vi.A0O(new C21284AhV(r9, 45), b9cArr, 7), AnonymousClass8BS.A1b(1, 0));
                    if (A062 != null) {
                        C187669gB r7 = this.A02;
                        z = false;
                        if (!A02(r7.A02, (int) ((C22483B9p) A062).BOr())) {
                            this.A01.A00.A0C(r7, false);
                        }
                    } else {
                        r0 = AnonymousClass1O9.A00(A0s);
                    }
                } else {
                    r0 = AnonymousClass1O9.A00(A0s);
                }
                throw r0;
            }
            a2u.A06("report_product_tag", z);
            if (r3 != null) {
                r3.A00.remove(str);
            }
        } catch (Throwable th) {
            AnonymousClass9ZD r02 = this.A00;
            if (r02 != null) {
                r02.A00.remove(str);
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r13, java.lang.String r14) {
        /*
            r12 = this;
            X.C18070vi.A0h(r14, r13)
            X.A2u r5 = r12.A04
            java.lang.String r4 = "report_product_tag"
            r5.A02(r4)
            X.9ZD r3 = r12.A00     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x0072
            java.util.concurrent.ConcurrentHashMap r0 = r3.A00     // Catch:{ all -> 0x00b3 }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ all -> 0x00b3 }
            X.A8g r0 = (X.C20121A8g) r0     // Catch:{ all -> 0x00b3 }
            X.9F7 r0 = (X.AnonymousClass9F7) r0     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0072
            r11 = 1
            r10 = 2
            X.C108945cZ.A1N(r13)     // Catch:{ all -> 0x00b3 }
            java.lang.Object r8 = r0.A00     // Catch:{ all -> 0x00b3 }
            X.1ca r8 = (X.C29621ca) r8     // Catch:{ all -> 0x00b3 }
            X.2rm r7 = X.AnonymousClass8BR.A0s()     // Catch:{ all -> 0x00b3 }
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "false"
            r9 = 0
            r1[r9] = r0     // Catch:{ all -> 0x00b3 }
            java.lang.String r6 = "true"
            java.util.List r2 = X.C18070vi.A0O(r6, r1, r11)     // Catch:{ all -> 0x00b3 }
            java.lang.String[] r1 = X.AnonymousClass8BR.A1b()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "response"
            r1[r9] = r0     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "success"
            X.AnonymousClass8BR.A1K(r1, r11, r10, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = r7.A07(r13, r2, r1)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x006d
            X.9wa r1 = X.C197369wa.A00     // Catch:{ all -> 0x00b3 }
            r0 = 24
            X.Aha r0 = X.C21289Aha.A00(r8, r1, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.Object r0 = r0.BCF(r13, r7)     // Catch:{ all -> 0x00b3 }
            X.9DJ r0 = (X.AnonymousClass9DJ) r0     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0068
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x00b3 }
            X.9Wd r0 = r12.A01     // Catch:{ all -> 0x00b3 }
            X.9gB r1 = r12.A02     // Catch:{ all -> 0x00b3 }
            com.whatsapp.biz.catalog.manager.CatalogManager r0 = r0.A00     // Catch:{ all -> 0x00b3 }
            r0.A0C(r1, r2)     // Catch:{ all -> 0x00b3 }
            r5.A06(r4, r2)     // Catch:{ all -> 0x00b3 }
            goto L_0x00ad
        L_0x0068:
            X.1UI r0 = X.AnonymousClass1O9.A00(r7)     // Catch:{ all -> 0x00b3 }
            goto L_0x0071
        L_0x006d:
            X.1UI r0 = X.AnonymousClass1O9.A00(r7)     // Catch:{ all -> 0x00b3 }
        L_0x0071:
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x0072:
            java.lang.String r0 = "response"
            X.1ca r1 = r13.A0K(r0)     // Catch:{ all -> 0x00b3 }
            r2 = 0
            if (r1 == 0) goto L_0x009d
            java.lang.String r0 = "success"
            X.1ca r0 = r1.A0K(r0)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00ab
            java.lang.String r1 = "true"
            java.lang.String r0 = r0.A0M()     // Catch:{ all -> 0x00b3 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00a6
            X.9Wd r0 = r12.A01     // Catch:{ all -> 0x00b3 }
            X.9gB r1 = r12.A02     // Catch:{ all -> 0x00b3 }
            r2 = 1
        L_0x0094:
            com.whatsapp.biz.catalog.manager.CatalogManager r0 = r0.A00     // Catch:{ all -> 0x00b3 }
            r0.A0C(r1, r2)     // Catch:{ all -> 0x00b3 }
            r5.A06(r4, r2)     // Catch:{ all -> 0x00b3 }
            goto L_0x00ab
        L_0x009d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "sendReportBizProduct/corrupted-response:"
            X.C17900vP.A0X(r13, r0, r1)     // Catch:{ all -> 0x00b3 }
        L_0x00a6:
            X.9Wd r0 = r12.A01     // Catch:{ all -> 0x00b3 }
            X.9gB r1 = r12.A02     // Catch:{ all -> 0x00b3 }
            goto L_0x0094
        L_0x00ab:
            if (r3 == 0) goto L_0x00b2
        L_0x00ad:
            java.util.concurrent.ConcurrentHashMap r0 = r3.A00
            r0.remove(r14)
        L_0x00b2:
            return
        L_0x00b3:
            r1 = move-exception
            X.9ZD r0 = r12.A00
            if (r0 == 0) goto L_0x00bd
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            r0.remove(r14)
        L_0x00bd:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167828hq.C7Z(X.1ca, java.lang.String):void");
    }
}
