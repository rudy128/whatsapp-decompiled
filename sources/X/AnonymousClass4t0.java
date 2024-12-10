package X;

/* renamed from: X.4t0  reason: invalid class name */
public class AnonymousClass4t0 implements AnonymousClass1G2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass4t0(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f6, code lost:
        X.C30691eM.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        if (r0 != r7) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0122, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x020a, code lost:
        if (X.C83524Fl.A00(r3.A02, r3.A03, (X.C92584hZ) r6) == false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0224, code lost:
        if (X.C83524Fl.A00(r3.A02, r3.A03, ((X.C92604hb) r6).A00) == false) goto L_0x020c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BJt(java.lang.Object r15, X.C30391dr r16) {
        /*
            r14 = this;
            int r0 = r14.A00
            r3 = r16
            switch(r0) {
                case 0: goto L_0x026e;
                case 1: goto L_0x023d;
                case 2: goto L_0x0125;
                case 3: goto L_0x00ce;
                case 4: goto L_0x0036;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r14.A03
            X.4rF r4 = (X.C98494rF) r4
            java.lang.Object r0 = r4.element
            X.1G4 r0 = (X.AnonymousClass1G4) r0
            if (r0 == 0) goto L_0x0017
            r0.setValue(r15)
        L_0x0014:
            X.1Wu r7 = X.C27621Wu.A00
            return r7
        L_0x0017:
            java.lang.Object r0 = r14.A01
            X.1OX r0 = (X.AnonymousClass1OX) r0
            java.lang.Object r3 = r14.A02
            X.5cY r3 = (X.C108935cY) r3
            X.1G7 r2 = X.C34071js.A00(r15)
            X.0wh r0 = r0.getCoroutineContext()
            X.1OB r1 = X.C30551e8.A02(r0)
            X.1jt r0 = new X.1jt
            r0.<init>(r1, r2)
            r3.BFN(r0)
            r4.element = r2
            goto L_0x0014
        L_0x0036:
            boolean r0 = r3 instanceof X.C100604um
            if (r0 == 0) goto L_0x005d
            r6 = r3
            X.4um r6 = (X.C100604um) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005d
            int r2 = r2 - r1
            r6.label = r2
        L_0x0048:
            java.lang.Object r1 = r6.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r10 = 0
            r5 = 2
            r9 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0063
            if (r0 == r9) goto L_0x00a7
            if (r0 == r5) goto L_0x00f6
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x005d:
            X.4um r6 = new X.4um
            r6.<init>(r14, r3)
            goto L_0x0048
        L_0x0063:
            X.C30691eM.A01(r1)
            java.lang.Object r3 = r14.A02
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.1E7 r15 = (X.AnonymousClass1E7) r15
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1BI r0 = r15.A0J
            X.1EC r8 = X.C42941yz.A00(r0)
            if (r8 == 0) goto L_0x0014
            java.lang.Object r13 = r14.A01
            X.1OX r13 = (X.AnonymousClass1OX) r13
            java.lang.Object r12 = r14.A03
            X.3pJ r12 = (X.C77073pJ) r12
            com.whatsapp.community.SelectCommunityForGroupActivitySettings$getSections$1$list$1$1$subgroupCountDeferred$1 r0 = new com.whatsapp.community.SelectCommunityForGroupActivitySettings$getSections$1$list$1$1$subgroupCountDeferred$1
            r0.<init>(r12, r8, r4)
            X.1OR r11 = X.AnonymousClass1OR.A00
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            X.5WH r2 = X.C30451dy.A01(r1, r11, r0, r13)
            com.whatsapp.community.SelectCommunityForGroupActivitySettings$getSections$1$list$1$1$memberCountDeferred$1 r0 = new com.whatsapp.community.SelectCommunityForGroupActivitySettings$getSections$1$list$1$1$memberCountDeferred$1
            r0.<init>(r12, r8, r4)
            X.5WH r1 = X.C30451dy.A01(r1, r11, r0, r13)
            X.EEF[] r0 = new X.EEF[r5]
            java.util.List r0 = X.C18070vi.A0N(r2, r1, r0, r10, r9)
            r6.L$0 = r3
            r6.L$1 = r8
            r6.label = r9
            java.lang.Object r1 = X.C197009w0.A00(r0, r6)
            if (r1 != r7) goto L_0x00b0
            return r7
        L_0x00a7:
            java.lang.Object r8 = r6.L$1
            java.lang.Object r3 = r6.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r1)
        L_0x00b0:
            java.util.List r1 = (java.util.List) r1
            int r2 = X.AnonymousClass001.A0n(r1, r10)
            int r1 = X.AnonymousClass001.A0n(r1, r9)
            X.4TO r0 = new X.4TO
            r0.<init>(r2, r1)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r8, r0)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.label = r5
            java.lang.Object r0 = r3.BJt(r0, r6)
            goto L_0x0120
        L_0x00ce:
            boolean r0 = r3 instanceof X.C100164u4
            if (r0 == 0) goto L_0x00f0
            r4 = r3
            X.4u4 r4 = (X.C100164u4) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00f0
            int r2 = r2 - r1
            r4.label = r2
        L_0x00e0:
            java.lang.Object r1 = r4.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x00fb
            if (r0 == r3) goto L_0x00f6
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00f0:
            X.4u4 r4 = new X.4u4
            r4.<init>(r14, r3)
            goto L_0x00e0
        L_0x00f6:
            X.C30691eM.A01(r1)
            goto L_0x0014
        L_0x00fb:
            X.C30691eM.A01(r1)
            java.lang.Object r2 = r14.A03
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.5Wj r15 = (X.C106575Wj) r15
            boolean r0 = r15 instanceof X.C108335bX
            if (r0 == 0) goto L_0x0123
            X.5bX r15 = (X.C108335bX) r15
            java.lang.Object r1 = r14.A02
            X.5aj r1 = (X.C107855aj) r1
            java.lang.Object r0 = r14.A01
            X.4DE r0 = (X.AnonymousClass4DE) r0
            boolean r0 = X.C83524Fl.A00(r0, r1, r15)
        L_0x0116:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.label = r3
            java.lang.Object r0 = r2.BJt(r0, r4)
        L_0x0120:
            if (r0 != r7) goto L_0x0014
            return r7
        L_0x0123:
            r0 = 0
            goto L_0x0116
        L_0x0125:
            X.1D6 r15 = (X.AnonymousClass1D6) r15
            java.lang.Object r7 = r15.first
            X.5Wj r7 = (X.C106575Wj) r7
            java.lang.Object r6 = r15.second
            X.5Wj r6 = (X.C106575Wj) r6
            boolean r0 = r7 instanceof X.C108335bX
            if (r0 == 0) goto L_0x0147
            boolean r0 = r6 instanceof X.C92614hc
            if (r0 == 0) goto L_0x0147
            java.lang.Object r1 = r14.A03
            X.4Qt r1 = (X.C86214Qt) r1
            r0 = r7
            X.5bX r0 = (X.C108335bX) r0
            X.4hD r0 = r0.BW8()
            X.4DE r0 = r0.A00
            r1.A00(r0)
        L_0x0147:
            boolean r3 = r6 instanceof X.C92614hc
            if (r3 == 0) goto L_0x016c
            r0 = r6
            X.4hc r0 = (X.C92614hc) r0
            X.5Wg r1 = r0.A00
            boolean r0 = r1 instanceof X.C92524hT
            if (r0 == 0) goto L_0x016c
            java.lang.Object r0 = r14.A03
            X.4Qt r0 = (X.C86214Qt) r0
            X.1G4 r3 = r0.A03
            X.4hT r1 = (X.C92524hT) r1
            X.4ha r2 = r1.A01
            java.lang.Object r0 = r14.A02
            X.20G r0 = (X.AnonymousClass20G) r0
            X.4hm r1 = new X.4hm
            r1.<init>(r2, r0)
        L_0x0167:
            r3.setValue(r1)
            goto L_0x0014
        L_0x016c:
            java.lang.Object r4 = r14.A03
            X.4Qt r4 = (X.C86214Qt) r4
            X.1G1 r0 = r4.A04
            boolean r2 = X.C72463Mc.A1a(r0)
            if (r2 == 0) goto L_0x018f
            if (r3 == 0) goto L_0x018f
            r0 = r6
            X.4hc r0 = (X.C92614hc) r0
            X.5Wg r1 = r0.A00
            boolean r0 = r1 instanceof X.C92514hS
            if (r0 == 0) goto L_0x018f
            X.1G4 r3 = r4.A03
            X.4hS r1 = (X.C92514hS) r1
            java.lang.String r0 = r1.A00
            X.4hf r1 = new X.4hf
            r1.<init>(r0)
            goto L_0x0167
        L_0x018f:
            r9 = 0
            if (r2 == 0) goto L_0x0229
            boolean r8 = r6 instanceof X.C92584hZ
            if (r8 == 0) goto L_0x01d2
            r5 = r6
            X.4hZ r5 = (X.C92584hZ) r5
            X.4hD r0 = r5.A03
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x01d2
            java.lang.Object r0 = r14.A01
            X.4Sc r0 = (X.C86554Sc) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x01a9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4UR r0 = (X.AnonymousClass4UR) r0
            X.5aj r1 = r0.A03
            X.4DE r0 = r0.A02
            boolean r0 = X.C83524Fl.A00(r0, r1, r5)
            if (r0 == 0) goto L_0x01a9
        L_0x01c0:
            X.4UR r2 = (X.AnonymousClass4UR) r2
            if (r2 == 0) goto L_0x01d2
            X.1G4 r1 = r4.A03
            X.4hh r0 = new X.4hh
            r0.<init>(r2)
        L_0x01cb:
            r1.setValue(r0)
            goto L_0x0014
        L_0x01d0:
            r2 = r9
            goto L_0x01c0
        L_0x01d2:
            boolean r0 = r7 instanceof X.C92584hZ
            if (r0 == 0) goto L_0x0229
            java.lang.Object r0 = r14.A01
            X.4Sc r0 = (X.C86554Sc) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r5 = r0.iterator()
        L_0x01e0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0227
            java.lang.Object r3 = r5.next()
            r0 = r3
            X.4UR r0 = (X.AnonymousClass4UR) r0
            r2 = r7
            X.4hZ r2 = (X.C92584hZ) r2
            X.5aj r1 = r0.A03
            X.4DE r0 = r0.A02
            boolean r0 = X.C83524Fl.A00(r0, r1, r2)
            if (r0 == 0) goto L_0x01e0
        L_0x01fa:
            X.4UR r3 = (X.AnonymousClass4UR) r3
            if (r3 == 0) goto L_0x0229
            if (r8 == 0) goto L_0x0214
            X.4hZ r6 = (X.C92584hZ) r6
            X.5aj r1 = r3.A03
            X.4DE r0 = r3.A02
            boolean r0 = X.C83524Fl.A00(r0, r1, r6)
            if (r0 != 0) goto L_0x0229
        L_0x020c:
            X.1G4 r1 = r4.A03
            X.4hg r0 = new X.4hg
            r0.<init>(r3)
            goto L_0x01cb
        L_0x0214:
            boolean r0 = r6 instanceof X.C92604hb
            if (r0 == 0) goto L_0x020c
            X.4hb r6 = (X.C92604hb) r6
            X.4hZ r2 = r6.A00
            X.5aj r1 = r3.A03
            X.4DE r0 = r3.A02
            boolean r0 = X.C83524Fl.A00(r0, r1, r2)
            if (r0 != 0) goto L_0x0229
            goto L_0x020c
        L_0x0227:
            r3 = r9
            goto L_0x01fa
        L_0x0229:
            X.1G4 r3 = r4.A03
        L_0x022b:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            boolean r0 = r2 instanceof X.C108825cM
            if (r0 == 0) goto L_0x0235
            r1 = r9
        L_0x0235:
            boolean r0 = r3.BFK(r2, r1)
            if (r0 == 0) goto L_0x022b
            goto L_0x0014
        L_0x023d:
            float r5 = X.AnonymousClass000.A04(r15)
            java.lang.Object r0 = r14.A01
            X.3WK r0 = (X.AnonymousClass3WK) r0
            r0.A00 = r5
            java.lang.Object r4 = r14.A02
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r3 = r4.getChildCount()
            r2 = 0
        L_0x0250:
            if (r2 >= r3) goto L_0x0014
            android.view.View r1 = r4.getChildAt(r2)
            if (r1 == 0) goto L_0x026b
            java.lang.Object r0 = r14.A03
            com.whatsapp.areffects.tray.ArEffectsTrayFragment r0 = (com.whatsapp.areffects.tray.ArEffectsTrayFragment) r0
            X.0vl r0 = r0.A05
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = X.AnonymousClass3MX.A0Y(r0)
            X.4Y3 r0 = r0.A0U()
            java.lang.Long r0 = r0.A00
            X.C88234Yw.A02(r1, r0, r5)
        L_0x026b:
            int r2 = r2 + 1
            goto L_0x0250
        L_0x026e:
            boolean r1 = X.AnonymousClass000.A1Y(r15)
            java.lang.Object r0 = r14.A01
            X.3R4 r0 = (X.AnonymousClass3R4) r0
            r0.setButtonIsSelected(r1)
            com.whatsapp.wds.components.button.WDSButton r2 = r0.getButton$app_productinfra_areffects_areffects()
            java.lang.Object r0 = r14.A02
            X.4V6 r0 = (X.AnonymousClass4V6) r0
            if (r1 == 0) goto L_0x0297
            X.4Ss r1 = r0.A03
        L_0x0285:
            int r0 = r1.A00
            X.AnonymousClass1Y5.A03(r2, r0)
            java.lang.Integer r0 = r1.A01
            if (r0 == 0) goto L_0x0014
            int r0 = r0.intValue()
            X.AnonymousClass1Y5.A02(r2, r0)
            goto L_0x0014
        L_0x0297:
            X.4Ss r1 = r0.A04
            goto L_0x0285
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4t0.BJt(java.lang.Object, X.1dr):java.lang.Object");
    }
}
