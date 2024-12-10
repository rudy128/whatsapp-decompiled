package com.whatsapp.biz.catalog.postcode.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4S5;
import X.C19830z4;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel$shouldShowUpdatePostcodeTooltipOrBottomSheet$2", f = "PostcodeViewModel.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
public final class PostcodeViewModel$shouldShowUpdatePostcodeTooltipOrBottomSheet$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $jid;
    public Object L$0;
    public int label;
    public final /* synthetic */ PostcodeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PostcodeViewModel$shouldShowUpdatePostcodeTooltipOrBottomSheet$2(PostcodeViewModel postcodeViewModel, UserJid userJid, C30391dr r4) {
        super(2, r4);
        this.this$0 = postcodeViewModel;
        this.$jid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new PostcodeViewModel$shouldShowUpdatePostcodeTooltipOrBottomSheet$2(this.this$0, this.$jid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C19830z4 r2;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C30691eM.A01(obj);
            PostcodeViewModel postcodeViewModel = this.this$0;
            r2 = postcodeViewModel.A0A;
            AnonymousClass4S5 r1 = postcodeViewModel.A0C;
            UserJid userJid = this.$jid;
            this.L$0 = r2;
            this.label = 1;
            obj = r1.A01(userJid, this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            r2 = (C19830z4) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (r2.A0q(((Jid) obj).getRawString()) != null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PostcodeViewModel$shouldShowUpdatePostcodeTooltipOrBottomSheet$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
