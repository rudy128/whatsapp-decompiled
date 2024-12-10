package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass1YE;
import X.AnonymousClass1YF;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C88604aC;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerActivity$initObservables$1$1$1$3", f = "DialerActivity.kt", i = {}, l = {387}, m = "invokeSuspend", n = {}, s = {})
public final class DialerActivity$initObservables$1$1$1$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ DialerViewModel $this_with;
    public int label;
    public final /* synthetic */ DialerActivity this$0;

    @DebugMetadata(c = "com.whatsapp.calling.dialer.DialerActivity$initObservables$1$1$1$3$1", f = "DialerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.dialer.DialerActivity$initObservables$1$1$1$3$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            String A07;
            if (this.label == 0) {
                C30691eM.A01(obj);
                String str = (String) this.L$0;
                DialerActivity dialerActivity = DialerActivity.this;
                ArrayList arrayList = DialerActivity.A0I;
                if (str != null) {
                    DialerNumberView dialerNumberView = dialerActivity.A08;
                    if (dialerNumberView != null) {
                        dialerNumberView.setText(str);
                        DialerNumberView dialerNumberView2 = dialerActivity.A08;
                        if (dialerNumberView2 != null) {
                            String str2 = (String) AnonymousClass3MZ.A0X(dialerActivity).A0H.getValue();
                            if (AnonymousClass1YF.A0T(str2)) {
                                A07 = C18070vi.A0F(dialerActivity, 2131889413);
                            } else {
                                char[] charArray = str2.toCharArray();
                                C18070vi.A0X(charArray);
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("");
                                int i = 0;
                                for (char c : charArray) {
                                    i++;
                                    if (i > 1) {
                                        A10.append(" ");
                                    }
                                    A10.append(c);
                                }
                                A10.append("");
                                A07 = AnonymousClass1YE.A07(AnonymousClass1YE.A07(C18070vi.A0H(A10), "*", C18070vi.A0F(dialerActivity, 2131898890), false), "#", C18070vi.A0F(dialerActivity, 2131898889), false);
                            }
                            dialerNumberView2.setContentDescription(A07);
                        }
                    }
                    C18070vi.A11("dialedNumberTextView");
                    throw null;
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerActivity$initObservables$1$1$1$3(DialerActivity dialerActivity, DialerViewModel dialerViewModel, C30391dr r4) {
        super(2, r4);
        this.$this_with = dialerViewModel;
        this.this$0 = dialerActivity;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new DialerActivity$initObservables$1$1$1$3(this.this$0, this.$this_with, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G1 r3 = this.$this_with.A0J;
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
        return ((DialerActivity$initObservables$1$1$1$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
