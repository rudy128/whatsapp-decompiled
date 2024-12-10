package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.A4x  reason: case insensitive filesystem */
public final class C20051A4x {
    public final AnonymousClass190 A00;
    public final AnonymousClass118 A01;
    public final C196109uT A02;
    public final C18030ve A03;
    public final C18150vq A04 = C18150vq.A01(new C21516AlP(this, 4));
    public final AnonymousClass00H A05;
    public final AnonymousClass11P A06;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedList A01(X.C21326AiB r3) {
        /*
            r1 = 0
            java.io.InputStream[] r0 = r3.A00
            r3 = r0[r1]
            int r0 = r3.available()     // Catch:{ all -> 0x0031 }
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0031 }
            r3.read(r1)     // Catch:{ all -> 0x0031 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0031 }
            r0.<init>(r1)     // Catch:{ all -> 0x0031 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0031 }
            r2.<init>(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "null cannot be cast to non-null type java.util.LinkedList<kotlin.collections.Map<kotlin.String, kotlin.String?>>"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x002a }
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x002a }
            r2.close()     // Catch:{ all -> 0x0031 }
            r3.close()
            return r1
        L_0x002a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20051A4x.A01(X.AiB):java.util.LinkedList");
    }

    public final List A02(String str) {
        String A0s;
        String A0s2;
        String A0s3;
        String A0s4;
        LinkedList A012;
        ArrayList A16 = C108955ca.A16(str, 0);
        try {
            String A0r = C17880vN.A0r(C17880vN.A0C(this.A02.A01), str);
            if (!(A0r == null || A0r.length() == 0)) {
                for (String A0y : C108955ca.A1b(C108985cd.A0s(A0r, 1))) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    C108975cc.A14(A10, str);
                    C21326AiB A0B = ((AiK) this.A04.get()).A0B(AnonymousClass000.A0y(A0y, A10));
                    if (!(A0B == null || (A012 = A01(A0B)) == null)) {
                        A16.addAll(A012);
                    }
                }
            }
        } catch (Exception e) {
            C108995ce.A1M("FlowsLogger/readSessionDataForFlowsMessageId throws exception", AnonymousClass000.A10(), e);
            this.A00.A0G("FlowsLogger/readSessionDataForFlowsMessageId", AnonymousClass8BX.A0a(this.A03, e.getMessage()), false);
        }
        if (A16.isEmpty()) {
            return C18460wS.A00;
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A16.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            C18070vi.A0d(map, 0);
            String A0s5 = C17880vN.A0s("data", map);
            C195399tH r5 = null;
            if (!(A0s5 == null || (A0s = C17880vN.A0s("extension_id", map)) == null || (A0s2 = C17880vN.A0s("session_id", map)) == null || (A0s3 = C17880vN.A0s(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, map)) == null || (A0s4 = C17880vN.A0s("t", map)) == null)) {
                String A0s6 = C17880vN.A0s("entry_point", map);
                if (A0s6 == null) {
                    A0s6 = "message_cta";
                }
                r5 = new C195399tH(A0s5, A0s, A0s2, A0s4, A0s3, A0s6);
            }
            if (r5 != null) {
                A13.add(r5);
            }
        }
        return A13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x022b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0224, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0228, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.util.Map r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            r3 = 0
            X.C18070vi.A0d(r10, r3)     // Catch:{ all -> 0x0244 }
            X.C18070vi.A0j(r11, r12)     // Catch:{ all -> 0x0244 }
            X.00H r4 = r9.A05     // Catch:{ IOException -> 0x0238 }
            java.lang.Object r0 = r4.get()     // Catch:{ IOException -> 0x0238 }
            X.A0p r0 = (X.C19958A0p) r0     // Catch:{ IOException -> 0x0238 }
            X.9rh r0 = r0.A01(r10)     // Catch:{ IOException -> 0x0238 }
            if (r0 == 0) goto L_0x001d
            int r0 = r0.A00     // Catch:{ IOException -> 0x0238 }
        L_0x0018:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0238 }
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0018
        L_0x001f:
            if (r0 == 0) goto L_0x0036
            java.lang.String r2 = r0.toString()     // Catch:{ IOException -> 0x0238 }
            if (r2 == 0) goto L_0x0036
            X.11P r0 = r9.A06     // Catch:{ IOException -> 0x0238 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0238 }
            X.9tH r6 = A00(r11, r12, r0, r2, r14)     // Catch:{ IOException -> 0x0238 }
            goto L_0x0046
        L_0x0036:
            X.11P r0 = r9.A06     // Catch:{ IOException -> 0x0238 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r0 = "message_cta"
            X.9tH r6 = A00(r11, r12, r1, r0, r14)     // Catch:{ IOException -> 0x0238 }
        L_0x0046:
            if (r6 != 0) goto L_0x0058
            java.lang.String r0 = "FlowsLogger/storeDataForReporting data to be stored is missing parameters"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0238 }
            X.190 r2 = r9.A00     // Catch:{ IOException -> 0x0238 }
            java.lang.String r1 = "userActions/storeDataForReporting"
            java.lang.String r0 = "data to be stored is missing parameters"
            r2.A0G(r1, r0, r3)     // Catch:{ IOException -> 0x0238 }
            goto L_0x0242
        L_0x0058:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0238 }
            X.C108975cc.A14(r0, r10)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r2 = X.AnonymousClass000.A0y(r11, r0)     // Catch:{ IOException -> 0x0238 }
            X.0vq r3 = r9.A04     // Catch:{ IOException -> 0x0238 }
            java.lang.Object r0 = r3.get()     // Catch:{ IOException -> 0x0238 }
            X.AiK r0 = (X.AiK) r0     // Catch:{ IOException -> 0x0238 }
            X.9oK r8 = X.AiK.A00(r0, r2)     // Catch:{ IOException -> 0x0238 }
            if (r8 == 0) goto L_0x0242
            r7 = 0
            r0 = 6
            X.1D6[] r5 = new X.AnonymousClass1D6[r0]     // Catch:{ IOException -> 0x0238 }
            java.lang.String r1 = "data"
            java.lang.String r0 = r6.A02     // Catch:{ IOException -> 0x0238 }
            X.AnonymousClass1D6.A03(r1, r0, r5, r7)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r1 = "extension_id"
            java.lang.String r0 = r6.A00     // Catch:{ IOException -> 0x0238 }
            X.C108985cd.A1G(r1, r0, r5)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r1 = "session_id"
            java.lang.String r0 = r6.A05     // Catch:{ IOException -> 0x0238 }
            X.C72463Mc.A1I(r1, r0, r5)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r1 = "t"
            java.lang.String r0 = r6.A01     // Catch:{ IOException -> 0x0238 }
            X.C72463Mc.A1J(r1, r0, r5)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r1 = "name"
            java.lang.String r0 = r6.A04     // Catch:{ IOException -> 0x0238 }
            X.AnonymousClass8BW.A1L(r1, r0, r5)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = r6.A03     // Catch:{ IOException -> 0x0238 }
            X.1D6 r1 = X.AnonymousClass1D6.A01(r1, r0)     // Catch:{ IOException -> 0x0238 }
            r0 = 5
            r5[r0] = r1     // Catch:{ IOException -> 0x0238 }
            java.util.LinkedHashMap r5 = X.AnonymousClass1D7.A0B(r5)     // Catch:{ IOException -> 0x0238 }
            java.lang.Object r0 = r3.get()     // Catch:{ IOException -> 0x0238 }
            X.AiK r0 = (X.AiK) r0     // Catch:{ IOException -> 0x0238 }
            X.AiB r1 = r0.A0B(r2)     // Catch:{ IOException -> 0x0238 }
            if (r1 == 0) goto L_0x00d6
            r0 = 1
            X.C18070vi.A0d(r5, r0)     // Catch:{ IOException -> 0x0238 }
            java.util.LinkedList r6 = A01(r1)     // Catch:{ IOException -> 0x0238 }
            X.0ve r2 = r9.A03     // Catch:{ IOException -> 0x0238 }
            r1 = 3211(0xc8b, float:4.5E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x0238 }
            int r1 = X.C18020vd.A00(r0, r2, r1)     // Catch:{ IOException -> 0x0238 }
            boolean r0 = X.AnonymousClass000.A1R(r1)
            X.C17960vV.A0C(r0)     // Catch:{ IOException -> 0x0238 }
        L_0x00cc:
            int r0 = r6.size()     // Catch:{ IOException -> 0x0238 }
            if (r0 < r1) goto L_0x00e0
            r6.poll()     // Catch:{ IOException -> 0x0238 }
            goto L_0x00cc
        L_0x00d6:
            java.util.List r0 = X.C18070vi.A0M(r5)     // Catch:{ IOException -> 0x0238 }
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ IOException -> 0x0238 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0238 }
            goto L_0x00e3
        L_0x00e0:
            r6.add(r5)     // Catch:{ IOException -> 0x0238 }
        L_0x00e3:
            java.io.ByteArrayOutputStream r5 = X.C108945cZ.A15()     // Catch:{ IOException -> 0x0238 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0229 }
            r2.<init>(r5)     // Catch:{ all -> 0x0229 }
            r2.writeObject(r6)     // Catch:{ all -> 0x0222 }
            r2.close()     // Catch:{ all -> 0x0229 }
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x0229 }
            r5.close()     // Catch:{ IOException -> 0x0238 }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x0238 }
            X.9HU r2 = r8.A00()     // Catch:{ IOException -> 0x0111 }
            r2.write(r0)     // Catch:{ all -> 0x010a }
            r8.A01()     // Catch:{ all -> 0x010a }
            r2.close()     // Catch:{ IOException -> 0x0111 }
            goto L_0x011b
        L_0x010a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0111 }
            throw r0     // Catch:{ IOException -> 0x0111 }
        L_0x0111:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0238 }
            java.lang.String r0 = "FlowsLogger/FcsConfigDiskCache/writeToDisk: "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ IOException -> 0x0238 }
        L_0x011b:
            if (r13 == 0) goto L_0x012d
            java.lang.Object r0 = r4.get()     // Catch:{ IOException -> 0x0238 }
            X.A0p r0 = (X.C19958A0p) r0     // Catch:{ IOException -> 0x0238 }
            X.9rh r0 = r0.A01(r10)     // Catch:{ IOException -> 0x0238 }
            if (r0 == 0) goto L_0x0138
            int r0 = r0.A00     // Catch:{ IOException -> 0x0238 }
            if (r0 != 0) goto L_0x0138
        L_0x012d:
            X.0ve r2 = r9.A03     // Catch:{ IOException -> 0x0238 }
            r1 = 3212(0xc8c, float:4.501E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x0238 }
            int r8 = X.C18020vd.A00(r0, r2, r1)     // Catch:{ IOException -> 0x0238 }
            goto L_0x018c
        L_0x0138:
            X.9uT r0 = r9.A02     // Catch:{ IOException -> 0x0238 }
            X.0vl r6 = r0.A01     // Catch:{ IOException -> 0x0238 }
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r6)     // Catch:{ IOException -> 0x0238 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0238 }
            java.lang.String r4 = "messageless_flow_ids_per_business_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r4, r13, r0)     // Catch:{ IOException -> 0x0238 }
            r5 = 0
            java.lang.String r1 = r1.getString(r0, r5)     // Catch:{ IOException -> 0x0238 }
            if (r1 == 0) goto L_0x0180
            int r0 = r1.length()     // Catch:{ IOException -> 0x0238 }
            if (r0 == 0) goto L_0x0180
            java.lang.String[] r0 = X.C17880vN.A1Y()     // Catch:{ IOException -> 0x0238 }
            java.lang.String r2 = ","
            r0[r7] = r2     // Catch:{ IOException -> 0x0238 }
            java.util.List r0 = X.AnonymousClass1YF.A0S(r1, r0, r7)     // Catch:{ IOException -> 0x0238 }
            java.util.ArrayList r1 = X.C29431cG.A0m(r0)     // Catch:{ IOException -> 0x0238 }
            boolean r0 = r1.contains(r10)     // Catch:{ IOException -> 0x0238 }
            if (r0 != 0) goto L_0x012d
            r1.add(r10)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r2 = X.C29431cG.A0h(r2, r1, r5)     // Catch:{ IOException -> 0x0238 }
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r6)     // Catch:{ IOException -> 0x0238 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0238 }
            X.AnonymousClass8BX.A0z(r1, r4, r13, r2, r0)     // Catch:{ IOException -> 0x0238 }
            goto L_0x012d
        L_0x0180:
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r6)     // Catch:{ IOException -> 0x0238 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0238 }
            X.AnonymousClass8BX.A0z(r1, r4, r13, r10, r0)     // Catch:{ IOException -> 0x0238 }
            goto L_0x012d
        L_0x018c:
            r4 = 1
            r2 = 0
            boolean r0 = X.AnonymousClass000.A1R(r8)
            X.C17960vV.A0C(r0)     // Catch:{ IOException -> 0x0238 }
            X.9uT r0 = r9.A02     // Catch:{ IOException -> 0x0238 }
            X.0vl r6 = r0.A01     // Catch:{ IOException -> 0x0238 }
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r6)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r1 = X.C17880vN.A0r(r0, r10)     // Catch:{ IOException -> 0x0238 }
            if (r1 == 0) goto L_0x021a
            int r0 = r1.length()     // Catch:{ IOException -> 0x0238 }
            if (r0 == 0) goto L_0x021a
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ IOException -> 0x0238 }
            java.lang.String r7 = ","
            r0[r2] = r7     // Catch:{ IOException -> 0x0238 }
            r5 = 0
            java.util.List r0 = X.AnonymousClass1YF.A0S(r1, r0, r2)     // Catch:{ IOException -> 0x0238 }
            java.util.ArrayList r4 = X.C29431cG.A0m(r0)     // Catch:{ IOException -> 0x0238 }
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ IOException -> 0x0238 }
        L_0x01bc:
            int r0 = r4.size()     // Catch:{ IOException -> 0x0238 }
            if (r0 < r8) goto L_0x01ea
            java.lang.Object r0 = X.C29431cG.A0d(r4)     // Catch:{ IOException -> 0x0238 }
            boolean r0 = X.C18070vi.A18(r0, r11)     // Catch:{ IOException -> 0x0238 }
            if (r0 != 0) goto L_0x01ea
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0238 }
            X.C108975cc.A14(r1, r10)     // Catch:{ IOException -> 0x0238 }
            java.lang.Object r0 = X.AnonymousClass4Z0.A00(r4)     // Catch:{ IOException -> 0x0238 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0238 }
            r1.append(r0)     // Catch:{ IOException -> 0x0238 }
            X.C108955ca.A1U(r1, r2)     // Catch:{ IOException -> 0x0238 }
            r1 = 0
            boolean r0 = r4.isEmpty()     // Catch:{ IOException -> 0x0238 }
            if (r0 != 0) goto L_0x0230
            r4.remove(r1)     // Catch:{ IOException -> 0x0238 }
            goto L_0x01bc
        L_0x01ea:
            java.lang.Object r0 = X.C29431cG.A0d(r4)     // Catch:{ IOException -> 0x0238 }
            boolean r0 = X.C18070vi.A18(r0, r11)     // Catch:{ IOException -> 0x0238 }
            if (r0 != 0) goto L_0x01f7
            r4.add(r11)     // Catch:{ IOException -> 0x0238 }
        L_0x01f7:
            java.lang.String r1 = X.C29431cG.A0h(r7, r4, r5)     // Catch:{ IOException -> 0x0238 }
            android.content.SharedPreferences$Editor r0 = X.C17890vO.A0A(r6)     // Catch:{ IOException -> 0x0238 }
            X.C17880vN.A1E(r0, r10, r1)     // Catch:{ IOException -> 0x0238 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x0238 }
        L_0x0206:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0238 }
            if (r0 == 0) goto L_0x0242
            java.lang.String r1 = X.C17880vN.A0v(r2)     // Catch:{ IOException -> 0x0238 }
            java.lang.Object r0 = r3.get()     // Catch:{ IOException -> 0x0238 }
            X.AiK r0 = (X.AiK) r0     // Catch:{ IOException -> 0x0238 }
            r0.A0C(r1)     // Catch:{ IOException -> 0x0238 }
            goto L_0x0206
        L_0x021a:
            android.content.SharedPreferences$Editor r0 = X.C17890vO.A0A(r6)     // Catch:{ IOException -> 0x0238 }
            X.C17880vN.A1E(r0, r10, r11)     // Catch:{ IOException -> 0x0238 }
            goto L_0x0242
        L_0x0222:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0224 }
        L_0x0224:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0229 }
            throw r0     // Catch:{ all -> 0x0229 }
        L_0x0229:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x022b }
        L_0x022b:
            r1 = move-exception
            X.CDX.A00(r5, r0)     // Catch:{ IOException -> 0x0238 }
            goto L_0x0237
        L_0x0230:
            java.lang.String r0 = "List is empty."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ IOException -> 0x0238 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0238 }
        L_0x0237:
            throw r1     // Catch:{ IOException -> 0x0238 }
        L_0x0238:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0244 }
            java.lang.String r0 = "FlowsLogger/FlowsReportingDiskCache/storeDataForReporting: "
            X.C108995ce.A1M(r0, r1, r2)     // Catch:{ all -> 0x0244 }
        L_0x0242:
            monitor-exit(r9)
            return
        L_0x0244:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20051A4x.A03(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public static final C195399tH A00(String str, String str2, String str3, String str4, Map map) {
        try {
            Object obj = map.get("data");
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            return new C195399tH(AnonymousClass8BW.A0m((Map) obj), str2, str, str3, AnonymousClass8BW.A0g("screen", map), str4);
        } catch (Exception unused) {
            return null;
        }
    }

    public C20051A4x(AnonymousClass190 r3, AnonymousClass11P r4, AnonymousClass118 r5, C196109uT r6, C18030ve r7, AnonymousClass00H r8) {
        C18070vi.A0w(r6, r3, r5, r7, r4);
        C18070vi.A0d(r8, 6);
        this.A02 = r6;
        this.A00 = r3;
        this.A01 = r5;
        this.A03 = r7;
        this.A06 = r4;
        this.A05 = r8;
    }
}
