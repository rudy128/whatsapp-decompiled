package X;

import android.view.FrameMetrics;
import android.view.Window;
import java.util.concurrent.TimeUnit;

public class D5J implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ DBV A00;

    public /* synthetic */ D5J(DBV dbv) {
        this.A00 = dbv;
    }

    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric = frameMetrics.getMetric(11) - frameMetrics.getMetric(10);
        if (metric > 0) {
            DBV dbv = this.A00;
            dbv.A05 += TimeUnit.NANOSECONDS.toMillis(metric);
            dbv.A01 += Math.min(((double) metric) / 1.6666666E7d, 1000.0d);
        }
        DBV dbv2 = this.A00;
        if (metric >= 66666664) {
            dbv2.A00 += Math.min(((double) metric) / 6.6666664E7d, 1000.0d);
        }
        dbv2.A02 += i;
    }
}
