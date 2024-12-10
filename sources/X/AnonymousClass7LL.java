package X;

import com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker;
import com.whatsapp.util.Log;

/* renamed from: X.7LL  reason: invalid class name */
public class AnonymousClass7LL implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass7LL(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public void BrD(String str) {
        C25113CYi cYi;
        Object obj;
        switch (this.A00) {
            case 0:
                C17900vP.A0f("LocationSubscriptionSendMethods/unsubscribe/onDeliveryFailure; iqId=", str, AnonymousClass000.A10());
                return;
            case 1:
                C17900vP.A0f("BroadcastXmppMethods/sendDeleteBroadcastList/onDeliveryFailure; iq=", str, AnonymousClass000.A10());
                return;
            case 2:
                AnonymousClass3MY.A1M((AnonymousClass1DS) this.A01, false);
                return;
            case 3:
                Log.e("disclosuregetstagebyidsworker/onDeliveryFailure");
                DisclosureGetStageByIdsWorker disclosureGetStageByIdsWorker = (DisclosureGetStageByIdsWorker) this.A03;
                if (disclosureGetStageByIdsWorker.A01.A00 > 4) {
                    int[] iArr = (int[]) this.A02;
                    C33511iw A002 = disclosureGetStageByIdsWorker.A02.A00(2);
                    if (A002 != null) {
                        A002.Brk(iArr, 440);
                    }
                    cYi = (C25113CYi) this.A01;
                    obj = new C162168Jj();
                } else {
                    cYi = (C25113CYi) this.A01;
                    obj = new Object();
                }
                cYi.A00(obj);
                return;
            case 4:
                Log.e("AvatarUserRequestHelper/onDeliveryFailure: Network Failure");
                ((C1606789m) this.A01).BrA();
                return;
            case 5:
                Log.i("marketing_disclosure/GetMMDisclosureAcceptanceRequest delivery fail");
                C132076m9 r0 = (C132076m9) this.A01;
                AnonymousClass73F r3 = r0.A01;
                AnonymousClass73F.A01(r3, new AnonymousClass7S0(r0.A00, r3, 12));
                return;
            case 6:
                C17900vP.A0f("GdprXmppMethods/sendRequestGdprReport/onDeliveryFailure; iq=", str, AnonymousClass000.A10());
                ((C23570Bly) this.A02).A04(new RuntimeException(AnonymousClass001.A1H("XMPP IQ was not delivered: iq=", str, AnonymousClass000.A10())));
                return;
            case 7:
                C17900vP.A0f("GdprXmppMethods/sendGetGdprReport/onDeliveryFailure; iq=", str, AnonymousClass000.A10());
                ((C23570Bly) this.A02).A04(new RuntimeException(AnonymousClass001.A1H("XMPP IQ was not delivered: iq=", str, AnonymousClass000.A10())));
                return;
            case 8:
                C18070vi.A0d(str, 0);
                C31081ez.A01("BloksPreConsentGraphqlIntegrityCheckIqHelper/sendData:onDeliveryFailure");
                ((C128056fN) this.A01).A00.A01.A01.A00(new AnonymousClass9L7(str));
                return;
            default:
                C31081ez.A01("ForceSuspendStateIqHelper/sendData:onDeliveryFailure");
                ((AnonymousClass89Z) this.A01).Bti();
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ff, code lost:
        r2.CGv(r4, r0.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0106, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0193, code lost:
        ((X.C23570Bly) r7.A02).A03((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bt9(X.C29621ca r8, java.lang.String r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0262;
                case 1: goto L_0x024d;
                case 2: goto L_0x0244;
                case 3: goto L_0x01ea;
                case 4: goto L_0x01c6;
                case 5: goto L_0x01a2;
                case 6: goto L_0x0160;
                case 7: goto L_0x012b;
                case 8: goto L_0x005c;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            X.C18070vi.A0d(r8, r0)
            int r5 = X.C60482o6.A00(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ForceSuspendStateIqHelper/sendData:onError with error code "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r5)
            X.C31081ez.A01(r0)
            java.lang.Object r3 = r7.A03
            X.6wv r3 = (X.C138346wv) r3
            java.lang.Object r1 = r7.A01
            X.89Z r1 = (X.AnonymousClass89Z) r1
            java.lang.Object r2 = r7.A02
            X.705 r2 = (X.AnonymousClass705) r2
            r0 = 44
            X.7RO r4 = new X.7RO
            r4.<init>(r3, r1, r2, r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r5 == r0) goto L_0x0112
            r0 = 405(0x195, float:5.68E-43)
            if (r5 == r0) goto L_0x0112
            r0 = 408(0x198, float:5.72E-43)
            if (r5 == r0) goto L_0x00f7
            r0 = 416(0x1a0, float:5.83E-43)
            if (r5 == r0) goto L_0x0112
            r0 = 429(0x1ad, float:6.01E-43)
            if (r5 == r0) goto L_0x00f7
            r0 = 481(0x1e1, float:6.74E-43)
            if (r5 == r0) goto L_0x0052
            r0 = 483(0x1e3, float:6.77E-43)
            if (r5 == r0) goto L_0x0107
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 == r0) goto L_0x0112
            r0 = 503(0x1f7, float:7.05E-43)
            if (r5 == r0) goto L_0x0112
            return
        L_0x0052:
            boolean r0 = r2.A04()
            if (r0 == 0) goto L_0x0112
            r4.run()
            return
        L_0x005c:
            X.C18070vi.A0h(r9, r8)
            int r1 = X.C60482o6.A00(r8)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/sendData:onError code="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r2, r1)
            X.C31081ez.A01(r0)
            java.lang.Object r2 = r7.A03
            X.6wu r2 = (X.C138336wu) r2
            X.6Sm r3 = new X.6Sm
            r3.<init>(r8, r9)
            java.lang.Object r5 = r7.A01
            X.6fN r5 = (X.C128056fN) r5
            java.lang.Object r6 = r7.A02
            X.705 r6 = (X.AnonymousClass705) r6
            r0 = 41
            X.7RO r4 = new X.7RO
            r4.<init>(r2, r5, r6, r0)
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L_0x0119
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x011c
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 == r0) goto L_0x011c
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x0116
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x00e9
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x011c
            r0 = 503(0x1f7, float:7.05E-43)
            if (r1 == r0) goto L_0x011c
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x011c
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0119
            r0 = 408(0x198, float:5.72E-43)
            if (r1 == r0) goto L_0x00e9
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x0119
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 == r0) goto L_0x0119
            r0 = 481(0x1e1, float:6.74E-43)
            if (r1 == r0) goto L_0x00e9
            switch(r1) {
                case 483: goto L_0x0119;
                case 484: goto L_0x0119;
                case 485: goto L_0x00c0;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            return
        L_0x00c0:
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/handError: state mismatch error from Bloks Integrity check IQ"
            X.C31081ez.A01(r0)
            X.00H r0 = r2.A02
            java.lang.Object r1 = r0.get()
            X.1lN r1 = (X.C34951lN) r1
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A06(r0)
            X.00H r0 = r2.A01
            java.lang.Object r2 = r0.get()
            X.6wv r2 = (X.C138346wv) r2
            X.7On r1 = new X.7On
            r1.<init>(r6, r3, r5, r4)
            X.705 r0 = X.AnonymousClass705.A00()
            X.C138346wv.A00(r0, r1, r2)
            return
        L_0x00e9:
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/handError: retryable error received from Bloks Integrity check IQ"
            X.C31081ez.A01(r0)
            java.lang.Long r0 = r6.A01()
            if (r0 == 0) goto L_0x0121
            X.10I r2 = r2.A00
            goto L_0x00ff
        L_0x00f7:
            java.lang.Long r0 = r2.A01()
            if (r0 == 0) goto L_0x0112
            X.10I r2 = r3.A01
        L_0x00ff:
            long r0 = r0.longValue()
            r2.CGv(r4, r0)
            return
        L_0x0107:
            X.00H r0 = r3.A02
            java.lang.Object r0 = r0.get()
            X.6zm r0 = (X.C139996zm) r0
            r0.A00()
        L_0x0112:
            r1.Bti()
            return
        L_0x0116:
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/handError: Waffle jurisdiction gating error received from Bloks Integrity check IQ"
            goto L_0x011e
        L_0x0119:
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/handError: Unexpected Error received from Bloks Integrity check IQ"
            goto L_0x011e
        L_0x011c:
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/handError: Unrecoverable error from Bloks Integrity check IQ"
        L_0x011e:
            X.C31081ez.A01(r0)
        L_0x0121:
            X.6mz r0 = r5.A00
            X.6tx r0 = r0.A01
            X.6pU r0 = r0.A01
            r0.A01(r3)
            return
        L_0x012b:
            int r2 = X.C60482o6.A00(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GdprXmppMethods/sendGetGdprReport/onError; iq="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", errorCode="
            X.C17900vP.A0j(r0, r1, r2)
            java.lang.Object r1 = r7.A03
            X.6cY r1 = (X.C126326cY) r1
            r0 = 404(0x194, float:5.66E-43)
            if (r2 != r0) goto L_0x0156
            X.7Fd r2 = r1.A00
            java.lang.Integer r1 = r2.A07()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0193
            r2.A0A()
            goto L_0x0193
        L_0x0156:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "send-get-gdpr-report/failed/error "
            X.C17900vP.A0i(r0, r1, r2)
            goto L_0x0193
        L_0x0160:
            int r3 = X.C60482o6.A00(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GdprXmppMethods/sendRequestGdprReport/onError; iq="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", error="
            X.C17900vP.A0j(r0, r1, r3)
            java.lang.Object r2 = r7.A03
            X.85f r2 = (X.C1596185f) r2
            X.7LX r2 = (X.AnonymousClass7LX) r2
            int r0 = r2.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 == 0) goto L_0x019c
            java.lang.String r0 = "send-request-gdpr-report/failed/error "
            X.C17900vP.A0i(r0, r1, r3)
            java.lang.Object r2 = r2.A02
            X.1FU r2 = (X.AnonymousClass1FU) r2
            X.1KB r1 = r2.A05
            r0 = 28
            X.C146767Qn.A00(r1, r2, r0)
        L_0x0193:
            java.lang.Object r1 = r7.A02
            X.Bly r1 = (X.C23570Bly) r1
            r0 = 0
            r1.A03(r0)
            return
        L_0x019c:
            java.lang.String r0 = "AutoReportScheduler/sendReportRequestForType error "
            X.C17900vP.A0i(r0, r1, r3)
            goto L_0x0193
        L_0x01a2:
            r0 = 1
            X.C18070vi.A0d(r8, r0)
            int r2 = X.C60482o6.A00(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "marketing_disclosure/GetMMDisclosureAcceptanceRequest/"
            X.C17900vP.A0i(r0, r1, r2)
            java.lang.Object r0 = r7.A01
            X.6m9 r0 = (X.C132076m9) r0
            X.73F r3 = r0.A01
            X.1BI r2 = r0.A00
            r1 = 12
            X.7S0 r0 = new X.7S0
            r0.<init>(r2, r3, r1)
            X.AnonymousClass73F.A01(r3, r0)
            return
        L_0x01c6:
            X.C18070vi.A0h(r9, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AvatarUserRequestHelper/onError: "
            r1.append(r0)
            X.6Sm r0 = new X.6Sm
            r0.<init>(r8, r9)
            r1.append(r0)
            X.C17890vO.A0w(r1)
            java.lang.Object r1 = r7.A02
            X.1Di r1 = (X.C22821Di) r1
            X.6Sm r0 = new X.6Sm
            r0.<init>(r8, r9)
            r1.invoke(r0)
            return
        L_0x01ea:
            r0 = 1
            X.C18070vi.A0d(r8, r0)
            android.util.Pair r2 = X.C60482o6.A01(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "disclosuregetstagebyidsworker/onError "
            X.C17900vP.A0X(r2, r0, r1)
            if (r2 == 0) goto L_0x0210
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0210
            int r1 = r0.intValue()
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x0210
            java.lang.String r0 = "disclosuregetstagebyidsworker/onError invalid stanza"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0210:
            java.lang.Object r4 = r7.A03
            com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker r4 = (com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker) r4
            androidx.work.WorkerParameters r0 = r4.A01
            int r1 = r0.A00
            r0 = 4
            if (r1 <= r0) goto L_0x023a
            java.lang.Object r3 = r7.A02
            int[] r3 = (int[]) r3
            r2 = 440(0x1b8, float:6.17E-43)
            X.1iz r1 = r4.A02
            r0 = 2
            X.1iw r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x022d
            r0.Brk(r3, r2)
        L_0x022d:
            java.lang.Object r1 = r7.A01
            X.CYi r1 = (X.C25113CYi) r1
            X.8Jj r0 = new X.8Jj
            r0.<init>()
        L_0x0236:
            r1.A00(r0)
            return
        L_0x023a:
            java.lang.Object r1 = r7.A01
            X.CYi r1 = (X.C25113CYi) r1
            X.8Ji r0 = new X.8Ji
            r0.<init>()
            goto L_0x0236
        L_0x0244:
            java.lang.Object r1 = r7.A01
            X.1DS r1 = (X.AnonymousClass1DS) r1
            r0 = 0
            X.AnonymousClass3MY.A1M(r1, r0)
            return
        L_0x024d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BroadcastXmppMethods/sendDeleteBroadcastList/onError; iq="
            X.C17900vP.A0f(r0, r9, r1)
            int r1 = X.C60482o6.A00(r8)
            java.lang.Object r0 = r7.A02
            X.B9K r0 = (X.B9K) r0
            r0.CGB(r1)
            return
        L_0x0262:
            int r2 = X.C60482o6.A00(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationSubscriptionSendMethods/unsubscribe/onError; iqId="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", error="
            X.C17900vP.A0j(r0, r1, r2)
            java.lang.Object r0 = r7.A02
            X.B9K r0 = (X.B9K) r0
            r0.CGB(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LL.Bt9(X.1ca, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x037b, code lost:
        X.C17900vP.A0f(r0, r3, r1);
        X.C108945cZ.A1P(r14.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0383, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01d8, code lost:
        ((X.C23570Bly) r14.A02).A03((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01e0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r15, java.lang.String r16) {
        /*
            r14 = this;
            int r0 = r14.A00
            r7 = r15
            r3 = r16
            switch(r0) {
                case 0: goto L_0x0375;
                case 1: goto L_0x036e;
                case 2: goto L_0x032f;
                case 3: goto L_0x02b1;
                case 4: goto L_0x02a5;
                case 5: goto L_0x0228;
                case 6: goto L_0x018d;
                case 7: goto L_0x00fc;
                case 8: goto L_0x0015;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r0 = "ForceSuspendStateIqHelper/sendData:onSuccess"
            X.C31081ez.A02(r0)
            java.lang.Object r0 = r14.A01
            X.89Z r0 = (X.AnonymousClass89Z) r0
            r0.onSuccess()
            return
        L_0x0015:
            r9 = 1
            X.C18070vi.A0d(r15, r9)
            java.lang.String r0 = "BloksPreConsentGraphqlIntegrityCheckIqHelper/sendData:onSuccess"
            X.C31081ez.A02(r0)
            java.lang.String r0 = "paused_state"
            X.1ca r8 = r15.A0L(r0)
            java.lang.String r0 = "disclosure_id"
            X.1ca r0 = r15.A0L(r0)
            java.lang.String r3 = r0.A0M()
            java.lang.String r0 = "ttl"
            X.1ca r0 = r15.A0L(r0)
            java.lang.String r2 = r0.A0M()
            java.lang.String r0 = "df_token"
            X.1ca r0 = r15.A0L(r0)
            byte[] r0 = r0.A01
            r5 = 0
            java.lang.String r11 = android.util.Base64.encodeToString(r0, r5)
            java.lang.String r0 = "jurisdiction"
            X.1ca r0 = r15.A0K(r0)
            if (r0 == 0) goto L_0x00f9
            byte[] r1 = r0.A01
        L_0x004f:
            java.lang.String r6 = ""
            if (r1 == 0) goto L_0x00f6
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            X.C18070vi.A0X(r0)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1, r0)
        L_0x0061:
            if (r3 == 0) goto L_0x0067
            int r5 = java.lang.Integer.parseInt(r3)
        L_0x0067:
            if (r2 == 0) goto L_0x00f2
            long r2 = java.lang.Long.parseLong(r2)
        L_0x006d:
            java.lang.String r0 = "is_paused"
            r7 = 0
            java.lang.String r0 = r8.A0Q(r0, r7)
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
            java.lang.String r0 = "npr"
            java.lang.String r0 = r8.A0Q(r0, r7)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            X.6rb r10 = new X.6rb
            r10.<init>(r1, r0)
            if (r11 == 0) goto L_0x008a
            r6 = r11
        L_0x008a:
            java.lang.Object r7 = r14.A01
            X.6fN r7 = (X.C128056fN) r7
            X.6jU r8 = r7.A01
            X.00H r0 = r8.A04
            java.lang.Object r0 = r0.get()
            X.1lN r0 = (X.C34951lN) r0
            java.lang.Boolean r0 = r0.A05()
            boolean r1 = X.C72453Mb.A1Y(r0)
            boolean r0 = r10.A00
            if (r1 == 0) goto L_0x00e0
            if (r0 != 0) goto L_0x00ad
            X.10I r1 = r8.A01
            r0 = 34
            X.C146787Qp.A00(r1, r8, r0)
        L_0x00ad:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            X.11P r0 = r8.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            long r2 = r2 + r0
            X.00H r0 = r8.A03
            java.lang.Object r0 = r0.get()
            X.1lZ r0 = (X.C35051lZ) r0
            android.content.SharedPreferences$Editor r1 = X.C18070vi.A02(r0)
            java.lang.String r0 = "pre_consent_bloks_integrity_timestamp"
            r1.putLong(r0, r2)
            java.lang.String r0 = "pre_consent_bloks_integrity_disclosure_id"
            r1.putInt(r0, r5)
            java.lang.String r0 = "pre_consent_bloks_integrity_df_token"
            r1.putString(r0, r6)
            java.lang.String r0 = "pre_consent_bloks_integrity_jurisdiction"
            r1.putString(r0, r4)
            r1.apply()
            X.6mz r0 = r7.A00
            r0.A00(r5, r6, r4)
            return
        L_0x00e0:
            if (r0 == 0) goto L_0x00ad
            X.00H r0 = r8.A05
            java.lang.Object r1 = r0.get()
            X.1lN r1 = (X.C34951lN) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.A06(r0)
            goto L_0x00ad
        L_0x00f2:
            r2 = 0
            goto L_0x006d
        L_0x00f6:
            r4 = r6
            goto L_0x0061
        L_0x00f9:
            r1 = 0
            goto L_0x004f
        L_0x00fc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GdprXmppMethods/sendGetGdprReport/onSuccess; iq="
            X.C17900vP.A0f(r0, r3, r1)
            java.lang.String r0 = "gdpr"
            X.1ca r4 = r15.A0K(r0)
            if (r4 == 0) goto L_0x0163
            java.lang.String r0 = "document"
            X.1ca r6 = r4.A0K(r0)
            r1 = 0
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L_0x0152
            byte[] r9 = r6.A01
            if (r9 == 0) goto L_0x0152
            java.lang.Object r5 = r14.A03
            X.6cY r5 = (X.C126326cY) r5
            java.lang.String r0 = "creation"
            long r10 = r6.A0D(r0, r1)
            long r10 = r10 * r7
            java.lang.Object r0 = r14.A01
            X.6mB r0 = (X.C132086mB) r0
            X.11P r0 = r0.A00
            long r1 = X.AnonymousClass11P.A01(r0)
            r3 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r1 = r1 + r3
            long r1 = r1 / r7
            java.lang.String r0 = "expiration"
            long r12 = r6.A0D(r0, r1)
            long r12 = r12 * r7
            X.7Fd r8 = r5.A00
            java.lang.Integer r0 = r8.A07()
            int r1 = X.AnonymousClass6XN.A00(r0)
            r0 = 3
            if (r1 >= r0) goto L_0x01d8
            r8.A0H(r9, r10, r12)
            goto L_0x01d8
        L_0x0152:
            java.lang.Object r3 = r14.A03
            X.6cY r3 = (X.C126326cY) r3
            java.lang.String r0 = "timestamp"
            long r1 = r4.A0D(r0, r1)
            long r1 = r1 * r7
            X.7Fd r0 = r3.A00
            r0.A0F(r1)
            goto L_0x01d8
        L_0x0163:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GdprXmppMethods/sendGetGdprReport/onSuccess; no GDPR node, iq="
            X.C17900vP.A0f(r0, r3, r1)
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "send-get-gdpr-report/failed/error "
            X.C17900vP.A0i(r0, r1, r2)
            java.lang.Object r2 = r14.A02
            X.Bly r2 = (X.C23570Bly) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid response from server for GDPR report request: iq="
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r3, r1)
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            r2.A04(r0)
            return
        L_0x018d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GdprXmppMethods/sendRequestGdprReport/onSuccess; iq="
            X.C17900vP.A0f(r0, r3, r1)
            java.lang.String r0 = "gdpr"
            X.1ca r1 = r15.A0K(r0)
            r2 = 0
            if (r1 == 0) goto L_0x01a9
            java.lang.String r0 = "timestamp"
            long r0 = r1.A0D(r0, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
        L_0x01a9:
            java.lang.Object r7 = r14.A03
            X.85f r7 = (X.C1596185f) r7
            X.7LX r7 = (X.AnonymousClass7LX) r7
            int r6 = r7.A00
            java.lang.Object r1 = r7.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L_0x01e1
            if (r1 != r0) goto L_0x01ff
            java.lang.Object r1 = r7.A02
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            X.00H r0 = r1.A0H
            if (r0 == 0) goto L_0x021e
            java.lang.Object r0 = r0.get()
            X.7Fd r0 = (X.C143877Fd) r0
            r0.A0F(r2)
            X.0z4 r0 = r1.A0A
        L_0x01ce:
            long r2 = r2 / r4
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "automatic_account_report_requested_ts_sec"
        L_0x01d5:
            X.C17880vN.A1D(r1, r0, r2)
        L_0x01d8:
            java.lang.Object r1 = r14.A02
            X.Bly r1 = (X.C23570Bly) r1
            r0 = 0
            r1.A03(r0)
            return
        L_0x01e1:
            if (r1 != r0) goto L_0x01ef
            java.lang.Object r1 = r7.A02
            X.6q2 r1 = (X.AnonymousClass6q2) r1
            X.6Et r0 = r1.A01
            r0.A0F(r2)
            X.0z4 r0 = r1.A00
            goto L_0x01ce
        L_0x01ef:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x01d8
            java.lang.Object r1 = r7.A02
            X.6q2 r1 = (X.AnonymousClass6q2) r1
            X.6Eu r0 = r1.A02
            r0.A0F(r2)
            X.0z4 r0 = r1.A00
            goto L_0x0216
        L_0x01ff:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x01d8
            java.lang.Object r1 = r7.A02
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            X.00H r0 = r1.A0J
            if (r0 == 0) goto L_0x0221
            java.lang.Object r0 = r0.get()
            X.7Fd r0 = (X.C143877Fd) r0
            r0.A0F(r2)
            X.0z4 r0 = r1.A0A
        L_0x0216:
            long r2 = r2 / r4
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "automatic_channels_report_requested_ts_sec"
            goto L_0x01d5
        L_0x021e:
            java.lang.String r0 = "gdprReport"
            goto L_0x0223
        L_0x0221:
            java.lang.String r0 = "newsletterGdprReport"
        L_0x0223:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0228:
            r4 = 1
            X.C18070vi.A0d(r15, r4)
            java.lang.Object r1 = r14.A02
            X.9F7 r1 = (X.AnonymousClass9F7) r1
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            X.C108945cZ.A1N(r15)
            java.lang.Object r0 = r1.A00
            X.2rm r6 = new X.2rm
            r6.<init>()
            X.A3p r5 = X.C20023A3p.A00
            r3 = 6
            X.AfV r2 = new X.AfV
            r2.<init>(r0, r5, r3)
            r1 = 0
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object r0 = r6.A03(r15, r2, r0)
            if (r0 == 0) goto L_0x02a0
            java.lang.String[] r9 = new java.lang.String[r4]
            java.lang.String r0 = "notice"
            r9[r1] = r0
            X.AfU r8 = X.C108945cZ.A0W(r5, r3)
            r10 = 0
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.ArrayList r0 = r6.A08(r7, r8, r9, r10, r12)
            if (r0 == 0) goto L_0x029b
            java.util.Iterator r7 = r0.iterator()
        L_0x026a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0291
            java.lang.Object r3 = r7.next()
            X.6Ov r3 = (X.C122326Ov) r3
            java.lang.Object r0 = r3.A02
            X.9Ch r0 = (X.C178229Ch) r0
            long r5 = r0.A00
            r1 = 20231028(0x134b374, double:9.995456E-317)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x026a
            long r2 = r3.A00
            java.lang.Object r1 = r14.A01
            X.6m9 r1 = (X.C132076m9) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00(r0, r4)
            return
        L_0x0291:
            java.lang.Object r2 = r14.A01
            X.6m9 r2 = (X.C132076m9) r2
            r1 = 0
            r0 = 0
            r2.A00(r0, r1)
            return
        L_0x029b:
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)
            throw r0
        L_0x02a0:
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)
            throw r0
        L_0x02a5:
            r0 = 1
            X.C18070vi.A0d(r15, r0)
            java.lang.Object r0 = r14.A03
            X.1Di r0 = (X.C22821Di) r0
            r0.invoke(r15)
            return
        L_0x02b1:
            r2 = 1
            X.C18070vi.A0d(r15, r2)
            java.lang.Object r4 = r14.A03
            com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker r4 = (com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker) r4
            java.lang.String r0 = "notice"
            java.util.List r0 = r15.A0R(r0)
            java.util.ArrayList r3 = X.C108965cb.A0t(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x02c7:
            boolean r0 = r6.hasNext()
            r13 = 2
            if (r0 == 0) goto L_0x0311
            java.lang.Object r5 = r6.next()
            X.1ca r5 = (X.C29621ca) r5
            java.lang.String r0 = "id"
            int r8 = r5.A09(r0)
            java.lang.String r0 = "stage"
            int r9 = r5.A09(r0)
            java.lang.String r0 = "t"
            long r0 = r5.A0C(r0)
            r11 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r0
            java.lang.String r0 = "version"
            int r10 = r5.A0A(r0, r2)
            java.lang.String r0 = "type"
            int r0 = r5.A0A(r0, r13)
            if (r0 != r13) goto L_0x0307
            r0 = -1
            if (r9 <= r0) goto L_0x0307
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r9 >= r0) goto L_0x0307
            X.2tN r7 = new X.2tN
            r7.<init>(r8, r9, r10, r11, r13)
            r3.add(r7)
            goto L_0x02c7
        L_0x0307:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "disclosuregetstagebyidsworker/parseusernoticemetadatalist not valid PDFN metadata id = "
            X.C17900vP.A0k(r0, r1, r8)
            goto L_0x02c7
        L_0x0311:
            boolean r0 = X.C17880vN.A1X(r3)
            if (r0 == 0) goto L_0x0322
            X.1iz r0 = r4.A02
            X.1iw r0 = r0.A00(r13)
            if (r0 == 0) goto L_0x0322
            r0.BcE(r3, r2, r2)
        L_0x0322:
            java.lang.Object r1 = r14.A01
            X.CYi r1 = (X.C25113CYi) r1
            X.8Jk r0 = new X.8Jk
            r0.<init>()
            r1.A00(r0)
            return
        L_0x032f:
            r3 = 1
            X.C18070vi.A0d(r15, r3)
            java.lang.String r0 = "privacy"
            X.1ca r1 = r15.A0L(r0)
            java.lang.String r0 = "category"
            X.1ca r1 = r1.A0L(r0)
            java.lang.String r0 = "dhash"
            java.lang.String r2 = X.C29621ca.A02(r1, r0)
            if (r2 == 0) goto L_0x035e
            java.lang.Object r1 = r14.A03
            X.2nP r1 = (X.C60112nP) r1
            java.lang.Object r0 = r14.A02
            java.util.Set r0 = (java.util.Set) r0
            r1.A04(r2, r0, r3)
            java.lang.Object r1 = r14.A01
            X.1DS r1 = (X.AnonymousClass1DS) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
        L_0x035a:
            r1.A0E(r0)
            return
        L_0x035e:
            java.lang.Object r0 = r14.A03
            X.2nP r0 = (X.C60112nP) r0
            r0.A00()
            java.lang.Object r1 = r14.A01
            X.1DS r1 = (X.AnonymousClass1DS) r1
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            goto L_0x035a
        L_0x036e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BroadcastXmppMethods/sendDeleteBroadcastList/onSuccess; iq="
            goto L_0x037b
        L_0x0375:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationSubscriptionSendMethods/unsubscribe/onSuccess; iqId="
        L_0x037b:
            X.C17900vP.A0f(r0, r3, r1)
            java.lang.Object r0 = r14.A03
            X.C108945cZ.A1P(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LL.C7Z(X.1ca, java.lang.String):void");
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
