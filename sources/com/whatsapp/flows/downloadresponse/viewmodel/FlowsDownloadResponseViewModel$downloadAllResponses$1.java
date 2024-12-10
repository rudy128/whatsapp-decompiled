package com.whatsapp.flows.downloadresponse.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41731wy;
import X.C57922jr;
import X.C59072li;
import X.C81843zu;
import X.C81853zv;
import X.C81863zw;
import android.util.Pair;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.downloadresponse.viewmodel.FlowsDownloadResponseViewModel$downloadAllResponses$1", f = "FlowsDownloadResponseViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsDownloadResponseViewModel$downloadAllResponses$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $downloadAllResponses;
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ long $messageRowId;
    public int label;
    public final /* synthetic */ FlowsDownloadResponseViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsDownloadResponseViewModel$downloadAllResponses$1(FlowsDownloadResponseViewModel flowsDownloadResponseViewModel, String str, C30391dr r4, long j, boolean z) {
        super(2, r4);
        this.this$0 = flowsDownloadResponseViewModel;
        this.$flowId = str;
        this.$downloadAllResponses = z;
        this.$messageRowId = j;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new FlowsDownloadResponseViewModel$downloadAllResponses$1(this.this$0, this.$flowId, r9, this.$messageRowId, this.$downloadAllResponses);
    }

    public final Object invokeSuspend(Object obj) {
        Long l;
        C41731wy r1;
        Object obj2;
        Object obj3;
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A02.A0E(C81863zw.A00);
            C57922jr r4 = this.this$0.A01;
            String str = this.$flowId;
            if (this.$downloadAllResponses) {
                l = null;
            } else {
                l = new Long(this.$messageRowId);
            }
            Pair A00 = r4.A00(l, str);
            Object obj4 = A00.first;
            C18070vi.A0W(obj4);
            if (!AnonymousClass000.A1Y(obj4) || (obj3 = A00.second) == null) {
                r1 = this.this$0.A02;
                obj2 = C81853zv.A00;
            } else {
                r1 = this.this$0.A02;
                obj2 = new C81843zu((C59072li) obj3);
            }
            r1.A0E(obj2);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsDownloadResponseViewModel$downloadAllResponses$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
