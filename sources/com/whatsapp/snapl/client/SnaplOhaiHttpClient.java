package com.whatsapp.snapl.client;

import X.A02;
import X.AnonymousClass190;
import X.C18030ve;
import X.C18070vi;
import X.C199319zn;

public final class SnaplOhaiHttpClient {
    public final AnonymousClass190 A00;
    public final C18030ve A01;
    public final A02 A02;
    public final C199319zn A03;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.util.List<X.C134936rO> r15, X.C30391dr r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C147847Us
            r5 = r14
            if (r0 == 0) goto L_0x0149
            r8 = r3
            X.7Us r8 = (X.C147847Us) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0149
            int r2 = r2 - r1
            r8.label = r2
        L_0x0015:
            java.lang.Object r12 = r8.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            java.lang.String r1 = "WA_StatusMusicReporting"
            r7 = 2
            r11 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r11) goto L_0x0046
            if (r0 != r7) goto L_0x0150
            X.C30691eM.A01(r12)
        L_0x0028:
            return r12
        L_0x0029:
            X.C30691eM.A01(r12)
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0037
            java.lang.Integer r12 = X.AnonymousClass3MW.A0v(r11)
            return r12
        L_0x0037:
            X.9zn r0 = r14.A03
            r8.L$0 = r14
            r8.L$1 = r15
            r8.label = r11
            java.lang.Object r12 = r0.A00(r1, r8)
            if (r12 != r3) goto L_0x0051
            return r3
        L_0x0046:
            java.lang.Object r15 = r8.L$1
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r5 = r8.L$0
            com.whatsapp.snapl.client.SnaplOhaiHttpClient r5 = (com.whatsapp.snapl.client.SnaplOhaiHttpClient) r5
            X.C30691eM.A01(r12)
        L_0x0051:
            java.lang.String r4 = "SNAPL"
            r2 = 0
            if (r12 != 0) goto L_0x0063
            X.190 r1 = r5.A00
            java.lang.String r0 = "acs_token_fetch_failed"
            r1.A0G(r4, r0, r2)
            r0 = 4
            java.lang.Integer r12 = X.AnonymousClass3MW.A0v(r0)
            return r12
        L_0x0063:
            java.util.ArrayList r6 = X.C29351c6.A0D(r15)
            java.util.Iterator r9 = r15.iterator()
        L_0x006b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r9.next()
            X.6rO r0 = (X.C134936rO) r0
            java.lang.String r0 = X.AnonymousClass6XR.A00(r0)
            r6.add(r0)
            goto L_0x006b
        L_0x007f:
            java.lang.String r0 = "\n"
            java.lang.String r6 = X.C108995ce.A0X(r0, r6)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r9 = r6.getBytes(r0)
            java.io.ByteArrayOutputStream r6 = X.C108945cZ.A15()
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream
            r0.<init>(r6)
            r0.write(r9)
            r0.flush()
            r0.close()
            byte[] r0 = r6.toByteArray()
            X.C18070vi.A0X(r0)
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream
            r9.<init>(r0)
            X.6xz r6 = new X.6xz
            r6.<init>()
            java.lang.String r0 = "acs_token"
            X.C18070vi.A0d(r0, r2)
            java.util.Map r10 = r6.A02
            r10.put(r0, r12)
            java.lang.String r0 = "acs_project"
            X.C18070vi.A0d(r0, r2)
            X.C18070vi.A0d(r1, r11)
            r10.put(r0, r1)
            java.lang.String r1 = X.C197569wu.A0D
            X.C18070vi.A0Z(r1)
            java.lang.String r0 = "app_id"
            X.C18070vi.A0d(r0, r2)
            r10.put(r0, r1)
            java.lang.String r1 = "app_version"
            java.lang.String r0 = "2.24.24.78"
            X.C18070vi.A0d(r1, r2)
            X.C18070vi.A0d(r0, r11)
            r10.put(r1, r0)
            java.util.List r1 = r6.A01
            X.6qS r0 = new X.6qS
            r0.<init>(r9)
            r1.add(r0)
            byte[] r12 = r6.A01()
            int r0 = r12.length
            float r9 = (float) r0
            X.0ve r1 = r5.A01
            r0 = 12248(0x2fd8, float:1.7163E-41)
            float r1 = r1.A0E(r0)
            r0 = 1149239296(0x44800000, float:1024.0)
            float r1 = r1 * r0
            r0 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 * r0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x010c
            X.190 r1 = r5.A00
            java.lang.String r0 = "payload_too_big"
            r1.A0G(r4, r0, r2)
            java.lang.Integer r12 = X.AnonymousClass3MW.A0v(r7)
            return r12
        L_0x010c:
            r15.size()
            r8.L$0 = r5
            r8.L$1 = r6
            r8.L$2 = r12
            r8.label = r7
            X.1g7 r4 = X.C72473Md.A0m(r8)
            X.A02 r7 = r5.A02
            java.lang.Integer r8 = X.AnonymousClass00R.A00
            java.lang.String r2 = "Content-Type"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "multipart/form-data; boundary="
            r1.append(r0)
            java.lang.String r0 = r6.A00
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.util.Map r10 = X.C108975cc.A0h(r2, r0)
            r0 = 9
            X.7S8 r11 = new X.7S8
            r11.<init>(r5, r4, r0)
            java.lang.String r9 = "https://acs.whatsapp.com/music/reporting"
            r13 = 40
            r7.A01(r8, r9, r10, r11, r12, r13)
            java.lang.Object r12 = r4.A0C()
            if (r12 != r3) goto L_0x0028
            return r3
        L_0x0149:
            X.7Us r8 = new X.7Us
            r8.<init>(r14, r3)
            goto L_0x0015
        L_0x0150:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.snapl.client.SnaplOhaiHttpClient.A00(java.util.List, X.1dr):java.lang.Object");
    }

    public SnaplOhaiHttpClient(AnonymousClass190 r1, C18030ve r2, A02 a02, C199319zn r4) {
        C18070vi.A0s(r2, r1, a02, r4);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = a02;
        this.A03 = r4;
    }
}
