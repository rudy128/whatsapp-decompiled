package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.9TA  reason: invalid class name */
public abstract class AnonymousClass9TA {
    public static QuickPerformanceLogger A00;

    public static QuickPerformanceLogger A00() {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger;
        }
        C26294Cx6.A09("QPLProvider", "QuickPerformanceLogger instance wasn't installed in provider, returning noop. Please call QuickPerformanceLoggerProvider.setQuickPerformanceLogger() before getting the instance.", AnonymousClass000.A0n("No QPL instance provided"));
        return null;
    }
}
