package com.whatsapp.bridge.wfs;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass4Z5;
import X.B50;
import X.C17890vO;
import X.C18070vi;
import X.C18460wS;
import X.C191869nK;
import X.C198779yt;
import X.C20017A3j;
import X.C20525AOk;
import X.C21525AlY;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31081ez;
import X.C31751g4;
import X.C98494rF;
import X.C99814tV;
import android.content.Context;
import com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.WfsManager$startSsoPrefetch$1", f = "WfsManager.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
public final class WfsManager$startSsoPrefetch$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ B50 $wfsPrefetchCallback;
    public int label;
    public final /* synthetic */ C198779yt this$0;

    @DebugMetadata(c = "com.whatsapp.bridge.wfs.WfsManager$startSsoPrefetch$1$1", f = "WfsManager.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bridge.wfs.WfsManager$startSsoPrefetch$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            B50 b50 = b50;
            C98494rF r5 = obj3;
            AnonymousClass1 r0 = new AnonymousClass1(context, r6, b50, r8, r5);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            C98494rF r3;
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                ((C20525AOk) b50).A00.A02 = true;
                r3 = obj3;
                WfsNativeAuthManager wfsNativeAuthManager = r6.A01;
                Context context = context;
                this.L$0 = r3;
                this.label = 1;
                obj = wfsNativeAuthManager.A00(context, this, (AnonymousClass1OX) this.L$0);
                if (obj == r5) {
                    return r5;
                }
            } else if (i == 1) {
                r3 = (C98494rF) this.L$0;
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            r3.element = obj;
            B50 b50 = b50;
            Object obj2 = obj3.element;
            C18070vi.A0d(obj2, 0);
            C191869nK r2 = ((C20525AOk) b50).A00;
            C20017A3j.A00(new C21525AlY(obj2, r2, 0), 3);
            r2.A02 = false;
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsManager$startSsoPrefetch$1(Context context, C198779yt r3, B50 b50, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$wfsPrefetchCallback = b50;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new WfsManager$startSsoPrefetch$1(this.$context, this.this$0, this.$wfsPrefetchCallback, r6);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.4rF] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final ? obj3 = new Object();
            obj3.element = C18460wS.A00;
            long A03 = C17890vO.A03(this.this$0.A06.A01(6982));
            final B50 b50 = this.$wfsPrefetchCallback;
            final C198779yt r6 = this.this$0;
            final Context context = this.$context;
            AnonymousClass1 r4 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (AnonymousClass4Z5.A00(this, r4, A03) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (C99814tV unused) {
                Log.w(C31081ez.A00("WfsManager Wfs prefetch flow timeout"));
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsManager$startSsoPrefetch$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
