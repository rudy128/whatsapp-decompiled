package X;

/* renamed from: X.7KX  reason: invalid class name */
public class AnonymousClass7KX implements C23691Hg {
    public final int A00;

    public AnonymousClass7KX(int i) {
        this.A00 = i;
    }

    public static void A00(AnonymousClass10T r1, int i) {
        r1.notifyAllObservers(new AnonymousClass7KX(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:189:0x030f, code lost:
        r1.A0E(X.C27621Wu.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0314, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x031b, code lost:
        r2.runOnUiThread(new X.C146437Pc(r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0323, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0357, code lost:
        r4 = (X.C131016kN) r7.A02;
        r3 = (X.C108475bl) r7.A01;
        X.AnonymousClass3MW.A1X(r4.A04, new com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateStickerList$1(r4, (X.C30391dr) null, r3), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x036a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        X.AnonymousClass3MW.A1X(r3, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CGE(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0203;
                case 1: goto L_0x020d;
                case 2: goto L_0x0213;
                case 3: goto L_0x0219;
                case 4: goto L_0x0223;
                case 5: goto L_0x0006;
                case 6: goto L_0x0231;
                case 7: goto L_0x023b;
                case 8: goto L_0x0245;
                case 9: goto L_0x024f;
                case 10: goto L_0x001e;
                case 11: goto L_0x003c;
                case 12: goto L_0x0057;
                case 13: goto L_0x0072;
                case 14: goto L_0x0080;
                case 15: goto L_0x0255;
                case 16: goto L_0x025b;
                case 17: goto L_0x0261;
                case 18: goto L_0x0267;
                case 19: goto L_0x026d;
                case 20: goto L_0x0273;
                case 21: goto L_0x008e;
                case 22: goto L_0x0279;
                case 23: goto L_0x00ab;
                case 24: goto L_0x027e;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0288;
                case 28: goto L_0x0292;
                case 29: goto L_0x029c;
                case 30: goto L_0x00cb;
                case 31: goto L_0x00f1;
                case 32: goto L_0x012f;
                case 33: goto L_0x015c;
                case 34: goto L_0x0180;
                case 35: goto L_0x02a6;
                case 36: goto L_0x01a6;
                case 37: goto L_0x02ac;
                case 38: goto L_0x02b2;
                case 39: goto L_0x02b8;
                case 40: goto L_0x02be;
                case 41: goto L_0x02c4;
                case 42: goto L_0x01bb;
                case 43: goto L_0x02ca;
                case 44: goto L_0x02d4;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            X.6h1 r7 = (X.AnonymousClass6h1) r7
            java.util.Set r0 = r7.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x000e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r1.next()
            X.8A4 r0 = (X.AnonymousClass8A4) r0
            r0.Bn9()
            goto L_0x000e
        L_0x001e:
            X.6UT r7 = (X.AnonymousClass6UT) r7
            boolean r0 = r7 instanceof X.C116395xC
            if (r0 == 0) goto L_0x0005
            X.5xC r7 = (X.C116395xC) r7
            int r0 = r7.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0005
            java.lang.Object r0 = r7.A01
            com.whatsapp.companionmode.registration.CompanionRegistrationViewModel r0 = (com.whatsapp.companionmode.registration.CompanionRegistrationViewModel) r0
            r2 = 1
            X.1DT r1 = r0.A05
            X.5xD r0 = new X.5xD
            r0.<init>(r2)
            r1.A0E(r0)
            return
        L_0x003c:
            X.6UT r7 = (X.AnonymousClass6UT) r7
            boolean r0 = r7 instanceof X.C116395xC
            if (r0 == 0) goto L_0x0005
            X.5xC r7 = (X.C116395xC) r7
            int r0 = r7.A00
            int r0 = 2 - r0
            if (r0 != 0) goto L_0x0005
            java.lang.String r0 = "companion/registration/link code too many attempts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r7.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 23
            goto L_0x031b
        L_0x0057:
            X.6UT r7 = (X.AnonymousClass6UT) r7
            boolean r0 = r7 instanceof X.C116395xC
            if (r0 == 0) goto L_0x0005
            X.5xC r7 = (X.C116395xC) r7
            int r0 = r7.A00
            int r0 = 2 - r0
            if (r0 != 0) goto L_0x0005
            java.lang.String r0 = "companion/registration/link code expired"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r7.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 22
            goto L_0x031b
        L_0x0072:
            X.6UT r7 = (X.AnonymousClass6UT) r7
            boolean r0 = r7 instanceof X.C116395xC
            if (r0 == 0) goto L_0x0005
            X.5xC r7 = (X.C116395xC) r7
            int r0 = r7.A00
            switch(r0) {
                case 1: goto L_0x0302;
                case 2: goto L_0x02de;
                default: goto L_0x007f;
            }
        L_0x007f:
            return
        L_0x0080:
            X.6UT r7 = (X.AnonymousClass6UT) r7
            boolean r0 = r7 instanceof X.C116395xC
            if (r0 == 0) goto L_0x0005
            X.5xC r7 = (X.C116395xC) r7
            int r0 = r7.A00
            switch(r0) {
                case 1: goto L_0x0309;
                case 2: goto L_0x0315;
                default: goto L_0x008d;
            }
        L_0x008d:
            return
        L_0x008e:
            X.852 r7 = (X.AnonymousClass852) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.7GJ r7 = (X.AnonymousClass7GJ) r7
            int r0 = r7.A00
            if (r0 != 0) goto L_0x0005
            java.lang.Object r1 = r7.A02
            X.6kN r1 = (X.C131016kN) r1
            java.lang.Object r4 = r7.A01
            X.5bl r4 = (X.C108475bl) r4
            X.0wl r3 = r1.A04
            r0 = 0
            com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateShapeAvatarStickerList$1 r2 = new com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateShapeAvatarStickerList$1
            r2.<init>(r1, r0, r4)
            goto L_0x00c7
        L_0x00ab:
            X.852 r7 = (X.AnonymousClass852) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.7GJ r7 = (X.AnonymousClass7GJ) r7
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0005
            java.lang.Object r1 = r7.A02
            X.6kN r1 = (X.C131016kN) r1
            java.lang.Object r4 = r7.A01
            X.5bl r4 = (X.C108475bl) r4
            X.0wl r3 = r1.A04
            r0 = 0
            com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateShapeStickerList$1 r2 = new com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateShapeStickerList$1
            r2.<init>(r1, r0, r4)
        L_0x00c7:
            X.AnonymousClass3MW.A1X(r3, r2, r4)
            return
        L_0x00cb:
            X.6qF r7 = (X.C134226qF) r7
            r1 = 0
            X.C18070vi.A0d(r7, r1)
            boolean r0 = r7 instanceof X.AnonymousClass6H6
            if (r0 == 0) goto L_0x00dd
            X.6H6 r7 = (X.AnonymousClass6H6) r7
            int r0 = r7.A00
            switch(r0) {
                case 4: goto L_0x032e;
                case 5: goto L_0x0324;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            return
        L_0x00dd:
            X.6H5 r7 = (X.AnonymousClass6H5) r7
            int r0 = r7.A00
            switch(r0) {
                case 3: goto L_0x00e5;
                case 4: goto L_0x00e5;
                case 5: goto L_0x00e5;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            return
        L_0x00e5:
            java.lang.Object r0 = r7.A01
            X.722 r0 = (X.AnonymousClass722) r0
            X.8AV r0 = r0.A03
            if (r0 == 0) goto L_0x0005
            r0.Bu2(r1, r1)
            return
        L_0x00f1:
            X.6qF r7 = (X.C134226qF) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            boolean r0 = r7 instanceof X.AnonymousClass6H6
            if (r0 == 0) goto L_0x0119
            X.6H6 r7 = (X.AnonymousClass6H6) r7
            int r0 = r7.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0005
            java.lang.Object r5 = r7.A02
            com.whatsapp.stickers.flow.StickerPackFlow r5 = (com.whatsapp.stickers.flow.StickerPackFlow) r5
            X.1OX r4 = r5.A0D
            X.0wl r3 = r5.A0B
            java.lang.Object r2 = r7.A01
            X.5bl r2 = (X.C108475bl) r2
            r1 = 0
            com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1 r0 = new com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1
            r0.<init>(r5, r1, r2)
            X.AnonymousClass3MW.A1X(r3, r0, r4)
            return
        L_0x0119:
            X.6H5 r7 = (X.AnonymousClass6H5) r7
            int r0 = r7.A00
            switch(r0) {
                case 3: goto L_0x033b;
                case 4: goto L_0x033b;
                case 5: goto L_0x033b;
                case 6: goto L_0x0121;
                default: goto L_0x0120;
            }
        L_0x0120:
            return
        L_0x0121:
            java.lang.Object r1 = r7.A01
            com.whatsapp.stickers.store.StickerStoreTabFragment r1 = (com.whatsapp.stickers.store.StickerStoreTabFragment) r1
            boolean r0 = r1 instanceof com.whatsapp.stickers.store.StickerStoreMyTabFragment
            if (r0 == 0) goto L_0x0005
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r1 = (com.whatsapp.stickers.store.StickerStoreMyTabFragment) r1
            com.whatsapp.stickers.store.StickerStoreMyTabFragment.A00(r1)
            return
        L_0x012f:
            X.6qF r7 = (X.C134226qF) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            boolean r0 = r7 instanceof X.AnonymousClass6H6
            if (r0 == 0) goto L_0x0141
            X.6H6 r7 = (X.AnonymousClass6H6) r7
            int r0 = r7.A00
            switch(r0) {
                case 2: goto L_0x0343;
                case 3: goto L_0x0357;
                default: goto L_0x0140;
            }
        L_0x0140:
            return
        L_0x0141:
            X.6H5 r7 = (X.AnonymousClass6H5) r7
            int r0 = r7.A00
            switch(r0) {
                case 3: goto L_0x0149;
                case 4: goto L_0x0149;
                case 5: goto L_0x0149;
                default: goto L_0x0148;
            }
        L_0x0148:
            return
        L_0x0149:
            java.lang.Object r1 = r7.A01
            X.722 r1 = (X.AnonymousClass722) r1
            X.8AV r0 = r1.A03
            if (r0 == 0) goto L_0x0154
            r0.C2h()
        L_0x0154:
            X.5ii r0 = r1.A01
            if (r0 == 0) goto L_0x0005
            r0.A0T()
            return
        L_0x015c:
            X.6qF r7 = (X.C134226qF) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            boolean r0 = r7 instanceof X.AnonymousClass6H5
            if (r0 == 0) goto L_0x0005
            X.6H5 r7 = (X.AnonymousClass6H5) r7
            int r0 = r7.A00
            if (r0 != 0) goto L_0x0005
            java.lang.Object r1 = r7.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            boolean r0 = r1.A3G()
            if (r0 == 0) goto L_0x0005
            X.74M r1 = r1.A4h
            X.C17960vV.A07(r1)
            r0 = 0
            r1.A0U(r0, r0)
            return
        L_0x0180:
            X.6qF r7 = (X.C134226qF) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            boolean r0 = r7 instanceof X.AnonymousClass6H6
            if (r0 == 0) goto L_0x0192
            X.6H6 r7 = (X.AnonymousClass6H6) r7
            int r0 = r7.A00
            switch(r0) {
                case 2: goto L_0x036b;
                case 3: goto L_0x0357;
                default: goto L_0x0191;
            }
        L_0x0191:
            return
        L_0x0192:
            X.6H5 r7 = (X.AnonymousClass6H5) r7
            int r0 = r7.A00
            switch(r0) {
                case 3: goto L_0x019a;
                case 4: goto L_0x019a;
                case 5: goto L_0x019a;
                default: goto L_0x0199;
            }
        L_0x0199:
            return
        L_0x019a:
            java.lang.Object r0 = r7.A01
            X.722 r0 = (X.AnonymousClass722) r0
            X.8AV r0 = r0.A03
            if (r0 == 0) goto L_0x0005
            r0.C2h()
            return
        L_0x01a6:
            X.6Uq r7 = (X.C123486Uq) r7
            boolean r0 = r7 instanceof X.AnonymousClass6N1
            if (r0 == 0) goto L_0x0005
            X.6N1 r7 = (X.AnonymousClass6N1) r7
            X.7Mo r1 = r7.A00
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L_0x0005
            r0 = 0
            r1.A0F(r0)
            return
        L_0x01bb:
            X.86C r7 = (X.AnonymousClass86C) r7
            r3 = 0
            X.C18070vi.A0d(r7, r3)
            X.7Ov r7 = (X.C146367Ov) r7
            int r0 = r7.A00
            java.lang.Object r2 = r7.A01
            if (r0 == 0) goto L_0x01e2
            X.6uW r2 = (X.C136856uW) r2
            r2.A00()
            X.6tC r1 = r2.A02
            if (r1 == 0) goto L_0x0005
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0005
            r1.A02 = r3
            r1.A04 = r3
            X.89a r0 = r2.A00
            if (r0 == 0) goto L_0x0005
            r0.C9e(r1)
            return
        L_0x01e2:
            X.7PL r2 = (X.AnonymousClass7PL) r2
            X.6tC r1 = r2.A01
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x01ef
            return
        L_0x01ef:
            r1.A02 = r3
            r1.A04 = r3
            r1.A03 = r3
            X.6Rr r0 = X.C122726Rr.HIDE
            r1.A00 = r0
            r1.A01 = r0
            X.89a r0 = r2.A00
            if (r0 == 0) goto L_0x0005
            r0.C5S(r1)
            return
        L_0x0203:
            X.1M8 r7 = (X.AnonymousClass1M8) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r7.Bkj()
            return
        L_0x020d:
            X.1Ke r7 = (X.C24401Ke) r7
            r7.onAppBackgrounded()
            return
        L_0x0213:
            X.1q4 r7 = (X.C37751q4) r7
            r7.A01()
            return
        L_0x0219:
            X.88p r7 = (X.C1604688p) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r7.C5L()
            return
        L_0x0223:
            X.1To r7 = (X.C26811To) r7
            X.10I r2 = r7.A0W
            r1 = 4
            X.7Pc r0 = new X.7Pc
            r0.<init>(r7, r1)
            r2.CGF(r0)
            return
        L_0x0231:
            X.1V6 r7 = (X.AnonymousClass1V6) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r7.C78()
            return
        L_0x023b:
            X.1Tm r7 = (X.C26791Tm) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r7.C35()
            return
        L_0x0245:
            X.1Tm r7 = (X.C26791Tm) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r7.C8E()
            return
        L_0x024f:
            X.6UT r7 = (X.AnonymousClass6UT) r7
            r7.A00()
            return
        L_0x0255:
            X.1Gv r7 = (X.C23581Gv) r7
            r7.Bpv()
            return
        L_0x025b:
            X.1Gv r7 = (X.C23581Gv) r7
            r7.Bm3()
            return
        L_0x0261:
            X.1M7 r7 = (X.AnonymousClass1M7) r7
            r7.Bq6()
            return
        L_0x0267:
            X.1TX r7 = (X.AnonymousClass1TX) r7
            r7.onSuccess()
            return
        L_0x026d:
            X.1TX r7 = (X.AnonymousClass1TX) r7
            r7.Bvg()
            return
        L_0x0273:
            X.1TX r7 = (X.AnonymousClass1TX) r7
            r7.BlU()
            return
        L_0x0279:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            return
        L_0x027e:
            X.8Ar r7 = (X.C160938Ar) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r7.Bpp()
            return
        L_0x0288:
            X.8B1 r7 = (X.AnonymousClass8B1) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r7.Blz()
            return
        L_0x0292:
            X.8B1 r7 = (X.AnonymousClass8B1) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r7.BpC()
            return
        L_0x029c:
            X.89O r7 = (X.AnonymousClass89O) r7
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            r7.Bqq()
            return
        L_0x02a6:
            X.6Uq r7 = (X.C123486Uq) r7
            r7.A01()
            return
        L_0x02ac:
            X.6Uq r7 = (X.C123486Uq) r7
            r7.A04()
            return
        L_0x02b2:
            X.6Uq r7 = (X.C123486Uq) r7
            r7.A03()
            return
        L_0x02b8:
            X.6Uq r7 = (X.C123486Uq) r7
            r7.A02()
            return
        L_0x02be:
            X.6Uq r7 = (X.C123486Uq) r7
            r7.A00()
            return
        L_0x02c4:
            X.1k5 r7 = (X.C34191k5) r7
            r7.BnD()
            return
        L_0x02ca:
            X.6Uj r7 = (X.C123416Uj) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r7.A02()
            return
        L_0x02d4:
            X.6Uj r7 = (X.C123416Uj) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r7.A03()
            return
        L_0x02de:
            java.lang.Object r3 = r7.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r3 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r3
            X.1LU r0 = r3.A04
            if (r0 == 0) goto L_0x02fd
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.companionmode.registration.CompanionBootstrapActivity"
            r2.setClassName(r1, r0)
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r2.addFlags(r0)
            r3.startActivity(r2)
            return
        L_0x02fd:
            X.AnonymousClass3MW.A1F()
            r0 = 0
            throw r0
        L_0x0302:
            java.lang.Object r0 = r7.A01
            com.whatsapp.companionmode.registration.CompanionRegistrationViewModel r0 = (com.whatsapp.companionmode.registration.CompanionRegistrationViewModel) r0
            X.1wy r1 = r0.A0D
            goto L_0x030f
        L_0x0309:
            java.lang.Object r0 = r7.A01
            com.whatsapp.companionmode.registration.CompanionRegistrationViewModel r0 = (com.whatsapp.companionmode.registration.CompanionRegistrationViewModel) r0
            X.1wy r1 = r0.A0C
        L_0x030f:
            X.1Wu r0 = X.C27621Wu.A00
            r1.A0E(r0)
            return
        L_0x0315:
            java.lang.Object r2 = r7.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 24
        L_0x031b:
            X.7Pc r0 = new X.7Pc
            r0.<init>(r2, r1)
            r2.runOnUiThread(r0)
            return
        L_0x0324:
            java.lang.Object r2 = r7.A02
            X.6xU r2 = (X.C138666xU) r2
            java.lang.Object r1 = r7.A01
            X.5bl r1 = (X.C108475bl) r1
            r0 = 1
            goto L_0x0337
        L_0x032e:
            java.lang.Object r2 = r7.A02
            X.6xU r2 = (X.C138666xU) r2
            java.lang.Object r1 = r7.A01
            X.5bl r1 = (X.C108475bl) r1
            r0 = 2
        L_0x0337:
            X.C138666xU.A00(r2, r1, r0)
            return
        L_0x033b:
            java.lang.Object r0 = r7.A01
            X.722 r0 = (X.AnonymousClass722) r0
            r0.A03()
            return
        L_0x0343:
            java.lang.Object r4 = r7.A02
            X.6kN r4 = (X.C131016kN) r4
            java.lang.Object r3 = r7.A01
            X.5bl r3 = (X.C108475bl) r3
            X.0wl r2 = r4.A04
            r1 = 0
            com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateAvatarStickerList$1 r0 = new com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateAvatarStickerList$1
            r0.<init>(r4, r1, r3)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x0357:
            java.lang.Object r4 = r7.A02
            X.6kN r4 = (X.C131016kN) r4
            java.lang.Object r3 = r7.A01
            X.5bl r3 = (X.C108475bl) r3
            X.0wl r2 = r4.A04
            r1 = 0
            com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateStickerList$1 r0 = new com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateStickerList$1
            r0.<init>(r4, r1, r3)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x036b:
            java.lang.Object r4 = r7.A02
            X.6kN r4 = (X.C131016kN) r4
            java.lang.Object r3 = r7.A01
            X.5bl r3 = (X.C108475bl) r3
            X.0wl r2 = r4.A04
            r1 = 0
            com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateAvatarStickerList$1 r0 = new com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateAvatarStickerList$1
            r0.<init>(r4, r1, r3)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KX.CGE(java.lang.Object):void");
    }
}
