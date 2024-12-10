package X;

/* renamed from: X.7Pd  reason: invalid class name and case insensitive filesystem */
public class C146447Pd implements Runnable {
    public final int A00;
    public final Object A01;

    public C146447Pd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: com.whatsapp.inappsupport.ui.ContactUsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: com.whatsapp.identity.IdentityVerificationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: com.whatsapp.inappsupport.ui.ContactUsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: com.whatsapp.inappsupport.ui.ContactUsActivity} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027f, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0282, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x058f, code lost:
        r0 = "contextualHelpHandler";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05e0, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0651, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0698, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.A00
            switch(r0) {
                case 1: goto L_0x04fa;
                case 2: goto L_0x0661;
                case 3: goto L_0x05e3;
                case 4: goto L_0x04dd;
                case 5: goto L_0x0007;
                case 6: goto L_0x04d5;
                case 7: goto L_0x04bd;
                case 8: goto L_0x04ae;
                case 9: goto L_0x0283;
                case 10: goto L_0x0593;
                case 11: goto L_0x049e;
                case 12: goto L_0x0490;
                case 13: goto L_0x047e;
                case 14: goto L_0x0267;
                case 15: goto L_0x0565;
                case 16: goto L_0x0472;
                case 17: goto L_0x0014;
                case 18: goto L_0x024f;
                case 19: goto L_0x046a;
                case 20: goto L_0x023c;
                case 21: goto L_0x0462;
                case 22: goto L_0x0229;
                case 23: goto L_0x0436;
                case 24: goto L_0x042c;
                case 25: goto L_0x0645;
                case 26: goto L_0x0421;
                case 27: goto L_0x03e3;
                case 28: goto L_0x0216;
                case 29: goto L_0x03b1;
                case 30: goto L_0x053d;
                case 31: goto L_0x0529;
                case 32: goto L_0x01e7;
                case 33: goto L_0x03a8;
                case 34: goto L_0x03a2;
                case 35: goto L_0x0392;
                case 36: goto L_0x02fc;
                case 37: goto L_0x00d7;
                case 38: goto L_0x00bf;
                case 39: goto L_0x02f4;
                case 40: goto L_0x02ec;
                case 41: goto L_0x02e0;
                case 42: goto L_0x02d8;
                case 43: goto L_0x006a;
                case 44: goto L_0x02ce;
                case 45: goto L_0x0054;
                case 46: goto L_0x0044;
                case 47: goto L_0x0291;
                case 48: goto L_0x0033;
                case 49: goto L_0x0015;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r1.A01
            com.whatsapp.identity.IdentityVerificationActivity r2 = (com.whatsapp.identity.IdentityVerificationActivity) r2
            X.1o3 r1 = r2.A0A
            if (r1 == 0) goto L_0x058f
            java.lang.String r0 = "about-e2e-encryption"
        L_0x0011:
            r1.A01(r2, r0)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r2 = r1.A01
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r2 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r2
            boolean r0 = r2.A0a
            if (r0 != 0) goto L_0x0014
            X.Ccm r0 = r2.A06
            if (r0 == 0) goto L_0x0014
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r1 = r0.A02
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0014
            X.Ccm r0 = r2.A06
            r0.A04()
            return
        L_0x0033:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.util.List r0 = X.C42011xT.A0I
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L_0x0014
            r0 = 1
            r1.setSoftInputMode(r0)
            return
        L_0x0044:
            java.lang.Object r0 = r1.A01
            X.7I8 r0 = (X.AnonymousClass7I8) r0
            X.897 r1 = r0.A00
            if (r1 == 0) goto L_0x0014
            X.6ti r0 = r0.A02
            com.whatsapp.jid.UserJid r0 = r0.A03
            r1.C7J(r0)
            return
        L_0x0054:
            java.lang.Object r0 = r1.A01
            X.37n r0 = (X.C695237n) r0
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.2ji r0 = (X.C57832ji) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "RemoveSelfMappingOnMeObjectObserver/cleanUp self mapping"
            goto L_0x027f
        L_0x006a:
            java.lang.Object r0 = r1.A01
            X.7Es r0 = (X.C143767Es) r0
            X.1Q0 r7 = r0.A00
            X.1Nd r0 = r7.A01
            java.util.ArrayList r1 = r0.A07()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0014
            X.63E r6 = new X.63E
            r6.<init>()
            X.0z4 r0 = r7.A02
            boolean r0 = r0.A2R()
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)
            r6.A00 = r0
            java.util.Iterator r9 = r1.iterator()
            r8 = 0
            r5 = 0
            r4 = 0
            r3 = 0
        L_0x0095:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0503
            X.1BI r2 = X.C17880vN.A0Q(r9)
            X.1CJ r0 = r7.A03
            int r0 = r0.A03(r2)
            boolean r1 = X.AnonymousClass000.A1R(r0)
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A00(r2)
            if (r0 == 0) goto L_0x00b8
            int r8 = r8 + 1
            if (r1 == 0) goto L_0x0095
            int r4 = r4 + 1
            goto L_0x0095
        L_0x00b8:
            int r5 = r5 + 1
            if (r1 == 0) goto L_0x0095
            int r3 = r3 + 1
            goto L_0x0095
        L_0x00bf:
            java.lang.Object r3 = r1.A01
            com.whatsapp.labelitem.view.bottomsheet.AddToListFragment r3 = (com.whatsapp.labelitem.view.bottomsheet.AddToListFragment) r3
            r2 = 0
            androidx.core.widget.NestedScrollView r1 = r3.A00
            if (r1 == 0) goto L_0x00cf
            int r0 = r1.getBottom()
            r1.scrollTo(r2, r0)
        L_0x00cf:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A08
            if (r0 == 0) goto L_0x0014
            r0.requestFocus()
            return
        L_0x00d7:
            java.lang.Object r4 = r1.A01
            com.whatsapp.labelitem.view.AddToListViewModel r4 = (com.whatsapp.labelitem.view.AddToListViewModel) r4
            X.6is r1 = r4.A00
            if (r1 == 0) goto L_0x0521
            X.00H r0 = r1.A04
            boolean r0 = X.C72453Mb.A1W(r0)
            if (r0 == 0) goto L_0x0197
            X.00H r0 = r1.A03
            java.lang.Object r8 = r0.get()
            com.whatsapp.lists.ListsRepository r8 = (com.whatsapp.lists.ListsRepository) r8
            java.util.Collection r7 = r1.A05
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r0 = 0
            com.whatsapp.lists.ListsRepository$getCompleteLabelInfoListForJidsWithCheckmarks$lists$1 r1 = new com.whatsapp.lists.ListsRepository$getCompleteLabelInfoListForJidsWithCheckmarks$lists$1
            r1.<init>(r8, r0)
            X.1OR r0 = X.AnonymousClass1OR.A00
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x010b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.1x1 r0 = (X.C41761x1) r0
            int r1 = r0.A02
            if (r1 == 0) goto L_0x011f
            r0 = 4
            if (r1 != r0) goto L_0x010b
        L_0x011f:
            r9.add(r2)
            goto L_0x010b
        L_0x0123:
            X.00H r0 = r8.A05
            java.lang.Object r0 = r0.get()
            X.1NH r0 = (X.AnonymousClass1NH) r0
            java.util.HashMap r6 = r0.A00(r7, r9)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r9.iterator()
        L_0x0137:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01cc
            java.lang.Object r2 = r3.next()
            X.1x1 r2 = (X.C41761x1) r2
            int r1 = r2.A02
            r0 = 4
            if (r1 != r0) goto L_0x018d
            X.00H r0 = r8.A04
            java.lang.Object r0 = r0.get()
            com.whatsapp.favorite.FavoriteManager r0 = (com.whatsapp.favorite.FavoriteManager) r0
            X.0vl r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            boolean r0 = r7.isEmpty()
            r9 = 0
            if (r0 != 0) goto L_0x0187
            java.util.Iterator r11 = r7.iterator()
            r10 = 0
        L_0x0164:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = r11.next()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0164
            int r10 = r10 + 1
            if (r10 >= 0) goto L_0x0164
            X.AnonymousClass1ZU.A0A()
            goto L_0x0697
        L_0x017d:
            if (r10 == 0) goto L_0x0187
            int r0 = r7.size()
            r9 = 2
            if (r10 != r0) goto L_0x0187
            r9 = 1
        L_0x0187:
            X.4TZ r0 = new X.4TZ
            r0.<init>(r2, r9)
            goto L_0x0193
        L_0x018d:
            java.lang.Object r0 = r6.get(r2)
            if (r0 == 0) goto L_0x0137
        L_0x0193:
            r5.add(r0)
            goto L_0x0137
        L_0x0197:
            X.1NH r5 = r1.A01
            java.util.Collection r3 = r1.A05
            X.1NA r0 = r5.A00
            java.util.ArrayList r2 = r0.A08()
            r1 = 15
            X.4sU r0 = new X.4sU
            r0.<init>(r1)
            java.util.List r0 = X.C29431cG.A0z(r2, r0)
            java.util.HashMap r2 = r5.A00(r3, r0)
            java.util.ArrayList r5 = X.AnonymousClass000.A14(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x01b8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01cc
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x01b8
            r5.add(r0)
            goto L_0x01b8
        L_0x01cc:
            X.1DT r0 = r4.A02
            r0.A0E(r5)
            X.11S r0 = r4.A06
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0014
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0014
            X.1wy r1 = r4.A09
            X.1Wu r0 = X.C27621Wu.A00
            r1.A0E(r0)
            return
        L_0x01e7:
            java.lang.Object r4 = r1.A01
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r4 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r4
            java.util.ArrayList r0 = r4.A0F
            java.util.Iterator r3 = r0.iterator()
        L_0x01f1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0205
            X.1BI r2 = X.C17880vN.A0Q(r3)
            java.util.ArrayList r1 = r4.A0E
            X.1M9 r0 = r4.A02
            if (r0 == 0) goto L_0x0525
            X.AnonymousClass3MY.A1O(r0, r2, r1)
            goto L_0x01f1
        L_0x0205:
            X.1FL r2 = r4.A1B()
            if (r2 == 0) goto L_0x0014
            r1 = 31
            X.7Pd r0 = new X.7Pd
            r0.<init>(r4, r1)
            r2.runOnUiThread(r0)
            return
        L_0x0216:
            java.lang.Object r2 = r1.A01
            X.7CL r2 = (X.AnonymousClass7CL) r2
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A01
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x0014
            X.1VC r0 = r2.A00
            r0.A00()
            return
        L_0x0229:
            java.lang.Object r1 = r1.A01
            X.683 r1 = (X.AnonymousClass683) r1
            X.A99 r0 = r1.A00
            if (r0 == 0) goto L_0x0014
            X.1V7 r0 = r1.A02
            r0.A02(r1)
            r0 = 0
            r1.A00 = r0
            r1.A01 = r0
            return
        L_0x023c:
            java.lang.Object r1 = r1.A01
            X.8v0 r1 = (X.C173398v0) r1
            X.A99 r0 = r1.A00
            if (r0 == 0) goto L_0x0014
            X.1V7 r0 = r1.A03
            r0.A02(r1)
            r0 = 0
            r1.A00 = r0
            r1.A01 = r0
            return
        L_0x024f:
            java.lang.Object r1 = r1.A01
            X.1pD r1 = (X.C37251pD) r1
            X.1kk r0 = r1.A00
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0014
            X.1pB r2 = r1.A02
            r1 = 1
            X.7Id r0 = new X.7Id
            r0.<init>(r1)
            X.C37231pB.A00(r0, r2)
            return
        L_0x0267:
            java.lang.Object r0 = r1.A01
            X.7FG r0 = (X.AnonymousClass7FG) r0
            java.lang.Object r2 = r0.A01
            X.6uc r2 = (X.C136916uc) r2
            X.1NN r1 = r2.A07
            X.1Nk r0 = r2.A06
            r1.unregisterObserver(r0)
            r0 = 0
            boolean r0 = r2.A04(r0)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "SupportContactUsPresenter/convoObserver, unexpectedly did not redirect"
        L_0x027f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0283:
            java.lang.Object r2 = r1.A01
            com.whatsapp.inappsupport.ui.ContactUsActivity r2 = (com.whatsapp.inappsupport.ui.ContactUsActivity) r2
            X.00H r0 = r2.A0Q
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "information-collection-when-contact-support"
            goto L_0x0011
        L_0x0291:
            java.lang.Object r2 = r1.A01
            X.7I8 r2 = (X.AnonymousClass7I8) r2
            X.6bz r0 = r2.A03
            X.6ti r8 = r2.A02
            X.6b2 r0 = r0.A00
            X.10H r0 = r0.A00
            X.10E r1 = r0.A00
            X.0ve r7 = X.AnonymousClass10E.A8r(r1)
            X.00S r0 = r1.ABB
            java.lang.Object r10 = r0.get()
            X.11W r10 = (X.AnonymousClass11W) r10
            X.181 r4 = X.C108965cb.A0H(r1)
            X.118 r5 = X.AnonymousClass3MZ.A0l(r1)
            X.0z4 r6 = X.AnonymousClass3Ma.A0c(r1)
            X.00H r11 = X.C108945cZ.A14(r1)
            X.10G r0 = r1.A00
            X.00S r12 = r0.A2y
            X.00S r13 = r0.A2z
            X.1fq r9 = X.C108955ca.A0X(r1)
            X.67e r3 = new X.67e
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3.CBv(r2)
            return
        L_0x02ce:
            java.lang.Object r0 = r1.A01
            X.2EI r0 = (X.AnonymousClass2EI) r0
            X.2nN r0 = r0.A01
            r0.A02()
            return
        L_0x02d8:
            java.lang.Object r0 = r1.A01
            X.1jT r0 = (X.C33841jT) r0
            r0.A07()
            return
        L_0x02e0:
            java.lang.Object r0 = r1.A01
            X.1WP r0 = (X.AnonymousClass1WP) r0
            X.00H r0 = r0.A09
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            return
        L_0x02ec:
            java.lang.Object r0 = r1.A01
            X.2Ko r0 = (X.C47942Ko) r0
            r0.A02()
            return
        L_0x02f4:
            java.lang.Object r0 = r1.A01
            com.whatsapp.lastseen.PresencePrivacyActivity r0 = (com.whatsapp.lastseen.PresencePrivacyActivity) r0
            com.whatsapp.lastseen.PresencePrivacyActivity.A0Q(r0)
            return
        L_0x02fc:
            java.lang.Object r2 = r1.A01
            X.6ny r2 = (X.C132986ny) r2
            r4 = 0
            java.util.ArrayList r5 = X.C108955ca.A16(r2, r4)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.List r0 = r2.A05
            java.util.Iterator r7 = r0.iterator()
        L_0x030f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x036d
            java.lang.Object r6 = r7.next()
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.11S r0 = r2.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 == 0) goto L_0x0343
            X.1P3 r0 = r2.A01
            X.1PJ r0 = r0.A01
            X.2cG r0 = r0.A03()
            X.2kO r1 = r0.A01
        L_0x0331:
            if (r1 == 0) goto L_0x0352
            java.lang.String r0 = r6.user
            r5.add(r0)
            X.1jP r0 = r1.A00
            byte[] r0 = r0.A00
            X.C18070vi.A0X(r0)
            r3.add(r0)
            goto L_0x030f
        L_0x0343:
            X.1P3 r1 = r2.A01
            com.whatsapp.jid.DeviceJid r0 = r6.getPrimaryDevice()
            X.2nE r0 = X.C63962tz.A02(r0)
            X.2kO r1 = r1.A0D(r0)
            goto L_0x0331
        L_0x0352:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "deviceidentityverifier/verify Primary identity key is null for user: "
            r1.append(r0)
            java.lang.String r0 = r6.user
            r1.append(r0)
            java.lang.String r0 = ", failing verification"
            X.C17890vO.A19(r1, r0)
            X.87K r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r1.BpN(r0)
            return
        L_0x036d:
            X.6yc r6 = r2.A03
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r7 = r5.toArray(r0)
            byte[][] r0 = new byte[r4][]
            java.lang.Object[] r8 = r3.toArray(r0)
            X.87K r0 = r2.A02
            X.6eA r9 = new X.6eA
            r9.<init>(r0, r6)
            java.util.Arrays.toString(r7)
            X.10I r0 = r6.A04
            r10 = 45
            X.3Cr r5 = new X.3Cr
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (int) r10)
            r0.CGF(r5)
            return
        L_0x0392:
            java.lang.Object r0 = r1.A01
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r0 = (com.whatsapp.jobqueue.job.RotateSignedPreKeyJob) r0
            X.1P3 r1 = r0.A00
            byte[] r0 = r0.id
            int r0 = X.A8G.A00(r0)
            r1.A0R(r0)
            return
        L_0x03a2:
            java.lang.Object r0 = r1.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x03a8:
            java.lang.Object r1 = r1.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setEnabled(r0)
            return
        L_0x03b1:
            java.lang.Object r2 = r1.A01
            X.4NQ r2 = (X.AnonymousClass4NQ) r2
            r0 = 1
            X.2tN[] r4 = new X.C63592tN[r0]
            r0 = 20240306(0x134d7b2, float:3.3215532E-38)
            r3 = 20240306(0x134d7b2, float:3.3215532E-38)
            X.2tN r1 = new X.2tN
            r1.<init>(r0)
            r0 = 0
            r4[r0] = r1
            X.00H r2 = r2.A02
            java.lang.Object r0 = r2.get()
            X.1pH r0 = (X.C37291pH) r0
            r0.A04(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.List r1 = X.C18070vi.A0M(r0)
            java.lang.Object r0 = r2.get()
            X.1pH r0 = (X.C37291pH) r0
            r0.A03(r1)
            return
        L_0x03e3:
            java.lang.Object r15 = r1.A01
            com.whatsapp.instrumentation.ui.SendLogsAsEmailActivity r15 = (com.whatsapp.instrumentation.ui.SendLogsAsEmailActivity) r15
            X.118 r0 = r15.A01
            android.content.Context r0 = r0.A00
            android.content.Context r2 = r0.getApplicationContext()
            java.lang.String r1 = "origin"
            java.lang.String r0 = "MWA"
            android.util.Pair r3 = android.util.Pair.create(r1, r0)
            X.707 r1 = r15.A03
            r4 = 0
            r13 = 0
            r9 = -1
            r6 = r4
            r7 = r4
            r8 = r4
            r5 = r4
            r11 = r9
            android.util.Pair r0 = r1.A01(r2, r3, r4, r5, r6, r7, r8, r9, r11, r13)
            X.6pG r14 = r15.A00
            java.lang.Object r0 = r0.first
            java.io.File r0 = (java.io.File) r0
            java.lang.String r20 = "WhatsApp logs for MWA rageshake report"
            java.lang.String r17 = "WhatsApp logs"
            r19 = r4
            r21 = r4
            r16 = r0
            r18 = r4
            r22 = r13
            r14.A01(r15, r16, r17, r18, r19, r20, r21, r22)
            r15.finish()
            return
        L_0x0421:
            java.lang.Object r1 = r1.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 2131891405(0x7f1214cd, float:1.941753E38)
            r1.CNA(r0)
            return
        L_0x042c:
            java.lang.Object r1 = r1.A01
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity r1 = (com.whatsapp.instrumentation.ui.InstrumentationAuthActivity) r1
            java.lang.String r0 = r1.A0H
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity.A0Q(r1, r0)
            return
        L_0x0436:
            java.lang.Object r3 = r1.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r3.CEx()
            X.3Rj r2 = X.AnonymousClass4a6.A00(r3)
            r1 = 2131891402(0x7f1214ca, float:1.9417523E38)
            r0 = 0
            r2.A0g(r3, r0, r1)
            r1 = 30
            X.7AO r0 = new X.7AO
            r0.<init>(r3, r1)
            r2.A0d(r3, r0)
            r0 = 2131891404(0x7f1214cc, float:1.9417527E38)
            r2.A0E(r0)
            r0 = 2131891403(0x7f1214cb, float:1.9417525E38)
            r2.A0D(r0)
            r2.A0C()
            return
        L_0x0462:
            java.lang.Object r0 = r1.A01
            X.6Fx r0 = (X.AnonymousClass6Fx) r0
            r0.A05()
            return
        L_0x046a:
            java.lang.Object r0 = r1.A01
            X.6lz r0 = (X.C131986lz) r0
            r0.A00()
            return
        L_0x0472:
            r0 = -4
            android.os.Process.setThreadPriority(r0)
            com.whatsapp.util.NativeUtils.mprotectCode()
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            return
        L_0x047e:
            java.lang.Object r0 = r1.A01
            X.7IH r0 = (X.AnonymousClass7IH) r0
            X.6uc r2 = r0.A00
            X.1NN r1 = r2.A07
            X.1Nk r0 = r2.A06
            r1.unregisterObserver(r0)
            r0 = 1
            r2.A04(r0)
            return
        L_0x0490:
            java.lang.Object r0 = r1.A01
            X.7IH r0 = (X.AnonymousClass7IH) r0
            X.6uc r0 = r0.A00
            X.121 r1 = r0.A08
            X.1BI r0 = r0.A01
            r1.BBj(r0)
            return
        L_0x049e:
            java.lang.Object r2 = r1.A01
            com.whatsapp.inappsupport.ui.SupportAiViewModel r2 = (com.whatsapp.inappsupport.ui.SupportAiViewModel) r2
            X.1NN r1 = r2.A07
            X.1Nk r0 = r2.A06
            r1.unregisterObserver(r0)
            r0 = 1
            com.whatsapp.inappsupport.ui.SupportAiViewModel.A00(r2, r0)
            return
        L_0x04ae:
            java.lang.Object r1 = r1.A01
            X.6e8 r1 = (X.C127306e8) r1
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.89p r0 = r1.A00
            r0.BoT()
            return
        L_0x04bd:
            java.lang.Object r0 = r1.A01
            X.7LK r0 = (X.AnonymousClass7LK) r0
            X.6e8 r4 = r0.A00
            java.lang.String r3 = "onSuccess called but ticketId is null"
            r2 = -1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onError, errorCode="
            X.C17900vP.A0i(r0, r1, r2)
            X.89p r0 = r4.A00
            r0.BoU(r2, r3)
            return
        L_0x04d5:
            java.lang.Object r0 = r1.A01
            com.whatsapp.identity.IdentityVerificationActivity r0 = (com.whatsapp.identity.IdentityVerificationActivity) r0
            com.whatsapp.identity.IdentityVerificationActivity.A0r(r0)
            return
        L_0x04dd:
            java.lang.Object r4 = r1.A01
            com.whatsapp.identity.IdentityVerificationActivity r4 = (com.whatsapp.identity.IdentityVerificationActivity) r4
            r3 = 0
            com.whatsapp.identity.IdentityVerificationActivity.A0q(r4)
            X.0z4 r0 = r4.A0A
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "security_notifications"
            X.C17880vN.A1F(r1, r0, r2)
            X.1KB r1 = r4.A05
            r0 = 2131897776(0x7f122db0, float:1.9430451E38)
            r1.A08(r0, r3)
            return
        L_0x04fa:
            java.lang.Object r1 = r1.A01
            com.whatsapp.identity.IdentityVerificationActivity r1 = (com.whatsapp.identity.IdentityVerificationActivity) r1
            r0 = 1
            com.whatsapp.identity.IdentityVerificationActivity.A0w(r1, r0)
            return
        L_0x0503:
            java.lang.Long r0 = X.C17880vN.A0n(r8)
            r6.A01 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r5)
            r6.A02 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r4)
            r6.A03 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r3)
            r6.A04 = r0
            X.18K r0 = r7.A04
            r0.CC7(r6)
            return
        L_0x0521:
            java.lang.String r0 = "addToListManager"
            goto L_0x0651
        L_0x0525:
            java.lang.String r0 = "contactManager"
            goto L_0x0651
        L_0x0529:
            java.lang.Object r0 = r1.A01
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r0 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r0
            X.3Wn r1 = r0.A08
            if (r1 != 0) goto L_0x0535
            java.lang.String r0 = "inviteeAdapter"
            goto L_0x0651
        L_0x0535:
            java.util.ArrayList r0 = r0.A0E
            r1.A00 = r0
            r1.notifyDataSetChanged()
            return
        L_0x053d:
            java.lang.Object r2 = r1.A01
            com.whatsapp.interopui.setting.InteropSettingsOptinFragment r2 = (com.whatsapp.interopui.setting.InteropSettingsOptinFragment) r2
            java.lang.String r1 = "916543719558426"
            X.129 r0 = r2.A02
            if (r0 == 0) goto L_0x0561
            android.net.Uri r1 = r0.A03(r1)
            X.C18070vi.A0X(r1)
            X.00H r0 = r2.A05
            if (r0 == 0) goto L_0x05e0
            r0.get()
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r1)
            X.1FL r0 = r2.A1D()
            r0.startActivity(r1)
            return
        L_0x0561:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x0651
        L_0x0565:
            java.lang.Object r3 = r1.A01
            com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet r3 = (com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet) r3
            X.00H r0 = r3.A05
            if (r0 == 0) goto L_0x058f
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r1 = r3.A1D()
            java.lang.String r0 = "safely-communicating-with-whatsapp-support"
            r2.A01(r1, r0)
            X.00H r0 = r3.A06
            if (r0 == 0) goto L_0x058b
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.1mP r2 = (X.C35541mP) r2
            r1 = 0
            r0 = 8
            r2.A02(r0, r1)
            return
        L_0x058b:
            java.lang.String r0 = "supportLogger"
            goto L_0x0651
        L_0x058f:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x0651
        L_0x0593:
            java.lang.Object r6 = r1.A01
            com.whatsapp.inappsupport.ui.SupportAiActivity r6 = (com.whatsapp.inappsupport.ui.SupportAiActivity) r6
            X.1LU r0 = r6.A00
            if (r0 == 0) goto L_0x05e0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.SupportAiActivity.supportUserContext"
            android.os.Parcelable r5 = r1.getParcelableExtra(r0)
            java.lang.String r4 = "SupportAi:fallback:email"
            r3 = 0
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.from"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus"
            r2.putExtra(r0, r3)
            if (r5 == 0) goto L_0x05c6
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.supportUserContext"
            r2.putExtra(r0, r5)
        L_0x05c6:
            r0 = 1
            r6.A3q(r2, r0)
            X.00H r0 = r6.A03
            if (r0 == 0) goto L_0x05da
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1mP r1 = (X.C35541mP) r1
            r0 = 18
            r1.A02(r0, r3)
            return
        L_0x05da:
            java.lang.String r0 = "supportLogger"
            X.C18070vi.A11(r0)
            throw r3
        L_0x05e0:
            java.lang.String r0 = "waIntents"
            goto L_0x0651
        L_0x05e3:
            java.lang.Object r3 = r1.A01
            com.whatsapp.identity.IdentityVerificationActivity r3 = (com.whatsapp.identity.IdentityVerificationActivity) r3
            r1 = 0
            android.widget.ImageView r0 = r3.A02
            java.lang.String r4 = "resultView"
            if (r0 == 0) goto L_0x0641
            r0.setFocusable(r1)
            android.widget.ImageView r0 = r3.A02
            if (r0 == 0) goto L_0x0641
            r0.setFocusableInTouchMode(r1)
            android.widget.ImageView r1 = r3.A02
            if (r1 == 0) goto L_0x0641
            r0 = 8
            r1.setVisibility(r0)
            r10 = 1
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r10)
            r11 = 1056964608(0x3f000000, float:0.5)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            android.view.animation.ScaleAnimation r5 = new android.view.animation.ScaleAnimation
            r8 = r6
            r9 = r7
            r12 = r10
            r13 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r6, r7)
            r2.addAnimation(r5)
            r2.addAnimation(r0)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
            r2.setInterpolator(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 17694721(0x10e0001, float:2.6081284E-38)
            int r0 = r1.getInteger(r0)
            long r0 = (long) r0
            r2.setDuration(r0)
            android.widget.ImageView r0 = r3.A02
            if (r0 == 0) goto L_0x0641
            r0.startAnimation(r2)
            return
        L_0x0641:
            X.C18070vi.A11(r4)
            goto L_0x0697
        L_0x0645:
            java.lang.Object r0 = r1.A01
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity r0 = (com.whatsapp.instrumentation.ui.InstrumentationAuthActivity) r0
            com.whatsapp.instrumentation.ui.VerificationCodeFragment r3 = r0.A0A
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x0655
            java.lang.String r0 = "verificationCode"
        L_0x0651:
            X.C18070vi.A11(r0)
            goto L_0x0697
        L_0x0655:
            r1 = 1
            X.41z r0 = new X.41z
            r0.<init>(r2, r1)
            r3.A00 = r0
            com.whatsapp.instrumentation.ui.VerificationCodeFragment.A00(r3)
            return
        L_0x0661:
            java.lang.Object r3 = r1.A01
            com.whatsapp.identity.IdentityVerificationActivity r3 = (com.whatsapp.identity.IdentityVerificationActivity) r3
            r2 = 0
            r5 = 1
            r6 = 0
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = r5
            r11 = r5
            r12 = r6
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r7 = r5
            r8 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
            r4.setInterpolator(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.setDuration(r0)
            android.view.View r0 = r3.A01
            java.lang.String r1 = "securityNotificationView"
            if (r0 == 0) goto L_0x0694
            r0.startAnimation(r4)
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0694
            r0.setVisibility(r2)
            return
        L_0x0694:
            X.C18070vi.A11(r1)
        L_0x0697:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146447Pd.run():void");
    }
}
