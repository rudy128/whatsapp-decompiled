package X;

import com.whatsapp.util.Log;
import java.io.RandomAccessFile;

/* renamed from: X.7SP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7SP implements C22821Di {
    public final /* synthetic */ C190549l8 A00;
    public final /* synthetic */ AnonymousClass744 A01;
    public final /* synthetic */ AnonymousClass70M A02;
    public final /* synthetic */ RandomAccessFile A03;
    public final /* synthetic */ RandomAccessFile A04;

    public final Object invoke(Object obj) {
        AnonymousClass744 r3 = this.A01;
        C190549l8 r2 = this.A00;
        AnonymousClass70M r4 = this.A02;
        Number number = (Number) obj;
        try {
            AnonymousClass744.A01(r2, r3, r4, this.A03, this.A04, number.intValue());
            return new C134726r3((Exception) null, C27621Wu.A00);
        } catch (Exception e) {
            r3.A02 = e;
            if (e instanceof C26531Sm) {
                r3.A0B.A02(C17890vO.A0N(number), r3.A0P, r3.A0G.A05, r4.A01, true);
            } else if (e instanceof AnonymousClass6S8) {
                Log.w("StreamMediaDownloadHandler/stream check failed");
                r3.A0F.A09(1);
            }
            return new C134726r3(e, (Object) null);
        }
    }

    public /* synthetic */ AnonymousClass7SP(C190549l8 r1, AnonymousClass744 r2, AnonymousClass70M r3, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = randomAccessFile;
        this.A04 = randomAccessFile2;
    }
}
