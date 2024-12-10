package com.whatsapp.migration.transfer.ui;

import X.A7P;
import X.AWF;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass9L2;
import X.B8L;
import X.C181479Qq;
import X.C188349hH;
import X.C20276AEj;
import X.C24521Kq;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.migration.transfer.ui.P2pTransferViewModel$validateQrCodeAndStartScanner$1", f = "P2pTransferViewModel.kt", i = {0}, l = {462}, m = "invokeSuspend", n = {"connectionDetails"}, s = {"L$0"})
public final class P2pTransferViewModel$validateQrCodeAndStartScanner$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $qrCode;
    public Object L$0;
    public int label;
    public final /* synthetic */ P2pTransferViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P2pTransferViewModel$validateQrCodeAndStartScanner$1(P2pTransferViewModel p2pTransferViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.$qrCode = str;
        this.this$0 = p2pTransferViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new P2pTransferViewModel$validateQrCodeAndStartScanner$1(this.this$0, this.$qrCode, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C20276AEj A01;
        boolean z = obj;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(z);
            try {
                A01 = C20276AEj.A0E.A01(this.$qrCode, "fpm");
                this.this$0.A0i(A01.A09);
                P2pTransferViewModel p2pTransferViewModel = this.this$0;
                this.L$0 = A01;
                this.label = 1;
                ChatTransferViewModel chatTransferViewModel = (ChatTransferViewModel) p2pTransferViewModel;
                String str = A01.A02;
                if (!(str == null || str.length() == 0)) {
                    chatTransferViewModel.A07 = true;
                }
                if (!chatTransferViewModel.A07) {
                    chatTransferViewModel.A0R.get();
                    C24521Kq r0 = C24521Kq.$redex_init_class;
                    String str2 = A01.A07;
                    String A00 = C181479Qq.A00(chatTransferViewModel.A0C);
                    if (A00 == null) {
                        Log.e("p2p/fpm/ChatTransferViewModel/ verifyPeerID/unable to get hashed user");
                    } else if (!A00.equals(str2)) {
                        Log.e("p2p/fpm/ChatTransferViewModel/ verifyPeerID/phone number mismatch");
                        chatTransferViewModel.A0H.A05(0, 4, "qr_code_validity_check", 0);
                    }
                    chatTransferViewModel.A0E.A0E(chatTransferViewModel.A0T());
                    z = false;
                } else if (!chatTransferViewModel.A0S.BeK()) {
                    z = ChatTransferViewModel.A05(chatTransferViewModel, A01, this);
                    if (z == r5) {
                        return r5;
                    }
                }
                z = true;
            } catch (AnonymousClass9L2 e) {
                ChatTransferViewModel chatTransferViewModel2 = (ChatTransferViewModel) this.this$0;
                Log.e("p2p/fpm/ChatTransferViewModel/ getConnectionDetails/Unable to parse QR code", e);
                A7P a7p = chatTransferViewModel2.A0H;
                a7p.A04 = e.getMessage();
                a7p.A05(0, 3, "qr_code_validity_check", 0);
                int i2 = 2131888221;
                if (e.invalidQrType == 1) {
                    i2 = 2131888220;
                }
                chatTransferViewModel2.A0E.A0E(new C188349hH(new AWF(chatTransferViewModel2, 9), (B8L) null, 2131888222, i2, 2131897145, 0, false, true));
            }
        } else if (i == 1) {
            A01 = (C20276AEj) this.L$0;
            C30691eM.A01(z);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (AnonymousClass000.A1Y(z)) {
            this.this$0.A0h(A01);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((P2pTransferViewModel$validateQrCodeAndStartScanner$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
