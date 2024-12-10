package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* renamed from: X.1KY  reason: invalid class name */
public abstract class AnonymousClass1KY {
    public static volatile CronetEngine A01;
    public final AnonymousClass118 A00;

    public void A00() {
        if (this instanceof AnonymousClass1KZ) {
            AnonymousClass1KZ r4 = (AnonymousClass1KZ) this;
            synchronized (AnonymousClass1KZ.class) {
                try {
                    Log.i("QUICCronetEngineProvidertry to build cronetEngine");
                    Context context = r4.A00.A00;
                    CronetEngine.Builder builder = new CronetEngine.Builder(context);
                    File cacheDir = context.getCacheDir();
                    StringBuilder sb = new StringBuilder();
                    sb.append("http/cronet/");
                    sb.append("h1");
                    File file = new File(cacheDir, sb.toString());
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    builder.setStoragePath(file.getPath());
                    String str = C197569wu.A0e;
                    HashSet A002 = AnonymousClass9AA.A00();
                    Calendar instance = Calendar.getInstance();
                    instance.add(13, Integer.MAX_VALUE);
                    builder.addPublicKeyPins(str, A002, true, instance.getTime());
                    builder.enableHttp2(false);
                    builder.enableQuic(true);
                    builder.enableHttpCache(3, 51200);
                    Set<String> set = C50622Vd.A00;
                    if (!set.isEmpty()) {
                        for (String addQuicHint : set) {
                            builder.addQuicHint(addQuicHint, 443, 443);
                        }
                    }
                    A01 = builder.build();
                } catch (Throwable th) {
                    Log.e("QUICCronetEngineProvider/buildCronetEngine cronet engine building failed", th);
                    if (C18020vd.A05(C18040vf.A02, r4.A01, 5478)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("cronet engine building failed\n");
                        sb2.append(th.getMessage());
                        r4.A00.A0E("QUICCronetEngineProvider", sb2.toString(), th);
                    }
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (AnonymousClass2DU.class) {
                try {
                    CronetEngine.Builder.createBuilderDelegate(this.A00.A00);
                    AnonymousClass9AA.A00();
                    Calendar instance2 = Calendar.getInstance();
                    instance2.add(13, Integer.MAX_VALUE);
                    instance2.getTime();
                    throw new NullPointerException("addPublicKeyPins");
                } catch (Exception e) {
                    Log.e("CronetEngineProvider/buildCronetEngine cronet engine building failed", e);
                }
            }
        }
    }

    public AnonymousClass1KY(AnonymousClass118 r1) {
        this.A00 = r1;
    }
}
