package X;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0MB  reason: invalid class name */
public abstract class AnonymousClass0MB {
    public static final AtomicReference A00 = new AtomicReference(AnonymousClass0MM.A00);

    public static final Recomposer A00(View view) {
        Recomposer A01 = AnonymousClass0QD.A02(view, AnonymousClass1OR.A00);
        view.setTag(2131427797, A01);
        view.addOnAttachStateChangeListener(new C05230Ra(AnonymousClass4Z4.A02((Integer) null, AnonymousClass1IQ.A01(view.getHandler()).A0F(), new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(view, A01, (C30391dr) null), AnonymousClass3E2.A00, 2), 3));
        return A01;
    }
}
