package com.whatsapp.migration.transfer.ui;

import X.A7P;
import X.AMY;
import X.AW8;
import X.AWI;
import X.AnonymousClass00H;
import X.AnonymousClass10T;
import X.AnonymousClass1D6;
import X.AnonymousClass1OB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass5WJ;
import X.AnonymousClass9WL;
import X.AnonymousClass9WM;
import X.C005702m;
import X.C108935cY;
import X.C138296wq;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C196129uV;
import X.C198189xw;
import X.C19830z4;
import X.C198749yq;
import X.C20276AEj;
import X.C41731wy;
import X.C70813Cp;
import android.os.CancellationSignal;
import com.whatsapp.registration.AccountTransferManager;
import java.util.concurrent.CancellationException;

public final class ChatTransferViewModel extends P2pTransferViewModel {
    public int A00;
    public AWI A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public AnonymousClass1OB A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final CancellationSignal A09 = new CancellationSignal();
    public final AnonymousClass9WL A0A;
    public final AnonymousClass9WM A0B;
    public final C19830z4 A0C;
    public final C18030ve A0D;
    public final C196129uV A0E;
    public final AMY A0F;
    public final C198749yq A0G;
    public final A7P A0H;
    public final C138296wq A0I;
    public final AW8 A0J = new AW8(this);
    public final AccountTransferManager A0K;
    public final C41731wy A0L = AnonymousClass3MW.A0o();
    public final C41731wy A0M = AnonymousClass3MW.A0o();
    public final C41731wy A0N = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final C108935cY A0S = new AnonymousClass5WJ();
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;

    public void A0c() {
        this.A03 = null;
        this.A00 = 0;
        super.A0c();
        A08(this);
    }

