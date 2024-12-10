package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.D9s  reason: case insensitive filesystem */
public final class C26694D9s implements E7O {
    public int A00;
    public byte[] A01;
    public final C26115Csd A02;
    public final E9Q A03;

    public void BET() {
    }

    /* JADX INFO: finally extract failed */
    public void Bhb() {
        int i = 0;
        this.A00 = 0;
        try {
            E9Q e9q = this.A03;
            e9q.CAj(this.A02);
            do {
                int i2 = this.A00 + i;
                this.A00 = i2;
                byte[] bArr = this.A01;
                if (bArr == null) {
                    bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                } else {
                    int length = bArr.length;
                    if (i2 == length) {
                        bArr = Arrays.copyOf(bArr, length * 2);
                    }
                    int i3 = this.A00;
                    i = e9q.read(bArr, i3, bArr.length - i3);
                }
                this.A01 = bArr;
                int i32 = this.A00;
                i = e9q.read(bArr, i32, bArr.length - i32);
            } while (i != -1);
            try {
                e9q.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            E9Q e9q2 = this.A03;
            if (e9q2 != null) {
                try {
                    e9q2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public C26694D9s(E9Q e9q, C26115Csd csd) {
        this.A02 = csd;
        this.A03 = e9q;
    }
}
