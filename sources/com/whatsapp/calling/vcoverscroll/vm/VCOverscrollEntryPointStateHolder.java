package com.whatsapp.calling.vcoverscroll.vm;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1EC;
import X.AnonymousClass1G4;
import X.C18070vi;
import X.C18600wl;
import X.C27178DXn;
import X.C34071js;
import X.C76673nl;
import X.C84854Lc;

public final class VCOverscrollEntryPointStateHolder {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public AnonymousClass1EC A07;
    public Integer A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C84854Lc A0H;
    public final C84854Lc A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final C18600wl A0S;
    public final AnonymousClass1G4 A0T = C34071js.A00(C76673nl.A00);
    public final C18600wl A0U;

    public VCOverscrollEntryPointStateHolder(AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, C18600wl r14, C18600wl r15) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0p(r6, r7, r8);
        C18070vi.A0d(r9, 5);
        C18070vi.A0x(r10, r11, r12, r13, r14);
        C18070vi.A0d(r15, 11);
        this.A0J = r5;
        this.A0P = r6;
        this.A0M = r7;
        this.A0N = r8;
        this.A0L = r9;
        this.A0K = r10;
        this.A0O = r11;
        this.A0R = r12;
        this.A0Q = r13;
        this.A0S = r14;
        this.A0U = r15;
        Integer num = AnonymousClass00R.A00;
        C84854Lc r0 = new C84854Lc(new C27178DXn(0));
        this.A0H = r0;
        this.A0I = r0;
        this.A01 = -1.0f;
        this.A08 = num;
        this.A0C = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.4TC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder r12, float r13) {
        /*
            X.1G4 r3 = r12.A0T
            java.lang.Integer r0 = r12.A08
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            if (r0 != r2) goto L_0x0018
            boolean r0 = r12.A0D
            if (r0 != 0) goto L_0x0012
            float r0 = r12.A05
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0018
        L_0x0012:
            X.3nl r2 = X.C76673nl.A00
        L_0x0014:
            r3.setValue(r2)
            return
        L_0x0018:
            float r6 = r12.A04
            float r5 = r13 / r6
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x0024:
            float r5 = r5 + r1
            float r5 = r5 * r6
            r4 = 0
            float r5 = r5 - r4
            float r0 = r6 - r4
            float r13 = r13 - r4
            float r13 = r13 / r5
            float r13 = r13 * r0
            float r0 = r4 + r13
            float r1 = X.C28851b7.A02(r0, r4, r6)
            float r0 = r12.A04
            float r1 = r1 / r0
            r5 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = X.C28851b7.A02(r1, r4, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x012d
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x012d
            java.lang.Integer r0 = r12.A08
            boolean r0 = X.AnonymousClass4G2.A00(r0)
            if (r0 != 0) goto L_0x012d
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x012d
            r1 = 0
            boolean r0 = r12.A0B
            if (r0 == r1) goto L_0x005c
            r12.A0B = r1
            r12.A08 = r2
        L_0x005c:
            int r0 = r12.A06
            int r0 = -r0
            float r6 = (float) r0
            float r5 = r12.A00
            float r2 = r6 + r5
            float r1 = r12.A04
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r6 = r6 - r1
            float r5 = r5 / r0
            float r6 = r6 + r5
            float r6 = r6 - r2
            float r6 = r6 * r4
            float r2 = r2 + r6
            X.4jL r1 = new X.4jL
            r1.<init>(r4, r2)
        L_0x0074:
            X.5Yw r1 = (X.C107225Yw) r1
        L_0x0076:
            java.lang.Integer r0 = r12.A08
            boolean r0 = X.AnonymousClass4G2.A00(r0)
            r9 = 0
            if (r0 != 0) goto L_0x00cc
            r0 = 1060320051(0x3f333333, float:0.7)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cc
            boolean r0 = r12.A0F
            if (r0 != 0) goto L_0x00ab
            r0 = 1
            r12.A0F = r0
            X.00H r0 = r12.A0Q
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.9sP r5 = (X.C194859sP) r5
            java.lang.Integer r8 = X.C17880vN.A0j()
            X.1EC r2 = r12.A07
            if (r2 == 0) goto L_0x00a3
            X.00H r0 = r12.A0O
            java.lang.Integer r9 = X.C72473Md.A0d(r2, r0)
        L_0x00a3:
            r6 = 0
            r11 = 36
            r10 = r6
            r7 = r6
            r5.A01(r6, r7, r8, r9, r10, r11)
        L_0x00ab:
            int r0 = r12.A06
            int r0 = -r0
            float r5 = (float) r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r5 = r5 * r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0129
            boolean r2 = r12.A0B
            r0 = 2131891237(0x7f121425, float:1.9417188E38)
            if (r2 == 0) goto L_0x00c3
            r0 = 2131895090(0x7f122332, float:1.9425003E38)
        L_0x00c3:
            X.6IR r0 = X.C72453Mb.A0q(r0)
            X.4TC r9 = new X.4TC
            r9.<init>(r0, r5)
        L_0x00cc:
            boolean r0 = r1 instanceof X.C93664jL
            if (r0 != 0) goto L_0x011f
            boolean r0 = r1 instanceof X.C93674jM
            if (r0 != 0) goto L_0x011f
            boolean r0 = r1 instanceof X.C93684jN
            if (r0 == 0) goto L_0x0187
            java.lang.Integer r0 = r12.A08
            int r0 = r0.intValue()
            switch(r0) {
                case 3: goto L_0x011d;
                case 4: goto L_0x011d;
                default: goto L_0x00e1;
            }
        L_0x00e1:
            float r6 = r1.Bam()
            int r0 = r12.A06
            float r2 = (float) r0
            float r0 = r12.A02
        L_0x00ea:
            float r2 = r2 - r0
            float r6 = r6 + r2
        L_0x00ec:
            float r5 = r12.A04
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r7 = r5 * r0
            float r7 = r7 * r4
            java.lang.Integer r2 = r12.A08
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r2 != r0) goto L_0x0100
            float r0 = r12.A03
            float r7 = java.lang.Math.max(r7, r0)
        L_0x0100:
            float r6 = r6 - r7
            int r0 = r12.A06
            float r4 = (float) r0
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r2 == r0) goto L_0x010c
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r2 != r0) goto L_0x0114
        L_0x010c:
            float r5 = r12.A02
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r12.A03
            float r2 = r2 * r0
            float r5 = r5 + r2
        L_0x0114:
            float r4 = r4 + r5
            int r0 = (int) r4
            X.3nk r2 = new X.3nk
            r2.<init>(r1, r9, r6, r0)
            goto L_0x0014
        L_0x011d:
            r6 = 0
            goto L_0x00ec
        L_0x011f:
            float r6 = r1.Bam()
            int r0 = r12.A06
            float r2 = (float) r0
            float r0 = r12.A00
            goto L_0x00ea
        L_0x0129:
            r0 = 2131896655(0x7f12294f, float:1.9428177E38)
            goto L_0x00c3
        L_0x012d:
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x0139
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x015d
            java.lang.Integer r0 = r12.A08
            if (r0 != r2) goto L_0x015d
        L_0x0139:
            int r0 = r12.A06
            int r0 = -r0
            float r6 = (float) r0
            float r5 = r12.A00
            float r2 = r6 + r5
            float r1 = r12.A04
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r6 = r6 - r1
            float r5 = r5 / r0
            float r6 = r6 + r5
            float r6 = r6 - r2
            float r6 = r6 * r4
            float r2 = r2 + r6
            boolean r0 = r12.A0G
            X.4jM r1 = new X.4jM
            r1.<init>(r2, r0)
            if (r0 == 0) goto L_0x0076
            r0 = 1
            r12.A0A = r0
            r0 = 0
            r12.A0G = r0
            goto L_0x0076
        L_0x015d:
            java.lang.Integer r6 = r12.A08
            if (r6 != r2) goto L_0x0165
            java.lang.Integer r6 = X.AnonymousClass00R.A01
            r12.A08 = r6
        L_0x0165:
            int r0 = r12.A06
            int r0 = -r0
            float r5 = (float) r0
            float r0 = r12.A03
            float r2 = r5 - r0
            float r0 = r12.A04
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r5 = r5 - r0
            float r0 = r12.A02
            float r5 = r5 + r0
            float r0 = r12.A00
            float r0 = r0 / r1
            float r5 = r5 - r0
            float r5 = r5 - r2
            float r0 = r4 * r5
            float r2 = r2 + r0
            boolean r0 = r12.A0C
            X.4jN r1 = new X.4jN
            r1.<init>(r6, r2, r0)
            goto L_0x0074
        L_0x0187:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder.A00(com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder, float):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (X.C40811vJ.A0U((X.C18030ve) r9.A0J.get()) != false) goto L_0x0051;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder r9, X.AnonymousClass1EC r10, float r11) {
        /*
            float r1 = r9.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x008f
            X.1G4 r3 = r9.A0T
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r0 instanceof X.C76673nl
            if (r0 != 0) goto L_0x008f
            float r1 = r9.A01
            float r1 = r1 - r11
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r9.A04
            float r2 = r2 * r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x001f
            r1 = r2
        L_0x001f:
            java.lang.Object r3 = r3.getValue()
            boolean r2 = r3 instanceof X.C76663nk
            r0 = 0
            if (r2 == 0) goto L_0x002e
            X.3nk r3 = (X.C76663nk) r3
            if (r3 == 0) goto L_0x002e
            X.5Yw r0 = r3.A02
        L_0x002e:
            boolean r0 = r0 instanceof X.C93684jN
            if (r0 == 0) goto L_0x0036
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r9.A08 = r0
        L_0x0036:
            java.lang.Integer r2 = r9.A08
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r6 = 0
            r3 = 3
            if (r2 != r0) goto L_0x00ac
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x0051
            X.00H r0 = r9.A0J
            java.lang.Object r0 = r0.get()
            X.0ve r0 = (X.C18030ve) r0
            boolean r2 = X.C40811vJ.A0U(r0)
            r0 = 1
            if (r2 == 0) goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            r9.A0G = r0
            if (r0 == 0) goto L_0x0090
            X.00H r0 = r9.A0Q
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.9sP r2 = (X.C194859sP) r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            if (r10 == 0) goto L_0x006a
            X.00H r0 = r9.A0O
            java.lang.Integer r6 = X.C72473Md.A0d(r10, r0)
        L_0x006a:
            r3 = 0
            r8 = 39
        L_0x006d:
            r7 = r3
            r4 = r3
            r2.A01(r3, r4, r5, r6, r7, r8)
        L_0x0072:
            r0 = 11
        L_0x0074:
            X.5Af r4 = new X.5Af
            r4.<init>(r9, r0)
            X.0vk r4 = (X.C18090vk) r4
            int r0 = r9.A06
            int r0 = -r0
            float r3 = (float) r0
            float r0 = r9.A00
            float r3 = r3 + r0
            X.5R8 r2 = new X.5R8
            r2.<init>(r9)
            X.3Mr r0 = new X.3Mr
            r0.<init>(r4, r2, r1, r3)
            r0.A00()
        L_0x008f:
            return
        L_0x0090:
            boolean r0 = r9.A0F
            if (r0 == 0) goto L_0x0072
            X.00H r0 = r9.A0Q
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.9sP r2 = (X.C194859sP) r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            if (r10 == 0) goto L_0x00a8
            X.00H r0 = r9.A0O
            java.lang.Integer r6 = X.C72473Md.A0d(r10, r0)
        L_0x00a8:
            r3 = 0
            r8 = 38
            goto L_0x006d
        L_0x00ac:
            X.00H r0 = r9.A0Q
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.9sP r2 = (X.C194859sP) r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            if (r10 == 0) goto L_0x00c0
            X.00H r0 = r9.A0O
            java.lang.Integer r6 = X.C72473Md.A0d(r10, r0)
        L_0x00c0:
            r3 = 0
            r8 = 39
            r7 = r3
            r4 = r3
            r2.A01(r3, r4, r5, r6, r7, r8)
            r0 = 12
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder.A01(com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder, X.1EC, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (X.C30451dy.A00(r5, r0, r6) != r4) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(android.content.Context r14, X.AnonymousClass1EC r15, X.C30391dr r16, boolean r17) {
        /*
            r13 = this;
            r3 = r16
            r7 = r14
            r9 = r15
            r12 = r17
            boolean r0 = r3 instanceof X.C100844vA
            if (r0 == 0) goto L_0x0075
            r5 = r3
            X.4vA r5 = (X.C100844vA) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r5.label = r2
        L_0x0018:
            java.lang.Object r10 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r2 = 1
            r11 = 0
            if (r0 == 0) goto L_0x003f
            if (r0 == r2) goto L_0x002d
            if (r0 != r3) goto L_0x007b
            X.C30691eM.A01(r10)
        L_0x002a:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002d:
            boolean r12 = r5.Z$0
            java.lang.Object r9 = r5.L$2
            X.1EC r9 = (X.AnonymousClass1EC) r9
            java.lang.Object r7 = r5.L$1
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r8 = r5.L$0
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder r8 = (com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder) r8
            X.C30691eM.A01(r10)
            goto L_0x005a
        L_0x003f:
            X.C30691eM.A01(r10)
            X.0wl r1 = r13.A0S
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder$maybeStartVC$contacts$1 r0 = new com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder$maybeStartVC$contacts$1
            r0.<init>(r13, r15, r11)
            r5.L$0 = r13
            r5.L$1 = r14
            r5.L$2 = r15
            r5.Z$0 = r12
            r5.label = r2
            java.lang.Object r10 = X.C30451dy.A00(r5, r1, r0)
            if (r10 == r4) goto L_0x0074
            r8 = r13
        L_0x005a:
            X.C18070vi.A0a(r10)
            java.util.List r10 = (java.util.List) r10
            X.0wl r0 = r8.A0U
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder$maybeStartVC$2 r6 = new com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder$maybeStartVC$2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.L$0 = r11
            r5.L$1 = r11
            r5.L$2 = r11
            r5.label = r3
            java.lang.Object r0 = X.C30451dy.A00(r5, r0, r6)
            if (r0 != r4) goto L_0x002a
        L_0x0074:
            return r4
        L_0x0075:
            X.4vA r5 = new X.4vA
            r5.<init>(r13, r3)
            goto L_0x0018
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder.A02(android.content.Context, X.1EC, X.1dr, boolean):java.lang.Object");
    }
}
