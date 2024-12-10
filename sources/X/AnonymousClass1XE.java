package X;

import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.1XE  reason: invalid class name */
public class AnonymousClass1XE {
    public final int A00;
    public final SparseIntArray A01 = new SparseIntArray();
    public final SparseIntArray A02 = new SparseIntArray();
    public final MappedByteBuffer A03;
    public final Charset A04;

    public static int A00(AnonymousClass1XE r2, int i) {
        MappedByteBuffer mappedByteBuffer = r2.A03;
        return ((mappedByteBuffer.get(i + 1) & 255) << 8) | (mappedByteBuffer.get(i) & 255);
    }

    public static int A01(AnonymousClass1XE r2, int i) {
        MappedByteBuffer mappedByteBuffer = r2.A03;
        return ((mappedByteBuffer.get(i + 3) & 255) << 24) | (mappedByteBuffer.get(i) & 255) | ((mappedByteBuffer.get(i + 1) & 255) << 8) | ((mappedByteBuffer.get(i + 2) & 255) << 16);
    }

    public AnonymousClass1XE(MappedByteBuffer mappedByteBuffer, List list) {
        int i;
        int i2;
        this.A03 = mappedByteBuffer;
        int A002 = A00(this, 0);
        int A012 = A01(this, 2);
        byte b = mappedByteBuffer.get(6);
        Charset[] charsetArr = AnonymousClass1XF.A02;
        if (b >= 2 && AnonymousClass1DY.A00.get() != null) {
            Log.e("MMappedStringPack: unrecognized encoding");
        }
        this.A04 = charsetArr[b];
        this.A00 = A01(this, 7);
        if (!list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            int i3 = 11;
            int i4 = 0;
            for (int i5 = 0; i5 < A002; i5++) {
                MappedByteBuffer mappedByteBuffer2 = this.A03;
                mappedByteBuffer2.position(i3);
                int position = mappedByteBuffer2.position();
                if (mappedByteBuffer2.get(position + 2) == 0) {
                    i2 = 2;
                } else {
                    i2 = 7;
                    if (mappedByteBuffer2.get(position + 5) == 0) {
                        i2 = 5;
                    }
                }
                byte[] bArr = new byte[i2];
                mappedByteBuffer2.get(bArr, 0, i2);
                int indexOf = list.indexOf(new String(bArr, 0, i2, AnonymousClass1XF.A01));
                if (indexOf != -1) {
                    i4++;
                    iArr[indexOf] = i3;
                    if (i4 >= list.size()) {
                        break;
                    }
                }
                i3 += 11;
            }
            for (int i6 = 0; i6 < size; i6++) {
                int i7 = iArr[i6];
                if (i7 != 0) {
                    this.A03.position(i7 + 7);
                    int A013 = A01(this, this.A03.position()) + A012;
                    int A003 = A00(this, A013);
                    int i8 = A013 + 2;
                    int A004 = A00(this, i8);
                    int i9 = i8 + 2;
                    for (int i10 = 0; i10 < A003; i10++) {
                        int i11 = i + 2;
                        this.A02.append(A00(this, i), i11);
                        i9 = i11 + 6;
                    }
                    for (int i12 = 0; i12 < A004; i12++) {
                        int i13 = i + 2;
                        this.A01.append(A00(this, i), i13);
                        i = i13 + 1;
                        for (int i14 = 0; i14 < this.A03.get(i13); i14++) {
                            i += 7;
                        }
                    }
                }
            }
        } else if (AnonymousClass1DY.A00.get() != null) {
            Log.e("MMappedStringPack: parentLocales is empty");
        }
    }
}
