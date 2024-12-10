package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C99574t7;
import android.widget.FrameLayout;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupLoading$1$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementActivity$setupLoading$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ FrameLayout $container;
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementActivity this$0;

    @DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupLoading$1$1$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupLoading$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(frameLayout, memberSuggestedGroupsManagementActivity, r5);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G1 r4 = AnonymousClass3Ma.A0Q(memberSuggestedGroupsManagementActivity).A0C;
                C99574t7 r0 = new C99574t7(frameLayout, memberSuggestedGroupsManagementActivity, 13);
                this.label = 1;
                if (r4.BFC(this, r0) == r6) {
                    return r6;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0l();
            } else {
                C30691eM.A01(obj);
            }
            throw AnonymousClass3MW.A13();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementActivity$setupLoading$1$1(FrameLayout frameLayout, MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity, C30391dr r4) {
        super(2, r4);
        this.this$0 = memberSuggestedGroupsManagementActivity;
        this.$container = frameLayout;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MemberSuggestedGroupsManagementActivity$setupLoading$1$1(this.$container, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity = this.this$0;
            C23401Fx r3 = C23401Fx.STARTED;
            final FrameLayout frameLayout = this.$container;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r3, memberSuggestedGroupsManagementActivity, this, r0) == r6) {
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
        return ((MemberSuggestedGroupsManagementActivity$setupLoading$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
