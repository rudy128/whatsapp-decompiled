package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import X.C88604aC;
import android.widget.ImageView;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerActivity$initObservables$1$1$1$1", f = "DialerActivity.kt", i = {}, l = {381}, m = "invokeSuspend", n = {}, s = {})
public final class DialerActivity$initObservables$1$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ DialerViewModel $this_with;
    public int label;
    public final /* synthetic */ DialerActivity this$0;

    @DebugMetadata(c = "com.whatsapp.calling.dialer.DialerActivity$initObservables$1$1$1$1$1", f = "DialerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.dialer.DialerActivity$initObservables$1$1$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ boolean Z$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            AnonymousClass1 r1 = new AnonymousClass1(r4);
            r1.Z$0 = AnonymousClass000.A1Y(obj);
            return r1;
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            if (this.label == 0) {
                C30691eM.A01(obj);
                boolean z = this.Z$0;
                DialerActivity dialerActivity = DialerActivity.this;
                ArrayList arrayList = DialerActivity.A0I;
                ImageView imageView = dialerActivity.A04;
                if (imageView == null) {
                    str = "clearNumberButton";
                } else {
                    int i = 0;
                    imageView.setVisibility(C72453Mb.A07(z ? 1 : 0));
                    ImageView imageView2 = DialerActivity.this.A05;
                    if (imageView2 == null) {
                        str = "messageNumberButton";
                    } else {
                        if (!z) {
                            i = 8;
                        }
                        imageView2.setVisibility(i);
                        return C27621Wu.A00;
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerActivity$initObservables$1$1$1$1(DialerActivity dialerActivity, DialerViewModel dialerViewModel, C30391dr r4) {
        super(2, r4);
        this.$this_with = dialerViewModel;
        this.this$0 = dialerActivity;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new DialerActivity$initObservables$1$1$1$1(this.this$0, this.$this_with, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz r3 = this.$this_with.A0F;
            final DialerActivity dialerActivity = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C88604aC.A00(this, r0, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DialerActivity$initObservables$1$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
