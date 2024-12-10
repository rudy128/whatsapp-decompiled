package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.70j  reason: invalid class name */
public abstract class AnonymousClass70j {
    public static byte A00(FileInputStream fileInputStream, long j, long j2) {
        fileInputStream.skip(j - j2);
        int read = fileInputStream.read();
        if (read == -1) {
            return 0;
        }
        byte b = (byte) read;
        if (read >= 100) {
            return 99;
        }
        return b;
    }

    public static ArrayList A01(File file) {
        FileInputStream A18;
        float f;
        ArrayList A13 = AnonymousClass000.A13();
        if (file.length() != 0) {
            long length = file.length();
            try {
                A18 = C108945cZ.A18(file);
                for (int i = 0; ((long) i) < length; i++) {
                    byte read = (byte) A18.read();
                    if (read == -1) {
                        break;
                    }
                    if (read >= 100) {
                        f = 0.99f;
                    } else {
                        f = ((float) read) / 100.0f;
                    }
                    A13.add(Float.valueOf(f));
                }
                A18.close();
                return A13;
            } catch (IOException e) {
                Log.e("WaveformUtil/getWaveformFromFile ", e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return A13;
        throw th;
    }

    public static ArrayList A02(File file, int i) {
        FileInputStream A18;
        long j;
        byte b;
        ArrayList A13 = AnonymousClass000.A13();
        if (!(file == null || file.length() == 0)) {
            long length = file.length();
            int i2 = i;
            float f = ((float) length) / ((float) i2);
            try {
                A18 = C108945cZ.A18(file);
                A13.add(Byte.valueOf(A00(A18, 0, 0)));
                long j2 = 1;
                int i3 = 1;
                while (i3 < i2 - 1) {
                    float f2 = ((float) i3) * f;
                    long floor = (long) Math.floor((double) f2);
                    long ceil = (long) Math.ceil((double) f2);
                    float f3 = f2 - ((float) floor);
                    byte A00 = A00(A18, floor, j2);
                    long j3 = floor + 1;
                    if (ceil != floor) {
                        b = A00(A18, ceil, j3);
                        j = ceil + 1;
                    } else {
                        j = j3;
                        b = A00;
                    }
                    A13.add(Byte.valueOf((byte) ((int) (((float) A00) + (((float) (b - A00)) * f3)))));
                    i3++;
                    j2 = j;
                }
                A13.add(Byte.valueOf(A00(A18, length - 1, j2)));
                A18.close();
                return A13;
            } catch (IOException e) {
                Log.e("waveformutil/generateDisplayDataPoints/ error reading visualization file data ", e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return A13;
        throw th;
    }
}
