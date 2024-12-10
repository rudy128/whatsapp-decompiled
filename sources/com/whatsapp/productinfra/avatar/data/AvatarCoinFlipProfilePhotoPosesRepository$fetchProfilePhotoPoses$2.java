package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository$fetchProfilePhotoPoses$2", f = "AvatarCoinFlipProfilePhotoPosesRepository.kt", i = {}, l = {47, 49}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarCoinFlipProfilePhotoPosesRepository$fetchProfilePhotoPoses$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $invalidate;
    public final /* synthetic */ int $qplInstanceKey;
    public int label;
    public final /* synthetic */ AvatarCoinFlipProfilePhotoPosesRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarCoinFlipProfilePhotoPosesRepository$fetchProfilePhotoPoses$2(AvatarCoinFlipProfilePhotoPosesRepository avatarCoinFlipProfilePhotoPosesRepository, C30391dr r3, int i, boolean z) {
        super(2, r3);
        this.$invalidate = z;
        this.this$0 = avatarCoinFlipProfilePhotoPosesRepository;
        this.$qplInstanceKey = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AvatarCoinFlipProfilePhotoPosesRepository$fetchProfilePhotoPoses$2(this.this$0, r6, this.$qplInstanceKey, this.$invalidate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r1 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 == r6) goto L_0x0078
            if (r0 == r1) goto L_0x0078
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0011:
            X.C30691eM.A01(r12)
            boolean r0 = r11.$invalidate
            com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository r8 = r11.this$0
            int r5 = r11.$qplInstanceKey
            if (r0 == 0) goto L_0x0025
            r11.label = r6
        L_0x001e:
            java.lang.Object r12 = com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository.A01(r8, r11, r5)
        L_0x0022:
            if (r12 != r7) goto L_0x007b
            return r7
        L_0x0025:
            r11.label = r1
            X.00H r0 = r8.A01
            java.io.File r1 = X.AnonymousClass73M.A00(r0)
            java.lang.String r0 = "profile_poses_payload.json"
            java.io.File r0 = X.AnonymousClass73M.A01(r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = X.C64062u9.A07(r0)
            if (r0 == 0) goto L_0x0040
            org.json.JSONObject r1 = X.C17880vN.A16(r0)
        L_0x0040:
            if (r1 == 0) goto L_0x001e
            X.00H r0 = r8.A02
            java.lang.Object r10 = r0.get()
            com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester r10 = (com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester) r10
            r9 = 0
            java.lang.String r0 = "fetch__WAAvatar"
            java.lang.Class<com.whatsapp.infra.graphql.generated.avatars.LoadAvatarPosesResponseImpl$FetchWAAvatar> r4 = com.whatsapp.infra.graphql.generated.avatars.LoadAvatarPosesResponseImpl.FetchWAAvatar.class
            org.json.JSONObject r3 = r1.optJSONObject(r0)
            r2 = 0
            if (r3 == 0) goto L_0x006b
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006b }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r1[r9] = r0     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006b }
            java.lang.reflect.Constructor r1 = r4.getConstructor(r1)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006b }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006b }
            r0[r9] = r3     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006b }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006b }
            X.A8k r0 = (X.C20125A8k) r0     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006b }
            r2 = r0
        L_0x006b:
            com.whatsapp.infra.graphql.generated.avatars.LoadAvatarPosesResponseImpl$FetchWAAvatar r2 = (com.whatsapp.infra.graphql.generated.avatars.LoadAvatarPosesResponseImpl.FetchWAAvatar) r2
            X.6rJ r0 = com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester.A00(r2, r10)
            if (r0 == 0) goto L_0x001e
            X.6rK r12 = com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository.A00(r8, r0, r5, r9, r6)
            goto L_0x0022
        L_0x0078:
            X.C30691eM.A01(r12)
        L_0x007b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository$fetchProfilePhotoPoses$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarCoinFlipProfilePhotoPosesRepository$fetchProfilePhotoPoses$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
