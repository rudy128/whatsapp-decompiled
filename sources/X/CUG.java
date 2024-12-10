package X;

import android.content.Context;
import com.facebook.video.heroplayer.common.GlobalPlayerStateMonitor;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

public class CUG {
    public final CRG A00;
    public final C24791CKk A01;
    public final C27066DRp A02;
    public final Context A03;
    public final C92 A04;
    public final C26029Cqn A05;
    public final C24794CKn A06;
    public final C26185Cu9 A07;
    public final CAC A08;
    public final Map A09 = C17880vN.A11();
    public final Map A0A;
    public final Queue A0B;
    public final AtomicReference A0C;
    public final AtomicReference A0D;

    public CUG(Context context, C92 c92, C26029Cqn cqn, C24791CKk cKk, C24794CKn cKn, C26185Cu9 cu9, C27066DRp dRp, CAC cac, Map map, AtomicReference atomicReference) {
        this.A00 = new CRG(new C24917CPo(cu9, this, dRp));
        this.A05 = cqn;
        this.A0A = map;
        this.A02 = dRp;
        this.A04 = c92;
        this.A08 = cac;
        this.A01 = cKk;
        this.A03 = context;
        this.A06 = cKn;
        AtomicReference atomicReference2 = new AtomicReference();
        this.A0D = atomicReference2;
        atomicReference2.set(AnonymousClass000.A0h());
        this.A0C = atomicReference;
        this.A07 = cu9;
        C24788CKh cKh = (C24788CKh) atomicReference.get();
        if (dRp.disableSecondPhasePrefetchOnAppScrolling && cKh != null) {
            cKh.A00.add(this);
        }
        this.A0B = new ArrayDeque();
        GlobalPlayerStateMonitor globalPlayerStateMonitor = GlobalPlayerStateMonitor.A02;
        globalPlayerStateMonitor.A00.add(new C24799CKs(this));
    }
}
