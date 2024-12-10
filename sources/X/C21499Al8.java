package X;

import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.CancellationSignal;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X.Al8  reason: case insensitive filesystem */
public class C21499Al8 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21499Al8(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public /* bridge */ /* synthetic */ Object call() {
        Cursor A002;
        String str;
        byte[] bArr;
        byte[] bArr2;
        switch (this.A00) {
            case 0:
                return BitmapFactory.decodeFile(((C185309cN) this.A02).A01);
            case 1:
                C20365AHv aHv = (C20365AHv) this.A01;
                C20076A6c a6c = aHv.A02;
                a6c.A07();
                try {
                    A002 = AnonymousClass9OB.A00(a6c, (AHX) this.A02, true);
                    HashMap A11 = C17880vN.A11();
                    HashMap A112 = C17880vN.A11();
                    while (A002.moveToNext()) {
                        AnonymousClass8BY.A0g(A002, A11);
                        AnonymousClass8BY.A0g(A002, A112);
                    }
                    A002.moveToPosition(-1);
                    C20365AHv.A01(aHv, A11);
                    C20365AHv.A00(aHv, A112);
                    ArrayList A0w = AnonymousClass8BV.A0w(A002);
                    while (A002.moveToNext()) {
                        if (A002.isNull(0)) {
                            str = null;
                        } else {
                            str = A002.getString(0);
                        }
                        Integer A07 = C20137A8y.A07(A002, 1);
                        if (A002.isNull(2)) {
                            bArr = null;
                        } else {
                            bArr = A002.getBlob(2);
                        }
                        A6Y A003 = A6Y.A00(bArr);
                        int i = A002.getInt(3);
                        int i2 = A002.getInt(4);
                        long j = A002.getLong(13);
                        long j2 = A002.getLong(14);
                        long j3 = A002.getLong(15);
                        Integer A08 = C20137A8y.A08(A002, 16);
                        long j4 = A002.getLong(17);
                        long j5 = A002.getLong(18);
                        int i3 = A002.getInt(19);
                        long j6 = A002.getLong(20);
                        int i4 = A002.getInt(21);
                        Integer A06 = C20137A8y.A06(A002, 5);
                        boolean A1O = AnonymousClass000.A1O(A002.getInt(6));
                        boolean A1O2 = AnonymousClass000.A1O(A002.getInt(7));
                        boolean A1O3 = AnonymousClass000.A1O(A002.getInt(8));
                        boolean A1O4 = AnonymousClass000.A1O(A002.getInt(9));
                        long j7 = A002.getLong(10);
                        long j8 = A002.getLong(11);
                        if (A002.isNull(12)) {
                            bArr2 = null;
                        } else {
                            bArr2 = A002.getBlob(12);
                        }
                        A0w.add(new C196099uS(new C20078A6e(A06, C20137A8y.A09(bArr2), j7, j8, A1O, A1O2, A1O3, A1O4), A003, A07, A08, str, AnonymousClass8BY.A0a(A002, A11), AnonymousClass8BY.A0a(A002, A112), i, i3, i2, i4, j, j2, j3, j4, j5, j6));
                    }
                    a6c.A08();
                    A002.close();
                    C20076A6c.A02(a6c);
                    return A0w;
                } catch (Throwable th) {
                    C20076A6c.A02(a6c);
                    throw th;
                }
            case 2:
                return SendFinalLiveLocationNotificationJob.A00((SendFinalLiveLocationNotificationJob) this.A01, (C166418cr) this.A02);
            case 3:
                SendFinalLiveLocationRetryJob sendFinalLiveLocationRetryJob = (SendFinalLiveLocationRetryJob) this.A01;
                C198079xk A0B = sendFinalLiveLocationRetryJob.A01.A0B(C63962tz.A02(DeviceJid.Companion.A06(sendFinalLiveLocationRetryJob.rawDeviceJid)), ((DNC) this.A02).A0M());
                return new C194059r6(A0B.A02, AnonymousClass9QD.A00(A0B.A00));
            case 4:
                return SendLiveLocationKeyJob.A00((Jid) this.A02, (SendLiveLocationKeyJob) this.A01);
            case 5:
                return C27131Uv.A01((C27131Uv) this.A01, (C166418cr) this.A02);
            case 6:
                AWI awi = (AWI) this.A01;
                byte[] bArr3 = (byte[]) this.A02;
                C198749yq r3 = awi.A0F;
                CancellationSignal cancellationSignal = awi.A08;
                C18070vi.A0h(bArr3, cancellationSignal);
                C190629lG r4 = r3.A08.A00(new ByteArrayInputStream(bArr3)).A00;
                C23651Hc r1 = r3.A04;
                if (!r1.A02()) {
                    C198749yq.A00(r3);
                    if (!r1.A02()) {
                        ((C175248yO) r3.A0C.get()).A00(606, (String) null);
                        C198749yq.A00(r3);
                    }
                }
                return r3.A07.A01(cancellationSignal, r4.A02, r4.A00, r4.A01);
            default:
                return null;
        }
    }

    public void finalize() {
        if (1 - this.A00 != 0) {
            super.finalize();
        } else {
            ((AHX) this.A02).A00();
        }
    }
}
