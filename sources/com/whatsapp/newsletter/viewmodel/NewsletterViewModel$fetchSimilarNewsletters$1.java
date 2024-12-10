package com.whatsapp.newsletter.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass1OS;
import X.AnonymousClass3Ma;
import X.AnonymousClass440;
import X.AnonymousClass4WW;
import X.AnonymousClass5Y9;
import X.C133836pa;
import X.C18020vd;
import X.C18040vf;
import X.C20131A8r;
import X.C27621Wu;
import X.C29681ch;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C35681md;
import X.C821543g;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.viewmodel.NewsletterViewModel$fetchSimilarNewsletters$1", f = "NewsletterViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterViewModel$fetchSimilarNewsletters$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass440 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterViewModel$fetchSimilarNewsletters$1(AnonymousClass440 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new NewsletterViewModel$fetchSimilarNewsletters$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterViewModel$fetchSimilarNewsletters$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass440 r0 = this.this$0;
            C35681md r3 = r0.A03;
            C29681ch r4 = r0.A05;
            AnonymousClass4WW r8 = new AnonymousClass4WW(r0);
            int A00 = C18020vd.A00(C18040vf.A02, r3.A0F, 7559);
            AnonymousClass10E r1 = r3.A0A.A00.A00;
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
            new C821543g(AnonymousClass3Ma.A0d(r1), AnonymousClass3Ma.A0l(r1), r4, (AnonymousClass5Y9) r1.A7S.get(), (C133836pa) r1.A7D.get(), (C20131A8r) r1.A7I.get(), r8, AL1, A00).A01();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
