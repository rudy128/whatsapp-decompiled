package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4ZN;
import X.AnonymousClass720;
import X.AnonymousClass7C7;
import X.AnonymousClass7G5;
import X.C122636Rd;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C90034dQ;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$showGlassesStatusIndicator$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {452}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$showGlassesStatusIndicator$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass4ZN $buttonText;
    public final /* synthetic */ Bitmap $glassesIconBitmap;
    public final /* synthetic */ Integer $statusIconColorFilter;
    public final /* synthetic */ AnonymousClass4ZN $statusText;
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$showGlassesStatusIndicator$1(Bitmap bitmap, InCallBannerViewModelV2 inCallBannerViewModelV2, AnonymousClass4ZN r4, AnonymousClass4ZN r5, Integer num, C30391dr r7) {
        super(2, r7);
        this.$statusText = r4;
        this.$glassesIconBitmap = bitmap;
        this.$statusIconColorFilter = num;
        this.$buttonText = r5;
        this.this$0 = inCallBannerViewModelV2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        AnonymousClass4ZN r3 = this.$statusText;
        Bitmap bitmap = this.$glassesIconBitmap;
        Integer num = this.$statusIconColorFilter;
        return new InCallBannerViewModelV2$showGlassesStatusIndicator$1(bitmap, this.this$0, r3, this.$buttonText, num, r9);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass720 r3 = new AnonymousClass720(C122636Rd.A06, this.$statusText, (AnonymousClass4ZN) null, 2131102073);
            AnonymousClass7G5 r1 = new AnonymousClass7G5(this.$glassesIconBitmap, this.$statusIconColorFilter);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            r3.A02 = r1;
            r3.A01 = scaleType;
            AnonymousClass4ZN r0 = this.$buttonText;
            if (r0 != null) {
                InCallBannerViewModelV2 inCallBannerViewModelV2 = this.this$0;
                r3.A04 = r0;
                r3.A03(new C90034dQ(inCallBannerViewModelV2, 28));
            }
            ActionFeedbackPriorityQueue A03 = InCallBannerViewModelV2.A03(this.this$0);
            AnonymousClass7C7 A02 = r3.A02();
            this.label = 1;
            if (A03.A02(A02, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InCallBannerViewModelV2$showGlassesStatusIndicator$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
