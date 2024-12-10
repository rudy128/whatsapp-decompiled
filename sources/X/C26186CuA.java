package X;

import java.util.List;

/* renamed from: X.CuA  reason: case insensitive filesystem */
public final class C26186CuA {
    public C22851Dl A00;
    public C25818CmV A01;
    public C25800CmC A02;
    public AnonymousClass205 A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final C18100vl A09 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, C27913Dno.A00);
    public final C18090vk A0A;

    public C26186CuA(AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31) {
        AnonymousClass00H r6 = r27;
        C18070vi.A0d(r6, 1);
        AnonymousClass00H r5 = r28;
        AnonymousClass00H r4 = r29;
        AnonymousClass00H r3 = r30;
        C18070vi.A0p(r5, r4, r3);
        AnonymousClass00H r1 = r31;
        C18070vi.A0d(r1, 5);
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = r4;
        this.A08 = r3;
        this.A06 = r1;
        C25818CmV cmV = new C25818CmV(C119926Al.A00, (AnonymousClass205) null, (AnonymousClass205) null, (C25550Cho) null, C24127Bvt.A00, (C441822l) null, (Boolean) null, (String) null, (String) null, (List) null, 1, -1, false, false, false, false, false, false, false, false, false);
        this.A01 = cmV;
        this.A02 = A02(cmV);
        this.A0A = new C27737DkJ(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r1 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C25800CmC A00(X.C4I r8, X.C25818CmV r9) {
        /*
            r7 = this;
            X.205 r1 = r9.A04
            if (r1 == 0) goto L_0x0033
            X.205 r0 = r9.A03
            boolean r1 = r1.equals(r0)
        L_0x000a:
            r2 = r8
            boolean r0 = r8 instanceof X.C23826Bqe
            if (r0 != 0) goto L_0x0021
            boolean r0 = r8 instanceof X.Bqj
            if (r0 != 0) goto L_0x0021
            boolean r0 = r8 instanceof X.C23823Bqb
            if (r0 == 0) goto L_0x001f
            boolean r0 = r9.A0K
            if (r0 == 0) goto L_0x0035
            if (r1 != 0) goto L_0x0021
            boolean r1 = r9.A0G
        L_0x001f:
            if (r1 == 0) goto L_0x0035
        L_0x0021:
            r3 = 0
            boolean r0 = r9.A0J
            if (r0 != 0) goto L_0x0030
            X.ByP r4 = X.C24266ByP.AUDIO_METADATA
        L_0x0028:
            X.CmC r1 = new X.CmC
            r6 = r3
            r5 = r3
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x0030:
            X.ByP r4 = X.C24266ByP.FOOTER
            goto L_0x0028
        L_0x0033:
            r1 = 0
            goto L_0x000a
        L_0x0035:
            X.CmC r1 = r7.A01(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26186CuA.A00(X.C4I, X.CmV):X.CmC");
    }

    private final C25800CmC A01(C25818CmV cmV) {
        C23826Bqe bqe;
        C24266ByP byP;
        C441822l r1;
        AnonymousClass205 r0;
        if (!cmV.A0E || (r1 = cmV.A07) == null || (r0 = cmV.A03) == null || r0.A02) {
            bqe = null;
        } else {
            bqe = new C23826Bqe(r1);
        }
        if (bqe == null || !cmV.A0J) {
            byP = C24266ByP.AUDIO_METADATA;
        } else {
            byP = C24266ByP.FOOTER;
        }
        return new C25800CmC(bqe, (C194909sU) null, byP, (CharSequence) null, (C18090vk) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x016d, code lost:
        if (r1 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a3, code lost:
        if (r5 >= r1) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f6, code lost:
        if (r1 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0154, code lost:
        if ((r5 instanceof X.C24124Bvq) != false) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C25800CmC A02(X.C25818CmV r22) {
        /*
            r21 = this;
            r2 = r22
            X.6TT r4 = r2.A02
            java.lang.String r11 = r2.A0A
            X.CM2 r5 = r2.A06
            X.Bvt r7 = X.C24127Bvt.A00
            boolean r0 = X.C18070vi.A18(r5, r7)
            if (r0 == 0) goto L_0x0014
            if (r11 == 0) goto L_0x0014
            X.Bvs r5 = X.C24126Bvs.A00
        L_0x0014:
            X.Bvs r6 = X.C24126Bvs.A00
            boolean r0 = X.C18070vi.A18(r5, r6)
            r1 = 1
            if (r0 != 0) goto L_0x002d
            boolean r0 = r5 instanceof X.C24122Bvo
            if (r0 != 0) goto L_0x002d
            X.Bvr r0 = X.C24125Bvr.A00
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 == 0) goto L_0x0185
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x0185
        L_0x002d:
            boolean r0 = r2.A0K
            r3 = r21
            if (r0 != 0) goto L_0x00bd
            if (r1 != 0) goto L_0x00bd
            X.22l r6 = r2.A07
            if (r6 == 0) goto L_0x00bb
            X.205 r0 = r6.A0v
            if (r0 == 0) goto L_0x00bb
            X.1BI r1 = r0.A00
        L_0x003f:
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x004e
            X.Bqg r7 = X.Bqg.A00
        L_0x0049:
            X.CmC r0 = r3.A00(r7, r2)
            return r0
        L_0x004e:
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x0062
            if (r6 == 0) goto L_0x0062
            X.205 r0 = r2.A03
            if (r0 == 0) goto L_0x0062
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0062
            X.Bqe r7 = new X.Bqe
            r7.<init>(r6)
            goto L_0x0049
        L_0x0062:
            boolean r0 = r2.A0I
            if (r0 == 0) goto L_0x00a5
            if (r6 == 0) goto L_0x00a5
            if (r1 == 0) goto L_0x00a5
            boolean r0 = r6.A0w()
            if (r0 != 0) goto L_0x00a5
            X.00H r0 = r3.A06
            r5 = 0
            java.lang.Object r0 = r0.get()
            X.DVP r0 = (X.DVP) r0
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x00b5
            X.00H r0 = r3.A05
            X.4a3 r4 = X.AnonymousClass3MX.A0y(r0)
            X.0z4 r0 = r4.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "voice_message_transcription_upsell_count"
            int r5 = r1.getInt(r0, r5)
            X.0ve r4 = r4.A01
            r1 = 12233(0x2fc9, float:1.7142E-41)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r4, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r1 < 0) goto L_0x00b1
            if (r0 == 0) goto L_0x00b1
        L_0x00a3:
            if (r5 < r1) goto L_0x00b5
        L_0x00a5:
            r1 = 0
            X.ByP r3 = X.C24266ByP.AUDIO_METADATA
            X.CmC r0 = new X.CmC
            r4 = r1
            r5 = r1
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L_0x00b1:
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00a3
        L_0x00b5:
            X.Bqd r7 = new X.Bqd
            r7.<init>(r6)
            goto L_0x0049
        L_0x00bb:
            r1 = 0
            goto L_0x003f
        L_0x00bd:
            boolean r0 = X.C18070vi.A18(r5, r6)
            if (r0 == 0) goto L_0x00de
            boolean r8 = r2.A0H
            r10 = 100
            if (r8 == 0) goto L_0x00cb
            r10 = 300(0x12c, float:4.2E-43)
        L_0x00cb:
            int r7 = r2.A00
            r9 = 1
            if (r7 == r9) goto L_0x00d5
            int r0 = r7 - r9
            int r0 = r0 * 280
            int r10 = r10 + r0
        L_0x00d5:
            if (r11 != 0) goto L_0x0188
            X.Bqi r0 = X.Bqi.A00
            X.CmC r0 = r3.A00(r0, r2)
            return r0
        L_0x00de:
            boolean r0 = X.C18070vi.A18(r5, r7)
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r5 instanceof X.C24124Bvq
            if (r0 != 0) goto L_0x00ff
            X.Bvr r0 = X.C24125Bvr.A00
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 == 0) goto L_0x0167
            X.205 r1 = r2.A03
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x0156
            if (r1 == 0) goto L_0x016f
        L_0x00f8:
            X.Bqb r7 = new X.Bqb
            r7.<init>(r4, r1, r5)
            goto L_0x0049
        L_0x00ff:
            X.6Ai r0 = X.C119896Ai.A00
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 != 0) goto L_0x0181
            X.6Ak r0 = X.C119916Ak.A00
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 != 0) goto L_0x0181
            boolean r0 = r4 instanceof X.C119886Ah
            if (r0 == 0) goto L_0x011e
            X.6Ah r4 = (X.C119886Ah) r4
            int r0 = r4.A00
            X.Bqc r7 = new X.Bqc
            r7.<init>(r0)
            goto L_0x0049
        L_0x011e:
            X.6An r0 = X.C119946An.A00
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 == 0) goto L_0x012a
            X.Bqh r7 = X.Bqh.A00
            goto L_0x0049
        L_0x012a:
            X.6Aj r0 = X.C119906Aj.A00
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 != 0) goto L_0x017d
            X.6Am r0 = X.C119936Am.A00
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 != 0) goto L_0x017d
            boolean r0 = r4 instanceof X.C119876Ag
            if (r0 == 0) goto L_0x014a
            X.6Ag r4 = (X.C119876Ag) r4
            java.lang.Exception r0 = r4.A00
            boolean r0 = r0 instanceof X.AnonymousClass6SF
            if (r0 == 0) goto L_0x017d
            X.BqY r7 = X.C23821BqY.A00
            goto L_0x0049
        L_0x014a:
            X.6Ao r0 = X.C119956Ao.A00
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 == 0) goto L_0x015a
            boolean r0 = r5 instanceof X.C24124Bvq
            if (r0 == 0) goto L_0x016f
        L_0x0156:
            X.Bqj r7 = X.Bqj.A00
            goto L_0x0049
        L_0x015a:
            X.6Al r0 = X.C119926Al.A00
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 != 0) goto L_0x016f
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0167:
            boolean r0 = r5 instanceof X.C24122Bvo
            if (r0 == 0) goto L_0x0174
            X.205 r1 = r2.A03
            if (r1 != 0) goto L_0x00f8
        L_0x016f:
            X.CmC r0 = r3.A01(r2)
            return r0
        L_0x0174:
            boolean r0 = r5 instanceof X.C24123Bvp
            if (r0 != 0) goto L_0x016f
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x017d:
            X.BqZ r7 = X.C23822BqZ.A00
            goto L_0x0049
        L_0x0181:
            X.Bqf r7 = X.Bqf.A00
            goto L_0x0049
        L_0x0185:
            r1 = 0
            goto L_0x002d
        L_0x0188:
            java.lang.String r1 = r2.A09
            r6 = 1
            if (r1 == 0) goto L_0x019c
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r11, r9)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r9)
            java.lang.String r11 = java.lang.String.format(r1, r0)
            X.C18070vi.A0X(r11)
        L_0x019c:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r11)
            int r1 = r4.length()
            int r1 = r1 - r10
            r0 = 20
            if (r1 > r0) goto L_0x0210
            r5 = 0
        L_0x01ab:
            X.22l r9 = r2.A07
            r12 = 0
            if (r9 == 0) goto L_0x020e
            long r0 = r9.A0x
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
        L_0x01b6:
            X.00H r0 = r3.A05
            X.4a3 r0 = X.AnonymousClass3MX.A0y(r0)
            X.0ve r10 = r0.A01
            r1 = 9854(0x267e, float:1.3808E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r10, r1)
            if (r0 == 0) goto L_0x0251
            java.lang.Boolean r0 = r2.A08
            boolean r0 = X.C18070vi.A19(r0, r6)
            if (r0 != 0) goto L_0x0251
            if (r5 != 0) goto L_0x0251
            if (r7 > r6) goto L_0x01de
            if (r8 == 0) goto L_0x0251
            int r1 = r4.length()
            r0 = 100
            if (r1 <= r0) goto L_0x0251
        L_0x01de:
            if (r11 == 0) goto L_0x0251
            long r17 = r11.longValue()
            X.25F r0 = r9.A00
            X.229 r0 = r0.A02
            X.7LG r0 = (X.AnonymousClass7LG) r0
            if (r0 == 0) goto L_0x020c
            java.lang.String r14 = r0.A05
        L_0x01ee:
            java.util.List r0 = r2.A0B
            if (r0 == 0) goto L_0x0253
            java.util.ArrayList r6 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x01fa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x024c
            java.lang.Object r0 = r1.next()
            X.6t3 r0 = (X.C135966t3) r0
            int r0 = r0.A00
            X.C17890vO.A1D(r6, r0)
            goto L_0x01fa
        L_0x020c:
            r14 = r12
            goto L_0x01ee
        L_0x020e:
            r11 = r12
            goto L_0x01b6
        L_0x0210:
            java.lang.String r1 = r4.toString()
            r5 = 0
            if (r10 <= 0) goto L_0x0246
            int r0 = r4.length()
            if (r10 >= r0) goto L_0x0246
            int r0 = r10 + -1
            int r0 = r1.codePointAt(r0)
            int r1 = java.lang.Character.charCount(r0)
            int r1 = r1 + r10
            int r1 = r1 - r9
            int r0 = r4.length()
            if (r1 == r0) goto L_0x0246
            int r0 = r4.length()
            r4.delete(r1, r0)
            X.4U6 r0 = new X.4U6
            r0.<init>(r4, r10, r9)
        L_0x023b:
            boolean r5 = r0.A02
            if (r5 == 0) goto L_0x01ab
            java.lang.String r0 = "...     "
            r4.append(r0)
            goto L_0x01ab
        L_0x0246:
            X.4U6 r0 = new X.4U6
            r0.<init>(r4, r10, r5)
            goto L_0x023b
        L_0x024c:
            double r15 = X.C29431cG.A0T(r6)
            goto L_0x0255
        L_0x0251:
            r9 = r12
            goto L_0x025f
        L_0x0253:
            r15 = 0
        L_0x0255:
            long r0 = r2.A01
            X.9sU r9 = new X.9sU
            r13 = r9
            r19 = r0
            r13.<init>(r14, r15, r17, r19)
        L_0x025f:
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r4)
            if (r5 == 0) goto L_0x0268
            X.0vk r12 = r3.A0A
        L_0x0268:
            r8 = 0
            if (r9 != 0) goto L_0x0278
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x0278
            X.ByP r10 = X.C24266ByP.FOOTER
        L_0x0271:
            X.CmC r0 = new X.CmC
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            return r0
        L_0x0278:
            X.ByP r10 = X.C24266ByP.AUDIO_METADATA
            goto L_0x0271
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26186CuA.A02(X.CmV):X.CmC");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (X.C18070vi.A18(r1, r4) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C26186CuA r8, X.C22821Di r9) {
        /*
            X.CmV r0 = r8.A01
            java.lang.Object r6 = r9.invoke(r0)
            X.CmV r6 = (X.C25818CmV) r6
            X.CmV r0 = r8.A01
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 != 0) goto L_0x00c7
            r8.A01 = r6
            X.205 r4 = r6.A03
            X.CM2 r3 = r6.A06
            X.22l r7 = r6.A07
            r2 = 0
            if (r7 == 0) goto L_0x00cb
            boolean r0 = r3 instanceof X.C24124Bvq
            if (r0 == 0) goto L_0x00cb
            X.205 r1 = r7.A0v
            boolean r0 = X.C18070vi.A18(r1, r4)
            if (r0 == 0) goto L_0x00cb
        L_0x0027:
            X.205 r0 = r8.A03
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0087
            if (r7 == 0) goto L_0x0033
            X.205 r2 = r7.A0v
        L_0x0033:
            r8.A03 = r2
            X.0vl r4 = r8.A09
            java.lang.Object r2 = r4.getValue()
            X.COP r2 = (X.COP) r2
            java.lang.Runnable r1 = r2.A00
            if (r1 == 0) goto L_0x0049
            android.os.Handler r0 = r2.A01
            r0.removeCallbacks(r1)
            r0 = 0
            r2.A00 = r0
        L_0x0049:
            if (r7 == 0) goto L_0x0087
            X.00H r0 = r8.A05
            r1 = 0
            X.4a3 r0 = X.AnonymousClass3MX.A0y(r0)
            boolean r0 = r0.A0C(r7, r1)
            if (r0 == 0) goto L_0x0087
            X.Bvn r0 = X.C24121Bvn.A00
            boolean r0 = X.C18070vi.A18(r3, r0)
            if (r0 == 0) goto L_0x00c8
            r2 = 0
        L_0x0062:
            java.lang.Object r5 = r4.getValue()
            X.COP r5 = (X.COP) r5
            r0 = 5
            X.4ra r4 = new X.4ra
            r4.<init>(r7, r8, r0)
            java.lang.Runnable r1 = r5.A00
            if (r1 == 0) goto L_0x007a
            android.os.Handler r0 = r5.A01
            r0.removeCallbacks(r1)
            r0 = 0
            r5.A00 = r0
        L_0x007a:
            r0 = 1
            X.4ra r1 = new X.4ra
            r1.<init>(r5, r4, r0)
            r5.A00 = r1
            android.os.Handler r0 = r5.A01
            r0.postDelayed(r1, r2)
        L_0x0087:
            X.CmC r2 = r8.A02(r6)
            X.CmC r0 = r8.A02
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 != 0) goto L_0x00c7
            r8.A02 = r2
            X.CmV r0 = r8.A01
            X.205 r0 = r0.A03
            if (r0 == 0) goto L_0x00c0
            X.1BI r1 = r0.A00
            if (r1 == 0) goto L_0x00c0
            X.C4I r0 = r2.A00
            boolean r0 = r0 instanceof X.C23825Bqd
            if (r0 == 0) goto L_0x00c0
            X.00H r0 = r8.A06
            java.lang.Object r0 = r0.get()
            X.DVP r0 = (X.DVP) r0
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L_0x00c0
            X.00H r0 = r8.A08
            java.lang.Object r1 = r0.get()
            X.10I r1 = (X.AnonymousClass10I) r1
            r0 = 47
            X.C98784ri.A00(r1, r8, r0)
        L_0x00c0:
            X.1Dl r0 = r8.A00
            if (r0 == 0) goto L_0x00c7
            r0.Bo9(r2)
        L_0x00c7:
            return
        L_0x00c8:
            r2 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0062
        L_0x00cb:
            r7 = r2
            r1 = r2
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26186CuA.A03(X.CuA, X.1Di):void");
    }
}
