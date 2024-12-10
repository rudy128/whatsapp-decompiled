package X;

import android.graphics.Bitmap;
import com.whatsapp.superpack.WhatsAppObiInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.2os  reason: invalid class name and case insensitive filesystem */
public abstract class C60952os {
    public static final C24511Kp A00 = new C24511Kp();

    public static Bitmap A00(C24511Kp r6, WhatsAppObiInputStream whatsAppObiInputStream) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        if (whatsAppObiInputStream.read(order.array()) == 8) {
            int i = order.getInt();
            int i2 = order.getInt();
            if (i <= 0 || i2 <= 0) {
                throw C17880vN.A0f("Metadata height/width is zero or less");
            } else if (i > 4096 || i2 > 4096) {
                throw C17880vN.A0f("Metadata height/width bigger than max value");
            } else {
                int i3 = i * i2 * 4;
                if (i3 <= 16777216) {
                    ByteBuffer A002 = r6.A00(i3);
                    try {
                        if (whatsAppObiInputStream.read(A002.array(), 0, i3) == i3) {
                            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            createBitmap.copyPixelsFromBuffer(A002);
                            return createBitmap;
                        }
                        throw C17880vN.A0f("Bytes read from stream not equal metadata size in bytes");
                    } finally {
                        r6.A01(A002);
                    }
                } else {
                    throw C17880vN.A0f("Metadata has more bytes than max allowed");
                }
            }
        } else {
            throw C17880vN.A0f("Dim bytes read not 8");
        }
    }
}
