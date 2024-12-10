package com.google.firebase;

import X.C18070vi;
import X.C18330wD;
import X.C18340wE;
import X.C18350wG;
import X.C18490wW;
import X.C18600wl;
import X.C18610wm;
import X.C18620wo;
import X.C18630wp;
import X.C18640wr;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    public List getComponents() {
        Class<Background> cls = Background.class;
        Class<C18600wl> cls2 = C18600wl.class;
        C18340wE r3 = new C18340wE(new C18350wG(cls, cls2), new C18350wG[0]);
        Class<Executor> cls3 = Executor.class;
        r3.A01(new C18490wW(new C18350wG(cls, cls3), 1, 0));
        r3.A02 = C18610wm.A00;
        Class<Lightweight> cls4 = Lightweight.class;
        C18340wE r32 = new C18340wE(new C18350wG(cls4, cls2), new C18350wG[0]);
        r32.A01(new C18490wW(new C18350wG(cls4, cls3), 1, 0));
        r32.A02 = C18620wo.A00;
        Class<Blocking> cls5 = Blocking.class;
        C18340wE r33 = new C18340wE(new C18350wG(cls5, cls2), new C18350wG[0]);
        r33.A01(new C18490wW(new C18350wG(cls5, cls3), 1, 0));
        r33.A02 = C18630wp.A00;
        Class<UiThread> cls6 = UiThread.class;
        C18340wE r34 = new C18340wE(new C18350wG(cls6, cls2), new C18350wG[0]);
        r34.A01(new C18490wW(new C18350wG(cls6, cls3), 1, 0));
        r34.A02 = C18640wr.A00;
        List asList = Arrays.asList(new C18330wD[]{r3.A00(), r32.A00(), r33.A00(), r34.A00()});
        C18070vi.A0X(asList);
        return asList;
    }
}
