package com.whatsapp.bot.metaai.imagine;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C116935ys;
import X.C134516qi;
import X.C136896ua;
import X.C1417676w;
import X.C18460wS;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C93064iN;
import com.whatsapp.util.Log;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.MetaAiImagineTypeaheadDelegate$fetchNewSuggestions$1", f = "MetaAiImagineTypeaheadDelegate.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
public final class MetaAiImagineTypeaheadDelegate$fetchNewSuggestions$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $requestInFlightVersion;
    public final /* synthetic */ C134516qi $requestParams;
    public final /* synthetic */ C136896ua $searchPerformanceEvent;
    public int label;
    public final /* synthetic */ C93064iN this$0;

    @DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.MetaAiImagineTypeaheadDelegate$fetchNewSuggestions$1$1", f = "MetaAiImagineTypeaheadDelegate.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bot.metaai.imagine.MetaAiImagineTypeaheadDelegate$fetchNewSuggestions$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            return new AnonymousClass1(r5, r6, r8, i2);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass1D6 r0;
            C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                try {
                    C116935ys r2 = C93064iN.this.A01;
                    C134516qi r1 = r5;
                    this.label = 1;
                    obj = r2.A01(r1, this, -1);
                    if (obj == r4) {
                        return r4;
                    }
                } catch (Exception e) {
                    Log.e("MetaAiImagineTypeaheadDelegate/fetchNewSuggestions error while fetching suggestions.", e);
                    r0 = AnonymousClass1D6.A01(C18460wS.A00, AnonymousClass3MW.A0v(3));
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            r0 = AnonymousClass1D6.A01(((C1417676w) ((AnonymousClass1D6) obj).first).A00, AnonymousClass3MW.A0v(0));
            List list = (List) r0.first;
            int A0M = AnonymousClass000.A0M(r0.second);
            r6.A01();
            r6.A04(AnonymousClass000.A0h(), AnonymousClass3MW.A0v(A0M), new Long((long) r5.A01.length()), new Long((long) list.size()));
            r6.A03();
            if (C93064iN.this.A02.A02(i2)) {
                C93064iN r02 = C93064iN.this;
                List A00 = C93064iN.A00(list);
                C93064iN.A01(r02, A00);
                r02.A04.A0E(A00);
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiImagineTypeaheadDelegate$fetchNewSuggestions$1(C93064iN r2, C134516qi r3, C136896ua r4, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = r2;
        this.$requestParams = r3;
        this.$searchPerformanceEvent = r4;
        this.$requestInFlightVersion = i;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new MetaAiImagineTypeaheadDelegate$fetchNewSuggestions$1(this.this$0, this.$requestParams, this.$searchPerformanceEvent, r8, this.$requestInFlightVersion);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C93064iN r4 = this.this$0;
            C18600wl r0 = r4.A06;
            final C134516qi r5 = this.$requestParams;
            final C136896ua r6 = this.$searchPerformanceEvent;
            final int i2 = this.$requestInFlightVersion;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MetaAiImagineTypeaheadDelegate$fetchNewSuggestions$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
