package com.whatsapp.mediacomposer.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass2RM;
import X.AnonymousClass72S;
import X.C108945cZ;
import X.C136906ub;
import X.C139506yx;
import X.C1405471x;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C26431Sc;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel$checkMediaQuality$1", f = "MediaQualityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaQualityViewModel$checkMediaQuality$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $canSendHDVideo;
    public final /* synthetic */ boolean $canSendOriginalImage;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isExplicitlyStatusComposer;
    public final /* synthetic */ Collection $mediaItems;
    public int label;
    public final /* synthetic */ MediaQualityViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaQualityViewModel$checkMediaQuality$1(Context context, MediaQualityViewModel mediaQualityViewModel, Collection collection, C30391dr r5, boolean z, boolean z2, boolean z3) {
        super(2, r5);
        this.$mediaItems = collection;
        this.$canSendOriginalImage = z;
        this.this$0 = mediaQualityViewModel;
        this.$isExplicitlyStatusComposer = z2;
        this.$canSendHDVideo = z3;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        Collection collection = this.$mediaItems;
        boolean z = this.$canSendOriginalImage;
        return new MediaQualityViewModel$checkMediaQuality$1(this.$context, this.this$0, collection, r10, z, this.$isExplicitlyStatusComposer, this.$canSendHDVideo);
    }

    public final Object invokeSuspend(Object obj) {
        Integer num;
        int i;
        if (this.label == 0) {
            C30691eM.A01(obj);
            Collection collection = this.$mediaItems;
            boolean z = this.$canSendOriginalImage;
            MediaQualityViewModel mediaQualityViewModel = this.this$0;
            boolean z2 = this.$isExplicitlyStatusComposer;
            boolean z3 = this.$canSendHDVideo;
            Context context = this.$context;
            ArrayList<AnonymousClass72S> A13 = AnonymousClass000.A13();
            for (Object next : collection) {
                AnonymousClass72S r10 = (AnonymousClass72S) next;
                Integer A0D = r10.A0D();
                if (A0D != null && A0D.intValue() == 1 && z) {
                    C136906ub A0j = C108945cZ.A0j(mediaQualityViewModel.A02);
                    Uri uri = r10.A0X;
                    Rect A05 = r10.A05();
                    if (A05 != null) {
                        try {
                            i = Math.max(A05.width(), A05.height());
                        } catch (AnonymousClass2RM | IOException | Exception | IllegalStateException | SecurityException e) {
                            Log.e("ImageQuality/isOriginalQuality", e);
                        }
                    } else {
                        BitmapFactory.Options A09 = A0j.A03.A09(uri, 0, true, true);
                        i = Math.max(A09.outHeight, A09.outWidth);
                    }
                    C18030ve r11 = A0j.A02;
                    int i2 = 3068;
                    if (z2) {
                        i2 = 6031;
                    }
                    if (i >= C18020vd.A00(C18040vf.A02, r11, i2)) {
                        A13.add(next);
                    }
                }
                Integer A0D2 = r10.A0D();
                if (A0D2 != null && A0D2.intValue() == 3 && z3) {
                    C26431Sc r112 = (C26431Sc) mediaQualityViewModel.A03.get();
                    Uri uri2 = r10.A0X;
                    C1405471x A07 = r10.A07();
                    Point A03 = r10.A03();
                    Integer num2 = null;
                    if (A03 != null) {
                        num = Integer.valueOf(A03.x);
                    } else {
                        num = null;
                    }
                    Point A032 = r10.A03();
                    if (A032 != null) {
                        num2 = Integer.valueOf(A032.y);
                    }
                    if (!((C139506yx) mediaQualityViewModel.A04.get()).A01(r10.A05(), r112.A0D(context, uri2, A07, num, num2, VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH))) {
                    }
                    A13.add(next);
                }
            }
            ArrayList A0D3 = C29351c6.A0D(A13);
            for (AnonymousClass72S r0 : A13) {
                A0D3.add(r0.A0X);
            }
            this.this$0.A00.A0E(C29431cG.A0n(A0D3));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaQualityViewModel$checkMediaQuality$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
