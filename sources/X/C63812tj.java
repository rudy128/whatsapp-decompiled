package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2tj  reason: invalid class name and case insensitive filesystem */
public final class C63812tj {
    public static final List A04 = C18460wS.A00;
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public C63812tj(C29621ca r10) {
        List list;
        Object A002;
        C29621ca[] r0;
        C54732ec r4;
        C29621ca A0K;
        C29621ca[] r02;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        ArrayList A134 = AnonymousClass000.A13();
        this.A01 = A13;
        this.A03 = A132;
        this.A00 = A133;
        this.A02 = A134;
        C29621ca A0K2 = r10.A0K("sync");
        if (A0K2 != null) {
            List A0R = A0K2.A0R("collection");
            C18070vi.A0X(A0R);
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                C29621ca A0a = C17880vN.A0a(it);
                if ("error".equals(A0a.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null))) {
                    C29621ca A0K3 = A0a.A0K("error");
                    if (A0K3 != null) {
                        try {
                            int A0A = A0K3.A0A("code", -1);
                            String A0Q = A0K3.A0Q("text", (String) null);
                            if (A0A != 409 || (A0K = A0a.A0K("patches")) == null || (r02 = A0K.A02) == null || r02.length == 0) {
                                r4 = new C54732ec((C165718be) null, A01(A0a), A04, "true".equals(A0a.A0Q("has_more_patches", (String) null)));
                            } else {
                                r4 = A00(A0a);
                            }
                            this.A01.add(new C86124Qg(r4, A0Q, A01(A0a), A0A));
                        } catch (AnonymousClass1UI e) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Expected attribute code in ");
                            A10.append(A0K3);
                            throw new AnonymousClass2E1(C17900vP.A0C(" exception ", A10, e), e, true);
                        }
                    } else {
                        throw C17880vN.A0g();
                    }
                } else if (A0a.A0Q("version", (String) null) != null) {
                    try {
                        long A0D = A0a.A0D("version", -1);
                        if (A0D != -1) {
                            this.A03.add(new AnonymousClass4MH(A0D, A01(A0a)));
                        } else {
                            throw new AnonymousClass2E1(AnonymousClass001.A1E(A0a, "Expected attribute version in ", AnonymousClass000.A10()), (Throwable) null, true);
                        }
                    } catch (AnonymousClass1UI e2) {
                        StringBuilder A11 = AnonymousClass000.A11("Expected attribute version in ");
                        A11.append(A0a);
                        throw new AnonymousClass2E1(C17900vP.A0C(" exception ", A11, e2), e2, true);
                    }
                } else {
                    C29621ca A0K4 = A0a.A0K("patches");
                    if ((A0K4 == null || (r0 = A0K4.A02) == null || r0.length == 0) && A0a.A0K("snapshot") == null) {
                        list = this.A00;
                        A002 = A01(A0a);
                    } else {
                        list = this.A02;
                        A002 = A00(A0a);
                    }
                    list.add(A002);
                }
            }
            return;
        }
        throw new AnonymousClass2E1("Expected node sync in response, but not found", (Throwable) null, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        if (r3 != 101) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C54732ec A00(X.C29621ca r14) {
        /*
            r13 = this;
            java.lang.String r5 = "name"
            java.lang.String r7 = X.C29621ca.A02(r14, r5)
            if (r7 == 0) goto L_0x0165
            java.lang.String r3 = "snapshot"
            X.1ca r1 = r14.A0K(r3)
            java.lang.String r0 = "patches"
            X.1ca r2 = r14.A0K(r0)
            if (r1 != 0) goto L_0x0045
            if (r2 == 0) goto L_0x0138
            r3 = 0
        L_0x001a:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            if (r2 == 0) goto L_0x0121
            java.lang.String r6 = "patch"
            java.util.Iterator r2 = X.C29621ca.A03(r2, r6)
        L_0x0026:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007d
            X.1ca r0 = X.C17880vN.A0a(r2)
            X.C18070vi.A0b(r0)
            A02(r0, r6)
            byte[] r1 = r0.A01     // Catch:{ 1PN -> 0x005c }
            X.2BT r0 = X.AnonymousClass2BT.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x005c }
            X.Bm6 r0 = X.C23577Bm6.A07(r0, r1)     // Catch:{ 1PN -> 0x005c }
            X.C18070vi.A0X(r0)     // Catch:{ 1PN -> 0x005c }
            r4.add(r0)     // Catch:{ 1PN -> 0x005c }
            goto L_0x0026
        L_0x0045:
            X.1ca r0 = r14.A0K(r3)
            if (r0 == 0) goto L_0x0160
            A02(r0, r3)
            byte[] r1 = r0.A01     // Catch:{ 1PN -> 0x013f }
            X.8be r0 = X.C165718be.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x013f }
            X.Bm6 r3 = X.C23577Bm6.A07(r0, r1)     // Catch:{ 1PN -> 0x013f }
            X.8be r3 = (X.C165718be) r3     // Catch:{ 1PN -> 0x013f }
            X.C18070vi.A0b(r3)     // Catch:{ 1PN -> 0x013f }
            goto L_0x001a
        L_0x005c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sync-response/parseCollectionWithPatches failed to parse patch data in "
            java.lang.String r0 = X.AnonymousClass001.A1E(r14, r0, r1)
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.String r3 = X.C29621ca.A02(r14, r5)
            r1 = 0
            r8 = 18
            X.1Tq r0 = new X.1Tq
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            throw r0
        L_0x007d:
            java.util.LinkedHashSet r2 = X.C17880vN.A14()
            java.util.Iterator r6 = r4.iterator()
        L_0x0085:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0121
            java.lang.Object r5 = r6.next()
            X.2BT r5 = (X.AnonymousClass2BT) r5
            int r1 = r5.bitField0_
            r0 = r1 & 32
            if (r0 == 0) goto L_0x00c9
            X.8ZS r0 = r5.exitCode_
            r1 = r0
            if (r0 != 0) goto L_0x009e
            X.8ZS r0 = X.AnonymousClass8ZS.DEFAULT_INSTANCE
        L_0x009e:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00b8
            if (r1 != 0) goto L_0x00a8
            X.8ZS r1 = X.AnonymousClass8ZS.DEFAULT_INSTANCE
        L_0x00a8:
            long r3 = r1.code_
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c6
            r1 = 101(0x65, double:5.0E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r12 = 37
            if (r0 == 0) goto L_0x00ba
        L_0x00b8:
            r12 = 38
        L_0x00ba:
            r5 = 0
            X.1Tq r4 = new X.1Tq
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            throw r4
        L_0x00c6:
            r12 = 36
            goto L_0x00ba
        L_0x00c9:
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0113
            X.8Xv r0 = r5.version_
            if (r0 != 0) goto L_0x00d3
            X.8Xv r0 = X.C164178Xv.DEFAULT_INSTANCE
        L_0x00d3:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0113
            r0 = r1 & 2
            if (r0 == 0) goto L_0x00f3
            X.EE9 r0 = r5.mutations_
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00f3
            r5 = 0
            r12 = 14
            X.1Tq r4 = new X.1Tq
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            throw r4
        L_0x00f3:
            X.8Xv r0 = r5.version_
            if (r0 != 0) goto L_0x00f9
            X.8Xv r0 = X.C164178Xv.DEFAULT_INSTANCE
        L_0x00f9:
            long r0 = r0.version_
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r2.add(r0)
            if (r0 != 0) goto L_0x0085
            r5 = 0
            r12 = 9
            X.1Tq r4 = new X.1Tq
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            throw r4
        L_0x0113:
            r5 = 0
            r12 = 8
            X.1Tq r4 = new X.1Tq
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            throw r4
        L_0x0121:
            java.lang.String r0 = "has_more_patches"
            java.lang.String r1 = X.C29621ca.A02(r14, r0)
            java.lang.String r0 = "true"
            boolean r2 = r0.equals(r1)
            java.lang.String r1 = r13.A01(r14)
            X.2ec r0 = new X.2ec
            r0.<init>(r3, r1, r4, r2)
            return r0
        L_0x0138:
            java.lang.String r0 = "SyncResponse/parseCollectionWithPatches both snapshot and patches node is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x013f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sync-response/parseCollectionWithSnapshot failed to parse patch data in "
            java.lang.String r0 = X.AnonymousClass001.A1E(r14, r0, r1)
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.String r3 = X.C29621ca.A02(r14, r5)
            r1 = 0
            r8 = 69
            X.1Tq r0 = new X.1Tq
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            throw r0
        L_0x0160:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0165:
            java.lang.String r0 = "SyncResponse/parseCollectionWithPatches collection name is mandatory"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63812tj.A00(X.1ca):X.2ec");
    }

    private final String A01(C29621ca r5) {
        String A022 = C29621ca.A02(r5, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (A022 != null) {
            return A022;
        }
        throw new AnonymousClass2E1(AnonymousClass001.A1E(r5, "Expected attribute name in ", AnonymousClass000.A10()), (Throwable) null, true);
    }

    public static final void A02(C29621ca r2, String str) {
        byte[] bArr = r2.A01;
        if (bArr == null || bArr.length == 0) {
            throw new AnonymousClass2E1(AnonymousClass000.A0y(" body was empty.", AnonymousClass000.A11(str)), (Throwable) null, true);
        }
    }

    public C63812tj() {
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        ArrayList A134 = AnonymousClass000.A13();
        this.A01 = A13;
        this.A03 = A132;
        this.A00 = A133;
        this.A02 = A134;
    }
}
