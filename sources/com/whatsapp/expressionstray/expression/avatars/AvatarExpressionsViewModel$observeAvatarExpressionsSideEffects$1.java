package com.whatsapp.expressionstray.expression.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass6T5;
import X.AnonymousClass6T6;
import X.AnonymousClass6UV;
import X.C117285zW;
import X.C117315zZ;
import X.C120406Do;
import X.C120426Dq;
import X.C18070vi;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41561wd;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements C22821Di {
        public int label;

        public final C30391dr create(C30391dr r4) {
            return new AnonymousClass1(avatarExpressionsViewModel, r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ((AnonymousClass1) create((C30391dr) obj)).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass6UV r4;
            if (this.label == 0) {
                C30691eM.A01(obj);
                boolean A18 = C18070vi.A18(((C117285zW) AnonymousClass6T5.this).A00, "starred");
                AvatarExpressionsViewModel avatarExpressionsViewModel = avatarExpressionsViewModel;
                if (A18) {
                    r4 = C120426Dq.A00;
                } else {
                    r4 = C120406Do.A00;
                }
                AnonymousClass1G4 r2 = avatarExpressionsViewModel.A0L;
                AnonymousClass6T6 r1 = (AnonymousClass6T6) r2.getValue();
                if (r1 instanceof C117315zZ) {
                    C117315zZ r12 = (C117315zZ) r1;
                    List list = r12.A01;
                    boolean z = r12.A03;
                    boolean z2 = r12.A04;
                    boolean z3 = r12.A05;
                    C18070vi.A0d(list, 0);
                    r2.setValue(new C117315zZ(r4, list, z, z2, z3, true));
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1 avatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1 = new AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1(this.this$0, r4);
        avatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1.L$0 = obj;
        return avatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            final AnonymousClass6T5 r1 = (AnonymousClass6T5) this.L$0;
            if (r1 instanceof C117285zW) {
                final AvatarExpressionsViewModel avatarExpressionsViewModel = this.this$0;
                AnonymousClass1 r2 = new AnonymousClass1((C30391dr) null);
                AnonymousClass3MX.A1Q(new AvatarExpressionsViewModel$launchAfterDataLoad$1(avatarExpressionsViewModel, (C30391dr) null, r2), C41561wd.A00(avatarExpressionsViewModel));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
