package X;

import android.view.View;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;

/* renamed from: X.0Y6  reason: invalid class name */
public final class AnonymousClass0Y6 implements AnonymousClass1GC {
    public final /* synthetic */ View A00;
    public final /* synthetic */ PausableMonotonicFrameClock A01;
    public final /* synthetic */ Recomposer A02;
    public final /* synthetic */ C98494rF A03;
    public final /* synthetic */ AnonymousClass1OX A04;

    public AnonymousClass0Y6(View view, PausableMonotonicFrameClock pausableMonotonicFrameClock, Recomposer recomposer, C98494rF r4, AnonymousClass1OX r5) {
        this.A04 = r5;
        this.A01 = pausableMonotonicFrameClock;
        this.A02 = recomposer;
        this.A03 = r4;
        this.A00 = view;
    }

    public void C6U(C27581Wq r11, AnonymousClass1F9 r12) {
        int ordinal = r11.ordinal();
        if (ordinal == 0) {
            AnonymousClass1OX r2 = this.A04;
            Integer num = AnonymousClass00R.A0N;
            C98494rF r9 = this.A03;
            AnonymousClass4Z4.A02(num, (C18560wh) null, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.A00, this.A02, this, r12, (C30391dr) null, r9), r2, 1);
        } else if (ordinal == 1) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock = this.A01;
            if (pausableMonotonicFrameClock != null) {
                pausableMonotonicFrameClock.A01();
            }
            this.A02.A0k();
        } else if (ordinal == 4) {
            Recomposer recomposer = this.A02;
            synchronized (recomposer.A0B) {
                recomposer.A04 = true;
            }
        } else if (ordinal == 5) {
            this.A02.A0j();
        }
    }
}
