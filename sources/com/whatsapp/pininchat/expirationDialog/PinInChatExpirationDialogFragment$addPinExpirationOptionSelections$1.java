package com.whatsapp.pininchat.expirationDialog;

import X.AnonymousClass000;
import X.AnonymousClass1G0;
import X.AnonymousClass1OS;
import X.C147277Sn;
import X.C147317Sr;
import X.C18070vi;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C86194Qr;
import X.C87334Ve;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment$addPinExpirationOptionSelections$1", f = "PinInChatExpirationDialogFragment.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
public final class PinInChatExpirationDialogFragment$addPinExpirationOptionSelections$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ PinInChatExpirationDialogFragment this$0;

    @DebugMetadata(c = "com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment$addPinExpirationOptionSelections$1$1", f = "PinInChatExpirationDialogFragment.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment$addPinExpirationOptionSelections$1$1  reason: invalid class name */
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
                PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment = PinInChatExpirationDialogFragment.this;
                C86194Qr r0 = pinInChatExpirationDialogFragment.A02;
                if (r0 != null) {
                    AnonymousClass1G0 r2 = r0.A04;
                    C147277Sn r02 = new C147277Sn(pinInChatExpirationDialogFragment, 32);
                    this.label = 1;
                    if (r2.BFC(this, r02) == r5) {
                        return r5;
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
            throw new C147317Sr();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PinInChatExpirationDialogFragment$addPinExpirationOptionSelections$1(PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = pinInChatExpirationDialogFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new PinInChatExpirationDialogFragment$addPinExpirationOptionSelections$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PinInChatExpirationDialogFragment$addPinExpirationOptionSelections$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment = this.this$0;
            C18070vi.A0X(pinInChatExpirationDialogFragment);
            C23401Fx r3 = C23401Fx.RESUMED;
            final PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r3, pinInChatExpirationDialogFragment, this, r0) == r6) {
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
