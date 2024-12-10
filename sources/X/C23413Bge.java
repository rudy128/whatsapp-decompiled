package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Bge  reason: case insensitive filesystem */
public final class C23413Bge extends C22604BFk implements E5R, C28639EBt {
    public final CWD A00;
    public final Set A01;
    public final Set A02;

    public final synchronized void CTc() {
        Set set = this.A01;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.A00.A00(new C23421Bgm(C17880vN.A0v(it)));
        }
        set.clear();
        Set set2 = this.A02;
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            this.A00.A00(new C23422Bgn(C17880vN.A0v(it2)));
        }
        set2.clear();
    }

    public C23413Bge(CWD cwd) {
        this();
        this.A01 = new AnonymousClass016(0);
        this.A02 = new AnonymousClass016(0);
        C18210vx.A00(cwd);
        this.A00 = cwd;
    }

    public C23413Bge() {
        attachInterface(this, "com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }
}
