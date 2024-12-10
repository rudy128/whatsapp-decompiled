package com.whatsapp.calling.floatingview.ui;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.AnonymousClass6T0;
import X.C113615nN;
import X.C116205wc;
import X.C116225we;
import X.C1409473r;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C39351sv;
import X.C62882s9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.floatingview.ui.FloatingViewManager$tryHideWithAnimation$1", f = "FloatingViewManager.kt", i = {0}, l = {306}, m = "invokeSuspend", n = {"view"}, s = {"L$0"})
public final class FloatingViewManager$tryHideWithAnimation$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6T0 $animation;
    public final /* synthetic */ ViewGroup $container;
    public Object L$0;
    public int label;
    public final /* synthetic */ C1409473r this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingViewManager$tryHideWithAnimation$1(ViewGroup viewGroup, C1409473r r3, AnonymousClass6T0 r4, C30391dr r5) {
        super(2, r5);
        this.$animation = r4;
        this.this$0 = r3;
        this.$container = viewGroup;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        AnonymousClass6T0 r3 = this.$animation;
        return new FloatingViewManager$tryHideWithAnimation$1(this.$container, this.this$0, r3, r6);
    }

    public final Object invokeSuspend(Object obj) {
        View view;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass6T0 r1 = this.$animation;
            if (r1 instanceof C116225we) {
                C1409473r r7 = this.this$0;
                View A08 = r7.A08();
                if (A08 != null) {
                    ViewGroup.LayoutParams layoutParams = A08.getLayoutParams();
                    if (layoutParams != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        int i2 = 3;
                        if (AnonymousClass3MY.A1b(r7.A0F)) {
                            i2 = 5;
                        }
                        layoutParams2.gravity = i2 | 80;
                        C39351sv r0 = r7.A07;
                        if (r0 != null) {
                            layoutParams2.bottomMargin = r0.A00;
                            A08.setLayoutParams(layoutParams2);
                        } else {
                            C18070vi.A11("floatingViewMargins");
                            throw null;
                        }
                    } else {
                        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                }
                C1409473r.A04(this.this$0, false);
            } else if (r1 instanceof C116205wc) {
                C1409473r.A03(this.this$0, false);
            }
            C1409473r r3 = this.this$0;
            C113615nN r2 = r3.A04;
            if (r2 != null) {
                view = r2.A0H;
                if (r2.A05 != null) {
                    r2.A0B();
                    r3 = this.this$0;
                    r3.A04 = null;
                }
            } else {
                view = null;
            }
            r3.A0A = true;
            this.L$0 = view;
            this.label = 1;
            if (C62882s9.A00(this, 200) == r5) {
                return r5;
            }
        } else if (i == 1) {
            view = (View) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A0A = false;
        this.$container.removeView(view);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FloatingViewManager$tryHideWithAnimation$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
