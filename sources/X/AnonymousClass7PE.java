package X;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: X.7PE  reason: invalid class name */
public final class AnonymousClass7PE implements C1605889b {
    public final C53982dP A00;

    public void Bzu(WebView webView) {
    }

    public void Bzz(WebView webView) {
        if (C18020vd.A05(C18040vf.A02, this.A00.A00, 10806)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("javascript:");
            webView.evaluateJavascript(AnonymousClass000.A0y("(function() {\n  try {\n    // log DomContentLoaded timing inside \"DOMContentLoaded\" event callback\n    const onDomContentLoaded = () => {\n      if (!window.performance || !window.performance.timing) {\n        return;\n      }\n      var timing = window.performance.timing;\n      if (timing.domContentLoadedEventStart > 0) {\n        console.log('WANavDomContentLoaded:' + timing.domContentLoadedEventStart);\n      }\n      // remove listener after logging\n      document.removeEventListener(\"DOMContentLoaded\", onDomContentLoaded);\n    }\n\n    document.addEventListener(\"DOMContentLoaded\", onDomContentLoaded);\n\n\n    const logTiming = () => {\n      if (!window.performance || !window.performance.timing) {\n        return;\n      }\n      var timing = window.performance.timing;\n      if (timing.responseStart > 0) {\n        console.log('WANavResponseStart:' + timing.responseStart);\n      }\n      if (timing.responseEnd > 0) {\n        console.log('WANavResponseEnd:' + timing.responseEnd);\n      }\n      if (timing.domContentLoadedEventStart > 0) {\n        console.log('WANavDomContentLoaded:' + timing.domContentLoadedEventStart);\n      }\n      if (timing.loadEventEnd > 0) {\n        console.log('WANavLoadEventEnd:' + timing.loadEventEnd);\n      }\n      const html = document.getElementsByTagName('html')[0];\n      if (html) {\n        var html_with_amp = html.hasAttribute('amp') || html.hasAttribute(\"\\u26A1\");\n        console.log('WANavAmpDetect:' + html_with_amp);\n      }\n    }\n\n    logTiming();\n\n  } catch(err) {\n    console.log('navigation_timing_logger_error:' + err.message);\n  }\n})()", A10), (ValueCallback) null);
        }
    }

    public AnonymousClass7PE(C53982dP r1) {
        this.A00 = r1;
    }
}
