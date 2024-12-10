package androidx.compose.foundation.text.selection;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C02430Dz;
import X.C16850tK;
import X.C17730v8;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2", f = "TextFieldSelectionManager.kt", i = {}, l = {969}, m = "invokeSuspend", n = {}, s = {})
public final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C16850tK $observer;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(C16850tK r2, C30391dr r3) {
        super(2, r3);
        this.$observer = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C17730v8 r3, C30391dr r4) {
        return ((TextFieldSelectionManagerKt$TextFieldSelectionHandle$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        TextFieldSelectionManagerKt$TextFieldSelectionHandle$2 textFieldSelectionManagerKt$TextFieldSelectionHandle$2 = new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(this.$observer, r4);
        textFieldSelectionManagerKt$TextFieldSelectionHandle$2.L$0 = obj;
        return textFieldSelectionManagerKt$TextFieldSelectionHandle$2;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C16850tK r0 = this.$observer;
            this.label = 1;
            if (C02430Dz.A00(r0, (C17730v8) this.L$0, this) == A03) {
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
