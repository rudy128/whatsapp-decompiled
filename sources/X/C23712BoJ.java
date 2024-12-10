package X;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.BoJ  reason: case insensitive filesystem */
public final class C23712BoJ extends BV6 {
    public final /* synthetic */ DOZ A00;
    public final /* synthetic */ DFL A01;
    public final /* synthetic */ AnonymousClass16S A02;

    public static final TreeMap A02(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass8BX.A00(r5));
        for (Object obj : AnonymousClass1YF.A0S(str, new String[]{","}, 0).toArray(new String[0])) {
            String str2 = (String) obj;
            int A0F = AnonymousClass1YF.A0F(str2, ":", 0, false);
            String A0I = AnonymousClass1YF.A0I(C108955ca.A0q(0, A0F, str2));
            String A0I2 = AnonymousClass1YF.A0I(C108955ca.A0q(A0F + 1, str2.length(), str2));
            linkedHashMap.put(C108955ca.A0q(1, A0I.length() - 1, A0I), C108955ca.A0q(1, A0I2.length() - 1, A0I2));
        }
        return new TreeMap(linkedHashMap);
    }

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        C18070vi.A0d(context, 0);
        DOZ doz = this.A00;
        DFL dfl = this.A01;
        C28182Dss dss = new C28182Dss(doz, dfl);
        C28183Dst dst = new C28183Dst(doz, dfl);
        BIG big = new BIG(context);
        big.A01 = new C24883COb(dss, dst);
        return big;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23712BoJ(DOZ doz, DFL dfl, AnonymousClass16S r3) {
        super(doz, dfl);
        this.A01 = dfl;
        this.A00 = doz;
        this.A02 = r3;
    }

    public static void A03(C25633CjK cjK, Map map) {
        CTT A012 = cjK.A01();
        Object obj = map.get("new_config");
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        A012.A01 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.util.Map} */
    /* JADX WARNING: type inference failed for: r8v3, types: [X.CjK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dd, code lost:
        if (r30 != null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0811, code lost:
        if (r3.intValue() == 1) goto L_0x0813;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x09d6, code lost:
        if (r7 != null) goto L_0x09d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0ba4, code lost:
        if (r12 == false) goto L_0x0ba6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0424  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0M(android.view.View r58, X.DOZ r59, X.DFL r60, java.lang.Object r61) {
        /*
            r57 = this;
            r24 = r58
            r15 = 0
            r1 = r59
            r0 = r60
            r2 = r24
            boolean r3 = X.AnonymousClass8BX.A1U(r2, r1, r0)
            r2 = 43
            java.lang.String r16 = r0.A0D(r2)
            r2 = 49
            java.lang.String r49 = r0.A0D(r2)
            r2 = 48
            boolean r17 = r0.A0I(r2, r15)
            java.lang.String r51 = X.BE7.A0d(r0)
            java.lang.String r50 = X.BE7.A0e(r0)
            java.lang.String r38 = X.BE7.A0g(r0)
            r2 = 51
            java.lang.String r39 = r0.A0D(r2)
            r2 = 58
            java.lang.String r40 = r0.A0D(r2)
            r2 = 62
            java.lang.String r41 = r0.A0D(r2)
            r2 = 61
            boolean r45 = r0.A0I(r2, r15)
            r2 = 63
            boolean r2 = r0.A0I(r2, r3)
            r10 = r2 ^ 1
            X.DmA r19 = new X.DmA
            r2 = r19
            r2.<init>(r1, r0)
            X.Dm8 r2 = new X.Dm8
            r2.<init>(r1, r0)
            X.Dm9 r18 = new X.Dm9
            r3 = r18
            r3.<init>(r1, r0)
            boolean r6 = r1.A03
            r0 = r24
            X.BIG r0 = (X.BIG) r0
            r24 = r0
            r24.hashCode()
            boolean r0 = r24.isAttachedToWindow()
            if (r0 == 0) goto L_0x0ba8
            r0 = r24
            X.BLb r1 = r0.A00
            if (r1 == 0) goto L_0x0ba8
            if (r16 == 0) goto L_0x0ba8
            int r0 = r16.length()
            if (r0 == 0) goto L_0x0ba8
            X.CT3 r0 = r1.A0A
            r56 = r0
            android.content.Context r8 = X.AnonymousClass3MY.A04(r24)
            java.lang.Object r0 = r19.invoke()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0091
            X.1CQ r0 = X.AnonymousClass1D7.A0I()
        L_0x0091:
            X.CVU r3 = new X.CVU
            r3.<init>(r0)
            java.lang.Object r0 = r2.invoke()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x00a2
            X.1CQ r0 = X.AnonymousClass1D7.A0I()
        L_0x00a2:
            java.lang.String r21 = "Required value was null."
            if (r39 == 0) goto L_0x0b9b
            if (r40 == 0) goto L_0x0b96
            X.Clh r9 = new X.Clh
            r9.<init>(r0)
            r0 = r56
            X.CVz r0 = r0.A05
            r55 = r0
            X.Bzc r0 = r55.A00()
            java.lang.String r4 = r0.bloksString
            X.C18070vi.A0d(r4, r15)
            java.util.Map r2 = r9.A00
            r0 = 0
            if (r2 == 0) goto L_0x00df
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L_0x00c8
            r0 = r2
        L_0x00c8:
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x00df
            java.lang.String r2 = "timeout"
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x00df
            int r0 = X.AnonymousClass000.A0M(r0)
            double r4 = (double) r0
            java.lang.Double r30 = java.lang.Double.valueOf(r4)
            if (r30 != 0) goto L_0x00f9
        L_0x00df:
            java.util.Map r2 = r3.A00
            java.lang.String r0 = "timeout"
            java.lang.Object r2 = r2.get(r0)
            boolean r0 = r2 instanceof java.lang.Number
            r30 = 0
            if (r0 == 0) goto L_0x00f9
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x00f9
            double r4 = r2.doubleValue()
            java.lang.Double r30 = java.lang.Double.valueOf(r4)
        L_0x00f9:
            java.lang.String r4 = "root"
            r2 = 1
            r0 = r16
            boolean r43 = X.AnonymousClass1YF.A0Y(r0, r4, r2)
            java.util.Map r0 = r3.A00
            java.lang.String r2 = "isPrewarmingEnabled"
            java.lang.Object r4 = r0.get(r2)
            boolean r2 = r4 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x02a4
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x02a4
            boolean r44 = r4.booleanValue()
        L_0x0116:
            java.lang.String r20 = "aleFeatureLevel"
            r2 = r20
            java.lang.Object r2 = r0.get(r2)
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x02a1
            java.lang.Number r2 = (java.lang.Number) r2
        L_0x0124:
            java.lang.Integer r7 = X.AnonymousClass00R.A00
            r52 = r7
            r4 = 1
            if (r2 == 0) goto L_0x029d
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x029d
        L_0x0131:
            java.lang.String r2 = "isBackgroundRenderingPrewarmEnabled"
            java.lang.Object r4 = r0.get(r2)
            boolean r2 = r4 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x0299
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x0299
            boolean r47 = r4.booleanValue()
        L_0x0143:
            java.lang.String r2 = "atomTypeVersion"
            java.lang.Integer r31 = A00(r2, r0)
            org.json.JSONObject r5 = X.C17880vN.A15()
            java.lang.String r4 = "is_new_user"
            r2 = r17
            r5.put(r4, r2)
            java.lang.String r2 = "is_dark_mode"
            r5.put(r2, r6)
            java.lang.String r6 = "disable_ssao"
            java.lang.String r2 = "disableSsao"
            java.lang.Object r2 = r0.get(r2)
            boolean r4 = r2 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x0296
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0296
            boolean r2 = r2.booleanValue()
        L_0x016d:
            r5.put(r6, r2)
            android.view.WindowManager r2 = X.AnonymousClass11C.A01(r8)
            int r4 = X.C87344Vf.A01(r8, r2)
            java.lang.String r2 = "notch_size"
            r5.put(r2, r4)
            X.CbL r4 = r3.A00()
            X.CbL r2 = r3.A00()
            if (r2 == 0) goto L_0x0293
            java.lang.Integer r2 = r2.A04
            if (r2 == 0) goto L_0x0293
            int r8 = r2.intValue()
        L_0x018f:
            X.CbL r2 = r3.A00()
            if (r2 == 0) goto L_0x0290
            java.lang.Integer r2 = r2.A03
            if (r2 == 0) goto L_0x0290
            int r6 = r2.intValue()
        L_0x019d:
            r2 = r56
            X.11C r2 = r2.A03
            android.app.ActivityManager r2 = r2.A04()
            X.BzP r27 = X.C25353CeC.A01(r2, r4)
            java.lang.String r2 = "highPriRamCacheSize"
            java.lang.Integer r32 = A00(r2, r0)
            java.lang.String r2 = "lowPriRamCacheSize"
            java.lang.Integer r33 = A00(r2, r0)
            java.lang.String r2 = "highPriDiskCacheSize"
            java.lang.Integer r34 = A00(r2, r0)
            java.lang.String r2 = "lowPriDiskCacheSize"
            java.lang.Integer r35 = A00(r2, r0)
            r0 = r52
            boolean r46 = X.AnonymousClass000.A1Z(r7, r0)
            r0 = r56
            X.0ve r3 = r0.A04
            r2 = 12213(0x2fb5, float:1.7114E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r48 = X.C18020vd.A05(r0, r3, r2)
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r10)
            java.lang.Integer r36 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r37 = java.lang.Integer.valueOf(r6)
            r0 = 0
            r2 = 1024(0x400, float:1.435E-42)
            X.BTI r3 = new X.BTI
            r3.<init>(r15, r2)
            X.Cbe r2 = new X.Cbe
            r25 = r2
            r26 = r3
            r28 = r9
            r42 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            X.CcM r3 = r1.A00
            if (r3 != 0) goto L_0x0596
            X.CSx r7 = r1.A09
            boolean r3 = r2.A0I
            X.CaU r4 = new X.CaU
            r5 = r17
            r4.<init>(r5, r3)
            X.0vl r5 = r7.A05
            java.util.Map r6 = X.AnonymousClass3MW.A12(r5)
            X.C5t r5 = r7.A00
            java.lang.Object r5 = r6.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x021b
            java.lang.Object r6 = r5.get(r4)
            X.C5t r6 = (X.C24478C5t) r6
            if (r6 != 0) goto L_0x0234
        L_0x021b:
            X.C5t r5 = r7.A00
            java.lang.String r5 = r5.A00()
            boolean r6 = r4.A00
            boolean r4 = r4.A01
            if (r6 == 0) goto L_0x0288
            if (r4 == 0) goto L_0x0285
            X.BvE r4 = X.C24086BvE.A00
        L_0x022b:
            java.lang.String r4 = r4.A00()
            X.Bv8 r6 = new X.Bv8
            r6.<init>(r5, r4)
        L_0x0234:
            r7.A00 = r6
            X.CLe r4 = r1.A06
            android.content.Context r26 = X.AnonymousClass3MY.A04(r24)
            X.1OX r11 = r1.A0E
            X.10H r4 = r4.A00
            X.10E r4 = r4.A00
            X.10G r4 = r4.A00
            X.00S r5 = r4.A4Z
            java.lang.Object r7 = r5.get()
            X.CLz r7 = (X.C24831CLz) r7
            X.00S r5 = r4.A3v
            java.lang.Object r6 = r5.get()
            X.Cku r6 = (X.C25724Cku) r6
            X.00S r4 = r4.A43
            java.lang.Object r5 = r4.get()
            X.0wl r5 = (X.C18600wl) r5
            X.CT5 r4 = new X.CT5
            r25 = r4
            r27 = r6
            r28 = r2
            r29 = r7
            r30 = r5
            r31 = r11
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r1.A03 = r4
            java.lang.String r5 = "liveEditingPlayerProvider"
            X.CLz r4 = r4.A03
            X.1H7 r4 = r4.A00
            java.lang.Object r4 = r4.A01()
            X.Cql r4 = (X.C26027Cql) r4
            r1.A02 = r4
            X.CT5 r4 = r1.A03
            if (r4 != 0) goto L_0x02a8
            X.C18070vi.A11(r5)
            throw r0
        L_0x0285:
            X.BvC r4 = X.C24084BvC.A00
            goto L_0x022b
        L_0x0288:
            if (r4 == 0) goto L_0x028d
            X.BvG r4 = X.C24088BvG.A00
            goto L_0x022b
        L_0x028d:
            X.BvD r4 = X.C24085BvD.A00
            goto L_0x022b
        L_0x0290:
            r6 = 0
            goto L_0x019d
        L_0x0293:
            r8 = 0
            goto L_0x018f
        L_0x0296:
            r2 = 0
            goto L_0x016d
        L_0x0299:
            r47 = 0
            goto L_0x0143
        L_0x029d:
            java.lang.Integer r7 = X.AnonymousClass00R.A01
            goto L_0x0131
        L_0x02a1:
            r2 = 0
            goto L_0x0124
        L_0x02a4:
            r44 = 0
            goto L_0x0116
        L_0x02a8:
            X.Cku r5 = r4.A01
            X.Cbe r6 = r4.A02
            r5.A02(r6)
            android.content.Context r8 = r4.A00
            X.E4O r7 = r5.A00
            X.CLz r5 = r4.A03
            X.1H7 r5 = r5.A00
            java.lang.Object r6 = r5.A01()
            X.Cql r6 = (X.C26027Cql) r6
            X.1OX r5 = r4.A05
            X.0wl r4 = r4.A04
            X.BRE r12 = new X.BRE
            r25 = r12
            r26 = r8
            r27 = r7
            r28 = r6
            r29 = r4
            r30 = r5
            r25.<init>(r26, r27, r28, r29, r30)
            X.DXs r7 = X.AnonymousClass4HP.A00(r12)
            com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$initSharedPlayerEvents$1 r5 = new com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$initSharedPlayerEvents$1
            r5.<init>(r0)
            r4 = 7
            X.DXs r6 = new X.DXs
            r6.<init>((X.AnonymousClass1OS) r5, (X.C23421Fz) r7, (int) r4)
            com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$initSharedPlayerEvents$2 r4 = new com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$initSharedPlayerEvents$2
            r4.<init>(r0)
            r10 = 5
            X.DXs r5 = new X.DXs
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r4, (int) r10)
            com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$initSharedPlayerEvents$3 r4 = new com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$initSharedPlayerEvents$3
            r4.<init>(r1, r0)
            r9 = 10
            X.DXs r7 = new X.DXs
            r7.<init>((X.AnonymousClass1OS) r4, (X.C23421Fz) r5, (int) r9)
            X.1Pg r6 = X.C25691Pg.DROP_OLDEST
            X.1OR r23 = X.AnonymousClass1OR.A00
            X.5WP r5 = new X.5WP
            r4 = r23
            r5.<init>(r4, r6, r7, r15)
            X.5cA r4 = X.AnonymousClass4ZC.A00
            X.1Pi r4 = X.AnonymousClass4Z7.A00(r11, r5, r4, r10)
            r1.A04 = r4
            r8 = 1
            java.lang.String r4 = "[InitPlayer]"
            java.lang.String r5 = "AleLiveEditingPlayer"
            X.C26294Cx6.A04(r5, r4)
            boolean r4 = r12.A04
            if (r4 == 0) goto L_0x0358
            java.lang.String r3 = "[InitPlayer][Player already initialized]"
            X.C26294Cx6.A05(r5, r3)
        L_0x031c:
            r1.A00 = r12
            java.lang.String r7 = "liveEditingPlayer"
            X.DXs r5 = X.AnonymousClass4HP.A00(r12)
            com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$observeEventsForQPLLogging$1 r4 = new com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$observeEventsForQPLLogging$1
            r4.<init>(r1, r0)
            X.DXs r3 = new X.DXs
            r3.<init>((X.AnonymousClass1OS) r4, (X.C23421Fz) r5, (int) r9)
            X.0wl r12 = r1.A0D
            X.1Fz r3 = X.AnonymousClass4I5.A00(r12, r3)
            X.C88604aC.A03(r11, r3)
            X.CcM r5 = r1.A00
            if (r5 == 0) goto L_0x054e
            X.CT4 r3 = r1.A0B
            X.1Fz r6 = r3.A03
            r3 = 12
            X.DXo r4 = new X.DXo
            r4.<init>(r6, r3)
            X.DfU r3 = new X.DfU
            r3.<init>(r5, r8)
            X.C88604aC.A04(r3, r11, r4)
            X.1Fz r6 = r1.A04
            if (r6 != 0) goto L_0x046b
            java.lang.String r1 = "_sharedPlayerEvents"
            X.C18070vi.A11(r1)
            throw r0
        L_0x0358:
            r12.A04 = r8
            r12.A00 = r2
            X.Cql r7 = r12.A0A
            X.CVe r6 = new X.CVe
            r6.<init>(r12, r2)
            r7.A00 = r6
            X.Bz4 r5 = r7.A02
            if (r5 == 0) goto L_0x0371
            X.BRF r4 = new X.BRF
            r4.<init>(r5)
            r6.A00(r4)
        L_0x0371:
            X.Bz4 r5 = r7.A01
            if (r5 == 0) goto L_0x037d
            X.BRF r4 = new X.BRF
            r4.<init>(r5)
            r6.A00(r4)
        L_0x037d:
            X.BRG r4 = r7.A03
            if (r4 == 0) goto L_0x0384
            r6.A00(r4)
        L_0x0384:
            X.Cql r7 = r12.A06
            java.lang.String r13 = r2.A0D
            if (r13 == 0) goto L_0x0556
            X.1OX r4 = r12.A08
            r25 = r4
            X.ClW r6 = new X.ClW
            r6.<init>(r3)
            r7.A05 = r15
            X.2pJ r4 = r7.A08
            java.lang.Short r3 = java.lang.Short.valueOf(r8)
            r5 = 231944056(0xdd32f78, float:1.3015307E-30)
            X.C61212pJ.A00(r4, r3, r5)
            r5 = 231947811(0xdd33e23, float:1.3018838E-30)
            X.C61212pJ.A00(r4, r3, r5)
            X.COa r5 = r7.A09
            X.0vl r3 = r7.A0B
            java.lang.Object r3 = r3.getValue()
            X.CM1 r3 = (X.CM1) r3
            r5.A00 = r3
            X.CZL r3 = r7.A04
            java.lang.String r22 = "sparkEffectProcessor"
            if (r3 == 0) goto L_0x03d0
            X.DDU r3 = r3.A01
            X.BUd r4 = X.EDD.A00
            X.EDK r3 = r3.BP7(r4)
            X.EDD r3 = (X.EDD) r3
            android.view.View r3 = r3.BXX()
            boolean r3 = r3.isAttachedToWindow()
            if (r3 == 0) goto L_0x0431
            r7.A02()
        L_0x03d0:
            X.CVQ r14 = r7.A06
            X.DOg r3 = r7.A07
            X.CWg r4 = r5.A01
            X.CZL r3 = r14.A00(r6, r3, r4)
            r7.A04 = r3
            r7.A03()
            X.CZL r3 = r7.A04
            if (r3 == 0) goto L_0x0552
            r3.A00()
            X.C26027Cql.A01(r7, r13)
            X.CZL r3 = r7.A04
            if (r3 == 0) goto L_0x0552
            X.DDU r4 = r3.A01
            X.BUd r3 = X.EDD.A00
            X.EDK r3 = r4.BP7(r3)
            X.EDD r3 = (X.EDD) r3
            android.view.View r4 = r3.BXX()
            r3 = r24
            r3.addView(r4)
            X.CZL r5 = r7.A04
            if (r5 == 0) goto L_0x0552
            X.DDU r4 = r5.A01
            r4.CG0()
            X.BUd r3 = X.EDC.A01
            X.EDK r3 = r4.BP7(r3)
            X.EDC r3 = (X.EDC) r3
            X.Cmv r3 = X.DDR.A08(r3)
            X.DDm r4 = r5.A02
            r3.A04(r4, r15)
        L_0x041a:
            java.lang.ref.WeakReference r3 = r12.A01
            java.lang.Object r4 = r3.get()
            X.E4O r4 = (X.E4O) r4
            if (r4 == 0) goto L_0x031c
            r3 = r4
            X.DBR r3 = (X.DBR) r3
            X.EAU r3 = r3.A00
            if (r3 != 0) goto L_0x044a
            java.lang.String r1 = "aleBridge"
            X.C18070vi.A11(r1)
            throw r0
        L_0x0431:
            r7.A03()
            X.CZL r3 = r7.A04
            if (r3 == 0) goto L_0x0552
            X.DDU r3 = r3.A01
            X.EDK r3 = r3.BP7(r4)
            X.EDD r3 = (X.EDD) r3
            android.view.View r4 = r3.BXX()
            r3 = r24
            r3.addView(r4)
            goto L_0x041a
        L_0x044a:
            r3.CDu(r12)
            X.DlX r3 = new X.DlX
            r3.<init>(r4, r12)
            boolean r4 = r2.A0G
            if (r4 == 0) goto L_0x0466
            X.0wh r6 = r12.A07
            com.facebook.commonavatarliveediting.leplayer.ale.AleLiveEditingPlayer$initPlayer$1$1 r5 = new com.facebook.commonavatarliveediting.leplayer.ale.AleLiveEditingPlayer$initPlayer$1$1
            r5.<init>(r0, r3)
            r4 = r52
            r3 = r25
            X.C30451dy.A02(r4, r6, r5, r3)
            goto L_0x031c
        L_0x0466:
            r3.invoke()
            goto L_0x031c
        L_0x046b:
            com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$subscribeToPlayerEventsForBloks$1 r4 = new com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$subscribeToPlayerEventsForBloks$1
            r4.<init>(r1, r0)
            r3 = 7
            X.DXs r5 = new X.DXs
            r5.<init>((X.AnonymousClass1OS) r4, (X.C23421Fz) r6, (int) r3)
            r4 = 3
            X.DfU r3 = new X.DfU
            r3.<init>(r1, r4)
            X.C88604aC.A04(r3, r11, r5)
            X.1Fz r6 = r1.A04
            if (r6 != 0) goto L_0x0489
            java.lang.String r1 = "_sharedPlayerEvents"
            X.C18070vi.A11(r1)
            throw r0
        L_0x0489:
            com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$subscribeToPlayerEventsForVisibility$1 r4 = new com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$subscribeToPlayerEventsForVisibility$1
            r4.<init>(r1, r0)
            r3 = 7
            X.DXs r5 = new X.DXs
            r5.<init>((X.AnonymousClass1OS) r4, (X.C23421Fz) r6, (int) r3)
            r3 = 13
            X.DXo r4 = new X.DXo
            r4.<init>(r5, r3)
            r3 = 15
            X.DXo r5 = new X.DXo
            r5.<init>(r4, r3)
            com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$subscribeToPlayerEventsForVisibility$3 r4 = new com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$subscribeToPlayerEventsForVisibility$3
            r4.<init>(r1, r0)
            X.DXs r3 = new X.DXs
            r3.<init>((java.lang.Object) r5, (java.lang.Object) r4, (int) r10)
            X.C88604aC.A03(r11, r3)
            java.lang.Boolean r3 = r2.A04
            boolean r3 = X.C18070vi.A19(r3, r8)
            if (r3 != 0) goto L_0x04ca
            X.1Fz r5 = r1.A04
            if (r5 != 0) goto L_0x04c1
            java.lang.String r1 = "_sharedPlayerEvents"
            X.C18070vi.A11(r1)
            throw r0
        L_0x04c1:
            r4 = 4
            X.DfU r3 = new X.DfU
            r3.<init>(r1, r4)
            X.C88604aC.A04(r3, r11, r5)
        L_0x04ca:
            X.CcM r6 = r1.A00
            if (r6 == 0) goto L_0x054e
            X.CMK r4 = X.CMK.A01
            if (r4 != 0) goto L_0x04d9
            X.CMK r4 = new X.CMK
            r4.<init>()
            X.CMK.A01 = r4
        L_0x04d9:
            com.whatsapp.productinfra.avatar.liveediting.viewmodel.ParametricSliderExtKt$sliderChanges$1 r3 = new com.whatsapp.productinfra.avatar.liveediting.viewmodel.ParametricSliderExtKt$sliderChanges$1
            r3.<init>(r4, r0)
            X.5WL r3 = X.AnonymousClass4I4.A00(r3)
            X.1Fz r5 = X.C26092CsA.A02(r3)
            r4 = 2
            X.DfU r3 = new X.DfU
            r3.<init>(r6, r4)
            X.C88604aC.A04(r3, r11, r5)
            X.CMK r4 = X.CMK.A01
            if (r4 != 0) goto L_0x04fa
            X.CMK r4 = new X.CMK
            r4.<init>()
            X.CMK.A01 = r4
        L_0x04fa:
            com.whatsapp.productinfra.avatar.liveediting.viewmodel.ParametricSliderExtKt$bodyParametricChanges$1 r3 = new com.whatsapp.productinfra.avatar.liveediting.viewmodel.ParametricSliderExtKt$bodyParametricChanges$1
            r3.<init>(r4, r0)
            X.5WL r3 = X.AnonymousClass4I4.A00(r3)
            X.1Fz r4 = X.C26092CsA.A02(r3)
            com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$subscribeToParametricChanges$2 r3 = new com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$subscribeToParametricChanges$2
            r3.<init>(r6, r0)
            X.C88604aC.A04(r3, r11, r4)
            X.CcM r5 = r1.A00
            if (r5 == 0) goto L_0x054e
            X.CLg r3 = r1.A07
            X.10H r3 = r3.A00
            X.10E r3 = r3.A00
            X.10G r3 = r3.A00
            X.10f r4 = X.AnonymousClass10G.A0Z(r3)
            X.00S r3 = r3.A3x
            java.lang.Object r3 = r3.get()
            X.1G3 r3 = (X.AnonymousClass1G3) r3
            X.CRr r8 = new X.CRr
            r8.<init>(r5, r2, r4, r3)
            java.util.Set r3 = r8.A02
            java.util.ArrayList r7 = X.C29351c6.A0E(r3)
            java.util.Iterator r6 = r3.iterator()
        L_0x0536:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x055b
            java.lang.Object r5 = r6.next()
            X.E6k r5 = (X.C28536E6k) r5
            X.CcM r4 = r8.A00
            X.Cbe r3 = r8.A01
            X.1Fz r3 = r5.CPq(r4, r3)
            r7.add(r3)
            goto L_0x0536
        L_0x054e:
            X.C18070vi.A11(r7)
            throw r0
        L_0x0552:
            X.C18070vi.A11(r22)
            throw r0
        L_0x0556:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r21)
            throw r0
        L_0x055b:
            X.4Z6 r3 = X.AnonymousClass4Z6.$redex_init_class
            r6 = -2
            X.1Pg r5 = X.C25691Pg.SUSPEND
            X.5WN r4 = new X.5WN
            r3 = r23
            r4.<init>(r7, r3, r5, r6)
            com.whatsapp.productinfra.avatar.liveediting.fallback.FallbackLogicHandler$triggers$2 r5 = new com.whatsapp.productinfra.avatar.liveediting.fallback.FallbackLogicHandler$triggers$2
            r5.<init>(r0)
            X.DXs r3 = new X.DXs
            r3.<init>((X.AnonymousClass1OS) r5, (X.C23421Fz) r4, (int) r9)
            com.whatsapp.productinfra.avatar.liveediting.fallback.FallbackLogicHandler$triggers$3 r4 = new com.whatsapp.productinfra.avatar.liveediting.fallback.FallbackLogicHandler$triggers$3
            r4.<init>(r8, r0)
            X.DXs r5 = new X.DXs
            r5.<init>((X.AnonymousClass1OS) r4, (X.C23421Fz) r3, (int) r9)
            com.whatsapp.productinfra.avatar.liveediting.fallback.FallbackLogicHandler$triggers$4 r3 = new com.whatsapp.productinfra.avatar.liveediting.fallback.FallbackLogicHandler$triggers$4
            r3.<init>(r0)
            X.DXs r4 = new X.DXs
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r3, (int) r10)
            com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$observe2DFallbackTriggers$1 r5 = new com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$observe2DFallbackTriggers$1
            r5.<init>(r1, r0)
            X.DXs r3 = new X.DXs
            r3.<init>((X.AnonymousClass1OS) r5, (X.C23421Fz) r4, (int) r9)
            X.1Fz r3 = X.AnonymousClass4I5.A00(r12, r3)
            X.C88604aC.A03(r11, r3)
        L_0x0596:
            java.util.UUID r3 = X.C8y.A00()
            java.lang.String r53 = X.C18070vi.A0H(r3)
            int r54 = r53.hashCode()
            java.lang.Object r9 = r18.invoke()
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x05ae
            X.1CQ r9 = X.AnonymousClass1D7.A0I()
        L_0x05ae:
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x07e4
            r47 = 0
        L_0x05b6:
            java.lang.Boolean r48 = java.lang.Boolean.valueOf(r17)
            X.CbP r6 = new X.CbP
            r46 = r6
            r52 = r16
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54)
            java.lang.String r9 = r6.A04
            java.lang.String r3 = r6.A05
            java.lang.String r5 = X.AnonymousClass1YF.A0I(r3)
            if (r5 == 0) goto L_0x0b91
            X.CTT r4 = r6.A00
            X.Cbr r3 = new X.Cbr
            r3.<init>(r4, r9, r5)
            X.CV6 r10 = r1.A01
            boolean r4 = r2.A0I
            r43 = r4
            X.2wC r8 = r1.A08
            java.lang.String r5 = r3.A02
            int r4 = r5.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            X.CZg r7 = new X.CZg
            r7.<init>(r4)
            X.CV6 r4 = new X.CV6
            r4.<init>(r7, r8)
            java.lang.Object r8 = r19.invoke()
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L_0x05fc
            X.1CQ r8 = X.AnonymousClass1D7.A0I()
        L_0x05fc:
            X.CVU r7 = new X.CVU
            r7.<init>(r8)
            r8 = 1
            java.lang.String r11 = r2.A0D
            r33 = r11
            java.lang.String r11 = r6.A02
            r34 = r11
            java.lang.String r11 = r6.A03
            r35 = r11
            java.lang.String r11 = r6.A06
            r36 = r11
            java.lang.Boolean r6 = r6.A01
            r23 = r6
            java.lang.String r6 = r2.A0E
            r20 = r6
            X.BTI r11 = r2.A00
            r30 = 0
            if (r11 == 0) goto L_0x07e0
            int r6 = r11.A00
            java.lang.Integer r29 = java.lang.Integer.valueOf(r6)
            int r6 = r11.A01
            java.lang.Integer r30 = java.lang.Integer.valueOf(r6)
        L_0x062c:
            java.lang.String r6 = r2.A0F
            r19 = r6
            X.Bzc r6 = r55.A00()
            java.lang.String r6 = r6.bloksString
            r18 = r6
            r6 = r56
            com.whatsapp.areffects.arclass.ArClassManager r6 = r6.A00
            int r6 = r6.A00()
            long r11 = (long) r6
            java.lang.String r6 = r2.A0C
            r17 = r6
            boolean r2 = r2.A0J
            r16 = r2
            r2 = r56
            com.whatsapp.avatar.prefetch.AvatarPrefetchController r6 = r2.A02
            boolean r2 = r6.A03
            boolean r14 = r6.A02
            boolean r15 = r6.A01
            java.util.Map r6 = r7.A00
            java.lang.String r7 = "referrerSurface"
            java.lang.Object r6 = r6.get(r7)
            boolean r13 = r6 instanceof java.lang.String
            if (r13 == 0) goto L_0x07dd
            java.lang.String r6 = (java.lang.String) r6
        L_0x0661:
            r13 = r56
            X.CSx r13 = r13.A01
            X.C5t r13 = r13.A00
            java.lang.String r42 = r13.A00()
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r8)
            java.lang.Long r31 = java.lang.Long.valueOf(r11)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r14)
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r15)
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r16)
            X.Cbb r2 = new X.Cbb
            r22 = r2
            r32 = r9
            r37 = r20
            r38 = r19
            r39 = r18
            r40 = r17
            r41 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            int r6 = r4.A00
            com.facebook.quicklog.QuickPerformanceLogger r13 = X.CEY.A00
            if (r13 == 0) goto L_0x0b8b
            java.lang.String r12 = r2.A0G
            r9 = 231933222(0xdd30526, float:1.3005118E-30)
            java.lang.String r14 = "quickPerformanceLogger"
            java.lang.String r11 = "requestId"
            r13.markerAnnotate((int) r9, (int) r6, (java.lang.String) r11, (java.lang.String) r12)
            java.lang.String r13 = r2.A0C
            if (r13 == 0) goto L_0x06b5
            com.facebook.quicklog.QuickPerformanceLogger r12 = X.CEY.A00
            if (r12 == 0) goto L_0x0b87
            java.lang.String r11 = "effectId"
            r12.markerAnnotate((int) r9, (int) r6, (java.lang.String) r11, (java.lang.String) r13)
        L_0x06b5:
            java.lang.String r13 = r2.A09
            if (r13 == 0) goto L_0x06c2
            com.facebook.quicklog.QuickPerformanceLogger r12 = X.CEY.A00
            if (r12 == 0) goto L_0x0b87
            java.lang.String r11 = "category"
            r12.markerAnnotate((int) r9, (int) r6, (java.lang.String) r11, (java.lang.String) r13)
        L_0x06c2:
            java.lang.String r13 = r2.A0I
            if (r13 == 0) goto L_0x06cf
            com.facebook.quicklog.QuickPerformanceLogger r12 = X.CEY.A00
            if (r12 == 0) goto L_0x0b87
            java.lang.String r11 = "tab"
            r12.markerAnnotate((int) r9, (int) r6, (java.lang.String) r11, (java.lang.String) r13)
        L_0x06cf:
            java.lang.Boolean r11 = r2.A01
            if (r11 == 0) goto L_0x06e0
            com.facebook.quicklog.QuickPerformanceLogger r13 = X.CEY.A00
            if (r13 == 0) goto L_0x0b87
            boolean r12 = r11.booleanValue()
            java.lang.String r11 = "isNux"
            r13.markerAnnotate((int) r9, (int) r6, (java.lang.String) r11, (int) r12)
        L_0x06e0:
            com.facebook.quicklog.QuickPerformanceLogger r12 = X.CEY.A00
            if (r12 == 0) goto L_0x0b87
            java.lang.String r11 = "isAtomizationEnabled"
            r12.markerAnnotate((int) r9, (int) r6, (java.lang.String) r11, (int) r8)
            java.lang.String r12 = r2.A0E
            com.facebook.quicklog.QuickPerformanceLogger r11 = X.CEY.A00
            if (r11 == 0) goto L_0x0b87
            java.lang.String r8 = "profileName"
            r11.markerAnnotate((int) r9, (int) r6, (java.lang.String) r8, (java.lang.String) r12)
            java.lang.Integer r8 = r2.A06
            if (r8 == 0) goto L_0x0705
            com.facebook.quicklog.QuickPerformanceLogger r12 = X.CEY.A00
            if (r12 == 0) goto L_0x0b87
            int r11 = r8.intValue()
            java.lang.String r8 = "cdlLod"
            r12.markerAnnotate((int) r9, (int) r6, (java.lang.String) r8, (int) r11)
        L_0x0705:
            java.lang.Integer r8 = r2.A07
            if (r8 == 0) goto L_0x0716
            com.facebook.quicklog.QuickPerformanceLogger r12 = X.CEY.A00
            if (r12 == 0) goto L_0x0b87
            int r11 = r8.intValue()
            java.lang.String r8 = "cdlTexture"
            r12.markerAnnotate((int) r9, (int) r6, (java.lang.String) r8, (int) r11)
        L_0x0716:
            java.lang.String r12 = r2.A0H
            com.facebook.quicklog.QuickPerformanceLogger r11 = X.CEY.A00
            if (r11 == 0) goto L_0x0b87
            java.lang.String r8 = "revisionId"
            r11.markerAnnotate((int) r9, (int) r6, (java.lang.String) r8, (java.lang.String) r12)
            java.lang.String r12 = r2.A0D
            if (r12 == 0) goto L_0x072e
            com.facebook.quicklog.QuickPerformanceLogger r11 = X.CEY.A00
            if (r11 == 0) goto L_0x0b87
            java.lang.String r8 = "networkType"
            r11.markerAnnotate((int) r9, (int) r6, (java.lang.String) r8, (java.lang.String) r12)
        L_0x072e:
            java.lang.Long r8 = r2.A08
            if (r8 == 0) goto L_0x0743
            long r19 = r8.longValue()
            com.facebook.quicklog.QuickPerformanceLogger r15 = X.CEY.A00
            if (r15 == 0) goto L_0x0b87
            java.lang.String r18 = "arClass"
            r16 = r9
            r17 = r6
            r15.markerAnnotate((int) r16, (int) r17, (java.lang.String) r18, (long) r19)
        L_0x0743:
            java.lang.String r12 = r2.A0B
            if (r12 == 0) goto L_0x0750
            com.facebook.quicklog.QuickPerformanceLogger r11 = X.CEY.A00
            if (r11 == 0) goto L_0x0b87
            java.lang.String r8 = "deliverySpecId"
            r11.markerAnnotate((int) r9, (int) r6, (java.lang.String) r8, (java.lang.String) r12)
        L_0x0750:
            java.lang.Boolean r8 = r2.A03
            if (r8 == 0) goto L_0x0761
            boolean r12 = r8.booleanValue()
            com.facebook.quicklog.QuickPerformanceLogger r11 = X.CEY.A00
            if (r11 == 0) goto L_0x0b87
            java.lang.String r8 = "isPrefetchAvatar"
            r11.markerAnnotate((int) r9, (int) r6, (java.lang.String) r8, (int) r12)
        L_0x0761:
            java.lang.Boolean r8 = r2.A02
            if (r8 == 0) goto L_0x0772
            boolean r12 = r8.booleanValue()
            com.facebook.quicklog.QuickPerformanceLogger r11 = X.CEY.A00
            if (r11 == 0) goto L_0x0b87
            java.lang.String r8 = "isPrefetchAssets"
            r11.markerAnnotate((int) r9, (int) r6, (java.lang.String) r8, (int) r12)
        L_0x0772:
            java.lang.Boolean r8 = r2.A04
            if (r8 == 0) goto L_0x0783
            boolean r12 = r8.booleanValue()
            com.facebook.quicklog.QuickPerformanceLogger r11 = X.CEY.A00
            if (r11 == 0) goto L_0x0b87
            java.lang.String r8 = "isPrewarmArEffect"
            r11.markerAnnotate((int) r9, (int) r6, (java.lang.String) r8, (int) r12)
        L_0x0783:
            java.lang.Boolean r8 = r2.A05
            if (r8 == 0) goto L_0x0794
            boolean r12 = r8.booleanValue()
            com.facebook.quicklog.QuickPerformanceLogger r11 = X.CEY.A00
            if (r11 == 0) goto L_0x0b87
            java.lang.String r8 = "useAle"
            r11.markerAnnotate((int) r9, (int) r6, (java.lang.String) r8, (int) r12)
        L_0x0794:
            java.lang.String r11 = r2.A0F
            if (r11 == 0) goto L_0x079f
            com.facebook.quicklog.QuickPerformanceLogger r8 = X.CEY.A00
            if (r8 == 0) goto L_0x0b87
            r8.markerAnnotate((int) r9, (int) r6, (java.lang.String) r7, (java.lang.String) r11)
        L_0x079f:
            java.lang.String r8 = r2.A0J
            if (r8 == 0) goto L_0x07ac
            com.facebook.quicklog.QuickPerformanceLogger r7 = X.CEY.A00
            if (r7 == 0) goto L_0x0b87
            java.lang.String r2 = "userFlowState"
            r7.markerAnnotate((int) r9, (int) r6, (java.lang.String) r2, (java.lang.String) r8)
        L_0x07ac:
            java.lang.String r7 = "isStyle2"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r43)
            r4.A00(r7, r2)
            r1.A01 = r4
            boolean r2 = r1.A05
            if (r2 == 0) goto L_0x07d3
            java.lang.Integer r7 = X.C17880vN.A0h()
            java.lang.String r2 = "isColdStart"
            r4.A00(r2, r7)
            java.lang.String r2 = "EFFECT_RENDER"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r2)
            java.lang.String r2 = "_START"
            java.lang.String r2 = X.AnonymousClass000.A0y(r2, r4)
            X.CEY.A00(r6, r2)
        L_0x07d3:
            X.CcM r6 = r1.A00
            if (r6 != 0) goto L_0x09ca
            java.lang.String r1 = "liveEditingPlayer"
            X.C18070vi.A11(r1)
            throw r0
        L_0x07dd:
            r6 = 0
            goto L_0x0661
        L_0x07e0:
            r29 = r0
            goto L_0x062c
        L_0x07e4:
            X.CjK r8 = new X.CjK
            r8.<init>()
            java.lang.Object r4 = r19.invoke()
            java.util.Map r4 = (java.util.Map) r4
            if (r4 != 0) goto L_0x07f5
            X.1CQ r4 = X.AnonymousClass1D7.A0I()
        L_0x07f5:
            X.CVU r3 = new X.CVU
            r3.<init>(r4)
            java.util.Map r3 = r3.A00
            r4 = r20
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x0970
            java.lang.Number r3 = (java.lang.Number) r3
            r22 = r52
            r4 = 1
            if (r3 == 0) goto L_0x0970
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x0970
        L_0x0813:
            X.CTT r3 = new X.CTT
            r3.<init>()
            r8.A00 = r3
            X.CTT r4 = r8.A01()
            java.lang.String r7 = "new_config"
            java.lang.Object r3 = r9.get(r7)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            X.C18070vi.A0d(r3, r15)
            r4.A02 = r3
            java.lang.String r3 = "config_update_type"
            boolean r4 = r9.containsKey(r3)
            if (r4 == 0) goto L_0x0974
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r3 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }"
            X.C18070vi.A0z(r4, r3)
            java.util.AbstractCollection r4 = (java.util.AbstractCollection) r4
            boolean r3 = X.C17880vN.A1X(r4)
            if (r3 == 0) goto L_0x0974
            java.util.Iterator r20 = r4.iterator()
        L_0x084d:
            boolean r3 = r20.hasNext()
            if (r3 == 0) goto L_0x0974
            java.lang.Object r5 = r20.next()
            java.lang.String r3 = "GLTF"
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = X.AnonymousClass8BS.A0p(r4, r3)
            boolean r3 = X.C18070vi.A18(r5, r3)
            if (r3 == 0) goto L_0x0876
            r3 = 1
            X.C25633CjK.A00(r8, r3)
            r8.A01()
            java.lang.Object r3 = r9.get(r7)
            X.C18070vi.A0z(r3, r6)
            X.C18070vi.A0d(r3, r15)
        L_0x0876:
            java.lang.String r3 = "RAMPS"
            java.lang.String r3 = X.AnonymousClass8BS.A0p(r4, r3)
            boolean r3 = X.C18070vi.A18(r5, r3)
            if (r3 == 0) goto L_0x0885
            A03(r8, r9)
        L_0x0885:
            java.lang.String r3 = "VALUES"
            java.lang.String r3 = X.AnonymousClass8BS.A0p(r4, r3)
            boolean r3 = X.C18070vi.A18(r5, r3)
            if (r3 == 0) goto L_0x08cf
            r3 = 4
            X.C25633CjK.A00(r8, r3)
            java.lang.String r3 = "platform_events_data"
            java.lang.Object r10 = r9.get(r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Double>"
            X.C18070vi.A0z(r10, r3)
            java.util.Map r10 = (java.util.Map) r10
            X.CTT r13 = r8.A01()
            java.util.LinkedHashMap r3 = X.C108995ce.A0b(r10)
            java.util.Iterator r18 = X.AnonymousClass000.A15(r10)
        L_0x08ae:
            boolean r10 = r18.hasNext()
            if (r10 == 0) goto L_0x08cd
            java.util.Map$Entry r10 = X.AnonymousClass000.A16(r18)
            java.lang.Object r12 = r10.getKey()
            java.lang.Object r10 = r10.getValue()
            double r10 = X.AnonymousClass8BR.A00(r10)
            float r14 = (float) r10
            java.lang.Float r10 = java.lang.Float.valueOf(r14)
            r3.put(r12, r10)
            goto L_0x08ae
        L_0x08cd:
            r13.A06 = r3
        L_0x08cf:
            java.lang.String r3 = "WEIGHTS"
            java.lang.String r3 = X.AnonymousClass8BS.A0p(r4, r3)
            boolean r3 = X.C18070vi.A18(r5, r3)
            if (r3 == 0) goto L_0x091e
            java.lang.String r3 = "updated_weights"
            java.lang.Object r3 = r9.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x091e
            boolean r10 = r3.isEmpty()
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x091e
            java.util.LinkedHashMap r10 = X.C108995ce.A0b(r3)
            java.util.Iterator r12 = X.AnonymousClass000.A15(r3)
        L_0x08f5:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0913
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r12)
            java.lang.Object r11 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            float r3 = X.AnonymousClass000.A04(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r10.put(r11, r3)
            goto L_0x08f5
        L_0x0913:
            r3 = 16
            X.C25633CjK.A00(r8, r3)
            X.CTT r3 = r8.A01()
            r3.A07 = r10
        L_0x091e:
            java.lang.String r3 = "SHAPE_PRESET"
            java.lang.String r3 = X.AnonymousClass8BS.A0p(r4, r3)
            boolean r3 = X.C18070vi.A18(r5, r3)
            if (r3 == 0) goto L_0x0946
            java.lang.String r3 = "updated_shape_presets"
            java.lang.Object r10 = r9.get(r3)
            boolean r3 = r10 instanceof java.util.ArrayList
            if (r3 == 0) goto L_0x0946
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 == 0) goto L_0x0946
            r3 = 32
            X.C25633CjK.A00(r8, r3)
            X.CTT r3 = r8.A01()
            r3.A04 = r10
            A03(r8, r9)
        L_0x0946:
            java.lang.String r3 = "SKELETON"
            java.lang.String r3 = X.AnonymousClass8BS.A0p(r4, r3)
            boolean r3 = X.C18070vi.A18(r5, r3)
            if (r3 == 0) goto L_0x084d
            java.lang.String r3 = "updated_skeletal_presets"
            java.lang.Object r4 = r9.get(r3)
            boolean r3 = r4 instanceof java.util.ArrayList
            if (r3 == 0) goto L_0x084d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x084d
            r3 = 64
            X.C25633CjK.A00(r8, r3)
            X.CTT r3 = r8.A01()
            r3.A03 = r4
            A03(r8, r9)
            goto L_0x084d
        L_0x0970:
            java.lang.Integer r22 = X.AnonymousClass00R.A01
            goto L_0x0813
        L_0x0974:
            java.lang.String r4 = "updated_ramps"
            boolean r3 = r9.containsKey(r4)
            if (r3 == 0) goto L_0x09c4
            java.lang.Object r4 = r9.get(r4)
            boolean r3 = r4 instanceof java.util.ArrayList
            if (r3 == 0) goto L_0x09c4
            java.util.AbstractCollection r4 = (java.util.AbstractCollection) r4
            if (r4 == 0) goto L_0x09c4
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x09c4
            r3 = 8
            X.C25633CjK.A00(r8, r3)
            java.util.Iterator r9 = r4.iterator()
        L_0x0997:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x09c4
            java.lang.String r7 = X.C17880vN.A0v(r9)
            X.CTT r3 = r8.A01()
            java.util.Map r6 = r3.A05
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            r4 = r52
            r3 = r22
            if (r3 != r4) goto L_0x09be
            r5.append(r7)
            java.lang.String r3 = "/parameter"
        L_0x09b6:
            java.lang.String r3 = X.AnonymousClass000.A0y(r3, r5)
            r6.put(r7, r3)
            goto L_0x0997
        L_0x09be:
            r5.append(r7)
            java.lang.String r3 = "/value"
            goto L_0x09b6
        L_0x09c4:
            X.CTT r47 = r8.A01()
            goto L_0x05b6
        L_0x09ca:
            X.BRE r6 = (X.BRE) r6
            X.CTT r4 = r3.A01
            if (r4 == 0) goto L_0x0ba0
            X.CTT r2 = r6.A02
            if (r2 == 0) goto L_0x09f6
            java.lang.String r7 = r2.A02
            if (r7 == 0) goto L_0x0b81
        L_0x09d8:
            java.lang.String r2 = r4.A02
            if (r2 == 0) goto L_0x0b81
            boolean r2 = X.C18070vi.A18(r7, r2)
            if (r2 != 0) goto L_0x0ba6
            r6.A02 = r4
            r7 = 1
            int r2 = r4.A00
            r2 = r2 & 1
            if (r2 != r7) goto L_0x0a5f
            java.lang.String r11 = "LiveEditingPlayer"
            java.lang.String r2 = "[Handle Parametric Request][update gltf]"
            X.C26294Cx6.A04(r11, r2)
            java.lang.Object r7 = r6.A0B
            monitor-enter(r7)
            goto L_0x09f8
        L_0x09f6:
            r7 = 0
            goto L_0x09d8
        L_0x09f8:
            java.lang.String r8 = r3.A03     // Catch:{ all -> 0x0a5c }
            java.lang.String r2 = r6.A04     // Catch:{ all -> 0x0a5c }
            boolean r2 = X.C18070vi.A18(r8, r2)     // Catch:{ all -> 0x0a5c }
            if (r2 != 0) goto L_0x0a56
            java.lang.String r9 = r6.A03     // Catch:{ all -> 0x0a5c }
            if (r9 == 0) goto L_0x0a51
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0a5c }
            java.lang.String r2 = "Request with id: "
            r8.append(r2)     // Catch:{ all -> 0x0a5c }
            r8.append(r9)     // Catch:{ all -> 0x0a5c }
            java.lang.String r2 = " is ongoing, cancel it"
            java.lang.String r2 = X.AnonymousClass000.A0y(r2, r8)     // Catch:{ all -> 0x0a5c }
            X.C26294Cx6.A04(r11, r2)     // Catch:{ all -> 0x0a5c }
            java.lang.String r11 = r6.A03     // Catch:{ all -> 0x0a5c }
            if (r11 == 0) goto L_0x0a4c
            java.lang.String r8 = "AleLiveEditingPlayer"
            java.lang.String r2 = "[cancelGeneration] cancelling avatar generation"
            X.C26294Cx6.A04(r8, r2)     // Catch:{ all -> 0x0a5c }
            java.lang.ref.WeakReference r2 = r6.A01     // Catch:{ all -> 0x0a4a }
            java.lang.Object r9 = r2.get()     // Catch:{ all -> 0x0a4a }
            X.E4O r9 = (X.E4O) r9     // Catch:{ all -> 0x0a4a }
            if (r9 == 0) goto L_0x0a46
            X.DBR r9 = (X.DBR) r9     // Catch:{ all -> 0x0a4a }
            java.lang.String r8 = "AleProviderImpl"
            java.lang.String r2 = "[cancelRequest]"
            X.C26294Cx6.A04(r8, r2)     // Catch:{ all -> 0x0a4a }
            X.EAU r2 = r9.A00     // Catch:{ all -> 0x0a4a }
            if (r2 != 0) goto L_0x0a43
            java.lang.String r1 = "aleBridge"
            X.C18070vi.A11(r1)     // Catch:{ all -> 0x0a4a }
            throw r0     // Catch:{ all -> 0x0a4a }
        L_0x0a43:
            r2.BEP(r11)     // Catch:{ all -> 0x0a4a }
        L_0x0a46:
            r6.A02()     // Catch:{ all -> 0x0a4a }
            goto L_0x0a51
        L_0x0a4a:
            r0 = move-exception
            goto L_0x0a50
        L_0x0a4c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r21)     // Catch:{ all -> 0x0a5c }
        L_0x0a50:
            throw r0     // Catch:{ all -> 0x0a5c }
        L_0x0a51:
            boolean r12 = r6.A0A(r3)     // Catch:{ all -> 0x0a5c }
            goto L_0x0a62
        L_0x0a56:
            java.lang.String r2 = "[Handle Parametric Request] current config generation already in progress or last completed"
            X.C26294Cx6.A04(r11, r2)     // Catch:{ all -> 0x0a5c }
            goto L_0x0a61
        L_0x0a5c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0a5f:
            r12 = 0
            goto L_0x0a63
        L_0x0a61:
            r12 = 0
        L_0x0a62:
            monitor-exit(r7)
        L_0x0a63:
            r7 = 2
            int r2 = r4.A00
            r2 = r2 & 2
            if (r2 != r7) goto L_0x0a78
            java.lang.String r7 = "LiveEditingPlayer"
            java.lang.String r2 = "[Handle Parametric Request][generateColorRamp]"
            X.C26294Cx6.A04(r7, r2)
            java.util.Map r2 = r3.A00()
            r6.A07(r5, r2)
        L_0x0a78:
            r7 = 4
            int r2 = r4.A00
            r2 = r2 & 4
            if (r2 != r7) goto L_0x0a8b
            java.lang.String r7 = "LiveEditingPlayer"
            java.lang.String r2 = "[Handle Parametric Request][updateSliderValues]"
            X.C26294Cx6.A04(r7, r2)
            java.util.Map r2 = r4.A06
            r6.A05(r2)
        L_0x0a8b:
            r7 = 8
            int r2 = r4.A00
            r2 = r2 & 8
            if (r2 != r7) goto L_0x0ae5
            java.util.LinkedHashMap r8 = X.C17880vN.A13()
            java.util.Map r9 = r3.A00()
            java.lang.String r11 = "LiveEditingPlayer"
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r2 = "[Handle Parametric Request][updateRamps]: "
            r7.append(r2)
            java.util.Map r3 = r4.A05
            java.lang.String r2 = X.C17890vO.A0V(r3, r7)
            X.C26294Cx6.A04(r11, r2)
            java.util.Iterator r11 = X.AnonymousClass000.A15(r3)
        L_0x0ab3:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0ae0
            java.util.Map$Entry r7 = X.AnonymousClass000.A16(r11)
            java.lang.Object r2 = r7.getKey()
            java.lang.Object r3 = r9.get(r2)
            if (r3 == 0) goto L_0x0ace
            java.lang.Object r2 = r7.getKey()
            r8.put(r2, r3)
        L_0x0ace:
            java.lang.Object r2 = r7.getValue()
            java.lang.Object r3 = r9.get(r2)
            if (r3 == 0) goto L_0x0ab3
            java.lang.Object r2 = r7.getValue()
            r8.put(r2, r3)
            goto L_0x0ab3
        L_0x0ae0:
            r6.A06 = r8
            r6.A07(r5, r8)
        L_0x0ae5:
            r3 = 16
            int r2 = r4.A00
            r2 = r2 & 16
            if (r2 != r3) goto L_0x0af9
            java.lang.String r3 = "LiveEditingPlayer"
            java.lang.String r2 = "[Handle Parametric Request][updateWeights]"
            X.C26294Cx6.A04(r3, r2)
            java.util.Map r2 = r4.A07
            r6.A04(r5, r2)
        L_0x0af9:
            r3 = 32
            int r2 = r4.A00
            r2 = r2 & 32
            if (r2 != r3) goto L_0x0b3b
            java.lang.String r3 = "LiveEditingPlayer"
            java.lang.String r2 = "[Handle Parametric Request][updatePresets]"
            X.C26294Cx6.A04(r3, r2)
            java.util.LinkedHashMap r9 = X.C17880vN.A13()
            java.util.ArrayList r3 = r4.A04
            if (r3 == 0) goto L_0x0b30
            java.lang.String r2 = r4.A01
            if (r2 == 0) goto L_0x0b72
            java.util.TreeMap r8 = A02(r2)
            java.util.Iterator r7 = r3.iterator()
        L_0x0b1c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0b30
            java.lang.Object r3 = r7.next()
            java.lang.Object r2 = r8.get(r3)
            if (r2 == 0) goto L_0x0b1c
            r9.put(r3, r2)
            goto L_0x0b1c
        L_0x0b30:
            boolean r2 = r9.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0b3b
            r6.A08(r5, r9)
        L_0x0b3b:
            r3 = 64
            int r2 = r4.A00
            r2 = r2 & 64
            if (r2 != r3) goto L_0x0ba4
            java.lang.String r3 = "LiveEditingPlayer"
            java.lang.String r2 = "[Handle Parametric Request][updateSkeleton]"
            X.C26294Cx6.A04(r3, r2)
            java.util.LinkedHashMap r7 = X.C17880vN.A13()
            java.util.ArrayList r3 = r4.A03
            if (r3 == 0) goto L_0x0b75
            java.lang.String r2 = r4.A01
            if (r2 == 0) goto L_0x0b72
            java.util.TreeMap r4 = A02(r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x0b5e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0b75
            java.lang.Object r2 = r3.next()
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x0b5e
            r7.put(r2, r0)
            goto L_0x0b5e
        L_0x0b72:
            java.lang.String r1 = "newConfig"
            goto L_0x0b83
        L_0x0b75:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0ba4
            r6.A09(r5, r7)
            goto L_0x0ba4
        L_0x0b81:
            java.lang.String r1 = "serializedConfig"
        L_0x0b83:
            X.C18070vi.A11(r1)
            throw r0
        L_0x0b87:
            X.C18070vi.A11(r14)
            throw r0
        L_0x0b8b:
            X.C1N r0 = new X.C1N
            r0.<init>()
            throw r0
        L_0x0b91:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r21)
            throw r0
        L_0x0b96:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r21)
            throw r0
        L_0x0b9b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r21)
            throw r0
        L_0x0ba0:
            boolean r12 = r6.A0A(r3)
        L_0x0ba4:
            if (r12 != 0) goto L_0x0ba8
        L_0x0ba6:
            r1.A01 = r10
        L_0x0ba8:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23712BoJ.A0M(android.view.View, X.DOZ, X.DFL, java.lang.Object):java.lang.Object");
    }

    public static Integer A00(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 instanceof Integer) {
            return (Integer) obj2;
        }
        return null;
    }
}
