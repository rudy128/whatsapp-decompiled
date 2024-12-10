package com.whatsapp.contact.picker.nativeContactsLauncher;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C145347Kx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.nativeContactsLauncher.NativeContactsDisclosureListener$updatePrimaryFeatureListOnCompanion$1", f = "NativeContactsDisclosureListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NativeContactsDisclosureListener$updatePrimaryFeatureListOnCompanion$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C145347Kx this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeContactsDisclosureListener$updatePrimaryFeatureListOnCompanion$1(C145347Kx r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new NativeContactsDisclosureListener$updatePrimaryFeatureListOnCompanion$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NativeContactsDisclosureListener$updatePrimaryFeatureListOnCompanion$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A00.A0G();
            this.this$0.A00.A0I();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
