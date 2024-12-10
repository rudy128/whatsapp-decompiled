package com.google.firebase.ktx;

import X.C18070vi;
import X.C18330wD;
import X.C18340wE;
import X.C18350wG;
import X.C18490wW;
import X.C18600wl;
import X.C65542wf;
import X.C65552wg;
import X.C65562wh;
import X.C65572wi;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;

public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    public List getComponents() {
        C18330wD[] r5 = new C18330wD[4];
        Class<Background> cls = Background.class;
        Class<C18600wl> cls2 = C18600wl.class;
        C18340wE r3 = new C18340wE(new C18350wG(cls, cls2), new C18350wG[0]);
        Class<Executor> cls3 = Executor.class;
        r3.A01(new C18490wW(new C18350wG(cls, cls3), 1, 0));
        r3.A02 = C65542wf.A00;
        r5[0] = r3.A00();
        Class<Lightweight> cls4 = Lightweight.class;
        C18340wE r32 = new C18340wE(new C18350wG(cls4, cls2), new C18350wG[0]);
        r32.A01(new C18490wW(new C18350wG(cls4, cls3), 1, 0));
        r32.A02 = C65552wg.A00;
        r5[1] = r32.A00();
        Class<Blocking> cls5 = Blocking.class;
        C18340wE r33 = new C18340wE(new C18350wG(cls5, cls2), new C18350wG[0]);
        r33.A01(new C18490wW(new C18350wG(cls5, cls3), 1, 0));
        r33.A02 = C65562wh.A00;
        r5[2] = r33.A00();
        Class<UiThread> cls6 = UiThread.class;
        C18340wE r34 = new C18340wE(new C18350wG(cls6, cls2), new C18350wG[0]);
        r34.A01(new C18490wW(new C18350wG(cls6, cls3), 1, 0));
        r34.A02 = C65572wi.A00;
        return C18070vi.A0O(r34.A00(), r5, 3);
    }
}
