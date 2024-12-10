package com.whatsapp.productinfra.music.api;

import X.AnonymousClass00H;
import X.C18070vi;

public final class MusicRepository {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C30391dr r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.AnonymousClass7UW
            if (r0 == 0) goto L_0x00a0
            r6 = r14
            X.7UW r6 = (X.AnonymousClass7UW) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a0
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r8 = r6.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            java.lang.String r5 = "music_eligible_countries_last_sync_timestamp"
            r12 = 0
            r4 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 != r4) goto L_0x00ad
            java.lang.Object r3 = r6.L$1
            X.0z4 r3 = (X.C19830z4) r3
            java.lang.Object r2 = r6.L$0
            com.whatsapp.productinfra.music.api.MusicRepository r2 = (com.whatsapp.productinfra.music.api.MusicRepository) r2
            X.C30691eM.A01(r8)
        L_0x002b:
            java.util.Set r8 = (java.util.Set) r8
            if (r8 == 0) goto L_0x00a7
            boolean r0 = X.C108945cZ.A1U(r8)
            if (r0 == 0) goto L_0x00a7
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)
            java.lang.String r0 = "pref_music_eligible_countries"
            android.content.SharedPreferences$Editor r0 = r1.putStringSet(r0, r8)
            r0.apply()
            X.00H r0 = r2.A02
            r0.get()
            long r0 = java.lang.System.currentTimeMillis()
            r3.A1q(r5, r0)
            return r8
        L_0x004f:
            X.C30691eM.A01(r8)
            java.lang.String r0 = "MusicRepository/fetchEligibleCountries"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r13.A03
            X.0z4 r3 = X.C17880vN.A0K(r0)
            long r10 = r3.A0W(r5)
            X.00H r0 = r13.A02
            r0.get()
            long r8 = java.lang.System.currentTimeMillis()
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r10 = r10 + r0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r3)
            java.util.HashSet r1 = X.C17880vN.A12()
            java.lang.String r0 = "pref_music_eligible_countries"
            java.util.Set r1 = r2.getStringSet(r0, r1)
            if (r1 == 0) goto L_0x0089
            boolean r0 = X.C108945cZ.A1U(r1)
            if (r0 == 0) goto L_0x0089
            return r1
        L_0x0089:
            X.00H r0 = r13.A01
            java.lang.Object r0 = r0.get()
            com.whatsapp.productinfra.music.api.MusicApi r0 = (com.whatsapp.productinfra.music.api.MusicApi) r0
            r6.L$0 = r13
            r6.L$1 = r3
            r6.label = r4
            java.lang.Object r8 = r0.A04(r6)
            if (r8 != r7) goto L_0x009e
            return r7
        L_0x009e:
            r2 = r13
            goto L_0x002b
        L_0x00a0:
            X.7UW r6 = new X.7UW
            r6.<init>(r13, r14)
            goto L_0x0012
        L_0x00a7:
            java.lang.String r0 = "MusicRepository/fetchEligibleCountries/fetching failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r12
        L_0x00ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.music.api.MusicRepository.A00(X.1dr):java.lang.Object");
    }

    public MusicRepository(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }
}
