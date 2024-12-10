package com.whatsapp.productinfra.avatar.data.profilephoto;

import X.A5O;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OY;
import X.C108945cZ;
import X.C108985cd;
import X.C108995ce;
import X.C1405371w;
import X.C18460wS;
import X.C197009w0;
import X.C22821Di;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.profilephoto.AvatarAssetsFetcher$fetchAssetsInParallel$1", f = "AvatarAssetsFetcher.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarAssetsFetcher$fetchAssetsInParallel$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $assets;
    public final /* synthetic */ boolean $failFast;
    public final /* synthetic */ C22821Di $getUrl;
    public final /* synthetic */ boolean $invalidate;
    public final /* synthetic */ AnonymousClass1OS $transform;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C1405371w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAssetsFetcher$fetchAssetsInParallel$1(C1405371w r2, List list, C30391dr r4, C22821Di r5, AnonymousClass1OS r6, boolean z, boolean z2) {
        super(2, r4);
        this.$invalidate = z;
        this.this$0 = r2;
        this.$assets = list;
        this.$failFast = z2;
        this.$getUrl = r5;
        this.$transform = r6;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        boolean z = this.$invalidate;
        C30391dr r3 = r10;
        AvatarAssetsFetcher$fetchAssetsInParallel$1 avatarAssetsFetcher$fetchAssetsInParallel$1 = new AvatarAssetsFetcher$fetchAssetsInParallel$1(this.this$0, this.$assets, r3, this.$getUrl, this.$transform, z, this.$failFast);
        avatarAssetsFetcher$fetchAssetsInParallel$1.L$0 = obj;
        return avatarAssetsFetcher$fetchAssetsInParallel$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (this.$invalidate) {
                ((A5O) this.this$0.A02.A00.getValue()).A05(true);
            }
            AnonymousClass1OY A0f = C108995ce.A0f(this.this$0.A04.A0A(4));
            List<Object> list = this.$assets;
            boolean z = this.$failFast;
            C1405371w r5 = this.this$0;
            C22821Di r8 = this.$getUrl;
            boolean z2 = this.$invalidate;
            AnonymousClass1OS r9 = this.$transform;
            ArrayList A0D = C29351c6.A0D(list);
            for (Object avatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1 : list) {
                C108985cd.A1P(A0D, new AvatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1(r5, avatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1, (C30391dr) null, r8, r9, A0f, z, z2), A0f);
            }
            try {
                this.label = 1;
                obj = C197009w0.A00(A0D, this);
                if (obj == r3) {
                    return r3;
                }
            } catch (Throwable th) {
                obj2 = C108945cZ.A1J(th);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        obj2 = C29431cG.A0q((List) obj);
        Throwable A00 = C30671eK.A00(obj2);
        if (A00 != null) {
            Log.e("AvatarAssetFetcher/failed to download assets in parallel", A00);
        }
        if (C30671eK.A00(obj2) != null) {
            return C18460wS.A00;
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarAssetsFetcher$fetchAssetsInParallel$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
