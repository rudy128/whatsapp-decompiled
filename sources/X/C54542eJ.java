package X;

import com.whatsapp.superpack.WhatsAppOpenboxArchive;

/* renamed from: X.2eJ  reason: invalid class name and case insensitive filesystem */
public class C54542eJ {
    public final long A00;
    public final long A01;
    public final /* synthetic */ WhatsAppOpenboxArchive A02;

    public C54542eJ(WhatsAppOpenboxArchive whatsAppOpenboxArchive, long j, long j2) {
        this.A02 = whatsAppOpenboxArchive;
        if (j <= 0 || j2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.A00 = j;
        this.A01 = j2;
    }
}
