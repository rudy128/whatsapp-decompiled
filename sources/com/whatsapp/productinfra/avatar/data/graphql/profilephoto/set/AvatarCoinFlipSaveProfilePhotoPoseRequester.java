package com.whatsapp.productinfra.avatar.data.graphql.profilephoto.set;

import X.AnonymousClass00H;
import X.C18070vi;

public final class AvatarCoinFlipSaveProfilePhotoPoseRequester {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa A[Catch:{ 1Uc -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c6 A[Catch:{ 1Uc -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, X.C30391dr r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.AnonymousClass7U9
            if (r0 == 0) goto L_0x0022
            r4 = r12
            X.7U9 r4 = (X.AnonymousClass7U9) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r6 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r6) goto L_0x0028
            java.lang.Object r4 = r4.L$0
            com.whatsapp.productinfra.avatar.data.graphql.profilephoto.set.AvatarCoinFlipSaveProfilePhotoPoseRequester r4 = (com.whatsapp.productinfra.avatar.data.graphql.profilephoto.set.AvatarCoinFlipSaveProfilePhotoPoseRequester) r4
            goto L_0x009b
        L_0x0022:
            X.7U9 r4 = new X.7U9
            r4.<init>(r7, r12)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002d:
            X.C30691eM.A01(r2)
            X.9ju r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r1 = "123"
            r3 = 0
            java.lang.String r0 = "actor_id"
            X.8Kx r2 = r2.A00()
            X.C162478Kx.A01(r2, r1, r0)
            java.lang.String r1 = "1234"
            java.lang.String r0 = "client_mutation_id"
            X.C162478Kx.A01(r2, r1, r0)
            X.C18070vi.A0d(r8, r3)
            java.lang.String r0 = "static_pose_id"
            X.C162478Kx.A01(r2, r8, r0)
            X.C18070vi.A0d(r9, r3)
            java.lang.String r0 = "background_handle"
            X.C162478Kx.A01(r2, r9, r0)
            X.C18070vi.A0d(r10, r3)
            java.lang.String r0 = "passive_animation_id"
            X.C162478Kx.A01(r2, r10, r0)
            X.C18070vi.A0d(r11, r3)
            java.lang.String r0 = "active_animation_id"
            X.C162478Kx.A01(r2, r11, r0)
            java.lang.String r1 = "V4_PROFILE_PHOTOS_COIN_FLIP"
            java.lang.String r0 = "template_pack"
            X.C162478Kx.A01(r2, r1, r0)
            X.A7K r3 = new X.A7K
            r3.<init>()
            java.lang.String r0 = "params"
            X.C108975cc.A0z(r2, r3, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.avatars.SaveAvatarPoseResponseImpl> r2 = com.whatsapp.infra.graphql.generated.avatars.SaveAvatarPoseResponseImpl.class
            java.lang.String r0 = "SaveAvatarPose"
            X.AIj r1 = new X.AIj
            r1.<init>(r3, r2, r0)
            X.00H r0 = r7.A01     // Catch:{ 1Uc -> 0x00d7 }
            X.A2g r1 = X.C108975cc.A0J(r1, r0)     // Catch:{ 1Uc -> 0x00d7 }
            r1.A01 = r6     // Catch:{ 1Uc -> 0x00d7 }
            X.1lW r0 = X.C35021lW.A03     // Catch:{ 1Uc -> 0x00d7 }
            r1.A02(r0)     // Catch:{ 1Uc -> 0x00d7 }
            r4.L$0 = r7     // Catch:{ 1Uc -> 0x00d7 }
            r4.label = r6     // Catch:{ 1Uc -> 0x00d7 }
            X.B33 r0 = X.B33.A00     // Catch:{ 1Uc -> 0x00d7 }
            java.lang.Object r2 = r1.A01(r4, r0)     // Catch:{ 1Uc -> 0x00d7 }
            if (r2 != r5) goto L_0x0099
            return r5
        L_0x0099:
            r4 = r7
            goto L_0x009e
        L_0x009b:
            X.C30691eM.A01(r2)     // Catch:{ 1Uc -> 0x00d7 }
        L_0x009e:
            X.A8k r2 = (X.C20125A8k) r2     // Catch:{ 1Uc -> 0x00d7 }
            java.lang.String r1 = "xwa_savePose__WAAvatar"
            java.lang.Class<com.whatsapp.infra.graphql.generated.avatars.SaveAvatarPoseResponseImpl$XwaSavePoseWAAvatar> r0 = com.whatsapp.infra.graphql.generated.avatars.SaveAvatarPoseResponseImpl.XwaSavePoseWAAvatar.class
            X.A8k r1 = r2.A09(r0, r1)     // Catch:{ 1Uc -> 0x00d7 }
            if (r1 == 0) goto L_0x00c6
            java.lang.String r0 = "success"
            boolean r0 = r1.A0G(r0)     // Catch:{ 1Uc -> 0x00d7 }
            if (r0 == 0) goto L_0x00b5
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00b5:
            java.lang.String r3 = "failed_profile_save_selected_pose_response"
            java.lang.String r2 = "success = false"
            X.00H r0 = r4.A00     // Catch:{ 1Uc -> 0x00d7 }
            X.6ue r1 = X.C108945cZ.A0p(r0)     // Catch:{ 1Uc -> 0x00d7 }
            r0 = 6
            r1.A02(r0, r3, r2)     // Catch:{ 1Uc -> 0x00d7 }
            X.6DX r0 = X.AnonymousClass6DX.A00     // Catch:{ 1Uc -> 0x00d7 }
            throw r0     // Catch:{ 1Uc -> 0x00d7 }
        L_0x00c6:
            java.lang.String r3 = "malformed_profile_save_selected_pose_response"
            java.lang.String r2 = "missing key (xwaSavePoseWAAvatar)"
            X.00H r0 = r4.A00     // Catch:{ 1Uc -> 0x00d7 }
            X.6ue r1 = X.C108945cZ.A0p(r0)     // Catch:{ 1Uc -> 0x00d7 }
            r0 = 6
            r1.A02(r0, r3, r2)     // Catch:{ 1Uc -> 0x00d7 }
            X.6DW r0 = X.AnonymousClass6DW.A00     // Catch:{ 1Uc -> 0x00d7 }
            throw r0     // Catch:{ 1Uc -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            X.A6Z r0 = r0.error
            X.9Kw r1 = X.C196829vi.A00(r0)
            X.6DV r0 = new X.6DV
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.graphql.profilephoto.set.AvatarCoinFlipSaveProfilePhotoPoseRequester.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1dr):java.lang.Object");
    }

    public AvatarCoinFlipSaveProfilePhotoPoseRequester(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
