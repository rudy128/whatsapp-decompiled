package com.whatsapp.community;

import X.A2B;
import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C37451pZ;
import X.C42011xT;
import X.C74293Zg;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.ManageSubgroupsViewHolder$setSubgroup$1", f = "ManageSubgroupsViewHolder.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
public final class ManageSubgroupsViewHolder$setSubgroup$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C37451pZ $contactPhotoLoader;
    public final /* synthetic */ A2B $subgroup;
    public int label;
    public final /* synthetic */ C74293Zg this$0;

    @DebugMetadata(c = "com.whatsapp.community.ManageSubgroupsViewHolder$setSubgroup$1$1", f = "ManageSubgroupsViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.community.ManageSubgroupsViewHolder$setSubgroup$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            C74293Zg r1 = C74293Zg.this;
            AnonymousClass1E7 r4 = A0H;
            return new AnonymousClass1(r6, a2b, r4, r8);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C74293Zg r3 = C74293Zg.this;
                AnonymousClass1E7 r2 = A0H;
                C74293Zg.A00(r3, r6, a2b, r2);
                C74293Zg.A01(C74293Zg.this, A0H);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ManageSubgroupsViewHolder$setSubgroup$1(C74293Zg r2, C37451pZ r3, A2B a2b, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$subgroup = a2b;
        this.$contactPhotoLoader = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ManageSubgroupsViewHolder$setSubgroup$1(this.this$0, this.$contactPhotoLoader, this.$subgroup, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C74293Zg r1 = this.this$0;
            List list = C42011xT.A0I;
            final AnonymousClass1E7 A0H = r1.A06.A0H(this.$subgroup.A02);
            final C74293Zg r5 = this.this$0;
            C18600wl r0 = r5.A0M;
            final A2B a2b = this.$subgroup;
            final C37451pZ r6 = this.$contactPhotoLoader;
            AnonymousClass1 r4 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r4) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ManageSubgroupsViewHolder$setSubgroup$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
