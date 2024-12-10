package X;

import com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils;
import com.facebook.common.callercontext.CallerContextable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.AIg  reason: case insensitive filesystem */
public class C20375AIg implements CallerContextable {
    public C22407B6l A00 = null;
    public String A01 = null;
    public final C20123A8i A02;
    public final AnonymousClass9OY A03;
    public final E94 A04;
    public final C167148fU A05;
    public final A23 A06;
    public final Set A07 = Collections.newSetFromMap(new WeakHashMap());
    public final C187129fJ A08;
    public final C198439yL A09;
    public final AnonymousClass9P7 A0A;
    public final Map A0B = Collections.synchronizedMap(C17880vN.A11());
    public final ScheduledExecutorService A0C;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.9zw] */
    public static void A01(C20375AIg aIg, C188409hN r10, C180189Lm r11, BA6 ba6, AnonymousClass9OY r13, C20282AEq aEq, boolean z) {
        AnonymousClass9LV r0;
        C188409hN r5 = r10;
        A4D a4d = r10.A08;
        C20375AIg aIg2 = aIg;
        BA6 ba62 = ba6;
        C20282AEq aEq2 = aEq;
        try {
            if (!AnonymousClass000.A1Y(r5.A03.get(120, TimeUnit.SECONDS))) {
                ? obj = new Object();
                obj.A00 = C179629Is.VOLTRON_MODULE_FAILURE;
                obj.A03 = AnonymousClass000.A0n("Voltron modules required for effect failed to load.");
                r0 = obj.A01();
                A02(aIg2, ba6, aEq, a4d, r0);
                return;
            }
            new C21440Ak7(aIg2, r5, r11, ba62, r13, aEq2, a4d, z).run();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C26294Cx6.A0C("DefaultCameraCoreEffectManager", "voltron module load exception.", e);
            ? obj2 = new Object();
            obj2.A00 = C179629Is.VOLTRON_MODULE_FAILURE;
            obj2.A03 = e;
            r0 = obj2.A01();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.9zw] */
    public static void A02(C20375AIg aIg, BA6 ba6, C20282AEq aEq, A4D a4d, Exception exc) {
        Exception exc2 = exc;
        if (!(exc instanceof AnonymousClass9LV)) {
            ? obj = new Object();
            obj.A00 = C179629Is.OTHER;
            obj.A03 = exc;
            exc2 = obj.A01();
        }
        new C21468AkZ(ba6, aIg, exc2, a4d, aEq, 5).run();
    }

    public static void A03(C20375AIg aIg, C20282AEq aEq, A4D a4d) {
        Long l;
        C167148fU r6 = aIg.A05;
        C18070vi.A0d(aEq, 0);
        A6K a6k = aEq.A01;
        String str = a6k.A0A;
        C18070vi.A0X(str);
        String str2 = a6k.A0B;
        A4D a4d2 = a4d;
        if (!C72453Mb.A1a(r6.A00) && !a4d.A02) {
            String str3 = a4d.A00;
            long A002 = r6.A00(16321564, str3.hashCode());
            r6.A02(A002);
            r6.A06(a4d2, str, str2, A002);
            r6.A05(A002, "marker_start_zero", str3);
            r6.A04(A002, "oc_ar_xlogger", "false");
        }
        A23 a23 = aIg.A06;
        a23.A04.put(str, a4d);
        if (!A23.A00(a4d, a23)) {
            Map map = a23.A03;
            String str4 = a4d.A01;
            C18070vi.A0X(str4);
            map.put(str4, new C187149fL(aEq));
            C167158fV r62 = a23.A01;
            long A003 = r62.A00(22421767, str4.hashCode());
            synchronized (r62) {
                long j = r62.A00;
                if (j == 0 || j == A003) {
                    l = null;
                } else {
                    l = Long.valueOf(j);
                }
                r62.A00 = A003;
            }
            if (l != null) {
                r62.A01(l.longValue());
            }
            r62.A02(A003);
            r62.A06(a4d2, str, str2, A003);
            r62.A01.get(str4);
            r62.A04(A003, "connection_class", "UNKNOWN");
            r62.A04(A003, "connection_name", "UNKNOWN");
        }
    }

    public C20375AIg(C20123A8i a8i, C187129fJ r3, E94 e94, C198439yL r5, C167148fU r6, A23 a23, AnonymousClass9P7 r8, ScheduledExecutorService scheduledExecutorService) {
        this.A06 = a23;
        this.A05 = r6;
        this.A02 = a8i;
        this.A0A = r8;
        this.A04 = e94;
        this.A08 = r3;
        this.A03 = new AnonymousClass9OY();
        this.A0C = scheduledExecutorService;
        this.A09 = r5;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.9N0, java.lang.Object] */
    public static AIO A00(C20375AIg aIg, BA6 ba6, AnonymousClass9OY r16, C20282AEq aEq, A4D a4d, List list) {
        Double A0Q = AnonymousClass8BV.A0Q();
        AtomicReference atomicReference = new AtomicReference(A0Q);
        AtomicReference atomicReference2 = new AtomicReference(A0Q);
        AtomicReference atomicReference3 = new AtomicReference(Double.valueOf(0.5d));
        C20375AIg aIg2 = aIg;
        C190889lg r13 = new C190889lg(aIg, atomicReference3, atomicReference2, atomicReference);
        C162408Kp r7 = new C162408Kp(aIg, atomicReference, atomicReference3, atomicReference2);
        C198439yL r3 = aIg.A09;
        BA6 ba62 = ba6;
        C20282AEq aEq2 = aEq;
        A4D a4d2 = a4d;
        C188409hN r6 = new C188409hN(ba6, aEq2, a4d2);
        r6.A03 = new DMq(true);
        String str = aEq2.A07;
        boolean z = true;
        if (str != null) {
            z = AnonymousClass000.A1a(ManifestUtils.filterNeededServices(str, aEq2.A01.A0A, Collections.singletonList(C0M.A0i), aIg.A04));
        }
        AnonymousClass9OY r9 = r16;
        if (z) {
            C26208Cuj.A01(r3);
            r3.A04.execute(new C21455AkM(r3, new C191579mp(aIg2, r6, r7, ba62, r9, aEq2, a4d2), a4d2, 11));
        } else {
            HashMap A11 = C17880vN.A11();
            ? obj = new Object();
            obj.A00 = A11;
            r6.A01 = obj;
            r6.A06 = true;
        }
        C187129fJ r15 = aIg.A08;
        List list2 = aEq2.A09;
        r15.A02.execute(new C21468AkZ(r13, new C191589mq(aIg2, r6, r7, ba62, r9, aEq2, a4d2), r15, a4d2, list2));
        AIN ain = new AIN(r15, 1);
        A4D a4d3 = r6.A08;
        return new AIO(aIg2, aIg2.A02.A09(r7, new AIR(aIg2, r6, r7, ba62, r9, aEq2, a4d3), r9, a4d3, Collections.singletonList(aEq2)), ain, list);
    }
}
