package com.whatsapp.passkeys;

import X.AnonymousClass00H;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1OA;
import X.AnonymousClass1PY;
import X.AnonymousClass3MX;
import X.B5N;
import X.C108965cb;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C193139pb;
import X.C196759vb;
import X.C19830z4;
import X.C20741AWw;
import X.C20742AWx;
import X.C30391dr;
import X.C34071js;
import android.content.SharedPreferences;

public final class PasskeyExistsCache {
    public AnonymousClass1G4 A00;
    public final C19830z4 A01;
    public final AnonymousClass1PY A02;
    public final AnonymousClass1G1 A03;
    public final C18030ve A04;
    public final PasskeyServerApiImpl A05;

    public final void A01(B5N b5n) {
        SharedPreferences.Editor putString;
        SharedPreferences.Editor remove;
        C18070vi.A0d(b5n, 0);
        this.A00.setValue(b5n);
        String str = null;
        if (b5n instanceof C20741AWw) {
            C19830z4 r4 = this.A01;
            C17880vN.A1F(C19830z4.A00(r4), "reg_passkey_exists", true);
            C20741AWw aWw = (C20741AWw) b5n;
            C193139pb r0 = aWw.A00;
            if (r0 != null) {
                str = C196759vb.A01(r0.A00);
            }
            C17880vN.A1E(C19830z4.A00(r4), "reg_passkey_credential_id", str);
            Long l = aWw.A01;
            if (l != null) {
                remove = C19830z4.A00(r4).putLong("reg_passkey_created_ts", l.longValue());
            } else {
                remove = C19830z4.A00(r4).remove("reg_passkey_created_ts");
            }
            remove.apply();
            Long l2 = aWw.A02;
            if (l2 != null) {
                putString = C19830z4.A00(r4).putLong("reg_passkey_last_used_ts", l2.longValue());
            } else {
                putString = C19830z4.A00(r4).remove("reg_passkey_last_used_ts");
            }
        } else if (b5n instanceof C20742AWx) {
            C19830z4 r2 = this.A01;
            C17880vN.A1B(C19830z4.A00(r2), "reg_passkey_created_ts");
            C17880vN.A1B(C19830z4.A00(r2), "reg_passkey_last_used_ts");
            C17880vN.A1F(C19830z4.A00(r2), "reg_passkey_exists", false);
            putString = C19830z4.A00(r2).putString("reg_passkey_credential_id", (String) null);
        } else {
            return;
        }
        putString.apply();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099 A[Catch:{ Exception -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4 A[Catch:{ Exception -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C30391dr r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C21657Anm
            if (r0 == 0) goto L_0x00df
            r5 = r8
            X.Anm r5 = (X.C21657Anm) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00df
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 == r3) goto L_0x0049
            if (r0 != r4) goto L_0x00eb
            java.lang.Object r1 = r5.L$0
            com.whatsapp.passkeys.PasskeyExistsCache r1 = (com.whatsapp.passkeys.PasskeyExistsCache) r1
            X.C30691eM.A01(r2)
        L_0x0027:
            X.9MT r2 = (X.AnonymousClass9MT) r2
            boolean r0 = r2 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x0039
            X.8yZ r2 = (X.C175348yZ) r2
            java.lang.Object r0 = r2.A00
            X.B5N r0 = (X.B5N) r0
            r1.A01(r0)
        L_0x0036:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0039:
            boolean r0 = r2 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00e6
            X.8yY r2 = (X.C175338yY) r2
            java.lang.Object r1 = r2.A00
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r0 = "PasskeyExistsCache/syncPasskeyExistenceFromServer/error"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0036
        L_0x0049:
            java.lang.Object r6 = r5.L$0
            com.whatsapp.passkeys.PasskeyExistsCache r6 = (com.whatsapp.passkeys.PasskeyExistsCache) r6
            goto L_0x0090
        L_0x004e:
            X.C30691eM.A01(r2)
            X.0ve r2 = r7.A04
            r1 = 10139(0x279b, float:1.4208E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00c8
            r5.L$0 = r7     // Catch:{ Exception -> 0x00c0 }
            r5.label = r3     // Catch:{ Exception -> 0x00c0 }
            X.1g7 r5 = X.C72473Md.A0m(r5)     // Catch:{ Exception -> 0x00c0 }
            X.1PY r4 = r7.A02     // Catch:{ Exception -> 0x00c0 }
            X.AWy r3 = new X.AWy     // Catch:{ Exception -> 0x00c0 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = "PasskeyExistCheckMex/getPasskeyExistCheck"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00c0 }
            com.whatsapp.infra.graphql.generated.mex.PasskeyExistResponseQueryImpl$Builder r0 = new com.whatsapp.infra.graphql.generated.mex.PasskeyExistResponseQueryImpl$Builder     // Catch:{ Exception -> 0x00c0 }
            r0.<init>()     // Catch:{ Exception -> 0x00c0 }
            X.A7K r2 = r0.A00     // Catch:{ Exception -> 0x00c0 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.mex.PasskeyExistResponseQueryResponseImpl> r1 = com.whatsapp.infra.graphql.generated.mex.PasskeyExistResponseQueryResponseImpl.class
            java.lang.String r0 = "PasskeyExistResponseQuery"
            X.A2g r1 = X.AIj.A01(r2, r4, r1, r0)     // Catch:{ Exception -> 0x00c0 }
            X.8tu r0 = new X.8tu     // Catch:{ Exception -> 0x00c0 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x00c0 }
            r1.A03(r0)     // Catch:{ Exception -> 0x00c0 }
            java.lang.Object r2 = r5.A0C()     // Catch:{ Exception -> 0x00c0 }
            if (r2 == r6) goto L_0x00f0
            r6 = r7
            goto L_0x0093
        L_0x0090:
            X.C30691eM.A01(r2)     // Catch:{ Exception -> 0x00c0 }
        L_0x0093:
            X.9MS r2 = (X.AnonymousClass9MS) r2     // Catch:{ Exception -> 0x00c0 }
            boolean r0 = r2 instanceof X.C175318yW     // Catch:{ Exception -> 0x00c0 }
            if (r0 == 0) goto L_0x00b4
            X.8yW r2 = (X.C175318yW) r2     // Catch:{ Exception -> 0x00c0 }
            X.9pb r5 = r2.A02     // Catch:{ Exception -> 0x00c0 }
            long r0 = r2.A00     // Catch:{ Exception -> 0x00c0 }
            java.lang.Long r4 = new java.lang.Long     // Catch:{ Exception -> 0x00c0 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00c0 }
            long r2 = r2.A01     // Catch:{ Exception -> 0x00c0 }
            java.lang.Long r1 = new java.lang.Long     // Catch:{ Exception -> 0x00c0 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00c0 }
            X.AWw r0 = new X.AWw     // Catch:{ Exception -> 0x00c0 }
            r0.<init>(r5, r4, r1)     // Catch:{ Exception -> 0x00c0 }
        L_0x00b0:
            r6.A01(r0)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x0036
        L_0x00b4:
            boolean r0 = r2 instanceof X.C175328yX     // Catch:{ Exception -> 0x00c0 }
            if (r0 == 0) goto L_0x00bb
            X.AWx r0 = X.C20742AWx.A00     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00b0
        L_0x00bb:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ Exception -> 0x00c0 }
            throw r0     // Catch:{ Exception -> 0x00c0 }
        L_0x00c0:
            r1 = move-exception
            java.lang.String r0 = "PasskeyExistsCache/syncPasskeyExistenceFromServer/MEX/error"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0036
        L_0x00c8:
            com.whatsapp.passkeys.PasskeyServerApiImpl r3 = r7.A05
            r5.L$0 = r7
            r5.label = r4
            X.0wl r2 = r3.A01
            r1 = 0
            com.whatsapp.passkeys.PasskeyServerApiImpl$passkeyExists$$inlined$suspendWithOutcome$1 r0 = new com.whatsapp.passkeys.PasskeyServerApiImpl$passkeyExists$$inlined$suspendWithOutcome$1
            r0.<init>(r3, r1)
            java.lang.Object r2 = X.C30451dy.A00(r5, r2, r0)
            if (r2 == r6) goto L_0x00f0
            r1 = r7
            goto L_0x0027
        L_0x00df:
            X.Anm r5 = new X.Anm
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x00e6:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00f0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyExistsCache.A00(X.1dr):java.lang.Object");
    }

    public PasskeyExistsCache(C19830z4 r8, C18030ve r9, AnonymousClass1PY r10, PasskeyServerApiImpl passkeyServerApiImpl) {
        Object obj;
        C193139pb r5;
        C18070vi.A0s(r10, r9, passkeyServerApiImpl, r8);
        this.A02 = r10;
        this.A04 = r9;
        this.A05 = passkeyServerApiImpl;
        this.A01 = r8;
        AnonymousClass00H r6 = r8.A00;
        if (C17880vN.A1W(C17880vN.A0B(r6), "reg_passkey_exists")) {
            String A0r = C17880vN.A0r(C17880vN.A0B(r6), "reg_passkey_credential_id");
            if (A0r != null) {
                r5 = new C193139pb(C196759vb.A00(A0r));
            } else {
                r5 = null;
            }
            obj = new C20741AWw(r5, C108965cb.A0l(C17880vN.A0B(r6), "reg_passkey_created_ts", -1), C108965cb.A0l(C17880vN.A0B(r6), "reg_passkey_last_used_ts", -1));
        } else {
            obj = C20742AWx.A00;
        }
        AnonymousClass1G7 A002 = C34071js.A00(obj);
        this.A00 = A002;
        this.A03 = A002;
        AnonymousClass3MX.A1Q(new PasskeyExistsCache$triggerSyncPasskeyExistenceFromServer$1(this, (C30391dr) null), AnonymousClass1OA.A00);
    }
}
