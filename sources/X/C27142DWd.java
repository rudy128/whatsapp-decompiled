package X;

/* renamed from: X.DWd  reason: case insensitive filesystem */
public class C27142DWd implements C18080vj, AnonymousClass1OS {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x021d, code lost:
        r6.CNR();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            r3 = r15
            r6 = r14
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0221;
                case 1: goto L_0x0197;
                case 2: goto L_0x0135;
                case 3: goto L_0x0108;
                case 4: goto L_0x00db;
                case 5: goto L_0x00ae;
                case 6: goto L_0x0081;
                case 7: goto L_0x0054;
                case 8: goto L_0x0029;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r13.A01
            X.4WX r2 = (X.AnonymousClass4WX) r2
            java.lang.Number r6 = (java.lang.Number) r6
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            int r0 = X.AnonymousClass3MY.A03(r6)
            int r1 = X.AnonymousClass4WX.A00(r2, r0)
            int r0 = X.AnonymousClass3MY.A03(r3)
            int r0 = X.AnonymousClass4WX.A00(r2, r0)
            int r1 = r1 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0029:
            X.0tn r6 = (X.C17130tn) r6
            int r0 = X.AnonymousClass000.A0M(r15)
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L_0x003a
            boolean r0 = r6.BZO()
            if (r0 != 0) goto L_0x021d
        L_0x003a:
            java.lang.Object r1 = r13.A01
            com.whatsapp.profile.fragments.UsernameStartConversationWithSettingsFragment r1 = (com.whatsapp.profile.fragments.UsernameStartConversationWithSettingsFragment) r1
            X.0vl r0 = r1.A01
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel r2 = (com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel) r2
            X.0vl r0 = r1.A00
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernameNavigationViewModel r1 = (com.whatsapp.profile.viewmodel.UsernameNavigationViewModel) r1
            r0 = 0
            X.CDG.A00(r6, r1, r2, r0)
            goto L_0x023f
        L_0x0054:
            X.0tn r6 = (X.C17130tn) r6
            int r0 = X.AnonymousClass000.A0M(r15)
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L_0x0065
            boolean r0 = r6.BZO()
            if (r0 != 0) goto L_0x021d
        L_0x0065:
            java.lang.Object r1 = r13.A01
            com.whatsapp.profile.fragments.UsernameShareFragment r1 = (com.whatsapp.profile.fragments.UsernameShareFragment) r1
            X.0vl r0 = r1.A01
            java.lang.Object r9 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernameShareViewModel r9 = (com.whatsapp.profile.viewmodel.UsernameShareViewModel) r9
            X.0vl r0 = r1.A00
            java.lang.Object r8 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernameNavigationViewModel r8 = (com.whatsapp.profile.viewmodel.UsernameNavigationViewModel) r8
            r10 = 0
            r11 = 1
            r7 = 0
            X.CDL.A00(r6, r7, r8, r9, r10, r11)
            goto L_0x023f
        L_0x0081:
            X.0tn r6 = (X.C17130tn) r6
            int r0 = X.AnonymousClass000.A0M(r15)
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L_0x0092
            boolean r0 = r6.BZO()
            if (r0 != 0) goto L_0x021d
        L_0x0092:
            java.lang.Object r1 = r13.A01
            com.whatsapp.profile.fragments.UsernameSetFragment r1 = (com.whatsapp.profile.fragments.UsernameSetFragment) r1
            X.0vl r0 = r1.A01
            java.lang.Object r9 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernameSetViewModel r9 = (com.whatsapp.profile.viewmodel.UsernameSetViewModel) r9
            X.0vl r0 = r1.A00
            java.lang.Object r8 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernameNavigationViewModel r8 = (com.whatsapp.profile.viewmodel.UsernameNavigationViewModel) r8
            r10 = 0
            r11 = 1
            r7 = 0
            X.CDK.A00(r6, r7, r8, r9, r10, r11)
            goto L_0x023f
        L_0x00ae:
            X.0tn r6 = (X.C17130tn) r6
            int r0 = X.AnonymousClass000.A0M(r15)
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L_0x00bf
            boolean r0 = r6.BZO()
            if (r0 != 0) goto L_0x021d
        L_0x00bf:
            java.lang.Object r1 = r13.A01
            com.whatsapp.profile.fragments.UsernamePinSetFragment r1 = (com.whatsapp.profile.fragments.UsernamePinSetFragment) r1
            X.0vl r0 = r1.A01
            java.lang.Object r9 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel r9 = (com.whatsapp.profile.viewmodel.UsernamePinSetViewModel) r9
            X.0vl r0 = r1.A00
            java.lang.Object r8 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernameNavigationViewModel r8 = (com.whatsapp.profile.viewmodel.UsernameNavigationViewModel) r8
            r10 = 0
            r11 = 1
            r7 = 0
            X.C25422CfU.A00(r6, r7, r8, r9, r10, r11)
            goto L_0x023f
        L_0x00db:
            X.0tn r6 = (X.C17130tn) r6
            int r0 = X.AnonymousClass000.A0M(r15)
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L_0x00ec
            boolean r0 = r6.BZO()
            if (r0 != 0) goto L_0x021d
        L_0x00ec:
            java.lang.Object r1 = r13.A01
            com.whatsapp.profile.fragments.UsernamePinManagementFragment r1 = (com.whatsapp.profile.fragments.UsernamePinManagementFragment) r1
            X.0vl r0 = r1.A01
            java.lang.Object r9 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel r9 = (com.whatsapp.profile.viewmodel.UsernamePinSetViewModel) r9
            X.0vl r0 = r1.A00
            java.lang.Object r8 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernameNavigationViewModel r8 = (com.whatsapp.profile.viewmodel.UsernameNavigationViewModel) r8
            r10 = 0
            r11 = 4
            r7 = 0
            X.C25894Co5.A00(r6, r7, r8, r9, r10, r11)
            goto L_0x023f
        L_0x0108:
            X.0tn r6 = (X.C17130tn) r6
            int r0 = X.AnonymousClass000.A0M(r15)
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L_0x0119
            boolean r0 = r6.BZO()
            if (r0 != 0) goto L_0x021d
        L_0x0119:
            java.lang.Object r1 = r13.A01
            com.whatsapp.profile.fragments.UsernameManagementFragment r1 = (com.whatsapp.profile.fragments.UsernameManagementFragment) r1
            X.0vl r0 = r1.A01
            java.lang.Object r9 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernameSettingsViewModel r9 = (com.whatsapp.profile.viewmodel.UsernameSettingsViewModel) r9
            X.0vl r0 = r1.A00
            java.lang.Object r8 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernameNavigationViewModel r8 = (com.whatsapp.profile.viewmodel.UsernameNavigationViewModel) r8
            r10 = 0
            r11 = 1
            r7 = 0
            X.C25893Co4.A00(r6, r7, r8, r9, r10, r11)
            goto L_0x023f
        L_0x0135:
            X.0tn r6 = (X.C17130tn) r6
            int r0 = X.AnonymousClass000.A0M(r15)
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L_0x0146
            boolean r0 = r6.BZO()
            if (r0 != 0) goto L_0x021d
        L_0x0146:
            r0 = 1444925660(0x561fd0dc, float:4.3929848E13)
            r6.COB(r0)
            java.lang.Object r5 = r13.A01
            boolean r0 = r6.BEh(r5)
            java.lang.Object r4 = r6.CER()
            if (r0 != 0) goto L_0x015c
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r4 != r0) goto L_0x0166
        L_0x015c:
            r0 = 22
            X.4sN r4 = new X.4sN
            r4.<init>(r5, r0)
            r6.CRH(r4)
        L_0x0166:
            X.0vk r4 = (X.C18090vk) r4
            r3 = r6
            X.0VR r3 = (X.AnonymousClass0VR) r3
            r2 = 0
            X.AnonymousClass0VR.A0R(r3, r2)
            r0 = 1444930047(0x561fe1ff, float:4.3948249E13)
            r6.COB(r0)
            boolean r0 = r6.BEh(r5)
            java.lang.Object r1 = r6.CER()
            if (r0 != 0) goto L_0x0183
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r1 != r0) goto L_0x018d
        L_0x0183:
            r0 = 23
            X.4sN r1 = new X.4sN
            r1.<init>(r5, r0)
            r6.CRH(r1)
        L_0x018d:
            X.0vk r1 = (X.C18090vk) r1
            X.AnonymousClass0VR.A0R(r3, r2)
            X.CDI.A00(r6, r4, r1, r2, r2)
            goto L_0x023f
        L_0x0197:
            X.0tn r6 = (X.C17130tn) r6
            int r0 = X.AnonymousClass000.A0M(r15)
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L_0x01a8
            boolean r0 = r6.BZO()
            if (r0 != 0) goto L_0x021d
        L_0x01a8:
            r0 = -1834278217(0xffffffff92ab22b7, float:-1.0800175E-27)
            r6.COB(r0)
            java.lang.Object r2 = r13.A01
            boolean r0 = r6.BEh(r2)
            java.lang.Object r8 = r6.CER()
            if (r0 != 0) goto L_0x01be
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r8 != r0) goto L_0x01c8
        L_0x01be:
            r0 = 19
            X.4sN r8 = new X.4sN
            r8.<init>(r2, r0)
            r6.CRH(r8)
        L_0x01c8:
            X.0vk r8 = (X.C18090vk) r8
            r1 = r6
            X.0VR r1 = (X.AnonymousClass0VR) r1
            r11 = 0
            X.AnonymousClass0VR.A0R(r1, r11)
            r0 = -1834274138(0xffffffff92ab32a6, float:-1.0804103E-27)
            r6.COB(r0)
            boolean r0 = r6.BEh(r2)
            java.lang.Object r9 = r6.CER()
            if (r0 != 0) goto L_0x01e5
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r9 != r0) goto L_0x01ef
        L_0x01e5:
            r0 = 20
            X.4sN r9 = new X.4sN
            r9.<init>(r2, r0)
            r6.CRH(r9)
        L_0x01ef:
            X.0vk r9 = (X.C18090vk) r9
            X.AnonymousClass0VR.A0R(r1, r11)
            r0 = -1834271637(0xffffffff92ab3c6b, float:-1.0806511E-27)
            r6.COB(r0)
            boolean r0 = r6.BEh(r2)
            java.lang.Object r10 = r6.CER()
            if (r0 != 0) goto L_0x0208
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r10 != r0) goto L_0x0212
        L_0x0208:
            r0 = 21
            X.4sN r10 = new X.4sN
            r10.<init>(r2, r0)
            r6.CRH(r10)
        L_0x0212:
            X.0vk r10 = (X.C18090vk) r10
            X.AnonymousClass0VR.A0R(r1, r11)
            r12 = 1
            r7 = 0
            X.CDH.A00(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x023f
        L_0x021d:
            r6.CNR()
            goto L_0x023f
        L_0x0221:
            java.lang.Object r0 = r13.A01
            com.whatsapp.labelitem.view.bottomsheet.AddToListFragment r0 = (com.whatsapp.labelitem.view.bottomsheet.AddToListFragment) r0
            int r5 = X.AnonymousClass000.A0M(r14)
            java.lang.String r3 = (java.lang.String) r3
            r6 = 2
            X.C18070vi.A0d(r3, r6)
            com.whatsapp.labelitem.view.AddToListViewModel r2 = X.AnonymousClass3MY.A0c(r0)
            java.lang.String r4 = r0.A0D
            X.10I r0 = r2.A0D
            X.3CA r1 = new X.3CA
            r1.<init>(r2, r3, r4, r5, r6)
            r0.CGF(r1)
        L_0x023f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27142DWd.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public C27142DWd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
