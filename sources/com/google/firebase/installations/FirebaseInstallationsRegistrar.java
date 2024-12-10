package com.google.firebase.installations;

import X.C18220vy;
import X.C18330wD;
import X.C18340wE;
import X.C18350wG;
import X.C18400wL;
import X.C18480wV;
import X.C18490wW;
import X.C18500wX;
import X.C18510wa;
import X.C18520wb;
import X.C18780x9;
import X.C65512wc;
import X.C65522wd;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public static final String LIBRARY_NAME = "fire-installations";

    public List getComponents() {
        C18340wE r7 = new C18340wE(C18480wV.class, new Class[0]);
        r7.A03 = LIBRARY_NAME;
        r7.A01(new C18490wW(C18220vy.class, 1, 0));
        r7.A01(new C18490wW(C18500wX.class, 0, 1));
        r7.A01(new C18490wW(new C18350wG(Background.class, ExecutorService.class), 1, 0));
        r7.A01(new C18490wW(new C18350wG(Blocking.class, Executor.class), 1, 0));
        r7.A02 = new C65512wc(5);
        C18510wa r3 = new C18510wa();
        C18340wE r2 = new C18340wE(C18510wa.class, new Class[0]);
        r2.A01 = 1;
        r2.A02 = new C65522wd(r3, 0);
        return Arrays.asList(new C18330wD[]{r7.A00(), r2.A00(), C18520wb.A00(LIBRARY_NAME, "17.2.0")});
    }

    public static /* synthetic */ C18480wV lambda$getComponents$0(C18400wL r6) {
        return new C18480wV((C18220vy) r6.BMD(C18220vy.class), r6.BXj(C18500wX.class), new C18780x9((Executor) r6.BMC(new C18350wG(Blocking.class, Executor.class))), (ExecutorService) r6.BMC(new C18350wG(Background.class, ExecutorService.class)));
    }
}
