package X;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.lang.reflect.Method;

/* renamed from: X.CvS  reason: case insensitive filesystem */
public class C26234CvS {
    public static String A00 = "0";
    public static C26274CwP A01;
    public static final GoogleApiAvailabilityLight A02 = GoogleApiAvailabilityLight.A00;
    public static final Object A03 = C17880vN.A0p();

    public static C26274CwP A00() {
        C26274CwP cwP;
        synchronized (A03) {
            cwP = A01;
        }
        return cwP;
    }

    public static zzw A01(Context context) {
        C18210vx.A02(context, "Context must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (AnonymousClass000.A1W(A00())) {
            taskCompletionSource.setResult((Object) null);
        } else {
            new Thread(new C27076DTa(context, taskCompletionSource, 47)).start();
        }
        return taskCompletionSource.zza;
    }

    public static String A02() {
        String str;
        synchronized (A03) {
            str = A00;
        }
        return str;
    }

    @Deprecated
    public static void A03(Context context) {
        Throwable byt;
        synchronized (A03) {
            if (!AnonymousClass000.A1W(A00())) {
                C18210vx.A02(context, "Context must not be null");
                Class<C26234CvS> cls = C26234CvS.class;
                ClassLoader classLoader = cls.getClassLoader();
                C18210vx.A00(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    GoogleApiAvailabilityLight googleApiAvailabilityLight = A02;
                    GooglePlayServicesUtil.A01(context, 11925000);
                    C26274CwP A04 = C26274CwP.A04(context, C26274CwP.A09, "com.google.android.gms.cronet_dynamite");
                    Class<?> loadClass = A04.A00.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() != cls.getClassLoader()) {
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        Integer num = (Integer) method.invoke((Object) null, new Object[0]);
                        C18210vx.A00(num);
                        int intValue = num.intValue();
                        String str = (String) method2.invoke((Object) null, new Object[0]);
                        C18210vx.A00(str);
                        A00 = str;
                        if (3 > intValue) {
                            Intent A032 = googleApiAvailabilityLight.A03(context, "cr", 2);
                            if (A032 == null) {
                                Log.e("CronetProviderInstaller", "Unable to fetch error resolution intent");
                                byt = new C24394C1p(2);
                            } else {
                                String str2 = A00;
                                StringBuilder A0t = BE6.A0t(BE8.A0C(str2) + 174);
                                A0t.append("Google Play Services update is required. The API Level of the client is ");
                                A0t.append(3);
                                A0t.append(". The API Level of the implementation is ");
                                A0t.append(intValue);
                                byt = new BYT(A032, AnonymousClass001.A1H(". The Cronet implementation version is ", str2, A0t), 2);
                            }
                            throw byt;
                        }
                        A01 = A04;
                    } else {
                        Log.e("CronetProviderInstaller", "ImplVersion class is missing from Cronet module.");
                        throw new C24394C1p(8);
                    }
                } catch (ClassNotFoundException e) {
                    Log.e("CronetProviderInstaller", "Cronet API is not available. Have you included all required dependencies?");
                    throw ((C24394C1p) new C24394C1p(10).initCause(e));
                } catch (C2E e2) {
                    Log.e("CronetProviderInstaller", "Unable to load Cronet module", e2);
                    throw ((C24394C1p) new C24394C1p(8).initCause(e2));
                } catch (Exception e3) {
                    Log.e("CronetProviderInstaller", "Unable to read Cronet version from the Cronet module ", e3);
                    throw ((C24394C1p) new C24394C1p(8).initCause(e3));
                }
            }
        }
    }

    public static boolean A04() {
        return AnonymousClass000.A1W(A00());
    }
}
