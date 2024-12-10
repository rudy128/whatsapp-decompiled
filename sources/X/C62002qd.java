package X;

import android.os.Build;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.2qd  reason: invalid class name and case insensitive filesystem */
public class C62002qd {
    public final MultiBufferLogger A00;
    public final AnonymousClass11C A01;
    public final C18010vc A02;

    private void A00(String str, String str2, int i) {
        MultiBufferLogger multiBufferLogger = this.A00;
        multiBufferLogger.writeBytesEntry(1, 57, multiBufferLogger.writeBytesEntry(1, 56, multiBufferLogger.writeStandardEntry(7, 52, 0, 0, i, 0, 0), str), str2);
    }

    public void A01() {
        A00("os_ver", Build.VERSION.RELEASE, 8126483);
        A00("os_sdk", Integer.toString(Build.VERSION.SDK_INT), 8126537);
        A00("device_type", Build.MODEL, 8126478);
        A00("brand", Build.BRAND, 8126479);
        A00("manufacturer", Build.MANUFACTURER, 8126480);
        A00("year_class", Integer.toString(C24191Jf.A02(this.A01, this.A02)), 8126481);
        A00("native_stacks_have_java_frames_enabled", "1", 0);
    }

    public C62002qd(MultiBufferLogger multiBufferLogger, AnonymousClass11C r2, C18010vc r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = multiBufferLogger;
    }
}
