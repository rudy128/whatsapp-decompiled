package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.Handler;
import android.view.WindowManager;
import com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataSourceWrapper;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.DAs  reason: case insensitive filesystem */
public class C26718DAs implements C28422E0n {
    public static final float[] A0U = {-0.11970494f, 0.6727418f, 9.56203f};
    public static final float[] A0V = {-0.11796062f, 0.68843085f, 9.781745f};
    public static final float[] A0W = {4.6960264E-4f, -5.1159784E-4f, 2.8634304E-4f};
    public float A00;
    public int A01;
    public long A02;
    public Handler A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final Sensor A06;
    public final Sensor A07;
    public final Sensor A08;
    public final Sensor A09;
    public final Sensor A0A;
    public final Sensor A0B;
    public final Sensor A0C;
    public final SensorEventListener A0D = new C26354CyG(this, 1);
    public final SensorEventListener A0E = new C26354CyG(this, 2);
    public final SensorEventListener A0F = new C26354CyG(this, 4);
    public final SensorEventListener A0G = new C26354CyG(this, 5);
    public final SensorEventListener A0H = new C26354CyG(this, 6);
    public final SensorEventListener A0I = new C26354CyG(this, 3);
    public final SensorEventListener A0J = new C26354CyG(this, 0);
    public final SensorManager A0K;
    public final WindowManager A0L;
    public final Integer A0M;
    public final ArrayList A0N = AnonymousClass000.A13();
    public final float[] A0O = new float[3];
    public final float[] A0P = new float[3];
    public final float[] A0Q = new float[16];
    public final float[] A0R = new float[16];
    public final float[] A0S;
    public final float[] A0T = new float[3];

    public static synchronized void A00(C26718DAs dAs) {
        synchronized (dAs) {
            int i = dAs.A01;
            if (i > 0) {
                dAs.A01 = i - 1;
            } else {
                Iterator it = dAs.A0N.iterator();
                while (it.hasNext()) {
                    ((MotionDataSourceWrapper) it.next()).onDataChanged(dAs.A0S, dAs.A0O, dAs.A0P, dAs.A0T, dAs.A02);
                }
            }
        }
    }

    public C26718DAs(Context context) {
        Integer num = AnonymousClass00R.A00;
        float[] fArr = new float[16];
        this.A0S = fArr;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.A0K = sensorManager;
        this.A0M = num;
        Sensor sensor = null;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(15);
            if (defaultSensor == null && (defaultSensor = sensorManager.getDefaultSensor(11)) == null) {
                defaultSensor = sensorManager.getDefaultSensor(20);
            }
            this.A0C = defaultSensor;
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(1);
            this.A06 = defaultSensor2;
            this.A07 = sensorManager.getDefaultSensor(9);
            this.A0B = sensorManager.getDefaultSensor(4);
            Sensor defaultSensor3 = this.A0K.getDefaultSensor(35);
            this.A08 = defaultSensor3 != null ? defaultSensor3 : defaultSensor2;
            Sensor defaultSensor4 = sensorManager.getDefaultSensor(16);
            this.A09 = defaultSensor4 == null ? sensorManager.getDefaultSensor(4) : defaultSensor4;
            sensor = sensorManager.getDefaultSensor(14);
        } else {
            this.A0C = null;
            this.A06 = null;
            this.A07 = null;
            this.A0B = null;
            this.A08 = null;
            this.A09 = null;
        }
        this.A0A = sensor;
        this.A0L = (WindowManager) context.getSystemService("window");
        Matrix.setIdentityM(fArr, 0);
    }
}
