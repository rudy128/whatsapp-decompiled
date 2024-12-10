package com.whatsapp.community.subgroup.views;

import X.AnonymousClass000;
import X.AnonymousClass1FY;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass27B;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C99614tB;
import com.whatsapp.community.CommunityMembersViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.subgroup.views.CommunityMembersView$setupMembersListChangeHandlers$2", f = "CommunityMembersView.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersView$setupMembersListChangeHandlers$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass27B this$0;

    @DebugMetadata(c = "com.whatsapp.community.subgroup.views.CommunityMembersView$setupMembersListChangeHandlers$2$1", f = "CommunityMembersView.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.community.subgroup.views.CommunityMembersView$setupMembersListChangeHandlers$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass27B r2 = AnonymousClass27B.this;
                CommunityMembersViewModel communityMembersViewModel = r2.A09;
                if (communityMembersViewModel == null) {
                    C18070vi.A11("communityMembersViewModel");
                    throw null;
                }
                AnonymousClass1G1 r1 = communityMembersViewModel.A0O;
                C99614tB A00 = C99614tB.A00(r2, 8);
                this.label = 1;
                if (r1.BFC(this, A00) == r4) {
                    return r4;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0l();
            } else {
                C30691eM.A01(obj);
            }
            throw AnonymousClass3MW.A13();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersView$setupMembersListChangeHandlers$2(AnonymousClass27B r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommunityMembersView$setupMembersListChangeHandlers$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunityMembersView$setupMembersListChangeHandlers$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass27B r4 = this.this$0;
            AnonymousClass1FY r3 = r4.A0T;
            C23401Fx r2 = C23401Fx.STARTED;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r2, r3, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
