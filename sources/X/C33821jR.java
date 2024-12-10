package X;

import com.whatsapp.util.Log;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1jR  reason: invalid class name and case insensitive filesystem */
public final class C33821jR {
    public final AnonymousClass1UW A00;
    public final AnonymousClass1UN A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1UK A03;
    public final C33791jO A04;
    public final C33811jQ A05;
    public final C19830z4 A06;
    public final C18030ve A07;
    public final AnonymousClass18K A08;
    public final AtomicInteger A09 = new AtomicInteger(0);

    public C33821jR(AnonymousClass11S r3, AnonymousClass1UK r4, AnonymousClass1UW r5, C33791jO r6, C33811jQ r7, C19830z4 r8, AnonymousClass1UN r9, C18030ve r10, AnonymousClass18K r11) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(r3, 5);
        C18070vi.A0d(r9, 6);
        C18070vi.A0d(r10, 7);
        C18070vi.A0d(r11, 8);
        C18070vi.A0d(r4, 9);
        this.A04 = r6;
        this.A00 = r5;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = r3;
        this.A01 = r9;
        this.A07 = r10;
        this.A08 = r11;
        this.A03 = r4;
    }

    public final void A00(AnonymousClass12D r13, String str, int i) {
        long time = new Date().getTime();
        if (this.A01.A06()) {
            C33811jQ r5 = this.A05;
            AtomicInteger atomicInteger = this.A09;
            C33791jO r3 = this.A04;
            r5.execute(new C21465AkW(this.A03, this.A00, r3, r13, r5, this.A08, str, atomicInteger, i, time));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ClientIplsSecretKeyProvider/skipping key gen call, nativeContactsBackupContacts:");
        sb.append(this.A06.A2J());
        sb.append(" and isInCompanionMode:");
        sb.append(this.A02.A0N());
        sb.append(" and orion:");
        C18030ve r2 = this.A07;
        C18040vf r1 = C18040vf.A02;
        sb.append(C18020vd.A05(r1, r2, 5868));
        sb.append(" and orion_lockbox:");
        sb.append(C18020vd.A05(r1, r2, 8543));
        Log.i(sb.toString());
    }
}
