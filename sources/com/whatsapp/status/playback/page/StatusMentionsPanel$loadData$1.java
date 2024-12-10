package com.whatsapp.status.playback.page;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1IT;
import X.AnonymousClass1OS;
import X.AnonymousClass6f2;
import X.C111985kk;
import X.C130866k8;
import X.C17880vN;
import X.C23761Hn;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.page.StatusMentionsPanel$loadData$1", f = "StatusMentionsPanel.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class StatusMentionsPanel$loadData$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ View $container;
    public final /* synthetic */ Set $mentionsList;
    public int label;
    public final /* synthetic */ C130866k8 this$0;

    @DebugMetadata(c = "com.whatsapp.status.playback.page.StatusMentionsPanel$loadData$1$1", f = "StatusMentionsPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.status.playback.page.StatusMentionsPanel$loadData$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(view, r3, A0D, r6);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C111985kk r1 = r3.A06;
                r1.A00 = A0D;
                r1.notifyDataSetChanged();
                r3.A01.setVisibility(8);
                view.requestLayout();
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusMentionsPanel$loadData$1(View view, C130866k8 r3, Set set, C30391dr r5) {
        super(2, r5);
        this.$mentionsList = set;
        this.this$0 = r3;
        this.$container = view;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        Set set = this.$mentionsList;
        return new StatusMentionsPanel$loadData$1(this.$container, this.this$0, set, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Set set = this.$mentionsList;
            C130866k8 r4 = this.this$0;
            final ArrayList A0D = C29351c6.A0D(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass1E7 A0H = r4.A04.A0H(C17880vN.A0Q(it));
                String A0N = r4.A05.A0N(A0H);
                if (A0N == null) {
                    A0N = "";
                }
                A0D.add(new AnonymousClass6f2(A0H, A0N));
            }
            AnonymousClass1IT A00 = C23761Hn.A00();
            final C130866k8 r3 = this.this$0;
            final View view = this.$container;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, A00, r0) == r6) {
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
        return ((StatusMentionsPanel$loadData$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
