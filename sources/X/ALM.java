package X;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.facebook.rendercore.RootHostView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class ALM implements C22414B6w {
    public RootHostView A00 = null;
    public C25813CmQ A01 = null;
    public final Context A02;
    public final SparseArray A03;
    public final C161218Cg A04 = new C161218Cg(Looper.getMainLooper(), new AAK(this));
    public final C182419Uh A05;
    public final CXY A06;
    public final Map A07;
    public final Map A08;
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final AtomicReference A0A = new AtomicReference();
    public volatile boolean A0B = false;

    public static void A00(ALM alm, int i) {
        C22402B6f b6f = (C22402B6f) alm.A0A.get();
        if (b6f != null) {
            AnonymousClass0O7.A01(AnonymousClass001.A1I("BloksSurface_notify_on_render_surface_", AnonymousClass000.A10(), i));
            try {
                b6f.C39(i);
            } finally {
                AnonymousClass0O7.A00();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static void A01(ALM alm, C166518d1 r10, int i, int i2) {
        A00(alm, 10);
        AnonymousClass7RP r1 = new AnonymousClass7RP(alm, i2, 2);
        AnonymousClass0O7.A01("BloksSurface_create_bloks_hosting_component");
        try {
            Map map = alm.A08;
            map.putAll(r10.A02);
            Context context = alm.A02;
            C26235CvV cvV = r10.A00;
            CXY cxy = alm.A06;
            new SparseArray();
            Map map2 = alm.A07;
            SparseArray clone = alm.A03.clone();
            clone.put(2131428256, r1);
            C25344Ce3.A00(context);
            C25344Ce3.A00(cvV);
            C25344Ce3.A00(cxy);
            C25813CmQ cmQ = new C25813CmQ(context, clone, cvV, cxy, map, map2);
            AnonymousClass0O7.A00();
            AnonymousClass8KU r12 = new AnonymousClass8KU(cmQ, i);
            C161218Cg r3 = alm.A04;
            Message obtainMessage = r3.obtainMessage(1, r12);
            C18070vi.A0d(obtainMessage, 0);
            if (C18070vi.A18(Looper.myLooper(), r3.getLooper())) {
                r3.A00.handleMessage(obtainMessage);
            } else {
                r3.sendMessageAtFrontOfQueue(obtainMessage);
            }
        } catch (Throwable th) {
            AnonymousClass0O7.A00();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r4 == 2) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C3U(X.C182419Uh r6) {
        /*
            r5 = this;
            X.9xd r0 = r6.A00
            int r4 = r0.A00
            r2 = 4
            if (r4 == r2) goto L_0x002f
            r3 = 1
            r1 = 3
            r0 = 0
            if (r4 != r1) goto L_0x000e
            r0 = 1
            r2 = 5
        L_0x000e:
            A00(r5, r2)
            if (r0 != 0) goto L_0x002f
            r0 = 6
            A00(r5, r0)
            if (r4 == r3) goto L_0x001d
            r0 = 2
            r2 = -1
            if (r4 != r0) goto L_0x001f
        L_0x001d:
            r2 = 9
        L_0x001f:
            boolean r0 = r6 instanceof X.C166518d1
            r1 = 7
            if (r0 == 0) goto L_0x002f
            X.8d1 r6 = (X.C166518d1) r6
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x002f
            A01(r5, r6, r1, r2)
            r5.A0B = r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALM.C3U(X.9Uh):void");
    }

    public ALM(Context context, SparseArray sparseArray, C26235CvV cvV, CXY cxy, Map map, Map map2) {
        C166518d1 r2 = null;
        this.A06 = cxy;
        this.A02 = context;
        this.A03 = sparseArray;
        this.A05 = cvV != null ? new C166518d1(cvV, C198009xd.A02) : r2;
        this.A08 = map;
        this.A07 = map2;
    }
}
