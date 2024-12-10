package X;

/* renamed from: X.4sL  reason: invalid class name and case insensitive filesystem */
public class C99144sL implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;

    public C99144sL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C18100vl A00(Integer num, Object obj, int i) {
        return AnonymousClass1DF.A00(num, new C99144sL(obj, i));
    }

    public static C18110vm A01(Object obj, int i) {
        return AnonymousClass1DF.A01(new C99144sL(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ed, code lost:
        if (12 != r1.A00.A03(255)) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0191, code lost:
        if (X.C72453Mb.A0I(r1.A02) > 0) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02a6, code lost:
        if (((X.C57092iW) ((X.AnonymousClass1XL) r15.A01).A04.getValue()).A00.A03(255) == 0) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02a8, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02ad, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02ae, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00f1;
                case 2: goto L_0x0106;
                case 3: goto L_0x011d;
                case 4: goto L_0x012d;
                case 5: goto L_0x0139;
                case 6: goto L_0x0145;
                case 7: goto L_0x0160;
                case 8: goto L_0x017b;
                case 9: goto L_0x0195;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01c1;
                case 12: goto L_0x01db;
                case 13: goto L_0x0020;
                case 14: goto L_0x01ff;
                case 15: goto L_0x0065;
                case 16: goto L_0x021f;
                case 17: goto L_0x0233;
                case 18: goto L_0x0265;
                case 19: goto L_0x026f;
                case 20: goto L_0x0278;
                case 21: goto L_0x0292;
                case 22: goto L_0x02b0;
                case 23: goto L_0x02c1;
                case 24: goto L_0x02d0;
                case 25: goto L_0x02e6;
                case 26: goto L_0x02f3;
                case 27: goto L_0x0300;
                case 28: goto L_0x0316;
                case 29: goto L_0x0327;
                case 30: goto L_0x0335;
                case 31: goto L_0x0352;
                case 32: goto L_0x0362;
                case 33: goto L_0x0377;
                case 34: goto L_0x038a;
                case 35: goto L_0x03a7;
                case 36: goto L_0x03c4;
                case 37: goto L_0x03d1;
                case 38: goto L_0x03e4;
                case 39: goto L_0x03fb;
                case 40: goto L_0x041b;
                case 41: goto L_0x0427;
                case 42: goto L_0x043f;
                case 43: goto L_0x0458;
                case 44: goto L_0x046e;
                case 45: goto L_0x00a9;
                case 46: goto L_0x04ae;
                case 47: goto L_0x04b8;
                case 48: goto L_0x00cb;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.4nA r0 = (X.C96014nA) r0
            X.4aY r2 = r0.A00
            com.whatsapp.expressionstray.ExpressionsTrayView r1 = r2.A3D
            if (r1 == 0) goto L_0x001d
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0i
            if (r0 == 0) goto L_0x001d
            int r0 = r0.A0J
            r1.A0F(r0)
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r2.A3D
            X.AnonymousClass4aY.A0R(r0, r2)
        L_0x001d:
            X.1Wu r5 = X.C27621Wu.A00
        L_0x001f:
            return r5
        L_0x0020:
            java.lang.Object r4 = r15.A01
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r4 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r4
            X.0vl r3 = r4.A0H
            java.lang.Object r0 = r3.getValue()
            X.4VF r0 = (X.AnonymousClass4VF) r0
            java.util.List r1 = r0.A05
            int r0 = X.C200510q.A00(r1)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x003b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = r2.next()
            r7 = r1
            X.4DE r7 = (X.AnonymousClass4DE) r7
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r8 = r4.A0V(r7)
            if (r8 == 0) goto L_0x04c3
            X.1G4 r11 = r4.A0O
            java.lang.Object r0 = r3.getValue()
            X.4VF r0 = (X.AnonymousClass4VF) r0
            long r12 = r0.A01
            java.lang.Integer r9 = r4.A06
            X.1OX r10 = r4.A0N
            X.4S8 r6 = new X.4S8
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.put(r1, r6)
            goto L_0x003b
        L_0x0065:
            java.lang.Object r3 = r15.A01
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r3 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r3
            X.0vl r0 = r3.A0C
            java.lang.Object r0 = r0.getValue()
            X.4Ul r0 = (X.C87144Ul) r0
            java.util.List r1 = r0.A04
            int r0 = X.C200510q.A00(r1)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0080:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = r2.next()
            X.4V6 r1 = (X.AnonymousClass4V6) r1
            X.4DE r7 = r1.A01
            X.5aj r8 = r1.A02
            X.1D6 r0 = X.AnonymousClass1D6.A01(r7, r8)
            boolean r12 = r1.A06
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r9 = r3.A0V(r7)
            if (r9 == 0) goto L_0x04c8
            java.lang.Integer r10 = r3.A06
            X.1OX r11 = r3.A0N
            X.4Ng r6 = new X.4Ng
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.put(r0, r6)
            goto L_0x0080
        L_0x00a9:
            java.lang.Object r2 = r15.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            boolean r1 = X.C72463Mc.A1R(r2)
            boolean r0 = X.AnonymousClass4aY.A23(r2)
            if (r1 != 0) goto L_0x00c1
            if (r0 != 0) goto L_0x00c1
            r0 = 0
            r2.A6v = r0
            X.AnonymousClass4aY.A15(r2)
            goto L_0x001d
        L_0x00c1:
            r0 = 1
            r2.A6v = r0
            X.1bI r0 = r2.A4Z
            X.C72453Mb.A1M(r0)
            goto L_0x001d
        L_0x00cb:
            java.lang.Object r1 = r15.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            r0 = 0
            r1.A73 = r0
            boolean r0 = r1.A6e
            if (r0 != 0) goto L_0x001d
            X.AnonymousClass4aY.A1B(r1)
            goto L_0x001d
        L_0x00db:
            java.lang.Object r1 = r15.A01
            X.2iW r1 = (X.C57092iW) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0PO r1 = r1.A00
            r0 = 255(0xff, float:3.57E-43)
            int r1 = r1.A03(r0)
            r0 = 12
            if (r0 == r1) goto L_0x02ae
            goto L_0x02a8
        L_0x00f1:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r0)
            r0 = 2131169544(0x7f071108, float:1.7953421E38)
            int r0 = r1.getDimensionPixelSize(r0)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r0, r0, r0, r0)
            return r5
        L_0x0106:
            java.lang.Object r1 = r15.A01
            com.whatsapp.areffects.arclass.ArClassManager r1 = (com.whatsapp.areffects.arclass.ArClassManager) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A02
            java.lang.Object r1 = r0.get()
            X.0vc r1 = (X.C18010vc) r1
            java.lang.String r0 = "ar_prefs"
            android.content.SharedPreferences r5 = r1.A05(r0)
            return r5
        L_0x011d:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 2131435477(0x7f0b1fd5, float:1.8492797E38)
            X.1bI r5 = X.C28931bI.A00(r1, r0)
            return r5
        L_0x012d:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131436735(0x7f0b24bf, float:1.8495349E38)
            android.view.View r5 = X.C18070vi.A05(r1, r0)
            return r5
        L_0x0139:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131435840(0x7f0b2140, float:1.8493534E38)
            android.view.View r5 = X.C18070vi.A05(r1, r0)
            return r5
        L_0x0145:
            java.lang.Object r1 = r15.A01
            X.4oy r1 = (X.C97134oy) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A00
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 11512(0x2cf8, float:1.6132E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x0160:
            java.lang.Object r1 = r15.A01
            X.4oy r1 = (X.C97134oy) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A00
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 12681(0x3189, float:1.777E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x017b:
            java.lang.Object r1 = r15.A01
            X.4oy r1 = (X.C97134oy) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vl r0 = r1.A01
            int r0 = X.C72453Mb.A0I(r0)
            if (r0 <= 0) goto L_0x02ae
            X.0vl r0 = r1.A02
            int r0 = X.C72453Mb.A0I(r0)
            if (r0 <= 0) goto L_0x02ae
            goto L_0x02a8
        L_0x0195:
            java.lang.Object r1 = r15.A01
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager r1 = (com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0ve r2 = r1.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 11478(0x2cd6, float:1.6084E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x01ac:
            java.lang.Object r0 = r15.A01
            X.4a4 r0 = (X.C88544a4) r0
            X.0ve r2 = r0.A06
            X.0vf r1 = X.C18040vf.A01
            r0 = 9332(0x2474, float:1.3077E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r0 = r0 ^ 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x01c1:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.A15()
            java.lang.String r0 = "category"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x01d6
            X.4DE r5 = X.AnonymousClass4DE.valueOf(r0)
            return r5
        L_0x01d6:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x01db:
            java.lang.Object r1 = r15.A01
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r1 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r1
            X.0vl r0 = r1.A0G
            java.util.Collection r9 = X.C17890vO.A0g(r0)
            X.0vl r0 = r1.A0H
            java.lang.Object r7 = r0.getValue()
            X.4VF r7 = (X.AnonymousClass4VF) r7
            X.0vl r0 = r1.A0C
            java.lang.Object r6 = r0.getValue()
            X.4Ul r6 = (X.C87144Ul) r6
            java.lang.Integer r8 = r1.A06
            X.1OX r10 = r1.A0N
            X.4Wo r5 = new X.4Wo
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x01ff:
            java.lang.Object r1 = r15.A01
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r1 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r1
            X.0vl r0 = r1.A0J
            java.util.Map r7 = X.AnonymousClass3MW.A12(r0)
            X.1G4 r9 = r1.A0O
            X.0vl r0 = r1.A0H
            java.lang.Object r0 = r0.getValue()
            X.4VF r0 = (X.AnonymousClass4VF) r0
            long r10 = r0.A01
            java.lang.Integer r6 = r1.A06
            X.1OX r8 = r1.A0N
            X.4Oc r5 = new X.4Oc
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x021f:
            java.lang.Object r3 = r15.A01
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r3 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r3
            X.0vl r0 = r3.A0G
            java.util.Collection r2 = X.C17890vO.A0g(r0)
            java.lang.Integer r1 = r3.A06
            X.1OX r0 = r3.A0N
            X.4Ke r5 = new X.4Ke
            r5.<init>(r1, r2, r0)
            return r5
        L_0x0233:
            java.lang.Object r1 = r15.A01
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r1 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r1
            X.0vl r0 = r1.A0G
            java.util.Map r10 = X.AnonymousClass3MW.A12(r0)
            X.0vl r0 = r1.A0A
            java.lang.Object r7 = r0.getValue()
            X.4Sc r7 = (X.C86554Sc) r7
            X.0vl r0 = r1.A0J
            java.util.Collection r9 = X.C17890vO.A0g(r0)
            java.lang.Integer r8 = r1.A06
            X.1OX r13 = r1.A0N
            X.5Aa r11 = new X.5Aa
            r11.<init>(r1)
            X.5Ap r12 = new X.5Ap
            r12.<init>(r1)
            X.4D9 r6 = r1.A0T()
            X.1G4 r14 = r1.A0O
            X.4Qt r5 = new X.4Qt
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        L_0x0265:
            java.lang.Object r0 = r15.A01
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r0
            X.4Pe r5 = new X.4Pe
            r5.<init>(r0)
            return r5
        L_0x026f:
            java.lang.Object r0 = r15.A01
            X.0ve r0 = (X.C18030ve) r0
            X.4Ul r5 = X.C83494Fi.A00(r0)
            return r5
        L_0x0278:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1D()
            boolean r0 = r1 instanceof X.C108785cI
            if (r0 == 0) goto L_0x028b
            r0 = 0
            X.4g3 r5 = new X.4g3
            r5.<init>(r1, r0)
            return r5
        L_0x028b:
            java.lang.String r0 = "This fragment's activity needs to implement the `ArEffectsHost` interface."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0292:
            java.lang.Object r0 = r15.A01
            X.1XL r0 = (X.AnonymousClass1XL) r0
            X.0vl r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.2iW r0 = (X.C57092iW) r0
            X.0PO r1 = r0.A00
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x02ae
        L_0x02a8:
            r0 = 1
        L_0x02a9:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x02ae:
            r0 = 0
            goto L_0x02a9
        L_0x02b0:
            java.lang.Object r1 = r15.A01
            X.4MA r1 = (X.AnonymousClass4MA) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "auto_delete_media_prefs"
            android.content.SharedPreferences r5 = r1.A05(r0)
            return r5
        L_0x02c1:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel> r0 = com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel.class
            X.1J2 r5 = r1.A00(r0)
            return r5
        L_0x02d0:
            java.lang.Object r3 = r15.A01
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r3 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r3
            X.00H r0 = r3.A07
            java.lang.Object r2 = r0.get()
            X.1og r2 = (X.C36921og) r2
            r1 = 6
            r0 = 4
            r2.A00(r1, r0)
            r3.finish()
            r5 = 0
            return r5
        L_0x02e6:
            java.lang.Object r0 = r15.A01
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r0 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r0
            boolean r0 = r0.onSearchRequested()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x02f3:
            java.lang.Object r1 = r15.A01
            X.3ho r1 = (X.C75603ho) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.graphics.drawable.LayerDrawable r5 = X.C75603ho.A08(r1, r0)
            return r5
        L_0x0300:
            java.lang.Object r1 = r15.A01
            X.3ho r1 = (X.C75603ho) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0313
            X.0vl r0 = r1.A0F
        L_0x030e:
            java.lang.Object r5 = r0.getValue()
            return r5
        L_0x0313:
            X.0vl r0 = r1.A0C
            goto L_0x030e
        L_0x0316:
            java.lang.Object r1 = r15.A01
            X.3ho r1 = (X.C75603ho) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue r0 = r1.A02
            X.0vl r0 = r0.A00
            java.lang.Object r5 = r0.getValue()
            return r5
        L_0x0327:
            java.lang.Object r1 = r15.A01
            X.3ho r1 = (X.C75603ho) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 1
            android.graphics.drawable.LayerDrawable r5 = X.C75603ho.A08(r1, r0)
            return r5
        L_0x0335:
            java.lang.Object r0 = r15.A01
            X.0ve r0 = (X.C18030ve) r0
            X.4Ul r0 = X.C83494Fi.A00(r0)
            java.util.List r9 = r0.A04
            X.4St r7 = r0.A02
            X.4Sd r8 = r0.A03
            X.5Yh r6 = r0.A01
            r10 = 2131165723(0x7f07021b, float:1.7945671E38)
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            X.4Ul r5 = new X.4Ul
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x0352:
            java.lang.Object r0 = r15.A01
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            X.3zj r1 = r0.A16
            if (r1 == 0) goto L_0x0456
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A06 = r0
            goto L_0x0456
        L_0x0362:
            java.lang.Object r0 = r15.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.1Dv r2 = X.AnonymousClass1BI.A00
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r0 = "extra_chat_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.1BI r5 = r2.A02(r0)
            return r5
        L_0x0377:
            java.lang.Object r2 = r15.A01
            X.3Uc r2 = (X.AnonymousClass3Uc) r2
            boolean r0 = r2.A08
            r0 = r0 ^ 1
            r2.A08 = r0
            X.10s r1 = r2.A10
            r0 = 24
            X.C98754rf.A00(r1, r2, r0)
            r5 = 0
            return r5
        L_0x038a:
            java.lang.Object r0 = r15.A01
            X.3p1 r0 = (X.C77033p1) r0
            X.4jl r2 = r0.A00
            r1 = 1
            X.1vp r0 = r2.A03
            X.AnonymousClass3MY.A1L(r0, r1)
            X.1GV r1 = r2.A01
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.accept(r0)
            java.lang.Runnable r0 = r2.A04
            r0.run()
            r5 = 0
            return r5
        L_0x03a7:
            java.lang.Object r2 = r15.A01
            X.4RQ r2 = (X.AnonymousClass4RQ) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            android.view.View r0 = r2.A06
            android.view.View r1 = r0.getRootView()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.C18070vi.A0z(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View$OnTouchListener r0 = r2.A05
            X.4N8 r5 = new X.4N8
            r5.<init>(r0, r1)
            return r5
        L_0x03c4:
            java.lang.Object r0 = r15.A01
            X.4VJ r0 = (X.AnonymousClass4VJ) r0
            X.0ve r1 = r0.A01
            r0 = 7527(0x1d67, float:1.0548E-41)
            java.lang.Boolean r5 = X.AnonymousClass3MZ.A15(r1, r0)
            return r5
        L_0x03d1:
            java.lang.Object r0 = r15.A01
            X.4VJ r0 = (X.AnonymousClass4VJ) r0
            X.0ve r2 = r0.A01
            r1 = 8443(0x20fb, float:1.1831E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x03e4:
            java.lang.Object r0 = r15.A01
            X.4VJ r0 = (X.AnonymousClass4VJ) r0
            X.0ve r2 = r0.A01
            r1 = 3356(0xd1c, float:4.703E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            long r0 = X.C17890vO.A03(r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L_0x03fb:
            java.lang.Object r1 = r15.A01
            X.4N8 r1 = (X.AnonymousClass4N8) r1
            r2 = 0
            X.C18070vi.A0d(r1, r2)
            android.view.ViewGroup r0 = r1.A01
            android.widget.FrameLayout r5 = X.AnonymousClass3Ma.A0B(r0)
            android.view.View$OnTouchListener r0 = r1.A00
            r5.setOnTouchListener(r0)
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r5.setLayoutParams(r0)
            r5.setBackgroundColor(r2)
            return r5
        L_0x041b:
            java.lang.Object r0 = r15.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            com.whatsapp.conversation.ConversationListView r1 = r0.A2B
            r0 = 1
            r1.A0B(r0)
            r5 = 0
            return r5
        L_0x0427:
            java.lang.Object r2 = r15.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            X.0ve r0 = r2.A3F
            boolean r0 = X.C40811vJ.A0P(r0)
            if (r0 != 0) goto L_0x0456
            X.3Pz r1 = r2.A2F
            int r0 = r1.A01
            if (r0 > 0) goto L_0x0456
            com.whatsapp.conversation.ConversationListView r0 = r2.A2B
            r0.addFooterView(r1)
            goto L_0x0456
        L_0x043f:
            java.lang.Object r2 = r15.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            X.0ve r0 = r2.A3F
            boolean r0 = X.C40811vJ.A0P(r0)
            if (r0 != 0) goto L_0x0456
            X.3Pz r1 = r2.A2F
            int r0 = r1.A01
            if (r0 > 0) goto L_0x0456
            com.whatsapp.conversation.ConversationListView r0 = r2.A2B
            r0.removeFooterView(r1)
        L_0x0456:
            r5 = 0
            return r5
        L_0x0458:
            java.lang.Object r3 = r15.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            X.00H r0 = r3.A5C
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r1 = "community-no-longer-available"
            X.1FY r0 = X.AnonymousClass3MW.A0P(r3)
            r2.A01(r0, r1)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x046e:
            java.lang.Object r5 = r15.A01
            X.4aY r5 = (X.AnonymousClass4aY) r5
            X.1E7 r0 = r5.A35
            X.1BI r3 = r0.A0J
            r4 = 1
            r2 = 0
            if (r3 != 0) goto L_0x0481
            X.190 r1 = r5.A0v
            java.lang.String r0 = "Chat Jid should not be null in GroupAdminPickerActivity"
            r1.A0G(r0, r2, r4)
        L_0x0481:
            X.1EC r3 = X.AnonymousClass3MW.A0i(r3)
            if (r3 != 0) goto L_0x048e
            X.190 r1 = r5.A0v
            java.lang.String r0 = "Group Jid should not be null in GroupAdminPickerActivity"
            r1.A0G(r0, r2, r4)
        L_0x048e:
            X.1FY r0 = X.AnonymousClass3MW.A0P(r5)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAdminPickerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "gid"
            X.AnonymousClass3MY.A13(r2, r3, r0)
            X.5cQ r1 = r5.A2Q
            r0 = 42
            r1.CNh(r2, r0)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x04ae:
            java.lang.Object r0 = r15.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.AnonymousClass4aY.A1C(r0)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x04b8:
            java.lang.Object r1 = r15.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            r0 = 0
            X.AnonymousClass4aY.A1k(r1, r0)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x04c3:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x04c8:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99144sL.invoke():java.lang.Object");
    }
}
