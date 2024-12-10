package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONArray;

@DebugMetadata(c = "com.whatsapp.extensions.JsonExtKt$asSequence$1", f = "JsonExt.kt", i = {0}, l = {11}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
/* renamed from: X.Aop  reason: case insensitive filesystem */
public final class C21719Aop extends C71433Fg implements AnonymousClass1OS {
    public final /* synthetic */ JSONArray $this_asSequence;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21719Aop(C30391dr r1, JSONArray jSONArray) {
        super(r1);
        this.$this_asSequence = jSONArray;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        C21719Aop aop = new C21719Aop(r4, this.$this_asSequence);
        aop.L$0 = obj;
        return aop;
    }

    public final Object invokeSuspend(Object obj) {
        C21488Akx akx;
        int length;
        JSONArray jSONArray;
        int i;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            akx = (C21488Akx) this.L$0;
            length = this.$this_asSequence.length();
            jSONArray = this.$this_asSequence;
            i = 0;
        } else if (i2 == 1) {
            int i3 = this.I$1;
            length = this.I$0;
            jSONArray = (JSONArray) this.L$1;
            akx = (C21488Akx) this.L$0;
            C30691eM.A01(obj);
            i = i3 + 1;
        } else {
            throw AnonymousClass000.A0l();
        }
        if (i >= length) {
            return C27621Wu.A00;
        }
        Object obj2 = jSONArray.get(i);
        if (obj2 != null) {
            this.L$0 = akx;
            this.L$1 = jSONArray;
            this.I$0 = length;
            this.I$1 = i;
            this.label = 1;
            akx.A00(obj2, this);
            return r6;
        }
        throw AnonymousClass000.A0s("null cannot be cast to non-null type org.json.JSONObject");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C21719Aop) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
