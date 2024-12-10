package com.whatsapp.calling.calllink.view;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C17890vO;
import X.C18070vi;
import X.C18600wl;
import X.C23401Fx;
import X.C24921Me;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C37801q9;
import X.C87334Ve;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet$setButtonText$1", f = "CreateCallLinkBottomSheet.kt", i = {}, l = {259}, m = "invokeSuspend", n = {}, s = {})
public final class CreateCallLinkBottomSheet$setButtonText$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CreateCallLinkBottomSheet this$0;

    @DebugMetadata(c = "com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet$setButtonText$1$1", f = "CreateCallLinkBottomSheet.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet$setButtonText$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                CreateCallLinkBottomSheet createCallLinkBottomSheet = CreateCallLinkBottomSheet.this;
                AnonymousClass1M9 r1 = createCallLinkBottomSheet.A0B;
                if (r1 != null) {
                    AnonymousClass1BI A0m = AnonymousClass3MX.A0m(createCallLinkBottomSheet.A0V);
                    if (A0m != null) {
                        AnonymousClass1E7 A0E = r1.A0E(A0m);
                        if (A0E != null) {
                            C24921Me r0 = CreateCallLinkBottomSheet.this.A0C;
                            if (r0 != null) {
                                String A0q = AnonymousClass3MY.A0q(r0, A0E);
                                if (A0q != null) {
                                    CreateCallLinkBottomSheet createCallLinkBottomSheet2 = CreateCallLinkBottomSheet.this;
                                    C18600wl r2 = createCallLinkBottomSheet2.A0S;
                                    if (r2 != null) {
                                        CreateCallLinkBottomSheet$setButtonText$1$1$2$1 createCallLinkBottomSheet$setButtonText$1$1$2$1 = new CreateCallLinkBottomSheet$setButtonText$1$1$2$1(createCallLinkBottomSheet2, A0q, (C30391dr) null);
                                        this.label = 1;
                                        if (C30451dy.A00(this, r2, createCallLinkBottomSheet$setButtonText$1$1$2$1) == r6) {
                                            return r6;
                                        }
                                    } else {
                                        str = "mainDispatcher";
                                    }
                                }
                            } else {
                                str = "waContactNames";
                            }
                        }
                    } else {
                        throw C17890vO.A0K();
                    }
                } else {
                    str = "contactManager";
                }
                C18070vi.A11(str);
                throw null;
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateCallLinkBottomSheet$setButtonText$1(CreateCallLinkBottomSheet createCallLinkBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = createCallLinkBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CreateCallLinkBottomSheet$setButtonText$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CreateCallLinkBottomSheet$setButtonText$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C37801q9 A1G = this.this$0.A1G();
            C23401Fx r3 = C23401Fx.STARTED;
            final CreateCallLinkBottomSheet createCallLinkBottomSheet = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r3, A1G, this, r0) == r6) {
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
