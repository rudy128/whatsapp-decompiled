package X;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.D5k  reason: case insensitive filesystem */
public final class C26596D5k implements E8O {
    public CW4 A00;
    public final int A01;
    public final C26251Cvq A02;
    public final C25738Cl8 A03;
    public final E3V A04;
    public final BGL A05;
    public final CharSequence A06;
    public final C28644ECa A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.text.Spannable} */
    /* JADX WARNING: type inference failed for: r0v30, types: [java.util.AbstractCollection] */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06d6, code lost:
        r0 = X.C25756ClR.A00(r7.A01.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06ec, code lost:
        if (r0 == 1) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        if (r1 == 1) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0193, code lost:
        if (X.AnonymousClass001.A01(r0) != 0.0f) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019f, code lost:
        if (r3 == X.C05100Qk.A04) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e8, code lost:
        if (X.C26054CrP.A03(r6.A04) != false) goto L_0x01ea;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x069a  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x069d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26596D5k(X.C26251Cvq r42, X.E3V r43, X.C28644ECa r44, java.lang.String r45, java.util.List r46, java.util.List r47) {
        /*
            r41 = this;
            r19 = r46
            r2 = r41
            r2.<init>()
            r0 = r45
            r2.A08 = r0
            r6 = r42
            r2.A02 = r6
            r0 = r19
            r2.A0A = r0
            r0 = r47
            r2.A09 = r0
            r0 = r43
            r2.A04 = r0
            r4 = r44
            r2.A07 = r4
            float r0 = r4.BQU()
            r5 = 1
            X.BGL r3 = new X.BGL
            r3.<init>(r0)
            r2.A05 = r3
            X.Clj r0 = r6.A01
            if (r0 == 0) goto L_0x06ff
            X.Csu r0 = r0.A00
            if (r0 == 0) goto L_0x06ff
            int r1 = r0.A00
            r0 = 1
            if (r1 != r5) goto L_0x06ff
        L_0x0038:
            r0 = r0 ^ 1
            r5 = 0
            if (r0 != 0) goto L_0x06f3
            r0 = 0
        L_0x003e:
            r2.A0B = r0
            X.Cqy r9 = r6.A00
            int r10 = r9.A03
            X.CrN r6 = r6.A02
            X.DUE r7 = r6.A0A
            r0 = 4
            boolean r0 = X.AnonymousClass000.A1T(r10, r0)
            r8 = 2
            if (r0 != 0) goto L_0x0057
            r0 = 5
            if (r10 == r0) goto L_0x06f0
            r0 = 1
            if (r10 != r0) goto L_0x06c0
            r8 = 0
        L_0x0057:
            r2.A01 = r8
            X.Dtu r8 = new X.Dtu
            r8.<init>(r2)
            X.Clv r9 = r9.A07
            if (r9 != 0) goto L_0x0064
            X.Clv r9 = X.C25784Clv.A02
        L_0x0064:
            boolean r1 = r9.A01
            int r0 = r3.getFlags()
            if (r1 == 0) goto L_0x06bc
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x006e:
            r3.setFlags(r0)
            int r1 = r9.A00
            r0 = 1
            if (r1 != r0) goto L_0x06b4
            int r0 = r3.getFlags()
            r0 = r0 | 64
            r3.setFlags(r0)
            r3.setHinting(r5)
        L_0x0082:
            boolean r14 = X.AnonymousClass000.A1a(r19)
            long r0 = r6.A01
            long r12 = X.C26130Cst.A00(r0)
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x06a0
            float r9 = r4.CPP(r0)
        L_0x0099:
            r3.setTextSize(r9)
        L_0x009c:
            X.CGf r11 = r6.A06
            if (r11 != 0) goto L_0x00a8
            X.Cma r0 = r6.A07
            if (r0 != 0) goto L_0x00a8
            X.DSF r0 = r6.A09
            if (r0 == 0) goto L_0x00cd
        L_0x00a8:
            X.DSF r10 = r6.A09
            if (r10 != 0) goto L_0x00ae
            X.DSF r10 = X.DSF.A03
        L_0x00ae:
            X.Cma r0 = r6.A07
            if (r0 == 0) goto L_0x069d
            int r0 = r0.A00
        L_0x00b4:
            X.Cma r9 = new X.Cma
            r9.<init>(r0)
            X.Cmb r0 = r6.A08
            if (r0 == 0) goto L_0x069a
            int r1 = r0.A00
        L_0x00bf:
            X.Cmb r0 = new X.Cmb
            r0.<init>(r1)
            java.lang.Object r0 = r8.invoke(r11, r10, r9, r0)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r3.setTypeface(r0)
        L_0x00cd:
            if (r7 == 0) goto L_0x00e4
            X.E3X r9 = X.CE6.A00
            X.DUE r0 = r9.BPq()
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00e4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x067e
            X.C25288Ccq.A01(r7, r3)
        L_0x00e4:
            java.lang.String r1 = r6.A0F
            if (r1 == 0) goto L_0x00f3
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00f3
            r3.setFontFeatureSettings(r1)
        L_0x00f3:
            X.Cr4 r7 = r6.A0E
            if (r7 == 0) goto L_0x0113
            X.Cr4 r0 = X.C26040Cr4.A02
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0113
            float r1 = r3.getTextScaleX()
            float r0 = r7.A00
            float r1 = r1 * r0
            r3.setTextScaleX(r1)
            float r1 = r3.getTextSkewX()
            float r0 = r7.A01
            float r1 = r1 + r0
            r3.setTextSkewX(r1)
        L_0x0113:
            X.EBX r7 = r6.A0D
            long r0 = r7.BOw()
            long r16 = X.C05100Qk.A05
            int r9 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r9 == 0) goto L_0x012e
            X.0tE r9 = r3.A03
            r9.CIO(r0)
            r1 = 0
            X.0WR r9 = (X.AnonymousClass0WR) r9
            r9.A02 = r1
            android.graphics.Paint r0 = r9.A01
            r0.setShader(r1)
        L_0x012e:
            X.0Hv r9 = r7.BNh()
            long r0 = X.AnonymousClass0QG.A01
            float r7 = r7.BMz()
            r3.A00(r9, r7, r0)
            X.0NG r0 = r6.A03
            r3.A01(r0)
            X.Cme r0 = r6.A0C
            r3.A03(r0)
            X.0Cg r0 = r6.A04
            r3.A02(r0)
            long r0 = r6.A02
            long r11 = X.C26130Cst.A00(r0)
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0668
            float r7 = X.AnonymousClass001.A01(r0)
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0668
            float r9 = r3.getTextSize()
            float r7 = r3.getTextScaleX()
            float r9 = r9 * r7
            float r7 = r4.CPP(r0)
            int r4 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0177
            float r7 = r7 / r9
            r3.setLetterSpacing(r7)
        L_0x0177:
            long r3 = r6.A00
            X.Cmc r7 = r6.A0B
            r13 = 1
            if (r14 == 0) goto L_0x0195
            long r11 = X.C26130Cst.A00(r0)
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            int r6 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x0195
            float r9 = X.AnonymousClass001.A01(r0)
            r6 = 0
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            r11 = 1
            if (r6 != 0) goto L_0x0196
        L_0x0195:
            r11 = 0
        L_0x0196:
            int r6 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x01a1
            long r9 = X.C05100Qk.A04
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            r10 = 1
            if (r6 != 0) goto L_0x01a2
        L_0x01a1:
            r10 = 0
        L_0x01a2:
            if (r7 == 0) goto L_0x01ad
            float r9 = r7.A00
            r6 = 0
            int r6 = java.lang.Float.compare(r9, r6)
            if (r6 != 0) goto L_0x01ae
        L_0x01ad:
            r13 = 0
        L_0x01ae:
            r6 = 0
            if (r11 != 0) goto L_0x060d
            if (r10 != 0) goto L_0x060b
            if (r13 != 0) goto L_0x060b
        L_0x01b5:
            java.lang.String r5 = r2.A08
            X.BGL r0 = r2.A05
            float r7 = r0.getTextSize()
            X.Cvq r4 = r2.A02
            java.util.List r0 = r2.A09
            r40 = r0
            X.ECa r0 = r2.A07
            r39 = r0
            X.BGM r0 = X.CE7.A00
            r3 = r5
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto L_0x01f8
            boolean r0 = r40.isEmpty()
            if (r0 == 0) goto L_0x01f8
            X.Cqy r6 = r4.A00
            X.Clq r1 = r6.A06
            X.Clq r0 = X.C25779Clq.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x01f8
            long r0 = r6.A04
            boolean r0 = X.C26054CrP.A03(r0)
            if (r0 == 0) goto L_0x01f8
        L_0x01ea:
            r2.A06 = r3
            X.BGL r4 = r2.A05
            int r1 = r2.A01
            X.Cl8 r0 = new X.Cl8
            r0.<init>(r4, r3, r1)
            r2.A03 = r0
            return
        L_0x01f8:
            boolean r0 = r5 instanceof android.text.Spannable
            if (r0 != 0) goto L_0x0201
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r5)
        L_0x0201:
            android.text.Spannable r3 = (android.text.Spannable) r3
            X.CrN r6 = r4.A02
            X.Cme r1 = r6.A0C
            X.Cme r0 = X.C25827Cme.A03
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x021b
            X.BGM r9 = X.CE7.A00
            int r5 = r5.length()
            r1 = 0
            r0 = 33
            r3.setSpan(r9, r1, r5, r0)
        L_0x021b:
            X.Clj r0 = r4.A01
            if (r0 == 0) goto L_0x0308
            X.Csu r0 = r0.A00
            if (r0 == 0) goto L_0x0308
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0308
            X.Cqy r5 = r4.A00
            long r0 = r5.A04
            r4 = r39
            float r1 = A00(r4, r7, r0)
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x0246
            X.D4S r9 = new X.D4S
            r9.<init>(r1)
            int r4 = r3.length()
            r1 = 0
            r0 = 33
            r3.setSpan(r9, r1, r4, r0)
        L_0x0246:
            X.Clq r11 = r5.A06
            if (r11 == 0) goto L_0x025f
            long r4 = r11.A00
            r10 = 0
            long r12 = X.C26054CrP.A02(r10)
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0291
            long r0 = r11.A01
            long r12 = X.C26054CrP.A02(r10)
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0291
        L_0x025f:
            java.util.ArrayList r7 = X.AnonymousClass000.A14(r19)
            int r4 = r19.size()
            r1 = 0
        L_0x0268:
            if (r1 >= r4) goto L_0x0353
            r0 = r19
            java.lang.Object r5 = r0.get(r1)
            r10 = r5
            X.CrE r10 = (X.C26047CrE) r10
            java.lang.Object r9 = r10.A02
            X.CrN r9 = (X.C26053CrN) r9
            X.CGf r0 = r9.A06
            if (r0 != 0) goto L_0x028b
            X.Cma r0 = r9.A07
            if (r0 != 0) goto L_0x028b
            X.DSF r0 = r9.A09
            if (r0 != 0) goto L_0x028b
            java.lang.Object r0 = r10.A02
            X.CrN r0 = (X.C26053CrN) r0
            X.Cmb r0 = r0.A08
            if (r0 == 0) goto L_0x028e
        L_0x028b:
            r7.add(r5)
        L_0x028e:
            int r1 = r1 + 1
            goto L_0x0268
        L_0x0291:
            boolean r0 = X.C26054CrP.A03(r4)
            if (r0 != 0) goto L_0x025f
            long r0 = r11.A01
            boolean r9 = X.C26054CrP.A03(r0)
            if (r9 != 0) goto L_0x025f
            long r14 = X.C26130Cst.A00(r4)
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            int r9 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            boolean r9 = X.AnonymousClass000.A1P(r9)
            r11 = 0
            if (r9 == 0) goto L_0x02f7
            r9 = r39
            float r5 = r9.CPP(r4)
        L_0x02b7:
            long r14 = X.C26130Cst.A00(r0)
            r12 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x02e8
            r4 = r39
            float r11 = r4.CPP(r0)
        L_0x02ca:
            double r0 = (double) r5
            double r0 = java.lang.Math.ceil(r0)
            float r4 = (float) r0
            int r5 = (int) r4
            double r0 = (double) r11
            double r0 = java.lang.Math.ceil(r0)
            float r4 = (float) r0
            int r0 = (int) r4
            android.text.style.LeadingMarginSpan$Standard r4 = new android.text.style.LeadingMarginSpan$Standard
            r4.<init>(r5, r0)
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r4, r10, r1, r0)
            goto L_0x025f
        L_0x02e8:
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x02ca
            float r11 = X.AnonymousClass001.A01(r0)
            float r11 = r11 * r7
            goto L_0x02ca
        L_0x02f7:
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0306
            float r5 = X.AnonymousClass001.A01(r4)
            float r5 = r5 * r7
            goto L_0x02b7
        L_0x0306:
            r5 = 0
            goto L_0x02b7
        L_0x0308:
            X.Cqy r5 = r4.A00
            long r0 = r5.A04
            r4 = r39
            float r10 = A00(r4, r7, r0)
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 != 0) goto L_0x0246
            int r0 = r3.length()
            if (r0 == 0) goto L_0x034c
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0709
            int r0 = r3.length()
            int r0 = r0 + -1
            char r1 = r3.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L_0x034c
            int r12 = r3.length()
        L_0x0336:
            r13 = 1
            r4 = 0
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.D4T r1 = new X.D4T
            r9 = r1
            r14 = r13
            r9.<init>(r10, r11, r12, r13, r14)
            int r9 = r3.length()
            r0 = 33
            r3.setSpan(r1, r4, r9, r0)
            goto L_0x0246
        L_0x034c:
            int r0 = r3.length()
            int r12 = r0 + 1
            goto L_0x0336
        L_0x0353:
            X.CGf r4 = r6.A06
            if (r4 != 0) goto L_0x055e
            X.Cma r0 = r6.A07
            if (r0 != 0) goto L_0x055e
            X.DSF r0 = r6.A09
            if (r0 != 0) goto L_0x055e
            X.Cmb r0 = r6.A08
            if (r0 != 0) goto L_0x055e
            r9 = 0
        L_0x0364:
            X.Dtn r13 = new X.Dtn
            r13.<init>(r3, r8)
            int r1 = r7.size()
            r6 = 0
            r0 = 1
            if (r1 > r0) goto L_0x04d4
            boolean r0 = X.C17880vN.A1X(r7)
            if (r0 == 0) goto L_0x03a2
            java.lang.Object r0 = r7.get(r6)
            X.CrE r0 = (X.C26047CrE) r0
            java.lang.Object r4 = r0.A02
            X.CrN r4 = (X.C26053CrN) r4
            if (r9 == 0) goto L_0x0387
            X.CrN r4 = r9.A06(r4)
        L_0x0387:
            java.lang.Object r0 = r7.get(r6)
            X.CrE r0 = (X.C26047CrE) r0
            int r0 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r7.get(r6)
            X.CrE r0 = (X.C26047CrE) r0
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.invoke(r4, r1, r0)
        L_0x03a2:
            int r10 = r19.size()
            r9 = 0
            r8 = 0
            r14 = 0
        L_0x03a9:
            if (r8 >= r10) goto L_0x058a
            r0 = r19
            java.lang.Object r7 = r0.get(r8)
            X.CrE r7 = (X.C26047CrE) r7
            int r4 = r7.A01
            int r1 = r7.A00
            if (r4 < 0) goto L_0x04be
            int r0 = r3.length()
            if (r4 >= r0) goto L_0x04be
            if (r1 <= r4) goto L_0x04be
            int r0 = r3.length()
            if (r1 > r0) goto L_0x04be
            int r6 = r7.A01
            int r5 = r7.A00
            java.lang.Object r4 = r7.A02
            X.CrN r4 = (X.C26053CrN) r4
            X.Cmc r0 = r4.A0B
            if (r0 == 0) goto L_0x03df
            float r0 = r0.A00
            X.BGa r1 = new X.BGa
            r1.<init>(r0)
            r0 = 33
            r3.setSpan(r1, r6, r5, r0)
        L_0x03df:
            X.EBX r11 = r4.A0D
            long r0 = r11.BOw()
            X.C25861CnP.A00(r3, r6, r5, r0)
            X.0Hv r12 = r11.BNh()
            float r11 = r11.BMz()
            if (r12 == 0) goto L_0x03fd
            boolean r0 = r12 instanceof X.AnonymousClass09Y
            if (r0 == 0) goto L_0x04c2
            X.09Y r12 = (X.AnonymousClass09Y) r12
            long r0 = r12.A00
            X.C25861CnP.A00(r3, r6, r5, r0)
        L_0x03fd:
            X.Cme r0 = r4.A0C
            if (r0 == 0) goto L_0x0419
            int r1 = r0.A00
            r0 = 1
            r0 = r0 | r1
            boolean r11 = X.AnonymousClass000.A1T(r0, r1)
            r0 = 2
            r0 = r0 | r1
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            X.BGQ r1 = new X.BGQ
            r1.<init>(r11, r0)
            r0 = 33
            r3.setSpan(r1, r6, r5, r0)
        L_0x0419:
            long r0 = r4.A01
            r20 = r3
            r21 = r39
            r22 = r6
            r23 = r5
            r24 = r0
            X.C25861CnP.A02(r20, r21, r22, r23, r24)
            java.lang.String r0 = r4.A0F
            if (r0 == 0) goto L_0x0436
            X.BGb r1 = new X.BGb
            r1.<init>(r0)
            r0 = 33
            r3.setSpan(r1, r6, r5, r0)
        L_0x0436:
            X.Cr4 r12 = r4.A0E
            if (r12 == 0) goto L_0x0450
            float r1 = r12.A00
            android.text.style.ScaleXSpan r0 = new android.text.style.ScaleXSpan
            r0.<init>(r1)
            r11 = 33
            r3.setSpan(r0, r6, r5, r11)
            float r1 = r12.A01
            X.BGe r0 = new X.BGe
            r0.<init>(r1)
            r3.setSpan(r0, r6, r5, r11)
        L_0x0450:
            X.DUE r0 = r4.A0A
            X.C25861CnP.A01(r3, r0, r6, r5)
            long r0 = r4.A00
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0469
            int r0 = X.AnonymousClass0Oy.A00(r0)
            android.text.style.BackgroundColorSpan r1 = new android.text.style.BackgroundColorSpan
            r1.<init>(r0)
            r0 = 33
            r3.setSpan(r1, r6, r5, r0)
        L_0x0469:
            X.0NG r11 = r4.A03
            if (r11 == 0) goto L_0x048f
            long r0 = r11.A01
            int r13 = X.AnonymousClass0Oy.A00(r0)
            long r0 = r11.A02
            float r12 = X.AnonymousClass0QY.A01(r0)
            float r0 = X.AnonymousClass0QY.A02(r0)
            float r11 = r11.A00
            r1 = 0
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0485
            r11 = 1
        L_0x0485:
            X.BGR r1 = new X.BGR
            r1.<init>(r12, r0, r11, r13)
            r0 = 33
            r3.setSpan(r1, r6, r5, r0)
        L_0x048f:
            X.0Cg r0 = r4.A04
            if (r0 == 0) goto L_0x049d
            X.BGT r1 = new X.BGT
            r1.<init>(r0)
            r0 = 33
            r3.setSpan(r1, r6, r5, r0)
        L_0x049d:
            java.lang.Object r0 = r7.A02
            X.CrN r0 = (X.C26053CrN) r0
            long r0 = r0.A02
            long r11 = X.C26130Cst.A00(r0)
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x04bd
            long r6 = X.C26130Cst.A00(r0)
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x04be
        L_0x04bd:
            r14 = 1
        L_0x04be:
            int r8 = r8 + 1
            goto L_0x03a9
        L_0x04c2:
            boolean r0 = r12 instanceof X.C016009d
            if (r0 == 0) goto L_0x03fd
            X.09d r12 = (X.C016009d) r12
            X.BGU r1 = new X.BGU
            r1.<init>(r12, r11)
            r0 = 33
            r3.setSpan(r1, r6, r5, r0)
            goto L_0x03fd
        L_0x04d4:
            int r8 = r7.size()
            int r14 = r8 * 2
            java.lang.Integer[] r12 = new java.lang.Integer[r14]
            r0 = 0
        L_0x04dd:
            if (r0 >= r14) goto L_0x04e5
            X.C17880vN.A1T(r12, r6, r0)
            int r0 = r0 + 1
            goto L_0x04dd
        L_0x04e5:
            int r5 = r7.size()
        L_0x04e9:
            if (r6 >= r5) goto L_0x0500
            java.lang.Object r4 = r7.get(r6)
            X.CrE r4 = (X.C26047CrE) r4
            int r0 = r4.A01
            X.C17880vN.A1T(r12, r0, r6)
            int r1 = r6 + r8
            int r0 = r4.A00
            X.C17880vN.A1T(r12, r0, r1)
            int r6 = r6 + 1
            goto L_0x04e9
        L_0x0500:
            r1 = 0
            r0 = 1
            if (r14 <= r0) goto L_0x0554
            java.util.Arrays.sort(r12)
        L_0x0507:
            r0 = r12[r1]
            int r15 = r0.intValue()
            r11 = 0
        L_0x050e:
            if (r11 >= r14) goto L_0x03a2
            r18 = r12[r11]
            int r10 = r18.intValue()
            if (r10 == r15) goto L_0x0551
            int r8 = r7.size()
            r6 = r9
            r5 = 0
        L_0x051e:
            if (r5 >= r8) goto L_0x0545
            java.lang.Object r4 = r7.get(r5)
            X.CrE r4 = (X.C26047CrE) r4
            int r1 = r4.A01
            int r0 = r4.A00
            if (r1 == r0) goto L_0x053d
            int r1 = r4.A01
            int r0 = r4.A00
            boolean r0 = X.C26069Crj.A02(r15, r10, r1, r0)
            if (r0 == 0) goto L_0x053d
            java.lang.Object r0 = r4.A02
            X.CrN r0 = (X.C26053CrN) r0
            if (r6 != 0) goto L_0x0540
            r6 = r0
        L_0x053d:
            int r5 = r5 + 1
            goto L_0x051e
        L_0x0540:
            X.CrN r6 = r6.A06(r0)
            goto L_0x053d
        L_0x0545:
            if (r6 == 0) goto L_0x0550
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0 = r18
            r13.invoke(r6, r1, r0)
        L_0x0550:
            r15 = r10
        L_0x0551:
            int r11 = r11 + 1
            goto L_0x050e
        L_0x0554:
            if (r14 != 0) goto L_0x0507
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x055e:
            X.DSF r5 = r6.A09
            X.Cma r1 = r6.A07
            X.Cmb r0 = r6.A08
            r30 = 65475(0xffc3, float:9.175E-41)
            r21 = 0
            r31 = 0
            X.CrN r9 = new X.CrN
            r27 = r21
            r28 = r21
            r29 = r21
            r35 = r31
            r37 = r31
            r20 = r9
            r22 = r4
            r23 = r1
            r24 = r0
            r25 = r5
            r26 = r21
            r33 = r31
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r37)
            goto L_0x0364
        L_0x058a:
            if (r14 == 0) goto L_0x05e7
            int r10 = r19.size()
        L_0x0590:
            if (r9 >= r10) goto L_0x05e7
            r0 = r19
            java.lang.Object r0 = r0.get(r9)
            X.CrE r0 = (X.C26047CrE) r0
            int r11 = r0.A01
            int r8 = r0.A00
            java.lang.Object r1 = r0.A02
            X.CrN r1 = (X.C26053CrN) r1
            if (r11 < 0) goto L_0x05d1
            int r0 = r3.length()
            if (r11 >= r0) goto L_0x05d1
            if (r8 <= r11) goto L_0x05d1
            int r0 = r3.length()
            if (r8 > r0) goto L_0x05d1
            long r4 = r1.A02
            long r12 = X.C26130Cst.A00(r4)
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x05d4
            r0 = r39
            float r0 = r0.CPP(r4)
            X.BGd r1 = new X.BGd
            r1.<init>(r0)
        L_0x05cc:
            r0 = 33
            r3.setSpan(r1, r11, r8, r0)
        L_0x05d1:
            int r9 = r9 + 1
            goto L_0x0590
        L_0x05d4:
            r6 = 8589934592(0x200000000, double:4.243991582E-314)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x05d1
            float r0 = X.AnonymousClass001.A01(r4)
            X.BGc r1 = new X.BGc
            r1.<init>(r0)
            goto L_0x05cc
        L_0x05e7:
            int r0 = r40.size()
            r1 = 0
            if (r1 >= r0) goto L_0x01ea
            r0 = r40
            java.lang.Object r0 = r0.get(r1)
            X.CrE r0 = (X.C26047CrE) r0
            r4 = 0
            int r2 = r0.A01
            int r1 = r0.A00
            java.lang.Class<X.BGk> r0 = X.C22624BGk.class
            java.lang.Object[] r0 = r3.getSpans(r2, r1, r0)
            int r1 = r0.length
            r0 = 0
        L_0x0603:
            if (r0 >= r1) goto L_0x0702
            r3.removeSpan(r4)
            int r0 = r0 + 1
            goto L_0x0603
        L_0x060b:
            long r0 = X.C26130Cst.A01
        L_0x060d:
            if (r10 != 0) goto L_0x0611
            r3 = r16
        L_0x0611:
            if (r13 != 0) goto L_0x0614
            r7 = r6
        L_0x0614:
            r21 = 0
            long r34 = X.C26130Cst.A01
            X.EBX r31 = X.C25969Cpb.A00(r16)
            X.CrN r6 = new X.CrN
            r23 = r21
            r24 = r21
            r25 = r21
            r26 = r21
            r27 = r21
            r28 = r21
            r30 = r21
            r32 = r21
            r33 = r21
            r20 = r6
            r22 = r21
            r29 = r7
            r36 = r0
            r38 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38)
            int r0 = r19.size()
            int r4 = r0 + 1
            java.util.ArrayList r19 = X.C17880vN.A0z(r4)
            r3 = 0
        L_0x0648:
            if (r3 >= r4) goto L_0x01b5
            if (r3 != 0) goto L_0x065f
            java.lang.String r0 = r2.A08
            int r0 = r0.length()
            X.CrE r1 = new X.CrE
            r1.<init>(r6, r5, r0)
        L_0x0657:
            r0 = r19
            r0.add(r1)
            int r3 = r3 + 1
            goto L_0x0648
        L_0x065f:
            java.util.List r1 = r2.A0A
            int r0 = r3 + -1
            java.lang.Object r1 = r1.get(r0)
            goto L_0x0657
        L_0x0668:
            long r11 = X.C26130Cst.A00(r0)
            r9 = 8589934592(0x200000000, double:4.243991582E-314)
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0177
            float r4 = X.AnonymousClass001.A01(r0)
            r3.setLetterSpacing(r4)
            goto L_0x0177
        L_0x067e:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0697
            X.DUE r0 = r9.BPq()
            java.util.List r0 = r0.A01
        L_0x068a:
            java.lang.Object r0 = r0.get(r5)
            java.util.Locale r0 = X.C25756ClR.A00(r0)
            r3.setTextLocale(r0)
            goto L_0x00e4
        L_0x0697:
            java.util.List r0 = r7.A01
            goto L_0x068a
        L_0x069a:
            r1 = 1
            goto L_0x00bf
        L_0x069d:
            r0 = 0
            goto L_0x00b4
        L_0x06a0:
            r10 = 8589934592(0x200000000, double:4.243991582E-314)
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x009c
            float r9 = r3.getTextSize()
            float r0 = X.AnonymousClass001.A01(r0)
            float r9 = r9 * r0
            goto L_0x0099
        L_0x06b4:
            r3.getFlags()
            r3.setHinting(r0)
            goto L_0x0082
        L_0x06bc:
            r0 = r0 & -129(0xffffffffffffff7f, float:NaN)
            goto L_0x006e
        L_0x06c0:
            if (r10 != r8) goto L_0x06c5
            r8 = 1
            goto L_0x0057
        L_0x06c5:
            r1 = 1
            r0 = 3
            if (r10 == r0) goto L_0x06d4
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x06d4
            java.lang.String r0 = "Invalid TextDirection."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x06d4:
            if (r7 == 0) goto L_0x06e2
            java.util.List r0 = r7.A01
            java.lang.Object r0 = r0.get(r5)
            java.util.Locale r0 = X.C25756ClR.A00(r0)
            if (r0 != 0) goto L_0x06e6
        L_0x06e2:
            java.util.Locale r0 = java.util.Locale.getDefault()
        L_0x06e6:
            int r0 = android.text.TextUtils.getLayoutDirectionFromLocale(r0)
            if (r0 == 0) goto L_0x0057
            if (r0 == r1) goto L_0x06f0
            goto L_0x0057
        L_0x06f0:
            r8 = 3
            goto L_0x0057
        L_0x06f3:
            X.D5e r0 = X.CE8.A00
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            goto L_0x003e
        L_0x06ff:
            r0 = 0
            goto L_0x0038
        L_0x0702:
            java.lang.String r0 = "getWidth-XSAIIZE"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0709:
            java.lang.String r1 = "Char sequence is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26596D5k.<init>(X.Cvq, X.E3V, X.ECa, java.lang.String, java.util.List, java.util.List):void");
    }

    public boolean BSK() {
        C26131Csu csu;
        CW4 cw4 = this.A00;
        if (cw4 != null && cw4.A00()) {
            return true;
        }
        if (this.A0B) {
            return false;
        }
        C25772Clj clj = this.A02.A01;
        if ((clj == null || (csu = clj.A00) == null || csu.A00 != 1) && AnonymousClass000.A1Y(CE8.A00.getValue())) {
            return true;
        }
        return false;
    }

    public float BUS() {
        return this.A03.A01();
    }

    public float BUy() {
        C25738Cl8 cl8 = this.A03;
        float f = cl8.A00;
        if (Float.isNaN(f)) {
            CharSequence charSequence = cl8.A05;
            TextPaint textPaint = cl8.A04;
            BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
            lineInstance.setText(new DUD(charSequence, charSequence.length()));
            PriorityQueue priorityQueue = new PriorityQueue(10, new DUR(1));
            int i = 0;
            for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
                if (priorityQueue.size() >= 10) {
                    AnonymousClass1D6 r0 = (AnonymousClass1D6) priorityQueue.peek();
                    if (r0 != null && C108955ca.A09(r0) - AnonymousClass3MZ.A04(r0) < next - i) {
                        priorityQueue.poll();
                    }
                    i = next;
                }
                priorityQueue.add(AnonymousClass1D6.A00(Integer.valueOf(i), next));
                i = next;
            }
            Iterator it = priorityQueue.iterator();
            f = 0.0f;
            while (it.hasNext()) {
                AnonymousClass1D6 r02 = (AnonymousClass1D6) it.next();
                f = Math.max(f, Layout.getDesiredWidth(charSequence, AnonymousClass3MZ.A04(r02), C108955ca.A09(r02), textPaint));
            }
            cl8.A00 = f;
        }
        return f;
    }

    public static final float A00(C28644ECa eCa, float f, long j) {
        float A012;
        long A002 = C26130Cst.A00(j);
        if (A002 == 4294967296L) {
            if (((double) eCa.BRu()) <= 1.05d) {
                return eCa.CPP(j);
            }
            A012 = AnonymousClass001.A01(j) / AnonymousClass001.A01(eCa.CPV(f));
        } else if (A002 != 8589934592L) {
            return Float.NaN;
        } else {
            A012 = AnonymousClass001.A01(j);
        }
        return A012 * f;
    }
}
