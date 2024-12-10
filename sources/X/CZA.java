package X;

import android.opengl.GLES20;

public class CZA {
    public int A00;
    public int A01;
    public int A02;
    public CZB A03;
    public boolean A04;
    public int[] A05;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0072, code lost:
        if (r16 == 0) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CZA(int r15, int r16, boolean r17) {
        /*
            r14 = this;
            java.lang.String r0 = "FrameBufferTexture"
            X.CTi r1 = new X.CTi
            r1.<init>(r0)
            r4 = r17
            r1.A07 = r4
            r0 = 3553(0xde1, float:4.979E-42)
            r1.A02 = r0
            r8 = r15
            r1.A03 = r15
            r9 = r16
            r1.A01 = r9
            android.util.SparseIntArray r0 = r1.A08
            X.BEB.A0p(r0)
            X.CZB r2 = new X.CZB
            r2.<init>(r1)
            r14.<init>()
            r14.A02 = r15
            r14.A01 = r9
            r14.A03 = r2
            r14.A04 = r4
            r1 = 1
            int[] r0 = new int[r1]
            r6 = 0
            android.opengl.GLES20.glGenFramebuffers(r1, r0, r6)
            r0 = r0[r6]
            r14.A00 = r0
            r1 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r1, r0)
            int r3 = r2.A00
            r5 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r5, r3)
            r12 = 5121(0x1401, float:7.176E-42)
            r13 = 0
            r7 = 6408(0x1908, float:8.98E-42)
            if (r17 == 0) goto L_0x0050
            r12 = 33640(0x8368, float:4.714E-41)
            r7 = 32857(0x8059, float:4.6042E-41)
        L_0x0050:
            r11 = 6408(0x1908, float:8.98E-42)
            r10 = r6
            android.opengl.GLES20.glTexImage2D(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = "FrameBufferTexture glTexImage2D"
            X.C26058CrU.A01(r0)
            r0 = 36064(0x8ce0, float:5.0536E-41)
            android.opengl.GLES20.glFramebufferTexture2D(r1, r0, r5, r3, r6)
            java.lang.String r0 = "FrameBufferTexture glFramebufferTexture2D"
            X.C26058CrU.A01(r0)
            int r3 = android.opengl.GLES20.glCheckFramebufferStatus(r1)
            r0 = 36053(0x8cd5, float:5.0521E-41)
            if (r3 == r0) goto L_0x0092
            if (r15 == 0) goto L_0x0074
            r2 = 0
            if (r16 != 0) goto L_0x0075
        L_0x0074:
            r2 = 1
        L_0x0075:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Frame buffer creation failed with "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " isWidthOrHeightZero="
            r1.append(r0)
            if (r2 == 0) goto L_0x008f
            java.lang.String r0 = "true"
        L_0x008a:
            java.lang.RuntimeException r0 = X.BE9.A0n(r0, r1)
            throw r0
        L_0x008f:
            java.lang.String r0 = "false"
            goto L_0x008a
        L_0x0092:
            android.opengl.GLES20.glBindTexture(r5, r6)
            android.opengl.GLES20.glBindFramebuffer(r1, r6)
            r2.A00(r15, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZA.<init>(int, int, boolean):void");
    }

    public void A00() {
        GLES20.glBindFramebuffer(36160, this.A00);
        int[] iArr = new int[1];
        this.A05 = iArr;
        GLES20.glGenRenderbuffers(1, iArr, 0);
        GLES20.glBindRenderbuffer(36161, this.A05[0]);
        GLES20.glRenderbufferStorage(36161, 33189, this.A02, this.A01);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.A05[0]);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glBindRenderbuffer(36161, 0);
            GLES20.glBindFramebuffer(36160, 0);
            return;
        }
        throw BEA.A0h("Depth buffer attachment to FrameBufferTexture failed with ", AnonymousClass000.A10(), glCheckFramebufferStatus);
    }

    public void A01() {
        CZB czb = this.A03;
        this.A03 = null;
        if (czb != null) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.A00}, 0);
            int[] iArr = this.A05;
            this.A05 = null;
            if (iArr != null) {
                GLES20.glDeleteRenderbuffers(1, iArr, 0);
            }
            czb.A01();
        }
    }
}
