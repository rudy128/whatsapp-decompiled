package X;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.120  reason: invalid class name */
public class AnonymousClass120 extends AnonymousClass10T implements C201511a {
    public long A00 = 0;
    public boolean A01;
    public boolean A02;
    public C54492eE[] A03;
    public long A04 = 0;
    public final C19880zA A05;
    public final AnonymousClass1KB A06;
    public final AnonymousClass11S A07;
    public final C31301fL A08;
    public final C19830z4 A09;
    public final AnonymousClass1P3 A0A;
    public final C25571Os A0B;
    public final C24451Kj A0C = new C24451Kj(10, 610);
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final C19880zA A0G;
    public final C19880zA A0H;
    public final C23651Hc A0I;
    public final AnonymousClass11P A0J;

    public static synchronized void A00(AnonymousClass120 r1) {
        synchronized (r1) {
            if (r1.A02) {
                r1.A02 = false;
                r1.A0C.A02();
            }
        }
    }

    public static synchronized void A01(AnonymousClass120 r1, long j) {
        synchronized (r1) {
            r1.A04 = j;
        }
    }

    public synchronized void A05() {
        this.A00 = 0;
    }

    public synchronized void A06() {
        if (this.A0I.A07) {
            long j = this.A00;
            if (j == 0 || SystemClock.uptimeMillis() - j > 60000) {
                ((AnonymousClass1OZ) this.A0E.get()).A0M(Message.obtain((Handler) null, 0, 88, 0));
                this.A00 = SystemClock.uptimeMillis();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MyPreKeysManager/send-get-pre-key-digest/skip-digest-check last:");
        sb.append(this.A00);
        Log.i(sb.toString());
    }

    public synchronized void A07() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.A0I.A07) {
            long j = this.A04;
            if (j == 0 || uptimeMillis - j > 180000) {
                A01(this, uptimeMillis);
                A02(this, true);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MyPreKeysManager/sendSetPreKey/skip last:");
        sb.append(this.A04);
        Log.i(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.2S5, java.lang.Object] */
    public static void A02(AnonymousClass120 r17, boolean z) {
        C52972bm r6;
        AnonymousClass120 r12 = r17;
        if (r12.A07.A0N() && r12.A09.A2X()) {
            C31301fL.A00(r12.A08, 4, 0);
        }
        C71363Ez A072 = r12.A0B.A07();
        try {
            AnonymousClass1P3 r3 = r12.A0A;
            int A022 = r3.A06.A02();
            byte[] A0f = r3.A0f();
            C71363Ez A073 = r3.A0H.A07();
            try {
                ArrayList A012 = r3.A01.A00.A03.A01();
                ArrayList arrayList = new ArrayList();
                Iterator it = A012.iterator();
                while (it.hasNext()) {
                    r6 = (C52972bm) it.next();
                    int i = r6.A00;
                    byte[] bArr = r6.A01;
                    ? obj = new Object();
                    obj.A00 = (AnonymousClass2BH) C23577Bm6.A07(AnonymousClass2BH.DEFAULT_INSTANCE, bArr);
                    arrayList.add(AnonymousClass1PH.A00(obj, i));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("SignalProtocolStore/unsent reporting back ");
                sb.append(arrayList.size());
                sb.append(" prekeys for sending to the server");
                Log.i(sb.toString());
                C54492eE[] r14 = (C54492eE[]) arrayList.toArray(new C54492eE[0]);
                if (A073 != null) {
                    A073.close();
                }
                C54492eE A0J2 = r3.A0J();
                r12.A06.A0J(new AnonymousClass7QF(r12, A8G.A03(A022), r14, A0J2, A0f, 1, z));
                if (A072 != null) {
                    A072.close();
                }
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SignalProtocolStore/unsent error reading prekey ");
                sb2.append(r6.A00);
                Log.e(sb2.toString(), e);
            } catch (Throwable th) {
                if (A073 != null) {
                    A073.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (A072 != null) {
                try {
                    A072.close();
                    throw th2;
                } catch (Throwable th3) {
                    AnonymousClass0DT.A00(th2, th3);
                    throw th2;
                }
            }
            throw th2;
        }
    }

    public void A03() {
        C71363Ez A072 = this.A0B.A07();
        try {
            this.A0A.A0Q();
            if (A072 != null) {
                A072.close();
            }
            A07();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A04() {
        if (this.A09.A2X()) {
            ((C25581Ot) this.A0F.get()).A00(new C70603Bt(this, 29)).get();
        }
    }

    public AnonymousClass120(C19880zA r6, C19880zA r7, C19880zA r8, AnonymousClass1KB r9, AnonymousClass11S r10, C23651Hc r11, C31301fL r12, AnonymousClass11P r13, C19830z4 r14, AnonymousClass1P3 r15, C25571Os r16, AnonymousClass10I r17, AnonymousClass00H r18, AnonymousClass00H r19) {
        this.A0J = r13;
        this.A06 = r9;
        this.A07 = r10;
        this.A0D = r17;
        this.A0B = r16;
        this.A0E = r18;
        this.A0F = r19;
        this.A0I = r11;
        this.A0A = r15;
        this.A09 = r14;
        this.A0G = r6;
        this.A05 = r7;
        this.A08 = r12;
        this.A0H = r8;
    }

    public /* bridge */ /* synthetic */ void A08(B5B b5b) {
        super.registerObserver(b5b);
    }

    public /* bridge */ /* synthetic */ void A09(B5B b5b) {
        super.unregisterObserver(b5b);
    }
}
