package com.whatsapp.companiondevice.crscv2;

import X.A62;
import X.A8G;
import X.AnonymousClass10T;
import X.AnonymousClass1HV;
import X.AnonymousClass1OB;
import X.AnonymousClass1OX;
import X.AnonymousClass1PN;
import X.AnonymousClass1RK;
import X.AnonymousClass2BC;
import X.AnonymousClass2BD;
import X.AnonymousClass2RD;
import X.AnonymousClass2RG;
import X.C129996ii;
import X.C164298Yh;
import X.C18070vi;
import X.C18150vq;
import X.C18600wl;
import X.C22511Ak;
import X.C23577Bm6;
import X.C35891my;
import X.C35911n2;
import X.C35921n3;
import X.C36021nD;
import X.C36031nE;
import X.C45912Cd;
import X.C45922Ce;
import X.C45932Cf;
import X.C58252kO;
import X.C59532mS;
import X.C63962tz;
import X.C96994ok;
import X.C97014om;
import com.whatsapp.util.Log;
import com.whatsapp.wapdata.generated.md.outgoing.MdRPCManager;
import java.security.GeneralSecurityException;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class CompanionRegOverSideChannelV2Manager extends AnonymousClass10T {
    public C36021nD A00 = C36031nE.A00;
    public final C35891my A01;
    public final AnonymousClass1RK A02;
    public final AnonymousClass1HV A03;
    public final MdRPCManager A04;
    public final C18600wl A05;
    public final AnonymousClass1OX A06;
    public final C35911n2 A07 = new C35921n3();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompanionRegOverSideChannelV2Manager(C35891my r3, AnonymousClass1RK r4, AnonymousClass1HV r5, MdRPCManager mdRPCManager, C18600wl r7, AnonymousClass1OX r8) {
        super(C18150vq.A00(), false);
        C18070vi.A0d(r8, 1);
        C18070vi.A0d(r7, 2);
        C18070vi.A0d(r5, 5);
        C18070vi.A0d(r4, 6);
        this.A06 = r8;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = mdRPCManager;
        this.A03 = r5;
        this.A02 = r4;
    }

    public static final void A02(CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager) {
        companionRegOverSideChannelV2Manager.notifyAllObservers(new C96994ok(6));
    }

    public static final void A03(CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager, C59532mS r11, C164298Yh r12) {
        String str;
        C18070vi.A0d(r12, 0);
        try {
            byte[] bArr = r11.A03;
            byte[] A062 = r12.iv_.A06();
            C18070vi.A0X(A062);
            byte[] A063 = r12.encryptedPayload_.A06();
            C18070vi.A0X(A063);
            Cipher A022 = A62.A02("AES/GCM/NoPadding");
            C18070vi.A0X(A022);
            A022.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(A062));
            byte[] doFinal = A022.doFinal(A063);
            C18070vi.A0X(doFinal);
            try {
                AnonymousClass2BD r6 = (AnonymousClass2BD) C23577Bm6.A07(AnonymousClass2BD.DEFAULT_INSTANCE, doFinal);
                C18070vi.A0b(r6);
                C18070vi.A0d(r6, 1);
                AnonymousClass2BC r3 = r11.A00;
                AnonymousClass2RG A002 = AnonymousClass2RG.A00(r3.deviceType_);
                if (A002 == null) {
                    A002 = AnonymousClass2RG.UNKNOWN;
                }
                int ordinal = A002.ordinal();
                int i = 1;
                if (ordinal != 0) {
                    if (ordinal == 19) {
                        i = 18;
                    } else if (ordinal == 24) {
                        i = 22;
                    }
                }
                String str2 = r3.ref_;
                byte[] A064 = r6.companionPublicKey_.A06();
                byte[] A065 = r6.companionIdentityKey_.A06();
                byte[] A066 = r6.advSecret_.A06();
                try {
                    companionRegOverSideChannelV2Manager.notifyAllObservers(new C97014om(new C129996ii(new C58252kO(C63962tz.A01(A8G.A05(new byte[]{5}, A065))), AnonymousClass2RD.E2EE, Integer.valueOf(i), str2, A064, A066), 4));
                } catch (C22511Ak e) {
                    Log.e("CompanionPairingData/createFromDecryptedPairingRequest invalidCompanionIdentity ", e);
                    str = "CompanionRegOverSideChannelV2Manager/completeRegistration failed to generate CompanionPairingData";
                }
                A01(companionRegOverSideChannelV2Manager);
            } catch (AnonymousClass1PN unused) {
                Log.e("CompanionRegOverSideChannelV2Manager/completeRegistration failed to parse PairingRequest after decryption");
                A02(companionRegOverSideChannelV2Manager);
                A01(companionRegOverSideChannelV2Manager);
            }
        } catch (GeneralSecurityException e2) {
            Log.e("decryptPairingRequest/failed to decrypt pairing request", e2);
            str = "CompanionRegOverSideChannelV2Manager/completeRegistration failed to decrypt pairing request";
            Log.e(str);
            A02(companionRegOverSideChannelV2Manager);
            A01(companionRegOverSideChannelV2Manager);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070 A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088 A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager r7, X.AnonymousClass3KW r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.AnonymousClass3FN
            if (r0 == 0) goto L_0x002a
            r6 = r9
            X.3FN r6 = (X.AnonymousClass3FN) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r3 = r6.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 != r1) goto L_0x0030
            java.lang.Object r5 = r6.L$1
            X.1n2 r5 = (X.C35911n2) r5
            java.lang.Object r7 = r6.L$0
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager r7 = (com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager) r7
            X.C30691eM.A01(r3)
            goto L_0x006a
        L_0x002a:
            X.3FN r6 = new X.3FN
            r6.<init>(r7, r9)
            goto L_0x0012
        L_0x0030:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0038:
            X.C30691eM.A01(r3)
            if (r8 != 0) goto L_0x004b
            java.lang.String r0 = "CompanionRegOverSideChannelV2Manager/handleDeliveryFailure"
        L_0x003f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            A02(r7)
            A01(r7)
        L_0x0048:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x004b:
            boolean r0 = r8 instanceof X.AnonymousClass9FW
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "CompanionRegOverSideChannelV2Manager/handleSetPrimaryEphemeralIdentityResponseError"
            goto L_0x003f
        L_0x0052:
            boolean r0 = r8 instanceof X.AnonymousClass9FV
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "CompanionRegOverSideChannelV2Manager/handleSetPrimaryEphemeralIdentityResponseSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1n2 r5 = r7.A07
            r6.L$0 = r7
            r6.L$1 = r5
            r6.label = r1
            java.lang.Object r0 = r5.Bhx(r6)
            if (r0 != r2) goto L_0x006a
            return r2
        L_0x006a:
            X.1nD r1 = r7.A00     // Catch:{ all -> 0x0091 }
            boolean r0 = r1 instanceof X.C45912Cd     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0088
            X.2Cd r1 = (X.C45912Cd) r1     // Catch:{ all -> 0x0091 }
            X.2mS r3 = r1.A00     // Catch:{ all -> 0x0091 }
            X.1OB r2 = r1.A01     // Catch:{ all -> 0x0091 }
            r1 = 0
            X.2Cf r0 = new X.2Cf     // Catch:{ all -> 0x0091 }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x0091 }
            r7.A00 = r0     // Catch:{ all -> 0x0091 }
            r1 = 7
            X.4ok r0 = new X.4ok     // Catch:{ all -> 0x0091 }
            r0.<init>(r1)     // Catch:{ all -> 0x0091 }
            r7.notifyAllObservers(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x008d
        L_0x0088:
            java.lang.String r0 = "CompanionRegOverSideChannelV2Manager/handleSetPrimaryEphemeralIdentityResponseSuccess/not expecting a result"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0091 }
        L_0x008d:
            r5.CQ9(r4)
            goto L_0x0048
        L_0x0091:
            r0 = move-exception
            r5.CQ9(r4)
            throw r0
        L_0x0096:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager.A00(com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager, X.3KW, X.1dr):java.lang.Object");
    }

    public static final void A01(CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager) {
        AnonymousClass1OB r1;
        C36021nD r12 = companionRegOverSideChannelV2Manager.A00;
        if (r12 instanceof C45932Cf) {
            r1 = ((C45932Cf) r12).A01;
        } else if (r12 instanceof C45922Ce) {
            r1 = ((C45922Ce) r12).A02;
        } else if (r12 instanceof C45912Cd) {
            r1 = ((C45912Cd) r12).A01;
        } else {
            r1 = r12.A00;
        }
        if (r1 != null) {
            r1.BEM((CancellationException) null);
        }
        companionRegOverSideChannelV2Manager.A00 = C36031nE.A00;
    }
}
