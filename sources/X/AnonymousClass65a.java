package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Size;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.65a  reason: invalid class name */
public final class AnonymousClass65a extends AnonymousClass7H1 {
    public long A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass65a(Uri uri, AnonymousClass11B r3, String str, String str2, long j, long j2, long j3, boolean z) {
        super(uri, r3, str, str2, j, j2, j3);
        C18070vi.A0d(uri, 3);
        this.A01 = z;
    }

    private final Bitmap A00(int i) {
        Object obj;
        Object obj2 = null;
        try {
            obj = this.A02.A04(this.A01, new Size(i, i));
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            obj2 = obj;
        }
        return (Bitmap) obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass65a) || !C18070vi.A18(this.A01, ((AnonymousClass7H1) obj).A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A01.toString().hashCode();
    }

    public Bitmap CP6(int i) {
        Bitmap bitmap;
        boolean z;
        String str;
        if (!AnonymousClass112.A06() || !this.A01 || (bitmap = A00(i)) == null) {
            if (i < 144) {
                File BQC = BQC();
                bitmap = null;
                if (BQC == null) {
                    Log.e("mediafileutils/createVideoThumbnail/file=null");
                } else {
                    try {
                        DRK.A04(BQC);
                        z = true;
                    } catch (IOException unused) {
                        z = false;
                    }
                    if (!z) {
                        return C1408873l.A00((RectF) null, new C125996c1(BQC), 0, 0, 96, 0, 0, false);
                    }
                    try {
                        return DRK.A00(BQC);
                    } catch (IOException | IllegalArgumentException e) {
                        e = e;
                        str = "mediafileutils/createGifThumbnail/gif file not read ";
                        Log.e(str, e);
                        return null;
                    } catch (Exception e2) {
                        e = e2;
                        str = "mediafileutils/createGifThumbnail/unexpected gif exception ";
                        Log.e(str, e);
                        return null;
                    }
                }
            } else {
                long j = (long) i;
                return A01(j * 2 * j, i);
            }
        }
        return bitmap;
    }

    public int getType() {
        return 1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoObject");
        return C17880vN.A0u(A10, this.A00);
    }
}
