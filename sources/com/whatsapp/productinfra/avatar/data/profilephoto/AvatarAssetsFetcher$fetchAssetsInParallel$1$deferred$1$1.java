package com.whatsapp.productinfra.avatar.data.profilephoto;

import X.AnonymousClass000;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.C108945cZ;
import X.C1405371w;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.profilephoto.AvatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1", f = "AvatarAssetsFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Object $asset;
    public final /* synthetic */ boolean $failFast;
    public final /* synthetic */ C22821Di $getUrl;
    public final /* synthetic */ boolean $invalidate;
    public final /* synthetic */ AnonymousClass1OX $scope;
    public final /* synthetic */ AnonymousClass1OS $transform;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C1405371w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1(C1405371w r2, Object obj, C30391dr r4, C22821Di r5, AnonymousClass1OS r6, AnonymousClass1OX r7, boolean z, boolean z2) {
        super(2, r4);
        this.$failFast = z;
        this.$scope = r7;
        this.this$0 = r2;
        this.$getUrl = r5;
        this.$asset = obj;
        this.$invalidate = z2;
        this.$transform = r6;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        boolean z = this.$failFast;
        AnonymousClass1OX r6 = this.$scope;
        C1405371w r1 = this.this$0;
        C22821Di r4 = this.$getUrl;
        C30391dr r3 = r11;
        AvatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1 avatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1 = new AvatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1(r1, this.$asset, r3, r4, this.$transform, r6, z, this.$invalidate);
        avatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1.L$0 = obj;
        return avatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1405371w r5 = this.this$0;
            C22821Di r0 = this.$getUrl;
            Object obj3 = this.$asset;
            boolean z = this.$invalidate;
            AnonymousClass1OS r1 = this.$transform;
            try {
                Bitmap A00 = C1405371w.A00(r5, (String) r0.invoke(obj3), z);
                if (A00 != null) {
                    obj2 = r1.invoke(A00, obj3);
                } else {
                    obj2 = null;
                }
            } catch (Throwable th) {
                obj2 = C108945cZ.A1J(th);
            }
            Throwable A002 = C30671eK.A00(obj2);
            if (A002 != null) {
                Log.e("AvatarAssetFetcher/fetchAssetsInParallel", A002);
            }
            if (obj2 instanceof AnonymousClass1IU) {
                obj2 = null;
            }
            if (obj2 != null || !this.$failFast) {
                return obj2;
            }
            AnonymousClass1OW.A04(new CancellationException("Fail fast enabled and bitmap download failed"), this.$scope);
            return null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarAssetsFetcher$fetchAssetsInParallel$1$deferred$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
