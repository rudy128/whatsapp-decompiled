package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.mediapipeline.engine.provider.whatsapp.WhatsAppPluginConfigProvider;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.CqS  reason: case insensitive filesystem */
public class C26011CqS {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AREngineController A04;
    public CRC A05;
    public final CK2 A06;
    public final Context A07;
    public final AssetManager A08;
    public final AndroidAsyncExecutorFactory A09;
    public final AndroidAsyncExecutorFactory A0A;
    public volatile EffectServiceHost A0B;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider, java.lang.Object] */
    public static synchronized AREngineController A00(C26011CqS cqS) {
        AREngineController aREngineController;
        synchronized (cqS) {
            aREngineController = cqS.A04;
            if (aREngineController == null) {
                AssetManager assetManager = cqS.A08;
                AndroidAsyncExecutorFactory androidAsyncExecutorFactory = cqS.A09;
                AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = cqS.A0A;
                Context context = ((WhatsAppEffectServiceHost) cqS.A02()).context;
                C24529C8a c8a = WhatsAppPluginConfigProvider.Companion;
                C18070vi.A0d(context, 1);
                ? obj = new Object();
                obj.mHybridData = WhatsAppPluginConfigProvider.initHybrid(context);
                aREngineController = new AREngineController(assetManager, androidAsyncExecutorFactory, androidAsyncExecutorFactory2, obj);
                cqS.A04 = aREngineController;
            }
        }
        return aREngineController;
    }

    public static synchronized void A01(C26011CqS cqS) {
        synchronized (cqS) {
            if (cqS.A0B != null) {
                cqS.A0B.destroy();
                cqS.A0B = null;
            }
        }
    }

    public EffectServiceHost A02() {
        if (this.A0B == null) {
            synchronized (this) {
                if (this.A0B == null) {
                    CRC crc = this.A05;
                    Context applicationContext = this.A07.getApplicationContext();
                    C18070vi.A0d(applicationContext, 0);
                    CJW cjw = crc.A00;
                    cjw.A00 = new FaceTrackerDataProviderConfig();
                    this.A0B = new WhatsAppEffectServiceHost(applicationContext, new EffectServiceHostConfig(cjw), crc.A02, new ARClass(0), crc.A03, crc.A01);
                }
            }
        }
        return this.A0B;
    }

    public C26011CqS(Context context, CRC crc, CK2 ck2, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        this.A06 = ck2;
        this.A07 = context;
        this.A08 = context.getResources().getAssets();
        this.A09 = new AndroidAsyncExecutorFactory(scheduledExecutorService);
        this.A0A = new AndroidAsyncExecutorFactory(scheduledExecutorService2);
        this.A05 = crc;
    }

    public void finalize() {
        A01(this);
    }
}
