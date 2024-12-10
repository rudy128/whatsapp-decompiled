package com.whatsapp.contact.picker.invite.compose.perf.scroll;

import X.AnonymousClass000;
import X.AnonymousClass0EL;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass4I6;
import X.AnonymousClass4MI;
import X.AnonymousClass5UU;
import X.C18070vi;
import X.C23421Fz;
import X.C26092CsA;
import X.C27621Wu;
import X.C27716Djy;
import X.C28469E2k;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C36711oL;
import X.C88604aC;
import android.app.Activity;
import android.view.Window;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.invite.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$3$1", f = "DropFrameWatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DropFrameWatcherKt$DropFrameWatcher$3$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C28469E2k $state;
    public final /* synthetic */ AnonymousClass4MI $watcher;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "com.whatsapp.contact.picker.invite.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$3$1$2", f = "DropFrameWatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.contact.picker.invite.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$3$1$2  reason: invalid class name */
    public final class AnonymousClass2 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ boolean Z$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            AnonymousClass2 r1 = new AnonymousClass2(activity, r3, r5);
            r1.Z$0 = AnonymousClass000.A1Y(obj);
            return r1;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                boolean z = this.Z$0;
                AnonymousClass4MI r4 = r3;
                boolean z2 = !z;
                Window window = activity.getWindow();
                C18070vi.A0X(window);
                C36711oL r1 = r4.A01;
                if (z2) {
                    r1.A01();
                } else {
                    r1.A03(window, r4.A00);
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DropFrameWatcherKt$DropFrameWatcher$3$1(Activity activity, C28469E2k e2k, AnonymousClass4MI r4, C30391dr r5) {
        super(2, r5);
        this.$state = e2k;
        this.$watcher = r4;
        this.$activity = activity;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        DropFrameWatcherKt$DropFrameWatcher$3$1 dropFrameWatcherKt$DropFrameWatcher$3$1 = new DropFrameWatcherKt$DropFrameWatcher$3$1(this.$activity, this.$state, this.$watcher, r6);
        dropFrameWatcherKt$DropFrameWatcher$3$1.L$0 = obj;
        return dropFrameWatcherKt$DropFrameWatcher$3$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C23421Fz A02 = C26092CsA.A02(AnonymousClass4I6.A00(new AnonymousClass5UU(2), AnonymousClass0EL.A00(new C27716Djy(this.$state))));
            final AnonymousClass4MI r3 = this.$watcher;
            final Activity activity = this.$activity;
            C88604aC.A04(new AnonymousClass2((C30391dr) null), (AnonymousClass1OX) this.L$0, A02);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DropFrameWatcherKt$DropFrameWatcher$3$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
