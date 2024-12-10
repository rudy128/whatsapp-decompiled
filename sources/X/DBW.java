package X;

import android.os.Build;
import android.os.Handler;
import android.view.Window;
import java.lang.ref.WeakReference;

public class DBW implements E7X {
    public boolean A00 = false;
    public WeakReference A01;
    public final Handler A02;
    public final Window.OnFrameMetricsAvailableListener A03;
    public final AnonymousClass00H A04;

    public void BIb() {
        Window window;
        if (this.A00) {
            this.A00 = false;
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    WeakReference weakReference = this.A01;
                    if (weakReference != null && (window = (Window) weakReference.get()) != null) {
                        this.A01 = null;
                        window.removeOnFrameMetricsAvailableListener(this.A03);
                    }
                } catch (IllegalArgumentException e) {
                    ((AnonymousClass190) this.A04.get()).A0E("SCROLL_PERF", e.getMessage(), e);
                }
            }
        }
    }

    public void BJv(Window window) {
        if (!this.A00) {
            this.A00 = true;
            if (Build.VERSION.SDK_INT >= 24) {
                this.A01 = AnonymousClass3MW.A0z(window);
                window.addOnFrameMetricsAvailableListener(this.A03, this.A02);
            }
        }
    }

    public DBW(Handler handler, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, AnonymousClass00H r4) {
        this.A02 = handler;
        this.A03 = onFrameMetricsAvailableListener;
        this.A04 = r4;
    }
}
