package X;

import android.widget.CompoundButton;

/* renamed from: X.79O  reason: invalid class name */
public class AnonymousClass79O implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass79O(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (X.C18070vi.A18(java.lang.Boolean.valueOf(r7), r1) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0178, code lost:
        X.C18070vi.A11(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017c, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017d, code lost:
        r3 = "contactAccessHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0180, code lost:
        r3 = "waPermissionsHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ca, code lost:
        r3 = "contactFormContactStorageController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r18 == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r17, boolean r18) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A00
            r7 = r18
            switch(r0) {
                case 0: goto L_0x0152;
                case 1: goto L_0x0122;
                case 2: goto L_0x00d6;
                case 3: goto L_0x00bb;
                case 4: goto L_0x0075;
                case 5: goto L_0x003d;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r1.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r2 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r2
            X.00H r0 = r2.A0H
            if (r0 == 0) goto L_0x0071
            X.6zR r0 = X.C108985cd.A0Q(r0)
            boolean r0 = r0.A01
            boolean r1 = X.AnonymousClass000.A1S(r0, r7)
            r2.A0L = r1
            r2.A0K = r1
            X.77K r0 = r2.A02
            java.lang.String r3 = "statusDistributionInfo"
            if (r0 == 0) goto L_0x0178
            int r11 = r0.A00
            java.util.List r9 = r0.A01
            java.util.List r10 = r0.A02
            boolean r12 = r0.A05
            if (r1 == 0) goto L_0x0032
            r15 = 1
            if (r18 != 0) goto L_0x0033
        L_0x0032:
            r15 = 0
        L_0x0033:
            r14 = 0
            X.77K r8 = new X.77K
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r2.A02 = r8
            return
        L_0x003d:
            java.lang.Object r2 = r1.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r2 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r2
            X.00H r0 = r2.A0H
            if (r0 == 0) goto L_0x0071
            X.6zR r0 = X.C108985cd.A0Q(r0)
            boolean r0 = r0.A00
            r9 = 1
            boolean r1 = X.AnonymousClass000.A1S(r0, r7)
            r2.A0L = r1
            r2.A0K = r1
            X.77K r0 = r2.A02
            java.lang.String r3 = "statusDistributionInfo"
            if (r0 == 0) goto L_0x0178
            int r6 = r0.A00
            java.util.List r4 = r0.A01
            java.util.List r5 = r0.A02
            boolean r8 = r0.A06
            if (r1 == 0) goto L_0x006f
            if (r18 == 0) goto L_0x006f
        L_0x0066:
            r10 = 0
            X.77K r3 = new X.77K
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.A02 = r3
            return
        L_0x006f:
            r9 = 0
            goto L_0x0066
        L_0x0071:
            java.lang.String r3 = "wfalManager"
            goto L_0x0178
        L_0x0075:
            java.lang.Object r2 = r1.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r2 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r2
            X.6ew r0 = X.C108985cd.A0Y(r2)
            java.lang.String r1 = "tap_xpost_controller"
            X.2nU r0 = r0.A00
            r0.A04(r1)
            X.1mM r1 = r2.A0A
            if (r1 == 0) goto L_0x00b7
            java.lang.Integer r0 = com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.A0Q
            java.lang.Boolean r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x009b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            boolean r1 = X.C18070vi.A18(r0, r1)
            r0 = 0
            if (r1 != 0) goto L_0x009c
        L_0x009b:
            r0 = 1
        L_0x009c:
            r2.A0K = r0
            r2.A0L = r0
            X.77K r0 = r2.A02
            java.lang.String r3 = "statusDistributionInfo"
            if (r0 == 0) goto L_0x0178
            int r6 = r0.A00
            java.util.List r4 = r0.A01
            java.util.List r5 = r0.A02
            r8 = 0
            r10 = r8
            X.77K r3 = new X.77K
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.A02 = r3
            return
        L_0x00b7:
            java.lang.String r3 = "fbAccountManager"
            goto L_0x0178
        L_0x00bb:
            java.lang.Object r2 = r1.A01
            com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity r2 = (com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity) r2
            X.00H r0 = r2.A04
            if (r0 == 0) goto L_0x011f
            X.1mM r1 = X.C108945cZ.A11(r0)
            java.lang.Integer r0 = com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity.A07
            r1.A05(r0, r7)
            X.1dR r1 = r2.A4b()
            java.lang.String r0 = "TAP_AUTO_CROSSPOST_TOGGLE"
            r1.A04(r0)
            return
        L_0x00d6:
            java.lang.Object r2 = r1.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.6ex r0 = X.C108985cd.A0Z(r2)
            java.lang.String r1 = "tap_xpost_controller"
            X.2nU r0 = r0.A00
            r0.A04(r1)
            X.5iV r1 = r2.A0G
            if (r1 != 0) goto L_0x00ed
            java.lang.String r3 = "viewModel"
            goto L_0x0178
        L_0x00ed:
            X.77K r0 = r1.A0T()
            int r6 = r0.A00
            X.77K r0 = r1.A0T()
            java.util.List r4 = r0.A01
            X.77K r0 = r1.A0T()
            java.util.List r5 = r0.A02
            X.77K r0 = r1.A0T()
            boolean r8 = r0.A06
            r9 = 0
            X.77K r3 = new X.77K
            r10 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.1DT r0 = r1.A00
            r0.A0F(r3)
            X.00H r0 = r2.A0J
            if (r0 == 0) goto L_0x011f
            X.1mM r1 = X.C108945cZ.A11(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0R
            r1.A05(r0, r7)
            return
        L_0x011f:
            java.lang.String r3 = "fbAccountManagerLazy"
            goto L_0x0178
        L_0x0122:
            java.lang.Object r2 = r1.A01
            com.whatsapp.contact.contactform.ContactFormBottomSheetFragment r2 = (com.whatsapp.contact.contactform.ContactFormBottomSheetFragment) r2
            if (r18 == 0) goto L_0x013f
            X.17x r1 = r2.A0K
            if (r1 == 0) goto L_0x0180
            X.00H r0 = r2.A0W
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1dX r0 = (X.C30191dX) r0
            boolean r0 = X.AnonymousClass743.A07(r0, r1)
            if (r0 != 0) goto L_0x013f
            r2.requestPermission()
        L_0x013f:
            X.6oP r1 = r2.A09
            if (r1 == 0) goto L_0x01ca
            X.6uL r0 = r2.A0E
            if (r0 != 0) goto L_0x014a
            java.lang.String r3 = "contactFormSyncToDeviceController"
            goto L_0x0178
        L_0x014a:
            boolean r0 = r0.A03()
            r1.A00(r0)
            return
        L_0x0152:
            java.lang.Object r4 = r1.A01
            com.whatsapp.contact.contactform.ContactFormActivity r4 = (com.whatsapp.contact.contactform.ContactFormActivity) r4
            r2 = 1
            r3 = r17
            X.C18070vi.A0d(r3, r2)
            if (r18 == 0) goto L_0x0183
            X.17x r1 = r4.A0G
            if (r1 == 0) goto L_0x0180
            X.00H r0 = r4.A0L
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1dX r0 = (X.C30191dX) r0
            boolean r0 = X.AnonymousClass743.A07(r0, r1)
            if (r0 != 0) goto L_0x01c2
            X.70L r0 = r4.A0B
            if (r0 != 0) goto L_0x01bd
            java.lang.String r3 = "contactFormSaveContactController"
        L_0x0178:
            X.C18070vi.A11(r3)
            r0 = 0
            throw r0
        L_0x017d:
            java.lang.String r3 = "contactAccessHelper"
            goto L_0x0178
        L_0x0180:
            java.lang.String r3 = "waPermissionsHelper"
            goto L_0x0178
        L_0x0183:
            java.lang.Long r0 = r4.A0Q
            if (r0 == 0) goto L_0x01c2
            long r5 = r4.A00
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01c2
            r0 = 18
            X.757 r3 = X.AnonymousClass757.A00(r3, r0)
            r0 = 8
            X.74r r2 = new X.74r
            r2.<init>(r0)
            X.3Rj r1 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131893403(0x7f121c9b, float:1.9421582E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A0k(r0)
            r0 = 2131893402(0x7f121c9a, float:1.942158E38)
            X.C108955ca.A1D(r4, r1, r0)
            r0 = 2131893334(0x7f121c56, float:1.9421442E38)
            X.C108975cc.A0n(r4, r3, r1, r0)
            r0 = 2131893394(0x7f121c92, float:1.9421563E38)
            X.C109005cf.A0J(r4, r2, r1, r0)
            goto L_0x01c2
        L_0x01bd:
            r0.A03 = r2
            r4.requestPermission()
        L_0x01c2:
            X.6oP r0 = r4.A09
            if (r0 == 0) goto L_0x01ca
            r0.A00(r7)
            return
        L_0x01ca:
            java.lang.String r3 = "contactFormContactStorageController"
            goto L_0x0178
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79O.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
