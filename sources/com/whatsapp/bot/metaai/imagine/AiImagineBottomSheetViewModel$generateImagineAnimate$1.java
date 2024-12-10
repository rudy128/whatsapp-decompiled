package com.whatsapp.bot.metaai.imagine;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass11Z;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass6RH;
import X.AnonymousClass6YX;
import X.AnonymousClass7I7;
import X.BC9;
import X.C108975cc;
import X.C108995ce;
import X.C111225jD;
import X.C116895yn;
import X.C1194868i;
import X.C127186dw;
import X.C129636i7;
import X.C131206ki;
import X.C134606qr;
import X.C137156v0;
import X.C144587Hw;
import X.C144777Iq;
import X.C18070vi;
import X.C18600wl;
import X.C218617r;
import X.C26551So;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C35021lW;
import X.C71053Dp;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$generateImagineAnimate$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {1066}, m = "invokeSuspend", n = {}, s = {})
public final class AiImagineBottomSheetViewModel$generateImagineAnimate$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $imageEditId;
    public int label;
    public final /* synthetic */ C111225jD this$0;

    @DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$generateImagineAnimate$1$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {1071}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$generateImagineAnimate$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(str, r5);
        }

        public final Object invokeSuspend(Object obj) {
            Integer num;
            C1194868i r0;
            C35021lW r2;
            C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                try {
                    C127186dw r6 = (C127186dw) C111225jD.this.A0p.get();
                    C134606qr r4 = new C134606qr(str, C111225jD.this.A0D);
                    this.label = 1;
                    C71053Dp A0k = C108975cc.A0k(this);
                    if (r4.A01) {
                        r2 = C35021lW.A05;
                    } else {
                        r2 = AnonymousClass6YX.A00;
                    }
                    obj = AnonymousClass7I7.A01(C131206ki.A00(r2, r6.A01, new C144587Hw(r6, r4, 1)), A0k, 1);
                    if (obj == r7) {
                        return r7;
                    }
                } catch (Exception e) {
                    C108995ce.A1M("AiImagineBottomSheetViewModel/generateImagineAnimate exception ", AnonymousClass000.A10(), e);
                    C111225jD r22 = C111225jD.this;
                    r22.A0N.A0E(AnonymousClass6RH.IMAGINE_EDIT_OPTIONS);
                    r22.A0V(AnonymousClass6RH.EDIT_OPTIONS_ERROR_STATE);
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            C116895yn r15 = (C116895yn) obj;
            C111225jD r23 = C111225jD.this;
            if (r23.A08.get()) {
                r23.A08.set(false);
            } else {
                C129636i7 A01 = C137156v0.A01(r15);
                if (A01 == null) {
                    AnonymousClass6RH r1 = AnonymousClass6RH.IMAGINE_EDIT_OPTIONS;
                    if (r15 == null || !r15.A01) {
                        r23.A0N.A0E(r1);
                        r23.A0V(AnonymousClass6RH.EDIT_OPTIONS_ERROR_STATE);
                    }
                } else {
                    if (C18070vi.A18(A01.A01, "VIDEO")) {
                        num = AnonymousClass00R.A01;
                    } else {
                        num = AnonymousClass00R.A00;
                    }
                    if (num == AnonymousClass00R.A01) {
                        String str = A01.A03;
                        C218617r r42 = r23.A0V;
                        File A0a = r42.A0a("tmp-animate.mp4");
                        if (A0a.exists()) {
                            A0a.delete();
                            A0a = r42.A0a("tmp-animate.mp4");
                        }
                        r23.A03 = new C1194868i(r23.A00, r23.A0d, (AnonymousClass11Z) r23.A0u.get(), r23.A0g, r23.A0h, C26551So.A0q, r23.A0j, A0a, str, "video/mp4");
                        BC9 bc9 = (BC9) AnonymousClass3MW.A0z(new C144777Iq(r23, A0a, num, str)).get();
                        if (!(bc9 == null || (r0 = r23.A03) == null)) {
                            r0.BB6(bc9);
                        }
                        C1194868i r02 = r23.A03;
                        if (r02 != null) {
                            r02.run();
                        }
                    }
                }
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiImagineBottomSheetViewModel$generateImagineAnimate$1(C111225jD r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$imageEditId = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AiImagineBottomSheetViewModel$generateImagineAnimate$1(this.this$0, this.$imageEditId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C111225jD r4 = this.this$0;
            C18600wl r3 = r4.A0w;
            final String str = this.$imageEditId;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r3, r0) == r6) {
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
        return ((AiImagineBottomSheetViewModel$generateImagineAnimate$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
