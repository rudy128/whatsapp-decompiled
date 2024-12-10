package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.gputimer.GPUTimerImpl;

/* renamed from: X.CdG  reason: case insensitive filesystem */
public final class C25311CdG {
    public static final void A00() {
        try {
            C25311CdG cdG = GPUTimerImpl.Companion;
            Class<GPUTimerImpl> cls = GPUTimerImpl.class;
            if (C26294Cx6.A01.BfN(3)) {
                C26294Cx6.A00(cls, StringFormatUtil.formatStrLocaleSafe("Loading library: %s", (Object) "gputimer-jni"));
            }
            AnonymousClass1A8.loadLibraryUnsafe("gputimer-jni");
            if (C26294Cx6.A01.BfN(3)) {
                C26294Cx6.A00(cls, StringFormatUtil.formatStrLocaleSafe("Successfully loaded: %s", (Object) "gputimer-jni"));
            }
        } catch (UnsatisfiedLinkError e) {
            Class<GPUTimerImpl> cls2 = GPUTimerImpl.class;
            Object[] A1b = AnonymousClass8BV.A1b("gputimer-jni");
            if (BE8.A1R()) {
                C26294Cx6.A09(cls2.getSimpleName(), StringFormatUtil.formatStrLocaleSafe("Failed to load: %s", A1b), e);
            }
        }
    }
}
