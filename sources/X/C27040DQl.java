package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.LowMemoryFallbackTrigger$trimMemoryEvent$1;

/* renamed from: X.DQl  reason: case insensitive filesystem */
public final class C27040DQl implements C28536E6k {
    public final AnonymousClass11C A00;
    public final C24561Ku A01;
    public final C18030ve A02;

    public C23421Fz CPq(C25274CcM ccM, C25243Cbe cbe) {
        Object obj;
        Object obj2;
        Integer num;
        int intValue;
        if (cbe.A01 == C24328BzP.FALLBACK_MODE) {
            obj = new C147197Se(AnonymousClass1D6.A01(C24305Bz2.EDITOR_SCREEN_PREVIEW_INITIAL_CHECK_FAILED, new C25179CaV("WhatsappCriticalLowMemoryEvent", C24236Bxq.A04.A00())), 5);
        } else {
            obj = C99494su.A00;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A02, 12212) || (num = cbe.A07) == null || (intValue = num.intValue()) == 0) {
            obj2 = C99494su.A00;
        } else {
            obj2 = new C27183DXs((Object) this, (Object) new C27180DXp(this, new C27179DXo(new C27179DXo(AnonymousClass4I4.A00(new LowMemoryFallbackTrigger$trimMemoryEvent$1(this.A01, (C30391dr) null)), 6), 7), intValue * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH), 2);
        }
        C23421Fz[] r0 = new C23421Fz[2];
        AnonymousClass3MY.A1V(obj, obj2, r0);
        return AnonymousClass4Z6.A01(r0);
    }

    public C27040DQl(AnonymousClass11C r1, C18030ve r2, C24561Ku r3) {
        C18070vi.A0o(r3, r2, r1);
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = r1;
    }
}
