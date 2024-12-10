package X;

import com.facebook.quicklog.QuickPerformanceLogger;

public final class CV6 {
    public final int A00;

    public final void A00(String str, Object obj) {
        C18070vi.A0d(obj, 1);
        int i = this.A00;
        QuickPerformanceLogger quickPerformanceLogger = CEY.A00;
        if (quickPerformanceLogger != null) {
            String str2 = str;
            if (obj instanceof Integer) {
                quickPerformanceLogger.markerAnnotate(231933222, i, str, AnonymousClass000.A0M(obj));
            } else if (obj instanceof String) {
                quickPerformanceLogger.markerAnnotate(231933222, i, str, (String) obj);
            } else if (obj instanceof Long) {
                quickPerformanceLogger.markerAnnotate(231933222, i, str2, C17880vN.A05(obj));
            } else if (obj instanceof Double) {
                quickPerformanceLogger.markerAnnotate(231933222, i, str2, AnonymousClass8BR.A00(obj));
            } else if (obj instanceof Boolean) {
                quickPerformanceLogger.markerAnnotate(231933222, i, str, AnonymousClass000.A1Y(obj));
            }
        } else {
            throw new C1N();
        }
    }

    public CV6(C25131CZg cZg, QuickPerformanceLogger quickPerformanceLogger) {
        int hashCode;
        CEY.A00 = quickPerformanceLogger;
        Integer num = cZg.A00;
        if (num != null) {
            hashCode = num.intValue();
        } else {
            hashCode = C8y.A00().toString().hashCode();
        }
        this.A00 = hashCode;
        QuickPerformanceLogger quickPerformanceLogger2 = CEY.A00;
        if (quickPerformanceLogger2 != null) {
            quickPerformanceLogger2.markerStart(231933222, hashCode);
            return;
        }
        throw new C1N();
    }
}
