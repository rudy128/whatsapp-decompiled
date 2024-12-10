package X;

import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.Acl  reason: case insensitive filesystem */
public class C20993Acl implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public static void A00(C20993Acl acl, Throwable th) {
        ((BC2) acl.A03).onError(800);
        Log.e("Connection/handleInvalidJidReceived", th);
        ((AnonymousClass12M) acl.A01).A00.A0G("Connection/handleInvalidJidReceived", "invalid-jid-received", true);
        ((C23570Bly) acl.A02).A03((Object) null);
    }

    public static final void A01(C184979bp r8, C29621ca r9, AnonymousClass9F6 r10) {
        AnonymousClass1UI r0;
        int A17 = C18070vi.A17(r9, r10);
        ArrayList A13 = AnonymousClass000.A13();
        try {
            C108945cZ.A1N(r9);
            Object obj = r10.A00;
            C62672rm A0s = AnonymousClass8BR.A0s();
            A8Z a8z = A8Z.A00;
            C21290Ahb ahb = new C21290Ahb(obj, a8z, 29);
            String[] strArr = new String[A17];
            strArr[0] = "account";
            if (A0s.A03(r9, ahb, strArr) == null) {
                r0 = AnonymousClass1O9.A00(A0s);
            } else if (C21290Ahb.A02(r9, A0s, obj, a8z, 30) != null) {
                BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = r8.A00;
                AnonymousClass8BT.A1K(brazilPixKeySettingViewModel.A09, brazilPixKeySettingViewModel, r8.A01, 45);
                return;
            } else {
                r0 = AnonymousClass1O9.A00(A0s);
            }
            throw r0;
        } catch (AnonymousClass1UI e) {
            AnonymousClass8BY.A1I("RemoveCustomPaymentMethodResponseSuccess: ", AnonymousClass000.A10(), e, A13);
            C108945cZ.A1N(r9);
            Object obj2 = r10.A00;
            C62672rm A0s2 = AnonymousClass8BR.A0s();
            if (C21290Ahb.A02(r9, A0s2, obj2, A8Z.A00, 28) != null) {
                int A002 = C60482o6.A00(r9);
                AnonymousClass1DT r2 = r8.A00.A01;
                int i = 2;
                if (A002 == 446) {
                    i = 4;
                }
                AnonymousClass3MX.A1K(r2, i);
                AnonymousClass8BS.A1F("BrazilPixKeySettingViewModel", "removePixKey/handle::RemoveCustomPaymentMethodResponseError");
                return;
            }
            throw AnonymousClass1O9.A00(A0s2);
        } catch (AnonymousClass1UI e2) {
            throw AnonymousClass8BY.A0N("RemoveCustomPaymentMethodResponseError: ", AnonymousClass000.A10(), e2, A13);
        }
    }

    public C20993Acl(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0161, code lost:
        X.C17900vP.A0e(r0, r5, r1);
        r3 = (X.AMT) r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x016f, code lost:
        X.C17900vP.A0e(r0, r5, r1);
        r3 = (X.AMT) r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0184, code lost:
        r3.Bt2("delivery failure", 3, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x018b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BrD(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0177;
                case 1: goto L_0x0169;
                case 2: goto L_0x015b;
                case 3: goto L_0x0154;
                case 4: goto L_0x014d;
                case 5: goto L_0x013f;
                case 6: goto L_0x0127;
                case 7: goto L_0x011a;
                case 8: goto L_0x0109;
                case 9: goto L_0x00f2;
                case 10: goto L_0x00d4;
                case 11: goto L_0x00bd;
                case 12: goto L_0x009f;
                case 13: goto L_0x008a;
                case 14: goto L_0x0082;
                case 15: goto L_0x0067;
                case 16: goto L_0x0028;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r2 = r4.A01
            X.Bly r2 = (X.C23570Bly) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed deliver: iq="
            X.AnonymousClass8BY.A0m(r2, r0, r5, r1)
            java.lang.Object r0 = r4.A03
            X.9dw r0 = (X.C186279dw) r0
            X.19Y r3 = r0.A01
            int r2 = r5.hashCode()
            r1 = 3
            r0 = 154475307(0x9351b2b, float:2.1799857E-33)
            r3.markerEnd(r0, r2, r1)
            return
        L_0x0028:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BizVNameXmppMethods/sendGetBizVNameCert/onDeliveryFailure; iq="
            X.C17900vP.A0f(r0, r5, r1)
            java.lang.Object r0 = r4.A01
            X.9nP r0 = (X.C191919nP) r0
            X.00H r3 = r0.A02
            java.lang.Object r2 = r3.get()
            X.2nO r2 = (X.C60102nO) r2
            java.lang.String r1 = "error_reason"
            java.lang.String r0 = "iq_delivery_failure"
            r2.A03(r1, r0)
            java.lang.Object r1 = r3.get()
            X.2nO r1 = (X.C60102nO) r1
            java.lang.String r0 = "fetch_cert"
            r1.A00(r0)
            java.lang.Object r1 = r3.get()
            X.2nO r1 = (X.C60102nO) r1
            r0 = 0
            r1.A04(r0)
            java.lang.Object r2 = r4.A03
            X.Bly r2 = (X.C23570Bly) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Delivery failure: iq="
            X.AnonymousClass8BY.A0m(r2, r0, r5, r1)
            return
        L_0x0067:
            java.lang.Object r0 = r4.A02
            X.9bp r0 = (X.C184979bp) r0
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r0 = r0.A00
            X.1DT r1 = r0.A01
            r0 = 2
            X.AnonymousClass3MX.A1K(r1, r0)
            java.lang.String r1 = "BrazilPixKeySettingViewModel"
            java.lang.String r0 = "removePixKey/handleDeliveryFailure"
            X.AnonymousClass8BS.A1F(r1, r0)
            java.lang.String r1 = "BrazilPaymentAccountActions"
            java.lang.String r0 = "removePixKey/onDeliveryFailure triggered"
            X.AnonymousClass8BS.A1F(r1, r0)
            return
        L_0x0082:
            java.lang.Object r1 = r4.A03
            X.2qB r1 = (X.C61742qB) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x008a:
            java.lang.Object r2 = r4.A01
            X.12M r2 = (X.AnonymousClass12M) r2
            java.lang.Object r1 = r4.A02
            X.1EC r1 = (X.AnonymousClass1EC) r1
            java.lang.Object r0 = r4.A03
            X.2sm r0 = (X.C63262sm) r0
            X.AnonymousClass12M.A01(r0, r2, r1)
            java.lang.String r0 = "GroupXmppMethod/GetGroupInfo/delivery fail"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x009f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupXmppMethods/sendSetGroupDescription/onDeliveryFailure; iq="
            X.C17900vP.A0f(r0, r5, r1)
            java.lang.Object r0 = r4.A03
            X.BC3 r0 = (X.BC3) r0
            r0.BrD(r5)
            java.lang.Object r2 = r4.A02
            X.Bly r2 = (X.C23570Bly) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sendSetGroupDescription IQ was not delivered: iq="
            X.AnonymousClass8BY.A0m(r2, r0, r5, r1)
            return
        L_0x00bd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupXmppMethods/sendGetGroupInfoByInviteAddKey/onDeliveryFailure; iq="
            X.C17900vP.A0f(r0, r5, r1)
            java.lang.Object r2 = r4.A02
            X.Bly r2 = (X.C23570Bly) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sendGetGroupInfoByInviteAddKey IQ was not delivered: iq="
            X.AnonymousClass8BY.A0m(r2, r0, r5, r1)
            return
        L_0x00d4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupXmppMethods/sendModifyAdmin/onDeliveryFailure; iq="
            X.C17900vP.A0f(r0, r5, r1)
            java.lang.Object r0 = r4.A03
            X.BC2 r0 = (X.BC2) r0
            r0.BrE()
            java.lang.Object r2 = r4.A02
            X.Bly r2 = (X.C23570Bly) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sendModifyAdmin IQ was not delivered: iq="
            X.AnonymousClass8BY.A0m(r2, r0, r5, r1)
            return
        L_0x00f2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupXmppMethods/sendGetGroupInfoByCode/onDeliveryFailure; iq="
            X.C17900vP.A0f(r0, r5, r1)
            java.lang.Object r2 = r4.A02
            X.Bly r2 = (X.C23570Bly) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sendGetGroupInfoByCode IQ was not delivered: iq="
            X.AnonymousClass8BY.A0m(r2, r0, r5, r1)
            return
        L_0x0109:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r1 = r4.A01
            X.1Ug r1 = (X.C26981Ug) r1
            X.9L7 r0 = new X.9L7
            r0.<init>(r5)
            r1.BrC(r0)
            return
        L_0x011a:
            java.lang.Object r1 = r4.A03
            X.1TI r1 = (X.AnonymousClass1TI) r1
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.accept(r0)
            return
        L_0x0127:
            java.lang.String r0 = "Bloks: IQRequestHelper/sendIQRequest onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r4.A03
            X.A71 r0 = (X.A71) r0
            X.1KB r3 = r0.A00
            java.lang.Object r2 = r4.A01
            r1 = 36
            X.AkC r0 = new X.AkC
            r0.<init>(r2, r1)
            r3.CGP(r0)
            return
        L_0x013f:
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r5)
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/onDeliveryFailure id="
            X.C17900vP.A0e(r0, r5, r1)
            java.lang.Object r3 = r4.A01
            X.B72 r3 = (X.B72) r3
            goto L_0x0184
        L_0x014d:
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r5)
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendInitRegIq/onDeliveryFailure id="
            goto L_0x0161
        L_0x0154:
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r5)
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendInitLoginIq/onDeliveryFailure id="
            goto L_0x016f
        L_0x015b:
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r5)
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendFinishRegIq/onDeliveryFailure id="
        L_0x0161:
            X.C17900vP.A0e(r0, r5, r1)
            java.lang.Object r3 = r4.A01
            X.AMT r3 = (X.AMT) r3
            goto L_0x0184
        L_0x0169:
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r5)
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess/onDeliveryFailure id="
        L_0x016f:
            X.C17900vP.A0e(r0, r5, r1)
            java.lang.Object r3 = r4.A01
            X.AMT r3 = (X.AMT) r3
            goto L_0x0184
        L_0x0177:
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r5)
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendDeleteAccountIq/onDeliveryFailure id="
            X.C17900vP.A0e(r0, r5, r1)
            java.lang.Object r3 = r4.A01
            X.B72 r3 = (X.B72) r3
        L_0x0184:
            r2 = 3
            r1 = -1
            java.lang.String r0 = "delivery failure"
            r3.Bt2(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20993Acl.BrD(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r0 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b2, code lost:
        X.AnonymousClass1NU.A00(r0, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        X.AnonymousClass8BU.A1G(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bt9(X.C29621ca r8, java.lang.String r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            r4 = r8
            switch(r0) {
                case 0: goto L_0x01ab;
                case 1: goto L_0x01a3;
                case 2: goto L_0x019b;
                case 3: goto L_0x01a3;
                case 4: goto L_0x019b;
                case 5: goto L_0x0193;
                case 6: goto L_0x0174;
                case 7: goto L_0x015c;
                case 8: goto L_0x014c;
                case 9: goto L_0x0116;
                case 10: goto L_0x0006;
                case 11: goto L_0x0006;
                case 12: goto L_0x0092;
                case 13: goto L_0x0102;
                case 14: goto L_0x0016;
                case 15: goto L_0x00ef;
                case 16: goto L_0x0017;
                case 17: goto L_0x009f;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r7.A03
            X.BC2 r1 = (X.BC2) r1
            int r0 = X.C60482o6.A00(r8)
            r1.onError(r0)
        L_0x0011:
            java.lang.Object r0 = r7.A02
        L_0x0013:
            X.AnonymousClass8BU.A1G(r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BizVNameXmppMethods/sendGetBizVNameCert/onError; iq="
            X.C17900vP.A0f(r0, r9, r1)
            int r6 = X.C60482o6.A00(r8)
            java.lang.Object r4 = r7.A01
            X.9nP r4 = (X.C191919nP) r4
            java.lang.Object r3 = r7.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BizVNameXmppMethods/recvmessagelistener/on-get-biz-vname-cert-error jid="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " errorCode="
            X.C17900vP.A0j(r0, r1, r6)
            X.00H r0 = r4.A01
            java.lang.Object r2 = r0.get()
            X.1PM r2 = (X.AnonymousClass1PM) r2
            java.util.Map r1 = r2.A08
            java.lang.Long r0 = X.C108955ca.A0m()
            r1.put(r3, r0)
            X.1PO r2 = r2.A02
            X.9jA r1 = new X.9jA
            r1.<init>(r3)
            r0 = 14
            X.C17890vO.A0s(r2, r1, r0)
            X.00H r5 = r4.A02
            java.lang.Object r0 = r5.get()
            X.2nO r0 = (X.C60102nO) r0
            java.lang.String r4 = "error_code"
            long r2 = (long) r6
            java.lang.String r1 = "fetch_and_validate_vname"
            java.util.Map r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            X.19a r0 = (X.C222119a) r0
            if (r0 == 0) goto L_0x007a
            X.19Y r1 = r0.A06
            X.19b r0 = r0.A05
            int r0 = r0.A06
            r1.markerAnnotate((int) r0, (java.lang.String) r4, (long) r2)
        L_0x007a:
            java.lang.Object r1 = r5.get()
            X.2nO r1 = (X.C60102nO) r1
            java.lang.String r0 = "fetch_cert"
            r1.A00(r0)
            java.lang.Object r1 = r5.get()
            X.2nO r1 = (X.C60102nO) r1
            r0 = 0
            r1.A04(r0)
            java.lang.Object r0 = r7.A03
            goto L_0x0013
        L_0x0092:
            java.lang.Object r1 = r7.A03
            X.BC3 r1 = (X.BC3) r1
            int r0 = X.C60482o6.A00(r8)
            r1.Bt1(r9, r0)
            goto L_0x0011
        L_0x009f:
            X.C18070vi.A0h(r9, r8)
            int r4 = X.C60482o6.A00(r8)
            java.lang.Object r3 = r7.A02
            X.9bA r3 = (X.C184569bA) r3
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r1 = r3.A00
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0q(r0, r1)
            java.lang.String r2 = r0.toString()
            r0 = 404(0x194, float:5.66E-43)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r4 == r0) goto L_0x00e9
            java.lang.String r0 = "error in response while running get status privacy job"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ; code="
            X.C17900vP.A0i(r0, r1, r4)
        L_0x00cc:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A01
            r0.set(r4)
            java.lang.Object r0 = r7.A01
            X.AnonymousClass8BU.A1G(r0)
            java.lang.Object r0 = r7.A03
            X.9dw r0 = (X.C186279dw) r0
            X.19Y r3 = r0.A01
            int r2 = r9.hashCode()
            r1 = 87
            r0 = 154475307(0x9351b2b, float:2.1799857E-33)
            r3.markerEnd(r0, r2, r1)
            return
        L_0x00e9:
            java.lang.String r0 = "get status privacy job response is 'no settings found on server'"
            X.C17900vP.A0f(r0, r2, r1)
            goto L_0x00cc
        L_0x00ef:
            java.lang.Object r1 = r7.A03
            X.9F6 r1 = (X.AnonymousClass9F6) r1
            java.lang.Object r0 = r7.A02
            X.9bp r0 = (X.C184979bp) r0
            A01(r0, r8, r1)
            java.lang.String r1 = "BrazilPaymentAccountActions"
            java.lang.String r0 = "removePixKey/onError triggered"
            X.AnonymousClass8BS.A1F(r1, r0)
            return
        L_0x0102:
            int r3 = X.C60482o6.A00(r8)
            java.lang.Object r2 = r7.A01
            X.12M r2 = (X.AnonymousClass12M) r2
            java.lang.Object r1 = r7.A02
            X.1EC r1 = (X.AnonymousClass1EC) r1
            java.lang.Object r0 = r7.A03
            X.2sm r0 = (X.C63262sm) r0
            X.AnonymousClass12M.A02(r0, r2, r1, r3)
            return
        L_0x0116:
            java.lang.Object r1 = r7.A03
            X.9XY r1 = (X.AnonymousClass9XY) r1
            int r4 = X.C60482o6.A00(r8)
            r0 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r4 == r0) goto L_0x0145
            r0 = 403(0x193, float:5.65E-43)
            if (r4 == r0) goto L_0x013e
            r2 = 404(0x194, float:5.66E-43)
            X.9BN r0 = r1.A00
            X.126 r1 = r0.A03
            r0 = 2021(0x7e5, float:2.832E-42)
            if (r4 == r2) goto L_0x0133
            r0 = 2018(0x7e2, float:2.828E-42)
        L_0x0133:
            r1.A0O(r0, r3)
            java.lang.Object r0 = r7.A02
            X.Bly r0 = (X.C23570Bly) r0
            r0.A03(r3)
            return
        L_0x013e:
            X.9BN r0 = r1.A00
            X.126 r1 = r0.A03
            r0 = 2020(0x7e4, float:2.83E-42)
            goto L_0x0133
        L_0x0145:
            X.9BN r0 = r1.A00
            X.126 r1 = r0.A03
            r0 = 2019(0x7e3, float:2.829E-42)
            goto L_0x0133
        L_0x014c:
            X.C18070vi.A0h(r9, r8)
            java.lang.Object r1 = r7.A01
            X.1Ug r1 = (X.C26981Ug) r1
            X.6Sm r0 = new X.6Sm
            r0.<init>(r8, r9)
            r1.BrC(r0)
            return
        L_0x015c:
            java.lang.String r0 = "error"
            X.1ca r1 = r8.A0L(r0)
            java.lang.String r0 = "code"
            int r0 = r1.A09(r0)
            java.lang.Object r1 = r7.A03
            X.1TI r1 = (X.AnonymousClass1TI) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.accept(r0)
            return
        L_0x0174:
            r0 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass3MZ.A19(r8, r0)
            java.lang.String r0 = "Bloks: IQRequestHelper/sendIQRequest onError: "
            X.C17900vP.A0X(r8, r0, r1)
            java.lang.Object r5 = r7.A03
            X.A71 r5 = (X.A71) r5
            X.1KB r0 = r5.A00
            java.lang.Object r2 = r7.A02
            java.lang.Object r3 = r7.A01
            r6 = 39
            X.Aix r1 = new X.Aix
            r1.<init>(r2, r3, r4, r5, r6)
            r0.CGP(r1)
            return
        L_0x0193:
            X.C18070vi.A0h(r9, r8)
            java.lang.Object r0 = r7.A01
            X.B72 r0 = (X.B72) r0
            goto L_0x01b2
        L_0x019b:
            X.C18070vi.A0h(r9, r8)
            java.lang.Object r0 = r7.A01
            X.AMT r0 = (X.AMT) r0
            goto L_0x01b2
        L_0x01a3:
            X.C18070vi.A0h(r9, r8)
            java.lang.Object r0 = r7.A01
            X.AMT r0 = (X.AMT) r0
            goto L_0x01b2
        L_0x01ab:
            X.C18070vi.A0h(r9, r8)
            java.lang.Object r0 = r7.A01
            X.B72 r0 = (X.B72) r0
        L_0x01b2:
            X.AnonymousClass1NU.A00(r0, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20993Acl.Bt9(X.1ca, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.BDl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.8g4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: X.8g3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: X.8g4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: X.BDm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: X.BDl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v61, resolved type: X.BDl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: X.8g3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: X.8g3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v62, resolved type: X.BDl} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0332, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A03, 6531) != false) goto L_0x0334;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:429:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r42, java.lang.String r43) {
        /*
            r41 = this;
            r1 = r41
            int r2 = r1.A00
            r0 = r42
            r3 = r43
            switch(r2) {
                case 0: goto L_0x0bb3;
                case 1: goto L_0x0b19;
                case 2: goto L_0x0a9e;
                case 3: goto L_0x0834;
                case 4: goto L_0x06b7;
                case 5: goto L_0x0654;
                case 6: goto L_0x063d;
                case 7: goto L_0x0625;
                case 8: goto L_0x056d;
                case 9: goto L_0x0487;
                case 10: goto L_0x03e6;
                case 11: goto L_0x036b;
                case 12: goto L_0x035e;
                case 13: goto L_0x02ff;
                case 14: goto L_0x01ee;
                case 15: goto L_0x01e2;
                case 16: goto L_0x00b4;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.C18070vi.A0h(r3, r0)
            java.lang.String r2 = "privacy"
            X.1ca r2 = r0.A0L(r2)
            java.lang.String r0 = "list"
            java.util.Iterator r13 = X.AnonymousClass8BW.A0r(r2, r0)
            r8 = 0
            r10 = r8
            r11 = r8
        L_0x001d:
            r4 = 0
        L_0x001e:
            boolean r0 = r13.hasNext()
            r7 = 2
            r6 = 154475307(0x9351b2b, float:2.1799857E-33)
            if (r0 == 0) goto L_0x09e8
            X.1ca r9 = X.C17880vN.A0a(r13)
            java.lang.String r0 = "user"
            java.util.List r0 = r9.A0R(r0)
            java.util.ArrayList r5 = X.C108965cb.A0t(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x003a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0052
            X.1ca r7 = X.C17880vN.A0a(r12)
            java.lang.Class<X.1BI> r2 = X.AnonymousClass1BI.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r0 = r7.A0F(r2, r0)
            if (r0 == 0) goto L_0x003a
            r5.add(r0)
            goto L_0x003a
        L_0x0052:
            java.lang.String r0 = "type"
            java.lang.String r7 = r9.A0Q(r0, r8)
            java.lang.String r0 = "default"
            java.lang.String r2 = r9.A0Q(r0, r8)
            java.lang.String r0 = "true"
            boolean r9 = r0.equals(r2)
            if (r7 == 0) goto L_0x009e
            int r2 = r7.hashCode()
            r0 = -1653850041(0xffffffff9d6c4047, float:-3.126757E-21)
            if (r2 == r0) goto L_0x0091
            r0 = -567451565(0xffffffffde2d6053, float:-3.12326916E18)
            if (r2 == r0) goto L_0x0086
            r0 = 1333012765(0x4f74291d, float:4.0963351E9)
            if (r2 != r0) goto L_0x001e
            java.lang.String r0 = "blacklist"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001e
            if (r9 == 0) goto L_0x0084
            r4 = 2
        L_0x0084:
            r11 = r5
            goto L_0x001e
        L_0x0086:
            java.lang.String r0 = "contacts"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001e
            if (r9 == 0) goto L_0x001e
            goto L_0x001d
        L_0x0091:
            java.lang.String r0 = "whitelist"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001e
            if (r9 == 0) goto L_0x009c
            r4 = 1
        L_0x009c:
            r10 = r5
            goto L_0x001e
        L_0x009e:
            java.lang.Object r0 = r1.A03
            X.9dw r0 = (X.C186279dw) r0
            X.19Y r2 = r0.A01
            int r1 = r3.hashCode()
            r0 = 4158(0x103e, float:5.827E-42)
            r2.markerEnd(r6, r1, r0)
            java.lang.String r0 = "status list type is null"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x00b4:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r2 = "BizVNameXmppMethods/sendGetBizVNameCert/onSuccess; iq="
            X.C17900vP.A0f(r2, r3, r4)
            java.lang.String r2 = "verified_name"
            X.1ca r2 = r0.A0K(r2)
            X.C17960vV.A07(r2)
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r9 = r2.A0F(r3, r0)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            if (r9 != 0) goto L_0x00d6
            java.lang.Object r9 = r1.A02
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
        L_0x00d6:
            java.lang.String r0 = "v"
            r5 = 0
            java.lang.String r8 = r2.A0Q(r0, r5)
            java.lang.String r0 = "verified_level"
            java.lang.String r3 = r2.A0Q(r0, r5)
            java.lang.String r0 = "serial"
            r6 = 0
            long r14 = r2.A0D(r0, r6)
            java.lang.String r0 = "host_storage"
            java.lang.String r6 = r2.A0Q(r0, r5)
            java.lang.String r0 = "actual_actors"
            java.lang.String r4 = r2.A0Q(r0, r5)
            java.lang.String r0 = "privacy_mode_ts"
            java.lang.String r0 = r2.A0Q(r0, r5)
            X.1ya r10 = new X.1ya
            r10.<init>((java.lang.String) r6, (java.lang.String) r4, (java.lang.String) r0)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r8)
            java.lang.String r4 = "fetch_cert"
            java.lang.String r6 = "error_reason"
            if (r0 == 0) goto L_0x019d
            if (r3 == 0) goto L_0x019d
            byte[] r12 = r2.A01
            java.lang.Object r11 = r1.A01
            X.9nP r11 = (X.C191919nP) r11
            X.00H r0 = r11.A01
            r0.get()
            if (r12 == 0) goto L_0x0169
            X.8aU r0 = X.C165038aU.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0163, IllegalArgumentException -> 0x0154 }
            X.Bm6 r2 = X.C23577Bm6.A07(r0, r12)     // Catch:{ 1PN -> 0x0163, IllegalArgumentException -> 0x0154 }
            X.8aU r2 = (X.C165038aU) r2     // Catch:{ 1PN -> 0x0163, IllegalArgumentException -> 0x0154 }
            int r0 = r2.bitField0_     // Catch:{ 1PN -> 0x0163, IllegalArgumentException -> 0x0154 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0169
            X.DSQ r0 = r2.details_     // Catch:{ 1PN -> 0x0163, IllegalArgumentException -> 0x0154 }
            byte[] r2 = r0.A06()     // Catch:{ 1PN -> 0x0163, IllegalArgumentException -> 0x0154 }
            X.8bQ r0 = X.C165578bQ.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0163, IllegalArgumentException -> 0x0154 }
            X.Bm6 r2 = X.C23577Bm6.A07(r0, r2)     // Catch:{ 1PN -> 0x0163, IllegalArgumentException -> 0x0154 }
            X.8bQ r2 = (X.C165578bQ) r2     // Catch:{ 1PN -> 0x0163, IllegalArgumentException -> 0x0154 }
            if (r2 == 0) goto L_0x0169
            int r0 = r2.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0144
            long r14 = r2.serial_
            goto L_0x017b
        L_0x0144:
            java.lang.String r0 = "BizNameXmppMethods/createGetBizVNameCertResponseHandler/onSuccess, serial is not present in certblob"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00H r0 = r11.A02
            java.lang.Object r2 = r0.get()
            X.2nO r2 = (X.C60102nO) r2
            java.lang.String r0 = "no_serial_in_cert"
            goto L_0x0178
        L_0x0154:
            r7 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "vname failed to get identity entry for jid = "
            java.lang.String r0 = X.AnonymousClass001.A1E(r5, r0, r2)
            com.whatsapp.util.Log.w(r0, r7)
            goto L_0x0169
        L_0x0163:
            r2 = move-exception
            java.lang.String r0 = "vname invalidproto:"
            com.whatsapp.util.Log.w(r0, r2)
        L_0x0169:
            java.lang.String r0 = "BizNameXmppMethods/createGetBizVNameCertResponseHandler/onSuccess, certblob is null."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00H r0 = r11.A02
            java.lang.Object r2 = r0.get()
            X.2nO r2 = (X.C60102nO) r2
            java.lang.String r0 = "empty_cert"
        L_0x0178:
            r2.A03(r6, r0)
        L_0x017b:
            int r13 = X.C50402Uh.A00(r3)
            java.lang.Object r8 = r1.A03
            X.5qs r8 = (X.C114465qs) r8
            X.00H r0 = r11.A03
            X.10I r0 = X.AnonymousClass3MX.A0x(r0)
            X.AjI r7 = new X.AjI
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.CGF(r7)
            X.00H r0 = r11.A02
            java.lang.Object r0 = r0.get()
            X.2nO r0 = (X.C60102nO) r0
            r0.A00(r4)
            return
        L_0x019d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BizVNameXmppMethods/unknown vname cert payload version or vlevel for jid:"
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = " v="
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = " vlevel="
            X.C17900vP.A0g(r0, r3, r2)
            java.lang.Object r0 = r1.A01
            X.9nP r0 = (X.C191919nP) r0
            X.00H r3 = r0.A02
            java.lang.Object r2 = r3.get()
            X.2nO r2 = (X.C60102nO) r2
            java.lang.String r0 = "unknown_cert_version_or_vlevel"
            r2.A03(r6, r0)
            java.lang.Object r0 = r3.get()
            X.2nO r0 = (X.C60102nO) r0
            r0.A00(r4)
            java.lang.Object r2 = r3.get()
            X.2nO r2 = (X.C60102nO) r2
            r0 = 0
            r2.A04(r0)
            java.lang.Object r0 = r1.A03
            X.Bly r0 = (X.C23570Bly) r0
            r0.A03(r5)
            return
        L_0x01e2:
            java.lang.Object r2 = r1.A03
            X.9F6 r2 = (X.AnonymousClass9F6) r2
            java.lang.Object r1 = r1.A02
            X.9bp r1 = (X.C184979bp) r1
            A01(r1, r0, r2)
            return
        L_0x01ee:
            r3 = 1
            X.C18070vi.A0d(r0, r3)
            java.lang.Object r2 = r1.A02
            X.9F6 r2 = (X.AnonymousClass9F6) r2
            r4 = 2
            X.C18070vi.A0d(r2, r4)
            java.lang.String r22 = "result"
            X.1ca r9 = X.AnonymousClass9F6.A00(r0, r2)
            X.2rm r8 = X.AnonymousClass8BR.A0s()
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.String r5 = "from"
            r2 = 0
            r6[r2] = r5
            java.lang.Class<com.whatsapp.jid.Jid> r10 = com.whatsapp.jid.Jid.class
            java.lang.String[] r14 = new java.lang.String[r3]
            java.lang.String r5 = "to"
            java.lang.Long r11 = X.AnonymousClass8BW.A0Z(r5, r14, r2)
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r13 = 0
            r15 = r2
            java.lang.Object r19 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r19 == 0) goto L_0x02fa
            r14 = r8
            r15 = r0
            r16 = r10
            r17 = r11
            r18 = r12
            r20 = r6
            r21 = r3
            java.lang.Object r5 = r14.A05(r15, r16, r17, r18, r19, r20, r21)
            if (r5 == 0) goto L_0x02f5
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.String r5 = "id"
            r6[r2] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.String[] r14 = new java.lang.String[r3]
            r14[r2] = r5
            r15 = r2
            java.lang.Object r13 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r13 == 0) goto L_0x02f0
            r9 = r0
            r14 = r6
            r15 = r3
            java.lang.Object r5 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r5 == 0) goto L_0x02eb
            java.lang.String[] r23 = X.AnonymousClass8BS.A1a(r3, r2)
            r17 = r8
            r18 = r0
            r19 = r10
            r20 = r11
            r21 = r12
            r24 = r2
            java.lang.Object r5 = r17.A05(r18, r19, r20, r21, r22, r23, r24)
            if (r5 == 0) goto L_0x02e6
            X.A97 r6 = X.A97.A00
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String r4 = "pre_reg_add_requests"
            r5[r2] = r4
            java.lang.String r4 = "add_request"
            r5[r3] = r4
            r4 = 39
            X.AhU r3 = new X.AhU
            r3.<init>(r6, r4)
            r12 = 0
            r14 = 1024(0x400, double:5.06E-321)
            r10 = r3
            r11 = r5
            java.util.ArrayList r7 = r8.A08(r9, r10, r11, r12, r14)
            if (r7 == 0) goto L_0x02e1
            boolean r0 = X.C17880vN.A1X(r7)
            if (r0 == 0) goto L_0x0a5e
            X.B3j r4 = X.C22332B3j.A00
            r3 = 6
            X.Akk r0 = new X.Akk
            r0.<init>(r4, r3)
            X.C29391cC.A0H(r7, r0)
            java.lang.Object r1 = r1.A01
            X.1FL r1 = (X.AnonymousClass1FL) r1
            boolean r0 = X.AnonymousClass4Yv.A02(r1)
            if (r0 != 0) goto L_0x0a5e
            X.1GP r6 = r1.getSupportFragmentManager()
            java.lang.Object r0 = r7.get(r2)
            X.9DO r0 = (X.AnonymousClass9DO) r0
            java.lang.Object r0 = r0.A01
            X.9Cz r0 = (X.C178409Cz) r0
            X.1EC r5 = r0.A02
            java.lang.Object r0 = r7.get(r2)
            X.9DO r0 = (X.AnonymousClass9DO) r0
            java.lang.Object r0 = r0.A01
            X.9Cz r0 = (X.C178409Cz) r0
            X.9DO r0 = r0.A04
            java.lang.Object r4 = r0.A00
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r0 = r7.get(r2)
            X.9DO r0 = (X.AnonymousClass9DO) r0
            java.lang.Object r0 = r0.A01
            X.9Cz r0 = (X.C178409Cz) r0
            X.9CY r0 = r0.A03
            java.lang.String r3 = r0.A01
            java.lang.Object r0 = r7.get(r2)
            X.9DO r0 = (X.AnonymousClass9DO) r0
            java.lang.Object r0 = r0.A01
            X.9Cz r0 = (X.C178409Cz) r0
            long r0 = r0.A00
            com.whatsapp.community.JoinGroupBottomSheetFragment r0 = com.whatsapp.community.JoinGroupBottomSheetFragment.A01(r5, r4, r3, r0)
            X.C20098A7b.A02(r0, r6)
            return
        L_0x02e1:
            X.1UI r0 = X.AnonymousClass1O9.A00(r8)
            throw r0
        L_0x02e6:
            X.1UI r0 = X.AnonymousClass1O9.A00(r8)
            throw r0
        L_0x02eb:
            X.1UI r0 = X.AnonymousClass1O9.A00(r8)
            throw r0
        L_0x02f0:
            X.1UI r0 = X.AnonymousClass1O9.A00(r8)
            throw r0
        L_0x02f5:
            X.1UI r0 = X.AnonymousClass1O9.A00(r8)
            throw r0
        L_0x02fa:
            X.1UI r0 = X.AnonymousClass1O9.A00(r8)
            throw r0
        L_0x02ff:
            java.lang.Object r6 = r1.A01
            X.12M r6 = (X.AnonymousClass12M) r6
            java.lang.Object r4 = r1.A02
            X.1EC r4 = (X.AnonymousClass1EC) r4
            java.lang.Object r5 = r1.A03
            X.2sm r5 = (X.C63262sm) r5
            X.AnonymousClass12M.A01(r5, r6, r4)
            r7 = 0
            X.1ca r1 = r0.A0J(r7)
            if (r1 != 0) goto L_0x0316
            r7 = 1
        L_0x0316:
            java.lang.String r2 = r5.A01
            java.lang.String r1 = "prefetch"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0334
            java.lang.String r1 = "interactive"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0344
            X.0ve r3 = r6.A03
            r2 = 6531(0x1983, float:9.152E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x0344
        L_0x0334:
            if (r7 == 0) goto L_0x0344
            X.00H r0 = r6.A05
            java.lang.Object r0 = r0.get()
            X.2eL r0 = (X.C54562eL) r0
            X.2lS r0 = r0.A00
            r0.A01(r4)
            return
        L_0x0344:
            X.190 r3 = r6.A00
            X.00H r2 = r6.A06
            java.lang.Object r1 = r2.get()
            X.126 r1 = (X.AnonymousClass126) r1
            X.2nA r1 = X.C196859vl.A01(r3, r1, r5, r0)
            java.lang.Object r0 = r2.get()
            X.126 r0 = (X.AnonymousClass126) r0
            if (r1 == 0) goto L_0x0a5e
            r0.A0T(r1)
            return
        L_0x035e:
            java.lang.Object r0 = r1.A03
            X.BC3 r0 = (X.BC3) r0
            r0.onSuccess()
            java.lang.Object r0 = r1.A02
            X.AnonymousClass8BU.A1G(r0)
            return
        L_0x036b:
            X.1ca r0 = r0.A0I()
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "creator"
            com.whatsapp.jid.Jid r9 = r0.A0F(r3, r2)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.String r2 = "creation"
            r4 = 0
            java.lang.String r5 = r0.A0Q(r2, r4)
            r2 = 0
            long r17 = X.C20099A7c.A04(r5, r2)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 * r5
            java.lang.String r5 = "subject"
            java.lang.String r11 = r0.A0Q(r5, r4)
            java.lang.String r6 = "s_t"
            java.lang.String r6 = r0.A0Q(r6, r4)
            X.C20099A7c.A04(r6, r2)
            java.lang.String r2 = "id"
            java.lang.String r2 = X.AnonymousClass8BT.A0u(r0, r2, r4)     // Catch:{ 11T -> 0x03da }
            X.1EC r7 = X.C22971Dz.A02(r2)     // Catch:{ 11T -> 0x03da }
            java.lang.Object r2 = r1.A01     // Catch:{ 11T -> 0x03da }
            X.12M r2 = (X.AnonymousClass12M) r2     // Catch:{ 11T -> 0x03da }
            X.190 r2 = r2.A00     // Catch:{ 11T -> 0x03da }
            java.util.LinkedHashMap r13 = X.C21535Ali.A01(r0, r2)     // Catch:{ 11T -> 0x03da }
            int r14 = X.C20099A7c.A00(r0, r13)     // Catch:{ 11T -> 0x03da }
            java.lang.Object r6 = r1.A03     // Catch:{ 11T -> 0x03da }
            X.BC2 r6 = (X.BC2) r6     // Catch:{ 11T -> 0x03da }
            X.1yX r10 = X.AnonymousClass8BW.A0P(r0)     // Catch:{ 11T -> 0x03da }
            int r15 = X.A8d.A02(r0)     // Catch:{ 11T -> 0x03da }
            int r16 = X.C196859vl.A00(r0)     // Catch:{ 11T -> 0x03da }
            java.lang.String r2 = "linked_parent"
            X.1ca r2 = r0.A0K(r2)     // Catch:{ 11T -> 0x03da }
            if (r2 == 0) goto L_0x03d2
            java.lang.String r12 = r2.A0Q(r5, r4)     // Catch:{ 11T -> 0x03da }
        L_0x03cd:
            X.1EC r8 = X.A8d.A03(r0)     // Catch:{ 11T -> 0x03da }
            goto L_0x03d4
        L_0x03d2:
            r12 = 0
            goto L_0x03cd
        L_0x03d4:
            r6.BvM(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 11T -> 0x03d8 }
            goto L_0x03de
        L_0x03d8:
            r0 = move-exception
            goto L_0x03db
        L_0x03da:
            r0 = move-exception
        L_0x03db:
            A00(r1, r0)
        L_0x03de:
            java.lang.Object r0 = r1.A02
            X.Bly r0 = (X.C23570Bly) r0
            r0.A03(r4)
            return
        L_0x03e6:
            X.1ca r2 = r0.A0I()
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "creator"
            com.whatsapp.jid.Jid r9 = r2.A0F(r3, r0)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.String r3 = "creation"
            r0 = 0
            java.lang.String r5 = r2.A0Q(r3, r0)
            r3 = 0
            long r17 = X.C20099A7c.A04(r5, r3)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 * r5
            java.lang.String r5 = "subject"
            java.lang.String r11 = r2.A0Q(r5, r0)
            java.lang.String r6 = "s_t"
            java.lang.String r6 = r2.A0Q(r6, r0)
            X.C20099A7c.A04(r6, r3)
            java.lang.String r3 = "id"
            java.lang.String r3 = r2.A0Q(r3, r0)
            if (r3 != 0) goto L_0x042d
            java.lang.Object r3 = r1.A03
            X.BC2 r3 = (X.BC2) r3
            r2 = 500(0x1f4, float:7.0E-43)
            r3.onError(r2)
            java.lang.Object r1 = r1.A02
            X.Bly r1 = (X.C23570Bly) r1
            r1.A03(r0)
            return
        L_0x042d:
            X.1EC r7 = X.C22971Dz.A02(r3)     // Catch:{ 11T -> 0x0479 }
            java.lang.Object r3 = r1.A01     // Catch:{ 11T -> 0x0479 }
            X.12M r3 = (X.AnonymousClass12M) r3     // Catch:{ 11T -> 0x0479 }
            X.190 r3 = r3.A00     // Catch:{ 11T -> 0x0479 }
            java.util.LinkedHashMap r13 = X.C21535Ali.A01(r2, r3)     // Catch:{ 11T -> 0x0479 }
            int r14 = X.C20099A7c.A00(r2, r13)     // Catch:{ 11T -> 0x0479 }
            java.lang.String r3 = "parent"
            X.1ca r4 = r2.A0K(r3)     // Catch:{ 11T -> 0x0479 }
            if (r4 == 0) goto L_0x0452
            java.lang.String r3 = "num_sub_groups"
            java.lang.String r4 = r4.A0Q(r3, r0)     // Catch:{ 11T -> 0x0479 }
            r3 = 0
            int r14 = X.C20099A7c.A01(r4, r3)     // Catch:{ 11T -> 0x0479 }
        L_0x0452:
            java.lang.Object r6 = r1.A03     // Catch:{ 11T -> 0x0479 }
            X.BC2 r6 = (X.BC2) r6     // Catch:{ 11T -> 0x0479 }
            X.1yX r10 = X.AnonymousClass8BW.A0P(r2)     // Catch:{ 11T -> 0x0479 }
            int r15 = X.A8d.A02(r2)     // Catch:{ 11T -> 0x0479 }
            int r16 = X.C196859vl.A00(r2)     // Catch:{ 11T -> 0x0479 }
            java.lang.String r3 = "linked_parent"
            X.1ca r3 = r2.A0K(r3)     // Catch:{ 11T -> 0x0479 }
            if (r3 == 0) goto L_0x0473
            java.lang.String r12 = r3.A0Q(r5, r0)     // Catch:{ 11T -> 0x0479 }
        L_0x046e:
            X.1EC r8 = X.A8d.A03(r2)     // Catch:{ 11T -> 0x0479 }
            goto L_0x0475
        L_0x0473:
            r12 = 0
            goto L_0x046e
        L_0x0475:
            r6.BvM(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 11T -> 0x047b }
            goto L_0x047f
        L_0x0479:
            r2 = move-exception
            goto L_0x047c
        L_0x047b:
            r2 = move-exception
        L_0x047c:
            A00(r1, r2)
        L_0x047f:
            java.lang.Object r1 = r1.A02
            X.Bly r1 = (X.C23570Bly) r1
            r1.A03(r0)
            return
        L_0x0487:
            java.util.HashMap r4 = X.C17880vN.A11()
            java.util.HashMap r2 = X.C17880vN.A11()
            java.lang.String r3 = "admin"
            X.C20060A5j.A02(r0, r3, r4, r2)
            java.lang.Object r7 = r1.A03
            X.9XY r7 = (X.AnonymousClass9XY) r7
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "modify-admins/"
            r3.append(r0)
            X.9BN r10 = r7.A00
            X.1EC r0 = r10.A05
            r3.append(r0)
            java.lang.String r9 = "/"
            r3.append(r9)
            java.util.Set r0 = r4.keySet()
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            r3.append(r0)
            r3.append(r9)
            java.util.Set r0 = r2.keySet()
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            X.C17890vO.A1A(r3, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0567
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.ref.WeakReference r0 = r10.A06
            java.lang.Object r8 = r0.get()
            android.app.Activity r8 = (android.app.Activity) r8
            if (r8 == 0) goto L_0x0567
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x0567
            java.util.Iterator r13 = X.C17890vO.A0i(r2)
        L_0x04ec:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x055c
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r13)
            java.lang.Object r4 = r3.getKey()
            X.1BI r4 = (X.AnonymousClass1BI) r4
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "modify-admins/error/"
            r2.append(r0)
            r2.append(r4)
            r2.append(r9)
            java.lang.Object r0 = r3.getValue()
            r2.append(r0)
            X.C17890vO.A0w(r2)
            java.lang.Object r0 = r3.getValue()
            int r3 = X.AnonymousClass000.A0M(r0)
            X.1M9 r0 = r10.A01
            X.1E7 r11 = r0.A0H(r4)
            java.util.List r0 = r10.A08
            boolean r12 = r0.contains(r4)
            r0 = 404(0x194, float:5.66E-43)
            java.lang.String r5 = "\n"
            r4 = 0
            r2 = 1
            if (r3 == r0) goto L_0x0553
            r0 = 406(0x196, float:5.69E-43)
            if (r3 == r0) goto L_0x054f
            r0 = 419(0x1a3, float:5.87E-43)
            if (r3 != r0) goto L_0x0553
            r3 = 2131899028(0x7f123294, float:1.943299E38)
        L_0x053c:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.1Me r0 = r10.A02
            java.lang.String r0 = r0.A0I(r11)
            java.lang.String r0 = X.C17880vN.A0q(r8, r0, r2, r4, r3)
            r6.append(r0)
            r6.append(r5)
            goto L_0x04ec
        L_0x054f:
            r3 = 2131890009(0x7f120f59, float:1.9414698E38)
            goto L_0x053c
        L_0x0553:
            r3 = 2131890011(0x7f120f5b, float:1.9414702E38)
            if (r12 == 0) goto L_0x053c
            r3 = 2131889949(0x7f120f1d, float:1.9414576E38)
            goto L_0x053c
        L_0x055c:
            X.1KB r3 = r10.A00
            r2 = 7
            X.7Pj r0 = new X.7Pj
            r0.<init>(r7, r6, r2)
            r3.A0J(r0)
        L_0x0567:
            java.lang.Object r0 = r1.A02
            X.AnonymousClass8BU.A1G(r0)
            return
        L_0x056d:
            r2 = 1
            X.C18070vi.A0d(r0, r2)
            java.lang.Class<X.1EC> r3 = X.AnonymousClass1EC.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r10 = r0.A0G(r3, r2)
            X.1EC r10 = (X.AnonymousClass1EC) r10
            java.util.LinkedHashMap r5 = X.C17880vN.A13()
            java.lang.String r2 = "membership_approval_requests"
            X.1ca r2 = r0.A0L(r2)
            java.lang.String r0 = "membership_approval_request"
            java.util.List r0 = r2.A0R(r0)
            X.C18070vi.A0X(r0)
            java.util.ArrayList r4 = X.C29351c6.A0D(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0596:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0607
            X.1ca r6 = X.C17880vN.A0a(r8)
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r12 = r6.A0G(r2, r0)
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            java.lang.String r0 = "phone_number"
            com.whatsapp.jid.Jid r7 = r6.A0F(r2, r0)
            java.lang.String r0 = "request_method"
            java.lang.String r3 = r6.A0P(r0)
            java.lang.String r0 = "requestor"
            com.whatsapp.jid.Jid r13 = r6.A0F(r2, r0)
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13
            java.lang.String r0 = "requestor_pn"
            com.whatsapp.jid.Jid r2 = r6.A0F(r2, r0)
            if (r7 == 0) goto L_0x05d1
            boolean r0 = r12 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x05d1
            boolean r0 = r7 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x05d1
            r5.put(r12, r7)
        L_0x05d1:
            if (r2 == 0) goto L_0x05e0
            if (r13 == 0) goto L_0x05e0
            boolean r0 = r13 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x05e0
            boolean r0 = r2 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x05e0
            r5.put(r13, r2)
        L_0x05e0:
            java.lang.String r14 = X.C181599Rc.A00(r3)
            if (r14 == 0) goto L_0x05f8
            java.lang.String r0 = "request_time"
            r2 = 0
            long r15 = r6.A0D(r0, r2)
            r11 = 0
            X.9tC r9 = new X.9tC
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r4.add(r9)
            goto L_0x0596
        L_0x05f8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetAllGroupMembershipApprovalRequestsApiHandler/onSuccess/incorrect membership_approval_request.requestMethod="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x0607:
            java.lang.Object r2 = r1.A03
            X.1Ln r2 = (X.C24751Ln) r2
            java.util.Map r0 = X.AnonymousClass1D7.A0F(r5)
            r2.A0K(r0)
            java.lang.Object r0 = r1.A02
            X.9u7 r0 = (X.C195899u7) r0
            r0.A01(r10)
            r0.A03(r4)
            java.lang.Object r1 = r1.A01
            X.1Ug r1 = (X.C26981Ug) r1
            r0 = 0
            r1.BrF(r0)
            return
        L_0x0625:
            java.lang.String r2 = "link_code_companion_reg"
            X.1ca r2 = r0.A0L(r2)
            java.lang.String r0 = "link_code_pairing_ref"
            X.1ca r0 = r2.A0L(r0)
            java.lang.String r2 = r0.A0M()
            java.lang.Object r0 = r1.A02
            X.1TI r0 = (X.AnonymousClass1TI) r0
            r0.accept(r2)
            return
        L_0x063d:
            r2 = 1
            X.C18070vi.A0d(r0, r2)
            java.lang.Object r5 = r1.A03
            X.A71 r5 = (X.A71) r5
            X.1KB r4 = r5.A00
            java.lang.Object r3 = r1.A01
            r2 = 38
            X.AkM r1 = new X.AkM
            r1.<init>(r3, r5, r0, r2)
            r4.CGP(r1)
            return
        L_0x0654:
            r8 = 0
            boolean r4 = X.C18070vi.A17(r3, r0)
            java.lang.Object r6 = r1.A02
            X.9F4 r6 = (X.AnonymousClass9F4) r6
            java.lang.Object r5 = r1.A01
            X.BDm r5 = (X.C22571BDm) r5
            r1 = 2
            java.lang.StringBuilder r2 = X.AnonymousClass3MZ.A19(r6, r1)
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/updateMigrationOnSuccess id="
            X.C17900vP.A0f(r1, r3, r2)
            X.C108945cZ.A1N(r0)     // Catch:{ 1UI -> 0x06b2 }
            java.lang.Object r7 = r6.A00     // Catch:{ 1UI -> 0x06b2 }
            X.2rm r6 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x06b2 }
            X.9we r2 = X.C197409we.A00     // Catch:{ 1UI -> 0x06b2 }
            r1 = 44
            X.Aha r1 = X.C21289Aha.A00(r7, r2, r1)     // Catch:{ 1UI -> 0x06b2 }
            java.lang.Object r1 = r1.BCF(r0, r6)     // Catch:{ 1UI -> 0x06b2 }
            if (r1 == 0) goto L_0x06a8
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ 1UI -> 0x06b2 }
            java.lang.String r2 = "success"
            r1[r8] = r2     // Catch:{ 1UI -> 0x06b2 }
            boolean r1 = r6.A0A(r0, r1)     // Catch:{ 1UI -> 0x06b2 }
            if (r1 == 0) goto L_0x06ad
            X.1ca r0 = r0.A0K(r2)     // Catch:{ 1UI -> 0x06b2 }
            if (r0 != 0) goto L_0x06a4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x06b2 }
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/updateMigrationOnSuccess was empty id="
            X.C17900vP.A0e(r0, r3, r1)     // Catch:{ 1UI -> 0x06b2 }
            java.lang.String r1 = "success was empty"
            r0 = -1
            r5.Bt2(r1, r4, r0)     // Catch:{ 1UI -> 0x06b2 }
            return
        L_0x06a4:
            r5.onSuccess()     // Catch:{ 1UI -> 0x06b2 }
            return
        L_0x06a8:
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)     // Catch:{ 1UI -> 0x06b2 }
            goto L_0x06b1
        L_0x06ad:
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)     // Catch:{ 1UI -> 0x06b2 }
        L_0x06b1:
            throw r0     // Catch:{ 1UI -> 0x06b2 }
        L_0x06b2:
            r1 = move-exception
            java.lang.String r0 = "updateMigrationOnSuccess"
            goto L_0x0c14
        L_0x06b7:
            r4 = 0
            boolean r2 = X.C18070vi.A17(r3, r0)
            java.lang.Object r8 = r1.A02
            X.9F4 r8 = (X.AnonymousClass9F4) r8
            java.lang.Object r1 = r1.A01
            X.8g4 r1 = (X.AnonymousClass8g4) r1
            r5 = 2
            java.lang.StringBuilder r7 = X.AnonymousClass3MZ.A19(r8, r5)
            java.lang.String r6 = "encb/EncryptedBackupProtocolHelper/initRegOnSuccess id="
            X.C17900vP.A0f(r6, r3, r7)
            X.C108945cZ.A1N(r0)     // Catch:{ 1UI -> 0x082f }
            java.lang.Object r13 = r8.A00     // Catch:{ 1UI -> 0x082f }
            X.2rm r14 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x082f }
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x082f }
            java.lang.String r27 = "hk_pub"
            r6[r4] = r27     // Catch:{ 1UI -> 0x082f }
            java.lang.String r12 = "#elementValue"
            r6[r2] = r12     // Catch:{ 1UI -> 0x082f }
            java.lang.Long r17 = X.C108975cc.A0X()     // Catch:{ 1UI -> 0x082f }
            java.lang.Long r18 = X.AnonymousClass8BV.A0k()     // Catch:{ 1UI -> 0x082f }
            java.lang.Class<byte[]> r16 = byte[].class
            r19 = 0
            r15 = r0
            r20 = r6
            java.lang.Object r10 = r14.A04(r15, r16, r17, r18, r19, r20)     // Catch:{ 1UI -> 0x082f }
            byte[] r10 = (byte[]) r10     // Catch:{ 1UI -> 0x082f }
            if (r10 == 0) goto L_0x0825
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x082f }
            java.lang.String r6 = "hk_key_signature"
            r8[r4] = r6     // Catch:{ 1UI -> 0x082f }
            r8[r2] = r12     // Catch:{ 1UI -> 0x082f }
            r6 = 384(0x180, double:1.897E-321)
            java.lang.Long r17 = java.lang.Long.valueOf(r6)     // Catch:{ 1UI -> 0x082f }
            r18 = r17
            r20 = r8
            java.lang.Object r9 = r14.A04(r15, r16, r17, r18, r19, r20)     // Catch:{ 1UI -> 0x082f }
            byte[] r9 = (byte[]) r9     // Catch:{ 1UI -> 0x082f }
            if (r9 == 0) goto L_0x0820
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x082f }
            java.lang.String r31 = "ok_pub"
            r6[r4] = r31     // Catch:{ 1UI -> 0x082f }
            r6[r2] = r12     // Catch:{ 1UI -> 0x082f }
            java.lang.Long r23 = X.AnonymousClass8BV.A0d()     // Catch:{ 1UI -> 0x082f }
            r20 = r14
            r21 = r0
            r22 = r16
            r24 = r23
            r25 = r19
            r26 = r6
            java.lang.Object r6 = r20.A04(r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x082f }
            byte[] r6 = (byte[]) r6     // Catch:{ 1UI -> 0x082f }
            if (r6 == 0) goto L_0x081b
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x082f }
            java.lang.String r8 = "ok_key_signature"
            r7[r4] = r8     // Catch:{ 1UI -> 0x082f }
            r7[r2] = r12     // Catch:{ 1UI -> 0x082f }
            r20 = r7
            java.lang.Object r8 = r14.A04(r15, r16, r17, r18, r19, r20)     // Catch:{ 1UI -> 0x082f }
            byte[] r8 = (byte[]) r8     // Catch:{ 1UI -> 0x082f }
            if (r8 == 0) goto L_0x0816
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x082f }
            java.lang.String r35 = "ed_pub"
            r7[r4] = r35     // Catch:{ 1UI -> 0x082f }
            r7[r2] = r12     // Catch:{ 1UI -> 0x082f }
            r20 = r14
            r26 = r7
            java.lang.Object r7 = r20.A04(r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x082f }
            byte[] r7 = (byte[]) r7     // Catch:{ 1UI -> 0x082f }
            if (r7 == 0) goto L_0x0811
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x082f }
            java.lang.String r11 = "ed_key_signature"
            r5[r4] = r11     // Catch:{ 1UI -> 0x082f }
            r5[r2] = r12     // Catch:{ 1UI -> 0x082f }
            r20 = r5
            java.lang.Object r5 = r14.A04(r15, r16, r17, r18, r19, r20)     // Catch:{ 1UI -> 0x082f }
            byte[] r5 = (byte[]) r5     // Catch:{ 1UI -> 0x082f }
            if (r5 == 0) goto L_0x080c
            X.9we r11 = X.C197409we.A00     // Catch:{ 1UI -> 0x082f }
            r12 = 43
            X.Aha r12 = X.C21289Aha.A00(r13, r11, r12)     // Catch:{ 1UI -> 0x082f }
            java.lang.Object r12 = r12.BCF(r0, r14)     // Catch:{ 1UI -> 0x082f }
            if (r12 == 0) goto L_0x082a
            r12 = 23
            X.C21285AhW.A00(r0, r14, r11, r12)     // Catch:{ 1UI -> 0x082f }
            r12 = 24
            X.C21285AhW.A00(r0, r14, r11, r12)     // Catch:{ 1UI -> 0x082f }
            java.lang.String r26 = "initRegOnSuccess"
            r25 = r1
            r28 = r3
            r29 = r10
            r30 = r9
            boolean r0 = X.AnonymousClass1NU.A03(r25, r26, r27, r28, r29, r30)     // Catch:{ 1UI -> 0x082f }
            if (r0 != 0) goto L_0x0a5e
            r29 = r1
            r30 = r26
            r32 = r3
            r33 = r6
            r34 = r8
            boolean r0 = X.AnonymousClass1NU.A03(r29, r30, r31, r32, r33, r34)     // Catch:{ 1UI -> 0x082f }
            if (r0 != 0) goto L_0x0a5e
            r33 = r1
            r34 = r26
            r36 = r3
            r37 = r7
            r38 = r5
            boolean r0 = X.AnonymousClass1NU.A03(r33, r34, r35, r36, r37, r38)     // Catch:{ 1UI -> 0x082f }
            if (r0 != 0) goto L_0x0a5e
            X.1NV r0 = r1.A00     // Catch:{ 1UI -> 0x082f }
            r0.A02()     // Catch:{ 1UI -> 0x082f }
            java.lang.String r5 = r1.A0C     // Catch:{ 1UI -> 0x082f }
            r0 = 10
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOOO(r0, r5, r6)     // Catch:{ 1UI -> 0x082f }
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0     // Catch:{ 1UI -> 0x082f }
            X.9Y5 r8 = new X.9Y5     // Catch:{ 1UI -> 0x082f }
            r8.<init>(r0)     // Catch:{ 1UI -> 0x082f }
            r5 = 30
            com.facebook.simplejni.NativeHolder r0 = r8.A00     // Catch:{ 1UI -> 0x082f }
            java.lang.Object r5 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r5, r0)     // Catch:{ 1UI -> 0x082f }
            com.facebook.simplejni.NativeHolder r5 = (com.facebook.simplejni.NativeHolder) r5     // Catch:{ 1UI -> 0x082f }
            X.9Y4 r0 = new X.9Y4     // Catch:{ 1UI -> 0x082f }
            r0.<init>(r5)     // Catch:{ 1UI -> 0x082f }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 1UI -> 0x082f }
            com.facebook.simplejni.NativeHolder r9 = r0.A00     // Catch:{ 1UI -> 0x082f }
            r5 = 78
            long r5 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r2, r5, r9)     // Catch:{ 1UI -> 0x082f }
            int r0 = (int) r5     // Catch:{ 1UI -> 0x082f }
            if (r0 == 0) goto L_0x07ec
            X.9WV r0 = r1.A09     // Catch:{ 1UI -> 0x082f }
            r2 = 4
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r0.A00     // Catch:{ 1UI -> 0x082f }
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel.A00(r0, r2)     // Catch:{ 1UI -> 0x082f }
            return
        L_0x07ec:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 1UI -> 0x082f }
            r5 = 79
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r4, r5, r9)     // Catch:{ 1UI -> 0x082f }
            byte[] r0 = (byte[]) r0     // Catch:{ 1UI -> 0x082f }
            java.lang.Object r4 = r1.A0B     // Catch:{ 1UI -> 0x082f }
            monitor-enter(r4)     // Catch:{ 1UI -> 0x082f }
            r1.A02 = r8     // Catch:{ all -> 0x0809 }
            r1.A05 = r10     // Catch:{ all -> 0x0809 }
            r1.A03 = r7     // Catch:{ all -> 0x0809 }
            r1.A06 = r0     // Catch:{ all -> 0x0809 }
            r1.A00 = r2     // Catch:{ all -> 0x0809 }
            monitor-exit(r4)     // Catch:{ all -> 0x0809 }
            r1.A00()     // Catch:{ 1UI -> 0x082f }
            return
        L_0x0809:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0809 }
            goto L_0x082e
        L_0x080c:
            X.1UI r0 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x082f }
            goto L_0x082e
        L_0x0811:
            X.1UI r0 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x082f }
            goto L_0x082e
        L_0x0816:
            X.1UI r0 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x082f }
            goto L_0x082e
        L_0x081b:
            X.1UI r0 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x082f }
            goto L_0x082e
        L_0x0820:
            X.1UI r0 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x082f }
            goto L_0x082e
        L_0x0825:
            X.1UI r0 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x082f }
            goto L_0x082e
        L_0x082a:
            X.1UI r0 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x082f }
        L_0x082e:
            throw r0     // Catch:{ 1UI -> 0x082f }
        L_0x082f:
            r2 = move-exception
            java.lang.String r0 = "initRegOnSuccess"
            goto L_0x0a9a
        L_0x0834:
            r4 = 0
            boolean r2 = X.C18070vi.A17(r3, r0)
            java.lang.Object r8 = r1.A02
            X.9F4 r8 = (X.AnonymousClass9F4) r8
            java.lang.Object r1 = r1.A01
            X.8g3 r1 = (X.C167358g3) r1
            r6 = 2
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r5 = "encb/EncryptedBackupProtocolHelper/initLoginOnSuccess id="
            X.C17900vP.A0f(r5, r3, r7)
            X.C108945cZ.A1N(r0)     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Object r11 = r8.A00     // Catch:{ 1UI -> 0x0a97 }
            X.2rm r5 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r29 = "hk_pub"
            r7[r4] = r29     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r14 = "#elementValue"
            r7[r2] = r14     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Long r19 = X.C108975cc.A0X()     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Long r20 = X.AnonymousClass8BV.A0k()     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Class<byte[]> r18 = byte[].class
            r21 = 0
            r16 = r5
            r17 = r0
            r22 = r7
            java.lang.Object r15 = r16.A04(r17, r18, r19, r20, r21, r22)     // Catch:{ 1UI -> 0x0a97 }
            byte[] r15 = (byte[]) r15     // Catch:{ 1UI -> 0x0a97 }
            if (r15 == 0) goto L_0x0a8d
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r7 = "hk_key_signature"
            r9[r4] = r7     // Catch:{ 1UI -> 0x0a97 }
            r9[r2] = r14     // Catch:{ 1UI -> 0x0a97 }
            r7 = 384(0x180, double:1.897E-321)
            java.lang.Long r19 = java.lang.Long.valueOf(r7)     // Catch:{ 1UI -> 0x0a97 }
            r20 = r19
            r22 = r9
            java.lang.Object r13 = r16.A04(r17, r18, r19, r20, r21, r22)     // Catch:{ 1UI -> 0x0a97 }
            byte[] r13 = (byte[]) r13     // Catch:{ 1UI -> 0x0a97 }
            if (r13 == 0) goto L_0x0a88
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r33 = "ok_pub"
            r7[r4] = r33     // Catch:{ 1UI -> 0x0a97 }
            r7[r2] = r14     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Long r25 = X.AnonymousClass8BV.A0d()     // Catch:{ 1UI -> 0x0a97 }
            r22 = r5
            r23 = r0
            r24 = r18
            r26 = r25
            r27 = r21
            r28 = r7
            java.lang.Object r7 = r22.A04(r23, r24, r25, r26, r27, r28)     // Catch:{ 1UI -> 0x0a97 }
            byte[] r7 = (byte[]) r7     // Catch:{ 1UI -> 0x0a97 }
            if (r7 == 0) goto L_0x0a83
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r9 = "ok_key_signature"
            r8[r4] = r9     // Catch:{ 1UI -> 0x0a97 }
            r8[r2] = r14     // Catch:{ 1UI -> 0x0a97 }
            r22 = r8
            java.lang.Object r10 = r16.A04(r17, r18, r19, r20, r21, r22)     // Catch:{ 1UI -> 0x0a97 }
            byte[] r10 = (byte[]) r10     // Catch:{ 1UI -> 0x0a97 }
            if (r10 == 0) goto L_0x0a7e
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r37 = "ed_pub"
            r8[r4] = r37     // Catch:{ 1UI -> 0x0a97 }
            r8[r2] = r14     // Catch:{ 1UI -> 0x0a97 }
            r22 = r5
            r28 = r8
            java.lang.Object r9 = r22.A04(r23, r24, r25, r26, r27, r28)     // Catch:{ 1UI -> 0x0a97 }
            byte[] r9 = (byte[]) r9     // Catch:{ 1UI -> 0x0a97 }
            if (r9 == 0) goto L_0x0a79
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r12 = "ed_key_signature"
            r8[r4] = r12     // Catch:{ 1UI -> 0x0a97 }
            r8[r2] = r14     // Catch:{ 1UI -> 0x0a97 }
            r22 = r8
            java.lang.Object r8 = r16.A04(r17, r18, r19, r20, r21, r22)     // Catch:{ 1UI -> 0x0a97 }
            byte[] r8 = (byte[]) r8     // Catch:{ 1UI -> 0x0a97 }
            if (r8 == 0) goto L_0x0a74
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r12 = "count"
            r6[r4] = r12     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r12 = "value"
            r6[r2] = r12     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Class r18 = java.lang.Long.TYPE     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Long r19 = X.C17890vO.A0L()     // Catch:{ 1UI -> 0x0a97 }
            r16 = 128(0x80, double:6.32E-322)
            java.lang.Long r20 = java.lang.Long.valueOf(r16)     // Catch:{ 1UI -> 0x0a97 }
            r17 = r0
            r22 = r6
            r23 = r4
            r16 = r5
            java.lang.Object r6 = r16.A05(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ 1UI -> 0x0a97 }
            if (r6 == 0) goto L_0x0a6f
            long r16 = r6.longValue()     // Catch:{ 1UI -> 0x0a97 }
            X.9we r12 = X.C197409we.A00     // Catch:{ 1UI -> 0x0a97 }
            r6 = 42
            X.Aha r6 = X.C21289Aha.A00(r11, r12, r6)     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Object r6 = r6.BCF(r0, r5)     // Catch:{ 1UI -> 0x0a97 }
            if (r6 == 0) goto L_0x0a6a
            r11 = 19
            X.AhW r6 = new X.AhW     // Catch:{ 1UI -> 0x0a97 }
            r6.<init>(r12, r11)     // Catch:{ 1UI -> 0x0a97 }
            X.C18070vi.A0d(r6, r2)     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Object r6 = r6.BCF(r0, r5)     // Catch:{ 1UI -> 0x0a97 }
            if (r6 == 0) goto L_0x0a92
            r6 = 20
            X.C21285AhW.A00(r0, r5, r12, r6)     // Catch:{ 1UI -> 0x0a97 }
            r6 = 21
            X.C21285AhW.A00(r0, r5, r12, r6)     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String[] r11 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r6 = "backoff"
            r11[r4] = r6     // Catch:{ 1UI -> 0x0a97 }
            r14 = 22
            X.AhW r6 = new X.AhW     // Catch:{ 1UI -> 0x0a97 }
            r6.<init>(r12, r14)     // Catch:{ 1UI -> 0x0a97 }
            r5.A02(r0, r6, r11)     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r28 = "initLoginOnSuccess"
            r27 = r1
            r30 = r3
            r31 = r15
            r32 = r13
            boolean r0 = X.AnonymousClass1NU.A03(r27, r28, r29, r30, r31, r32)     // Catch:{ 1UI -> 0x0a97 }
            if (r0 != 0) goto L_0x0a5e
            r31 = r1
            r32 = r28
            r34 = r3
            r35 = r7
            r36 = r10
            boolean r0 = X.AnonymousClass1NU.A03(r31, r32, r33, r34, r35, r36)     // Catch:{ 1UI -> 0x0a97 }
            if (r0 != 0) goto L_0x0a5e
            r35 = r1
            r36 = r28
            r38 = r3
            r39 = r9
            r40 = r8
            boolean r0 = X.AnonymousClass1NU.A03(r35, r36, r37, r38, r39, r40)     // Catch:{ 1UI -> 0x0a97 }
            if (r0 != 0) goto L_0x0a5e
            r5 = r16
            int r0 = (int) r5     // Catch:{ 1UI -> 0x0a97 }
            X.1NV r5 = r1.A00     // Catch:{ 1UI -> 0x0a97 }
            r5.A02()     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r6 = r1.A0C     // Catch:{ 1UI -> 0x0a97 }
            r5 = 11
            java.lang.Object r5 = com.whatsapp.wamsys.JniBridge.jvidispatchOOO(r5, r6, r7)     // Catch:{ 1UI -> 0x0a97 }
            com.facebook.simplejni.NativeHolder r5 = (com.facebook.simplejni.NativeHolder) r5     // Catch:{ 1UI -> 0x0a97 }
            X.9Y2 r8 = new X.9Y2     // Catch:{ 1UI -> 0x0a97 }
            r8.<init>(r5)     // Catch:{ 1UI -> 0x0a97 }
            r6 = 31
            com.facebook.simplejni.NativeHolder r5 = r8.A00     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Object r6 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r6, r5)     // Catch:{ 1UI -> 0x0a97 }
            com.facebook.simplejni.NativeHolder r6 = (com.facebook.simplejni.NativeHolder) r6     // Catch:{ 1UI -> 0x0a97 }
            X.9Y1 r5 = new X.9Y1     // Catch:{ 1UI -> 0x0a97 }
            r5.<init>(r6)     // Catch:{ 1UI -> 0x0a97 }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 1UI -> 0x0a97 }
            com.facebook.simplejni.NativeHolder r10 = r5.A00     // Catch:{ 1UI -> 0x0a97 }
            r5 = 68
            long r5 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r2, r5, r10)     // Catch:{ 1UI -> 0x0a97 }
            int r7 = (int) r5     // Catch:{ 1UI -> 0x0a97 }
            if (r7 == 0) goto L_0x09c7
            X.B71 r4 = r1.A08     // Catch:{ 1UI -> 0x0a97 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x0a97 }
            java.lang.String r0 = "WESOpaqueClientCreateLoginStart failed with WESOpaqueStatusType="
            r2.append(r0)     // Catch:{ 1UI -> 0x0a97 }
            r2.append(r7)     // Catch:{ 1UI -> 0x0a97 }
            r2.toString()     // Catch:{ 1UI -> 0x0a97 }
            r2 = -1
            r0 = 4
            r4.BtE(r0, r2, r2)     // Catch:{ 1UI -> 0x0a97 }
            return
        L_0x09c7:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 1UI -> 0x0a97 }
            r5 = 69
            java.lang.Object r5 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r4, r5, r10)     // Catch:{ 1UI -> 0x0a97 }
            byte[] r5 = (byte[]) r5     // Catch:{ 1UI -> 0x0a97 }
            java.lang.Object r4 = r1.A0B     // Catch:{ 1UI -> 0x0a97 }
            monitor-enter(r4)     // Catch:{ 1UI -> 0x0a97 }
            r1.A06 = r5     // Catch:{ all -> 0x09e4 }
            r1.A05 = r9     // Catch:{ all -> 0x09e4 }
            r1.A04 = r8     // Catch:{ all -> 0x09e4 }
            r1.A01 = r0     // Catch:{ all -> 0x09e4 }
            r1.A00 = r2     // Catch:{ all -> 0x09e4 }
            monitor-exit(r4)     // Catch:{ all -> 0x09e4 }
            r1.A00()     // Catch:{ 1UI -> 0x0a97 }
            return
        L_0x09e4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x09e4 }
            goto L_0x0a96
        L_0x09e8:
            java.lang.Object r13 = r1.A02
            X.9bA r13 = (X.C184569bA) r13
            java.lang.String r9 = ","
            java.lang.String r12 = "null"
            if (r10 == 0) goto L_0x0a68
            java.lang.String r5 = X.C29431cG.A0h(r9, r10, r8)
        L_0x09f6:
            if (r11 == 0) goto L_0x09fc
            java.lang.String r12 = X.C29431cG.A0h(r9, r11, r8)
        L_0x09fc:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "get status privacy job response distributionMode="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = "; allowList="
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = "; denyList="
            X.C17900vP.A0f(r0, r12, r2)
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r2 = r13.A00
            X.1Le r0 = r2.A00
            if (r0 == 0) goto L_0x0a4a
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x0a4a
            java.lang.String r0 = "save status privacy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Le r0 = r2.A00
            if (r0 == 0) goto L_0x0a4a
            X.1La r5 = r0.A04
            java.lang.String r0 = "status_distribution"
            r5.A04(r0, r4)
            java.lang.String r4 = ""
            if (r11 != 0) goto L_0x0a5f
            r2 = r4
        L_0x0a36:
            java.lang.String r0 = "status_black_list"
            r5.A06(r0, r2)
            if (r10 == 0) goto L_0x0a45
            java.lang.String[] r0 = X.C22971Dz.A0j(r10)
            java.lang.String r4 = android.text.TextUtils.join(r9, r0)
        L_0x0a45:
            java.lang.String r0 = "status_white_list"
            r5.A06(r0, r4)
        L_0x0a4a:
            java.lang.Object r0 = r1.A01
            X.Bly r0 = (X.C23570Bly) r0
            r0.A03(r8)
            java.lang.Object r0 = r1.A03
            X.9dw r0 = (X.C186279dw) r0
            X.19Y r1 = r0.A01
            int r0 = r3.hashCode()
            r1.markerEnd(r6, r0, r7)
        L_0x0a5e:
            return
        L_0x0a5f:
            java.lang.String[] r0 = X.C22971Dz.A0j(r11)
            java.lang.String r2 = android.text.TextUtils.join(r9, r0)
            goto L_0x0a36
        L_0x0a68:
            r5 = r12
            goto L_0x09f6
        L_0x0a6a:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x0a97 }
            goto L_0x0a96
        L_0x0a6f:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x0a97 }
            goto L_0x0a96
        L_0x0a74:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x0a97 }
            goto L_0x0a96
        L_0x0a79:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x0a97 }
            goto L_0x0a96
        L_0x0a7e:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x0a97 }
            goto L_0x0a96
        L_0x0a83:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x0a97 }
            goto L_0x0a96
        L_0x0a88:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x0a97 }
            goto L_0x0a96
        L_0x0a8d:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x0a97 }
            goto L_0x0a96
        L_0x0a92:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x0a97 }
        L_0x0a96:
            throw r0     // Catch:{ 1UI -> 0x0a97 }
        L_0x0a97:
            r2 = move-exception
            java.lang.String r0 = "initLoginOnSuccess"
        L_0x0a9a:
            X.AnonymousClass1NU.A01(r1, r2, r3, r0)
            return
        L_0x0a9e:
            r7 = 0
            boolean r6 = X.C18070vi.A17(r3, r0)
            java.lang.Object r4 = r1.A02
            X.9F4 r4 = (X.AnonymousClass9F4) r4
            java.lang.Object r5 = r1.A01
            X.8g4 r5 = (X.AnonymousClass8g4) r5
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/finishRegOnSuccess id="
            X.C17900vP.A0f(r1, r3, r2)
            X.C108945cZ.A1N(r0)     // Catch:{ 1UI -> 0x0b14 }
            java.lang.Object r4 = r4.A00     // Catch:{ 1UI -> 0x0b14 }
            X.2rm r8 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0b14 }
            X.9we r2 = X.C197409we.A00     // Catch:{ 1UI -> 0x0b14 }
            r1 = 41
            X.Aha r1 = X.C21289Aha.A00(r4, r2, r1)     // Catch:{ 1UI -> 0x0b14 }
            java.lang.Object r1 = r1.BCF(r0, r8)     // Catch:{ 1UI -> 0x0b14 }
            if (r1 == 0) goto L_0x0b0a
            r4 = 18
            X.C21285AhW.A00(r0, r8, r2, r4)     // Catch:{ 1UI -> 0x0b14 }
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x0b14 }
            java.lang.String r2 = "success"
            r1[r7] = r2     // Catch:{ 1UI -> 0x0b14 }
            boolean r1 = r8.A0A(r0, r1)     // Catch:{ 1UI -> 0x0b14 }
            if (r1 == 0) goto L_0x0b0f
            X.1ca r0 = r0.A0K(r2)     // Catch:{ 1UI -> 0x0b14 }
            if (r0 != 0) goto L_0x0af2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x0b14 }
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishRegOnSuccess was empty id="
            X.C17900vP.A0e(r0, r3, r1)     // Catch:{ 1UI -> 0x0b14 }
            java.lang.String r1 = "success was empty"
            r0 = -1
            r5.Bt2(r1, r6, r0)     // Catch:{ 1UI -> 0x0b14 }
            return
        L_0x0af2:
            X.1NV r0 = r5.A00     // Catch:{ 1UI -> 0x0b14 }
            r0.A02()     // Catch:{ 1UI -> 0x0b14 }
            X.1NP r1 = r5.A07     // Catch:{ 1UI -> 0x0b14 }
            X.2Qv r0 = X.C49532Qv.PASSWORD_ENCRYPTED     // Catch:{ 1UI -> 0x0b14 }
            r1.A0J(r0)     // Catch:{ 1UI -> 0x0b14 }
            r1.A0D(r7)     // Catch:{ 1UI -> 0x0b14 }
            r1.A0N(r7)     // Catch:{ 1UI -> 0x0b14 }
            X.10I r0 = r5.A01     // Catch:{ 1UI -> 0x0b14 }
            X.C21457AkO.A01(r0, r5, r4)     // Catch:{ 1UI -> 0x0b14 }
            return
        L_0x0b0a:
            X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0b14 }
            goto L_0x0b13
        L_0x0b0f:
            X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0b14 }
        L_0x0b13:
            throw r0     // Catch:{ 1UI -> 0x0b14 }
        L_0x0b14:
            r1 = move-exception
            java.lang.String r0 = "finishRegOnSuccess"
            goto L_0x0c14
        L_0x0b19:
            r9 = 0
            boolean r6 = X.C18070vi.A17(r3, r0)
            java.lang.Object r4 = r1.A02
            X.9F4 r4 = (X.AnonymousClass9F4) r4
            java.lang.Object r10 = r1.A01
            X.8g3 r10 = (X.C167358g3) r10
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess id="
            X.C17900vP.A0f(r1, r3, r2)
            X.C108945cZ.A1N(r0)     // Catch:{ 1UI -> 0x0bac }
            java.lang.Object r2 = r4.A00     // Catch:{ 1UI -> 0x0bac }
            X.2rm r8 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0bac }
            X.9we r7 = X.C197409we.A00     // Catch:{ 1UI -> 0x0bac }
            r1 = 40
            X.Aha r1 = X.C21289Aha.A00(r2, r7, r1)     // Catch:{ 1UI -> 0x0bac }
            java.lang.Object r1 = r1.BCF(r0, r8)     // Catch:{ 1UI -> 0x0bac }
            if (r1 == 0) goto L_0x0ba7
            r1 = 15
            X.C21285AhW.A00(r0, r8, r7, r1)     // Catch:{ 1UI -> 0x0bac }
            java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x0bac }
            java.lang.String r1 = "success"
            r4[r9] = r1     // Catch:{ 1UI -> 0x0bac }
            r2 = 16
            X.AhW r1 = new X.AhW     // Catch:{ 1UI -> 0x0bac }
            r1.<init>(r7, r2)     // Catch:{ 1UI -> 0x0bac }
            java.lang.Object r5 = r8.A02(r0, r1, r4)     // Catch:{ 1UI -> 0x0bac }
            X.9DM r5 = (X.AnonymousClass9DM) r5     // Catch:{ 1UI -> 0x0bac }
            java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x0bac }
            java.lang.String r1 = "count"
            r4[r9] = r1     // Catch:{ 1UI -> 0x0bac }
            r2 = 17
            X.AhW r1 = new X.AhW     // Catch:{ 1UI -> 0x0bac }
            r1.<init>(r7, r2)     // Catch:{ 1UI -> 0x0bac }
            r8.A02(r0, r1, r4)     // Catch:{ 1UI -> 0x0bac }
            if (r5 != 0) goto L_0x0b80
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x0bac }
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess success was empty id="
            X.C17900vP.A0e(r0, r3, r1)     // Catch:{ 1UI -> 0x0bac }
            java.lang.String r1 = "success was empty"
            r0 = -1
            r10.Bt2(r1, r6, r0)     // Catch:{ 1UI -> 0x0bac }
            return
        L_0x0b80:
            java.lang.Object r11 = r5.A00     // Catch:{ 1UI -> 0x0bac }
            X.1NV r0 = r10.A00     // Catch:{ 1UI -> 0x0bac }
            r0.A02()     // Catch:{ 1UI -> 0x0bac }
            java.lang.String r0 = "encb/LoginUserHandler/finishLogin saving backup key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1UI -> 0x0bac }
            java.lang.Object r1 = r10.A0B     // Catch:{ 1UI -> 0x0bac }
            monitor-enter(r1)     // Catch:{ 1UI -> 0x0bac }
            X.9Y0 r12 = r10.A03     // Catch:{ all -> 0x0ba4 }
            X.C17960vV.A07(r12)     // Catch:{ all -> 0x0ba4 }
            monitor-exit(r1)     // Catch:{ all -> 0x0ba4 }
            X.B71 r13 = r10.A08     // Catch:{ 1UI -> 0x0bac }
            X.10I r0 = r10.A01     // Catch:{ 1UI -> 0x0bac }
            r14 = 32
            X.Aix r9 = new X.Aix     // Catch:{ 1UI -> 0x0bac }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ 1UI -> 0x0bac }
            r0.CGF(r9)     // Catch:{ 1UI -> 0x0bac }
            return
        L_0x0ba4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0ba4 }
            goto L_0x0bab
        L_0x0ba7:
            X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0bac }
        L_0x0bab:
            throw r0     // Catch:{ 1UI -> 0x0bac }
        L_0x0bac:
            r1 = move-exception
            java.lang.String r0 = "finishLoginOnSuccess"
            X.AnonymousClass1NU.A01(r10, r1, r3, r0)
            return
        L_0x0bb3:
            r8 = 0
            boolean r4 = X.C18070vi.A17(r3, r0)
            java.lang.Object r6 = r1.A02
            X.9F7 r6 = (X.AnonymousClass9F7) r6
            java.lang.Object r5 = r1.A01
            X.BDl r5 = (X.C22570BDl) r5
            r1 = 2
            java.lang.StringBuilder r2 = X.AnonymousClass3MZ.A19(r6, r1)
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/deleteAccountOnSuccess id="
            X.C17900vP.A0f(r1, r3, r2)
            X.C108945cZ.A1N(r0)     // Catch:{ 1UI -> 0x0c11 }
            java.lang.Object r7 = r6.A00     // Catch:{ 1UI -> 0x0c11 }
            X.2rm r6 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0c11 }
            X.9we r2 = X.C197409we.A00     // Catch:{ 1UI -> 0x0c11 }
            r1 = 39
            X.Aha r1 = X.C21289Aha.A00(r7, r2, r1)     // Catch:{ 1UI -> 0x0c11 }
            java.lang.Object r1 = r1.BCF(r0, r6)     // Catch:{ 1UI -> 0x0c11 }
            if (r1 == 0) goto L_0x0c07
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ 1UI -> 0x0c11 }
            java.lang.String r2 = "success"
            r1[r8] = r2     // Catch:{ 1UI -> 0x0c11 }
            boolean r1 = r6.A0A(r0, r1)     // Catch:{ 1UI -> 0x0c11 }
            if (r1 == 0) goto L_0x0c0c
            X.1ca r0 = r0.A0K(r2)     // Catch:{ 1UI -> 0x0c11 }
            if (r0 != 0) goto L_0x0c03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x0c11 }
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/deleteAccountOnSuccess was empty id="
            X.C17900vP.A0e(r0, r3, r1)     // Catch:{ 1UI -> 0x0c11 }
            java.lang.String r1 = "success was empty"
            r0 = -1
            r5.Bt2(r1, r4, r0)     // Catch:{ 1UI -> 0x0c11 }
            return
        L_0x0c03:
            r5.onSuccess()     // Catch:{ 1UI -> 0x0c11 }
            return
        L_0x0c07:
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)     // Catch:{ 1UI -> 0x0c11 }
            goto L_0x0c10
        L_0x0c0c:
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)     // Catch:{ 1UI -> 0x0c11 }
        L_0x0c10:
            throw r0     // Catch:{ 1UI -> 0x0c11 }
        L_0x0c11:
            r1 = move-exception
            java.lang.String r0 = "deleteAccountOnSuccess"
        L_0x0c14:
            X.AnonymousClass1NU.A01(r5, r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20993Acl.C7Z(X.1ca, java.lang.String):void");
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
