package com.whatsapp.community.subgroup.viewholders;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass4V0;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C42011xT;
import X.C453328n;
import com.whatsapp.jid.GroupJid;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.subgroup.viewholders.SubgroupItemViewHolder$bind$2", f = "SubgroupItemViewHolder.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
public final class SubgroupItemViewHolder$bind$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass4V0 $dataModel;
    public final /* synthetic */ GroupJid $groupJid;
    public final /* synthetic */ C453328n $viewHolder;
    public int label;
    public final /* synthetic */ C453328n this$0;

    @DebugMetadata(c = "com.whatsapp.community.subgroup.viewholders.SubgroupItemViewHolder$bind$2$1", f = "SubgroupItemViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.community.subgroup.viewholders.SubgroupItemViewHolder$bind$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            C453328n r2 = r6;
            AnonymousClass1E7 r4 = A0H;
            return new AnonymousClass1(r5, r2, r7, r4, r8);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C453328n r3 = r6;
                AnonymousClass1E7 r2 = A0H;
                C453328n.A00(r5, r3, r7, r2);
                C453328n.A02(r6, r7, A0H);
                C453328n.A01(r5, r6, r7, A0H);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubgroupItemViewHolder$bind$2(AnonymousClass4V0 r2, C453328n r3, C453328n r4, GroupJid groupJid, C30391dr r6) {
        super(2, r6);
        this.this$0 = r3;
        this.$groupJid = groupJid;
        this.$viewHolder = r4;
        this.$dataModel = r2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C453328n r2 = this.this$0;
        GroupJid groupJid = this.$groupJid;
        return new SubgroupItemViewHolder$bind$2(this.$dataModel, r2, this.$viewHolder, groupJid, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C453328n r1 = this.this$0;
            List list = C42011xT.A0I;
            final AnonymousClass1E7 A0H = r1.A05.A0H(this.$groupJid);
            final C453328n r6 = this.this$0;
            C18600wl r0 = r6.A0F;
            final C453328n r7 = this.$viewHolder;
            final AnonymousClass4V0 r5 = this.$dataModel;
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
        return ((SubgroupItemViewHolder$bind$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
