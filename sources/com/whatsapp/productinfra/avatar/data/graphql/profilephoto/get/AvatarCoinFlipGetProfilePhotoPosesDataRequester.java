package com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get;

import X.AnonymousClass00H;
import X.AnonymousClass1IX;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C134886rJ;
import X.C135426sB;
import X.C136226tT;
import X.C1418377d;
import X.C18070vi;
import X.C199610h;
import X.C20125A8k;
import X.C29351c6;
import android.text.TextUtils;
import com.whatsapp.infra.graphql.generated.avatars.LoadAvatarPosesResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;

public final class AvatarCoinFlipGetProfilePhotoPosesDataRequester {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public static final C134886rJ A00(LoadAvatarPosesResponseImpl.FetchWAAvatar fetchWAAvatar, AvatarCoinFlipGetProfilePhotoPosesDataRequester avatarCoinFlipGetProfilePhotoPosesDataRequester) {
        String str;
        String A0F;
        C20125A8k A09;
        Object obj;
        C1418377d A012;
        Object obj2;
        C1418377d A013;
        String str2;
        LoadAvatarPosesResponseImpl.FetchWAAvatar fetchWAAvatar2 = fetchWAAvatar;
        AvatarCoinFlipGetProfilePhotoPosesDataRequester avatarCoinFlipGetProfilePhotoPosesDataRequester2 = avatarCoinFlipGetProfilePhotoPosesDataRequester;
        if (fetchWAAvatar == null) {
            str2 = "missing envelope (fetch__WAAvatar)";
        } else {
            C20125A8k A092 = fetchWAAvatar2.A09(LoadAvatarPosesResponseImpl.FetchWAAvatar.WaStickersV2.class, "wa_stickers_v2");
            if (A092 == null) {
                str2 = "missing key (wa_stickers)";
            } else {
                AnonymousClass1IX A0J = C108955ca.A0J(A092, LoadAvatarPosesResponseImpl.FetchWAAvatar.WaStickersV2.Stickers.class, "stickers");
                ArrayList A0t = C108965cb.A0t(A0J);
                Iterator it = A0J.iterator();
                while (it.hasNext()) {
                    C20125A8k A0V = C108945cZ.A0V(it);
                    String A0F2 = A0V.A0F("url");
                    if (!(A0F2 == null || (A0F = A0V.A0F("stable_id")) == null || (A09 = A0V.A09(LoadAvatarPosesResponseImpl.FetchWAAvatar.WaStickersV2.Stickers.Metadata.class, "metadata")) == null)) {
                        AnonymousClass1IX A0J2 = C108955ca.A0J(A09, LoadAvatarPosesResponseImpl.FetchWAAvatar.WaStickersV2.Stickers.Metadata.ChildAnimationStickers.class, "child_animation_stickers");
                        C18070vi.A0X(A0J2);
                        Iterator it2 = A0J2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (C18070vi.A18(((C20125A8k) obj).A0F("animation_type"), "passive")) {
                                break;
                            }
                        }
                        LoadAvatarPosesResponseImpl.FetchWAAvatar.WaStickersV2.Stickers.Metadata.ChildAnimationStickers childAnimationStickers = (LoadAvatarPosesResponseImpl.FetchWAAvatar.WaStickersV2.Stickers.Metadata.ChildAnimationStickers) obj;
                        if (!(childAnimationStickers == null || (A012 = A01(childAnimationStickers)) == null)) {
                            Iterator it3 = A0J2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it3.next();
                                if (C18070vi.A18(((C20125A8k) obj2).A0F("animation_type"), "active")) {
                                    break;
                                }
                            }
                            LoadAvatarPosesResponseImpl.FetchWAAvatar.WaStickersV2.Stickers.Metadata.ChildAnimationStickers childAnimationStickers2 = (LoadAvatarPosesResponseImpl.FetchWAAvatar.WaStickersV2.Stickers.Metadata.ChildAnimationStickers) obj2;
                            if (!(childAnimationStickers2 == null || (A013 = A01(childAnimationStickers2)) == null)) {
                                AnonymousClass1IX A0C = A0V.A0C("emojis");
                                C199610h.A04(A0C);
                                C18070vi.A0X(A0C);
                                String join = TextUtils.join(" ", A0C);
                                C18070vi.A0X(join);
                                A0t.add(new C136226tT(A012, A013, A0F2, join, A0V.A0F("accessibility_label"), A0F));
                            }
                        }
                    }
                }
                if (A0t.isEmpty()) {
                    str = "Empty profile picture sticker list";
                } else {
                    AnonymousClass1IX A0J3 = C108955ca.A0J(A092, LoadAvatarPosesResponseImpl.FetchWAAvatar.WaStickersV2.Backgrounds.class, "backgrounds");
                    ArrayList A0t2 = C108965cb.A0t(A0J3);
                    Iterator it4 = A0J3.iterator();
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        C20125A8k a8k = (C20125A8k) next;
                        if (!(a8k.A0F("url") == null || a8k.A0F("handle") == null)) {
                            A0t2.add(next);
                        }
                    }
                    ArrayList A0D = C29351c6.A0D(A0t2);
                    Iterator it5 = A0t2.iterator();
                    while (it5.hasNext()) {
                        C20125A8k A0V2 = C108945cZ.A0V(it5);
                        String A0F3 = A0V2.A0F("url");
                        C18070vi.A0b(A0F3);
                        String A0F4 = A0V2.A0F("accessibility_label");
                        String A0F5 = A0V2.A0F("handle");
                        C18070vi.A0b(A0F5);
                        A0D.add(new C135426sB(A0F3, A0F4, A0F5));
                    }
                    if (!A0D.isEmpty()) {
                        return new C134886rJ(A0t, A0D);
                    }
                    str = "Empty profile picture background list";
                }
                C108945cZ.A0p(avatarCoinFlipGetProfilePhotoPosesDataRequester2.A00).A02(6, "empty_profile_pictures_response", str);
                return null;
            }
        }
        C108945cZ.A0p(avatarCoinFlipGetProfilePhotoPosesDataRequester2.A00).A02(6, "malformed_profile_pictures_json_response", str2);
        return null;
    }

    public static final C1418377d A01(LoadAvatarPosesResponseImpl.FetchWAAvatar.WaStickersV2.Stickers.Metadata.ChildAnimationStickers childAnimationStickers) {
        LoadAvatarPosesResponseImpl.FetchWAAvatar.WaStickersV2.Stickers.Metadata.ChildAnimationStickers childAnimationStickers2 = childAnimationStickers;
        if (childAnimationStickers2.A0F("url") == null || childAnimationStickers2.A0F("stable_id") == null) {
            return null;
        }
        String A0F = childAnimationStickers2.A0F("url");
        return new C1418377d((Integer) null, childAnimationStickers2.A0F("file_hash"), (String) null, (String) null, (String) null, childAnimationStickers2.A0F("mimetype"), (String) null, (String) null, childAnimationStickers2.A0F("stable_id"), A0F, (String) null, (String) null, childAnimationStickers2.A0F("accessibility_label"), (String[]) null, 0, 0, 0, false, true, false, false, false, false, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e A[Catch:{ 1Uc -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5 A[Catch:{ 1Uc -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C30391dr r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.AnonymousClass7U8
            if (r0 == 0) goto L_0x0022
            r4 = r9
            X.7U8 r4 = (X.AnonymousClass7U8) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r6 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r6) goto L_0x0028
            java.lang.Object r2 = r4.L$0
            com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester r2 = (com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester) r2
            goto L_0x0089
        L_0x0022:
            X.7U8 r4 = new X.7U8
            r4.<init>(r8, r9)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002d:
            X.C30691eM.A01(r3)
            com.whatsapp.infra.graphql.generated.avatars.calls.XWAAvatarStickersForQueryV2Params r7 = new com.whatsapp.infra.graphql.generated.avatars.calls.XWAAvatarStickersForQueryV2Params
            r7.<init>()
            java.lang.String r1 = "default"
            java.lang.String r0 = "backgrounds"
            r7.A05(r0, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            java.lang.String r1 = "default_pack"
            X.8Kx r0 = r7.A02()
            X.C162478Kx.A01(r0, r2, r1)
            java.lang.String r1 = "V4_PROFILE_PHOTOS_COIN_FLIP"
            java.lang.String r0 = "sticker_pack"
            r7.A05(r0, r1)
            java.lang.String r0 = "EXPRESSO"
            java.util.List r1 = X.C18070vi.A0M(r0)
            java.lang.String r0 = "experiments"
            r7.A06(r0, r1)
            X.A7K r3 = new X.A7K
            r3.<init>()
            java.lang.String r0 = "params"
            r3.A04(r7, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.avatars.LoadAvatarPosesResponseImpl> r2 = com.whatsapp.infra.graphql.generated.avatars.LoadAvatarPosesResponseImpl.class
            java.lang.String r0 = "LoadAvatarPoses"
            X.AIj r1 = new X.AIj
            r1.<init>(r3, r2, r0)
            X.00H r0 = r8.A01     // Catch:{ 1Uc -> 0x00a9 }
            X.A2g r1 = X.C108975cc.A0J(r1, r0)     // Catch:{ 1Uc -> 0x00a9 }
            r1.A01 = r6     // Catch:{ 1Uc -> 0x00a9 }
            X.1lW r0 = X.C35021lW.A03     // Catch:{ 1Uc -> 0x00a9 }
            r1.A02(r0)     // Catch:{ 1Uc -> 0x00a9 }
            r4.L$0 = r8     // Catch:{ 1Uc -> 0x00a9 }
            r4.label = r6     // Catch:{ 1Uc -> 0x00a9 }
            X.B33 r0 = X.B33.A00     // Catch:{ 1Uc -> 0x00a9 }
            java.lang.Object r3 = r1.A01(r4, r0)     // Catch:{ 1Uc -> 0x00a9 }
            if (r3 == r5) goto L_0x00a8
            r2 = r8
            goto L_0x008c
        L_0x0089:
            X.C30691eM.A01(r3)     // Catch:{ 1Uc -> 0x00a9 }
        L_0x008c:
            X.A8k r3 = (X.C20125A8k) r3     // Catch:{ 1Uc -> 0x00a9 }
            java.lang.String r1 = "fetch__WAAvatar"
            java.lang.Class<com.whatsapp.infra.graphql.generated.avatars.LoadAvatarPosesResponseImpl$FetchWAAvatar> r0 = com.whatsapp.infra.graphql.generated.avatars.LoadAvatarPosesResponseImpl.FetchWAAvatar.class
            X.A8k r0 = r3.A09(r0, r1)     // Catch:{ 1Uc -> 0x00a9 }
            com.whatsapp.infra.graphql.generated.avatars.LoadAvatarPosesResponseImpl$FetchWAAvatar r0 = (com.whatsapp.infra.graphql.generated.avatars.LoadAvatarPosesResponseImpl.FetchWAAvatar) r0     // Catch:{ 1Uc -> 0x00a9 }
            X.6rJ r1 = A00(r0, r2)     // Catch:{ 1Uc -> 0x00a9 }
            if (r1 == 0) goto L_0x00a5
            org.json.JSONObject r0 = r3.A00     // Catch:{ 1Uc -> 0x00a9 }
            X.1D6 r5 = X.AnonymousClass1D6.A01(r1, r0)     // Catch:{ 1Uc -> 0x00a9 }
            return r5
        L_0x00a5:
            X.6DJ r0 = X.AnonymousClass6DJ.A00     // Catch:{ 1Uc -> 0x00a9 }
            throw r0     // Catch:{ 1Uc -> 0x00a9 }
        L_0x00a8:
            return r5
        L_0x00a9:
            r0 = move-exception
            X.A6Z r0 = r0.error
            X.9Kw r1 = X.C196829vi.A00(r0)
            X.6DI r0 = new X.6DI
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester.A02(X.1dr):java.lang.Object");
    }

    public AvatarCoinFlipGetProfilePhotoPosesDataRequester(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
