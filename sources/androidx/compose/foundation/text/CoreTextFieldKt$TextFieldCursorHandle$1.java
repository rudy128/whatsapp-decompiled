package androidx.compose.foundation.text;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.AnonymousClass4Z4;
import X.C05120Qm;
import X.C16850tK;
import X.C17730v8;
import X.C18560wh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", i = {}, l = {1134}, m = "invokeSuspend", n = {}, s = {})
public final class CoreTextFieldKt$TextFieldCursorHandle$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C05120Qm $manager;
    public final /* synthetic */ C16850tK $observer;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1", f = "CoreTextField.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
            return ((AnonymousClass1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r6) {
            AnonymousClass1 r0 = new AnonymousClass1(r3, r2, r4, r6);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass1OX r6 = (AnonymousClass1OX) this.L$0;
                Integer num = AnonymousClass00R.A0N;
                final C17730v8 r2 = r4;
                final C16850tK r1 = r3;
                AnonymousClass4Z4.A02(num, (C18560wh) null, new AnonymousClass1OS((C30391dr) null) {
                    public int label;

                    /* renamed from: A00 */
                    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
                        return ((AnonymousClass1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
                    }

                    public final C30391dr create(Object obj, C30391dr r5) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public CoreTextFieldKt$TextFieldCursorHandle$1(C16850tK r2, C05120Qm r3, C30391dr r4) {
                            super(2, r4);
                            this.$observer = r2;
                            this.$manager = r3;
                        }

                        /* renamed from: A00 */
                        public final Object invoke(C17730v8 r3, C30391dr r4) {
                            return ((CoreTextFieldKt$TextFieldCursorHandle$1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
                        }

                        public final C30391dr create(Object obj, C30391dr r5) {
                            CoreTextFieldKt$TextFieldCursorHandle$1 coreTextFieldKt$TextFieldCursorHandle$1 = new CoreTextFieldKt$TextFieldCursorHandle$1(this.$observer, this.$manager, r5);
                            coreTextFieldKt$TextFieldCursorHandle$1.L$0 = obj;
                            return coreTextFieldKt$TextFieldCursorHandle$1;
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 A03 = AnonymousClass3F6.A03();
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                final C17730v8 r4 = (C17730v8) this.L$0;
                                final C16850tK r3 = this.$observer;
                                final C05120Qm r2 = this.$manager;
                                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                this.label = 1;
                                if (AnonymousClass1OW.A00(this, r0) == A03) {
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
