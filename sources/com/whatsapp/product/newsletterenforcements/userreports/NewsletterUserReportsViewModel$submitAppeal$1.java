package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C85054Lx;
import X.C97214p6;
import X.C97304pF;
import X.C97314pG;
import X.C97324pH;
import X.C99714tL;
import com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$submitAppeal$1", f = "NewsletterUserReportsViewModel.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterUserReportsViewModel$submitAppeal$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $reason;
    public final /* synthetic */ String $reportId;
    public int label;
    public final /* synthetic */ NewsletterUserReportsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsViewModel$submitAppeal$1(NewsletterUserReportsViewModel newsletterUserReportsViewModel, String str, String str2, C30391dr r5) {
        super(2, r5);
        this.this$0 = newsletterUserReportsViewModel;
        this.$reportId = str;
        this.$reason = str2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new NewsletterUserReportsViewModel$submitAppeal$1(this.this$0, this.$reportId, this.$reason, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.A02.A0E(C97314pG.A00);
            try {
                String str = this.$reportId;
                String str2 = this.$reason;
                this.label = 1;
                obj = ((NewsletterUserReportsNetworkClient) this.this$0.A03.get()).A00(str, str2, this);
                if (obj == r4) {
                    return r4;
                }
            } catch (C99714tL unused) {
                this.this$0.A02.A0E(C97304pF.A00);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        String str3 = this.$reportId;
        C18070vi.A0d(str3, 0);
        C18070vi.A0d(obj, 1);
        ((C85054Lx) this.this$0.A04.get()).A00.put(str3, obj);
        this.this$0.A02.A0E(C97324pH.A00);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = this.this$0;
        AnonymousClass1DT r2 = newsletterUserReportsViewModel.A00;
        Enumeration elements = ((C85054Lx) newsletterUserReportsViewModel.A04.get()).A00.elements();
        C18070vi.A0X(elements);
        ArrayList list = Collections.list(elements);
        C18070vi.A0X(list);
        r2.A0E(new C97214p6(list));
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterUserReportsViewModel$submitAppeal$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
