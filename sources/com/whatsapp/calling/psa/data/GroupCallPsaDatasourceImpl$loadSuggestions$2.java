package com.whatsapp.calling.psa.data;

import X.AnonymousClass000;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1MZ;
import X.AnonymousClass1OS;
import X.C17880vN;
import X.C18030ve;
import X.C18460wS;
import X.C18600wl;
import X.C27621Wu;
import X.C29391cC;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C63982u1;
import X.C85804Ou;
import X.C98494rF;
import X.C98974s1;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2", f = "GroupCallPsaDatasourceImpl.kt", i = {0}, l = {35}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
public final class GroupCallPsaDatasourceImpl$loadSuggestions$2 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ C85804Ou this$0;

    @DebugMetadata(c = "com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2$1", f = "GroupCallPsaDatasourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r5, A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                ArrayList A0M = C85804Ou.this.A01.A0M();
                C85804Ou r2 = C85804Ou.this;
                Iterator it = A0M.iterator();
                while (it.hasNext()) {
                    AnonymousClass1E7 A0O = C17880vN.A0O(it);
                    AnonymousClass1CJ r5 = r2.A02;
                    C18030ve r8 = r2.A05;
                    AnonymousClass1MZ r6 = r2.A03;
                    if (!C63982u1.A07(r2.A00, r5, r6, A0O, r8, (GroupJid) A0O.A06(GroupJid.class))) {
                        it.remove();
                    }
                }
                if (!A0M.isEmpty()) {
                    C85804Ou r22 = C85804Ou.this;
                    if (A0M.size() > 1) {
                        C29391cC.A0H(A0M, new C98974s1((Object) r22, 4));
                    }
                    A00.element = A0M.subList(0, Math.min(A0M.size(), 20));
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCallPsaDatasourceImpl$loadSuggestions$2(C85804Ou r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new GroupCallPsaDatasourceImpl$loadSuggestions$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GroupCallPsaDatasourceImpl$loadSuggestions$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        final C98494rF A00;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            A00 = C98494rF.A00();
            A00.element = C18460wS.A00;
            final C85804Ou r3 = this.this$0;
            C18600wl r2 = r3.A06;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.L$0 = A00;
            this.label = 1;
            if (C30451dy.A00(this, r2, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            A00 = (C98494rF) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return A00.element;
    }
}
