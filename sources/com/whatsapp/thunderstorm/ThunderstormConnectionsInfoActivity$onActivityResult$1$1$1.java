package com.whatsapp.thunderstorm;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108965cb;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity$onActivityResult$1$1$1", f = "ThunderstormConnectionsInfoActivity.kt", i = {}, l = {572}, m = "invokeSuspend", n = {}, s = {})
public final class ThunderstormConnectionsInfoActivity$onActivityResult$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $id;
    public int label;
    public final /* synthetic */ ThunderstormConnectionsInfoActivity this$0;

    @DebugMetadata(c = "com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity$onActivityResult$1$1$1$1", f = "ThunderstormConnectionsInfoActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity$onActivityResult$1$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(str, r5);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C108965cb.A0d(ThunderstormConnectionsInfoActivity.this).A08(ThunderstormConnectionsInfoActivity.this.A0A);
                C108965cb.A0d(ThunderstormConnectionsInfoActivity.this).A07(str);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThunderstormConnectionsInfoActivity$onActivityResult$1$1$1(ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = thunderstormConnectionsInfoActivity;
        this.$id = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ThunderstormConnectionsInfoActivity$onActivityResult$1$1$1(this.this$0, this.$id, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity = this.this$0;
            C18600wl r3 = thunderstormConnectionsInfoActivity.A0B;
            if (r3 != null) {
                final String str = this.$id;
                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, r3, r0) == r6) {
                    return r6;
                }
            } else {
                C18070vi.A11("ioDispatcher");
                throw null;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ThunderstormConnectionsInfoActivity$onActivityResult$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