    public void A0h(C20276AEj aEj) {
        C18070vi.A0d(aEj, 0);
        this.A0H.A06("p2p_network_initialization");
        super.A0h(aEj);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChatTransferViewModel(X.AnonymousClass9WL r27, X.AnonymousClass9WM r28, X.AnonymousClass11C r29, X.AnonymousClass118 r30, X.C19830z4 r31, X.C18000vb r32, X.AnonymousClass19D r33, X.C18030ve r34, X.C196129uV r35, X.AMY r36, X.C198749yq r37, X.A7P r38, X.C138296wq r39, X.C175248yO r40, X.C25509Ch7 r41, com.whatsapp.registration.AccountTransferManager r42, X.AnonymousClass10I r43, X.AnonymousClass00H r44, X.AnonymousClass00H r45, X.AnonymousClass00H r46, X.AnonymousClass00H r47, X.AnonymousClass00H r48, X.AnonymousClass00H r49) {
        /*
            r26 = this;
            r5 = r37
            r6 = r36
            r7 = r34
            r16 = r43
            r24 = r30
            r1 = r24
            r0 = r16
            X.C18070vi.A0w(r7, r1, r0, r6, r5)
            r9 = r38
            r18 = r33
            r19 = r32
            r8 = r44
            r25 = r29
            r2 = r18
            r1 = r25
            r0 = r19
            X.C18070vi.A0x(r9, r8, r1, r0, r2)
            r17 = r40
            r11 = r39
            r12 = r31
            r0 = r17
            X.C18070vi.A0r(r12, r11, r0)
            r0 = 14
            r10 = r45
            X.C18070vi.A0d(r10, r0)
            r3 = r47
            r4 = r46
            X.C18070vi.A0m(r4, r3)
            r0 = 18
            r13 = r35
            X.C18070vi.A0d(r13, r0)
            r0 = r49
            r2 = r48
            r15 = r27
            r14 = r28
            X.C18070vi.A0u(r15, r2, r0, r14)
            r1 = r26
            r22 = r41
            r20 = r18
            r21 = r17
            r23 = r16
            r16 = r1
            r17 = r25
            r18 = r24
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r1.A0D = r7
            r1.A0F = r6
            r1.A0G = r5
            r1.A0H = r9
            r1.A0Q = r8
            r1.A0C = r12
            r1.A0I = r11
            r1.A0P = r10
            r5 = r42
            r1.A0K = r5
            r1.A0T = r4
            r1.A0U = r3
            r1.A0E = r13
            r1.A0A = r15
            r1.A0R = r2
            r1.A0O = r0
            r1.A0B = r14
            X.AW8 r0 = new X.AW8
            r0.<init>(r1)
            r1.A0J = r0
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r1.A0N = r0
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r1.A0M = r0
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r1.A0L = r0
            X.5WJ r0 = new X.5WJ
            r0.<init>()
            r1.A0S = r0
            android.os.CancellationSignal r0 = new android.os.CancellationSignal
            r0.<init>()
            r1.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.ChatTransferViewModel.<init>(X.9WL, X.9WM, X.11C, X.118, X.0z4, X.0vb, X.19D, X.0ve, X.9uV, X.AMY, X.9yq, X.A7P, X.6wq, X.8yO, X.Ch7, com.whatsapp.registration.AccountTransferManager, X.10I, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H):void");
    }

    public static final int A00(ChatTransferViewModel chatTransferViewModel) {
        double d;
        AWI awi = chatTransferViewModel.A01;
        if (awi == null) {
            return 100;
        }
        long j = awi.A04;
        if (j == 0) {
            d = 0.0d;
        } else {
            long j2 = awi.A01;
            d = (((double) awi.A05) - ((double) j2)) / ((double) (j - j2));
        }
        return (int) (100.0d * (1.0d - d));
    }

    public static C198189xw A04(ChatTransferViewModel chatTransferViewModel) {
        return (C198189xw) chatTransferViewModel.A0O.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.whatsapp.migration.transfer.ui.ChatTransferViewModel r8, X.C20276AEj r9, X.C30391dr r10) {
        /*
            boolean r0 = r10 instanceof X.C21653Ani
            if (r0 == 0) goto L_0x006f
            r3 = r10
            X.Ani r3 = (X.C21653Ani) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006f
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r1 = r3.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r10 = 1
            if (r0 == 0) goto L_0x0058
            if (r0 != r10) goto L_0x0087
            java.lang.Object r8 = r3.L$0
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r8 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r8
            X.C30691eM.A01(r1)
        L_0x0024:
            int r1 = X.AnonymousClass000.A0M(r1)
            if (r1 == r10) goto L_0x0075
            r0 = 2
            if (r1 == r0) goto L_0x0051
            r0 = 3
            if (r1 != r0) goto L_0x004c
            X.1DT r1 = r8.A0E
            r5 = 2131890830(0x7f12128e, float:1.9416363E38)
            r6 = 2131888215(0x7f120857, float:1.941106E38)
            r7 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 2
            X.AWF r3 = new X.AWF
            r3.<init>(r8, r0)
            r8 = 0
            r4 = 0
            X.9hH r2 = new X.9hH
            r9 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0049:
            r1.A0E(r2)
        L_0x004c:
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            return r0
        L_0x0051:
            X.1DT r1 = r8.A0E
            X.9hH r2 = r8.A0T()
            goto L_0x0049
        L_0x0058:
            X.C30691eM.A01(r1)
            java.lang.String r0 = "p2p/fpm/ChatTransferViewModel/ calling verifyOtpCode"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.AccountTransferManager r1 = r8.A0K
            java.lang.String r0 = r9.A02
            r3.L$0 = r8
            r3.label = r10
            java.lang.Object r1 = r1.A02(r0, r3)
            if (r1 != r2) goto L_0x0024
            return r2
        L_0x006f:
            X.Ani r3 = new X.Ani
            r3.<init>(r8, r10)
            goto L_0x0012
        L_0x0075:
            X.5cY r1 = r8.A0S
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.BFN(r0)
            r0 = 3
            r8.A0d(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A05(com.whatsapp.migration.transfer.ui.ChatTransferViewModel, X.AEj, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[SYNTHETIC, Splitter:B:17:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(com.whatsapp.migration.transfer.ui.ChatTransferViewModel r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.C21652Anh
            if (r0 == 0) goto L_0x0024
            r5 = r9
            X.Anh r5 = (X.C21652Anh) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0024
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            java.lang.String r7 = "p2p/fpm/ChatTransferViewModel/ startOtpRotation/isOtpListExhausted=true, expiring qr code"
            r4 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r4) goto L_0x002e
            java.lang.Object r8 = r5.L$0
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r8 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r8
            goto L_0x002a
        L_0x0024:
            X.Anh r5 = new X.Anh
            r5.<init>(r8, r9)
            goto L_0x0012
        L_0x002a:
            X.C30691eM.A01(r1)     // Catch:{ CancellationException -> 0x0071 }
            goto L_0x0050
        L_0x002e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0033:
            X.C30691eM.A01(r1)
            java.lang.String r0 = "p2p/fpm/ChatTransferViewModel/ startOtpRotation"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x003b:
            com.whatsapp.registration.AccountTransferManager r0 = r8.A0K
            int r1 = r0.A00
            r0 = 6
            if (r1 >= r0) goto L_0x0074
            r5.L$0 = r8     // Catch:{ CancellationException -> 0x0071 }
            r5.label = r4     // Catch:{ CancellationException -> 0x0071 }
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = X.C62882s9.A00(r5, r0)     // Catch:{ CancellationException -> 0x0071 }
            if (r0 != r6) goto L_0x0050
            goto L_0x0070
        L_0x0050:
            X.AEj r3 = r8.A01
            if (r3 == 0) goto L_0x003b
            com.whatsapp.registration.AccountTransferManager r2 = r8.A0K
            int r1 = r2.A00
            r0 = 6
            if (r1 >= r0) goto L_0x0074
            int r0 = r1 + 1
            r2.A00 = r0
            com.whatsapp.registration.AccountTransferManager.A00(r2)
            java.lang.String r1 = com.whatsapp.registration.AccountTransferManager.A00(r2)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r3.A02 = r1
            r8.A0m(r3)
            goto L_0x003b
        L_0x0070:
            return r6
        L_0x0071:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0074:
            com.whatsapp.util.Log.i((java.lang.String) r7)
            X.1DT r0 = r8.A0C
            X.AnonymousClass3MY.A1M(r0, r4)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A06(com.whatsapp.migration.transfer.ui.ChatTransferViewModel, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r0 == 2) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0098, code lost:
        if (r1 != 10) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bb, code lost:
        if (X.C18070vi.A19(r10.A08.A06(), true) == false) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(com.whatsapp.migration.transfer.ui.ChatTransferViewModel r10) {
        /*
            X.A7P r6 = r10.A0H
            monitor-enter(r6)
            java.lang.String r2 = r6.A0J     // Catch:{ all -> 0x00dd }
            if (r2 == 0) goto L_0x000d
            java.lang.String r1 = "canceled"
            r0 = 0
            X.A7P.A02(r6, r2, r1, r0)     // Catch:{ all -> 0x00dd }
        L_0x000d:
            monitor-exit(r6)
            int r4 = r10.A00
            r5 = 6
            r3 = 4
            r7 = 2
            r2 = 1
            r1 = 0
            if (r4 == r2) goto L_0x0074
            if (r4 == r7) goto L_0x00c4
            r0 = 3
            if (r4 == r0) goto L_0x005b
            if (r4 == r3) goto L_0x002e
            r7 = 0
        L_0x001f:
            int r0 = r10.A00
            long r9 = (long) r0
            X.10I r0 = r6.A0B
            r8 = 3
            X.3C2 r5 = new X.3C2
            r5.<init>(r6, r7, r8, r9)
            r0.CGF(r5)
            return
        L_0x002e:
            java.lang.Integer r0 = r10.A03
            if (r0 == 0) goto L_0x0059
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0052
            r5 = 4
        L_0x0039:
            X.9xw r1 = A04(r10)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0050
            X.00H r4 = r1.A01
            X.A8V r3 = X.AnonymousClass8BR.A0q(r4)
            java.lang.String r2 = "chat_transfer_in_progress_cancel"
            java.lang.String r1 = "chat_transfer_in_progress"
            java.lang.String r0 = "back"
            X.A8V.A04(r3, r4, r1, r2, r0)
        L_0x0050:
            r7 = r5
            goto L_0x001f
        L_0x0052:
            if (r0 != r2) goto L_0x0056
            r5 = 5
            goto L_0x0039
        L_0x0056:
            if (r0 != r7) goto L_0x0059
            goto L_0x0039
        L_0x0059:
            r5 = 0
            goto L_0x0039
        L_0x005b:
            X.9xw r1 = A04(r10)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0072
            X.00H r4 = r1.A01
            X.A8V r3 = X.AnonymousClass8BR.A0q(r4)
            java.lang.String r2 = "chat_transfer_in_progress_cancel"
            java.lang.String r1 = "chat_transfer_in_progress"
            java.lang.String r0 = "back"
            X.A8V.A04(r3, r4, r1, r2, r0)
        L_0x0072:
            r7 = 3
            goto L_0x001f
        L_0x0074:
            X.1DT r0 = r10.A0D
            java.lang.Number r0 = X.C108945cZ.A1C(r0)
            if (r0 != 0) goto L_0x0080
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0080:
            int r1 = r0.intValue()
            r0 = 2
            r7 = 7
            if (r1 == r0) goto L_0x009b
            r7 = 9
            if (r1 == r3) goto L_0x009b
            if (r1 == r5) goto L_0x00c1
            r0 = 12
            if (r1 == r0) goto L_0x00be
            if (r1 == r7) goto L_0x00b0
            r0 = 10
            r7 = 11
            if (r1 == r0) goto L_0x009b
        L_0x009a:
            r7 = 0
        L_0x009b:
            X.9xw r1 = A04(r10)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x001f
            X.00H r4 = r1.A01
            X.A8V r3 = X.AnonymousClass8BR.A0q(r4)
            java.lang.String r2 = "chat_transfer_upsell_decline"
            java.lang.String r1 = "chat_transfer_upsell"
            java.lang.String r0 = "decline"
            goto L_0x00d8
        L_0x00b0:
            X.1DT r0 = r10.A08
            java.lang.Object r0 = r0.A06()
            boolean r0 = X.C18070vi.A19(r0, r2)
            r7 = 1
            if (r0 != 0) goto L_0x009b
            goto L_0x009a
        L_0x00be:
            r7 = 13
            goto L_0x009b
        L_0x00c1:
            r7 = 8
            goto L_0x009b
        L_0x00c4:
            X.9xw r1 = A04(r10)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x001f
            X.00H r4 = r1.A01
            X.A8V r3 = X.AnonymousClass8BR.A0q(r4)
            java.lang.String r2 = "qr_code_device_switching_cancel"
            java.lang.String r1 = "qr_code_device_switching"
            java.lang.String r0 = "back"
        L_0x00d8:
            X.A8V.A04(r3, r4, r1, r2, r0)
            goto L_0x001f
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A07(com.whatsapp.migration.transfer.ui.ChatTransferViewModel):void");
    }

    public static final void A08(ChatTransferViewModel chatTransferViewModel) {
        Integer num = chatTransferViewModel.A02;
        if (num == null || num.intValue() != 1) {
            AnonymousClass3MX.A1K(chatTransferViewModel.A0D, 9);
            chatTransferViewModel.A0H.A07("network_connection_check", "started");
            return;
        }
        AnonymousClass3MX.A1K(chatTransferViewModel.A0D, 1);
        chatTransferViewModel.A0H.A06("permissions_check");
    }

    public static final void A09(ChatTransferViewModel chatTransferViewModel) {
        AnonymousClass1OB r2 = chatTransferViewModel.A05;
        if (r2 != null) {
            r2.BEM(new CancellationException("registration succeeded/failed, cancel otp rotation"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00bb, code lost:
        if (r0 != 2) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0A(com.whatsapp.migration.transfer.ui.ChatTransferViewModel r8, int r9) {
        /*
            int r2 = r8.A00
            r5 = 1
            r1 = 2
            if (r2 == r1) goto L_0x0017
            r0 = 3
            if (r2 == r0) goto L_0x0017
            r0 = 4
            if (r2 != r0) goto L_0x00bd
            java.lang.Integer r0 = r8.A03
            if (r0 == 0) goto L_0x00bd
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x00b5
            r5 = 2
        L_0x0017:
            X.9xw r1 = A04(r8)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x002e
            X.00H r4 = r1.A01
            X.A8V r3 = X.AnonymousClass8BR.A0q(r4)
            java.lang.String r2 = "chat_transfer_in_progress_error"
            java.lang.String r1 = "chat_transfer_in_progress"
            java.lang.String r0 = "unknown"
            X.A8V.A04(r3, r4, r1, r2, r0)
        L_0x002e:
            X.A7P r4 = r8.A0H
            r6 = 1
            if (r9 == r6) goto L_0x00b2
            r0 = 2
            if (r9 == r0) goto L_0x00af
            r0 = 200(0xc8, float:2.8E-43)
            if (r9 == r0) goto L_0x00ac
            r0 = 202(0xca, float:2.83E-43)
            if (r9 == r0) goto L_0x00a9
            r0 = 501(0x1f5, float:7.02E-43)
            if (r9 == r0) goto L_0x00a6
            r0 = 301(0x12d, float:4.22E-43)
            if (r9 == r0) goto L_0x00a3
            r0 = 302(0x12e, float:4.23E-43)
            if (r9 == r0) goto L_0x00a0
            switch(r9) {
                case 100: goto L_0x009d;
                case 101: goto L_0x009a;
                case 102: goto L_0x0097;
                case 103: goto L_0x0094;
                case 104: goto L_0x0091;
                case 105: goto L_0x008e;
                case 106: goto L_0x008c;
                case 107: goto L_0x0089;
                case 108: goto L_0x0086;
                default: goto L_0x004d;
            }
        L_0x004d:
            switch(r9) {
                case 503: goto L_0x0083;
                case 504: goto L_0x0080;
                case 505: goto L_0x007d;
                default: goto L_0x0050;
            }
        L_0x0050:
            switch(r9) {
                case 600: goto L_0x0061;
                case 601: goto L_0x007a;
                case 602: goto L_0x0077;
                case 603: goto L_0x0075;
                case 604: goto L_0x0072;
                case 605: goto L_0x006f;
                case 606: goto L_0x006c;
                case 607: goto L_0x0069;
                default: goto L_0x0053;
            }
        L_0x0053:
            X.190 r3 = r4.A05
            java.lang.String r2 = java.lang.String.valueOf(r9)
            r1 = 0
            java.lang.String r0 = "p2p/fpm/unexpected-migration-error-code"
            r3.A0G(r0, r2, r1)
            r6 = 24
        L_0x0061:
            int r0 = r8.A00
            long r8 = (long) r0
            r7 = 0
            r4.A05(r5, r6, r7, r8)
            return
        L_0x0069:
            r6 = 28
            goto L_0x0061
        L_0x006c:
            r6 = 29
            goto L_0x0061
        L_0x006f:
            r6 = 15
            goto L_0x0061
        L_0x0072:
            r6 = 30
            goto L_0x0061
        L_0x0075:
            r6 = 5
            goto L_0x0061
        L_0x0077:
            r6 = 27
            goto L_0x0061
        L_0x007a:
            r6 = 26
            goto L_0x0061
        L_0x007d:
            r6 = 9
            goto L_0x0061
        L_0x0080:
            r6 = 35
            goto L_0x0061
        L_0x0083:
            r6 = 13
            goto L_0x0061
        L_0x0086:
            r6 = 39
            goto L_0x0061
        L_0x0089:
            r6 = 25
            goto L_0x0061
        L_0x008c:
            r6 = 4
            goto L_0x0061
        L_0x008e:
            r6 = 14
            goto L_0x0061
        L_0x0091:
            r6 = 32
            goto L_0x0061
        L_0x0094:
            r6 = 11
            goto L_0x0061
        L_0x0097:
            r6 = 17
            goto L_0x0061
        L_0x009a:
            r6 = 31
            goto L_0x0061
        L_0x009d:
            r6 = 33
            goto L_0x0061
        L_0x00a0:
            r6 = 34
            goto L_0x0061
        L_0x00a3:
            r6 = 37
            goto L_0x0061
        L_0x00a6:
            r6 = 10
            goto L_0x0061
        L_0x00a9:
            r6 = 23
            goto L_0x0061
        L_0x00ac:
            r6 = 22
            goto L_0x0061
        L_0x00af:
            r6 = 38
            goto L_0x0061
        L_0x00b2:
            r6 = 36
            goto L_0x0061
        L_0x00b5:
            if (r0 != r5) goto L_0x00ba
            r5 = 3
            goto L_0x0017
        L_0x00ba:
            r5 = 4
            if (r0 == r1) goto L_0x0017
        L_0x00bd:
            r5 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A0A(com.whatsapp.migration.transfer.ui.ChatTransferViewModel, int):void");
    }

    public void A0Y() {
        this.A0H.A07("qr_code_generation", "started");
        super.A0Y();
    }

    public void A0b() {
        this.A0H.A07("feature_eligibility_check", "completed");
        Integer num = this.A02;
        if (num == null || num.intValue() != 1 || !this.A08) {
            super.A0b();
        } else {
            AnonymousClass3MX.A1J(this.A0D, 13);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A0D, 3979) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A0K, 3980) != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        r4.A06("wa_update_screen_open");
        com.whatsapp.util.Log.e("p2p/fpm/ChatTransferViewModel/disabled: app version for platform migration is not supported");
        r2 = new X.C188799i0();
        r2.A0D = 2131897377;
        r2.A0C = 2131892303;
        r2.A03 = 2131897387;
        r2.A0F = new X.AWB(r6, 1);
        com.whatsapp.migration.transfer.ui.P2pTransferViewModel.A03(r6, r2, 2);
        r2.A02 = 63;
        r2.A01 = 210;
        r6.A0G.A0E(r2);
        r4.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0f(android.os.Bundle r7) {
        /*
            r6 = this;
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x0146
            r6.A0g(r7)
            X.9uV r0 = r6.A0E
            X.00H r1 = r0.A01
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass8BV.A06(r1)
            java.lang.String r2 = "/export/logging/attemptId"
            X.C17880vN.A1B(r0, r2)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BV.A06(r1)
            java.lang.String r0 = "/export/protocolVersion"
            X.C17880vN.A1B(r1, r0)
            X.A7P r4 = r6.A0H
            boolean r0 = r6.A04
            java.lang.Integer r1 = r6.A02
            monitor-enter(r4)
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0033
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0143 }
            r4.A00 = r0     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "donor"
            r4.A02 = r0     // Catch:{ all -> 0x0143 }
            goto L_0x003d
        L_0x0033:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0143 }
            r4.A00 = r0     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "receiver"
            r4.A02 = r0     // Catch:{ all -> 0x0143 }
        L_0x003d:
            if (r1 == 0) goto L_0x006a
            int r1 = r1.intValue()     // Catch:{ all -> 0x0143 }
            if (r1 != 0) goto L_0x0050
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0143 }
            r4.A01 = r0     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "donor"
            r4.A03 = r0     // Catch:{ all -> 0x0143 }
            goto L_0x006a
        L_0x0050:
            if (r1 != r3) goto L_0x005d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0143 }
            r4.A01 = r0     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "receiver"
            r4.A03 = r0     // Catch:{ all -> 0x0143 }
            goto L_0x006a
        L_0x005d:
            r0 = 2
            if (r1 != r0) goto L_0x006a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0143 }
            r4.A01 = r0     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "account_transfer"
            r4.A03 = r0     // Catch:{ all -> 0x0143 }
        L_0x006a:
            monitor-exit(r4)
            java.lang.String r1 = "landing_screen_open"
            monitor-enter(r4)
            X.9uV r0 = r4.A09     // Catch:{ all -> 0x0143 }
            X.00H r0 = r0.A01     // Catch:{ all -> 0x0143 }
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass8BV.A06(r0)     // Catch:{ all -> 0x0143 }
            X.C17880vN.A1B(r0, r2)     // Catch:{ all -> 0x0143 }
            r4.A0J = r1     // Catch:{ all -> 0x0143 }
            java.lang.String r2 = r4.A0J     // Catch:{ all -> 0x0143 }
            java.lang.String r1 = "started"
            r0 = 0
            X.A7P.A02(r4, r2, r1, r0)     // Catch:{ all -> 0x0143 }
            monitor-exit(r4)
            r0 = 2
            r4.A04(r0)
            boolean r0 = r6.A04
            r3 = 0
            if (r0 == 0) goto L_0x0099
            X.0ve r2 = r6.A0D
            r1 = 3979(0xf8b, float:5.576E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x00a9
        L_0x0099:
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x00e4
            X.19D r2 = r6.A0K
            r1 = 3980(0xf8c, float:5.577E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00e4
        L_0x00a9:
            java.lang.String r0 = "wa_update_screen_open"
            r4.A06(r0)
            java.lang.String r0 = "p2p/fpm/ChatTransferViewModel/disabled: app version for platform migration is not supported"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.9i0 r2 = new X.9i0
            r2.<init>()
            r0 = 2131897377(0x7f122c21, float:1.9429642E38)
            r2.A0D = r0
            r0 = 2131892303(0x7f12184f, float:1.941935E38)
            r2.A0C = r0
            r0 = 2131897387(0x7f122c2b, float:1.9429662E38)
            r2.A03 = r0
            r1 = 1
            X.AWB r0 = new X.AWB
            r0.<init>(r6, r1)
            r2.A0F = r0
            r0 = 2
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel.A03(r6, r2, r0)
            r0 = 63
            r2.A02 = r0
            r0 = 210(0xd2, float:2.94E-43)
            r2.A01 = r0
            X.1DT r0 = r6.A0G
            r0.A0E(r2)
            r4.A03()
            return
        L_0x00e4:
            X.00H r0 = r6.A0T
            X.10T r0 = X.C17880vN.A0V(r0)
            X.AW8 r1 = r6.A0J
            r0.registerObserver(r1)
            X.00H r0 = r6.A0U
            X.C72453Mb.A1Q(r0, r1)
            X.10I r1 = r6.A0M
            r5 = 1
            X.Ail r0 = new X.Ail
            r0.<init>(r6, r5)
            r1.CGF(r0)
            r0 = 3
            r4.A04(r0)
            X.00H r2 = r6.A0O
            java.lang.Object r1 = r2.get()
            X.9xw r1 = (X.C198189xw) r1
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0114
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x0114
            r3 = 1
        L_0x0114:
            r1.A00 = r3
            java.lang.Object r1 = r2.get()
            X.9xw r1 = (X.C198189xw) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x012f
            X.00H r0 = r1.A01
            X.A8V r3 = X.AnonymousClass8BR.A0q(r0)
            java.lang.String r2 = "chat_transfer_upsell_landing"
            java.lang.String r1 = "view"
            java.lang.String r0 = "chat_transfer_upsell"
            r3.A0J(r0, r2, r1)
        L_0x012f:
            X.0z4 r0 = r6.A0C
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "chat_transfer_in_progress"
            X.C17880vN.A1F(r1, r0, r5)
            super.A0f(r7)
            java.lang.String r0 = "landing_screen_click"
            r4.A06(r0)
            return
        L_0x0143:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A0f(android.os.Bundle):void");
    }

    public void A0j(String str) {
        A7P a7p = this.A0H;
        a7p.A07("qr_code_validity_check", "started");
        a7p.A04(7);
        super.A0j(str);
    }

    public final void A0n(int i, int i2) {
        int max;
        if (this.A00 != 5 && (max = Math.max(Math.min(i2, 100), 0)) > this.A00) {
            this.A00 = max;
            this.A0A.A0E(AnonymousClass1D6.A00(Integer.valueOf(i), max));
        }
    }

    public final void A0o(C005702m r3) {
        if (r3.A00 == -1) {
            super.A0b();
        }
    }

    public void A0S() {
        super.A0S();
        AnonymousClass10T A0V = C17880vN.A0V(this.A0T);
        AW8 aw8 = this.A0J;
        A0V.unregisterObserver(aw8);
        C17880vN.A0V(this.A0U).unregisterObserver(aw8);
    }

    public void A0W() {
        super.A0W();
        this.A0H.A07("qr_code_scanning_screen_click", "canceled");
    }

    public void A0X() {
        super.A0X();
        A7P a7p = this.A0H;
        a7p.A04(5);
        a7p.A07("qr_code_scanning_screen_open", "started");
    }

    public void A0Z() {
        super.A0Z();
        this.A0H.A05(0, 2, "qr_code_generation", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2 != 2) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0g(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A0g(r4)
            java.lang.String r0 = "entry_point"
            int r2 = r4.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A02 = r0
            if (r0 == 0) goto L_0x0015
            r0 = 2
            r1 = 1
            if (r2 == r0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            r3.A07 = r1
            java.lang.String r1 = "qr_code_data"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = r4.getString(r1)
            r3.A03 = r0
        L_0x0026:
            java.lang.String r0 = "donor_device_name"
            java.lang.String r0 = r4.getString(r0)
            r3.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A0g(android.os.Bundle):void");
    }

    public void A0k(boolean z) {
        super.A0k(z);
        this.A0M.CGF(new C70813Cp(15, (Object) this, z));
        C17880vN.A1F(C19830z4.A00(this.A0C), "chat_transfer_in_progress", false);
    }
}
