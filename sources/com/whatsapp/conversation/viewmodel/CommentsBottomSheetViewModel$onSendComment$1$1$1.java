package com.whatsapp.conversation.viewmodel;

import X.A51;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass3M1;
import X.AnonymousClass3VA;
import X.C143887Fe;
import X.C18070vi;
import X.C18600wl;
import X.C20941Abv;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C33251iW;
import X.C48312Lz;
import X.C61712q8;
import X.C692236j;
import X.C693536w;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$onSendComment$1$1$1", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$onSendComment$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $parentMessage;
    public final /* synthetic */ String $sanitizedText;
    public int label;
    public final /* synthetic */ AnonymousClass3VA this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$onSendComment$1$1$1$1", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$onSendComment$1$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r2, str, r6);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass3VA r0 = AnonymousClass3VA.this;
                C33251iW r10 = r0.A06;
                List A0M = C18070vi.A0M(r0.A0B);
                String str = str;
                Long l = new Long(16777216);
                AnonymousClass206 r9 = r2;
                C18070vi.A0d(r9, 0);
                r10.A0J((C143887Fe) null, (C61712q8) null, new C48312Lz(new A51(r9.A0I(), r9.A0v), r9.A0x), (C20941Abv) null, (AnonymousClass206) null, (C693536w) null, (C693536w) null, (C692236j) null, (AnonymousClass3M1) null, l, str, A0M, (List) null, 0, false, false, false);
                final AnonymousClass3VA r2 = AnonymousClass3VA.this;
                C18600wl r1 = r2.A0H;
                AnonymousClass1 r02 = new AnonymousClass1OS((C30391dr) null) {
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r4) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public CommentsBottomSheetViewModel$onSendComment$1$1$1(AnonymousClass3VA r2, AnonymousClass206 r3, String str, C30391dr r5) {
                            super(2, r5);
                            this.this$0 = r2;
                            this.$sanitizedText = str;
                            this.$parentMessage = r3;
                        }

                        public final C30391dr create(Object obj, C30391dr r6) {
                            return new CommentsBottomSheetViewModel$onSendComment$1$1$1(this.this$0, this.$parentMessage, this.$sanitizedText, r6);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                final AnonymousClass3VA r5 = this.this$0;
                                C18600wl r4 = r5.A0G;
                                final String str = this.$sanitizedText;
                                final AnonymousClass206 r2 = this.$parentMessage;
                                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                this.label = 1;
                                if (C30451dy.A00(this, r4, r0) == r7) {
                                    return r7;
                                }
                            } else if (i == 1) {
                                C30691eM.A01(obj);
                            } else {
                                throw AnonymousClass000.A0l();
                            }
                            return C27621Wu.A00;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return ((CommentsBottomSheetViewModel$onSendComment$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
                        }
                    }
