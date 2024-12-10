package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.applinks.AppLinkRegisterRequest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DHk  reason: case insensitive filesystem */
public final class C26878DHk implements E7u {
    public CZ7 A00;
    public final Context A01;
    public final CL8 A02;
    public final CL9 A03;
    public final boolean A04;
    public final BQm A05;

    /* JADX WARNING: type inference failed for: r0v41, types: [java.lang.Object, X.BA8] */
    public void CNd(C22821Di r10, C22821Di r11) {
        StringBuilder sb;
        boolean z;
        String str;
        AnonymousClass8Qa A012;
        C18070vi.A0d(r11, 1);
        C25442Cfr cfr = C25442Cfr.A00;
        Context context = this.A01;
        CL9 cl9 = this.A03;
        C22869BTd bTd = new C22869BTd(C24337BzY.BLE, this.A04);
        C18070vi.A0d(cl9, 1);
        CZ7 cz7 = C25442Cfr.A01;
        if (cz7 == null) {
            synchronized (cfr) {
                cz7 = C25442Cfr.A01;
                if (cz7 == null) {
                    ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                    C18070vi.A0X(newCachedThreadPool);
                    cz7 = new CZ7(context, cl9, bTd, newCachedThreadPool);
                    C26294Cx6.A04("LinkedAppManagerClient", "Created LinkedAppManagerClient");
                    C25442Cfr.A01 = cz7;
                }
            }
        }
        this.A00 = cz7;
        this.A05.A00.A05 = cz7;
        Ds1 ds1 = Ds1.A00;
        Cw1 cw1 = cz7.A04;
        cw1.A02 = ds1;
        cw1.A06 = new C27952Doo(r11);
        cw1.A05 = new C28050DqP(this, r10);
        cw1.A07 = new C27953Dop(this);
        C24712CGy.A01.A02("sup:LAMDeviceDiscoveryManager", "Starting linked app manager for device discovery");
        CZ7 cz72 = this.A00;
        if (cz72 != null) {
            Cw1 cw12 = cz72.A04;
            PublicKey recoverPublicKey = Cw1.A00(cw12).recoverPublicKey();
            C23624Bmt A0N = C23639Bn8.DEFAULT_INSTANCE.A0N();
            ((C23639Bn8) A0N.A00).appPublicKey_ = C17900vP.A03(A0N, recoverPublicKey.serialize());
            AppLinkRegisterRequest appLinkRegisterRequest = new AppLinkRegisterRequest((C23639Bn8) A0N.A0C());
            C26294Cx6.A06("lam:LinkedAppManager", "start:");
            C26340Cxx cxx = new C26340Cxx(cw12, appLinkRegisterRequest, 0);
            if (cw12.A0B.A00) {
                Intent A0G = C108945cZ.A0G("com.facebook.wearable.applinks.AppLinkService.BIND");
                C26294Cx6.A06("lam:LinkedAppManager", AnonymousClass001.A1E(A0G, "Attempting to bind family service using intent: ", AnonymousClass000.A10()));
                Context context2 = cw12.A09;
                AtomicReference atomicReference = BVH.A00.A00;
                Object obj = atomicReference.get();
                if (obj == null) {
                    C0C c0c = C0C.A01;
                    Integer num = AnonymousClass00R.A0N;
                    ? obj2 = new Object();
                    synchronized (c0c) {
                        obj = new AnonymousClass8Qe(obj2, c0c, num);
                    }
                    if (!AnonymousClass00N.A00((Object) null, obj, atomicReference)) {
                        obj = atomicReference.get();
                        C26159CtX.A01(obj);
                    }
                }
                C18070vi.A0X(obj);
                A5E a5e = (A5E) obj;
                synchronized (a5e) {
                    A012 = a5e.A01();
                }
                C180209Lo A013 = A012.A01(context2, A0G);
                Intent A09 = A012.A00.A09(context2, A0G);
                if (A09 == null) {
                    z = false;
                } else {
                    A012.A03(context2, A0G, A09, A013);
                    z = context2.bindService(A09, cxx, 513);
                }
                sb = AnonymousClass000.A10();
                str = "Attempt to bind family service returned: ";
            } else {
                Intent intent = C108945cZ.A0G("com.facebook.wearable.applinks.InsecureAppLinkService.BIND").setPackage("com.facebook.stella");
                C26294Cx6.A06("lam:LinkedAppManager", AnonymousClass001.A1E(intent, "Attempting to bind prod service: ", C108955ca.A15(intent)));
                Context context3 = cw12.A09;
                if (context3.bindService(intent, cxx, 1)) {
                    sb = AnonymousClass000.A10();
                    sb.append("Attempt to bind prod service ");
                    sb.append(intent);
                    sb.append(" successful");
                    C26294Cx6.A06("lam:LinkedAppManager", sb.toString());
                }
                Intent intent2 = C108945cZ.A0G("com.facebook.wearable.applinks.InsecureAppLinkService.BIND").setPackage("com.facebook.stella_debug");
                C26294Cx6.A06("lam:LinkedAppManager", AnonymousClass001.A1E(intent2, "Attempt to bind prod service failed, failing over to debug: ", C108955ca.A15(intent2)));
                z = context3.bindService(intent2, cxx, 1);
                sb = AnonymousClass000.A10();
                sb.append("Attempt to bind debug service ");
                sb.append(intent2);
                str = " returned: ";
            }
            sb.append(str);
            sb.append(z);
            C26294Cx6.A06("lam:LinkedAppManager", sb.toString());
        }
    }

    public void stop() {
        C24712CGy.A01.A02("sup:LAMDeviceDiscoveryManager", "Stopping linked app manager for device discovery");
        CZ7 cz7 = this.A00;
        if (cz7 != null) {
            cz7.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.9NA] */
    public C26878DHk(Context context, CL8 cl8, BQm bQm, boolean z) {
        this.A05 = bQm;
        this.A04 = z;
        this.A02 = cl8;
        Context applicationContext = context.getApplicationContext();
        C18070vi.A0X(applicationContext);
        this.A01 = applicationContext;
        ? obj = new Object();
        obj.A01 = C17880vN.A12();
        Context applicationContext2 = applicationContext.getApplicationContext();
        obj.A00 = applicationContext2;
        if (applicationContext2 == null) {
            obj.A00 = applicationContext;
        }
        C26187CuB A012 = new C20032A4b(obj.A01, Executors.newSingleThreadExecutor(), new C21516AlP(obj, 0)).A01();
        C18070vi.A0X(A012);
        this.A03 = new CL9(A012);
    }
}
