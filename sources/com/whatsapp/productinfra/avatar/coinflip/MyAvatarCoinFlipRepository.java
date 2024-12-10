package com.whatsapp.productinfra.avatar.coinflip;

import X.AnonymousClass00H;
import X.AnonymousClass718;
import X.AnonymousClass73M;
import X.AnonymousClass84I;
import X.C108945cZ;
import X.C108975cc;
import X.C133306oX;
import X.C135856ss;
import X.C1405371w;
import X.C1583880m;
import X.C17880vN;
import X.C18070vi;
import X.C18600wl;
import X.C20125A8k;
import X.C201811d;
import X.C29431cG;
import X.C30391dr;
import X.C30451dy;
import X.C64062u9;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.infra.graphql.generated.avatars.SelectedOrDefaultPoseQueryResponseImpl;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

public final class MyAvatarCoinFlipRepository {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02 = C201811d.A00(32837);
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final C18600wl A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    private final Bitmap A00(String str) {
        return (Bitmap) C29431cG.A0c(((C1405371w) C18070vi.A0E(this.A07)).A02(C18070vi.A0M(str), new C1583880m(str), AnonymousClass84I.A00, false, false));
    }

    public final Bitmap A01() {
        Bitmap decodeFile;
        String A072;
        Bitmap bitmap = (Bitmap) C108975cc.A0E(this.A04).A0A("my_avatar_pic");
        if (bitmap != null) {
            return bitmap;
        }
        AnonymousClass00H r2 = this.A00;
        File A012 = AnonymousClass73M.A01(AnonymousClass73M.A00(r2), "my_avatar_pic.jpg");
        if (A012 == null) {
            decodeFile = null;
        } else {
            decodeFile = BitmapFactory.decodeFile(A012.getAbsolutePath());
        }
        if (decodeFile != null) {
            return decodeFile;
        }
        File A013 = AnonymousClass73M.A01(AnonymousClass73M.A00(r2), "my_avatar_pose_payload.json");
        JSONObject jSONObject = null;
        if (!(A013 == null || (A072 = C64062u9.A07(A013)) == null)) {
            jSONObject = C17880vN.A16(A072);
        }
        if (jSONObject != null) {
            AnonymousClass718 r7 = (AnonymousClass718) this.A08.get();
            Class<SelectedOrDefaultPoseQueryResponseImpl.FetchWAAvatar> cls = SelectedOrDefaultPoseQueryResponseImpl.FetchWAAvatar.class;
            JSONObject optJSONObject = jSONObject.optJSONObject("fetch__WAAvatar");
            C20125A8k a8k = null;
            if (optJSONObject != null) {
                try {
                    a8k = cls.getConstructor(new Class[]{JSONObject.class}).newInstance(new Object[]{optJSONObject});
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            C135856ss A002 = AnonymousClass718.A00((SelectedOrDefaultPoseQueryResponseImpl.FetchWAAvatar) a8k, r7);
            if (A002 != null) {
                Bitmap A003 = A00(A002.A01.A00);
                Bitmap A004 = A00(A002.A00.A00);
                if (!(A003 == null || A004 == null)) {
                    Bitmap A005 = ((C133306oX) this.A02.get()).A00(A003, A004);
                    A05(A005);
                    return A005;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.1g4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.1g4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.1g4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C30391dr r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.AnonymousClass7US
            if (r0 == 0) goto L_0x0026
            r4 = r8
            X.7US r4 = (X.AnonymousClass7US) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x002c
            java.lang.Object r6 = r4.L$1
            com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository r6 = (com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository) r6
            java.lang.Object r4 = r4.L$0
            com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository r4 = (com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository) r4
            goto L_0x0058
        L_0x0026:
            X.7US r4 = new X.7US
            r4.<init>(r7, r8)
            goto L_0x0012
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0031:
            X.C30691eM.A01(r2)
            r0 = 27
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x00b2 }
            X.00H r0 = r7.A08     // Catch:{ all -> 0x00b2 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x00b2 }
            X.718 r3 = (X.AnonymousClass718) r3     // Catch:{ all -> 0x00b2 }
            r4.L$0 = r7     // Catch:{ all -> 0x00b2 }
            r4.L$1 = r7     // Catch:{ all -> 0x00b2 }
            r4.label = r1     // Catch:{ all -> 0x00b2 }
            X.0wl r2 = r3.A01     // Catch:{ all -> 0x00b2 }
            r1 = 0
            com.whatsapp.productinfra.avatar.data.graphql.profilephoto.pose.AvatarCoinFlipGetPoseDataRequester$fetchSelectedPoseFromGraphQL$2 r0 = new com.whatsapp.productinfra.avatar.data.graphql.profilephoto.pose.AvatarCoinFlipGetPoseDataRequester$fetchSelectedPoseFromGraphQL$2     // Catch:{ all -> 0x00b2 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x00b2 }
            java.lang.Object r2 = X.C30451dy.A00(r4, r2, r0)     // Catch:{ all -> 0x00b2 }
            if (r2 == r5) goto L_0x00cf
            r4 = r7
            r6 = r7
            goto L_0x005b
        L_0x0058:
            X.C30691eM.A01(r2)     // Catch:{ all -> 0x00b0 }
        L_0x005b:
            X.1D6 r2 = (X.AnonymousClass1D6) r2     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = r2.first     // Catch:{ all -> 0x00b0 }
            X.6ss r1 = (X.C135856ss) r1     // Catch:{ all -> 0x00b0 }
            java.lang.Object r5 = r2.second     // Catch:{ all -> 0x00b0 }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ all -> 0x00b0 }
            X.6sC r0 = r1.A01     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x00b0 }
            android.graphics.Bitmap r2 = r6.A00(r0)     // Catch:{ all -> 0x00b0 }
            X.6sC r0 = r1.A00     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x00b0 }
            android.graphics.Bitmap r1 = r6.A00(r0)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00ad
            if (r1 == 0) goto L_0x00ad
            X.00H r0 = r6.A02     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00b0 }
            X.6oX r0 = (X.C133306oX) r0     // Catch:{ all -> 0x00b0 }
            android.graphics.Bitmap r3 = r0.A00(r2, r1)     // Catch:{ all -> 0x00b0 }
            r6.A05(r3)     // Catch:{ all -> 0x00b0 }
            X.00H r0 = r6.A00     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x00b0 }
            X.73M r1 = (X.AnonymousClass73M) r1     // Catch:{ all -> 0x00b0 }
            r0 = 0
            X.C18070vi.A0d(r5, r0)     // Catch:{ all -> 0x00b0 }
            X.118 r0 = r1.A00     // Catch:{ all -> 0x00b0 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x00b0 }
            java.io.File r2 = r0.getFilesDir()     // Catch:{ all -> 0x00b0 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = X.C18070vi.A0H(r5)     // Catch:{ all -> 0x00b0 }
            byte[] r1 = X.C108975cc.A1O(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "my_avatar_pose_payload.json"
            X.AnonymousClass73M.A02(r2, r0, r1)     // Catch:{ all -> 0x00b0 }
            return r3
        L_0x00ad:
            X.6DU r0 = X.AnonymousClass6DU.A00     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            goto L_0x00b4
        L_0x00b2:
            r0 = move-exception
            r4 = r7
        L_0x00b4:
            X.1IU r5 = X.C108945cZ.A1J(r0)
            java.lang.Throwable r0 = r5.exception
            if (r0 == 0) goto L_0x00cc
            java.lang.String r3 = "unable to fetch own poses from network"
            java.lang.String r2 = r0.getMessage()
            X.00H r0 = r4.A01
            X.6ue r1 = X.C108945cZ.A0p(r0)
            r0 = 7
            r1.A02(r0, r3, r2)
        L_0x00cc:
            X.C30691eM.A01(r5)
        L_0x00cf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository.A02(X.1dr):java.lang.Object");
    }

    public final Object A03(C30391dr r4, boolean z) {
        return C30451dy.A00(r4, this.A06, new MyAvatarCoinFlipRepository$getAvatarPose$2(this, (C30391dr) null, z));
    }

    public final void A04() {
        Context context = ((AnonymousClass73M) this.A00.get()).A00.A00;
        File filesDir = context.getFilesDir();
        C18070vi.A0X(filesDir);
        AnonymousClass73M.A03("my_avatar_pic.jpg", filesDir);
        File filesDir2 = context.getFilesDir();
        C18070vi.A0X(filesDir2);
        AnonymousClass73M.A03("profile_poses_payload.json", filesDir2);
        File filesDir3 = context.getFilesDir();
        C18070vi.A0X(filesDir3);
        AnonymousClass73M.A03("my_avatar_pose_payload.json", filesDir3);
        ((C1405371w) this.A07.get()).A03();
        C108975cc.A0E(this.A04).A0E("my_avatar_pic");
    }

    public final void A05(Bitmap bitmap) {
        AnonymousClass73M.A02(AnonymousClass73M.A00(this.A00), "my_avatar_pic.jpg", ((C133306oX) this.A02.get()).A01(bitmap));
        C108975cc.A0E(this.A04).A0F("my_avatar_pic", bitmap);
    }

    public final boolean A06() {
        return C108945cZ.A0o(this.A03).A01();
    }

    public MyAvatarCoinFlipRepository(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, C18600wl r9) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0q(r7, r8, r9);
        this.A04 = r2;
        this.A01 = r3;
        this.A07 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A08 = r7;
        this.A00 = r8;
        this.A06 = r9;
    }
}
