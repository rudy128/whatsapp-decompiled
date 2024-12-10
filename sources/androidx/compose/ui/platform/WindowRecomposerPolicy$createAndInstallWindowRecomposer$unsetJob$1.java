package androidx.compose.ui.platform;

import X.AnonymousClass000;
import X.AnonymousClass0QD;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Recomposer $newRecomposer;
    public final /* synthetic */ View $rootView;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(View view, Recomposer recomposer, C30391dr r4) {
        super(2, r4);
        this.$newRecomposer = recomposer;
        this.$rootView = view;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.$rootView, this.$newRecomposer, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Recomposer recomposer = this.$newRecomposer;
            this.label = 1;
            if (recomposer.A0g(this) == A03) {
                return A03;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Throwable th) {
                th = th;
                if (AnonymousClass0QD.A00(this.$rootView) == this.$newRecomposer) {
                    this.$rootView.setTag(2131427797, (Object) null);
                    throw th;
                }
            }
        } else {
            th = AnonymousClass000.A0l();
            throw th;
        }
        if (AnonymousClass0QD.A00(this.$rootView) == this.$newRecomposer) {
            this.$rootView.setTag(2131427797, (Object) null);
        }
        return C27621Wu.A00;
    }
}
