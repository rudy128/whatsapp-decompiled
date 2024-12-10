package com.whatsapp.bridge.wfs.nativeauth;

import X.A1J;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108485bm;
import X.C17900vP;
import X.C18070vi;
import X.C18460wS;
import X.C192339oD;
import X.C196549vF;
import X.C21338AiO;
import X.C23061Ej;
import X.C24360Bzv;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31081ez;
import X.C31751g4;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$igJob$1", f = "WfsNativeAuthManager.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
public final class WfsNativeAuthManager$getSsoList$2$igJob$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C108485bm $resultChannel;
    public int label;
    public final /* synthetic */ WfsNativeAuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$2$igJob$1(Context context, WfsNativeAuthManager wfsNativeAuthManager, C30391dr r4, C108485bm r5) {
        super(2, r4);
        this.this$0 = wfsNativeAuthManager;
        this.$context = context;
        this.$resultChannel = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new WfsNativeAuthManager$getSsoList$2$igJob$1(this.$context, this.this$0, r6, this.$resultChannel);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.B9t] */
    public final Object invokeSuspend(Object obj) {
        C24360Bzv bzv;
        List A01;
        Object obj2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            WfsNativeAuthManager wfsNativeAuthManager = this.this$0;
            Context context = this.$context;
            C18070vi.A0d(context, 0);
            A1J A00 = wfsNativeAuthManager.A00.A00("wa_android_wfs_native_auth", new Object(), true);
            if (C196549vF.A01(context)) {
                bzv = C24360Bzv.INSTAGRAM_WITH_V2_PROVIDER;
            } else {
                bzv = C24360Bzv.NO_SOURCE;
            }
            if (bzv == C24360Bzv.NO_SOURCE) {
                A01 = C18460wS.A00;
            } else {
                boolean A02 = C23061Ej.A02();
                Context applicationContext = context.getApplicationContext();
                if (!A02) {
                    A01 = A00.A02(applicationContext, bzv);
                } else {
                    A01 = A00.A01(applicationContext, C18070vi.A0P(bzv));
                }
                C18070vi.A0b(A01);
            }
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : A01) {
                C21338AiO aiO = ((C192339oD) next).A01.A02;
                C18070vi.A0X(aiO);
                if (!C18070vi.A18(aiO.ssoEligibility, "2") || !C18070vi.A18(aiO.ntaEligibility, "2")) {
                    A13.add(next);
                }
            }
            if (AnonymousClass000.A1a(A13)) {
                C108485bm r0 = this.$resultChannel;
                this.label = 1;
                if (r0.CHH(A01, this) == obj2) {
                    return obj2;
                }
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (SecurityException e) {
                C31081ez.A01(C17900vP.A0C("WfsNativeAuthManager/getSsoListForIg security error:", AnonymousClass000.A10(), e));
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsNativeAuthManager$getSsoList$2$igJob$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
