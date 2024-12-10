package X;

import android.util.Base64;
import com.whatsapp.flows.network.phoenix.FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1;
import java.io.ByteArrayOutputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8qQ  reason: invalid class name and case insensitive filesystem */
public final class C170638qQ extends C196279uk {
    public int A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final LinkedList A05 = AnonymousClass8BR.A14();
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.OutputStream, X.Bwg, java.io.ByteArrayOutputStream] */
    public static final boolean A00(String str, String str2, String str3, byte[] bArr) {
        try {
            byte[] decode = Base64.decode(str2, 2);
            byte[] A0A = C200310o.A0A(C108975cc.A1O(str3), bArr);
            ? byteArrayOutputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream A15 = C108945cZ.A15();
            C20073A5z.A00.BI5(A15, str);
            DYl dYl = new DYl(A15.toByteArray());
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(A0A, 0, A0A.length);
            return byteArrayOutputStream.A00(dYl, decode);
        } catch (Exception e) {
            throw new C180099Lc(C17900vP.A0C("exception decoding Hex string: ", AnonymousClass000.A10(), e), e);
        } catch (Exception e2) {
            e2.getMessage();
            return false;
        }
    }

    public final void A0B() {
        C195389tG r0;
        LinkedList linkedList = this.A05;
        if (AnonymousClass000.A1a(linkedList) && !this.A09 && (r0 = (C195389tG) linkedList.poll()) != null) {
            A0C(r0.A00, r0.A01, r0.A02, r0.A03, r0.A05, r0.A04);
        }
    }

    public final void A0C(BCV bcv, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str2;
        C18070vi.A0d(str4, 1);
        String str5 = str;
        int hashCode = str.hashCode();
        this.A00 = hashCode;
        AnonymousClass00H r5 = this.A03;
        AnonymousClass8BR.A0V(r5).A0B(Integer.valueOf(this.A00), "psl_network_start");
        AnonymousClass8BR.A0V(r5).A07(this.A00, "psl_cache_hit", false);
        BCV bcv2 = bcv;
        boolean z3 = z2;
        if (str4.length() > 0) {
            String str6 = str3;
            boolean z4 = z;
            if (this.A09) {
                this.A05.add(new C195389tG(bcv2, str5, str4, str6, z4, z3));
            }
            LinkedHashMap A13 = C17880vN.A13();
            A13.put("PSL_SIGNATURE", str6);
            A13.put("EXTENSION_ID", str);
            A13.put("IS_DRAFT", Boolean.valueOf(z4));
            A04(new C20609ARt(bcv, this, str, z3), str, str4, A13);
            return;
        }
        int i = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Downloading PSL for flowId[");
        A10.append(str);
        ((C172038sg) r5.get()).A0E(i, "1", AnonymousClass000.A0y("] skipped since the pslCdnUrl is empty", A10));
        AnonymousClass8BR.A0V(r5).A0B(Integer.valueOf(this.A00), "psl_network_end");
        if (z2) {
            AnonymousClass8BR.A0V(r5).A08(hashCode, 3);
        }
        if (bcv != null) {
            bcv.Bsy(1);
        }
    }

    public final boolean A0D(Map map, byte[] bArr, boolean z) {
        if (!z) {
            return false;
        }
        C17880vN.A1B(C17890vO.A0A(((C196109uT) this.A09.get()).A01), "extensions_asset_verification");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(this.A06), 5764)) {
            AnonymousClass3MX.A1Q(new FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1(this, countDownLatch, (C30391dr) null), (AnonymousClass1OX) C18070vi.A0E(this.A07));
        } else {
            A0I a0i = (A0I) this.A01.get();
            AnonymousClass9XS r4 = new AnonymousClass9XS(countDownLatch);
            if (!a0i.A02.compareAndSet(false, true)) {
                r4.A00.countDown();
            }
            a0i.A01.CGF(new C146797Qq(a0i, r4, 9));
        }
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        return A0E(map, bArr, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (A00(r1, r11, r10, r14) != false) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E(java.util.Map r20, byte[] r21, boolean r22) {
        /*
            r19 = this;
            r4 = 0
            r13 = r20
            if (r20 == 0) goto L_0x009e
            java.lang.String r0 = "PSL_SIGNATURE"
            java.lang.Object r11 = r13.get(r0)
        L_0x000b:
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x009b
            java.lang.String r11 = (java.lang.String) r11
        L_0x0011:
            java.lang.String r10 = ""
            if (r11 != 0) goto L_0x0016
            r11 = r10
        L_0x0016:
            if (r20 == 0) goto L_0x0099
            java.lang.String r0 = "EXTENSION_ID"
            java.lang.Object r1 = r13.get(r0)
        L_0x001e:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0027
            r10 = r1
        L_0x0027:
            r6 = r19
            X.00H r7 = r6.A03
            X.A6h r2 = X.AnonymousClass8BR.A0V(r7)
            int r0 = r6.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r12 = r22
            if (r22 == 0) goto L_0x0093
            java.lang.String r0 = "psl_signature_verify_start"
            r2.A0B(r1, r0)
        L_0x003e:
            X.00H r0 = r6.A06
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 3521(0xdc1, float:4.934E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            java.lang.String r3 = "psl_signature_verify_skipped"
            r2 = 1
            java.lang.String r5 = "psl_signature_verify_end"
            java.lang.String r9 = "psl_signature_verify_result"
            if (r0 == 0) goto L_0x0128
            if (r20 == 0) goto L_0x0091
            java.lang.String r0 = "IS_DRAFT"
            java.lang.Object r1 = r13.get(r0)
        L_0x005d:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0062
            r4 = r1
        L_0x0062:
            boolean r0 = X.C18070vi.A19(r4, r2)
            if (r0 != 0) goto L_0x0128
            java.lang.String r8 = "psl_signature_verify_failed"
            java.lang.String r4 = "2"
            r14 = r21
            if (r21 != 0) goto L_0x00a1
            java.lang.Object r2 = r7.get()
            X.8sg r2 = (X.C172038sg) r2
            int r1 = r6.A00
            java.lang.String r0 = "Payload is null"
            r2.A0E(r1, r4, r0)
            X.A6h r1 = X.AnonymousClass8BR.A0V(r7)
            int r0 = r6.A00
            r1.A06(r0, r9, r8)
            X.A6h r1 = X.AnonymousClass8BR.A0V(r7)
            int r0 = r6.A00
            X.C20081A6h.A02(r1, r5, r0)
            r10 = 0
            return r10
        L_0x0091:
            r1 = r4
            goto L_0x005d
        L_0x0093:
            java.lang.String r0 = "psl_signature_verify_start_1"
            r2.A0B(r1, r0)
            goto L_0x003e
        L_0x0099:
            r1 = r4
            goto L_0x001e
        L_0x009b:
            r11 = r4
            goto L_0x0011
        L_0x009e:
            r11 = r4
            goto L_0x000b
        L_0x00a1:
            X.9iT r3 = X.C19978A1o.A03
            X.00H r0 = r6.A09
            java.lang.Object r0 = r0.get()
            X.9uT r0 = (X.C196109uT) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "extensions_asset_verification"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)
            X.A1o r15 = r3.A00(r0)
            if (r15 != 0) goto L_0x00c2
            boolean r10 = r6.A0D(r13, r14, r12)
            return r10
        L_0x00c2:
            java.lang.String r0 = r15.A02
            boolean r0 = A00(r0, r11, r10, r14)
            java.lang.String r3 = "psl_signature_verify_success"
            if (r0 != 0) goto L_0x00eb
            java.lang.String r1 = r15.A01
            if (r1 == 0) goto L_0x00f5
            java.lang.Long r0 = r15.A00
            if (r0 == 0) goto L_0x00f5
            long r17 = r0.longValue()
            X.00H r0 = r6.A08
            r0.get()
            long r15 = java.lang.System.currentTimeMillis()
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f5
            boolean r0 = A00(r1, r11, r10, r14)
            if (r0 == 0) goto L_0x00f5
        L_0x00eb:
            X.A6h r1 = X.AnonymousClass8BR.A0V(r7)
            int r0 = r6.A00
            r1.A06(r0, r9, r3)
            goto L_0x0131
        L_0x00f5:
            boolean r10 = r6.A0D(r13, r14, r12)
            java.lang.Object r2 = r7.get()
            X.8sg r2 = (X.C172038sg) r2
            int r1 = r6.A00
            if (r10 == 0) goto L_0x0119
            r2.A06(r1, r9, r3)
            X.A6h r1 = X.AnonymousClass8BR.A0V(r7)
            int r0 = r6.A00
            X.C20081A6h.A02(r1, r5, r0)
        L_0x010f:
            X.A6h r1 = X.AnonymousClass8BR.A0V(r7)
            int r0 = r6.A00
            X.C20081A6h.A02(r1, r5, r0)
            return r10
        L_0x0119:
            java.lang.String r0 = "Signature Verification Failed"
            r2.A0E(r1, r4, r0)
            X.A6h r1 = X.AnonymousClass8BR.A0V(r7)
            int r0 = r6.A00
            r1.A06(r0, r9, r8)
            goto L_0x010f
        L_0x0128:
            X.A6h r1 = X.AnonymousClass8BR.A0V(r7)
            int r0 = r6.A00
            r1.A06(r0, r9, r3)
        L_0x0131:
            X.A6h r1 = X.AnonymousClass8BR.A0V(r7)
            int r0 = r6.A00
            X.C20081A6h.A02(r1, r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170638qQ.A0E(java.util.Map, byte[], boolean):boolean");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C170638qQ(X.AnonymousClass00H r18, X.AnonymousClass00H r19, X.AnonymousClass00H r20, X.AnonymousClass00H r21, X.AnonymousClass00H r22, X.AnonymousClass00H r23, X.AnonymousClass00H r24, X.AnonymousClass00H r25, X.AnonymousClass00H r26, X.AnonymousClass00H r27, X.AnonymousClass00H r28, X.AnonymousClass00H r29, X.AnonymousClass00H r30) {
        /*
            r17 = this;
            r12 = r18
            r11 = r19
            r10 = r20
            r9 = r21
            r0 = r22
            X.C18070vi.A0w(r12, r11, r10, r9, r0)
            r8 = r23
            r7 = r24
            r6 = r25
            r5 = r26
            r4 = r27
            X.C18070vi.A0x(r8, r7, r6, r5, r4)
            r3 = r28
            r2 = r29
            r1 = r30
            X.C18070vi.A0r(r3, r2, r1)
            java.lang.Object r12 = r12.get()
            X.118 r12 = (X.AnonymousClass118) r12
            X.10I r15 = X.AnonymousClass3MX.A0x(r11)
            java.lang.Object r11 = r9.get()
            X.181 r11 = (X.AnonymousClass181) r11
            java.lang.Object r14 = r10.get()
            X.18j r14 = (X.C220418j) r14
            java.lang.Object r13 = r0.get()
            X.1D9 r13 = (X.AnonymousClass1D9) r13
            r0 = 14
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r10 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r10.A04 = r8
            r10.A09 = r7
            r10.A02 = r6
            r10.A03 = r5
            r10.A01 = r4
            r10.A08 = r3
            r10.A06 = r2
            r10.A07 = r1
            java.util.LinkedList r0 = X.AnonymousClass8BR.A14()
            r10.A05 = r0
            X.0vd r2 = X.C17880vN.A0P(r2)
            r1 = 3427(0xd63, float:4.802E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            r10.A00 = r0
            r10.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170638qQ.<init>(X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H):void");
    }
}
