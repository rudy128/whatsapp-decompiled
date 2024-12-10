package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass00H;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass4GT;
import X.AnonymousClass6DK;
import X.AnonymousClass84J;
import X.AnonymousClass84K;
import X.AnonymousClass84R;
import X.C108945cZ;
import X.C134886rJ;
import X.C134896rK;
import X.C1405371w;
import X.C1592283s;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18600wl;
import X.C22821Di;
import X.C30391dr;
import com.whatsapp.productinfra.avatar.data.profilephoto.AvatarAssetsFetcher$fetchAssetsInParallel$1;
import java.util.List;

public final class AvatarCoinFlipProfilePhotoPosesRepository {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;
    public final C18600wl A05;

    public static final C134896rK A00(AvatarCoinFlipProfilePhotoPosesRepository avatarCoinFlipProfilePhotoPosesRepository, C134886rJ r11, int i, boolean z, boolean z2) {
        AvatarCoinFlipProfilePhotoPosesRepository avatarCoinFlipProfilePhotoPosesRepository2 = avatarCoinFlipProfilePhotoPosesRepository;
        List A022 = avatarCoinFlipProfilePhotoPosesRepository2.A02(r11.A01, C1592283s.A00, AnonymousClass84K.A00, z, z2);
        List A023 = avatarCoinFlipProfilePhotoPosesRepository.A02(r11.A00, AnonymousClass84R.A00, AnonymousClass84J.A00, z, z2);
        C108945cZ.A0q(avatarCoinFlipProfilePhotoPosesRepository2.A04).A03(i, "poses_downloaded");
        if (!A022.isEmpty() && !A023.isEmpty()) {
            return new C134896rK(A022, A023);
        }
        throw AnonymousClass6DK.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository r7, X.C30391dr r8, int r9) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass7UT
            if (r0 == 0) goto L_0x0085
            r3 = r8
            X.7UT r3 = (X.AnonymousClass7UT) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0085
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r1 = r3.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r4 = 1
            if (r0 == 0) goto L_0x0062
            if (r0 != r4) goto L_0x008b
            int r9 = r3.I$0
            java.lang.Object r7 = r3.L$0
            com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository r7 = (com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository) r7
            X.C30691eM.A01(r1)
        L_0x0026:
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            java.lang.Object r5 = r1.first
            X.6rJ r5 = (X.C134886rJ) r5
            java.lang.Object r6 = r1.second
            X.00H r0 = r7.A04
            X.70I r1 = X.C108945cZ.A0q(r0)
            java.lang.String r0 = "received_pose_entity"
            r1.A03(r9, r0)
            X.00H r0 = r7.A01
            java.lang.Object r0 = r0.get()
            X.73M r0 = (X.AnonymousClass73M) r0
            r3 = 0
            X.C18070vi.A0d(r6, r3)
            X.118 r0 = r0.A00
            android.content.Context r0 = r0.A00
            java.io.File r2 = r0.getFilesDir()
            X.C18070vi.A0X(r2)
            java.lang.String r0 = X.C18070vi.A0H(r6)
            byte[] r1 = X.C108975cc.A1O(r0)
            java.lang.String r0 = "profile_poses_payload.json"
            X.AnonymousClass73M.A02(r2, r0, r1)
            X.6rK r0 = A00(r7, r5, r9, r4, r3)
            return r0
        L_0x0062:
            X.C30691eM.A01(r1)
            X.00H r0 = r7.A04
            X.70I r1 = X.C108945cZ.A0q(r0)
            java.lang.String r0 = "graphql_request_posted"
            r1.A03(r9, r0)
            X.00H r0 = r7.A02
            java.lang.Object r0 = r0.get()
            com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester r0 = (com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester) r0
            r3.L$0 = r7
            r3.I$0 = r9
            r3.label = r4
            java.lang.Object r1 = r0.A02(r3)
            if (r1 != r2) goto L_0x0026
            return r2
        L_0x0085:
            X.7UT r3 = new X.7UT
            r3.<init>(r7, r8)
            goto L_0x0012
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository.A01(com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository, X.1dr, int):java.lang.Object");
    }

    private final List A02(List list, C22821Di r12, AnonymousClass1OS r13, boolean z, boolean z2) {
        C1405371w r3 = (C1405371w) this.A00.get();
        List list2 = list;
        C22821Di r6 = r12;
        AnonymousClass1OS r7 = r13;
        boolean z3 = z;
        boolean z4 = z2;
        if (!C18020vd.A05(C18040vf.A02, this.A03, 3237)) {
            return r3.A02(list, r12, r13, z, z2);
        }
        return (List) AnonymousClass4GT.A00(AnonymousClass1OR.A00, new AvatarAssetsFetcher$fetchAssetsInParallel$1(r3, list2, (C30391dr) null, r6, r7, z3, z4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C30391dr r8, int r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.AnonymousClass7UU
            if (r0 == 0) goto L_0x0055
            r6 = r8
            X.7UU r6 = (X.AnonymousClass7UU) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r5 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L_0x003b
            if (r0 != r3) goto L_0x005b
            int r9 = r6.I$0
            java.lang.Object r0 = r6.L$0
            com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository r0 = (com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository) r0
            X.C30691eM.A01(r5)
        L_0x0026:
            r3 = r5
            X.6rK r3 = (X.C134896rK) r3
            X.00H r0 = r0.A04
            X.70I r2 = X.C108945cZ.A0q(r0)
            X.6EF r1 = X.AnonymousClass6EF.A00
            java.util.List r0 = r3.A01
            int r0 = r0.size()
            r2.A04(r1, r9, r0)
            return r5
        L_0x003b:
            X.C30691eM.A01(r5)
            X.0wl r2 = r7.A05
            r1 = 0
            com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository$fetchProfilePhotoPoses$2 r0 = new com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository$fetchProfilePhotoPoses$2
            r0.<init>(r7, r1, r9, r10)
            r6.L$0 = r7
            r6.I$0 = r9
            r6.label = r3
            java.lang.Object r5 = X.C30451dy.A00(r6, r2, r0)
            if (r5 != r4) goto L_0x0053
            return r4
        L_0x0053:
            r0 = r7
            goto L_0x0026
        L_0x0055:
            X.7UU r6 = new X.7UU
            r6.<init>(r7, r8)
            goto L_0x0012
        L_0x005b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository.A03(X.1dr, int, boolean):java.lang.Object");
    }

    public AvatarCoinFlipProfilePhotoPosesRepository(C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, C18600wl r7) {
        C18070vi.A0w(r2, r7, r3, r4, r5);
        C18070vi.A0d(r6, 6);
        this.A03 = r2;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = r4;
        this.A00 = r5;
        this.A02 = r6;
    }
}
