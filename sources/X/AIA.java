package X;

public class AIA implements E46 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AIA(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
        if (r1.isProviderEnabled("gps") == false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bxa(X.DAE r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            r3 = r16
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r2 = r15.A01
            X.8xg r2 = (X.C174998xg) r2
            java.lang.Object r5 = r15.A02
            X.8wK r5 = (X.C174158wK) r5
            java.util.List r0 = X.C42011xT.A0I
            r3.A05()
            X.A6f r0 = r5.A01
            r2.A00 = r0
            X.A5P r0 = r2.A02
            if (r0 != 0) goto L_0x0025
            X.6ig r4 = r2.A08
            r1 = 0
            X.A5P r0 = new X.A5P
            r0.<init>(r3, r1, r4)
            r2.A02 = r0
        L_0x0025:
            X.AEf r0 = r5.A00
            float r0 = r0.A01
            X.D44 r0 = X.C174998xg.A00(r2, r0)
            X.CXL r0 = X.C25306CdA.A00(r0)
            r3.A09(r0)
            X.A5P r0 = r2.A02
            if (r0 == 0) goto L_0x003b
            r0.A02()
        L_0x003b:
            X.A5P r4 = r2.A02
            if (r4 == 0) goto L_0x0046
            X.A6f r1 = r2.A00
            java.util.List r0 = r5.A02
            r4.A04(r1, r0)
        L_0x0046:
            X.A5P r1 = r2.A02
            if (r1 == 0) goto L_0x004f
            java.util.List r0 = r5.A02
            r1.A06(r0)
        L_0x004f:
            X.A5P r1 = r2.A02
            if (r1 == 0) goto L_0x006e
            X.1nB r5 = r5.A04
            int r0 = r1.A01
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r0 = r1.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.D44 r0 = r3.A02()
            float r0 = r0.A02
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.invoke(r4, r1, r0)
        L_0x006e:
            android.view.View r0 = r2.A06
            android.app.Activity r1 = X.AnonymousClass3Ma.A05(r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.C18070vi.A0z(r1, r0)
            java.lang.String r0 = "location"
            java.lang.Object r1 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.location.LocationManager"
            X.C18070vi.A0z(r1, r0)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            X.A5L r0 = r2.A07
            boolean r0 = r0.A05()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00a1
            X.17x r0 = r2.A04
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "gps"
            boolean r1 = r1.isProviderEnabled(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            r3.A0D(r0)
        L_0x00a5:
            return
        L_0x00a6:
            java.lang.Object r7 = r15.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r7 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r7
            java.lang.Object r5 = r15.A02
            android.os.Bundle r5 = (android.os.Bundle) r5
            r7.A03 = r3
            if (r16 == 0) goto L_0x00c3
            boolean r0 = com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity.A03(r7)
            r3.A0D(r0)
            X.C65 r1 = r3.A0S
            if (r1 == 0) goto L_0x00c3
            r0 = 0
            r1.A01 = r0
            r1.A00()
        L_0x00c3:
            X.C18070vi.A0b(r3)
            X.6ig r2 = r7.A08
            if (r2 == 0) goto L_0x028e
            X.9iz r1 = new X.9iz
            r1.<init>(r7)
            X.A5P r0 = new X.A5P
            r0.<init>(r3, r1, r2)
            r7.A09 = r0
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "arg_search_filters"
            android.os.Bundle r6 = r1.getBundleExtra(r0)
            X.C17960vV.A07(r6)
            X.C18070vi.A0X(r6)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "arg_map_view_config"
            android.os.Parcelable r9 = r1.getParcelableExtra(r0)
            X.C17960vV.A07(r9)
            X.C18070vi.A0X(r9)
            X.AEf r9 = (X.C20272AEf) r9
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "arg_search_location"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.C17960vV.A07(r0)
            X.A6f r10 = X.C20079A6f.A01(r0)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "arg_csvm_config"
            java.lang.String r13 = r1.getStringExtra(r0)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "arg_map_business_marker_data"
            java.util.ArrayList r14 = r1.getParcelableArrayListExtra(r0)
            X.C17960vV.A07(r14)
            X.C18070vi.A0X(r14)
            X.C17960vV.A07(r10)
            X.C18070vi.A0X(r10)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "arg_parent_category"
            android.os.Parcelable r12 = r1.getParcelableExtra(r0)
            X.C17960vV.A07(r12)
            X.C18070vi.A0X(r12)
            X.AEQ r12 = (X.AEQ) r12
            X.A5P r11 = r7.A09
            java.lang.String r3 = "businessMarkerManager"
            if (r11 == 0) goto L_0x028a
            X.9VF r8 = r7.A04
            if (r8 == 0) goto L_0x0287
            X.8Ew r4 = new X.8Ew
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.1It r1 = X.AnonymousClass8BR.A0C(r4, r7)
            java.lang.Class<X.8FG> r0 = X.AnonymousClass8FG.class
            X.1J2 r1 = r1.A00(r0)
            X.8FG r1 = (X.AnonymousClass8FG) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r7.A04 = r1
            X.8FG r0 = r7.A4b()
            X.1DT r1 = r0.A0G
            X.AyH r0 = new X.AyH
            r0.<init>(r7)
            r2 = 20
            X.C20339AGv.A00(r7, r1, r0, r2)
            X.8FG r0 = r7.A4b()
            X.1Dg r1 = r0.A0F
            X.AyI r0 = new X.AyI
            r0.<init>(r7)
            X.C20339AGv.A00(r7, r1, r0, r2)
            X.8FG r0 = r7.A4b()
            X.1wy r1 = r0.A0V
            X.AyJ r0 = new X.AyJ
            r0.<init>(r7)
            X.C20339AGv.A00(r7, r1, r0, r2)
            X.8FG r0 = r7.A4b()
            X.1Dg r1 = r0.A0E
            X.B1z r0 = X.C22296B1z.A00
            X.C20339AGv.A00(r7, r1, r0, r2)
            X.8FG r0 = r7.A4b()
            X.1wy r1 = r0.A0W
            X.AyK r0 = new X.AyK
            r0.<init>(r7)
            X.C20339AGv.A00(r7, r1, r0, r2)
            X.8FG r0 = r7.A4b()
            X.1wy r1 = r0.A0U
            X.AyL r0 = new X.AyL
            r0.<init>(r7)
            X.C20339AGv.A00(r7, r1, r0, r2)
            X.A5P r0 = r7.A09
            if (r0 == 0) goto L_0x028a
            X.1DT r1 = r0.A07
            X.AyM r0 = new X.AyM
            r0.<init>(r7)
            X.C20339AGv.A00(r7, r1, r0, r2)
            X.8FG r0 = r7.A4b()
            X.1wy r1 = r0.A0T
            X.AyN r0 = new X.AyN
            r0.<init>(r7)
            X.C20339AGv.A00(r7, r1, r0, r2)
            X.8FG r4 = r7.A4b()
            if (r5 != 0) goto L_0x025d
            X.1XN r1 = r4.A0S
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0212
            X.0ve r2 = r1.A03
            r1 = 4488(0x1188, float:6.289E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0212
            java.util.ArrayList r1 = r4.A0A
            r0 = 14
            java.util.List r1 = X.C21486Akr.A00(r1, r0)
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x0212
            java.lang.Object r3 = X.C29431cG.A0b(r1)
            X.AF1 r3 = (X.AF1) r3
            X.A5P r2 = r4.A08
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.A8P r0 = r2.A0B
            java.util.Map r0 = r0.A05
            java.lang.Object r1 = r0.get(r3)
            X.8KV r1 = (X.AnonymousClass8KV) r1
            if (r1 == 0) goto L_0x0212
            X.9iz r0 = r2.A09
            if (r0 == 0) goto L_0x0212
            r0.A00(r3, r1)
        L_0x0212:
            X.1Fv r1 = r7.getLifecycle()
            X.00H r0 = r7.A09
            if (r0 == 0) goto L_0x0291
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.17o r0 = (X.C218317o) r0
            r1.A05(r0)
            X.00H r0 = r7.A09
            if (r0 == 0) goto L_0x0291
            java.lang.Object r0 = r0.get()
            X.AAB r0 = (X.AAB) r0
            X.1DT r2 = r0.A00
            X.AyO r1 = new X.AyO
            r1.<init>(r7)
            r0 = 21
            X.C20339AGv.A00(r7, r2, r1, r0)
            X.DAE r3 = r7.A03
            if (r3 == 0) goto L_0x024f
            r2 = 0
            X.AI8 r1 = new X.AI8
            r1.<init>(r7, r2)
            java.util.ArrayList r0 = r3.A0V
            r0.add(r1)
            X.AI9 r0 = new X.AI9
            r0.<init>(r7, r2)
            r3.A0B = r0
        L_0x024f:
            X.DAE r0 = r7.A03
            if (r0 == 0) goto L_0x00a5
            X.BIS r1 = r0.A0Q
            X.AIB r0 = new X.AIB
            r0.<init>(r7)
            r1.A0S = r0
            return
        L_0x025d:
            X.A5P r2 = r7.A09
            if (r2 == 0) goto L_0x028a
            X.AF1 r1 = r4.A07
            if (r1 == 0) goto L_0x0268
            r0 = 0
            r1.A09 = r0
        L_0x0268:
            r4.A08 = r2
            X.1DT r0 = r2.A07
            r4.A02 = r0
            r2.A02()
            X.A6f r1 = r4.A05
            java.util.ArrayList r0 = r4.A0A
            r2.A04(r1, r0)
            X.AF1 r1 = r4.A07
            if (r1 == 0) goto L_0x0212
            r0 = 1
            r1.A09 = r0
            r0 = 0
            r2.A05(r1, r0)
            r2.A03()
            goto L_0x0212
        L_0x0287:
            java.lang.String r0 = "viewModelFactory"
            goto L_0x0293
        L_0x028a:
            X.C18070vi.A11(r3)
            goto L_0x0296
        L_0x028e:
            java.lang.String r0 = "directoryImageLoader"
            goto L_0x0293
        L_0x0291:
            java.lang.String r0 = "locationUpdateListener"
        L_0x0293:
            X.C18070vi.A11(r0)
        L_0x0296:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIA.Bxa(X.DAE):void");
    }
}
