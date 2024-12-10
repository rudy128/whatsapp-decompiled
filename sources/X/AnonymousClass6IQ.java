package X;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6IQ  reason: invalid class name */
public class AnonymousClass6IQ extends AnonymousClass70M {
    public final List A00;

    public AnonymousClass6IQ(List list, int[] iArr, long j) {
        super(iArr, list.size(), j);
        this.A00 = list;
    }

    public static AnonymousClass6IQ A00(File file, int[] iArr) {
        DataInputStream dataInputStream;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(C108945cZ.A18(file)));
            long readLong = dataInputStream.readLong();
            ArrayList A002 = AnonymousClass6WD.A00(Long.valueOf(readLong), iArr);
            int size = A002.size();
            int[] iArr2 = new int[size];
            for (int i = 0; i < size; i++) {
                iArr2[i] = dataInputStream.readInt();
            }
            AnonymousClass6IQ r0 = new AnonymousClass6IQ(A002, iArr2, readLong);
            dataInputStream.close();
            return r0;
        } catch (IOException e) {
            C108995ce.A1J(file, "ChunkStore/chunk object not found: ", AnonymousClass000.A10(), e);
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }
}
