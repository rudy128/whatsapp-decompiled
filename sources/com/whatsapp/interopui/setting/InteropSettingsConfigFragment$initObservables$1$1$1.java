package com.whatsapp.interopui.setting;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C72453Mb;
import X.C72473Md;
import X.C83024Db;
import com.whatsapp.settings.SettingsRowIconText;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.setting.InteropSettingsConfigFragment$initObservables$1$1$1", f = "InteropSettingsConfigFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InteropSettingsConfigFragment$initObservables$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ InteropSettingsConfigFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropSettingsConfigFragment$initObservables$1$1$1(InteropSettingsConfigFragment interopSettingsConfigFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = interopSettingsConfigFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        InteropSettingsConfigFragment$initObservables$1$1$1 interopSettingsConfigFragment$initObservables$1$1$1 = new InteropSettingsConfigFragment$initObservables$1$1$1(this.this$0, r4);
        interopSettingsConfigFragment$initObservables$1$1$1.I$0 = AnonymousClass000.A0M(obj);
        return interopSettingsConfigFragment$initObservables$1$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            int i = this.I$0;
            Iterator it = C83024Db.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((C83024Db) obj2).type == i) {
                    break;
                }
            }
            C83024Db r1 = (C83024Db) obj2;
            if (r1 != null) {
                int i2 = r1.text;
                SettingsRowIconText settingsRowIconText = this.this$0.A02;
                if (settingsRowIconText != null) {
                    settingsRowIconText.setSubText(i2);
                }
            } else {
                C72453Mb.A1B(this.this$0.A02);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropSettingsConfigFragment$initObservables$1$1$1) C72473Md.A0l(obj, obj2, this)).invokeSuspend(C27621Wu.A00);
    }
}
