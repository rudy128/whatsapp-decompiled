package X;

/* renamed from: X.4sK  reason: invalid class name and case insensitive filesystem */
public class C99134sK implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C99134sK(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static C18100vl A00(Integer num, Object obj, Object obj2, int i) {
        return AnonymousClass1DF.A00(num, new C99134sK(obj, obj2, i));
    }

    /* JADX WARNING: type inference failed for: r1v29, types: [java.lang.Object, X.4O8] */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r4 = r3.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0454, code lost:
        r2 = new X.C99454sq(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0465, code lost:
        return X.AnonymousClass4Z7.A01(java.lang.Boolean.valueOf(r4), r3, r2, X.C99654tF.A00());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r18 = this;
            r5 = r18
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0548;
                case 1: goto L_0x010f;
                case 2: goto L_0x04d3;
                case 3: goto L_0x0466;
                case 4: goto L_0x0429;
                case 5: goto L_0x03fd;
                case 6: goto L_0x03d1;
                case 7: goto L_0x0389;
                case 8: goto L_0x034e;
                case 9: goto L_0x032d;
                case 10: goto L_0x02e5;
                case 11: goto L_0x02d5;
                case 12: goto L_0x02ae;
                case 13: goto L_0x00da;
                case 14: goto L_0x0292;
                case 15: goto L_0x0256;
                case 16: goto L_0x01e2;
                case 17: goto L_0x018e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r3 = r5.A02
            X.3Ri r3 = (X.C73193Ri) r3
            r0 = 2131433416(0x7f0b17c8, float:1.8488617E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x00d5
            r0 = 2131436287(0x7f0b22ff, float:1.849444E38)
            android.view.ViewGroup r6 = X.AnonymousClass3MW.A0D(r1, r0)
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x00c0
            int r0 = r3.A00
            if (r0 == 0) goto L_0x00c0
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources r2 = r4.getResources()
            int r1 = r3.A00
            android.content.res.Resources$Theme r0 = r4.getTheme()
            android.graphics.drawable.Drawable r8 = X.C40501uo.A00(r0, r2, r1)
            if (r8 == 0) goto L_0x00c0
            X.C18070vi.A0b(r6)
            r9 = 0
            r6.setVisibility(r9)
            r0 = 2131436242(0x7f0b22d2, float:1.8494349E38)
            android.view.View r3 = r6.findViewById(r0)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            int r0 = r3.getPaddingLeft()
            X.C72463Mc.A14(r3, r0, r9)
            r2 = 17
            r3.setGravity(r2)
            r0 = 2131427746(0x7f0b01a2, float:1.8477117E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r3, r0)
            r1.setGravity(r2)
            r0 = 1
            r1.setTextAlignment(r0)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L_0x0187
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.gravity = r2
            r1.setLayoutParams(r0)
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0079
            r9 = 1
        L_0x0079:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131627553(0x7f0e0e21, float:1.8882374E38)
            android.view.View r7 = X.AnonymousClass3MY.A0D(r1, r0)
            r0 = 2131431501(0x7f0b104d, float:1.8484733E38)
            android.view.View r5 = r7.findViewById(r0)
            int r4 = r5.getPaddingLeft()
            int r3 = r5.getPaddingTop()
            int r2 = r5.getPaddingRight()
            android.content.Context r0 = X.AnonymousClass3MY.A04(r5)
            if (r9 == 0) goto L_0x00d8
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131169533(0x7f0710fd, float:1.7953399E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x00a8:
            r5.setPadding(r4, r3, r2, r0)
            r0 = 2131427759(0x7f0b01af, float:1.8477143E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0H(r7, r0)
            r0.setImageDrawable(r8)
            r2 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r2, r0)
            r0 = 0
            r6.addView(r7, r0, r1)
        L_0x00c0:
            X.C18070vi.A0b(r6)
            r0 = 2131436242(0x7f0b22d2, float:1.8494349E38)
            android.view.View r1 = r6.findViewById(r0)
            r0 = 2131427746(0x7f0b01a2, float:1.8477117E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 1
            X.AnonymousClass1Y5.A0A(r1, r0)
        L_0x00d5:
            X.1Wu r6 = X.C27621Wu.A00
        L_0x00d7:
            return r6
        L_0x00d8:
            r0 = 0
            goto L_0x00a8
        L_0x00da:
            java.lang.Object r3 = r5.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet r3 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet) r3
            java.lang.Object r2 = r5.A02
            android.view.View r2 = (android.view.View) r2
            boolean r0 = com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet.A01(r3)
            if (r0 != 0) goto L_0x00d5
            X.0vl r1 = r3.A0S
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r0 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r0
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x00fb
            X.11C r0 = r3.A02
            if (r0 == 0) goto L_0x05aa
            X.AnonymousClass4a5.A01(r2, r0)
        L_0x00fb:
            java.lang.Object r1 = r1.getValue()
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r1 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r1
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x00d5
            r0 = 1
            r1.A07 = r0
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A03(r1)
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A00(r1)
            goto L_0x00d5
        L_0x010f:
            java.lang.Object r2 = r5.A01
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r2 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r2
            java.lang.Object r3 = r5.A02
            X.5Wi r3 = (X.C106565Wi) r3
            r1 = 0
            X.4D9 r0 = r2.A0T()
            int r0 = X.AnonymousClass4ZO.A00(r0)
            X.1Oc r1 = X.C28851b7.A08(r1, r0)
            int r0 = X.C200510q.A00(r1)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x0131:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r1 = r5.next()
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            boolean r0 = r2 instanceof X.C75603ho
            if (r0 == 0) goto L_0x017d
            r0 = r2
            X.3ho r0 = (X.C75603ho) r0
            X.5Wh r10 = r0.A05
            X.5Yi r9 = r0.A04
            X.5Wk r11 = r0.A06
        L_0x014e:
            X.1OX r13 = r2.A0N
            r4 = r3
            X.4hY r4 = (X.C92574hY) r4
            int r0 = r4.A00
            java.lang.Object r4 = r4.A01
            if (r0 == 0) goto L_0x0172
            X.1pS r4 = (X.C37391pS) r4
            X.1pR r0 = r4.A01
            X.4Qs r8 = r0.A01()
            X.10E r0 = r4.A00
        L_0x0163:
            X.00S r0 = r0.ABc
            X.00H r12 = X.C000200d.A00(r0)
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r7 = new com.whatsapp.areffects.viewmodel.session.ArEffectSession
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r6.put(r1, r7)
            goto L_0x0131
        L_0x0172:
            X.1K2 r4 = (X.AnonymousClass1K2) r4
            X.1K1 r0 = r4.A00
            X.4Qs r8 = r0.A06()
            X.10E r0 = r4.A01
            goto L_0x0163
        L_0x017d:
            r0 = r2
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r0
            X.5Wh r10 = r0.A03
            X.5Yi r9 = r0.A02
            X.5Wk r11 = r0.A04
            goto L_0x014e
        L_0x0187:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x018e:
            java.lang.Object r4 = r5.A01
            com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel r4 = (com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel) r4
            java.lang.Object r3 = r5.A02
            X.00H r3 = (X.AnonymousClass00H) r3
            X.C18070vi.A0h(r4, r3)
            X.1G4 r8 = r4.A06
            X.00H r7 = r4.A03
            java.lang.Object r0 = r7.get()
            X.4bI r0 = (X.AnonymousClass4bI) r0
            X.0vl r0 = r0.A06
            X.1Fz r1 = X.AnonymousClass3MX.A18(r0)
            r2 = 0
            com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$1 r0 = new com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$1
            r0.<init>(r3, r2)
            X.4ss r1 = X.AnonymousClass4Z8.A00(r0, r8, r1)
            com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$2 r0 = new com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$2
            r0.<init>(r4, r2)
            X.DXs r6 = X.AnonymousClass3MZ.A0L(r0, r1)
            X.1OX r5 = X.C41561wd.A00(r4)
            X.5cA r4 = X.AnonymousClass4ZC.A00
            java.lang.Object r3 = X.C18070vi.A0E(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r7.get()
            X.4bI r0 = (X.AnonymousClass4bI) r0
            X.4Cd r2 = r0.A00()
            java.lang.Object r1 = r8.getValue()
            java.lang.String r1 = (java.lang.String) r1
            X.Cm7 r0 = new X.Cm7
            r0.<init>(r2, r3, r1)
            X.1jt r6 = X.AnonymousClass4Z7.A01(r0, r5, r6, r4)
            return r6
        L_0x01e2:
            java.lang.Object r4 = r5.A01
            com.whatsapp.profile.viewmodel.UsernameShareViewModel r4 = (com.whatsapp.profile.viewmodel.UsernameShareViewModel) r4
            java.lang.Object r8 = r5.A02
            X.11S r8 = (X.AnonymousClass11S) r8
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.1G4 r3 = r4.A06
            X.00H r7 = r4.A04
            java.lang.Object r0 = r7.get()
            X.4bI r0 = (X.AnonymousClass4bI) r0
            X.0vl r0 = r0.A05
            X.1Fz r2 = X.AnonymousClass3MX.A18(r0)
            java.lang.Object r0 = r7.get()
            X.4bI r0 = (X.AnonymousClass4bI) r0
            X.0vl r0 = r0.A07
            X.1Fz r1 = X.AnonymousClass3MX.A18(r0)
            X.5Ae r0 = X.AnonymousClass5Ae.A00
            X.4sr r2 = X.AnonymousClass4Z8.A01(r0, r3, r2, r1)
            r1 = 0
            com.whatsapp.profile.viewmodel.UsernameShareViewModel$usernameShareViewState$2$3 r0 = new com.whatsapp.profile.viewmodel.UsernameShareViewModel$usernameShareViewState$2$3
            r0.<init>(r4, r1)
            X.DXs r6 = X.AnonymousClass3MZ.A0L(r0, r2)
            X.1OX r5 = X.C41561wd.A00(r4)
            X.5cA r4 = X.AnonymousClass4ZC.A00
            java.lang.String r3 = r8.A0C()
            java.lang.Object r0 = r7.get()
            X.4bI r0 = (X.AnonymousClass4bI) r0
            X.0vl r0 = r0.A04
            android.content.SharedPreferences r1 = X.C18070vi.A03(r0)
            java.lang.String r0 = "username_pin"
            java.lang.String r2 = X.C17880vN.A0r(r1, r0)
            if (r2 != 0) goto L_0x023a
            java.lang.String r2 = ""
        L_0x023a:
            java.lang.Object r0 = r7.get()
            X.4bI r0 = (X.AnonymousClass4bI) r0
            X.0vl r0 = r0.A04
            android.content.SharedPreferences r1 = X.C18070vi.A03(r0)
            java.lang.String r0 = "username_share_include_pin"
            boolean r1 = X.AnonymousClass3MX.A1T(r1, r0)
            X.Cb2 r0 = new X.Cb2
            r0.<init>(r3, r2, r1)
            X.1jt r6 = X.AnonymousClass4Z7.A01(r0, r5, r6, r4)
            return r6
        L_0x0256:
            java.lang.Object r4 = r5.A01
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel r4 = (com.whatsapp.profile.viewmodel.UsernamePinSetViewModel) r4
            java.lang.Object r1 = r5.A02
            X.0uU r1 = (X.C17330uU) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.lang.Object r3 = r1.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1G4 r1 = r4.A06
            X.9I3 r0 = X.AnonymousClass9I3.LOADING
            r1.setValue(r0)
            X.1G4 r0 = r4.A07
            r2 = 0
            r0.setValue(r2)
            X.1OB r0 = r4.A00
            if (r0 == 0) goto L_0x0280
            r0.BEM(r2)
        L_0x0280:
            X.1OX r1 = X.C41561wd.A00(r4)
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel$setNewPin$1 r0 = new com.whatsapp.profile.viewmodel.UsernamePinSetViewModel$setNewPin$1
            r0.<init>(r4, r3, r2)
            X.1e4 r0 = X.AnonymousClass3MY.A0s(r0, r1)
            r4.A00 = r0
            X.1Wu r6 = X.C27621Wu.A00
            return r6
        L_0x0292:
            java.lang.Object r0 = r5.A01
            X.6BF r0 = (X.AnonymousClass6BF) r0
            java.lang.Object r2 = r5.A02
            android.content.Context r2 = (android.content.Context) r2
            X.C18070vi.A0h(r0, r2)
            X.4Kj r0 = r0.getConversationBubbleResolverFactory()
            X.10I r1 = r0.A00
            X.DOp r0 = new X.DOp
            r0.<init>(r2, r1)
            X.3lu r6 = new X.3lu
            r6.<init>(r0)
            return r6
        L_0x02ae:
            java.lang.Object r3 = r5.A01
            X.1Di r3 = (X.C22821Di) r3
            java.lang.Object r2 = r5.A02
            X.4Oz r2 = (X.C85854Oz) r2
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.4O8 r1 = new X.4O8
            r1.<init>()
            r3.invoke(r1)
            java.lang.Integer r0 = r1.A02
            r2.A02 = r0
            java.lang.Integer r0 = r1.A01
            r2.A01 = r0
            java.lang.Boolean r0 = r1.A00
            r2.A00 = r0
            java.lang.Integer r0 = r1.A03
            r2.A03 = r0
            X.1Wu r6 = X.C27621Wu.A00
            return r6
        L_0x02d5:
            java.lang.Object r2 = r5.A01
            X.190 r2 = (X.AnonymousClass190) r2
            java.lang.Object r1 = r5.A02
            X.5Zg r1 = (X.C107325Zg) r1
            java.lang.String r0 = "DeviceCredentialsAuthPlugin"
            X.3S4 r6 = new X.3S4
            r6.<init>(r2, r1, r0)
            return r6
        L_0x02e5:
            java.lang.Object r1 = r5.A01
            X.0vd r1 = (X.C18020vd) r1
            java.lang.Object r4 = r5.A02
            r15 = 1
            X.C18070vi.A0d(r4, r15)
            X.4VF r3 = X.C83504Fj.A00()
            r0 = 9836(0x266c, float:1.3783E-41)
            java.lang.String r0 = r1.A0I(r0)
            X.C18070vi.A0X(r0)
            X.4DE r7 = X.AnonymousClass4DE.valueOf(r0)
            r2 = 2131231917(0x7f0804ad, float:1.8079929E38)
            r0 = 100
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.4Su r9 = new X.4Su
            r9.<init>(r0, r2)
            r0 = 27
            X.4sL r11 = new X.4sL
            r11.<init>(r4, r0)
            java.util.List r10 = r3.A05
            r13 = 200(0xc8, double:9.9E-322)
            X.4Su r8 = r3.A04
            r12 = 2131102698(0x7f060bea, float:1.7817841E38)
            r0 = 9
            X.C18070vi.A0d(r7, r0)
            r17 = r15
            X.4VF r6 = new X.4VF
            r16 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r16, r17)
            return r6
        L_0x032d:
            java.lang.Object r0 = r5.A01
            X.4Wo r0 = (X.C87694Wo) r0
            java.lang.Object r3 = r5.A02
            X.1OX r3 = (X.AnonymousClass1OX) r3
            X.C18070vi.A0h(r0, r3)
            X.1G4 r1 = r0.A03
            r0 = 6
            X.4sq r2 = new X.4sq
            r2.<init>(r1, r0)
            X.4tF r1 = X.C99654tF.A00()
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.1jt r6 = X.AnonymousClass4Z7.A01(r0, r3, r2, r1)
            return r6
        L_0x034e:
            java.lang.Object r0 = r5.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r3 = r5.A02
            X.1OX r3 = (X.AnonymousClass1OX) r3
            boolean r4 = X.C72453Mb.A1Z(r3)
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0362:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0374
            java.lang.Object r0 = r1.next()
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r0 = (com.whatsapp.areffects.viewmodel.session.ArEffectSession) r0
            X.1G4 r0 = r0.A08
            r2.add(r0)
            goto L_0x0362
        L_0x0374:
            java.lang.Object[] r2 = X.C72463Mc.A1b(r2, r4)
            r0 = 5
            X.4sq r1 = new X.4sq
            r1.<init>(r2, r0)
            X.4sU r0 = new X.4sU
            r0.<init>(r4)
            X.4sq r2 = X.AnonymousClass4I6.A00(r0, r1)
            goto L_0x0459
        L_0x0389:
            java.lang.Object r0 = r5.A01
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r6 = r5.A02
            X.1OX r6 = (X.AnonymousClass1OX) r6
            boolean r5 = X.C72453Mb.A1Z(r6)
            java.util.ArrayList r4 = X.C72453Mb.A11(r0)
            java.util.Iterator r3 = X.AnonymousClass000.A15(r0)
        L_0x039d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03bc
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r3)
            java.lang.Object r0 = r2.getValue()
            X.4S8 r0 = (X.AnonymousClass4S8) r0
            X.0vl r0 = r0.A00
            java.lang.Object r1 = r0.getValue()
            X.4sr r0 = new X.4sr
            r0.<init>(r1, r2, r5)
            r4.add(r0)
            goto L_0x039d
        L_0x03bc:
            java.lang.Object[] r1 = X.C72463Mc.A1b(r4, r5)
            r0 = 4
            X.4sq r2 = new X.4sq
            r2.<init>(r1, r0)
            X.4tF r1 = X.C99654tF.A00()
            X.1Om r0 = X.C25511Om.A00
            X.1jt r6 = X.AnonymousClass4Z7.A01(r0, r6, r2, r1)
            return r6
        L_0x03d1:
            java.lang.Object r0 = r5.A01
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r3 = r5.A02
            X.1OX r3 = (X.AnonymousClass1OX) r3
            boolean r4 = X.C72453Mb.A1Z(r3)
            java.util.ArrayList r2 = X.C72453Mb.A11(r0)
            java.util.Iterator r1 = X.AnonymousClass000.A15(r0)
        L_0x03e5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03f7
            java.lang.Object r0 = X.C17890vO.A0P(r1)
            X.4S8 r0 = (X.AnonymousClass4S8) r0
            X.1G4 r0 = r0.A03
            r2.add(r0)
            goto L_0x03e5
        L_0x03f7:
            java.lang.Object[] r1 = X.C72463Mc.A1b(r2, r4)
            r0 = 2
            goto L_0x0454
        L_0x03fd:
            java.lang.Object r0 = r5.A01
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r3 = r5.A02
            X.1OX r3 = (X.AnonymousClass1OX) r3
            boolean r4 = X.C72453Mb.A1Z(r3)
            java.util.ArrayList r2 = X.C72453Mb.A11(r0)
            java.util.Iterator r1 = X.AnonymousClass000.A15(r0)
        L_0x0411:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0423
            java.lang.Object r0 = X.C17890vO.A0P(r1)
            X.4S8 r0 = (X.AnonymousClass4S8) r0
            X.1G4 r0 = r0.A03
            r2.add(r0)
            goto L_0x0411
        L_0x0423:
            java.lang.Object[] r1 = X.C72463Mc.A1b(r2, r4)
            r0 = 3
            goto L_0x0454
        L_0x0429:
            java.lang.Object r0 = r5.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r3 = r5.A02
            X.1OX r3 = (X.AnonymousClass1OX) r3
            boolean r4 = X.C72453Mb.A1Z(r3)
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x043d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x044f
            java.lang.Object r0 = r1.next()
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r0 = (com.whatsapp.areffects.viewmodel.session.ArEffectSession) r0
            X.1G4 r0 = r0.A08
            r2.add(r0)
            goto L_0x043d
        L_0x044f:
            java.lang.Object[] r1 = X.C72463Mc.A1b(r2, r4)
            r0 = 1
        L_0x0454:
            X.4sq r2 = new X.4sq
            r2.<init>(r1, r0)
        L_0x0459:
            X.4tF r1 = X.C99654tF.A00()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.1jt r6 = X.AnonymousClass4Z7.A01(r0, r3, r2, r1)
            return r6
        L_0x0466:
            java.lang.Object r6 = r5.A01
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r6 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r6
            java.lang.Object r5 = r5.A02
            com.whatsapp.areffects.util.ArEffectsGatingUtil r5 = (com.whatsapp.areffects.util.ArEffectsGatingUtil) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            boolean r1 = r6 instanceof X.C75603ho
            if (r1 == 0) goto L_0x04bb
            r0 = r6
            X.3ho r0 = (X.C75603ho) r0
            X.0vl r0 = r0.A09
        L_0x047b:
            java.lang.Object r4 = r0.getValue()
            X.4Ul r4 = (X.C87144Ul) r4
            if (r1 == 0) goto L_0x04b5
            r0 = r6
            X.3ho r0 = (X.C75603ho) r0
            X.0vl r0 = r0.A09
        L_0x0488:
            java.lang.Object r0 = r0.getValue()
            X.4Ul r0 = (X.C87144Ul) r0
            java.util.List r0 = r0.A04
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x0498:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04c1
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4V6 r0 = (X.AnonymousClass4V6) r0
            X.4DE r1 = r0.A01
            X.4D9 r0 = r6.A0T()
            boolean r0 = r5.A03(r1, r0)
            if (r0 == 0) goto L_0x0498
            r10.add(r2)
            goto L_0x0498
        L_0x04b5:
            r0 = r6
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r0
            X.0vl r0 = r0.A0B
            goto L_0x0488
        L_0x04bb:
            r0 = r6
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r0
            X.0vl r0 = r0.A0B
            goto L_0x047b
        L_0x04c1:
            int r11 = r4.A00
            X.4St r8 = r4.A02
            X.4Sd r9 = r4.A03
            X.5Yh r7 = r4.A01
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            X.4Ul r6 = new X.4Ul
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x04d3:
            java.lang.Object r6 = r5.A01
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r6 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r6
            java.lang.Object r5 = r5.A02
            com.whatsapp.areffects.util.ArEffectsGatingUtil r5 = (com.whatsapp.areffects.util.ArEffectsGatingUtil) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            boolean r1 = r6 instanceof X.C75603ho
            if (r1 == 0) goto L_0x0526
            r0 = r6
            X.3ho r0 = (X.C75603ho) r0
            X.0vl r0 = r0.A0A
        L_0x04e8:
            java.lang.Object r3 = r0.getValue()
            X.4VF r3 = (X.AnonymousClass4VF) r3
            if (r1 == 0) goto L_0x0520
            r0 = r6
            X.3ho r0 = (X.C75603ho) r0
            X.0vl r0 = r0.A0A
        L_0x04f5:
            java.lang.Object r0 = r0.getValue()
            X.4VF r0 = (X.AnonymousClass4VF) r0
            java.util.List r0 = r0.A05
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r0.iterator()
        L_0x0505:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x052c
            java.lang.Object r2 = r4.next()
            r1 = r2
            X.4DE r1 = (X.AnonymousClass4DE) r1
            X.4D9 r0 = r6.A0T()
            boolean r0 = r5.A03(r1, r0)
            if (r0 == 0) goto L_0x0505
            r10.add(r2)
            goto L_0x0505
        L_0x0520:
            r0 = r6
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r0
            X.0vl r0 = r0.A0C
            goto L_0x04f5
        L_0x0526:
            r0 = r6
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r0
            X.0vl r0 = r0.A0C
            goto L_0x04e8
        L_0x052c:
            boolean r15 = r3.A08
            long r13 = r3.A01
            boolean r1 = r3.A07
            int r12 = r3.A00
            X.4Su r8 = r3.A04
            X.4Su r9 = r3.A03
            X.0vk r11 = r3.A06
            boolean r0 = r3.A09
            X.4DE r7 = r3.A02
            X.4VF r6 = new X.4VF
            r16 = r1
            r17 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r16, r17)
            return r6
        L_0x0548:
            java.lang.Object r4 = r5.A01
            X.1Fh r4 = (X.C23251Fh) r4
            java.lang.Object r2 = r5.A02
            android.content.Intent r2 = (android.content.Intent) r2
            X.00H r0 = r4.A07
            X.1Il r0 = X.AnonymousClass3MX.A0j(r0)
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0574
            int r1 = r4.A00
            r0 = -1
            if (r1 == r0) goto L_0x0574
            X.00H r0 = r4.A07
            X.1Il r0 = X.AnonymousClass3MX.A0j(r0)
            android.content.Intent r1 = r0.A01(r4, r2)
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0579
            r4.startActivity(r1)
        L_0x0574:
            java.lang.Boolean r6 = X.AnonymousClass000.A0i()
            return r6
        L_0x0579:
            r4.A4c()
            r4.A4d()
            r4.setIntent(r2)
            X.1GP r1 = r4.getSupportFragmentManager()
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0574
            boolean r0 = r1.A0F
            if (r0 != 0) goto L_0x0574
            boolean r0 = r1.A0z()
            if (r0 != 0) goto L_0x0574
            com.whatsapp.ConversationFragment r3 = new com.whatsapp.ConversationFragment
            r3.<init>()
            X.1jj r2 = X.AnonymousClass3Ma.A0H(r4)
            int r1 = r4.A00
            java.lang.String r0 = "com.whatsapp.HomeActivity.ConversationFragment"
            r2.A0C(r3, r0, r1)
            r2.A03()
            goto L_0x0574
        L_0x05aa:
            X.AnonymousClass3MW.A1N()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99134sK.invoke():java.lang.Object");
    }
}
