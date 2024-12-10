package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4Z8;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import X.C87334Ve;
import X.C99474ss;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementActivity this$0;

    @DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {294}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                C99474ss A00 = AnonymousClass4Z8.A00(new C36001nB((C30391dr) null) {
                    public /* synthetic */ Object L$0;
                    public /* synthetic */ Object L$1;
                    public int label;

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        AnonymousClass1 r1 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1(MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity, C30391dr r3) {
                            super(2, r3);
                            this.this$0 = memberSuggestedGroupsManagementActivity;
                        }

                        public final C30391dr create(Object obj, C30391dr r4) {
                            return new MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1(this.this$0, r4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return new MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                final MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity = this.this$0;
                                C23401Fx r2 = C23401Fx.STARTED;
                                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                this.label = 1;
                                if (C87334Ve.A01(r2, memberSuggestedGroupsManagementActivity, this, r0) == r5) {
                                    return r5;
                                }
                            } else if (i == 1) {
                                C30691eM.A01(obj);
                            } else {
                                throw AnonymousClass000.A0l();
                            }
                            return C27621Wu.A00;
                        }
                    }
