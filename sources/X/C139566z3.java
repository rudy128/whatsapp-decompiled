package X;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6z3  reason: invalid class name and case insensitive filesystem */
public final class C139566z3 {
    public final C24681Lg A00;
    public final AnonymousClass00H A01 = C217517g.A00(16462);
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass11C A06;

    public static final void A00(AnonymousClass1FU r6, C139566z3 r7) {
        AnonymousClass1FU r2 = r6;
        if (!r6.isDestroyed() && !r6.isFinishing()) {
            View findViewById = r6.findViewById(16908298);
            C18070vi.A0b(findViewById);
            ArrayList A13 = AnonymousClass000.A13();
            AnonymousClass11C r3 = r7.A06;
            new C90594eK(findViewById, (AnonymousClass1F9) r2, r3, (List) A13, 2131887314, 2000, false).A03();
            C108955ca.A1E(r2.getBaseContext(), r3, 2131887314);
        }
    }

    public final void A01(AnonymousClass1FU r7, AnonymousClass206 r8) {
        String rawString;
        AnonymousClass205 r5 = r8.A0v;
        AnonymousClass1BI r0 = r5.A00;
        if (r0 != null && (rawString = r0.getRawString()) != null) {
            Map A0h = C108975cc.A0h("origination_flag", Long.valueOf(r8.A0G()));
            HashMap hashMap = ((C125586bK) this.A01.get()).A00;
            hashMap.clear();
            hashMap.putAll(A0h);
            String str = r5.A01;
            C18070vi.A0X(str);
            ((C1404371k) this.A04.get()).A02(rawString, str, (String) null, 0);
            A00(r7, this);
        }
    }

    public final void A02(AnonymousClass1FU r10, AnonymousClass206 r11, C18090vk r12) {
        this.A00.registerObserver(new AnonymousClass7FK(r12, AnonymousClass3MW.A0z(r10), this, 0));
        AnonymousClass1D6[] r6 = new AnonymousClass1D6[3];
        AnonymousClass205 r3 = r11.A0v;
        AnonymousClass1D6.A03("chat_jid", r3.A00, r6, 0);
        AnonymousClass1D6.A03("message_key_id", r3.A01, r6, 1);
        AnonymousClass1D6.A03("origination_flag", Long.valueOf(r11.A0G()), r6, 2);
        LinkedHashMap A0B = AnonymousClass1D7.A0B(r6);
        HashMap hashMap = ((C125586bK) this.A01.get()).A00;
        hashMap.clear();
        hashMap.putAll(A0B);
        ((C132856ni) this.A02.get()).A00(r10, r11 instanceof C438421d);
    }

    public C139566z3(AnonymousClass11C r2, C24681Lg r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r2, r3, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A05 = r4;
        this.A06 = r2;
        this.A00 = r3;
        this.A03 = r5;
        this.A02 = r6;
        this.A04 = r7;
    }
}
