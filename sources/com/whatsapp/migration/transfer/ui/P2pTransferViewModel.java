package com.whatsapp.migration.transfer.ui;

import X.A7P;
import X.AWB;
import X.AWF;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass19D;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass8BR;
import X.AnonymousClass8BV;
import X.C108945cZ;
import X.C146617Py;
import X.C175248yO;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C188349hH;
import X.C188799i0;
import X.C189479jJ;
import X.C196129uV;
import X.C198189xw;
import X.C20276AEj;
import X.C21010Ad2;
import X.C21356Ail;
import X.C21435Ak2;
import X.C22514BAx;
import X.C25081Mu;
import X.C25509Ch7;
import X.C25912CoW;
import X.C2V;
import X.C30391dr;
import X.C30451dy;
import X.C41561wd;
import X.C72463Mc;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService;
import com.whatsapp.migration.transferinfra.service.WifiGroupScannerP2pTransferService;
import com.whatsapp.registration.AccountTransferManager;
import com.whatsapp.registration.AccountTransferManager$executeRegisterTask$1;
import com.whatsapp.util.Log;
import java.util.Map;

public abstract class P2pTransferViewModel extends AnonymousClass1J2 {
    public int A00;
    public C20276AEj A01;
    public C22514BAx A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass1DT A07 = AnonymousClass3MW.A0o();
    public final AnonymousClass1DT A08 = AnonymousClass3MW.A0o();
    public final AnonymousClass1DT A09 = AnonymousClass3MW.A0o();
    public final AnonymousClass1DT A0A = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0B = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0C = AnonymousClass3MW.A0o();
    public final AnonymousClass1DT A0D = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0E = AnonymousClass3MW.A0o();
    public final AnonymousClass1DT A0F = AnonymousClass3MW.A0o();
    public final AnonymousClass1DT A0G = AnonymousClass3MW.A0L();
    public final AnonymousClass11C A0H;
    public final AnonymousClass118 A0I;
    public final C18000vb A0J;
    public final AnonymousClass19D A0K;
    public final C25509Ch7 A0L;
    public final AnonymousClass10I A0M;
    public final AnonymousClass1DT A0N = AnonymousClass3MW.A0L();
    public final C175248yO A0O;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0U(X.C24963CRn r8, X.C30391dr r9) {
        /*
            r7 = this;
            r6 = r7
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r6 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r6
            boolean r0 = r9 instanceof X.C21651Ang
            if (r0 == 0) goto L_0x0060
            r5 = r9
            X.Ang r5 = (X.C21651Ang) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0060
            int r2 = r2 - r1
            r5.label = r2
        L_0x0015:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r3) goto L_0x0066
            java.lang.Object r8 = r5.L$0
            X.CRn r8 = (X.C24963CRn) r8
            X.C30691eM.A01(r1)
        L_0x0027:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x006b
            r8.A01 = r1
        L_0x002d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L_0x0032:
            X.C30691eM.A01(r1)
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0055
            X.5cY r0 = r6.A0S
            boolean r0 = r0.BeK()
            if (r0 != 0) goto L_0x002d
            r5.L$0 = r8
            r5.label = r3
            r0 = 0
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel$fetchOtpCode$2 r2 = new com.whatsapp.migration.transfer.ui.ChatTransferViewModel$fetchOtpCode$2
            r2.<init>(r6, r0)
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r1 = X.AnonymousClass4Z5.A01(r5, r2, r0)
            if (r1 != r4) goto L_0x0027
            return r4
        L_0x0055:
            X.0z4 r0 = r6.A0C
            java.lang.String r0 = X.C181479Qq.A00(r0)
            if (r0 == 0) goto L_0x006b
            r8.A02 = r0
            goto L_0x002d
        L_0x0060:
            X.Ang r5 = new X.Ang
            r5.<init>(r6, r9)
            goto L_0x0015
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x006b:
            java.lang.Boolean r4 = X.AnonymousClass000.A0h()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.P2pTransferViewModel.A0U(X.CRn, X.1dr):java.lang.Object");
    }

    public void A0a() {
        ChatTransferViewModel chatTransferViewModel = (ChatTransferViewModel) this;
        A7P a7p = chatTransferViewModel.A0H;
        a7p.A07("qr_code_generation", "completed");
        chatTransferViewModel.A0d(2);
        if (chatTransferViewModel.A07 && !chatTransferViewModel.A0S.BeK()) {
            AnonymousClass1OX A002 = C41561wd.A00(chatTransferViewModel);
            ChatTransferViewModel$startRegTasks$1 chatTransferViewModel$startRegTasks$1 = new ChatTransferViewModel$startRegTasks$1(chatTransferViewModel, (C30391dr) null);
            AnonymousClass1OR r6 = AnonymousClass1OR.A00;
            Integer num = AnonymousClass00R.A00;
            chatTransferViewModel.A05 = C30451dy.A02(num, r6, chatTransferViewModel$startRegTasks$1, A002);
            C21010Ad2 ad2 = new C21010Ad2(chatTransferViewModel);
            AccountTransferManager accountTransferManager = chatTransferViewModel.A0K;
            AnonymousClass1OX A003 = C41561wd.A00(chatTransferViewModel);
            C18070vi.A0d(A003, 0);
            Log.i("AccountTransferManager/executeRegisterTask/");
            C30451dy.A02(num, r6, new AccountTransferManager$executeRegisterTask$1(accountTransferManager, ad2, (C30391dr) null), A003);
            C198189xw A042 = ChatTransferViewModel.A04(chatTransferViewModel);
            if (A042.A00) {
                AnonymousClass8BR.A0q(A042.A01).A0J("qr_code_device_switching", "qr_code_device_switching_landing", "view");
            }
        }
        a7p.A04(6);
    }

    public final void A0e(LocationManager locationManager, WifiManager wifiManager, C189479jJ r12) {
        if (this.A05) {
            int i = this.A00;
            if (i == 2 || i == 3) {
                WifiManager wifiManager2 = wifiManager;
                if (wifiManager.isWifiEnabled()) {
                    C189479jJ r6 = r12;
                    if (!r12.A00()) {
                        LocationManager locationManager2 = locationManager;
                        if (locationManager.isProviderEnabled("gps")) {
                            this.A0M.CGv(new C146617Py(this, wifiManager2, r6, locationManager2, 2), 5000);
                            return;
                        }
                    }
                }
                this.A0E.A0E(A0T());
            }
        }
    }

    public void A0g(Bundle bundle) {
        C17960vV.A0G(bundle.containsKey("is_donor"), "getIntent().getExtras()[IS_DONOR_ARG] is required but is not present");
        this.A04 = bundle.getBoolean("is_donor");
        bundle.getInt("platform_type", 0);
    }

    public void A0h(C20276AEj aEj) {
        LocationManager A0C2;
        C18070vi.A0d(aEj, 0);
        Context A0E2 = C108945cZ.A0E(this.A0I);
        int A002 = C18020vd.A00(C18040vf.A02, ((ChatTransferViewModel) this).A0D, 9769);
        Intent A0G2 = C108945cZ.A0G("com.whatsapp.migration.START");
        A0G2.putExtra("details_key", aEj);
        A0G2.putExtra("scanner_connection_type", A002);
        A0G2.setClass(A0E2, WifiGroupScannerP2pTransferService.class);
        C25081Mu.A00(A0E2, A0G2);
        AnonymousClass11C r0 = this.A0H;
        WifiManager A0F2 = r0.A0F();
        if (!(A0F2 == null || (A0C2 = r0.A0C()) == null)) {
            C21435Ak2.A00(this.A0M, this, A0F2, A0C2, 0);
        }
        A0d(3);
    }

    public void A0i(String str) {
        C18070vi.A0d(str, 0);
        C196129uV r0 = ((ChatTransferViewModel) this).A0E;
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass00H r3 = r0.A01;
        A10.append(C17880vN.A0r(C17880vN.A0B(r3), "/export/logging/attemptId"));
        C17880vN.A1E(AnonymousClass8BV.A06(r3), "/export/logging/attemptId", C17890vO.A0Z(str, A10, '/'));
    }

    public boolean A0l() {
        ChatTransferViewModel chatTransferViewModel = (ChatTransferViewModel) this;
        if (!C18020vd.A05(C18040vf.A02, chatTransferViewModel.A0K, 11686) || chatTransferViewModel.A07) {
            return false;
        }
        return true;
    }

    private final void A00() {
        Class cls;
        C22514BAx bAx = this.A02;
        if (bAx != null) {
            bAx.cancel();
        }
        boolean z = this.A04;
        Context A0E2 = C108945cZ.A0E(this.A0I);
        if (z) {
            cls = WifiGroupScannerP2pTransferService.class;
        } else {
            cls = WifiGroupCreatorP2pTransferService.class;
        }
        A0E2.startService(AnonymousClass8BR.A07(A0E2, cls).setAction("com.whatsapp.migration.STOP"));
    }

    public static void A03(ChatTransferViewModel chatTransferViewModel, C188799i0 r2, int i) {
        AWB awb = new AWB(chatTransferViewModel, i);
        r2.A0G = awb;
        r2.A0E = awb;
    }

    public void A0S() {
        this.A0O.unregisterObserver(((ChatTransferViewModel) this).A0J);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r9.A06 != false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0V(java.lang.String r14, java.lang.String r15, X.AnonymousClass1D6 r16, X.C30391dr r17) {
        /*
            r13 = this;
            r3 = r17
            r4 = r16
            boolean r0 = r3 instanceof X.C21702AoV
            if (r0 == 0) goto L_0x00fc
            r5 = r3
            X.AoV r5 = (X.C21702AoV) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00fc
            int r2 = r2 - r1
            r5.label = r2
        L_0x0016:
            java.lang.Object r1 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x00d8
            if (r0 != r2) goto L_0x0103
            java.lang.Object r4 = r5.L$3
            X.1D6 r4 = (X.AnonymousClass1D6) r4
            java.lang.Object r15 = r5.L$2
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r14 = r5.L$1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r9 = r5.L$0
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r9 = (com.whatsapp.migration.transfer.ui.P2pTransferViewModel) r9
            X.C30691eM.A01(r1)
        L_0x0034:
            boolean r0 = X.AnonymousClass000.A1Y(r1)
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = "p2p/P2pTransferViewModel/startServerWhenReady/starting server"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.118 r0 = r9.A0I
            android.content.Context r8 = X.C108945cZ.A0E(r0)
            java.lang.Object r12 = r4.second
            java.io.Serializable r12 = (java.io.Serializable) r12
            java.lang.Object r11 = r4.first
            java.security.cert.Certificate r11 = (java.security.cert.Certificate) r11
            boolean r10 = r9.A0l()
            X.19D r2 = r9.A0K
            r1 = 9770(0x262a, float:1.369E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0068
            boolean r0 = X.AnonymousClass112.A06()
            if (r0 == 0) goto L_0x0068
            boolean r0 = r9.A06
            r7 = 1
            if (r0 == 0) goto L_0x0069
        L_0x0068:
            r7 = 0
        L_0x0069:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WA"
            r3.append(r0)
            r2 = 0
            r1 = 10000(0x2710, float:1.4013E-41)
            X.1JU r0 = X.AnonymousClass1JU.A01
            int r0 = r0.A03(r2, r1)
            java.lang.String r6 = X.C17880vN.A0t(r3, r0)
            java.lang.String r5 = "authToken"
            r0 = 1
            X.C18070vi.A0d(r14, r0)
            java.lang.String r4 = "privateKey"
            r0 = 2
            X.C18070vi.A0d(r12, r0)
            java.lang.String r3 = "certificate"
            r0 = 3
            X.C18070vi.A0d(r11, r0)
            java.lang.String r0 = "sessionId"
            r1 = 4
            X.C18070vi.A0d(r15, r1)
            java.lang.String r2 = "networkNamePostfix"
            r1 = 7
            X.C18070vi.A0d(r6, r1)
            java.lang.String r1 = "com.whatsapp.migration.START"
            android.content.Intent r1 = X.C108945cZ.A0G(r1)
            r1.putExtra(r5, r14)
            r1.putExtra(r4, r12)
            r1.putExtra(r3, r11)
            r1.putExtra(r0, r15)
            java.lang.String r0 = "dynamicPort"
            r1.putExtra(r0, r10)
            java.lang.String r0 = "shouldCreateWifiDirectGroup"
            r1.putExtra(r0, r7)
            r1.putExtra(r2, r6)
            java.lang.Class<com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService> r0 = com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService.class
            r1.setClass(r8, r0)
            X.C25081Mu.A00(r8, r1)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r9 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r9
            X.A7P r2 = r9.A0H
            java.lang.String r1 = "p2p_network_initialization"
            java.lang.String r0 = "started"
            r2.A07(r1, r0)
        L_0x00cf:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00d2:
            java.lang.String r0 = "p2p/P2pTransferViewModel/generateCoreConnectionDetailsAndStartServerWhenReady/preconditions to start server not met"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00cf
        L_0x00d8:
            X.C30691eM.A01(r1)
            r5.L$0 = r13
            r5.L$1 = r14
            r5.L$2 = r15
            r5.L$3 = r4
            r5.label = r2
            r1 = r13
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r1 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r1
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x00f5
            X.5cY r0 = r1.A0S
            java.lang.Object r1 = r0.BCp(r5)
            if (r1 != r3) goto L_0x00f9
            return r3
        L_0x00f5:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
        L_0x00f9:
            r9 = r13
            goto L_0x0034
        L_0x00fc:
            X.AoV r5 = new X.AoV
            r5.<init>(r13, r3)
            goto L_0x0016
        L_0x0103:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.P2pTransferViewModel.A0V(java.lang.String, java.lang.String, X.1D6, X.1dr):java.lang.Object");
    }

    public void A0W() {
        AnonymousClass3MX.A1J(this.A0D, 0);
        A0d(1);
    }

    public void A0X() {
        C72463Mc.A1B(this.A08);
    }

    public void A0Y() {
        AnonymousClass3MY.A1L(this.A0F, true);
        AnonymousClass3MX.A1Q(new P2pTransferViewModel$onCreatorSetupComplete$1(this, (C30391dr) null), C41561wd.A00(this));
    }

    public void A0Z() {
        AnonymousClass3MY.A1M(this.A0F, false);
        this.A0E.A0E(A0T());
    }

    public void A0b() {
        if (this.A04) {
            ChatTransferViewModel chatTransferViewModel = (ChatTransferViewModel) this;
            String str = chatTransferViewModel.A03;
            if (str != null) {
                chatTransferViewModel.A0j(str);
                return;
            }
            if (chatTransferViewModel.A0F.A03 == null) {
                if (C18020vd.A05(C18040vf.A02, chatTransferViewModel.A0D, 11779)) {
                    AnonymousClass3MY.A1L(chatTransferViewModel.A0F, true);
                    chatTransferViewModel.A06 = true;
                    chatTransferViewModel.A0M.CGN(new C21356Ail(chatTransferViewModel, 0));
                    return;
                }
            }
            chatTransferViewModel.A0X();
            return;
        }
        A0Y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (((X.C22881Do) r4.A0Q.get()).A01 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x012e, code lost:
        if (r2.length() == 0) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d4, code lost:
        if (r2.length() == 0) goto L_0x01d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0d(int r9) {
        /*
            r8 = this;
            int r2 = r8.A00
            if (r9 == r2) goto L_0x0066
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "p2p/P2pTransferViewModel/change state from "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " to "
            X.C17900vP.A0j(r0, r1, r9)
            r8.A00 = r9
            r4 = r8
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r4 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r4
            r0 = 1
            if (r9 == r0) goto L_0x017b
            r0 = 2
            if (r9 == r0) goto L_0x00fa
            r0 = 3
            if (r9 == r0) goto L_0x00b2
            r1 = 4
            X.9i0 r3 = new X.9i0
            r3.<init>()
            boolean r0 = r4.A04
            if (r9 == r1) goto L_0x007a
            if (r0 == 0) goto L_0x0067
            r0 = 2131888199(0x7f120847, float:1.9411027E38)
            r3.A0D = r0
            r0 = 2131888197(0x7f120845, float:1.9411023E38)
            r3.A0C = r0
            r0 = 2131898925(0x7f12322d, float:1.9432781E38)
            r3.A03 = r0
            X.00H r0 = r4.A0Q
            java.lang.Object r0 = r0.get()
            X.1Do r0 = (X.C22881Do) r0
            boolean r1 = r0.A01
            r0 = 3
            if (r1 != 0) goto L_0x004c
        L_0x004b:
            r0 = 4
        L_0x004c:
            X.AWB r1 = new X.AWB
            r1.<init>(r4, r0)
            r3.A0F = r1
            r0 = 362(0x16a, float:5.07E-43)
            r3.A02 = r0
            r0 = 491(0x1eb, float:6.88E-43)
            r3.A01 = r0
            r0 = 8
            r3.A0B = r0
            r3.A0E = r1
        L_0x0061:
            X.1DT r0 = r8.A0G
            r0.A0E(r3)
        L_0x0066:
            return
        L_0x0067:
            r0 = 2131888200(0x7f120848, float:1.9411029E38)
            r3.A0D = r0
            r0 = 2131888198(0x7f120846, float:1.9411025E38)
            r3.A0C = r0
            r0 = 2131899268(0x7f123384, float:1.9433477E38)
            r3.A03 = r0
            r0 = 0
            r3.A0H = r0
            goto L_0x004b
        L_0x007a:
            if (r0 == 0) goto L_0x00a6
            r0 = 2131888244(0x7f120874, float:1.9411118E38)
            r3.A0C = r0
            r0 = 2131888203(0x7f12084b, float:1.9411035E38)
        L_0x0084:
            r3.A05 = r0
            r0 = 2131888219(0x7f12085b, float:1.9411067E38)
            r3.A0D = r0
            r0 = 2
            r3.A02 = r0
            r0 = 62
            r3.A01 = r0
            r0 = 1
            r3.A0K = r0
            r0 = 0
            r3.A07 = r0
            r3.A06 = r0
            r0 = 8
            r3.A04 = r0
            r0 = 5
            A03(r4, r3, r0)
            r0 = 1
            r3.A0J = r0
            goto L_0x0061
        L_0x00a6:
            r0 = 2131888237(0x7f12086d, float:1.9411104E38)
            r3.A0C = r0
            r0 = 0
            r3.A0H = r0
            r0 = 2131888251(0x7f12087b, float:1.9411132E38)
            goto L_0x0084
        L_0x00b2:
            X.9i0 r3 = new X.9i0
            r3.<init>()
            r0 = 2
            r3.A02 = r0
            r0 = 62
            r3.A01 = r0
            r0 = 1
            r3.A0K = r0
            r0 = 2131888219(0x7f12085b, float:1.9411067E38)
            r3.A0D = r0
            r0 = 0
            r3.A07 = r0
            r3.A06 = r0
            r0 = 8
            r3.A04 = r0
            r0 = 10
            A03(r4, r3, r0)
            r0 = 1
            r3.A0J = r0
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x00e7
            r0 = 2131888242(0x7f120872, float:1.9411114E38)
            r3.A0C = r0
            r0 = 2131888241(0x7f120871, float:1.9411112E38)
            r3.A05 = r0
            goto L_0x0061
        L_0x00e7:
            boolean r0 = r4.A07
            r1 = 0
            if (r0 == 0) goto L_0x0209
            r0 = 2131886418(0x7f120152, float:1.9407414E38)
            r3.A0C = r0
            r0 = 2131886421(0x7f120155, float:1.940742E38)
            r3.A05 = r0
            r3.A0H = r1
            goto L_0x0061
        L_0x00fa:
            boolean r0 = r4.A04
            r2 = 0
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = "p2p/fpm/ChatTransferViewModel/Donor should not be in authentication state"
            goto L_0x020b
        L_0x0103:
            X.9i0 r3 = new X.9i0
            r3.<init>()
            boolean r0 = r4.A07
            r6 = 1
            if (r0 == 0) goto L_0x0162
            com.whatsapp.registration.AccountTransferManager r0 = r4.A0K
            X.19D r2 = r0.A03
            r1 = 12006(0x2ee6, float:1.6824E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 2131886407(0x7f120147, float:1.9407392E38)
            if (r1 == 0) goto L_0x0121
            r0 = 2131886408(0x7f120148, float:1.9407394E38)
        L_0x0121:
            r3.A0D = r0
            java.lang.String r2 = r4.A04
            if (r2 == 0) goto L_0x0130
            int r1 = r2.length()
            r0 = 2131886406(0x7f120146, float:1.940739E38)
            if (r1 != 0) goto L_0x0133
        L_0x0130:
            r0 = 2131886405(0x7f120145, float:1.9407388E38)
        L_0x0133:
            r3.A0C = r0
            r3.A0H = r2
            r3.A0I = r6
            r0 = 8
            r3.A00 = r0
            r0 = 0
            r3.A08 = r0
            r0 = 8
            r3.A04 = r0
            com.whatsapp.registration.AccountTransferManager r0 = r4.A0K
            boolean r5 = r4.A07
            X.19D r2 = r0.A03
            r1 = 11591(0x2d47, float:1.6242E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x015a
            if (r5 == 0) goto L_0x015a
            r0 = 8
            r3.A0B = r0
        L_0x015a:
            r0 = 6
            A03(r4, r3, r0)
            r3.A0J = r6
            goto L_0x0061
        L_0x0162:
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x0172
            int r0 = r0.intValue()
            if (r0 != r6) goto L_0x0172
            r0 = 2131888210(0x7f120852, float:1.9411049E38)
            r3.A0D = r0
            goto L_0x0130
        L_0x0172:
            r0 = 2131888210(0x7f120852, float:1.9411049E38)
            r3.A0D = r0
            r0 = 2131888209(0x7f120851, float:1.9411047E38)
            goto L_0x0133
        L_0x017b:
            X.9i0 r3 = new X.9i0
            r3.<init>()
            boolean r1 = r4.A07
            r3.A0L = r1
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x01b1
            r0 = 7
            if (r1 == 0) goto L_0x01a3
            r0 = 2131886415(0x7f12014f, float:1.9407408E38)
            r3.A0D = r0
            r0 = 2131886412(0x7f12014c, float:1.9407402E38)
            r3.A0C = r0
            r0 = 0
            r3.A09 = r0
            r0 = 2131887455(0x7f12055f, float:1.9409518E38)
            r3.A03 = r0
            r0 = 2131892995(0x7f121b03, float:1.9420754E38)
            r3.A0A = r0
            r0 = 0
        L_0x01a3:
            A03(r4, r3, r0)
        L_0x01a6:
            r1 = 9
            X.AWB r0 = new X.AWB
            r0.<init>(r4, r1)
            r3.A0F = r0
            goto L_0x0061
        L_0x01b1:
            if (r1 == 0) goto L_0x01f6
            com.whatsapp.registration.AccountTransferManager r0 = r4.A0K
            X.19D r7 = r0.A03
            r6 = 12006(0x2ee6, float:1.6824E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r5, r7, r6)
            r0 = 2131886416(0x7f120150, float:1.940741E38)
            if (r1 == 0) goto L_0x01c7
            r0 = 2131886417(0x7f120151, float:1.9407412E38)
        L_0x01c7:
            r3.A0D = r0
            java.lang.String r2 = r4.A04
            if (r2 == 0) goto L_0x01d6
            int r1 = r2.length()
            r0 = 2131886414(0x7f12014e, float:1.9407406E38)
            if (r1 != 0) goto L_0x01d9
        L_0x01d6:
            r0 = 2131886413(0x7f12014d, float:1.9407404E38)
        L_0x01d9:
            r3.A0C = r0
            r3.A0H = r2
            boolean r1 = X.C18020vd.A05(r5, r7, r6)
            r0 = 2131887455(0x7f12055f, float:1.9409518E38)
            if (r1 == 0) goto L_0x01e9
            r0 = 2131887451(0x7f12055b, float:1.940951E38)
        L_0x01e9:
            r3.A03 = r0
            r0 = 2131892995(0x7f121b03, float:1.9420754E38)
            r3.A0A = r0
        L_0x01f0:
            r0 = 8
            A03(r4, r3, r0)
            goto L_0x01a6
        L_0x01f6:
            r0 = 2131888226(0x7f120862, float:1.9411081E38)
            r3.A0D = r0
            r0 = 2131888224(0x7f120860, float:1.9411077E38)
            r3.A0C = r0
            r0 = 0
            r3.A0H = r0
            r0 = 2131887451(0x7f12055b, float:1.940951E38)
            r3.A03 = r0
            goto L_0x01f0
        L_0x0209:
            java.lang.String r0 = "p2p/fpm/ChatTransferViewModel/Receiver should not be in pairing state"
        L_0x020b:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.P2pTransferViewModel.A0d(int):void");
    }

    public void A0f(Bundle bundle) {
        if (!this.A05) {
            A0g(bundle);
            this.A0O.registerObserver(((ChatTransferViewModel) this).A0J);
            A0d(1);
            this.A05 = true;
        }
    }

    public void A0j(String str) {
        AnonymousClass3MY.A1L(this.A0F, true);
        AnonymousClass3MX.A1Q(new P2pTransferViewModel$validateQrCodeAndStartScanner$1(this, str, (C30391dr) null), C41561wd.A00(this));
    }

    public final boolean A0m(C20276AEj aEj) {
        this.A01 = aEj;
        aEj.A01();
        try {
            this.A0B.A0E(C25912CoW.A00(AnonymousClass00R.A01, aEj.A01(), (Map) null));
            return true;
        } catch (C2V e) {
            Log.e("p2p/P2pTransferViewModel/postQrCode/exception", e);
            return false;
        }
    }

    public P2pTransferViewModel(AnonymousClass11C r2, AnonymousClass118 r3, C18000vb r4, AnonymousClass19D r5, C175248yO r6, C25509Ch7 ch7, AnonymousClass10I r8) {
        this.A0I = r3;
        this.A0M = r8;
        this.A0H = r2;
        this.A0K = r5;
        this.A0O = r6;
        this.A0L = ch7;
        this.A0J = r4;
    }

    public C188349hH A0T() {
        return new C188349hH(new AWF(this, 10), new AWF(this, 11), 2131890830, 2131888215, 2131888238, 2131892281, false, true);
    }

    public void A0c() {
        A00();
        A0d(1);
        AnonymousClass3MX.A1K(this.A0D, 0);
    }

    public void A0k(boolean z) {
        A00();
        this.A05 = false;
    }
}
