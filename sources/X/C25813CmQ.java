package X;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.rendercore.RootHostView;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.CmQ  reason: case insensitive filesystem */
public class C25813CmQ {
    public RootHostView A00;
    public final DOZ A01;
    public final Object A02;
    public final Executor A03;
    public final AtomicBoolean A04 = BE6.A16(false);
    public final AtomicReference A05;
    public final AnonymousClass0sW A06;
    public final AnonymousClass0QP A07;
    public final C26962DNk A08;
    public final Object A09;
    public final List A0A;
    public final AtomicReference A0B;

    public static void A00(C25813CmQ cmQ) {
        C25011CTl cTl;
        synchronized (cmQ.A09) {
            if (!cmQ.A04.get()) {
                CYO cyo = (CYO) cmQ.A05.get();
                Map map = (Map) cmQ.A0B.get();
                if (cyo == null || map == null) {
                    throw AnonymousClass000.A0n("TreeState was null but it should have been initialised by the constructor");
                }
                CO4 co4 = ((DFM) cmQ.A06).A00;
                if (co4 != null) {
                    cTl = co4.A01;
                } else {
                    cTl = null;
                }
                AnonymousClass0QP.A02(new DFN(new CQG(cmQ.A01, cyo, cTl, map)), cmQ.A07, true);
            }
        }
    }

    public void A02() {
        if (this.A04.get()) {
            C25913CoX.A01("BloksHostingComponent", "Trying to detach a view from a destroyed BloksHostingComponent");
            return;
        }
        RootHostView rootHostView = this.A00;
        if (rootHostView != null) {
            rootHostView.setTag(2131428146, (Object) null);
            this.A00.setRenderState((AnonymousClass0QP) null);
            this.A00 = null;
        }
    }

    public void A03(RootHostView rootHostView) {
        if (this.A04.get()) {
            C25913CoX.A01("BloksHostingComponent", "Trying to attach a view to a destroyed BloksHostingComponent");
            return;
        }
        RootHostView rootHostView2 = this.A00;
        if (!(rootHostView2 == null || rootHostView2 == rootHostView)) {
            A02();
        }
        this.A00 = rootHostView;
        rootHostView.setRenderState(this.A07);
        this.A00.requestLayout();
        C25995CqB.A00();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.CFu, java.lang.Object] */
    public C25813CmQ(Context context, SparseArray sparseArray, C26235CvV cvV, CXY cxy, Map map, Map map2) {
        AtomicReference atomicReference = new AtomicReference();
        this.A05 = atomicReference;
        this.A09 = C17880vN.A0p();
        this.A02 = C17880vN.A0p();
        C27138DVz dVz = new C27138DVz(this, 1);
        this.A03 = dVz;
        List list = cvV.A00.A02;
        this.A0A = list;
        E86 e86 = cxy.A01;
        e86.BNU();
        CIG.A01.incrementAndGet();
        e86.BNU();
        SparseArray clone = sparseArray.clone();
        clone.put(2131428176, new C25594CiZ(false));
        C26962DNk dNk = new C26962DNk(cvV, new Object(), C25416CfO.A00);
        this.A08 = dNk;
        sparseArray.get(2131428150);
        clone.put(2131428168, false);
        DOZ A002 = C26272CwJ.A00(context, clone, dNk, cxy, cvV.A02);
        this.A01 = A002;
        A002.A02.A01.BNU();
        this.A0B = new AtomicReference(C26235CvV.A03(list, map));
        DFM dfm = new DFM(dNk);
        this.A06 = dfm;
        CBx.A00(A002);
        this.A07 = new AnonymousClass0QP(context, dfm, A002, dVz);
        AnonymousClass00N.A00((Object) null, dNk.A05(A002, new DNM(this), map2), atomicReference);
        A00(this);
    }

    public void A01() {
        A02();
        AtomicBoolean atomicBoolean = this.A04;
        if (atomicBoolean.get()) {
            C25913CoX.A01("BloksHostingComponent", "Trying to access a BloksContext form a destroyed BloksHostingComponent");
        }
        DOZ doz = this.A01;
        HashMap hashMap = (HashMap) doz.A01(2131428149);
        Iterator A0j = C17890vO.A0j((AbstractMap) hashMap.clone());
        while (A0j.hasNext()) {
            ((Animator) A0j.next()).cancel();
        }
        if (!hashMap.isEmpty()) {
            hashMap.clear();
        }
        HashMap hashMap2 = (HashMap) doz.A01(2131428185);
        Iterator A0j2 = C17890vO.A0j((AbstractMap) hashMap2.clone());
        while (A0j2.hasNext()) {
            ((CXG) A0j2.next()).A00();
        }
        if (!hashMap2.isEmpty()) {
            C25913CoX.A01("BloksTimer", "Timer map is non-empty after cleanup!");
            hashMap2.clear();
        }
        ((AbstractMap) doz.A01(2131428187)).clear();
        HashSet hashSet = (HashSet) doz.A01(2131428156);
        Iterator it = ((Set) hashSet.clone()).iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0s("cleanup");
        }
        hashSet.clear();
        C26962DNk A012 = C26272CwJ.A01(doz);
        A012.A0N = true;
        A012.A03 = null;
        List list = A012.A0F;
        synchronized (list) {
            list.clear();
        }
        List list2 = A012.A0G;
        synchronized (list2) {
            list2.clear();
        }
        CZ6 cz6 = A012.A02;
        if (cz6 != null) {
            cz6.A00();
        }
        C25594CiZ ciZ = (C25594CiZ) DOZ.A00(doz, 2131428176);
        if (ciZ != null) {
            ciZ.A00 = true;
            ((Handler) ciZ.A05.getValue()).removeCallbacksAndMessages(ciZ.A03);
            Choreographer.getInstance().removeFrameCallback(ciZ.A02);
        }
        atomicBoolean.set(true);
        AnonymousClass0PG.A00().removeCallbacksAndMessages(this.A02);
        CIG.A03.incrementAndGet();
    }
}
