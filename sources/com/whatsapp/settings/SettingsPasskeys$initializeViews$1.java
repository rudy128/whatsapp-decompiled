package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C99614tB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.SettingsPasskeys$initializeViews$1", f = "SettingsPasskeys.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
public final class SettingsPasskeys$initializeViews$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ SettingsPasskeys this$0;

    @DebugMetadata(c = "com.whatsapp.settings.SettingsPasskeys$initializeViews$1$1", f = "SettingsPasskeys.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.settings.SettingsPasskeys$initializeViews$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G1 r2 = ((SettingsPasskeysViewModel) SettingsPasskeys.this.A03.getValue()).A02;
                C99614tB A00 = C99614tB.A00(SettingsPasskeys.this, 43);
                this.label = 1;
                if (r2.BFC(this, A00) == r4) {
                    return r4;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0l();
            } else {
                C30691eM.A01(obj);
            }
            throw AnonymousClass3MW.A13();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsPasskeys$initializeViews$1(SettingsPasskeys settingsPasskeys, C30391dr r3) {
        super(2, r3);
        this.this$0 = settingsPasskeys;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SettingsPasskeys$initializeViews$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SettingsPasskeys$initializeViews$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final SettingsPasskeys settingsPasskeys = this.this$0;
            C23401Fx r2 = C23401Fx.STARTED;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r2, settingsPasskeys, this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
