package X;

import android.content.Context;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.18M  reason: invalid class name */
public final class AnonymousClass18M implements AnonymousClass18K, AnonymousClass18L {
    public static final CountDownLatch A0E = new CountDownLatch(1);
    public Context A00;
    public C23041Eh A01;
    public C23031Eg A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass18H A06;
    public final C18030ve A07;
    public final AnonymousClass183 A08;
    public final AnonymousClass187 A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass18D A0B;
    public final AnonymousClass18C A0C;
    public final AnonymousClass00H A0D;

    public AnonymousClass18M(AnonymousClass18H r5, C18030ve r6, AnonymousClass18D r7, AnonymousClass18C r8, AnonymousClass183 r9, AnonymousClass187 r10, AnonymousClass00H r11, AnonymousClass00H r12, int i) {
        C18070vi.A0d(r11, 1);
        C18070vi.A0d(r9, 3);
        C18070vi.A0d(r10, 4);
        C18070vi.A0d(r8, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r12, 7);
        C18070vi.A0d(r5, 8);
        this.A0A = r11;
        this.A07 = r6;
        this.A08 = r9;
        this.A09 = r10;
        this.A0C = r8;
        this.A0B = r7;
        this.A0D = r12;
        this.A06 = r5;
        boolean z = true;
        this.A04 = i != 3;
        this.A05 = i == 2 ? false : z;
    }

    public AnonymousClass1Be BDn(AnonymousClass184 r4, C18180vt r5) {
        C18070vi.A0d(r4, 0);
        AnonymousClass18D r1 = this.A0B;
        int i = r4.code;
        if (r5 == null) {
            r5 = r4.samplingRate;
        }
        return new AnonymousClass1Be(r1.A00(r5, i, false));
    }

    public void BdD(Context context, C23031Eg r5, C23041Eh r6, AnonymousClass00H r7, AnonymousClass00H r8, int i, int i2, boolean z) {
        C18070vi.A0d(context, 0);
        C18030ve r2 = this.A07;
        synchronized (r2) {
            r2.A02 = this;
        }
        this.A00 = context;
        this.A01 = r6;
        this.A02 = r5;
        if (!C18020vd.A05(C18040vf.A02, r2, 12046)) {
            BHx();
        }
    }

    public void Bio() {
        CHJ(true);
    }

    public void BvU() {
        CHJ(false);
    }

    public void CAg(int i) {
        AnonymousClass7RM r5 = new AnonymousClass7RM((Object) this, i, 6);
        if (A0E.getCount() != 0) {
            C200710s r2 = this.A08.A01;
            if (!r2.A06()) {
                r2.execute(new C146797Qq(this, r5, 5));
                return;
            }
            A00();
        }
        r5.run();
    }

    public void CC3(C18180vt r1, byte[] bArr, int i, int i2) {
    }

    public void CC4(AnonymousClass184 r3) {
        CC0(r3, (C18180vt) null, true);
    }

    public void CC6(AnonymousClass184 r3, C18180vt r4) {
        C18070vi.A0d(r4, 1);
        CC0(r3, r4, false);
    }

    public void CC7(AnonymousClass184 r3) {
        C18070vi.A0d(r3, 0);
        CC0(r3, (C18180vt) null, false);
    }

    public void CC8(AnonymousClass184 r4, AnonymousClass1Be r5) {
        C18070vi.A0d(r5, 1);
        Integer num = r5.A00;
        if (num != null) {
            int intValue = num.intValue();
            A01(r4, intValue);
            StringBuilder sb = new StringBuilder();
            sb.append("(with weight=");
            sb.append(intValue);
            sb.append(')');
            A02(r4, sb.toString());
        }
    }

    public void CKD(int i) {
    }

    public void CO1() {
    }

    public static final void A00() {
        try {
            A0E.await();
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("wamruntime: unexpected thread interrupt (");
            sb.append(e);
            sb.append(')');
            Log.a(sb.toString());
            Thread.currentThread().interrupt();
        }
    }

    private final void A01(AnonymousClass184 r4, int i) {
        int i2 = r4.bufferChannel;
        if (i2 == 2 || i2 == 3) {
            if (!this.A05) {
                return;
            }
        } else if (i2 == 0 || i2 == 1) {
            if (!this.A04) {
                return;
            }
            this.A08.A01.execute(new C30871ee(r4, this, i));
        }
        if (i2 == 3) {
            int[] iArr = C50812Vw.A00;
            if (iArr[0] != r4.code) {
                return;
            }
        }
        this.A08.A01.execute(new C30871ee(r4, this, i));
    }

    public static final void A02(AnonymousClass184 r3, String str) {
        if (r3 instanceof WamCall) {
            StringBuilder sb = new StringBuilder();
            sb.append("wamruntime/printevent");
            sb.append(str);
            sb.append(": ");
            sb.append(r3);
            Log.i(sb.toString());
        }
    }

    public void BHx() {
        if (!this.A03) {
            C200710s r5 = this.A08.A00;
            r5.execute(new C449025f((Object) this, 42));
            AnonymousClass18C r4 = this.A0C;
            C23031Eg r3 = this.A02;
            if (r3 == null) {
                C18070vi.A11("runnable");
                throw null;
            }
            r4.A01.A00.execute(new C448825d(r4, r3, 9));
            r5.execute(new C449325i(0));
            this.A03 = true;
        }
    }

    public void C13() {
        ((C203811x) this.A0D.get()).A00(this);
    }

    public void CC0(AnonymousClass184 r4, C18180vt r5, boolean z) {
        String str;
        AnonymousClass18D r1 = this.A0B;
        int i = r4.code;
        if (r5 == null) {
            r5 = r4.samplingRate;
        }
        Integer A002 = r1.A00(r5, i, z);
        if (A002 != null) {
            A01(r4, A002.intValue());
            StringBuilder sb = new StringBuilder();
            sb.append("(sampled with weight ");
            sb.append(A002);
            sb.append(')');
            str = sb.toString();
        } else {
            str = "(dropped)";
        }
        A02(r4, str);
    }

    public void CHJ(boolean z) {
        this.A08.A01.execute(new C146747Ql(this, 22));
    }
}
