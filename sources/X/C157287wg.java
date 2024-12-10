package X;

/* renamed from: X.7wg  reason: invalid class name and case insensitive filesystem */
public final class C157287wg extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1FU $dialogActivity;
    public final /* synthetic */ Integer $entryPoint;
    public final /* synthetic */ AnonymousClass6RD $noticeType;
    public final /* synthetic */ AnonymousClass86Z $onboardingCompletedCallback;
    public final /* synthetic */ C1598286a $onboardingPreviewCallback;
    public final /* synthetic */ C1598386b $onboardingSuccessCallback;
    public final /* synthetic */ C134526qj $request;
    public final /* synthetic */ C25721Pj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157287wg(AnonymousClass1FU r2, AnonymousClass86Z r3, C1598286a r4, C1598386b r5, C25721Pj r6, C134526qj r7, AnonymousClass6RD r8, Integer num) {
        super(0);
        this.this$0 = r6;
        this.$noticeType = r8;
        this.$entryPoint = num;
        this.$dialogActivity = r2;
        this.$request = r7;
        this.$onboardingPreviewCallback = r4;
        this.$onboardingCompletedCallback = r3;
        this.$onboardingSuccessCallback = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        if (X.C1408073d.A01(r1).A05(r2) == false) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r20 = this;
            r0 = r20
            X.1Pj r2 = r0.this$0
            X.6RD r6 = r0.$noticeType
            X.6RD r5 = X.AnonymousClass6RD.META_AI_IMAGINE_ME_NUX
            r4 = 1
            if (r6 != r5) goto L_0x01e4
            X.00H r1 = r2.A05
            X.73d r1 = X.C108945cZ.A0c(r1)
            X.6RD r2 = X.AnonymousClass6RD.META_AI_IMAGINE_ME_TOS
        L_0x0013:
            X.1rq r1 = X.C1408073d.A01(r1)
            boolean r1 = r1.A05(r2)
            if (r1 != 0) goto L_0x020a
        L_0x001d:
            X.1Pj r1 = r0.this$0
            if (r4 == 0) goto L_0x01bc
            X.00H r1 = r1.A07
            java.lang.Object r4 = r1.get()
            X.1z1 r4 = (X.C42961z1) r4
            X.10I r3 = r4.A02
            r2 = 38
            X.AkC r1 = new X.AkC
            r1.<init>(r4, r2)
            r3.CGF(r1)
            X.1Pj r4 = r0.this$0
            X.6RD r3 = r0.$noticeType
            java.lang.Integer r2 = r0.$entryPoint
            X.6RD r1 = X.AnonymousClass6RD.META_AI_IMAGINE_ME_TOS
            if (r3 == r1) goto L_0x0041
            if (r3 != r5) goto L_0x006b
        L_0x0041:
            X.00H r4 = r4.A05
            X.73d r1 = X.C108945cZ.A0c(r4)
            X.1rq r1 = X.C1408073d.A01(r1)
            boolean r1 = r1.A05(r3)
            if (r1 != 0) goto L_0x006b
            if (r2 == 0) goto L_0x006b
            int r2 = r2.intValue()
            r1 = 12
            if (r2 != r1) goto L_0x006b
            X.73d r1 = X.C108945cZ.A0c(r4)
            X.1rq r1 = X.C1408073d.A01(r1)
            boolean r1 = r1.A03()
            if (r1 != 0) goto L_0x006b
            X.6RD r3 = X.AnonymousClass6RD.META_AI_SHORTCUT_TOS
        L_0x006b:
            X.6RD r11 = r0.$noticeType
            if (r3 == r11) goto L_0x008a
            X.1Pj r9 = r0.this$0
            X.1FU r5 = r0.$dialogActivity
            X.6qj r10 = r0.$request
            java.lang.Integer r12 = r0.$entryPoint
            X.86b r8 = r0.$onboardingSuccessCallback
            X.86a r7 = r0.$onboardingPreviewCallback
            X.86Z r6 = r0.$onboardingCompletedCallback
            X.7Cp r4 = new X.7Cp
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r8 = r4
            r11 = r3
            X.C25721Pj.A01(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0087:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x008a:
            X.1Pj r7 = r0.this$0
            X.1FU r6 = r0.$dialogActivity
            X.6qj r9 = r0.$request
            X.86b r5 = r0.$onboardingSuccessCallback
            X.86Z r4 = r0.$onboardingCompletedCallback
            int r1 = r11.ordinal()
            r8 = 0
            switch(r1) {
                case 0: goto L_0x00fd;
                case 1: goto L_0x00fd;
                case 2: goto L_0x00fd;
                case 3: goto L_0x00a1;
                case 4: goto L_0x00a1;
                case 5: goto L_0x00fd;
                case 6: goto L_0x00fd;
                case 7: goto L_0x00fd;
                default: goto L_0x009c;
            }
        L_0x009c:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00a1:
            X.00H r1 = r7.A06
            X.1UD r1 = X.AnonymousClass3MW.A0X(r1)
            X.0ve r3 = r1.A00
            X.0vf r2 = X.C18040vf.A01
            r1 = 11019(0x2b0b, float:1.5441E-41)
            boolean r1 = X.C18020vd.A05(r2, r3, r1)
            if (r1 != 0) goto L_0x00fd
            if (r9 == 0) goto L_0x00fb
            android.os.Parcelable r2 = r9.A01
        L_0x00b7:
            boolean r1 = r2 instanceof X.C115935w5
            if (r1 == 0) goto L_0x00d3
            X.5w5 r2 = (X.C115935w5) r2
            if (r2 == 0) goto L_0x00d3
            X.1BI r3 = r2.A02
            int r2 = r2.A00
            android.os.Bundle r8 = X.C17880vN.A0D()
            if (r3 == 0) goto L_0x00ce
            java.lang.String r1 = "argument_chat_jid"
            X.AnonymousClass3MY.A15(r8, r3, r1)
        L_0x00ce:
            java.lang.String r1 = "argument_action_source"
            r8.putInt(r1, r2)
        L_0x00d3:
            com.whatsapp.bot.metaai.imagineme.ImagineMeConsentBottomSheet r1 = new com.whatsapp.bot.metaai.imagineme.ImagineMeConsentBottomSheet
            r1.<init>()
            r1.A1R(r8)
            r6.CMl(r1)
            X.1GP r3 = r6.getSupportFragmentManager()
            X.7A7 r2 = new X.7A7
            r2.<init>(r4, r5, r7, r11)
            java.lang.String r1 = "CUSTOM_TOS_UI_REQUEST_KEY"
            r3.A0t(r2, r6, r1)
            X.86a r1 = r0.$onboardingPreviewCallback
            if (r1 == 0) goto L_0x00f3
            r1.CAi()
        L_0x00f3:
            X.1Pj r0 = r0.this$0
            X.1KB r0 = r0.A01
            r0.A04()
            goto L_0x0087
        L_0x00fb:
            r2 = r8
            goto L_0x00b7
        L_0x00fd:
            X.1Pj r1 = r0.this$0
            X.00H r1 = r1.A05
            X.73d r2 = X.C108945cZ.A0c(r1)
            X.6RD r1 = r0.$noticeType
            java.lang.Integer r2 = r2.A04(r1)
            X.86a r1 = r0.$onboardingPreviewCallback
            if (r1 == 0) goto L_0x0112
            r1.CAi()
        L_0x0112:
            X.1Pj r1 = r0.this$0
            X.1KB r1 = r1.A01
            r1.A04()
            if (r2 != 0) goto L_0x013e
            X.6RD r1 = r0.$noticeType
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L_0x012c;
                case 1: goto L_0x0129;
                case 2: goto L_0x012f;
                case 3: goto L_0x013b;
                case 4: goto L_0x0143;
                case 5: goto L_0x0132;
                case 6: goto L_0x0138;
                case 7: goto L_0x0135;
                default: goto L_0x0124;
            }
        L_0x0124:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0129:
            X.6RZ r1 = X.AnonymousClass6RZ.AGENT_TOS
            goto L_0x0145
        L_0x012c:
            X.6RZ r1 = X.AnonymousClass6RZ.INVOKE_TOS
            goto L_0x0145
        L_0x012f:
            X.6RZ r1 = X.AnonymousClass6RZ.META_AI_SHORTCUT_TOS
            goto L_0x0145
        L_0x0132:
            X.6RZ r1 = X.AnonymousClass6RZ.AI_STUDIO_TOS
            goto L_0x0145
        L_0x0135:
            X.6RZ r1 = X.AnonymousClass6RZ.META_AI_SHORTCUT_BR_TOS
            goto L_0x0145
        L_0x0138:
            X.6RZ r1 = X.AnonymousClass6RZ.INVOKE_BR_TOS
            goto L_0x0145
        L_0x013b:
            X.6RZ r1 = X.AnonymousClass6RZ.IMAGINE_ME_NUX
            goto L_0x0145
        L_0x013e:
            int r8 = r2.intValue()
            goto L_0x0148
        L_0x0143:
            X.6RZ r1 = X.AnonymousClass6RZ.IMAGINE_ME_TOS
        L_0x0145:
            long r1 = r1.noticeId
            int r8 = (int) r1
        L_0x0148:
            X.1Pj r7 = r0.this$0
            X.1FU r4 = r0.$dialogActivity
            X.86b r6 = r0.$onboardingSuccessCallback
            X.86Z r5 = r0.$onboardingCompletedCallback
            X.6RD r12 = r0.$noticeType
            java.lang.Integer r13 = r0.$entryPoint
            X.00H r2 = r7.A08
            java.lang.Object r1 = r2.get()
            X.1pH r1 = (X.C37291pH) r1
            X.1iv r1 = r1.A01     // Catch:{ IllegalArgumentException -> 0x0165 }
            boolean r1 = r1.A08(r8)     // Catch:{ IllegalArgumentException -> 0x0165 }
            if (r1 == 0) goto L_0x016a
            goto L_0x0196
        L_0x0165:
            java.lang.String r1 = "PrivacyDisclosureLauncher/isDisclosureAccepted disclosure doesn't exist"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x016a:
            java.lang.Object r14 = r2.get()
            X.1pH r14 = (X.C37291pH) r14
            java.lang.Integer r18 = java.lang.Integer.valueOf(r8)
            X.7wU r3 = new X.7wU
            r3.<init>(r4, r5, r6, r7, r8)
            X.7i1 r2 = new X.7i1
            r2.<init>(r5)
            X.7wV r8 = new X.7wV
            r9 = r5
            r10 = r6
            r11 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            X.7Kv r1 = new X.7Kv
            r1.<init>(r3, r2, r8)
            X.6wZ r16 = X.C138126wZ.A05
            r19 = 0
            r15 = r4
            r17 = r1
            r14.A02(r15, r16, r17, r18, r19)
            goto L_0x01a4
        L_0x0196:
            X.00H r1 = r7.A05
            X.73d r1 = X.C108945cZ.A0c(r1)
            r1.A05(r8)
            X.1KB r1 = r7.A01
            r1.A04()
        L_0x01a4:
            X.1Pj r1 = r0.this$0
            X.18K r3 = r1.A04
            X.2Hl r2 = new X.2Hl
            r2.<init>()
            java.lang.Integer r1 = r0.$entryPoint
            r0 = 32
            X.C108945cZ.A1M(r2, r0)
            X.AnonymousClass3MZ.A1T(r2, r1)
            r3.CC7(r2)
            goto L_0x0087
        L_0x01bc:
            X.1KB r1 = r1.A01
            r1.A04()
            X.1Pj r1 = r0.this$0
            X.00H r1 = r1.A05
            X.73d r2 = X.C108945cZ.A0c(r1)
            X.6RD r1 = r0.$noticeType
            boolean r1 = r2.A0A(r1)
            if (r1 == 0) goto L_0x01e1
            X.6R9 r4 = X.AnonymousClass6R9.ALREADY_ACCEPTED
        L_0x01d3:
            X.1Pj r5 = r0.this$0
            X.1FU r1 = r0.$dialogActivity
            X.86b r3 = r0.$onboardingSuccessCallback
            X.86Z r2 = r0.$onboardingCompletedCallback
            r6 = 0
            X.C25721Pj.A02(r1, r2, r3, r4, r5, r6)
            goto L_0x0087
        L_0x01e1:
            X.6R9 r4 = X.AnonymousClass6R9.ACCEPT_NOT_NEEDED
            goto L_0x01d3
        L_0x01e4:
            X.00H r3 = r2.A05
            X.73d r1 = X.C108945cZ.A0c(r3)
            boolean r1 = r1.A0A(r6)
            if (r1 != 0) goto L_0x020a
            X.0vb r1 = r2.A02
            java.lang.String r2 = r1.A04()
            java.lang.String r1 = "US"
            boolean r1 = X.C18070vi.A18(r2, r1)
            if (r1 == 0) goto L_0x001d
            X.6RD r1 = X.AnonymousClass6RD.META_AI_SHORTCUT_TOS
            if (r6 != r1) goto L_0x001d
            X.73d r1 = X.C108945cZ.A0c(r3)
            X.6RD r2 = X.AnonymousClass6RD.INVOKE_TOS
            goto L_0x0013
        L_0x020a:
            r4 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157287wg.invoke():java.lang.Object");
    }
}
