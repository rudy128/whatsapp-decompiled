package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

/* renamed from: X.Cq4  reason: case insensitive filesystem */
public class C25989Cq4 {
    public static final byte[] A08 = {87, 65, 77, 80, 83, 73, 68, 1};
    public int A00;
    public int A01;
    public C25677Ck8 A02;
    public String A03 = "00000000-0000-0000-0000-000000000000";
    public final int A04;
    public final AnonymousClass185 A05;
    public final RandomAccessFile A06;
    public final List A07 = AnonymousClass000.A13();

    public boolean A01(byte[] bArr, int i) {
        int i2;
        List list = this.A07;
        if (BE8.A0S(this, list).A01 <= 8 && BE8.A0S(this, list).A02) {
            Log.e("queuefile/writeBytes in privatestats see locked empty mini event buffer");
            BE8.A0S(this, list).A02 = false;
        }
        if (!BE8.A0S(this, list).A02) {
            int length = bArr.length;
            if (length < i) {
                i = length;
            }
            C25677Ck8 ck8 = this.A02;
            if (i <= ck8.A00 - ck8.A02) {
                BE8.A0S(this, list).A01 += ck8.A00(bArr, i);
                A00(this);
                return true;
            } else if (BE8.A0S(this, list).A00 < 65536) {
                try {
                    this.A06.setLength(65792);
                    BE8.A0S(this, list).A00 = 65536;
                    C25677Ck8 ck82 = this.A02;
                    ck82.A00 = 65536;
                    if (i <= 65536 - ck82.A02) {
                        i2 = ck82.A00(bArr, i);
                        BE8.A0S(this, list).A01 += i2;
                    } else {
                        i2 = 0;
                    }
                    A00(this);
                    if (i2 > 0) {
                        return true;
                    }
                } catch (IOException e) {
                    C108995ce.A1M("queuefile/writeBytes failed to write ", AnonymousClass000.A10(), e);
                }
            }
        }
        return false;
    }

    public static void A00(C25989Cq4 cq4) {
        try {
            RandomAccessFile randomAccessFile = cq4.A06;
            randomAccessFile.seek(54);
            randomAccessFile.writeByte(cq4.A01);
            randomAccessFile.writeByte(cq4.A00);
            for (int i = 0; i < cq4.A01; i++) {
                List list = cq4.A07;
                randomAccessFile.writeInt(((C5T) list.get(i)).A01);
                randomAccessFile.writeInt(((C5T) list.get(i)).A00);
                randomAccessFile.writeBoolean(((C5T) list.get(i)).A02);
            }
        } catch (IOException e) {
            C108995ce.A1M("queuefile/flushMetaToFile failed to write ", AnonymousClass000.A10(), e);
        }
    }

    public C25989Cq4(AnonymousClass185 r2, RandomAccessFile randomAccessFile, int i) {
        this.A04 = i;
        this.A06 = randomAccessFile;
        this.A05 = r2;
    }
}
