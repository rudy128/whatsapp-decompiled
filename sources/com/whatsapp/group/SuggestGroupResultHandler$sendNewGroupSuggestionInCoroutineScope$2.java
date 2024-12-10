package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1FU;
import X.AnonymousClass1OS;
import X.AnonymousClass40V;
import X.AnonymousClass40W;
import X.AnonymousClass4EY;
import X.AnonymousClass4RX;
import X.C17890vO;
import X.C19982A1s;
import X.C21355Aik;
import X.C21456AkN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C59802mu;
import android.app.Activity;
import android.content.res.Resources;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2", f = "SuggestGroupResultHandler.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $groupDescription;
    public final /* synthetic */ String $groupName;
    public final /* synthetic */ C19982A1s $groupPermissionsRequestParams;
    public final /* synthetic */ boolean $isHiddenSubgroup;
    public final /* synthetic */ AnonymousClass1EC $linkedParentGroupJid;
    public int label;
    public final /* synthetic */ AnonymousClass4RX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2(C19982A1s a1s, AnonymousClass4RX r3, AnonymousClass1EC r4, String str, String str2, C30391dr r7, boolean z) {
        super(2, r7);
        this.this$0 = r3;
        this.$linkedParentGroupJid = r4;
        this.$groupName = str;
        this.$groupDescription = str2;
        this.$groupPermissionsRequestParams = a1s;
        this.$isHiddenSubgroup = z;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        return new SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2(this.$groupPermissionsRequestParams, this.this$0, this.$linkedParentGroupJid, this.$groupName, this.$groupDescription, r10, this.$isHiddenSubgroup);
    }

    public final Object invokeSuspend(Object obj) {
        String string;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper = this.this$0.A07;
            AnonymousClass1EC r5 = this.$linkedParentGroupJid;
            String str = this.$groupName;
            String str2 = this.$groupDescription;
            C19982A1s a1s = this.$groupPermissionsRequestParams;
            boolean z = this.$isHiddenSubgroup;
            this.label = 1;
            obj = createSubGroupSuggestionProtocolHelper.A00(a1s, r5, str, str2, this, z);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass4EY r9 = (AnonymousClass4EY) obj;
        if (r9 instanceof AnonymousClass40V) {
            C59802mu r22 = ((AnonymousClass40V) r9).A00;
            this.this$0.A04.A04(r22, this.$linkedParentGroupJid);
            ((AnonymousClass1FU) this.this$0.A01).CEx();
            AnonymousClass4RX r3 = this.this$0;
            AnonymousClass1EC r52 = this.$linkedParentGroupJid;
            AnonymousClass1EC r4 = r22.A02;
            Activity activity = r3.A01;
            if (activity.isFinishing() || activity.isDestroyed()) {
                Log.w("SuggestGroupResultHandler/skipping result snackbar as hosting activity state changed");
            } else {
                Resources resources = activity.getResources();
                if (!(resources == null || (string = resources.getString(2131896616)) == null)) {
                    r3.A03.A0J(new C21456AkN(r3, r4, r52, string, 29));
                }
            }
        } else if (r9 instanceof AnonymousClass40W) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SuggestGroupResultHandler/Request failed for suggested group ");
            C17890vO.A19(A10, this.$groupName);
            ((AnonymousClass1FU) this.this$0.A01).CEx();
            AnonymousClass4RX r32 = this.this$0;
            r32.A03.A0J(new C21355Aik(r32, 33));
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
