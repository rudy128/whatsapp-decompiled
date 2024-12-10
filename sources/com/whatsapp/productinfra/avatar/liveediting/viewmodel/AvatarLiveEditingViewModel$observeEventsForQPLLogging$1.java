package com.whatsapp.productinfra.avatar.liveediting.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass2VI;
import X.BR3;
import X.BR4;
import X.BR5;
import X.BR8;
import X.BR9;
import X.BRA;
import X.BRB;
import X.BRC;
import X.C18070vi;
import X.C1N;
import X.C22699BLb;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C3B;
import X.CEY;
import X.CV6;
import com.facebook.quicklog.QuickPerformanceLogger;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$observeEventsForQPLLogging$1", f = "AvatarLiveEditingViewModel.kt", i = {0}, l = {179}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
public final class AvatarLiveEditingViewModel$observeEventsForQPLLogging$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C22699BLb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarLiveEditingViewModel$observeEventsForQPLLogging$1(C22699BLb bLb, C30391dr r3) {
        super(2, r3);
        this.this$0 = bLb;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarLiveEditingViewModel$observeEventsForQPLLogging$1 avatarLiveEditingViewModel$observeEventsForQPLLogging$1 = new AvatarLiveEditingViewModel$observeEventsForQPLLogging$1(this.this$0, r4);
        avatarLiveEditingViewModel$observeEventsForQPLLogging$1.L$0 = obj;
        return avatarLiveEditingViewModel$observeEventsForQPLLogging$1;
    }

    public final Object invokeSuspend(Object obj) {
        C3B c3b;
        short s;
        int i;
        int i2;
        QuickPerformanceLogger quickPerformanceLogger;
        String str;
        int i3;
        StringBuilder A11;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            C30691eM.A01(obj);
            c3b = (C3B) this.L$0;
            this.L$0 = c3b;
            this.label = 1;
            if (AnonymousClass2VI.A00(this) == r2) {
                return r2;
            }
        } else if (i4 == 1) {
            c3b = (C3B) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        CV6 cv6 = this.this$0.A01;
        if (cv6 != null) {
            C18070vi.A0d(c3b, 1);
            if (c3b instanceof BR3) {
                CEY.A00(cv6.A00, AnonymousClass000.A0y("_START", AnonymousClass000.A11("CDL_GENERATE_AVATAR")));
            } else {
                if (c3b instanceof BR9) {
                    cv6.A00("isAvatarFetchedFromCache", Boolean.valueOf(((BR9) c3b).A00));
                    i3 = cv6.A00;
                    A11 = AnonymousClass000.A11("CDL_GENERATE_AVATAR");
                } else {
                    if (c3b instanceof BR8) {
                        str = "CDL_AVATAR_GENERATION_FAILED";
                    } else if (c3b instanceof BR5) {
                        CEY.A00(cv6.A00, AnonymousClass000.A0y("_START", AnonymousClass000.A11("AVATAR_MEMORY_LOAD")));
                    } else if (c3b instanceof BR4) {
                        s = 2;
                        i = 231933222;
                        i2 = cv6.A00;
                        CEY.A00(i2, "AVATAR_MEMORY_LOAD");
                        quickPerformanceLogger = CEY.A00;
                        if (quickPerformanceLogger == null) {
                            throw new C1N();
                        }
                        quickPerformanceLogger.markerEnd(i, i2, s);
                    } else if (c3b instanceof BRC) {
                        i3 = cv6.A00;
                        A11 = AnonymousClass000.A11("EFFECT_RENDER");
                    } else if ((c3b instanceof BRA) || (c3b instanceof BRB)) {
                        str = "EFFECT_RENDER_FAILED";
                    }
                    s = 3;
                    i = 231933222;
                    i2 = cv6.A00;
                    CEY.A00(i2, str);
                    quickPerformanceLogger = CEY.A00;
                    if (quickPerformanceLogger == null) {
                        throw new C1N();
                    }
                    quickPerformanceLogger.markerEnd(i, i2, s);
                }
                CEY.A00(i3, AnonymousClass000.A0y("_END", A11));
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarLiveEditingViewModel$observeEventsForQPLLogging$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
