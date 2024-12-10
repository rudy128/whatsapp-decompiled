package com.whatsapp.newsletter.ui.directory.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7KD;
import X.C111285jR;
import X.C129166hM;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.ui.directory.viewmodels.NewsletterDirectoryViewModel$updateUi$1", f = "NewsletterDirectoryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterDirectoryViewModel$updateUi$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C129166hM $liveData;
    public final /* synthetic */ List $updatedList;
    public int label;
    public final /* synthetic */ C111285jR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterDirectoryViewModel$updateUi$1(C129166hM r2, C111285jR r3, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$updatedList = list;
        this.$liveData = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new NewsletterDirectoryViewModel$updateUi$1(this.$liveData, this.this$0, this.$updatedList, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ((AnonymousClass7KD) this.this$0.A0I.get()).CDZ(this.$updatedList, this.$liveData.A02);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterDirectoryViewModel$updateUi$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
