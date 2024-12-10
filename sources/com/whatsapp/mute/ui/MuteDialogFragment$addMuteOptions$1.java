package com.whatsapp.mute.ui;

import X.AnonymousClass000;
import X.AnonymousClass1G0;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C86194Qr;
import X.C87334Ve;
import X.C99614tB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mute.ui.MuteDialogFragment$addMuteOptions$1", f = "MuteDialogFragment.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class MuteDialogFragment$addMuteOptions$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MuteDialogFragment this$0;

    @DebugMetadata(c = "com.whatsapp.mute.ui.MuteDialogFragment$addMuteOptions$1$1", f = "MuteDialogFragment.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mute.ui.MuteDialogFragment$addMuteOptions$1$1  reason: invalid class name */
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
                MuteDialogFragment muteDialogFragment = MuteDialogFragment.this;
                C86194Qr r0 = muteDialogFragment.A01;
                if (r0 != null) {
                    AnonymousClass1G0 r1 = r0.A04;
                    C99614tB A00 = C99614tB.A00(muteDialogFragment, 36);
                    this.label = 1;
                    if (r1.BFC(this, A00) == r4) {
                        return r4;
                    }
                } else {
                    C18070vi.A11("radioGroupManager");
                    throw null;
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
    public MuteDialogFragment$addMuteOptions$1(MuteDialogFragment muteDialogFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = muteDialogFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MuteDialogFragment$addMuteOptions$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MuteDialogFragment$addMuteOptions$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            MuteDialogFragment muteDialogFragment = this.this$0;
            C18070vi.A0X(muteDialogFragment);
            C23401Fx r3 = C23401Fx.RESUMED;
            final MuteDialogFragment muteDialogFragment2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r3, muteDialogFragment, this, r0) == r6) {
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
