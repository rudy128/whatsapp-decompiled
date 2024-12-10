package com.whatsapp.interopui.compose;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1D6;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass428;
import X.AnonymousClass429;
import X.AnonymousClass42A;
import X.C17890vO;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C34651kr;
import X.C83264El;
import X.C88314Ze;
import com.whatsapp.interop.integrator.IntegratorManager$resolveUsers$2;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1", f = "InteropComposeEnterInfoViewModel.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1D6 $keyPair;
    public final /* synthetic */ List $param;
    public int label;
    public final /* synthetic */ InteropComposeEnterInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1(InteropComposeEnterInfoViewModel interopComposeEnterInfoViewModel, List list, AnonymousClass1D6 r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = interopComposeEnterInfoViewModel;
        this.$param = list;
        this.$keyPair = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1(this.this$0, this.$param, this.$keyPair, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1DT r3;
        C88314Ze A00;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.A01.A0E(new C88314Ze(AnonymousClass00R.A01, (Long) null, (Object) null));
            C34651kr r32 = (C34651kr) this.this$0.A02.get();
            List list = this.$param;
            this.label = 1;
            obj = C30451dy.A00(this, r32.A04, new IntegratorManager$resolveUsers$2(r32, list, (C30391dr) null));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C83264El r8 = (C83264El) obj;
        long j = 2;
        if (r8 instanceof AnonymousClass429) {
            AnonymousClass429 r82 = (AnonymousClass429) r8;
            Object obj2 = r82.A02.get(this.$keyPair);
            if (obj2 != null) {
                r3 = this.this$0.A01;
                A00 = new C88314Ze(AnonymousClass00R.A0Y, (Long) null, obj2);
            } else {
                boolean contains = r82.A01.contains(this.$keyPair);
                boolean contains2 = r82.A00.contains(this.$keyPair);
                r3 = this.this$0.A01;
                if (contains) {
                    j = 1;
                } else if (contains2) {
                    j = 3;
                }
                A00 = C88314Ze.A00(j);
            }
        } else {
            if (r8 instanceof AnonymousClass428) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("InteropComposeEnterInfoViewModel/ResolveUserResult error code = ");
                A10.append(((AnonymousClass428) r8).A00);
                C17890vO.A0w(A10);
            } else if (!(r8 instanceof AnonymousClass42A)) {
                throw AnonymousClass3MW.A14();
            }
            r3 = this.this$0.A01;
            A00 = C88314Ze.A00(j);
        }
        r3.A0E(A00);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
