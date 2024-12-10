package com.whatsapp.calling.callconfirmationsheet.ui;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass5Ab;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C37801q9;
import X.C87334Ve;
import X.C88604aC;
import com.whatsapp.calling.callconfirmationsheet.vm.OneOnOneCallConfirmationSheetViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet$initObservables$1", f = "OneOnOneCallConfirmationSheet.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
public final class OneOnOneCallConfirmationSheet$initObservables$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ OneOnOneCallConfirmationSheet this$0;

    @DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet$initObservables$1$1", f = "OneOnOneCallConfirmationSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet$initObservables$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass1OX r4 = (AnonymousClass1OX) this.L$0;
                C88604aC.A04(new AnonymousClass5Ab(OneOnOneCallConfirmationSheet.this, 1), r4, ((OneOnOneCallConfirmationSheetViewModel) OneOnOneCallConfirmationSheet.this.A02.getValue()).A08);
                AnonymousClass1G4 r3 = ((OneOnOneCallConfirmationSheetViewModel) OneOnOneCallConfirmationSheet.this.A02.getValue()).A09;
                final OneOnOneCallConfirmationSheet oneOnOneCallConfirmationSheet = OneOnOneCallConfirmationSheet.this;
                C88604aC.A04(new AnonymousClass1OS((C30391dr) null) {
                    public /* synthetic */ Object L$0;
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r4) {
                        AnonymousClass2 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public OneOnOneCallConfirmationSheet$initObservables$1(OneOnOneCallConfirmationSheet oneOnOneCallConfirmationSheet, C30391dr r3) {
                            super(2, r3);
                            this.this$0 = oneOnOneCallConfirmationSheet;
                        }

                        public final C30391dr create(Object obj, C30391dr r4) {
                            return new OneOnOneCallConfirmationSheet$initObservables$1(this.this$0, r4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return new OneOnOneCallConfirmationSheet$initObservables$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                C37801q9 A1G = this.this$0.A1G();
                                C23401Fx r3 = C23401Fx.STARTED;
                                final OneOnOneCallConfirmationSheet oneOnOneCallConfirmationSheet = this.this$0;
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
