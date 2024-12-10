package com.whatsapp.newsletter.ui.reactions;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass5WL;
import X.C108995ce;
import X.C111205iq;
import X.C112305lG;
import X.C147267Sm;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.widget.ProgressBar;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet$TabsPagerAdapter$onBindViewHolder$4$1", f = "NewsletterReactionsSheet.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterReactionsSheet$TabsPagerAdapter$onBindViewHolder$4$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ ProgressBar $loaderView;
    public final /* synthetic */ C111205iq $this_apply;
    public int label;
    public final /* synthetic */ NewsletterReactionsSheet this$0;
    public final /* synthetic */ C112305lG this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterReactionsSheet$TabsPagerAdapter$onBindViewHolder$4$1(ProgressBar progressBar, C112305lG r3, NewsletterReactionsSheet newsletterReactionsSheet, C111205iq r5, C30391dr r6) {
        super(2, r6);
        this.$this_apply = r5;
        this.this$0 = newsletterReactionsSheet;
        this.this$1 = r3;
        this.$loaderView = progressBar;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C111205iq r4 = this.$this_apply;
        NewsletterReactionsSheet newsletterReactionsSheet = this.this$0;
        return new NewsletterReactionsSheet$TabsPagerAdapter$onBindViewHolder$4$1(this.$loaderView, this.this$1, newsletterReactionsSheet, r4, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass5WL A0e = C108995ce.A0e(this.this$0, this.$this_apply.A0A);
            C147267Sm r0 = new C147267Sm(this.$loaderView, this.this$1, 12);
            this.label = 1;
            if (A0e.BFC(this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterReactionsSheet$TabsPagerAdapter$onBindViewHolder$4$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
