package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class A1O {
    public C60132nR A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final DeviceJid A05;
    public final Jid A06;
    public final UserJid A07;
    public final AnonymousClass205 A08;
    public final String A09;
    public final List A0A = AnonymousClass000.A13();
    public final Map A0B = C17880vN.A13();
    public final Set A0C = C17880vN.A14();
    public final String A0D;

    public final C59882n2 A01() {
        C60132nR r5 = this.A00;
        AnonymousClass205 r4 = this.A08;
        Jid jid = this.A06;
        int i = this.A03;
        return new C59882n2(this.A05, jid, this.A07, r4, r5, this.A0D, this.A0A, this.A0B, this.A0C, i, this.A01);
    }

    public final void A02(List list) {
        Map map = this.A0B;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list));
        for (Object next : list) {
            linkedHashMap.put(((AnonymousClass1MD) next).A02, next);
        }
        map.putAll(linkedHashMap);
    }

    public A1O(DeviceJid deviceJid, Jid jid, UserJid userJid, AnonymousClass205 r5, C60132nR r6, String str, String str2, int i, int i2, int i3, long j) {
        this.A00 = r6;
        this.A08 = r5;
        this.A06 = jid;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = j;
        this.A05 = deviceJid;
        this.A07 = userJid;
        this.A01 = i3;
        this.A09 = str;
        this.A0D = str2;
    }

    public static void A00(A1O a1o, Object obj) {
        List singletonList = Collections.singletonList(obj);
        C18070vi.A0X(singletonList);
        a1o.A0A.addAll(singletonList);
    }
}
