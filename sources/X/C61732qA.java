package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2qA  reason: invalid class name and case insensitive filesystem */
public final class C61732qA {
    public final long A00;
    public final C19760yx A01;
    public final C201110w A02;
    public final C201110w A03;
    public final C201110w A04;
    public final C201110w A05;
    public final UserJid A06;
    public final String A07;
    public final byte[] A08;

    public C61732qA(C19760yx r3, C201110w r4, C201110w r5, UserJid userJid, String str, byte[] bArr, long j) {
        C18070vi.A0d(userJid, 3);
        this.A06 = userJid;
        this.A07 = str;
        this.A08 = bArr;
        this.A00 = j;
        this.A01 = r3;
        C19760yx A002 = A00(r4);
        Object obj = A002.A00;
        C18070vi.A0W(obj);
        this.A02 = (C201110w) obj;
        Object obj2 = A002.A01;
        C18070vi.A0W(obj2);
        this.A04 = (C201110w) obj2;
        C19760yx A003 = A00(r5);
        Object obj3 = A003.A00;
        C18070vi.A0W(obj3);
        this.A03 = (C201110w) obj3;
        Object obj4 = A003.A01;
        C18070vi.A0W(obj4);
        this.A05 = (C201110w) obj4;
    }

    public static final C19760yx A00(C201110w r7) {
        C201210x r6 = new C201210x();
        C201210x r5 = new C201210x();
        Iterator it = r7.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            Object key = A16.getKey();
            C59452mK r2 = (C59452mK) A16.getValue();
            Long valueOf = Long.valueOf(r2.A00);
            r6.put(key, valueOf);
            DeviceJid deviceJid = r2.A01;
            if (deviceJid != null) {
                r5.put(deviceJid, valueOf);
            }
        }
        return new C19760yx(r6.build(), r5.build());
    }
}
