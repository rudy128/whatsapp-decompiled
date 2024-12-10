package com.whatsapp.spamreport;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass3MX;
import X.AnonymousClass6G6;
import X.BMV;
import X.C108985cd;
import X.C123186Tl;
import X.C27621Wu;
import X.C29191bl;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C61562pt;
import X.C72453Mb;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$observeState$1$1", f = "ReportSpamDialogFragment.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$observeState$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C123186Tl $it;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$observeState$1$1(ReportSpamDialogFragment reportSpamDialogFragment, C123186Tl r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = reportSpamDialogFragment;
        this.$it = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ReportSpamDialogFragment$observeState$1$1(this.this$0, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        ViewGroup viewGroup;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
            AnonymousClass1E7 r0 = ((AnonymousClass6G6) this.$it).A00;
            this.label = 1;
            obj = ReportSpamDialogFragment.A00(r0, reportSpamDialogFragment, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        boolean A1Y = AnonymousClass000.A1Y(obj);
        ReportSpamDialogFragment reportSpamDialogFragment2 = this.this$0;
        BMV bmv = new BMV();
        WeakReference weakReference = reportSpamDialogFragment2.A0P;
        if (!(weakReference == null || (viewGroup = (ViewGroup) weakReference.get()) == null)) {
            C29191bl.A02(viewGroup, bmv);
        }
        ReportSpamDialogFragment.A03(this.this$0, false);
        ReportSpamDialogFragment reportSpamDialogFragment3 = this.this$0;
        AnonymousClass6G6 r02 = (AnonymousClass6G6) this.$it;
        AnonymousClass1E7 r1 = r02.A00;
        AnonymousClass1E7 r2 = r02.A02;
        AnonymousClass206 r4 = r02.A03;
        ReportSpamDialogFragment.A01(r1, r2, r02.A01, r4, reportSpamDialogFragment3, r02.A06, r02.A05, r02.A04, r02.A07, A1Y);
        C61562pt A0U = C108985cd.A0U(this.this$0);
        String A0n = C108985cd.A0n(this.this$0);
        AnonymousClass1BI A0m = AnonymousClass3MX.A0m(this.this$0.A0S);
        C61562pt.A00(A0U, A0m, A0n, C72453Mb.A1Z(A0m) ? 1 : 0);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogFragment$observeState$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
