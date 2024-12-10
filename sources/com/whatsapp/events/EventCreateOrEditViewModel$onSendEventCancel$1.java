package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass3VY;
import X.C18070vi;
import X.C193789qf;
import X.C194409rg;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C33251iW;
import X.C445823z;
import X.C83644Gc;
import X.C88194Yr;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditViewModel$onSendEventCancel$1", f = "EventCreateOrEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditViewModel$onSendEventCancel$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C445823z $message;
    public int label;
    public final /* synthetic */ AnonymousClass3VY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditViewModel$onSendEventCancel$1(C445823z r2, AnonymousClass3VY r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$message = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EventCreateOrEditViewModel$onSendEventCancel$1(this.$message, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Double d;
        Double d2;
        String str;
        C193789qf r0;
        C193789qf r02;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3VY r1 = this.this$0;
            C33251iW r10 = r1.A03;
            C445823z r9 = this.$message;
            C88194Yr r30 = r1.A0A;
            AnonymousClass1BI r15 = r1.A0E;
            long A01 = AnonymousClass11P.A01(r1.A06);
            C445823z r03 = this.$message;
            String str2 = r03.A06;
            long j = r03.A00;
            Long l = r03.A03;
            String str3 = r03.A04;
            String str4 = r03.A05;
            boolean z = r03.A07;
            C194409rg r04 = r03.A01;
            String str5 = null;
            if (r04 == null || (r02 = r04.A00) == null) {
                d = null;
            } else {
                d = new Double(r02.A00);
            }
            C194409rg r05 = this.$message.A01;
            if (r05 == null || (r0 = r05.A00) == null) {
                d2 = null;
            } else {
                d2 = new Double(r0.A01);
            }
            C194409rg r12 = this.$message.A01;
            if (r12 != null) {
                str = r12.A02;
                str5 = r12.A01;
            } else {
                str = null;
            }
            C18070vi.A0d(str2, 4);
            String str6 = str5;
            String str7 = str4;
            String str8 = str3;
            Long l2 = l;
            Double d3 = d2;
            Double d4 = d;
            C88194Yr r14 = r30;
            C445823z A00 = C83644Gc.A00(r14, r15, d4, d3, l2, str8, str7, str6, str, str2, j, A01, z, true);
            A00.A0b(536870912);
            C33251iW.A0B(r10, r9, A00);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventCreateOrEditViewModel$onSendEventCancel$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
