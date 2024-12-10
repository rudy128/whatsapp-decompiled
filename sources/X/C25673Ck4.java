package X;

import android.text.Layout;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ck4  reason: case insensitive filesystem */
public final class C25673Ck4 {
    public char[] A00;
    public final Layout A01;
    public final List A02;
    public final List A03;
    public final boolean[] A04;

    public static final int A00(C25673Ck4 ck4, int i, int i2) {
        while (i > i2) {
            char charAt = ck4.A01.getText().charAt(i - 1);
            if (!(charAt == ' ' || charAt == 10 || charAt == 5760)) {
                if (C18070vi.A00(charAt, DefaultCrypto.BUFFER_SIZE) < 0 || C18070vi.A00(charAt, 8202) > 0) {
                    if (!(charAt == 8287 || charAt == 12288)) {
                        break;
                    }
                } else if (charAt == 8199) {
                    break;
                }
            }
            i--;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01c9, code lost:
        if (r6 == false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r7 != 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0111, code lost:
        if (r18.getRunCount() == 1) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017c, code lost:
        if (r6 == false) goto L_0x01cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A01(int r26, boolean r27, boolean r28) {
        /*
            r25 = this;
            r11 = r26
            r10 = r25
            if (r28 == 0) goto L_0x0018
            android.text.Layout r12 = r10.A01
            int r9 = X.C24501C6v.A00(r12, r11)
            int r8 = r12.getLineStart(r9)
            int r2 = r12.getLineEnd(r9)
            if (r11 == r8) goto L_0x002c
            if (r11 == r2) goto L_0x002c
        L_0x0018:
            android.text.Layout r1 = r10.A01
            int r0 = r1.getLineForOffset(r11)
            int r0 = r1.getLineEnd(r0)
            if (r11 <= r0) goto L_0x0025
            r11 = r0
        L_0x0025:
            if (r27 == 0) goto L_0x0131
            float r0 = r1.getPrimaryHorizontal(r11)
            return r0
        L_0x002c:
            if (r26 == 0) goto L_0x0018
            java.lang.CharSequence r0 = r12.getText()
            int r0 = r0.length()
            if (r11 == r0) goto L_0x0018
            java.util.List r13 = r10.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            int r0 = r13.size()
            int r0 = X.AnonymousClass1ZU.A03(r1, r13, r0)
            int r7 = r0 + 1
            if (r0 >= 0) goto L_0x004b
            int r7 = -r7
        L_0x004b:
            if (r7 <= 0) goto L_0x0056
            int r1 = r7 + -1
            int r0 = X.AnonymousClass001.A0n(r13, r1)
            if (r11 != r0) goto L_0x0059
            r7 = r1
        L_0x0056:
            r0 = 0
            if (r7 == 0) goto L_0x005f
        L_0x0059:
            int r0 = r7 + -1
            int r0 = X.AnonymousClass001.A0n(r13, r0)
        L_0x005f:
            int r0 = r12.getLineForOffset(r0)
            int r1 = r12.getParagraphDirection(r0)
            r0 = -1
            boolean r6 = X.AnonymousClass000.A1T(r1, r0)
            int r15 = A00(r10, r2, r8)
            r0 = 0
            if (r7 == 0) goto L_0x0079
            int r0 = r7 + -1
            int r0 = X.AnonymousClass001.A0n(r13, r0)
        L_0x0079:
            int r17 = r8 - r0
            int r16 = r15 - r0
            boolean[] r5 = r10.A04
            boolean r0 = r5[r7]
            if (r0 == 0) goto L_0x00c5
            java.util.List r0 = r10.A02
            java.lang.Object r0 = r0.get(r7)
            java.text.Bidi r0 = (java.text.Bidi) r0
        L_0x008b:
            if (r0 == 0) goto L_0x01a8
            r2 = r17
            r1 = r16
            java.text.Bidi r14 = r0.createLineBidi(r2, r1)
            r13 = 1
            if (r14 == 0) goto L_0x01a8
            int r0 = r14.getRunCount()
            if (r0 == r13) goto L_0x01a8
            int r7 = r14.getRunCount()
            X.CaZ[] r5 = new X.C25183CaZ[r7]
            r4 = 0
        L_0x00a5:
            if (r4 >= r7) goto L_0x0136
            int r3 = r14.getRunStart(r4)
            int r3 = r3 + r8
            int r2 = r14.getRunLimit(r4)
            int r2 = r2 + r8
            int r0 = r14.getRunLevel(r4)
            int r0 = r0 % 2
            boolean r1 = X.AnonymousClass000.A1T(r0, r13)
            X.CaZ r0 = new X.CaZ
            r0.<init>(r3, r2, r1)
            r5[r4] = r0
            int r4 = r4 + 1
            goto L_0x00a5
        L_0x00c5:
            r4 = 0
            if (r7 != 0) goto L_0x012a
            r14 = 0
        L_0x00c9:
            int r1 = X.AnonymousClass001.A0n(r13, r7)
            int r3 = r1 - r14
            char[] r2 = r10.A00
            if (r2 == 0) goto L_0x00d6
            int r0 = r2.length
            if (r0 >= r3) goto L_0x00d8
        L_0x00d6:
            char[] r2 = new char[r3]
        L_0x00d8:
            java.lang.CharSequence r0 = r12.getText()
            android.text.TextUtils.getChars(r0, r14, r1, r2, r4)
            boolean r0 = java.text.Bidi.requiresBidi(r2, r4, r3)
            r21 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0113
            r0 = 0
            if (r7 == 0) goto L_0x00f1
            int r0 = r7 + -1
            int r0 = X.AnonymousClass001.A0n(r13, r0)
        L_0x00f1:
            int r0 = r12.getLineForOffset(r0)
            int r13 = r12.getParagraphDirection(r0)
            r0 = -1
            boolean r24 = X.AnonymousClass000.A1T(r13, r0)
            java.text.Bidi r0 = new java.text.Bidi
            r22 = r4
            r19 = r2
            r20 = r4
            r23 = r3
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            int r3 = r0.getRunCount()
            if (r3 != r1) goto L_0x0115
        L_0x0113:
            r0 = r21
        L_0x0115:
            java.util.List r3 = r10.A02
            r3.set(r7, r0)
            r5[r7] = r1
            if (r0 == 0) goto L_0x0126
            char[] r3 = r10.A00
            r1 = r2
            r2 = r3
            if (r1 != r3) goto L_0x0126
            r2 = r21
        L_0x0126:
            r10.A00 = r2
            goto L_0x008b
        L_0x012a:
            int r0 = r7 + -1
            int r14 = X.AnonymousClass001.A0n(r13, r0)
            goto L_0x00c9
        L_0x0131:
            float r0 = r1.getSecondaryHorizontal(r11)
            return r0
        L_0x0136:
            int r2 = r14.getRunCount()
            byte[] r3 = new byte[r2]
            r1 = 0
        L_0x013d:
            if (r1 >= r2) goto L_0x0149
            int r0 = r14.getRunLevel(r1)
            byte r0 = (byte) r0
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x013d
        L_0x0149:
            r2 = 0
            java.text.Bidi.reorderVisually(r3, r2, r5, r2, r7)
            r1 = -1
            if (r11 == r8) goto L_0x018a
            if (r11 <= r15) goto L_0x0156
            int r11 = A00(r10, r11, r8)
        L_0x0156:
            if (r2 >= r7) goto L_0x015f
            r0 = r5[r2]
            int r0 = r0.A00
            if (r0 != r11) goto L_0x0171
            r1 = r2
        L_0x015f:
            r0 = r5[r1]
            if (r27 != 0) goto L_0x016c
            boolean r0 = r0.A02
            if (r6 == r0) goto L_0x016c
            r0 = r6
            r6 = 0
            if (r0 != 0) goto L_0x016c
            r6 = 1
        L_0x016c:
            if (r1 != 0) goto L_0x0174
            if (r6 == 0) goto L_0x0174
            goto L_0x01b9
        L_0x0171:
            int r2 = r2 + 1
            goto L_0x0156
        L_0x0174:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            int r0 = r7 + -1
            if (r1 != r0) goto L_0x017f
            if (r6 != 0) goto L_0x0188
            goto L_0x01cb
        L_0x017f:
            if (r6 != 0) goto L_0x0188
            int r1 = r1 + 1
        L_0x0183:
            r0 = r5[r1]
            int r0 = r0.A00
            goto L_0x01d8
        L_0x0188:
            int r1 = r1 - r13
            goto L_0x0183
        L_0x018a:
            if (r2 >= r7) goto L_0x0193
            r0 = r5[r2]
            int r0 = r0.A01
            if (r0 != r11) goto L_0x01a5
            r1 = r2
        L_0x0193:
            r0 = r5[r1]
            if (r27 != 0) goto L_0x019b
            boolean r0 = r0.A02
            if (r6 != r0) goto L_0x01a0
        L_0x019b:
            r0 = r6
            r6 = 0
            if (r0 != 0) goto L_0x01a0
            r6 = 1
        L_0x01a0:
            if (r1 != 0) goto L_0x01c1
            if (r6 == 0) goto L_0x01c1
            goto L_0x01b9
        L_0x01a5:
            int r2 = r2 + 1
            goto L_0x018a
        L_0x01a8:
            boolean r0 = r12.isRtlCharAt(r8)
            if (r27 != 0) goto L_0x01b0
            if (r6 != r0) goto L_0x01b5
        L_0x01b0:
            r0 = r6
            r6 = 0
            if (r0 != 0) goto L_0x01b5
            r6 = 1
        L_0x01b5:
            if (r11 != r8) goto L_0x01be
            if (r6 == 0) goto L_0x01cb
        L_0x01b9:
            float r0 = r12.getLineLeft(r9)
            return r0
        L_0x01be:
            if (r6 != 0) goto L_0x01cb
            goto L_0x01b9
        L_0x01c1:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            int r0 = r7 + -1
            if (r1 != r0) goto L_0x01d0
            if (r6 != 0) goto L_0x01dd
        L_0x01cb:
            float r0 = r12.getLineRight(r9)
            return r0
        L_0x01d0:
            if (r6 != 0) goto L_0x01dd
            int r1 = r1 + 1
        L_0x01d4:
            r0 = r5[r1]
            int r0 = r0.A01
        L_0x01d8:
            float r0 = r12.getPrimaryHorizontal(r0)
            return r0
        L_0x01dd:
            int r1 = r1 - r13
            goto L_0x01d4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25673Ck4.A01(int, boolean, boolean):float");
    }

    public C25673Ck4(Layout layout) {
        this.A01 = layout;
        ArrayList A13 = AnonymousClass000.A13();
        int i = 0;
        do {
            int A0C = AnonymousClass1YF.A0C(this.A01.getText(), 10, i, false);
            if (A0C < 0) {
                i = this.A01.getText().length();
            } else {
                i = A0C + 1;
            }
            C17890vO.A1D(A13, i);
        } while (i < this.A01.getText().length());
        this.A03 = A13;
        int size = A13.size();
        ArrayList A0z = C17880vN.A0z(size);
        for (int i2 = 0; i2 < size; i2++) {
            A0z.add((Object) null);
        }
        this.A02 = A0z;
        this.A04 = new boolean[A13.size()];
        A13.size();
    }
}
