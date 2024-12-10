package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1FU;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4RX;
import X.C18020vd;
import X.C18040vf;
import X.C19982A1s;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.app.Activity;
import android.os.Bundle;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.SuggestGroupResultHandler$onResult$1$1$1", f = "SuggestGroupResultHandler.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestGroupResultHandler$onResult$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $groupDescription;
    public final /* synthetic */ String $groupName;
    public final /* synthetic */ boolean $isHiddenSubgroup;
    public final /* synthetic */ AnonymousClass1EC $linkedParentGroupJid;
    public final /* synthetic */ Bundle $settingValuesBundle;
    public int label;
    public final /* synthetic */ AnonymousClass4RX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestGroupResultHandler$onResult$1$1$1(Bundle bundle, AnonymousClass4RX r3, AnonymousClass1EC r4, String str, String str2, C30391dr r7, boolean z) {
        super(2, r7);
        this.this$0 = r3;
        this.$linkedParentGroupJid = r4;
        this.$groupName = str;
        this.$groupDescription = str2;
        this.$settingValuesBundle = bundle;
        this.$isHiddenSubgroup = z;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        return new SuggestGroupResultHandler$onResult$1$1$1(this.$settingValuesBundle, this.this$0, this.$linkedParentGroupJid, this.$groupName, this.$groupDescription, r10, this.$isHiddenSubgroup);
    }

    public final Object invokeSuspend(Object obj) {
        C19982A1s a1s;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass4RX r9 = this.this$0;
            AnonymousClass1EC r10 = this.$linkedParentGroupJid;
            String str = this.$groupName;
            String str2 = this.$groupDescription;
            Boolean bool4 = null;
            if (C18020vd.A05(C18040vf.A02, r9.A06, 7180)) {
                Bundle bundle = this.$settingValuesBundle;
                if (bundle != null) {
                    bool = Boolean.valueOf(bundle.getBoolean("edit_group_info"));
                } else {
                    bool = null;
                }
                Bundle bundle2 = this.$settingValuesBundle;
                if (bundle2 != null) {
                    bool2 = Boolean.valueOf(bundle2.getBoolean("add_other_participants"));
                } else {
                    bool2 = null;
                }
                Bundle bundle3 = this.$settingValuesBundle;
                if (bundle3 != null) {
                    bool3 = Boolean.valueOf(bundle3.getBoolean("send_messages"));
                } else {
                    bool3 = null;
                }
                Bundle bundle4 = this.$settingValuesBundle;
                if (bundle4 != null) {
                    bool4 = Boolean.valueOf(bundle4.getBoolean("require_membership_approval"));
                }
                a1s = new C19982A1s(bool, bool2, bool3, bool4);
            } else {
                a1s = null;
            }
            boolean z = this.$isHiddenSubgroup;
            this.label = 1;
            Activity activity = r9.A01;
            AnonymousClass3MW.A1W(activity);
            ((AnonymousClass1FU) activity).CNA(2131896618);
            if (C30451dy.A00(this, r9.A08, new SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2(a1s, r9, r10, str, str2, (C30391dr) null, z)) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SuggestGroupResultHandler$onResult$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
