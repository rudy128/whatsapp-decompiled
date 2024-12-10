package X;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

public class DYO implements E6y {
    public final int A00;
    public final Object A01;

    public DYO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public FileChannel BOT() {
        switch (this.A00) {
            case 0:
                return new FileInputStream((File) this.A01).getChannel();
            case 1:
                if (((ParcelFileDescriptor) this.A01).getStatSize() != -1) {
                    return new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) this.A01).getChannel();
                }
                ((ParcelFileDescriptor) this.A01).close();
                StringBuilder sb = new StringBuilder();
                sb.append("Not a file: ");
                sb.append((ParcelFileDescriptor) this.A01);
                throw new IllegalArgumentException(sb.toString());
            default:
                return null;
        }
    }
}
