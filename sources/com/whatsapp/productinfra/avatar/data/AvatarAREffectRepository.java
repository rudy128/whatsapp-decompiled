package com.whatsapp.productinfra.avatar.data;

import X.C1601687k;
import X.C18070vi;
import X.C183829Zt;
import X.C18600wl;

public final class AvatarAREffectRepository {
    public final C1601687k A00;
    public final C18600wl A01;
    public final C183829Zt A02;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository r11, java.lang.String r12, X.C30391dr r13) {
        /*
            boolean r0 = r13 instanceof X.C21625AnG
            if (r0 == 0) goto L_0x001e
            r4 = r13
            X.AnG r4 = (X.C21625AnG) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 != r0) goto L_0x0024
            goto L_0x0045
        L_0x001e:
            X.AnG r4 = new X.AnG
            r4.<init>(r11, r13)
            goto L_0x0012
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0029:
            X.C30691eM.A01(r3)
            X.9Zt r6 = r11.A02     // Catch:{ all -> 0x0050 }
            X.0wl r10 = r11.A01     // Catch:{ all -> 0x0050 }
            X.7CC r7 = new X.7CC     // Catch:{ all -> 0x0050 }
            r7.<init>(r11, r0)     // Catch:{ all -> 0x0050 }
            r4.label = r0     // Catch:{ all -> 0x0050 }
            r9 = 0
            com.whatsapp.areffects.data.ArEffectsRepository$getSingleEffect$2 r5 = new com.whatsapp.areffects.data.ArEffectsRepository$getSingleEffect$2     // Catch:{ all -> 0x0050 }
            r8 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0050 }
            java.lang.Object r3 = X.C30451dy.A00(r4, r10, r5)     // Catch:{ all -> 0x0050 }
            if (r3 != r2) goto L_0x0048
            return r2
        L_0x0045:
            X.C30691eM.A01(r3)     // Catch:{ all -> 0x0050 }
        L_0x0048:
            X.5aj r3 = (X.C107855aj) r3     // Catch:{ all -> 0x0050 }
            X.971 r1 = new X.971     // Catch:{ all -> 0x0050 }
            r1.<init>(r3)     // Catch:{ all -> 0x0050 }
            goto L_0x0055
        L_0x0050:
            r0 = move-exception
            X.1IU r1 = X.C108945cZ.A1J(r0)
        L_0x0055:
            java.lang.Throwable r2 = X.C30671eK.A00(r1)
            if (r2 == 0) goto L_0x006f
            java.lang.String r0 = "AvatarAREffectRepository/fetchAvatarAREffect/Error"
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AvatarAREffectRepository/fetchAvatarAREffect/Error="
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            X.970 r1 = new X.970
            r1.<init>(r0)
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository.A00(com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository, java.lang.String, X.1dr):java.lang.Object");
    }

    public AvatarAREffectRepository(C183829Zt r1, C1601687k r2, C18600wl r3) {
        C18070vi.A0k(r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
