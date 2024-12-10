package X;

import android.view.View;

public class AFD implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AFD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.whatsapp.registration.ChangeNumberOverview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: com.whatsapp.registration.ChangeNumberOverview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: com.whatsapp.registration.EULA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: com.whatsapp.registration.ChangeNumberOverview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: com.whatsapp.registration.ChangeNumberOverview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: com.whatsapp.registration.ChangeNumberOverview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: com.whatsapp.registration.ChangeNumberOverview} */
    /* JADX WARNING: type inference failed for: r1v34, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v27, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v28, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0366, code lost:
        com.whatsapp.quickcontact.QuickContactActivity.A0V(r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x036a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0647, code lost:
        X.AnonymousClass74G.A06(r2, r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x064b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0739, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x073d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x07c5, code lost:
        r1.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0152, code lost:
        if (r1 == false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02c3, code lost:
        r3.startActivity(r4);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02c6, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02c9, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A00
            r5 = r17
            switch(r0) {
                case 0: goto L_0x07b5;
                case 1: goto L_0x07a4;
                case 2: goto L_0x0777;
                case 3: goto L_0x0766;
                case 4: goto L_0x0755;
                case 5: goto L_0x074d;
                case 6: goto L_0x074d;
                case 7: goto L_0x073e;
                case 8: goto L_0x00da;
                case 9: goto L_0x074d;
                case 10: goto L_0x0672;
                case 11: goto L_0x074d;
                case 12: goto L_0x074d;
                case 13: goto L_0x0669;
                case 14: goto L_0x064c;
                case 15: goto L_0x0641;
                case 16: goto L_0x0641;
                case 17: goto L_0x061f;
                case 18: goto L_0x060f;
                case 19: goto L_0x05fd;
                case 20: goto L_0x05be;
                case 21: goto L_0x0009;
                case 22: goto L_0x074d;
                case 23: goto L_0x0009;
                case 24: goto L_0x00ba;
                case 25: goto L_0x009e;
                case 26: goto L_0x05aa;
                case 27: goto L_0x0593;
                case 28: goto L_0x0593;
                case 29: goto L_0x047b;
                case 30: goto L_0x074d;
                case 31: goto L_0x03e8;
                case 32: goto L_0x03e0;
                case 33: goto L_0x036b;
                case 34: goto L_0x034d;
                case 35: goto L_0x032c;
                case 36: goto L_0x006e;
                case 37: goto L_0x0300;
                case 38: goto L_0x02db;
                case 39: goto L_0x02ce;
                case 40: goto L_0x02b2;
                case 41: goto L_0x012b;
                case 42: goto L_0x011e;
                case 43: goto L_0x0043;
                case 44: goto L_0x0011;
                case 45: goto L_0x0104;
                case 46: goto L_0x00f5;
                case 47: goto L_0x0009;
                case 48: goto L_0x0009;
                case 49: goto L_0x00ea;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.onBackPressed()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.RegisterName r3 = (com.whatsapp.registration.RegisterName) r3
            r0 = 1
            r3.A1S = r0
            X.A8V r2 = X.AnonymousClass8BW.A0U(r3)
            java.lang.String r1 = "profile_photo"
            java.lang.String r0 = "tapped"
            r2.A0I(r1, r0)
            X.1Up r2 = r3.A4i()
            X.1E7 r4 = r3.A0Y
            r7 = 1
            r6 = 12
            r11 = 0
            r5 = 0
            r9 = r7
            r10 = r7
            r8 = r7
            r2.A08(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.0zA r0 = r3.A4g()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0010
            java.lang.NullPointerException r0 = X.AnonymousClass8BX.A0X(r3)
            throw r0
        L_0x0043:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.RegisterName r3 = (com.whatsapp.registration.RegisterName) r3
            r0 = 2131428938(0x7f0b064a, float:1.8479535E38)
            android.view.View r0 = X.C110885hR.A0A(r3, r0)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.toggle()
            X.0ve r2 = r3.A0E
            r1 = 10791(0x2a27, float:1.5121E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0010
            X.0zA r1 = r3.A07
            if (r1 == 0) goto L_0x07c9
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0010
            java.lang.NullPointerException r0 = X.AnonymousClass8BW.A0a(r1)
            throw r0
        L_0x006e:
            java.lang.Object r0 = r1.A01
            X.A5G r0 = (X.A5G) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.1EC r0 = r4.A0a
            if (r0 == 0) goto L_0x0010
            X.1L9 r3 = r4.A01
            X.1LU r1 = r4.A0Y
            X.1E7 r0 = r4.A0S
            X.1BI r0 = r0.A0J
            r2 = 0
            android.content.Intent r0 = r1.A1w(r4, r0, r2)
            r3.A09(r4, r0)
            X.1M9 r5 = r4.A0H
            X.1EC r6 = r4.A0a
            X.1MZ r1 = r4.A0P
            X.11S r0 = r4.A02
            java.util.ArrayList r7 = X.C63982u1.A03(r0, r1, r6)
            r10 = 1
            r9 = 7
            r8 = 0
            X.AnonymousClass74H.A09(r4, r5, r6, r7, r8, r9, r10)
            com.whatsapp.quickcontact.QuickContactActivity.A0V(r4, r2)
            return
        L_0x009e:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r2 = r0.A1B()
            boolean r0 = r2 instanceof X.AnonymousClass990
            if (r0 == 0) goto L_0x0010
            X.990 r2 = (X.AnonymousClass990) r2
            r0 = 14
            android.content.Intent r1 = X.AnonymousClass1LU.A0E(r2, r0)
            r0 = 1
            r2.A0a = r0
            r0 = 2
            r2.startActivityForResult(r1, r0)
            return
        L_0x00ba:
            java.lang.Object r3 = r1.A01
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r3 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r3
            com.whatsapp.qrcode.WaQrScannerView r0 = r3.A04
            boolean r0 = r0.COq()
            if (r0 == 0) goto L_0x0010
            android.widget.ImageView r1 = r3.A00
            r0 = 8
            r1.setVisibility(r0)
            X.10I r2 = r3.A05
            r1 = 35
            X.7RB r0 = new X.7RB
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGF(r0)
            return
        L_0x00da:
            java.lang.Object r1 = r1.A01
            X.3Pb r1 = (X.AnonymousClass3Pb) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.Runnable r0 = r1.A06
            if (r0 == 0) goto L_0x0010
            r0.run()
            return
        L_0x00ea:
            java.lang.Object r0 = r1.A01
            X.8dJ r0 = (X.C166658dJ) r0
            com.whatsapp.registration.RegisterName r1 = r0.A08
            r0 = 1
            r1.A4e(r0)
            return
        L_0x00f5:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 130(0x82, float:1.82E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
            r0 = 126(0x7e, float:1.77E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x0104:
            java.lang.Object r2 = r1.A01
            com.whatsapp.registration.RegisterName r2 = (com.whatsapp.registration.RegisterName) r2
            java.lang.String r0 = "RegisterName/init/stack "
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C22781De.A01()
            X.6pu r1 = r2.A0c
            if (r1 == 0) goto L_0x011a
            java.lang.String r0 = "regname-init"
            r1.A01(r2, r0)
            return
        L_0x011a:
            java.lang.String r0 = "feedbackSendMethods"
            goto L_0x0739
        L_0x011e:
            java.lang.Object r1 = r1.A01
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            java.lang.String r0 = "RegisterName/clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A4l()
            return
        L_0x012b:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.EULA r3 = (com.whatsapp.registration.EULA) r3
            X.11C r0 = r3.A08
            android.telephony.TelephonyManager r1 = r0.A0K()
            r4 = 2
            if (r1 != 0) goto L_0x0141
            java.lang.String r0 = "EULA/cellular-network null"
        L_0x013a:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.AnonymousClass4Yv.A01(r3, r4)
            return
        L_0x0141:
            X.17x r0 = r3.A0B
            int r2 = X.C62912sC.A01(r1, r0)
            X.11E r0 = r3.A07
            X.1LR r0 = r0.A04()
            if (r0 == 0) goto L_0x0154
            boolean r1 = r0.A03
            r0 = 1
            if (r1 != 0) goto L_0x0155
        L_0x0154:
            r0 = 0
        L_0x0155:
            if (r2 != 0) goto L_0x015c
            if (r0 != 0) goto L_0x015c
            java.lang.String r0 = "EULA/cellular-network unknown"
            goto L_0x013a
        L_0x015c:
            X.1CM r0 = r3.A07
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x018f
            X.A4H r9 = r3.A0F
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = r9.A00
            long r5 = r7 - r0
            long r1 = X.A4H.A09
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x018f
            r9.A00 = r7
            java.util.List r2 = r9.A06
            java.util.List r1 = r9.A05
            r2.addAll(r1)
            java.util.List r0 = r9.A04
            r2.addAll(r0)
            r1.clear()
            r0.clear()
            X.10I r1 = r9.A03
            r0 = 48
            X.AnonymousClass3MY.A1U(r1, r9, r0)
        L_0x018f:
            java.lang.String r0 = "EULA/register/eula/accept"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10I r1 = r3.A05
            r0 = 7
            X.C21449AkG.A00(r1, r3, r0)
            X.0z4 r0 = r3.A0A
            long r5 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "eula_accepted_time"
            X.C17880vN.A1D(r1, r0, r5)
            X.00H r0 = r3.A0o
            java.lang.Object r0 = r0.get()
            X.2iS r0 = (X.C57052iS) r0
            X.9nK r0 = r0.A00()
            if (r0 == 0) goto L_0x01ec
            X.6z4 r1 = r3.A0E
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            boolean r0 = X.C196549vF.A01(r3)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = X.C196549vF.A00(r3)
            if (r0 == 0) goto L_0x01ec
        L_0x01c9:
            r0 = 11228(0x2bdc, float:1.5734E-41)
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x01ec
            X.00H r0 = r3.A0o
            X.9nK r0 = X.AnonymousClass8BX.A0J(r0)
            X.00H r0 = r0.A08
            java.lang.Object r5 = r0.get()
            X.9kA r5 = (X.C189979kA) r5
            X.19T r2 = r5.A01
            r1 = 551497305(0x20df2e59, float:3.780834E-19)
            r0 = 467(0x1d3, float:6.54E-43)
            r2.markerEnd(r1, r0)
            r0 = 0
            r5.A00 = r0
        L_0x01ec:
            X.10I r1 = r3.A05
            r0 = 8
            X.C21449AkG.A00(r1, r3, r0)
            X.10I r2 = r3.A05
            r1 = 9
            X.AkG r0 = new X.AkG
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGN(r0)
            X.1VK r1 = r3.A0A
            X.11Q r0 = r1.A01
            android.content.SharedPreferences r0 = X.AnonymousClass11Q.A01(r0)
            java.lang.String r2 = "previously_logged_out_from_primary"
            boolean r0 = X.C17880vN.A1W(r0, r2)
            if (r0 != 0) goto L_0x021a
            X.00H r0 = r1.A02
            java.lang.Object r0 = r0.get()
            X.2km r0 = (X.C58492km) r0
            r0.A00()
        L_0x021a:
            X.1VK r1 = r3.A0A
            X.11Q r0 = r1.A01
            android.content.SharedPreferences r0 = X.AnonymousClass11Q.A01(r0)
            boolean r0 = X.C17880vN.A1W(r0, r2)
            if (r0 != 0) goto L_0x0267
            X.00H r0 = r1.A02
            java.lang.Object r0 = r0.get()
            X.2km r0 = (X.C58492km) r0
            java.lang.Integer r2 = r0.A00()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r2 == r0) goto L_0x0267
            X.1VJ r0 = r1.A00
            int r1 = r0.A00()
            r0 = 1
            if (r1 == r0) goto L_0x0267
            if (r1 == r4) goto L_0x024d
            boolean r0 = X.C17970vW.A0D()
            if (r0 != 0) goto L_0x0267
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r2 != r0) goto L_0x0267
        L_0x024d:
            java.lang.String r0 = "EULA/show companion registration flow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r2 = "entry_eula"
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.companionmode.registration.RegisterAsCompanionActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r4.putExtra(r0, r2)
            goto L_0x02c3
        L_0x0267:
            X.1Vu r0 = r3.A0P
            r0.A01()
            X.1jT r0 = r3.A0M
            r4 = 1
            X.C33841jT.A03(r0, r4, r4)
            android.content.Intent r2 = r3.getIntent()
            java.lang.String r10 = "com.whatsapp.registration.RegisterPhone.phone_number"
            java.lang.String r9 = r2.getStringExtra(r10)
            java.lang.String r8 = "com.whatsapp.registration.RegisterPhone.country_code"
            java.lang.String r7 = r2.getStringExtra(r8)
            X.6z4 r1 = r3.A0E
            r0 = 11568(0x2d30, float:1.621E-41)
            boolean r0 = r1.A02(r0)
            r4 = r4 ^ r0
            java.lang.String r6 = "com.whatsapp.registration.RegisterPhone.clear_phone_number"
            boolean r5 = r2.getBooleanExtra(r6, r4)
            r4 = 1
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.phonenumberentry.RegisterPhone"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            r1.putExtra(r10, r9)
            r1.putExtra(r8, r7)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.resetstate"
            r1.putExtra(r0, r4)
            r1.putExtra(r6, r5)
            r3.startActivity(r1)
            goto L_0x02c6
        L_0x02b2:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.ChangeNumberOverview r3 = (com.whatsapp.registration.ChangeNumberOverview) r3
            java.lang.String r0 = "changenumberoverview/next"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1LU r0 = r3.A02
            if (r0 == 0) goto L_0x02ca
            android.content.Intent r4 = X.AnonymousClass8BX.A0A(r3)
        L_0x02c3:
            r3.startActivity(r4)
        L_0x02c6:
            r3.finish()
            return
        L_0x02ca:
            java.lang.String r0 = "waIntents"
            goto L_0x0739
        L_0x02ce:
            java.lang.Object r1 = r1.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 0
            com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet r0 = X.AnonymousClass4HZ.A00(r0)
            r1.CMl(r0)
            return
        L_0x02db:
            java.lang.Object r0 = r1.A01
            X.A5G r0 = (X.A5G) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.1L9 r3 = r4.A01
            X.1LU r1 = r4.A0Y
            X.1E7 r0 = r4.A0S
            X.1BI r0 = r0.A0J
            android.content.Intent r1 = X.AnonymousClass3MY.A06(r4, r1, r0)
            java.lang.String r0 = "args_conversation_screen_entry_point"
            r2 = 1
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "extra_show_search_on_create"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "QuickContactActivity"
            r3.A0B(r4, r1, r0)
            goto L_0x0366
        L_0x0300:
            java.lang.Object r0 = r1.A01
            X.A5G r0 = (X.A5G) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.9Bw r3 = r4.A0k
            if (r3 == 0) goto L_0x0315
            X.1VP r2 = r4.A0D
            r1 = 10
            X.1VQ r2 = (X.AnonymousClass1VQ) r2
            r0 = 0
            r2.BhC(r4, r3, r1, r0)
            return
        L_0x0315:
            X.2mw r2 = r4.A0R
            if (r2 == 0) goto L_0x0321
            X.1VP r1 = r4.A0D
            r0 = 10
            r1.CO2(r4, r2, r0)
            return
        L_0x0321:
            X.190 r3 = r4.A03
            java.lang.String r2 = "quickContactDialog "
            r1 = 0
            java.lang.String r0 = "LinkedCallLogPrefetchNotCompletedOnTime"
            r3.A0G(r0, r2, r1)
            return
        L_0x032c:
            java.lang.Object r4 = r1.A01
            X.A5G r4 = (X.A5G) r4
            com.whatsapp.quickcontact.QuickContactActivity r3 = r4.A00
            X.1MZ r2 = r3.A0P
            com.whatsapp.jid.GroupJid r1 = r3.A0Z
            X.1E7 r0 = r3.A0S
            X.1BI r0 = r0.A0J
            X.1DT r2 = r2.A03(r0, r1)
            r1 = 10
            X.AGu r0 = new X.AGu
            r0.<init>(r4, r1)
            r2.A0A(r3, r0)
            r0 = 0
            com.whatsapp.quickcontact.QuickContactActivity.A0V(r3, r0)
            return
        L_0x034d:
            java.lang.Object r0 = r1.A01
            X.A5G r0 = (X.A5G) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.733 r3 = r4.A0M
            X.1E7 r0 = r4.A0S
            X.2lf r0 = r0.A0H
            java.lang.String r2 = r0.A01
            r0 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "smsto:"
            r3.A04(r4, r1, r2, r0)
        L_0x0366:
            r0 = 0
            com.whatsapp.quickcontact.QuickContactActivity.A0V(r4, r0)
            return
        L_0x036b:
            java.lang.Object r7 = r1.A01
            X.A5G r7 = (X.A5G) r7
            com.whatsapp.quickcontact.QuickContactActivity r4 = r7.A00
            X.1E7 r0 = r4.A0S
            boolean r0 = r0.A0F()
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L_0x03b3
            X.00H r0 = r4.A0q
            X.1kb r1 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r0 = r4.A0a
            X.1EC r2 = r1.A05(r0)
            X.1CJ r1 = r4.A0O
            X.1EC r0 = r4.A0a
            boolean r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x03a0
            if (r2 == 0) goto L_0x03a0
            X.11t r1 = r4.A0F
            android.content.Context r0 = r5.getContext()
            boolean r0 = r1.CAq(r0, r5, r2)
            if (r0 == 0) goto L_0x03a0
            return
        L_0x03a0:
            X.1E7 r0 = r4.A0S
            X.1BI r0 = r0.A0J
            android.content.Intent r2 = X.AnonymousClass1LU.A13(r4, r0, r6, r3, r6)
            X.11P r1 = r4.A05
            java.lang.String r0 = "QuickContactActivity"
            X.C60442o2.A00(r2, r1, r0)
            r4.startActivity(r2)
            goto L_0x03c7
        L_0x03b3:
            X.1E7 r5 = r4.A0S
            X.1BI r0 = r5.A0J
            boolean r0 = X.C22971Dz.A0N(r0)
            if (r0 == 0) goto L_0x03cb
            X.1BI r0 = r5.A0J
            android.content.Intent r1 = X.AnonymousClass1LU.A12(r4, r0, r6)
            r0 = 0
            r4.startActivity(r1, r0)
        L_0x03c7:
            com.whatsapp.quickcontact.QuickContactActivity.A0V(r4, r3)
            return
        L_0x03cb:
            X.1MZ r2 = r4.A0P
            com.whatsapp.jid.GroupJid r1 = r4.A0Z
            X.1BI r0 = r5.A0J
            X.1DT r2 = r2.A03(r0, r1)
            r1 = 9
            X.AGu r0 = new X.AGu
            r0.<init>(r7, r1)
            r2.A0A(r4, r0)
            goto L_0x03c7
        L_0x03e0:
            java.lang.Object r0 = r1.A01
            com.whatsapp.quickcontact.QuickContactActivity r0 = (com.whatsapp.quickcontact.QuickContactActivity) r0
            r0.A4b()
            return
        L_0x03e8:
            java.lang.Object r9 = r1.A01
            com.whatsapp.quickcontact.QuickContactActivity r9 = (com.whatsapp.quickcontact.QuickContactActivity) r9
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "location_latitude"
            r2 = 0
            double r12 = r1.getDoubleExtra(r0, r2)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "location_longitude"
            double r14 = r1.getDoubleExtra(r0, r2)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0460
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0460
            X.1Uv r8 = r9.A0b
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "gjid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.1BI r1 = X.AnonymousClass3MX.A0l(r0)
            X.C17960vV.A07(r1)
            X.1E7 r0 = r9.A0S
            com.whatsapp.jid.Jid r7 = X.AnonymousClass1E7.A01(r0)
            X.C17960vV.A07(r7)
            java.lang.Object r6 = r8.A0T
            monitor-enter(r6)
            java.util.Map r0 = X.C27131Uv.A05(r8)     // Catch:{ all -> 0x0457 }
            java.util.Map r1 = X.AnonymousClass8BS.A0u(r1, r0)     // Catch:{ all -> 0x0457 }
            X.11P r0 = r8.A0D     // Catch:{ all -> 0x0457 }
            long r4 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0457 }
            if (r1 == 0) goto L_0x0455
            java.lang.Object r7 = r1.get(r7)     // Catch:{ all -> 0x0457 }
            X.2e4 r7 = (X.C54392e4) r7     // Catch:{ all -> 0x0457 }
            if (r7 == 0) goto L_0x0455
            long r0 = r7.A00     // Catch:{ all -> 0x0457 }
            boolean r0 = X.C27131Uv.A0G(r0, r4)     // Catch:{ all -> 0x0457 }
            if (r0 == 0) goto L_0x0455
            java.util.Map r1 = r8.A0c     // Catch:{ all -> 0x0457 }
            com.whatsapp.jid.UserJid r0 = r7.A01     // Catch:{ all -> 0x0457 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0457 }
            X.2nL r0 = (X.C60072nL) r0     // Catch:{ all -> 0x0457 }
            monitor-exit(r6)     // Catch:{ all -> 0x0457 }
            goto L_0x045a
        L_0x0455:
            monitor-exit(r6)     // Catch:{ all -> 0x0457 }
            goto L_0x0460
        L_0x0457:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0457 }
            throw r0
        L_0x045a:
            if (r0 == 0) goto L_0x0460
            double r12 = r0.A00
            double r14 = r0.A01
        L_0x0460:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0476
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0476
            X.1Me r1 = r9.A0J
            X.1E7 r0 = r9.A0S
            java.lang.String r10 = r1.A0I(r0)
            X.689 r8 = r9.A0c
            r11 = 0
            r8.A09(r9, r10, r11, r12, r14)
        L_0x0476:
            r0 = 0
            com.whatsapp.quickcontact.QuickContactActivity.A0V(r9, r0)
            return
        L_0x047b:
            java.lang.Object r4 = r1.A01
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r4 = (com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r4
            int r1 = r4.A00
            r5 = 1
            if (r1 == 0) goto L_0x04f1
            if (r1 == r5) goto L_0x04cd
            r0 = 2
            if (r1 != r0) goto L_0x051d
            android.content.Context r3 = r4.A14()
            X.1FL r0 = r4.A1B()
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r0 = "ctwa_deeplink_content"
            boolean r0 = r1.hasExtra(r0)
            if (r0 == 0) goto L_0x04d1
            com.whatsapp.jid.UserJid r0 = r4.A0I
            if (r0 == 0) goto L_0x04d1
            X.0ve r2 = r4.A0H
            r1 = 8884(0x22b4, float:1.2449E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x04d1
            X.6o0 r3 = r4.A0J
            X.1FL r2 = r4.A1B()
            com.whatsapp.jid.UserJid r1 = r4.A0I
            java.lang.String r0 = r4.A0Q
            android.content.Intent r0 = r3.A00(r2, r1, r0)
        L_0x04bb:
            r4.A1k(r0)
        L_0x04be:
            X.10I r2 = r4.A0L
            r1 = 37
            X.7RB r0 = new X.7RB
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.CGF(r0)
            r4.A28()
        L_0x04cd:
            r4.A28()
            return
        L_0x04d1:
            java.lang.String r0 = r4.A0Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            X.1LU r2 = new X.1LU
            r2.<init>()
            com.whatsapp.jid.UserJid r1 = r4.A0I
            if (r0 != 0) goto L_0x04e7
            java.lang.String r0 = r4.A0Q
            android.content.Intent r0 = r2.A1y(r3, r1, r0)
            goto L_0x04bb
        L_0x04e7:
            android.content.Intent r1 = X.AnonymousClass3MY.A06(r3, r2, r1)
            X.11P r0 = r4.A0D
            X.C137086ut.A00(r1, r4, r0)
            goto L_0x04be
        L_0x04f1:
            X.1E7 r0 = r4.A0F
            X.2lf r0 = r0.A0H
            if (r0 == 0) goto L_0x0524
            X.1FL r0 = r4.A1D()
            android.content.Intent r1 = X.AnonymousClass1LU.A02(r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            android.content.Intent r0 = r1.addFlags(r0)
            r4.A1k(r0)
            X.1LU r2 = new X.1LU
            r2.<init>()
            android.content.Context r1 = r4.A14()
            com.whatsapp.jid.UserJid r0 = r4.A0I
            android.content.Intent r1 = X.AnonymousClass3MY.A06(r1, r2, r0)
            X.11P r0 = r4.A0D
            X.C137086ut.A00(r1, r4, r0)
            goto L_0x04cd
        L_0x051d:
            java.lang.String r0 = "Unhandled type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0524:
            X.0ve r2 = r4.A0H
            r1 = 5868(0x16ec, float:8.223E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0569
            X.1E7 r7 = r4.A0F
            X.1pJ r6 = r4.A0B
            X.00H r0 = r4.A0O
            r0.get()
            X.1FL r0 = r4.A1D()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.contact.contactform.ContactFormActivity"
            r2.setClassName(r1, r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r3 = r2.addFlags(r0)
            X.1nu r0 = r4.A0K
            android.os.Bundle r0 = r0.A04(r7, r5)
            r3.putExtras(r0)
            X.1FL r2 = r4.A1D()
            r0 = 3
            X.4kN r1 = new X.4kN
            r1.<init>(r3, r4, r0)
            r0 = 22
            r6.A01(r2, r1, r0)
            return
        L_0x0569:
            X.1nu r3 = r4.A0K
            com.whatsapp.jid.UserJid r0 = r4.A0I
            java.lang.String r2 = X.AnonymousClass17K.A05(r0)
            X.C17960vV.A07(r2)
            X.1E7 r0 = r4.A0F
            java.lang.String r1 = r0.A0c
            r0 = 0
            android.content.Intent r1 = X.C36451nu.A00(r3, r2, r1, r5, r0)
            java.lang.String r0 = "finishActivityOnSaveCompleted"
            r1.putExtra(r0, r5)
            r4.startActivityForResult(r1, r5)
            X.00H r0 = r4.A0M
            java.lang.Object r1 = r0.get()
            X.1q1 r1 = (X.C37721q1) r1
            r0 = 11
            r1.A06(r5, r0)
            return
        L_0x0593:
            java.lang.Object r0 = r1.A01
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r0 = (com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r0
            X.1FL r2 = r0.A1B()
            X.1LU r1 = new X.1LU
            r1.<init>()
            X.1E7 r0 = r0.A0F
            android.content.Intent r0 = r1.A1u(r2, r0)
            r2.startActivity(r0)
            return
        L_0x05aa:
            java.lang.Object r1 = r1.A01
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r1 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r1
            r0 = 0
            r1.A06 = r0
            com.whatsapp.qrcode.WaQrScannerView r0 = r1.A04
            if (r0 == 0) goto L_0x05b8
            r0.CFY()
        L_0x05b8:
            com.whatsapp.qrcode.WaQrScannerView r0 = r1.A04
            r0.CFw()
            return
        L_0x05be:
            java.lang.Object r5 = r1.A01
            com.whatsapp.qrcode.DevicePairQrScannerActivity r5 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r5
            int r4 = r5.A00
            java.lang.String r3 = r5.A0F
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r4)
            if (r3 == 0) goto L_0x05df
            java.lang.String r0 = "agent_id"
            r2.putExtra(r0, r3)
        L_0x05df:
            r5.startActivity(r2)
            X.00H r0 = r5.A0B
            java.lang.Object r1 = r0.get()
            X.4Qn r1 = (X.AnonymousClass4Qn) r1
            r0 = 5
            r1.A00(r0)
            X.00H r0 = r5.A09
            java.lang.Object r1 = r0.get()
            X.9sz r1 = (X.C195219sz) r1
            r0 = 0
            r1.A01 = r0
            r5.finish()
            return
        L_0x05fd:
            java.lang.Object r1 = r1.A01
            X.70X r1 = (X.AnonymousClass70X) r1
            boolean r0 = r1.A0a()
            if (r0 == 0) goto L_0x060b
            r1.A0B()
            return
        L_0x060b:
            r1.A0E()
            return
        L_0x060f:
            java.lang.Object r2 = r1.A01
            X.74G r2 = (X.AnonymousClass74G) r2
            boolean r0 = X.AnonymousClass74G.A09(r2)
            if (r0 == 0) goto L_0x061c
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            goto L_0x0647
        L_0x061c:
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x0647
        L_0x061f:
            java.lang.Object r3 = r1.A01
            X.74G r3 = (X.AnonymousClass74G) r3
            X.6tV r2 = r3.A0u
            long r0 = r2.A03
            r2.A03 = r0
            boolean r0 = X.AnonymousClass74G.A09(r3)
            if (r0 == 0) goto L_0x063a
            r1 = 9
            X.7RB r0 = new X.7RB
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.AnonymousClass74G.A07(r3, r0)
            return
        L_0x063a:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            r0 = 0
            X.AnonymousClass74G.A06(r3, r1, r0)
            return
        L_0x0641:
            java.lang.Object r2 = r1.A01
            X.74G r2 = (X.AnonymousClass74G) r2
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
        L_0x0647:
            r0 = 0
            X.AnonymousClass74G.A06(r2, r1, r0)
            return
        L_0x064c:
            java.lang.Object r3 = r1.A01
            X.74G r3 = (X.AnonymousClass74G) r3
            X.AnonymousClass74G.A02(r3)
            boolean r0 = X.AnonymousClass74G.A08(r3)
            if (r0 == 0) goto L_0x065f
            com.whatsapp.ptv.PushToVideoRecordingCountdown r2 = r3.A0p
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.A01 = r0
        L_0x065f:
            X.6tV r4 = r3.A0u
            long r2 = r4.A01
            r0 = 1
            long r2 = r2 + r0
            r4.A01 = r2
            return
        L_0x0669:
            java.lang.Object r1 = r1.A01
            com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageActivity r1 = (com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageActivity) r1
            r0 = 1
            com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageActivity.A0V(r1, r0)
            return
        L_0x0672:
            java.lang.Object r6 = r1.A01
            com.whatsapp.ptt.feedback.TranscriptionFeedbackWhatWentWrongBottomSheetFragment r6 = (com.whatsapp.ptt.feedback.TranscriptionFeedbackWhatWentWrongBottomSheetFragment) r6
            r4 = 0
            X.8rt r1 = new X.8rt
            r1.<init>()
            android.os.Bundle r2 = r6.A06
            if (r2 == 0) goto L_0x0730
            java.lang.String r0 = "average_confidence_score"
            double r2 = r2.getDouble(r0)
        L_0x0686:
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r1.A08 = r0
            android.os.Bundle r2 = r6.A06
            if (r2 == 0) goto L_0x072c
            java.lang.String r0 = "ptt_length_value"
            long r2 = r2.getLong(r0)
        L_0x0696:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.A00 = r0
            java.util.Map r2 = r6.A05
            r0 = 2131436402(0x7f0b2372, float:1.8494673E38)
            java.lang.Object r0 = X.AnonymousClass000.A0w(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.A01 = r0
            r0 = 2131436400(0x7f0b2370, float:1.849467E38)
            java.lang.Object r0 = X.AnonymousClass000.A0w(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.A02 = r0
            r0 = 2131436394(0x7f0b236a, float:1.8494657E38)
            java.lang.Object r0 = X.AnonymousClass000.A0w(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.A03 = r0
            r0 = 2131436396(0x7f0b236c, float:1.8494661E38)
            java.lang.Object r0 = X.AnonymousClass000.A0w(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.A05 = r0
            r0 = 2131436395(0x7f0b236b, float:1.849466E38)
            java.lang.Object r0 = X.AnonymousClass000.A0w(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.A04 = r0
            r0 = 2131436401(0x7f0b2371, float:1.8494671E38)
            java.lang.Object r0 = X.AnonymousClass000.A0w(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.A07 = r0
            r0 = 2131436398(0x7f0b236e, float:1.8494665E38)
            java.lang.Object r0 = X.AnonymousClass000.A0w(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.A06 = r0
            X.18K r0 = r6.A02
            if (r0 == 0) goto L_0x0734
            r0.CC7(r1)
            android.os.Bundle r1 = r6.A06
            if (r1 == 0) goto L_0x0718
            java.lang.String r0 = "message_row_id"
            long r4 = r1.getLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            if (r0 == 0) goto L_0x0718
            X.6gk r3 = r6.A03
            if (r3 == 0) goto L_0x0737
            X.10I r2 = r3.A01
            r1 = 30
            X.7Ph r0 = new X.7Ph
            r0.<init>(r3, r4, r1)
            r2.CGF(r0)
        L_0x0718:
            X.1FL r0 = r6.A1D()
            X.1GP r1 = r0.getSupportFragmentManager()
            com.whatsapp.ptt.feedback.TranscriptionFeedbackThankYouBottomSheetFragment r0 = new com.whatsapp.ptt.feedback.TranscriptionFeedbackThankYouBottomSheetFragment
            r0.<init>()
            X.C20098A7b.A01(r0, r1)
            r6.A28()
            return
        L_0x072c:
            r2 = -1
            goto L_0x0696
        L_0x0730:
            r2 = 0
            goto L_0x0686
        L_0x0734:
            java.lang.String r0 = "wamRuntime"
            goto L_0x0739
        L_0x0737:
            java.lang.String r0 = "userActions"
        L_0x0739:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x073e:
            java.lang.Object r1 = r1.A01
            com.whatsapp.ptt.TranscriptionOnboardingWithLanguageSelectionBottomSheetFragment r1 = (com.whatsapp.ptt.TranscriptionOnboardingWithLanguageSelectionBottomSheetFragment) r1
            android.view.View$OnClickListener r0 = r1.A00
            if (r0 == 0) goto L_0x0749
            r0.onClick(r5)
        L_0x0749:
            r1.A28()
            return
        L_0x074d:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A28()
            return
        L_0x0755:
            java.lang.Object r0 = r1.A01
            com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet r0 = (com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet) r0
            X.0vl r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel r0 = (com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel) r0
            X.1wy r1 = r0.A05
            X.97H r0 = X.AnonymousClass97H.A00
            goto L_0x07c5
        L_0x0766:
            java.lang.Object r0 = r1.A01
            com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet r0 = (com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet) r0
            X.0vl r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel r0 = (com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel) r0
            X.1wy r1 = r0.A05
            X.97J r0 = X.AnonymousClass97J.A00
            goto L_0x07c5
        L_0x0777:
            java.lang.Object r0 = r1.A01
            com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet r0 = (com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet) r0
            X.0vl r0 = r0.A07
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel r2 = (com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel) r2
            X.1G4 r0 = r2.A07
            java.lang.Object r1 = r0.getValue()
            X.4Ex r1 = (X.C83384Ex) r1
            boolean r0 = r1 instanceof X.C822845e
            if (r0 == 0) goto L_0x079b
            X.45e r1 = (X.C822845e) r1
            android.graphics.Bitmap r0 = r1.A00
        L_0x0793:
            r2.A0T(r0)
        L_0x0796:
            X.1wy r1 = r2.A05
            X.97I r0 = X.AnonymousClass97I.A00
            goto L_0x07c5
        L_0x079b:
            boolean r0 = r1 instanceof X.C823045g
            if (r0 == 0) goto L_0x0796
            X.45g r1 = (X.C823045g) r1
            android.graphics.Bitmap r0 = r1.A00
            goto L_0x0793
        L_0x07a4:
            java.lang.Object r0 = r1.A01
            com.whatsapp.profile.coinflip.edit.CoinFlipEditPhotoTabFragment r0 = (com.whatsapp.profile.coinflip.edit.CoinFlipEditPhotoTabFragment) r0
            X.0vl r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.profile.coinflip.edit.CoinFlipEditBottomSheetViewModel r0 = (com.whatsapp.profile.coinflip.edit.CoinFlipEditBottomSheetViewModel) r0
            X.1wy r1 = r0.A03
            X.45u r0 = X.C823745u.A00
            goto L_0x07c5
        L_0x07b5:
            java.lang.Object r0 = r1.A01
            com.whatsapp.profile.coinflip.edit.CoinFlipEditPhotoTabFragment r0 = (com.whatsapp.profile.coinflip.edit.CoinFlipEditPhotoTabFragment) r0
            X.0vl r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.profile.coinflip.edit.CoinFlipEditBottomSheetViewModel r0 = (com.whatsapp.profile.coinflip.edit.CoinFlipEditBottomSheetViewModel) r0
            X.1wy r1 = r0.A03
            X.45t r0 = X.C823645t.A00
        L_0x07c5:
            r1.A0F(r0)
            return
        L_0x07c9:
            java.lang.String r0 = "smbOnboardingAnalyticsManager"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFD.onClick(android.view.View):void");
    }
}
