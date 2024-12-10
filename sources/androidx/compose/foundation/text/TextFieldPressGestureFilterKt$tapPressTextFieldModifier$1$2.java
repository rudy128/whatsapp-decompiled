package androidx.compose.foundation.text;

import X.AnonymousClass000;
import X.AnonymousClass0QY;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.AnonymousClass4Z4;
import X.C10650ig;
import X.C16300s2;
import X.C17210uI;
import X.C17330uU;
import X.C17720v7;
import X.C17730v8;
import X.C18560wh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ C16300s2 $onTapState;
    public final /* synthetic */ C17330uU $pressedInteraction;
    public final /* synthetic */ AnonymousClass1OX $scope;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements C36001nB {
        public /* synthetic */ long J$0;
        public /* synthetic */ Object L$0;
        public int label;

        public final Object A00(C17720v7 r5, C30391dr r6, long j) {
            AnonymousClass1OX r3 = r4;
            AnonymousClass1 r1 = new AnonymousClass1(r1, r3, r6, r3);
            r1.L$0 = r5;
            r1.J$0 = j;
            return r1.invokeSuspend(C27621Wu.A00);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return A00((C17720v7) obj, (C30391dr) obj3, ((AnonymousClass0QY) obj2).A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 A03 = AnonymousClass3F6.A03();
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                final long j = this.J$0;
                AnonymousClass1OX r1 = r4;
                final C17330uU r7 = r3;
                final C17210uI r6 = r1;
                AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new AnonymousClass1OS((C30391dr) null) {
                    public Object L$0;
                    public int label;

                    /* renamed from: A00 */
                    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
                        return ((AnonymousClass1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
                    }

                    public final C30391dr create(Object obj, C30391dr r8) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2(C17210uI r2, C17330uU r3, C16300s2 r4, C30391dr r5, AnonymousClass1OX r6) {
                            super(2, r5);
                            this.$scope = r6;
                            this.$pressedInteraction = r3;
                            this.$interactionSource = r2;
                            this.$onTapState = r4;
                        }

                        /* renamed from: A00 */
                        public final Object invoke(C17730v8 r3, C30391dr r4) {
                            return ((TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
                        }

                        public final C30391dr create(Object obj, C30391dr r8) {
                            AnonymousClass1OX r5 = this.$scope;
                            TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2(this.$interactionSource, this.$pressedInteraction, this.$onTapState, r8, r5);
                            textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2.L$0 = obj;
                            return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2;
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 A03 = AnonymousClass3F6.A03();
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                final AnonymousClass1OX r4 = this.$scope;
                                final C17330uU r3 = this.$pressedInteraction;
                                final C17210uI r1 = this.$interactionSource;
                                AnonymousClass1 r2 = new AnonymousClass1((C30391dr) null);
                                C10650ig r0 = new C10650ig(this.$onTapState);
                                this.label = 1;
                                if (TapGestureDetectorKt.A09((C17730v8) this.L$0, this, r0, r2) == A03) {
                                    return A03;
                                }
                            } else if (i == 1) {
                                C30691eM.A01(obj);
                            } else {
                                throw AnonymousClass000.A0l();
                            }
                            return C27621Wu.A00;
                        }
                    }
