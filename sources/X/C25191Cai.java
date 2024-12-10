package X;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Set;
import javax.net.ssl.SSLException;

/* renamed from: X.Cai  reason: case insensitive filesystem */
public abstract class C25191Cai {
    public final C24223Bxb A00;
    public final C24223Bxb A01;
    public final InputStream A02;

    public C24829CLx A00() {
        Throwable th;
        try {
            C24223Bxb bxb = this.A00;
            if (!AnonymousClass000.A1R(bxb.available())) {
                return null;
            }
            bxb.A00();
            byte[] bArr = new byte[4];
            if (bxb.read(bArr) < 4) {
                bxb.reset();
                return new C24829CLx((Object) null);
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            byte[] bArr2 = new byte[3];
            wrap.get(bArr2);
            int A012 = C26287Cwn.A01(bArr2);
            if (bxb.available() < A012) {
                bxb.reset();
                return new C24829CLx((Object) null);
            }
            bxb.reset();
            int i = A012 + 4;
            byte[] bArr3 = new byte[i];
            if (bxb.read(bArr3) == i) {
                byte b2 = (byte) b;
                if (b2 == 1) {
                    return new C24829CLx(bArr3);
                }
                if (b2 != 2) {
                    if (b2 == 4) {
                        return new C24829CLx(bArr3);
                    }
                    if (b2 == 8) {
                        return new C24829CLx(bArr3);
                    }
                    if (b2 == 11) {
                        return new C24829CLx(bArr3);
                    }
                    if (b2 == 13) {
                        return new C24829CLx(bArr3);
                    }
                    if (b2 == 15) {
                        return new C24829CLx(bArr3);
                    }
                    if (b2 == 20) {
                        return new C24829CLx(bArr3);
                    }
                    if (b2 == 24) {
                        return new C24829CLx(bArr3);
                    }
                    th = new SSLException(AnonymousClass001.A1I("Invalid handshake message type ", AnonymousClass000.A10(), b2));
                } else if (i < 38 || !C26287Cwn.A06(Arrays.copyOfRange(bArr3, 6, 38), CID.A05)) {
                    return new C24829CLx(bArr3);
                } else {
                    return new C24829CLx(bArr3);
                }
            } else {
                th = BE9.A0b(AnonymousClass001.A1I("Could not read handshake message of length ", AnonymousClass000.A10(), i), (byte) 80);
            }
            throw th;
        } catch (IOException e) {
            throw BE9.A0d(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0220, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0225, code lost:
        throw X.BE9.A0d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0226, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0231, code lost:
        throw new X.C219718c(new javax.net.ssl.SSLException(r0), (byte) 80, true);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0226 A[ExcHandler: SocketException | SocketTimeoutException (r0v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:48:0x00df] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C24829CLx A01() {
        /*
            r15 = this;
            boolean r0 = r15 instanceof X.C24071Buw
            if (r0 == 0) goto L_0x00d9
            r4 = 1
            r3 = 80
            X.CLx r1 = r15.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            if (r1 == 0) goto L_0x0012
            boolean r0 = r1 instanceof X.C24062Bun     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            if (r0 != 0) goto L_0x0012
            return r1
        L_0x0012:
            boolean r0 = r15.A02()     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            r8 = 0
            if (r0 == 0) goto L_0x008d
            r5 = 5
            byte[] r0 = new byte[r5]     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            X.Bxb r10 = r15.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            int r1 = r10.read(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            java.lang.String r9 = " != "
            java.lang.String r2 = "read returned fewer than expected bytes "
            if (r1 != r5) goto L_0x007d
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            byte r7 = r0.get()     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            r0.getShort()     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            int r6 = X.C26287Cwn.A00(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            byte[] r5 = new byte[r6]     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            int r1 = r10.read(r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            if (r1 != r6) goto L_0x006d
            r0 = 20
            if (r7 != r0) goto L_0x0049
            X.Bun r1 = new X.Bun     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            r1.<init>(r8)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            return r1
        L_0x0049:
            r2 = 10
            switch(r7) {
                case 21: goto L_0x005d;
                case 22: goto L_0x0063;
                case 23: goto L_0x00b2;
                default: goto L_0x004e;
            }     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
        L_0x004e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            java.lang.String r0 = "Received Message with invalid type "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r7)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            X.18c r1 = X.BE9.A0b(r0, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            goto L_0x00c0
        L_0x005d:
            X.Bua r1 = new X.Bua     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            r1.<init>(r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            return r1
        L_0x0063:
            X.Bxb r0 = r15.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            r0.BCC(r5, r6)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            X.CLx r1 = r15.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            return r1
        L_0x006d:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            X.BEA.A1P(r2, r9, r0, r1, r6)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            X.18c r1 = X.BE9.A0b(r0, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            goto L_0x00c0
        L_0x007d:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            X.BEA.A1P(r2, r9, r0, r1, r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            X.18c r1 = X.BE9.A0b(r0, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            goto L_0x00c0
        L_0x008d:
            r0 = 16645(0x4105, float:2.3325E-41)
            byte[] r2 = new byte[r0]     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            java.io.InputStream r0 = r15.A02     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            int r1 = r0.read(r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            r0 = -1
            if (r1 == r0) goto L_0x00a5
            X.Bxb r0 = r15.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            r0.BCC(r2, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            X.Bun r1 = new X.Bun     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            r1.<init>(r8)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            return r1
        L_0x00a5:
            java.lang.String r1 = "Transport layer is reached end of file."
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            r0.<init>(r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            X.18c r1 = new X.18c     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            r1.<init>(r0, r3, r4)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            goto L_0x00c0
        L_0x00b2:
            X.Bxb r0 = r15.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            int r0 = r0.available()     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            if (r0 <= 0) goto L_0x00c1
            java.lang.String r0 = "App data and handshake messages cannot interleave"
            X.18c r1 = X.BE9.A0b(r0, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
        L_0x00c0:
            throw r1     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
        L_0x00c1:
            X.Bub r1 = new X.Bub     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            r1.<init>(r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00cd, IOException -> 0x00c7 }
            return r1
        L_0x00c7:
            r0 = move-exception
            X.18c r1 = X.BE9.A0d(r0)
            throw r1
        L_0x00cd:
            r1 = move-exception
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r1)
            X.18c r1 = new X.18c
            r1.<init>(r0, r3, r4)
            throw r1
        L_0x00d9:
            r6 = r15
            X.Bux r6 = (X.C24072Bux) r6
            r3 = 1
            r2 = 80
            X.CLx r1 = r6.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            if (r1 == 0) goto L_0x00ea
            boolean r0 = r1 instanceof X.C24062Bun     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            if (r0 != 0) goto L_0x00ea
            return r1
        L_0x00ea:
            boolean r0 = r6.A02()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r10 = 0
            r7 = 0
            if (r0 == 0) goto L_0x01ee
            r8 = 5
            byte[] r12 = new byte[r8]     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            X.Bxb r1 = r6.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            int r5 = r1.read(r12)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            java.lang.String r13 = " != "
            java.lang.String r4 = "read returned fewer than expected bytes "
            if (r5 != r8) goto L_0x01de
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r12)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            byte r14 = r0.get()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r0.getShort()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            int r5 = X.C26287Cwn.A00(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r0 = 23
            java.lang.String r8 = "Invalid content type "
            r9 = 20
            if (r14 == r0) goto L_0x0130
            if (r14 == r9) goto L_0x0130
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            java.lang.String r0 = X.AnonymousClass001.A1I(r8, r0, r14)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r1.<init>(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r0 = 47
            X.18c r4 = new X.18c     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r4.<init>(r1, r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            goto L_0x021f
        L_0x0130:
            byte[] r11 = new byte[r5]     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            int r1 = r1.read(r11)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            if (r1 != r5) goto L_0x01ce
            if (r14 != r9) goto L_0x0140
            X.Bun r1 = new X.Bun     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r1.<init>(r7)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            return r1
        L_0x0140:
            X.E2p r4 = r6.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            long r0 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            X.DPb r4 = (X.C27005DPb) r4     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            byte[] r13 = r4.A02     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            byte[] r1 = X.C27004DPa.A00(r13, r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r0 = 128(0x80, float:1.794E-43)
            javax.crypto.spec.GCMParameterSpec r14 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r14.<init>(r0, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            javax.crypto.Cipher r13 = r4.A00     // Catch:{ BadPaddingException -> 0x01c6, IllegalBlockSizeException -> 0x01be, InvalidAlgorithmParameterException -> 0x01b6, InvalidKeyException -> 0x01ae, SocketException | SocketTimeoutException -> 0x0226 }
            javax.crypto.SecretKey r1 = r4.A01     // Catch:{ BadPaddingException -> 0x01c6, IllegalBlockSizeException -> 0x01be, InvalidAlgorithmParameterException -> 0x01b6, InvalidKeyException -> 0x01ae, SocketException | SocketTimeoutException -> 0x0226 }
            r0 = 2
            r13.init(r0, r1, r14)     // Catch:{ BadPaddingException -> 0x01c6, IllegalBlockSizeException -> 0x01be, InvalidAlgorithmParameterException -> 0x01b6, InvalidKeyException -> 0x01ae, SocketException | SocketTimeoutException -> 0x0226 }
            javax.crypto.Cipher r0 = r4.A00     // Catch:{ BadPaddingException -> 0x01c6, IllegalBlockSizeException -> 0x01be, InvalidAlgorithmParameterException -> 0x01b6, InvalidKeyException -> 0x01ae, SocketException | SocketTimeoutException -> 0x0226 }
            r0.updateAAD(r12)     // Catch:{ BadPaddingException -> 0x01c6, IllegalBlockSizeException -> 0x01be, InvalidAlgorithmParameterException -> 0x01b6, InvalidKeyException -> 0x01ae, SocketException | SocketTimeoutException -> 0x0226 }
            javax.crypto.Cipher r0 = r4.A00     // Catch:{ BadPaddingException -> 0x01c6, IllegalBlockSizeException -> 0x01be, InvalidAlgorithmParameterException -> 0x01b6, InvalidKeyException -> 0x01ae, SocketException | SocketTimeoutException -> 0x0226 }
            byte[] r11 = r0.doFinal(r11, r10, r5)     // Catch:{ BadPaddingException -> 0x01c6, IllegalBlockSizeException -> 0x01be, InvalidAlgorithmParameterException -> 0x01b6, InvalidKeyException -> 0x01ae, SocketException | SocketTimeoutException -> 0x0226 }
            long r0 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r4 = 1
            long r0 = r0 + r4
            r6.A00 = r0     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            int r0 = r11.length     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
        L_0x016e:
            int r0 = r0 + -1
            byte r5 = r11[r0]     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            if (r5 == 0) goto L_0x016e
            byte[] r4 = java.util.Arrays.copyOfRange(r11, r10, r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            if (r5 != r9) goto L_0x0180
            X.Bun r1 = new X.Bun     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r1.<init>(r7)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            return r1
        L_0x0180:
            r1 = 10
            switch(r5) {
                case 21: goto L_0x01a8;
                case 22: goto L_0x019d;
                case 23: goto L_0x0187;
                default: goto L_0x0185;
            }     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
        L_0x0185:
            goto L_0x0213
        L_0x0187:
            X.Bxb r0 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            int r0 = r0.available()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            if (r0 <= 0) goto L_0x0197
            java.lang.String r0 = "App data and handshake messages cannot interleave"
            X.18c r4 = X.BE9.A0b(r0, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            goto L_0x021f
        L_0x0197:
            X.Bub r1 = new X.Bub     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r1.<init>(r4)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            return r1
        L_0x019d:
            X.Bxb r1 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            int r0 = r4.length     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r1.BCC(r4, r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            X.CLx r1 = r6.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            return r1
        L_0x01a8:
            X.Bua r1 = new X.Bua     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r1.<init>(r4)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            return r1
        L_0x01ae:
            r1 = move-exception
            java.lang.String r0 = " Invalid Key"
            X.18c r4 = X.BE9.A0c(r0, r1, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            goto L_0x021f
        L_0x01b6:
            r1 = move-exception
            java.lang.String r0 = "Invalid Algorithm Params"
            X.18c r4 = X.BE9.A0c(r0, r1, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            goto L_0x021f
        L_0x01be:
            r1 = move-exception
            java.lang.String r0 = "Illegal block size "
            X.18c r4 = X.BE9.A0c(r0, r1, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            goto L_0x021f
        L_0x01c6:
            r1 = move-exception
            java.lang.String r0 = "Bad padding"
            X.18c r4 = X.BE9.A0c(r0, r1, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            goto L_0x021f
        L_0x01ce:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            X.BEA.A1P(r4, r13, r0, r1, r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            X.18c r4 = X.BE9.A0b(r0, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            goto L_0x021f
        L_0x01de:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            X.BEA.A1P(r4, r13, r0, r5, r8)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            X.18c r4 = X.BE9.A0b(r0, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            goto L_0x021f
        L_0x01ee:
            r0 = 16645(0x4105, float:2.3325E-41)
            byte[] r4 = new byte[r0]     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            java.io.InputStream r0 = r6.A02     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            int r1 = r0.read(r4)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r0 = -1
            if (r1 == r0) goto L_0x0206
            X.Bxb r0 = r6.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r0.BCC(r4, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            X.Bun r1 = new X.Bun     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r1.<init>(r7)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            return r1
        L_0x0206:
            java.lang.String r1 = "Transport layer is reached end of file."
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r0.<init>(r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            X.18c r4 = new X.18c     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            r4.<init>(r0, r2, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            goto L_0x021f
        L_0x0213:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            java.lang.String r0 = X.AnonymousClass001.A1I(r8, r0, r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
            X.18c r4 = X.BE9.A0b(r0, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
        L_0x021f:
            throw r4     // Catch:{ SocketException | SocketTimeoutException -> 0x0226, IOException -> 0x0220 }
        L_0x0220:
            r0 = move-exception
            X.18c r0 = X.BE9.A0d(r0)
            throw r0
        L_0x0226:
            r0 = move-exception
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0)
            X.18c r0 = new X.18c
            r0.<init>(r1, r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25191Cai.A01():X.CLx");
    }

    public boolean A02() {
        C219718c r2;
        try {
            C24223Bxb bxb = this.A01;
            if (bxb.available() < 5) {
                return false;
            }
            byte[] bArr = new byte[5];
            bxb.A00();
            int read = bxb.read(bArr);
            if (read == 5) {
                bxb.reset();
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b = wrap.get();
                short s = wrap.getShort();
                int A002 = C26287Cwn.A00(wrap);
                if (CGJ.A00.contains(Byte.valueOf(b))) {
                    Set set = CID.A04;
                    if (s == 771) {
                        if (A002 < 0 || A002 > 16640) {
                            r2 = new C219718c(new SSLException(AnonymousClass000.A0y(C26287Cwn.A04(bArr), AnonymousClass000.A11("Invalid record header "))), (byte) 22, true);
                        } else if (bxb.available() >= A002 + 5) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
                r2 = new C219718c(new SSLException(AnonymousClass000.A0y(C26287Cwn.A04(bArr), AnonymousClass000.A11("Invalid record header "))), (byte) 10, true);
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("read returned fewer than expected bytes ");
                A10.append(read);
                r2 = BE9.A0b(AnonymousClass001.A1I(" != ", A10, 5), (byte) 80);
            }
            throw r2;
        } catch (IOException e) {
            throw BE9.A0d(e);
        }
    }

    public C25191Cai(C24223Bxb bxb, InputStream inputStream) {
        if (inputStream == null || bxb == null) {
            throw BEA.A0X("transportIn or recordStream is null");
        }
        this.A02 = inputStream;
        this.A00 = new C24223Bxb();
        this.A01 = bxb;
    }
}
